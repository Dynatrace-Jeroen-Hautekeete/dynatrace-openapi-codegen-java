

# FullWebRequestRule

The service detection rule of the `FULL_WEB_REQUEST` type.

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
|**conditions** | [**List&lt;ConditionsFullWebRequestAttributeTypeDto&gt;**](ConditionsFullWebRequestAttributeTypeDto.md) | A list of conditions of the rule.   If several conditions are specified, the AND logic applies. |  [optional] |
|**applicationId** | [**ApplicationId**](ApplicationId.md) |  |  [optional] |
|**contextRoot** | [**ContextRoot**](ContextRoot.md) |  |  [optional] |
|**serverName** | [**ServerName**](ServerName.md) |  |  [optional] |



