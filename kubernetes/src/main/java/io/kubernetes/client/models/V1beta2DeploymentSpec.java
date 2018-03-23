/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
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
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.kubernetes.client.models.V1beta2DeploymentStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@ApiModel(description = "DeploymentSpec is the specification of the desired behavior of the Deployment.")

public class V1beta2DeploymentSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("progressDeadlineSeconds")
  private Integer progressDeadlineSeconds = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("strategy")
  private V1beta2DeploymentStrategy strategy = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  public V1beta2DeploymentSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public V1beta2DeploymentSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that the deployment is paused.
   * @return paused
  **/
  @ApiModelProperty(value = "Indicates that the deployment is paused.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1beta2DeploymentSpec progressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

   /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   * @return progressDeadlineSeconds
  **/
  @ApiModelProperty(value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.")
  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }

  public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }

  public V1beta2DeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1beta2DeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public V1beta2DeploymentSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1beta2DeploymentSpec strategy(V1beta2DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * The deployment strategy to use to replace existing pods with new ones.
   * @return strategy
  **/
  @ApiModelProperty(value = "The deployment strategy to use to replace existing pods with new ones.")
  public V1beta2DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(V1beta2DeploymentStrategy strategy) {
    this.strategy = strategy;
  }

  public V1beta2DeploymentSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the pods that will be created.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template describes the pods that will be created.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2DeploymentSpec v1beta2DeploymentSpec = (V1beta2DeploymentSpec) o;
    return Objects.equals(this.minReadySeconds, v1beta2DeploymentSpec.minReadySeconds) &&
        Objects.equals(this.paused, v1beta2DeploymentSpec.paused) &&
        Objects.equals(this.progressDeadlineSeconds, v1beta2DeploymentSpec.progressDeadlineSeconds) &&
        Objects.equals(this.replicas, v1beta2DeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, v1beta2DeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, v1beta2DeploymentSpec.selector) &&
        Objects.equals(this.strategy, v1beta2DeploymentSpec.strategy) &&
        Objects.equals(this.template, v1beta2DeploymentSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2DeploymentSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

