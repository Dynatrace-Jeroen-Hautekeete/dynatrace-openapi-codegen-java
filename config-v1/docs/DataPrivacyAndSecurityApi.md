# DataPrivacyAndSecurityApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataPrivacySettings1**](DataPrivacyAndSecurityApi.md#getDataPrivacySettings1) | **GET** /dataPrivacy | Lists the global data privacy and security settings |
| [**getDataPrivacySettings1WithHttpInfo**](DataPrivacyAndSecurityApi.md#getDataPrivacySettings1WithHttpInfo) | **GET** /dataPrivacy | Lists the global data privacy and security settings |
| [**updateDataPrivacySettings1**](DataPrivacyAndSecurityApi.md#updateDataPrivacySettings1) | **PUT** /dataPrivacy | Updates the global data privacy and security settings |
| [**updateDataPrivacySettings1WithHttpInfo**](DataPrivacyAndSecurityApi.md#updateDataPrivacySettings1WithHttpInfo) | **PUT** /dataPrivacy | Updates the global data privacy and security settings |
| [**validateDataPrivacySettings1**](DataPrivacyAndSecurityApi.md#validateDataPrivacySettings1) | **POST** /dataPrivacy/validator | Validates the payload for the &#x60;PUT /dataPrivacy&#x60; request |
| [**validateDataPrivacySettings1WithHttpInfo**](DataPrivacyAndSecurityApi.md#validateDataPrivacySettings1WithHttpInfo) | **POST** /dataPrivacy/validator | Validates the payload for the &#x60;PUT /dataPrivacy&#x60; request |



## getDataPrivacySettings1

> DataPrivacyAndSecurity getDataPrivacySettings1()

Lists the global data privacy and security settings

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        try {
            DataPrivacyAndSecurity result = apiInstance.getDataPrivacySettings1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#getDataPrivacySettings1");
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

[**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDataPrivacySettings1WithHttpInfo

> ApiResponse<DataPrivacyAndSecurity> getDataPrivacySettings1 getDataPrivacySettings1WithHttpInfo()

Lists the global data privacy and security settings

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        try {
            ApiResponse<DataPrivacyAndSecurity> response = apiInstance.getDataPrivacySettings1WithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#getDataPrivacySettings1");
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

ApiResponse<[**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateDataPrivacySettings1

> void updateDataPrivacySettings1(dataPrivacyAndSecurity)

Updates the global data privacy and security settings

This request updates global settings, affecting all your applications.    To update application-specific data privacy settings, use the [**PUT data privacy of a web application**](https://dt-url.net/q403sv9) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        DataPrivacyAndSecurity dataPrivacyAndSecurity = new DataPrivacyAndSecurity(); // DataPrivacyAndSecurity | 
        try {
            apiInstance.updateDataPrivacySettings1(dataPrivacyAndSecurity);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#updateDataPrivacySettings1");
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
| **dataPrivacyAndSecurity** | [**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)|  | |

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

## updateDataPrivacySettings1WithHttpInfo

> ApiResponse<Void> updateDataPrivacySettings1 updateDataPrivacySettings1WithHttpInfo(dataPrivacyAndSecurity)

Updates the global data privacy and security settings

This request updates global settings, affecting all your applications.    To update application-specific data privacy settings, use the [**PUT data privacy of a web application**](https://dt-url.net/q403sv9) request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        DataPrivacyAndSecurity dataPrivacyAndSecurity = new DataPrivacyAndSecurity(); // DataPrivacyAndSecurity | 
        try {
            ApiResponse<Void> response = apiInstance.updateDataPrivacySettings1WithHttpInfo(dataPrivacyAndSecurity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#updateDataPrivacySettings1");
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
| **dataPrivacyAndSecurity** | [**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)|  | |

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


## validateDataPrivacySettings1

> void validateDataPrivacySettings1(dataPrivacyAndSecurity)

Validates the payload for the &#x60;PUT /dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        DataPrivacyAndSecurity dataPrivacyAndSecurity = new DataPrivacyAndSecurity(); // DataPrivacyAndSecurity | 
        try {
            apiInstance.validateDataPrivacySettings1(dataPrivacyAndSecurity);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#validateDataPrivacySettings1");
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
| **dataPrivacyAndSecurity** | [**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)|  | |

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

## validateDataPrivacySettings1WithHttpInfo

> ApiResponse<Void> validateDataPrivacySettings1 validateDataPrivacySettings1WithHttpInfo(dataPrivacyAndSecurity)

Validates the payload for the &#x60;PUT /dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DataPrivacyAndSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DataPrivacyAndSecurityApi apiInstance = new DataPrivacyAndSecurityApi(defaultClient);
        DataPrivacyAndSecurity dataPrivacyAndSecurity = new DataPrivacyAndSecurity(); // DataPrivacyAndSecurity | 
        try {
            ApiResponse<Void> response = apiInstance.validateDataPrivacySettings1WithHttpInfo(dataPrivacyAndSecurity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPrivacyAndSecurityApi#validateDataPrivacySettings1");
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
| **dataPrivacyAndSecurity** | [**DataPrivacyAndSecurity**](DataPrivacyAndSecurity.md)|  | |

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

