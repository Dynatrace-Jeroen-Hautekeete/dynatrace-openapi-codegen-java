# ServiceRequestNamingApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequestNaming**](ServiceRequestNamingApi.md#createRequestNaming) | **POST** /service/requestNaming | Creates a new request naming rule |
| [**createRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#createRequestNamingWithHttpInfo) | **POST** /service/requestNaming | Creates a new request naming rule |
| [**deleteRequestNaming**](ServiceRequestNamingApi.md#deleteRequestNaming) | **DELETE** /service/requestNaming/{id} | Deletes the specified request naming rule |
| [**deleteRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#deleteRequestNamingWithHttpInfo) | **DELETE** /service/requestNaming/{id} | Deletes the specified request naming rule |
| [**get**](ServiceRequestNamingApi.md#get) | **GET** /service/resourceNaming | Lists the global service resource requests. |
| [**getWithHttpInfo**](ServiceRequestNamingApi.md#getWithHttpInfo) | **GET** /service/resourceNaming | Lists the global service resource requests. |
| [**getRequestNaming**](ServiceRequestNamingApi.md#getRequestNaming) | **GET** /service/requestNaming/{id} | Gets the parameters of the specified request naming rule |
| [**getRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#getRequestNamingWithHttpInfo) | **GET** /service/requestNaming/{id} | Gets the parameters of the specified request naming rule |
| [**listRequestNaming**](ServiceRequestNamingApi.md#listRequestNaming) | **GET** /service/requestNaming | Lists all request naming rules along with their parameters |
| [**listRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#listRequestNamingWithHttpInfo) | **GET** /service/requestNaming | Lists all request naming rules along with their parameters |
| [**orderRequestNaming**](ServiceRequestNamingApi.md#orderRequestNaming) | **PUT** /service/requestNaming/order | Reorders the request namings |
| [**orderRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#orderRequestNamingWithHttpInfo) | **PUT** /service/requestNaming/order | Reorders the request namings |
| [**put**](ServiceRequestNamingApi.md#put) | **PUT** /service/resourceNaming | Updates the global service resource requests. |
| [**putWithHttpInfo**](ServiceRequestNamingApi.md#putWithHttpInfo) | **PUT** /service/resourceNaming | Updates the global service resource requests. |
| [**updateRequestNaming**](ServiceRequestNamingApi.md#updateRequestNaming) | **PUT** /service/requestNaming/{id} | Updates the specified request naming rule |
| [**updateRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#updateRequestNamingWithHttpInfo) | **PUT** /service/requestNaming/{id} | Updates the specified request naming rule |
| [**validate**](ServiceRequestNamingApi.md#validate) | **POST** /service/resourceNaming/validator | Validates new resource requests settings for the &#x60;PUT /service/resourceRequest&#x60; request. |
| [**validateWithHttpInfo**](ServiceRequestNamingApi.md#validateWithHttpInfo) | **POST** /service/resourceNaming/validator | Validates new resource requests settings for the &#x60;PUT /service/resourceRequest&#x60; request. |
| [**validateCreateRequestNaming**](ServiceRequestNamingApi.md#validateCreateRequestNaming) | **POST** /service/requestNaming/validator | Validates the new request naming rule for the &#x60;POST /requestNaming&#x60; request |
| [**validateCreateRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#validateCreateRequestNamingWithHttpInfo) | **POST** /service/requestNaming/validator | Validates the new request naming rule for the &#x60;POST /requestNaming&#x60; request |
| [**validateUpdateRequestNaming**](ServiceRequestNamingApi.md#validateUpdateRequestNaming) | **POST** /service/requestNaming/{id}/validator | Validates the new request naming for the &#x60;PUT /requestNaming/{id}&#x60; request |
| [**validateUpdateRequestNamingWithHttpInfo**](ServiceRequestNamingApi.md#validateUpdateRequestNamingWithHttpInfo) | **POST** /service/requestNaming/{id}/validator | Validates the new request naming for the &#x60;PUT /requestNaming/{id}&#x60; request |



## createRequestNaming

> EntityShortRepresentation createRequestNaming(position, requestNaming)

Creates a new request naming rule

The new rule goes to the end of the rules list and will be the last to evaluate. Existing rules remain unaffected.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        String position = "APPEND"; // String | Order of the new request naming rule. Set to `PREPEND` to prepend it to the list, `APPEND` to append it. Defaults to `APPEND`.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule!
        try {
            EntityShortRepresentation result = apiInstance.createRequestNaming(position, requestNaming);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#createRequestNaming");
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
| **position** | **String**| Order of the new request naming rule. Set to &#x60;PREPEND&#x60; to prepend it to the list, &#x60;APPEND&#x60; to append it. Defaults to &#x60;APPEND&#x60;. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule! | [optional] |

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
| **201** | Success. The request naming has been created. Response contains the new service&#39;s ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRequestNamingWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRequestNaming createRequestNamingWithHttpInfo(position, requestNaming)

Creates a new request naming rule

The new rule goes to the end of the rules list and will be the last to evaluate. Existing rules remain unaffected.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        String position = "APPEND"; // String | Order of the new request naming rule. Set to `PREPEND` to prepend it to the list, `APPEND` to append it. Defaults to `APPEND`.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule!
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRequestNamingWithHttpInfo(position, requestNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#createRequestNaming");
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
| **position** | **String**| Order of the new request naming rule. Set to &#x60;PREPEND&#x60; to prepend it to the list, &#x60;APPEND&#x60; to append it. Defaults to &#x60;APPEND&#x60;. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule! | [optional] |

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
| **201** | Success. The request naming has been created. Response contains the new service&#39;s ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRequestNaming

> void deleteRequestNaming(id)

Deletes the specified request naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming rule to be deleted.
        try {
            apiInstance.deleteRequestNaming(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#deleteRequestNaming");
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
| **id** | **UUID**| The ID of the request naming rule to be deleted. | |

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
| **204** | Success. The rule has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteRequestNamingWithHttpInfo

> ApiResponse<Void> deleteRequestNaming deleteRequestNamingWithHttpInfo(id)

Deletes the specified request naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRequestNamingWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#deleteRequestNaming");
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
| **id** | **UUID**| The ID of the request naming rule to be deleted. | |

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
| **204** | Success. The rule has been deleted. Response doesn&#39;t have a body. |  -  |


## get

> ResourceNaming get()

Lists the global service resource requests.

Lists all extensions which currently are renamed to e.g., &#x60;Image&#x60;

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        try {
            ResourceNaming result = apiInstance.get();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#get");
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

[**ResourceNaming**](ResourceNaming.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getWithHttpInfo

> ApiResponse<ResourceNaming> get getWithHttpInfo()

Lists the global service resource requests.

Lists all extensions which currently are renamed to e.g., &#x60;Image&#x60;

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        try {
            ApiResponse<ResourceNaming> response = apiInstance.getWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#get");
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

ApiResponse<[**ResourceNaming**](ResourceNaming.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRequestNaming

> RequestNaming getRequestNaming(id)

Gets the parameters of the specified request naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming rule you're inquiring.
        try {
            RequestNaming result = apiInstance.getRequestNaming(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#getRequestNaming");
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
| **id** | **UUID**| The ID of the request naming rule you&#39;re inquiring. | |

### Return type

[**RequestNaming**](RequestNaming.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRequestNamingWithHttpInfo

> ApiResponse<RequestNaming> getRequestNaming getRequestNamingWithHttpInfo(id)

Gets the parameters of the specified request naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming rule you're inquiring.
        try {
            ApiResponse<RequestNaming> response = apiInstance.getRequestNamingWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#getRequestNaming");
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
| **id** | **UUID**| The ID of the request naming rule you&#39;re inquiring. | |

### Return type

ApiResponse<[**RequestNaming**](RequestNaming.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listRequestNaming

> StubList listRequestNaming()

Lists all request naming rules along with their parameters

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        try {
            StubList result = apiInstance.listRequestNaming();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#listRequestNaming");
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

## listRequestNamingWithHttpInfo

> ApiResponse<StubList> listRequestNaming listRequestNamingWithHttpInfo()

Lists all request naming rules along with their parameters

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listRequestNamingWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#listRequestNaming");
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


## orderRequestNaming

> void orderRequestNaming(stubList)

Reorders the request namings

This request reorders the request namings according to the given list of IDs. Request namings not present in the body of the request will retain their relative ordering but will be ordered *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        StubList stubList = new StubList(); // StubList | JSON body of the request containing the IDs of the request naming rules in the desired order. Any further properties (*name*, *description*) will be ignored.
        try {
            apiInstance.orderRequestNaming(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#orderRequestNaming");
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
| **stubList** | [**StubList**](StubList.md)| JSON body of the request containing the IDs of the request naming rules in the desired order. Any further properties (*name*, *description*) will be ignored. | [optional] |

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
| **204** | Success. Request namings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## orderRequestNamingWithHttpInfo

> ApiResponse<Void> orderRequestNaming orderRequestNamingWithHttpInfo(stubList)

Reorders the request namings

This request reorders the request namings according to the given list of IDs. Request namings not present in the body of the request will retain their relative ordering but will be ordered *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        StubList stubList = new StubList(); // StubList | JSON body of the request containing the IDs of the request naming rules in the desired order. Any further properties (*name*, *description*) will be ignored.
        try {
            ApiResponse<Void> response = apiInstance.orderRequestNamingWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#orderRequestNaming");
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
| **stubList** | [**StubList**](StubList.md)| JSON body of the request containing the IDs of the request naming rules in the desired order. Any further properties (*name*, *description*) will be ignored. | [optional] |

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
| **204** | Success. Request namings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## put

> void put(resourceNaming)

Updates the global service resource requests.

Update all extensions which are renamed to &#x60;Image&#x60; or &#x60;Binary&#x60;

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        ResourceNaming resourceNaming = new ResourceNaming(); // ResourceNaming | 
        try {
            apiInstance.put(resourceNaming);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#put");
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
| **resourceNaming** | [**ResourceNaming**](ResourceNaming.md)|  | |

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
| **204** | Success. The configuration is updated. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |

## putWithHttpInfo

> ApiResponse<Void> put putWithHttpInfo(resourceNaming)

Updates the global service resource requests.

Update all extensions which are renamed to &#x60;Image&#x60; or &#x60;Binary&#x60;

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        ResourceNaming resourceNaming = new ResourceNaming(); // ResourceNaming | 
        try {
            ApiResponse<Void> response = apiInstance.putWithHttpInfo(resourceNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#put");
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
| **resourceNaming** | [**ResourceNaming**](ResourceNaming.md)|  | |

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
| **204** | Success. The configuration is updated. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |


## updateRequestNaming

> EntityShortRepresentation updateRequestNaming(id, requestNaming)

Updates the specified request naming rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing updated parameters of the request naming.
        try {
            EntityShortRepresentation result = apiInstance.updateRequestNaming(id, requestNaming);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#updateRequestNaming");
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
| **id** | **UUID**| The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID. | |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing updated parameters of the request naming. | [optional] |

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
| **201** | Success. Request naming rule has been created. Response contains the new request naming rule&#39;s ID and name. |  -  |
| **204** | Success. Request naming rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateRequestNamingWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateRequestNaming updateRequestNamingWithHttpInfo(id, requestNaming)

Updates the specified request naming rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing updated parameters of the request naming.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateRequestNamingWithHttpInfo(id, requestNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#updateRequestNaming");
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
| **id** | **UUID**| The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID. | |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing updated parameters of the request naming. | [optional] |

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
| **201** | Success. Request naming rule has been created. Response contains the new request naming rule&#39;s ID and name. |  -  |
| **204** | Success. Request naming rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validate

> void validate(resourceNaming)

Validates new resource requests settings for the &#x60;PUT /service/resourceRequest&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        ResourceNaming resourceNaming = new ResourceNaming(); // ResourceNaming | 
        try {
            apiInstance.validate(resourceNaming);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validate");
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
| **resourceNaming** | [**ResourceNaming**](ResourceNaming.md)|  | |

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
| **400** | Failed. The input is invalid. See the response body for details. |  -  |

## validateWithHttpInfo

> ApiResponse<Void> validate validateWithHttpInfo(resourceNaming)

Validates new resource requests settings for the &#x60;PUT /service/resourceRequest&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        ResourceNaming resourceNaming = new ResourceNaming(); // ResourceNaming | 
        try {
            ApiResponse<Void> response = apiInstance.validateWithHttpInfo(resourceNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validate");
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
| **resourceNaming** | [**ResourceNaming**](ResourceNaming.md)|  | |

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
| **400** | Failed. The input is invalid. See the response body for details. |  -  |


## validateCreateRequestNaming

> void validateCreateRequestNaming(requestNaming)

Validates the new request naming rule for the &#x60;POST /requestNaming&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule!
        try {
            apiInstance.validateCreateRequestNaming(requestNaming);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validateCreateRequestNaming");
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
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule! | [optional] |

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

## validateCreateRequestNamingWithHttpInfo

> ApiResponse<Void> validateCreateRequestNaming validateCreateRequestNamingWithHttpInfo(requestNaming)

Validates the new request naming rule for the &#x60;POST /requestNaming&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule!
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRequestNamingWithHttpInfo(requestNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validateCreateRequestNaming");
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
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing parameters of the new request naming rule.    You must not specify the ID of the rule! | [optional] |

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


## validateUpdateRequestNaming

> void validateUpdateRequestNaming(id, requestNaming)

Validates the new request naming for the &#x60;PUT /requestNaming/{id}&#x60; request

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing updated parameters of the request naming.
        try {
            apiInstance.validateUpdateRequestNaming(id, requestNaming);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validateUpdateRequestNaming");
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
| **id** | **UUID**| The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID. | |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing updated parameters of the request naming. | [optional] |

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

## validateUpdateRequestNamingWithHttpInfo

> ApiResponse<Void> validateUpdateRequestNaming validateUpdateRequestNamingWithHttpInfo(id, requestNaming)

Validates the new request naming for the &#x60;PUT /requestNaming/{id}&#x60; request

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceRequestNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceRequestNamingApi apiInstance = new ServiceRequestNamingApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID.
        RequestNaming requestNaming = new RequestNaming(); // RequestNaming | The JSON body of the request containing updated parameters of the request naming.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRequestNamingWithHttpInfo(id, requestNaming);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceRequestNamingApi#validateUpdateRequestNaming");
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
| **id** | **UUID**| The ID of the request naming to be updated.   The ID of the request naming in the body of the request must match this ID. | |
| **requestNaming** | [**RequestNaming**](RequestNaming.md)| The JSON body of the request containing updated parameters of the request naming. | [optional] |

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

