# AnomalyDetectionHostsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHostEventsConfig**](AnomalyDetectionHostsApi.md#getHostEventsConfig) | **GET** /anomalyDetection/hosts | Gets the configuration of anomaly detection for hosts |
| [**getHostEventsConfigWithHttpInfo**](AnomalyDetectionHostsApi.md#getHostEventsConfigWithHttpInfo) | **GET** /anomalyDetection/hosts | Gets the configuration of anomaly detection for hosts |
| [**updateHostEventsConfig**](AnomalyDetectionHostsApi.md#updateHostEventsConfig) | **PUT** /anomalyDetection/hosts | Updates the configuration of anomaly detection for hosts |
| [**updateHostEventsConfigWithHttpInfo**](AnomalyDetectionHostsApi.md#updateHostEventsConfigWithHttpInfo) | **PUT** /anomalyDetection/hosts | Updates the configuration of anomaly detection for hosts |
| [**validateHostEventsConfig**](AnomalyDetectionHostsApi.md#validateHostEventsConfig) | **POST** /anomalyDetection/hosts/validator | Validates the configuration of anomaly detection for hosts for the &#x60;PUT /anomalyDetection/hosts&#x60; request |
| [**validateHostEventsConfigWithHttpInfo**](AnomalyDetectionHostsApi.md#validateHostEventsConfigWithHttpInfo) | **POST** /anomalyDetection/hosts/validator | Validates the configuration of anomaly detection for hosts for the &#x60;PUT /anomalyDetection/hosts&#x60; request |



## getHostEventsConfig

> HostsAnomalyDetectionConfig getHostEventsConfig()

Gets the configuration of anomaly detection for hosts

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        try {
            HostsAnomalyDetectionConfig result = apiInstance.getHostEventsConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#getHostEventsConfig");
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

[**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostEventsConfigWithHttpInfo

> ApiResponse<HostsAnomalyDetectionConfig> getHostEventsConfig getHostEventsConfigWithHttpInfo()

Gets the configuration of anomaly detection for hosts

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        try {
            ApiResponse<HostsAnomalyDetectionConfig> response = apiInstance.getHostEventsConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#getHostEventsConfig");
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

ApiResponse<[**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateHostEventsConfig

> void updateHostEventsConfig(hostsAnomalyDetectionConfig)

Updates the configuration of anomaly detection for hosts

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        HostsAnomalyDetectionConfig hostsAnomalyDetectionConfig = new HostsAnomalyDetectionConfig(); // HostsAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the host anomaly detection configuration.
        try {
            apiInstance.updateHostEventsConfig(hostsAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#updateHostEventsConfig");
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
| **hostsAnomalyDetectionConfig** | [**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the host anomaly detection configuration. | [optional] |

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

## updateHostEventsConfigWithHttpInfo

> ApiResponse<Void> updateHostEventsConfig updateHostEventsConfigWithHttpInfo(hostsAnomalyDetectionConfig)

Updates the configuration of anomaly detection for hosts

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        HostsAnomalyDetectionConfig hostsAnomalyDetectionConfig = new HostsAnomalyDetectionConfig(); // HostsAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the host anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateHostEventsConfigWithHttpInfo(hostsAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#updateHostEventsConfig");
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
| **hostsAnomalyDetectionConfig** | [**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the host anomaly detection configuration. | [optional] |

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


## validateHostEventsConfig

> void validateHostEventsConfig(hostsAnomalyDetectionConfig)

Validates the configuration of anomaly detection for hosts for the &#x60;PUT /anomalyDetection/hosts&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        HostsAnomalyDetectionConfig hostsAnomalyDetectionConfig = new HostsAnomalyDetectionConfig(); // HostsAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the host anomaly detection configuration.
        try {
            apiInstance.validateHostEventsConfig(hostsAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#validateHostEventsConfig");
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
| **hostsAnomalyDetectionConfig** | [**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the host anomaly detection configuration. | [optional] |

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

## validateHostEventsConfigWithHttpInfo

> ApiResponse<Void> validateHostEventsConfig validateHostEventsConfigWithHttpInfo(hostsAnomalyDetectionConfig)

Validates the configuration of anomaly detection for hosts for the &#x60;PUT /anomalyDetection/hosts&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionHostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionHostsApi apiInstance = new AnomalyDetectionHostsApi(defaultClient);
        HostsAnomalyDetectionConfig hostsAnomalyDetectionConfig = new HostsAnomalyDetectionConfig(); // HostsAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the host anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateHostEventsConfigWithHttpInfo(hostsAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionHostsApi#validateHostEventsConfig");
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
| **hostsAnomalyDetectionConfig** | [**HostsAnomalyDetectionConfig**](HostsAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the host anomaly detection configuration. | [optional] |

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

