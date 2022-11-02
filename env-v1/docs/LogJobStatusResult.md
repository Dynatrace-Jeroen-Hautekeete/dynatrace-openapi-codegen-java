

# LogJobStatusResult

The status the log analysis job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logAnalysisStatus** | [**LogAnalysisStatusEnum**](#LogAnalysisStatusEnum) | The status of the log analysis job. |  [optional] |
|**statusChangeTimestamp** | **Long** | The timestamp of the last status change, in UTC milliseconds. |  [optional] |
|**logHandlingError** | [**LogHandlingErrorEnum**](#LogHandlingErrorEnum) | The cause of the job failure.    A successful job has the &#x60;NONE&#x60; value. |  [optional] |
|**recordsTotal** | **Integer** | The number of analyzed log entries. |  [optional] |
|**sortableFields** | **List&lt;String&gt;** | The map of the log entry sortable fields. |  [optional] |
|**filterableFields** | **List&lt;String&gt;** | The map of the log entry filterable fields. |  [optional] |



## Enum: LogAnalysisStatusEnum

| Name | Value |
|---- | -----|
| AGENT_PROCESSING | &quot;AGENT_PROCESSING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| CANCEL_PENDING | &quot;CANCEL_PENDING&quot; |
| DOWNLOAD | &quot;DOWNLOAD&quot; |
| FAILED | &quot;FAILED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| READY | &quot;READY&quot; |
| TRANSFERRING | &quot;TRANSFERRING&quot; |
| WAITING | &quot;WAITING&quot; |



## Enum: LogHandlingErrorEnum

| Name | Value |
|---- | -----|
| AGENT_VERSION_NOT_SUPPORTING_DOCKER | &quot;AGENT_VERSION_NOT_SUPPORTING_DOCKER&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| FILE_ACCESS_DISABLED | &quot;FILE_ACCESS_DISABLED&quot; |
| FILE_NOT_FOUND | &quot;FILE_NOT_FOUND&quot; |
| INCORRECT_DATE_FORMAT | &quot;INCORRECT_DATE_FORMAT&quot; |
| INCORRECT_LOG_FILE | &quot;INCORRECT_LOG_FILE&quot; |
| INTERNAL_PROCESSING_ERROR | &quot;INTERNAL_PROCESSING_ERROR&quot; |
| INVALID_FILTER_QUERY | &quot;INVALID_FILTER_QUERY&quot; |
| INVALID_SEARCH_QUERY | &quot;INVALID_SEARCH_QUERY&quot; |
| NONE | &quot;NONE&quot; |
| NO_LOG_AGENT | &quot;NO_LOG_AGENT&quot; |
| PROCESSOR_FILE_PROCESSING_ERROR | &quot;PROCESSOR_FILE_PROCESSING_ERROR&quot; |
| PROCESSOR_INTERNAL_ERROR | &quot;PROCESSOR_INTERNAL_ERROR&quot; |
| PROCESSOR_INVALID_PARAMETER_ERROR | &quot;PROCESSOR_INVALID_PARAMETER_ERROR&quot; |
| PROCESSOR_NO_LOGS_FILE_FOUND_ERROR | &quot;PROCESSOR_NO_LOGS_FILE_FOUND_ERROR&quot; |
| PROCESSOR_STOPPING_INTERRUPTED | &quot;PROCESSOR_STOPPING_INTERRUPTED&quot; |
| PROCESSOR_TIMED_OUT | &quot;PROCESSOR_TIMED_OUT&quot; |
| PROCESSOR_UNHANDLED_EXCEPTION | &quot;PROCESSOR_UNHANDLED_EXCEPTION&quot; |
| PROCESSOR_UNZIPPING_ERROR | &quot;PROCESSOR_UNZIPPING_ERROR&quot; |
| REPACK_FAILED_TO_SAVE_LOG_ANALYSIS_IN_STORAGE | &quot;REPACK_FAILED_TO_SAVE_LOG_ANALYSIS_IN_STORAGE&quot; |
| REPACK_FAILED_TO_STORE_ALL_LOG_ANALYSIS | &quot;REPACK_FAILED_TO_STORE_ALL_LOG_ANALYSIS&quot; |
| REPACK_FAILED_TO_STORE_LOG_ANALYSIS | &quot;REPACK_FAILED_TO_STORE_LOG_ANALYSIS&quot; |
| SOME_LOG_INCORRECT_DATE_FORMAT | &quot;SOME_LOG_INCORRECT_DATE_FORMAT&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |



