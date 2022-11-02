# ServiceRequestAttributesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequestAttributesConfig**](ServiceRequestAttributesApi.md#createRequestAttributesConfig) | **POST** /service/requestAttributes | Creates a new request attribute |
| [**createRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#createRequestAttributesConfigWithHttpInfo) | **POST** /service/requestAttributes | Creates a new request attribute |
| [**deleteRequestAttributesConfig**](ServiceRequestAttributesApi.md#deleteRequestAttributesConfig) | **DELETE** /service/requestAttributes/{id} | Deletes the specified request attribute |
| [**deleteRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#deleteRequestAttributesConfigWithHttpInfo) | **DELETE** /service/requestAttributes/{id} | Deletes the specified request attribute |
| [**getRequestAttributesConfig**](ServiceRequestAttributesApi.md#getRequestAttributesConfig) | **GET** /service/requestAttributes/{id} | Shows the properties of the specified request attribute |
| [**getRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#getRequestAttributesConfigWithHttpInfo) | **GET** /service/requestAttributes/{id} | Shows the properties of the specified request attribute |
| [**listRequestAttributesConfigs**](ServiceRequestAttributesApi.md#listRequestAttributesConfigs) | **GET** /service/requestAttributes | Lists all available request attributes |
| [**listRequestAttributesConfigsWithHttpInfo**](ServiceRequestAttributesApi.md#listRequestAttributesConfigsWithHttpInfo) | **GET** /service/requestAttributes | Lists all available request attributes |
| [**updateRequestAttributesConfig**](ServiceRequestAttributesApi.md#updateRequestAttributesConfig) | **PUT** /service/requestAttributes/{id} | Updates an existing request attribute or creates a new one |
| [**updateRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#updateRequestAttributesConfigWithHttpInfo) | **PUT** /service/requestAttributes/{id} | Updates an existing request attribute or creates a new one |
| [**validateCreateRequestAttributesConfig**](ServiceRequestAttributesApi.md#validateCreateRequestAttributesConfig) | **POST** /service/requestAttributes/validator | Validates new request attributes for the &#x60;POST /requestAttributes&#x60; request |
| [**validateCreateRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#validateCreateRequestAttributesConfigWithHttpInfo) | **POST** /service/requestAttributes/validator | Validates new request attributes for the &#x60;POST /requestAttributes&#x60; request |
| [**validateUpdateRequestAttributesConfig**](ServiceRequestAttributesApi.md#validateUpdateRequestAttributesConfig) | **POST** /service/requestAttributes/{id}/validator | Validate updates of existing request attribute for the &#x60;PUT /requestAttributes/{id}&#x60; request |
| [**validateUpdateRequestAttributesConfigWithHttpInfo**](ServiceRequestAttributesApi.md#validateUpdateRequestAttributesConfigWithHttpInfo) | **POST** /service/requestAttributes/{id}/validator | Validate updates of existing request attribute for the &#x60;PUT /requestAttributes/{id}&#x60; request |



## createRequestAttributesConfig

> EntityShortRepresentation createRequestAttributesConfig(requestAttribute)

Creates a new request attribute

The body must not provide an ID as IDs are automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            EntityShortRepresentation result = apiInstance.createRequestAttributesConfig(requestAttribute);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#createRequestAttributesConfig");
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
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **201** | Success. Request attribute has been created. The ID of the new configuration is returned. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRequestAttributesConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRequestAttributesConfig createRequestAttributesConfigWithHttpInfo(requestAttribute)

Creates a new request attribute

The body must not provide an ID as IDs are automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRequestAttributesConfigWithHttpInfo(requestAttribute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#createRequestAttributesConfig");
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
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **201** | Success. Request attribute has been created. The ID of the new configuration is returned. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRequestAttributesConfig

> void deleteRequestAttributesConfig(id)

Deletes the specified request attribute

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be deleted.
        try {
            apiInstance.deleteRequestAttributesConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#deleteRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be deleted. | |

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

## deleteRequestAttributesConfigWithHttpInfo

> ApiResponse<Void> deleteRequestAttributesConfig deleteRequestAttributesConfigWithHttpInfo(id)

Deletes the specified request attribute

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRequestAttributesConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#deleteRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be deleted. | |

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


## getRequestAttributesConfig

> RequestAttribute getRequestAttributesConfig(id, includeProcessGroupReferences)

Shows the properties of the specified request attribute

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required request attribute.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process Group group references aren't compatible across environments.
        try {
            RequestAttribute result = apiInstance.getRequestAttributesConfig(id, includeProcessGroupReferences);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#getRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the required request attribute. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process Group group references aren&#39;t compatible across environments. | [optional] [default to false] |

### Return type

[**RequestAttribute**](RequestAttribute.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRequestAttributesConfigWithHttpInfo

> ApiResponse<RequestAttribute> getRequestAttributesConfig getRequestAttributesConfigWithHttpInfo(id, includeProcessGroupReferences)

Shows the properties of the specified request attribute

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required request attribute.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process Group group references aren't compatible across environments.
        try {
            ApiResponse<RequestAttribute> response = apiInstance.getRequestAttributesConfigWithHttpInfo(id, includeProcessGroupReferences);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#getRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the required request attribute. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process Group group references aren&#39;t compatible across environments. | [optional] [default to false] |

### Return type

ApiResponse<[**RequestAttribute**](RequestAttribute.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listRequestAttributesConfigs

> StubList listRequestAttributesConfigs()

Lists all available request attributes

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        try {
            StubList result = apiInstance.listRequestAttributesConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#listRequestAttributesConfigs");
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

## listRequestAttributesConfigsWithHttpInfo

> ApiResponse<StubList> listRequestAttributesConfigs listRequestAttributesConfigsWithHttpInfo()

Lists all available request attributes

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listRequestAttributesConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#listRequestAttributesConfigs");
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


## updateRequestAttributesConfig

> EntityShortRepresentation updateRequestAttributesConfig(id, requestAttribute)

Updates an existing request attribute or creates a new one

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be updated.   If you set the ID in the body as well, it must match this ID.
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            EntityShortRepresentation result = apiInstance.updateRequestAttributesConfig(id, requestAttribute);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#updateRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **201** | Success. The request attribute with the specified ID has been created. The ID of the new configuration is returned. |  -  |
| **204** | Success. Request attribute has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateRequestAttributesConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateRequestAttributesConfig updateRequestAttributesConfigWithHttpInfo(id, requestAttribute)

Updates an existing request attribute or creates a new one

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be updated.   If you set the ID in the body as well, it must match this ID.
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateRequestAttributesConfigWithHttpInfo(id, requestAttribute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#updateRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **201** | Success. The request attribute with the specified ID has been created. The ID of the new configuration is returned. |  -  |
| **204** | Success. Request attribute has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateRequestAttributesConfig

> void validateCreateRequestAttributesConfig(requestAttribute)

Validates new request attributes for the &#x60;POST /requestAttributes&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            apiInstance.validateCreateRequestAttributesConfig(requestAttribute);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#validateCreateRequestAttributesConfig");
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
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateRequestAttributesConfigWithHttpInfo

> ApiResponse<Void> validateCreateRequestAttributesConfig validateCreateRequestAttributesConfigWithHttpInfo(requestAttribute)

Validates new request attributes for the &#x60;POST /requestAttributes&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRequestAttributesConfigWithHttpInfo(requestAttribute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#validateCreateRequestAttributesConfig");
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
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateRequestAttributesConfig

> void validateUpdateRequestAttributesConfig(id, requestAttribute)

Validate updates of existing request attribute for the &#x60;PUT /requestAttributes/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be validated.
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            apiInstance.validateUpdateRequestAttributesConfig(id, requestAttribute);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#validateUpdateRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be validated. | |
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateRequestAttributesConfigWithHttpInfo

> ApiResponse<Void> validateUpdateRequestAttributesConfig validateUpdateRequestAttributesConfigWithHttpInfo(id, requestAttribute)

Validate updates of existing request attribute for the &#x60;PUT /requestAttributes/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestAttributesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestAttributesApi apiInstance = new ServiceRequestAttributesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request attribute to be validated.
        RequestAttribute requestAttribute = new RequestAttribute(); // RequestAttribute | 
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRequestAttributesConfigWithHttpInfo(id, requestAttribute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestAttributesApi#validateUpdateRequestAttributesConfig");
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
| **id** | **UUID**| The ID of the request attribute to be validated. | |
| **requestAttribute** | [**RequestAttribute**](RequestAttribute.md)|  | |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

