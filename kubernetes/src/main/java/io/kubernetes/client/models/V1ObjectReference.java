/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.10.4
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
 * ObjectReference contains enough information to let you inspect or modify the referred object.
 */
@ApiModel(description = "ObjectReference contains enough information to let you inspect or modify the referred object.")

public class V1ObjectReference {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("fieldPath")
  private String fieldPath = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("resourceVersion")
  private String resourceVersion = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ObjectReference fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \&quot;spec.containers{name}\&quot; (where \&quot;name\&quot; refers to the name of the container that triggered the event) or if no container name is specified \&quot;spec.containers[2]\&quot; (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
   * @return fieldPath
  **/
  @ApiModelProperty(value = "If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \"spec.containers{name}\" (where \"name\" refers to the name of the container that triggered the event) or if no container name is specified \"spec.containers[2]\" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public V1ObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ObjectReference name(String name) {
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

  public V1ObjectReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectReference resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectReference uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
   * @return uid
  **/
  @ApiModelProperty(value = "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectReference v1ObjectReference = (V1ObjectReference) o;
    return Objects.equals(this.apiVersion, v1ObjectReference.apiVersion) &&
        Objects.equals(this.fieldPath, v1ObjectReference.fieldPath) &&
        Objects.equals(this.kind, v1ObjectReference.kind) &&
        Objects.equals(this.name, v1ObjectReference.name) &&
        Objects.equals(this.namespace, v1ObjectReference.namespace) &&
        Objects.equals(this.resourceVersion, v1ObjectReference.resourceVersion) &&
        Objects.equals(this.uid, v1ObjectReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath, kind, name, namespace, resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

