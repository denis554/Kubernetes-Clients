/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.9
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
 * Info contains versioning information. how we&#39;ll want to distribute that information.
 */
@ApiModel(description = "Info contains versioning information. how we'll want to distribute that information.")

public class VersionInfo {
  @SerializedName("buildDate")
  private String buildDate = null;

  @SerializedName("compiler")
  private String compiler = null;

  @SerializedName("gitCommit")
  private String gitCommit = null;

  @SerializedName("gitTreeState")
  private String gitTreeState = null;

  @SerializedName("gitVersion")
  private String gitVersion = null;

  @SerializedName("goVersion")
  private String goVersion = null;

  @SerializedName("major")
  private String major = null;

  @SerializedName("minor")
  private String minor = null;

  @SerializedName("platform")
  private String platform = null;

  public VersionInfo buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

   /**
   * Get buildDate
   * @return buildDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public VersionInfo compiler(String compiler) {
    this.compiler = compiler;
    return this;
  }

   /**
   * Get compiler
   * @return compiler
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompiler() {
    return compiler;
  }

  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }

  public VersionInfo gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

   /**
   * Get gitCommit
   * @return gitCommit
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public VersionInfo gitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

   /**
   * Get gitTreeState
   * @return gitTreeState
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGitTreeState() {
    return gitTreeState;
  }

  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }

  public VersionInfo gitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
    return this;
  }

   /**
   * Get gitVersion
   * @return gitVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGitVersion() {
    return gitVersion;
  }

  public void setGitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
  }

  public VersionInfo goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

   /**
   * Get goVersion
   * @return goVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }

  public VersionInfo major(String major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public VersionInfo minor(String minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public VersionInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.buildDate, versionInfo.buildDate) &&
        Objects.equals(this.compiler, versionInfo.compiler) &&
        Objects.equals(this.gitCommit, versionInfo.gitCommit) &&
        Objects.equals(this.gitTreeState, versionInfo.gitTreeState) &&
        Objects.equals(this.gitVersion, versionInfo.gitVersion) &&
        Objects.equals(this.goVersion, versionInfo.goVersion) &&
        Objects.equals(this.major, versionInfo.major) &&
        Objects.equals(this.minor, versionInfo.minor) &&
        Objects.equals(this.platform, versionInfo.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, gitCommit, gitTreeState, gitVersion, goVersion, major, minor, platform);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    gitVersion: ").append(toIndentedString(gitVersion)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

