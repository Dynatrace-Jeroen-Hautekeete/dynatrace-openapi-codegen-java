

# DashboardReport

Configuration of a dashboard report.   The dashboard report provides a public link to the associated dashboard with a custom reporting period: last week for weekly subscribers or last month for monthly subscribers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the report. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**dashboardId** | **String** | The ID of the associated dashboard. |  |
|**enabled** | **Boolean** | The email notifications for the dashboard report are enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**subscriptions** | [**DashboardReportSubscription**](DashboardReportSubscription.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DASHBOARD | &quot;DASHBOARD&quot; |



