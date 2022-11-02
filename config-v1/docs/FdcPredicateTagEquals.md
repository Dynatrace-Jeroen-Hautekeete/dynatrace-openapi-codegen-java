

# FdcPredicateTagEquals

The predicate of the `TAG_EQUALS` type. It checks whether the attribute (which is a key:value pair) equals one of the reference values.   The  reference value is a key:value pair, consisting of a key and a value that are at the **same position** in the respective list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keys** | **List&lt;String&gt;** | A list of reference tag keys.   The condition is fulfilled when the tag matches *any* key:value pair, consisting of a key and a value that are at the **same position** in the respective list. |  [optional] |
|**values** | **List&lt;String&gt;** | A list of reference tag values.   The condition is fulfilled when the tag matches *any* key:value pair, consisting of a key and a value that are at the **same position** in the respective list. |  [optional] |



