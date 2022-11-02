

# SyntheticOnDemandExecutionRequest

Contains parameters for the on-demand execution of monitors identified by tags, applications, or services.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**processingMode** | [**ProcessingModeEnum**](#ProcessingModeEnum) | The execution&#39;s processing mode |  [optional] |
|**failOnPerformanceIssue** | **Boolean** | If true, the status will be FAILED in case of performance issue. |  [optional] |
|**stopOnProblem** | **Boolean** | If true, no executions will be scheduled if a problem occurs. |  [optional] |
|**monitors** | [**List&lt;SyntheticOnDemandExecutionRequestMonitor&gt;**](SyntheticOnDemandExecutionRequestMonitor.md) | List of monitors to be triggered. |  [optional] |
|**group** | [**SyntheticOnDemandExecutionRequestGroup**](SyntheticOnDemandExecutionRequestGroup.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | String to string map of metadata properties for execution |  [optional] |



## Enum: ProcessingModeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| DISABLE_PROBLEM_DETECTION | &quot;DISABLE_PROBLEM_DETECTION&quot; |
| EXECUTIONS_DETAILS_ONLY | &quot;EXECUTIONS_DETAILS_ONLY&quot; |



