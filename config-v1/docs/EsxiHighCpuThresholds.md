

# EsxiHighCpuThresholds

Custom thresholds for CPU saturation detection on ESXi. If not set then the automatic mode is used.    **All** conditions must be fulfilled to trigger an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpuUsagePercentage** | **Integer** | CPU usage is higher than *X*% in 3 out of 5 samples. |  |
|**vmCpuReadyPercentage** | **Integer** | VM CPU ready is higher than *X*% in 3 out of 5 samples. |  |
|**cpuPeakPercentage** | **Integer** | At least one peak higher than *X*% occurred in 3 out of 5 samples. |  |



