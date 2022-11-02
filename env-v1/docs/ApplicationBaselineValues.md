

# ApplicationBaselineValues

The baseline data for an application and its children for each available duration metric.   A duration metric is one of the following:  * **DOM interactive**  * **HTML downloaded**  * **Load event end**  * **Load event start**  * **Response time**  * **Speed index**  * **Time to first byte**  * **Visually complete**

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | The Dynatrace entity ID of the application. |  |
|**displayName** | **String** | The name of the application as displayed in the UI. |  [optional] |
|**applicationDomInteractiveBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **DOM interactive** duration metric. |  [optional] |
|**applicationHtmlDownloadedBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **HTML downloaded** duration metric. |  [optional] |
|**applicationLoadEventEndBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Load event end** duration metric. |  [optional] |
|**applicationLoadEventStartBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Load event start** duration metric. |  [optional] |
|**applicationResponseTimeBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Response time** duration metric. |  [optional] |
|**applicationSpeedIndexBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Speed index** duration metric. |  [optional] |
|**applicationTimeToFirstByteBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Time to first byte** duration metric. |  [optional] |
|**applicationVisualCompleteBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for the **Visually complete** duration metric. |  [optional] |



