

# ResourceProvider

A rule for the content provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceName** | **String** | The name of the provider. |  |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The type of the provider. |  |
|**brandIconUrl** | **String** | The URL of the provider&#39;s icon. |  [optional] |
|**domainNamePatterns** | **List&lt;String&gt;** | A list of domain patterns of the provider. |  |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| CDN_RESOURCES | &quot;CDN_RESOURCES&quot; |
| FIRST_PARTY_RESOURCES | &quot;FIRST_PARTY_RESOURCES&quot; |
| THIRD_PARTY_RESOURCES | &quot;THIRD_PARTY_RESOURCES&quot; |



