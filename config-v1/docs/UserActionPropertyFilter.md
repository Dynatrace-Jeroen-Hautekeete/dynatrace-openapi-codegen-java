

# UserActionPropertyFilter

User action property filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The key of the action property we&#39;re checking. |  [optional] |
|**value** | **String** | Only actions that have this value in the specified property are included in the metric calculation.    Only applicable to string values. |  [optional] |
|**from** | **Double** | Only actions that have a value greater than or equal to this are included in the metric calculation.    Only applicable to numerical values. |  [optional] |
|**to** | **Double** | Only actions that have a value less than or equal to this are included in the metric calculation.    Only applicable to numerical values. |  [optional] |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | Specifies the match type of a string filter, e.g. using &#x60;Contains&#x60; or &#x60;Equals&#x60;.    Only applicable to string values. |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;Contains&quot; |
| EQUALS | &quot;Equals&quot; |



