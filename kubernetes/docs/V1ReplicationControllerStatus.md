
# V1ReplicationControllerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | The number of available replicas (ready for at least minReadySeconds) for this replication controller. |  [optional]
**conditions** | [**List&lt;V1ReplicationControllerCondition&gt;**](V1ReplicationControllerCondition.md) | Represents the latest available observations of a replication controller&#39;s current state. |  [optional]
**fullyLabeledReplicas** | **Integer** | The number of pods that have labels matching the labels of the pod template of the replication controller. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration reflects the generation of the most recently observed replication controller. |  [optional]
**readyReplicas** | **Integer** | The number of ready replicas for this replication controller. |  [optional]
**replicas** | **Integer** | Replicas is the most recently oberved number of replicas. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller | 



