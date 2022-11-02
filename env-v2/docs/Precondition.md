

# Precondition

A precondition for visibility of a property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expectedValue** | **Object** | The expected value of the property.   Only applicable to properties of the &#x60;EQUALS&#x60; type. |  [optional] |
|**expectedValues** | **List&lt;Object&gt;** | A list of valid values of the property.   Only applicable to properties of the &#x60;IN&#x60; type. |  [optional] |
|**precondition** | [**Precondition**](Precondition.md) |  |  [optional] |
|**preconditions** | [**List&lt;Precondition&gt;**](Precondition.md) | A list of child preconditions to be evaluated.   Only applicable to properties of the &#x60;AND&#x60; and &#x60;OR&#x60; types. |  [optional] |
|**property** | **String** | The property to be evaluated. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the precondition. |  |
|**pattern** | **String** | The Regular expression which is matched against the property.   Only applicable to properties of the &#x60;REGEX_MATCH&#x60; type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| EQUALS | &quot;EQUALS&quot; |
| IN | &quot;IN&quot; |
| NOT | &quot;NOT&quot; |
| NULL | &quot;NULL&quot; |
| OR | &quot;OR&quot; |
| REGEX_MATCH | &quot;REGEX_MATCH&quot; |



