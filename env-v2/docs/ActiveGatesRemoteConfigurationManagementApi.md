# ActiveGatesRemoteConfigurationManagementApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRemoteIdentityOperationJob**](ActiveGatesRemoteConfigurationManagementApi.md#createRemoteIdentityOperationJob) | **POST** /activeGates/remoteConfigurationManagement | Creates a new remote configuration management job |
| [**createRemoteIdentityOperationJobWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#createRemoteIdentityOperationJobWithHttpInfo) | **POST** /activeGates/remoteConfigurationManagement | Creates a new remote configuration management job |
| [**createRemoteIdentityOperationPreview**](ActiveGatesRemoteConfigurationManagementApi.md#createRemoteIdentityOperationPreview) | **POST** /activeGates/remoteConfigurationManagement/preview | Creates a preview for remote configuration management job |
| [**createRemoteIdentityOperationPreviewWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#createRemoteIdentityOperationPreviewWithHttpInfo) | **POST** /activeGates/remoteConfigurationManagement/preview | Creates a preview for remote configuration management job |
| [**getCurrentRemoteIdentityOperationJob**](ActiveGatesRemoteConfigurationManagementApi.md#getCurrentRemoteIdentityOperationJob) | **GET** /activeGates/remoteConfigurationManagement/current | Gets remote configuration management job that is currently running |
| [**getCurrentRemoteIdentityOperationJobWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#getCurrentRemoteIdentityOperationJobWithHttpInfo) | **GET** /activeGates/remoteConfigurationManagement/current | Gets remote configuration management job that is currently running |
| [**getRemoteIdentityOperationJob**](ActiveGatesRemoteConfigurationManagementApi.md#getRemoteIdentityOperationJob) | **GET** /activeGates/remoteConfigurationManagement/{id} | Gets the specified remote configuration management job |
| [**getRemoteIdentityOperationJobWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#getRemoteIdentityOperationJobWithHttpInfo) | **GET** /activeGates/remoteConfigurationManagement/{id} | Gets the specified remote configuration management job |
| [**getRemoteIdentityOperations**](ActiveGatesRemoteConfigurationManagementApi.md#getRemoteIdentityOperations) | **GET** /activeGates/remoteConfigurationManagement | Lists finished ActiveGate remote configuration management jobs |
| [**getRemoteIdentityOperationsWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#getRemoteIdentityOperationsWithHttpInfo) | **GET** /activeGates/remoteConfigurationManagement | Lists finished ActiveGate remote configuration management jobs |
| [**validateRemoteIdentityOperation**](ActiveGatesRemoteConfigurationManagementApi.md#validateRemoteIdentityOperation) | **POST** /activeGates/remoteConfigurationManagement/validator | Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request. |
| [**validateRemoteIdentityOperationWithHttpInfo**](ActiveGatesRemoteConfigurationManagementApi.md#validateRemoteIdentityOperationWithHttpInfo) | **POST** /activeGates/remoteConfigurationManagement/validator | Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request. |



## createRemoteIdentityOperationJob

> RemoteConfigurationManagementJob createRemoteIdentityOperationJob(remoteConfigurationManagementOperationActiveGateRequest)

Creates a new remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            RemoteConfigurationManagementJob result = apiInstance.createRemoteIdentityOperationJob(remoteConfigurationManagementOperationActiveGateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#createRemoteIdentityOperationJob");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

### Return type

[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **409** | Other remote configuration management job is currently being executed |  -  |

## createRemoteIdentityOperationJobWithHttpInfo

> ApiResponse<RemoteConfigurationManagementJob> createRemoteIdentityOperationJob createRemoteIdentityOperationJobWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest)

Creates a new remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            ApiResponse<RemoteConfigurationManagementJob> response = apiInstance.createRemoteIdentityOperationJobWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#createRemoteIdentityOperationJob");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

### Return type

ApiResponse<[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **409** | Other remote configuration management job is currently being executed |  -  |


## createRemoteIdentityOperationPreview

> RemoteConfigurationManagementPreviewList createRemoteIdentityOperationPreview(remoteConfigurationManagementOperationActiveGateRequest)

Creates a preview for remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            RemoteConfigurationManagementPreviewList result = apiInstance.createRemoteIdentityOperationPreview(remoteConfigurationManagementOperationActiveGateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#createRemoteIdentityOperationPreview");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

### Return type

[**RemoteConfigurationManagementPreviewList**](RemoteConfigurationManagementPreviewList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRemoteIdentityOperationPreviewWithHttpInfo

> ApiResponse<RemoteConfigurationManagementPreviewList> createRemoteIdentityOperationPreview createRemoteIdentityOperationPreviewWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest)

Creates a preview for remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            ApiResponse<RemoteConfigurationManagementPreviewList> response = apiInstance.createRemoteIdentityOperationPreviewWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#createRemoteIdentityOperationPreview");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

### Return type

ApiResponse<[**RemoteConfigurationManagementPreviewList**](RemoteConfigurationManagementPreviewList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getCurrentRemoteIdentityOperationJob

> RemoteConfigurationManagementJob getCurrentRemoteIdentityOperationJob()

Gets remote configuration management job that is currently running

The currently running remote configuration management job may be related to ActiveGates or OneAgents. There is a limit of one concurrent remote configuration management job, regardless of the entity type.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        try {
            RemoteConfigurationManagementJob result = apiInstance.getCurrentRemoteIdentityOperationJob();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getCurrentRemoteIdentityOperationJob");
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

[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No remote configuration management job is currently running  |  -  |

## getCurrentRemoteIdentityOperationJobWithHttpInfo

> ApiResponse<RemoteConfigurationManagementJob> getCurrentRemoteIdentityOperationJob getCurrentRemoteIdentityOperationJobWithHttpInfo()

Gets remote configuration management job that is currently running

The currently running remote configuration management job may be related to ActiveGates or OneAgents. There is a limit of one concurrent remote configuration management job, regardless of the entity type.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        try {
            ApiResponse<RemoteConfigurationManagementJob> response = apiInstance.getCurrentRemoteIdentityOperationJobWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getCurrentRemoteIdentityOperationJob");
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

ApiResponse<[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | No remote configuration management job is currently running  |  -  |


## getRemoteIdentityOperationJob

> RemoteConfigurationManagementJob getRemoteIdentityOperationJob(id)

Gets the specified remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        String id = "id_example"; // String | The ID of the required remote configuration management job.
        try {
            RemoteConfigurationManagementJob result = apiInstance.getRemoteIdentityOperationJob(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getRemoteIdentityOperationJob");
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
| **id** | **String**| The ID of the required remote configuration management job. | |

### Return type

[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getRemoteIdentityOperationJobWithHttpInfo

> ApiResponse<RemoteConfigurationManagementJob> getRemoteIdentityOperationJob getRemoteIdentityOperationJobWithHttpInfo(id)

Gets the specified remote configuration management job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        String id = "id_example"; // String | The ID of the required remote configuration management job.
        try {
            ApiResponse<RemoteConfigurationManagementJob> response = apiInstance.getRemoteIdentityOperationJobWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getRemoteIdentityOperationJob");
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
| **id** | **String**| The ID of the required remote configuration management job. | |

### Return type

ApiResponse<[**RemoteConfigurationManagementJob**](RemoteConfigurationManagementJob.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getRemoteIdentityOperations

> RemoteConfigurationManagementJobList getRemoteIdentityOperations(from, to)

Lists finished ActiveGate remote configuration management jobs

The response includes finished jobs for the last 7 days.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String to = "to_example"; // String | The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        try {
            RemoteConfigurationManagementJobList result = apiInstance.getRemoteIdentityOperations(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getRemoteIdentityOperations");
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
| **from** | **String**| The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **to** | **String**| The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |

### Return type

[**RemoteConfigurationManagementJobList**](RemoteConfigurationManagementJobList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getRemoteIdentityOperationsWithHttpInfo

> ApiResponse<RemoteConfigurationManagementJobList> getRemoteIdentityOperations getRemoteIdentityOperationsWithHttpInfo(from, to)

Lists finished ActiveGate remote configuration management jobs

The response includes finished jobs for the last 7 days.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String to = "to_example"; // String | The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        try {
            ApiResponse<RemoteConfigurationManagementJobList> response = apiInstance.getRemoteIdentityOperationsWithHttpInfo(from, to);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#getRemoteIdentityOperations");
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
| **from** | **String**| The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **to** | **String**| The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |

### Return type

ApiResponse<[**RemoteConfigurationManagementJobList**](RemoteConfigurationManagementJobList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## validateRemoteIdentityOperation

> void validateRemoteIdentityOperation(remoteConfigurationManagementOperationActiveGateRequest)

Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            apiInstance.validateRemoteIdentityOperation(remoteConfigurationManagementOperationActiveGateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#validateRemoteIdentityOperation");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateRemoteIdentityOperationWithHttpInfo

> ApiResponse<Void> validateRemoteIdentityOperation validateRemoteIdentityOperationWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest)

Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesRemoteConfigurationManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesRemoteConfigurationManagementApi apiInstance = new ActiveGatesRemoteConfigurationManagementApi(defaultClient);
        RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest = new RemoteConfigurationManagementOperationActiveGateRequest(); // RemoteConfigurationManagementOperationActiveGateRequest | JSON body of the request, containing remote configuration management job definition.
        try {
            ApiResponse<Void> response = apiInstance.validateRemoteIdentityOperationWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesRemoteConfigurationManagementApi#validateRemoteIdentityOperation");
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
| **remoteConfigurationManagementOperationActiveGateRequest** | [**RemoteConfigurationManagementOperationActiveGateRequest**](RemoteConfigurationManagementOperationActiveGateRequest.md)| JSON body of the request, containing remote configuration management job definition. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

