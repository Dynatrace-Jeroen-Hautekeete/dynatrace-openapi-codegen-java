# CloudFoundryCredentialsConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#createCloudFoundryCredentialsConfig) | **POST** /cloudFoundry/credentials | Create new credentials for a single foundation. | maturity&#x3D;EARLY_ADOPTER |
| [**createCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#createCloudFoundryCredentialsConfigWithHttpInfo) | **POST** /cloudFoundry/credentials | Create new credentials for a single foundation. | maturity&#x3D;EARLY_ADOPTER |
| [**deleteCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#deleteCloudFoundryCredentialsConfig) | **DELETE** /cloudFoundry/credentials/{id} | Delete the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**deleteCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#deleteCloudFoundryCredentialsConfigWithHttpInfo) | **DELETE** /cloudFoundry/credentials/{id} | Delete the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**getCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#getCloudFoundryCredentialsConfig) | **GET** /cloudFoundry/credentials/{id} | Show the properties for the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**getCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#getCloudFoundryCredentialsConfigWithHttpInfo) | **GET** /cloudFoundry/credentials/{id} | Show the properties for the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**listCloudFoundryCredentialsConfigs**](CloudFoundryCredentialsConfigurationApi.md#listCloudFoundryCredentialsConfigs) | **GET** /cloudFoundry/credentials | List all the Cloud Foundry foundations credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**listCloudFoundryCredentialsConfigsWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#listCloudFoundryCredentialsConfigsWithHttpInfo) | **GET** /cloudFoundry/credentials | List all the Cloud Foundry foundations credentials. | maturity&#x3D;EARLY_ADOPTER |
| [**updateCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#updateCloudFoundryCredentialsConfig) | **PUT** /cloudFoundry/credentials/{id} | Create or update credentials for a single Cloud Foundry foundation. | maturity&#x3D;EARLY_ADOPTER |
| [**updateCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#updateCloudFoundryCredentialsConfigWithHttpInfo) | **PUT** /cloudFoundry/credentials/{id} | Create or update credentials for a single Cloud Foundry foundation. | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#validateCreateCloudFoundryCredentialsConfig) | **POST** /cloudFoundry/credentials/validator | Validate that creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#validateCreateCloudFoundryCredentialsConfigWithHttpInfo) | **POST** /cloudFoundry/credentials/validator | Validate that creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateCloudFoundryCredentialsConfig**](CloudFoundryCredentialsConfigurationApi.md#validateUpdateCloudFoundryCredentialsConfig) | **POST** /cloudFoundry/credentials/{id}/validator | Validate that updating or creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateCloudFoundryCredentialsConfigWithHttpInfo**](CloudFoundryCredentialsConfigurationApi.md#validateUpdateCloudFoundryCredentialsConfigWithHttpInfo) | **POST** /cloudFoundry/credentials/{id}/validator | Validate that updating or creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER |



## createCloudFoundryCredentialsConfig

> EntityShortRepresentation createCloudFoundryCredentialsConfig(cloudFoundryCredentials)

Create new credentials for a single foundation. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name`, `apiUrl` and `loginUrl` must be unique.
        try {
            EntityShortRepresentation result = apiInstance.createCloudFoundryCredentialsConfig(cloudFoundryCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#createCloudFoundryCredentialsConfig");
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
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60;, &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be unique. | |

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
| **201** | Success. Cloud Foundry foundation credentials have been created. The ID and name of the new credentials are returned. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createCloudFoundryCredentialsConfig createCloudFoundryCredentialsConfigWithHttpInfo(cloudFoundryCredentials)

Create new credentials for a single foundation. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name`, `apiUrl` and `loginUrl` must be unique.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createCloudFoundryCredentialsConfigWithHttpInfo(cloudFoundryCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#createCloudFoundryCredentialsConfig");
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
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60;, &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be unique. | |

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
| **201** | Success. Cloud Foundry foundation credentials have been created. The ID and name of the new credentials are returned. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteCloudFoundryCredentialsConfig

> void deleteCloudFoundryCredentialsConfig(id)

Delete the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials to be deleted.
        try {
            apiInstance.deleteCloudFoundryCredentialsConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#deleteCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials to be deleted. | |

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
| **204** | Deleted. Response does not have a body. |  -  |

## deleteCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<Void> deleteCloudFoundryCredentialsConfig deleteCloudFoundryCredentialsConfigWithHttpInfo(id)

Delete the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteCloudFoundryCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#deleteCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials to be deleted. | |

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
| **204** | Deleted. Response does not have a body. |  -  |


## getCloudFoundryCredentialsConfig

> CloudFoundryCredentials getCloudFoundryCredentialsConfig(id)

Show the properties for the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Cloud Foundry foundation credentials.
        try {
            CloudFoundryCredentials result = apiInstance.getCloudFoundryCredentialsConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#getCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the required Cloud Foundry foundation credentials. | |

### Return type

[**CloudFoundryCredentials**](CloudFoundryCredentials.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<CloudFoundryCredentials> getCloudFoundryCredentialsConfig getCloudFoundryCredentialsConfigWithHttpInfo(id)

Show the properties for the specified Cloud Foundry foundation credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required Cloud Foundry foundation credentials.
        try {
            ApiResponse<CloudFoundryCredentials> response = apiInstance.getCloudFoundryCredentialsConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#getCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the required Cloud Foundry foundation credentials. | |

### Return type

ApiResponse<[**CloudFoundryCredentials**](CloudFoundryCredentials.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listCloudFoundryCredentialsConfigs

> StubList listCloudFoundryCredentialsConfigs()

List all the Cloud Foundry foundations credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        try {
            StubList result = apiInstance.listCloudFoundryCredentialsConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#listCloudFoundryCredentialsConfigs");
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

## listCloudFoundryCredentialsConfigsWithHttpInfo

> ApiResponse<StubList> listCloudFoundryCredentialsConfigs listCloudFoundryCredentialsConfigsWithHttpInfo()

List all the Cloud Foundry foundations credentials. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listCloudFoundryCredentialsConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#listCloudFoundryCredentialsConfigs");
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


## updateCloudFoundryCredentialsConfig

> EntityShortRepresentation updateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials)

Create or update credentials for a single Cloud Foundry foundation. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials.
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name` must be unique. `password` can be omitted for updates, the existing one will be used. `apiUrl` and `loginUrl` must be set and may not differ from the existing config if it exists. Use this endpoint for copying credentials between environments while keeping their IDs and for updating existing credentials. You can *not* use this to create new credentials with an arbitrary ID, use POST instead.
        try {
            EntityShortRepresentation result = apiInstance.updateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#updateCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials. | |
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60; must be unique. &#x60;password&#x60; can be omitted for updates, the existing one will be used. &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be set and may not differ from the existing config if it exists. Use this endpoint for copying credentials between environments while keeping their IDs and for updating existing credentials. You can *not* use this to create new credentials with an arbitrary ID, use POST instead. | |

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
| **201** | Success. Cloud Foundry foundation credentials have been created. The ID and name of the new credentials are returned. |  -  |
| **204** | Success. Cloud Foundry foundation credentials have been successfully updated. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateCloudFoundryCredentialsConfig updateCloudFoundryCredentialsConfigWithHttpInfo(id, cloudFoundryCredentials)

Create or update credentials for a single Cloud Foundry foundation. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials.
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name` must be unique. `password` can be omitted for updates, the existing one will be used. `apiUrl` and `loginUrl` must be set and may not differ from the existing config if it exists. Use this endpoint for copying credentials between environments while keeping their IDs and for updating existing credentials. You can *not* use this to create new credentials with an arbitrary ID, use POST instead.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateCloudFoundryCredentialsConfigWithHttpInfo(id, cloudFoundryCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#updateCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials. | |
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60; must be unique. &#x60;password&#x60; can be omitted for updates, the existing one will be used. &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be set and may not differ from the existing config if it exists. Use this endpoint for copying credentials between environments while keeping their IDs and for updating existing credentials. You can *not* use this to create new credentials with an arbitrary ID, use POST instead. | |

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
| **201** | Success. Cloud Foundry foundation credentials have been created. The ID and name of the new credentials are returned. |  -  |
| **204** | Success. Cloud Foundry foundation credentials have been successfully updated. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateCloudFoundryCredentialsConfig

> void validateCreateCloudFoundryCredentialsConfig(cloudFoundryCredentials)

Validate that creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name`, `apiUrl` and `loginUrl` must be unique.
        try {
            apiInstance.validateCreateCloudFoundryCredentialsConfig(cloudFoundryCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#validateCreateCloudFoundryCredentialsConfig");
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
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60;, &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be unique. | |

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
| **204** | Validated. The submitted credentials are valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateCreateCloudFoundryCredentialsConfig validateCreateCloudFoundryCredentialsConfigWithHttpInfo(cloudFoundryCredentials)

Validate that creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name`, `apiUrl` and `loginUrl` must be unique.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateCloudFoundryCredentialsConfigWithHttpInfo(cloudFoundryCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#validateCreateCloudFoundryCredentialsConfig");
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
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60;, &#x60;apiUrl&#x60; and &#x60;loginUrl&#x60; must be unique. | |

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
| **204** | Validated. The submitted credentials are valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateCloudFoundryCredentialsConfig

> void validateUpdateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials)

Validate that updating or creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials.
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name` must be unique. `password` can be omitted for updates. See the constraints for the PUT /cloudFoundry/credentials/{id} request.
        try {
            apiInstance.validateUpdateCloudFoundryCredentialsConfig(id, cloudFoundryCredentials);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#validateUpdateCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials. | |
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60; must be unique. &#x60;password&#x60; can be omitted for updates. See the constraints for the PUT /cloudFoundry/credentials/{id} request. | |

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
| **204** | Validated. The submitted credentials are valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateCloudFoundryCredentialsConfigWithHttpInfo

> ApiResponse<Void> validateUpdateCloudFoundryCredentialsConfig validateUpdateCloudFoundryCredentialsConfigWithHttpInfo(id, cloudFoundryCredentials)

Validate that updating or creating credentials would be successful. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.CloudFoundryCredentialsConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CloudFoundryCredentialsConfigurationApi apiInstance = new CloudFoundryCredentialsConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the Cloud Foundry foundation credentials.
        CloudFoundryCredentials cloudFoundryCredentials = new CloudFoundryCredentials(); // CloudFoundryCredentials | `name` must be unique. `password` can be omitted for updates. See the constraints for the PUT /cloudFoundry/credentials/{id} request.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateCloudFoundryCredentialsConfigWithHttpInfo(id, cloudFoundryCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudFoundryCredentialsConfigurationApi#validateUpdateCloudFoundryCredentialsConfig");
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
| **id** | **String**| The ID of the Cloud Foundry foundation credentials. | |
| **cloudFoundryCredentials** | [**CloudFoundryCredentials**](CloudFoundryCredentials.md)| &#x60;name&#x60; must be unique. &#x60;password&#x60; can be omitted for updates. See the constraints for the PUT /cloudFoundry/credentials/{id} request. | |

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
| **204** | Validated. The submitted credentials are valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

