

# MetricDescriptorCollection

A list of metrics along with their descriptors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextPageKey** | **String** | The cursor for the next page of results. Has the value of &#x60;null&#x60; on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result. |  |
|**totalCount** | **Long** | The estimated number of metrics in the result. |  |
|**metrics** | [**List&lt;MetricDescriptor&gt;**](MetricDescriptor.md) | A list of metric along with their descriptors |  |
|**warnings** | **List&lt;String&gt;** | A list of potential warnings about the query. For example deprecated feature usage etc. |  [optional] |



