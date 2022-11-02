

# OpaqueAndExternalWebServiceRule

The service detection rule of the `OPAQUE_AND_EXTERNAL_WEB_SERVICE` type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of the service detection rule. |  |
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**managementZones** | **List&lt;String&gt;** | The management zone (specified by the ID) of the process group for which this service detection rule should be created.    You can specify only 1 management zone here. |  [optional] |
|**id** | **UUID** | The ID of the service detection rule. |  [optional] |
|**order** | **String** | The order of the rule in the rules list.    The rules are evaluated from top to bottom. The first matching rule applies. |  [optional] |
|**name** | **String** | The name of the rule. |  |
|**description** | **String** | A short description of the rule. |  [optional] |
|**enabled** | **Boolean** | The rule is enabled(&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**conditions** | [**List&lt;ConditionsOpaqueAndExternalWebServiceAttributeTypeDto&gt;**](ConditionsOpaqueAndExternalWebServiceAttributeTypeDto.md) | A list of conditions of the rule.   If several conditions are specified, the AND logic applies. |  [optional] |
|**detectAsWebRequestService** | **Boolean** | Detect the matching requests as web services (&#x60;false&#x60;) or web request services (&#x60;true&#x60;).   Setting this field to &#x60;true&#x60; prevents detecting of matching requests as opaque web services. An opaque web request service is created instead. If you need to further modify the resulting web request service, you need to create a separate rule of the &#x60;OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; type.   Default is &#x60;false&#x60;, detecting matching requests as opaque web services. |  [optional] |
|**urlPath** | [**UrlPath**](UrlPath.md) |  |  [optional] |
|**port** | [**Port**](Port.md) |  |  [optional] |



