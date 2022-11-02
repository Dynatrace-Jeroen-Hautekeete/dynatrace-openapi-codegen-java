

# RdsHighMemoryThresholds

Custom thresholds for RDS running out of memory. If not set, automatic mode is used.    **All** conditions must be fulfilled to trigger an alert.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**freeMemory** | **BigDecimal** | Freeable memory is lower than *X* Megabytes in 3 out of 5 samples. |  |
|**swapUsage** | **BigDecimal** | Swap usage is higher than *X* Gigabytes in 3 out of 5 samples. |  |



