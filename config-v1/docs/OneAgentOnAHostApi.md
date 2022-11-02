# OneAgentOnAHostApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoUpdateConfig1**](OneAgentOnAHostApi.md#getAutoUpdateConfig1) | **GET** /hosts/{id}/autoupdate | Gets the configuration of OneAgent auto-update on the specified host |
| [**getAutoUpdateConfig1WithHttpInfo**](OneAgentOnAHostApi.md#getAutoUpdateConfig1WithHttpInfo) | **GET** /hosts/{id}/autoupdate | Gets the configuration of OneAgent auto-update on the specified host |
| [**getHostConfig**](OneAgentOnAHostApi.md#getHostConfig) | **GET** /hosts/{id} | Gets the OneAgent configuration on the specified host |
| [**getHostConfigWithHttpInfo**](OneAgentOnAHostApi.md#getHostConfigWithHttpInfo) | **GET** /hosts/{id} | Gets the OneAgent configuration on the specified host |
| [**getMonitoringConfig**](OneAgentOnAHostApi.md#getMonitoringConfig) | **GET** /hosts/{id}/monitoring | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |
| [**getMonitoringConfigWithHttpInfo**](OneAgentOnAHostApi.md#getMonitoringConfigWithHttpInfo) | **GET** /hosts/{id}/monitoring | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |
| [**getTechHostConfigs**](OneAgentOnAHostApi.md#getTechHostConfigs) | **GET** /hosts/{id}/technologies | Gets the configuration of monitored technologies on the specified host |
| [**getTechHostConfigsWithHttpInfo**](OneAgentOnAHostApi.md#getTechHostConfigsWithHttpInfo) | **GET** /hosts/{id}/technologies | Gets the configuration of monitored technologies on the specified host |
| [**updateAutoUpdateConfig**](OneAgentOnAHostApi.md#updateAutoUpdateConfig) | **PUT** /hosts/{id}/autoupdate | Updates the configuration of OneAgent auto-update on the specified host |
| [**updateAutoUpdateConfigWithHttpInfo**](OneAgentOnAHostApi.md#updateAutoUpdateConfigWithHttpInfo) | **PUT** /hosts/{id}/autoupdate | Updates the configuration of OneAgent auto-update on the specified host |
| [**updateMonitoringConfig**](OneAgentOnAHostApi.md#updateMonitoringConfig) | **PUT** /hosts/{id}/monitoring | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |
| [**updateMonitoringConfigWithHttpInfo**](OneAgentOnAHostApi.md#updateMonitoringConfigWithHttpInfo) | **PUT** /hosts/{id}/monitoring | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |
| [**validateAutoUpdateConfig1**](OneAgentOnAHostApi.md#validateAutoUpdateConfig1) | **POST** /hosts/{id}/autoupdate/validator | Validates the payload for the &#x60;PUT /hosts/{id}/autoupdate&#x60; request |
| [**validateAutoUpdateConfig1WithHttpInfo**](OneAgentOnAHostApi.md#validateAutoUpdateConfig1WithHttpInfo) | **POST** /hosts/{id}/autoupdate/validator | Validates the payload for the &#x60;PUT /hosts/{id}/autoupdate&#x60; request |
| [**validateMonitoringConfig**](OneAgentOnAHostApi.md#validateMonitoringConfig) | **POST** /hosts/{id}/monitoring/validator | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |
| [**validateMonitoringConfigWithHttpInfo**](OneAgentOnAHostApi.md#validateMonitoringConfigWithHttpInfo) | **POST** /hosts/{id}/monitoring/validator | Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead. |



## getAutoUpdateConfig1

> HostAutoUpdateConfig getAutoUpdateConfig1(id)

Gets the configuration of OneAgent auto-update on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            HostAutoUpdateConfig result = apiInstance.getAutoUpdateConfig1(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

[**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAutoUpdateConfig1WithHttpInfo

> ApiResponse<HostAutoUpdateConfig> getAutoUpdateConfig1 getAutoUpdateConfig1WithHttpInfo(id)

Gets the configuration of OneAgent auto-update on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<HostAutoUpdateConfig> response = apiInstance.getAutoUpdateConfig1WithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

ApiResponse<[**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getHostConfig

> HostConfig getHostConfig(id)

Gets the OneAgent configuration on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            HostConfig result = apiInstance.getHostConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getHostConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

[**HostConfig**](HostConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostConfigWithHttpInfo

> ApiResponse<HostConfig> getHostConfig getHostConfigWithHttpInfo(id)

Gets the OneAgent configuration on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<HostConfig> response = apiInstance.getHostConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getHostConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

ApiResponse<[**HostConfig**](HostConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMonitoringConfig

> MonitoringConfig getMonitoringConfig(id)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Gets the monitoring configuration of OneAgent on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            MonitoringConfig result = apiInstance.getMonitoringConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

[**MonitoringConfig**](MonitoringConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMonitoringConfigWithHttpInfo

> ApiResponse<MonitoringConfig> getMonitoringConfig getMonitoringConfigWithHttpInfo(id)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Gets the monitoring configuration of OneAgent on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<MonitoringConfig> response = apiInstance.getMonitoringConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

ApiResponse<[**MonitoringConfig**](MonitoringConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTechHostConfigs

> TechMonitoringList getTechHostConfigs(id)

Gets the configuration of monitored technologies on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            TechMonitoringList result = apiInstance.getTechHostConfigs(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getTechHostConfigs");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

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

## getTechHostConfigsWithHttpInfo

> ApiResponse<TechMonitoringList> getTechHostConfigs getTechHostConfigsWithHttpInfo(id)

Gets the configuration of monitored technologies on the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<TechMonitoringList> response = apiInstance.getTechHostConfigsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#getTechHostConfigs");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |

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


## updateAutoUpdateConfig

> void updateAutoUpdateConfig(id, hostAutoUpdateConfig)

Updates the configuration of OneAgent auto-update on the specified host

OneAgent is updated several minutes after the change of configuration.   The process can take more time depending on number of OneAgents in the update queue.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        HostAutoUpdateConfig hostAutoUpdateConfig = new HostAutoUpdateConfig(); // HostAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            apiInstance.updateAutoUpdateConfig(id, hostAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#updateAutoUpdateConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **hostAutoUpdateConfig** | [**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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

## updateAutoUpdateConfigWithHttpInfo

> ApiResponse<Void> updateAutoUpdateConfig updateAutoUpdateConfigWithHttpInfo(id, hostAutoUpdateConfig)

Updates the configuration of OneAgent auto-update on the specified host

OneAgent is updated several minutes after the change of configuration.   The process can take more time depending on number of OneAgents in the update queue.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        HostAutoUpdateConfig hostAutoUpdateConfig = new HostAutoUpdateConfig(); // HostAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            ApiResponse<Void> response = apiInstance.updateAutoUpdateConfigWithHttpInfo(id, hostAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#updateAutoUpdateConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **hostAutoUpdateConfig** | [**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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


## updateMonitoringConfig

> void updateMonitoringConfig(id, monitoringConfig)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Updates the monitoring configuration of OneAgent on the specified host. The monitoring mode of OneAgent is updated several minutes after the change of configuration.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        MonitoringConfig monitoringConfig = new MonitoringConfig(); // MonitoringConfig | The JSON body of the request. Contains OneAgent monitoring parameters.
        try {
            apiInstance.updateMonitoringConfig(id, monitoringConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#updateMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md)| The JSON body of the request. Contains OneAgent monitoring parameters. | [optional] |

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

## updateMonitoringConfigWithHttpInfo

> ApiResponse<Void> updateMonitoringConfig updateMonitoringConfigWithHttpInfo(id, monitoringConfig)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Updates the monitoring configuration of OneAgent on the specified host. The monitoring mode of OneAgent is updated several minutes after the change of configuration.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        MonitoringConfig monitoringConfig = new MonitoringConfig(); // MonitoringConfig | The JSON body of the request. Contains OneAgent monitoring parameters.
        try {
            ApiResponse<Void> response = apiInstance.updateMonitoringConfigWithHttpInfo(id, monitoringConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#updateMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md)| The JSON body of the request. Contains OneAgent monitoring parameters. | [optional] |

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


## validateAutoUpdateConfig1

> void validateAutoUpdateConfig1(id, hostAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hosts/{id}/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        HostAutoUpdateConfig hostAutoUpdateConfig = new HostAutoUpdateConfig(); // HostAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            apiInstance.validateAutoUpdateConfig1(id, hostAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#validateAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **hostAutoUpdateConfig** | [**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateAutoUpdateConfig1WithHttpInfo

> ApiResponse<Void> validateAutoUpdateConfig1 validateAutoUpdateConfig1WithHttpInfo(id, hostAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hosts/{id}/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        HostAutoUpdateConfig hostAutoUpdateConfig = new HostAutoUpdateConfig(); // HostAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateAutoUpdateConfig1WithHttpInfo(id, hostAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#validateAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **hostAutoUpdateConfig** | [**HostAutoUpdateConfig**](HostAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |


## validateMonitoringConfig

> void validateMonitoringConfig(id, monitoringConfig)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Validates the payload for the &#x60;PUT /hosts/{id}/monitoring&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        MonitoringConfig monitoringConfig = new MonitoringConfig(); // MonitoringConfig | The JSON body of the request. Contains OneAgent monitoring parameters.
        try {
            apiInstance.validateMonitoringConfig(id, monitoringConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#validateMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md)| The JSON body of the request. Contains OneAgent monitoring parameters. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateMonitoringConfigWithHttpInfo

> ApiResponse<Void> validateMonitoringConfig validateMonitoringConfigWithHttpInfo(id, monitoringConfig)

Deprecated. Manage host monitoring settings via the environment API v2 settings endpoint with schemaId &#39;builtin:host.monitoring&#39; instead.

Deprecated. Manage host monitoring settings via the [Settings endpoint](index.jsp?urls.primaryName&#x3D;Environment%20API%20v2#/Settings%20-%20Objects) with schemaId &#x60;builtin:host.monitoring&#x60; instead.  Validates the payload for the &#x60;PUT /hosts/{id}/monitoring&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentOnAHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentOnAHostApi apiInstance = new OneAgentOnAHostApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host.
        MonitoringConfig monitoringConfig = new MonitoringConfig(); // MonitoringConfig | The JSON body of the request. Contains OneAgent monitoring parameters.
        try {
            ApiResponse<Void> response = apiInstance.validateMonitoringConfigWithHttpInfo(id, monitoringConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentOnAHostApi#validateMonitoringConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host. | |
| **monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md)| The JSON body of the request. Contains OneAgent monitoring parameters. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

