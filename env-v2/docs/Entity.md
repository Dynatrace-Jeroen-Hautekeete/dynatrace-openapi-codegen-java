

# Entity

The properties of a monitored entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstSeenTms** | **Long** | The timestamp at which the entity was first seen, in UTC milliseconds. |  [optional] |
|**lastSeenTms** | **Long** | The timestamp at which the entity was last seen, in UTC milliseconds. |  [optional] |
|**tags** | [**Set&lt;METag&gt;**](METag.md) | A set of tags assigned to the entity. |  [optional] |
|**managementZones** | [**Set&lt;ManagementZone&gt;**](ManagementZone.md) | A set of management zones to which the entity belongs. |  [optional] |
|**entityId** | **String** | The ID of the entity. |  [optional] |
|**fromRelationships** | **Map&lt;String, List&lt;EntityId&gt;&gt;** | A list of relationships where the entity occupies the FROM position. |  [optional] |
|**toRelationships** | **Map&lt;String, List&lt;EntityId&gt;&gt;** | A list of relationships where the entity occupies the TO position. |  [optional] |
|**displayName** | **String** | The name of the entity, displayed in the UI. |  [optional] |
|**icon** | [**EntityIcon**](EntityIcon.md) |  |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | A list of additional properties of the entity. |  [optional] |
|**type** | **String** | The type of the entity. |  [optional] |



