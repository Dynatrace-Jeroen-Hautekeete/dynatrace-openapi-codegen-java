

# Impact

The impact analysis of the problem on other entities/users.    The actual set of fields depends on the type of the impact. Find the list of actual objects in the description of the **impactType** field or see [Problems API v2 - JSON models](https://dt-url.net/we03sp2).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**impactType** | [**ImpactTypeEnum**](#ImpactTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;SERVICE&#x60; -&gt; ServiceImpact  * &#x60;APPLICATION&#x60; -&gt; ApplicationImpact  * &#x60;MOBILE&#x60; -&gt; MobileImpact  * &#x60;CUSTOM_APPLICATION&#x60; -&gt; CustomApplicationImpact   |  |
|**impactedEntity** | [**EntityStub**](EntityStub.md) |  |  |
|**estimatedAffectedUsers** | **Long** | The estimated number of affected users. |  |



## Enum: ImpactTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| MOBILE | &quot;MOBILE&quot; |
| SERVICE | &quot;SERVICE&quot; |



