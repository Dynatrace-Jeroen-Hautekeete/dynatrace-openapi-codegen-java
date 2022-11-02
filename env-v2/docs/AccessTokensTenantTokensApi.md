# AccessTokensTenantTokensApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRotation**](AccessTokensTenantTokensApi.md#cancelRotation) | **POST** /tenantTokenRotation/cancel | Cancels tenant token rotation |
| [**cancelRotationWithHttpInfo**](AccessTokensTenantTokensApi.md#cancelRotationWithHttpInfo) | **POST** /tenantTokenRotation/cancel | Cancels tenant token rotation |
| [**finishRotation**](AccessTokensTenantTokensApi.md#finishRotation) | **POST** /tenantTokenRotation/finish | Finishes tenant token rotation |
| [**finishRotationWithHttpInfo**](AccessTokensTenantTokensApi.md#finishRotationWithHttpInfo) | **POST** /tenantTokenRotation/finish | Finishes tenant token rotation |
| [**startRotation**](AccessTokensTenantTokensApi.md#startRotation) | **POST** /tenantTokenRotation/start | Starts tenant token rotation |
| [**startRotationWithHttpInfo**](AccessTokensTenantTokensApi.md#startRotationWithHttpInfo) | **POST** /tenantTokenRotation/start | Starts tenant token rotation |



## cancelRotation

> TenantTokenConfig cancelRotation()

Cancels tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            TenantTokenConfig result = apiInstance.cancelRotation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#cancelRotation");
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

[**TenantTokenConfig**](TenantTokenConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Rotation process has been cancelled. The current tenant token remains valid. |  -  |
| **400** | Failed. There is no ongoing rotation process. |  -  |

## cancelRotationWithHttpInfo

> ApiResponse<TenantTokenConfig> cancelRotation cancelRotationWithHttpInfo()

Cancels tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            ApiResponse<TenantTokenConfig> response = apiInstance.cancelRotationWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#cancelRotation");
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

ApiResponse<[**TenantTokenConfig**](TenantTokenConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Rotation process has been cancelled. The current tenant token remains valid. |  -  |
| **400** | Failed. There is no ongoing rotation process. |  -  |


## finishRotation

> TenantTokenConfig finishRotation()

Finishes tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            TenantTokenConfig result = apiInstance.finishRotation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#finishRotation");
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

[**TenantTokenConfig**](TenantTokenConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The rotation process is completed. The **active** field of the response contains the new tenant token. |  -  |
| **400** | No ongoing rotation process. |  -  |

## finishRotationWithHttpInfo

> ApiResponse<TenantTokenConfig> finishRotation finishRotationWithHttpInfo()

Finishes tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            ApiResponse<TenantTokenConfig> response = apiInstance.finishRotationWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#finishRotation");
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

ApiResponse<[**TenantTokenConfig**](TenantTokenConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The rotation process is completed. The **active** field of the response contains the new tenant token. |  -  |
| **400** | No ongoing rotation process. |  -  |


## startRotation

> TenantTokenConfig startRotation()

Starts tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            TenantTokenConfig result = apiInstance.startRotation();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#startRotation");
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

[**TenantTokenConfig**](TenantTokenConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The new tenant token is created and will replace the old one. The **active** field of the response contains the new tenant token. |  -  |
| **400** | Failed. Another rotation process is already in progress. |  -  |

## startRotationWithHttpInfo

> ApiResponse<TenantTokenConfig> startRotation startRotationWithHttpInfo()

Starts tenant token rotation

To learn how to rotate tokens, see [Token rotation](https://dt-url.net/1543sf6) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensTenantTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensTenantTokensApi apiInstance = new AccessTokensTenantTokensApi(defaultClient);
        try {
            ApiResponse<TenantTokenConfig> response = apiInstance.startRotationWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensTenantTokensApi#startRotation");
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

ApiResponse<[**TenantTokenConfig**](TenantTokenConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The new tenant token is created and will replace the old one. The **active** field of the response contains the new tenant token. |  -  |
| **400** | Failed. Another rotation process is already in progress. |  -  |

