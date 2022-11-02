

# PushEventAttachRules

The set of rules defining Dynatrace entities to be associated with the event.  You can specify tags to dynamically match Dynatrace entities or IDs of specific entities.  At least one entity ID or tag is required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityIds** | **List&lt;String&gt;** | A list of entity IDs to which the event should be attached. |  [optional] |
|**tagRule** | [**List&lt;TagMatchRule&gt;**](TagMatchRule.md) | A set of matching rules to dynamically pick up entities based on tags.   Only entities seen within the last **24 hours** are taken into account for tag-based matching rules. |  [optional] |



