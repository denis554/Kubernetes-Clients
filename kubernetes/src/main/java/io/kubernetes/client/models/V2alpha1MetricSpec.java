/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V2alpha1ObjectMetricSource;
import io.kubernetes.client.models.V2alpha1PodsMetricSource;
import io.kubernetes.client.models.V2alpha1ResourceMetricSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MetricSpec specifies how to scale based on a single metric (only &#x60;type&#x60; and one other matching field should be set at once).
 */
@ApiModel(description = "MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).")

public class V2alpha1MetricSpec {
  @SerializedName("object")
  private V2alpha1ObjectMetricSource object = null;

  @SerializedName("pods")
  private V2alpha1PodsMetricSource pods = null;

  @SerializedName("resource")
  private V2alpha1ResourceMetricSource resource = null;

  @SerializedName("type")
  private String type = null;

  public V2alpha1MetricSpec object(V2alpha1ObjectMetricSource object) {
    this.object = object;
    return this;
  }

   /**
   * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).")
  public V2alpha1ObjectMetricSource getObject() {
    return object;
  }

  public void setObject(V2alpha1ObjectMetricSource object) {
    this.object = object;
  }

  public V2alpha1MetricSpec pods(V2alpha1PodsMetricSource pods) {
    this.pods = pods;
    return this;
  }

   /**
   * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
   * @return pods
  **/
  @ApiModelProperty(example = "null", value = "pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.")
  public V2alpha1PodsMetricSource getPods() {
    return pods;
  }

  public void setPods(V2alpha1PodsMetricSource pods) {
    this.pods = pods;
  }

  public V2alpha1MetricSpec resource(V2alpha1ResourceMetricSource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.
   * @return resource
  **/
  @ApiModelProperty(example = "null", value = "resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
  public V2alpha1ResourceMetricSource getResource() {
    return resource;
  }

  public void setResource(V2alpha1ResourceMetricSource resource) {
    this.resource = resource;
  }

  public V2alpha1MetricSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It should match one of the fields below.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "type is the type of metric source.  It should match one of the fields below.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1MetricSpec v2alpha1MetricSpec = (V2alpha1MetricSpec) o;
    return Objects.equals(this.object, v2alpha1MetricSpec.object) &&
        Objects.equals(this.pods, v2alpha1MetricSpec.pods) &&
        Objects.equals(this.resource, v2alpha1MetricSpec.resource) &&
        Objects.equals(this.type, v2alpha1MetricSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, pods, resource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1MetricSpec {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

