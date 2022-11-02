# LogMonitoringProcessGroupsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**processGroupLogJobDelete**](LogMonitoringProcessGroupsApi.md#processGroupLogJobDelete) | **DELETE** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**processGroupLogJobDeleteWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobDeleteWithHttpInfo) | **DELETE** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**processGroupLogJobRecords**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecords) | **GET** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**processGroupLogJobRecordsWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecordsWithHttpInfo) | **GET** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**processGroupLogJobRecordsFiltered**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecordsFiltered) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**processGroupLogJobRecordsFilteredWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecordsFilteredWithHttpInfo) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**processGroupLogJobRecordsTop**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecordsTop) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**processGroupLogJobRecordsTopWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobRecordsTopWithHttpInfo) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**processGroupLogJobStart**](LogMonitoringProcessGroupsApi.md#processGroupLogJobStart) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/{logPath} | Starts analysis job for the specified process group log |
| [**processGroupLogJobStartWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobStartWithHttpInfo) | **POST** /entity/infrastructure/process-groups/{pgId}/logs/{logPath} | Starts analysis job for the specified process group log |
| [**processGroupLogJobStatus**](LogMonitoringProcessGroupsApi.md#processGroupLogJobStatus) | **GET** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**processGroupLogJobStatusWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogJobStatusWithHttpInfo) | **GET** /entity/infrastructure/process-groups/{pgId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**processGroupLogList**](LogMonitoringProcessGroupsApi.md#processGroupLogList) | **GET** /entity/infrastructure/process-groups/{pgId}/logs | Lists all the available logs of the specified process group |
| [**processGroupLogListWithHttpInfo**](LogMonitoringProcessGroupsApi.md#processGroupLogListWithHttpInfo) | **GET** /entity/infrastructure/process-groups/{pgId}/logs | Lists all the available logs of the specified process group |



## processGroupLogJobDelete

> LogJobDeleteResult processGroupLogJobDelete(pgId, jobId)

Deletes or cancels the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        try {
            LogJobDeleteResult result = apiInstance.processGroupLogJobDelete(pgId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobDelete");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |

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
| **400** | Failed. See response body for details |  -  |
| **404** | Not found. See response body for details |  -  |

## processGroupLogJobDeleteWithHttpInfo

> ApiResponse<LogJobDeleteResult> processGroupLogJobDelete processGroupLogJobDeleteWithHttpInfo(pgId, jobId)

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
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        try {
            ApiResponse<LogJobDeleteResult> response = apiInstance.processGroupLogJobDeleteWithHttpInfo(pgId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobDelete");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |

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
| **400** | Failed. See response body for details |  -  |
| **404** | Not found. See response body for details |  -  |


## processGroupLogJobRecords

> LogJobRecordsResult processGroupLogJobRecords(pgId, jobId, scrollToken, pageSize)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            LogJobRecordsResult result = apiInstance.processGroupLogJobRecords(pgId, jobId, scrollToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecords");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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

## processGroupLogJobRecordsWithHttpInfo

> ApiResponse<LogJobRecordsResult> processGroupLogJobRecords processGroupLogJobRecordsWithHttpInfo(pgId, jobId, scrollToken, pageSize)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.processGroupLogJobRecordsWithHttpInfo(pgId, jobId, scrollToken, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecords");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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


## processGroupLogJobRecordsFiltered

> LogJobRecordsResult processGroupLogJobRecordsFiltered(pgId, jobId, scrollToken, pageSize, filterLogContent)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsResult result = apiInstance.processGroupLogJobRecordsFiltered(pgId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecordsFiltered");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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

## processGroupLogJobRecordsFilteredWithHttpInfo

> ApiResponse<LogJobRecordsResult> processGroupLogJobRecordsFiltered processGroupLogJobRecordsFilteredWithHttpInfo(pgId, jobId, scrollToken, pageSize, filterLogContent)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/wve3r83) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.processGroupLogJobRecordsFilteredWithHttpInfo(pgId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecordsFiltered");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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


## processGroupLogJobRecordsTop

> LogJobRecordsTopValuesRestResult processGroupLogJobRecordsTop(pgId, jobId, filterTopLogRecords)

Gets the top values of fields present in the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsTopValuesRestResult result = apiInstance.processGroupLogJobRecordsTop(pgId, jobId, filterTopLogRecords);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecordsTop");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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

## processGroupLogJobRecordsTopWithHttpInfo

> ApiResponse<LogJobRecordsTopValuesRestResult> processGroupLogJobRecordsTop processGroupLogJobRecordsTopWithHttpInfo(pgId, jobId, filterTopLogRecords)

Gets the top values of fields present in the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsTopValuesRestResult> response = apiInstance.processGroupLogJobRecordsTopWithHttpInfo(pgId, jobId, filterTopLogRecords);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobRecordsTop");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |
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


## processGroupLogJobStart

> String processGroupLogJobStart(pgId, logPath, hostFilter, query, startTimestamp, endTimestamp, extractFields)

Starts analysis job for the specified process group log

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String hostFilter = "hostFilter_example"; // String | Narrows down the scope of the analysis to process groups, running at the specified hosts.   Specify the entity ID of the required host here. To specify several IDs, separate them with a comma.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            String result = apiInstance.processGroupLogJobStart(pgId, logPath, hostFilter, query, startTimestamp, endTimestamp, extractFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobStart");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **logPath** | **String**| The full pathname of the log. | |
| **hostFilter** | **String**| Narrows down the scope of the analysis to process groups, running at the specified hosts.   Specify the entity ID of the required host here. To specify several IDs, separate them with a comma. | [optional] |
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
| **400** | Failed. See response body for details |  -  |
| **404** | Not found. See response body for details |  -  |

## processGroupLogJobStartWithHttpInfo

> ApiResponse<String> processGroupLogJobStart processGroupLogJobStartWithHttpInfo(pgId, logPath, hostFilter, query, startTimestamp, endTimestamp, extractFields)

Starts analysis job for the specified process group log

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String hostFilter = "hostFilter_example"; // String | Narrows down the scope of the analysis to process groups, running at the specified hosts.   Specify the entity ID of the required host here. To specify several IDs, separate them with a comma.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            ApiResponse<String> response = apiInstance.processGroupLogJobStartWithHttpInfo(pgId, logPath, hostFilter, query, startTimestamp, endTimestamp, extractFields);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobStart");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **logPath** | **String**| The full pathname of the log. | |
| **hostFilter** | **String**| Narrows down the scope of the analysis to process groups, running at the specified hosts.   Specify the entity ID of the required host here. To specify several IDs, separate them with a comma. | [optional] |
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
| **400** | Failed. See response body for details |  -  |
| **404** | Not found. See response body for details |  -  |


## processGroupLogJobStatus

> LogJobStatusResult processGroupLogJobStatus(pgId, jobId)

Gets status of the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        try {
            LogJobStatusResult result = apiInstance.processGroupLogJobStatus(pgId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobStatus");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |

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

## processGroupLogJobStatusWithHttpInfo

> ApiResponse<LogJobStatusResult> processGroupLogJobStatus processGroupLogJobStatusWithHttpInfo(pgId, jobId)

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
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The Dynatrace entity ID of the required process group.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request.
        try {
            ApiResponse<LogJobStatusResult> response = apiInstance.processGroupLogJobStatusWithHttpInfo(pgId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogJobStatus");
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
| **pgId** | **String**| The Dynatrace entity ID of the required process group. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/c2m3rxl) request. | |

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


## processGroupLogList

> LogList4pgResult processGroupLogList(pgId)

Lists all the available logs of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The entity ID of the process group.
        try {
            LogList4pgResult result = apiInstance.processGroupLogList(pgId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogList");
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
| **pgId** | **String**| The entity ID of the process group. | |

### Return type

[**LogList4pgResult**](LogList4pgResult.md)


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

## processGroupLogListWithHttpInfo

> ApiResponse<LogList4pgResult> processGroupLogList processGroupLogListWithHttpInfo(pgId)

Lists all the available logs of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringProcessGroupsApi apiInstance = new LogMonitoringProcessGroupsApi(defaultClient);
        String pgId = "pgId_example"; // String | The entity ID of the process group.
        try {
            ApiResponse<LogList4pgResult> response = apiInstance.processGroupLogListWithHttpInfo(pgId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringProcessGroupsApi#processGroupLogList");
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
| **pgId** | **String**| The entity ID of the process group. | |

### Return type

ApiResponse<[**LogList4pgResult**](LogList4pgResult.md)>


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

