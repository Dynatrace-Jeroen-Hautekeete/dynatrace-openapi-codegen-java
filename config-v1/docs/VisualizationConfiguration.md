

# VisualizationConfiguration

Configuration of a visualization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The id of the query |  |
|**global** | [**VisualizationGlobalProperties**](VisualizationGlobalProperties.md) |  |  [optional] |
|**rules** | [**List&lt;VisualizationRule&gt;**](VisualizationRule.md) | Rules for Visualization |  |
|**axes** | [**Axes**](Axes.md) |  |  [optional] |
|**heatmapSettings** | [**HeatmapSettings**](HeatmapSettings.md) |  |  [optional] |
|**singleValueSettings** | [**SingleValueSettings**](SingleValueSettings.md) |  |  [optional] |
|**thresholds** | [**List&lt;VisualizationThreshold&gt;**](VisualizationThreshold.md) | Thresholds for Visualization |  [optional] |
|**tableSettings** | [**TableSettings**](TableSettings.md) |  |  [optional] |
|**graphChartSettings** | [**GraphChartSettings**](GraphChartSettings.md) |  |  [optional] |
|**honeycombSettings** | [**HoneycombSettings**](HoneycombSettings.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GRAPH_CHART | &quot;GRAPH_CHART&quot; |
| HEATMAP | &quot;HEATMAP&quot; |
| HONEYCOMB | &quot;HONEYCOMB&quot; |
| PIE_CHART | &quot;PIE_CHART&quot; |
| SINGLE_VALUE | &quot;SINGLE_VALUE&quot; |
| STACKED_AREA | &quot;STACKED_AREA&quot; |
| STACKED_COLUMN | &quot;STACKED_COLUMN&quot; |
| TABLE | &quot;TABLE&quot; |
| TOP_LIST | &quot;TOP_LIST&quot; |



