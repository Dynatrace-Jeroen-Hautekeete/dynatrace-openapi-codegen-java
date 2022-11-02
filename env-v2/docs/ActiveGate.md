

# ActiveGate

Parameters of the ActiveGate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the ActiveGate. |  [optional] [readonly] |
|**networkAddresses** | **List&lt;String&gt;** | A list of network addresses of the ActiveGate. |  [optional] [readonly] |
|**loadBalancerAddresses** | **List&lt;String&gt;** | A list of Load Balancer addresses of the ActiveGate. |  [optional] [readonly] |
|**osType** | [**OsTypeEnum**](#OsTypeEnum) | The OS type that the ActiveGate is running on. |  [optional] [readonly] |
|**osArchitecture** | [**OsArchitectureEnum**](#OsArchitectureEnum) | The OS architecture that the ActiveGate is running on. |  [optional] [readonly] |
|**osBitness** | [**OsBitnessEnum**](#OsBitnessEnum) | The OS bitness that the ActiveGate is running on. |  [optional] [readonly] |
|**autoUpdateStatus** | [**AutoUpdateStatusEnum**](#AutoUpdateStatusEnum) | The current status of auto-updates of the ActiveGate. |  [optional] [readonly] |
|**offlineSince** | **Long** | The timestamp since when the ActiveGate is offline.    The &#x60;null&#x60; value means the ActiveGate is online. |  [optional] [readonly] |
|**version** | **String** | The current version of the ActiveGate in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;.&lt;timestamp&gt;&#x60; format. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the ActiveGate. |  [optional] [readonly] |
|**hostname** | **String** | The name of the host the ActiveGate is running on. |  [optional] [readonly] |
|**mainEnvironment** | **String** | The ID of the main environment for a multi-environment ActiveGate. |  [optional] [readonly] |
|**environments** | **List&lt;String&gt;** | A list of environments (specified by IDs) the ActiveGate can connect to. |  [optional] [readonly] |
|**autoUpdateSettings** | [**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md) |  |  [optional] |
|**networkZone** | **String** | The network zone of the ActiveGate. |  [optional] [readonly] |
|**group** | **String** | The group of the ActiveGate. |  [optional] [readonly] |
|**modules** | [**List&lt;ActiveGateModule&gt;**](ActiveGateModule.md) | A list of modules of the ActiveGate. |  [optional] [readonly] |
|**containerized** | **Boolean** | ActiveGate is deployed in container (&#x60;true&#x60;) or not (&#x60;false&#x60;). |  [optional] [readonly] |
|**connectedHosts** | [**ActiveGateConnectedHosts**](ActiveGateConnectedHosts.md) |  |  [optional] |
|**activeGateTokens** | [**List&lt;ActiveGateTokenInfoDto&gt;**](ActiveGateTokenInfoDto.md) | A list of the ActiveGate tokens. |  [optional] [readonly] |



## Enum: OsTypeEnum

| Name | Value |
|---- | -----|
| LINUX | &quot;LINUX&quot; |
| WINDOWS | &quot;WINDOWS&quot; |



## Enum: OsArchitectureEnum

| Name | Value |
|---- | -----|
| S390 | &quot;S390&quot; |
| X86 | &quot;X86&quot; |



## Enum: OsBitnessEnum

| Name | Value |
|---- | -----|
| _64 | &quot;64&quot; |



## Enum: AutoUpdateStatusEnum

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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| ENVIRONMENT_MULTI | &quot;ENVIRONMENT_MULTI&quot; |



