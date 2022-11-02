

# TagWithSourceInfo

Tag with source of a Dynatrace entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) | The source of the tag, such as USER, RULE_BASED or AUTO |  [optional] |
|**context** | [**ContextEnum**](#ContextEnum) | The origin of the tag, such as AWS or Cloud Foundry.    Custom tags use the &#x60;CONTEXTLESS&#x60; value. |  |
|**key** | **String** | The key of the tag.    Custom tags have the tag value here. |  |
|**value** | **String** | The value of the tag.    Not applicable to custom tags. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| RULE_BASED | &quot;RULE_BASED&quot; |
| USER | &quot;USER&quot; |



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



