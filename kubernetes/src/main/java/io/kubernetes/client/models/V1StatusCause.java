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

/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 */
@ApiModel(description = "StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.")

public class V1StatusCause {
  @SerializedName("field")
  private String field = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  public V1StatusCause field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \&quot;name\&quot; - the field \&quot;name\&quot; on the current resource   \&quot;items[0].name\&quot; - the field \&quot;name\&quot; on the first array entry in \&quot;items\&quot;
   * @return field
  **/
  @ApiModelProperty(value = "The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public V1StatusCause message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
   * @return message
  **/
  @ApiModelProperty(value = "A human-readable description of the cause of the error.  This field may be presented as-is to a reader.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1StatusCause reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
   * @return reason
  **/
  @ApiModelProperty(value = "A machine-readable description of the cause of the error. If this value is empty there is no information available.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatusCause v1StatusCause = (V1StatusCause) o;
    return Objects.equals(this.field, v1StatusCause.field) &&
        Objects.equals(this.message, v1StatusCause.message) &&
        Objects.equals(this.reason, v1StatusCause.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatusCause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

