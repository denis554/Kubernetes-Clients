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
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricIdentifier defines the name and optionally selector for a metric
 */
@ApiModel(description = "MetricIdentifier defines the name and optionally selector for a metric")

public class V2beta2MetricIdentifier {
  @SerializedName("name")
  private String name = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  public V2beta2MetricIdentifier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is the name of the given metric
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the name of the given metric")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V2beta2MetricIdentifier selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricIdentifier v2beta2MetricIdentifier = (V2beta2MetricIdentifier) o;
    return Objects.equals(this.name, v2beta2MetricIdentifier.name) &&
        Objects.equals(this.selector, v2beta2MetricIdentifier.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricIdentifier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

