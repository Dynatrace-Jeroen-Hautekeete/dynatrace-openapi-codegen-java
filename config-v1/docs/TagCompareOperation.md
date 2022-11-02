

# TagCompareOperation

The condition of the `TAG` type.   The condition checks if the process group of the potential service is tagged with a specific tag.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compareKeyOnly** | **Boolean** | If &#x60;true&#x60; ignores the tag values and only validates that the tag key is matching. Defaults to &#x60;false&#x60;. |  [optional] |
|**tags** | [**Set&lt;TagInfo&gt;**](TagInfo.md) | The value to compare to.   If several values are specified, the OR logic applies. |  |



