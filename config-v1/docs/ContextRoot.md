

# ContextRoot

The contribution to the service ID calculation from the detected context root.    The context root is the first segment of the request URL after server name. For example, in the `www.dynatrace.com/support/help/dynatrace-api/` URL the context root is `support`.   You have two options:  * Keep a part of the detected URL. Specify the number of segments to be kept in the **segmentsToCopyFromUrlPath** field.  * Dynamically transform the detected URL. Specify the transformation parameters in the **transformations** field.   You can use one or both options. If you use both, the transformation applies to the modified URL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transformations** | [**List&lt;ContextRootTransformation&gt;**](ContextRootTransformation.md) | Transformations to be applied to the detected value. |  [optional] |
|**segmentsToCopyFromUrlPath** | **Integer** | The number of segments of the URL to be kept.   The URL is divided by slashes (&#x60;/&#x60;), the indexing starts with 1 at context root.   For example, if you specify &#x60;2&#x60; for the &#x60;www.dynatrace.com/support/help/dynatrace-api/&#x60; URL, the value of &#x60;support/help&#x60; is used. |  [optional] |



