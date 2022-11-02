# RumJavaScriptTagManagementApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppRevision**](RumJavaScriptTagManagementApi.md#getAppRevision) | **GET** /rum/appRevision/{entity} | Gets the version of the RUM JavaScript code injected into specified application |
| [**getAppRevisionWithHttpInfo**](RumJavaScriptTagManagementApi.md#getAppRevisionWithHttpInfo) | **GET** /rum/appRevision/{entity} | Gets the version of the RUM JavaScript code injected into specified application |
| [**getAsyncCodeSnippet**](RumJavaScriptTagManagementApi.md#getAsyncCodeSnippet) | **GET** /rum/asyncCS/{entity} | Downloads the asynchronous code snippet |
| [**getAsyncCodeSnippetWithHttpInfo**](RumJavaScriptTagManagementApi.md#getAsyncCodeSnippetWithHttpInfo) | **GET** /rum/asyncCS/{entity} | Downloads the asynchronous code snippet |
| [**getJsInlineScript**](RumJavaScriptTagManagementApi.md#getJsInlineScript) | **GET** /rum/jsInlineScript/{entity} | Downloads inline code |
| [**getJsInlineScriptWithHttpInfo**](RumJavaScriptTagManagementApi.md#getJsInlineScriptWithHttpInfo) | **GET** /rum/jsInlineScript/{entity} | Downloads inline code |
| [**getJsLatestVersion**](RumJavaScriptTagManagementApi.md#getJsLatestVersion) | **GET** /rum/jsLatestVersion | Gets the latest version of OneAgent JavaScript library |
| [**getJsLatestVersionWithHttpInfo**](RumJavaScriptTagManagementApi.md#getJsLatestVersionWithHttpInfo) | **GET** /rum/jsLatestVersion | Gets the latest version of OneAgent JavaScript library |
| [**getJsScript**](RumJavaScriptTagManagementApi.md#getJsScript) | **GET** /rum/jsTag/{entity} | Downloads OneAgent JavaScript tag |
| [**getJsScriptWithHttpInfo**](RumJavaScriptTagManagementApi.md#getJsScriptWithHttpInfo) | **GET** /rum/jsTag/{entity} | Downloads OneAgent JavaScript tag |
| [**getJsTagComplete**](RumJavaScriptTagManagementApi.md#getJsTagComplete) | **GET** /rum/jsTagComplete/{entity} | Downloads JavaScript tag |
| [**getJsTagCompleteWithHttpInfo**](RumJavaScriptTagManagementApi.md#getJsTagCompleteWithHttpInfo) | **GET** /rum/jsTagComplete/{entity} | Downloads JavaScript tag |
| [**getManualApps**](RumJavaScriptTagManagementApi.md#getManualApps) | **GET** /rum/manualApps | Lists all manually injected applications |
| [**getManualAppsWithHttpInfo**](RumJavaScriptTagManagementApi.md#getManualAppsWithHttpInfo) | **GET** /rum/manualApps | Lists all manually injected applications |
| [**getSyncCodeSnippet**](RumJavaScriptTagManagementApi.md#getSyncCodeSnippet) | **GET** /rum/syncCS/{entity} | Downloads the synchronous code snippet |
| [**getSyncCodeSnippetWithHttpInfo**](RumJavaScriptTagManagementApi.md#getSyncCodeSnippetWithHttpInfo) | **GET** /rum/syncCS/{entity} | Downloads the synchronous code snippet |



## getAppRevision

> String getAppRevision(entity)

Gets the version of the RUM JavaScript code injected into specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getAppRevision(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getAppRevision");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAppRevisionWithHttpInfo

> ApiResponse<String> getAppRevision getAppRevisionWithHttpInfo(entity)

Gets the version of the RUM JavaScript code injected into specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getAppRevisionWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getAppRevision");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAsyncCodeSnippet

> String getAsyncCodeSnippet(entity)

Downloads the asynchronous code snippet

This code provides configuration and basic code to be manually inserted into your web application code.   The full functionality of the monitoring code is loaded asynchronously.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getAsyncCodeSnippet(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getAsyncCodeSnippet");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAsyncCodeSnippetWithHttpInfo

> ApiResponse<String> getAsyncCodeSnippet getAsyncCodeSnippetWithHttpInfo(entity)

Downloads the asynchronous code snippet

This code provides configuration and basic code to be manually inserted into your web application code.   The full functionality of the monitoring code is loaded asynchronously.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getAsyncCodeSnippetWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getAsyncCodeSnippet");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getJsInlineScript

> String getJsInlineScript(entity)

Downloads inline code

Returns the inline code of the most recent OneAgent JavaScript. This is a complete configuration and monitoring code to be manually inserted into your web application code.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getJsInlineScript(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsInlineScript");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getJsInlineScriptWithHttpInfo

> ApiResponse<String> getJsInlineScript getJsInlineScriptWithHttpInfo(entity)

Downloads inline code

Returns the inline code of the most recent OneAgent JavaScript. This is a complete configuration and monitoring code to be manually inserted into your web application code.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getJsInlineScriptWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsInlineScript");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getJsLatestVersion

> String getJsLatestVersion()

Gets the latest version of OneAgent JavaScript library

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        try {
            String result = apiInstance.getJsLatestVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsLatestVersion");
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

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getJsLatestVersionWithHttpInfo

> ApiResponse<String> getJsLatestVersion getJsLatestVersionWithHttpInfo()

Gets the latest version of OneAgent JavaScript library

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        try {
            ApiResponse<String> response = apiInstance.getJsLatestVersionWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsLatestVersion");
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

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getJsScript

> String getJsScript(entity)

Downloads OneAgent JavaScript tag

Returns the OneAgent JavaScript tag. This is a complete configuration and monitoring code to be manually inserted into your web application code.   The monitoring code is loaded as a separate file from a CDN.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getJsScript(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsScript");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getJsScriptWithHttpInfo

> ApiResponse<String> getJsScript getJsScriptWithHttpInfo(entity)

Downloads OneAgent JavaScript tag

Returns the OneAgent JavaScript tag. This is a complete configuration and monitoring code to be manually inserted into your web application code.   The monitoring code is loaded as a separate file from a CDN.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getJsScriptWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsScript");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getJsTagComplete

> String getJsTagComplete(entity)

Downloads JavaScript tag

Returns a JavaScript tag to be manually inserted into your web application code. The tag references a JavaScript file with full configuration and monitoring code, which causes a lower possible caching duration.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getJsTagComplete(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsTagComplete");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getJsTagCompleteWithHttpInfo

> ApiResponse<String> getJsTagComplete getJsTagCompleteWithHttpInfo(entity)

Downloads JavaScript tag

Returns a JavaScript tag to be manually inserted into your web application code. The tag references a JavaScript file with full configuration and monitoring code, which causes a lower possible caching duration.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getJsTagCompleteWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getJsTagComplete");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getManualApps

> List<ManualApplication> getManualApps()

Lists all manually injected applications

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        try {
            List<ManualApplication> result = apiInstance.getManualApps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getManualApps");
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

[**List&lt;ManualApplication&gt;**](ManualApplication.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getManualAppsWithHttpInfo

> ApiResponse<List<ManualApplication>> getManualApps getManualAppsWithHttpInfo()

Lists all manually injected applications

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        try {
            ApiResponse<List<ManualApplication>> response = apiInstance.getManualAppsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getManualApps");
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

ApiResponse<[**List&lt;ManualApplication&gt;**](ManualApplication.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSyncCodeSnippet

> String getSyncCodeSnippet(entity)

Downloads the synchronous code snippet

This code provides configuration and basic code to be manually inserted into your web application code.   The full functionality of the monitoring code is loaded synchronously.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            String result = apiInstance.getSyncCodeSnippet(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getSyncCodeSnippet");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

**String**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSyncCodeSnippetWithHttpInfo

> ApiResponse<String> getSyncCodeSnippet getSyncCodeSnippetWithHttpInfo(entity)

Downloads the synchronous code snippet

This code provides configuration and basic code to be manually inserted into your web application code.   The full functionality of the monitoring code is loaded synchronously.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumJavaScriptTagManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumJavaScriptTagManagementApi apiInstance = new RumJavaScriptTagManagementApi(defaultClient);
        String entity = "entity_example"; // String | The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call.
        try {
            ApiResponse<String> response = apiInstance.getSyncCodeSnippetWithHttpInfo(entity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumJavaScriptTagManagementApi#getSyncCodeSnippet");
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
| **entity** | **String**| The Dynatrace entity ID of the application.   You can obtain it from the response of the [GET the list of manually injected applications](https://dt-url.net/dl03sgo) call. | |

### Return type

ApiResponse<**String**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

