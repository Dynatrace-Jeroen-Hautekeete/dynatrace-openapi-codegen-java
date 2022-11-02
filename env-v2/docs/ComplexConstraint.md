

# ComplexConstraint

A constraint on the values accepted for a complex settings property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customMessage** | **String** | A custom message for invalid values. |  [optional] |
|**customValidatorId** | **String** | The ID of a custom validator. |  [optional] |
|**minimumPropertyCount** | **Integer** | The minimum number of properties that must be set. |  [optional] |
|**maximumPropertyCount** | **Integer** | The maximum number of properties that can be set. |  [optional] |
|**properties** | **List&lt;String&gt;** | A list of properties (defined by IDs) that are used to check the constraint. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the constraint. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_VALIDATOR_REF | &quot;CUSTOM_VALIDATOR_REF&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| GREATER_THAN_OR_EQUAL | &quot;GREATER_THAN_OR_EQUAL&quot; |
| LESS_THAN | &quot;LESS_THAN&quot; |
| LESS_THAN_OR_EQUAL | &quot;LESS_THAN_OR_EQUAL&quot; |
| PROPERTY_COUNT_RANGE | &quot;PROPERTY_COUNT_RANGE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



