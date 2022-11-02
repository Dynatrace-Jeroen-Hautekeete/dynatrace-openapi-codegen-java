

# ConditionsFullWebServiceAttributeTypeDto

A condition of the service detection rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeType** | [**AttributeTypeEnum**](#AttributeTypeEnum) | The type of the attribute to be checked. |  |
|**compareOperations** | [**List&lt;CompareOperation&gt;**](CompareOperation.md) | A list of conditions for the rule.   If several conditions are specified, the AND logic applies. |  [optional] |



## Enum: AttributeTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_ID | &quot;APPLICATION_ID&quot; |
| CONTEXT_ROOT | &quot;CONTEXT_ROOT&quot; |
| FRAMEWORK | &quot;FRAMEWORK&quot; |
| IS_SOAP_SERVICE | &quot;IS_SOAP_SERVICE&quot; |
| PG_TAG | &quot;PG_TAG&quot; |
| SERVER_NAME | &quot;SERVER_NAME&quot; |
| URL_HOST_NAME | &quot;URL_HOST_NAME&quot; |
| URL_PATH | &quot;URL_PATH&quot; |
| WEBSERVICE_METHOD | &quot;WEBSERVICE_METHOD&quot; |
| WEBSERVICE_NAME | &quot;WEBSERVICE_NAME&quot; |
| WEBSERVICE_NAMESPACE | &quot;WEBSERVICE_NAMESPACE&quot; |



