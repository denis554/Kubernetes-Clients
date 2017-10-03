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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
 */
@ApiModel(description = "HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.")

public class V2beta1HorizontalPodAutoscalerCondition {
  @SerializedName("lastTransitionTime")
  private DateTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public V2beta1HorizontalPodAutoscalerCondition lastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * lastTransitionTime is the last time the condition transitioned from one status to another
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "lastTransitionTime is the last time the condition transitioned from one status to another")
  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V2beta1HorizontalPodAutoscalerCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message is a human-readable explanation containing details about the transition
   * @return message
  **/
  @ApiModelProperty(value = "message is a human-readable explanation containing details about the transition")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V2beta1HorizontalPodAutoscalerCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * reason is the reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "reason is the reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V2beta1HorizontalPodAutoscalerCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status is the status of the condition (True, False, Unknown)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "status is the status of the condition (True, False, Unknown)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V2beta1HorizontalPodAutoscalerCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type describes the current condition
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type describes the current condition")
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
    V2beta1HorizontalPodAutoscalerCondition v2beta1HorizontalPodAutoscalerCondition = (V2beta1HorizontalPodAutoscalerCondition) o;
    return Objects.equals(this.lastTransitionTime, v2beta1HorizontalPodAutoscalerCondition.lastTransitionTime) &&
        Objects.equals(this.message, v2beta1HorizontalPodAutoscalerCondition.message) &&
        Objects.equals(this.reason, v2beta1HorizontalPodAutoscalerCondition.reason) &&
        Objects.equals(this.status, v2beta1HorizontalPodAutoscalerCondition.status) &&
        Objects.equals(this.type, v2beta1HorizontalPodAutoscalerCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1HorizontalPodAutoscalerCondition {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

