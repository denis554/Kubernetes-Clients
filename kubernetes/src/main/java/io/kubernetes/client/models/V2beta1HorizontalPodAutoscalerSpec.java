/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V2beta1CrossVersionObjectReference;
import io.kubernetes.client.models.V2beta1MetricSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 */
@ApiModel(description = "HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.")

public class V2beta1HorizontalPodAutoscalerSpec {
  @SerializedName("maxReplicas")
  private Integer maxReplicas = null;

  @SerializedName("metrics")
  private List<V2beta1MetricSpec> metrics = null;

  @SerializedName("minReplicas")
  private Integer minReplicas = null;

  @SerializedName("scaleTargetRef")
  private V2beta1CrossVersionObjectReference scaleTargetRef = null;

  public V2beta1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
   * @return maxReplicas
  **/
  @ApiModelProperty(required = true, value = "maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public V2beta1HorizontalPodAutoscalerSpec metrics(List<V2beta1MetricSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  public V2beta1HorizontalPodAutoscalerSpec addMetricsItem(V2beta1MetricSpec metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<V2beta1MetricSpec>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
   * @return metrics
  **/
  @ApiModelProperty(value = "metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.")
  public List<V2beta1MetricSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<V2beta1MetricSpec> metrics) {
    this.metrics = metrics;
  }

  public V2beta1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.
   * @return minReplicas
  **/
  @ApiModelProperty(value = "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down. It defaults to 1 pod.")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public V2beta1HorizontalPodAutoscalerSpec scaleTargetRef(V2beta1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

   /**
   * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
   * @return scaleTargetRef
  **/
  @ApiModelProperty(required = true, value = "scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.")
  public V2beta1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(V2beta1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1HorizontalPodAutoscalerSpec v2beta1HorizontalPodAutoscalerSpec = (V2beta1HorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, v2beta1HorizontalPodAutoscalerSpec.maxReplicas) &&
        Objects.equals(this.metrics, v2beta1HorizontalPodAutoscalerSpec.metrics) &&
        Objects.equals(this.minReplicas, v2beta1HorizontalPodAutoscalerSpec.minReplicas) &&
        Objects.equals(this.scaleTargetRef, v2beta1HorizontalPodAutoscalerSpec.scaleTargetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, metrics, minReplicas, scaleTargetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1HorizontalPodAutoscalerSpec {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
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

