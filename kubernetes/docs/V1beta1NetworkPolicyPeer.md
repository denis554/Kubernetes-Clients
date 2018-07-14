
# V1beta1NetworkPolicyPeer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipBlock** | [**V1beta1IPBlock**](V1beta1IPBlock.md) | IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be. |  [optional]
**namespaceSelector** | [**V1LabelSelector**](V1LabelSelector.md) | Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector. |  [optional]
**podSelector** | [**V1LabelSelector**](V1LabelSelector.md) | This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace. |  [optional]



