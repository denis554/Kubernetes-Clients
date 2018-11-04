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
import io.kubernetes.client.models.V1LimitRangeItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 */
@ApiModel(description = "LimitRangeSpec defines a min/max usage limit for resources that match on kind.")

public class V1LimitRangeSpec {
  @SerializedName("limits")
  private List<V1LimitRangeItem> limits = new ArrayList<V1LimitRangeItem>();

  public V1LimitRangeSpec limits(List<V1LimitRangeItem> limits) {
    this.limits = limits;
    return this;
  }

  public V1LimitRangeSpec addLimitsItem(V1LimitRangeItem limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Limits is the list of LimitRangeItem objects that are enforced.
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "Limits is the list of LimitRangeItem objects that are enforced.")
  public List<V1LimitRangeItem> getLimits() {
    return limits;
  }

  public void setLimits(List<V1LimitRangeItem> limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LimitRangeSpec v1LimitRangeSpec = (V1LimitRangeSpec) o;
    return Objects.equals(this.limits, v1LimitRangeSpec.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeSpec {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

