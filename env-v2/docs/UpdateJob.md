

# UpdateJob

Configuration of the ActiveGate update job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agType** | [**AgTypeEnum**](#AgTypeEnum) | The type of the ActiveGate. |  [optional] [readonly] |
|**jobState** | [**JobStateEnum**](#JobStateEnum) | The status of the update job. |  [optional] [readonly] |
|**updateMethod** | [**UpdateMethodEnum**](#UpdateMethodEnum) | The method of updating the ActiveGate or its component. |  [optional] [readonly] |
|**updateType** | [**UpdateTypeEnum**](#UpdateTypeEnum) | The component to be updated. |  [optional] [readonly] |
|**startVersion** | **String** | The initial version of the ActiveGate. |  [optional] [readonly] |
|**environments** | **List&lt;String&gt;** | A list of environments (specified by IDs) the ActiveGate can connect to. |  [optional] [readonly] |
|**jobId** | **String** | The ID of the update job. |  [optional] [readonly] |
|**cancelable** | **Boolean** | The job can (&#x60;true&#x60;) or can&#39;t (&#x60;false&#x60;) be cancelled at the moment. |  [optional] [readonly] |
|**timestamp** | **Long** | The timestamp of the update job completion.    The &#x60;null&#x60; value means the job is still running. |  [optional] [readonly] |
|**duration** | **Long** | The duration of the update, in milliseconds. |  [optional] [readonly] |
|**error** | **String** | The information about update error. |  [optional] [readonly] |
|**targetVersion** | **String** | The target version of the update.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;.&lt;timestamp&gt;&#x60; format.   To update to the latest available version, use the &#x60;latest&#x60; value. |  |



## Enum: AgTypeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| ENVIRONMENT_MULTI | &quot;ENVIRONMENT_MULTI&quot; |



## Enum: JobStateEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| PENDING | &quot;PENDING&quot; |
| ROLLBACK | &quot;ROLLBACK&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| SUCCEED | &quot;SUCCEED&quot; |



## Enum: UpdateMethodEnum

| Name | Value |
|---- | -----|
| AUTOMATIC | &quot;AUTOMATIC&quot; |
| MANUAL_INSTALLATION | &quot;MANUAL_INSTALLATION&quot; |
| ON_DEMAND | &quot;ON_DEMAND&quot; |



## Enum: UpdateTypeEnum

| Name | Value |
|---- | -----|
| ACTIVE_GATE | &quot;ACTIVE_GATE&quot; |
| REMOTE_PLUGIN_AGENT | &quot;REMOTE_PLUGIN_AGENT&quot; |
| SYNTHETIC | &quot;SYNTHETIC&quot; |
| Z_REMOTE | &quot;Z_REMOTE&quot; |



