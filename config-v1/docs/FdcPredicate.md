

# FdcPredicate

The predicate that tests the value of the attribute.   The actual set of fields depends on the type of the predicate. Find the list of actual objects in the description of the **type** field or see [Failure detection API - JSON models](https://dt-url.net/9sg3swf).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING_EQUALS&#x60; -&gt; FdcPredicateStringEquals  * &#x60;STRING_STARTS_WITH&#x60; -&gt; FdcPredicateStringStartsWith  * &#x60;STRING_ENDS_WITH&#x60; -&gt; FdcPredicateStringEndsWith  * &#x60;STRING_CONTAINS_SUBSTRING&#x60; -&gt; FdcPredicateStringContains  * &#x60;INTEGER_EQUALS&#x60; -&gt; FdcPredicateIntegerEquals  * &#x60;INTEGER_LESS_THAN&#x60; -&gt; FdcPredicateIntegerLessThan  * &#x60;INTEGER_LESS_THAN_OR_EQUAL&#x60; -&gt; FdcPredicateIntegerLessThanOrEqual  * &#x60;INTEGER_GREATER_THAN&#x60; -&gt; FdcPredicateIntegerGreaterThan  * &#x60;INTEGER_GREATER_THAN_OR_EQUAL&#x60; -&gt; FdcPredicateIntegerGreaterThanOrEqual  * &#x60;LONG_EQUALS&#x60; -&gt; FdcPredicateLongEquals  * &#x60;LONG_LESS_THAN&#x60; -&gt; FdcPredicateLongLessThan  * &#x60;LONG_LESS_THAN_OR_EQUAL&#x60; -&gt; FdcPredicateLongLessThanOrEqual  * &#x60;LONG_GREATER_THAN&#x60; -&gt; FdcPredicateLongGreaterThan  * &#x60;LONG_GREATER_THAN_OR_EQUAL&#x60; -&gt; FdcPredicateLongGreaterThanOrEqual  * &#x60;TAG_KEY_EQUALS&#x60; -&gt; FdcPredicateTagKeyEquals  * &#x60;TAG_EQUALS&#x60; -&gt; FdcPredicateTagEquals  * &#x60;SERVICE_TYPE_EQUALS&#x60; -&gt; FdcPredicateServiceTypeEquals  * &#x60;MANAGEMENT_ZONES_CONTAINS_ALL&#x60; -&gt; FdcPredicateManagementZonesContainsAll  * &#x60;SET_OF_INTEGERS_CONTAINS_ANY&#x60; -&gt; FdcPredicateSetOfIntegersContainsAny  * &#x60;SET_OF_INTEGERS_CONTAINS_ALL&#x60; -&gt; FdcPredicateSetOfIntegersContainsAll   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INTEGER_EQUALS | &quot;INTEGER_EQUALS&quot; |
| INTEGER_GREATER_THAN | &quot;INTEGER_GREATER_THAN&quot; |
| INTEGER_GREATER_THAN_OR_EQUAL | &quot;INTEGER_GREATER_THAN_OR_EQUAL&quot; |
| INTEGER_LESS_THAN | &quot;INTEGER_LESS_THAN&quot; |
| INTEGER_LESS_THAN_OR_EQUAL | &quot;INTEGER_LESS_THAN_OR_EQUAL&quot; |
| LONG_EQUALS | &quot;LONG_EQUALS&quot; |
| LONG_GREATER_THAN | &quot;LONG_GREATER_THAN&quot; |
| LONG_GREATER_THAN_OR_EQUAL | &quot;LONG_GREATER_THAN_OR_EQUAL&quot; |
| LONG_LESS_THAN | &quot;LONG_LESS_THAN&quot; |
| LONG_LESS_THAN_OR_EQUAL | &quot;LONG_LESS_THAN_OR_EQUAL&quot; |
| MANAGEMENT_ZONES_CONTAINS_ALL | &quot;MANAGEMENT_ZONES_CONTAINS_ALL&quot; |
| SERVICE_TYPE_EQUALS | &quot;SERVICE_TYPE_EQUALS&quot; |
| SET_OF_INTEGERS_CONTAINS_ALL | &quot;SET_OF_INTEGERS_CONTAINS_ALL&quot; |
| SET_OF_INTEGERS_CONTAINS_ANY | &quot;SET_OF_INTEGERS_CONTAINS_ANY&quot; |
| STRING_CONTAINS_SUBSTRING | &quot;STRING_CONTAINS_SUBSTRING&quot; |
| STRING_ENDS_WITH | &quot;STRING_ENDS_WITH&quot; |
| STRING_EQUALS | &quot;STRING_EQUALS&quot; |
| STRING_STARTS_WITH | &quot;STRING_STARTS_WITH&quot; |
| TAG_EQUALS | &quot;TAG_EQUALS&quot; |
| TAG_KEY_EQUALS | &quot;TAG_KEY_EQUALS&quot; |



