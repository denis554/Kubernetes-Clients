/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
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
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 */
@ApiModel(description = "LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.")

public class V1LoadBalancerIngress {
  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("ip")
  private String ip = null;

  public V1LoadBalancerIngress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   * @return hostname
  **/
  @ApiModelProperty(value = "Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public V1LoadBalancerIngress ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   * @return ip
  **/
  @ApiModelProperty(value = "IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LoadBalancerIngress v1LoadBalancerIngress = (V1LoadBalancerIngress) o;
    return Objects.equals(this.hostname, v1LoadBalancerIngress.hostname) &&
        Objects.equals(this.ip, v1LoadBalancerIngress.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LoadBalancerIngress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

