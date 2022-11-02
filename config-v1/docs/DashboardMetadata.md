

# DashboardMetadata

Parameters of a dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the dashboard. |  |
|**shared** | **Boolean** | The dashboard is shared (&#x60;true&#x60;) or private (&#x60;false&#x60;). |  [optional] |
|**owner** | **String** | The owner of the dashboard. |  |
|**dashboardFilter** | [**DashboardFilter**](DashboardFilter.md) |  |  [optional] |
|**tags** | **Set&lt;String&gt;** | A set of tags assigned to the dashboard. |  [optional] |
|**preset** | **Boolean** | The dashboard is a preset (&#x60;true&#x60;) or a custom (&#x60;false&#x60;) dashboard. |  [optional] |
|**dynamicFilters** | [**DynamicFilters**](DynamicFilters.md) |  |  [optional] |
|**tilesNameSize** | [**TilesNameSizeEnum**](#TilesNameSizeEnum) | The general size of the tiles tile. Default value is medium |  [optional] |
|**hasConsistentColors** | **Boolean** | The tile uses consistent colors when rendering its content. |  [optional] |



## Enum: TilesNameSizeEnum

| Name | Value |
|---- | -----|
| SMALL | &quot;small&quot; |
| MEDIUM | &quot;medium&quot; |
| LARGE | &quot;large&quot; |



