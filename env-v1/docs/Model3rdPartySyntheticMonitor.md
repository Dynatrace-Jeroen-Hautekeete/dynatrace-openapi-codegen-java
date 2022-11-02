

# Model3rdPartySyntheticMonitor

The third-party synthetic monitor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the monitor. |  |
|**title** | **String** | The name of the monitor. |  |
|**description** | **String** | A description of the monitor. |  [optional] |
|**testSetup** | **String** | The information on monitor setup, for example &#x60;browser&#x60;. |  [optional] |
|**expirationTimestamp** | **Long** | The timestamp of the monitor expiration, in UTC milliseconds. |  [optional] |
|**drilldownLink** | **String** | The URL to the results of monitor execution. |  [optional] |
|**editLink** | **String** | The URL to edit the monitor in the original UI. |  [optional] |
|**enabled** | **Boolean** | The monitor is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). Default is &#x60;true&#x60;.   If &#x60;true&#x60;, set the **deleted** parameter to &#x60;false&#x60;. |  [optional] |
|**deleted** | **Boolean** | The flag of the deleted monitor. Default is &#x60;false&#x60;.    If &#x60;true&#x60;, set the **enabled** parameter to &#x60;false&#x60;. |  [optional] |
|**locations** | [**Set&lt;SyntheticTestLocation&gt;**](SyntheticTestLocation.md) | Locations from which the synthetic monitor runs. |  |
|**steps** | [**List&lt;SyntheticTestStep&gt;**](SyntheticTestStep.md) | Steps of the third-party monitor. |  [optional] |
|**scheduleIntervalInSeconds** | **Integer** | The frequency of the monitor, in seconds. The monitor is repeated with the specified interval at the third-party source.   Dynatrace expects results of a monitor execution with the specified interval. If you report results to Dynatrace less often, adjust the **noDataTimeout** value accordingly. |  |
|**noDataTimeout** | **Integer** | The timeout of the monitor, in seconds. If no result is reported within this time, the availability state switches to unmonitored. Default is doubled frequency of the monitor. |  [optional] |



