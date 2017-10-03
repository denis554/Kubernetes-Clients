/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ContainerStatus;
import io.kubernetes.client.models.V1PodCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system.
 */
@ApiModel(description = "PodStatus represents information about the status of a pod. Status may trail the actual state of a system.")

public class V1PodStatus {
  @SerializedName("conditions")
  private List<V1PodCondition> conditions = null;

  @SerializedName("containerStatuses")
  private List<V1ContainerStatus> containerStatuses = null;

  @SerializedName("hostIP")
  private String hostIP = null;

  @SerializedName("initContainerStatuses")
  private List<V1ContainerStatus> initContainerStatuses = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("podIP")
  private String podIP = null;

  @SerializedName("qosClass")
  private String qosClass = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  public V1PodStatus conditions(List<V1PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1PodStatus addConditionsItem(V1PodCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1PodCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  public List<V1PodCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1PodCondition> conditions) {
    this.conditions = conditions;
  }

  public V1PodStatus containerStatuses(List<V1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  public V1PodStatus addContainerStatusesItem(V1ContainerStatus containerStatusesItem) {
    if (this.containerStatuses == null) {
      this.containerStatuses = new ArrayList<V1ContainerStatus>();
    }
    this.containerStatuses.add(containerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return containerStatuses
  **/
  @ApiModelProperty(value = "The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<V1ContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }

  public void setContainerStatuses(List<V1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }

  public V1PodStatus hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

   /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   * @return hostIP
  **/
  @ApiModelProperty(value = "IP address of the host to which the pod is assigned. Empty if not yet scheduled.")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public V1PodStatus initContainerStatuses(List<V1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  public V1PodStatus addInitContainerStatusesItem(V1ContainerStatus initContainerStatusesItem) {
    if (this.initContainerStatuses == null) {
      this.initContainerStatuses = new ArrayList<V1ContainerStatus>();
    }
    this.initContainerStatuses.add(initContainerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return initContainerStatuses
  **/
  @ApiModelProperty(value = "The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  public List<V1ContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }

  public void setInitContainerStatuses(List<V1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }

  public V1PodStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the pod is in this condition.
   * @return message
  **/
  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1PodStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   * @return phase
  **/
  @ApiModelProperty(value = "Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1PodStatus podIP(String podIP) {
    this.podIP = podIP;
    return this;
  }

   /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   * @return podIP
  **/
  @ApiModelProperty(value = "IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
  public String getPodIP() {
    return podIP;
  }

  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }

  public V1PodStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

   /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md
   * @return qosClass
  **/
  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md")
  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  public V1PodStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   * @return reason
  **/
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1PodStatus startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   * @return startTime
  **/
  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodStatus v1PodStatus = (V1PodStatus) o;
    return Objects.equals(this.conditions, v1PodStatus.conditions) &&
        Objects.equals(this.containerStatuses, v1PodStatus.containerStatuses) &&
        Objects.equals(this.hostIP, v1PodStatus.hostIP) &&
        Objects.equals(this.initContainerStatuses, v1PodStatus.initContainerStatuses) &&
        Objects.equals(this.message, v1PodStatus.message) &&
        Objects.equals(this.phase, v1PodStatus.phase) &&
        Objects.equals(this.podIP, v1PodStatus.podIP) &&
        Objects.equals(this.qosClass, v1PodStatus.qosClass) &&
        Objects.equals(this.reason, v1PodStatus.reason) &&
        Objects.equals(this.startTime, v1PodStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, containerStatuses, hostIP, initContainerStatuses, message, phase, podIP, qosClass, reason, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

