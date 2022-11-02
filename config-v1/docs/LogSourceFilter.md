

# LogSourceFilter

Configuration of the log filter for a custom log metric.   If several criteria are specified, the AND logic applies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pathDefinitions** | [**List&lt;PathDefinition&gt;**](PathDefinition.md) | A list of filtering criteria for log path.   If several criteria are specified, the OR logic applies. |  [optional] |
|**sourceEntities** | **List&lt;String&gt;** | A list of Dynatrace entities, where the log can originate from. Specify Dynatrace entity IDs here.    Allowed types of entities are &#x60;PROCESS_GROUP&#x60; and &#x60;PROCESS_GROUP_INSTANCE&#x60;. You can&#39;t mix entity types.   If several entities are specified, the OR logic applies.   This field is mutually exclusive with the **osTypes** field. |  [optional] |
|**hostFilters** | **List&lt;String&gt;** | A list of hosts, where the log can originate from. Specify Dynatrace entity IDs here.   If several hosts are specified, the OR logic applies. |  [optional] |
|**osTypes** | [**List&lt;OsTypesEnum&gt;**](#List&lt;OsTypesEnum&gt;) | A list of operating system types, where the log can originate from.   If set, **only OS logs** are included in the result.   If several OS are specified, the OR logic applies.   This field is mutually exclusive with the **sourceEntities** field. |  [optional] |



## Enum: List&lt;OsTypesEnum&gt;

| Name | Value |
|---- | -----|
| AIX | &quot;AIX&quot; |
| DARWIN | &quot;DARWIN&quot; |
| HPUX | &quot;HPUX&quot; |
| LINUX | &quot;LINUX&quot; |
| SOLARIS | &quot;SOLARIS&quot; |
| WINDOWS | &quot;WINDOWS&quot; |
| ZOS | &quot;ZOS&quot; |



