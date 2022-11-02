

# LogRecord

The analysis result for a single log entry.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **Long** | The timestamp of the log entry, in UTC milliseconds. |  [optional] |
|**logLevel** | **String** | The severity level of the log entry. |  [optional] |
|**hostId** | **String** | The entity ID of the host that produced the log.    Not applicable to OS logs. |  [optional] |
|**text** | **String** | The text of the log entry. |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** | The map of the log entry custom fields. |  [optional] |



