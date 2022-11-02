# AzureCredentialsConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAzureCredentialsConfig**](AzureCredentialsConfigurationApi.md#createAzureCredentialsConfig) | **POST** /azure/credentials | Creates a new Azure credentials configuration |
| [**createAzureCredentialsConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#createAzureCredentialsConfigWithHttpInfo) | **POST** /azure/credentials | Creates a new Azure credentials configuration |
| [**deleteAzureCredentialsConfig**](AzureCredentialsConfigurationApi.md#deleteAzureCredentialsConfig) | **DELETE** /azure/credentials/{id} | Deletes the specified Azure credentials configuration |
| [**deleteAzureCredentialsConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#deleteAzureCredentialsConfigWithHttpInfo) | **DELETE** /azure/credentials/{id} | Deletes the specified Azure credentials configuration |
| [**getAzureCredentialsConfig**](AzureCredentialsConfigurationApi.md#getAzureCredentialsConfig) | **GET** /azure/credentials/{id} | Gets the configuration of the specified Azure credentials |
| [**getAzureCredentialsConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#getAzureCredentialsConfigWithHttpInfo) | **GET** /azure/credentials/{id} | Gets the configuration of the specified Azure credentials |
| [**getAzureServicesConfig**](AzureCredentialsConfigurationApi.md#getAzureServicesConfig) | **GET** /azure/credentials/{id}/services | Gets the monitored services configuration of the specified Azure credentials |
| [**getAzureServicesConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#getAzureServicesConfigWithHttpInfo) | **GET** /azure/credentials/{id}/services | Gets the monitored services configuration of the specified Azure credentials |
| [**getSupportedServices1**](AzureCredentialsConfigurationApi.md#getSupportedServices1) | **GET** /azure/supportedServices | Gets the list of Azure supported services |
| [**getSupportedServices1WithHttpInfo**](AzureCredentialsConfigurationApi.md#getSupportedServices1WithHttpInfo) | **GET** /azure/supportedServices | Gets the list of Azure supported services |
| [**listAzureCredentialsConfigs**](AzureCredentialsConfigurationApi.md#listAzureCredentialsConfigs) | **GET** /azure/credentials | Lists all available Azure credentials configurations |
| [**listAzureCredentialsConfigsWithHttpInfo**](AzureCredentialsConfigurationApi.md#listAzureCredentialsConfigsWithHttpInfo) | **GET** /azure/credentials | Lists all available Azure credentials configurations |
| [**updateAzureCredentialsConfig**](AzureCredentialsConfigurationApi.md#updateAzureCredentialsConfig) | **PUT** /azure/credentials/{id} | Updates an existing Azure credentials configuration |
| [**updateAzureCredentialsConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#updateAzureCredentialsConfigWithHttpInfo) | **PUT** /azure/credentials/{id} | Updates an existing Azure credentials configuration |
| [**updateAzureServicesConfig**](AzureCredentialsConfigurationApi.md#updateAzureServicesConfig) | **PUT** /azure/credentials/{id}/services | Replace an existing monitored services configuration of the specified Azure credentials |
| [**updateAzureServicesConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#updateAzureServicesConfigWithHttpInfo) | **PUT** /azure/credentials/{id}/services | Replace an existing monitored services configuration of the specified Azure credentials |
| [**validateAzureCredentialsConfig**](AzureCredentialsConfigurationApi.md#validateAzureCredentialsConfig) | **POST** /azure/credentials/validator | Validates the payload for the &#x60;POST /azure/credentials&#x60; request |
| [**validateAzureCredentialsConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#validateAzureCredentialsConfigWithHttpInfo) | **POST** /azure/credentials/validator | Validates the payload for the &#x60;POST /azure/credentials&#x60; request |
| [**validateAzureServicesConfig**](AzureCredentialsConfigurationApi.md#validateAzureServicesConfig) | **POST** /azure/credentials/{id}/services/validator | Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request |
| [**validateAzureServicesConfigWithHttpInfo**](AzureCredentialsConfigurationApi.md#validateAzureServicesConfigWithHttpInfo) | **POST** /azure/credentials/{id}/services/validator | Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request |
| [**validateConfigurationUpdate**](AzureCredentialsConfigurationApi.md#validateConfigurationUpdate) | **POST** /azure/credentials/{id}/validator | Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request |
| [**validateConfigurationUpdateWithHttpInfo**](AzureCredentialsConfigurationApi.md#validateConfigurationUpdateWithHttpInfo) | **POST** /azure/credentials/{id}/validator | Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request |



## createAzureCredentialsConfig

> EntityShortRepresentation createAzureCredentialsConfig(azureCredentialsCreation)

Creates a new Azure credentials configuration

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        AzureCredentialsCreation azureCredentialsCreation = new AzureCredentialsCreation(); // AzureCredentialsCreation | The JSON body of the request. Contains parameters of the new Azure credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.createAzureCredentialsConfig(azureCredentialsCreation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#createAzureCredentialsConfig");
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
| **azureCredentialsCreation** | [**AzureCredentialsCreation**](AzureCredentialsCreation.md)| The JSON body of the request. Contains parameters of the new Azure credentials configuration. | [optional] |

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
| **201** | Success. The new Azure credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createAzureCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createAzureCredentialsConfig createAzureCredentialsConfigWithHttpInfo(azureCredentialsCreation)

Creates a new Azure credentials configuration

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
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        AzureCredentialsCreation azureCredentialsCreation = new AzureCredentialsCreation(); // AzureCredentialsCreation | The JSON body of the request. Contains parameters of the new Azure credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createAzureCredentialsConfigWithHttpInfo(azureCredentialsCreation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#createAzureCredentialsConfig");
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
| **azureCredentialsCreation** | [**AzureCredentialsCreation**](AzureCredentialsCreation.md)| The JSON body of the request. Contains parameters of the new Azure credentials configuration. | [optional] |

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
| **201** | Success. The new Azure credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteAzureCredentialsConfig

> void deleteAzureCredentialsConfig(id)

Deletes the specified Azure credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be deleted.
        try {
            apiInstance.deleteAzureCredentialsConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#deleteAzureCredentialsConfig");
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
| **id** | **String**| The ID of the Azure credentials configuration to be deleted. | |

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

## deleteAzureCredentialsConfigWithHttpInfo

> ApiResponse<Void> deleteAzureCredentialsConfig deleteAzureCredentialsConfigWithHttpInfo(id)

Deletes the specified Azure credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteAzureCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#deleteAzureCredentialsConfig");
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
| **id** | **String**| The ID of the Azure credentials configuration to be deleted. | |

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


## getAzureCredentialsConfig

> AzureCredentials getAzureCredentialsConfig(id)

Gets the configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Azure credentials configuration.
        try {
            AzureCredentials result = apiInstance.getAzureCredentialsConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getAzureCredentialsConfig");
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
| **id** | **String**| The ID of the required Azure credentials configuration. | |

### Return type

[**AzureCredentials**](AzureCredentials.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAzureCredentialsConfigWithHttpInfo

> ApiResponse<AzureCredentials> getAzureCredentialsConfig getAzureCredentialsConfigWithHttpInfo(id)

Gets the configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Azure credentials configuration.
        try {
            ApiResponse<AzureCredentials> response = apiInstance.getAzureCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getAzureCredentialsConfig");
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
| **id** | **String**| The ID of the required Azure credentials configuration. | |

### Return type

ApiResponse<[**AzureCredentials**](AzureCredentials.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAzureServicesConfig

> AzureMonitoredServicesDto getAzureServicesConfig(id)

Gets the monitored services configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Azure credentials configuration.
        try {
            AzureMonitoredServicesDto result = apiInstance.getAzureServicesConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getAzureServicesConfig");
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
| **id** | **String**| The ID of the required Azure credentials configuration. | |

### Return type

[**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAzureServicesConfigWithHttpInfo

> ApiResponse<AzureMonitoredServicesDto> getAzureServicesConfig getAzureServicesConfigWithHttpInfo(id)

Gets the monitored services configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Azure credentials configuration.
        try {
            ApiResponse<AzureMonitoredServicesDto> response = apiInstance.getAzureServicesConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getAzureServicesConfig");
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
| **id** | **String**| The ID of the required Azure credentials configuration. | |

### Return type

ApiResponse<[**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSupportedServices1

> CloudSupportedServicesList getSupportedServices1()

Gets the list of Azure supported services

You can use this list for adding services to Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        try {
            CloudSupportedServicesList result = apiInstance.getSupportedServices1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getSupportedServices1");
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

[**CloudSupportedServicesList**](CloudSupportedServicesList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSupportedServices1WithHttpInfo

> ApiResponse<CloudSupportedServicesList> getSupportedServices1 getSupportedServices1WithHttpInfo()

Gets the list of Azure supported services

You can use this list for adding services to Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<CloudSupportedServicesList> response = apiInstance.getSupportedServices1WithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#getSupportedServices1");
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

ApiResponse<[**CloudSupportedServicesList**](CloudSupportedServicesList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listAzureCredentialsConfigs

> StubList listAzureCredentialsConfigs()

Lists all available Azure credentials configurations

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        try {
            StubList result = apiInstance.listAzureCredentialsConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#listAzureCredentialsConfigs");
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

## listAzureCredentialsConfigsWithHttpInfo

> ApiResponse<StubList> listAzureCredentialsConfigs listAzureCredentialsConfigsWithHttpInfo()

Lists all available Azure credentials configurations

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listAzureCredentialsConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#listAzureCredentialsConfigs");
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


## updateAzureCredentialsConfig

> EntityShortRepresentation updateAzureCredentialsConfig(id, azureCredentials)

Updates an existing Azure credentials configuration

* You can&#39;t change the Application ID or Directory ID of an Azure configuration. If you need to change them, create a new credentials configuration.  * If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be updated.
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains updated parameters of the Azure credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.updateAzureCredentialsConfig(id, azureCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#updateAzureCredentialsConfig");
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
| **id** | **String**| The ID of the Azure credentials configuration to be updated. | |
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains updated parameters of the Azure credentials configuration. | [optional] |

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
| **201** | Success. The new Azure credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **204** | Success. The Azure credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateAzureCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateAzureCredentialsConfig updateAzureCredentialsConfigWithHttpInfo(id, azureCredentials)

Updates an existing Azure credentials configuration

* You can&#39;t change the Application ID or Directory ID of an Azure configuration. If you need to change them, create a new credentials configuration.  * If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be updated.
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains updated parameters of the Azure credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateAzureCredentialsConfigWithHttpInfo(id, azureCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#updateAzureCredentialsConfig");
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
| **id** | **String**| The ID of the Azure credentials configuration to be updated. | |
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains updated parameters of the Azure credentials configuration. | [optional] |

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
| **201** | Success. The new Azure credentials configuration has been created. The response body contains the ID of the configuration. |  -  |
| **204** | Success. The Azure credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateAzureServicesConfig

> void updateAzureServicesConfig(id, azureMonitoredServicesDto)

Replace an existing monitored services configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials to be updated with new monitored services configuration.
        AzureMonitoredServicesDto azureMonitoredServicesDto = new AzureMonitoredServicesDto(); // AzureMonitoredServicesDto | The JSON body of the request. Contains updated monitored services configuration for Azure credentials.
        try {
            apiInstance.updateAzureServicesConfig(id, azureMonitoredServicesDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#updateAzureServicesConfig");
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
| **id** | **String**| The ID of the Azure credentials to be updated with new monitored services configuration. | |
| **azureMonitoredServicesDto** | [**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)| The JSON body of the request. Contains updated monitored services configuration for Azure credentials. | [optional] |

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
| **204** | Success. The Azure credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateAzureServicesConfigWithHttpInfo

> ApiResponse<Void> updateAzureServicesConfig updateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto)

Replace an existing monitored services configuration of the specified Azure credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials to be updated with new monitored services configuration.
        AzureMonitoredServicesDto azureMonitoredServicesDto = new AzureMonitoredServicesDto(); // AzureMonitoredServicesDto | The JSON body of the request. Contains updated monitored services configuration for Azure credentials.
        try {
            ApiResponse<Void> response = apiInstance.updateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#updateAzureServicesConfig");
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
| **id** | **String**| The ID of the Azure credentials to be updated with new monitored services configuration. | |
| **azureMonitoredServicesDto** | [**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)| The JSON body of the request. Contains updated monitored services configuration for Azure credentials. | [optional] |

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
| **204** | Success. The Azure credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateAzureCredentialsConfig

> void validateAzureCredentialsConfig(azureCredentials)

Validates the payload for the &#x60;POST /azure/credentials&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains the Azure credentials configuration to be validated.
        try {
            apiInstance.validateAzureCredentialsConfig(azureCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateAzureCredentialsConfig");
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
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains the Azure credentials configuration to be validated. | [optional] |

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

## validateAzureCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateAzureCredentialsConfig validateAzureCredentialsConfigWithHttpInfo(azureCredentials)

Validates the payload for the &#x60;POST /azure/credentials&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains the Azure credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateAzureCredentialsConfigWithHttpInfo(azureCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateAzureCredentialsConfig");
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
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains the Azure credentials configuration to be validated. | [optional] |

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


## validateAzureServicesConfig

> void validateAzureServicesConfig(id, azureMonitoredServicesDto)

Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials for which the monitored services configuration is going to be validated.
        AzureMonitoredServicesDto azureMonitoredServicesDto = new AzureMonitoredServicesDto(); // AzureMonitoredServicesDto | The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated.
        try {
            apiInstance.validateAzureServicesConfig(id, azureMonitoredServicesDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateAzureServicesConfig");
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
| **id** | **String**| The ID of the Azure credentials for which the monitored services configuration is going to be validated. | |
| **azureMonitoredServicesDto** | [**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)| The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated. | [optional] |

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

## validateAzureServicesConfigWithHttpInfo

> ApiResponse<Void> validateAzureServicesConfig validateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto)

Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials for which the monitored services configuration is going to be validated.
        AzureMonitoredServicesDto azureMonitoredServicesDto = new AzureMonitoredServicesDto(); // AzureMonitoredServicesDto | The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateAzureServicesConfig");
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
| **id** | **String**| The ID of the Azure credentials for which the monitored services configuration is going to be validated. | |
| **azureMonitoredServicesDto** | [**AzureMonitoredServicesDto**](AzureMonitoredServicesDto.md)| The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated. | [optional] |

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


## validateConfigurationUpdate

> void validateConfigurationUpdate(id, azureCredentials)

Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be validated.
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains the Azure credentials configuration to be validated.
        try {
            apiInstance.validateConfigurationUpdate(id, azureCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateConfigurationUpdate");
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
| **id** | **String**| The ID of the Azure credentials configuration to be validated. | |
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains the Azure credentials configuration to be validated. | [optional] |

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

## validateConfigurationUpdateWithHttpInfo

> ApiResponse<Void> validateConfigurationUpdate validateConfigurationUpdateWithHttpInfo(id, azureCredentials)

Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AzureCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AzureCredentialsConfigurationApi apiInstance = new AzureCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Azure credentials configuration to be validated.
        AzureCredentials azureCredentials = new AzureCredentials(); // AzureCredentials | The JSON body of the request. Contains the Azure credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateConfigurationUpdateWithHttpInfo(id, azureCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AzureCredentialsConfigurationApi#validateConfigurationUpdate");
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
| **id** | **String**| The ID of the Azure credentials configuration to be validated. | |
| **azureCredentials** | [**AzureCredentials**](AzureCredentials.md)| The JSON body of the request. Contains the Azure credentials configuration to be validated. | [optional] |

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

