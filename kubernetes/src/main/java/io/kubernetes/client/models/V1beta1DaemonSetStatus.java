/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
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
import io.kubernetes.client.models.V1beta1DaemonSetCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DaemonSetStatus represents the current status of a daemon set.
 */
@ApiModel(description = "DaemonSetStatus represents the current status of a daemon set.")

public class V1beta1DaemonSetStatus {
  @SerializedName("collisionCount")
  private Integer collisionCount = null;

  @SerializedName("conditions")
  private List<V1beta1DaemonSetCondition> conditions = null;

  @SerializedName("currentNumberScheduled")
  private Integer currentNumberScheduled = null;

  @SerializedName("desiredNumberScheduled")
  private Integer desiredNumberScheduled = null;

  @SerializedName("numberAvailable")
  private Integer numberAvailable = null;

  @SerializedName("numberMisscheduled")
  private Integer numberMisscheduled = null;

  @SerializedName("numberReady")
  private Integer numberReady = null;

  @SerializedName("numberUnavailable")
  private Integer numberUnavailable = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("updatedNumberScheduled")
  private Integer updatedNumberScheduled = null;

  public V1beta1DaemonSetStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

   /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @ApiModelProperty(value = "Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public V1beta1DaemonSetStatus conditions(List<V1beta1DaemonSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1beta1DaemonSetStatus addConditionsItem(V1beta1DaemonSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1beta1DaemonSetCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a DaemonSet&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Represents the latest available observations of a DaemonSet's current state.")
  public List<V1beta1DaemonSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1beta1DaemonSetCondition> conditions) {
    this.conditions = conditions;
  }

  public V1beta1DaemonSetStatus currentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

   /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return currentNumberScheduled
  **/
  @ApiModelProperty(required = true, value = "The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getCurrentNumberScheduled() {
    return currentNumberScheduled;
  }

  public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
  }

  public V1beta1DaemonSetStatus desiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

   /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return desiredNumberScheduled
  **/
  @ApiModelProperty(required = true, value = "The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getDesiredNumberScheduled() {
    return desiredNumberScheduled;
  }

  public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
  }

  public V1beta1DaemonSetStatus numberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return this;
  }

   /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberAvailable
  **/
  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberAvailable() {
    return numberAvailable;
  }

  public void setNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
  }

  public V1beta1DaemonSetStatus numberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

   /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return numberMisscheduled
  **/
  @ApiModelProperty(required = true, value = "The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
  public Integer getNumberMisscheduled() {
    return numberMisscheduled;
  }

  public void setNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
  }

  public V1beta1DaemonSetStatus numberReady(Integer numberReady) {
    this.numberReady = numberReady;
    return this;
  }

   /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
   * @return numberReady
  **/
  @ApiModelProperty(required = true, value = "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.")
  public Integer getNumberReady() {
    return numberReady;
  }

  public void setNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
  }

  public V1beta1DaemonSetStatus numberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return this;
  }

   /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberUnavailable
  **/
  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)")
  public Integer getNumberUnavailable() {
    return numberUnavailable;
  }

  public void setNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
  }

  public V1beta1DaemonSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * The most recent generation observed by the daemon set controller.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "The most recent generation observed by the daemon set controller.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1beta1DaemonSetStatus updatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }

   /**
   * The total number of nodes that are running updated daemon pod
   * @return updatedNumberScheduled
  **/
  @ApiModelProperty(value = "The total number of nodes that are running updated daemon pod")
  public Integer getUpdatedNumberScheduled() {
    return updatedNumberScheduled;
  }

  public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1DaemonSetStatus v1beta1DaemonSetStatus = (V1beta1DaemonSetStatus) o;
    return Objects.equals(this.collisionCount, v1beta1DaemonSetStatus.collisionCount) &&
        Objects.equals(this.conditions, v1beta1DaemonSetStatus.conditions) &&
        Objects.equals(this.currentNumberScheduled, v1beta1DaemonSetStatus.currentNumberScheduled) &&
        Objects.equals(this.desiredNumberScheduled, v1beta1DaemonSetStatus.desiredNumberScheduled) &&
        Objects.equals(this.numberAvailable, v1beta1DaemonSetStatus.numberAvailable) &&
        Objects.equals(this.numberMisscheduled, v1beta1DaemonSetStatus.numberMisscheduled) &&
        Objects.equals(this.numberReady, v1beta1DaemonSetStatus.numberReady) &&
        Objects.equals(this.numberUnavailable, v1beta1DaemonSetStatus.numberUnavailable) &&
        Objects.equals(this.observedGeneration, v1beta1DaemonSetStatus.observedGeneration) &&
        Objects.equals(this.updatedNumberScheduled, v1beta1DaemonSetStatus.updatedNumberScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collisionCount, conditions, currentNumberScheduled, desiredNumberScheduled, numberAvailable, numberMisscheduled, numberReady, numberUnavailable, observedGeneration, updatedNumberScheduled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DaemonSetStatus {\n");
    
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentNumberScheduled: ").append(toIndentedString(currentNumberScheduled)).append("\n");
    sb.append("    desiredNumberScheduled: ").append(toIndentedString(desiredNumberScheduled)).append("\n");
    sb.append("    numberAvailable: ").append(toIndentedString(numberAvailable)).append("\n");
    sb.append("    numberMisscheduled: ").append(toIndentedString(numberMisscheduled)).append("\n");
    sb.append("    numberReady: ").append(toIndentedString(numberReady)).append("\n");
    sb.append("    numberUnavailable: ").append(toIndentedString(numberUnavailable)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    updatedNumberScheduled: ").append(toIndentedString(updatedNumberScheduled)).append("\n");
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

