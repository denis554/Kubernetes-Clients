/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserInfo holds the information about the user needed to implement the user.Info interface.
 */
@ApiModel(description = "UserInfo holds the information about the user needed to implement the user.Info interface.")

public class V1UserInfo {
  @SerializedName("extra")
  private Map<String, List<String>> extra = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("username")
  private String username = null;

  public V1UserInfo extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public V1UserInfo putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<String, List<String>>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Any additional information provided by the authenticator.
   * @return extra
  **/
  @ApiModelProperty(value = "Any additional information provided by the authenticator.")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public V1UserInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public V1UserInfo addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The names of groups this user is a part of.
   * @return groups
  **/
  @ApiModelProperty(value = "The names of groups this user is a part of.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public V1UserInfo uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
   * @return uid
  **/
  @ApiModelProperty(value = "A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1UserInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The name that uniquely identifies this user among all active users.
   * @return username
  **/
  @ApiModelProperty(value = "The name that uniquely identifies this user among all active users.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserInfo v1UserInfo = (V1UserInfo) o;
    return Objects.equals(this.extra, v1UserInfo.extra) &&
        Objects.equals(this.groups, v1UserInfo.groups) &&
        Objects.equals(this.uid, v1UserInfo.uid) &&
        Objects.equals(this.username, v1UserInfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, uid, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserInfo {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

