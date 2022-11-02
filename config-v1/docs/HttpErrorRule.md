

# HttpErrorRule

Configuration of the HTTP error in the web application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**considerUnknownErrorCode** | **Boolean** | If &#x60;true&#x60;, match by errors that have unknown HTTP status code. |  |
|**considerBlockedRequests** | **Boolean** | If &#x60;true&#x60;, match by errors that have CSP Rule violations. |  [optional] |
|**errorCodes** | **String** | The HTTP status code or status code range to match by.   This field is required if **considerUnknownErrorCode** AND **considerBlockedRequests** are both set to &#x60;false&#x60;. |  [optional] |
|**filterByUrl** | **Boolean** | If &#x60;true&#x60;, filter errors by URL. |  |
|**filter** | [**FilterEnum**](#FilterEnum) | The matching rule for the URL. |  [optional] |
|**url** | **String** | The URL to look for. |  [optional] |
|**capture** | **Boolean** | Capture (&#x60;true&#x60;) or ignore (&#x60;false&#x60;) the error. |  |
|**impactApdex** | **Boolean** | Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Apdex calculation. |  |
|**considerForAi** | **Boolean** | Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Davis AI [problem detection and analysis](https://dt-url.net/a963kd2). |  |



## Enum: FilterEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |



