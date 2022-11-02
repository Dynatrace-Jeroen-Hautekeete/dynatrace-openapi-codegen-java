

# WaterfallSettings

These settings influence the monitoring data you receive for 3rd party, CDN, and 1st party resources.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uncompressedResourcesThreshold** | **Integer** | Warn about uncompressed resources larger than *X* bytes. |  |
|**resourcesThreshold** | **Integer** | Warn about resources larger than *X* bytes. |  |
|**resourceBrowserCachingThreshold** | **Integer** | Warn about resources with a lower browser cache rate above *X*%. |  |
|**slowFirstPartyResourcesThreshold** | **Integer** | Warn about slow 1st party resources with a response time above *X* ms. |  |
|**slowThirdPartyResourcesThreshold** | **Integer** | Warn about slow 3rd party resources with a response time above *X* ms. |  |
|**slowCdnResourcesThreshold** | **Integer** | Warn about slow CDN resources with a response time above *X* ms. |  |
|**speedIndexVisuallyCompleteRatioThreshold** | **Integer** | Warn if Speed index exceeds *X* % of Visually complete. |  |



