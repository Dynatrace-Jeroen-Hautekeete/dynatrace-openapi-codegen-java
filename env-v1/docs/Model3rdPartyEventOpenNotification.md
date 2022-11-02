

# Model3rdPartyEventOpenNotification

The open third-party synthetic event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testId** | **String** | The ID of the third-party synthetic monitor. |  |
|**eventId** | **String** | The unique ID of the event. |  |
|**name** | **String** | The name of the event. |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event. |  |
|**reason** | **String** | The cause of the event. |  |
|**startTimestamp** | **Long** | The start timestamp of the event, in UTC milliseconds. |  |
|**locationIds** | **Set&lt;String&gt;** | The list of IDs of third-party synthetic locations where the event happens. |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| TESTOUTAGE | &quot;testOutage&quot; |
| TESTSLOWDOWN | &quot;testSlowdown&quot; |



