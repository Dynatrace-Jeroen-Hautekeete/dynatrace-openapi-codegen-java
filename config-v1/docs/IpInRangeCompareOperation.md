

# IpInRangeCompareOperation

The condition of the `IP_IN_RANGE` type.   The condition checks whether the IP address belongs to a specified range.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**negate** | **Boolean** | Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **IP is in range** into **IP is not in range**.    If not set, then &#x60;false&#x60; is used. |  [optional] |
|**lower** | **String** | The lower boundary of the IP range. |  |
|**upper** | **String** | The upper boundary of the IP range. |  |



