/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
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
import io.kubernetes.client.models.V1DaemonSetUpdateStrategy;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DaemonSetSpec is the specification of a daemon set.
 */
@ApiModel(description = "DaemonSetSpec is the specification of a daemon set.")

public class V1DaemonSetSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  @SerializedName("updateStrategy")
  private V1DaemonSetUpdateStrategy updateStrategy = null;

  public V1DaemonSetSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public V1DaemonSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1DaemonSetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1DaemonSetSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1DaemonSetSpec updateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * An update strategy to replace existing DaemonSet pods with new pods.
   * @return updateStrategy
  **/
  @ApiModelProperty(value = "An update strategy to replace existing DaemonSet pods with new pods.")
  public V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(V1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DaemonSetSpec v1DaemonSetSpec = (V1DaemonSetSpec) o;
    return Objects.equals(this.minReadySeconds, v1DaemonSetSpec.minReadySeconds) &&
        Objects.equals(this.revisionHistoryLimit, v1DaemonSetSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, v1DaemonSetSpec.selector) &&
        Objects.equals(this.template, v1DaemonSetSpec.template) &&
        Objects.equals(this.updateStrategy, v1DaemonSetSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DaemonSetSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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

