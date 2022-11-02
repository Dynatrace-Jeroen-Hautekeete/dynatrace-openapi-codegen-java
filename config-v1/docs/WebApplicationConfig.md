

# WebApplicationConfig

Configuration of a web application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**identifier** | **String** | Dynatrace entity ID of the web application. |  [optional] [readonly] |
|**name** | **String** | The name of the web application, displayed in the UI. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the web application. |  [optional] |
|**realUserMonitoringEnabled** | **Boolean** | Real user monitoring enabled/disabled. |  |
|**costControlUserSessionPercentage** | **BigDecimal** | Analize *X*% of user sessions. |  |
|**loadActionKeyPerformanceMetric** | [**LoadActionKeyPerformanceMetricEnum**](#LoadActionKeyPerformanceMetricEnum) | The key performance metric of load actions. |  |
|**sessionReplayConfig** | [**SessionReplaySetting**](SessionReplaySetting.md) |  |  [optional] |
|**xhrActionKeyPerformanceMetric** | [**XhrActionKeyPerformanceMetricEnum**](#XhrActionKeyPerformanceMetricEnum) | The key performance metric of XHR actions. |  |
|**loadActionApdexSettings** | [**Apdex**](Apdex.md) |  |  |
|**xhrActionApdexSettings** | [**Apdex**](Apdex.md) |  |  |
|**customActionApdexSettings** | [**Apdex**](Apdex.md) |  |  |
|**waterfallSettings** | [**WaterfallSettings**](WaterfallSettings.md) |  |  |
|**monitoringSettings** | [**MonitoringSettings**](MonitoringSettings.md) |  |  |
|**userTags** | [**List&lt;UserTag&gt;**](UserTag.md) | User tags settings. |  [optional] |
|**userActionAndSessionProperties** | [**List&lt;UserActionAndSessionProperties&gt;**](UserActionAndSessionProperties.md) | User action and session properties settings. Empty List means no change |  [optional] |
|**userActionNamingSettings** | [**UserActionNamingSettings**](UserActionNamingSettings.md) |  |  [optional] |
|**metaDataCaptureSettings** | [**List&lt;MetaDataCapturing&gt;**](MetaDataCapturing.md) | Java script agent meta data capture settings. |  [optional] |
|**conversionGoals** | [**List&lt;ConversionGoal&gt;**](ConversionGoal.md) | A list of conversion goals of the application. |  [optional] |
|**urlInjectionPattern** | **String** | Url injection pattern for manual web application. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_INJECTED | &quot;AUTO_INJECTED&quot; |
| BROWSER_EXTENSION_INJECTED | &quot;BROWSER_EXTENSION_INJECTED&quot; |
| MANUALLY_INJECTED | &quot;MANUALLY_INJECTED&quot; |



## Enum: LoadActionKeyPerformanceMetricEnum

| Name | Value |
|---- | -----|
| ACTION_DURATION | &quot;ACTION_DURATION&quot; |
| CUMULATIVE_LAYOUT_SHIFT | &quot;CUMULATIVE_LAYOUT_SHIFT&quot; |
| DOM_INTERACTIVE | &quot;DOM_INTERACTIVE&quot; |
| FIRST_INPUT_DELAY | &quot;FIRST_INPUT_DELAY&quot; |
| LARGEST_CONTENTFUL_PAINT | &quot;LARGEST_CONTENTFUL_PAINT&quot; |
| LOAD_EVENT_END | &quot;LOAD_EVENT_END&quot; |
| LOAD_EVENT_START | &quot;LOAD_EVENT_START&quot; |
| RESPONSE_END | &quot;RESPONSE_END&quot; |
| RESPONSE_START | &quot;RESPONSE_START&quot; |
| SPEED_INDEX | &quot;SPEED_INDEX&quot; |
| VISUALLY_COMPLETE | &quot;VISUALLY_COMPLETE&quot; |



## Enum: XhrActionKeyPerformanceMetricEnum

| Name | Value |
|---- | -----|
| ACTION_DURATION | &quot;ACTION_DURATION&quot; |
| RESPONSE_END | &quot;RESPONSE_END&quot; |
| RESPONSE_START | &quot;RESPONSE_START&quot; |
| VISUALLY_COMPLETE | &quot;VISUALLY_COMPLETE&quot; |



