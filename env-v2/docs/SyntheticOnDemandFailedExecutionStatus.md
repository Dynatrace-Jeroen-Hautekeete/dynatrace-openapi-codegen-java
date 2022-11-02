

# SyntheticOnDemandFailedExecutionStatus

Contains information about on-demand executions that failed or failed to be executed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionId** | **String** | The identifier of the execution. |  |
|**executionStage** | [**ExecutionStageEnum**](#ExecutionStageEnum) | Execution stage. |  [optional] |
|**failureMessage** | **String** | Failure message. |  [optional] |
|**errorCode** | **String** | Error code. |  |
|**executionTimestamp** | **Long** | The timestamp when execution was finished, in UTC milliseconds. |  [optional] |
|**monitorId** | **String** | The identifier of the monitor. |  |
|**locationId** | **String** | The identifier of the location from where the monitor is to be executed. |  |



## Enum: ExecutionStageEnum

| Name | Value |
|---- | -----|
| DATA_RETRIEVED | &quot;DATA_RETRIEVED&quot; |
| EXECUTED | &quot;EXECUTED&quot; |
| NOT_TRIGGERED | &quot;NOT_TRIGGERED&quot; |
| TIMED_OUT | &quot;TIMED_OUT&quot; |
| TRIGGERED | &quot;TRIGGERED&quot; |



