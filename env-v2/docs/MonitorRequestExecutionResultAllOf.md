

# MonitorRequestExecutionResultAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | Request id. |  [optional] |
|**requestName** | **String** | Request name. |  [optional] |
|**sequenceNumber** | **Integer** | Request&#39;s sequence number. |  [optional] |
|**startTimestamp** | **Long** | Request start timestamp. |  [optional] |
|**engineId** | **Long** | VUC&#39;s id on which monitor&#39;s request was executed. |  [optional] |
|**publicLocation** | **Boolean** | Flag informs whether request was executed on public location. |  [optional] |
|**url** | **String** | Request URL address. |  [optional] |
|**method** | **String** | Request method type. |  [optional] |
|**requestBody** | **String** | Request&#39;s request body. |  [optional] |
|**requestHeaders** | [**List&lt;MonitorRequestHeader&gt;**](MonitorRequestHeader.md) | A list of request&#39;s headers |  [optional] |
|**responseStatusCode** | **Integer** | Request&#39;s response status code. |  [optional] |
|**responseBody** | **String** | Request&#39;s response body. |  [optional] |
|**responseSize** | **Long** | Request&#39;s response size in bytes. |  [optional] |
|**responseBodySizeLimitExceeded** | **Boolean** | A flag indicating that the response payload size limit of 10MB has been exceeded. |  [optional] |
|**responseHeaders** | [**List&lt;MonitorRequestHeader&gt;**](MonitorRequestHeader.md) | A list of request&#39;s response headers |  [optional] |
|**resolvedIps** | **List&lt;String&gt;** | Request&#39;s resolved ips.&#39; |  [optional] |
|**healthStatusCode** | **Integer** | Request&#39;s health status code. |  [optional] |
|**healthStatus** | **String** | Request&#39;s health status. |  [optional] |
|**responseMessage** | **String** | Request&#39;s response message.&#39; |  [optional] |
|**peerCertificateExpiryDate** | **Long** | An expiry date of the first SSL certificate from the certificate chain. |  [optional] |
|**peerCertificateDetails** | **String** | Request&#39;s certificate details. |  [optional] |
|**totalTime** | **Long** | A total request time measured in ms. |  [optional] |
|**hostNameResolutionTime** | **Long** | A hostname resolution time measured in ms. |  [optional] |
|**tcpConnectTime** | **Long** | A TCP connect time measured in ms. |  [optional] |
|**tlsHandshakeTime** | **Long** | A TLS handshake time measured in ms. |  [optional] |
|**timeToFirstByte** | **Long** | A time to first byte measured in ms. |  [optional] |
|**redirectionTime** | **Long** | Total number of milliseconds spent on handling all redirect requests, measured in ms. |  [optional] |
|**waitingTime** | **Long** | Waiting time (time to first byte - (DNS lookup time + TCP connect time + TLS handshake time), measured in ms. |  [optional] |
|**redirectsCount** | **Integer** | Number of request&#39;s redirects. |  [optional] |
|**failureMessage** | **String** | Request&#39;s failure message. |  [optional] |



