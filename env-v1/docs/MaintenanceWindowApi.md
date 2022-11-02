# MaintenanceWindowApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllMaintenanceWindowConfigs**](MaintenanceWindowApi.md#getAllMaintenanceWindowConfigs) | **GET** /maintenance | Lists all parameters of all maintenance windows available in your Dynatrace environment. |
| [**getAllMaintenanceWindowConfigsWithHttpInfo**](MaintenanceWindowApi.md#getAllMaintenanceWindowConfigsWithHttpInfo) | **GET** /maintenance | Lists all parameters of all maintenance windows available in your Dynatrace environment. |
| [**getMaintenanceWindowConfig**](MaintenanceWindowApi.md#getMaintenanceWindowConfig) | **GET** /maintenance/{uid} | Lists all parameters of the specified maintenance window. |
| [**getMaintenanceWindowConfigWithHttpInfo**](MaintenanceWindowApi.md#getMaintenanceWindowConfigWithHttpInfo) | **GET** /maintenance/{uid} | Lists all parameters of the specified maintenance window. |
| [**removeMaintenanceWindowConfig**](MaintenanceWindowApi.md#removeMaintenanceWindowConfig) | **DELETE** /maintenance/{uid} | Deletes the specified maintenance window |
| [**removeMaintenanceWindowConfigWithHttpInfo**](MaintenanceWindowApi.md#removeMaintenanceWindowConfigWithHttpInfo) | **DELETE** /maintenance/{uid} | Deletes the specified maintenance window |
| [**storeMaintenanceWindowConfig**](MaintenanceWindowApi.md#storeMaintenanceWindowConfig) | **POST** /maintenance | Creates a new or updates an existing maintenance window |
| [**storeMaintenanceWindowConfigWithHttpInfo**](MaintenanceWindowApi.md#storeMaintenanceWindowConfigWithHttpInfo) | **POST** /maintenance | Creates a new or updates an existing maintenance window |



## getAllMaintenanceWindowConfigs

> List<MaintenanceWindow> getAllMaintenanceWindowConfigs(from, to, type)

Lists all parameters of all maintenance windows available in your Dynatrace environment.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        Long from = 0L; // Long | The start timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, the current time is used.
        Long to = 0L; // Long | The end timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, all maintenance windows beginning after the `from` timestamp will be returned.
        String type = "Planned"; // String | The type of the maintenance window to return.    If `Unknown` or not set, all maintenance windows are returned.
        try {
            List<MaintenanceWindow> result = apiInstance.getAllMaintenanceWindowConfigs(from, to, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getAllMaintenanceWindowConfigs");
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
| **from** | **Long**| The start timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, the current time is used. | [optional] [default to 0] |
| **to** | **Long**| The end timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, all maintenance windows beginning after the &#x60;from&#x60; timestamp will be returned. | [optional] [default to 0] |
| **type** | **String**| The type of the maintenance window to return.    If &#x60;Unknown&#x60; or not set, all maintenance windows are returned. | [optional] [default to Unknown] [enum: Planned, Unknown, Unplanned] |

### Return type

[**List&lt;MaintenanceWindow&gt;**](MaintenanceWindow.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllMaintenanceWindowConfigsWithHttpInfo

> ApiResponse<List<MaintenanceWindow>> getAllMaintenanceWindowConfigs getAllMaintenanceWindowConfigsWithHttpInfo(from, to, type)

Lists all parameters of all maintenance windows available in your Dynatrace environment.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        Long from = 0L; // Long | The start timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, the current time is used.
        Long to = 0L; // Long | The end timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, all maintenance windows beginning after the `from` timestamp will be returned.
        String type = "Planned"; // String | The type of the maintenance window to return.    If `Unknown` or not set, all maintenance windows are returned.
        try {
            ApiResponse<List<MaintenanceWindow>> response = apiInstance.getAllMaintenanceWindowConfigsWithHttpInfo(from, to, type);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getAllMaintenanceWindowConfigs");
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
| **from** | **Long**| The start timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, the current time is used. | [optional] [default to 0] |
| **to** | **Long**| The end timestamp of the inquiry timeframe, in UTC milliseconds.    If not set, all maintenance windows beginning after the &#x60;from&#x60; timestamp will be returned. | [optional] [default to 0] |
| **type** | **String**| The type of the maintenance window to return.    If &#x60;Unknown&#x60; or not set, all maintenance windows are returned. | [optional] [default to Unknown] [enum: Planned, Unknown, Unplanned] |

### Return type

ApiResponse<[**List&lt;MaintenanceWindow&gt;**](MaintenanceWindow.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMaintenanceWindowConfig

> MaintenanceWindow getMaintenanceWindowConfig(uid)

Lists all parameters of the specified maintenance window.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        String uid = "uid_example"; // String | The ID of the required maintenance window.
        try {
            MaintenanceWindow result = apiInstance.getMaintenanceWindowConfig(uid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowConfig");
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
| **uid** | **String**| The ID of the required maintenance window. | |

### Return type

[**MaintenanceWindow**](MaintenanceWindow.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMaintenanceWindowConfigWithHttpInfo

> ApiResponse<MaintenanceWindow> getMaintenanceWindowConfig getMaintenanceWindowConfigWithHttpInfo(uid)

Lists all parameters of the specified maintenance window.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        String uid = "uid_example"; // String | The ID of the required maintenance window.
        try {
            ApiResponse<MaintenanceWindow> response = apiInstance.getMaintenanceWindowConfigWithHttpInfo(uid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowConfig");
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
| **uid** | **String**| The ID of the required maintenance window. | |

### Return type

ApiResponse<[**MaintenanceWindow**](MaintenanceWindow.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## removeMaintenanceWindowConfig

> void removeMaintenanceWindowConfig(uid)

Deletes the specified maintenance window

Deletion cannot be undone.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        String uid = "uid_example"; // String | The ID of the maintenance window to delete.
        try {
            apiInstance.removeMaintenanceWindowConfig(uid);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#removeMaintenanceWindowConfig");
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
| **uid** | **String**| The ID of the maintenance window to delete. | |

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
| **204** | Success. The maintenance window has been deleted. |  -  |

## removeMaintenanceWindowConfigWithHttpInfo

> ApiResponse<Void> removeMaintenanceWindowConfig removeMaintenanceWindowConfigWithHttpInfo(uid)

Deletes the specified maintenance window

Deletion cannot be undone.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        String uid = "uid_example"; // String | The ID of the maintenance window to delete.
        try {
            ApiResponse<Void> response = apiInstance.removeMaintenanceWindowConfigWithHttpInfo(uid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#removeMaintenanceWindowConfig");
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
| **uid** | **String**| The ID of the maintenance window to delete. | |

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
| **204** | Success. The maintenance window has been deleted. |  -  |


## storeMaintenanceWindowConfig

> void storeMaintenanceWindowConfig(maintenanceWindow)

Creates a new or updates an existing maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | 
        try {
            apiInstance.storeMaintenanceWindowConfig(maintenanceWindow);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#storeMaintenanceWindowConfig");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The maintenance window has been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## storeMaintenanceWindowConfigWithHttpInfo

> ApiResponse<Void> storeMaintenanceWindowConfig storeMaintenanceWindowConfigWithHttpInfo(maintenanceWindow)

Creates a new or updates an existing maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | 
        try {
            ApiResponse<Void> response = apiInstance.storeMaintenanceWindowConfigWithHttpInfo(maintenanceWindow);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#storeMaintenanceWindowConfig");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The maintenance window has been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

