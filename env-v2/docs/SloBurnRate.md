

# SloBurnRate

Error budget burn rate evaluation of a service-level objective (SLO).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sloValue** | **Double** | The calculated value of the SLO for the timeframe chosen for the burn rate calculation. |  [optional] |
|**estimatedTimeToConsumeErrorBudget** | **Double** | The estimated time left to consume the error budget in hours. |  [optional] |
|**burnRateVisualizationEnabled** | **Boolean** | The error budget burn rate visualization is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).   In case of &#x60;false&#x60;, no calculated values will be present here. |  [optional] |
|**fastBurnThreshold** | **Double** | The threshold between a slow and a fast burn rate. |  [optional] |
|**burnRateType** | [**BurnRateTypeEnum**](#BurnRateTypeEnum) | The calculated burn rate type.   Has a value of &#39;FAST&#39;, &#39;SLOW&#39; or &#39;NONE&#39;. |  [optional] |
|**burnRateValue** | **Double** | The burn rate of the SLO, calculated for the last hour. |  [optional] |



## Enum: BurnRateTypeEnum

| Name | Value |
|---- | -----|
| FAST | &quot;FAST&quot; |
| NONE | &quot;NONE&quot; |
| SLOW | &quot;SLOW&quot; |



