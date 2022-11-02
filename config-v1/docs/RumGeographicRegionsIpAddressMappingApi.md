# RumGeographicRegionsIpAddressMappingApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGeolocationRegionsIpAddress**](RumGeographicRegionsIpAddressMappingApi.md#getGeolocationRegionsIpAddress) | **GET** /geographicRegions/ipAddressMappings | Gets the configuration of mapping between IP address and geographic regions |
| [**getGeolocationRegionsIpAddressWithHttpInfo**](RumGeographicRegionsIpAddressMappingApi.md#getGeolocationRegionsIpAddressWithHttpInfo) | **GET** /geographicRegions/ipAddressMappings | Gets the configuration of mapping between IP address and geographic regions |
| [**putGeolocationRegionsIpAddress**](RumGeographicRegionsIpAddressMappingApi.md#putGeolocationRegionsIpAddress) | **PUT** /geographicRegions/ipAddressMappings | Updates the configuration of mapping between IP address and geographic regions |
| [**putGeolocationRegionsIpAddressWithHttpInfo**](RumGeographicRegionsIpAddressMappingApi.md#putGeolocationRegionsIpAddressWithHttpInfo) | **PUT** /geographicRegions/ipAddressMappings | Updates the configuration of mapping between IP address and geographic regions |
| [**validateGeolocationRegionsIpAddress**](RumGeographicRegionsIpAddressMappingApi.md#validateGeolocationRegionsIpAddress) | **POST** /geographicRegions/ipAddressMappings/validator | Validates the payload for the &#x60;PUT /geographicRegions/ipAddressMappings&#x60; request |
| [**validateGeolocationRegionsIpAddressWithHttpInfo**](RumGeographicRegionsIpAddressMappingApi.md#validateGeolocationRegionsIpAddressWithHttpInfo) | **POST** /geographicRegions/ipAddressMappings/validator | Validates the payload for the &#x60;PUT /geographicRegions/ipAddressMappings&#x60; request |



## getGeolocationRegionsIpAddress

> IpAddressMappings getGeolocationRegionsIpAddress()

Gets the configuration of mapping between IP address and geographic regions

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        try {
            IpAddressMappings result = apiInstance.getGeolocationRegionsIpAddress();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#getGeolocationRegionsIpAddress");
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

[**IpAddressMappings**](IpAddressMappings.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getGeolocationRegionsIpAddressWithHttpInfo

> ApiResponse<IpAddressMappings> getGeolocationRegionsIpAddress getGeolocationRegionsIpAddressWithHttpInfo()

Gets the configuration of mapping between IP address and geographic regions

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        try {
            ApiResponse<IpAddressMappings> response = apiInstance.getGeolocationRegionsIpAddressWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#getGeolocationRegionsIpAddress");
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

ApiResponse<[**IpAddressMappings**](IpAddressMappings.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putGeolocationRegionsIpAddress

> void putGeolocationRegionsIpAddress(ipAddressMappings)

Updates the configuration of mapping between IP address and geographic regions

The request overwrites the existing configuration. Any rules not presented in the payload will be lost.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        IpAddressMappings ipAddressMappings = new IpAddressMappings(); // IpAddressMappings | The JSON body of the request. Contains the configuration of the IP address mapping.
        try {
            apiInstance.putGeolocationRegionsIpAddress(ipAddressMappings);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#putGeolocationRegionsIpAddress");
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
| **ipAddressMappings** | [**IpAddressMappings**](IpAddressMappings.md)| The JSON body of the request. Contains the configuration of the IP address mapping. | [optional] |

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

## putGeolocationRegionsIpAddressWithHttpInfo

> ApiResponse<Void> putGeolocationRegionsIpAddress putGeolocationRegionsIpAddressWithHttpInfo(ipAddressMappings)

Updates the configuration of mapping between IP address and geographic regions

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
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        IpAddressMappings ipAddressMappings = new IpAddressMappings(); // IpAddressMappings | The JSON body of the request. Contains the configuration of the IP address mapping.
        try {
            ApiResponse<Void> response = apiInstance.putGeolocationRegionsIpAddressWithHttpInfo(ipAddressMappings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#putGeolocationRegionsIpAddress");
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
| **ipAddressMappings** | [**IpAddressMappings**](IpAddressMappings.md)| The JSON body of the request. Contains the configuration of the IP address mapping. | [optional] |

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


## validateGeolocationRegionsIpAddress

> void validateGeolocationRegionsIpAddress(ipAddressMappings)

Validates the payload for the &#x60;PUT /geographicRegions/ipAddressMappings&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        IpAddressMappings ipAddressMappings = new IpAddressMappings(); // IpAddressMappings | The JSON body of the request. Contains the configuration of the IP address.
        try {
            apiInstance.validateGeolocationRegionsIpAddress(ipAddressMappings);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#validateGeolocationRegionsIpAddress");
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
| **ipAddressMappings** | [**IpAddressMappings**](IpAddressMappings.md)| The JSON body of the request. Contains the configuration of the IP address. | [optional] |

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

## validateGeolocationRegionsIpAddressWithHttpInfo

> ApiResponse<Void> validateGeolocationRegionsIpAddress validateGeolocationRegionsIpAddressWithHttpInfo(ipAddressMappings)

Validates the payload for the &#x60;PUT /geographicRegions/ipAddressMappings&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumGeographicRegionsIpAddressMappingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumGeographicRegionsIpAddressMappingApi apiInstance = new RumGeographicRegionsIpAddressMappingApi(defaultClient);
        IpAddressMappings ipAddressMappings = new IpAddressMappings(); // IpAddressMappings | The JSON body of the request. Contains the configuration of the IP address.
        try {
            ApiResponse<Void> response = apiInstance.validateGeolocationRegionsIpAddressWithHttpInfo(ipAddressMappings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumGeographicRegionsIpAddressMappingApi#validateGeolocationRegionsIpAddress");
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
| **ipAddressMappings** | [**IpAddressMappings**](IpAddressMappings.md)| The JSON body of the request. Contains the configuration of the IP address. | [optional] |

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

