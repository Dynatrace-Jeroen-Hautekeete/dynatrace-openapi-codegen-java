

# HttpMethodComparisonInfo

Comparison for `HTTP_METHOD` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | [**ComparisonEnum**](#ComparisonEnum) | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |
|**values** | [**Set&lt;ValuesEnum&gt;**](#Set&lt;ValuesEnum&gt;) | The values to compare to. |  [optional] |



## Enum: ComparisonEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EQUALS_ANY_OF | &quot;EQUALS_ANY_OF&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| CONNECT | &quot;CONNECT&quot; |
| DELETE | &quot;DELETE&quot; |
| GET | &quot;GET&quot; |
| HEAD | &quot;HEAD&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| PATCH | &quot;PATCH&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| TRACE | &quot;TRACE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: Set&lt;ValuesEnum&gt;

| Name | Value |
|---- | -----|
| CONNECT | &quot;CONNECT&quot; |
| DELETE | &quot;DELETE&quot; |
| GET | &quot;GET&quot; |
| HEAD | &quot;HEAD&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| PATCH | &quot;PATCH&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| TRACE | &quot;TRACE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



