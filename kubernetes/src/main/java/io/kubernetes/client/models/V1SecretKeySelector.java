/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
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
 * SecretKeySelector selects a key of a Secret.
 */
@ApiModel(description = "SecretKeySelector selects a key of a Secret.")

public class V1SecretKeySelector {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("optional")
  private Boolean optional = null;

  public V1SecretKeySelector key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the secret to select from.  Must be a valid secret key.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the secret to select from.  Must be a valid secret key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public V1SecretKeySelector name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1SecretKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the Secret or it&#39;s key must be defined
   * @return optional
  **/
  @ApiModelProperty(value = "Specify whether the Secret or it's key must be defined")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SecretKeySelector v1SecretKeySelector = (V1SecretKeySelector) o;
    return Objects.equals(this.key, v1SecretKeySelector.key) &&
        Objects.equals(this.name, v1SecretKeySelector.name) &&
        Objects.equals(this.optional, v1SecretKeySelector.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SecretKeySelector {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

