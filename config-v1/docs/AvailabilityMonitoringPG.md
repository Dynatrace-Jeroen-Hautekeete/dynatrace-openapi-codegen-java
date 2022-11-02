

# AvailabilityMonitoringPG

Configuration of the availability monitoring for the process group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) | How to monitor the availability of the process group:   * &#x60;PROCESS_IMPACT&#x60;: Alert if any process of the group becomes unavailable.  * &#x60;MINIMUM_THRESHOLD&#x60;: Alert if the number of active processes in the group falls below the specified threshold.  * &#x60;OFF&#x60;: Availability monitoring is disabled. |  |
|**minimumThreshold** | **Integer** | Alert if the number of active processes in the group is lower than this value. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| MINIMUM_THRESHOLD | &quot;MINIMUM_THRESHOLD&quot; |
| OFF | &quot;OFF&quot; |
| PROCESS_IMPACT | &quot;PROCESS_IMPACT&quot; |



