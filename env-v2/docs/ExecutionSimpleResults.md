

# ExecutionSimpleResults

Contains basic results of the monitor's on-demand execution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Execution status. |  [optional] |
|**failureMessage** | **String** | Failure message. |  [optional] |
|**errorCode** | **String** | Error code. |  [optional] |
|**responseStatusCode** | **Integer** | Response status code. |  [optional] |
|**executedSteps** | **Integer** | Number of the executed steps by Synthetic engine |  [optional] |
|**engineId** | **Long** | Synthetic engine id on which monitor was executed. |  [optional] |
|**publicLocation** | **Boolean** | Flag informs whether request was executed on public location. |  [optional] |
|**responseSize** | **Long** | Request&#39;s response size in bytes. |  [optional] |
|**responseBodySizeLimitExceeded** | **Boolean** | A flag indicating that the response payload size limit of 10MB has been exceeded. |  [optional] |
|**peerCertificateExpiryDate** | **Long** | An expiry date of the first SSL certificate from the certificate chain. |  [optional] |
|**totalTime** | **Long** | A total time measured in milliseconds. |  [optional] |
|**hostNameResolutionTime** | **Long** | A hostname resolution time measured in milliseconds. |  [optional] |
|**tcpConnectTime** | **Long** | A TCP connect time measured in milliseconds. |  [optional] |
|**tlsHandshakeTime** | **Long** | A TLS handshake time measured in milliseconds. |  [optional] |
|**timeToFirstByte** | **Long** | A time to first byte measured in milliseconds. |  [optional] |
|**redirectionTime** | **Long** | Total number of milliseconds spent on handling all redirect requests, measured in milliseconds. |  [optional] |
|**redirectsCount** | **Integer** | Number of redirects. |  [optional] |
|**httperror** | **Boolean** | Informs whether is HTTP error. |  [optional] |
|**chromeError** | **Boolean** | Informs whether is Chrome error. |  [optional] |
|**startTimestamp** | **Long** | Start timestamp. |  [optional] |



