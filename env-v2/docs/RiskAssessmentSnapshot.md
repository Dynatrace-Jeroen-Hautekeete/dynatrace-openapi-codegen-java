

# RiskAssessmentSnapshot

A snapshot of the risk assessment of a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**riskLevel** | [**RiskLevelEnum**](#RiskLevelEnum) | The Davis risk level.    It is calculated by Dynatrace on the basis of CVSS score. |  [optional] [readonly] |
|**riskScore** | **Float** | The Davis risk score (1-10).    It is calculated by Dynatrace on the basis of CVSS score. |  [optional] [readonly] |
|**numberOfAffectedEntities** | **Integer** | The number of currently affected entities. |  [optional] [readonly] |
|**numberOfReachableDataAssets** | **Integer** | The number of data assets that are currently reachable by affected entities. |  [optional] [readonly] |
|**publicExploit** | [**PublicExploitEnum**](#PublicExploitEnum) | The availability status of public exploits. |  [optional] [readonly] |
|**exposure** | [**ExposureEnum**](#ExposureEnum) | The level of exposure of affected entities. |  [optional] [readonly] |
|**vulnerableFunctionUsage** | [**VulnerableFunctionUsageEnum**](#VulnerableFunctionUsageEnum) | The state of vulnerable code execution. |  [optional] [readonly] |



## Enum: RiskLevelEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| NONE | &quot;NONE&quot; |



## Enum: PublicExploitEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |



## Enum: ExposureEnum

| Name | Value |
|---- | -----|
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_DETECTED | &quot;NOT_DETECTED&quot; |
| PUBLIC_NETWORK | &quot;PUBLIC_NETWORK&quot; |



## Enum: VulnerableFunctionUsageEnum

| Name | Value |
|---- | -----|
| IN_USE | &quot;IN_USE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_IN_USE | &quot;NOT_IN_USE&quot; |



