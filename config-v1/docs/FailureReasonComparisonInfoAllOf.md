

# FailureReasonComparisonInfoAllOf


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
| EXCEPTION_AT_ENTRY_NODE | &quot;EXCEPTION_AT_ENTRY_NODE&quot; |
| EXCEPTION_ON_ANY_NODE | &quot;EXCEPTION_ON_ANY_NODE&quot; |
| HTTP_CODE | &quot;HTTP_CODE&quot; |
| REQUEST_ATTRIBUTE | &quot;REQUEST_ATTRIBUTE&quot; |
| SPAN_FAILURE | &quot;SPAN_FAILURE&quot; |



## Enum: Set&lt;ValuesEnum&gt;

| Name | Value |
|---- | -----|
| EXCEPTION_AT_ENTRY_NODE | &quot;EXCEPTION_AT_ENTRY_NODE&quot; |
| EXCEPTION_ON_ANY_NODE | &quot;EXCEPTION_ON_ANY_NODE&quot; |
| HTTP_CODE | &quot;HTTP_CODE&quot; |
| REQUEST_ATTRIBUTE | &quot;REQUEST_ATTRIBUTE&quot; |
| SPAN_FAILURE | &quot;SPAN_FAILURE&quot; |



