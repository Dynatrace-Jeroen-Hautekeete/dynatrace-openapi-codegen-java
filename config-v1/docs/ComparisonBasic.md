

# ComparisonBasic

Defines how the matching is actually performed: what and how are we comparing.   The actual set of fields and possible values of the **operator** field depend on the type of the comparison. Find the list of actual objects in the description of the **type** field or see [JSON models](https://dt-url.net/0b83s6z).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | **String** | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  |
|**value** | **Object** | The value to compare to. |  [optional] |
|**negate** | **Boolean** | Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;STRING&#x60; -&gt; StringComparison  * &#x60;INDEXED_NAME&#x60; -&gt; IndexedNameComparison  * &#x60;INDEXED_STRING&#x60; -&gt; IndexedStringComparison  * &#x60;INTEGER&#x60; -&gt; IntegerComparison  * &#x60;SERVICE_TYPE&#x60; -&gt; ServiceTypeComparison  * &#x60;PAAS_TYPE&#x60; -&gt; PaasTypeComparison  * &#x60;CLOUD_TYPE&#x60; -&gt; CloudTypeComparison  * &#x60;AZURE_SKU&#x60; -&gt; AzureSkuComparision  * &#x60;AZURE_COMPUTE_MODE&#x60; -&gt; AzureComputeModeComparison  * &#x60;ENTITY_ID&#x60; -&gt; EntityIdComparison  * &#x60;SIMPLE_TECH&#x60; -&gt; SimpleTechComparison  * &#x60;SIMPLE_HOST_TECH&#x60; -&gt; SimpleHostTechComparison  * &#x60;SERVICE_TOPOLOGY&#x60; -&gt; ServiceTopologyComparison  * &#x60;DATABASE_TOPOLOGY&#x60; -&gt; DatabaseTopologyComparison  * &#x60;OS_TYPE&#x60; -&gt; OsTypeComparison  * &#x60;HYPERVISOR_TYPE&#x60; -&gt; HypervisorTypeComparision  * &#x60;IP_ADDRESS&#x60; -&gt; IpAddressComparison  * &#x60;OS_ARCHITECTURE&#x60; -&gt; OsArchitectureComparison  * &#x60;BITNESS&#x60; -&gt; BitnessComparision  * &#x60;APPLICATION_TYPE&#x60; -&gt; ApplicationTypeComparison  * &#x60;MOBILE_PLATFORM&#x60; -&gt; MobilePlatformComparison  * &#x60;CUSTOM_APPLICATION_TYPE&#x60; -&gt; CustomApplicationTypeComparison  * &#x60;DCRUM_DECODER_TYPE&#x60; -&gt; DcrumDecoderComparison  * &#x60;SYNTHETIC_ENGINE_TYPE&#x60; -&gt; SyntheticEngineTypeComparison  * &#x60;TAG&#x60; -&gt; TagComparison  * &#x60;INDEXED_TAG&#x60; -&gt; IndexedTagComparison   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_TYPE | &quot;APPLICATION_TYPE&quot; |
| AZURE_COMPUTE_MODE | &quot;AZURE_COMPUTE_MODE&quot; |
| AZURE_SKU | &quot;AZURE_SKU&quot; |
| BITNESS | &quot;BITNESS&quot; |
| CLOUD_TYPE | &quot;CLOUD_TYPE&quot; |
| CUSTOM_APPLICATION_TYPE | &quot;CUSTOM_APPLICATION_TYPE&quot; |
| DATABASE_TOPOLOGY | &quot;DATABASE_TOPOLOGY&quot; |
| DCRUM_DECODER_TYPE | &quot;DCRUM_DECODER_TYPE&quot; |
| ENTITY_ID | &quot;ENTITY_ID&quot; |
| HYPERVISOR_TYPE | &quot;HYPERVISOR_TYPE&quot; |
| INDEXED_NAME | &quot;INDEXED_NAME&quot; |
| INDEXED_STRING | &quot;INDEXED_STRING&quot; |
| INDEXED_TAG | &quot;INDEXED_TAG&quot; |
| INTEGER | &quot;INTEGER&quot; |
| IP_ADDRESS | &quot;IP_ADDRESS&quot; |
| MOBILE_PLATFORM | &quot;MOBILE_PLATFORM&quot; |
| OS_ARCHITECTURE | &quot;OS_ARCHITECTURE&quot; |
| OS_TYPE | &quot;OS_TYPE&quot; |
| PAAS_TYPE | &quot;PAAS_TYPE&quot; |
| SERVICE_TOPOLOGY | &quot;SERVICE_TOPOLOGY&quot; |
| SERVICE_TYPE | &quot;SERVICE_TYPE&quot; |
| SIMPLE_HOST_TECH | &quot;SIMPLE_HOST_TECH&quot; |
| SIMPLE_TECH | &quot;SIMPLE_TECH&quot; |
| STRING | &quot;STRING&quot; |
| SYNTHETIC_ENGINE_TYPE | &quot;SYNTHETIC_ENGINE_TYPE&quot; |
| TAG | &quot;TAG&quot; |



