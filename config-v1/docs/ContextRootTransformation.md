

# ContextRootTransformation

Configuration of transformation of the detected value.   If several transformations are specified, they are handled sequentially from top to bottom. Each transformation is applied to the result of the preceding transformation. For example, the second transformation is applied to the result of the first transformation.   The actual set of fields depends on the `type` of the transformation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BEFORE&#x60; -&gt; BeforeTransformation  * &#x60;REPLACE_BETWEEN&#x60; -&gt; ReplaceBetweenTransformation  * &#x60;REMOVE_NUMBERS&#x60; -&gt; RemoveNumbersTransformation  * &#x60;REMOVE_CREDIT_CARDS&#x60; -&gt; RemoveCreditCardNumbersTransformation  * &#x60;REMOVE_IBANS&#x60; -&gt; RemoveIBANsTransformation  * &#x60;REMOVE_IPS&#x60; -&gt; RemoveIPsTransformation   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BEFORE | &quot;BEFORE&quot; |
| REMOVE_CREDIT_CARDS | &quot;REMOVE_CREDIT_CARDS&quot; |
| REMOVE_IBANS | &quot;REMOVE_IBANS&quot; |
| REMOVE_IPS | &quot;REMOVE_IPS&quot; |
| REMOVE_NUMBERS | &quot;REMOVE_NUMBERS&quot; |
| REPLACE_BETWEEN | &quot;REPLACE_BETWEEN&quot; |



