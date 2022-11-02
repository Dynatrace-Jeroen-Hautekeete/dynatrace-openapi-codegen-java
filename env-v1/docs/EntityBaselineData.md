

# EntityBaselineData

The baseline data for a Dynatrace entity for a specific duration metric.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | The ID of the Dynatrace entity. |  |
|**displayName** | **String** | The display name of the entity. |  [optional] |
|**errorRate** | **Float** | The error rate baseline. |  [optional] |
|**hasLoadBaseline** | **Boolean** | The entity has a load baseline (&#x60;true&#x60;) or doesn&#39;t (&#x60;false&#x60;). |  [optional] |
|**microsMedian** | **Float** | The median baseline, in microseconds. |  [optional] |
|**micros90thPercentile** | **Float** | The 90th percentile baseline, in microseconds. |  [optional] |
|**childBaselines** | [**Set&lt;EntityBaselineData&gt;**](EntityBaselineData.md) | The baseline data for child entities of this entity, for example a &#x60;SERVICE_METHOD&#x60; of a &#x60;SERVICE_METHOD_GROUP&#x60;. |  [optional] |



