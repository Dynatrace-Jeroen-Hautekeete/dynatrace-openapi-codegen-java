

# Tile

Configuration of a tile.   The actual set of fields depends on the type of the tile. Find the list of actual objects in the description of the **tileType** field or see [Dashboards API - Tile JSON models](https://dt-url.net/2wc3spx).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the tile. |  |
|**nameSize** | [**NameSizeEnum**](#NameSizeEnum) | The size of the tile name. Default value is null. |  [optional] |
|**tileType** | [**TileTypeEnum**](#TileTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;DATA_EXPLORER&#x60; -&gt; DataExplorerTile  * &#x60;CUSTOM_CHARTING&#x60; -&gt; CustomChartingTile  * &#x60;DTAQL&#x60; -&gt; UserSessionQueryTile  * &#x60;MARKDOWN&#x60; -&gt; MarkdownTile  * &#x60;IMAGE&#x60; -&gt; ImageTile  * &#x60;HOSTS&#x60; -&gt; FilterableEntityTile  * &#x60;APPLICATIONS&#x60; -&gt; FilterableEntityTile  * &#x60;SERVICES&#x60; -&gt; FilterableEntityTile  * &#x60;DATABASES_OVERVIEW&#x60; -&gt; FilterableEntityTile  * &#x60;SYNTHETIC_TESTS&#x60; -&gt; FilterableEntityTile  * &#x60;APPLICATION_WORLDMAP&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;RESOURCES&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;THIRD_PARTY_MOST_ACTIVE&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;UEM_CONVERSIONS_PER_GOAL&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;HOST&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;PROCESS_GROUPS_ONE&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;SYNTHETIC_SINGLE_WEBCHECK&#x60; -&gt; SyntheticSingleWebcheckTile  * &#x60;APPLICATION&#x60; -&gt; AssignedEntitiesTile  * &#x60;VIRTUALIZATION&#x60; -&gt; AssignedEntitiesTile  * &#x60;AWS&#x60; -&gt; AssignedEntitiesTile  * &#x60;SERVICE_VERSATILE&#x60; -&gt; AssignedEntitiesTile  * &#x60;SESSION_METRICS&#x60; -&gt; AssignedEntitiesTile  * &#x60;USERS&#x60; -&gt; AssignedEntitiesTile  * &#x60;UEM_KEY_USER_ACTIONS&#x60; -&gt; AssignedEntitiesTile  * &#x60;BOUNCE_RATE&#x60; -&gt; AssignedEntitiesTile  * &#x60;UEM_CONVERSIONS_OVERALL&#x60; -&gt; AssignedEntitiesTile  * &#x60;UEM_JSERRORS_OVERALL&#x60; -&gt; AssignedEntitiesTile  * &#x60;MOBILE_APPLICATION&#x60; -&gt; AssignedEntitiesTile  * &#x60;SYNTHETIC_SINGLE_EXT_TEST&#x60; -&gt; AssignedEntitiesTile  * &#x60;SYNTHETIC_HTTP_MONITOR&#x60; -&gt; AssignedEntitiesTile  * &#x60;DATABASE&#x60; -&gt; AssignedEntitiesTile  * &#x60;CUSTOM_APPLICATION&#x60; -&gt; AssignedEntitiesTile  * &#x60;APPLICATION_METHOD&#x60; -&gt; AssignedEntitiesTile  * &#x60;LOG_ANALYTICS&#x60; -&gt; AssignedEntitiesTile  * &#x60;OPENSTACK&#x60; -&gt; AssignedEntitiesTile  * &#x60;OPENSTACK_PROJECT&#x60; -&gt; AssignedEntitiesTile  * &#x60;OPENSTACK_AV_ZONE&#x60; -&gt; AssignedEntitiesTile  * &#x60;DEVICE_APPLICATION_METHOD&#x60; -&gt; AssignedEntitiesTile  * &#x60;DEM_KEY_USER_ACTION&#x60; -&gt; AssignedEntitiesTile  * &#x60;SLO&#x60; -&gt; AssignedEntitiesWithMetricTile  * &#x60;SCALABLE_LIST&#x60; -&gt; ScalableListTile  * &#x60;HEADER&#x60; -&gt; Tile  * &#x60;OPEN_PROBLEMS&#x60; -&gt; ProblemTile  * &#x60;PURE_MODEL&#x60; -&gt; Tile  * &#x60;DOCKER&#x60; -&gt; Tile  * &#x60;NETWORK_MEDIUM&#x60; -&gt; Tile  * &#x60;APPLICATIONS_MOST_ACTIVE&#x60; -&gt; Tile  * &#x60;NETWORK&#x60; -&gt; Tile  * &#x60;UEM_ACTIVE_SESSIONS&#x60; -&gt; Tile  * &#x60;DCRUM_SERVICES&#x60; -&gt; Tile   |  |
|**configured** | **Boolean** | The tile is configured and ready to use (&#x60;true&#x60;) or just placed on the dashboard (&#x60;false&#x60;). |  [optional] |
|**bounds** | [**TileBounds**](TileBounds.md) |  |  |
|**tileFilter** | [**TileFilter**](TileFilter.md) |  |  [optional] |



## Enum: NameSizeEnum

| Name | Value |
|---- | -----|
| SMALL | &quot;small&quot; |
| MEDIUM | &quot;medium&quot; |
| LARGE | &quot;large&quot; |



## Enum: TileTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| APPLICATIONS | &quot;APPLICATIONS&quot; |
| APPLICATIONS_MOST_ACTIVE | &quot;APPLICATIONS_MOST_ACTIVE&quot; |
| APPLICATION_METHOD | &quot;APPLICATION_METHOD&quot; |
| APPLICATION_WORLDMAP | &quot;APPLICATION_WORLDMAP&quot; |
| AWS | &quot;AWS&quot; |
| BOUNCE_RATE | &quot;BOUNCE_RATE&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| CUSTOM_CHARTING | &quot;CUSTOM_CHARTING&quot; |
| DATABASE | &quot;DATABASE&quot; |
| DATABASES_OVERVIEW | &quot;DATABASES_OVERVIEW&quot; |
| DATA_EXPLORER | &quot;DATA_EXPLORER&quot; |
| DCRUM_SERVICES | &quot;DCRUM_SERVICES&quot; |
| DEM_KEY_USER_ACTION | &quot;DEM_KEY_USER_ACTION&quot; |
| DEVICE_APPLICATION_METHOD | &quot;DEVICE_APPLICATION_METHOD&quot; |
| DOCKER | &quot;DOCKER&quot; |
| DTAQL | &quot;DTAQL&quot; |
| HEADER | &quot;HEADER&quot; |
| HOST | &quot;HOST&quot; |
| HOSTS | &quot;HOSTS&quot; |
| IMAGE | &quot;IMAGE&quot; |
| LOG_ANALYTICS | &quot;LOG_ANALYTICS&quot; |
| MARKDOWN | &quot;MARKDOWN&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |
| NETWORK | &quot;NETWORK&quot; |
| NETWORK_MEDIUM | &quot;NETWORK_MEDIUM&quot; |
| OPENSTACK | &quot;OPENSTACK&quot; |
| OPENSTACK_AV_ZONE | &quot;OPENSTACK_AV_ZONE&quot; |
| OPENSTACK_PROJECT | &quot;OPENSTACK_PROJECT&quot; |
| OPEN_PROBLEMS | &quot;OPEN_PROBLEMS&quot; |
| PROCESS_GROUPS_ONE | &quot;PROCESS_GROUPS_ONE&quot; |
| PURE_MODEL | &quot;PURE_MODEL&quot; |
| RESOURCES | &quot;RESOURCES&quot; |
| SCALABLE_LIST | &quot;SCALABLE_LIST&quot; |
| SERVICES | &quot;SERVICES&quot; |
| SERVICE_VERSATILE | &quot;SERVICE_VERSATILE&quot; |
| SESSION_METRICS | &quot;SESSION_METRICS&quot; |
| SLO | &quot;SLO&quot; |
| SYNTHETIC_HTTP_MONITOR | &quot;SYNTHETIC_HTTP_MONITOR&quot; |
| SYNTHETIC_SINGLE_EXT_TEST | &quot;SYNTHETIC_SINGLE_EXT_TEST&quot; |
| SYNTHETIC_SINGLE_WEBCHECK | &quot;SYNTHETIC_SINGLE_WEBCHECK&quot; |
| SYNTHETIC_TESTS | &quot;SYNTHETIC_TESTS&quot; |
| THIRD_PARTY_MOST_ACTIVE | &quot;THIRD_PARTY_MOST_ACTIVE&quot; |
| UEM_ACTIVE_SESSIONS | &quot;UEM_ACTIVE_SESSIONS&quot; |
| UEM_CONVERSIONS_OVERALL | &quot;UEM_CONVERSIONS_OVERALL&quot; |
| UEM_CONVERSIONS_PER_GOAL | &quot;UEM_CONVERSIONS_PER_GOAL&quot; |
| UEM_JSERRORS_OVERALL | &quot;UEM_JSERRORS_OVERALL&quot; |
| UEM_KEY_USER_ACTIONS | &quot;UEM_KEY_USER_ACTIONS&quot; |
| USERS | &quot;USERS&quot; |
| VIRTUALIZATION | &quot;VIRTUALIZATION&quot; |



