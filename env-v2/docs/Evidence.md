

# Evidence

An evidence of a root cause.    The actual set of fields depends on the type of the evidence. Find the list of actual objects in the description of the **evidenceType** field or see [Problems API v2 - JSON models](https://dt-url.net/we03sp2).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceType** | [**EvidenceTypeEnum**](#EvidenceTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;EVENT&#x60; -&gt; EventEvidence  * &#x60;METRIC&#x60; -&gt; MetricEvidence  * &#x60;TRANSACTIONAL&#x60; -&gt; TransactionalEvidence  * &#x60;MAINTENANCE_WINDOW&#x60; -&gt; MaintenanceWindowEvidence  * &#x60;AVAILABILITY_EVIDENCE&#x60; -&gt; AvailabilityEvidence   |  |
|**displayName** | **String** | The display name of the evidence. |  |
|**entity** | [**EntityStub**](EntityStub.md) |  |  |
|**groupingEntity** | [**EntityStub**](EntityStub.md) |  |  [optional] |
|**rootCauseRelevant** | **Boolean** | The evidence is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) a part of the root cause. |  |
|**startTime** | **Long** | The start time of the evidence, in UTC milliseconds. |  |



## Enum: EvidenceTypeEnum

| Name | Value |
|---- | -----|
| AVAILABILITY_EVIDENCE | &quot;AVAILABILITY_EVIDENCE&quot; |
| EVENT | &quot;EVENT&quot; |
| MAINTENANCE_WINDOW | &quot;MAINTENANCE_WINDOW&quot; |
| METRIC | &quot;METRIC&quot; |
| TRANSACTIONAL | &quot;TRANSACTIONAL&quot; |



