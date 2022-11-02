

# TakeSegmentsTransformation

The transformation of the `TAKE_SEGMENTS` type.   The transformation splits the detected value into an array and keeps the specified number of first or last elements.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**segmentCount** | **Integer** | The number of elements to be kept. |  |
|**delimiter** | **String** | The delimiter for splitting the detected value. The delimiter itself is not kept. |  |
|**takeFromEnd** | **Boolean** | Keeps the first (&#x60;false&#x60;) or last (&#x60;true&#x60;) elements.    If not set, then &#x60;false&#x60; is used, keeping the first elements. |  [optional] |



