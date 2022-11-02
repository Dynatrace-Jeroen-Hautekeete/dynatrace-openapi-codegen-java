# AwsCredentialsConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#createAwsCredentialsConfig) | **POST** /aws/credentials | Creates a new AWS credentials configuration |
| [**createAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#createAwsCredentialsConfigWithHttpInfo) | **POST** /aws/credentials | Creates a new AWS credentials configuration |
| [**deleteAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#deleteAwsCredentialsConfig) | **DELETE** /aws/credentials/{id} | Deletes the specified AWS credentials configuration |
| [**deleteAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#deleteAwsCredentialsConfigWithHttpInfo) | **DELETE** /aws/credentials/{id} | Deletes the specified AWS credentials configuration |
| [**getAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#getAwsCredentialsConfig) | **GET** /aws/credentials/{id} | Gets the configuration of the specified AWS credentials |
| [**getAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#getAwsCredentialsConfigWithHttpInfo) | **GET** /aws/credentials/{id} | Gets the configuration of the specified AWS credentials |
| [**getAwsServicesConfig**](AwsCredentialsConfigurationApi.md#getAwsServicesConfig) | **GET** /aws/credentials/{id}/services | Gets the monitored services configuration of the specified AWS credentials |
| [**getAwsServicesConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#getAwsServicesConfigWithHttpInfo) | **GET** /aws/credentials/{id}/services | Gets the monitored services configuration of the specified AWS credentials |
| [**getSupportedServices**](AwsCredentialsConfigurationApi.md#getSupportedServices) | **GET** /aws/supportedServices | Gets the list of AWS supported services |
| [**getSupportedServicesWithHttpInfo**](AwsCredentialsConfigurationApi.md#getSupportedServicesWithHttpInfo) | **GET** /aws/supportedServices | Gets the list of AWS supported services |
| [**listAwsCredentialConfigs**](AwsCredentialsConfigurationApi.md#listAwsCredentialConfigs) | **GET** /aws/credentials | Lists all available AWS credentials configurations |
| [**listAwsCredentialConfigsWithHttpInfo**](AwsCredentialsConfigurationApi.md#listAwsCredentialConfigsWithHttpInfo) | **GET** /aws/credentials | Lists all available AWS credentials configurations |
| [**readIamExternalIdToken**](AwsCredentialsConfigurationApi.md#readIamExternalIdToken) | **GET** /aws/iamExternalId | Gets the external ID token for setting an IAM role |
| [**readIamExternalIdTokenWithHttpInfo**](AwsCredentialsConfigurationApi.md#readIamExternalIdTokenWithHttpInfo) | **GET** /aws/iamExternalId | Gets the external ID token for setting an IAM role |
| [**updateAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#updateAwsCredentialsConfig) | **PUT** /aws/credentials/{id} | Updates an existing AWS credentials configuration |
| [**updateAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#updateAwsCredentialsConfigWithHttpInfo) | **PUT** /aws/credentials/{id} | Updates an existing AWS credentials configuration |
| [**updateAwsServicesConfig**](AwsCredentialsConfigurationApi.md#updateAwsServicesConfig) | **PUT** /aws/credentials/{id}/services | Replace an existing monitored services configuration of the specified AWS credentials |
| [**updateAwsServicesConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#updateAwsServicesConfigWithHttpInfo) | **PUT** /aws/credentials/{id}/services | Replace an existing monitored services configuration of the specified AWS credentials |
| [**validateCreateAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#validateCreateAwsCredentialsConfig) | **POST** /aws/credentials/validator | Validates the payload for the &#x60;POST /aws/credentials&#x60; request |
| [**validateCreateAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#validateCreateAwsCredentialsConfigWithHttpInfo) | **POST** /aws/credentials/validator | Validates the payload for the &#x60;POST /aws/credentials&#x60; request |
| [**validateUpdateAwsCredentialsConfig**](AwsCredentialsConfigurationApi.md#validateUpdateAwsCredentialsConfig) | **POST** /aws/credentials/{id}/validator | Validates the payload for the &#x60;PUT /aws/credentials/{id}&#x60; request |
| [**validateUpdateAwsCredentialsConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#validateUpdateAwsCredentialsConfigWithHttpInfo) | **POST** /aws/credentials/{id}/validator | Validates the payload for the &#x60;PUT /aws/credentials/{id}&#x60; request |
| [**validateUpdateAwsServicesConfig**](AwsCredentialsConfigurationApi.md#validateUpdateAwsServicesConfig) | **POST** /aws/credentials/{id}/services/validator | Validates the payload for the &#x60;PUT /aws/credentials/{id}/services&#x60; request |
| [**validateUpdateAwsServicesConfigWithHttpInfo**](AwsCredentialsConfigurationApi.md#validateUpdateAwsServicesConfigWithHttpInfo) | **POST** /aws/credentials/{id}/services/validator | Validates the payload for the &#x60;PUT /aws/credentials/{id}/services&#x60; request |



## createAwsCredentialsConfig

> EntityShortRepresentation createAwsCredentialsConfig(awsCredentialsConfig)

Creates a new AWS credentials configuration

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains parameters of the new AWS credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.createAwsCredentialsConfig(awsCredentialsConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#createAwsCredentialsConfig");
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
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains parameters of the new AWS credentials configuration. | [optional] |

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
| **201** | Success. The new AWS credentials configuration has been created. The response body contains the ID of the configuration.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createAwsCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createAwsCredentialsConfig createAwsCredentialsConfigWithHttpInfo(awsCredentialsConfig)

Creates a new AWS credentials configuration

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
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains parameters of the new AWS credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createAwsCredentialsConfigWithHttpInfo(awsCredentialsConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#createAwsCredentialsConfig");
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
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains parameters of the new AWS credentials configuration. | [optional] |

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
| **201** | Success. The new AWS credentials configuration has been created. The response body contains the ID of the configuration.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteAwsCredentialsConfig

> void deleteAwsCredentialsConfig(id)

Deletes the specified AWS credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of AWS credentials configuration to be deleted.
        try {
            apiInstance.deleteAwsCredentialsConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#deleteAwsCredentialsConfig");
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
| **id** | **String**| The ID of AWS credentials configuration to be deleted. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The AWS credentials configuration has been deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## deleteAwsCredentialsConfigWithHttpInfo

> ApiResponse<Void> deleteAwsCredentialsConfig deleteAwsCredentialsConfigWithHttpInfo(id)

Deletes the specified AWS credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of AWS credentials configuration to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteAwsCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#deleteAwsCredentialsConfig");
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
| **id** | **String**| The ID of AWS credentials configuration to be deleted. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The AWS credentials configuration has been deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getAwsCredentialsConfig

> AwsCredentialsConfig getAwsCredentialsConfig(id)

Gets the configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the specified AWS credentials configuration.
        try {
            AwsCredentialsConfig result = apiInstance.getAwsCredentialsConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getAwsCredentialsConfig");
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
| **id** | **String**| The ID of the specified AWS credentials configuration. | |

### Return type

[**AwsCredentialsConfig**](AwsCredentialsConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAwsCredentialsConfigWithHttpInfo

> ApiResponse<AwsCredentialsConfig> getAwsCredentialsConfig getAwsCredentialsConfigWithHttpInfo(id)

Gets the configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the specified AWS credentials configuration.
        try {
            ApiResponse<AwsCredentialsConfig> response = apiInstance.getAwsCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getAwsCredentialsConfig");
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
| **id** | **String**| The ID of the specified AWS credentials configuration. | |

### Return type

ApiResponse<[**AwsCredentialsConfig**](AwsCredentialsConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAwsServicesConfig

> AwsMonitoredServicesDto getAwsServicesConfig(id)

Gets the monitored services configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the specified AWS credentials configuration.
        try {
            AwsMonitoredServicesDto result = apiInstance.getAwsServicesConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getAwsServicesConfig");
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
| **id** | **String**| The ID of the specified AWS credentials configuration. | |

### Return type

[**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAwsServicesConfigWithHttpInfo

> ApiResponse<AwsMonitoredServicesDto> getAwsServicesConfig getAwsServicesConfigWithHttpInfo(id)

Gets the monitored services configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the specified AWS credentials configuration.
        try {
            ApiResponse<AwsMonitoredServicesDto> response = apiInstance.getAwsServicesConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getAwsServicesConfig");
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
| **id** | **String**| The ID of the specified AWS credentials configuration. | |

### Return type

ApiResponse<[**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSupportedServices

> CloudSupportedServicesList getSupportedServices()

Gets the list of AWS supported services

You can use this list for adding services to AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            CloudSupportedServicesList result = apiInstance.getSupportedServices();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getSupportedServices");
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

## getSupportedServicesWithHttpInfo

> ApiResponse<CloudSupportedServicesList> getSupportedServices getSupportedServicesWithHttpInfo()

Gets the list of AWS supported services

You can use this list for adding services to AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<CloudSupportedServicesList> response = apiInstance.getSupportedServicesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#getSupportedServices");
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


## listAwsCredentialConfigs

> List<EntityShortRepresentation> listAwsCredentialConfigs()

Lists all available AWS credentials configurations

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            List<EntityShortRepresentation> result = apiInstance.listAwsCredentialConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#listAwsCredentialConfigs");
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

[**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listAwsCredentialConfigsWithHttpInfo

> ApiResponse<List<EntityShortRepresentation>> listAwsCredentialConfigs listAwsCredentialConfigsWithHttpInfo()

Lists all available AWS credentials configurations

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<List<EntityShortRepresentation>> response = apiInstance.listAwsCredentialConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#listAwsCredentialConfigs");
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

ApiResponse<[**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## readIamExternalIdToken

> AwsIamToken readIamExternalIdToken()

Gets the external ID token for setting an IAM role

You&#39;ll need it for the role-based AWS authentication.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            AwsIamToken result = apiInstance.readIamExternalIdToken();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#readIamExternalIdToken");
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

[**AwsIamToken**](AwsIamToken.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## readIamExternalIdTokenWithHttpInfo

> ApiResponse<AwsIamToken> readIamExternalIdToken readIamExternalIdTokenWithHttpInfo()

Gets the external ID token for setting an IAM role

You&#39;ll need it for the role-based AWS authentication.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<AwsIamToken> response = apiInstance.readIamExternalIdTokenWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#readIamExternalIdToken");
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

ApiResponse<[**AwsIamToken**](AwsIamToken.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateAwsCredentialsConfig

> EntityShortRepresentation updateAwsCredentialsConfig(id, awsCredentialsConfig)

Updates an existing AWS credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials configuration to be updated.
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains updated parameters of the AWS credentials configuration.
        try {
            EntityShortRepresentation result = apiInstance.updateAwsCredentialsConfig(id, awsCredentialsConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#updateAwsCredentialsConfig");
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
| **id** | **String**| The ID of the AWS credentials configuration to be updated. | |
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains updated parameters of the AWS credentials configuration. | [optional] |

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
| **201** | Success. The new AWS credentials configuration has been created. The response body contains the ID of the configuration.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **204** | Success. The AWS credentials configuration has been updated. Response doesn&#39;t have a body.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateAwsCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateAwsCredentialsConfig updateAwsCredentialsConfigWithHttpInfo(id, awsCredentialsConfig)

Updates an existing AWS credentials configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials configuration to be updated.
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains updated parameters of the AWS credentials configuration.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateAwsCredentialsConfigWithHttpInfo(id, awsCredentialsConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#updateAwsCredentialsConfig");
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
| **id** | **String**| The ID of the AWS credentials configuration to be updated. | |
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains updated parameters of the AWS credentials configuration. | [optional] |

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
| **201** | Success. The new AWS credentials configuration has been created. The response body contains the ID of the configuration.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **204** | Success. The AWS credentials configuration has been updated. Response doesn&#39;t have a body.    Check the connection status for these credentials after 10 minutes with the &#x60;GET /aws/credentials/{id}&#x60; request. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateAwsServicesConfig

> void updateAwsServicesConfig(id, awsMonitoredServicesDto)

Replace an existing monitored services configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials to be updated with new monitored services configuration.
        AwsMonitoredServicesDto awsMonitoredServicesDto = new AwsMonitoredServicesDto(); // AwsMonitoredServicesDto | The JSON body of the request. Contains updated monitored services configuration for AWS credentials.
        try {
            apiInstance.updateAwsServicesConfig(id, awsMonitoredServicesDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#updateAwsServicesConfig");
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
| **id** | **String**| The ID of the AWS credentials to be updated with new monitored services configuration. | |
| **awsMonitoredServicesDto** | [**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)| The JSON body of the request. Contains updated monitored services configuration for AWS credentials. | [optional] |

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
| **204** | Success. The AWS credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateAwsServicesConfigWithHttpInfo

> ApiResponse<Void> updateAwsServicesConfig updateAwsServicesConfigWithHttpInfo(id, awsMonitoredServicesDto)

Replace an existing monitored services configuration of the specified AWS credentials

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials to be updated with new monitored services configuration.
        AwsMonitoredServicesDto awsMonitoredServicesDto = new AwsMonitoredServicesDto(); // AwsMonitoredServicesDto | The JSON body of the request. Contains updated monitored services configuration for AWS credentials.
        try {
            ApiResponse<Void> response = apiInstance.updateAwsServicesConfigWithHttpInfo(id, awsMonitoredServicesDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#updateAwsServicesConfig");
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
| **id** | **String**| The ID of the AWS credentials to be updated with new monitored services configuration. | |
| **awsMonitoredServicesDto** | [**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)| The JSON body of the request. Contains updated monitored services configuration for AWS credentials. | [optional] |

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
| **204** | Success. The AWS credentials configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateAwsCredentialsConfig

> void validateCreateAwsCredentialsConfig(awsCredentialsConfig)

Validates the payload for the &#x60;POST /aws/credentials&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains the AWS credentials configuration to be validated.
        try {
            apiInstance.validateCreateAwsCredentialsConfig(awsCredentialsConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateCreateAwsCredentialsConfig");
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
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains the AWS credentials configuration to be validated. | [optional] |

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

## validateCreateAwsCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateCreateAwsCredentialsConfig validateCreateAwsCredentialsConfigWithHttpInfo(awsCredentialsConfig)

Validates the payload for the &#x60;POST /aws/credentials&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains the AWS credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateAwsCredentialsConfigWithHttpInfo(awsCredentialsConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateCreateAwsCredentialsConfig");
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
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains the AWS credentials configuration to be validated. | [optional] |

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


## validateUpdateAwsCredentialsConfig

> void validateUpdateAwsCredentialsConfig(id, awsCredentialsConfig)

Validates the payload for the &#x60;PUT /aws/credentials/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials configuration to be validated.
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains the AWS credentials configuration to be validated.
        try {
            apiInstance.validateUpdateAwsCredentialsConfig(id, awsCredentialsConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateUpdateAwsCredentialsConfig");
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
| **id** | **String**| The ID of the AWS credentials configuration to be validated. | |
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains the AWS credentials configuration to be validated. | [optional] |

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

## validateUpdateAwsCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateUpdateAwsCredentialsConfig validateUpdateAwsCredentialsConfigWithHttpInfo(id, awsCredentialsConfig)

Validates the payload for the &#x60;PUT /aws/credentials/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials configuration to be validated.
        AwsCredentialsConfig awsCredentialsConfig = new AwsCredentialsConfig(); // AwsCredentialsConfig | The JSON body of the request. Contains the AWS credentials configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateAwsCredentialsConfigWithHttpInfo(id, awsCredentialsConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateUpdateAwsCredentialsConfig");
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
| **id** | **String**| The ID of the AWS credentials configuration to be validated. | |
| **awsCredentialsConfig** | [**AwsCredentialsConfig**](AwsCredentialsConfig.md)| The JSON body of the request. Contains the AWS credentials configuration to be validated. | [optional] |

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


## validateUpdateAwsServicesConfig

> void validateUpdateAwsServicesConfig(id, awsMonitoredServicesDto)

Validates the payload for the &#x60;PUT /aws/credentials/{id}/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials for which the monitored services configuration is going to be validated.
        AwsMonitoredServicesDto awsMonitoredServicesDto = new AwsMonitoredServicesDto(); // AwsMonitoredServicesDto | The JSON body of the request. Contains a monitored services configuration for AWS credentials to be validated.
        try {
            apiInstance.validateUpdateAwsServicesConfig(id, awsMonitoredServicesDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateUpdateAwsServicesConfig");
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
| **id** | **String**| The ID of the AWS credentials for which the monitored services configuration is going to be validated. | |
| **awsMonitoredServicesDto** | [**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)| The JSON body of the request. Contains a monitored services configuration for AWS credentials to be validated. | [optional] |

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

## validateUpdateAwsServicesConfigWithHttpInfo

> ApiResponse<Void> validateUpdateAwsServicesConfig validateUpdateAwsServicesConfigWithHttpInfo(id, awsMonitoredServicesDto)

Validates the payload for the &#x60;PUT /aws/credentials/{id}/services&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsCredentialsConfigurationApi apiInstance = new AwsCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the AWS credentials for which the monitored services configuration is going to be validated.
        AwsMonitoredServicesDto awsMonitoredServicesDto = new AwsMonitoredServicesDto(); // AwsMonitoredServicesDto | The JSON body of the request. Contains a monitored services configuration for AWS credentials to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateAwsServicesConfigWithHttpInfo(id, awsMonitoredServicesDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsCredentialsConfigurationApi#validateUpdateAwsServicesConfig");
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
| **id** | **String**| The ID of the AWS credentials for which the monitored services configuration is going to be validated. | |
| **awsMonitoredServicesDto** | [**AwsMonitoredServicesDto**](AwsMonitoredServicesDto.md)| The JSON body of the request. Contains a monitored services configuration for AWS credentials to be validated. | [optional] |

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

