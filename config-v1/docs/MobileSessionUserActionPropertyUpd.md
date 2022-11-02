

# MobileSessionUserActionPropertyUpd

An update of a mobile session or user action property.

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
|**name** | **String** | The name of the reported value.   Only applicable when the **origin** is set to &#x60;API&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOUBLE | &quot;DOUBLE&quot; |
| LONG | &quot;LONG&quot; |
| STRING | &quot;STRING&quot; |



## Enum: OriginEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| SERVER_SIDE_REQUEST_ATTRIBUTE | &quot;SERVER_SIDE_REQUEST_ATTRIBUTE&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| AVERAGE | &quot;AVERAGE&quot; |
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |
| MAX | &quot;MAX&quot; |
| MIN | &quot;MIN&quot; |
| SUM | &quot;SUM&quot; |



