

# UserSessionEvents

The external event of a user session.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of event. |  [optional] |
|**name** | **String** | The name of the event. |  [optional] |
|**domain** | **String** | The DNS domain where the event has been recorded. |  [optional] |
|**startTime** | **Long** | The timestamp of the event, in UTC milliseconds. |  [optional] |
|**application** | **String** | The name of the application, based on the configured detection rules. |  [optional] |
|**internalApplicationId** | **String** | The Dynatrace entity ID of the application.    This information is useful when calling various REST APIs, for example, as a key for time series queries. |  [optional] |
|**metadata** | **String** | The metadata attached to the event. |  [optional] |
|**page** | **String** | The name of the page the user navigated to during a page change event. |  [optional] |
|**pageGroup** | **String** | The page group is automatically derived from the page. |  [optional] |
|**pageReferrer** | **String** | The name of the previous page from which the user navigated from during a page change event. |  [optional] |
|**pageReferrerGroup** | **String** | The page referrer group is automatically derived from the page referrer. |  [optional] |



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



