

# EndsWithCompareOperation

The condition of the `ENDS_WITH` type.   The condition checks whether the string value ends with the specified text.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**negate** | **Boolean** | Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **ends with** into **does not end with**.    If not set, then &#x60;false&#x60; is used. |  [optional] |
|**ignoreCase** | **Boolean** | The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).   If not set, then &#x60;false&#x60; is used, making the condition case sensitive. |  [optional] |
|**values** | **Set&lt;String&gt;** | The value to compare to.   If several values are specified, the OR logic applies. |  |



