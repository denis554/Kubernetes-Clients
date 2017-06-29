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
import io.kubernetes.client.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.models.V1AzureDiskVolumeSource;
import io.kubernetes.client.models.V1AzureFileVolumeSource;
import io.kubernetes.client.models.V1CephFSVolumeSource;
import io.kubernetes.client.models.V1CinderVolumeSource;
import io.kubernetes.client.models.V1FCVolumeSource;
import io.kubernetes.client.models.V1FlexVolumeSource;
import io.kubernetes.client.models.V1FlockerVolumeSource;
import io.kubernetes.client.models.V1GCEPersistentDiskVolumeSource;
import io.kubernetes.client.models.V1GlusterfsVolumeSource;
import io.kubernetes.client.models.V1HostPathVolumeSource;
import io.kubernetes.client.models.V1ISCSIVolumeSource;
import io.kubernetes.client.models.V1NFSVolumeSource;
import io.kubernetes.client.models.V1ObjectReference;
import io.kubernetes.client.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.models.V1PortworxVolumeSource;
import io.kubernetes.client.models.V1QuobyteVolumeSource;
import io.kubernetes.client.models.V1RBDVolumeSource;
import io.kubernetes.client.models.V1ScaleIOVolumeSource;
import io.kubernetes.client.models.V1VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
@ApiModel(description = "PersistentVolumeSpec is the specification of a persistent volume.")

public class V1PersistentVolumeSpec {
  @SerializedName("accessModes")
  private List<String> accessModes = new ArrayList<String>();

  @SerializedName("awsElasticBlockStore")
  private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;

  @SerializedName("azureDisk")
  private V1AzureDiskVolumeSource azureDisk = null;

  @SerializedName("azureFile")
  private V1AzureFileVolumeSource azureFile = null;

  @SerializedName("capacity")
  private Map<String, String> capacity = new HashMap<String, String>();

  @SerializedName("cephfs")
  private V1CephFSVolumeSource cephfs = null;

  @SerializedName("cinder")
  private V1CinderVolumeSource cinder = null;

  @SerializedName("claimRef")
  private V1ObjectReference claimRef = null;

  @SerializedName("fc")
  private V1FCVolumeSource fc = null;

  @SerializedName("flexVolume")
  private V1FlexVolumeSource flexVolume = null;

  @SerializedName("flocker")
  private V1FlockerVolumeSource flocker = null;

  @SerializedName("gcePersistentDisk")
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  @SerializedName("glusterfs")
  private V1GlusterfsVolumeSource glusterfs = null;

  @SerializedName("hostPath")
  private V1HostPathVolumeSource hostPath = null;

  @SerializedName("iscsi")
  private V1ISCSIVolumeSource iscsi = null;

  @SerializedName("nfs")
  private V1NFSVolumeSource nfs = null;

  @SerializedName("persistentVolumeReclaimPolicy")
  private String persistentVolumeReclaimPolicy = null;

  @SerializedName("photonPersistentDisk")
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;

  @SerializedName("portworxVolume")
  private V1PortworxVolumeSource portworxVolume = null;

  @SerializedName("quobyte")
  private V1QuobyteVolumeSource quobyte = null;

  @SerializedName("rbd")
  private V1RBDVolumeSource rbd = null;

  @SerializedName("scaleIO")
  private V1ScaleIOVolumeSource scaleIO = null;

  @SerializedName("storageClassName")
  private String storageClassName = null;

  @SerializedName("vsphereVolume")
  private V1VsphereVirtualDiskVolumeSource vsphereVolume = null;

