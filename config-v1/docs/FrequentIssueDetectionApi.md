# FrequentIssueDetectionApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFrequentIssueDetectionConfig**](FrequentIssueDetectionApi.md#getFrequentIssueDetectionConfig) | **GET** /frequentIssueDetection | Gets the configuration of frequent issue detection |
| [**getFrequentIssueDetectionConfigWithHttpInfo**](FrequentIssueDetectionApi.md#getFrequentIssueDetectionConfigWithHttpInfo) | **GET** /frequentIssueDetection | Gets the configuration of frequent issue detection |
| [**updateFrequentIssueDetectionConfig**](FrequentIssueDetectionApi.md#updateFrequentIssueDetectionConfig) | **PUT** /frequentIssueDetection | Updates the configuration of frequent issue detection |
| [**updateFrequentIssueDetectionConfigWithHttpInfo**](FrequentIssueDetectionApi.md#updateFrequentIssueDetectionConfigWithHttpInfo) | **PUT** /frequentIssueDetection | Updates the configuration of frequent issue detection |
| [**validateFrequentIssueDetectionConfig**](FrequentIssueDetectionApi.md#validateFrequentIssueDetectionConfig) | **POST** /frequentIssueDetection/validator | Validates the payload for the &#x60;PUT /frequentIssueDetection&#x60; request |
| [**validateFrequentIssueDetectionConfigWithHttpInfo**](FrequentIssueDetectionApi.md#validateFrequentIssueDetectionConfigWithHttpInfo) | **POST** /frequentIssueDetection/validator | Validates the payload for the &#x60;PUT /frequentIssueDetection&#x60; request |



## getFrequentIssueDetectionConfig

> FrequentIssueDetectionConfig getFrequentIssueDetectionConfig()

Gets the configuration of frequent issue detection

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        try {
            FrequentIssueDetectionConfig result = apiInstance.getFrequentIssueDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#getFrequentIssueDetectionConfig");
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

[**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getFrequentIssueDetectionConfigWithHttpInfo

> ApiResponse<FrequentIssueDetectionConfig> getFrequentIssueDetectionConfig getFrequentIssueDetectionConfigWithHttpInfo()

Gets the configuration of frequent issue detection

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        try {
            ApiResponse<FrequentIssueDetectionConfig> response = apiInstance.getFrequentIssueDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#getFrequentIssueDetectionConfig");
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

ApiResponse<[**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateFrequentIssueDetectionConfig

> void updateFrequentIssueDetectionConfig(frequentIssueDetectionConfig)

Updates the configuration of frequent issue detection

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        FrequentIssueDetectionConfig frequentIssueDetectionConfig = new FrequentIssueDetectionConfig(); // FrequentIssueDetectionConfig | The JSON body of the request, containing parameters of the frequent issue detection configuration
        try {
            apiInstance.updateFrequentIssueDetectionConfig(frequentIssueDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#updateFrequentIssueDetectionConfig");
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
| **frequentIssueDetectionConfig** | [**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)| The JSON body of the request, containing parameters of the frequent issue detection configuration | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateFrequentIssueDetectionConfigWithHttpInfo

> ApiResponse<Void> updateFrequentIssueDetectionConfig updateFrequentIssueDetectionConfigWithHttpInfo(frequentIssueDetectionConfig)

Updates the configuration of frequent issue detection

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        FrequentIssueDetectionConfig frequentIssueDetectionConfig = new FrequentIssueDetectionConfig(); // FrequentIssueDetectionConfig | The JSON body of the request, containing parameters of the frequent issue detection configuration
        try {
            ApiResponse<Void> response = apiInstance.updateFrequentIssueDetectionConfigWithHttpInfo(frequentIssueDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#updateFrequentIssueDetectionConfig");
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
| **frequentIssueDetectionConfig** | [**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)| The JSON body of the request, containing parameters of the frequent issue detection configuration | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateFrequentIssueDetectionConfig

> void validateFrequentIssueDetectionConfig(frequentIssueDetectionConfig)

Validates the payload for the &#x60;PUT /frequentIssueDetection&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        FrequentIssueDetectionConfig frequentIssueDetectionConfig = new FrequentIssueDetectionConfig(); // FrequentIssueDetectionConfig | The JSON body of the request, containing parameters of the frequent issue detection configuration
        try {
            apiInstance.validateFrequentIssueDetectionConfig(frequentIssueDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#validateFrequentIssueDetectionConfig");
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
| **frequentIssueDetectionConfig** | [**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)| The JSON body of the request, containing parameters of the frequent issue detection configuration | [optional] |

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

## validateFrequentIssueDetectionConfigWithHttpInfo

> ApiResponse<Void> validateFrequentIssueDetectionConfig validateFrequentIssueDetectionConfigWithHttpInfo(frequentIssueDetectionConfig)

Validates the payload for the &#x60;PUT /frequentIssueDetection&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.FrequentIssueDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        FrequentIssueDetectionApi apiInstance = new FrequentIssueDetectionApi(defaultClient);
        FrequentIssueDetectionConfig frequentIssueDetectionConfig = new FrequentIssueDetectionConfig(); // FrequentIssueDetectionConfig | The JSON body of the request, containing parameters of the frequent issue detection configuration
        try {
            ApiResponse<Void> response = apiInstance.validateFrequentIssueDetectionConfigWithHttpInfo(frequentIssueDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling FrequentIssueDetectionApi#validateFrequentIssueDetectionConfig");
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
| **frequentIssueDetectionConfig** | [**FrequentIssueDetectionConfig**](FrequentIssueDetectionConfig.md)| The JSON body of the request, containing parameters of the frequent issue detection configuration | [optional] |

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

