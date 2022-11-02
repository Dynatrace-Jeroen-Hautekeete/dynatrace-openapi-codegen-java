

# RequestNaming

The request naming rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the request naming rule. |  [optional] |
|**order** | **String** | The order string. Sorting request namings alphabetically by their order string determines their relative ordering.  Typically this is managed by Dynatrace internally and will not be present in GET responses nor used if present in PUT/POST requests, except where noted otherwise. |  [optional] |
|**enabled** | **Boolean** | The rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**namingPattern** | **String** | The name to be assigned to matching requests. |  |
|**managementZones** | **List&lt;String&gt;** | Specifies the management zones for which this rule should be applied. |  [optional] |
|**conditions** | [**List&lt;Condition&gt;**](Condition.md) | The set of conditions for the request naming rule usage.    You can specify several conditions. The request has to match **all** the specified conditions for the rule to trigger. |  |
|**placeholders** | [**List&lt;Placeholder&gt;**](Placeholder.md) | The list of custom placeholders to be used in the naming pattern.    It enables you to extract a request attribute value or other request attribute and use it in the request naming pattern. |  [optional] |



