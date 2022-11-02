

# SlowPhysicalStorageThresholds

Custom thresholds for slow running physical storage device. If not set then the automatic mode is used.    Fulfillment of **any** condition triggers an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avgReadWriteLatency** | **Integer** | Read/write latency is higher than *X* milliseconds in 4 out of 5 samples. |  |
|**peakReadWriteLatency** | **Integer** | Peak value for read/write latency is higher than *X* milliseconds in 4 out of 5 samples. |  |



