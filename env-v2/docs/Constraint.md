

# Constraint

A constraint on the values accepted for a settings property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxLength** | **Integer** | The maximum allowed length of string values. |  [optional] |
|**minLength** | **Integer** | The minimum required length of string values. |  [optional] |
|**customMessage** | **String** | A custom message for invalid values. |  [optional] |
|**customValidatorId** | **String** | The ID of a custom validator. |  [optional] |
|**uniqueProperties** | **List&lt;String&gt;** | A list of properties for which the combination of values must be unique. |  [optional] |
|**maximum** | **BigDecimal** | The maximum allowed value. |  [optional] |
|**minimum** | **BigDecimal** | The minimum allowed value. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the constraint. |  |
|**pattern** | **String** | The regular expression pattern for valid string values. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_VALIDATOR_REF | &quot;CUSTOM_VALIDATOR_REF&quot; |
| LENGTH | &quot;LENGTH&quot; |
| NOT_BLANK | &quot;NOT_BLANK&quot; |
| NOT_EMPTY | &quot;NOT_EMPTY&quot; |
| NO_WHITESPACE | &quot;NO_WHITESPACE&quot; |
| PATTERN | &quot;PATTERN&quot; |
| RANGE | &quot;RANGE&quot; |
| REGEX | &quot;REGEX&quot; |
| TRIMMED | &quot;TRIMMED&quot; |
| UNIQUE | &quot;UNIQUE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



