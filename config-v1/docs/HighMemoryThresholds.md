

# HighMemoryThresholds

Custom thresholds for high memory usage. If not set then the automatic mode is used.    **Both** conditions must be met to trigger an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageFaultsPerSecondWindows** | **Integer** | Memory page fault rate is higher than *X* faults per second on Windows. |  |
|**usedMemoryPercentageWindows** | **Integer** | Memory usage is higher than *X*% on Windows. |  |
|**pageFaultsPerSecondNonWindows** | **Integer** | Memory page fault rate is higher than *X* faults per second on Linux. |  |
|**usedMemoryPercentageNonWindows** | **Integer** | Memory usage is higher than *X*% on Linux. |  |



