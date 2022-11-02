

# AlertingEventTypeFilter

Configuration of the event filter for the alerting profile.   You have two mutually exclusive options:  * Select an event type from the list of the predefined events. Specify it in the **predefinedEventFilter** field.  * Set a rule for custom events. Specify it in the **customEventFilter** field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**predefinedEventFilter** | [**AlertingPredefinedEventFilter**](AlertingPredefinedEventFilter.md) |  |  [optional] |
|**customEventFilter** | [**AlertingCustomEventFilter**](AlertingCustomEventFilter.md) |  |  [optional] |



