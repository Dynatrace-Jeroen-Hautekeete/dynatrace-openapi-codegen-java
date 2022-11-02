

# KubernetesCredentials

Configuration for specific Kubernetes credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the given credentials configuration. |  [optional] [readonly] |
|**active** | **Boolean** | The monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for given credentials configuration.   If not set on creation, the &#x60;true&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**endpointStatus** | [**EndpointStatusEnum**](#EndpointStatusEnum) | The status of the configured endpoint.  ASSIGNED: The credentials are assigned to an ActiveGate which is responsible for processing. UNASSIGNED: The credentials are not yet assigned to an ActiveGate so there is currently no processing. DISABLED: The credentials have been disabled by the user. FASTCHECK_AUTH_ERROR: The credentials are invalid. FASTCHECK_TLS_ERROR: The endpoint TLS certificate is invalid. FASTCHECK_NO_RESPONSE: The endpoint did not return a result until the timeout was reached. FASTCHECK_INVALID_ENDPOINT: The endpoint URL was invalid. FASTCHECK_AUTH_LOCKED: The credentials seem to be locked. UNKNOWN: An unknown error occured.  |  [optional] [readonly] |
|**endpointStatusInfo** | **String** | The detailed status info of the configured endpoint. |  [optional] [readonly] |
|**label** | **String** | The name of the Kubernetes credentials configuration.   Allowed characters are letters, numbers, whitespaces, and the following characters: &#x60;.+-_&#x60;. Leading or trailing whitespace is not allowed. |  |
|**endpointUrl** | **String** | The URL of the Kubernetes API server.   It must be unique within a Dynatrace environment.   The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed. |  |
|**authToken** | **String** | The service account bearer token for the Kubernetes API server.   Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as &#x60;null&#x60;.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**activeGateGroup** | **String** | Active Gate group to filter active gates for this credentials. |  [optional] |
|**eventsIntegrationEnabled** | **Boolean** | The monitoring of events is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.   If not set on creation, the &#x60;false&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**eventAnalysisAndAlertingEnabled** | **Boolean** | [Deprecated] With 1.240 the EA events monitoring has been deprecated and replaced by the events GA version which obsoletes this property.  Corresponds to the value of &#x60;eventsIntegrationEnabled&#x60;.     The field is ignored during an update, the old value remains unaffected. |  [optional] |
|**workloadIntegrationEnabled** | **Boolean** | Workload and cloud application processing is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**prometheusExportersIntegrationEnabled** | **Boolean** | Prometheus exporters integration is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**davisEventsIntegrationEnabled** | **Boolean** | Inclusion of all Davis relevant events is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**eventsFieldSelectors** | [**List&lt;KubernetesEventPattern&gt;**](KubernetesEventPattern.md) | Kubernetes event filters based on field-selectors. If set to &#x60;null&#x60; on creation, no events field selectors are subscribed. If set to &#x60;null&#x60; on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors. |  [optional] |
|**certificateCheckEnabled** | **Boolean** | The check of SSL certificates is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for the Kubernetes cluster.   If not set on creation, the &#x60;true&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |



## Enum: EndpointStatusEnum

| Name | Value |
|---- | -----|
| ASSIGNED | &quot;ASSIGNED&quot; |
| DISABLED | &quot;DISABLED&quot; |
| FASTCHECK_AUTH_ERROR | &quot;FASTCHECK_AUTH_ERROR&quot; |
| FASTCHECK_AUTH_LOCKED | &quot;FASTCHECK_AUTH_LOCKED&quot; |
| FASTCHECK_INVALID_ENDPOINT | &quot;FASTCHECK_INVALID_ENDPOINT&quot; |
| FASTCHECK_LOW_MEMORY_ERROR | &quot;FASTCHECK_LOW_MEMORY_ERROR&quot; |
| FASTCHECK_NO_RESPONSE | &quot;FASTCHECK_NO_RESPONSE&quot; |
| FASTCHECK_TLS_ERROR | &quot;FASTCHECK_TLS_ERROR&quot; |
| FASTCHECK_TOO_BIG_ENVIRONMENT | &quot;FASTCHECK_TOO_BIG_ENVIRONMENT&quot; |
| UNASSIGNED | &quot;UNASSIGNED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



