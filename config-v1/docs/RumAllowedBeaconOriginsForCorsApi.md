# RumAllowedBeaconOriginsForCorsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllowedBeaconOriginsConfig**](RumAllowedBeaconOriginsForCorsApi.md#getAllowedBeaconOriginsConfig) | **GET** /allowedBeaconOriginsForCors | Gets the configuration of the allowed beacon origins for CORS requests |
| [**getAllowedBeaconOriginsConfigWithHttpInfo**](RumAllowedBeaconOriginsForCorsApi.md#getAllowedBeaconOriginsConfigWithHttpInfo) | **GET** /allowedBeaconOriginsForCors | Gets the configuration of the allowed beacon origins for CORS requests |
| [**putAllowedBeaconOriginsConfig**](RumAllowedBeaconOriginsForCorsApi.md#putAllowedBeaconOriginsConfig) | **PUT** /allowedBeaconOriginsForCors | Updates the configuration of the allowed beacon origins for CORS requests |
| [**putAllowedBeaconOriginsConfigWithHttpInfo**](RumAllowedBeaconOriginsForCorsApi.md#putAllowedBeaconOriginsConfigWithHttpInfo) | **PUT** /allowedBeaconOriginsForCors | Updates the configuration of the allowed beacon origins for CORS requests |
| [**validateAllowedBeaconOriginsConfig**](RumAllowedBeaconOriginsForCorsApi.md#validateAllowedBeaconOriginsConfig) | **POST** /allowedBeaconOriginsForCors/validator | Validates the payload for the &#x60;PUT /allowedBeaconOriginsForCors&#x60; request |
| [**validateAllowedBeaconOriginsConfigWithHttpInfo**](RumAllowedBeaconOriginsForCorsApi.md#validateAllowedBeaconOriginsConfigWithHttpInfo) | **POST** /allowedBeaconOriginsForCors/validator | Validates the payload for the &#x60;PUT /allowedBeaconOriginsForCors&#x60; request |



## getAllowedBeaconOriginsConfig

> AllowedBeaconOrigins getAllowedBeaconOriginsConfig()

Gets the configuration of the allowed beacon origins for CORS requests

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        try {
            AllowedBeaconOrigins result = apiInstance.getAllowedBeaconOriginsConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#getAllowedBeaconOriginsConfig");
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

[**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllowedBeaconOriginsConfigWithHttpInfo

> ApiResponse<AllowedBeaconOrigins> getAllowedBeaconOriginsConfig getAllowedBeaconOriginsConfigWithHttpInfo()

Gets the configuration of the allowed beacon origins for CORS requests

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        try {
            ApiResponse<AllowedBeaconOrigins> response = apiInstance.getAllowedBeaconOriginsConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#getAllowedBeaconOriginsConfig");
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

ApiResponse<[**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putAllowedBeaconOriginsConfig

> void putAllowedBeaconOriginsConfig(allowedBeaconOrigins)

Updates the configuration of the allowed beacon origins for CORS requests

The request overwrites the existing configuration. Any rules not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        AllowedBeaconOrigins allowedBeaconOrigins = new AllowedBeaconOrigins(); // AllowedBeaconOrigins | The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests.
        try {
            apiInstance.putAllowedBeaconOriginsConfig(allowedBeaconOrigins);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#putAllowedBeaconOriginsConfig");
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
| **allowedBeaconOrigins** | [**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)| The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## putAllowedBeaconOriginsConfigWithHttpInfo

> ApiResponse<Void> putAllowedBeaconOriginsConfig putAllowedBeaconOriginsConfigWithHttpInfo(allowedBeaconOrigins)

Updates the configuration of the allowed beacon origins for CORS requests

The request overwrites the existing configuration. Any rules not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        AllowedBeaconOrigins allowedBeaconOrigins = new AllowedBeaconOrigins(); // AllowedBeaconOrigins | The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests.
        try {
            ApiResponse<Void> response = apiInstance.putAllowedBeaconOriginsConfigWithHttpInfo(allowedBeaconOrigins);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#putAllowedBeaconOriginsConfig");
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
| **allowedBeaconOrigins** | [**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)| The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateAllowedBeaconOriginsConfig

> void validateAllowedBeaconOriginsConfig(allowedBeaconOrigins)

Validates the payload for the &#x60;PUT /allowedBeaconOriginsForCors&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        AllowedBeaconOrigins allowedBeaconOrigins = new AllowedBeaconOrigins(); // AllowedBeaconOrigins | The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests.
        try {
            apiInstance.validateAllowedBeaconOriginsConfig(allowedBeaconOrigins);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#validateAllowedBeaconOriginsConfig");
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
| **allowedBeaconOrigins** | [**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)| The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateAllowedBeaconOriginsConfigWithHttpInfo

> ApiResponse<Void> validateAllowedBeaconOriginsConfig validateAllowedBeaconOriginsConfigWithHttpInfo(allowedBeaconOrigins)

Validates the payload for the &#x60;PUT /allowedBeaconOriginsForCors&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumAllowedBeaconOriginsForCorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumAllowedBeaconOriginsForCorsApi apiInstance = new RumAllowedBeaconOriginsForCorsApi(defaultClient);
        AllowedBeaconOrigins allowedBeaconOrigins = new AllowedBeaconOrigins(); // AllowedBeaconOrigins | The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests.
        try {
            ApiResponse<Void> response = apiInstance.validateAllowedBeaconOriginsConfigWithHttpInfo(allowedBeaconOrigins);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumAllowedBeaconOriginsForCorsApi#validateAllowedBeaconOriginsConfig");
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
| **allowedBeaconOrigins** | [**AllowedBeaconOrigins**](AllowedBeaconOrigins.md)| The JSON body of the request. Contains the configuration of the allowed beacon origins for CORS requests. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

