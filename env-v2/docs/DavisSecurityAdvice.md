

# DavisSecurityAdvice

Security advice from the Davis security advisor.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the advice. |  [optional] [readonly] |
|**vulnerableComponent** | **String** | The vulnerable component to which advice applies. |  [optional] [readonly] |
|**technology** | [**TechnologyEnum**](#TechnologyEnum) | The technology of the vulnerable component. |  [optional] [readonly] |
|**adviceType** | [**AdviceTypeEnum**](#AdviceTypeEnum) | The type of the advice. |  [optional] [readonly] |
|**critical** | **List&lt;String&gt;** | IDs of &#x60;critical&#x60; level [security problems](https://dt-url.net/p103u1h) caused by vulnerable component. |  [optional] [readonly] |
|**high** | **List&lt;String&gt;** | IDs of &#x60;high&#x60; level [security problems](https://dt-url.net/p103u1h) caused by vulnerable component. |  [optional] [readonly] |
|**medium** | **List&lt;String&gt;** | IDs of &#x60;medium&#x60; level [security problems](https://dt-url.net/p103u1h) caused by vulnerable component. |  [optional] [readonly] |
|**low** | **List&lt;String&gt;** | IDs of &#x60;low&#x60; level [security problems](https://dt-url.net/p103u1h) caused by vulnerable component. |  [optional] [readonly] |
|**none** | **List&lt;String&gt;** | IDs of &#x60;none&#x60; level [security problems](https://dt-url.net/p103u1h) caused by vulnerable component. |  [optional] [readonly] |



## Enum: TechnologyEnum

| Name | Value |
|---- | -----|
| DOTNET | &quot;DOTNET&quot; |
| GO | &quot;GO&quot; |
| JAVA | &quot;JAVA&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| NODE_JS | &quot;NODE_JS&quot; |
| PHP | &quot;PHP&quot; |



## Enum: AdviceTypeEnum

| Name | Value |
|---- | -----|
| UPGRADE | &quot;UPGRADE&quot; |



