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
import io.kubernetes.client.models.V1APIResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.
 */
@ApiModel(description = "APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.")

public class V1APIResourceList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("groupVersion")
  private String groupVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("resources")
  private List<V1APIResource> resources = new ArrayList<V1APIResource>();

  public V1APIResourceList apiVersion(String apiVersion) {
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

  public V1APIResourceList groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

   /**
   * groupVersion is the group and version this APIResourceList is for.
   * @return groupVersion
  **/
  @ApiModelProperty(example = "null", required = true, value = "groupVersion is the group and version this APIResourceList is for.")
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
  }

  public V1APIResourceList kind(String kind) {
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

  public V1APIResourceList resources(List<V1APIResource> resources) {
    this.resources = resources;
    return this;
  }

  public V1APIResourceList addResourcesItem(V1APIResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * resources contains the name of the resources and if they are namespaced.
   * @return resources
  **/
  @ApiModelProperty(example = "null", required = true, value = "resources contains the name of the resources and if they are namespaced.")
  public List<V1APIResource> getResources() {
    return resources;
  }

  public void setResources(List<V1APIResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1APIResourceList v1APIResourceList = (V1APIResourceList) o;
    return Objects.equals(this.apiVersion, v1APIResourceList.apiVersion) &&
        Objects.equals(this.groupVersion, v1APIResourceList.groupVersion) &&
        Objects.equals(this.kind, v1APIResourceList.kind) &&
        Objects.equals(this.resources, v1APIResourceList.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, groupVersion, kind, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1APIResourceList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

