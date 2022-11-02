

# RiskAssessment

Risk assessment of a security problem.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**riskLevel** | [**RiskLevelEnum**](#RiskLevelEnum) | The Davis risk level.    It is calculated by Dynatrace on the basis of CVSS score. |  [optional] [readonly] |
|**riskScore** | **Float** | The Davis risk score (1-10).    It is calculated by Dynatrace on the basis of CVSS score. |  [optional] [readonly] |
|**riskVector** | **String** | The attack vector calculated by Dynatrace based on the CVSS attack vector. |  [optional] [readonly] |
|**baseRiskLevel** | [**BaseRiskLevelEnum**](#BaseRiskLevelEnum) | The risk level from the CVSS score. |  [optional] [readonly] |
|**baseRiskScore** | **Float** | The risk score (1-10) from the CVSS score. |  [optional] [readonly] |
|**baseRiskVector** | **String** | The original attack vector of the CVSS assessment. |  [optional] [readonly] |
|**exposure** | [**ExposureEnum**](#ExposureEnum) | The level of exposure of affected entities. |  [optional] [readonly] |
|**dataAssets** | [**DataAssetsEnum**](#DataAssetsEnum) | The reachability of related data assets by affected entities. |  [optional] [readonly] |
|**publicExploit** | [**PublicExploitEnum**](#PublicExploitEnum) | The availability status of public exploits. |  [optional] [readonly] |
|**vulnerableFunctionUsage** | [**VulnerableFunctionUsageEnum**](#VulnerableFunctionUsageEnum) | The state of vulnerable code execution. |  [optional] [readonly] |
|**assessmentAccuracy** | [**AssessmentAccuracyEnum**](#AssessmentAccuracyEnum) | The level of available information on which this assessment has been done. |  [optional] [readonly] |



## Enum: RiskLevelEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| NONE | &quot;NONE&quot; |



## Enum: BaseRiskLevelEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| NONE | &quot;NONE&quot; |



## Enum: ExposureEnum

| Name | Value |
|---- | -----|
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_DETECTED | &quot;NOT_DETECTED&quot; |
| PUBLIC_NETWORK | &quot;PUBLIC_NETWORK&quot; |



## Enum: DataAssetsEnum

| Name | Value |
|---- | -----|
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_DETECTED | &quot;NOT_DETECTED&quot; |
| REACHABLE | &quot;REACHABLE&quot; |



## Enum: PublicExploitEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |



## Enum: VulnerableFunctionUsageEnum

| Name | Value |
|---- | -----|
| IN_USE | &quot;IN_USE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_IN_USE | &quot;NOT_IN_USE&quot; |



## Enum: AssessmentAccuracyEnum

| Name | Value |
|---- | -----|
| FULL | &quot;FULL&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| REDUCED | &quot;REDUCED&quot; |



