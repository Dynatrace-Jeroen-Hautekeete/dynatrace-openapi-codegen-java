

# Model3rdPartySyntheticLocationTestResult

Results of third-party monitor executions per location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the location. |  |
|**startTimestamp** | **Long** | The timestamp of text execution start, in UTC milliseconds. |  |
|**successRate** | **Double** | The overall availability of the monitor from this location, percent.    If absent, calculated as the number of successful steps compared to the overall number of steps. |  [optional] |
|**success** | **Boolean** | If the test was successful (&#x60;true&#x60;) or failed (&#x60;false&#x60;) - will influence availability timeseries. |  |
|**responseTimeMillis** | **Long** | The overall response time of the monitor from this location, in milliseconds.    If absent, it is calculated as the sum of response times of all steps. |  [optional] |
|**stepResults** | [**List&lt;SyntheticMonitorStepResult&gt;**](SyntheticMonitorStepResult.md) | Results of individual monitor steps. |  |



