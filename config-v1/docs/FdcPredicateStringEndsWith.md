

# FdcPredicateStringEndsWith

The predicate of the `STRING_ENDS_WITH ` type. It checks whether the attribute (which is a string) ends with one of the reference values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ignoreCase** | **Boolean** | The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).   If not set, then &#x60;false&#x60; is used, making the condition case sensitive. |  |
|**values** | **Set&lt;String&gt;** | A list of reference values. The condition is fulfilled when the attribute (which is a string) ends with *any* of these. |  |


