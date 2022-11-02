# OneAgentInAHostGroupApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoUpdateConfig2**](OneAgentInAHostGroupApi.md#getAutoUpdateConfig2) | **GET** /hostgroups/{id}/autoupdate | Gets the configuration of OneAgent auto-update in the specified host group |
| [**getAutoUpdateConfig2WithHttpInfo**](OneAgentInAHostGroupApi.md#getAutoUpdateConfig2WithHttpInfo) | **GET** /hostgroups/{id}/autoupdate | Gets the configuration of OneAgent auto-update in the specified host group |
| [**getHostGroupConfig**](OneAgentInAHostGroupApi.md#getHostGroupConfig) | **GET** /hostgroups/{id} | Gets the OneAgent configuration in the specified host group |
| [**getHostGroupConfigWithHttpInfo**](OneAgentInAHostGroupApi.md#getHostGroupConfigWithHttpInfo) | **GET** /hostgroups/{id} | Gets the OneAgent configuration in the specified host group |
| [**updateAutoUpdateConfig1**](OneAgentInAHostGroupApi.md#updateAutoUpdateConfig1) | **PUT** /hostgroups/{id}/autoupdate | Updates the configuration of OneAgent auto-update in the specified host group |
| [**updateAutoUpdateConfig1WithHttpInfo**](OneAgentInAHostGroupApi.md#updateAutoUpdateConfig1WithHttpInfo) | **PUT** /hostgroups/{id}/autoupdate | Updates the configuration of OneAgent auto-update in the specified host group |
| [**validateAutoUpdateConfig2**](OneAgentInAHostGroupApi.md#validateAutoUpdateConfig2) | **POST** /hostgroups/{id}/autoupdate/validator | Validates the payload for the &#x60;PUT /hostgroups/{id}/autoupdate&#x60; request |
| [**validateAutoUpdateConfig2WithHttpInfo**](OneAgentInAHostGroupApi.md#validateAutoUpdateConfig2WithHttpInfo) | **POST** /hostgroups/{id}/autoupdate/validator | Validates the payload for the &#x60;PUT /hostgroups/{id}/autoupdate&#x60; request |



## getAutoUpdateConfig2

> HostGroupAutoUpdateConfig getAutoUpdateConfig2(id)

Gets the configuration of OneAgent auto-update in the specified host group

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        try {
            HostGroupAutoUpdateConfig result = apiInstance.getAutoUpdateConfig2(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#getAutoUpdateConfig2");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |

### Return type

[**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAutoUpdateConfig2WithHttpInfo

> ApiResponse<HostGroupAutoUpdateConfig> getAutoUpdateConfig2 getAutoUpdateConfig2WithHttpInfo(id)

Gets the configuration of OneAgent auto-update in the specified host group

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        try {
            ApiResponse<HostGroupAutoUpdateConfig> response = apiInstance.getAutoUpdateConfig2WithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#getAutoUpdateConfig2");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |

### Return type

ApiResponse<[**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getHostGroupConfig

> OneAgentHostGroupConfig getHostGroupConfig(id)

Gets the OneAgent configuration in the specified host group

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        try {
            OneAgentHostGroupConfig result = apiInstance.getHostGroupConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#getHostGroupConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |

### Return type

[**OneAgentHostGroupConfig**](OneAgentHostGroupConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostGroupConfigWithHttpInfo

> ApiResponse<OneAgentHostGroupConfig> getHostGroupConfig getHostGroupConfigWithHttpInfo(id)

Gets the OneAgent configuration in the specified host group

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        try {
            ApiResponse<OneAgentHostGroupConfig> response = apiInstance.getHostGroupConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#getHostGroupConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |

### Return type

ApiResponse<[**OneAgentHostGroupConfig**](OneAgentHostGroupConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateAutoUpdateConfig1

> void updateAutoUpdateConfig1(id, hostGroupAutoUpdateConfig)

Updates the configuration of OneAgent auto-update in the specified host group

OneAgents are updated several minutes after the change of configuration.   The process can take more time depending on number of OneAgents in the update queue.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        HostGroupAutoUpdateConfig hostGroupAutoUpdateConfig = new HostGroupAutoUpdateConfig(); // HostGroupAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            apiInstance.updateAutoUpdateConfig1(id, hostGroupAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#updateAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |
| **hostGroupAutoUpdateConfig** | [**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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

## updateAutoUpdateConfig1WithHttpInfo

> ApiResponse<Void> updateAutoUpdateConfig1 updateAutoUpdateConfig1WithHttpInfo(id, hostGroupAutoUpdateConfig)

Updates the configuration of OneAgent auto-update in the specified host group

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
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        HostGroupAutoUpdateConfig hostGroupAutoUpdateConfig = new HostGroupAutoUpdateConfig(); // HostGroupAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters.
        try {
            ApiResponse<Void> response = apiInstance.updateAutoUpdateConfig1WithHttpInfo(id, hostGroupAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#updateAutoUpdateConfig1");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |
| **hostGroupAutoUpdateConfig** | [**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters. | [optional] |

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


## validateAutoUpdateConfig2

> void validateAutoUpdateConfig2(id, hostGroupAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hostgroups/{id}/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        HostGroupAutoUpdateConfig hostGroupAutoUpdateConfig = new HostGroupAutoUpdateConfig(); // HostGroupAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            apiInstance.validateAutoUpdateConfig2(id, hostGroupAutoUpdateConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#validateAutoUpdateConfig2");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |
| **hostGroupAutoUpdateConfig** | [**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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

## validateAutoUpdateConfig2WithHttpInfo

> ApiResponse<Void> validateAutoUpdateConfig2 validateAutoUpdateConfig2WithHttpInfo(id, hostGroupAutoUpdateConfig)

Validates the payload for the &#x60;PUT /hostgroups/{id}/autoupdate&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.OneAgentInAHostGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        OneAgentInAHostGroupApi apiInstance = new OneAgentInAHostGroupApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required host group.
        HostGroupAutoUpdateConfig hostGroupAutoUpdateConfig = new HostGroupAutoUpdateConfig(); // HostGroupAutoUpdateConfig | The JSON body of the request. Contains OneAgent auto-update parameters to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateAutoUpdateConfig2WithHttpInfo(id, hostGroupAutoUpdateConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling OneAgentInAHostGroupApi#validateAutoUpdateConfig2");
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
| **id** | **String**| The Dynatrace entity ID of the required host group. | |
| **hostGroupAutoUpdateConfig** | [**HostGroupAutoUpdateConfig**](HostGroupAutoUpdateConfig.md)| The JSON body of the request. Contains OneAgent auto-update parameters to be validated. | [optional] |

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

