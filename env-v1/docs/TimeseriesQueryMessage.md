

# TimeseriesQueryMessage

Filtering parameters for a timeseries query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeseriesId** | **String** | The case-sensitive ID of the metric, where you want to read data points.   You can execute a GET timeseries request, to obtain the list of available metrics. |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | The aggregation type for the resulting data points.   If the requested metric doesn&#39;t support the specified aggregation, the request will result in an error. |  [optional] |
|**startTimestamp** | **Long** | The start timestamp of the timeframe, in UTC milliseconds. |  [optional] |
|**endTimestamp** | **Long** | The start timestamp of the timeframe, in UTC milliseconds.   If later than the current time, Dynatrace automatically uses current time instead.   The timeframe must not exceed 6 months. |  [optional] |
|**predict** | **Boolean** | The flag to predict future data points. |  [optional] |
|**relativeTime** | [**RelativeTimeEnum**](#RelativeTimeEnum) | The relative timeframe, back from the current time. |  [optional] |
|**queryMode** | [**QueryModeEnum**](#QueryModeEnum) | Defines the type of result that the call should return. Valid result modes are:  &#x60;series&#x60;: returns all the data points of the metric in the specified timeframe.  &#x60;total&#x60;: returns one scalar value for the specified timeframe.   By default, the &#x60;series&#x60; mode is used. |  [optional] |
|**entities** | **Set&lt;String&gt;** | Filters requested data points by entities which should deliver them. You can specify several entities at once.   Allowed values are Dynatrace entity IDs.   If the selected entity doesn&#39;t support the requested metric, the request will result in an error. |  [optional] |
|**tags** | **Set&lt;String&gt;** | Filters requiested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: &#x60;tags&#x3D;tag1&amp;tags&#x3D;tag2&#x60;. The entity has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;. |  [optional] |
|**filters** | **Map&lt;String, String&gt;** | A filter is an object, containing map of filter keys and its values. Valid filter keys are:   &#x60;processType&#x60;: Filters by process type. See Process types for allowed values. &#x60;osType&#x60;: Filters by operating system. See OS types for allowed values. &#x60;serviceType&#x60;: Filters by service type. See Service types for allowed values. &#x60;technology&#x60;: Filters by technology type. See Technology types for allowed values. &#x60;webServiceName&#x60;: Filters by web service name. &#x60;webServiceNamespace&#x60;: Filters by the web service namespace. &#x60;host&#x60;: Filters by entity ID of the host, for example HOST-007. |  [optional] |
|**percentile** | **Integer** | Specifies which percentile of the selected response time metric should be delivered.  Only applicable to the &#x60;PERCENTILE&#x60; aggregation type.   Valid values for percentile are between 1 and 99.   Please keep in mind that percentile export is only possible for response-time based metrics such as application and service response times. |  [optional] |
|**includeParentIds** | **Boolean** | Specifies whether the results should exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001 |  [optional] |
|**considerMaintenanceWindowsForAvailability** | **Boolean** | Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment. |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| AVG | &quot;AVG&quot; |
| COUNT | &quot;COUNT&quot; |
| MAX | &quot;MAX&quot; |
| MEDIAN | &quot;MEDIAN&quot; |
| MIN | &quot;MIN&quot; |
| PERCENTILE | &quot;PERCENTILE&quot; |
| SUM | &quot;SUM&quot; |



## Enum: RelativeTimeEnum

| Name | Value |
|---- | -----|
| _10MINS | &quot;10mins&quot; |
| _15MINS | &quot;15mins&quot; |
| _2HOURS | &quot;2hours&quot; |
| _30MINS | &quot;30mins&quot; |
| _3DAYS | &quot;3days&quot; |
| _5MINS | &quot;5mins&quot; |
| _6HOURS | &quot;6hours&quot; |
| DAY | &quot;day&quot; |
| HOUR | &quot;hour&quot; |
| MIN | &quot;min&quot; |
| MONTH | &quot;month&quot; |
| WEEK | &quot;week&quot; |



## Enum: QueryModeEnum

| Name | Value |
|---- | -----|
| SERIES | &quot;SERIES&quot; |
| TOTAL | &quot;TOTAL&quot; |



