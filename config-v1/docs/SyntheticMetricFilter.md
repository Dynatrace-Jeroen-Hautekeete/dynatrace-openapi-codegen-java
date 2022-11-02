

# SyntheticMetricFilter

Filter of the calculated synthetic metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Only user actions of the specified type are included in the metric calculation. |  [optional] |
|**hasError** | **Boolean** | The execution status of the monitors to be included in the metric calculation:   * &#x60;true&#x60;: Only failed executions are included.    * &#x60;false&#x60;: All executions are included. |  [optional] |
|**errorCode** | **Integer** | Only executions finished with the specified error code are included in the metric calculation. |  [optional] |
|**event** | **String** | Only the specified browser clickpath event is included in the metric calculation.    Specify the Dynatrace entity ID of the event here. You can fetch the list of clickpath events of the monitor with the [GET a synthetic monitor](https://dt-url.net/4oe3kka) request from the Environment API |  [optional] |
|**location** | **String** | Only executions from the specified location are included in the metric calculation.    Specify the Dynatrace entity ID of the location here. You can fetch the list of locations the monitor is running from with the [GET a synthetic monitor](https://dt-url.net/4oe3kka) request from the Environment API. |  [optional] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;Custom&quot; |
| LOAD | &quot;Load&quot; |
| XHR | &quot;Xhr&quot; |



