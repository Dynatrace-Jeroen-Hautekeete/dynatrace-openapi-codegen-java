# LogMonitoringHostsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hostLogJobDelete**](LogMonitoringHostsApi.md#hostLogJobDelete) | **DELETE** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**hostLogJobDeleteWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobDeleteWithHttpInfo) | **DELETE** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**hostLogJobRecords**](LogMonitoringHostsApi.md#hostLogJobRecords) | **GET** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records | Gets the full content of the analyzed log |
| [**hostLogJobRecordsWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobRecordsWithHttpInfo) | **GET** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records | Gets the full content of the analyzed log |
| [**hostLogJobRecordsFiltered**](LogMonitoringHostsApi.md#hostLogJobRecordsFiltered) | **POST** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records | Gets the filtered content of the analyzed log |
| [**hostLogJobRecordsFilteredWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobRecordsFilteredWithHttpInfo) | **POST** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records | Gets the filtered content of the analyzed log |
| [**hostLogJobRecordsTop**](LogMonitoringHostsApi.md#hostLogJobRecordsTop) | **POST** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**hostLogJobRecordsTopWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobRecordsTopWithHttpInfo) | **POST** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**hostLogJobStart**](LogMonitoringHostsApi.md#hostLogJobStart) | **POST** /entity/infrastructure/hosts/{hostId}/logs/{logPath} | Starts the analysis job for the specified OS log |
| [**hostLogJobStartWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobStartWithHttpInfo) | **POST** /entity/infrastructure/hosts/{hostId}/logs/{logPath} | Starts the analysis job for the specified OS log |
| [**hostLogJobStatus**](LogMonitoringHostsApi.md#hostLogJobStatus) | **GET** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**hostLogJobStatusWithHttpInfo**](LogMonitoringHostsApi.md#hostLogJobStatusWithHttpInfo) | **GET** /entity/infrastructure/hosts/{hostId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**hostLogList**](LogMonitoringHostsApi.md#hostLogList) | **GET** /entity/infrastructure/hosts/{hostId}/logs | Lists all the available OS logs on the specified host |
| [**hostLogListWithHttpInfo**](LogMonitoringHostsApi.md#hostLogListWithHttpInfo) | **GET** /entity/infrastructure/hosts/{hostId}/logs | Lists all the available OS logs on the specified host |



## hostLogJobDelete

> LogJobDeleteResult hostLogJobDelete(hostId, jobId)

Deletes or cancels the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        try {
            LogJobDeleteResult result = apiInstance.hostLogJobDelete(hostId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |

### Return type

[**LogJobDeleteResult**](LogJobDeleteResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The job has been deleted. |  -  |
| **400** | Failed. See the response body for details |  -  |
| **404** | Not found. See the response body for details. |  -  |

## hostLogJobDeleteWithHttpInfo

> ApiResponse<LogJobDeleteResult> hostLogJobDelete hostLogJobDeleteWithHttpInfo(hostId, jobId)

Deletes or cancels the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        try {
            ApiResponse<LogJobDeleteResult> response = apiInstance.hostLogJobDeleteWithHttpInfo(hostId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |

### Return type

ApiResponse<[**LogJobDeleteResult**](LogJobDeleteResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The job has been deleted. |  -  |
| **400** | Failed. See the response body for details |  -  |
| **404** | Not found. See the response body for details. |  -  |


## hostLogJobRecords

> LogJobRecordsResult hostLogJobRecords(hostId, jobId, scrollToken, pageSize)

Gets the full content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            LogJobRecordsResult result = apiInstance.hostLogJobRecords(hostId, jobId, scrollToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **scrollToken** | **String**| The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned. | [optional] |
| **pageSize** | **Integer**| The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is &#x60;10000&#x60;. | [optional] |

### Return type

[**LogJobRecordsResult**](LogJobRecordsResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

## hostLogJobRecordsWithHttpInfo

> ApiResponse<LogJobRecordsResult> hostLogJobRecords hostLogJobRecordsWithHttpInfo(hostId, jobId, scrollToken, pageSize)

Gets the full content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.hostLogJobRecordsWithHttpInfo(hostId, jobId, scrollToken, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **scrollToken** | **String**| The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned. | [optional] |
| **pageSize** | **Integer**| The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is &#x60;10000&#x60;. | [optional] |

### Return type

ApiResponse<[**LogJobRecordsResult**](LogJobRecordsResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |


## hostLogJobRecordsFiltered

> LogJobRecordsResult hostLogJobRecordsFiltered(hostId, jobId, scrollToken, pageSize, filterLogContent)

Gets the filtered content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsResult result = apiInstance.hostLogJobRecordsFiltered(hostId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecordsFiltered");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **scrollToken** | **String**| The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned. | [optional] |
| **pageSize** | **Integer**| The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is &#x60;10000&#x60;. | [optional] |
| **filterLogContent** | [**FilterLogContent**](FilterLogContent.md)| Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples. | [optional] |

### Return type

[**LogJobRecordsResult**](LogJobRecordsResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

## hostLogJobRecordsFilteredWithHttpInfo

> ApiResponse<LogJobRecordsResult> hostLogJobRecordsFiltered hostLogJobRecordsFilteredWithHttpInfo(hostId, jobId, scrollToken, pageSize, filterLogContent)

Gets the filtered content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.hostLogJobRecordsFilteredWithHttpInfo(hostId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecordsFiltered");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **scrollToken** | **String**| The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned. | [optional] |
| **pageSize** | **Integer**| The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is &#x60;10000&#x60;. | [optional] |
| **filterLogContent** | [**FilterLogContent**](FilterLogContent.md)| Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples. | [optional] |

### Return type

ApiResponse<[**LogJobRecordsResult**](LogJobRecordsResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |


## hostLogJobRecordsTop

> LogJobRecordsTopValuesRestResult hostLogJobRecordsTop(hostId, jobId, filterTopLogRecords)

Gets the top values of fields present in the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsTopValuesRestResult result = apiInstance.hostLogJobRecordsTop(hostId, jobId, filterTopLogRecords);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecordsTop");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **filterTopLogRecords** | [**FilterTopLogRecords**](FilterTopLogRecords.md)| Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples. | [optional] |

### Return type

[**LogJobRecordsTopValuesRestResult**](LogJobRecordsTopValuesRestResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

## hostLogJobRecordsTopWithHttpInfo

> ApiResponse<LogJobRecordsTopValuesRestResult> hostLogJobRecordsTop hostLogJobRecordsTopWithHttpInfo(hostId, jobId, filterTopLogRecords)

Gets the top values of fields present in the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/mkc3rss) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsTopValuesRestResult> response = apiInstance.hostLogJobRecordsTopWithHttpInfo(hostId, jobId, filterTopLogRecords);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobRecordsTop");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |
| **filterTopLogRecords** | [**FilterTopLogRecords**](FilterTopLogRecords.md)| Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples. | [optional] |

### Return type

ApiResponse<[**LogJobRecordsTopValuesRestResult**](LogJobRecordsTopValuesRestResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |


## hostLogJobStart

> String hostLogJobStart(hostId, logPath, query, startTimestamp, endTimestamp, extractFields)

Starts the analysis job for the specified OS log

The response returns the ID of the job.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            String result = apiInstance.hostLogJobStart(hostId, logPath, query, startTimestamp, endTimestamp, extractFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobStart");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **logPath** | **String**| The full pathname of the log. | |
| **query** | **String**| Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp). | [optional] |
| **startTimestamp** | **Long**| The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used. | [optional] |
| **extractFields** | [**ExtractFields**](ExtractFields.md)| Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped. | [optional] |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success. The response body contains the ID of the job. |  -  |
| **400** | Failed. See the response body for details. |  -  |
| **404** | Not found. See the response body for details. |  -  |

## hostLogJobStartWithHttpInfo

> ApiResponse<String> hostLogJobStart hostLogJobStartWithHttpInfo(hostId, logPath, query, startTimestamp, endTimestamp, extractFields)

Starts the analysis job for the specified OS log

The response returns the ID of the job.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            ApiResponse<String> response = apiInstance.hostLogJobStartWithHttpInfo(hostId, logPath, query, startTimestamp, endTimestamp, extractFields);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobStart");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **logPath** | **String**| The full pathname of the log. | |
| **query** | **String**| Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp). | [optional] |
| **startTimestamp** | **Long**| The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used. | [optional] |
| **extractFields** | [**ExtractFields**](ExtractFields.md)| Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped. | [optional] |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success. The response body contains the ID of the job. |  -  |
| **400** | Failed. See the response body for details. |  -  |
| **404** | Not found. See the response body for details. |  -  |


## hostLogJobStatus

> LogJobStatusResult hostLogJobStatus(hostId, jobId)

Gets status of the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        try {
            LogJobStatusResult result = apiInstance.hostLogJobStatus(hostId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |

### Return type

[**LogJobStatusResult**](LogJobStatusResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

## hostLogJobStatusWithHttpInfo

> ApiResponse<LogJobStatusResult> hostLogJobStatus hostLogJobStatusWithHttpInfo(hostId, jobId)

Gets status of the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request.
        try {
            ApiResponse<LogJobStatusResult> response = apiInstance.hostLogJobStatusWithHttpInfo(hostId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogJobStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/52k3r7f) request. | |

### Return type

ApiResponse<[**LogJobStatusResult**](LogJobStatusResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |


## hostLogList

> LogList4hostResult hostLogList(hostId)

Lists all the available OS logs on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        try {
            LogList4hostResult result = apiInstance.hostLogList(hostId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

[**LogList4hostResult**](LogList4hostResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

## hostLogListWithHttpInfo

> ApiResponse<LogList4hostResult> hostLogList hostLogListWithHttpInfo(hostId)

Lists all the available OS logs on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringHostsApi apiInstance = new LogMonitoringHostsApi(defaultClient);
        String hostId = "hostId_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<LogList4hostResult> response = apiInstance.hostLogListWithHttpInfo(hostId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringHostsApi#hostLogList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hostId** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

ApiResponse<[**LogList4hostResult**](LogList4hostResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. See the response body for details |  -  |

