

# MonitoringSettings

Real user monitoring settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fetchRequests** | **Boolean** | &#x60;fetch()&#x60; request capture enabled/disabled. |  |
|**xmlHttpRequest** | **Boolean** | &#x60;XmlHttpRequest&#x60; support enabled/disabled. |  |
|**javaScriptFrameworkSupport** | [**JavaScriptFrameworkSupport**](JavaScriptFrameworkSupport.md) |  |  |
|**contentCapture** | [**ContentCapture**](ContentCapture.md) |  |  |
|**excludeXhrRegex** | **String** | You can exclude some actions from becoming XHR actions.  Put a regular expression, matching all the required URLs, here.  If noting specified the feature is disabled. |  |
|**correlationHeaderInclusionRegex** | **String** | To enable RUM for XHR calls to AWS Lambda, define a regular expression matching these calls, Dynatrace can then automatically add a custom header (x-dtc) to each such request to the respective endpoints in AWS.  Important: These endpoints must accept the x-dtc header, or the requests will fail.  |  [optional] |
|**injectionMode** | [**InjectionModeEnum**](#InjectionModeEnum) | JavaScript injection mode. |  |
|**addCrossOriginAnonymousAttribute** | **Boolean** | Add the cross origin &#x3D; anonymous attribute to capture JavaScript error messages and W3C resource timings. |  [optional] |
|**scriptTagCacheDurationInHours** | **Integer** | Time duration for the cache settings. |  [optional] |
|**libraryFileLocation** | **String** | The location of your application’s custom JavaScript library file.    If nothing specified the root directory of your web server is used.    **Required** for auto-injected applications, not supported by agentless applications. |  [optional] |
|**monitoringDataPath** | **String** | The location to send monitoring data from the JavaScript tag.   Specify either a relative or an absolute URL. If you use an absolute URL, data will be sent using CORS.    **Required** for auto-injected applications, optional for agentless applications. |  [optional] |
|**customConfigurationProperties** | **String** | Additional JavaScript tag properties that are specific to your application. To do this, type key&#x3D;value pairs separated using a (|) symbol. |  |
|**serverRequestPathId** | **String** | Path to identify the server’s request ID. |  |
|**secureCookieAttribute** | **Boolean** | Secure attribute usage for Dynatrace cookies enabled/disabled. |  |
|**cookiePlacementDomain** | **String** | Domain for cookie placement. |  |
|**cacheControlHeaderOptimizations** | **Boolean** | Optimize the value of cache control headers for use with Dynatrace real user monitoring enabled/disabled. |  |
|**advancedJavaScriptTagSettings** | [**AdvancedJavaScriptTagSettings**](AdvancedJavaScriptTagSettings.md) |  |  |
|**browserRestrictionSettings** | [**WebApplicationConfigBrowserRestrictionSettings**](WebApplicationConfigBrowserRestrictionSettings.md) |  |  [optional] |
|**ipAddressRestrictionSettings** | [**WebApplicationConfigIpAddressRestrictionSettings**](WebApplicationConfigIpAddressRestrictionSettings.md) |  |  [optional] |
|**javaScriptInjectionRules** | [**List&lt;JavaScriptInjectionRules&gt;**](JavaScriptInjectionRules.md) | Java script injection rules. |  [optional] |
|**angularPackageName** | **String** | The name of the angular package. |  [optional] |



## Enum: InjectionModeEnum

| Name | Value |
|---- | -----|
| CODE_SNIPPET | &quot;CODE_SNIPPET&quot; |
| CODE_SNIPPET_ASYNC | &quot;CODE_SNIPPET_ASYNC&quot; |
| INLINE_CODE | &quot;INLINE_CODE&quot; |
| JAVASCRIPT_TAG | &quot;JAVASCRIPT_TAG&quot; |



