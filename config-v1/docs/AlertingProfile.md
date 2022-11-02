

# AlertingProfile

Configuration of an alerting profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the alerting profile. |  [optional] |
|**displayName** | **String** | The name of the alerting profile, displayed in the UI. |  |
|**rules** | [**List&lt;AlertingProfileSeverityRule&gt;**](AlertingProfileSeverityRule.md) | A list of severity rules.    The rules are evaluated from top to bottom. The first matching rule applies and further evaluation stops.   If you specify both severity rule and event filter, the AND logic applies. |  [optional] |
|**mzId** | **String** | The ID of the management zone to which the alerting profile applies. |  [optional] |
|**eventTypeFilters** | [**List&lt;AlertingEventTypeFilter&gt;**](AlertingEventTypeFilter.md) | The list of event filters.   For all filters that are *negated* inside of these event filters, that is all \&quot;Predefined\&quot; as well as \&quot;Custom\&quot; (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.   If you specify both severity rule and event filter, the AND logic applies. |  [optional] |



