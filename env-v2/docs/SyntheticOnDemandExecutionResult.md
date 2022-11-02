

# SyntheticOnDemandExecutionResult

The result of on-demand synthetic monitor execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchId** | **String** | The batch identifier of the triggered executions. |  |
|**triggeringProblemsCount** | **Integer** | The total number of problems within the batch. |  |
|**triggeringProblemsDetails** | [**List&lt;SyntheticOnDemandTriggeringProblemDetails&gt;**](SyntheticOnDemandTriggeringProblemDetails.md) | List with the entities for which triggering problems occurred. |  [optional] |
|**triggeredCount** | **Integer** | The total number of the triggered executions within the batch. |  |
|**triggered** | [**List&lt;SyntheticOnDemandTriggeredMonitor&gt;**](SyntheticOnDemandTriggeredMonitor.md) | Monitors for which on-demand executions were triggered. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | String to string map of metadata properties for execution |  [optional] |



