# CalculatedMetricsLogMonitoringApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLogMetricConfig**](CalculatedMetricsLogMonitoringApi.md#deleteLogMetricConfig) | **DELETE** /calculatedMetrics/log/{metricKey} | Deletes the specified custom log metric definition | maturity&#x3D;EARLY_ADOPTER |
| [**deleteLogMetricConfigWithHttpInfo**](CalculatedMetricsLogMonitoringApi.md#deleteLogMetricConfigWithHttpInfo) | **DELETE** /calculatedMetrics/log/{metricKey} | Deletes the specified custom log metric definition | maturity&#x3D;EARLY_ADOPTER |
| [**getLogMetricConfig**](CalculatedMetricsLogMonitoringApi.md#getLogMetricConfig) | **GET** /calculatedMetrics/log/{metricKey} | Gets the definition of the specified custom log metric | maturity&#x3D;EARLY_ADOPTER |
| [**getLogMetricConfigWithHttpInfo**](CalculatedMetricsLogMonitoringApi.md#getLogMetricConfigWithHttpInfo) | **GET** /calculatedMetrics/log/{metricKey} | Gets the definition of the specified custom log metric | maturity&#x3D;EARLY_ADOPTER |
| [**listLogMetricConfigs**](CalculatedMetricsLogMonitoringApi.md#listLogMetricConfigs) | **GET** /calculatedMetrics/log | Lists all custom log metrics configured in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**listLogMetricConfigsWithHttpInfo**](CalculatedMetricsLogMonitoringApi.md#listLogMetricConfigsWithHttpInfo) | **GET** /calculatedMetrics/log | Lists all custom log metrics configured in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**updateOrCreateLogMetricConfig**](CalculatedMetricsLogMonitoringApi.md#updateOrCreateLogMetricConfig) | **PUT** /calculatedMetrics/log/{metricKey} | Creates a new custom log metric | maturity&#x3D;EARLY_ADOPTER |
| [**updateOrCreateLogMetricConfigWithHttpInfo**](CalculatedMetricsLogMonitoringApi.md#updateOrCreateLogMetricConfigWithHttpInfo) | **PUT** /calculatedMetrics/log/{metricKey} | Creates a new custom log metric | maturity&#x3D;EARLY_ADOPTER |
| [**validateMetric**](CalculatedMetricsLogMonitoringApi.md#validateMetric) | **POST** /calculatedMetrics/log/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/log/{metricKey}&#x60; request. | maturity&#x3D;EARLY_ADOPTER |
| [**validateMetricWithHttpInfo**](CalculatedMetricsLogMonitoringApi.md#validateMetricWithHttpInfo) | **POST** /calculatedMetrics/log/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/log/{metricKey}&#x60; request. | maturity&#x3D;EARLY_ADOPTER |



## deleteLogMetricConfig

> void deleteLogMetricConfig(metricKey)

Deletes the specified custom log metric definition | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the custom log metric to be deleted.
        try {
            apiInstance.deleteLogMetricConfig(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#deleteLogMetricConfig");
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
| **metricKey** | **String**| The key of the custom log metric to be deleted. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See the response body for details |  -  |

## deleteLogMetricConfigWithHttpInfo

> ApiResponse<Void> deleteLogMetricConfig deleteLogMetricConfigWithHttpInfo(metricKey)

Deletes the specified custom log metric definition | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the custom log metric to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteLogMetricConfigWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#deleteLogMetricConfig");
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
| **metricKey** | **String**| The key of the custom log metric to be deleted. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See the response body for details |  -  |


## getLogMetricConfig

> LogMetricConfig getLogMetricConfig(metricKey)

Gets the definition of the specified custom log metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required custom log metric.
        try {
            LogMetricConfig result = apiInstance.getLogMetricConfig(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#getLogMetricConfig");
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
| **metricKey** | **String**| The key of the required custom log metric. | |

### Return type

[**LogMetricConfig**](LogMetricConfig.md)


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

## getLogMetricConfigWithHttpInfo

> ApiResponse<LogMetricConfig> getLogMetricConfig getLogMetricConfigWithHttpInfo(metricKey)

Gets the definition of the specified custom log metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required custom log metric.
        try {
            ApiResponse<LogMetricConfig> response = apiInstance.getLogMetricConfigWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#getLogMetricConfig");
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
| **metricKey** | **String**| The key of the required custom log metric. | |

### Return type

ApiResponse<[**LogMetricConfig**](LogMetricConfig.md)>


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


## listLogMetricConfigs

> StubList listLogMetricConfigs()

Lists all custom log metrics configured in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        try {
            StubList result = apiInstance.listLogMetricConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#listLogMetricConfigs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**StubList**](StubList.md)


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

## listLogMetricConfigsWithHttpInfo

> ApiResponse<StubList> listLogMetricConfigs listLogMetricConfigsWithHttpInfo()

Lists all custom log metrics configured in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listLogMetricConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#listLogMetricConfigs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**StubList**](StubList.md)>


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


## updateOrCreateLogMetricConfig

> EntityShortRepresentation updateOrCreateLogMetricConfig(metricKey, logMetricConfig)

Creates a new custom log metric | maturity&#x3D;EARLY_ADOPTER

If the metric definition with the specified key already exists, it is updated.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The required key of the custom log metric. The key must have the `calc:log.` prefix.    The key in the body of the request must match this key.
        LogMetricConfig logMetricConfig = new LogMetricConfig(); // LogMetricConfig | The JSON body of the request. Contains the definition of the custom log metric.
        try {
            EntityShortRepresentation result = apiInstance.updateOrCreateLogMetricConfig(metricKey, logMetricConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#updateOrCreateLogMetricConfig");
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
| **metricKey** | **String**| The required key of the custom log metric. The key must have the &#x60;calc:log.&#x60; prefix.    The key in the body of the request must match this key. | |
| **logMetricConfig** | [**LogMetricConfig**](LogMetricConfig.md)| The JSON body of the request. Contains the definition of the custom log metric. | [optional] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new metric definition has been created. The response body contains the key and the name of the new metric. |  -  |
| **204** | Success. The metric definition has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateOrCreateLogMetricConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateOrCreateLogMetricConfig updateOrCreateLogMetricConfigWithHttpInfo(metricKey, logMetricConfig)

Creates a new custom log metric | maturity&#x3D;EARLY_ADOPTER

If the metric definition with the specified key already exists, it is updated.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The required key of the custom log metric. The key must have the `calc:log.` prefix.    The key in the body of the request must match this key.
        LogMetricConfig logMetricConfig = new LogMetricConfig(); // LogMetricConfig | The JSON body of the request. Contains the definition of the custom log metric.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateOrCreateLogMetricConfigWithHttpInfo(metricKey, logMetricConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#updateOrCreateLogMetricConfig");
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
| **metricKey** | **String**| The required key of the custom log metric. The key must have the &#x60;calc:log.&#x60; prefix.    The key in the body of the request must match this key. | |
| **logMetricConfig** | [**LogMetricConfig**](LogMetricConfig.md)| The JSON body of the request. Contains the definition of the custom log metric. | [optional] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new metric definition has been created. The response body contains the key and the name of the new metric. |  -  |
| **204** | Success. The metric definition has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateMetric

> void validateMetric(metricKey, logMetricConfig)

Validates the payload for the &#x60;PUT /calculatedMetrics/log/{metricKey}&#x60; request. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the custom log metric to be validated.
        LogMetricConfig logMetricConfig = new LogMetricConfig(); // LogMetricConfig | The JSON body of the request. Contains definition of the custom log metric to be validated.
        try {
            apiInstance.validateMetric(metricKey, logMetricConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#validateMetric");
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
| **metricKey** | **String**| The key of the custom log metric to be validated. | |
| **logMetricConfig** | [**LogMetricConfig**](LogMetricConfig.md)| The JSON body of the request. Contains definition of the custom log metric to be validated. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See the response body for details |  -  |

## validateMetricWithHttpInfo

> ApiResponse<Void> validateMetric validateMetricWithHttpInfo(metricKey, logMetricConfig)

Validates the payload for the &#x60;PUT /calculatedMetrics/log/{metricKey}&#x60; request. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsLogMonitoringApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsLogMonitoringApi apiInstance = new CalculatedMetricsLogMonitoringApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the custom log metric to be validated.
        LogMetricConfig logMetricConfig = new LogMetricConfig(); // LogMetricConfig | The JSON body of the request. Contains definition of the custom log metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateMetricWithHttpInfo(metricKey, logMetricConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsLogMonitoringApi#validateMetric");
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
| **metricKey** | **String**| The key of the custom log metric to be validated. | |
| **logMetricConfig** | [**LogMetricConfig**](LogMetricConfig.md)| The JSON body of the request. Contains definition of the custom log metric to be validated. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See the response body for details |  -  |

