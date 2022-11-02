

# Event

Configuration of an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**suppressAlert** | **Boolean** | The alerting status during a [maintenance](https://dt-url.net/b2123rg0):    * &#x60;false&#x60;: Alerting works as usual.  * &#x60;true&#x60;: Alerting is disabled. |  [optional] |
|**underMaintenance** | **Boolean** | If &#x60;true&#x60;, the event happened while the monitored system was under maintenance. |  [optional] |
|**suppressProblem** | **Boolean** | The problem detection status during a [maintenance](https://dt-url.net/b2123rg0):    * &#x60;false&#x60;: Problem detection works as usual.  * &#x60;true&#x60;: Problem detection is disabled. |  [optional] |
|**frequentEvent** | **Boolean** | If &#x60;true&#x60;, the event happens [frequently](https://dt-url.net/4da3kdg).    A frequent event doesn&#39;t raise a problem. |  [optional] |
|**managementZones** | [**Set&lt;ManagementZone&gt;**](ManagementZone.md) | A list of all management zones that the event belongs to. |  [optional] |
|**entityId** | [**EntityStub**](EntityStub.md) |  |  [optional] |
|**eventId** | **String** | The ID of the event. |  [optional] |
|**entityTags** | [**Set&lt;METag&gt;**](METag.md) | A list of tags of the related entity. |  [optional] |
|**eventType** | **String** | The type of the event. |  [optional] |
|**properties** | [**List&lt;EventProperty&gt;**](EventProperty.md) | A list of event properties. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the event. |  [optional] |
|**startTime** | **Long** | The timestamp when the event was raised, in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The timestamp when the event was closed, in UTC milliseconds.    Has the value of &#x60;null&#x60; if the event is still active. |  [optional] |
|**title** | **String** | The title of the event. |  [optional] |
|**correlationId** | **String** | The correlation ID of the event.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| OPEN | &quot;OPEN&quot; |



