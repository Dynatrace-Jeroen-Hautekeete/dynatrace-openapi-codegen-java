

# ExtensionConfigurationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionId** | **String** | The ID of the extension. |  [optional] |
|**enabled** | **Boolean** | The extension is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**useGlobal** | **Boolean** | Allows to skip current configuration and use global one. |  |
|**properties** | **Map&lt;String, String&gt;** | The list of extension parameters.    Each parameter is a key-value pair. |  [optional] |
|**hostId** | **String** | The ID of the host on which the extension runs. |  [optional] |
|**activeGate** | [**EntityShortRepresentation**](EntityShortRepresentation.md) |  |  [optional] |
|**endpointId** | **String** | The ID of the endpoint. |  [optional] |
|**endpointName** | **String** | The name of the endpoint, displayed in Dynatrace. |  [optional] |



