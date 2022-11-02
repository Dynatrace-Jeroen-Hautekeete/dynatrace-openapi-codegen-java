

# Application


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
|**fromRelationships** | [**ApplicationFromRelationships**](ApplicationFromRelationships.md) |  |  [optional] |
|**toRelationships** | [**ApplicationToRelationships**](ApplicationToRelationships.md) |  |  [optional] |
|**applicationType** | [**ApplicationTypeEnum**](#ApplicationTypeEnum) |  |  [optional] |
|**ruleAppliedPattern** | **String** |  |  [optional] |
|**applicationMatchTarget** | [**ApplicationMatchTargetEnum**](#ApplicationMatchTargetEnum) |  |  [optional] |
|**ruleAppliedMatchType** | [**RuleAppliedMatchTypeEnum**](#RuleAppliedMatchTypeEnum) |  |  [optional] |
|**managementZones** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) | The management zones that the entity is part of. |  [optional] |



## Enum: ApplicationTypeEnum

| Name | Value |
|---- | -----|
| AGENTLESS_MONITORING | &quot;AGENTLESS_MONITORING&quot; |
| AMP | &quot;AMP&quot; |
| AUTO_INJECTED | &quot;AUTO_INJECTED&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| SAAS_VENDOR | &quot;SAAS_VENDOR&quot; |



## Enum: ApplicationMatchTargetEnum

| Name | Value |
|---- | -----|
| DOMAIN | &quot;DOMAIN&quot; |
| URL | &quot;URL&quot; |



## Enum: RuleAppliedMatchTypeEnum

| Name | Value |
|---- | -----|
| ALL_URLS_AND_DOMAINS | &quot;ALL_URLS_AND_DOMAINS&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS | &quot;ENDS&quot; |
| EQUALS | &quot;EQUALS&quot; |
| MATCHES | &quot;MATCHES&quot; |
| STARTS | &quot;STARTS&quot; |



