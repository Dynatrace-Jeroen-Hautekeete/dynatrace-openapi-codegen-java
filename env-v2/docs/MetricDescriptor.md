

# MetricDescriptor

The descriptor of a metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultAggregation** | [**MetricDefaultAggregation**](MetricDefaultAggregation.md) |  |  [optional] |
|**dimensionDefinitions** | [**List&lt;MetricDimensionDefinition&gt;**](MetricDimensionDefinition.md) | The fine metric division (for example, process group and process ID for some process-related metric).   For [ingested metrics](https://dt-url.net/5d63ic1), dimensions that doesn&#39;t have have any data within the last 15 days are omitted.  |  [optional] |
|**rootCauseRelevant** | **Boolean** | The metric is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) root cause relevant.    A root-cause relevant metric represents a strong indicator for a faulty component.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**unitDisplayFormat** | [**UnitDisplayFormatEnum**](#UnitDisplayFormatEnum) | The raw value is stored in bits or bytes. The user interface can display it in these numeral systems:  Binary: 1 MiB &#x3D; 1024 KiB &#x3D; 1,048,576 bytes  Decimal: 1 MB &#x3D; 1000 kB &#x3D; 1,000,000 bytes  If not set, the decimal system is used.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**dduBillable** | **Boolean** | If &#x60;true&#x60; the usage of metric consumes [Davis data units](https://dt-url.net/ddu).    [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**lastWritten** | **Long** | The timestamp when the metric was last written.   Has the value of &#x60;null&#x60; for metric expressions or if the data has never been written. |  [optional] |
|**impactRelevant** | **Boolean** | The metric is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) impact relevant.    An impact-relevant metric is highly dependent on other metrics and changes because an underlying root-cause metric has changed.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**minimumValue** | **Double** | The minimum allowed value of the metric.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**maximumValue** | **Double** | The maximum allowed value of the metric.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**latency** | **Long** | The latency of the metric, in minutes.    The latency is the expected reporting delay (for example, caused by constraints of cloud vendors or other third-party data sources) between the observation of a metric data point and its availability in Dynatrace.   The allowed value range is from 1 to 60 minutes.   [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**resolutionInfSupported** | **Boolean** | If &#39;true&#39;, resolution&#x3D;Inf can be applied to the metric query. |  [optional] |
|**dimensionCardinalities** | [**List&lt;MetricDimensionCardinality&gt;**](MetricDimensionCardinality.md) | The cardinalities of MINT metric dimensions. |  [optional] |
|**metricValueType** | [**MetricValueType**](MetricValueType.md) |  |  [optional] |
|**tags** | **Set&lt;String&gt;** | The tags applied to the metric.    [Metric expressions](https://dt-url.net/metricExpression) don&#39;t return this field. |  [optional] |
|**entityType** | **Set&lt;String&gt;** | List of admissible primary entity types for this metric. Can be used for the &#x60;type&#x60; predicate in the &#x60;entitySelector&#x60;. |  [optional] |
|**metricId** | **String** | The fully qualified key of the metric.   If a transformation has been used it is reflected in the metric key. |  |
|**metricSelector** | **String** | The metric selector that is used when querying a func: metric. |  [optional] |
|**scalar** | **Boolean** | Indicates whether the metric expression resolves to a scalar (&#x60;true&#x60;) or to a series (&#x60;false&#x60;).  A scalar result always contains one data point. The amount of data points in a series result depends on the resolution you&#39;re using. |  [optional] |
|**aggregationTypes** | [**Set&lt;AggregationTypesEnum&gt;**](#Set&lt;AggregationTypesEnum&gt;) | The list of allowed aggregations for this metric. |  [optional] |
|**displayName** | **String** | The name of the metric in the user interface. |  [optional] |
|**description** | **String** | A short description of the metric. |  [optional] |
|**created** | **Long** | The timestamp of metric creation.   Built-in metrics and metric expressions have the value of &#x60;null&#x60;. |  [optional] |
|**transformations** | [**Set&lt;TransformationsEnum&gt;**](#Set&lt;TransformationsEnum&gt;) | Transform operators that could be appended to the current transformation list. |  [optional] |
|**unit** | **String** | The unit of the metric. |  [optional] |
|**warnings** | **List&lt;String&gt;** | A list of potential warnings that affect this ID. For example deprecated feature usage etc. |  [optional] |



## Enum: UnitDisplayFormatEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;binary&quot; |
| DECIMAL | &quot;decimal&quot; |



## Enum: Set&lt;AggregationTypesEnum&gt;

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



## Enum: Set&lt;TransformationsEnum&gt;

| Name | Value |
|---- | -----|
| ASGAUGE | &quot;asGauge&quot; |
| DEFAULT | &quot;default&quot; |
| DELTA | &quot;delta&quot; |
| EVALUATEMODEL | &quot;evaluateModel&quot; |
| FILTER | &quot;filter&quot; |
| FOLD | &quot;fold&quot; |
| LAST | &quot;last&quot; |
| LASTREAL | &quot;lastReal&quot; |
| LIMIT | &quot;limit&quot; |
| MERGE | &quot;merge&quot; |
| NAMES | &quot;names&quot; |
| PARENTS | &quot;parents&quot; |
| PARTITION | &quot;partition&quot; |
| RATE | &quot;rate&quot; |
| ROLLUP | &quot;rollup&quot; |
| SETUNIT | &quot;setUnit&quot; |
| SMOOTH | &quot;smooth&quot; |
| SORT | &quot;sort&quot; |
| SPLITBY | &quot;splitBy&quot; |
| TIMESHIFT | &quot;timeshift&quot; |
| TOUNIT | &quot;toUnit&quot; |



