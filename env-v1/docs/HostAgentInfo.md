

# HostAgentInfo

OneAgent deployment on a host.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostInfo** | [**Host**](Host.md) |  |  [optional] |
|**faultyVersion** | **Boolean** | OneAgent version is faulty (&#x60;true&#x60;) or not (&#x60;false&#x60;). |  [optional] |
|**active** | **Boolean** | OneAgent is active (&#x60;true&#x60;) or inactive (&#x60;false&#x60;). |  [optional] |
|**configuredMonitoringMode** | [**ConfiguredMonitoringModeEnum**](#ConfiguredMonitoringModeEnum) | Configured monitoring mode of OneAgent. |  [optional] |
|**monitoringType** | [**MonitoringTypeEnum**](#MonitoringTypeEnum) | The monitoring mode of OneAgent. |  [optional] |
|**autoUpdateSetting** | [**AutoUpdateSettingEnum**](#AutoUpdateSettingEnum) | The effective auto-update setting of OneAgent. For host with inherited configuration it is calculated from its parent&#39;s configuration |  [optional] |
|**updateStatus** | [**UpdateStatusEnum**](#UpdateStatusEnum) | The current update status of OneAgent. |  [optional] |
|**availableVersions** | **Set&lt;String&gt;** | A list of versions OneAgent can be updated to. |  [optional] |
|**configuredMonitoringEnabled** | **Boolean** | Monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) in the OneAgent configuration. |  [optional] |
|**availabilityState** | [**AvailabilityStateEnum**](#AvailabilityStateEnum) | The availability state of OneAgent. |  [optional] |
|**detailedAvailabilityState** | [**DetailedAvailabilityStateEnum**](#DetailedAvailabilityStateEnum) | The detailed availability state of OneAgent. |  [optional] |
|**currentActiveGateId** | **Integer** | This field is deprecated and provided for backward compatibility.   Use the **currentActiveGateIds** field instead. |  [optional] |
|**currentActiveGateIds** | **List&lt;String&gt;** | The list of ActiveGate IDs of ActiveGates to which OneAgent is currently connected. |  [optional] |
|**currentNetworkZoneId** | **String** | The ID of the network zone that OneAgent is using. |  [optional] |
|**modules** | [**List&lt;ModuleInfo&gt;**](ModuleInfo.md) | A list of code modules deployed on the host. |  [optional] |
|**plugins** | [**List&lt;PluginInfo&gt;**](PluginInfo.md) | A list of plugins deployed on the host. |  [optional] |



## Enum: ConfiguredMonitoringModeEnum

| Name | Value |
|---- | -----|
| CLOUD_INFRASTRUCTURE | &quot;CLOUD_INFRASTRUCTURE&quot; |
| FULL_STACK | &quot;FULL_STACK&quot; |



## Enum: MonitoringTypeEnum

| Name | Value |
|---- | -----|
| CLOUD_INFRASTRUCTURE | &quot;CLOUD_INFRASTRUCTURE&quot; |
| FULL_STACK | &quot;FULL_STACK&quot; |
| STANDALONE | &quot;STANDALONE&quot; |



## Enum: AutoUpdateSettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |



## Enum: UpdateStatusEnum

| Name | Value |
|---- | -----|
| INCOMPATIBLE | &quot;INCOMPATIBLE&quot; |
| OUTDATED | &quot;OUTDATED&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |
| SUPPRESSED | &quot;SUPPRESSED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UP2DATE | &quot;UP2DATE&quot; |
| UPDATE_IN_PROGRESS | &quot;UPDATE_IN_PROGRESS&quot; |
| UPDATE_PENDING | &quot;UPDATE_PENDING&quot; |
| UPDATE_PROBLEM | &quot;UPDATE_PROBLEM&quot; |



## Enum: AvailabilityStateEnum

| Name | Value |
|---- | -----|
| CRASHED | &quot;CRASHED&quot; |
| LOST | &quot;LOST&quot; |
| MONITORED | &quot;MONITORED&quot; |
| PRE_MONITORED | &quot;PRE_MONITORED&quot; |
| SHUTDOWN | &quot;SHUTDOWN&quot; |
| UNEXPECTED_SHUTDOWN | &quot;UNEXPECTED_SHUTDOWN&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UNMONITORED | &quot;UNMONITORED&quot; |



## Enum: DetailedAvailabilityStateEnum

| Name | Value |
|---- | -----|
| CRASHED_FAILURE | &quot;CRASHED_FAILURE&quot; |
| CRASHED_UNKNOWN | &quot;CRASHED_UNKNOWN&quot; |
| LOST_AGENT_UPGRADE_FAILED | &quot;LOST_AGENT_UPGRADE_FAILED&quot; |
| LOST_CONNECTION | &quot;LOST_CONNECTION&quot; |
| LOST_UNKNOWN | &quot;LOST_UNKNOWN&quot; |
| MONITORED | &quot;MONITORED&quot; |
| MONITORED_AGENT_ENABLED | &quot;MONITORED_AGENT_ENABLED&quot; |
| MONITORED_AGENT_REGISTERED | &quot;MONITORED_AGENT_REGISTERED&quot; |
| MONITORED_AGENT_UPGRADE_STARTED | &quot;MONITORED_AGENT_UPGRADE_STARTED&quot; |
| MONITORED_AGENT_VERSION_ACCEPTED | &quot;MONITORED_AGENT_VERSION_ACCEPTED&quot; |
| MONITORED_ENABLED | &quot;MONITORED_ENABLED&quot; |
| PRE_MONITORED | &quot;PRE_MONITORED&quot; |
| SHUTDOWN_AGENT_LOST | &quot;SHUTDOWN_AGENT_LOST&quot; |
| SHUTDOWN_GRACEFUL | &quot;SHUTDOWN_GRACEFUL&quot; |
| SHUTDOWN_SPOT_INSTANCE | &quot;SHUTDOWN_SPOT_INSTANCE&quot; |
| SHUTDOWN_STOPPED | &quot;SHUTDOWN_STOPPED&quot; |
| SHUTDOWN_UNKNOWN | &quot;SHUTDOWN_UNKNOWN&quot; |
| SHUTDOWN_UNKNOWN_UNEXPECTED | &quot;SHUTDOWN_UNKNOWN_UNEXPECTED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UNMONITORED_AGENT_DISABLED | &quot;UNMONITORED_AGENT_DISABLED&quot; |
| UNMONITORED_AGENT_LOST | &quot;UNMONITORED_AGENT_LOST&quot; |
| UNMONITORED_AGENT_RESTART_TRIGGERED | &quot;UNMONITORED_AGENT_RESTART_TRIGGERED&quot; |
| UNMONITORED_AGENT_STOPPED | &quot;UNMONITORED_AGENT_STOPPED&quot; |
| UNMONITORED_AGENT_UNINSTALLED | &quot;UNMONITORED_AGENT_UNINSTALLED&quot; |
| UNMONITORED_AGENT_UNREGISTERED | &quot;UNMONITORED_AGENT_UNREGISTERED&quot; |
| UNMONITORED_AGENT_UPGRADE_FAILED | &quot;UNMONITORED_AGENT_UPGRADE_FAILED&quot; |
| UNMONITORED_AGENT_VERSION_REJECTED | &quot;UNMONITORED_AGENT_VERSION_REJECTED&quot; |
| UNMONITORED_DISABLED | &quot;UNMONITORED_DISABLED&quot; |
| UNMONITORED_ID_CHANGED | &quot;UNMONITORED_ID_CHANGED&quot; |
| UNMONITORED_TERMINATED | &quot;UNMONITORED_TERMINATED&quot; |
| UNMONITORED_UNKNOWN | &quot;UNMONITORED_UNKNOWN&quot; |



