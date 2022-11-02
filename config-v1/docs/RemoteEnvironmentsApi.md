# RemoteEnvironmentsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#createRemoteEnvironmentConfig) | **POST** /remoteEnvironments | Creates a new remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**createRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#createRemoteEnvironmentConfigWithHttpInfo) | **POST** /remoteEnvironments | Creates a new remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**deleteRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#deleteRemoteEnvironmentConfig) | **DELETE** /remoteEnvironments/{id} | Deletes the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**deleteRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#deleteRemoteEnvironmentConfigWithHttpInfo) | **DELETE** /remoteEnvironments/{id} | Deletes the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**getRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#getRemoteEnvironmentConfig) | **GET** /remoteEnvironments/{id} | Gets the properties of the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**getRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#getRemoteEnvironmentConfigWithHttpInfo) | **GET** /remoteEnvironments/{id} | Gets the properties of the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER |
| [**listRemoteEnvironmentConfigs**](RemoteEnvironmentsApi.md#listRemoteEnvironmentConfigs) | **GET** /remoteEnvironments | Lists all remote environment configurations | maturity&#x3D;EARLY_ADOPTER |
| [**listRemoteEnvironmentConfigsWithHttpInfo**](RemoteEnvironmentsApi.md#listRemoteEnvironmentConfigsWithHttpInfo) | **GET** /remoteEnvironments | Lists all remote environment configurations | maturity&#x3D;EARLY_ADOPTER |
| [**updateRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#updateRemoteEnvironmentConfig) | **PUT** /remoteEnvironments/{id} | Updates an existing remote environment configuration or creates a new one | maturity&#x3D;EARLY_ADOPTER |
| [**updateRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#updateRemoteEnvironmentConfigWithHttpInfo) | **PUT** /remoteEnvironments/{id} | Updates an existing remote environment configuration or creates a new one | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#validateCreateRemoteEnvironmentConfig) | **POST** /remoteEnvironments/validator | Validates the payload for the &#x60;POST /remoteEnvironments&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#validateCreateRemoteEnvironmentConfigWithHttpInfo) | **POST** /remoteEnvironments/validator | Validates the payload for the &#x60;POST /remoteEnvironments&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateRemoteEnvironmentConfig**](RemoteEnvironmentsApi.md#validateUpdateRemoteEnvironmentConfig) | **POST** /remoteEnvironments/{id}/validator | Validates the payload for the &#x60;PUT /remoteEnvironments/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateRemoteEnvironmentConfigWithHttpInfo**](RemoteEnvironmentsApi.md#validateUpdateRemoteEnvironmentConfigWithHttpInfo) | **POST** /remoteEnvironments/{id}/validator | Validates the payload for the &#x60;PUT /remoteEnvironments/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createRemoteEnvironmentConfig

> RemoteEnvironmentConfigStub createRemoteEnvironmentConfig(remoteEnvironmentConfigDto)

Creates a new remote environment configuration | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.   Be sure to prepare a token with the **Fetch data from a remote environment** (&#x60;RestRequestForwarding&#x60;) scope. You can create such a token via [Tokens API](https://dt-url.net/ff23kmx).

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains parameters of the new remote environment configuration.
        try {
            RemoteEnvironmentConfigStub result = apiInstance.createRemoteEnvironmentConfig(remoteEnvironmentConfigDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#createRemoteEnvironmentConfig");
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
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains parameters of the new remote environment configuration. | [optional] |

### Return type

[**RemoteEnvironmentConfigStub**](RemoteEnvironmentConfigStub.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. A new remote environment configuration has been created. The response contains the ID of the new configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<RemoteEnvironmentConfigStub> createRemoteEnvironmentConfig createRemoteEnvironmentConfigWithHttpInfo(remoteEnvironmentConfigDto)

Creates a new remote environment configuration | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.   Be sure to prepare a token with the **Fetch data from a remote environment** (&#x60;RestRequestForwarding&#x60;) scope. You can create such a token via [Tokens API](https://dt-url.net/ff23kmx).

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains parameters of the new remote environment configuration.
        try {
            ApiResponse<RemoteEnvironmentConfigStub> response = apiInstance.createRemoteEnvironmentConfigWithHttpInfo(remoteEnvironmentConfigDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#createRemoteEnvironmentConfig");
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
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains parameters of the new remote environment configuration. | [optional] |

### Return type

ApiResponse<[**RemoteEnvironmentConfigStub**](RemoteEnvironmentConfigStub.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. A new remote environment configuration has been created. The response contains the ID of the new configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRemoteEnvironmentConfig

> void deleteRemoteEnvironmentConfig(id)

Deletes the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the configuration to be deleted.
        try {
            apiInstance.deleteRemoteEnvironmentConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#deleteRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the configuration to be deleted. | |

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
| **204** | Success. The configuration has been deleted. The response doesn&#39;t have a body. |  -  |

## deleteRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<Void> deleteRemoteEnvironmentConfig deleteRemoteEnvironmentConfigWithHttpInfo(id)

Deletes the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the configuration to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRemoteEnvironmentConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#deleteRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the configuration to be deleted. | |

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
| **204** | Success. The configuration has been deleted. The response doesn&#39;t have a body. |  -  |


## getRemoteEnvironmentConfig

> RemoteEnvironmentConfigDto getRemoteEnvironmentConfig(id)

Gets the properties of the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required configuration.
        try {
            RemoteEnvironmentConfigDto result = apiInstance.getRemoteEnvironmentConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#getRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the required configuration. | |

### Return type

[**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<RemoteEnvironmentConfigDto> getRemoteEnvironmentConfig getRemoteEnvironmentConfigWithHttpInfo(id)

Gets the properties of the specified remote environment configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required configuration.
        try {
            ApiResponse<RemoteEnvironmentConfigDto> response = apiInstance.getRemoteEnvironmentConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#getRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the required configuration. | |

### Return type

ApiResponse<[**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listRemoteEnvironmentConfigs

> RemoteEnvironmentConfigListDto listRemoteEnvironmentConfigs()

Lists all remote environment configurations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        try {
            RemoteEnvironmentConfigListDto result = apiInstance.listRemoteEnvironmentConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#listRemoteEnvironmentConfigs");
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

[**RemoteEnvironmentConfigListDto**](RemoteEnvironmentConfigListDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listRemoteEnvironmentConfigsWithHttpInfo

> ApiResponse<RemoteEnvironmentConfigListDto> listRemoteEnvironmentConfigs listRemoteEnvironmentConfigsWithHttpInfo()

Lists all remote environment configurations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        try {
            ApiResponse<RemoteEnvironmentConfigListDto> response = apiInstance.listRemoteEnvironmentConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#listRemoteEnvironmentConfigs");
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

ApiResponse<[**RemoteEnvironmentConfigListDto**](RemoteEnvironmentConfigListDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateRemoteEnvironmentConfig

> RemoteEnvironmentConfigStub updateRemoteEnvironmentConfig(id, remoteEnvironmentConfigDto)

Updates an existing remote environment configuration or creates a new one | maturity&#x3D;EARLY_ADOPTER

If a remote environment configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the configuration to be updated.    If you set the ID in the body as well, it must match this ID.
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains updated parameters of the remote environment configuration.
        try {
            RemoteEnvironmentConfigStub result = apiInstance.updateRemoteEnvironmentConfig(id, remoteEnvironmentConfigDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#updateRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the configuration to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains updated parameters of the remote environment configuration. | [optional] |

### Return type

[**RemoteEnvironmentConfigStub**](RemoteEnvironmentConfigStub.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. A new remote environment configuration has been created. The response contains the ID of the new configuration. |  -  |
| **204** | Success. The configuration has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<RemoteEnvironmentConfigStub> updateRemoteEnvironmentConfig updateRemoteEnvironmentConfigWithHttpInfo(id, remoteEnvironmentConfigDto)

Updates an existing remote environment configuration or creates a new one | maturity&#x3D;EARLY_ADOPTER

If a remote environment configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the configuration to be updated.    If you set the ID in the body as well, it must match this ID.
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains updated parameters of the remote environment configuration.
        try {
            ApiResponse<RemoteEnvironmentConfigStub> response = apiInstance.updateRemoteEnvironmentConfigWithHttpInfo(id, remoteEnvironmentConfigDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#updateRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the configuration to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains updated parameters of the remote environment configuration. | [optional] |

### Return type

ApiResponse<[**RemoteEnvironmentConfigStub**](RemoteEnvironmentConfigStub.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. A new remote environment configuration has been created. The response contains the ID of the new configuration. |  -  |
| **204** | Success. The configuration has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateRemoteEnvironmentConfig

> void validateCreateRemoteEnvironmentConfig(remoteEnvironmentConfigDto)

Validates the payload for the &#x60;POST /remoteEnvironments&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains the remote environment configuration to be validated.
        try {
            apiInstance.validateCreateRemoteEnvironmentConfig(remoteEnvironmentConfigDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#validateCreateRemoteEnvironmentConfig");
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
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains the remote environment configuration to be validated. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateCreateRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<Void> validateCreateRemoteEnvironmentConfig validateCreateRemoteEnvironmentConfigWithHttpInfo(remoteEnvironmentConfigDto)

Validates the payload for the &#x60;POST /remoteEnvironments&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains the remote environment configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRemoteEnvironmentConfigWithHttpInfo(remoteEnvironmentConfigDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#validateCreateRemoteEnvironmentConfig");
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
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains the remote environment configuration to be validated. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateRemoteEnvironmentConfig

> void validateUpdateRemoteEnvironmentConfig(id, remoteEnvironmentConfigDto)

Validates the payload for the &#x60;PUT /remoteEnvironments/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the remote environment configuration to be validated.
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains the remote environment configuration to be validated.
        try {
            apiInstance.validateUpdateRemoteEnvironmentConfig(id, remoteEnvironmentConfigDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#validateUpdateRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the remote environment configuration to be validated. | |
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains the remote environment configuration to be validated. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateRemoteEnvironmentConfigWithHttpInfo

> ApiResponse<Void> validateUpdateRemoteEnvironmentConfig validateUpdateRemoteEnvironmentConfigWithHttpInfo(id, remoteEnvironmentConfigDto)

Validates the payload for the &#x60;PUT /remoteEnvironments/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RemoteEnvironmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RemoteEnvironmentsApi apiInstance = new RemoteEnvironmentsApi(defaultClient);
        String id = "id_example"; // String | The ID of the remote environment configuration to be validated.
        RemoteEnvironmentConfigDto remoteEnvironmentConfigDto = new RemoteEnvironmentConfigDto(); // RemoteEnvironmentConfigDto | The JSON body of the request. Contains the remote environment configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRemoteEnvironmentConfigWithHttpInfo(id, remoteEnvironmentConfigDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RemoteEnvironmentsApi#validateUpdateRemoteEnvironmentConfig");
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
| **id** | **String**| The ID of the remote environment configuration to be validated. | |
| **remoteEnvironmentConfigDto** | [**RemoteEnvironmentConfigDto**](RemoteEnvironmentConfigDto.md)| The JSON body of the request. Contains the remote environment configuration to be validated. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

