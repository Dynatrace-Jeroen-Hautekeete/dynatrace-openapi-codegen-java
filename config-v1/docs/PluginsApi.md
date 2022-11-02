# PluginsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRemotePluginEndpoint**](PluginsApi.md#createRemotePluginEndpoint) | **POST** /plugins/{id}/endpoints | Creates a new endpoint for the specified ActiveGate plugin |
| [**createRemotePluginEndpointWithHttpInfo**](PluginsApi.md#createRemotePluginEndpointWithHttpInfo) | **POST** /plugins/{id}/endpoints | Creates a new endpoint for the specified ActiveGate plugin |
| [**deletePlugin**](PluginsApi.md#deletePlugin) | **DELETE** /plugins/{id}/binary | Deletes the ZIP file of the specified plugin |
| [**deletePluginWithHttpInfo**](PluginsApi.md#deletePluginWithHttpInfo) | **DELETE** /plugins/{id}/binary | Deletes the ZIP file of the specified plugin |
| [**deleteRemotePluginEndpoint**](PluginsApi.md#deleteRemotePluginEndpoint) | **DELETE** /plugins/{id}/endpoints/{endpointId} | Deletes an existing endpoint of the ActiveGate plugin |
| [**deleteRemotePluginEndpointWithHttpInfo**](PluginsApi.md#deleteRemotePluginEndpointWithHttpInfo) | **DELETE** /plugins/{id}/endpoints/{endpointId} | Deletes an existing endpoint of the ActiveGate plugin |
| [**getPlugin**](PluginsApi.md#getPlugin) | **GET** /plugins/{id} | Lists the properties of the specified plugin |
| [**getPluginWithHttpInfo**](PluginsApi.md#getPluginWithHttpInfo) | **GET** /plugins/{id} | Lists the properties of the specified plugin |
| [**getPluginBinary**](PluginsApi.md#getPluginBinary) | **GET** /plugins/{id}/binary | Downloads the ZIP file of the specified plugin |
| [**getPluginBinaryWithHttpInfo**](PluginsApi.md#getPluginBinaryWithHttpInfo) | **GET** /plugins/{id}/binary | Downloads the ZIP file of the specified plugin |
| [**getPluginStates**](PluginsApi.md#getPluginStates) | **GET** /plugins/{id}/states | Lists the states of the specified plugin |
| [**getPluginStatesWithHttpInfo**](PluginsApi.md#getPluginStatesWithHttpInfo) | **GET** /plugins/{id}/states | Lists the states of the specified plugin |
| [**getPlugins**](PluginsApi.md#getPlugins) | **GET** /plugins | Lists all uploaded plugins |
| [**getPluginsWithHttpInfo**](PluginsApi.md#getPluginsWithHttpInfo) | **GET** /plugins | Lists all uploaded plugins |
| [**getRemotePluginEndpoint**](PluginsApi.md#getRemotePluginEndpoint) | **GET** /plugins/{id}/endpoints/{endpointId} | Gets parameters of the specified endpoint of the ActiveGate plugin |
| [**getRemotePluginEndpointWithHttpInfo**](PluginsApi.md#getRemotePluginEndpointWithHttpInfo) | **GET** /plugins/{id}/endpoints/{endpointId} | Gets parameters of the specified endpoint of the ActiveGate plugin |
| [**getRemotePluginEndpoints**](PluginsApi.md#getRemotePluginEndpoints) | **GET** /plugins/{id}/endpoints | Lists endpoints of the specified ActiveGate plugin |
| [**getRemotePluginEndpointsWithHttpInfo**](PluginsApi.md#getRemotePluginEndpointsWithHttpInfo) | **GET** /plugins/{id}/endpoints | Lists endpoints of the specified ActiveGate plugin |
| [**getRemotePluginModules**](PluginsApi.md#getRemotePluginModules) | **GET** /plugins/activeGatePluginModules | List available ActiveGate plugin modules |
| [**getRemotePluginModulesWithHttpInfo**](PluginsApi.md#getRemotePluginModulesWithHttpInfo) | **GET** /plugins/activeGatePluginModules | List available ActiveGate plugin modules |
| [**updateRemotePluginEndpoint**](PluginsApi.md#updateRemotePluginEndpoint) | **PUT** /plugins/{id}/endpoints/{endpointId} | Updates an existing endpoint of the ActiveGate plugin |
| [**updateRemotePluginEndpointWithHttpInfo**](PluginsApi.md#updateRemotePluginEndpointWithHttpInfo) | **PUT** /plugins/{id}/endpoints/{endpointId} | Updates an existing endpoint of the ActiveGate plugin |
| [**uploadPlugin**](PluginsApi.md#uploadPlugin) | **POST** /plugins | Uploads a ZIP plugin file |
| [**uploadPluginWithHttpInfo**](PluginsApi.md#uploadPluginWithHttpInfo) | **POST** /plugins | Uploads a ZIP plugin file |
| [**validatePlugin**](PluginsApi.md#validatePlugin) | **POST** /plugins/validator | Validates a ZIP plugin file for &#x60;POST/plugins&#x60; request |
| [**validatePluginWithHttpInfo**](PluginsApi.md#validatePluginWithHttpInfo) | **POST** /plugins/validator | Validates a ZIP plugin file for &#x60;POST/plugins&#x60; request |
| [**validateRemotePluginEndpoint**](PluginsApi.md#validateRemotePluginEndpoint) | **POST** /plugins/{id}/endpoints/validator | Validates the payload for the &#x60;POST /plugins/{id}/endpoints&#x60; request |
| [**validateRemotePluginEndpointWithHttpInfo**](PluginsApi.md#validateRemotePluginEndpointWithHttpInfo) | **POST** /plugins/{id}/endpoints/validator | Validates the payload for the &#x60;POST /plugins/{id}/endpoints&#x60; request |



## createRemotePluginEndpoint

> EntityShortRepresentation createRemotePluginEndpoint(id, remotePluginEndpoint)

Creates a new endpoint for the specified ActiveGate plugin

The body must not provide an ID of the endpoint, as IDs are automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to create an endpoint.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains parameters of the new plugin endpoint.
        try {
            EntityShortRepresentation result = apiInstance.createRemotePluginEndpoint(id, remotePluginEndpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#createRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to create an endpoint. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains parameters of the new plugin endpoint. | [optional] |

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
| **201** | Success. The plugin endpoint has been created. Response contains the ID of the new endpoint. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRemotePluginEndpointWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRemotePluginEndpoint createRemotePluginEndpointWithHttpInfo(id, remotePluginEndpoint)

Creates a new endpoint for the specified ActiveGate plugin

The body must not provide an ID of the endpoint, as IDs are automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to create an endpoint.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains parameters of the new plugin endpoint.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRemotePluginEndpointWithHttpInfo(id, remotePluginEndpoint);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#createRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to create an endpoint. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains parameters of the new plugin endpoint. | [optional] |

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
| **201** | Success. The plugin endpoint has been created. Response contains the ID of the new endpoint. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deletePlugin

> void deletePlugin(id)

Deletes the ZIP file of the specified plugin

Deletion of the plugin file uninstalls the plugin, making it unavailable for use.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin to be deleted.
        try {
            apiInstance.deletePlugin(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#deletePlugin");
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
| **id** | **String**| The ID of the plugin to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |

## deletePluginWithHttpInfo

> ApiResponse<Void> deletePlugin deletePluginWithHttpInfo(id)

Deletes the ZIP file of the specified plugin

Deletion of the plugin file uninstalls the plugin, making it unavailable for use.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deletePluginWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#deletePlugin");
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
| **id** | **String**| The ID of the plugin to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |


## deleteRemotePluginEndpoint

> void deleteRemotePluginEndpoint(id, endpointId)

Deletes an existing endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to delete an endpoint.
        String endpointId = "endpointId_example"; // String | The ID of the endpoint to be deleted.
        try {
            apiInstance.deleteRemotePluginEndpoint(id, endpointId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#deleteRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to delete an endpoint. | |
| **endpointId** | **String**| The ID of the endpoint to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |

## deleteRemotePluginEndpointWithHttpInfo

> ApiResponse<Void> deleteRemotePluginEndpoint deleteRemotePluginEndpointWithHttpInfo(id, endpointId)

Deletes an existing endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to delete an endpoint.
        String endpointId = "endpointId_example"; // String | The ID of the endpoint to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRemotePluginEndpointWithHttpInfo(id, endpointId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#deleteRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to delete an endpoint. | |
| **endpointId** | **String**| The ID of the endpoint to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |


## getPlugin

> Plugin getPlugin(id)

Lists the properties of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            Plugin result = apiInstance.getPlugin(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPlugin");
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
| **id** | **String**| The ID of the required plugin. | |

### Return type

[**Plugin**](Plugin.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getPluginWithHttpInfo

> ApiResponse<Plugin> getPlugin getPluginWithHttpInfo(id)

Lists the properties of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            ApiResponse<Plugin> response = apiInstance.getPluginWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPlugin");
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
| **id** | **String**| The ID of the required plugin. | |

### Return type

ApiResponse<[**Plugin**](Plugin.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPluginBinary

> Object getPluginBinary(id)

Downloads the ZIP file of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin you want to download.
        try {
            Object result = apiInstance.getPluginBinary(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPluginBinary");
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
| **id** | **String**| The ID of the plugin you want to download. | |

### Return type

**Object**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getPluginBinaryWithHttpInfo

> ApiResponse<Object> getPluginBinary getPluginBinaryWithHttpInfo(id)

Downloads the ZIP file of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin you want to download.
        try {
            ApiResponse<Object> response = apiInstance.getPluginBinaryWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPluginBinary");
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
| **id** | **String**| The ID of the plugin you want to download. | |

### Return type

ApiResponse<**Object**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPluginStates

> PluginStateList getPluginStates(id)

Lists the states of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            PluginStateList result = apiInstance.getPluginStates(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPluginStates");
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
| **id** | **String**| The ID of the required plugin. | |

### Return type

[**PluginStateList**](PluginStateList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getPluginStatesWithHttpInfo

> ApiResponse<PluginStateList> getPluginStates getPluginStatesWithHttpInfo(id)

Lists the states of the specified plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            ApiResponse<PluginStateList> response = apiInstance.getPluginStatesWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPluginStates");
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
| **id** | **String**| The ID of the required plugin. | |

### Return type

ApiResponse<[**PluginStateList**](PluginStateList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPlugins

> StubList getPlugins()

Lists all uploaded plugins

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        try {
            StubList result = apiInstance.getPlugins();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPlugins");
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

## getPluginsWithHttpInfo

> ApiResponse<StubList> getPlugins getPluginsWithHttpInfo()

Lists all uploaded plugins

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getPluginsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getPlugins");
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


## getRemotePluginEndpoint

> RemotePluginEndpoint getRemotePluginEndpoint(id, endpointId)

Gets parameters of the specified endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        String endpointId = "endpointId_example"; // String | The ID of the required endpoint.
        try {
            RemotePluginEndpoint result = apiInstance.getRemotePluginEndpoint(id, endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginEndpoint");
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
| **id** | **String**| The ID of the required plugin. | |
| **endpointId** | **String**| The ID of the required endpoint. | |

### Return type

[**RemotePluginEndpoint**](RemotePluginEndpoint.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRemotePluginEndpointWithHttpInfo

> ApiResponse<RemotePluginEndpoint> getRemotePluginEndpoint getRemotePluginEndpointWithHttpInfo(id, endpointId)

Gets parameters of the specified endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        String endpointId = "endpointId_example"; // String | The ID of the required endpoint.
        try {
            ApiResponse<RemotePluginEndpoint> response = apiInstance.getRemotePluginEndpointWithHttpInfo(id, endpointId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginEndpoint");
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
| **id** | **String**| The ID of the required plugin. | |
| **endpointId** | **String**| The ID of the required endpoint. | |

### Return type

ApiResponse<[**RemotePluginEndpoint**](RemotePluginEndpoint.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRemotePluginEndpoints

> StubList getRemotePluginEndpoints(id)

Lists endpoints of the specified ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            StubList result = apiInstance.getRemotePluginEndpoints(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginEndpoints");
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
| **id** | **String**| The ID of the required plugin. | |

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

## getRemotePluginEndpointsWithHttpInfo

> ApiResponse<StubList> getRemotePluginEndpoints getRemotePluginEndpointsWithHttpInfo(id)

Lists endpoints of the specified ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        try {
            ApiResponse<StubList> response = apiInstance.getRemotePluginEndpointsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginEndpoints");
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
| **id** | **String**| The ID of the required plugin. | |

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


## getRemotePluginModules

> StubList getRemotePluginModules()

List available ActiveGate plugin modules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        try {
            StubList result = apiInstance.getRemotePluginModules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginModules");
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
| **200** | Success. The response contains IDs of ActiveGate plugin modules. Use them to configure plugin endpoints. |  -  |

## getRemotePluginModulesWithHttpInfo

> ApiResponse<StubList> getRemotePluginModules getRemotePluginModulesWithHttpInfo()

List available ActiveGate plugin modules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getRemotePluginModulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#getRemotePluginModules");
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
| **200** | Success. The response contains IDs of ActiveGate plugin modules. Use them to configure plugin endpoints. |  -  |


## updateRemotePluginEndpoint

> void updateRemotePluginEndpoint(id, endpointId, remotePluginEndpoint)

Updates an existing endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to update an endpoint.   If you set the plugin ID in the body as well, it must match this ID.
        String endpointId = "endpointId_example"; // String | The ID of the endpoint to be updated.   If you set the endpoint ID in the body as well, it must match this ID.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains updated parameters of the plugin endpoint.
        try {
            apiInstance.updateRemotePluginEndpoint(id, endpointId, remotePluginEndpoint);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#updateRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to update an endpoint.   If you set the plugin ID in the body as well, it must match this ID. | |
| **endpointId** | **String**| The ID of the endpoint to be updated.   If you set the endpoint ID in the body as well, it must match this ID. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains updated parameters of the plugin endpoint. | [optional] |

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
| **204** | Success. The endpoint has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateRemotePluginEndpointWithHttpInfo

> ApiResponse<Void> updateRemotePluginEndpoint updateRemotePluginEndpointWithHttpInfo(id, endpointId, remotePluginEndpoint)

Updates an existing endpoint of the ActiveGate plugin

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the plugin where you want to update an endpoint.   If you set the plugin ID in the body as well, it must match this ID.
        String endpointId = "endpointId_example"; // String | The ID of the endpoint to be updated.   If you set the endpoint ID in the body as well, it must match this ID.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains updated parameters of the plugin endpoint.
        try {
            ApiResponse<Void> response = apiInstance.updateRemotePluginEndpointWithHttpInfo(id, endpointId, remotePluginEndpoint);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#updateRemotePluginEndpoint");
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
| **id** | **String**| The ID of the plugin where you want to update an endpoint.   If you set the plugin ID in the body as well, it must match this ID. | |
| **endpointId** | **String**| The ID of the endpoint to be updated.   If you set the endpoint ID in the body as well, it must match this ID. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains updated parameters of the plugin endpoint. | [optional] |

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
| **204** | Success. The endpoint has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## uploadPlugin

> EntityShortRepresentation uploadPlugin(_file, overrideAlerts)

Uploads a ZIP plugin file

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | Plugin ZIP file to be uploaded.    File name must match the **name** field in the `plugin.json` file.   For example, for the plugin whose **name** is `custom.remote.python.demo`, the name of the plugin file must be `custom.remote.python.demo.zip`.
        Boolean overrideAlerts = false; // Boolean | Use plugin-defined thresholds for alerts (`true`) or user-defined thresholds (`false`).    Plugin-defined thresholds are stored in the `plugin.json` file.   If not set, user-defined thresholds are used.
        try {
            EntityShortRepresentation result = apiInstance.uploadPlugin(_file, overrideAlerts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#uploadPlugin");
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
| **_file** | **File**| Plugin ZIP file to be uploaded.    File name must match the **name** field in the &#x60;plugin.json&#x60; file.   For example, for the plugin whose **name** is &#x60;custom.remote.python.demo&#x60;, the name of the plugin file must be &#x60;custom.remote.python.demo.zip&#x60;. | |
| **overrideAlerts** | **Boolean**| Use plugin-defined thresholds for alerts (&#x60;true&#x60;) or user-defined thresholds (&#x60;false&#x60;).    Plugin-defined thresholds are stored in the &#x60;plugin.json&#x60; file.   If not set, user-defined thresholds are used. | [optional] [default to false] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. Plugin has been uploaded. Response contains the ID of the plugin. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## uploadPluginWithHttpInfo

> ApiResponse<EntityShortRepresentation> uploadPlugin uploadPluginWithHttpInfo(_file, overrideAlerts)

Uploads a ZIP plugin file

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | Plugin ZIP file to be uploaded.    File name must match the **name** field in the `plugin.json` file.   For example, for the plugin whose **name** is `custom.remote.python.demo`, the name of the plugin file must be `custom.remote.python.demo.zip`.
        Boolean overrideAlerts = false; // Boolean | Use plugin-defined thresholds for alerts (`true`) or user-defined thresholds (`false`).    Plugin-defined thresholds are stored in the `plugin.json` file.   If not set, user-defined thresholds are used.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.uploadPluginWithHttpInfo(_file, overrideAlerts);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#uploadPlugin");
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
| **_file** | **File**| Plugin ZIP file to be uploaded.    File name must match the **name** field in the &#x60;plugin.json&#x60; file.   For example, for the plugin whose **name** is &#x60;custom.remote.python.demo&#x60;, the name of the plugin file must be &#x60;custom.remote.python.demo.zip&#x60;. | |
| **overrideAlerts** | **Boolean**| Use plugin-defined thresholds for alerts (&#x60;true&#x60;) or user-defined thresholds (&#x60;false&#x60;).    Plugin-defined thresholds are stored in the &#x60;plugin.json&#x60; file.   If not set, user-defined thresholds are used. | [optional] [default to false] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. Plugin has been uploaded. Response contains the ID of the plugin. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validatePlugin

> void validatePlugin(_file, jsonOnly)

Validates a ZIP plugin file for &#x60;POST/plugins&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | The ZIP plugin file to be uploaded.    The file name must match the ID of the plugin. Example: `custom.remote.python.demo.zip`
        Boolean jsonOnly = false; // Boolean | Validate only the `plugin.json` file (`true`) or the entire plugin structure (`false`).    If not set, the entire plugin is validated. 
        try {
            apiInstance.validatePlugin(_file, jsonOnly);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#validatePlugin");
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
| **_file** | **File**| The ZIP plugin file to be uploaded.    The file name must match the ID of the plugin. Example: &#x60;custom.remote.python.demo.zip&#x60; | |
| **jsonOnly** | **Boolean**| Validate only the &#x60;plugin.json&#x60; file (&#x60;true&#x60;) or the entire plugin structure (&#x60;false&#x60;).    If not set, the entire plugin is validated.  | [optional] [default to false] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted plugin is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validatePluginWithHttpInfo

> ApiResponse<Void> validatePlugin validatePluginWithHttpInfo(_file, jsonOnly)

Validates a ZIP plugin file for &#x60;POST/plugins&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | The ZIP plugin file to be uploaded.    The file name must match the ID of the plugin. Example: `custom.remote.python.demo.zip`
        Boolean jsonOnly = false; // Boolean | Validate only the `plugin.json` file (`true`) or the entire plugin structure (`false`).    If not set, the entire plugin is validated. 
        try {
            ApiResponse<Void> response = apiInstance.validatePluginWithHttpInfo(_file, jsonOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#validatePlugin");
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
| **_file** | **File**| The ZIP plugin file to be uploaded.    The file name must match the ID of the plugin. Example: &#x60;custom.remote.python.demo.zip&#x60; | |
| **jsonOnly** | **Boolean**| Validate only the &#x60;plugin.json&#x60; file (&#x60;true&#x60;) or the entire plugin structure (&#x60;false&#x60;).    If not set, the entire plugin is validated.  | [optional] [default to false] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted plugin is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateRemotePluginEndpoint

> void validateRemotePluginEndpoint(id, remotePluginEndpoint)

Validates the payload for the &#x60;POST /plugins/{id}/endpoints&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains parameters of the new plugin endpoint.
        try {
            apiInstance.validateRemotePluginEndpoint(id, remotePluginEndpoint);
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#validateRemotePluginEndpoint");
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
| **id** | **String**| The ID of the required plugin. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains parameters of the new plugin endpoint. | [optional] |

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

## validateRemotePluginEndpointWithHttpInfo

> ApiResponse<Void> validateRemotePluginEndpoint validateRemotePluginEndpointWithHttpInfo(id, remotePluginEndpoint)

Validates the payload for the &#x60;POST /plugins/{id}/endpoints&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.PluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        PluginsApi apiInstance = new PluginsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required plugin.
        RemotePluginEndpoint remotePluginEndpoint = new RemotePluginEndpoint(); // RemotePluginEndpoint | The JSON body of the request. Contains parameters of the new plugin endpoint.
        try {
            ApiResponse<Void> response = apiInstance.validateRemotePluginEndpointWithHttpInfo(id, remotePluginEndpoint);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling PluginsApi#validateRemotePluginEndpoint");
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
| **id** | **String**| The ID of the required plugin. | |
| **remotePluginEndpoint** | [**RemotePluginEndpoint**](RemotePluginEndpoint.md)| The JSON body of the request. Contains parameters of the new plugin endpoint. | [optional] |

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

