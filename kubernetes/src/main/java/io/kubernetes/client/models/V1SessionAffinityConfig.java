/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
import io.kubernetes.client.models.V1ClientIPConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SessionAffinityConfig represents the configurations of session affinity.
 */
@ApiModel(description = "SessionAffinityConfig represents the configurations of session affinity.")

public class V1SessionAffinityConfig {
  @SerializedName("clientIP")
  private V1ClientIPConfig clientIP = null;

  public V1SessionAffinityConfig clientIP(V1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
    return this;
  }

   /**
   * clientIP contains the configurations of Client IP based session affinity.
   * @return clientIP
  **/
  @ApiModelProperty(value = "clientIP contains the configurations of Client IP based session affinity.")
  public V1ClientIPConfig getClientIP() {
    return clientIP;
  }

  public void setClientIP(V1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SessionAffinityConfig v1SessionAffinityConfig = (V1SessionAffinityConfig) o;
    return Objects.equals(this.clientIP, v1SessionAffinityConfig.clientIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SessionAffinityConfig {\n");
    
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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

