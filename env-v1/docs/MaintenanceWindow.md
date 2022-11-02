

# MaintenanceWindow

Parameters of the maintenance window.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the maintenance window. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the maintenance: planned or unplanned. |  |
|**description** | **String** | A short description of the maintenance purpose. |  [optional] |
|**suppressAlerts** | **Boolean** | Alerting during maintenance is enabled (&#x60;false&#x60;) or disabled (&#x60;true&#x60;). |  [optional] |
|**suppressProblems** | **Boolean** | Problem detection during maintenance is enabled (&#x60;false&#x60;) or disabled (&#x60;true&#x60;). |  [optional] |
|**scope** | [**MaintenanceWindowScope**](MaintenanceWindowScope.md) |  |  [optional] |
|**schedule** | [**MaintenanceWindowSchedule**](MaintenanceWindowSchedule.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;Planned&quot; |
| UNPLANNED | &quot;Unplanned&quot; |



