/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
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
import io.kubernetes.client.models.V1Initializer;
import io.kubernetes.client.models.V1Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Initializers tracks the progress of initialization.
 */
@ApiModel(description = "Initializers tracks the progress of initialization.")

public class V1Initializers {
  @SerializedName("pending")
  private List<V1Initializer> pending = new ArrayList<V1Initializer>();

  @SerializedName("result")
  private V1Status result = null;

  public V1Initializers pending(List<V1Initializer> pending) {
    this.pending = pending;
    return this;
  }

  public V1Initializers addPendingItem(V1Initializer pendingItem) {
    this.pending.add(pendingItem);
    return this;
  }

   /**
   * Pending is a list of initializers that must execute in order before this object is visible. When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.
   * @return pending
  **/
  @ApiModelProperty(required = true, value = "Pending is a list of initializers that must execute in order before this object is visible. When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.")
  public List<V1Initializer> getPending() {
    return pending;
  }

  public void setPending(List<V1Initializer> pending) {
    this.pending = pending;
  }

  public V1Initializers result(V1Status result) {
    this.result = result;
    return this;
  }

   /**
   * If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.
   * @return result
  **/
  @ApiModelProperty(value = "If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.")
  public V1Status getResult() {
    return result;
  }

  public void setResult(V1Status result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Initializers v1Initializers = (V1Initializers) o;
    return Objects.equals(this.pending, v1Initializers.pending) &&
        Objects.equals(this.result, v1Initializers.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Initializers {\n");
    
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

