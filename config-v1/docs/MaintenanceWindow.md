

# MaintenanceWindow

Configuration of a maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the maintenance window. |  [optional] |
|**name** | **String** | The name of the maintenance window, displayed in the UI. |  |
|**description** | **String** | A short description of the maintenance purpose. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the maintenance: planned or unplanned. |  |
|**suppression** | [**SuppressionEnum**](#SuppressionEnum) | The type of suppression of alerting and problem detection during the maintenance. |  |
|**suppressSyntheticMonitorsExecution** | **Boolean** | Suppress execution of synthetic monitors during the maintenance. |  [optional] |
|**scope** | [**Scope**](Scope.md) |  |  [optional] |
|**schedule** | [**Schedule**](Schedule.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;PLANNED&quot; |
| UNPLANNED | &quot;UNPLANNED&quot; |



## Enum: SuppressionEnum

| Name | Value |
|---- | -----|
| DETECT_PROBLEMS_AND_ALERT | &quot;DETECT_PROBLEMS_AND_ALERT&quot; |
| DETECT_PROBLEMS_DONT_ALERT | &quot;DETECT_PROBLEMS_DONT_ALERT&quot; |
| DONT_DETECT_PROBLEMS | &quot;DONT_DETECT_PROBLEMS&quot; |



