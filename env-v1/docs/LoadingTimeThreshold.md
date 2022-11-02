

# LoadingTimeThreshold

The performance threshold rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the threshold: total loading time or action loading time. |  |
|**valueMs** | **Integer** | Notify if monitor takes longer than *X* milliseconds to load. |  |
|**requestIndex** | **Integer** | Specify the request to which an ACTION threshold applies. |  [optional] |
|**eventIndex** | **Integer** | Specify the event to which an ACTION threshold applies. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACTION | &quot;ACTION&quot; |
| TOTAL | &quot;TOTAL&quot; |



