# RumGeographicRegionsCustomClientIpHeadersApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGeolocationRegionsIpHeaders**](RumGeographicRegionsCustomClientIpHeadersApi.md#getGeolocationRegionsIpHeaders) | **GET** /geographicRegions/ipDetectionHeaders | Gets the configuration of custom client IP headers |
| [**getGeolocationRegionsIpHeadersWithHttpInfo**](RumGeographicRegionsCustomClientIpHeadersApi.md#getGeolocationRegionsIpHeadersWithHttpInfo) | **GET** /geographicRegions/ipDetectionHeaders | Gets the configuration of custom client IP headers |
| [**putGeolocationRegionsIpHeaders**](RumGeographicRegionsCustomClientIpHeadersApi.md#putGeolocationRegionsIpHeaders) | **PUT** /geographicRegions/ipDetectionHeaders | Updates the configuration of custom client IP headers |
| [**putGeolocationRegionsIpHeadersWithHttpInfo**](RumGeographicRegionsCustomClientIpHeadersApi.md#putGeolocationRegionsIpHeadersWithHttpInfo) | **PUT** /geographicRegions/ipDetectionHeaders | Updates the configuration of custom client IP headers |
| [**validateGeolocationRegionsIpHeaders**](RumGeographicRegionsCustomClientIpHeadersApi.md#validateGeolocationRegionsIpHeaders) | **POST** /geographicRegions/ipDetectionHeaders/validator | Validates the payload for the &#x60;PUT /geographicRegions/ipDetectionHeaders&#x60; request |
| [**validateGeolocationRegionsIpHeadersWithHttpInfo**](RumGeographicRegionsCustomClientIpHeadersApi.md#validateGeolocationRegionsIpHeadersWithHttpInfo) | **POST** /geographicRegions/ipDetectionHeaders/validator | Validates the payload for the &#x60;PUT /geographicRegions/ipDetectionHeaders&#x60; request |



## getGeolocationRegionsIpHeaders

> IpDetectionHeaders getGeolocationRegionsIpHeaders()

Gets the configuration of custom client IP headers

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        try {
            IpDetectionHeaders result = apiInstance.getGeolocationRegionsIpHeaders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#getGeolocationRegionsIpHeaders");
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

[**IpDetectionHeaders**](IpDetectionHeaders.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getGeolocationRegionsIpHeadersWithHttpInfo

> ApiResponse<IpDetectionHeaders> getGeolocationRegionsIpHeaders getGeolocationRegionsIpHeadersWithHttpInfo()

Gets the configuration of custom client IP headers

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        try {
            ApiResponse<IpDetectionHeaders> response = apiInstance.getGeolocationRegionsIpHeadersWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#getGeolocationRegionsIpHeaders");
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

ApiResponse<[**IpDetectionHeaders**](IpDetectionHeaders.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putGeolocationRegionsIpHeaders

> void putGeolocationRegionsIpHeaders(ipDetectionHeaders)

Updates the configuration of custom client IP headers

The request overwrites the existing configuration. Any headers not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        IpDetectionHeaders ipDetectionHeaders = new IpDetectionHeaders(); // IpDetectionHeaders | The JSON body of the request. Contains the configuration of the custom client IP headers.
        try {
            apiInstance.putGeolocationRegionsIpHeaders(ipDetectionHeaders);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#putGeolocationRegionsIpHeaders");
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
| **ipDetectionHeaders** | [**IpDetectionHeaders**](IpDetectionHeaders.md)| The JSON body of the request. Contains the configuration of the custom client IP headers. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## putGeolocationRegionsIpHeadersWithHttpInfo

> ApiResponse<Void> putGeolocationRegionsIpHeaders putGeolocationRegionsIpHeadersWithHttpInfo(ipDetectionHeaders)

Updates the configuration of custom client IP headers

The request overwrites the existing configuration. Any headers not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        IpDetectionHeaders ipDetectionHeaders = new IpDetectionHeaders(); // IpDetectionHeaders | The JSON body of the request. Contains the configuration of the custom client IP headers.
        try {
            ApiResponse<Void> response = apiInstance.putGeolocationRegionsIpHeadersWithHttpInfo(ipDetectionHeaders);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#putGeolocationRegionsIpHeaders");
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
| **ipDetectionHeaders** | [**IpDetectionHeaders**](IpDetectionHeaders.md)| The JSON body of the request. Contains the configuration of the custom client IP headers. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |


## validateGeolocationRegionsIpHeaders

> void validateGeolocationRegionsIpHeaders(ipDetectionHeaders)

Validates the payload for the &#x60;PUT /geographicRegions/ipDetectionHeaders&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        IpDetectionHeaders ipDetectionHeaders = new IpDetectionHeaders(); // IpDetectionHeaders | The JSON body of the request. Contains the configuration of the custom client IP headers to be validated.
        try {
            apiInstance.validateGeolocationRegionsIpHeaders(ipDetectionHeaders);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#validateGeolocationRegionsIpHeaders");
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
| **ipDetectionHeaders** | [**IpDetectionHeaders**](IpDetectionHeaders.md)| The JSON body of the request. Contains the configuration of the custom client IP headers to be validated. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateGeolocationRegionsIpHeadersWithHttpInfo

> ApiResponse<Void> validateGeolocationRegionsIpHeaders validateGeolocationRegionsIpHeadersWithHttpInfo(ipDetectionHeaders)

Validates the payload for the &#x60;PUT /geographicRegions/ipDetectionHeaders&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsCustomClientIpHeadersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsCustomClientIpHeadersApi apiInstance = new RumGeographicRegionsCustomClientIpHeadersApi(defaultClient);
        IpDetectionHeaders ipDetectionHeaders = new IpDetectionHeaders(); // IpDetectionHeaders | The JSON body of the request. Contains the configuration of the custom client IP headers to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateGeolocationRegionsIpHeadersWithHttpInfo(ipDetectionHeaders);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsCustomClientIpHeadersApi#validateGeolocationRegionsIpHeaders");
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
| **ipDetectionHeaders** | [**IpDetectionHeaders**](IpDetectionHeaders.md)| The JSON body of the request. Contains the configuration of the custom client IP headers to be validated. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

