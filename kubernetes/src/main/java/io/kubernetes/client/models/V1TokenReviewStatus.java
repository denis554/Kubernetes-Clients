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
import io.kubernetes.client.models.V1UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TokenReviewStatus is the result of the token authentication request.
 */
@ApiModel(description = "TokenReviewStatus is the result of the token authentication request.")

public class V1TokenReviewStatus {
  @SerializedName("authenticated")
  private Boolean authenticated = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("user")
  private V1UserInfo user = null;

  public V1TokenReviewStatus authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

   /**
   * Authenticated indicates that the token was associated with a known user.
   * @return authenticated
  **/
  @ApiModelProperty(example = "null", value = "Authenticated indicates that the token was associated with a known user.")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public V1TokenReviewStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error indicates that the token couldn't be checked
   * @return error
  **/
  @ApiModelProperty(example = "null", value = "Error indicates that the token couldn't be checked")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public V1TokenReviewStatus user(V1UserInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User is the UserInfo associated with the provided token.
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "User is the UserInfo associated with the provided token.")
  public V1UserInfo getUser() {
    return user;
  }

  public void setUser(V1UserInfo user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TokenReviewStatus v1TokenReviewStatus = (V1TokenReviewStatus) o;
    return Objects.equals(this.authenticated, v1TokenReviewStatus.authenticated) &&
        Objects.equals(this.error, v1TokenReviewStatus.error) &&
        Objects.equals(this.user, v1TokenReviewStatus.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticated, error, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TokenReviewStatus {\n");
    
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

