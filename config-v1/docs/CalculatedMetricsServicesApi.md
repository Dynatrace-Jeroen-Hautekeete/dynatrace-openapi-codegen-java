# CalculatedMetricsServicesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceMetric**](CalculatedMetricsServicesApi.md#createServiceMetric) | **POST** /calculatedMetrics/service | Creates a new calculated service metric |
| [**createServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#createServiceMetricWithHttpInfo) | **POST** /calculatedMetrics/service | Creates a new calculated service metric |
| [**deleteServiceMetric**](CalculatedMetricsServicesApi.md#deleteServiceMetric) | **DELETE** /calculatedMetrics/service/{metricKey} | Deletes the specified calculated service metric |
| [**deleteServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#deleteServiceMetricWithHttpInfo) | **DELETE** /calculatedMetrics/service/{metricKey} | Deletes the specified calculated service metric |
| [**getServiceMetric**](CalculatedMetricsServicesApi.md#getServiceMetric) | **GET** /calculatedMetrics/service/{metricKey} | Gets the descriptor of the specified calculated service metric |
| [**getServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#getServiceMetricWithHttpInfo) | **GET** /calculatedMetrics/service/{metricKey} | Gets the descriptor of the specified calculated service metric |
| [**listServiceMetrics**](CalculatedMetricsServicesApi.md#listServiceMetrics) | **GET** /calculatedMetrics/service | Lists all calculated service metrics configured in your environment |
| [**listServiceMetricsWithHttpInfo**](CalculatedMetricsServicesApi.md#listServiceMetricsWithHttpInfo) | **GET** /calculatedMetrics/service | Lists all calculated service metrics configured in your environment |
| [**updateServiceMetric**](CalculatedMetricsServicesApi.md#updateServiceMetric) | **PUT** /calculatedMetrics/service/{metricKey} | Updates the specified calculated service metric |
| [**updateServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#updateServiceMetricWithHttpInfo) | **PUT** /calculatedMetrics/service/{metricKey} | Updates the specified calculated service metric |
| [**validateCreateServiceMetric**](CalculatedMetricsServicesApi.md#validateCreateServiceMetric) | **POST** /calculatedMetrics/service/validator | Validates the payload for the &#x60;POST /calculatedMetric/service&#x60; request |
| [**validateCreateServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#validateCreateServiceMetricWithHttpInfo) | **POST** /calculatedMetrics/service/validator | Validates the payload for the &#x60;POST /calculatedMetric/service&#x60; request |
| [**validateUpdateServiceMetric**](CalculatedMetricsServicesApi.md#validateUpdateServiceMetric) | **POST** /calculatedMetrics/service/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetric/service/{id}&#x60; request |
| [**validateUpdateServiceMetricWithHttpInfo**](CalculatedMetricsServicesApi.md#validateUpdateServiceMetricWithHttpInfo) | **POST** /calculatedMetrics/service/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetric/service/{id}&#x60; request |



## createServiceMetric

> EntityShortRepresentation createServiceMetric(calculatedServiceMetric)

Creates a new calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains parameters of the new calculated service metric.
        try {
            EntityShortRepresentation result = apiInstance.createServiceMetric(calculatedServiceMetric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#createServiceMetric");
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
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains parameters of the new calculated service metric. | |

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
| **201** | Success. The calculated service metric has been created. Response contains the key of the new metric. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createServiceMetricWithHttpInfo

> ApiResponse<EntityShortRepresentation> createServiceMetric createServiceMetricWithHttpInfo(calculatedServiceMetric)

Creates a new calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains parameters of the new calculated service metric.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createServiceMetricWithHttpInfo(calculatedServiceMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#createServiceMetric");
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
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains parameters of the new calculated service metric. | |

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
| **201** | Success. The calculated service metric has been created. Response contains the key of the new metric. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteServiceMetric

> void deleteServiceMetric(metricKey)

Deletes the specified calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be deleted.
        try {
            apiInstance.deleteServiceMetric(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#deleteServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be deleted. | |

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
| **204** | Success. The calculated service metric has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteServiceMetricWithHttpInfo

> ApiResponse<Void> deleteServiceMetric deleteServiceMetricWithHttpInfo(metricKey)

Deletes the specified calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteServiceMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#deleteServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be deleted. | |

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
| **204** | Success. The calculated service metric has been deleted. Response doesn&#39;t have a body. |  -  |


## getServiceMetric

> CalculatedServiceMetric getServiceMetric(metricKey)

Gets the descriptor of the specified calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required calculated service metric.
        try {
            CalculatedServiceMetric result = apiInstance.getServiceMetric(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#getServiceMetric");
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
| **metricKey** | **String**| The key of the required calculated service metric. | |

### Return type

[**CalculatedServiceMetric**](CalculatedServiceMetric.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getServiceMetricWithHttpInfo

> ApiResponse<CalculatedServiceMetric> getServiceMetric getServiceMetricWithHttpInfo(metricKey)

Gets the descriptor of the specified calculated service metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required calculated service metric.
        try {
            ApiResponse<CalculatedServiceMetric> response = apiInstance.getServiceMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#getServiceMetric");
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
| **metricKey** | **String**| The key of the required calculated service metric. | |

### Return type

ApiResponse<[**CalculatedServiceMetric**](CalculatedServiceMetric.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listServiceMetrics

> StubList listServiceMetrics()

Lists all calculated service metrics configured in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        try {
            StubList result = apiInstance.listServiceMetrics();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#listServiceMetrics");
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

## listServiceMetricsWithHttpInfo

> ApiResponse<StubList> listServiceMetrics listServiceMetricsWithHttpInfo()

Lists all calculated service metrics configured in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listServiceMetricsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#listServiceMetrics");
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


## updateServiceMetric

> EntityShortRepresentation updateServiceMetric(metricKey, calculatedServiceMetric)

Updates the specified calculated service metric

If the calculated service metric with the specified key doesn&#39;t exist, a new metric is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be updated.    The key of the calculated service metric in the body of the request must match this key.
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains updated parameters of the calculated service metric.
        try {
            EntityShortRepresentation result = apiInstance.updateServiceMetric(metricKey, calculatedServiceMetric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#updateServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be updated.    The key of the calculated service metric in the body of the request must match this key. | |
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains updated parameters of the calculated service metric. | |

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
| **201** | Success. The new calculated service metric has been created. Response contains the key of the new metric. |  -  |
| **204** | Success. The calculated service metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateServiceMetricWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateServiceMetric updateServiceMetricWithHttpInfo(metricKey, calculatedServiceMetric)

Updates the specified calculated service metric

If the calculated service metric with the specified key doesn&#39;t exist, a new metric is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be updated.    The key of the calculated service metric in the body of the request must match this key.
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains updated parameters of the calculated service metric.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateServiceMetricWithHttpInfo(metricKey, calculatedServiceMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#updateServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be updated.    The key of the calculated service metric in the body of the request must match this key. | |
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains updated parameters of the calculated service metric. | |

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
| **201** | Success. The new calculated service metric has been created. Response contains the key of the new metric. |  -  |
| **204** | Success. The calculated service metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateServiceMetric

> void validateCreateServiceMetric(calculatedServiceMetric)

Validates the payload for the &#x60;POST /calculatedMetric/service&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains the calculated service metric to be validated.
        try {
            apiInstance.validateCreateServiceMetric(calculatedServiceMetric);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#validateCreateServiceMetric");
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
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains the calculated service metric to be validated. | |

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
| **400** | Failed. The input is invalid |  -  |

## validateCreateServiceMetricWithHttpInfo

> ApiResponse<Void> validateCreateServiceMetric validateCreateServiceMetricWithHttpInfo(calculatedServiceMetric)

Validates the payload for the &#x60;POST /calculatedMetric/service&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains the calculated service metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateServiceMetricWithHttpInfo(calculatedServiceMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#validateCreateServiceMetric");
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
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains the calculated service metric to be validated. | |

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
| **400** | Failed. The input is invalid |  -  |


## validateUpdateServiceMetric

> void validateUpdateServiceMetric(metricKey, calculatedServiceMetric)

Validates the payload for the &#x60;PUT /calculatedMetric/service/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be validated .   The key of the metric in the body of the request must match this key.
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains the calculated service metric to be validated.
        try {
            apiInstance.validateUpdateServiceMetric(metricKey, calculatedServiceMetric);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#validateUpdateServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be validated .   The key of the metric in the body of the request must match this key. | |
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains the calculated service metric to be validated. | |

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
| **400** | Failed. The input is invalid |  -  |

## validateUpdateServiceMetricWithHttpInfo

> ApiResponse<Void> validateUpdateServiceMetric validateUpdateServiceMetricWithHttpInfo(metricKey, calculatedServiceMetric)

Validates the payload for the &#x60;PUT /calculatedMetric/service/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsServicesApi apiInstance = new CalculatedMetricsServicesApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated service metric to be validated .   The key of the metric in the body of the request must match this key.
        CalculatedServiceMetric calculatedServiceMetric = new CalculatedServiceMetric(); // CalculatedServiceMetric | The JSON body of the request. Contains the calculated service metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateServiceMetricWithHttpInfo(metricKey, calculatedServiceMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsServicesApi#validateUpdateServiceMetric");
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
| **metricKey** | **String**| The key of the calculated service metric to be validated .   The key of the metric in the body of the request must match this key. | |
| **calculatedServiceMetric** | [**CalculatedServiceMetric**](CalculatedServiceMetric.md)| The JSON body of the request. Contains the calculated service metric to be validated. | |

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
| **400** | Failed. The input is invalid |  -  |

