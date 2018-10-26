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
import io.kubernetes.client.models.V1LocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")

public class V1ISCSIVolumeSource {
  @SerializedName("chapAuthDiscovery")
  private Boolean chapAuthDiscovery = null;

  @SerializedName("chapAuthSession")
  private Boolean chapAuthSession = null;

  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("initiatorName")
  private String initiatorName = null;

  @SerializedName("iqn")
  private String iqn = null;

  @SerializedName("iscsiInterface")
  private String iscsiInterface = null;

  @SerializedName("lun")
  private Integer lun = null;

  @SerializedName("portals")
  private List<String> portals = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private V1LocalObjectReference secretRef = null;

  @SerializedName("targetPortal")
  private String targetPortal = null;

  public V1ISCSIVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

   /**
   * whether support iSCSI Discovery CHAP authentication
   * @return chapAuthDiscovery
  **/
  @ApiModelProperty(value = "whether support iSCSI Discovery CHAP authentication")
  public Boolean isChapAuthDiscovery() {
    return chapAuthDiscovery;
  }

  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }

  public V1ISCSIVolumeSource chapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return this;
  }

   /**
   * whether support iSCSI Session CHAP authentication
   * @return chapAuthSession
  **/
  @ApiModelProperty(value = "whether support iSCSI Session CHAP authentication")
  public Boolean isChapAuthSession() {
    return chapAuthSession;
  }

  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }

  public V1ISCSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public V1ISCSIVolumeSource initiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return this;
  }

   /**
   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
   * @return initiatorName
  **/
  @ApiModelProperty(value = "Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
  public String getInitiatorName() {
    return initiatorName;
  }

  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }

  public V1ISCSIVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

   /**
   * Target iSCSI Qualified Name.
   * @return iqn
  **/
  @ApiModelProperty(required = true, value = "Target iSCSI Qualified Name.")
  public String getIqn() {
    return iqn;
  }

  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  public V1ISCSIVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

   /**
   * iSCSI Interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   * @return iscsiInterface
  **/
  @ApiModelProperty(value = "iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
  public String getIscsiInterface() {
    return iscsiInterface;
  }

  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  public V1ISCSIVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

   /**
   * iSCSI Target Lun number.
   * @return lun
  **/
  @ApiModelProperty(required = true, value = "iSCSI Target Lun number.")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public V1ISCSIVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  public V1ISCSIVolumeSource addPortalsItem(String portalsItem) {
    if (this.portals == null) {
      this.portals = new ArrayList<String>();
    }
    this.portals.add(portalsItem);
    return this;
  }

   /**
   * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return portals
  **/
  @ApiModelProperty(value = "iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public List<String> getPortals() {
    return portals;
  }

  public void setPortals(List<String> portals) {
    this.portals = portals;
  }

  public V1ISCSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   * @return readOnly
  **/
  @ApiModelProperty(value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1ISCSIVolumeSource secretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * CHAP Secret for iSCSI target and initiator authentication
   * @return secretRef
  **/
  @ApiModelProperty(value = "CHAP Secret for iSCSI target and initiator authentication")
  public V1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(V1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public V1ISCSIVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }

   /**
   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return targetPortal
  **/
  @ApiModelProperty(required = true, value = "iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  public String getTargetPortal() {
    return targetPortal;
  }

  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ISCSIVolumeSource v1ISCSIVolumeSource = (V1ISCSIVolumeSource) o;
    return Objects.equals(this.chapAuthDiscovery, v1ISCSIVolumeSource.chapAuthDiscovery) &&
        Objects.equals(this.chapAuthSession, v1ISCSIVolumeSource.chapAuthSession) &&
        Objects.equals(this.fsType, v1ISCSIVolumeSource.fsType) &&
        Objects.equals(this.initiatorName, v1ISCSIVolumeSource.initiatorName) &&
        Objects.equals(this.iqn, v1ISCSIVolumeSource.iqn) &&
        Objects.equals(this.iscsiInterface, v1ISCSIVolumeSource.iscsiInterface) &&
        Objects.equals(this.lun, v1ISCSIVolumeSource.lun) &&
        Objects.equals(this.portals, v1ISCSIVolumeSource.portals) &&
        Objects.equals(this.readOnly, v1ISCSIVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, v1ISCSIVolumeSource.secretRef) &&
        Objects.equals(this.targetPortal, v1ISCSIVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ISCSIVolumeSource {\n");
    
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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

