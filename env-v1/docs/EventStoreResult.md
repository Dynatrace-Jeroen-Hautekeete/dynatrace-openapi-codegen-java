

# EventStoreResult

Contains IDs of all custom events, created by an event push call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storedEventIds** | **List&lt;Long&gt;** | List of event IDs for information-only-events.    This field is provided for compatibility reasons. You should use the values from the **storedIds** field instead. |  [optional] |
|**storedIds** | **List&lt;String&gt;** | List of **encoded** event IDs for information-only-events. |  [optional] |
|**storedCorrelationIds** | **List&lt;String&gt;** | List of correlation IDs for problem-opening-events. |  [optional] |



