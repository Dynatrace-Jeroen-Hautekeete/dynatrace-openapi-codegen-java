

# ExtractSubstring

Preprocess by extracting a substring from the original value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | [**PositionEnum**](#PositionEnum) | The position of the extracted string relative to delimiters. |  |
|**delimiter** | **String** | The delimiter string. |  |
|**endDelimiter** | **String** | The end-delimiter string.    Required if the **position** value is &#x60;BETWEEN&#x60;. Otherwise not allowed. |  [optional] |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| AFTER | &quot;AFTER&quot; |
| BEFORE | &quot;BEFORE&quot; |
| BETWEEN | &quot;BETWEEN&quot; |



