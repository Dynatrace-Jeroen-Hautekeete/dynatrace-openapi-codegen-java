

# RemoteConfigurationManagementJobSummary

Remote configuration management job with basic data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of entities modified by remote configuration management. |  [optional] |
|**id** | **String** | The ID of the remote configuration management job. |  [optional] |
|**startTime** | **String** | Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was started. |  [optional] |
|**endTime** | **String** | Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was finished. This field is present only for finished jobs. |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| ACTIVE_GATE | &quot;ACTIVE_GATE&quot; |
| ONE_AGENT | &quot;ONE_AGENT&quot; |



