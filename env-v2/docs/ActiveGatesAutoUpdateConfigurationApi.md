# ActiveGatesAutoUpdateConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoUpdateConfigById**](ActiveGatesAutoUpdateConfigurationApi.md#getAutoUpdateConfigById) | **GET** /activeGates/{agId}/autoUpdate | Gets the configuration of auto-update for the specified ActiveGate |
| [**getAutoUpdateConfigByIdWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#getAutoUpdateConfigByIdWithHttpInfo) | **GET** /activeGates/{agId}/autoUpdate | Gets the configuration of auto-update for the specified ActiveGate |
| [**getGlobalAutoUpdateConfigForTenant**](ActiveGatesAutoUpdateConfigurationApi.md#getGlobalAutoUpdateConfigForTenant) | **GET** /activeGates/autoUpdate | Gets the global auto-update configuration of environment ActiveGates. |
| [**getGlobalAutoUpdateConfigForTenantWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#getGlobalAutoUpdateConfigForTenantWithHttpInfo) | **GET** /activeGates/autoUpdate | Gets the global auto-update configuration of environment ActiveGates. |
| [**putAutoUpdateConfigById**](ActiveGatesAutoUpdateConfigurationApi.md#putAutoUpdateConfigById) | **PUT** /activeGates/{agId}/autoUpdate | Updates the configuration of auto-update for the specified ActiveGate |
| [**putAutoUpdateConfigByIdWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#putAutoUpdateConfigByIdWithHttpInfo) | **PUT** /activeGates/{agId}/autoUpdate | Updates the configuration of auto-update for the specified ActiveGate |
| [**putGlobalAutoUpdateConfigForTenant**](ActiveGatesAutoUpdateConfigurationApi.md#putGlobalAutoUpdateConfigForTenant) | **PUT** /activeGates/autoUpdate | Puts the global auto-update configuration of environment ActiveGates. |
| [**putGlobalAutoUpdateConfigForTenantWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#putGlobalAutoUpdateConfigForTenantWithHttpInfo) | **PUT** /activeGates/autoUpdate | Puts the global auto-update configuration of environment ActiveGates. |
| [**validateAutoUpdateConfigById**](ActiveGatesAutoUpdateConfigurationApi.md#validateAutoUpdateConfigById) | **POST** /activeGates/{agId}/autoUpdate/validator | Validates the payload for the &#x60;POST /activeGates/{agId}/autoUpdate&#x60; request. |
| [**validateAutoUpdateConfigByIdWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#validateAutoUpdateConfigByIdWithHttpInfo) | **POST** /activeGates/{agId}/autoUpdate/validator | Validates the payload for the &#x60;POST /activeGates/{agId}/autoUpdate&#x60; request. |
| [**validateGlobalAutoUpdateConfigForTenant**](ActiveGatesAutoUpdateConfigurationApi.md#validateGlobalAutoUpdateConfigForTenant) | **POST** /activeGates/autoUpdate/validator | Validates the payload for the &#x60;POST /activeGates/autoUpdate&#x60; request. |
| [**validateGlobalAutoUpdateConfigForTenantWithHttpInfo**](ActiveGatesAutoUpdateConfigurationApi.md#validateGlobalAutoUpdateConfigForTenantWithHttpInfo) | **POST** /activeGates/autoUpdate/validator | Validates the payload for the &#x60;POST /activeGates/autoUpdate&#x60; request. |



## getAutoUpdateConfigById

> ActiveGateAutoUpdateConfig getAutoUpdateConfigById(agId)

Gets the configuration of auto-update for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        try {
            ActiveGateAutoUpdateConfig result = apiInstance.getAutoUpdateConfigById(agId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#getAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |

### Return type

[**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. See response body for details. |  -  |

## getAutoUpdateConfigByIdWithHttpInfo

> ApiResponse<ActiveGateAutoUpdateConfig> getAutoUpdateConfigById getAutoUpdateConfigByIdWithHttpInfo(agId)

Gets the configuration of auto-update for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        try {
            ApiResponse<ActiveGateAutoUpdateConfig> response = apiInstance.getAutoUpdateConfigByIdWithHttpInfo(agId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#getAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |

### Return type

ApiResponse<[**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. See response body for details. |  -  |


## getGlobalAutoUpdateConfigForTenant

> ActiveGateGlobalAutoUpdateConfig getGlobalAutoUpdateConfigForTenant()

Gets the global auto-update configuration of environment ActiveGates.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        try {
            ActiveGateGlobalAutoUpdateConfig result = apiInstance.getGlobalAutoUpdateConfigForTenant();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#getGlobalAutoUpdateConfigForTenant");
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

[**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getGlobalAutoUpdateConfigForTenantWithHttpInfo

> ApiResponse<ActiveGateGlobalAutoUpdateConfig> getGlobalAutoUpdateConfigForTenant getGlobalAutoUpdateConfigForTenantWithHttpInfo()

Gets the global auto-update configuration of environment ActiveGates.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        try {
            ApiResponse<ActiveGateGlobalAutoUpdateConfig> response = apiInstance.getGlobalAutoUpdateConfigForTenantWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#getGlobalAutoUpdateConfigForTenant");
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

ApiResponse<[**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## putAutoUpdateConfigById

> void putAutoUpdateConfigById(agId, activeGateAutoUpdateConfig)

Updates the configuration of auto-update for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = new ActiveGateAutoUpdateConfig(); // ActiveGateAutoUpdateConfig | JSON body of the request, containing auto update parameters.
        try {
            apiInstance.putAutoUpdateConfigById(agId, activeGateAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#putAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |
| **activeGateAutoUpdateConfig** | [**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)| JSON body of the request, containing auto update parameters. | |

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
| **204** | Success. The auto-update configuration have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## putAutoUpdateConfigByIdWithHttpInfo

> ApiResponse<Void> putAutoUpdateConfigById putAutoUpdateConfigByIdWithHttpInfo(agId, activeGateAutoUpdateConfig)

Updates the configuration of auto-update for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = new ActiveGateAutoUpdateConfig(); // ActiveGateAutoUpdateConfig | JSON body of the request, containing auto update parameters.
        try {
            ApiResponse<Void> response = apiInstance.putAutoUpdateConfigByIdWithHttpInfo(agId, activeGateAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#putAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |
| **activeGateAutoUpdateConfig** | [**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)| JSON body of the request, containing auto update parameters. | |

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
| **204** | Success. The auto-update configuration have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## putGlobalAutoUpdateConfigForTenant

> void putGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig)

Puts the global auto-update configuration of environment ActiveGates.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = new ActiveGateGlobalAutoUpdateConfig(); // ActiveGateGlobalAutoUpdateConfig | JSON body of the request, containing global auto update parameters.
        try {
            apiInstance.putGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#putGlobalAutoUpdateConfigForTenant");
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
| **activeGateGlobalAutoUpdateConfig** | [**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)| JSON body of the request, containing global auto update parameters. | |

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
| **204** | Success. The global auto-update configuration have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## putGlobalAutoUpdateConfigForTenantWithHttpInfo

> ApiResponse<Void> putGlobalAutoUpdateConfigForTenant putGlobalAutoUpdateConfigForTenantWithHttpInfo(activeGateGlobalAutoUpdateConfig)

Puts the global auto-update configuration of environment ActiveGates.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = new ActiveGateGlobalAutoUpdateConfig(); // ActiveGateGlobalAutoUpdateConfig | JSON body of the request, containing global auto update parameters.
        try {
            ApiResponse<Void> response = apiInstance.putGlobalAutoUpdateConfigForTenantWithHttpInfo(activeGateGlobalAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#putGlobalAutoUpdateConfigForTenant");
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
| **activeGateGlobalAutoUpdateConfig** | [**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)| JSON body of the request, containing global auto update parameters. | |

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
| **204** | Success. The global auto-update configuration have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateAutoUpdateConfigById

> void validateAutoUpdateConfigById(agId, activeGateAutoUpdateConfig)

Validates the payload for the &#x60;POST /activeGates/{agId}/autoUpdate&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = new ActiveGateAutoUpdateConfig(); // ActiveGateAutoUpdateConfig | JSON body of the request, containing auto update parameters.
        try {
            apiInstance.validateAutoUpdateConfigById(agId, activeGateAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#validateAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |
| **activeGateAutoUpdateConfig** | [**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)| JSON body of the request, containing auto update parameters. | |

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
| **204** | Validated. The submitted auto-update configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateAutoUpdateConfigByIdWithHttpInfo

> ApiResponse<Void> validateAutoUpdateConfigById validateAutoUpdateConfigByIdWithHttpInfo(agId, activeGateAutoUpdateConfig)

Validates the payload for the &#x60;POST /activeGates/{agId}/autoUpdate&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        ActiveGateAutoUpdateConfig activeGateAutoUpdateConfig = new ActiveGateAutoUpdateConfig(); // ActiveGateAutoUpdateConfig | JSON body of the request, containing auto update parameters.
        try {
            ApiResponse<Void> response = apiInstance.validateAutoUpdateConfigByIdWithHttpInfo(agId, activeGateAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#validateAutoUpdateConfigById");
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
| **agId** | **String**| The ID of the required ActiveGate. | |
| **activeGateAutoUpdateConfig** | [**ActiveGateAutoUpdateConfig**](ActiveGateAutoUpdateConfig.md)| JSON body of the request, containing auto update parameters. | |

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
| **204** | Validated. The submitted auto-update configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateGlobalAutoUpdateConfigForTenant

> void validateGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig)

Validates the payload for the &#x60;POST /activeGates/autoUpdate&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = new ActiveGateGlobalAutoUpdateConfig(); // ActiveGateGlobalAutoUpdateConfig | JSON body of the request, containing global auto update parameters.
        try {
            apiInstance.validateGlobalAutoUpdateConfigForTenant(activeGateGlobalAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#validateGlobalAutoUpdateConfigForTenant");
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
| **activeGateGlobalAutoUpdateConfig** | [**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)| JSON body of the request, containing global auto update parameters. | |

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

## validateGlobalAutoUpdateConfigForTenantWithHttpInfo

> ApiResponse<Void> validateGlobalAutoUpdateConfigForTenant validateGlobalAutoUpdateConfigForTenantWithHttpInfo(activeGateGlobalAutoUpdateConfig)

Validates the payload for the &#x60;POST /activeGates/autoUpdate&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateConfigurationApi apiInstance = new ActiveGatesAutoUpdateConfigurationApi(defaultClient);
        ActiveGateGlobalAutoUpdateConfig activeGateGlobalAutoUpdateConfig = new ActiveGateGlobalAutoUpdateConfig(); // ActiveGateGlobalAutoUpdateConfig | JSON body of the request, containing global auto update parameters.
        try {
            ApiResponse<Void> response = apiInstance.validateGlobalAutoUpdateConfigForTenantWithHttpInfo(activeGateGlobalAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateConfigurationApi#validateGlobalAutoUpdateConfigForTenant");
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
| **activeGateGlobalAutoUpdateConfig** | [**ActiveGateGlobalAutoUpdateConfig**](ActiveGateGlobalAutoUpdateConfig.md)| JSON body of the request, containing global auto update parameters. | |

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

