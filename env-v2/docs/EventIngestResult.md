

# EventIngestResult

The result of a created event report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of the ingestion. |  [optional] |
|**correlationId** | **String** | The correlation ID of the created event. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INVALID_ENTITY_TYPE | &quot;INVALID_ENTITY_TYPE&quot; |
| INVALID_METADATA | &quot;INVALID_METADATA&quot; |
| INVALID_TIMESTAMPS | &quot;INVALID_TIMESTAMPS&quot; |
| OK | &quot;OK&quot; |



