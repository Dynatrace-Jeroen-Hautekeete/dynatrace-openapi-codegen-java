

# KubernetesEventPattern

Represents a single Kubernetes events field selector (=event filter based on the K8s field selector).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**label** | **String** | A label of the events field selector. |  |
|**fieldSelector** | **String** | The field selector string (url decoding is applied) when storing it. |  |
|**active** | **Boolean** | Whether subscription to this events field selector is enabled (value set to &#x60;true&#x60;). If disabled (value set to &#x60;false&#x60;), Dynatrace will stop fetching events from the Kubernetes API for this events field selector |  |



