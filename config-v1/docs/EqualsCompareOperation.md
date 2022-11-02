

# EqualsCompareOperation

The condition of the `EQUALS` type.   The condition checks whether the detected value equals the specified one.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**negate** | **Boolean** | Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **equals** into **does not equal**.    If not set, then &#x60;false&#x60; is used. |  [optional] |
|**ignoreCase** | **Boolean** | The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).   If not set, then &#x60;false&#x60; is used, making the condition case sensitive. |  [optional] |
|**values** | **Set&lt;Object&gt;** | The value to compare to.   If several values are specified, the OR logic applies. |  |


