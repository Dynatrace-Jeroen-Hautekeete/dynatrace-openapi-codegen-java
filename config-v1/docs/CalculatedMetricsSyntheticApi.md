# CalculatedMetricsSyntheticApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSyntheticMetric**](CalculatedMetricsSyntheticApi.md#createSyntheticMetric) | **POST** /calculatedMetrics/synthetic | Creates a new calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**createSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#createSyntheticMetricWithHttpInfo) | **POST** /calculatedMetrics/synthetic | Creates a new calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**deleteSyntheticMetric**](CalculatedMetricsSyntheticApi.md#deleteSyntheticMetric) | **DELETE** /calculatedMetrics/synthetic/{metricKey} | Deletes the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**deleteSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#deleteSyntheticMetricWithHttpInfo) | **DELETE** /calculatedMetrics/synthetic/{metricKey} | Deletes the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**getSyntheticMetric**](CalculatedMetricsSyntheticApi.md#getSyntheticMetric) | **GET** /calculatedMetrics/synthetic/{metricKey} | Gets the descriptor of the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**getSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#getSyntheticMetricWithHttpInfo) | **GET** /calculatedMetrics/synthetic/{metricKey} | Gets the descriptor of the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**listSyntheticMetrics**](CalculatedMetricsSyntheticApi.md#listSyntheticMetrics) | **GET** /calculatedMetrics/synthetic | Lists all calculated synthetic metrics available in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**listSyntheticMetricsWithHttpInfo**](CalculatedMetricsSyntheticApi.md#listSyntheticMetricsWithHttpInfo) | **GET** /calculatedMetrics/synthetic | Lists all calculated synthetic metrics available in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**updateSyntheticMetric**](CalculatedMetricsSyntheticApi.md#updateSyntheticMetric) | **PUT** /calculatedMetrics/synthetic/{metricKey} | Updates the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**updateSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#updateSyntheticMetricWithHttpInfo) | **PUT** /calculatedMetrics/synthetic/{metricKey} | Updates the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateSyntheticMetric**](CalculatedMetricsSyntheticApi.md#validateCreateSyntheticMetric) | **POST** /calculatedMetrics/synthetic/validator | Validates the payload for the &#x60;POST /calculatedMetrics/synthetic&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#validateCreateSyntheticMetricWithHttpInfo) | **POST** /calculatedMetrics/synthetic/validator | Validates the payload for the &#x60;POST /calculatedMetrics/synthetic&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateSyntheticMetric**](CalculatedMetricsSyntheticApi.md#validateUpdateSyntheticMetric) | **POST** /calculatedMetrics/synthetic/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/synthetic/{metricKey}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateSyntheticMetricWithHttpInfo**](CalculatedMetricsSyntheticApi.md#validateUpdateSyntheticMetricWithHttpInfo) | **POST** /calculatedMetrics/synthetic/{metricKey}/validator | Validates the payload for the &#x60;PUT /calculatedMetrics/synthetic/{metricKey}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createSyntheticMetric

> EntityShortRepresentation createSyntheticMetric(calculatedSyntheticMetric)

