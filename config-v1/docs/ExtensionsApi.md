# ExtensionsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLocalExtensionConfiguration**](ExtensionsApi.md#createLocalExtensionConfiguration) | **POST** /extensions/{id}/instances | Creates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**createLocalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#createLocalExtensionConfigurationWithHttpInfo) | **POST** /extensions/{id}/instances | Creates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**deleteExtension**](ExtensionsApi.md#deleteExtension) | **DELETE** /extensions/{id} | Deletes the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**deleteExtensionWithHttpInfo**](ExtensionsApi.md#deleteExtensionWithHttpInfo) | **DELETE** /extensions/{id} | Deletes the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**deleteLocalExtensionConfiguration**](ExtensionsApi.md#deleteLocalExtensionConfiguration) | **DELETE** /extensions/{id}/instances/{configurationId} | Deletes an existing configuration of the extension | maturity&#x3D;EARLY_ADOPTER |
| [**deleteLocalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#deleteLocalExtensionConfigurationWithHttpInfo) | **DELETE** /extensions/{id}/instances/{configurationId} | Deletes an existing configuration of the extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtension**](ExtensionsApi.md#getExtension) | **GET** /extensions/{id} | Lists the properties of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionWithHttpInfo**](ExtensionsApi.md#getExtensionWithHttpInfo) | **GET** /extensions/{id} | Lists the properties of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionBinary**](ExtensionsApi.md#getExtensionBinary) | **GET** /extensions/{id}/binary | Downloads the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionBinaryWithHttpInfo**](ExtensionsApi.md#getExtensionBinaryWithHttpInfo) | **GET** /extensions/{id}/binary | Downloads the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionConfigurations**](ExtensionsApi.md#getExtensionConfigurations) | **GET** /extensions/{id}/instances | Returns list of all local configuration instances for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionConfigurationsWithHttpInfo**](ExtensionsApi.md#getExtensionConfigurationsWithHttpInfo) | **GET** /extensions/{id}/instances | Returns list of all local configuration instances for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionGlobalConfiguration**](ExtensionsApi.md#getExtensionGlobalConfiguration) | **GET** /extensions/{id}/global | Get the global configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionGlobalConfigurationWithHttpInfo**](ExtensionsApi.md#getExtensionGlobalConfigurationWithHttpInfo) | **GET** /extensions/{id}/global | Get the global configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionStates**](ExtensionsApi.md#getExtensionStates) | **GET** /extensions/{id}/states | Lists the states of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionStatesWithHttpInfo**](ExtensionsApi.md#getExtensionStatesWithHttpInfo) | **GET** /extensions/{id}/states | Lists the states of the specified extension | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensions**](ExtensionsApi.md#getExtensions) | **GET** /extensions | Lists all uploaded extensions | maturity&#x3D;EARLY_ADOPTER |
| [**getExtensionsWithHttpInfo**](ExtensionsApi.md#getExtensionsWithHttpInfo) | **GET** /extensions | Lists all uploaded extensions | maturity&#x3D;EARLY_ADOPTER |
| [**getHostsForTechnology**](ExtensionsApi.md#getHostsForTechnology) | **GET** /extensions/{technology}/availableHosts | Lists all available hosts that have specified technology running | maturity&#x3D;EARLY_ADOPTER |
| [**getHostsForTechnologyWithHttpInfo**](ExtensionsApi.md#getHostsForTechnologyWithHttpInfo) | **GET** /extensions/{technology}/availableHosts | Lists all available hosts that have specified technology running | maturity&#x3D;EARLY_ADOPTER |
| [**getLocalExtensionConfiguration**](ExtensionsApi.md#getLocalExtensionConfiguration) | **GET** /extensions/{id}/instances/{configurationId} | Returns instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**getLocalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#getLocalExtensionConfigurationWithHttpInfo) | **GET** /extensions/{id}/instances/{configurationId} | Returns instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**getRemoteExtensionModules**](ExtensionsApi.md#getRemoteExtensionModules) | **GET** /extensions/activeGateExtensionModules | List available ActiveGate extension modules | maturity&#x3D;EARLY_ADOPTER |
| [**getRemoteExtensionModulesWithHttpInfo**](ExtensionsApi.md#getRemoteExtensionModulesWithHttpInfo) | **GET** /extensions/activeGateExtensionModules | List available ActiveGate extension modules | maturity&#x3D;EARLY_ADOPTER |
| [**updateGlobalExtensionConfiguration**](ExtensionsApi.md#updateGlobalExtensionConfiguration) | **PUT** /extensions/{id}/global | Updates the configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER |
| [**updateGlobalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#updateGlobalExtensionConfigurationWithHttpInfo) | **PUT** /extensions/{id}/global | Updates the configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER |
| [**updateLocalExtensionConfiguration**](ExtensionsApi.md#updateLocalExtensionConfiguration) | **PUT** /extensions/{id}/instances/{configurationId} | Updates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**updateLocalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#updateLocalExtensionConfigurationWithHttpInfo) | **PUT** /extensions/{id}/instances/{configurationId} | Updates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER |
| [**uploadExtension**](ExtensionsApi.md#uploadExtension) | **POST** /extensions | Uploads a ZIP extension file | maturity&#x3D;EARLY_ADOPTER |
| [**uploadExtensionWithHttpInfo**](ExtensionsApi.md#uploadExtensionWithHttpInfo) | **POST** /extensions | Uploads a ZIP extension file | maturity&#x3D;EARLY_ADOPTER |
| [**validateExtension**](ExtensionsApi.md#validateExtension) | **POST** /extensions/validator | Validates a ZIP extension file for &#x60;POST/extensions&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateExtensionWithHttpInfo**](ExtensionsApi.md#validateExtensionWithHttpInfo) | **POST** /extensions/validator | Validates a ZIP extension file for &#x60;POST/extensions&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateLocalExtensionConfiguration**](ExtensionsApi.md#validateLocalExtensionConfiguration) | **POST** /extensions/{id}/instances/validator | Validates the payload for the &#x60;POST /extensions/{id}/instances&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateLocalExtensionConfigurationWithHttpInfo**](ExtensionsApi.md#validateLocalExtensionConfigurationWithHttpInfo) | **POST** /extensions/{id}/instances/validator | Validates the payload for the &#x60;POST /extensions/{id}/instances&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createLocalExtensionConfiguration

> EntityShortRepresentation createLocalExtensionConfiguration(id, extensionConfigurationDto)

Creates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains new configuration of the extension.
        try {
            EntityShortRepresentation result = apiInstance.createLocalExtensionConfiguration(id, extensionConfigurationDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#createLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains new configuration of the extension. | [optional] |

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
| **201** | Success. The extension configuration has been created. Response contains the ID of the new configuration. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createLocalExtensionConfigurationWithHttpInfo

> ApiResponse<EntityShortRepresentation> createLocalExtensionConfiguration createLocalExtensionConfigurationWithHttpInfo(id, extensionConfigurationDto)

Creates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains new configuration of the extension.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createLocalExtensionConfigurationWithHttpInfo(id, extensionConfigurationDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#createLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains new configuration of the extension. | [optional] |

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
| **201** | Success. The extension configuration has been created. Response contains the ID of the new configuration. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteExtension

> void deleteExtension(id)

Deletes the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER

Deletion of the extension file uninstalls the extension, making it unavailable for use.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be deleted.
        try {
            apiInstance.deleteExtension(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#deleteExtension");
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
| **id** | **String**| The ID of the extension to be deleted. | |

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

## deleteExtensionWithHttpInfo

> ApiResponse<Void> deleteExtension deleteExtensionWithHttpInfo(id)

Deletes the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER

Deletion of the extension file uninstalls the extension, making it unavailable for use.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteExtensionWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#deleteExtension");
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
| **id** | **String**| The ID of the extension to be deleted. | |

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


## deleteLocalExtensionConfiguration

> void deleteLocalExtensionConfiguration(id, configurationId)

Deletes an existing configuration of the extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension where you want to delete the configuration.
        String configurationId = "configurationId_example"; // String | The ID of the configuration to be deleted.
        try {
            apiInstance.deleteLocalExtensionConfiguration(id, configurationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#deleteLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension where you want to delete the configuration. | |
| **configurationId** | **String**| The ID of the configuration to be deleted. | |

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

## deleteLocalExtensionConfigurationWithHttpInfo

> ApiResponse<Void> deleteLocalExtensionConfiguration deleteLocalExtensionConfigurationWithHttpInfo(id, configurationId)

Deletes an existing configuration of the extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension where you want to delete the configuration.
        String configurationId = "configurationId_example"; // String | The ID of the configuration to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteLocalExtensionConfigurationWithHttpInfo(id, configurationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#deleteLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension where you want to delete the configuration. | |
| **configurationId** | **String**| The ID of the configuration to be deleted. | |

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


## getExtension

> Extension getExtension(id)

Lists the properties of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        try {
            Extension result = apiInstance.getExtension(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtension");
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
| **id** | **String**| The ID of the required extension. | |

### Return type

[**Extension**](Extension.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getExtensionWithHttpInfo

> ApiResponse<Extension> getExtension getExtensionWithHttpInfo(id)

Lists the properties of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        try {
            ApiResponse<Extension> response = apiInstance.getExtensionWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtension");
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
| **id** | **String**| The ID of the required extension. | |

### Return type

ApiResponse<[**Extension**](Extension.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getExtensionBinary

> void getExtensionBinary(id)

Downloads the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension you want to download.
        try {
            apiInstance.getExtensionBinary(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionBinary");
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
| **id** | **String**| The ID of the extension you want to download. | |

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
| **200** | ZIP file of the extension |  -  |

## getExtensionBinaryWithHttpInfo

> ApiResponse<Void> getExtensionBinary getExtensionBinaryWithHttpInfo(id)

Downloads the ZIP file of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension you want to download.
        try {
            ApiResponse<Void> response = apiInstance.getExtensionBinaryWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionBinary");
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
| **id** | **String**| The ID of the extension you want to download. | |

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
| **200** | ZIP file of the extension |  -  |


## getExtensionConfigurations

> ExtensionConfigurationList getExtensionConfigurations(id, pageSize, nextPageKey)

Returns list of all local configuration instances for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            ExtensionConfigurationList result = apiInstance.getExtensionConfigurations(id, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionConfigurations");
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
| **id** | **String**| The ID of the required extension. | |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

[**ExtensionConfigurationList**](ExtensionConfigurationList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getExtensionConfigurationsWithHttpInfo

> ApiResponse<ExtensionConfigurationList> getExtensionConfigurations getExtensionConfigurationsWithHttpInfo(id, pageSize, nextPageKey)

Returns list of all local configuration instances for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            ApiResponse<ExtensionConfigurationList> response = apiInstance.getExtensionConfigurationsWithHttpInfo(id, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionConfigurations");
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
| **id** | **String**| The ID of the required extension. | |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

ApiResponse<[**ExtensionConfigurationList**](ExtensionConfigurationList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getExtensionGlobalConfiguration

> GlobalExtensionConfiguration getExtensionGlobalConfiguration(id)

Get the global configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be updated.
        try {
            GlobalExtensionConfiguration result = apiInstance.getExtensionGlobalConfiguration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionGlobalConfiguration");
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
| **id** | **String**| The ID of the extension to be updated. | |

### Return type

[**GlobalExtensionConfiguration**](GlobalExtensionConfiguration.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Global configuration of given extension. |  -  |

## getExtensionGlobalConfigurationWithHttpInfo

> ApiResponse<GlobalExtensionConfiguration> getExtensionGlobalConfiguration getExtensionGlobalConfigurationWithHttpInfo(id)

Get the global configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be updated.
        try {
            ApiResponse<GlobalExtensionConfiguration> response = apiInstance.getExtensionGlobalConfigurationWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionGlobalConfiguration");
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
| **id** | **String**| The ID of the extension to be updated. | |

### Return type

ApiResponse<[**GlobalExtensionConfiguration**](GlobalExtensionConfiguration.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Global configuration of given extension. |  -  |


## getExtensionStates

> ExtensionStateList getExtensionStates(id, pageSize, nextPageKey, state)

Lists the states of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        String state = "DISABLED"; // String | Extension state to filter.
        try {
            ExtensionStateList result = apiInstance.getExtensionStates(id, pageSize, nextPageKey, state);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionStates");
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
| **id** | **String**| The ID of the required extension. | |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |
| **state** | **String**| Extension state to filter. | [optional] [enum: DISABLED, ERROR_AUTH, ERROR_COMMUNICATION_FAILURE, ERROR_CONFIG, ERROR_TIMEOUT, ERROR_UNKNOWN, INCOMPATIBLE, LIMIT_REACHED, NOTHING_TO_REPORT, OK, STATE_TYPE_UNKNOWN, UNINITIALIZED, UNSUPPORTED, WAITING_FOR_STATE] |

### Return type

[**ExtensionStateList**](ExtensionStateList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getExtensionStatesWithHttpInfo

> ApiResponse<ExtensionStateList> getExtensionStates getExtensionStatesWithHttpInfo(id, pageSize, nextPageKey, state)

Lists the states of the specified extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required extension.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        String state = "DISABLED"; // String | Extension state to filter.
        try {
            ApiResponse<ExtensionStateList> response = apiInstance.getExtensionStatesWithHttpInfo(id, pageSize, nextPageKey, state);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensionStates");
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
| **id** | **String**| The ID of the required extension. | |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |
| **state** | **String**| Extension state to filter. | [optional] [enum: DISABLED, ERROR_AUTH, ERROR_COMMUNICATION_FAILURE, ERROR_CONFIG, ERROR_TIMEOUT, ERROR_UNKNOWN, INCOMPATIBLE, LIMIT_REACHED, NOTHING_TO_REPORT, OK, STATE_TYPE_UNKNOWN, UNINITIALIZED, UNSUPPORTED, WAITING_FOR_STATE] |

### Return type

ApiResponse<[**ExtensionStateList**](ExtensionStateList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getExtensions

> ExtensionListDto getExtensions(pageSize, nextPageKey)

Lists all uploaded extensions | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            ExtensionListDto result = apiInstance.getExtensions(pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensions");
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
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

[**ExtensionListDto**](ExtensionListDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getExtensionsWithHttpInfo

> ApiResponse<ExtensionListDto> getExtensions getExtensionsWithHttpInfo(pageSize, nextPageKey)

Lists all uploaded extensions | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            ApiResponse<ExtensionListDto> response = apiInstance.getExtensionsWithHttpInfo(pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getExtensions");
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
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

ApiResponse<[**ExtensionListDto**](ExtensionListDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getHostsForTechnology

> HostList getHostsForTechnology(technology, tag, managementZone, hostGroupId, hostGroupName, pageSize, nextPageKey)

Lists all available hosts that have specified technology running | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String technology = "ACTIVE_MQ"; // String | Name of requested technology
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of hosts by the specified tag.    You can specify several tags in the following format: `tag=tag1&tag=tag2`. The host has to match **all** the specified tags.
        Long managementZone = 56L; // Long | Only return hosts that are part of the specified management zone.
        String hostGroupId = "hostGroupId_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you're interested in.
        String hostGroupName = "hostGroupName_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you're interested in.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            HostList result = apiInstance.getHostsForTechnology(technology, tag, managementZone, hostGroupId, hostGroupName, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getHostsForTechnology");
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
| **technology** | **String**| Name of requested technology | [enum: ACTIVE_MQ, ACTIVE_MQ_ARTEMIS, ADO_NET, AIX, AKKA, AMAZON_REDSHIFT, AMQP, APACHE_CAMEL, APACHE_CASSANDRA, APACHE_COUCH_DB, APACHE_DERBY, APACHE_HTTP_CLIENT_ASYNC, APACHE_HTTP_CLIENT_SYNC, APACHE_HTTP_SERVER, APACHE_KAFKA, APACHE_LOG4J, APACHE_SOLR, APACHE_STORM, APACHE_SYNAPSE, APACHE_TOMCAT, APPARMOR, APPLICATION_INSIGHTS_SDK, ASP_DOTNET, ASP_DOTNET_CORE, ASP_DOTNET_CORE_SIGNALR, ASP_DOTNET_SIGNALR, ASYNC_HTTP_CLIENT, AWS_DYNAMO_DB, AWS_LAMBDA, AWS_RDS, AWS_SERVICE, AXIS, AZURE_FUNCTIONS, AZURE_SERVICE_BUS, AZURE_SERVICE_FABRIC, AZURE_STORAGE, BOSHBPM, CICS_FILE_ACCESS, CITRIX, CITRIX_COMMON, CITRIX_DESKTOP_DELIVERY_CONTROLLERS, CITRIX_DIRECTOR, CITRIX_LICENSE_SERVER, CITRIX_PROVISIONING_SERVICES, CITRIX_STOREFRONT, CITRIX_VIRTUAL_DELIVERY_AGENT, CITRIX_WORKSPACE_ENVIRONMENT_MANAGEMENT, CITRIX_XEN, CLOUDFOUNDRY, CLOUDFOUNDRY_AUCTIONEER, CLOUDFOUNDRY_BOSH, CLOUDFOUNDRY_GOROUTER, COLDFUSION, CONFLUENT_KAFKA_CLIENT, CONTAINERD, CORE_DNS, COUCHBASE, CRIO, CXF, DATASTAX, DB2, DIEGO_CELL, DOCKER, DOTNET, DOTNET_REMOTING, ELASTIC_SEARCH, ENVOY, ERLANG, ETCD, F5_LTM, FSHARP, GARDEN, GLASSFISH, GO, GOOGLE_CLOUD_FUNCTIONS, GRAAL_TRUFFLE, GRAPH_QL, GRPC, GRSECURITY, HADOOP, HADOOP_HDFS, HADOOP_YARN, HAPROXY, HEAT, HESSIAN, HORNET_Q, IBM_CICS_REGION, IBM_CICS_TRANSACTION_GATEWAY, IBM_IMS_CONNECT_REGION, IBM_IMS_CONTROL_REGION, IBM_IMS_MESSAGE_PROCESSING_REGION, IBM_IMS_SOAP_GATEWAY, IBM_INTEGRATION_BUS, IBM_MQ, IBM_MQ_CLIENT, IBM_WEBSHPRERE_APPLICATION_SERVER, IBM_WEBSHPRERE_LIBERTY, IBM_WEBSPHERE_APPLICATION_SERVER, IBM_WEBSPHERE_LIBERTY, IIS, IIS_APP_POOL, ISTIO, JAVA, JAX_WS, JBOSS, JBOSS_EAP, JDK_HTTP_SERVER, JERSEY, JETTY, JRUBY, JYTHON, KUBERNETES, LIBC, LIBVIRT, LINKERD, LINUX_SYSTEM, MARIADB, MEMCACHED, MICROSOFT_SQL_SERVER, MONGODB, MSSQL_CLIENT, MULE_ESB, MYSQL, MYSQL_CONNECTOR, NETFLIX_SERVO, NETTY, NGINX, NODE_JS, OK_HTTP_CLIENT, ONEAGENT_SDK, OPENCENSUS, OPENSHIFT, OPENSTACK_COMPUTE, OPENSTACK_CONTROLLER, OPENTELEMETRY, OPENTRACING, OPEN_LIBERTY, ORACLE_DATABASE, ORACLE_WEBLOGIC, OWIN, PERL, PHP, PHP_FPM, PLAY, POSTGRE_SQL, POSTGRE_SQL_DOTNET_DATA_PROVIDER, POWER_DNS, PROGRESS, PYTHON, QOS_LOGBACK, RABBIT_MQ, REACTOR_CORE, REDIS, RESTEASY, RESTLET, RIAK, RSOCKET, RUBY, RUNC, RXJAVA, SAG_WEBMETHODS_IS, SAP, SAP_HANADB, SAP_HYBRIS, SAP_MAXDB, SAP_SYBASE, SCALA, SELINUX, SHAREPOINT, SPARK, SPRING, SQLITE, THRIFT, TIBCO, TIBCO_BUSINESS_WORKS, TIBCO_EMS, UNDERTOW_IO, VARNISH_CACHE, VERTX, VIM2, VIOS, VIRTUAL_MACHINE_KVM, VIRTUAL_MACHINE_QEMU, WILDFLY, WINDOWS_CONTAINERS, WINDOWS_SYSTEM, WINK, ZERO_MQ, ZOS_CONNECT] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of hosts by the specified tag.    You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags. | [optional] |
| **managementZone** | **Long**| Only return hosts that are part of the specified management zone. | [optional] |
| **hostGroupId** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you&#39;re interested in. | [optional] |
| **hostGroupName** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you&#39;re interested in. | [optional] |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

[**HostList**](HostList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostsForTechnologyWithHttpInfo

> ApiResponse<HostList> getHostsForTechnology getHostsForTechnologyWithHttpInfo(technology, tag, managementZone, hostGroupId, hostGroupName, pageSize, nextPageKey)

Lists all available hosts that have specified technology running | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String technology = "ACTIVE_MQ"; // String | Name of requested technology
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of hosts by the specified tag.    You can specify several tags in the following format: `tag=tag1&tag=tag2`. The host has to match **all** the specified tags.
        Long managementZone = 56L; // Long | Only return hosts that are part of the specified management zone.
        String hostGroupId = "hostGroupId_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you're interested in.
        String hostGroupName = "hostGroupName_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you're interested in.
        Integer pageSize = 200; // Integer | The number of results per result page. Must be between 1 and 500
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results.
        try {
            ApiResponse<HostList> response = apiInstance.getHostsForTechnologyWithHttpInfo(technology, tag, managementZone, hostGroupId, hostGroupName, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getHostsForTechnology");
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
| **technology** | **String**| Name of requested technology | [enum: ACTIVE_MQ, ACTIVE_MQ_ARTEMIS, ADO_NET, AIX, AKKA, AMAZON_REDSHIFT, AMQP, APACHE_CAMEL, APACHE_CASSANDRA, APACHE_COUCH_DB, APACHE_DERBY, APACHE_HTTP_CLIENT_ASYNC, APACHE_HTTP_CLIENT_SYNC, APACHE_HTTP_SERVER, APACHE_KAFKA, APACHE_LOG4J, APACHE_SOLR, APACHE_STORM, APACHE_SYNAPSE, APACHE_TOMCAT, APPARMOR, APPLICATION_INSIGHTS_SDK, ASP_DOTNET, ASP_DOTNET_CORE, ASP_DOTNET_CORE_SIGNALR, ASP_DOTNET_SIGNALR, ASYNC_HTTP_CLIENT, AWS_DYNAMO_DB, AWS_LAMBDA, AWS_RDS, AWS_SERVICE, AXIS, AZURE_FUNCTIONS, AZURE_SERVICE_BUS, AZURE_SERVICE_FABRIC, AZURE_STORAGE, BOSHBPM, CICS_FILE_ACCESS, CITRIX, CITRIX_COMMON, CITRIX_DESKTOP_DELIVERY_CONTROLLERS, CITRIX_DIRECTOR, CITRIX_LICENSE_SERVER, CITRIX_PROVISIONING_SERVICES, CITRIX_STOREFRONT, CITRIX_VIRTUAL_DELIVERY_AGENT, CITRIX_WORKSPACE_ENVIRONMENT_MANAGEMENT, CITRIX_XEN, CLOUDFOUNDRY, CLOUDFOUNDRY_AUCTIONEER, CLOUDFOUNDRY_BOSH, CLOUDFOUNDRY_GOROUTER, COLDFUSION, CONFLUENT_KAFKA_CLIENT, CONTAINERD, CORE_DNS, COUCHBASE, CRIO, CXF, DATASTAX, DB2, DIEGO_CELL, DOCKER, DOTNET, DOTNET_REMOTING, ELASTIC_SEARCH, ENVOY, ERLANG, ETCD, F5_LTM, FSHARP, GARDEN, GLASSFISH, GO, GOOGLE_CLOUD_FUNCTIONS, GRAAL_TRUFFLE, GRAPH_QL, GRPC, GRSECURITY, HADOOP, HADOOP_HDFS, HADOOP_YARN, HAPROXY, HEAT, HESSIAN, HORNET_Q, IBM_CICS_REGION, IBM_CICS_TRANSACTION_GATEWAY, IBM_IMS_CONNECT_REGION, IBM_IMS_CONTROL_REGION, IBM_IMS_MESSAGE_PROCESSING_REGION, IBM_IMS_SOAP_GATEWAY, IBM_INTEGRATION_BUS, IBM_MQ, IBM_MQ_CLIENT, IBM_WEBSHPRERE_APPLICATION_SERVER, IBM_WEBSHPRERE_LIBERTY, IBM_WEBSPHERE_APPLICATION_SERVER, IBM_WEBSPHERE_LIBERTY, IIS, IIS_APP_POOL, ISTIO, JAVA, JAX_WS, JBOSS, JBOSS_EAP, JDK_HTTP_SERVER, JERSEY, JETTY, JRUBY, JYTHON, KUBERNETES, LIBC, LIBVIRT, LINKERD, LINUX_SYSTEM, MARIADB, MEMCACHED, MICROSOFT_SQL_SERVER, MONGODB, MSSQL_CLIENT, MULE_ESB, MYSQL, MYSQL_CONNECTOR, NETFLIX_SERVO, NETTY, NGINX, NODE_JS, OK_HTTP_CLIENT, ONEAGENT_SDK, OPENCENSUS, OPENSHIFT, OPENSTACK_COMPUTE, OPENSTACK_CONTROLLER, OPENTELEMETRY, OPENTRACING, OPEN_LIBERTY, ORACLE_DATABASE, ORACLE_WEBLOGIC, OWIN, PERL, PHP, PHP_FPM, PLAY, POSTGRE_SQL, POSTGRE_SQL_DOTNET_DATA_PROVIDER, POWER_DNS, PROGRESS, PYTHON, QOS_LOGBACK, RABBIT_MQ, REACTOR_CORE, REDIS, RESTEASY, RESTLET, RIAK, RSOCKET, RUBY, RUNC, RXJAVA, SAG_WEBMETHODS_IS, SAP, SAP_HANADB, SAP_HYBRIS, SAP_MAXDB, SAP_SYBASE, SCALA, SELINUX, SHAREPOINT, SPARK, SPRING, SQLITE, THRIFT, TIBCO, TIBCO_BUSINESS_WORKS, TIBCO_EMS, UNDERTOW_IO, VARNISH_CACHE, VERTX, VIM2, VIOS, VIRTUAL_MACHINE_KVM, VIRTUAL_MACHINE_QEMU, WILDFLY, WINDOWS_CONTAINERS, WINDOWS_SYSTEM, WINK, ZERO_MQ, ZOS_CONNECT] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of hosts by the specified tag.    You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags. | [optional] |
| **managementZone** | **Long**| Only return hosts that are part of the specified management zone. | [optional] |
| **hostGroupId** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you&#39;re interested in. | [optional] |
| **hostGroupName** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you&#39;re interested in. | [optional] |
| **pageSize** | **Integer**| The number of results per result page. Must be between 1 and 500 | [optional] [default to 200] |
| **nextPageKey** | **String**| The cursor for the next page of results. | [optional] |

### Return type

ApiResponse<[**HostList**](HostList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLocalExtensionConfiguration

> ExtensionConfigurationDto getLocalExtensionConfiguration(id, configurationId)

Returns instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension.
        String configurationId = "configurationId_example"; // String | The ID of the configuration.
        try {
            ExtensionConfigurationDto result = apiInstance.getLocalExtensionConfiguration(id, configurationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension. | |
| **configurationId** | **String**| The ID of the configuration. | |

### Return type

[**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getLocalExtensionConfigurationWithHttpInfo

> ApiResponse<ExtensionConfigurationDto> getLocalExtensionConfiguration getLocalExtensionConfigurationWithHttpInfo(id, configurationId)

Returns instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension.
        String configurationId = "configurationId_example"; // String | The ID of the configuration.
        try {
            ApiResponse<ExtensionConfigurationDto> response = apiInstance.getLocalExtensionConfigurationWithHttpInfo(id, configurationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension. | |
| **configurationId** | **String**| The ID of the configuration. | |

### Return type

ApiResponse<[**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRemoteExtensionModules

> StubList getRemoteExtensionModules()

List available ActiveGate extension modules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        try {
            StubList result = apiInstance.getRemoteExtensionModules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getRemoteExtensionModules");
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
| **200** | Success. The response contains IDs of ActiveGate extension modules. Use them to configure ActiveGate extension endpoints. |  -  |

## getRemoteExtensionModulesWithHttpInfo

> ApiResponse<StubList> getRemoteExtensionModules getRemoteExtensionModulesWithHttpInfo()

List available ActiveGate extension modules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getRemoteExtensionModulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#getRemoteExtensionModules");
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
| **200** | Success. The response contains IDs of ActiveGate extension modules. Use them to configure ActiveGate extension endpoints. |  -  |


## updateGlobalExtensionConfiguration

> void updateGlobalExtensionConfiguration(id, globalExtensionConfiguration)

Updates the configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be updated.
        GlobalExtensionConfiguration globalExtensionConfiguration = new GlobalExtensionConfiguration(); // GlobalExtensionConfiguration | The JSON body of the request. Contains updated configuration of the extension.
        try {
            apiInstance.updateGlobalExtensionConfiguration(id, globalExtensionConfiguration);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#updateGlobalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension to be updated. | |
| **globalExtensionConfiguration** | [**GlobalExtensionConfiguration**](GlobalExtensionConfiguration.md)| The JSON body of the request. Contains updated configuration of the extension. | [optional] |

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
| **204** | Success. Extension configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateGlobalExtensionConfigurationWithHttpInfo

> ApiResponse<Void> updateGlobalExtensionConfiguration updateGlobalExtensionConfigurationWithHttpInfo(id, globalExtensionConfiguration)

Updates the configuration of the specified OneAgent or JMX extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension to be updated.
        GlobalExtensionConfiguration globalExtensionConfiguration = new GlobalExtensionConfiguration(); // GlobalExtensionConfiguration | The JSON body of the request. Contains updated configuration of the extension.
        try {
            ApiResponse<Void> response = apiInstance.updateGlobalExtensionConfigurationWithHttpInfo(id, globalExtensionConfiguration);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#updateGlobalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension to be updated. | |
| **globalExtensionConfiguration** | [**GlobalExtensionConfiguration**](GlobalExtensionConfiguration.md)| The JSON body of the request. Contains updated configuration of the extension. | [optional] |

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
| **204** | Success. Extension configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## updateLocalExtensionConfiguration

> void updateLocalExtensionConfiguration(id, configurationId, extensionConfigurationDto)

Updates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension where you want to update the configuration.   If you set the extension ID in the body as well, it must match this ID.
        String configurationId = "configurationId_example"; // String | The ID of the configuration to be updated.
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains updated parameters of the extension configuration.
        try {
            apiInstance.updateLocalExtensionConfiguration(id, configurationId, extensionConfigurationDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#updateLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension where you want to update the configuration.   If you set the extension ID in the body as well, it must match this ID. | |
| **configurationId** | **String**| The ID of the configuration to be updated. | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains updated parameters of the extension configuration. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## updateLocalExtensionConfigurationWithHttpInfo

> ApiResponse<Void> updateLocalExtensionConfiguration updateLocalExtensionConfigurationWithHttpInfo(id, configurationId, extensionConfigurationDto)

Updates instance of local configuration for given extension | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension where you want to update the configuration.   If you set the extension ID in the body as well, it must match this ID.
        String configurationId = "configurationId_example"; // String | The ID of the configuration to be updated.
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains updated parameters of the extension configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateLocalExtensionConfigurationWithHttpInfo(id, configurationId, extensionConfigurationDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#updateLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension where you want to update the configuration.   If you set the extension ID in the body as well, it must match this ID. | |
| **configurationId** | **String**| The ID of the configuration to be updated. | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains updated parameters of the extension configuration. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |


## uploadExtension

> EntityShortRepresentation uploadExtension(_file, overrideAlerts)

Uploads a ZIP extension file | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | Extension ZIP file to be uploaded.    File name must match the **name** field in the `plugin.json` file.   For example, for the extension whose **name** is `custom.remote.python.demo`, the name of the extension file must be `custom.remote.python.demo.zip`.
        Boolean overrideAlerts = false; // Boolean | Use extension-defined thresholds for alerts (`true`) or user-defined thresholds (`false`).    Extension-defined thresholds are stored in the `plugin.json` file.   If not set, user-defined thresholds are used.
        try {
            EntityShortRepresentation result = apiInstance.uploadExtension(_file, overrideAlerts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#uploadExtension");
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
| **_file** | **File**| Extension ZIP file to be uploaded.    File name must match the **name** field in the &#x60;plugin.json&#x60; file.   For example, for the extension whose **name** is &#x60;custom.remote.python.demo&#x60;, the name of the extension file must be &#x60;custom.remote.python.demo.zip&#x60;. | |
| **overrideAlerts** | **Boolean**| Use extension-defined thresholds for alerts (&#x60;true&#x60;) or user-defined thresholds (&#x60;false&#x60;).    Extension-defined thresholds are stored in the &#x60;plugin.json&#x60; file.   If not set, user-defined thresholds are used. | [optional] [default to false] |

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
| **201** | Success. Extension has been uploaded. Response contains the ID of the extension. |  -  |
| **400** | Failed. The input is invalid |  -  |

## uploadExtensionWithHttpInfo

> ApiResponse<EntityShortRepresentation> uploadExtension uploadExtensionWithHttpInfo(_file, overrideAlerts)

Uploads a ZIP extension file | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | Extension ZIP file to be uploaded.    File name must match the **name** field in the `plugin.json` file.   For example, for the extension whose **name** is `custom.remote.python.demo`, the name of the extension file must be `custom.remote.python.demo.zip`.
        Boolean overrideAlerts = false; // Boolean | Use extension-defined thresholds for alerts (`true`) or user-defined thresholds (`false`).    Extension-defined thresholds are stored in the `plugin.json` file.   If not set, user-defined thresholds are used.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.uploadExtensionWithHttpInfo(_file, overrideAlerts);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#uploadExtension");
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
| **_file** | **File**| Extension ZIP file to be uploaded.    File name must match the **name** field in the &#x60;plugin.json&#x60; file.   For example, for the extension whose **name** is &#x60;custom.remote.python.demo&#x60;, the name of the extension file must be &#x60;custom.remote.python.demo.zip&#x60;. | |
| **overrideAlerts** | **Boolean**| Use extension-defined thresholds for alerts (&#x60;true&#x60;) or user-defined thresholds (&#x60;false&#x60;).    Extension-defined thresholds are stored in the &#x60;plugin.json&#x60; file.   If not set, user-defined thresholds are used. | [optional] [default to false] |

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
| **201** | Success. Extension has been uploaded. Response contains the ID of the extension. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateExtension

> void validateExtension(_file, jsonOnly)

Validates a ZIP extension file for &#x60;POST/extensions&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | The ZIP extension file to be uploaded.    The file name must match the ID of the extension. Example: `custom.remote.python.demo.zip`
        Boolean jsonOnly = false; // Boolean | Validate only the `plugin.json` file (`true`) or the entire extension structure (`false`).    If not set, the entire extension is validated. 
        try {
            apiInstance.validateExtension(_file, jsonOnly);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#validateExtension");
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
| **_file** | **File**| The ZIP extension file to be uploaded.    The file name must match the ID of the extension. Example: &#x60;custom.remote.python.demo.zip&#x60; | |
| **jsonOnly** | **Boolean**| Validate only the &#x60;plugin.json&#x60; file (&#x60;true&#x60;) or the entire extension structure (&#x60;false&#x60;).    If not set, the entire extension is validated.  | [optional] [default to false] |

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
| **204** | Validated. The submitted extension is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateExtensionWithHttpInfo

> ApiResponse<Void> validateExtension validateExtensionWithHttpInfo(_file, jsonOnly)

Validates a ZIP extension file for &#x60;POST/extensions&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | The ZIP extension file to be uploaded.    The file name must match the ID of the extension. Example: `custom.remote.python.demo.zip`
        Boolean jsonOnly = false; // Boolean | Validate only the `plugin.json` file (`true`) or the entire extension structure (`false`).    If not set, the entire extension is validated. 
        try {
            ApiResponse<Void> response = apiInstance.validateExtensionWithHttpInfo(_file, jsonOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#validateExtension");
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
| **_file** | **File**| The ZIP extension file to be uploaded.    The file name must match the ID of the extension. Example: &#x60;custom.remote.python.demo.zip&#x60; | |
| **jsonOnly** | **Boolean**| Validate only the &#x60;plugin.json&#x60; file (&#x60;true&#x60;) or the entire extension structure (&#x60;false&#x60;).    If not set, the entire extension is validated.  | [optional] [default to false] |

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
| **204** | Validated. The submitted extension is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateLocalExtensionConfiguration

> void validateLocalExtensionConfiguration(id, extensionConfigurationDto)

Validates the payload for the &#x60;POST /extensions/{id}/instances&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension.
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains new configuration of the extension to be validated.
        try {
            apiInstance.validateLocalExtensionConfiguration(id, extensionConfigurationDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#validateLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension. | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains new configuration of the extension to be validated. | [optional] |

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

## validateLocalExtensionConfigurationWithHttpInfo

> ApiResponse<Void> validateLocalExtensionConfiguration validateLocalExtensionConfigurationWithHttpInfo(id, extensionConfigurationDto)

Validates the payload for the &#x60;POST /extensions/{id}/instances&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ExtensionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ExtensionsApi apiInstance = new ExtensionsApi(defaultClient);
        String id = "id_example"; // String | The ID of the extension.
        ExtensionConfigurationDto extensionConfigurationDto = new ExtensionConfigurationDto(); // ExtensionConfigurationDto | The JSON body of the request. Contains new configuration of the extension to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateLocalExtensionConfigurationWithHttpInfo(id, extensionConfigurationDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExtensionsApi#validateLocalExtensionConfiguration");
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
| **id** | **String**| The ID of the extension. | |
| **extensionConfigurationDto** | [**ExtensionConfigurationDto**](ExtensionConfigurationDto.md)| The JSON body of the request. Contains new configuration of the extension to be validated. | [optional] |

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

