

# MetricEventMonitoringStrategy

A monitoring strategy for a metric event config.  This is the base version of the monitoring strategy, depending on the type,  the actual JSON may contain additional fields.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STATIC_THRESHOLD&#x60; -&gt; MetricEventStaticThresholdMonitoringStrategy  * &#x60;AUTO_ADAPTIVE_BASELINE&#x60; -&gt; MetricEventAutoAdaptiveBaselineMonitoringStrategy   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_ADAPTIVE_BASELINE | &quot;AUTO_ADAPTIVE_BASELINE&quot; |
| STATIC_THRESHOLD | &quot;STATIC_THRESHOLD&quot; |



