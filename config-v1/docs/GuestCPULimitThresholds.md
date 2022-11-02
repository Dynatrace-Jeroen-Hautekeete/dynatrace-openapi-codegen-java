

# GuestCPULimitThresholds

Custom thresholds for guest CPU limit detection. If not set then the automatic mode is used.    **All** conditions must be fulfilled to trigger an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostCpuUsageMinPercentage** | **Integer** | Hypervisor CPU usage is higher than *X*% in 3 out of 5 samples. |  |
|**vmCpuUsageMaxPercentage** | **Integer** | VM CPU usage (VM CPU Usage Mhz / VM CPU limit in Mhz) is higher than *X*% in 3 out of 5 samples. |  |
|**vmCpuReadyMaxPercentage** | **Integer** | VM CPU ready is higher than *X*% occurred in 3 out of 5 samples. |  |



