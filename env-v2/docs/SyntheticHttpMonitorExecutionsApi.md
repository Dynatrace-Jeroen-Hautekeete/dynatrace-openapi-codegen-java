# SyntheticHttpMonitorExecutionsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExecutionResult**](SyntheticHttpMonitorExecutionsApi.md#getExecutionResult) | **GET** /synthetic/execution/{monitorId}/{resultType} | Gets detailed information about the last execution of the specified HTTP monitor | maturity&#x3D;EARLY_ADOPTER |
| [**getExecutionResultWithHttpInfo**](SyntheticHttpMonitorExecutionsApi.md#getExecutionResultWithHttpInfo) | **GET** /synthetic/execution/{monitorId}/{resultType} | Gets detailed information about the last execution of the specified HTTP monitor | maturity&#x3D;EARLY_ADOPTER |



## getExecutionResult

> MonitorExecutionResults getExecutionResult(monitorId, resultType, locationId)

Gets detailed information about the last execution of the specified HTTP monitor | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SyntheticHttpMonitorExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticHttpMonitorExecutionsApi apiInstance = new SyntheticHttpMonitorExecutionsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | Identifier of the HTTP monitor for which last execution result is returned.
        String resultType = "SUCCESS"; // String | Defines the result type of the last HTTP monitor's execution.
        String locationId = "locationId_example"; // String | Filters the results to those executed by specified Synthetic location. Specify the ID of the location.
        try {
            MonitorExecutionResults result = apiInstance.getExecutionResult(monitorId, resultType, locationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticHttpMonitorExecutionsApi#getExecutionResult");
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
| **monitorId** | **String**| Identifier of the HTTP monitor for which last execution result is returned. | |
| **resultType** | **String**| Defines the result type of the last HTTP monitor&#39;s execution. | [enum: SUCCESS, FAILED] |
| **locationId** | **String**| Filters the results to those executed by specified Synthetic location. Specify the ID of the location. | [optional] |

### Return type

[**MonitorExecutionResults**](MonitorExecutionResults.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains detailed data. |  -  |

## getExecutionResultWithHttpInfo

> ApiResponse<MonitorExecutionResults> getExecutionResult getExecutionResultWithHttpInfo(monitorId, resultType, locationId)

Gets detailed information about the last execution of the specified HTTP monitor | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SyntheticHttpMonitorExecutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticHttpMonitorExecutionsApi apiInstance = new SyntheticHttpMonitorExecutionsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | Identifier of the HTTP monitor for which last execution result is returned.
        String resultType = "SUCCESS"; // String | Defines the result type of the last HTTP monitor's execution.
        String locationId = "locationId_example"; // String | Filters the results to those executed by specified Synthetic location. Specify the ID of the location.
        try {
            ApiResponse<MonitorExecutionResults> response = apiInstance.getExecutionResultWithHttpInfo(monitorId, resultType, locationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticHttpMonitorExecutionsApi#getExecutionResult");
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
| **monitorId** | **String**| Identifier of the HTTP monitor for which last execution result is returned. | |
| **resultType** | **String**| Defines the result type of the last HTTP monitor&#39;s execution. | [enum: SUCCESS, FAILED] |
| **locationId** | **String**| Filters the results to those executed by specified Synthetic location. Specify the ID of the location. | [optional] |

### Return type

ApiResponse<[**MonitorExecutionResults**](MonitorExecutionResults.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains detailed data. |  -  |