  public V1PersistentVolumeSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public V1PersistentVolumeSpec addAccessModesItem(String accessModesItem) {
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains all ways the volume can be mounted. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes
   * @return accessModes
  **/
  @ApiModelProperty(example = "null", value = "AccessModes contains all ways the volume can be mounted. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public V1PersistentVolumeSpec awsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore
   * @return awsElasticBlockStore
  **/
  @ApiModelProperty(example = "null", value = "AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore")
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public V1PersistentVolumeSpec azureDisk(V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
   * @return azureDisk
  **/
  @ApiModelProperty(example = "null", value = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
  public V1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  public V1PersistentVolumeSpec azureFile(V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

   /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   * @return azureFile
  **/
  @ApiModelProperty(example = "null", value = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
  public V1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public V1PersistentVolumeSpec capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public V1PersistentVolumeSpec putCapacityItem(String key, String capacityItem) {
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * A description of the persistent volume's resources and capacity. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "A description of the persistent volume's resources and capacity. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public V1PersistentVolumeSpec cephfs(V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

   /**
   * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
   * @return cephfs
  **/
  @ApiModelProperty(example = "null", value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  public V1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public V1PersistentVolumeSpec cinder(V1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

   /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine More info: http://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
   * @return cinder
  **/
  @ApiModelProperty(example = "null", value = "Cinder represents a cinder volume attached and mounted on kubelets host machine More info: http://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md")
  public V1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(V1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  public V1PersistentVolumeSpec claimRef(V1ObjectReference claimRef) {
    this.claimRef = claimRef;
    return this;
  }

   /**
   * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#binding
   * @return claimRef
  **/
  @ApiModelProperty(example = "null", value = "ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#binding")
  public V1ObjectReference getClaimRef() {
    return claimRef;
  }

  public void setClaimRef(V1ObjectReference claimRef) {
    this.claimRef = claimRef;
  }

  public V1PersistentVolumeSpec fc(V1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

   /**
   * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
   * @return fc
  **/
  @ApiModelProperty(example = "null", value = "FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
  public V1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(V1FCVolumeSource fc) {
    this.fc = fc;
  }

  public V1PersistentVolumeSpec flexVolume(V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. This is an alpha feature and may change in future.
   * @return flexVolume
  **/
  @ApiModelProperty(example = "null", value = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin. This is an alpha feature and may change in future.")
  public V1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public V1PersistentVolumeSpec flocker(V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

   /**
   * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
   * @return flocker
  **/
  @ApiModelProperty(example = "null", value = "Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running")
  public V1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public V1PersistentVolumeSpec gcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk
   * @return gcePersistentDisk
  **/
  @ApiModelProperty(example = "null", value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk")
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public V1PersistentVolumeSpec glusterfs(V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: http://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
   * @return glusterfs
  **/
  @ApiModelProperty(example = "null", value = "Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: http://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md")
  public V1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public V1PersistentVolumeSpec hostPath(V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

   /**
   * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath
   * @return hostPath
  **/
  @ApiModelProperty(example = "null", value = "HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: http://kubernetes.io/docs/user-guide/volumes#hostpath")
  public V1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public V1PersistentVolumeSpec iscsi(V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

   /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
   * @return iscsi
  **/
  @ApiModelProperty(example = "null", value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.")
  public V1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public V1PersistentVolumeSpec nfs(V1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

   /**
   * NFS represents an NFS mount on the host. Provisioned by an admin. More info: http://kubernetes.io/docs/user-guide/volumes#nfs
   * @return nfs
  **/
  @ApiModelProperty(example = "null", value = "NFS represents an NFS mount on the host. Provisioned by an admin. More info: http://kubernetes.io/docs/user-guide/volumes#nfs")
  public V1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(V1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public V1PersistentVolumeSpec persistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

   /**
   * What happens to a persistent volume when released from its claim. Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#recycling-policy
   * @return persistentVolumeReclaimPolicy
  **/
  @ApiModelProperty(example = "null", value = "What happens to a persistent volume when released from its claim. Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#recycling-policy")
  public String getPersistentVolumeReclaimPolicy() {
    return persistentVolumeReclaimPolicy;
  }

  public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
  }

  public V1PersistentVolumeSpec photonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
   * @return photonPersistentDisk
  **/
  @ApiModelProperty(example = "null", value = "PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public V1PersistentVolumeSpec portworxVolume(V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
   * @return portworxVolume
  **/
  @ApiModelProperty(example = "null", value = "PortworxVolume represents a portworx volume attached and mounted on kubelets host machine")
  public V1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public V1PersistentVolumeSpec quobyte(V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

   /**
   * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
   * @return quobyte
  **/
  @ApiModelProperty(example = "null", value = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
  public V1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  public V1PersistentVolumeSpec rbd(V1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

   /**
   * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
   * @return rbd
  **/
  @ApiModelProperty(example = "null", value = "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md")
  public V1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(V1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  public V1PersistentVolumeSpec scaleIO(V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   * @return scaleIO
  **/
  @ApiModelProperty(example = "null", value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  public V1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public V1PersistentVolumeSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
   * @return storageClassName
  **/
  @ApiModelProperty(example = "null", value = "Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public V1PersistentVolumeSpec vsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
   * @return vsphereVolume
  **/
  @ApiModelProperty(example = "null", value = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeSpec v1PersistentVolumeSpec = (V1PersistentVolumeSpec) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeSpec.accessModes) &&
        Objects.equals(this.awsElasticBlockStore, v1PersistentVolumeSpec.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, v1PersistentVolumeSpec.azureDisk) &&
        Objects.equals(this.azureFile, v1PersistentVolumeSpec.azureFile) &&
        Objects.equals(this.capacity, v1PersistentVolumeSpec.capacity) &&
        Objects.equals(this.cephfs, v1PersistentVolumeSpec.cephfs) &&
        Objects.equals(this.cinder, v1PersistentVolumeSpec.cinder) &&
        Objects.equals(this.claimRef, v1PersistentVolumeSpec.claimRef) &&
        Objects.equals(this.fc, v1PersistentVolumeSpec.fc) &&
        Objects.equals(this.flexVolume, v1PersistentVolumeSpec.flexVolume) &&
        Objects.equals(this.flocker, v1PersistentVolumeSpec.flocker) &&
        Objects.equals(this.gcePersistentDisk, v1PersistentVolumeSpec.gcePersistentDisk) &&
        Objects.equals(this.glusterfs, v1PersistentVolumeSpec.glusterfs) &&
        Objects.equals(this.hostPath, v1PersistentVolumeSpec.hostPath) &&
        Objects.equals(this.iscsi, v1PersistentVolumeSpec.iscsi) &&
        Objects.equals(this.nfs, v1PersistentVolumeSpec.nfs) &&
        Objects.equals(this.persistentVolumeReclaimPolicy, v1PersistentVolumeSpec.persistentVolumeReclaimPolicy) &&
        Objects.equals(this.photonPersistentDisk, v1PersistentVolumeSpec.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, v1PersistentVolumeSpec.portworxVolume) &&
        Objects.equals(this.quobyte, v1PersistentVolumeSpec.quobyte) &&
        Objects.equals(this.rbd, v1PersistentVolumeSpec.rbd) &&
        Objects.equals(this.scaleIO, v1PersistentVolumeSpec.scaleIO) &&
        Objects.equals(this.storageClassName, v1PersistentVolumeSpec.storageClassName) &&
        Objects.equals(this.vsphereVolume, v1PersistentVolumeSpec.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, awsElasticBlockStore, azureDisk, azureFile, capacity, cephfs, cinder, claimRef, fc, flexVolume, flocker, gcePersistentDisk, glusterfs, hostPath, iscsi, nfs, persistentVolumeReclaimPolicy, photonPersistentDisk, portworxVolume, quobyte, rbd, scaleIO, storageClassName, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeSpec {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    claimRef: ").append(toIndentedString(claimRef)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeReclaimPolicy: ").append(toIndentedString(persistentVolumeReclaimPolicy)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

