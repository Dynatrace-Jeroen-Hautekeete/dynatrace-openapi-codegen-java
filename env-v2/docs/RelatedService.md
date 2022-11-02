

# RelatedService

A service related to a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Dynatrace entity ID of the entity. |  [optional] [readonly] |
|**numberOfAffectedEntities** | **Long** | The number of affected entities related to the entity. |  [optional] [readonly] |
|**affectedEntities** | **List&lt;String&gt;** | A list of affected entities related to the entity. |  [optional] [readonly] |
|**exposure** | [**ExposureEnum**](#ExposureEnum) | The level of exposure of the service. |  [optional] [readonly] |



## Enum: ExposureEnum

| Name | Value |
|---- | -----|
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_DETECTED | &quot;NOT_DETECTED&quot; |
| PUBLIC_NETWORK | &quot;PUBLIC_NETWORK&quot; |



