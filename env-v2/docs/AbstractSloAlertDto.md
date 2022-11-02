

# AbstractSloAlertDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alertName** | **String** | Name of the alert. |  |
|**alertThreshold** | **Double** | Threshold of the alert. Status alerts trigger if they fall below this value, burn rate alerts trigger if they exceed the value. |  |
|**alertType** | [**AlertTypeEnum**](#AlertTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BURN_RATE&#x60; -&gt; BurnRateAlert  * &#x60;STATUS&#x60; -&gt; StatusAlert   |  |



## Enum: AlertTypeEnum

| Name | Value |
|---- | -----|
| BURN_RATE | &quot;BURN_RATE&quot; |
| STATUS | &quot;STATUS&quot; |



