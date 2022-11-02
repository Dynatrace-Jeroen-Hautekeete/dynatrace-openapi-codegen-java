

# UserSessionErrors

The error of a user session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of error. |  [optional] |
|**name** | **String** | The name of the error. |  [optional] |
|**domain** | **String** | The DNS domain where the error has been recorded. |  [optional] |
|**startTime** | **Long** | The timestamp of the error, in UTC milliseconds. |  [optional] |
|**application** | **String** | The name of the application, based on the configured detection rules. |  [optional] |
|**internalApplicationId** | **String** | The Dynatrace entity ID of the application.    This information is useful when calling various REST APIs, for example, as a key for time series queries. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BEHAVIORAL | &quot;Behavioral&quot; |
| CRASH | &quot;Crash&quot; |
| ERROR | &quot;Error&quot; |
| PAGECHANGE | &quot;PageChange&quot; |
| RAGECLICK | &quot;RageClick&quot; |
| RAGETAP | &quot;RageTap&quot; |
| USERTAG | &quot;UserTag&quot; |
| USERTAGFROMMETADATA | &quot;UserTagFromMetaData&quot; |
| VISITTAG | &quot;VisitTag&quot; |



