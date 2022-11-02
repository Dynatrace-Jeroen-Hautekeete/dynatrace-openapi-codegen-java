

# DestinationDetails

Configuration of a destination-based conversion goal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**urlOrPath** | **String** | The path to be reached to hit the conversion goal. |  |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | The operator of the match. |  [optional] |
|**caseSensitive** | **Boolean** | The match is case-sensitive (&#x60;true&#x60;) or (&#x60;false&#x60;). |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| BEGINS | &quot;Begins&quot; |
| CONTAINS | &quot;Contains&quot; |
| ENDS | &quot;Ends&quot; |



