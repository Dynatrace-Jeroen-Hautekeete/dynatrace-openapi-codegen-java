

# CompareOperation

The condition of the rule.   The actual set of fields depends on the type of the condition. Find the list of actual objects in the description of the **type** field or see [Service detection API - JSON models](https://dt-url.net/2ie3slq).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;EQUALS&#x60; -&gt; EqualsCompareOperation  * &#x60;STRING_CONTAINS&#x60; -&gt; StringContainsCompareOperation  * &#x60;STARTS_WITH&#x60; -&gt; StartsWithCompareOperation  * &#x60;ENDS_WITH&#x60; -&gt; EndsWithCompareOperation  * &#x60;EXISTS&#x60; -&gt; ExistsCompareOperation  * &#x60;IP_IN_RANGE&#x60; -&gt; IpInRangeCompareOperation  * &#x60;LESS_THAN&#x60; -&gt; LessThanCompareOperation  * &#x60;GREATER_THAN&#x60; -&gt; GreaterThanCompareOperation  * &#x60;INT_EQUALS&#x60; -&gt; IntEqualsCompareOperation  * &#x60;STRING_EQUALS&#x60; -&gt; StringEqualsCompareOperation  * &#x60;TAG&#x60; -&gt; TagCompareOperation   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |
| GREATER_THAN | &quot;GREATER_THAN&quot; |
| INT_EQUALS | &quot;INT_EQUALS&quot; |
| IP_IN_RANGE | &quot;IP_IN_RANGE&quot; |
| LESS_THAN | &quot;LESS_THAN&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |
| STRING_CONTAINS | &quot;STRING_CONTAINS&quot; |
| STRING_EQUALS | &quot;STRING_EQUALS&quot; |
| TAG | &quot;TAG&quot; |



