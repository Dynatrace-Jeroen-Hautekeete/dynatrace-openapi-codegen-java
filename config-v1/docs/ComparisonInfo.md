

# ComparisonInfo

Type-specific comparison for attributes. The actual set of fields depends on the type of the comparison. Find the list of actual objects in the description of the **type** field or see [Service metrics API - JSON models](https://dt-url.net/9803svb).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparison** | **String** | Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;. |  |
|**value** | **Object** | The value to compare to. |  [optional] |
|**values** | **Set&lt;Object&gt;** | The values to compare to. |  [optional] |
|**negate** | **Boolean** | Reverse the comparison **operator**. For example, it turns **equals** into **does not equal**. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING&#x60; -&gt; StringComparisonInfo  * &#x60;NUMBER&#x60; -&gt; NumberComparisonInfo  * &#x60;BOOLEAN&#x60; -&gt; BooleanComparisonInfo  * &#x60;HTTP_METHOD&#x60; -&gt; HttpMethodComparisonInfo  * &#x60;STRING_REQUEST_ATTRIBUTE&#x60; -&gt; StringRequestAttributeComparisonInfo  * &#x60;NUMBER_REQUEST_ATTRIBUTE&#x60; -&gt; NumberRequestAttributeComparisonInfo  * &#x60;ZOS_CALL_TYPE&#x60; -&gt; ZosComparisonInfo  * &#x60;IIB_INPUT_NODE_TYPE&#x60; -&gt; IIBInputNodeTypeComparisonInfo  * &#x60;ESB_INPUT_NODE_TYPE&#x60; -&gt; ESBInputNodeTypeComparisonInfo  * &#x60;FAILED_STATE&#x60; -&gt; FailedStateComparisonInfo  * &#x60;FLAW_STATE&#x60; -&gt; FlawStateComparisonInfo  * &#x60;FAILURE_REASON&#x60; -&gt; FailureReasonComparisonInfo  * &#x60;HTTP_STATUS_CLASS&#x60; -&gt; HttpStatusClassComparisonInfo  * &#x60;TAG&#x60; -&gt; TagComparisonInfo  * &#x60;FAST_STRING&#x60; -&gt; FastStringComparisonInfo  * &#x60;SERVICE_TYPE&#x60; -&gt; ServiceTypeComparisonInfo   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOOLEAN | &quot;BOOLEAN&quot; |
| ESB_INPUT_NODE_TYPE | &quot;ESB_INPUT_NODE_TYPE&quot; |
| FAILED_STATE | &quot;FAILED_STATE&quot; |
| FAILURE_REASON | &quot;FAILURE_REASON&quot; |
| FAST_STRING | &quot;FAST_STRING&quot; |
| FLAW_STATE | &quot;FLAW_STATE&quot; |
| HTTP_METHOD | &quot;HTTP_METHOD&quot; |
| HTTP_STATUS_CLASS | &quot;HTTP_STATUS_CLASS&quot; |
| IIB_INPUT_NODE_TYPE | &quot;IIB_INPUT_NODE_TYPE&quot; |
| NUMBER | &quot;NUMBER&quot; |
| NUMBER_REQUEST_ATTRIBUTE | &quot;NUMBER_REQUEST_ATTRIBUTE&quot; |
| SERVICE_TYPE | &quot;SERVICE_TYPE&quot; |
| STRING | &quot;STRING&quot; |
| STRING_REQUEST_ATTRIBUTE | &quot;STRING_REQUEST_ATTRIBUTE&quot; |
| TAG | &quot;TAG&quot; |
| ZOS_CALL_TYPE | &quot;ZOS_CALL_TYPE&quot; |



