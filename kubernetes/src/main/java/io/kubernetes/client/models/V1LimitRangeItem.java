/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 */
@ApiModel(description = "LimitRangeItem defines a min/max usage limit for any resource that matches on kind.")

public class V1LimitRangeItem {
  @SerializedName("default")
  private Map<String, String> _default = new HashMap<String, String>();

  @SerializedName("defaultRequest")
  private Map<String, String> defaultRequest = new HashMap<String, String>();

  @SerializedName("max")
  private Map<String, String> max = new HashMap<String, String>();

  @SerializedName("maxLimitRequestRatio")
  private Map<String, String> maxLimitRequestRatio = new HashMap<String, String>();

  @SerializedName("min")
  private Map<String, String> min = new HashMap<String, String>();

  @SerializedName("type")
  private String type = null;

  public V1LimitRangeItem _default(Map<String, String> _default) {
    this._default = _default;
    return this;
  }

  public V1LimitRangeItem putDefaultItem(String key, String _defaultItem) {
    this._default.put(key, _defaultItem);
    return this;
  }

   /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "Default resource requirement limit value by resource name if resource limit is omitted.")
  public Map<String, String> getDefault() {
    return _default;
  }

  public void setDefault(Map<String, String> _default) {
    this._default = _default;
  }

  public V1LimitRangeItem defaultRequest(Map<String, String> defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

  public V1LimitRangeItem putDefaultRequestItem(String key, String defaultRequestItem) {
    this.defaultRequest.put(key, defaultRequestItem);
    return this;
  }

   /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
   * @return defaultRequest
  **/
  @ApiModelProperty(example = "null", value = "DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.")
  public Map<String, String> getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(Map<String, String> defaultRequest) {
    this.defaultRequest = defaultRequest;
  }

  public V1LimitRangeItem max(Map<String, String> max) {
    this.max = max;
    return this;
  }

  public V1LimitRangeItem putMaxItem(String key, String maxItem) {
    this.max.put(key, maxItem);
    return this;
  }

   /**
   * Max usage constraints on this kind by resource name.
   * @return max
  **/
  @ApiModelProperty(example = "null", value = "Max usage constraints on this kind by resource name.")
  public Map<String, String> getMax() {
    return max;
  }

  public void setMax(Map<String, String> max) {
    this.max = max;
  }

  public V1LimitRangeItem maxLimitRequestRatio(Map<String, String> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

  public V1LimitRangeItem putMaxLimitRequestRatioItem(String key, String maxLimitRequestRatioItem) {
    this.maxLimitRequestRatio.put(key, maxLimitRequestRatioItem);
    return this;
  }

   /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
   * @return maxLimitRequestRatio
  **/
  @ApiModelProperty(example = "null", value = "MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.")
  public Map<String, String> getMaxLimitRequestRatio() {
    return maxLimitRequestRatio;
  }

  public void setMaxLimitRequestRatio(Map<String, String> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
  }

  public V1LimitRangeItem min(Map<String, String> min) {
    this.min = min;
    return this;
  }

  public V1LimitRangeItem putMinItem(String key, String minItem) {
    this.min.put(key, minItem);
    return this;
  }

   /**
   * Min usage constraints on this kind by resource name.
   * @return min
  **/
  @ApiModelProperty(example = "null", value = "Min usage constraints on this kind by resource name.")
  public Map<String, String> getMin() {
    return min;
  }

  public void setMin(Map<String, String> min) {
    this.min = min;
  }

  public V1LimitRangeItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of resource that this limit applies to.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of resource that this limit applies to.")
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
    V1LimitRangeItem v1LimitRangeItem = (V1LimitRangeItem) o;
    return Objects.equals(this._default, v1LimitRangeItem._default) &&
        Objects.equals(this.defaultRequest, v1LimitRangeItem.defaultRequest) &&
        Objects.equals(this.max, v1LimitRangeItem.max) &&
        Objects.equals(this.maxLimitRequestRatio, v1LimitRangeItem.maxLimitRequestRatio) &&
        Objects.equals(this.min, v1LimitRangeItem.min) &&
        Objects.equals(this.type, v1LimitRangeItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultRequest, max, maxLimitRequestRatio, min, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeItem {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLimitRequestRatio: ").append(toIndentedString(maxLimitRequestRatio)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

