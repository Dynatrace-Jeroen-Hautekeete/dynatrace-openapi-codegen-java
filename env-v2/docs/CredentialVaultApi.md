# CredentialVaultApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCredentials**](CredentialVaultApi.md#createCredentials) | **POST** /credentials | Creates a new credentials set |
| [**createCredentialsWithHttpInfo**](CredentialVaultApi.md#createCredentialsWithHttpInfo) | **POST** /credentials | Creates a new credentials set |
| [**getCredentials**](CredentialVaultApi.md#getCredentials) | **GET** /credentials/{id} | Gets the metadata of the specified credentials set |
| [**getCredentialsWithHttpInfo**](CredentialVaultApi.md#getCredentialsWithHttpInfo) | **GET** /credentials/{id} | Gets the metadata of the specified credentials set |
| [**getCredentialsDetails**](CredentialVaultApi.md#getCredentialsDetails) | **GET** /credentials/{id}/details | Gets the details of the specified credentials set |
| [**getCredentialsDetailsWithHttpInfo**](CredentialVaultApi.md#getCredentialsDetailsWithHttpInfo) | **GET** /credentials/{id}/details | Gets the details of the specified credentials set |
| [**listCredentials**](CredentialVaultApi.md#listCredentials) | **GET** /credentials | Lists all sets of credentials for synthetic monitors stored in your environment |
| [**listCredentialsWithHttpInfo**](CredentialVaultApi.md#listCredentialsWithHttpInfo) | **GET** /credentials | Lists all sets of credentials for synthetic monitors stored in your environment |
| [**removeCredentials**](CredentialVaultApi.md#removeCredentials) | **DELETE** /credentials/{id} | Deletes the specified credentials set |
| [**removeCredentialsWithHttpInfo**](CredentialVaultApi.md#removeCredentialsWithHttpInfo) | **DELETE** /credentials/{id} | Deletes the specified credentials set |
| [**updateCredentials**](CredentialVaultApi.md#updateCredentials) | **PUT** /credentials/{id} | Updates the specified credentials set |
| [**updateCredentialsWithHttpInfo**](CredentialVaultApi.md#updateCredentialsWithHttpInfo) | **PUT** /credentials/{id} | Updates the specified credentials set |



## createCredentials

> CredentialsResponseElement createCredentials(credentials)

Creates a new credentials set

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        Credentials credentials = new Credentials(); // Credentials | The JSON body of the request. Contains parameters of the new credentials set.
        try {
            CredentialsResponseElement result = apiInstance.createCredentials(credentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#createCredentials");
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
| **credentials** | [**Credentials**](Credentials.md)| The JSON body of the request. Contains parameters of the new credentials set. | |

### Return type

[**CredentialsResponseElement**](CredentialsResponseElement.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new credentials set has been created. The response contains the ID of the set. |  -  |
| **400** | Failed. Requested credentials with unsupported scope. Only APP_ENGINE scope is supported |  -  |
| **403** | Failed. Requested credentials belong to another user |  -  |

## createCredentialsWithHttpInfo

> ApiResponse<CredentialsResponseElement> createCredentials createCredentialsWithHttpInfo(credentials)

Creates a new credentials set

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        Credentials credentials = new Credentials(); // Credentials | The JSON body of the request. Contains parameters of the new credentials set.
        try {
            ApiResponse<CredentialsResponseElement> response = apiInstance.createCredentialsWithHttpInfo(credentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#createCredentials");
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
| **credentials** | [**Credentials**](Credentials.md)| The JSON body of the request. Contains parameters of the new credentials set. | |

### Return type

ApiResponse<[**CredentialsResponseElement**](CredentialsResponseElement.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new credentials set has been created. The response contains the ID of the set. |  -  |
| **400** | Failed. Requested credentials with unsupported scope. Only APP_ENGINE scope is supported |  -  |
| **403** | Failed. Requested credentials belong to another user |  -  |


## getCredentials

> CredentialsResponseElement getCredentials(id)

Gets the metadata of the specified credentials set

The credentials set itself (e.g. username/certificate and password) is not included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required credentials set.
        try {
            CredentialsResponseElement result = apiInstance.getCredentials(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#getCredentials");
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
| **id** | **String**| The Dynatrace entity ID of the required credentials set. | |

### Return type

[**CredentialsResponseElement**](CredentialsResponseElement.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the metadata of the credentials set. |  -  |

## getCredentialsWithHttpInfo

> ApiResponse<CredentialsResponseElement> getCredentials getCredentialsWithHttpInfo(id)

Gets the metadata of the specified credentials set

The credentials set itself (e.g. username/certificate and password) is not included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required credentials set.
        try {
            ApiResponse<CredentialsResponseElement> response = apiInstance.getCredentialsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#getCredentials");
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
| **id** | **String**| The Dynatrace entity ID of the required credentials set. | |

### Return type

ApiResponse<[**CredentialsResponseElement**](CredentialsResponseElement.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the metadata of the credentials set. |  -  |


## getCredentialsDetails

> AbstractCredentialsResponseElement getCredentialsDetails(id)

Gets the details of the specified credentials set

The credentials set including username/certificate, password or token is included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required credentials set.
        try {
            AbstractCredentialsResponseElement result = apiInstance.getCredentialsDetails(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#getCredentialsDetails");
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
| **id** | **String**| The Dynatrace entity ID of the required credentials set. | |

### Return type

[**AbstractCredentialsResponseElement**](AbstractCredentialsResponseElement.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the details of the credentials set. |  -  |
| **400** | Failed. Credentials access exception |  -  |

## getCredentialsDetailsWithHttpInfo

> ApiResponse<AbstractCredentialsResponseElement> getCredentialsDetails getCredentialsDetailsWithHttpInfo(id)

Gets the details of the specified credentials set

The credentials set including username/certificate, password or token is included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required credentials set.
        try {
            ApiResponse<AbstractCredentialsResponseElement> response = apiInstance.getCredentialsDetailsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#getCredentialsDetails");
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
| **id** | **String**| The Dynatrace entity ID of the required credentials set. | |

### Return type

ApiResponse<[**AbstractCredentialsResponseElement**](AbstractCredentialsResponseElement.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the details of the credentials set. |  -  |
| **400** | Failed. Credentials access exception |  -  |


## listCredentials

> CredentialsList listCredentials(type, name, user, nextPageKey, pageSize)

Lists all sets of credentials for synthetic monitors stored in your environment

The credentials set itself (username/certificate and password) is not included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String type = "CERTIFICATE"; // String | Filters the result by the specified credentials type.
        String name = "name_example"; // String | Filters the result by the name. When in quotation marks, whole phrase is taken. Case insensitive.
        String user = "user_example"; // String | Filters credentials accessible to the user (owned by the user or the ones that are accessible for all).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of credentials in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            CredentialsList result = apiInstance.listCredentials(type, name, user, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#listCredentials");
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
| **type** | **String**| Filters the result by the specified credentials type. | [optional] [enum: CERTIFICATE, USERNAME_PASSWORD, TOKEN] |
| **name** | **String**| Filters the result by the name. When in quotation marks, whole phrase is taken. Case insensitive. | [optional] |
| **user** | **String**| Filters credentials accessible to the user (owned by the user or the ones that are accessible for all). | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of credentials in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

[**CredentialsList**](CredentialsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listCredentialsWithHttpInfo

> ApiResponse<CredentialsList> listCredentials listCredentialsWithHttpInfo(type, name, user, nextPageKey, pageSize)

Lists all sets of credentials for synthetic monitors stored in your environment

The credentials set itself (username/certificate and password) is not included in the response.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String type = "CERTIFICATE"; // String | Filters the result by the specified credentials type.
        String name = "name_example"; // String | Filters the result by the name. When in quotation marks, whole phrase is taken. Case insensitive.
        String user = "user_example"; // String | Filters credentials accessible to the user (owned by the user or the ones that are accessible for all).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of credentials in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            ApiResponse<CredentialsList> response = apiInstance.listCredentialsWithHttpInfo(type, name, user, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#listCredentials");
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
| **type** | **String**| Filters the result by the specified credentials type. | [optional] [enum: CERTIFICATE, USERNAME_PASSWORD, TOKEN] |
| **name** | **String**| Filters the result by the name. When in quotation marks, whole phrase is taken. Case insensitive. | [optional] |
| **user** | **String**| Filters credentials accessible to the user (owned by the user or the ones that are accessible for all). | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of credentials in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

ApiResponse<[**CredentialsList**](CredentialsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## removeCredentials

> void removeCredentials(id)

Deletes the specified credentials set

Provide credential ID in the path.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The ID of the credentials set to be deleted.
        try {
            apiInstance.removeCredentials(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#removeCredentials");
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
| **id** | **String**| The ID of the credentials set to be deleted. | |

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
| **204** | Success. The credentials set has been deleted. Response doesn&#39;t have a body. |  -  |

## removeCredentialsWithHttpInfo

> ApiResponse<Void> removeCredentials removeCredentialsWithHttpInfo(id)

Deletes the specified credentials set

Provide credential ID in the path.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The ID of the credentials set to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.removeCredentialsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#removeCredentials");
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
| **id** | **String**| The ID of the credentials set to be deleted. | |

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
| **204** | Success. The credentials set has been deleted. Response doesn&#39;t have a body. |  -  |


## updateCredentials

> CredentialsResponseElement updateCredentials(id, credentials)

Updates the specified credentials set

The body must not provide an ID. The ID should be provided in the path

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the credentials set to be updated.
        Credentials credentials = new Credentials(); // Credentials | The JSON body of the request. Contains updated parameters of the credentials set.
        try {
            CredentialsResponseElement result = apiInstance.updateCredentials(id, credentials);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#updateCredentials");
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
| **id** | **String**| The Dynatrace entity ID of the credentials set to be updated. | |
| **credentials** | [**Credentials**](Credentials.md)| The JSON body of the request. Contains updated parameters of the credentials set. | |

### Return type

[**CredentialsResponseElement**](CredentialsResponseElement.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new credentials set has been created. The response contains the ID of the set. |  -  |
| **204** | Success. The credentials set has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateCredentialsWithHttpInfo

> ApiResponse<CredentialsResponseElement> updateCredentials updateCredentialsWithHttpInfo(id, credentials)

Updates the specified credentials set

The body must not provide an ID. The ID should be provided in the path

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.CredentialVaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        CredentialVaultApi apiInstance = new CredentialVaultApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the credentials set to be updated.
        Credentials credentials = new Credentials(); // Credentials | The JSON body of the request. Contains updated parameters of the credentials set.
        try {
            ApiResponse<CredentialsResponseElement> response = apiInstance.updateCredentialsWithHttpInfo(id, credentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialVaultApi#updateCredentials");
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
| **id** | **String**| The Dynatrace entity ID of the credentials set to be updated. | |
| **credentials** | [**Credentials**](Credentials.md)| The JSON body of the request. Contains updated parameters of the credentials set. | |

### Return type

ApiResponse<[**CredentialsResponseElement**](CredentialsResponseElement.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new credentials set has been created. The response contains the ID of the set. |  -  |
| **204** | Success. The credentials set has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

