

# UserActionDetails

Configuration of a user action-based conversion goal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value to be matched to hit the conversion goal. |  [optional] |
|**caseSensitive** | **Boolean** | The match is case-sensitive (&#x60;true&#x60;) or (&#x60;false&#x60;). |  [optional] |
|**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | The operator of the match. |  [optional] |
|**matchEntity** | [**MatchEntityEnum**](#MatchEntityEnum) | The type of the entity to which the rule applies. |  [optional] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Type of the action to which the rule applies. |  [optional] |



## Enum: MatchTypeEnum

| Name | Value |
|---- | -----|
| BEGINS | &quot;Begins&quot; |
| CONTAINS | &quot;Contains&quot; |
| ENDS | &quot;Ends&quot; |



## Enum: MatchEntityEnum

| Name | Value |
|---- | -----|
| ACTIONNAME | &quot;ActionName&quot; |
| CSSSELECTOR | &quot;CssSelector&quot; |
| JAVASCRIPTVARIABLE | &quot;JavaScriptVariable&quot; |
| METATAG | &quot;MetaTag&quot; |
| PAGEPATH | &quot;PagePath&quot; |
| PAGETITLE | &quot;PageTitle&quot; |
| PAGEURL | &quot;PageUrl&quot; |
| URLANCHOR | &quot;UrlAnchor&quot; |
| XHRURL | &quot;XhrUrl&quot; |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;Custom&quot; |
| LOAD | &quot;Load&quot; |
| XHR | &quot;Xhr&quot; |



