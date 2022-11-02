

# Release

Contains data related to a single release of a component. A Release is a combination of a component and a version. A Component can be any form of deployable that can be associated with a version. In the first draft, a Component is always a Service.  The tuple <name, product, stage, version> is always unique.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**securityVulnerabilitiesCount** | **Integer** | The number of security vulnerabilities of the entity |  [optional] |
|**affectedByProblems** | **Boolean** | The entity has one or more problems |  [optional] |
|**securityVulnerabilitiesEnabled** | **Boolean** | Indicates that the security vulnerabilities feature is enabled |  [optional] |
|**product** | **String** | The product name |  [optional] |
|**affectedBySecurityVulnerabilities** | **Boolean** | The entity has one or more security vulnerabilities |  [optional] |
|**throughput** | **Double** | The count of bytes per second of the entity |  [optional] |
|**softwareTechs** | [**List&lt;SoftwareTechs&gt;**](SoftwareTechs.md) | The software technologies of the release |  [optional] |
|**releaseEntityId** | **String** | The entity id of correlating release. |  [optional] |
|**instances** | [**List&lt;ReleaseInstance&gt;**](ReleaseInstance.md) | The instances entityIds included in this release |  [optional] |
|**running** | **Boolean** | The related PGI is still running/monitored |  [optional] |
|**name** | **String** | The entity name |  [optional] |
|**version** | **String** | The identified release version |  [optional] |
|**problemCount** | **Integer** | The number of problems of the entity |  [optional] |
|**stage** | **String** | The stage name |  [optional] |



