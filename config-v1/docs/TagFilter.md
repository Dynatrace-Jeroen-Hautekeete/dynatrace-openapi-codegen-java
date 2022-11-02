

# TagFilter

A tag-based filter of monitored entities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**context** | [**ContextEnum**](#ContextEnum) | The origin of the tag, such as AWS or Cloud Foundry.   Custom tags use the &#x60;CONTEXTLESS&#x60; value. |  |
|**key** | **String** | The key of the tag.   Custom tags have the tag value here. |  |
|**value** | **String** | The value of the tag.    Not applicable to custom tags. |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| AWS | &quot;AWS&quot; |
| AWS_GENERIC | &quot;AWS_GENERIC&quot; |
| AZURE | &quot;AZURE&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| CONTEXTLESS | &quot;CONTEXTLESS&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| GOOGLE_CLOUD | &quot;GOOGLE_CLOUD&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |



