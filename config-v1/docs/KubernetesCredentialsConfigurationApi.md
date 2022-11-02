# KubernetesCredentialsConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#createKubernetesCredentialsConfig) | **POST** /kubernetes/credentials | Creates a new Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**createKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#createKubernetesCredentialsConfigWithHttpInfo) | **POST** /kubernetes/credentials | Creates a new Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**deleteKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#deleteKubernetesCredentialsConfig) | **DELETE** /kubernetes/credentials/{id} | Deletes the specified Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**deleteKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#deleteKubernetesCredentialsConfigWithHttpInfo) | **DELETE** /kubernetes/credentials/{id} | Deletes the specified Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**getKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#getKubernetesCredentialsConfig) | **GET** /kubernetes/credentials/{id} | Gets the configuration of the specified Kubernetes credentials | maturity&#x3D;EARLY_ADOPTER |
| [**getKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#getKubernetesCredentialsConfigWithHttpInfo) | **GET** /kubernetes/credentials/{id} | Gets the configuration of the specified Kubernetes credentials | maturity&#x3D;EARLY_ADOPTER |
| [**listKubernetesCredentialsConfigs**](KubernetesCredentialsConfigurationApi.md#listKubernetesCredentialsConfigs) | **GET** /kubernetes/credentials | Lists all available Kubernetes credentials configurations | maturity&#x3D;EARLY_ADOPTER |
| [**listKubernetesCredentialsConfigsWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#listKubernetesCredentialsConfigsWithHttpInfo) | **GET** /kubernetes/credentials | Lists all available Kubernetes credentials configurations | maturity&#x3D;EARLY_ADOPTER |
| [**updateKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#updateKubernetesCredentialsConfig) | **PUT** /kubernetes/credentials/{id} | Updates an existing Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**updateKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#updateKubernetesCredentialsConfigWithHttpInfo) | **PUT** /kubernetes/credentials/{id} | Updates an existing Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#validateCreateKubernetesCredentialsConfig) | **POST** /kubernetes/credentials/validator | Validates the payload for the &#x60;POST /kubernetes/credentials&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#validateCreateKubernetesCredentialsConfigWithHttpInfo) | **POST** /kubernetes/credentials/validator | Validates the payload for the &#x60;POST /kubernetes/credentials&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateKubernetesCredentialsConfig**](KubernetesCredentialsConfigurationApi.md#validateUpdateKubernetesCredentialsConfig) | **POST** /kubernetes/credentials/{id}/validator | Validates the payload for the &#x60;PUT /kubernetes/credentials/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateKubernetesCredentialsConfigWithHttpInfo**](KubernetesCredentialsConfigurationApi.md#validateUpdateKubernetesCredentialsConfigWithHttpInfo) | **POST** /kubernetes/credentials/{id}/validator | Validates the payload for the &#x60;PUT /kubernetes/credentials/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createKubernetesCredentialsConfig

> EntityShortRepresentation createKubernetesCredentialsConfig(kubernetesCredentials)

Creates a new Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID as it will be automatically assigned by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains parameters of the new Kubernetes credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.createKubernetesCredentialsConfig(kubernetesCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#createKubernetesCredentialsConfig");
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
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains parameters of the new Kubernetes credentials configuration. | [optional] |

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
| **201** | Success. The new Kubernetes credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createKubernetesCredentialsConfig createKubernetesCredentialsConfigWithHttpInfo(kubernetesCredentials)

Creates a new Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID as it will be automatically assigned by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains parameters of the new Kubernetes credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createKubernetesCredentialsConfigWithHttpInfo(kubernetesCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#createKubernetesCredentialsConfig");
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
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains parameters of the new Kubernetes credentials configuration. | [optional] |

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
| **201** | Success. The new Kubernetes credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteKubernetesCredentialsConfig

> void deleteKubernetesCredentialsConfig(id)

Deletes the specified Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration be deleted.
        try {
            apiInstance.deleteKubernetesCredentialsConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#deleteKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration be deleted. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## deleteKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<Void> deleteKubernetesCredentialsConfig deleteKubernetesCredentialsConfigWithHttpInfo(id)

Deletes the specified Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteKubernetesCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#deleteKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration be deleted. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getKubernetesCredentialsConfig

> KubernetesCredentials getKubernetesCredentialsConfig(id)

Gets the configuration of the specified Kubernetes credentials | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Kubernetes credentials configuration.
        try {
            KubernetesCredentials result = apiInstance.getKubernetesCredentialsConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#getKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the required Kubernetes credentials configuration. | |

### Return type

[**KubernetesCredentials**](KubernetesCredentials.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<KubernetesCredentials> getKubernetesCredentialsConfig getKubernetesCredentialsConfigWithHttpInfo(id)

Gets the configuration of the specified Kubernetes credentials | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Kubernetes credentials configuration.
        try {
            ApiResponse<KubernetesCredentials> response = apiInstance.getKubernetesCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#getKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the required Kubernetes credentials configuration. | |

### Return type

ApiResponse<[**KubernetesCredentials**](KubernetesCredentials.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listKubernetesCredentialsConfigs

> KubernetesConfigStubListDto listKubernetesCredentialsConfigs()

Lists all available Kubernetes credentials configurations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        try {
            KubernetesConfigStubListDto result = apiInstance.listKubernetesCredentialsConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#listKubernetesCredentialsConfigs");
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

[**KubernetesConfigStubListDto**](KubernetesConfigStubListDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listKubernetesCredentialsConfigsWithHttpInfo

> ApiResponse<KubernetesConfigStubListDto> listKubernetesCredentialsConfigs listKubernetesCredentialsConfigsWithHttpInfo()

Lists all available Kubernetes credentials configurations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<KubernetesConfigStubListDto> response = apiInstance.listKubernetesCredentialsConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#listKubernetesCredentialsConfigs");
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

ApiResponse<[**KubernetesConfigStubListDto**](KubernetesConfigStubListDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateKubernetesCredentialsConfig

> EntityShortRepresentation updateKubernetesCredentialsConfig(id, kubernetesCredentials)

Updates an existing Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

You can&#39;t change the URL of the Kubernetes cluster.   If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.  IDs of entities are computed server side upon creation. If you want to create a new entity, use the POST method without an ID. To update an existing entity, use the PUT method with an existing, valid ID. To re-create an entity under a specific ID, a valid ID must be provided with the PUT method.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration to be updated.
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains updated parameters of the Kubernetes credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.updateKubernetesCredentialsConfig(id, kubernetesCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#updateKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration to be updated. | |
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains updated parameters of the Kubernetes credentials configuration. | [optional] |

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
| **201** | Success. The new Kubernetes credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **204** | Success. The Kubernetes credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateKubernetesCredentialsConfig updateKubernetesCredentialsConfigWithHttpInfo(id, kubernetesCredentials)

Updates an existing Kubernetes credentials configuration | maturity&#x3D;EARLY_ADOPTER

You can&#39;t change the URL of the Kubernetes cluster.   If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.  IDs of entities are computed server side upon creation. If you want to create a new entity, use the POST method without an ID. To update an existing entity, use the PUT method with an existing, valid ID. To re-create an entity under a specific ID, a valid ID must be provided with the PUT method.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration to be updated.
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains updated parameters of the Kubernetes credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateKubernetesCredentialsConfigWithHttpInfo(id, kubernetesCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#updateKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration to be updated. | |
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains updated parameters of the Kubernetes credentials configuration. | [optional] |

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
| **201** | Success. The new Kubernetes credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **204** | Success. The Kubernetes credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateKubernetesCredentialsConfig

> void validateCreateKubernetesCredentialsConfig(kubernetesCredentials)

Validates the payload for the &#x60;POST /kubernetes/credentials&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains the Kubernetes credentials configuration to be validated.
        try {
            apiInstance.validateCreateKubernetesCredentialsConfig(kubernetesCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#validateCreateKubernetesCredentialsConfig");
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
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains the Kubernetes credentials configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateCreateKubernetesCredentialsConfig validateCreateKubernetesCredentialsConfigWithHttpInfo(kubernetesCredentials)

Validates the payload for the &#x60;POST /kubernetes/credentials&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains the Kubernetes credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateKubernetesCredentialsConfigWithHttpInfo(kubernetesCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#validateCreateKubernetesCredentialsConfig");
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
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains the Kubernetes credentials configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateKubernetesCredentialsConfig

> void validateUpdateKubernetesCredentialsConfig(id, kubernetesCredentials)

Validates the payload for the &#x60;PUT /kubernetes/credentials/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration to be validated.
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains the Kubernetes credentials configuration to be validated.
        try {
            apiInstance.validateUpdateKubernetesCredentialsConfig(id, kubernetesCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#validateUpdateKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration to be validated. | |
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains the Kubernetes credentials configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateKubernetesCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateUpdateKubernetesCredentialsConfig validateUpdateKubernetesCredentialsConfigWithHttpInfo(id, kubernetesCredentials)

Validates the payload for the &#x60;PUT /kubernetes/credentials/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.KubernetesCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        KubernetesCredentialsConfigurationApi apiInstance = new KubernetesCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Kubernetes credentials configuration to be validated.
        KubernetesCredentials kubernetesCredentials = new KubernetesCredentials(); // KubernetesCredentials | The JSON body of the request. Contains the Kubernetes credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateKubernetesCredentialsConfigWithHttpInfo(id, kubernetesCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling KubernetesCredentialsConfigurationApi#validateUpdateKubernetesCredentialsConfig");
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
| **id** | **String**| The ID of the Kubernetes credentials configuration to be validated. | |
| **kubernetesCredentials** | [**KubernetesCredentials**](KubernetesCredentials.md)| The JSON body of the request. Contains the Kubernetes credentials configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

