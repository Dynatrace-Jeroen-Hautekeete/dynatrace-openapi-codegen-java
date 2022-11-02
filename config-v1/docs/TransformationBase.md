

# TransformationBase

Configuration of transformation of the detected value.   If several transformations are specified, they are handled sequentially from top to bottom. Each transformation is applied to the result of the preceding transformation. For example, the second transformation is applied to the result of the first transformation.   The actual set of fields depends on the type of the transformation. Find the list of actual objects in the description of the **type** field or see [Service detection API - JSON models](https://dt-url.net/2ie3slq).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BEFORE&#x60; -&gt; BeforeTransformation  * &#x60;AFTER&#x60; -&gt; AfterTransformation  * &#x60;BETWEEN&#x60; -&gt; BetweenTransformation  * &#x60;REPLACE_BETWEEN&#x60; -&gt; ReplaceBetweenTransformation  * &#x60;REMOVE_NUMBERS&#x60; -&gt; RemoveNumbersTransformation  * &#x60;REMOVE_CREDIT_CARDS&#x60; -&gt; RemoveCreditCardNumbersTransformation  * &#x60;REMOVE_IBANS&#x60; -&gt; RemoveIBANsTransformation  * &#x60;REMOVE_IPS&#x60; -&gt; RemoveIPsTransformation  * &#x60;SPLIT_SELECT&#x60; -&gt; SplitSelectTransformation  * &#x60;TAKE_SEGMENTS&#x60; -&gt; TakeSegmentsTransformation   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AFTER | &quot;AFTER&quot; |
| BEFORE | &quot;BEFORE&quot; |
| BETWEEN | &quot;BETWEEN&quot; |
| REMOVE_CREDIT_CARDS | &quot;REMOVE_CREDIT_CARDS&quot; |
| REMOVE_IBANS | &quot;REMOVE_IBANS&quot; |
| REMOVE_IPS | &quot;REMOVE_IPS&quot; |
| REMOVE_NUMBERS | &quot;REMOVE_NUMBERS&quot; |
| REPLACE_BETWEEN | &quot;REPLACE_BETWEEN&quot; |
| SPLIT_SELECT | &quot;SPLIT_SELECT&quot; |
| TAKE_SEGMENTS | &quot;TAKE_SEGMENTS&quot; |



