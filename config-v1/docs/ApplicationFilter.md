

# ApplicationFilter

The condition of an application detection rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pattern** | **String** | The value to look for. |  |
|**applicationMatchType** | [**ApplicationMatchTypeEnum**](#ApplicationMatchTypeEnum) | The operator of the matching. |  |
|**applicationMatchTarget** | [**ApplicationMatchTargetEnum**](#ApplicationMatchTargetEnum) | Where to look for the the **pattern** value. |  |



## Enum: ApplicationMatchTypeEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| MATCHES | &quot;MATCHES&quot; |



## Enum: ApplicationMatchTargetEnum

| Name | Value |
|---- | -----|
| DOMAIN | &quot;DOMAIN&quot; |
| URL | &quot;URL&quot; |



