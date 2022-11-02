

# RemoteConfigurationManagementEntityValidationError

Entity validation error for remote configuration management.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reasons** | [**List&lt;ReasonsEnum&gt;**](#List&lt;ReasonsEnum&gt;) | The reason of entity validation failure. |  [optional] |
|**entity** | **String** | The ID of the entity for which validation failed. |  [optional] |



## Enum: List&lt;ReasonsEnum&gt;

| Name | Value |
|---- | -----|
| CLOUD_NATIVE_NOT_SUPPORTED | &quot;CLOUD_NATIVE_NOT_SUPPORTED&quot; |
| NOT_ALLOWED_WITH_CLUSTER_ACTIVE_GATE | &quot;NOT_ALLOWED_WITH_CLUSTER_ACTIVE_GATE&quot; |
| NOT_CONNECTED | &quot;NOT_CONNECTED&quot; |
| RUNNING_IN_CONTAINER | &quot;RUNNING_IN_CONTAINER&quot; |
| STANDALONE_NOT_SUPPORTED | &quot;STANDALONE_NOT_SUPPORTED&quot; |
| VERSION_NOT_SUPPORTED | &quot;VERSION_NOT_SUPPORTED&quot; |



