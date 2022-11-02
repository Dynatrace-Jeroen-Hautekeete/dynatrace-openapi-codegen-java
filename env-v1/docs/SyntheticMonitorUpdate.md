

# SyntheticMonitorUpdate

The synthetic monitor update.    The actual set of fields depends the type of the monitor. Find the list of actual objects in the description of the **type** field or see [Synthetic monitors API - JSON models](https://dt-url.net/2523se9).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**frequencyMin** | **Integer** | The frequency of the monitor, in minutes.    You can use one of the following values: &#x60;5&#x60;, &#x60;10&#x60;, &#x60;15&#x60;, &#x60;30&#x60;, and &#x60;60&#x60;. |  |
|**anomalyDetection** | [**AnomalyDetection**](AnomalyDetection.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BROWSER&#x60; -&gt; BrowserSyntheticMonitorUpdate  * &#x60;HTTP&#x60; -&gt; HttpSyntheticMonitorUpdate   |  |
|**name** | **String** | The name of the monitor. |  |
|**locations** | **Set&lt;String&gt;** | A list of locations from which the monitor is executed.    To specify a location, use its entity ID. |  |
|**enabled** | **Boolean** | The monitor is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**script** | **Object** | The script of a [browser](https://dt-url.net/9c103rda) or HTTP monitor. |  |
|**tags** | [**Set&lt;TagWithSourceInfo&gt;**](TagWithSourceInfo.md) | A set of tags assigned to the monitor.    You can specify only the value of the tag here and the &#x60;CONTEXTLESS&#x60; context and source &#39;USER&#39; will be added automatically. But preferred option is usage of TagWithSourceDto model. |  |
|**manuallyAssignedApps** | **Set&lt;String&gt;** | A set of manually assigned applications. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BROWSER | &quot;BROWSER&quot; |
| HTTP | &quot;HTTP&quot; |



