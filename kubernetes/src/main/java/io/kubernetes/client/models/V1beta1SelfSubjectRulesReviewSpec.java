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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1SelfSubjectRulesReviewSpec
 */

public class V1beta1SelfSubjectRulesReviewSpec {
  @SerializedName("namespace")
  private String namespace = null;

  public V1beta1SelfSubjectRulesReviewSpec namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace to evaluate rules for. Required.
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace to evaluate rules for. Required.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SelfSubjectRulesReviewSpec v1beta1SelfSubjectRulesReviewSpec = (V1beta1SelfSubjectRulesReviewSpec) o;
    return Objects.equals(this.namespace, v1beta1SelfSubjectRulesReviewSpec.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SelfSubjectRulesReviewSpec {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

