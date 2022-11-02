

# ThresholdRegistrationMessage

Parameters of a single plugin or custom event threshold.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thresholdId** | **String** | The ID of the threshold. |  [optional] |
|**timeseriesId** | **String** | The case-sensitive ID of the metric evaluated by threshold.    You can find metric IDs, by performing the GET request to the &#x60;timeseries&#x60; endpoint of the API. |  [optional] |
|**threshold** | **Double** | The value of the threshold. |  [optional] |
|**alertCondition** | [**AlertConditionEnum**](#AlertConditionEnum) | The condition for the threshold value check: above or below. |  [optional] |
|**samples** | **Integer** | The number of one-minute samples to form the sliding evaluation window. |  [optional] |
|**violatingSamples** | **Integer** | How many one-minute samples within the evaluation window should violate the threshold to trigger an event. |  [optional] |
|**dealertingSamples** | **Integer** | How many one-minute samples within the evaluation window should go back to normal to close the event. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event to trigger on the threshold violation. |  [optional] |
|**eventName** | **String** | The name of the event, displayed in the UI. |  [optional] |
|**description** | **String** | A description of the event, triggered by a threshold violation.    You can use the following placeholders:  {severity}: the actual metric value,  {alert_condition}: above or below threshold condition,  {threshold}: the threshold value,{violating_samples}: the number of samples, violating the threshold,  {dimensions}: metric&#39;s dimension that violated the threshold. |  [optional] |
|**enabled** | **Boolean** | The threshold is enabled/disabled. |  [optional] |



## Enum: AlertConditionEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| AVAILABILITY_EVENT | &quot;AVAILABILITY_EVENT&quot; |
| ERROR_EVENT | &quot;ERROR_EVENT&quot; |
| PERFORMANCE_EVENT | &quot;PERFORMANCE_EVENT&quot; |



