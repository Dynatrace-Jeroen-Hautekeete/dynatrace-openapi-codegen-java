# ActiveGatesActiveGateTokensEnforcementApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokenEnforcement**](ActiveGatesActiveGateTokensEnforcementApi.md#getTokenEnforcement) | **GET** /activeGates/tokenEnforcement | Gets the status of ActiveGate tokens enforcement | maturity&#x3D;EARLY_ADOPTER |
| [**getTokenEnforcementWithHttpInfo**](ActiveGatesActiveGateTokensEnforcementApi.md#getTokenEnforcementWithHttpInfo) | **GET** /activeGates/tokenEnforcement | Gets the status of ActiveGate tokens enforcement | maturity&#x3D;EARLY_ADOPTER |



## getTokenEnforcement

> ActiveGateTokenEnforcement getTokenEnforcement()

Gets the status of ActiveGate tokens enforcement | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesActiveGateTokensEnforcementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesActiveGateTokensEnforcementApi apiInstance = new ActiveGatesActiveGateTokensEnforcementApi(defaultClient);
        try {
            ActiveGateTokenEnforcement result = apiInstance.getTokenEnforcement();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesActiveGateTokensEnforcementApi#getTokenEnforcement");
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

[**ActiveGateTokenEnforcement**](ActiveGateTokenEnforcement.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the status of ActiveGate tokens enforcement |  -  |

## getTokenEnforcementWithHttpInfo

> ApiResponse<ActiveGateTokenEnforcement> getTokenEnforcement getTokenEnforcementWithHttpInfo()

Gets the status of ActiveGate tokens enforcement | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesActiveGateTokensEnforcementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesActiveGateTokensEnforcementApi apiInstance = new ActiveGatesActiveGateTokensEnforcementApi(defaultClient);
        try {
            ApiResponse<ActiveGateTokenEnforcement> response = apiInstance.getTokenEnforcementWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesActiveGateTokensEnforcementApi#getTokenEnforcement");
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

ApiResponse<[**ActiveGateTokenEnforcement**](ActiveGateTokenEnforcement.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the status of ActiveGate tokens enforcement |  -  |

