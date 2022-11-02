

# SecurityProblemDetails

Parameters of a security problem

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**securityProblemId** | **String** | The ID of the security problem. |  [optional] [readonly] |
|**displayId** | **String** | The display ID of the security problem. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the security problem. |  [optional] [readonly] |
|**muted** | **Boolean** | The security problem is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) muted. |  [optional] [readonly] |
|**externalVulnerabilityId** | **String** | The external vulnerability ID of the security problem. |  [optional] [readonly] |
|**vulnerabilityType** | [**VulnerabilityTypeEnum**](#VulnerabilityTypeEnum) | The type of the vulnerability. |  [optional] [readonly] |
|**title** | **String** | The title of the security problem. |  [optional] [readonly] |
|**packageName** | **String** | The package name of the security problem. |  [optional] [readonly] |
|**url** | **String** | The URL to the security problem details page. |  [optional] [readonly] |
|**description** | **String** | The description of the security problem. |  [optional] [readonly] |
|**technology** | [**TechnologyEnum**](#TechnologyEnum) | The technology of the security problem. |  [optional] [readonly] |
|**firstSeenTimestamp** | **Long** | The timestamp of the first occurrence of the security problem. |  [optional] [readonly] |
|**lastUpdatedTimestamp** | **Long** | The timestamp of the most recent security problem change. |  [optional] [readonly] |
|**riskAssessment** | [**RiskAssessment**](RiskAssessment.md) |  |  [optional] |
|**managementZones** | [**List&lt;ManagementZone&gt;**](ManagementZone.md) | A list of management zones which the affected entities belong to. |  [optional] [readonly] |
|**cveIds** | **List&lt;String&gt;** | A list of CVE IDs of the security problem. |  [optional] [readonly] |
|**codeLevelVulnerabilityDetails** | [**CodeLevelVulnerabilityDetails**](CodeLevelVulnerabilityDetails.md) |  |  [optional] |
|**events** | [**List&lt;SecurityProblemEvent&gt;**](SecurityProblemEvent.md) | An ordered (newest first) list of events of the security problem. |  [optional] |
|**vulnerableComponents** | [**List&lt;VulnerableComponent&gt;**](VulnerableComponent.md) | A list of vulnerable components of the security problem.   A vulnerable component is what causes the security problem. |  [optional] [readonly] |
|**affectedEntities** | **List&lt;String&gt;** | A list of affected entities of the security problem.   An affected entity is an entity where a vulnerable component runs. |  [optional] [readonly] |
|**exposedEntities** | **List&lt;String&gt;** | A list of exposed entities of the security problem.   An exposed entity is an affected entity that is exposed to the internet. |  [optional] [readonly] |
|**reachableDataAssets** | **List&lt;String&gt;** | A list of data assets reachable by affected entities of the security problem.   A data asset is a service that has database access. |  [optional] [readonly] |
|**relatedEntities** | [**RelatedEntitiesList**](RelatedEntitiesList.md) |  |  [optional] |
|**relatedContainerImages** | [**List&lt;SecurityProblemDetailsRelatedContainerImagesInner&gt;**](SecurityProblemDetailsRelatedContainerImagesInner.md) | A list of related container images of the security problem.   A related container image is a container image that contains at least one *affected entity*. |  [optional] [readonly] |
|**relatedAttacks** | [**RelatedAttacksList**](RelatedAttacksList.md) |  |  [optional] |
|**muteStateChangeInProgress** | **Boolean** | If &#x60;true&#x60; a change of the mute state is in progress. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: VulnerabilityTypeEnum

| Name | Value |
|---- | -----|
| CODE_LEVEL | &quot;CODE_LEVEL&quot; |
| RUNTIME | &quot;RUNTIME&quot; |
| THIRD_PARTY | &quot;THIRD_PARTY&quot; |



## Enum: TechnologyEnum

| Name | Value |
|---- | -----|
| DOTNET | &quot;DOTNET&quot; |
| GO | &quot;GO&quot; |
| JAVA | &quot;JAVA&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| NODE_JS | &quot;NODE_JS&quot; |
| PHP | &quot;PHP&quot; |



