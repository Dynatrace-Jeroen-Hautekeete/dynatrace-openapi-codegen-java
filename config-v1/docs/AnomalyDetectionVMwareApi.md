# AnomalyDetectionVMwareApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVMwareAnomalyDetectionConfig**](AnomalyDetectionVMwareApi.md#getVMwareAnomalyDetectionConfig) | **GET** /anomalyDetection/vmware | Gets the configuration of anomaly detection for VMware |
| [**getVMwareAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionVMwareApi.md#getVMwareAnomalyDetectionConfigWithHttpInfo) | **GET** /anomalyDetection/vmware | Gets the configuration of anomaly detection for VMware |
| [**updateVMwareAnomalyDetectionConfig**](AnomalyDetectionVMwareApi.md#updateVMwareAnomalyDetectionConfig) | **PUT** /anomalyDetection/vmware | Updates the configuration of anomaly detection for VMware |
| [**updateVMwareAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionVMwareApi.md#updateVMwareAnomalyDetectionConfigWithHttpInfo) | **PUT** /anomalyDetection/vmware | Updates the configuration of anomaly detection for VMware |
| [**validateVMwareAnomalyDetectionConfig**](AnomalyDetectionVMwareApi.md#validateVMwareAnomalyDetectionConfig) | **POST** /anomalyDetection/vmware/validator | Validates the configuration of anomaly detection for VMware for the &#x60;PUT /anomalyDetection/vmware&#x60; request |
| [**validateVMwareAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionVMwareApi.md#validateVMwareAnomalyDetectionConfigWithHttpInfo) | **POST** /anomalyDetection/vmware/validator | Validates the configuration of anomaly detection for VMware for the &#x60;PUT /anomalyDetection/vmware&#x60; request |



## getVMwareAnomalyDetectionConfig

> VMwareAnomalyDetectionConfig getVMwareAnomalyDetectionConfig()

Gets the configuration of anomaly detection for VMware

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        try {
            VMwareAnomalyDetectionConfig result = apiInstance.getVMwareAnomalyDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#getVMwareAnomalyDetectionConfig");
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

[**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getVMwareAnomalyDetectionConfigWithHttpInfo

> ApiResponse<VMwareAnomalyDetectionConfig> getVMwareAnomalyDetectionConfig getVMwareAnomalyDetectionConfigWithHttpInfo()

Gets the configuration of anomaly detection for VMware

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        try {
            ApiResponse<VMwareAnomalyDetectionConfig> response = apiInstance.getVMwareAnomalyDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#getVMwareAnomalyDetectionConfig");
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

ApiResponse<[**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateVMwareAnomalyDetectionConfig

> void updateVMwareAnomalyDetectionConfig(vmwareAnomalyDetectionConfig)

Updates the configuration of anomaly detection for VMware

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        VMwareAnomalyDetectionConfig vmwareAnomalyDetectionConfig = new VMwareAnomalyDetectionConfig(); // VMwareAnomalyDetectionConfig | JSON body of the request, containing parameters of the VMware anomaly detection configuration.
        try {
            apiInstance.updateVMwareAnomalyDetectionConfig(vmwareAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#updateVMwareAnomalyDetectionConfig");
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
| **vmwareAnomalyDetectionConfig** | [**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the VMware anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## updateVMwareAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> updateVMwareAnomalyDetectionConfig updateVMwareAnomalyDetectionConfigWithHttpInfo(vmwareAnomalyDetectionConfig)

Updates the configuration of anomaly detection for VMware

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        VMwareAnomalyDetectionConfig vmwareAnomalyDetectionConfig = new VMwareAnomalyDetectionConfig(); // VMwareAnomalyDetectionConfig | JSON body of the request, containing parameters of the VMware anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateVMwareAnomalyDetectionConfigWithHttpInfo(vmwareAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#updateVMwareAnomalyDetectionConfig");
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
| **vmwareAnomalyDetectionConfig** | [**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the VMware anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateVMwareAnomalyDetectionConfig

> void validateVMwareAnomalyDetectionConfig(vmwareAnomalyDetectionConfig)

Validates the configuration of anomaly detection for VMware for the &#x60;PUT /anomalyDetection/vmware&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        VMwareAnomalyDetectionConfig vmwareAnomalyDetectionConfig = new VMwareAnomalyDetectionConfig(); // VMwareAnomalyDetectionConfig | JSON body of the request, containing parameters of the VMware anomaly detection configuration.
        try {
            apiInstance.validateVMwareAnomalyDetectionConfig(vmwareAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#validateVMwareAnomalyDetectionConfig");
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
| **vmwareAnomalyDetectionConfig** | [**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the VMware anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateVMwareAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> validateVMwareAnomalyDetectionConfig validateVMwareAnomalyDetectionConfigWithHttpInfo(vmwareAnomalyDetectionConfig)

Validates the configuration of anomaly detection for VMware for the &#x60;PUT /anomalyDetection/vmware&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionVMwareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionVMwareApi apiInstance = new AnomalyDetectionVMwareApi(defaultClient);
        VMwareAnomalyDetectionConfig vmwareAnomalyDetectionConfig = new VMwareAnomalyDetectionConfig(); // VMwareAnomalyDetectionConfig | JSON body of the request, containing parameters of the VMware anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateVMwareAnomalyDetectionConfigWithHttpInfo(vmwareAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionVMwareApi#validateVMwareAnomalyDetectionConfig");
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
| **vmwareAnomalyDetectionConfig** | [**VMwareAnomalyDetectionConfig**](VMwareAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the VMware anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

