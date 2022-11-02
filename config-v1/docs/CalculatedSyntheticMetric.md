

# CalculatedSyntheticMetric

Definition of the calculated synthetic metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**monitorIdentifier** | **String** | The Dynatrace entity ID of the synthetic monitor to which the metric belongs. |  |
|**name** | **String** | The name of the metric, displayed in the UI. |  |
|**metricKey** | **String** | The unique key of the metric.    The key must have the &#x60;calc:synthetic&#x60; prefix. |  |
|**enabled** | **Boolean** | The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**metric** | [**MetricEnum**](#MetricEnum) | The type of the synthetic metric. |  |
|**dimensions** | [**List&lt;SyntheticMetricDimension&gt;**](SyntheticMetricDimension.md) | A list of metric dimensions. |  [optional] |
|**filter** | [**SyntheticMetricFilter**](SyntheticMetricFilter.md) |  |  [optional] |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| APPLICATIONCACHE | &quot;ApplicationCache&quot; |
| CALLBACK | &quot;Callback&quot; |
| CUMULATIVELAYOUTSHIFT | &quot;CumulativeLayoutShift&quot; |
| DNSLOOKUP | &quot;DNSLookup&quot; |
| DOMCOMPLETE | &quot;DOMComplete&quot; |
| DOMCONTENTLOADED | &quot;DOMContentLoaded&quot; |
| DOMINTERACTIVE | &quot;DOMInteractive&quot; |
| FAILEDREQUESTSRESOURCES | &quot;FailedRequestsResources&quot; |
| FIRSTCONTENTFULPAINT | &quot;FirstContentfulPaint&quot; |
| FIRSTINPUTDELAY | &quot;FirstInputDelay&quot; |
| FIRSTINPUTSTART | &quot;FirstInputStart&quot; |
| FIRSTPAINT | &quot;FirstPaint&quot; |
| HTMLDOWNLOADED | &quot;HTMLDownloaded&quot; |
| HTTPERRORS | &quot;HttpErrors&quot; |
| JAVASCRIPTERRORS | &quot;JavaScriptErrors&quot; |
| LARGESTCONTENTFULPAINT | &quot;LargestContentfulPaint&quot; |
| LOADEVENTEND | &quot;LoadEventEnd&quot; |
| LOADEVENTSTART | &quot;LoadEventStart&quot; |
| LONGTASKS | &quot;LongTasks&quot; |
| NAVIGATIONSTART | &quot;NavigationStart&quot; |
| ONDOMCONTENTLOADED | &quot;OnDOMContentLoaded&quot; |
| ONLOAD | &quot;OnLoad&quot; |
| PROCESSING | &quot;Processing&quot; |
| REDIRECTTIME | &quot;RedirectTime&quot; |
| REQUEST | &quot;Request&quot; |
| REQUESTSTART | &quot;RequestStart&quot; |
| RESOURCECOUNT | &quot;ResourceCount&quot; |
| RESPONSE | &quot;Response&quot; |
| SECURECONNECT | &quot;SecureConnect&quot; |
| SPEEDINDEX | &quot;SpeedIndex&quot; |
| TCPCONNECT | &quot;TCPConnect&quot; |
| TIMETOFIRSTBYTE | &quot;TimeToFirstByte&quot; |
| TOTALDURATION | &quot;TotalDuration&quot; |
| TRANSFERSIZE | &quot;TransferSize&quot; |
| USERACTIONDURATION | &quot;UserActionDuration&quot; |
| VISUALLYCOMPLETE | &quot;VisuallyComplete&quot; |



