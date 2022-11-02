# AutomaticallyAppliedTagsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAutoTag**](AutomaticallyAppliedTagsApi.md#createAutoTag) | **POST** /autoTags | Creates a new auto-tag |
| [**createAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#createAutoTagWithHttpInfo) | **POST** /autoTags | Creates a new auto-tag |
| [**deleteAutoTag**](AutomaticallyAppliedTagsApi.md#deleteAutoTag) | **DELETE** /autoTags/{id} | Deletes the specified auto-tag |
| [**deleteAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#deleteAutoTagWithHttpInfo) | **DELETE** /autoTags/{id} | Deletes the specified auto-tag |
| [**getAutoTag**](AutomaticallyAppliedTagsApi.md#getAutoTag) | **GET** /autoTags/{id} | Gets the properties of the specified auto-tag |
| [**getAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#getAutoTagWithHttpInfo) | **GET** /autoTags/{id} | Gets the properties of the specified auto-tag |
| [**listAutoTags**](AutomaticallyAppliedTagsApi.md#listAutoTags) | **GET** /autoTags | Lists all configured auto-tags |
| [**listAutoTagsWithHttpInfo**](AutomaticallyAppliedTagsApi.md#listAutoTagsWithHttpInfo) | **GET** /autoTags | Lists all configured auto-tags |
| [**updateAutoTag**](AutomaticallyAppliedTagsApi.md#updateAutoTag) | **PUT** /autoTags/{id} | Updates an existing auto-tag |
| [**updateAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#updateAutoTagWithHttpInfo) | **PUT** /autoTags/{id} | Updates an existing auto-tag |
| [**validateCreateAutoTag**](AutomaticallyAppliedTagsApi.md#validateCreateAutoTag) | **POST** /autoTags/validator | Validates the payload for the &#x60;POST /autoTags&#x60; request |
| [**validateCreateAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#validateCreateAutoTagWithHttpInfo) | **POST** /autoTags/validator | Validates the payload for the &#x60;POST /autoTags&#x60; request |
| [**validateUpdateAutoTag**](AutomaticallyAppliedTagsApi.md#validateUpdateAutoTag) | **POST** /autoTags/{id}/validator | Validates the payload for the &#x60;PUT /autoTags/{id}&#x60; request |
| [**validateUpdateAutoTagWithHttpInfo**](AutomaticallyAppliedTagsApi.md#validateUpdateAutoTagWithHttpInfo) | **POST** /autoTags/{id}/validator | Validates the payload for the &#x60;PUT /autoTags/{id}&#x60; request |



## createAutoTag

> EntityShortRepresentation createAutoTag(autoTag)

Creates a new auto-tag

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains parameters of the new auto-tag.
        try {
            EntityShortRepresentation result = apiInstance.createAutoTag(autoTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#createAutoTag");
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
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains parameters of the new auto-tag. | [optional] |

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
| **201** | Success. The auto-tag has been created. The response body contains the ID of the new auto-tag. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createAutoTagWithHttpInfo

> ApiResponse<EntityShortRepresentation> createAutoTag createAutoTagWithHttpInfo(autoTag)

Creates a new auto-tag

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
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains parameters of the new auto-tag.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createAutoTagWithHttpInfo(autoTag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#createAutoTag");
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
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains parameters of the new auto-tag. | [optional] |

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
| **201** | Success. The auto-tag has been created. The response body contains the ID of the new auto-tag. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteAutoTag

> void deleteAutoTag(id)

Deletes the specified auto-tag

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be deleted.
        try {
            apiInstance.deleteAutoTag(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#deleteAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be deleted. | |

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

## deleteAutoTagWithHttpInfo

> ApiResponse<Void> deleteAutoTag deleteAutoTagWithHttpInfo(id)

Deletes the specified auto-tag

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteAutoTagWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#deleteAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be deleted. | |

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


## getAutoTag

> AutoTag getAutoTag(id, includeProcessGroupReferences)

Gets the properties of the specified auto-tag

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required auto-tag.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments.   When this flag is set to `false`, conditions with process group references are removed. If that results in a rule having no conditions, the entire rule is removed.
        try {
            AutoTag result = apiInstance.getAutoTag(id, includeProcessGroupReferences);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#getAutoTag");
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
| **id** | **UUID**| The ID of the required auto-tag. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments.   When this flag is set to &#x60;false&#x60;, conditions with process group references are removed. If that results in a rule having no conditions, the entire rule is removed. | [optional] [default to false] |

### Return type

[**AutoTag**](AutoTag.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAutoTagWithHttpInfo

> ApiResponse<AutoTag> getAutoTag getAutoTagWithHttpInfo(id, includeProcessGroupReferences)

Gets the properties of the specified auto-tag

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required auto-tag.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments.   When this flag is set to `false`, conditions with process group references are removed. If that results in a rule having no conditions, the entire rule is removed.
        try {
            ApiResponse<AutoTag> response = apiInstance.getAutoTagWithHttpInfo(id, includeProcessGroupReferences);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#getAutoTag");
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
| **id** | **UUID**| The ID of the required auto-tag. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments.   When this flag is set to &#x60;false&#x60;, conditions with process group references are removed. If that results in a rule having no conditions, the entire rule is removed. | [optional] [default to false] |

### Return type

ApiResponse<[**AutoTag**](AutoTag.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listAutoTags

> StubList listAutoTags()

Lists all configured auto-tags

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        try {
            StubList result = apiInstance.listAutoTags();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#listAutoTags");
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

## listAutoTagsWithHttpInfo

> ApiResponse<StubList> listAutoTags listAutoTagsWithHttpInfo()

Lists all configured auto-tags

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listAutoTagsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#listAutoTags");
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


## updateAutoTag

> EntityShortRepresentation updateAutoTag(id, autoTag)

Updates an existing auto-tag

If the auto-tag with the specified ID does not exist, a new auto-tag is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be updated.   If you set the ID in the body as well, it must match this ID.
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains updated parameters of the auto-tag.
        try {
            EntityShortRepresentation result = apiInstance.updateAutoTag(id, autoTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#updateAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains updated parameters of the auto-tag. | [optional] |

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
| **201** | Success. The new auto-tag has been created. The response body contains the ID of the new auto-tag. |  -  |
| **204** | Success. The auto-tag has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateAutoTagWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateAutoTag updateAutoTagWithHttpInfo(id, autoTag)

Updates an existing auto-tag

If the auto-tag with the specified ID does not exist, a new auto-tag is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be updated.   If you set the ID in the body as well, it must match this ID.
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains updated parameters of the auto-tag.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateAutoTagWithHttpInfo(id, autoTag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#updateAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains updated parameters of the auto-tag. | [optional] |

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
| **201** | Success. The new auto-tag has been created. The response body contains the ID of the new auto-tag. |  -  |
| **204** | Success. The auto-tag has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateAutoTag

> void validateCreateAutoTag(autoTag)

Validates the payload for the &#x60;POST /autoTags&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains auto-tag configuration to be validated.
        try {
            apiInstance.validateCreateAutoTag(autoTag);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#validateCreateAutoTag");
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
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains auto-tag configuration to be validated. | [optional] |

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

## validateCreateAutoTagWithHttpInfo

> ApiResponse<Void> validateCreateAutoTag validateCreateAutoTagWithHttpInfo(autoTag)

Validates the payload for the &#x60;POST /autoTags&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains auto-tag configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateAutoTagWithHttpInfo(autoTag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#validateCreateAutoTag");
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
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains auto-tag configuration to be validated. | [optional] |

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


## validateUpdateAutoTag

> void validateUpdateAutoTag(id, autoTag)

Validates the payload for the &#x60;PUT /autoTags/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be validated.
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains auto-tag configuration to be validated.
        try {
            apiInstance.validateUpdateAutoTag(id, autoTag);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#validateUpdateAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be validated. | |
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains auto-tag configuration to be validated. | [optional] |

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

## validateUpdateAutoTagWithHttpInfo

> ApiResponse<Void> validateUpdateAutoTag validateUpdateAutoTagWithHttpInfo(id, autoTag)

Validates the payload for the &#x60;PUT /autoTags/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AutomaticallyAppliedTagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AutomaticallyAppliedTagsApi apiInstance = new AutomaticallyAppliedTagsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the auto-tag to be validated.
        AutoTag autoTag = new AutoTag(); // AutoTag | The JSON body of the request. Contains auto-tag configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateAutoTagWithHttpInfo(id, autoTag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AutomaticallyAppliedTagsApi#validateUpdateAutoTag");
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
| **id** | **UUID**| The ID of the auto-tag to be validated. | |
| **autoTag** | [**AutoTag**](AutoTag.md)| The JSON body of the request. Contains auto-tag configuration to be validated. | [optional] |

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

