

# FdpTagPredicate

The predicate that tests the value of the tag.   The actual set of fields depends on the type of the predicate. Find the list of actual objects in the description of the **type** field or see [Failure detection API - JSON models](https://dt-url.net/9sg3swf).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING_EXISTS&#x60; -&gt; FdpTagStringExists  * &#x60;STRING_EQUALS&#x60; -&gt; FdpTagStringEquals  * &#x60;STRING_STARTS_WITH&#x60; -&gt; FdpTagStringStartsWith  * &#x60;STRING_ENDS_WITH&#x60; -&gt; FdpTagStringEndsWith  * &#x60;STRING_CONTAINS_SUBSTRING&#x60; -&gt; FdpTagStringContainsSubstring  * &#x60;INTEGER_EXISTS&#x60; -&gt; FdpTagIntegerExists  * &#x60;INTEGER_EQUALS&#x60; -&gt; FdpTagIntegerEquals  * &#x60;INTEGER_LESS_THAN&#x60; -&gt; FdpTagIntegerLessThan  * &#x60;INTEGER_LESS_THAN_OR_EQUAL&#x60; -&gt; FdpTagIntegerLessThanOrEqual  * &#x60;INTEGER_GREATER_THAN&#x60; -&gt; FdpTagIntegerGreaterThan  * &#x60;INTEGER_GREATER_THAN_OR_EQUAL&#x60; -&gt; FdpTagIntegerGreaterThanOrEqual  * &#x60;DOUBLE_EXISTS&#x60; -&gt; FdpTagDoubleExists  * &#x60;DOUBLE_EQUALS&#x60; -&gt; FdpTagDoubleEquals  * &#x60;DOUBLE_LESS_THAN&#x60; -&gt; FdpTagDoubleLessThan  * &#x60;DOUBLE_LESS_THAN_OR_EQUAL&#x60; -&gt; FdpTagDoubleLessThanOrEqual  * &#x60;DOUBLE_GREATER_THAN&#x60; -&gt; FdpTagDoubleGreaterThan  * &#x60;DOUBLE_GREATER_THAN_OR_EQUAL&#x60; -&gt; FdpTagDoubleGreaterThanOrEqual   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOUBLE_EQUALS | &quot;DOUBLE_EQUALS&quot; |
| DOUBLE_EXISTS | &quot;DOUBLE_EXISTS&quot; |
| DOUBLE_GREATER_THAN | &quot;DOUBLE_GREATER_THAN&quot; |
| DOUBLE_GREATER_THAN_OR_EQUAL | &quot;DOUBLE_GREATER_THAN_OR_EQUAL&quot; |
| DOUBLE_LESS_THAN | &quot;DOUBLE_LESS_THAN&quot; |
| DOUBLE_LESS_THAN_OR_EQUAL | &quot;DOUBLE_LESS_THAN_OR_EQUAL&quot; |
| INTEGER_EQUALS | &quot;INTEGER_EQUALS&quot; |
| INTEGER_EXISTS | &quot;INTEGER_EXISTS&quot; |
| INTEGER_GREATER_THAN | &quot;INTEGER_GREATER_THAN&quot; |
| INTEGER_GREATER_THAN_OR_EQUAL | &quot;INTEGER_GREATER_THAN_OR_EQUAL&quot; |
| INTEGER_LESS_THAN | &quot;INTEGER_LESS_THAN&quot; |
| INTEGER_LESS_THAN_OR_EQUAL | &quot;INTEGER_LESS_THAN_OR_EQUAL&quot; |
| STRING_CONTAINS_SUBSTRING | &quot;STRING_CONTAINS_SUBSTRING&quot; |
| STRING_ENDS_WITH | &quot;STRING_ENDS_WITH&quot; |
| STRING_EQUALS | &quot;STRING_EQUALS&quot; |
| STRING_EXISTS | &quot;STRING_EXISTS&quot; |
| STRING_STARTS_WITH | &quot;STRING_STARTS_WITH&quot; |



