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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@ApiModel(description = "PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.")

public class V1beta1PodDisruptionBudgetSpec {
  @SerializedName("maxUnavailable")
  private IntOrString maxUnavailable = null;

  @SerializedName("minAvailable")
  private IntOrString minAvailable = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  public V1beta1PodDisruptionBudgetSpec maxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * An eviction is allowed if at most \&quot;maxUnavailable\&quot; pods selected by \&quot;selector\&quot; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \&quot;minAvailable\&quot;.
   * @return maxUnavailable
  **/
  @ApiModelProperty(value = "An eviction is allowed if at most \"maxUnavailable\" pods selected by \"selector\" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \"minAvailable\".")
  public IntOrString getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public V1beta1PodDisruptionBudgetSpec minAvailable(IntOrString minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * An eviction is allowed if at least \&quot;minAvailable\&quot; pods selected by \&quot;selector\&quot; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \&quot;100%\&quot;.
   * @return minAvailable
  **/
  @ApiModelProperty(value = "An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\".")
  public IntOrString getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(IntOrString minAvailable) {
    this.minAvailable = minAvailable;
  }

  public V1beta1PodDisruptionBudgetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Label query over pods whose evictions are managed by the disruption budget.
   * @return selector
  **/
  @ApiModelProperty(value = "Label query over pods whose evictions are managed by the disruption budget.")
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
    V1beta1PodDisruptionBudgetSpec v1beta1PodDisruptionBudgetSpec = (V1beta1PodDisruptionBudgetSpec) o;
    return Objects.equals(this.maxUnavailable, v1beta1PodDisruptionBudgetSpec.maxUnavailable) &&
        Objects.equals(this.minAvailable, v1beta1PodDisruptionBudgetSpec.minAvailable) &&
        Objects.equals(this.selector, v1beta1PodDisruptionBudgetSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnavailable, minAvailable, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PodDisruptionBudgetSpec {\n");
    
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
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

