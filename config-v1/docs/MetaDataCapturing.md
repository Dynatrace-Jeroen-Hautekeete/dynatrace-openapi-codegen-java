

# MetaDataCapturing

Configuration to capture meta data with the JavaScript agent.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the meta data to capture. |  |
|**capturingName** | **String** | The name of the meta data to capture. |  |
|**name** | **String** | Name for displaying the captured values in Dynatrace. |  |
|**uniqueId** | **Integer** | The unique id of the meta data to capture. |  [optional] |
|**publicMetadata** | **Boolean** | True if this metadata should be captured regardless of the privacy settings |  [optional] |
|**useLastValue** | **Boolean** | True if the last captured value should be used for this metadata. By default the first value will be used. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COOKIE | &quot;COOKIE&quot; |
| CSS_SELECTOR | &quot;CSS_SELECTOR&quot; |
| JAVA_SCRIPT_FUNCTION | &quot;JAVA_SCRIPT_FUNCTION&quot; |
| JAVA_SCRIPT_VARIABLE | &quot;JAVA_SCRIPT_VARIABLE&quot; |
| META_TAG | &quot;META_TAG&quot; |
| QUERY_STRING | &quot;QUERY_STRING&quot; |
| RESPONSE_HEADER | &quot;RESPONSE_HEADER&quot; |



