# AccessTokensActiveGateTokensApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](AccessTokensActiveGateTokensApi.md#createToken) | **POST** /activeGateTokens | Creates a new ActiveGate token | maturity&#x3D;EARLY_ADOPTER |
| [**createTokenWithHttpInfo**](AccessTokensActiveGateTokensApi.md#createTokenWithHttpInfo) | **POST** /activeGateTokens | Creates a new ActiveGate token | maturity&#x3D;EARLY_ADOPTER |
| [**getToken**](AccessTokensActiveGateTokensApi.md#getToken) | **GET** /activeGateTokens/{activeGateTokenIdentifier} | Gets metadata of an ActiveGate token | maturity&#x3D;EARLY_ADOPTER |
| [**getTokenWithHttpInfo**](AccessTokensActiveGateTokensApi.md#getTokenWithHttpInfo) | **GET** /activeGateTokens/{activeGateTokenIdentifier} | Gets metadata of an ActiveGate token | maturity&#x3D;EARLY_ADOPTER |
| [**listTokens**](AccessTokensActiveGateTokensApi.md#listTokens) | **GET** /activeGateTokens | Lists all available ActiveGate tokens | maturity&#x3D;EARLY_ADOPTER |
| [**listTokensWithHttpInfo**](AccessTokensActiveGateTokensApi.md#listTokensWithHttpInfo) | **GET** /activeGateTokens | Lists all available ActiveGate tokens | maturity&#x3D;EARLY_ADOPTER |
| [**revokeToken**](AccessTokensActiveGateTokensApi.md#revokeToken) | **DELETE** /activeGateTokens/{activeGateTokenIdentifier} | Deletes an ActiveGate token | maturity&#x3D;EARLY_ADOPTER |
| [**revokeTokenWithHttpInfo**](AccessTokensActiveGateTokensApi.md#revokeTokenWithHttpInfo) | **DELETE** /activeGateTokens/{activeGateTokenIdentifier} | Deletes an ActiveGate token | maturity&#x3D;EARLY_ADOPTER |



## createToken

> ActiveGateTokenCreated createToken(activeGateTokenCreate)

Creates a new ActiveGate token | maturity&#x3D;EARLY_ADOPTER

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        ActiveGateTokenCreate activeGateTokenCreate = new ActiveGateTokenCreate(); // ActiveGateTokenCreate | The JSON body of the request. Contains parameters of the new ActiveGate token.
        try {
            ActiveGateTokenCreated result = apiInstance.createToken(activeGateTokenCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#createToken");
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
| **activeGateTokenCreate** | [**ActiveGateTokenCreate**](ActiveGateTokenCreate.md)| The JSON body of the request. Contains parameters of the new ActiveGate token. | |

### Return type

[**ActiveGateTokenCreated**](ActiveGateTokenCreated.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The body of the response contains the token secret. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createTokenWithHttpInfo

> ApiResponse<ActiveGateTokenCreated> createToken createTokenWithHttpInfo(activeGateTokenCreate)

Creates a new ActiveGate token | maturity&#x3D;EARLY_ADOPTER

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        ActiveGateTokenCreate activeGateTokenCreate = new ActiveGateTokenCreate(); // ActiveGateTokenCreate | The JSON body of the request. Contains parameters of the new ActiveGate token.
        try {
            ApiResponse<ActiveGateTokenCreated> response = apiInstance.createTokenWithHttpInfo(activeGateTokenCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#createToken");
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
| **activeGateTokenCreate** | [**ActiveGateTokenCreate**](ActiveGateTokenCreate.md)| The JSON body of the request. Contains parameters of the new ActiveGate token. | |

### Return type

ApiResponse<[**ActiveGateTokenCreated**](ActiveGateTokenCreated.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The body of the response contains the token secret. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getToken

> ActiveGateToken getToken(activeGateTokenIdentifier)

Gets metadata of an ActiveGate token | maturity&#x3D;EARLY_ADOPTER

The token secret is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String activeGateTokenIdentifier = "activeGateTokenIdentifier_example"; // String | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token.
        try {
            ActiveGateToken result = apiInstance.getToken(activeGateTokenIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#getToken");
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
| **activeGateTokenIdentifier** | **String**| The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token. | |

### Return type

[**ActiveGateToken**](ActiveGateToken.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the metadata of the tokens. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getTokenWithHttpInfo

> ApiResponse<ActiveGateToken> getToken getTokenWithHttpInfo(activeGateTokenIdentifier)

Gets metadata of an ActiveGate token | maturity&#x3D;EARLY_ADOPTER

The token secret is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String activeGateTokenIdentifier = "activeGateTokenIdentifier_example"; // String | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token.
        try {
            ApiResponse<ActiveGateToken> response = apiInstance.getTokenWithHttpInfo(activeGateTokenIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#getToken");
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
| **activeGateTokenIdentifier** | **String**| The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token. | |

### Return type

ApiResponse<[**ActiveGateToken**](ActiveGateToken.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the metadata of the tokens. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## listTokens

> ActiveGateTokenList listTokens(nextPageKey, pageSize)

Lists all available ActiveGate tokens | maturity&#x3D;EARLY_ADOPTER

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of ActiveGate tokens in a single response payload.   The maximal allowed page size is 3000 and the minimal size is 100.   If not set, 100 is used.
        try {
            ActiveGateTokenList result = apiInstance.listTokens(nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#listTokens");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of ActiveGate tokens in a single response payload.   The maximal allowed page size is 3000 and the minimal size is 100.   If not set, 100 is used. | [optional] |

### Return type

[**ActiveGateTokenList**](ActiveGateTokenList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of ActiveGate tokens. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## listTokensWithHttpInfo

> ApiResponse<ActiveGateTokenList> listTokens listTokensWithHttpInfo(nextPageKey, pageSize)

Lists all available ActiveGate tokens | maturity&#x3D;EARLY_ADOPTER

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of ActiveGate tokens in a single response payload.   The maximal allowed page size is 3000 and the minimal size is 100.   If not set, 100 is used.
        try {
            ApiResponse<ActiveGateTokenList> response = apiInstance.listTokensWithHttpInfo(nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#listTokens");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of ActiveGate tokens in a single response payload.   The maximal allowed page size is 3000 and the minimal size is 100.   If not set, 100 is used. | [optional] |

### Return type

ApiResponse<[**ActiveGateTokenList**](ActiveGateTokenList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of ActiveGate tokens. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## revokeToken

> void revokeToken(activeGateTokenIdentifier)

Deletes an ActiveGate token | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String activeGateTokenIdentifier = "activeGateTokenIdentifier_example"; // String | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token to be deleted.
        try {
            apiInstance.revokeToken(activeGateTokenIdentifier);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#revokeToken");
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
| **activeGateTokenIdentifier** | **String**| The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token to be deleted. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## revokeTokenWithHttpInfo

> ApiResponse<Void> revokeToken revokeTokenWithHttpInfo(activeGateTokenIdentifier)

Deletes an ActiveGate token | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensActiveGateTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensActiveGateTokensApi apiInstance = new AccessTokensActiveGateTokensApi(defaultClient);
        String activeGateTokenIdentifier = "activeGateTokenIdentifier_example"; // String | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.revokeTokenWithHttpInfo(activeGateTokenIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensActiveGateTokensApi#revokeToken");
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
| **activeGateTokenIdentifier** | **String**| The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token to be deleted. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

