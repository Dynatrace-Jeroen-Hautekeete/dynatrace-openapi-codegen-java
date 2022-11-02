

# DiskEventAnomalyDetectionConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The ID of the disk event rule. |  [optional] [readonly] |
|**name** | **String** | The name of the disk event rule. |  |
|**enabled** | **Boolean** | Disk event rule enabled/disabled. |  |
|**metric** | [**MetricEnum**](#MetricEnum) | The metric to monitor. |  |
|**threshold** | **Double** | The threshold to trigger disk event.    * A percentage for &#x60;LowDiskSpace&#x60; or &#x60;LowInodes&#x60; metrics.   * In milliseconds for &#x60;ReadTimeExceeding&#x60; or &#x60;WriteTimeExceeding&#x60; metrics. |  |
|**samples** | **Integer** | The number of samples to evaluate. |  |
|**violatingSamples** | **Integer** | The number of samples that must violate the threshold to trigger an event. Must not exceed the number of evaluated samples. |  |
|**diskNameFilter** | [**DiskNameFilter**](DiskNameFilter.md) |  |  [optional] |
|**tagFilters** | [**Set&lt;TagFilter&gt;**](TagFilter.md) | Narrows the rule usage down to the hosts matching the specified tags. |  [optional] |
|**hostGroupId** | **String** | Narrows the rule usage down to disks that run on hosts that themselves run on the specified host group. |  [optional] |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| LOW_DISK_SPACE | &quot;LOW_DISK_SPACE&quot; |
| LOW_INODES | &quot;LOW_INODES&quot; |
| READ_TIME_EXCEEDING | &quot;READ_TIME_EXCEEDING&quot; |
| WRITE_TIME_EXCEEDING | &quot;WRITE_TIME_EXCEEDING&quot; |



