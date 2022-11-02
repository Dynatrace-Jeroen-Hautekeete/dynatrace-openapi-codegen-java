

# LogRecord

A single log record.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalColumns** | **Map&lt;String, List&lt;String&gt;&gt;** | Additional columns of the log record. |  [optional] |
|**timestamp** | **Long** | The timestamp of the log record, in UTC milliseconds. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event |  [optional] |
|**content** | **String** | The content of the log record. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The log status (based on the log level). |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| K8S | &quot;K8S&quot; |
| LOG | &quot;LOG&quot; |
| SFM | &quot;SFM&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| INFO | &quot;INFO&quot; |
| NONE | &quot;NONE&quot; |
| WARN | &quot;WARN&quot; |



