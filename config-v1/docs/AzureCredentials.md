

# AzureCredentials

Configuration of Azure app-level credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The Dynatrace entity ID of the Azure credentials configuration. |  [optional] [readonly] |
|**label** | **String** | The unique name of the Azure credentials configuration.   Allowed characters are letters, numbers, and spaces. Also the special characters &#x60;.+-_&#x60; are allowed. |  |
|**appId** | **String** | The application ID (also referred to as client ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected. |  [optional] |
|**directoryId** | **String** | The directory ID (also referred to as tenant ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected. |  [optional] |
|**key** | **String** | The secret key associated with the application ID.   For security reasons, GET requests return this field as &#x60;null&#x60;.    Submit your key on creation or update of the configuration.    The field is **required** when creating a new credentials configuration. If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**active** | **Boolean** | The monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).   If not set on creation, the &#x60;true&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected. |  [optional] |
|**autoTagging** | **Boolean** | The automatic capture of Azure tags is on (&#x60;true&#x60;) or off (&#x60;false&#x60;). |  |
|**monitorOnlyTaggedEntities** | **Boolean** | Monitor only resources that have specified Azure tags (&#x60;true&#x60;) or all resources (&#x60;false&#x60;). |  |
|**monitorOnlyTagPairs** | [**Set&lt;CloudTag&gt;**](CloudTag.md) | A list of Azure tags to be monitored.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags is monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to &#x60;true&#x60;. |  [optional] |
|**monitorOnlyExcludingTagPairs** | [**Set&lt;CloudTag&gt;**](CloudTag.md) | A list of Azure tags to be excluded from monitoring.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags will not be monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to &#x60;true&#x60;. |  [optional] |
|**supportingServices** | [**List&lt;AzureSupportingService&gt;**](AzureSupportingService.md) | **Deprecated**. To manage services use [/azure/credentials/{id}/services](https://dt-url.net/1w62s27) operation. Built-in services are not supported here.  A list of Azure services to be monitored. Available services are listed by [/azure/supportedServices](https://dt-url.net/wt42sdq) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/kx2351b).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring.  |  [optional] |



