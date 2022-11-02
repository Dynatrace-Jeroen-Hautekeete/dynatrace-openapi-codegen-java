# CalculatedMetricsWebApplicationsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRumMetric**](CalculatedMetricsWebApplicationsApi.md#createRumMetric) | **POST** /calculatedMetrics/rum | Creates a new calculated web application metric |
| [**createRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#createRumMetricWithHttpInfo) | **POST** /calculatedMetrics/rum | Creates a new calculated web application metric |
| [**deleteRumMetric**](CalculatedMetricsWebApplicationsApi.md#deleteRumMetric) | **DELETE** /calculatedMetrics/rum/{metricKey} | Deletes the specified calculated web application metric |
| [**deleteRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#deleteRumMetricWithHttpInfo) | **DELETE** /calculatedMetrics/rum/{metricKey} | Deletes the specified calculated web application metric |
| [**getRumMetric**](CalculatedMetricsWebApplicationsApi.md#getRumMetric) | **GET** /calculatedMetrics/rum/{metricKey} | Gets the descriptor of the specified calculated web application metric |
| [**getRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#getRumMetricWithHttpInfo) | **GET** /calculatedMetrics/rum/{metricKey} | Gets the descriptor of the specified calculated web application metric |
| [**listRumMetrics**](CalculatedMetricsWebApplicationsApi.md#listRumMetrics) | **GET** /calculatedMetrics/rum | Lists all calculated web application metrics |
| [**listRumMetricsWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#listRumMetricsWithHttpInfo) | **GET** /calculatedMetrics/rum | Lists all calculated web application metrics |
| [**updateRumMetric**](CalculatedMetricsWebApplicationsApi.md#updateRumMetric) | **PUT** /calculatedMetrics/rum/{metricKey} | Updates the specified calculated web application metric |
| [**updateRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#updateRumMetricWithHttpInfo) | **PUT** /calculatedMetrics/rum/{metricKey} | Updates the specified calculated web application metric |
| [**validateCreateRumMetric**](CalculatedMetricsWebApplicationsApi.md#validateCreateRumMetric) | **POST** /calculatedMetrics/rum/validator | Validates the payload for the &#x60;POST /calculatedMetrics/rum&#x60; request |
| [**validateCreateRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#validateCreateRumMetricWithHttpInfo) | **POST** /calculatedMetrics/rum/validator | Validates the payload for the &#x60;POST /calculatedMetrics/rum&#x60; request |
| [**validateUpdateRumMetric**](CalculatedMetricsWebApplicationsApi.md#validateUpdateRumMetric) | **POST** /calculatedMetrics/rum/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/rum/{metricKey}&#x60; request |
| [**validateUpdateRumMetricWithHttpInfo**](CalculatedMetricsWebApplicationsApi.md#validateUpdateRumMetricWithHttpInfo) | **POST** /calculatedMetrics/rum/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/rum/{metricKey}&#x60; request |



## createRumMetric

> EntityShortRepresentation createRumMetric(webApplicationMetric)

Creates a new calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        WebApplicationMetric webApplicationMetric = new WebApplicationMetric(); // WebApplicationMetric | The JSON body of the request. Contains the descriptor of the new calculated web application metric.
        try {
            EntityShortRepresentation result = apiInstance.createRumMetric(webApplicationMetric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#createRumMetric");
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
| **webApplicationMetric** | [**WebApplicationMetric**](WebApplicationMetric.md)| The JSON body of the request. Contains the descriptor of the new calculated web application metric. | |

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
| **201** | Success. The metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRumMetricWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRumMetric createRumMetricWithHttpInfo(webApplicationMetric)

Creates a new calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        WebApplicationMetric webApplicationMetric = new WebApplicationMetric(); // WebApplicationMetric | The JSON body of the request. Contains the descriptor of the new calculated web application metric.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRumMetricWithHttpInfo(webApplicationMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#createRumMetric");
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
| **webApplicationMetric** | [**WebApplicationMetric**](WebApplicationMetric.md)| The JSON body of the request. Contains the descriptor of the new calculated web application metric. | |

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
| **201** | Success. The metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRumMetric

> void deleteRumMetric(metricKey)

Deletes the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be deleted.
        try {
            apiInstance.deleteRumMetric(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#deleteRumMetric");
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

## deleteRumMetricWithHttpInfo

> ApiResponse<Void> deleteRumMetric deleteRumMetricWithHttpInfo(metricKey)

Deletes the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRumMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#deleteRumMetric");
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


## getRumMetric

> WebApplicationMetric getRumMetric(metricKey)

Gets the descriptor of the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.
        try {
            WebApplicationMetric result = apiInstance.getRumMetric(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#getRumMetric");
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

[**WebApplicationMetric**](WebApplicationMetric.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRumMetricWithHttpInfo

> ApiResponse<WebApplicationMetric> getRumMetric getRumMetricWithHttpInfo(metricKey)

Gets the descriptor of the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.
        try {
            ApiResponse<WebApplicationMetric> response = apiInstance.getRumMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#getRumMetric");
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

ApiResponse<[**WebApplicationMetric**](WebApplicationMetric.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listRumMetrics

> StubList listRumMetrics()

Lists all calculated web application metrics

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        try {
            StubList result = apiInstance.listRumMetrics();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#listRumMetrics");
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

## listRumMetricsWithHttpInfo

> ApiResponse<StubList> listRumMetrics listRumMetricsWithHttpInfo()

Lists all calculated web application metrics

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listRumMetricsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#listRumMetrics");
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


## updateRumMetric

> void updateRumMetric(metricKey, webApplicationMetricUpdate)

Updates the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated web application metric to be updated.
        WebApplicationMetricUpdate webApplicationMetricUpdate = new WebApplicationMetricUpdate(); // WebApplicationMetricUpdate | The JSON body of the request. Contains the updated parameters of the calculated web application metric.
        try {
            apiInstance.updateRumMetric(metricKey, webApplicationMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#updateRumMetric");
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
| **metricKey** | **String**| The key of the calculated web application metric to be updated. | |
| **webApplicationMetricUpdate** | [**WebApplicationMetricUpdate**](WebApplicationMetricUpdate.md)| The JSON body of the request. Contains the updated parameters of the calculated web application metric. | |

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
| **400** | Failed. The input is invalid. |  -  |

## updateRumMetricWithHttpInfo

> ApiResponse<Void> updateRumMetric updateRumMetricWithHttpInfo(metricKey, webApplicationMetricUpdate)

Updates the specified calculated web application metric

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated web application metric to be updated.
        WebApplicationMetricUpdate webApplicationMetricUpdate = new WebApplicationMetricUpdate(); // WebApplicationMetricUpdate | The JSON body of the request. Contains the updated parameters of the calculated web application metric.
        try {
            ApiResponse<Void> response = apiInstance.updateRumMetricWithHttpInfo(metricKey, webApplicationMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#updateRumMetric");
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
| **metricKey** | **String**| The key of the calculated web application metric to be updated. | |
| **webApplicationMetricUpdate** | [**WebApplicationMetricUpdate**](WebApplicationMetricUpdate.md)| The JSON body of the request. Contains the updated parameters of the calculated web application metric. | |

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
| **400** | Failed. The input is invalid. |  -  |


## validateCreateRumMetric

> void validateCreateRumMetric(webApplicationMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/rum&#x60; request

The body must not provide an ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        WebApplicationMetric webApplicationMetric = new WebApplicationMetric(); // WebApplicationMetric | The JSON body of the request. Contains the descriptor of the metric to be validated.
        try {
            apiInstance.validateCreateRumMetric(webApplicationMetric);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#validateCreateRumMetric");
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
| **webApplicationMetric** | [**WebApplicationMetric**](WebApplicationMetric.md)| The JSON body of the request. Contains the descriptor of the metric to be validated. | |

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

## validateCreateRumMetricWithHttpInfo

> ApiResponse<Void> validateCreateRumMetric validateCreateRumMetricWithHttpInfo(webApplicationMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/rum&#x60; request

The body must not provide an ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        WebApplicationMetric webApplicationMetric = new WebApplicationMetric(); // WebApplicationMetric | The JSON body of the request. Contains the descriptor of the metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRumMetricWithHttpInfo(webApplicationMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#validateCreateRumMetric");
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
| **webApplicationMetric** | [**WebApplicationMetric**](WebApplicationMetric.md)| The JSON body of the request. Contains the descriptor of the metric to be validated. | |

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


## validateUpdateRumMetric

> void validateUpdateRumMetric(metricKey, webApplicationMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/rum/{metricKey}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated web application metric to be validated.
        WebApplicationMetricUpdate webApplicationMetricUpdate = new WebApplicationMetricUpdate(); // WebApplicationMetricUpdate | The JSON body of the request. Contains the descriptor of the metric to be validated.
        try {
            apiInstance.validateUpdateRumMetric(metricKey, webApplicationMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#validateUpdateRumMetric");
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
| **metricKey** | **String**| The key of the calculated web application metric to be validated. | |
| **webApplicationMetricUpdate** | [**WebApplicationMetricUpdate**](WebApplicationMetricUpdate.md)| The JSON body of the request. Contains the descriptor of the metric to be validated. | |

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

## validateUpdateRumMetricWithHttpInfo

> ApiResponse<Void> validateUpdateRumMetric validateUpdateRumMetricWithHttpInfo(metricKey, webApplicationMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/rum/{metricKey}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsWebApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsWebApplicationsApi apiInstance = new CalculatedMetricsWebApplicationsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated web application metric to be validated.
        WebApplicationMetricUpdate webApplicationMetricUpdate = new WebApplicationMetricUpdate(); // WebApplicationMetricUpdate | The JSON body of the request. Contains the descriptor of the metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRumMetricWithHttpInfo(metricKey, webApplicationMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsWebApplicationsApi#validateUpdateRumMetric");
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
| **metricKey** | **String**| The key of the calculated web application metric to be validated. | |
| **webApplicationMetricUpdate** | [**WebApplicationMetricUpdate**](WebApplicationMetricUpdate.md)| The JSON body of the request. Contains the descriptor of the metric to be validated. | |

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

