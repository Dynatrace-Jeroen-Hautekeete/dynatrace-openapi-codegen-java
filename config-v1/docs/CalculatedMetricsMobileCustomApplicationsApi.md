# CalculatedMetricsMobileCustomApplicationsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#createMobileMetric) | **POST** /calculatedMetrics/mobile | Creates a new calculated metric for a mobile or custom app |
| [**createMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#createMobileMetricWithHttpInfo) | **POST** /calculatedMetrics/mobile | Creates a new calculated metric for a mobile or custom app |
| [**deleteMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#deleteMobileMetric) | **DELETE** /calculatedMetrics/mobile/{metricKey} | Deletes the specified calculated metric for mobile or custom app |
| [**deleteMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#deleteMobileMetricWithHttpInfo) | **DELETE** /calculatedMetrics/mobile/{metricKey} | Deletes the specified calculated metric for mobile or custom app |
| [**getMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#getMobileMetric) | **GET** /calculatedMetrics/mobile/{metricKey} | Gets the descriptor of the specified calculated metric for mobile or custom app |
| [**getMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#getMobileMetricWithHttpInfo) | **GET** /calculatedMetrics/mobile/{metricKey} | Gets the descriptor of the specified calculated metric for mobile or custom app |
| [**listMobileMetrics**](CalculatedMetricsMobileCustomApplicationsApi.md#listMobileMetrics) | **GET** /calculatedMetrics/mobile | Lists all calculated metrics for mobile and custom apps configured in your environment |
| [**listMobileMetricsWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#listMobileMetricsWithHttpInfo) | **GET** /calculatedMetrics/mobile | Lists all calculated metrics for mobile and custom apps configured in your environment |
| [**updateMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#updateMobileMetric) | **PUT** /calculatedMetrics/mobile/{metricKey} | Updates the specified calculated metric for a mobile or custom app |
| [**updateMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#updateMobileMetricWithHttpInfo) | **PUT** /calculatedMetrics/mobile/{metricKey} | Updates the specified calculated metric for a mobile or custom app |
| [**validateCreateMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#validateCreateMobileMetric) | **POST** /calculatedMetrics/mobile/validator | Validates the payload for the &#x60;POST /calculatedMetrics/mobile&#x60; request |
| [**validateCreateMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#validateCreateMobileMetricWithHttpInfo) | **POST** /calculatedMetrics/mobile/validator | Validates the payload for the &#x60;POST /calculatedMetrics/mobile&#x60; request |
| [**validateUpdateMobileMetric**](CalculatedMetricsMobileCustomApplicationsApi.md#validateUpdateMobileMetric) | **POST** /calculatedMetrics/mobile/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/mobile/{metricKey}&#x60; request |
| [**validateUpdateMobileMetricWithHttpInfo**](CalculatedMetricsMobileCustomApplicationsApi.md#validateUpdateMobileMetricWithHttpInfo) | **POST** /calculatedMetrics/mobile/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/mobile/{metricKey}&#x60; request |



## createMobileMetric

> EntityShortRepresentation createMobileMetric(calculatedMobileMetric)

Creates a new calculated metric for a mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        CalculatedMobileMetric calculatedMobileMetric = new CalculatedMobileMetric(); // CalculatedMobileMetric | The JSON body of the request. Contains the definition of the new calculated metric for mobile or custom app.
        try {
            EntityShortRepresentation result = apiInstance.createMobileMetric(calculatedMobileMetric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#createMobileMetric");
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
| **calculatedMobileMetric** | [**CalculatedMobileMetric**](CalculatedMobileMetric.md)| The JSON body of the request. Contains the definition of the new calculated metric for mobile or custom app. | [optional] |

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
| **201** | Success. The calculated mobile metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createMobileMetricWithHttpInfo

> ApiResponse<EntityShortRepresentation> createMobileMetric createMobileMetricWithHttpInfo(calculatedMobileMetric)

Creates a new calculated metric for a mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        CalculatedMobileMetric calculatedMobileMetric = new CalculatedMobileMetric(); // CalculatedMobileMetric | The JSON body of the request. Contains the definition of the new calculated metric for mobile or custom app.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createMobileMetricWithHttpInfo(calculatedMobileMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#createMobileMetric");
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
| **calculatedMobileMetric** | [**CalculatedMobileMetric**](CalculatedMobileMetric.md)| The JSON body of the request. Contains the definition of the new calculated metric for mobile or custom app. | [optional] |

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
| **201** | Success. The calculated mobile metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteMobileMetric

> void deleteMobileMetric(metricKey)

Deletes the specified calculated metric for mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be deleted.
        try {
            apiInstance.deleteMobileMetric(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#deleteMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be deleted. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |

## deleteMobileMetricWithHttpInfo

> ApiResponse<Void> deleteMobileMetric deleteMobileMetricWithHttpInfo(metricKey)

Deletes the specified calculated metric for mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteMobileMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#deleteMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be deleted. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |


## getMobileMetric

> CalculatedMobileMetric getMobileMetric(metricKey)

Gets the descriptor of the specified calculated metric for mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.
        try {
            CalculatedMobileMetric result = apiInstance.getMobileMetric(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#getMobileMetric");
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
| **metricKey** | **String**| The key of the required metric. | |

### Return type

[**CalculatedMobileMetric**](CalculatedMobileMetric.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMobileMetricWithHttpInfo

> ApiResponse<CalculatedMobileMetric> getMobileMetric getMobileMetricWithHttpInfo(metricKey)

Gets the descriptor of the specified calculated metric for mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.
        try {
            ApiResponse<CalculatedMobileMetric> response = apiInstance.getMobileMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#getMobileMetric");
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
| **metricKey** | **String**| The key of the required metric. | |

### Return type

ApiResponse<[**CalculatedMobileMetric**](CalculatedMobileMetric.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listMobileMetrics

> StubList listMobileMetrics()

Lists all calculated metrics for mobile and custom apps configured in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        try {
            StubList result = apiInstance.listMobileMetrics();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#listMobileMetrics");
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

## listMobileMetricsWithHttpInfo

> ApiResponse<StubList> listMobileMetrics listMobileMetricsWithHttpInfo()

Lists all calculated metrics for mobile and custom apps configured in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listMobileMetricsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#listMobileMetrics");
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


## updateMobileMetric

> void updateMobileMetric(metricKey, calculatedMobileMetricUpdate)

Updates the specified calculated metric for a mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be updated.
        CalculatedMobileMetricUpdate calculatedMobileMetricUpdate = new CalculatedMobileMetricUpdate(); // CalculatedMobileMetricUpdate | The JSON body of the request. Contains the updated definition of the calculated mobile metric.
        try {
            apiInstance.updateMobileMetric(metricKey, calculatedMobileMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#updateMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be updated. | |
| **calculatedMobileMetricUpdate** | [**CalculatedMobileMetricUpdate**](CalculatedMobileMetricUpdate.md)| The JSON body of the request. Contains the updated definition of the calculated mobile metric. | [optional] |

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
| **204** | Success. The metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateMobileMetricWithHttpInfo

> ApiResponse<Void> updateMobileMetric updateMobileMetricWithHttpInfo(metricKey, calculatedMobileMetricUpdate)

Updates the specified calculated metric for a mobile or custom app

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be updated.
        CalculatedMobileMetricUpdate calculatedMobileMetricUpdate = new CalculatedMobileMetricUpdate(); // CalculatedMobileMetricUpdate | The JSON body of the request. Contains the updated definition of the calculated mobile metric.
        try {
            ApiResponse<Void> response = apiInstance.updateMobileMetricWithHttpInfo(metricKey, calculatedMobileMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#updateMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be updated. | |
| **calculatedMobileMetricUpdate** | [**CalculatedMobileMetricUpdate**](CalculatedMobileMetricUpdate.md)| The JSON body of the request. Contains the updated definition of the calculated mobile metric. | [optional] |

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
| **204** | Success. The metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateMobileMetric

> void validateCreateMobileMetric(calculatedMobileMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/mobile&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        CalculatedMobileMetric calculatedMobileMetric = new CalculatedMobileMetric(); // CalculatedMobileMetric | The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted.
        try {
            apiInstance.validateCreateMobileMetric(calculatedMobileMetric);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#validateCreateMobileMetric");
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
| **calculatedMobileMetric** | [**CalculatedMobileMetric**](CalculatedMobileMetric.md)| The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted. | [optional] |

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
| **204** | Validated. The submitted metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateMobileMetricWithHttpInfo

> ApiResponse<Void> validateCreateMobileMetric validateCreateMobileMetricWithHttpInfo(calculatedMobileMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/mobile&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        CalculatedMobileMetric calculatedMobileMetric = new CalculatedMobileMetric(); // CalculatedMobileMetric | The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateMobileMetricWithHttpInfo(calculatedMobileMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#validateCreateMobileMetric");
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
| **calculatedMobileMetric** | [**CalculatedMobileMetric**](CalculatedMobileMetric.md)| The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted. | [optional] |

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
| **204** | Validated. The submitted metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateMobileMetric

> void validateUpdateMobileMetric(metricKey, calculatedMobileMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/mobile/{metricKey}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be validated.
        CalculatedMobileMetricUpdate calculatedMobileMetricUpdate = new CalculatedMobileMetricUpdate(); // CalculatedMobileMetricUpdate | The JSON body of the request. Contains the definition of the metric to be validated.
        try {
            apiInstance.validateUpdateMobileMetric(metricKey, calculatedMobileMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#validateUpdateMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be validated. | |
| **calculatedMobileMetricUpdate** | [**CalculatedMobileMetricUpdate**](CalculatedMobileMetricUpdate.md)| The JSON body of the request. Contains the definition of the metric to be validated. | [optional] |

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
| **204** | Validated. The submitted metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateMobileMetricWithHttpInfo

> ApiResponse<Void> validateUpdateMobileMetric validateUpdateMobileMetricWithHttpInfo(metricKey, calculatedMobileMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/mobile/{metricKey}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsMobileCustomApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsMobileCustomApplicationsApi apiInstance = new CalculatedMetricsMobileCustomApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be validated.
        CalculatedMobileMetricUpdate calculatedMobileMetricUpdate = new CalculatedMobileMetricUpdate(); // CalculatedMobileMetricUpdate | The JSON body of the request. Contains the definition of the metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateMobileMetricWithHttpInfo(metricKey, calculatedMobileMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsMobileCustomApplicationsApi#validateUpdateMobileMetric");
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
| **metricKey** | **String**| The key of the metric to be validated. | |
| **calculatedMobileMetricUpdate** | [**CalculatedMobileMetricUpdate**](CalculatedMobileMetricUpdate.md)| The JSON body of the request. Contains the definition of the metric to be validated. | [optional] |

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
| **204** | Validated. The submitted metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

