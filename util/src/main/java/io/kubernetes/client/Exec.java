/*
Copyright 2017, 2018 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client;

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1StatusCause;
import io.kubernetes.client.models.V1StatusDetails;
import io.kubernetes.client.util.WebSocketStreamHandler;
import io.kubernetes.client.util.WebSockets;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exec {
  private static final Logger log = LoggerFactory.getLogger(Exec.class);

  private ApiClient apiClient;

  /** Simple Exec API constructor, uses default configuration */
  public Exec() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * Exec API Constructor
   *
   * @param apiClient The api client to use.
   */
  public Exec(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client for these exec operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client for subsequent exec operations.
   *
   * @param apiClient The new API client to use.
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  private String makePath(
      String namespace,
      String name,
      String[] command,
      String container,
      boolean stdin,
      boolean tty) {
    String path =
        "/api/v1/namespaces/"
            + namespace
            + "/pods/"
            + name
            + "/exec?"
            + "stdin="
            + stdin
            + "&tty="
            + tty
            + (container != null ? "&container=" + container : "")
            + "&command="
            + StringUtils.join(command, "&command=");
    return path;
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   */
  public Process exec(String namespace, String name, String[] command, boolean stdin)
      throws ApiException, IOException {
    return exec(namespace, name, command, null, stdin, false);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   */
  public Process exec(V1Pod pod, String[] command, boolean stdin) throws ApiException, IOException {
    return exec(pod, command, null, stdin, false);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   * @param tty If true, stdin is a tty.
   */
  public Process exec(String namespace, String name, String[] command, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(namespace, name, command, null, stdin, tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   * @param tty If true, stdin is a tty.
   */
  public Process exec(V1Pod pod, String[] command, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(pod, command, null, stdin, tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param container The container in the Pod where the command is run.
   * @param stdin If true, pass a stdin stream into the container.
   * @param tty If true, stdin is a TTY (only applies if stdin is true)
   */
  public Process exec(V1Pod pod, String[] command, String container, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(
        pod.getMetadata().getNamespace(),
        pod.getMetadata().getName(),
        command,
        container,
        stdin,
        tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param container The container in the Pod where the command is run.
   * @param stdin If true, pass a stdin stream into the container.
   * @param tty If true, stdin is a TTY (only applies if stdin is true)
   */
  public Process exec(
      String namespace, String name, String[] command, String container, boolean stdin, boolean tty)
      throws ApiException, IOException {
    String path = makePath(namespace, name, command, container, stdin, tty);

    ExecProcess exec = new ExecProcess();
    WebSocketStreamHandler handler = exec.getHandler();
    WebSockets.stream(path, "GET", apiClient, handler);

    return exec;
  }

  static int parseExitCode(ApiClient client, InputStream inputStream) {
    try {
      int available = inputStream.available();

      // Kubernetes returns no content when the exit code is 0
      if (available == 0) return 0;

      byte[] b = new byte[available];
      inputStream.read(b);
      String body = new String(b, "UTF-8");

      Type returnType = new TypeToken<V1Status>() {}.getType();
      V1Status status = client.getJSON().deserialize(body, returnType);
      if ("Success".equals(status.getStatus())) return 0;

      if ("NonZeroExitCode".equals(status.getReason())) {
        V1StatusDetails details = status.getDetails();
        if (details != null) {
          List<V1StatusCause> causes = details.getCauses();
          if (causes != null) {
            for (V1StatusCause cause : causes) {
              if ("ExitCode".equals(cause.getReason())) {
                try {
                  return Integer.parseInt(cause.getMessage());
                } catch (NumberFormatException nfe) {
                  log.error("Error parsing exit code from status channel response", nfe);
                }
              }
            }
          }
        }
      }
    } catch (Throwable t) {
      log.error("Error parsing exit code from status channel response", t);
    }

    // Unable to parse the exit code from the content
    return -1;
  }

  private class ExecProcess extends Process {
    private final WebSocketStreamHandler streamHandler;
    private volatile int statusCode;
    private final Map<Integer, InputStream> input = new HashMap<>();

    public ExecProcess() throws IOException {
      this.statusCode = -1;
      this.streamHandler =
          new WebSocketStreamHandler() {
            @Override
            public void close() {
              if (statusCode == -1) {
                int exitCode = parseExitCode(apiClient, ExecProcess.this.getInputStream(3));

                // notify of process completion
                synchronized (ExecProcess.this) {
                  statusCode = exitCode;
                  ExecProcess.this.notifyAll();
                }
              }

              super.close();
            }
          };
    }

    private WebSocketStreamHandler getHandler() {
      return streamHandler;
    }

    @Override
    public OutputStream getOutputStream() {
      return streamHandler.getOutputStream(0);
    }

    @Override
    public InputStream getInputStream() {
      return getInputStream(1);
    }

    @Override
    public InputStream getErrorStream() {
      return getInputStream(2);
    }

    private synchronized InputStream getInputStream(int stream) {
      if (!input.containsKey(stream)) {
        input.put(stream, streamHandler.getInputStream(stream));
      }
      return input.get(stream);
    }

    @Override
    public int waitFor() throws InterruptedException {
      synchronized (this) {
        this.wait();
      }
      return statusCode;
    }

    @Override
    public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException {
      synchronized (this) {
        this.wait(TimeUnit.MILLISECONDS.convert(timeout, unit));
      }
      return !isAlive();
    }

    @Override
    public int exitValue() {
      if (statusCode == -1) throw new IllegalThreadStateException();
      return statusCode;
    }

    @Override
    public void destroy() {
      streamHandler.close();
      for (InputStream in : input.values()) {
        try {
          in.close();
        } catch (IOException ex) {
          log.error("Error on close", ex);
        }
      }
    }
  }
}
