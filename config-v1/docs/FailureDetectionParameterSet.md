

# FailureDetectionParameterSet

A set of failure detection parameters (FDP).   These parameters define the conditions of failure and success.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the parameter set. |  [optional] |
|**name** | **String** | The display name of the FDP set.   The length of the name is limited to 150 characters. |  [optional] |
|**description** | **String** | A short description of the FDP set. |  [optional] |
|**clientSideMissingHttpCodeIsFailure** | **Boolean** | The missing HTTP response code on the client side is a failure (&#x60;true&#x60;) or a success (&#x60;false&#x60;).   If not set, &#x60;false&#x60; is used. |  [optional] |
|**serverSideMissingHttpCodeIsFailure** | **Boolean** | The missing HTTP response code on the server side is a failure (&#x60;true&#x60;) or a success (&#x60;false&#x60;).   If not set, &#x60;false&#x60; is used. |  [optional] |
|**failingHttpCodesClientSide** | **String** | A list of client side HTTP response codes that are considered a failure.   The format is a list of ranges and individual values (for example, &#x60;500-599, 400-499, 1008&#x60;).   If not set, the range of &#x60;400-599&#x60; is used. |  [optional] |
|**failingHttpCodesServerSide** | **String** | A list of server side HTTP response codes that are considered a failure.   The format is a list of ranges and individual values (for example, &#x60;500-599, 400-499, 1008&#x60;).If not set, the range of &#x60;500-599&#x60; is used. |  [optional] |
|**http404NotFoundFailureEnabled** | **Boolean** | Special handling of the 404 HTTP response code is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). See **brokenLinkDomains** for special handling details.   Only applicable when 404 is NOT in the list of failing HTTP response codes and only for the server side.   If not set, &#x60;false&#x60; is used. |  [optional] |
|**brokenLinkDomains** | **List&lt;String&gt;** | A list of domains for the special handling of the 404 HTTP response code.   If the top domain of the *Referer* is presented in the list OR equals the top domain of the request&#39;s host, the 404 code is considered a failure.   Only applicable when **isHttp404NotFoundFailureEnabled** is set to &#x60;true&#x60;. |  [optional] |
|**ignoreAllExceptions** | **Boolean** | If set to true all exceptions will be ignored. Which means defined exception patterns will not have any effect. |  [optional] |
|**successForcingExceptionPatterns** | [**List&lt;ExceptionPattern&gt;**](ExceptionPattern.md) | A list of success exceptions.   If an exception on the entry node of the service matches *any* of these patterns it is considered a success. |  [optional] |
|**ignoredExceptionPatterns** | [**List&lt;ExceptionPattern&gt;**](ExceptionPattern.md) | A list of ignored exceptions.   If an exception on the entry node of the service matches *any* of these patterns it is ignored by failure detection. |  [optional] |
|**exceptionOnAnyNodeExceptionPatterns** | [**List&lt;ExceptionPattern&gt;**](ExceptionPattern.md) | A list of faulty exceptions.   If an exception on *any* node of the service matches *any* of these patterns it is considered a failure. |  [optional] |
|**tagConditions** | [**List&lt;FdpTagCondition&gt;**](FdpTagCondition.md) | A list of tag-based conditions.   If *any* condition is fulfilled the request is considered a failure. |  [optional] |
|**ignoreSpanFailureDetection** | **Boolean** | If set to true span failure detection will be ignored. |  [optional] |



