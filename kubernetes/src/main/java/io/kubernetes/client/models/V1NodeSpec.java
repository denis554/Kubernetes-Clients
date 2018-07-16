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
import io.kubernetes.client.models.V1NodeConfigSource;
import io.kubernetes.client.models.V1Taint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeSpec describes the attributes that a node is created with.
 */
@ApiModel(description = "NodeSpec describes the attributes that a node is created with.")

public class V1NodeSpec {
  @SerializedName("configSource")
  private V1NodeConfigSource configSource = null;

  @SerializedName("externalID")
  private String externalID = null;

  @SerializedName("podCIDR")
  private String podCIDR = null;

  @SerializedName("providerID")
  private String providerID = null;

  @SerializedName("taints")
  private List<V1Taint> taints = null;

  @SerializedName("unschedulable")
  private Boolean unschedulable = null;

  public V1NodeSpec configSource(V1NodeConfigSource configSource) {
    this.configSource = configSource;
    return this;
  }

   /**
   * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
   * @return configSource
  **/
  @ApiModelProperty(value = "If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field")
  public V1NodeConfigSource getConfigSource() {
    return configSource;
  }

  public void setConfigSource(V1NodeConfigSource configSource) {
    this.configSource = configSource;
  }

  public V1NodeSpec externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   * @return externalID
  **/
  @ApiModelProperty(value = "Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public V1NodeSpec podCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
    return this;
  }

   /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
  **/
  @ApiModelProperty(value = "PodCIDR represents the pod IP range assigned to the node.")
  public String getPodCIDR() {
    return podCIDR;
  }

  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }

  public V1NodeSpec providerID(String providerID) {
    this.providerID = providerID;
    return this;
  }

   /**
   * ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   * @return providerID
  **/
  @ApiModelProperty(value = "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")
  public String getProviderID() {
    return providerID;
  }

  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  public V1NodeSpec taints(List<V1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public V1NodeSpec addTaintsItem(V1Taint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<V1Taint>();
    }
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * If specified, the node&#39;s taints.
   * @return taints
  **/
  @ApiModelProperty(value = "If specified, the node's taints.")
  public List<V1Taint> getTaints() {
    return taints;
  }

  public void setTaints(List<V1Taint> taints) {
    this.taints = taints;
  }

  public V1NodeSpec unschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return this;
  }

   /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
  **/
  @ApiModelProperty(value = "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")
  public Boolean isUnschedulable() {
    return unschedulable;
  }

  public void setUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeSpec v1NodeSpec = (V1NodeSpec) o;
    return Objects.equals(this.configSource, v1NodeSpec.configSource) &&
        Objects.equals(this.externalID, v1NodeSpec.externalID) &&
        Objects.equals(this.podCIDR, v1NodeSpec.podCIDR) &&
        Objects.equals(this.providerID, v1NodeSpec.providerID) &&
        Objects.equals(this.taints, v1NodeSpec.taints) &&
        Objects.equals(this.unschedulable, v1NodeSpec.unschedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configSource, externalID, podCIDR, providerID, taints, unschedulable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSpec {\n");
    
    sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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

