

# AlertingProfileTagFilter

Configuration of the tag filtering of the alerting profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeMode** | [**IncludeModeEnum**](#IncludeModeEnum) | The filtering mode:  * &#x60;INCLUDE_ANY&#x60;: The rule applies to monitored entities that have at least one of the specified tags. You can specify up to 100 tags.  * &#x60;INCLUDE_ALL&#x60;: The rule applies to monitored entities that have **all** of the specified tags. You can specify up to 10 tags.  * &#x60;NONE&#x60;: The rule applies to all monitored entities. |  |
|**tagFilters** | [**Set&lt;TagFilter&gt;**](TagFilter.md) | A list of required tags. |  [optional] |



## Enum: IncludeModeEnum

| Name | Value |
|---- | -----|
| INCLUDE_ALL | &quot;INCLUDE_ALL&quot; |
| INCLUDE_ANY | &quot;INCLUDE_ANY&quot; |
| NONE | &quot;NONE&quot; |



