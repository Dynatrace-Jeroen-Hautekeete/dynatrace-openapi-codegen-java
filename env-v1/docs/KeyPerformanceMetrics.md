

# KeyPerformanceMetrics

The key performance metrics configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loadActionKpm** | [**LoadActionKpmEnum**](#LoadActionKpmEnum) | Defines the key performance metric for load actions. |  |
|**xhrActionKpm** | [**XhrActionKpmEnum**](#XhrActionKpmEnum) | Defines the key performance metric for XHR actions. |  |



## Enum: LoadActionKpmEnum

| Name | Value |
|---- | -----|
| VISUALLY_COMPLETE | &quot;VISUALLY_COMPLETE&quot; |
| SPEED_INDEX | &quot;SPEED_INDEX&quot; |
| USER_ACTION_DURATION | &quot;USER_ACTION_DURATION&quot; |
| TIME_TO_FIRST_BYTE | &quot;TIME_TO_FIRST_BYTE&quot; |
| HTML_DOWNLOADED | &quot;HTML_DOWNLOADED&quot; |
| DOM_INTERACTIVE | &quot;DOM_INTERACTIVE&quot; |
| LOAD_EVENT_START | &quot;LOAD_EVENT_START&quot; |
| LOAD_EVENT_END | &quot;LOAD_EVENT_END&quot; |



## Enum: XhrActionKpmEnum

| Name | Value |
|---- | -----|
| VISUALLY_COMPLETE | &quot;VISUALLY_COMPLETE&quot; |
| USER_ACTION_DURATION | &quot;USER_ACTION_DURATION&quot; |
| TIME_TO_FIRST_BYTE | &quot;TIME_TO_FIRST_BYTE&quot; |
| RESPONSE_END | &quot;RESPONSE_END&quot; |



