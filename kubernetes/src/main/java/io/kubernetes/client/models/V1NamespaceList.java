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
import io.kubernetes.client.models.V1Namespace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * NamespaceList is a list of Namespaces.
 */
@ApiModel(description = "NamespaceList is a list of Namespaces.")

public class V1NamespaceList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<V1Namespace> items = new ArrayList<V1Namespace>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ListMeta metadata = null;

  public V1NamespaceList apiVersion(String apiVersion) {
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

  public V1NamespaceList items(List<V1Namespace> items) {
    this.items = items;
    return this;
  }

  public V1NamespaceList addItemsItem(V1Namespace itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is the list of Namespace objects in the list. More info: http://kubernetes.io/docs/user-guide/namespaces
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "Items is the list of Namespace objects in the list. More info: http://kubernetes.io/docs/user-guide/namespaces")
  public List<V1Namespace> getItems() {
    return items;
  }

  public void setItems(List<V1Namespace> items) {
    this.items = items;
  }

  public V1NamespaceList kind(String kind) {
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

  public V1NamespaceList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard list metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "Standard list metadata. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds")
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
    V1NamespaceList v1NamespaceList = (V1NamespaceList) o;
    return Objects.equals(this.apiVersion, v1NamespaceList.apiVersion) &&
        Objects.equals(this.items, v1NamespaceList.items) &&
        Objects.equals(this.kind, v1NamespaceList.kind) &&
        Objects.equals(this.metadata, v1NamespaceList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceList {\n");
    
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

