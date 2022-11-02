

# SLO

Parameters of a service-level objective (SLO).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**problemFilters** | **Set&lt;String&gt;** | The entity filter for fetching the number of problems related to an SLO. Auto-generated in case no filter has been added to the SLO. |  [optional] |
|**metricExpression** | **String** | The percentage-based metric expression for the calculation of the SLO. |  [optional] |
|**useRateMetric** | **Boolean** | The type of the metric to use for SLO calculation:   * &#x60;true&#x60;: An existing percentage-based metric.  * &#x60;false&#x60;: A ratio of two metrics.   For a list of available metrics, see [Built-in metric page](https://dt-url.net/be03kow) or try the [GET metrics](https://dt-url.net/8e43kxf) API call. |  [optional] |
|**metricRate** | **String** | The percentage-based metric for the calculation of the SLO.   Required when the **useRateMetric** is set to &#x60;true&#x60;. |  [optional] |
|**metricNumerator** | **String** | The metric for the count of successes (the numerator in rate calculation).   Required when the **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |
|**metricDenominator** | **String** | The total count metric (the denominator in rate calculation).   Required when the **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |
|**evaluationType** | [**EvaluationTypeEnum**](#EvaluationTypeEnum) | The evaluation type of the SLO. |  [optional] |
|**errorBudgetBurnRate** | [**SloBurnRate**](SloBurnRate.md) |  |  [optional] |
|**burnRateMetricKey** | **String** | The error budget burn rate key for a metric expression. |  [optional] |
|**errorBudgetMetricKey** | **String** | The error budget key for a metric expression. |  [optional] |
|**normalizedErrorBudgetMetricKey** | **String** | The normalized error budget key for a metric expression. |  [optional] |
|**numeratorValue** | **Double** | The numerator value used to evaluate the SLO when **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |
|**denominatorValue** | **Double** | The denominator value used to evaluate the SLO when **useRateMetric** is set to &#x60;false&#x60;. |  [optional] |
|**relatedOpenProblems** | **Integer** | Number of OPEN problems related to the SLO.   Has the value of &#x60;-1&#x60; if there&#39;s an error with fetching SLO related problems. |  [optional] |
|**relatedTotalProblems** | **Integer** | Total number of problems related to the SLO.   Has the value of &#x60;-1&#x60; if there&#39;s an error with fetching SLO related problems. |  [optional] |
|**errorBudget** | **Double** | The error budget of the calculated SLO.   The error budget is the difference between the calculated and target values. A positive number means all is good; a negative number means trouble. |  [optional] |
|**evaluatedPercentage** | **Double** | The calculated value of the SLO. Has the value of the evaluated SLO or the value of &#x60;-1&#x60;:   * If there is an error with the SLO calculation; in that case check the value of the **error** property.  * If the evaluate parameter has not been set to &#x60;true&#x60;; in that case the **error** property will contain no error. |  [optional] |
|**timeframe** | **String** | The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector. |  [optional] |
|**metricKey** | **String** | The key for a metric expression. Once created, metric keys can&#39;t be changed |  [optional] |
|**filter** | **String** | The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector). |  [optional] |
|**name** | **String** | The name of the SLO. |  [optional] |
|**id** | **UUID** | The ID of the SLO |  [optional] |
|**target** | **Double** | The target value of the SLO. |  [optional] |
|**description** | **String** | A short description of the SLO. |  [optional] |
|**enabled** | **Boolean** | The SLO is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the calculated SLO. |  [optional] |
|**error** | **String** | The error of the SLO calculation.   If the value differs from &#x60;NONE&#x60; there&#39;s something wrong with the SLO calculation. |  [optional] |
|**warning** | **Double** | The warning value of the SLO.    At warning state the SLO is still fulfilled but is getting close to failure. |  [optional] |



## Enum: EvaluationTypeEnum

| Name | Value |
|---- | -----|
| AGGREGATE | &quot;AGGREGATE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FAILURE | &quot;FAILURE&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| WARNING | &quot;WARNING&quot; |



