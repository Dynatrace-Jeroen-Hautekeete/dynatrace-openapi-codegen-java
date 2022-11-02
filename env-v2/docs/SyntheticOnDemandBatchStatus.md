

# SyntheticOnDemandBatchStatus

Contains information about on-demand executions triggered within the batch.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **Long** | The identifier of the batch. |  |
|**userId** | **String** | The name of the user who triggered execution of the batch. |  |
|**batchStatus** | [**BatchStatusEnum**](#BatchStatusEnum) | The status of the batch. |  |
|**triggeredCount** | **Integer** | The number of triggered executions within the batch. |  |
|**executedCount** | **Integer** | The number of triggered executions with the result SUCCESS or FAILED. |  |
|**failedCount** | **Integer** | The number of triggered executions with the result FAILED. |  |
|**failedExecutions** | [**List&lt;SyntheticOnDemandFailedExecutionStatus&gt;**](SyntheticOnDemandFailedExecutionStatus.md) |  |  [optional] |
|**failedToExecuteCount** | **Integer** | The number of executions that were triggered and timed out because of a problem with the Synthetic engine. |  |
|**failedToExecute** | [**List&lt;SyntheticOnDemandFailedExecutionStatus&gt;**](SyntheticOnDemandFailedExecutionStatus.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | String to string map of metadata properties for batch |  [optional] |
|**triggeringProblemsCount** | **Integer** | The number of executions that were not triggered due to some problems. |  [optional] |
|**triggeringProblems** | [**List&lt;SyntheticOnDemandTriggeringProblemDetails&gt;**](SyntheticOnDemandTriggeringProblemDetails.md) |  |  [optional] |



## Enum: BatchStatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;FAILED&quot; |
| FAILED_TO_EXECUTE | &quot;FAILED_TO_EXECUTE&quot; |
| NOT_TRIGGERED | &quot;NOT_TRIGGERED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| SUCCESS | &quot;SUCCESS&quot; |



