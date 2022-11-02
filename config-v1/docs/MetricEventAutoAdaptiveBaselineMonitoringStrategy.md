

# MetricEventAutoAdaptiveBaselineMonitoringStrategy

An auto-adaptive baseline strategy to detect anomalies within metrics that show a regular change over time, as the baseline is also updated automatically. An example is to detect an anomaly in the number of received network packets or within the number of user actions over time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**samples** | **Integer** | The number of one-minute samples that form the sliding evaluation window. |  |
|**violatingSamples** | **Integer** | The number of one-minute samples within the evaluation window that must violate the threshold to trigger an event. |  |
|**dealertingSamples** | **Integer** | The number of one-minute samples within the evaluation window that must go back to normal to close the event. |  |
|**alertCondition** | [**AlertConditionEnum**](#AlertConditionEnum) | The condition for the **threshold** value check: above or below. |  |
|**alertingOnMissingData** | **Boolean** | If true, also one-minute samples without data are counted as violating samples. |  [optional] |
|**numberOfSignalFluctuations** | **Double** | Defines the factor of how many signal fluctuations are valid. Values above the baseline plus the signal fluctuation times the number of tolerated signal fluctuations are alerted. |  |



## Enum: AlertConditionEnum

| Name | Value |
|---- | -----|
| ABOVE | &quot;ABOVE&quot; |
| BELOW | &quot;BELOW&quot; |



