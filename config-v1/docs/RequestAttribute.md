

# RequestAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the request attribute. |  [optional] |
|**name** | **String** | The name of the request attribute. |  |
|**enabled** | **Boolean** | The request attribute is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) | The data type of the request attribute. |  |
|**dataSources** | [**List&lt;DataSource&gt;**](DataSource.md) | The list of data sources. |  |
|**normalization** | [**NormalizationEnum**](#NormalizationEnum) | String values transformation.    If the **dataType** is not &#x60;string&#x60;, set the &#x60;Original&#x60; here. |  |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | Aggregation type for the request values. |  |
|**confidential** | **Boolean** | Confidential data flag. Set &#x60;true&#x60; to treat the captured data as confidential. |  |
|**skipPersonalDataMasking** | **Boolean** | Personal data masking flag. Set &#x60;true&#x60; to skip masking.    Warning: This will potentially access personalized data. |  |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| DOUBLE | &quot;DOUBLE&quot; |
| INTEGER | &quot;INTEGER&quot; |
| STRING | &quot;STRING&quot; |



## Enum: NormalizationEnum

| Name | Value |
|---- | -----|
| ORIGINAL | &quot;ORIGINAL&quot; |
| TO_LOWER_CASE | &quot;TO_LOWER_CASE&quot; |
| TO_UPPER_CASE | &quot;TO_UPPER_CASE&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| ALL_DISTINCT_VALUES | &quot;ALL_DISTINCT_VALUES&quot; |
| AVERAGE | &quot;AVERAGE&quot; |
| COUNT_DISTINCT_VALUES | &quot;COUNT_DISTINCT_VALUES&quot; |
| COUNT_VALUES | &quot;COUNT_VALUES&quot; |
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |
| MAXIMUM | &quot;MAXIMUM&quot; |
| MINIMUM | &quot;MINIMUM&quot; |
| SUM | &quot;SUM&quot; |



