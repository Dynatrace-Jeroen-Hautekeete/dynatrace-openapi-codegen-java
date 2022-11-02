

# EventIngest

The configuration of an event to be ingested.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event. |  |
|**title** | **String** | The title of the event. |  |
|**startTime** | **Long** | The start time of the event, in UTC milliseconds.  If not set, the current timestamp is used.  Depending on the event type, the start time must not lie in the future more than 5 minutes for trigger events and 7 days for info events. |  [optional] |
|**endTime** | **Long** | The end time of the event, in UTC milliseconds.  If not set, the start time plus timeout is used. |  [optional] |
|**timeout** | **Integer** | The timeout of the event, in minutes.  If not set, 15 is used.  The timeout will automatically be capped to a maximum of 360 minutes (6 hours).  Problem-opening events can be refreshed and therefore kept open by sending the same payload again. |  [optional] |
|**entitySelector** | **String** | The [entity selector](https://dt-url.net/apientityselector), defining a set of Dynatrace entities to be associated with the event.  Only entities that have been active within the last 24 hours can be selected.    If not set, the event is associated with the environment (&#x60;dt.entity.environment&#x60;) entity. |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | A map of event properties.  Keys with prefix &#x60;dt.*&#x60; are generally disallowed, with the exceptions of &#x60;dt.event.*&#x60;, &#x60;dt.davis.*&#x60; and &#x60;dt.entity.*&#x60;. These reserved keys may be used to set event properties with predefined semantics within the Dynatrace product. &#x60;dt.entity.*&#x60; keys may be used to provide additional information on an event, but will not lead to the event being tied to the specified entities. All other keys are interpreted as user-defined event properties.  Values of Dynatrace-reserved properties must fulfill the requirements of the respective property. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| AVAILABILITY_EVENT | &quot;AVAILABILITY_EVENT&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| CUSTOM_ANNOTATION | &quot;CUSTOM_ANNOTATION&quot; |
| CUSTOM_CONFIGURATION | &quot;CUSTOM_CONFIGURATION&quot; |
| CUSTOM_DEPLOYMENT | &quot;CUSTOM_DEPLOYMENT&quot; |
| CUSTOM_INFO | &quot;CUSTOM_INFO&quot; |
| ERROR_EVENT | &quot;ERROR_EVENT&quot; |
| MARKED_FOR_TERMINATION | &quot;MARKED_FOR_TERMINATION&quot; |
| PERFORMANCE_EVENT | &quot;PERFORMANCE_EVENT&quot; |
| RESOURCE_CONTENTION_EVENT | &quot;RESOURCE_CONTENTION_EVENT&quot; |



