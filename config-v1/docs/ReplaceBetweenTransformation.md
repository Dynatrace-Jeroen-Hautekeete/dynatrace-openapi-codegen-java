

# ReplaceBetweenTransformation

The transformation of the `REPLACE_BETWEEN` type.   The transformation replaces the content in between specified delimiters with the specified value. The rest of the string remains intact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** | The starting delimiter. The transformation replaces everything from here until ending delimiter. The delimiter itself remain intact. |  |
|**before** | **String** | The ending delimiter. The transformation replaces everything from starting delimiter until here. The delimiter itself remain intact. |  |
|**replacement** | **String** | The value to be used instead of the content between delimiters. |  |



