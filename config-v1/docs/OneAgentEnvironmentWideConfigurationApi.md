# OneAgentEnvironmentWideConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoUpdateConfig**](OneAgentEnvironmentWideConfigurationApi.md#getAutoUpdateConfig) | **GET** /hosts/autoupdate | Gets the environment-wide configuration of OneAgents auto-update |
| [**getAutoUpdateConfigWithHttpInfo**](OneAgentEnvironmentWideConfigurationApi.md#getAutoUpdateConfigWithHttpInfo) | **GET** /hosts/autoupdate | Gets the environment-wide configuration of OneAgents auto-update |
| [**getTechGlobalConfigs**](OneAgentEnvironmentWideConfigurationApi.md#getTechGlobalConfigs) | **GET** /technologies | Gets the global monitoring configuration of technologies. |
| [**getTechGlobalConfigsWithHttpInfo**](OneAgentEnvironmentWideConfigurationApi.md#getTechGlobalConfigsWithHttpInfo) | **GET** /technologies | Gets the global monitoring configuration of technologies. |
| [**setAutoUpdateConfig**](OneAgentEnvironmentWideConfigurationApi.md#setAutoUpdateConfig) | **PUT** /hosts/autoupdate | Updates the environment-wide configuration of OneAgents auto-update |
| [**setAutoUpdateConfigWithHttpInfo**](OneAgentEnvironmentWideConfigurationApi.md#setAutoUpdateConfigWithHttpInfo) | **PUT** /hosts/autoupdate | Updates the environment-wide configuration of OneAgents auto-update |
| [**validateAutoUpdateConfig**](OneAgentEnvironmentWideConfigurationApi.md#validateAutoUpdateConfig) | **POST** /hosts/autoupdate/validator | Validates the payload for the &#x60;PUT /hosts/autoupdate&#x60; request |
| [**validateAutoUpdateConfigWithHttpInfo**](OneAgentEnvironmentWideConfigurationApi.md#validateAutoUpdateConfigWithHttpInfo) | **POST** /hosts/autoupdate/validator | Validates the payload for the &#x60;PUT /hosts/autoupdate&#x60; request |



## getAutoUpdateConfig

> EnvironmentAutoUpdateConfig getAutoUpdateConfig()

Gets the environment-wide configuration of OneAgents auto-update

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        try {
            EnvironmentAutoUpdateConfig result = apiInstance.getAutoUpdateConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#getAutoUpdateConfig");
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

[**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAutoUpdateConfigWithHttpInfo

> ApiResponse<EnvironmentAutoUpdateConfig> getAutoUpdateConfig getAutoUpdateConfigWithHttpInfo()

Gets the environment-wide configuration of OneAgents auto-update

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        try {
            ApiResponse<EnvironmentAutoUpdateConfig> response = apiInstance.getAutoUpdateConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#getAutoUpdateConfig");
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

ApiResponse<[**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTechGlobalConfigs

> TechMonitoringList getTechGlobalConfigs()

Gets the global monitoring configuration of technologies.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        try {
            TechMonitoringList result = apiInstance.getTechGlobalConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#getTechGlobalConfigs");
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

[**TechMonitoringList**](TechMonitoringList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getTechGlobalConfigsWithHttpInfo

> ApiResponse<TechMonitoringList> getTechGlobalConfigs getTechGlobalConfigsWithHttpInfo()

Gets the global monitoring configuration of technologies.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        try {
            ApiResponse<TechMonitoringList> response = apiInstance.getTechGlobalConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#getTechGlobalConfigs");
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

ApiResponse<[**TechMonitoringList**](TechMonitoringList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## setAutoUpdateConfig

> void setAutoUpdateConfig(environmentAutoUpdateConfig)

Updates the environment-wide configuration of OneAgents auto-update

OneAgents are updated several minutes after the change of configuration.   The process can take more time depending on number of OneAgents in the update queue.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        EnvironmentAutoUpdateConfig environmentAutoUpdateConfig = new EnvironmentAutoUpdateConfig(); // EnvironmentAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            apiInstance.setAutoUpdateConfig(environmentAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#setAutoUpdateConfig");
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
| **environmentAutoUpdateConfig** | [**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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

## setAutoUpdateConfigWithHttpInfo

> ApiResponse<Void> setAutoUpdateConfig setAutoUpdateConfigWithHttpInfo(environmentAutoUpdateConfig)

Updates the environment-wide configuration of OneAgents auto-update

OneAgents are updated several minutes after the change of configuration.   The process can take more time depending on number of OneAgents in the update queue.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        EnvironmentAutoUpdateConfig environmentAutoUpdateConfig = new EnvironmentAutoUpdateConfig(); // EnvironmentAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            ApiResponse<Void> response = apiInstance.setAutoUpdateConfigWithHttpInfo(environmentAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#setAutoUpdateConfig");
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
| **environmentAutoUpdateConfig** | [**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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


## validateAutoUpdateConfig

> void validateAutoUpdateConfig(environmentAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hosts/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        EnvironmentAutoUpdateConfig environmentAutoUpdateConfig = new EnvironmentAutoUpdateConfig(); // EnvironmentAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            apiInstance.validateAutoUpdateConfig(environmentAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#validateAutoUpdateConfig");
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
| **environmentAutoUpdateConfig** | [**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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

## validateAutoUpdateConfigWithHttpInfo

> ApiResponse<Void> validateAutoUpdateConfig validateAutoUpdateConfigWithHttpInfo(environmentAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hosts/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentEnvironmentWideConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentEnvironmentWideConfigurationApi apiInstance = new OneAgentEnvironmentWideConfigurationApi(defaultClient);
        EnvironmentAutoUpdateConfig environmentAutoUpdateConfig = new EnvironmentAutoUpdateConfig(); // EnvironmentAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateAutoUpdateConfigWithHttpInfo(environmentAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentEnvironmentWideConfigurationApi#validateAutoUpdateConfig");
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
| **environmentAutoUpdateConfig** | [**EnvironmentAutoUpdateConfig**](EnvironmentAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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

