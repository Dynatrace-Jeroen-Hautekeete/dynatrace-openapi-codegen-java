# ServiceCustomServicesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomService**](ServiceCustomServicesApi.md#createCustomService) | **POST** /service/customServices/{technology} | Creates a custom service |
| [**createCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#createCustomServiceWithHttpInfo) | **POST** /service/customServices/{technology} | Creates a custom service |
| [**deleteCustomService**](ServiceCustomServicesApi.md#deleteCustomService) | **DELETE** /service/customServices/{technology}/{id} | Deletes the specified custom service |
| [**deleteCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#deleteCustomServiceWithHttpInfo) | **DELETE** /service/customServices/{technology}/{id} | Deletes the specified custom service |
| [**getCustomService**](ServiceCustomServicesApi.md#getCustomService) | **GET** /service/customServices/{technology}/{id} | Gets the definition of the specified custom service |
| [**getCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#getCustomServiceWithHttpInfo) | **GET** /service/customServices/{technology}/{id} | Gets the definition of the specified custom service |
| [**listCustomServices**](ServiceCustomServicesApi.md#listCustomServices) | **GET** /service/customServices/{technology} | Lists all custom services of the specified technology |
| [**listCustomServicesWithHttpInfo**](ServiceCustomServicesApi.md#listCustomServicesWithHttpInfo) | **GET** /service/customServices/{technology} | Lists all custom services of the specified technology |
| [**orderCustomServices**](ServiceCustomServicesApi.md#orderCustomServices) | **PUT** /service/customServices/{technology}/order | Reorders the custom services of the specified technology |
| [**orderCustomServicesWithHttpInfo**](ServiceCustomServicesApi.md#orderCustomServicesWithHttpInfo) | **PUT** /service/customServices/{technology}/order | Reorders the custom services of the specified technology |
| [**updateCustomService**](ServiceCustomServicesApi.md#updateCustomService) | **PUT** /service/customServices/{technology}/{id} | Updates the specified custom service or create a new one. |
| [**updateCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#updateCustomServiceWithHttpInfo) | **PUT** /service/customServices/{technology}/{id} | Updates the specified custom service or create a new one. |
| [**validateCreateCustomService**](ServiceCustomServicesApi.md#validateCreateCustomService) | **POST** /service/customServices/{technology}/validator | Validate the new custom service for the &#x60;POST /customServices/{technology}&#x60; request |
| [**validateCreateCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#validateCreateCustomServiceWithHttpInfo) | **POST** /service/customServices/{technology}/validator | Validate the new custom service for the &#x60;POST /customServices/{technology}&#x60; request |
| [**validateUpdateCustomService**](ServiceCustomServicesApi.md#validateUpdateCustomService) | **POST** /service/customServices/{technology}/{id}/validator | Validate the new custom service for the &#x60;PUT /customServices/{technology}/{id}&#x60; request |
| [**validateUpdateCustomServiceWithHttpInfo**](ServiceCustomServicesApi.md#validateUpdateCustomServiceWithHttpInfo) | **POST** /service/customServices/{technology}/{id}/validator | Validate the new custom service for the &#x60;PUT /customServices/{technology}/{id}&#x60; request |



## createCustomService

> EntityShortRepresentation createCustomService(technology, position, customService)

Creates a custom service

In the body of the request, neither custom service nor its rules can have the ID. All IDs will be generated automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the new custom service.
        String position = "APPEND"; // String | Order of the new custom service. Set to `PREPEND` to prepend it to the list, `APPEND` to append it. Defaults to `APPEND`.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the new custom service.   You must not specify the IDs for the custom service or any of its rules. The *order* field is not allowed either.
        try {
            EntityShortRepresentation result = apiInstance.createCustomService(technology, position, customService);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#createCustomService");
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
| **technology** | **String**| Technology of the new custom service. | [enum: dotNet, go, java, nodeJS, php] |
| **position** | **String**| Order of the new custom service. Set to &#x60;PREPEND&#x60; to prepend it to the list, &#x60;APPEND&#x60; to append it. Defaults to &#x60;APPEND&#x60;. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the new custom service.   You must not specify the IDs for the custom service or any of its rules. The *order* field is not allowed either. | [optional] |

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
| **201** | Success. The custom service has been created. Response contains the new service&#39;s ID and name. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createCustomServiceWithHttpInfo

> ApiResponse<EntityShortRepresentation> createCustomService createCustomServiceWithHttpInfo(technology, position, customService)

Creates a custom service

In the body of the request, neither custom service nor its rules can have the ID. All IDs will be generated automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the new custom service.
        String position = "APPEND"; // String | Order of the new custom service. Set to `PREPEND` to prepend it to the list, `APPEND` to append it. Defaults to `APPEND`.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the new custom service.   You must not specify the IDs for the custom service or any of its rules. The *order* field is not allowed either.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createCustomServiceWithHttpInfo(technology, position, customService);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#createCustomService");
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
| **technology** | **String**| Technology of the new custom service. | [enum: dotNet, go, java, nodeJS, php] |
| **position** | **String**| Order of the new custom service. Set to &#x60;PREPEND&#x60; to prepend it to the list, &#x60;APPEND&#x60; to append it. Defaults to &#x60;APPEND&#x60;. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the new custom service.   You must not specify the IDs for the custom service or any of its rules. The *order* field is not allowed either. | [optional] |

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
| **201** | Success. The custom service has been created. Response contains the new service&#39;s ID and name. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteCustomService

> void deleteCustomService(technology, id)

Deletes the specified custom service

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to delete.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to delete.
        try {
            apiInstance.deleteCustomService(technology, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#deleteCustomService");
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
| **technology** | **String**| Technology of the custom service to delete. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to delete. | |

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

## deleteCustomServiceWithHttpInfo

> ApiResponse<Void> deleteCustomService deleteCustomServiceWithHttpInfo(technology, id)

Deletes the specified custom service

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to delete.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteCustomServiceWithHttpInfo(technology, id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#deleteCustomService");
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
| **technology** | **String**| Technology of the custom service to delete. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to delete. | |

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


## getCustomService

> CustomService getCustomService(technology, id, includeProcessGroupReferences)

Gets the definition of the specified custom service

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service you're inquiring.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service you're inquiring.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments.   `false` is used if the value is not set.
        try {
            CustomService result = apiInstance.getCustomService(technology, id, includeProcessGroupReferences);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#getCustomService");
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
| **technology** | **String**| Technology of the custom service you&#39;re inquiring. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service you&#39;re inquiring. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments.   &#x60;false&#x60; is used if the value is not set. | [optional] [default to false] |

### Return type

[**CustomService**](CustomService.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getCustomServiceWithHttpInfo

> ApiResponse<CustomService> getCustomService getCustomServiceWithHttpInfo(technology, id, includeProcessGroupReferences)

Gets the definition of the specified custom service

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service you're inquiring.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service you're inquiring.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments.   `false` is used if the value is not set.
        try {
            ApiResponse<CustomService> response = apiInstance.getCustomServiceWithHttpInfo(technology, id, includeProcessGroupReferences);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#getCustomService");
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
| **technology** | **String**| Technology of the custom service you&#39;re inquiring. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service you&#39;re inquiring. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments.   &#x60;false&#x60; is used if the value is not set. | [optional] [default to false] |

### Return type

ApiResponse<[**CustomService**](CustomService.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listCustomServices

> StubList listCustomServices(technology)

Lists all custom services of the specified technology

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the required custom services.
        try {
            StubList result = apiInstance.listCustomServices(technology);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#listCustomServices");
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
| **technology** | **String**| Technology of the required custom services. | [enum: dotNet, go, java, nodeJS, php] |

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

## listCustomServicesWithHttpInfo

> ApiResponse<StubList> listCustomServices listCustomServicesWithHttpInfo(technology)

Lists all custom services of the specified technology

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the required custom services.
        try {
            ApiResponse<StubList> response = apiInstance.listCustomServicesWithHttpInfo(technology);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#listCustomServices");
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
| **technology** | **String**| Technology of the required custom services. | [enum: dotNet, go, java, nodeJS, php] |

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


## orderCustomServices

> void orderCustomServices(technology, stubList)

Reorders the custom services of the specified technology

This request reorders the custom services of the specified technology according to the given list of IDs. Custom services not present in the body of the request will retain their relative ordering but will be ordered *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of custom services to update.
        StubList stubList = new StubList(); // StubList | JSON body of the request containing the IDs of the custom services in the desired order. Any further properties (*name*, *description*) will be ignored.
        try {
            apiInstance.orderCustomServices(technology, stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#orderCustomServices");
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
| **technology** | **String**| Technology of custom services to update. | [enum: dotNet, go, java, nodeJS, php] |
| **stubList** | [**StubList**](StubList.md)| JSON body of the request containing the IDs of the custom services in the desired order. Any further properties (*name*, *description*) will be ignored. | [optional] |

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
| **204** | Success. Custom services have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## orderCustomServicesWithHttpInfo

> ApiResponse<Void> orderCustomServices orderCustomServicesWithHttpInfo(technology, stubList)

Reorders the custom services of the specified technology

This request reorders the custom services of the specified technology according to the given list of IDs. Custom services not present in the body of the request will retain their relative ordering but will be ordered *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of custom services to update.
        StubList stubList = new StubList(); // StubList | JSON body of the request containing the IDs of the custom services in the desired order. Any further properties (*name*, *description*) will be ignored.
        try {
            ApiResponse<Void> response = apiInstance.orderCustomServicesWithHttpInfo(technology, stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#orderCustomServices");
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
| **technology** | **String**| Technology of custom services to update. | [enum: dotNet, go, java, nodeJS, php] |
| **stubList** | [**StubList**](StubList.md)| JSON body of the request containing the IDs of the custom services in the desired order. Any further properties (*name*, *description*) will be ignored. | [optional] |

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
| **204** | Success. Custom services have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## updateCustomService

> EntityShortRepresentation updateCustomService(technology, id, customService)

Updates the specified custom service or create a new one.

Will use the config&#39;s ´order´ attribute if supplied, otherwise keeps the order of the existing config or appends if no existing config with the supplied ID was found.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to update.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to update.   The ID of the custom service in the body of the request must match this ID.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing updated definition of the custom service. If *order* is present, it will be used.
        try {
            EntityShortRepresentation result = apiInstance.updateCustomService(technology, id, customService);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#updateCustomService");
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
| **technology** | **String**| Technology of the custom service to update. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to update.   The ID of the custom service in the body of the request must match this ID. | |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing updated definition of the custom service. If *order* is present, it will be used. | [optional] |

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
| **201** | Success. Custom service has been created. Response contains the new service&#39;s ID and name. |  -  |
| **204** | Success. Custom service has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateCustomServiceWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateCustomService updateCustomServiceWithHttpInfo(technology, id, customService)

Updates the specified custom service or create a new one.

Will use the config&#39;s ´order´ attribute if supplied, otherwise keeps the order of the existing config or appends if no existing config with the supplied ID was found.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to update.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to update.   The ID of the custom service in the body of the request must match this ID.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing updated definition of the custom service. If *order* is present, it will be used.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateCustomServiceWithHttpInfo(technology, id, customService);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#updateCustomService");
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
| **technology** | **String**| Technology of the custom service to update. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to update.   The ID of the custom service in the body of the request must match this ID. | |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing updated definition of the custom service. If *order* is present, it will be used. | [optional] |

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
| **201** | Success. Custom service has been created. Response contains the new service&#39;s ID and name. |  -  |
| **204** | Success. Custom service has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateCustomService

> void validateCreateCustomService(technology, customService)

Validate the new custom service for the &#x60;POST /customServices/{technology}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to validate.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the custom service to validate.
        try {
            apiInstance.validateCreateCustomService(technology, customService);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#validateCreateCustomService");
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
| **technology** | **String**| Technology of the custom service to validate. | [enum: dotNet, go, java, nodeJS, php] |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the custom service to validate. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateCreateCustomServiceWithHttpInfo

> ApiResponse<Void> validateCreateCustomService validateCreateCustomServiceWithHttpInfo(technology, customService)

Validate the new custom service for the &#x60;POST /customServices/{technology}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to validate.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the custom service to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateCustomServiceWithHttpInfo(technology, customService);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#validateCreateCustomService");
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
| **technology** | **String**| Technology of the custom service to validate. | [enum: dotNet, go, java, nodeJS, php] |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the custom service to validate. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |


## validateUpdateCustomService

> void validateUpdateCustomService(technology, id, customService)

Validate the new custom service for the &#x60;PUT /customServices/{technology}/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to validate.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to validate.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the custom service to validate.
        try {
            apiInstance.validateUpdateCustomService(technology, id, customService);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#validateUpdateCustomService");
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
| **technology** | **String**| Technology of the custom service to validate. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to validate. | |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the custom service to validate. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateUpdateCustomServiceWithHttpInfo

> ApiResponse<Void> validateUpdateCustomService validateUpdateCustomServiceWithHttpInfo(technology, id, customService)

Validate the new custom service for the &#x60;PUT /customServices/{technology}/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceCustomServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceCustomServicesApi apiInstance = new ServiceCustomServicesApi(defaultClient);
        String technology = "dotNet"; // String | Technology of the custom service to validate.
        UUID id = UUID.randomUUID(); // UUID | The ID of the custom service to validate.
        CustomService customService = new CustomService(); // CustomService | JSON body of the request containing definition of the custom service to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateCustomServiceWithHttpInfo(technology, id, customService);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceCustomServicesApi#validateUpdateCustomService");
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
| **technology** | **String**| Technology of the custom service to validate. | [enum: dotNet, go, java, nodeJS, php] |
| **id** | **UUID**| The ID of the custom service to validate. | |
| **customService** | [**CustomService**](CustomService.md)| JSON body of the request containing definition of the custom service to validate. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

