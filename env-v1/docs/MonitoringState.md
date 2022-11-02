

# MonitoringState

Defines the current monitoring state of an entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actualMonitoringState** | [**ActualMonitoringStateEnum**](#ActualMonitoringStateEnum) | The current actual monitoring state on the entity. |  [optional] |
|**expectedMonitoringState** | [**ExpectedMonitoringStateEnum**](#ExpectedMonitoringStateEnum) | The monitoring state that is expected from the configuration |  [optional] |
|**restartRequired** | **Boolean** | Defines whether or not the process has to restarted to enable monitoring |  [optional] |



## Enum: ActualMonitoringStateEnum

| Name | Value |
|---- | -----|
| OFF | &quot;OFF&quot; |
| ON | &quot;ON&quot; |



## Enum: ExpectedMonitoringStateEnum

| Name | Value |
|---- | -----|
| OFF | &quot;OFF&quot; |
| ON | &quot;ON&quot; |



