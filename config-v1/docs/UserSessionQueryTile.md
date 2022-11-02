

# UserSessionQueryTile

Configuration of a User session query tile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customName** | **String** | The name of the tile, set by user. |  |
|**query** | **String** | A [user session query](https://dt-url.net/dtusql) executed by the tile. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The visualization of the tile. |  |
|**timeFrameShift** | **String** | The comparison timeframe of the query.    If specified, you additionally get the results of the same query with the specified time shift. |  [optional] |
|**visualizationConfig** | [**UserSessionQueryTileConfiguration**](UserSessionQueryTileConfiguration.md) |  |  [optional] |
|**limit** | **Integer** | The limit of the results, if not set will use the default value of the system |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COLUMN_CHART | &quot;COLUMN_CHART&quot; |
| FUNNEL | &quot;FUNNEL&quot; |
| LINE_CHART | &quot;LINE_CHART&quot; |
| NOT_CONFIGURED | &quot;NOT_CONFIGURED&quot; |
| PIE_CHART | &quot;PIE_CHART&quot; |
| SINGLE_VALUE | &quot;SINGLE_VALUE&quot; |
| TABLE | &quot;TABLE&quot; |



