

# SloConfigItemDtoImpl


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The SLO is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**name** | **String** | The name of the SLO. |  [optional] |
|**description** | **String** | The description of the SLO (optional). |  [optional] |
|**metricName** | **String** | The name for a metric expression |  [optional] |
|**metricExpression** | **String** | The percentage-based metric expression for the calculation of the SLO. |  [optional] |
|**evaluationType** | [**EvaluationTypeEnum**](#EvaluationTypeEnum) | The evaluation type of the SLO. |  [optional] |
|**filter** | **String** | The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector). |  [optional] |
|**target** | **Double** | The target value of the SLO. |  [optional] |
|**warning** | **Double** | The warning value of the SLO.    At warning state the SLO is still fulfilled but is getting close to failure. |  [optional] |
|**errorBudgetBurnRate** | [**SloBurnRateConfig**](SloBurnRateConfig.md) |  |  [optional] |
|**timeframe** | **String** | The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector. |  [optional] |
|**useRateMetric** | **Boolean** | The type of the metric to use for SLO calculation:   * &#x60;true&#x60;: An existing percentage-based metric.  * &#x60;false&#x60;: A ratio of two metrics.   For a list of available metrics, see [Built-in metric page](https://dt-url.net/be03kow) or try the [GET metrics](https://dt-url.net/8e43kxf) API call. |  [optional] |
|**metricRate** | **String** | The percentage-based metric for the calculation of the SLO.   Required when the **useRateMetric** is set to &#x60;true&#x60;. |  [optional] |
|**metricNumerator** | **String** | The metric for the count of successes (the numerator in rate calculation).   Required when the **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |
|**metricDenominator** | **String** | The total count metric (the denominator in rate calculation).   Required when the **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |



## Enum: EvaluationTypeEnum

| Name | Value |
|---- | -----|
| AGGREGATE | &quot;AGGREGATE&quot; |



