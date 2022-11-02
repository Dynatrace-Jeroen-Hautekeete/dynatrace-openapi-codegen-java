

# ResourceTimingSettings

Settings for resource timings capture.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**w3cResourceTimings** | **Boolean** | W3C resource timings for third party/CDN enabled/disabled. |  |
|**nonW3cResourceTimings** | **Boolean** | Timing for JavaScript files and images on non-W3C supported browsers enabled/disabled. |  |
|**nonW3cResourceTimingsInstrumentationDelay** | **Integer** | Instrumentation delay for monitoring resource and image resource impact in browsers that don&#39;t offer W3C resource timings.   Valid values range from 0 to 9999.  Only effective if **nonW3cResourceTimings** is enabled. |  |
|**resourceTimingCaptureType** | [**ResourceTimingCaptureTypeEnum**](#ResourceTimingCaptureTypeEnum) | Defines how detailed resource timings are captured.  Only effective if **w3cResourceTimings** or **nonW3cResourceTimings** is enabled. |  [optional] |
|**resourceTimingsDomainLimit** | **Integer** | Limits the number of domains for which W3C resource timings are captured.  Only effective if **resourceTimingCaptureType** is &#x60;CAPTURE_LIMITED_SUMMARIES&#x60;. |  [optional] |



## Enum: ResourceTimingCaptureTypeEnum

| Name | Value |
|---- | -----|
| ALL_SUMMARIES | &quot;CAPTURE_ALL_SUMMARIES&quot; |
| FULL_DETAILS | &quot;CAPTURE_FULL_DETAILS&quot; |
| LIMITED_SUMMARIES | &quot;CAPTURE_LIMITED_SUMMARIES&quot; |



