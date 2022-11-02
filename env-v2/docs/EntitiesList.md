

# EntitiesList

A list of monitored entities along with their properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalCount** | **Long** | The total number of entries in the result. |  |
|**pageSize** | **Integer** | The number of entries per page. |  [optional] |
|**nextPageKey** | **String** | The cursor for the next page of results. Has the value of &#x60;null&#x60; on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result. |  [optional] |
|**entities** | [**List&lt;Entity&gt;**](Entity.md) | A list of monitored entities. |  [optional] |



