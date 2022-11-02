

# FlawStateComparisonInfoAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | [**ComparisonEnum**](#ComparisonEnum) | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  [optional] |
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
| FLAWED | &quot;FLAWED&quot; |
| NOT_FLAWED | &quot;NOT_FLAWED&quot; |



## Enum: Set&lt;ValuesEnum&gt;

| Name | Value |
|---- | -----|
| FLAWED | &quot;FLAWED&quot; |
| NOT_FLAWED | &quot;NOT_FLAWED&quot; |