Creates a new calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        CalculatedSyntheticMetric calculatedSyntheticMetric = new CalculatedSyntheticMetric(); // CalculatedSyntheticMetric | The JSON body of the request. Contains definition of the new calculated synthetic metric.
        try {
            EntityShortRepresentation result = apiInstance.createSyntheticMetric(calculatedSyntheticMetric);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#createSyntheticMetric");
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
| **calculatedSyntheticMetric** | [**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)| The JSON body of the request. Contains definition of the new calculated synthetic metric. | [optional] |

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
| **201** | Success. The calculated synthetic metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createSyntheticMetricWithHttpInfo

> ApiResponse<EntityShortRepresentation> createSyntheticMetric createSyntheticMetricWithHttpInfo(calculatedSyntheticMetric)

Creates a new calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        CalculatedSyntheticMetric calculatedSyntheticMetric = new CalculatedSyntheticMetric(); // CalculatedSyntheticMetric | The JSON body of the request. Contains definition of the new calculated synthetic metric.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createSyntheticMetricWithHttpInfo(calculatedSyntheticMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#createSyntheticMetric");
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
| **calculatedSyntheticMetric** | [**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)| The JSON body of the request. Contains definition of the new calculated synthetic metric. | [optional] |

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
| **201** | Success. The calculated synthetic metric has been created. Response contains its key and name. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteSyntheticMetric

> void deleteSyntheticMetric(metricKey)

Deletes the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated synthetic metric to be deleted.
        try {
            apiInstance.deleteSyntheticMetric(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#deleteSyntheticMetric");
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
| **metricKey** | **String**| The key of the calculated synthetic metric to be deleted. | |

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

## deleteSyntheticMetricWithHttpInfo

> ApiResponse<Void> deleteSyntheticMetric deleteSyntheticMetricWithHttpInfo(metricKey)

Deletes the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated synthetic metric to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteSyntheticMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#deleteSyntheticMetric");
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
| **metricKey** | **String**| The key of the calculated synthetic metric to be deleted. | |

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


## getSyntheticMetric

> CalculatedSyntheticMetric getSyntheticMetric(metricKey)

Gets the descriptor of the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required calculated synthetic metric.
        try {
            CalculatedSyntheticMetric result = apiInstance.getSyntheticMetric(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#getSyntheticMetric");
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
| **metricKey** | **String**| The key of the required calculated synthetic metric. | |

### Return type

[**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSyntheticMetricWithHttpInfo

> ApiResponse<CalculatedSyntheticMetric> getSyntheticMetric getSyntheticMetricWithHttpInfo(metricKey)

Gets the descriptor of the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required calculated synthetic metric.
        try {
            ApiResponse<CalculatedSyntheticMetric> response = apiInstance.getSyntheticMetricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#getSyntheticMetric");
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
| **metricKey** | **String**| The key of the required calculated synthetic metric. | |

### Return type

ApiResponse<[**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listSyntheticMetrics

> StubList listSyntheticMetrics()

Lists all calculated synthetic metrics available in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        try {
            StubList result = apiInstance.listSyntheticMetrics();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#listSyntheticMetrics");
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

## listSyntheticMetricsWithHttpInfo

> ApiResponse<StubList> listSyntheticMetrics listSyntheticMetricsWithHttpInfo()

Lists all calculated synthetic metrics available in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listSyntheticMetricsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#listSyntheticMetrics");
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


## updateSyntheticMetric

> void updateSyntheticMetric(metricKey, syntheticMetricUpdate)

Updates the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated synthetic metric to be updated.
        SyntheticMetricUpdate syntheticMetricUpdate = new SyntheticMetricUpdate(); // SyntheticMetricUpdate | The JSON body of the request. Contains the update to the calculated synthetic metric.
        try {
            apiInstance.updateSyntheticMetric(metricKey, syntheticMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#updateSyntheticMetric");
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
| **metricKey** | **String**| The key of the calculated synthetic metric to be updated. | |
| **syntheticMetricUpdate** | [**SyntheticMetricUpdate**](SyntheticMetricUpdate.md)| The JSON body of the request. Contains the update to the calculated synthetic metric. | [optional] |

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
| **204** | Success. The calculated synthetic metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateSyntheticMetricWithHttpInfo

> ApiResponse<Void> updateSyntheticMetric updateSyntheticMetricWithHttpInfo(metricKey, syntheticMetricUpdate)

Updates the specified calculated synthetic metric | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the calculated synthetic metric to be updated.
        SyntheticMetricUpdate syntheticMetricUpdate = new SyntheticMetricUpdate(); // SyntheticMetricUpdate | The JSON body of the request. Contains the update to the calculated synthetic metric.
        try {
            ApiResponse<Void> response = apiInstance.updateSyntheticMetricWithHttpInfo(metricKey, syntheticMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#updateSyntheticMetric");
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
| **metricKey** | **String**| The key of the calculated synthetic metric to be updated. | |
| **syntheticMetricUpdate** | [**SyntheticMetricUpdate**](SyntheticMetricUpdate.md)| The JSON body of the request. Contains the update to the calculated synthetic metric. | [optional] |

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
| **204** | Success. The calculated synthetic metric has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateSyntheticMetric

> void validateCreateSyntheticMetric(calculatedSyntheticMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/synthetic&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        CalculatedSyntheticMetric calculatedSyntheticMetric = new CalculatedSyntheticMetric(); // CalculatedSyntheticMetric | The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted.
        try {
            apiInstance.validateCreateSyntheticMetric(calculatedSyntheticMetric);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#validateCreateSyntheticMetric");
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
| **calculatedSyntheticMetric** | [**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)| The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted. | [optional] |

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
| **204** | Validated. The submitted calculated synthetic metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateSyntheticMetricWithHttpInfo

> ApiResponse<Void> validateCreateSyntheticMetric validateCreateSyntheticMetricWithHttpInfo(calculatedSyntheticMetric)

Validates the payload for the &#x60;POST /calculatedMetrics/synthetic&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        CalculatedSyntheticMetric calculatedSyntheticMetric = new CalculatedSyntheticMetric(); // CalculatedSyntheticMetric | The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateSyntheticMetricWithHttpInfo(calculatedSyntheticMetric);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#validateCreateSyntheticMetric");
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
| **calculatedSyntheticMetric** | [**CalculatedSyntheticMetric**](CalculatedSyntheticMetric.md)| The JSON body of the request. Contains the definition of the metric to be validated.   The key of the metric must be omitted. | [optional] |

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
| **204** | Validated. The submitted calculated synthetic metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateSyntheticMetric

> void validateUpdateSyntheticMetric(metricKey, syntheticMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/synthetic/{metricKey}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be validated.
        SyntheticMetricUpdate syntheticMetricUpdate = new SyntheticMetricUpdate(); // SyntheticMetricUpdate | The JSON body of the request. Contains the update to the metric to be validated.
        try {
            apiInstance.validateUpdateSyntheticMetric(metricKey, syntheticMetricUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#validateUpdateSyntheticMetric");
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
| **syntheticMetricUpdate** | [**SyntheticMetricUpdate**](SyntheticMetricUpdate.md)| The JSON body of the request. Contains the update to the metric to be validated. | [optional] |

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
| **204** | Validated. The submitted calculated synthetic metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateSyntheticMetricWithHttpInfo

> ApiResponse<Void> validateUpdateSyntheticMetric validateUpdateSyntheticMetricWithHttpInfo(metricKey, syntheticMetricUpdate)

Validates the payload for the &#x60;PUT /calculatedMetrics/synthetic/{metricKey}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CalculatedMetricsSyntheticApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CalculatedMetricsSyntheticApi apiInstance = new CalculatedMetricsSyntheticApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the metric to be validated.
        SyntheticMetricUpdate syntheticMetricUpdate = new SyntheticMetricUpdate(); // SyntheticMetricUpdate | The JSON body of the request. Contains the update to the metric to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateSyntheticMetricWithHttpInfo(metricKey, syntheticMetricUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CalculatedMetricsSyntheticApi#validateUpdateSyntheticMetric");
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
| **syntheticMetricUpdate** | [**SyntheticMetricUpdate**](SyntheticMetricUpdate.md)| The JSON body of the request. Contains the update to the metric to be validated. | [optional] |

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
| **204** | Validated. The submitted calculated synthetic metric is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

