

# SyntheticOnDemandExecution

Describes the status of an on-demand execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | The identifier of the batch. |  |
|**executionId** | **String** | The identifier of the execution. |  |
|**executionStage** | [**ExecutionStageEnum**](#ExecutionStageEnum) | Execution stage. |  |
|**schedulingTimestamp** | **Long** | The scheduling timestamp, in UTC milliseconds. |  |
|**executionTimestamp** | **Long** | The timestamp when execution was finished, in UTC milliseconds. |  |
|**dataDeliveryTimestamp** | **Long** | The timestamp when whole data set has been collected on server, in UTC milliseconds. |  |
|**monitorId** | **String** | The identifier of the monitor. |  |
|**locationId** | **String** | The identifier of the location from where the monitor is to be executed. |  |
|**userId** | **String** | The name of the user who triggered the on-demand execution. |  |
|**metadata** | **Map&lt;String, String&gt;** | Metadata map for the execution batch. |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | The source of the triggering request. |  |
|**simpleResults** | [**ExecutionSimpleResults**](ExecutionSimpleResults.md) |  |  [optional] |
|**fullResults** | [**ExecutionFullResults**](ExecutionFullResults.md) |  |  [optional] |



## Enum: ExecutionStageEnum

| Name | Value |
|---- | -----|
| DATA_RETRIEVED | &quot;DATA_RETRIEVED&quot; |
| EXECUTED | &quot;EXECUTED&quot; |
| NOT_TRIGGERED | &quot;NOT_TRIGGERED&quot; |
| TIMED_OUT | &quot;TIMED_OUT&quot; |
| TRIGGERED | &quot;TRIGGERED&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| UI | &quot;UI&quot; |



