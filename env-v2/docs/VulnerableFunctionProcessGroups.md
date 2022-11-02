

# VulnerableFunctionProcessGroups

A vulnerable function including its usage by specific process groups in context of the security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**function** | [**VulnerableFunction**](VulnerableFunction.md) |  |  [optional] |
|**usage** | [**UsageEnum**](#UsageEnum) | The vulnerable function usage based on the given process groups: * IN_USE if at least one process group calls this vulnerable function. * NOT_IN_USE if all process groups do not call this vulnerable function. * NOT_AVAILABLE if vulnerable function usage could not be calculated for at least one process group and no process group calls this vulnerable function. |  [optional] [readonly] |
|**processGroupsInUse** | **Set&lt;String&gt;** | The process group identifiers, where this vulnerable function is in use. |  [optional] [readonly] |
|**processGroupsNotInUse** | **Set&lt;String&gt;** | The process group identifiers, where this vulnerable function is not in use. |  [optional] [readonly] |
|**processGroupsNotAvailable** | **Set&lt;String&gt;** | The process group identifiers, where information about the usage of this function not available. |  [optional] [readonly] |



## Enum: UsageEnum

| Name | Value |
|---- | -----|
| IN_USE | &quot;IN_USE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_IN_USE | &quot;NOT_IN_USE&quot; |



