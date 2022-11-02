

# RemoteConfigurationManagementJob

Remote configuration management job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeoutTime** | **String** | Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the running remote configuration management job will time-out. This field is present only for running jobs. |  [optional] |
|**processedEntitiesCount** | **Integer** | Number of entities that were already processed at the time the response was created. |  [optional] |
|**totalEntitiesCount** | **Integer** | Total number of entities to process. |  [optional] |
|**operations** | [**List&lt;RemoteConfigurationManagementOperation&gt;**](RemoteConfigurationManagementOperation.md) | A list of executed remote configuration management jobs. |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of entities modified by remote configuration management. |  [optional] |
|**id** | **String** | The ID of the remote configuration management job. |  [optional] |
|**startTime** | **String** | Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was started. |  [optional] |
|**endTime** | **String** | Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was finished. This field is present only for finished jobs. |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| ACTIVE_GATE | &quot;ACTIVE_GATE&quot; |
| ONE_AGENT | &quot;ONE_AGENT&quot; |



