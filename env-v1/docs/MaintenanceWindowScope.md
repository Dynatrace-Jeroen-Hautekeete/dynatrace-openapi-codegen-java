

# MaintenanceWindowScope

An object defining the scope of your maintenance window.   You can specify particular Dynatrace entities or matching rules for dynamic formation of the scope.    If no scope is specified, the maintenance applies to the entire environment.    To specify the scope at least one entity or matching rule must be specified.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entities** | **Set&lt;String&gt;** | Defines Dynatrace entities to be included in scope, for example hosts, services, process groups.   Allowed values are Dynatrace entity IDs. |  [optional] |
|**matches** | [**Set&lt;MonitoredEntityFilter&gt;**](MonitoredEntityFilter.md) | An object defining a matching rule for dynamic scope formation. An empty rule matches for all entities. |  [optional] |



