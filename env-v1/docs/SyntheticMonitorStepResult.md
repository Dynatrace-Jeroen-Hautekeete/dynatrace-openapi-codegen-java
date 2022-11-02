

# SyntheticMonitorStepResult

The result of the individual step of a synthetic monitor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | ID of the step. It is unique within the test definition. |  |
|**startTimestamp** | **Long** | The timestamp of test step execution, UTC milliseconds. |  |
|**responseTimeMillis** | **Long** | The response time of the step, in milliseconds.    Absent when no meaningful response time is available (as may be the case for certain error conditions such as a misconfigured step script). |  [optional] |
|**error** | [**SyntheticMonitorError**](SyntheticMonitorError.md) |  |  [optional] |



