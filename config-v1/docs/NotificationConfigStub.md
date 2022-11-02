

# NotificationConfigStub

The short representation of a notification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the Dynatrace entity. |  |
|**name** | **String** | The name of the Dynatrace entity. |  [optional] [readonly] |
|**description** | **String** | A short description of the Dynatrace entity. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the notification. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANSIBLETOWER | &quot;ANSIBLETOWER&quot; |
| EMAIL | &quot;EMAIL&quot; |
| HIPCHAT | &quot;HIPCHAT&quot; |
| JIRA | &quot;JIRA&quot; |
| OPS_GENIE | &quot;OPS_GENIE&quot; |
| PAGER_DUTY | &quot;PAGER_DUTY&quot; |
| SERVICE_NOW | &quot;SERVICE_NOW&quot; |
| SLACK | &quot;SLACK&quot; |
| TRELLO | &quot;TRELLO&quot; |
| VICTOROPS | &quot;VICTOROPS&quot; |
| WEBHOOK | &quot;WEBHOOK&quot; |
| XMATTERS | &quot;XMATTERS&quot; |



