# AnomalyDetectionAwsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAwsAnomalyDetectionConfig**](AnomalyDetectionAwsApi.md#getAwsAnomalyDetectionConfig) | **GET** /anomalyDetection/aws | Gets the configuration of anomaly detection for AWS |
| [**getAwsAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionAwsApi.md#getAwsAnomalyDetectionConfigWithHttpInfo) | **GET** /anomalyDetection/aws | Gets the configuration of anomaly detection for AWS |
| [**updateAwsAnomalyDetectionConfig**](AnomalyDetectionAwsApi.md#updateAwsAnomalyDetectionConfig) | **PUT** /anomalyDetection/aws | Updates the configuration of anomaly detection for AWS |
| [**updateAwsAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionAwsApi.md#updateAwsAnomalyDetectionConfigWithHttpInfo) | **PUT** /anomalyDetection/aws | Updates the configuration of anomaly detection for AWS |
| [**validateAwsAnomalyDetectionConfig**](AnomalyDetectionAwsApi.md#validateAwsAnomalyDetectionConfig) | **POST** /anomalyDetection/aws/validator | Validates the configuration of anomaly detection for AWS for the &#x60;PUT /anomalyDetection/aws&#x60; request |
| [**validateAwsAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionAwsApi.md#validateAwsAnomalyDetectionConfigWithHttpInfo) | **POST** /anomalyDetection/aws/validator | Validates the configuration of anomaly detection for AWS for the &#x60;PUT /anomalyDetection/aws&#x60; request |



## getAwsAnomalyDetectionConfig

> AwsAnomalyDetectionConfig getAwsAnomalyDetectionConfig()

Gets the configuration of anomaly detection for AWS

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        try {
            AwsAnomalyDetectionConfig result = apiInstance.getAwsAnomalyDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#getAwsAnomalyDetectionConfig");
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

[**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAwsAnomalyDetectionConfigWithHttpInfo

> ApiResponse<AwsAnomalyDetectionConfig> getAwsAnomalyDetectionConfig getAwsAnomalyDetectionConfigWithHttpInfo()

Gets the configuration of anomaly detection for AWS

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        try {
            ApiResponse<AwsAnomalyDetectionConfig> response = apiInstance.getAwsAnomalyDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#getAwsAnomalyDetectionConfig");
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

ApiResponse<[**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateAwsAnomalyDetectionConfig

> void updateAwsAnomalyDetectionConfig(awsAnomalyDetectionConfig)

Updates the configuration of anomaly detection for AWS

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        AwsAnomalyDetectionConfig awsAnomalyDetectionConfig = new AwsAnomalyDetectionConfig(); // AwsAnomalyDetectionConfig | JSON body of the request, containing parameters of the AWS anomaly detection configuration.
        try {
            apiInstance.updateAwsAnomalyDetectionConfig(awsAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#updateAwsAnomalyDetectionConfig");
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
| **awsAnomalyDetectionConfig** | [**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the AWS anomaly detection configuration. | [optional] |

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

## updateAwsAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> updateAwsAnomalyDetectionConfig updateAwsAnomalyDetectionConfigWithHttpInfo(awsAnomalyDetectionConfig)

Updates the configuration of anomaly detection for AWS

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        AwsAnomalyDetectionConfig awsAnomalyDetectionConfig = new AwsAnomalyDetectionConfig(); // AwsAnomalyDetectionConfig | JSON body of the request, containing parameters of the AWS anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateAwsAnomalyDetectionConfigWithHttpInfo(awsAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#updateAwsAnomalyDetectionConfig");
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
| **awsAnomalyDetectionConfig** | [**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the AWS anomaly detection configuration. | [optional] |

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


## validateAwsAnomalyDetectionConfig

> void validateAwsAnomalyDetectionConfig(awsAnomalyDetectionConfig)

Validates the configuration of anomaly detection for AWS for the &#x60;PUT /anomalyDetection/aws&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        AwsAnomalyDetectionConfig awsAnomalyDetectionConfig = new AwsAnomalyDetectionConfig(); // AwsAnomalyDetectionConfig | JSON body of the request, containing parameters of the AWS anomaly detection configuration.
        try {
            apiInstance.validateAwsAnomalyDetectionConfig(awsAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#validateAwsAnomalyDetectionConfig");
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
| **awsAnomalyDetectionConfig** | [**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the AWS anomaly detection configuration. | [optional] |

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

## validateAwsAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> validateAwsAnomalyDetectionConfig validateAwsAnomalyDetectionConfigWithHttpInfo(awsAnomalyDetectionConfig)

Validates the configuration of anomaly detection for AWS for the &#x60;PUT /anomalyDetection/aws&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionAwsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionAwsApi apiInstance = new AnomalyDetectionAwsApi(defaultClient);
        AwsAnomalyDetectionConfig awsAnomalyDetectionConfig = new AwsAnomalyDetectionConfig(); // AwsAnomalyDetectionConfig | JSON body of the request, containing parameters of the AWS anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateAwsAnomalyDetectionConfigWithHttpInfo(awsAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionAwsApi#validateAwsAnomalyDetectionConfig");
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
| **awsAnomalyDetectionConfig** | [**AwsAnomalyDetectionConfig**](AwsAnomalyDetectionConfig.md)| JSON body of the request, containing parameters of the AWS anomaly detection configuration. | [optional] |

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

