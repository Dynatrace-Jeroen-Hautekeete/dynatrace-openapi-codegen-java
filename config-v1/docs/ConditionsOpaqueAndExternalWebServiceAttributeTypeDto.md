

# ConditionsOpaqueAndExternalWebServiceAttributeTypeDto

A condition of the service detection rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeType** | [**AttributeTypeEnum**](#AttributeTypeEnum) | The type of the attribute to be checked. |  |
|**compareOperations** | [**List&lt;CompareOperation&gt;**](CompareOperation.md) | A list of conditions for the rule.   If several conditions are specified, the AND logic applies. |  [optional] |



## Enum: AttributeTypeEnum

| Name | Value |
|---- | -----|
| ENDPOINT | &quot;ENDPOINT&quot; |
| IP | &quot;IP&quot; |
| OPERATION_NAME | &quot;OPERATION_NAME&quot; |
| PG_TAG | &quot;PG_TAG&quot; |
| URL_PATH | &quot;URL_PATH&quot; |
| URL_PORT | &quot;URL_PORT&quot; |



