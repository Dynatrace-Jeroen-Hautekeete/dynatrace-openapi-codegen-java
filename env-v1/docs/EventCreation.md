

# EventCreation

Configuration of the custom event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event. |  |
|**start** | **Long** | The start timestamp of the event, in UTC milliseconds.   If not set, the current timestamp is used.   You can report information-only events up to **30 days** into the past.   You can report problem-opening events up to **60 minutes** into the past. |  [optional] |
|**end** | **Long** | The end timestamp of the event, in UTC milliseconds.   If not set, the current time is used for information-only events.   Not applicable to problem-opening events. Such an event stays open until it times out depending on the **timeoutMinutes** parameter. |  [optional] |
|**timeoutMinutes** | **Integer** | The timeout for problem-opening events in minutes. Not applicable to information-only events.   If not set, 15 minutes is used. The maximum allowed value is 120 minutes.   You can refresh the event by sending the same payload again. |  [optional] |
|**attachRules** | [**PushEventAttachRules**](PushEventAttachRules.md) |  |  |
|**customProperties** | **Map&lt;String, Object&gt;** | The set of any properties related to the event, in the *\&quot;key\&quot; : \&quot;value\&quot;* format. |  [optional] |
|**source** | **String** | The name or ID of the external source of the event. |  |
|**annotationType** | **String** | The type of the custom annotation, for example &#x60;DNS route has been changed&#x60;. |  [optional] |
|**annotationDescription** | **String** | A detailed description of the custom annotation, for example &#x60;DNS route has been changed to x.mydomain.com&#x60;. |  [optional] |
|**description** | **String** | The textual description of the configuration change. |  [optional] |
|**deploymentName** | **String** | The ID of the triggered deployment. |  [optional] |
|**deploymentVersion** | **String** | The version of the triggered deployment. |  [optional] |
|**timeseriesIds** | **List&lt;String&gt;** | A list of timeseries IDs, related to the event. |  [optional] |
|**deploymentProject** | **String** | The project name of the deployed package. |  [optional] |
|**ciBackLink** | **String** | The link to the deployed artifact within the 3rd party system. |  [optional] |
|**remediationAction** | **String** | The link to the deployment related remediation action within the external tool. |  [optional] |
|**original** | **String** | The previous value of the configuration. |  [optional] |
|**changed** | **String** | The new value of the configuration that has been set by the event. |  [optional] |
|**_configuration** | **String** | The ID or the name of the configuration that has been changed by the event. |  [optional] |
|**title** | **String** | The title of the configuration that has been set by the event. |  [optional] |
|**allowDavisMerge** | **Boolean** | Allow Davis AI to merge this event into existing problems (true) or force creating a new problem (false).  This only applies to problem-opening event types. |  [optional] |



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
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



