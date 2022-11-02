# MaintenanceWindowsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMaintenanceWindow**](MaintenanceWindowsApi.md#createMaintenanceWindow) | **POST** /maintenanceWindows | Creates a new maintenance window |
| [**createMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#createMaintenanceWindowWithHttpInfo) | **POST** /maintenanceWindows | Creates a new maintenance window |
| [**deleteMaintenanceWindow**](MaintenanceWindowsApi.md#deleteMaintenanceWindow) | **DELETE** /maintenanceWindows/{id} | Deletes the specified maintenance window |
| [**deleteMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#deleteMaintenanceWindowWithHttpInfo) | **DELETE** /maintenanceWindows/{id} | Deletes the specified maintenance window |
| [**getMaintenanceWindow**](MaintenanceWindowsApi.md#getMaintenanceWindow) | **GET** /maintenanceWindows/{id} | Gets the properties of the specified maintenance window |
| [**getMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#getMaintenanceWindowWithHttpInfo) | **GET** /maintenanceWindows/{id} | Gets the properties of the specified maintenance window |
| [**listMaintenanceWindows**](MaintenanceWindowsApi.md#listMaintenanceWindows) | **GET** /maintenanceWindows | Lists all available maintenance windows |
| [**listMaintenanceWindowsWithHttpInfo**](MaintenanceWindowsApi.md#listMaintenanceWindowsWithHttpInfo) | **GET** /maintenanceWindows | Lists all available maintenance windows |
| [**updateMaintenanceWindow**](MaintenanceWindowsApi.md#updateMaintenanceWindow) | **PUT** /maintenanceWindows/{id} | Updates an existing maintenance window |
| [**updateMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#updateMaintenanceWindowWithHttpInfo) | **PUT** /maintenanceWindows/{id} | Updates an existing maintenance window |
| [**validateCreateMaintenanceWindow**](MaintenanceWindowsApi.md#validateCreateMaintenanceWindow) | **POST** /maintenanceWindows/validator | Validates the payload for the &#x60;POST /maintenancewindow&#x60; request |
| [**validateCreateMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#validateCreateMaintenanceWindowWithHttpInfo) | **POST** /maintenanceWindows/validator | Validates the payload for the &#x60;POST /maintenancewindow&#x60; request |
| [**validateUpdateMaintenanceWindow**](MaintenanceWindowsApi.md#validateUpdateMaintenanceWindow) | **POST** /maintenanceWindows/{id}/validator | Validates the payload for the &#x60;PUT /maintenancewindow/{id}&#x60; request |
| [**validateUpdateMaintenanceWindowWithHttpInfo**](MaintenanceWindowsApi.md#validateUpdateMaintenanceWindowWithHttpInfo) | **POST** /maintenanceWindows/{id}/validator | Validates the payload for the &#x60;PUT /maintenancewindow/{id}&#x60; request |



## createMaintenanceWindow

> EntityShortRepresentation createMaintenanceWindow(maintenanceWindow)

Creates a new maintenance window

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the new maintenance window.
        try {
            EntityShortRepresentation result = apiInstance.createMaintenanceWindow(maintenanceWindow);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#createMaintenanceWindow");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the new maintenance window. | [optional] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new maintenance window has been created. The response body contains its ID. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createMaintenanceWindowWithHttpInfo

> ApiResponse<EntityShortRepresentation> createMaintenanceWindow createMaintenanceWindowWithHttpInfo(maintenanceWindow)

Creates a new maintenance window

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the new maintenance window.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createMaintenanceWindowWithHttpInfo(maintenanceWindow);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#createMaintenanceWindow");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the new maintenance window. | [optional] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new maintenance window has been created. The response body contains its ID. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteMaintenanceWindow

> void deleteMaintenanceWindow(id)

Deletes the specified maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be deleted.
        try {
            apiInstance.deleteMaintenanceWindow(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#deleteMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be deleted. | |

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
| **204** | Success. The maintenance window has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteMaintenanceWindowWithHttpInfo

> ApiResponse<Void> deleteMaintenanceWindow deleteMaintenanceWindowWithHttpInfo(id)

Deletes the specified maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteMaintenanceWindowWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#deleteMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be deleted. | |

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
| **204** | Success. The maintenance window has been deleted. Response doesn&#39;t have a body. |  -  |


## getMaintenanceWindow

> MaintenanceWindow getMaintenanceWindow(id)

Gets the properties of the specified maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required maintenance window.
        try {
            MaintenanceWindow result = apiInstance.getMaintenanceWindow(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#getMaintenanceWindow");
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
| **id** | **UUID**| The ID of the required maintenance window. | |

### Return type

[**MaintenanceWindow**](MaintenanceWindow.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMaintenanceWindowWithHttpInfo

> ApiResponse<MaintenanceWindow> getMaintenanceWindow getMaintenanceWindowWithHttpInfo(id)

Gets the properties of the specified maintenance window

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required maintenance window.
        try {
            ApiResponse<MaintenanceWindow> response = apiInstance.getMaintenanceWindowWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#getMaintenanceWindow");
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
| **id** | **UUID**| The ID of the required maintenance window. | |

### Return type

ApiResponse<[**MaintenanceWindow**](MaintenanceWindow.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listMaintenanceWindows

> StubList listMaintenanceWindows()

Lists all available maintenance windows

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        try {
            StubList result = apiInstance.listMaintenanceWindows();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#listMaintenanceWindows");
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

[**StubList**](StubList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listMaintenanceWindowsWithHttpInfo

> ApiResponse<StubList> listMaintenanceWindows listMaintenanceWindowsWithHttpInfo()

Lists all available maintenance windows

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listMaintenanceWindowsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#listMaintenanceWindows");
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

ApiResponse<[**StubList**](StubList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateMaintenanceWindow

> EntityShortRepresentation updateMaintenanceWindow(id, maintenanceWindow)

Updates an existing maintenance window

If a maintenance window with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be updated.
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains updated parameters of the maintenance window.
        try {
            EntityShortRepresentation result = apiInstance.updateMaintenanceWindow(id, maintenanceWindow);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#updateMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be updated. | |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains updated parameters of the maintenance window. | [optional] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new maintenance window has been created. The response body contains its ID. |  -  |
| **204** | Success. The maintenance window has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateMaintenanceWindowWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateMaintenanceWindow updateMaintenanceWindowWithHttpInfo(id, maintenanceWindow)

Updates an existing maintenance window

If a maintenance window with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be updated.
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains updated parameters of the maintenance window.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateMaintenanceWindowWithHttpInfo(id, maintenanceWindow);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#updateMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be updated. | |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains updated parameters of the maintenance window. | [optional] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new maintenance window has been created. The response body contains its ID. |  -  |
| **204** | Success. The maintenance window has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateMaintenanceWindow

> void validateCreateMaintenanceWindow(maintenanceWindow)

Validates the payload for the &#x60;POST /maintenancewindow&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the maintenance window be validated.
        try {
            apiInstance.validateCreateMaintenanceWindow(maintenanceWindow);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#validateCreateMaintenanceWindow");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the maintenance window be validated. | [optional] |

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

## validateCreateMaintenanceWindowWithHttpInfo

> ApiResponse<Void> validateCreateMaintenanceWindow validateCreateMaintenanceWindowWithHttpInfo(maintenanceWindow)

Validates the payload for the &#x60;POST /maintenancewindow&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the maintenance window be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateMaintenanceWindowWithHttpInfo(maintenanceWindow);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#validateCreateMaintenanceWindow");
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
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the maintenance window be validated. | [optional] |

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


## validateUpdateMaintenanceWindow

> void validateUpdateMaintenanceWindow(id, maintenanceWindow)

Validates the payload for the &#x60;PUT /maintenancewindow/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be validated.
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the maintenance window to be validated.
        try {
            apiInstance.validateUpdateMaintenanceWindow(id, maintenanceWindow);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#validateUpdateMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be validated. | |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the maintenance window to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateUpdateMaintenanceWindowWithHttpInfo

> ApiResponse<Void> validateUpdateMaintenanceWindow validateUpdateMaintenanceWindowWithHttpInfo(id, maintenanceWindow)

Validates the payload for the &#x60;PUT /maintenancewindow/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.MaintenanceWindowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MaintenanceWindowsApi apiInstance = new MaintenanceWindowsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the maintenance window to be validated.
        MaintenanceWindow maintenanceWindow = new MaintenanceWindow(); // MaintenanceWindow | The JSON body of the request. Contains parameters of the maintenance window to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateMaintenanceWindowWithHttpInfo(id, maintenanceWindow);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowsApi#validateUpdateMaintenanceWindow");
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
| **id** | **UUID**| The ID of the maintenance window to be validated. | |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md)| The JSON body of the request. Contains parameters of the maintenance window to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

