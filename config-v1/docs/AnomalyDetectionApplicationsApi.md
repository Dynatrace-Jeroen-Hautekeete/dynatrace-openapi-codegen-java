# AnomalyDetectionApplicationsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplicationAnomalyDetectionConfig**](AnomalyDetectionApplicationsApi.md#getApplicationAnomalyDetectionConfig) | **GET** /anomalyDetection/applications | Gets the configuration of anomaly detection for applications |
| [**getApplicationAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionApplicationsApi.md#getApplicationAnomalyDetectionConfigWithHttpInfo) | **GET** /anomalyDetection/applications | Gets the configuration of anomaly detection for applications |
| [**updateApplicationAnomalyDetectionConfig**](AnomalyDetectionApplicationsApi.md#updateApplicationAnomalyDetectionConfig) | **PUT** /anomalyDetection/applications | Updates the configuration of anomaly detection for applications |
| [**updateApplicationAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionApplicationsApi.md#updateApplicationAnomalyDetectionConfigWithHttpInfo) | **PUT** /anomalyDetection/applications | Updates the configuration of anomaly detection for applications |
| [**validateApplicationAnomalyDetectionConfig**](AnomalyDetectionApplicationsApi.md#validateApplicationAnomalyDetectionConfig) | **POST** /anomalyDetection/applications/validator | Validates the configuration of anomaly detection for applications for the &#x60;PUT /anomalyDetection/applications&#x60; request |
| [**validateApplicationAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionApplicationsApi.md#validateApplicationAnomalyDetectionConfigWithHttpInfo) | **POST** /anomalyDetection/applications/validator | Validates the configuration of anomaly detection for applications for the &#x60;PUT /anomalyDetection/applications&#x60; request |



## getApplicationAnomalyDetectionConfig

> ApplicationAnomalyDetectionConfig getApplicationAnomalyDetectionConfig()

Gets the configuration of anomaly detection for applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        try {
            ApplicationAnomalyDetectionConfig result = apiInstance.getApplicationAnomalyDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#getApplicationAnomalyDetectionConfig");
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

[**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getApplicationAnomalyDetectionConfigWithHttpInfo

> ApiResponse<ApplicationAnomalyDetectionConfig> getApplicationAnomalyDetectionConfig getApplicationAnomalyDetectionConfigWithHttpInfo()

Gets the configuration of anomaly detection for applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        try {
            ApiResponse<ApplicationAnomalyDetectionConfig> response = apiInstance.getApplicationAnomalyDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#getApplicationAnomalyDetectionConfig");
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

ApiResponse<[**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateApplicationAnomalyDetectionConfig

> void updateApplicationAnomalyDetectionConfig(applicationAnomalyDetectionConfig)

Updates the configuration of anomaly detection for applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        ApplicationAnomalyDetectionConfig applicationAnomalyDetectionConfig = new ApplicationAnomalyDetectionConfig(); // ApplicationAnomalyDetectionConfig | The JSON body of the request, containing parameters of the application anomaly detection configuration.
        try {
            apiInstance.updateApplicationAnomalyDetectionConfig(applicationAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#updateApplicationAnomalyDetectionConfig");
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
| **applicationAnomalyDetectionConfig** | [**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)| The JSON body of the request, containing parameters of the application anomaly detection configuration. | [optional] |

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

## updateApplicationAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> updateApplicationAnomalyDetectionConfig updateApplicationAnomalyDetectionConfigWithHttpInfo(applicationAnomalyDetectionConfig)

Updates the configuration of anomaly detection for applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        ApplicationAnomalyDetectionConfig applicationAnomalyDetectionConfig = new ApplicationAnomalyDetectionConfig(); // ApplicationAnomalyDetectionConfig | The JSON body of the request, containing parameters of the application anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateApplicationAnomalyDetectionConfigWithHttpInfo(applicationAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#updateApplicationAnomalyDetectionConfig");
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
| **applicationAnomalyDetectionConfig** | [**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)| The JSON body of the request, containing parameters of the application anomaly detection configuration. | [optional] |

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


## validateApplicationAnomalyDetectionConfig

> void validateApplicationAnomalyDetectionConfig(applicationAnomalyDetectionConfig)

Validates the configuration of anomaly detection for applications for the &#x60;PUT /anomalyDetection/applications&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        ApplicationAnomalyDetectionConfig applicationAnomalyDetectionConfig = new ApplicationAnomalyDetectionConfig(); // ApplicationAnomalyDetectionConfig | The JSON body of the request, containing parameters of the application anomaly detection configuration.
        try {
            apiInstance.validateApplicationAnomalyDetectionConfig(applicationAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#validateApplicationAnomalyDetectionConfig");
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
| **applicationAnomalyDetectionConfig** | [**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)| The JSON body of the request, containing parameters of the application anomaly detection configuration. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateApplicationAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> validateApplicationAnomalyDetectionConfig validateApplicationAnomalyDetectionConfigWithHttpInfo(applicationAnomalyDetectionConfig)

Validates the configuration of anomaly detection for applications for the &#x60;PUT /anomalyDetection/applications&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionApplicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionApplicationsApi apiInstance = new AnomalyDetectionApplicationsApi(defaultClient);
        ApplicationAnomalyDetectionConfig applicationAnomalyDetectionConfig = new ApplicationAnomalyDetectionConfig(); // ApplicationAnomalyDetectionConfig | The JSON body of the request, containing parameters of the application anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateApplicationAnomalyDetectionConfigWithHttpInfo(applicationAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionApplicationsApi#validateApplicationAnomalyDetectionConfig");
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
| **applicationAnomalyDetectionConfig** | [**ApplicationAnomalyDetectionConfig**](ApplicationAnomalyDetectionConfig.md)| The JSON body of the request, containing parameters of the application anomaly detection configuration. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

