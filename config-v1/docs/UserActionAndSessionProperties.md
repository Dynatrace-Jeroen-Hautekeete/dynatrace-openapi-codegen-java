

# UserActionAndSessionProperties

Defines userAction and session custom defined properties settings of an application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The display name of the property. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The data type of the property. |  |
|**origin** | [**OriginEnum**](#OriginEnum) | The origin of the property |  |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | The aggregation type of the property.     It defines how multiple values of the property are aggregated. |  [optional] |
|**storeAsUserActionProperty** | **Boolean** | If &#x60;true&#x60;, the property is stored as a user action property |  [optional] |
|**storeAsSessionProperty** | **Boolean** | If &#x60;true&#x60;, the property is stored as a session property |  [optional] |
|**cleanupRule** | **String** | The cleanup rule of the property.   Defines how to extract the data you need from a string value. Specify the [regular expression](https://dt-url.net/k9e0iaq) for the data you need there. |  [optional] |
|**serverSideRequestAttribute** | **String** | The ID of the request attribute.   Only applicable when the **origin** is set to &#x60;SERVER_SIDE_REQUEST_ATTRIBUTE&#x60;. |  [optional] |
|**uniqueId** | **Integer** | Unique id among all userTags and properties of this application |  |
|**key** | **String** | Key of the property |  |
|**metadataId** | **Integer** | If the origin is META_DATA, metaData id of the property |  [optional] |
|**ignoreCase** | **Boolean** | If true, the value of this property will always be stored in lower case. Defaults to false. |  [optional] |
|**longStringLength** | **Integer** | If the type is LONG_STRING, the max length for this property. Must be a multiple of 100. Defaults to 200. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATE | &quot;DATE&quot; |
| DOUBLE | &quot;DOUBLE&quot; |
| LONG | &quot;LONG&quot; |
| LONG_STRING | &quot;LONG_STRING&quot; |
| STRING | &quot;STRING&quot; |



## Enum: OriginEnum

| Name | Value |
|---- | -----|
| JAVASCRIPT_API | &quot;JAVASCRIPT_API&quot; |
| META_DATA | &quot;META_DATA&quot; |
| SERVER_SIDE_REQUEST_ATTRIBUTE | &quot;SERVER_SIDE_REQUEST_ATTRIBUTE&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| AVERAGE | &quot;AVERAGE&quot; |
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |
| MAXIMUM | &quot;MAXIMUM&quot; |
| MINIMUM | &quot;MINIMUM&quot; |
| SUM | &quot;SUM&quot; |



