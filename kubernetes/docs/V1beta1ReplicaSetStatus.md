
# V1beta1ReplicaSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | The number of available replicas (ready for at least minReadySeconds) for this replica set. |  [optional]
**conditions** | [**List&lt;V1beta1ReplicaSetCondition&gt;**](V1beta1ReplicaSetCondition.md) | Represents the latest available observations of a replica set&#39;s current state. |  [optional]
**fullyLabeledReplicas** | **Integer** | The number of pods that have labels matching the labels of the pod template of the replicaset. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration reflects the generation of the most recently observed ReplicaSet. |  [optional]
**readyReplicas** | **Integer** | The number of ready replicas for this replica set. |  [optional]
**replicas** | **Integer** | Replicas is the most recently oberved number of replicas. More info: http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller | 



