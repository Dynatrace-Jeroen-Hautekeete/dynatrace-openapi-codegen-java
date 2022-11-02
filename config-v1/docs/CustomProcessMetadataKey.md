

# CustomProcessMetadataKey

The key of the attribute, which need dynamic keys.   Not applicable otherwise, as the attibute itself acts as a key.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) | The source of the custom metadata. |  |
|**key** | **String** | The actual key of the custom metadata. |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| GOOGLE_CLOUD | &quot;GOOGLE_CLOUD&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| PLUGIN | &quot;PLUGIN&quot; |



