# RumApplicationDetectionRulesHostDetectionApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHostDetectionConfig**](RumApplicationDetectionRulesHostDetectionApi.md#getHostDetectionConfig) | **GET** /applicationDetectionRules/hostDetection | Gets the configuration of host detection headers |
| [**getHostDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesHostDetectionApi.md#getHostDetectionConfigWithHttpInfo) | **GET** /applicationDetectionRules/hostDetection | Gets the configuration of host detection headers |
| [**updateHostDetectionConfig**](RumApplicationDetectionRulesHostDetectionApi.md#updateHostDetectionConfig) | **PUT** /applicationDetectionRules/hostDetection | Updates the configuration of host detection headers |
| [**updateHostDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesHostDetectionApi.md#updateHostDetectionConfigWithHttpInfo) | **PUT** /applicationDetectionRules/hostDetection | Updates the configuration of host detection headers |
| [**validateHostDetectionConfig**](RumApplicationDetectionRulesHostDetectionApi.md#validateHostDetectionConfig) | **POST** /applicationDetectionRules/hostDetection/validator | Validate the payload for &#x60;PUT /applicationDetection/hostDetection&#x60; request. |
| [**validateHostDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesHostDetectionApi.md#validateHostDetectionConfigWithHttpInfo) | **POST** /applicationDetectionRules/hostDetection/validator | Validate the payload for &#x60;PUT /applicationDetection/hostDetection&#x60; request. |



## getHostDetectionConfig

> ApplicationDetectionRulesHostDetectionSettings getHostDetectionConfig()

Gets the configuration of host detection headers

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        try {
            ApplicationDetectionRulesHostDetectionSettings result = apiInstance.getHostDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#getHostDetectionConfig");
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

[**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostDetectionConfigWithHttpInfo

> ApiResponse<ApplicationDetectionRulesHostDetectionSettings> getHostDetectionConfig getHostDetectionConfigWithHttpInfo()

Gets the configuration of host detection headers

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        try {
            ApiResponse<ApplicationDetectionRulesHostDetectionSettings> response = apiInstance.getHostDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#getHostDetectionConfig");
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

ApiResponse<[**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateHostDetectionConfig

> void updateHostDetectionConfig(applicationDetectionRulesHostDetectionSettings)

Updates the configuration of host detection headers

The request overwrites the existing configuration. Any headers not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        ApplicationDetectionRulesHostDetectionSettings applicationDetectionRulesHostDetectionSettings = new ApplicationDetectionRulesHostDetectionSettings(); // ApplicationDetectionRulesHostDetectionSettings | The JSON body of the request. Contains the configuration of host detection headers.
        try {
            apiInstance.updateHostDetectionConfig(applicationDetectionRulesHostDetectionSettings);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#updateHostDetectionConfig");
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
| **applicationDetectionRulesHostDetectionSettings** | [**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)| The JSON body of the request. Contains the configuration of host detection headers. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateHostDetectionConfigWithHttpInfo

> ApiResponse<Void> updateHostDetectionConfig updateHostDetectionConfigWithHttpInfo(applicationDetectionRulesHostDetectionSettings)

Updates the configuration of host detection headers

The request overwrites the existing configuration. Any headers not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        ApplicationDetectionRulesHostDetectionSettings applicationDetectionRulesHostDetectionSettings = new ApplicationDetectionRulesHostDetectionSettings(); // ApplicationDetectionRulesHostDetectionSettings | The JSON body of the request. Contains the configuration of host detection headers.
        try {
            ApiResponse<Void> response = apiInstance.updateHostDetectionConfigWithHttpInfo(applicationDetectionRulesHostDetectionSettings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#updateHostDetectionConfig");
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
| **applicationDetectionRulesHostDetectionSettings** | [**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)| The JSON body of the request. Contains the configuration of host detection headers. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateHostDetectionConfig

> void validateHostDetectionConfig(applicationDetectionRulesHostDetectionSettings)

Validate the payload for &#x60;PUT /applicationDetection/hostDetection&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        ApplicationDetectionRulesHostDetectionSettings applicationDetectionRulesHostDetectionSettings = new ApplicationDetectionRulesHostDetectionSettings(); // ApplicationDetectionRulesHostDetectionSettings | The JSON body of the request. Contains the configuration of host detection headers to be validated.
        try {
            apiInstance.validateHostDetectionConfig(applicationDetectionRulesHostDetectionSettings);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#validateHostDetectionConfig");
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
| **applicationDetectionRulesHostDetectionSettings** | [**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)| The JSON body of the request. Contains the configuration of host detection headers to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateHostDetectionConfigWithHttpInfo

> ApiResponse<Void> validateHostDetectionConfig validateHostDetectionConfigWithHttpInfo(applicationDetectionRulesHostDetectionSettings)

Validate the payload for &#x60;PUT /applicationDetection/hostDetection&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesHostDetectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesHostDetectionApi apiInstance = new RumApplicationDetectionRulesHostDetectionApi(defaultClient);
        ApplicationDetectionRulesHostDetectionSettings applicationDetectionRulesHostDetectionSettings = new ApplicationDetectionRulesHostDetectionSettings(); // ApplicationDetectionRulesHostDetectionSettings | The JSON body of the request. Contains the configuration of host detection headers to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateHostDetectionConfigWithHttpInfo(applicationDetectionRulesHostDetectionSettings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesHostDetectionApi#validateHostDetectionConfig");
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
| **applicationDetectionRulesHostDetectionSettings** | [**ApplicationDetectionRulesHostDetectionSettings**](ApplicationDetectionRulesHostDetectionSettings.md)| The JSON body of the request. Contains the configuration of host detection headers to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

