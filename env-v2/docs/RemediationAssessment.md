

# RemediationAssessment

Assessment of the remediation item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exposure** | [**ExposureEnum**](#ExposureEnum) | The level of exposure of affected entities. |  [optional] [readonly] |
|**dataAssets** | [**DataAssetsEnum**](#DataAssetsEnum) | The reachability of related data assets by affected entities. |  [optional] [readonly] |
|**numberOfDataAssets** | **Long** | The number of related data assets. |  [optional] [readonly] |
|**vulnerableFunctionUsage** | [**VulnerableFunctionUsageEnum**](#VulnerableFunctionUsageEnum) | The usage of vulnerable functions |  [optional] [readonly] |
|**vulnerableFunctionsInUse** | [**Set&lt;VulnerableFunction&gt;**](VulnerableFunction.md) | A list of vulnerable functions that are in use. |  [optional] [readonly] |
|**vulnerableFunctionsNotInUse** | [**Set&lt;VulnerableFunction&gt;**](VulnerableFunction.md) | A list of vulnerable functions that are not in use. |  [optional] [readonly] |
|**vulnerableFunctionsNotAvailable** | [**Set&lt;VulnerableFunction&gt;**](VulnerableFunction.md) | A list of vulnerable functions that are not available. |  [optional] [readonly] |



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



## Enum: VulnerableFunctionUsageEnum

| Name | Value |
|---- | -----|
| IN_USE | &quot;IN_USE&quot; |
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; |
| NOT_IN_USE | &quot;NOT_IN_USE&quot; |



