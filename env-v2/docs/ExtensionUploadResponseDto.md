

# ExtensionUploadResponseDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionName** | **String** | Extension name |  [optional] |
|**version** | **String** | Extension version |  [optional] |
|**author** | [**AuthorDto**](AuthorDto.md) |  |  [optional] |
|**dataSources** | **List&lt;String&gt;** | Data sources that extension uses to gather data |  [optional] |
|**variables** | **List&lt;String&gt;** | Custom variables used in extension configuration |  [optional] |
|**featureSets** | **Set&lt;String&gt;** | Available feature sets |  [optional] |
|**featureSetsDetails** | [**Map&lt;String, FeatureSetDetails&gt;**](FeatureSetDetails.md) | Details of feature sets |  [optional] |
|**minDynatraceVersion** | **String** | Minimal Dynatrace version that works with the extension |  [optional] |
|**minEECVersion** | **String** | Minimal Extension Execution Controller version that works with the extension |  [optional] |
|**fileHash** | **String** | SHA-256 hash of uploaded Extension file |  [optional] |
|**assetsInfo** | [**Set&lt;AssetInfo&gt;**](AssetInfo.md) | Information about extension assets included |  [optional] |



