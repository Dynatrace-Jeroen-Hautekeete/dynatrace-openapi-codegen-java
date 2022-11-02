# ThresholdApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomThreshold**](ThresholdApi.md#createCustomThreshold) | **PUT** /thresholds/{thresholdId} | Creates or updates an existing threshold for a plugin or a custom event |
| [**createCustomThresholdWithHttpInfo**](ThresholdApi.md#createCustomThresholdWithHttpInfo) | **PUT** /thresholds/{thresholdId} | Creates or updates an existing threshold for a plugin or a custom event |
| [**deleteCustomThreshold**](ThresholdApi.md#deleteCustomThreshold) | **DELETE** /thresholds/{thresholdId} | Deletes the specified threshold |
| [**deleteCustomThresholdWithHttpInfo**](ThresholdApi.md#deleteCustomThresholdWithHttpInfo) | **DELETE** /thresholds/{thresholdId} | Deletes the specified threshold |
| [**readCustomThresholds**](ThresholdApi.md#readCustomThresholds) | **GET** /thresholds | Gets all configured thresholds for plugins and custom events in your environment |
| [**readCustomThresholdsWithHttpInfo**](ThresholdApi.md#readCustomThresholdsWithHttpInfo) | **GET** /thresholds | Gets all configured thresholds for plugins and custom events in your environment |



## createCustomThreshold

> Threshold createCustomThreshold(thresholdId, thresholdRegistrationMessage)

Creates or updates an existing threshold for a plugin or a custom event

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String thresholdId = "thresholdId_example"; // String | The ID of the threshold to create or update.
        ThresholdRegistrationMessage thresholdRegistrationMessage = new ThresholdRegistrationMessage(); // ThresholdRegistrationMessage | JSON body of the request, containing threshold parameters.
        try {
            Threshold result = apiInstance.createCustomThreshold(thresholdId, thresholdRegistrationMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#createCustomThreshold");
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
| **thresholdId** | **String**| The ID of the threshold to create or update. | |
| **thresholdRegistrationMessage** | [**ThresholdRegistrationMessage**](ThresholdRegistrationMessage.md)| JSON body of the request, containing threshold parameters. | [optional] |

### Return type

[**Threshold**](Threshold.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

## createCustomThresholdWithHttpInfo

> ApiResponse<Threshold> createCustomThreshold createCustomThresholdWithHttpInfo(thresholdId, thresholdRegistrationMessage)

Creates or updates an existing threshold for a plugin or a custom event

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String thresholdId = "thresholdId_example"; // String | The ID of the threshold to create or update.
        ThresholdRegistrationMessage thresholdRegistrationMessage = new ThresholdRegistrationMessage(); // ThresholdRegistrationMessage | JSON body of the request, containing threshold parameters.
        try {
            ApiResponse<Threshold> response = apiInstance.createCustomThresholdWithHttpInfo(thresholdId, thresholdRegistrationMessage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#createCustomThreshold");
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
| **thresholdId** | **String**| The ID of the threshold to create or update. | |
| **thresholdRegistrationMessage** | [**ThresholdRegistrationMessage**](ThresholdRegistrationMessage.md)| JSON body of the request, containing threshold parameters. | [optional] |

### Return type

ApiResponse<[**Threshold**](Threshold.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |


## deleteCustomThreshold

> void deleteCustomThreshold(thresholdId)

Deletes the specified threshold

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String thresholdId = "thresholdId_example"; // String | The ID of the threshold to delete.
        try {
            apiInstance.deleteCustomThreshold(thresholdId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#deleteCustomThreshold");
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
| **thresholdId** | **String**| The ID of the threshold to delete. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The threshold has been deleted. |  -  |

## deleteCustomThresholdWithHttpInfo

> ApiResponse<Void> deleteCustomThreshold deleteCustomThresholdWithHttpInfo(thresholdId)

Deletes the specified threshold

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String thresholdId = "thresholdId_example"; // String | The ID of the threshold to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteCustomThresholdWithHttpInfo(thresholdId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#deleteCustomThreshold");
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
| **thresholdId** | **String**| The ID of the threshold to delete. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The threshold has been deleted. |  -  |


## readCustomThresholds

> List<Threshold> readCustomThresholds(filter)

Gets all configured thresholds for plugins and custom events in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String filter = "ALL"; // String | Filters thresholds by the source.
        try {
            List<Threshold> result = apiInstance.readCustomThresholds(filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#readCustomThresholds");
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
| **filter** | **String**| Filters thresholds by the source. | [optional] [enum: ALL, PLUGIN, REMOTE_PLUGIN, USER_INTERACTION] |

### Return type

[**List&lt;Threshold&gt;**](Threshold.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## readCustomThresholdsWithHttpInfo

> ApiResponse<List<Threshold>> readCustomThresholds readCustomThresholdsWithHttpInfo(filter)

Gets all configured thresholds for plugins and custom events in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ThresholdApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ThresholdApi apiInstance = new ThresholdApi(defaultClient);
        String filter = "ALL"; // String | Filters thresholds by the source.
        try {
            ApiResponse<List<Threshold>> response = apiInstance.readCustomThresholdsWithHttpInfo(filter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ThresholdApi#readCustomThresholds");
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
| **filter** | **String**| Filters thresholds by the source. | [optional] [enum: ALL, PLUGIN, REMOTE_PLUGIN, USER_INTERACTION] |

### Return type

ApiResponse<[**List&lt;Threshold&gt;**](Threshold.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

