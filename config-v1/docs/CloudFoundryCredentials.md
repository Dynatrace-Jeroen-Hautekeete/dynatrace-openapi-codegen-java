

# CloudFoundryCredentials

Configuration for specific Cloud Foundry credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the given credentials configuration. |  [optional] [readonly] |
|**active** | **Boolean** | The monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) for given credentials configuration.   If not set on creation, the &#x60;true&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**endpointStatus** | [**EndpointStatusEnum**](#EndpointStatusEnum) | The status of the configured endpoint.  ASSIGNED: The credentials are assigned to an ActiveGate which is responsible for processing. UNASSIGNED: The credentials are not yet assigned to an ActiveGate so there is currently no processing. DISABLED: The credentials have been disabled by the user. FASTCHECK_AUTH_ERROR: The credentials are invalid. FASTCHECK_TLS_ERROR: The endpoint TLS certificate is invalid. FASTCHECK_NO_RESPONSE: The endpoint did not return a result until the timeout was reached. FASTCHECK_INVALID_ENDPOINT: The endpoint URL was invalid. FASTCHECK_AUTH_LOCKED: The credentials seem to be locked. UNKNOWN: An unknown error occured.  |  [optional] [readonly] |
|**endpointStatusInfo** | **String** | The detailed status info of the configured endpoint. |  [optional] [readonly] |
|**name** | **String** | The name of the Cloud Foundry foundation credentials.   Allowed characters are letters, numbers, whitespaces, and the following characters: &#x60;.+-_&#x60;. Leading or trailing whitespace is not allowed. |  |
|**apiUrl** | **String** | The URL of the Cloud Foundry foundation credentials.   The URL must be valid according to RFC 2396.   Leading or trailing whitespaces are not allowed. |  |
|**loginUrl** | **String** | The login URL of the Cloud Foundry foundation credentials.   The URL must be valid according to RFC 2396.   Leading or trailing whitespaces are not allowed. |  |
|**username** | **String** | The username of the Cloud Foundry foundation credentials.   Leading and trailing whitespaces are not allowed. |  |
|**password** | **String** | The password of the Cloud Foundry foundation credentials. |  [optional] |



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



