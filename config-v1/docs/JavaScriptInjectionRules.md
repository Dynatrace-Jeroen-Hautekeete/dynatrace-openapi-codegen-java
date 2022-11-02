

# JavaScriptInjectionRules

Rules for javascript injection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The enable or disable rule of the java script injection. |  |
|**urlOperator** | [**UrlOperatorEnum**](#UrlOperatorEnum) | The url operator of the java script injection. |  |
|**urlPattern** | **String** | The url pattern of the java script injection. |  [optional] |
|**rule** | [**RuleEnum**](#RuleEnum) | The url rule of the java script injection. |  |
|**htmlPattern** | **String** | The html pattern of the java script injection. |  [optional] |
|**target** | [**TargetEnum**](#TargetEnum) | The target against which the rule of the java script injection should be matched. |  [optional] |



## Enum: UrlOperatorEnum

| Name | Value |
|---- | -----|
| ALL_PAGES | &quot;ALL_PAGES&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



## Enum: RuleEnum

| Name | Value |
|---- | -----|
| AFTER_SPECIFIC_HTML | &quot;AFTER_SPECIFIC_HTML&quot; |
| AUTOMATIC_INJECTION | &quot;AUTOMATIC_INJECTION&quot; |
| BEFORE_SPECIFIC_HTML | &quot;BEFORE_SPECIFIC_HTML&quot; |
| DO_NOT_INJECT | &quot;DO_NOT_INJECT&quot; |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| PAGE_QUERY | &quot;PAGE_QUERY&quot; |
| URL | &quot;URL&quot; |



