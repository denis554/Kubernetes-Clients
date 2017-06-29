/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V1alpha1RoleBinding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleBindingList is a collection of RoleBindings
 */
@ApiModel(description = "RoleBindingList is a collection of RoleBindings")

public class V1alpha1RoleBindingList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V1alpha1RoleBinding> items = new ArrayList<V1alpha1RoleBinding>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public V1alpha1RoleBindingList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1alpha1RoleBindingList items(List<V1alpha1RoleBinding> items) {
    this.items = items;
    return this;
  }

  public V1alpha1RoleBindingList addItemsItem(V1alpha1RoleBinding itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is a list of RoleBindings
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "Items is a list of RoleBindings")
  public List<V1alpha1RoleBinding> getItems() {
    return items;
  }

  public void setItems(List<V1alpha1RoleBinding> items) {
    this.items = items;
  }

  public V1alpha1RoleBindingList kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1RoleBindingList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object's metadata.
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Standard object's metadata.")
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1RoleBindingList v1alpha1RoleBindingList = (V1alpha1RoleBindingList) o;
    return Objects.equals(this.apiVersion, v1alpha1RoleBindingList.apiVersion) &&
        Objects.equals(this.items, v1alpha1RoleBindingList.items) &&
        Objects.equals(this.kind, v1alpha1RoleBindingList.kind) &&
        Objects.equals(this.metadata, v1alpha1RoleBindingList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RoleBindingList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

