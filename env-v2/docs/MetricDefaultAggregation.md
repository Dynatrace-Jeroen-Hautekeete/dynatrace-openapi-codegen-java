

# MetricDefaultAggregation

The default aggregation of a metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of default aggregation. |  [optional] |
|**parameter** | **Double** | The percentile to be delivered. Valid values are between &#x60;0&#x60; and &#x60;100&#x60;.   Applicable only to the &#x60;percentile&#x60; aggregation type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| AVG | &quot;avg&quot; |
| COUNT | &quot;count&quot; |
| MAX | &quot;max&quot; |
| MEDIAN | &quot;median&quot; |
| MIN | &quot;min&quot; |
| PERCENTILE | &quot;percentile&quot; |
| SUM | &quot;sum&quot; |
| VALUE | &quot;value&quot; |



