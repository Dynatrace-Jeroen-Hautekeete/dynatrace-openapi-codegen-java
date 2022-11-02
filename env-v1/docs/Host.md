

# Host

Information about the host.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | The Dynatrace entity ID of the required entity. |  [optional] |
|**displayName** | **String** | The name of the Dynatrace entity as displayed in the UI. |  [optional] |
|**customizedName** | **String** | The customized name of the entity |  [optional] |
|**discoveredName** | **String** | The discovered name of the entity |  [optional] |
|**firstSeenTimestamp** | **Long** | The timestamp of when the entity was first detected, in UTC milliseconds |  [optional] |
|**lastSeenTimestamp** | **Long** | The timestamp of when the entity was last detected, in UTC milliseconds |  [optional] |
|**tags** | [**Set&lt;TagInfo&gt;**](TagInfo.md) | The list of entity tags. |  [optional] |
|**fromRelationships** | [**HostFromRelationships**](HostFromRelationships.md) |  |  [optional] |
|**toRelationships** | [**HostToRelationships**](HostToRelationships.md) |  |  [optional] |
|**osArchitecture** | [**OsArchitectureEnum**](#OsArchitectureEnum) |  |  [optional] |
|**zosSystemName** | **String** | Name of the system. |  [optional] |
|**autoScalingGroup** | **String** |  |  [optional] |
|**agentVersion** | [**AgentVersion**](AgentVersion.md) |  |  [optional] |
|**openstackProjectName** | **String** |  |  [optional] |
|**monitoringMode** | [**MonitoringModeEnum**](#MonitoringModeEnum) |  |  [optional] |
|**esxiHostName** | **String** |  |  [optional] |
|**softwareTechnologies** | [**List&lt;TechnologyInfo&gt;**](TechnologyInfo.md) |  |  [optional] |
|**azureEnvironment** | **String** |  |  [optional] |
|**boshStemcellVersion** | **String** | The Cloud Foundry BOSH stemcell version. |  [optional] |
|**amiId** | **String** |  |  [optional] |
|**openStackInstaceType** | **String** |  |  [optional] |
|**zosTotalZiipProcessors** | **Integer** | Number of assigned support processors for this LPAR. |  [optional] |
|**hostGroup** | [**HostGroup**](HostGroup.md) |  |  [optional] |
|**ipAddresses** | **List&lt;String&gt;** |  |  [optional] |
|**isMonitoringCandidate** | **Boolean** |  |  [optional] |
|**awsInstanceId** | **String** |  |  [optional] |
|**localIp** | **String** |  |  [optional] |
|**paasAgentVersions** | [**List&lt;AgentVersion&gt;**](AgentVersion.md) | The versions of the PaaS agents currently running on the entity. |  [optional] |
|**virtualCpus** | **Integer** | The AIX instance virtual CPU count. |  [optional] |
|**gcpZone** | **String** | The Google Cloud Platform Zone. |  [optional] |
|**azureResourceGroupName** | **String** |  |  [optional] |
|**boshName** | **String** | The Cloud Foundry BOSH name. |  [optional] |
|**boshInstanceName** | **String** | The Cloud Foundry BOSH instance name. |  [optional] |
|**oneAgentCustomHostName** | **String** | The custom name defined in OneAgent config. |  [optional] |
|**kubernetesNode** | **String** | The kubernetes node the entity is in. |  [optional] |
|**azureSku** | [**AzureSkuEnum**](#AzureSkuEnum) |  |  [optional] |
|**managementZones** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) | The management zones that the entity is part of. |  [optional] |
|**publicIp** | **String** |  |  [optional] |
|**azureVmSizeLabel** | **String** |  |  [optional] |
|**zosCPUModelNumber** | **String** | The CPU model number. |  [optional] |
|**autoInjection** | [**AutoInjectionEnum**](#AutoInjectionEnum) | Status of auto-injection |  [optional] |
|**awsSecurityGroup** | **List&lt;String&gt;** |  |  [optional] |
|**openstackSecurityGroups** | **List&lt;String&gt;** |  |  [optional] |
|**azureZone** | **String** |  |  [optional] |
|**paasType** | [**PaasTypeEnum**](#PaasTypeEnum) |  |  [optional] |
|**networkZoneId** | **String** | The ID of network zone the entity is in. |  [optional] |
|**cloudPlatformVendorVersion** | **String** | Defines the cloud platform vendor version. |  [optional] |
|**awsInstanceType** | **String** |  |  [optional] |
|**zosTotalPhysicalMemory** | **Integer** | Memory assigned to the host (Terabyte). |  [optional] |
|**openstackComputeNodeName** | **String** |  |  [optional] |
|**scaleSetName** | **String** |  |  [optional] |
|**osType** | [**OsTypeEnum**](#OsTypeEnum) |  |  [optional] |
|**gceInstanceId** | **String** | The Google Compute Engine instance ID. |  [optional] |
|**userLevel** | [**UserLevelEnum**](#UserLevelEnum) |  |  [optional] |
|**beanstalkEnvironmentName** | **String** |  |  [optional] |
|**boshDeploymentId** | **String** | The Cloud Foundry BOSH deployment ID. |  [optional] |
|**osVersion** | **String** |  |  [optional] |
|**openstackVmName** | **String** |  |  [optional] |
|**azureVmName** | **String** |  |  [optional] |
|**kubernetesLabels** | **Map&lt;String, Object&gt;** | The kubernetes labels defined on the entity. |  [optional] |
|**localHostName** | **String** |  |  [optional] |
|**azureVmScaleSetName** | **String** |  |  [optional] |
|**boshAvailabilityZone** | **String** | The Cloud Foundry BOSH availability zone. |  [optional] |
|**kubernetesCluster** | **String** | The kubernetes cluster the entity is in. |  [optional] |
|**openstackAvZone** | **String** |  |  [optional] |
|**vmwareName** | **String** |  |  [optional] |
|**azureHostNames** | **List&lt;String&gt;** |  |  [optional] |
|**azureResourceId** | **String** |  |  [optional] |
|**azureComputeModeName** | [**AzureComputeModeNameEnum**](#AzureComputeModeNameEnum) |  |  [optional] |
|**azureSiteNames** | **List&lt;String&gt;** |  |  [optional] |
|**awsNameTag** | **String** | The name inherited from AWS. |  [optional] |
|**gceProjectId** | **String** | The Google Compute Engine numeric project ID. |  [optional] |
|**logicalCpus** | **Integer** | The AIX instance logical CPU count. |  [optional] |
|**zosTotalGeneralPurposeProcessors** | **Integer** | Number of assigned processors for this LPAR. |  [optional] |
|**cloudType** | [**CloudTypeEnum**](#CloudTypeEnum) |  |  [optional] |
|**paasMemoryLimit** | **Long** |  |  [optional] |
|**zosCPUSerialNumber** | **String** | The CPU serial number. |  [optional] |
|**zosVirtualization** | **String** | Type of virtualization on the mainframe. |  [optional] |
|**hypervisorType** | [**HypervisorTypeEnum**](#HypervisorTypeEnum) |  |  [optional] |
|**cpuCores** | **Integer** |  |  [optional] |
|**bitness** | [**BitnessEnum**](#BitnessEnum) |  |  [optional] |
|**zosLpaName** | **String** | Name of the LPAR. |  [optional] |
|**gceInstanceName** | **String** | The Google Compute Engine instance name. |  [optional] |
|**simultaneousMultithreading** | **Integer** | The AIX instance simultaneous threads count. |  [optional] |
|**logicalCpuCores** | **Integer** |  |  [optional] |
|**gceMachineType** | **String** | The Google Compute Engine machine type. |  [optional] |
|**gceProject** | **String** | The Google Compute Engine project. |  [optional] |
|**boshInstanceId** | **String** | The Cloud Foundry BOSH instance ID. |  [optional] |
|**publicHostName** | **String** |  |  [optional] |
|**gcePublicIpAddresses** | **List&lt;String&gt;** | The public IP addresses of the Google Compute Engine. |  [optional] |
|**consumedHostUnits** | **String** |  |  [optional] |



## Enum: OsArchitectureEnum

| Name | Value |
|---- | -----|
| ARM | &quot;ARM&quot; |
| IA64 | &quot;IA64&quot; |
| PARISC | &quot;PARISC&quot; |
| PPC | &quot;PPC&quot; |
| PPCLE | &quot;PPCLE&quot; |
| S390 | &quot;S390&quot; |
| SPARC | &quot;SPARC&quot; |
| X86 | &quot;X86&quot; |
| ZOS | &quot;ZOS&quot; |



## Enum: MonitoringModeEnum

| Name | Value |
|---- | -----|
| FULL_STACK | &quot;FULL_STACK&quot; |
| INFRASTRUCTURE | &quot;INFRASTRUCTURE&quot; |
| OFF | &quot;OFF&quot; |



## Enum: AzureSkuEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;BASIC&quot; |
| DYNAMIC | &quot;DYNAMIC&quot; |
| FREE | &quot;FREE&quot; |
| PREMIUM | &quot;PREMIUM&quot; |
| SHARED | &quot;SHARED&quot; |
| STANDARD | &quot;STANDARD&quot; |



## Enum: AutoInjectionEnum

| Name | Value |
|---- | -----|
| DISABLED_MANUALLY | &quot;DISABLED_MANUALLY&quot; |
| DISABLED_ON_INSTALLATION | &quot;DISABLED_ON_INSTALLATION&quot; |
| DISABLED_ON_SANITY_CHECK | &quot;DISABLED_ON_SANITY_CHECK&quot; |
| ENABLED | &quot;ENABLED&quot; |
| FAILED_ON_INSTALLATION | &quot;FAILED_ON_INSTALLATION&quot; |



## Enum: PaasTypeEnum

| Name | Value |
|---- | -----|
| AWS_ECS_EC2 | &quot;AWS_ECS_EC2&quot; |
| AWS_ECS_FARGATE | &quot;AWS_ECS_FARGATE&quot; |
| AWS_LAMBDA | &quot;AWS_LAMBDA&quot; |
| AZURE_FUNCTIONS | &quot;AZURE_FUNCTIONS&quot; |
| AZURE_WEBSITES | &quot;AZURE_WEBSITES&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| GOOGLE_APP_ENGINE | &quot;GOOGLE_APP_ENGINE&quot; |
| HEROKU | &quot;HEROKU&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| OPENSHIFT | &quot;OPENSHIFT&quot; |



## Enum: OsTypeEnum

| Name | Value |
|---- | -----|
| AIX | &quot;AIX&quot; |
| DARWIN | &quot;DARWIN&quot; |
| HPUX | &quot;HPUX&quot; |
| LINUX | &quot;LINUX&quot; |
| SOLARIS | &quot;SOLARIS&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| ZOS | &quot;ZOS&quot; |



## Enum: UserLevelEnum

| Name | Value |
|---- | -----|
| NON_SUPERUSER | &quot;NON_SUPERUSER&quot; |
| NON_SUPERUSER_STRICT | &quot;NON_SUPERUSER_STRICT&quot; |
| SUPERUSER | &quot;SUPERUSER&quot; |



## Enum: AzureComputeModeNameEnum

| Name | Value |
|---- | -----|
| DEDICATED | &quot;DEDICATED&quot; |
| SHARED | &quot;SHARED&quot; |



## Enum: CloudTypeEnum

| Name | Value |
|---- | -----|
| AZURE | &quot;AZURE&quot; |
| EC2 | &quot;EC2&quot; |
| GOOGLE_CLOUD_PLATFORM | &quot;GOOGLE_CLOUD_PLATFORM&quot; |
| OPENSTACK | &quot;OPENSTACK&quot; |
| ORACLE | &quot;ORACLE&quot; |
| UNRECOGNIZED | &quot;UNRECOGNIZED&quot; |



## Enum: HypervisorTypeEnum

| Name | Value |
|---- | -----|
| AHV | &quot;AHV&quot; |
| AWS_NITRO | &quot;AWS_NITRO&quot; |
| HYPERV | &quot;HYPERV&quot; |
| KVM | &quot;KVM&quot; |
| LPAR | &quot;LPAR&quot; |
| QEMU | &quot;QEMU&quot; |
| UNRECOGNIZED | &quot;UNRECOGNIZED&quot; |
| VIRTUALBOX | &quot;VIRTUALBOX&quot; |
| VMWARE | &quot;VMWARE&quot; |
| WPAR | &quot;WPAR&quot; |
| XEN | &quot;XEN&quot; |



## Enum: BitnessEnum

| Name | Value |
|---- | -----|
| _32BIT | &quot;32bit&quot; |
| _64BIT | &quot;64bit&quot; |



