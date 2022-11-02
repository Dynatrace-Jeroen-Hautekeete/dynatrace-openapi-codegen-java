# AnomalyDetectionServicesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getServiceAnomalyDetectionConfig**](AnomalyDetectionServicesApi.md#getServiceAnomalyDetectionConfig) | **GET** /anomalyDetection/services | Gets the service anomaly detection configuration |
| [**getServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionServicesApi.md#getServiceAnomalyDetectionConfigWithHttpInfo) | **GET** /anomalyDetection/services | Gets the service anomaly detection configuration |
| [**updateServiceAnomalyDetectionConfig**](AnomalyDetectionServicesApi.md#updateServiceAnomalyDetectionConfig) | **PUT** /anomalyDetection/services | Updates the service anomaly detection configuration |
| [**updateServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionServicesApi.md#updateServiceAnomalyDetectionConfigWithHttpInfo) | **PUT** /anomalyDetection/services | Updates the service anomaly detection configuration |
| [**validateServiceAnomalyDetectionConfig**](AnomalyDetectionServicesApi.md#validateServiceAnomalyDetectionConfig) | **POST** /anomalyDetection/services/validator | Validates the payload for the &#x60;PUT /anomalyDetection/services&#x60; request |
| [**validateServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionServicesApi.md#validateServiceAnomalyDetectionConfigWithHttpInfo) | **POST** /anomalyDetection/services/validator | Validates the payload for the &#x60;PUT /anomalyDetection/services&#x60; request |



## getServiceAnomalyDetectionConfig

> ServiceAnomalyDetectionConfig getServiceAnomalyDetectionConfig()

Gets the service anomaly detection configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        try {
            ServiceAnomalyDetectionConfig result = apiInstance.getServiceAnomalyDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#getServiceAnomalyDetectionConfig");
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

[**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<ServiceAnomalyDetectionConfig> getServiceAnomalyDetectionConfig getServiceAnomalyDetectionConfigWithHttpInfo()

Gets the service anomaly detection configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        try {
            ApiResponse<ServiceAnomalyDetectionConfig> response = apiInstance.getServiceAnomalyDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#getServiceAnomalyDetectionConfig");
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

ApiResponse<[**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateServiceAnomalyDetectionConfig

> void updateServiceAnomalyDetectionConfig(serviceAnomalyDetectionConfig)

Updates the service anomaly detection configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        ServiceAnomalyDetectionConfig serviceAnomalyDetectionConfig = new ServiceAnomalyDetectionConfig(); // ServiceAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the service anomaly detection configuration.
        try {
            apiInstance.updateServiceAnomalyDetectionConfig(serviceAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#updateServiceAnomalyDetectionConfig");
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
| **serviceAnomalyDetectionConfig** | [**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the service anomaly detection configuration. | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> updateServiceAnomalyDetectionConfig updateServiceAnomalyDetectionConfigWithHttpInfo(serviceAnomalyDetectionConfig)

Updates the service anomaly detection configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        ServiceAnomalyDetectionConfig serviceAnomalyDetectionConfig = new ServiceAnomalyDetectionConfig(); // ServiceAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the service anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateServiceAnomalyDetectionConfigWithHttpInfo(serviceAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#updateServiceAnomalyDetectionConfig");
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
| **serviceAnomalyDetectionConfig** | [**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the service anomaly detection configuration. | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateServiceAnomalyDetectionConfig

> void validateServiceAnomalyDetectionConfig(serviceAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        ServiceAnomalyDetectionConfig serviceAnomalyDetectionConfig = new ServiceAnomalyDetectionConfig(); // ServiceAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the service anomaly detection configuration.
        try {
            apiInstance.validateServiceAnomalyDetectionConfig(serviceAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#validateServiceAnomalyDetectionConfig");
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
| **serviceAnomalyDetectionConfig** | [**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the service anomaly detection configuration. | [optional] |

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

## validateServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> validateServiceAnomalyDetectionConfig validateServiceAnomalyDetectionConfigWithHttpInfo(serviceAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionServicesApi apiInstance = new AnomalyDetectionServicesApi(defaultClient);
        ServiceAnomalyDetectionConfig serviceAnomalyDetectionConfig = new ServiceAnomalyDetectionConfig(); // ServiceAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the service anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateServiceAnomalyDetectionConfigWithHttpInfo(serviceAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionServicesApi#validateServiceAnomalyDetectionConfig");
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
| **serviceAnomalyDetectionConfig** | [**ServiceAnomalyDetectionConfig**](ServiceAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the service anomaly detection configuration. | [optional] |

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

