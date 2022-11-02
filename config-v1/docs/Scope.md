

# Scope

The scope of the maintenance window.    The scope restricts the alert/problem detection suppression to certain Dynatrace entities. It can contain a list of entities and/or matching rules for dynamic formation of the scope.    If no scope is specified, the alert/problem detection suppression applies to the entire environment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entities** | **List&lt;String&gt;** | A list of Dynatrace entities (for example, hosts or services) to be included in the scope.   Allowed values are Dynatrace entity IDs. |  |
|**matches** | [**List&lt;MonitoredEntityFilter&gt;**](MonitoredEntityFilter.md) | A list of matching rules for dynamic scope formation.   If several rules are set, the OR logic applies. |  |



