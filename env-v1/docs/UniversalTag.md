

# UniversalTag


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tagKey** | [**UniversalTagKey**](UniversalTagKey.md) |  |  [optional] |
|**value** | **String** | The value of the tag. Not applicable to custom tags.   If a tag does have a separate key and value (in the textual representation they are split by the colon ‘:’), this field is set with the actual value. Key-value pairs can occur for automatically imported tags and tags set by rules if extractors are used. |  [optional] |
|**key** | **String** | The key of the tag. For custom tags, put the tag value here.  The key allows categorization of multiple tags. It is possible that there are multiple values for a single key which will all be represented as standalone tags. Therefore, the key does not have the semantic of a map key but is more like a key of a key-value tuple. In some cases, for example custom tags, the key represents the actual tag value and the value field is not set – those are called valueless tags. |  |
|**context** | [**ContextEnum**](#ContextEnum) | The origin of the tag, such as AWS or Cloud Foundry. For custom tags use the &#x60;CONTEXTLESS&#x60; value.   The context is set for tags that are automatically imported by OneAgent (for example, from the AWS console or environment variables). It’s useful for determining the origin of tags when not manually defined, and it also helps to prevent clashes with other existing tags. If the tag is not automatically imported, &#x60;CONTEXTLESS&#x60; set. |  [optional] |



## Enum: ContextEnum

| Name | Value |
|---- | -----|
| AWS | &quot;AWS&quot; |
| AWS_GENERIC | &quot;AWS_GENERIC&quot; |
| AZURE | &quot;AZURE&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| CONTEXTLESS | &quot;CONTEXTLESS&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| GOOGLE_COMPUTE_ENGINE | &quot;GOOGLE_COMPUTE_ENGINE&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |



