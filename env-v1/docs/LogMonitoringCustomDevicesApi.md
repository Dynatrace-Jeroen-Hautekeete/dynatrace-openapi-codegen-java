# LogMonitoringCustomDevicesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customDeviceLogJobDelete**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobDelete) | **DELETE** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**customDeviceLogJobDeleteWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobDeleteWithHttpInfo) | **DELETE** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId} | Deletes or cancels the specified log analysis job |
| [**customDeviceLogJobRecords**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecords) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**customDeviceLogJobRecordsWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecordsWithHttpInfo) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records | Gets the content of the analyzed log |
| [**customDeviceLogJobRecordsFiltered**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecordsFiltered) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records | Gets the filtered content of the analyzed log |
| [**customDeviceLogJobRecordsFilteredWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecordsFilteredWithHttpInfo) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records | Gets the filtered content of the analyzed log |
| [**customDeviceLogJobRecordsTop**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecordsTop) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**customDeviceLogJobRecordsTopWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobRecordsTopWithHttpInfo) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId}/records/top | Gets the top values of fields present in the content of the analyzed log |
| [**customDeviceLogJobStart**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobStart) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/{logPath} | Starts the analysis job for the specified custom device log |
| [**customDeviceLogJobStartWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobStartWithHttpInfo) | **POST** /entity/infrastructure/custom-devices/{customDeviceId}/logs/{logPath} | Starts the analysis job for the specified custom device log |
| [**customDeviceLogJobStatus**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobStatus) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**customDeviceLogJobStatusWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogJobStatusWithHttpInfo) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs/jobs/{jobId} | Gets status of the specified log analysis job |
| [**customDeviceLogList**](LogMonitoringCustomDevicesApi.md#customDeviceLogList) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs | Lists all the available logs on the specified custom device |
| [**customDeviceLogListWithHttpInfo**](LogMonitoringCustomDevicesApi.md#customDeviceLogListWithHttpInfo) | **GET** /entity/infrastructure/custom-devices/{customDeviceId}/logs | Lists all the available logs on the specified custom device |



## customDeviceLogJobDelete

> LogJobDeleteResult customDeviceLogJobDelete(customDeviceId, jobId)

Deletes or cancels the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        try {
            LogJobDeleteResult result = apiInstance.customDeviceLogJobDelete(customDeviceId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobDelete");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |

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

## customDeviceLogJobDeleteWithHttpInfo

> ApiResponse<LogJobDeleteResult> customDeviceLogJobDelete customDeviceLogJobDeleteWithHttpInfo(customDeviceId, jobId)

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
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        try {
            ApiResponse<LogJobDeleteResult> response = apiInstance.customDeviceLogJobDeleteWithHttpInfo(customDeviceId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobDelete");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the log analysis job to be deleted.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |

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


## customDeviceLogJobRecords

> LogJobRecordsResult customDeviceLogJobRecords(customDeviceId, jobId, scrollToken, pageSize)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            LogJobRecordsResult result = apiInstance.customDeviceLogJobRecords(customDeviceId, jobId, scrollToken, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecords");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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

## customDeviceLogJobRecordsWithHttpInfo

> ApiResponse<LogJobRecordsResult> customDeviceLogJobRecords customDeviceLogJobRecordsWithHttpInfo(customDeviceId, jobId, scrollToken, pageSize)

Gets the content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.customDeviceLogJobRecordsWithHttpInfo(customDeviceId, jobId, scrollToken, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecords");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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


## customDeviceLogJobRecordsFiltered

> LogJobRecordsResult customDeviceLogJobRecordsFiltered(customDeviceId, jobId, scrollToken, pageSize, filterLogContent)

Gets the filtered content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsResult result = apiInstance.customDeviceLogJobRecordsFiltered(customDeviceId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecordsFiltered");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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

## customDeviceLogJobRecordsFilteredWithHttpInfo

> ApiResponse<LogJobRecordsResult> customDeviceLogJobRecordsFiltered customDeviceLogJobRecordsFilteredWithHttpInfo(customDeviceId, jobId, scrollToken, pageSize, filterLogContent)

Gets the filtered content of the analyzed log

Results are available only when the status of the analysis job for this log is &#x60;READY&#x60;. To check the job status, use the [GET analysis job status](https://dt-url.net/usg3rbv) request.   Long results split into several pages. By default, a page contains 100 results. You can change this value with the **pageSize** query parameter, up to 10,000.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        String scrollToken = "scrollToken_example"; // String | The **scrollToken** value from the previous response.    You can use it to get the next page of results. Without it, the first page is always returned.
        Integer pageSize = 56; // Integer | The number of records per result page.    If not set, each page contains 100 results.    Maximum allowed value is `10000`.
        FilterLogContent filterLogContent = new FilterLogContent(); // FilterLogContent | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsResult> response = apiInstance.customDeviceLogJobRecordsFilteredWithHttpInfo(customDeviceId, jobId, scrollToken, pageSize, filterLogContent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecordsFiltered");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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


## customDeviceLogJobRecordsTop

> LogJobRecordsTopValuesRestResult customDeviceLogJobRecordsTop(customDeviceId, jobId, filterTopLogRecords)

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
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            LogJobRecordsTopValuesRestResult result = apiInstance.customDeviceLogJobRecordsTop(customDeviceId, jobId, filterTopLogRecords);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecordsTop");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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

## customDeviceLogJobRecordsTopWithHttpInfo

> ApiResponse<LogJobRecordsTopValuesRestResult> customDeviceLogJobRecordsTop customDeviceLogJobRecordsTopWithHttpInfo(customDeviceId, jobId, filterTopLogRecords)

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
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        FilterTopLogRecords filterTopLogRecords = new FilterTopLogRecords(); // FilterTopLogRecords | Filter the log content by the specified criteria.   See [Search patterns in log data and parse results](https://dt-url.net/57a3rgv) in Dynatrace Documentation for the syntax definition and examples.
        try {
            ApiResponse<LogJobRecordsTopValuesRestResult> response = apiInstance.customDeviceLogJobRecordsTopWithHttpInfo(customDeviceId, jobId, filterTopLogRecords);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobRecordsTop");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |
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


## customDeviceLogJobStart

> String customDeviceLogJobStart(customDeviceId, logPath, query, startTimestamp, endTimestamp, extractFields)

Starts the analysis job for the specified custom device log

The response returns the ID of the job.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            String result = apiInstance.customDeviceLogJobStart(customDeviceId, logPath, query, startTimestamp, endTimestamp, extractFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobStart");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
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

## customDeviceLogJobStartWithHttpInfo

> ApiResponse<String> customDeviceLogJobStart customDeviceLogJobStartWithHttpInfo(customDeviceId, logPath, query, startTimestamp, endTimestamp, extractFields)

Starts the analysis job for the specified custom device log

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
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String logPath = "logPath_example"; // String | The full pathname of the log.
        String query = "query_example"; // String | Narrows down the scope of the analysis to the entries, matching the specified criteria.   The criteria must use the [text pattern query syntax](https://dt-url.net/vv83rhp).
        Long startTimestamp = 56L; // Long | The start timestamp of the analysis range, in UTC milliseconds.    If not set, then 2 hours behind from current timestamp is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the analysis range, in UTC milliseconds.    If not set, then the current timestamp is used.
        ExtractFields extractFields = new ExtractFields(); // ExtractFields | Extract fields from the log content to form custom columns.    See [Search patterns in log data and parse results](https://dt-url.net/vv83rhp) in Dynatrace Documentation for the syntax definition and examples.   The special characters must be escaped.
        try {
            ApiResponse<String> response = apiInstance.customDeviceLogJobStartWithHttpInfo(customDeviceId, logPath, query, startTimestamp, endTimestamp, extractFields);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobStart");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
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


## customDeviceLogJobStatus

> LogJobStatusResult customDeviceLogJobStatus(customDeviceId, jobId)

Gets status of the specified log analysis job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        try {
            LogJobStatusResult result = apiInstance.customDeviceLogJobStatus(customDeviceId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobStatus");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |

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

## customDeviceLogJobStatusWithHttpInfo

> ApiResponse<LogJobStatusResult> customDeviceLogJobStatus customDeviceLogJobStatusWithHttpInfo(customDeviceId, jobId)

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
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        String jobId = "jobId_example"; // String | The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request.
        try {
            ApiResponse<LogJobStatusResult> response = apiInstance.customDeviceLogJobStatusWithHttpInfo(customDeviceId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogJobStatus");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |
| **jobId** | **String**| The ID of the required log analysis job.    You can retrieve it from the response of the [POST analysis job](https://dt-url.net/kzi3rb8) request. | |

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


## customDeviceLogList

> LogListForCustomDeviceResult customDeviceLogList(customDeviceId)

Lists all the available logs on the specified custom device

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        try {
            LogListForCustomDeviceResult result = apiInstance.customDeviceLogList(customDeviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogList");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |

### Return type

[**LogListForCustomDeviceResult**](LogListForCustomDeviceResult.md)


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

## customDeviceLogListWithHttpInfo

> ApiResponse<LogListForCustomDeviceResult> customDeviceLogList customDeviceLogListWithHttpInfo(customDeviceId)

Lists all the available logs on the specified custom device

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.LogMonitoringCustomDevicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogMonitoringCustomDevicesApi apiInstance = new LogMonitoringCustomDevicesApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The Dynatrace entity ID of the required custom device.
        try {
            ApiResponse<LogListForCustomDeviceResult> response = apiInstance.customDeviceLogListWithHttpInfo(customDeviceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogMonitoringCustomDevicesApi#customDeviceLogList");
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
| **customDeviceId** | **String**| The Dynatrace entity ID of the required custom device. | |

### Return type

ApiResponse<[**LogListForCustomDeviceResult**](LogListForCustomDeviceResult.md)>


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

