

# WebApplicationMetricDefinition

Definition of the web application metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metric** | [**MetricEnum**](#MetricEnum) | The type of the web application metric. |  |
|**propertyKey** | **String** | The key of the user action property.    Only applicable for &#x60;DoubleProperty&#x60; and &#x60;LongProperty&#x60; metrics. |  [optional] |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| APDEX | &quot;Apdex&quot; |
| APPLICATIONCACHE | &quot;ApplicationCache&quot; |
| CALLBACK | &quot;Callback&quot; |
| CUMULATIVELAYOUTSHIFT | &quot;CumulativeLayoutShift&quot; |
| DNSLOOKUP | &quot;DNSLookup&quot; |
| DOMCOMPLETE | &quot;DOMComplete&quot; |
| DOMCONTENTLOADED | &quot;DOMContentLoaded&quot; |
| DOMINTERACTIVE | &quot;DOMInteractive&quot; |
| DOUBLEPROPERTY | &quot;DoubleProperty&quot; |
| ERRORCOUNT | &quot;ErrorCount&quot; |
| FIRSTCONTENTFULPAINT | &quot;FirstContentfulPaint&quot; |
| FIRSTINPUTDELAY | &quot;FirstInputDelay&quot; |
| FIRSTINPUTSTART | &quot;FirstInputStart&quot; |
| FIRSTPAINT | &quot;FirstPaint&quot; |
| HTMLDOWNLOADED | &quot;HTMLDownloaded&quot; |
| LARGESTCONTENTFULPAINT | &quot;LargestContentfulPaint&quot; |
| LOADEVENTEND | &quot;LoadEventEnd&quot; |
| LOADEVENTSTART | &quot;LoadEventStart&quot; |
| LONGPROPERTY | &quot;LongProperty&quot; |
| LONGTASKSTIME | &quot;LongTasksTime&quot; |
| NAVIGATIONSTART | &quot;NavigationStart&quot; |
| ONDOMCONTENTLOADED | &quot;OnDOMContentLoaded&quot; |
| ONLOAD | &quot;OnLoad&quot; |
| PROCESSING | &quot;Processing&quot; |
| REDIRECTTIME | &quot;RedirectTime&quot; |
| REQUEST | &quot;Request&quot; |
| REQUESTSTART | &quot;RequestStart&quot; |
| RESPONSE | &quot;Response&quot; |
| SECURECONNECT | &quot;SecureConnect&quot; |
| SPEEDINDEX | &quot;SpeedIndex&quot; |
| TCPCONNECT | &quot;TCPConnect&quot; |
| TIMETOFIRSTBYTE | &quot;TimeToFirstByte&quot; |
| USERACTIONDURATION | &quot;UserActionDuration&quot; |
| VISUALLYCOMPLETE | &quot;VisuallyComplete&quot; |



