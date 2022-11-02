# SyntheticMonitorsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addMonitor**](SyntheticMonitorsApi.md#addMonitor) | **POST** /synthetic/monitors | Creates a new synthetic monitor |
| [**addMonitorWithHttpInfo**](SyntheticMonitorsApi.md#addMonitorWithHttpInfo) | **POST** /synthetic/monitors | Creates a new synthetic monitor |
| [**deleteMonitor**](SyntheticMonitorsApi.md#deleteMonitor) | **DELETE** /synthetic/monitors/{monitorId} | Deletes the specified synthetic monitor |
| [**deleteMonitorWithHttpInfo**](SyntheticMonitorsApi.md#deleteMonitorWithHttpInfo) | **DELETE** /synthetic/monitors/{monitorId} | Deletes the specified synthetic monitor |
| [**getMonitor**](SyntheticMonitorsApi.md#getMonitor) | **GET** /synthetic/monitors/{monitorId} | Gets parameters of the specified synthetic monitor |
| [**getMonitorWithHttpInfo**](SyntheticMonitorsApi.md#getMonitorWithHttpInfo) | **GET** /synthetic/monitors/{monitorId} | Gets parameters of the specified synthetic monitor |
| [**getMonitorsCollection**](SyntheticMonitorsApi.md#getMonitorsCollection) | **GET** /synthetic/monitors | Lists all synthetic monitors in your Dynatrace environment |
| [**getMonitorsCollectionWithHttpInfo**](SyntheticMonitorsApi.md#getMonitorsCollectionWithHttpInfo) | **GET** /synthetic/monitors | Lists all synthetic monitors in your Dynatrace environment |
| [**replaceMonitor**](SyntheticMonitorsApi.md#replaceMonitor) | **PUT** /synthetic/monitors/{monitorId} | Updates parameters of the specified synthetic monitor |
| [**replaceMonitorWithHttpInfo**](SyntheticMonitorsApi.md#replaceMonitorWithHttpInfo) | **PUT** /synthetic/monitors/{monitorId} | Updates parameters of the specified synthetic monitor |



## addMonitor

> EntityIdDto addMonitor(syntheticMonitorUpdate)

Creates a new synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        SyntheticMonitorUpdate syntheticMonitorUpdate = new SyntheticMonitorUpdate(); // SyntheticMonitorUpdate | The JSON body of the request, containing parameters of the new synthetic monitor.
        try {
            EntityIdDto result = apiInstance.addMonitor(syntheticMonitorUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#addMonitor");
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
| **syntheticMonitorUpdate** | [**SyntheticMonitorUpdate**](SyntheticMonitorUpdate.md)| The JSON body of the request, containing parameters of the new synthetic monitor. | [optional] |

### Return type

[**EntityIdDto**](EntityIdDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The new synthetic monitor has been created. The response contains the Dynatrace entity ID of the new monitor. |  -  |

## addMonitorWithHttpInfo

> ApiResponse<EntityIdDto> addMonitor addMonitorWithHttpInfo(syntheticMonitorUpdate)

Creates a new synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        SyntheticMonitorUpdate syntheticMonitorUpdate = new SyntheticMonitorUpdate(); // SyntheticMonitorUpdate | The JSON body of the request, containing parameters of the new synthetic monitor.
        try {
            ApiResponse<EntityIdDto> response = apiInstance.addMonitorWithHttpInfo(syntheticMonitorUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#addMonitor");
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
| **syntheticMonitorUpdate** | [**SyntheticMonitorUpdate**](SyntheticMonitorUpdate.md)| The JSON body of the request, containing parameters of the new synthetic monitor. | [optional] |

### Return type

ApiResponse<[**EntityIdDto**](EntityIdDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The new synthetic monitor has been created. The response contains the Dynatrace entity ID of the new monitor. |  -  |


## deleteMonitor

> void deleteMonitor(monitorId)

Deletes the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the synthetic monitor to be deleted.
        try {
            apiInstance.deleteMonitor(monitorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#deleteMonitor");
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
| **monitorId** | **String**| The ID of the synthetic monitor to be deleted. | |

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
| **204** | Success. The synthetic monitor has been deleted. The response doesn&#39;t have a body |  -  |

## deleteMonitorWithHttpInfo

> ApiResponse<Void> deleteMonitor deleteMonitorWithHttpInfo(monitorId)

Deletes the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the synthetic monitor to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteMonitorWithHttpInfo(monitorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#deleteMonitor");
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
| **monitorId** | **String**| The ID of the synthetic monitor to be deleted. | |

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
| **204** | Success. The synthetic monitor has been deleted. The response doesn&#39;t have a body |  -  |


## getMonitor

> SyntheticMonitor getMonitor(monitorId)

Gets parameters of the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the required synthetic monitor
        try {
            SyntheticMonitor result = apiInstance.getMonitor(monitorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#getMonitor");
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
| **monitorId** | **String**| The ID of the required synthetic monitor | |

### Return type

[**SyntheticMonitor**](SyntheticMonitor.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMonitorWithHttpInfo

> ApiResponse<SyntheticMonitor> getMonitor getMonitorWithHttpInfo(monitorId)

Gets parameters of the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the required synthetic monitor
        try {
            ApiResponse<SyntheticMonitor> response = apiInstance.getMonitorWithHttpInfo(monitorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#getMonitor");
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
| **monitorId** | **String**| The ID of the required synthetic monitor | |

### Return type

ApiResponse<[**SyntheticMonitor**](SyntheticMonitor.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getMonitorsCollection

> Monitors getMonitorsCollection(managementZone, tag, location, assignedApps, type, enabled, credentialId, credentialOwner)

Lists all synthetic monitors in your Dynatrace environment

The full list can be lengthy, but you can narrow it down by specifying filter query parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        Long managementZone = 56L; // Long | Filters the resulting set of monitors to those which are part of the specified management zone.    Specify the ID of the management zone here.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of monitors by specified tags.   You can specify several tags in the following format: `tag=tag1&tag=tag2`. The monitor has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: `[context]key:value`.
        String location = "location_example"; // String | Filters the resulting set of monitors to those assigned to a specified Synthetic location.     Specify the ID of the location here.
        Set<String> assignedApps = Arrays.asList(); // Set<String> | Filters the resulting set of monitors to those assigned to the specified applications.   You can specify several applications in the following format: `assignedApps=app1&assignedApps=app2`. The monitor has to have **all** the specified applications assigned.   Specify Dynatrace entity IDs of applications here.
        String type = "type_example"; // String | Filters the resulting set of monitors to those of the specified type: `BROWSER` or `HTTP`.
        Boolean enabled = true; // Boolean | Filters the resulting set of monitors to those which are enabled (`true`) or disabled (`false`).
        String credentialId = "credentialId_example"; // String | Filters the resulting set of monitors to those using the specified credential set.   Specify the ID of the credentials set here.
        String credentialOwner = "credentialOwner_example"; // String | Filters the resulting set of monitors to those using a credential owned by the specified user.
        try {
            Monitors result = apiInstance.getMonitorsCollection(managementZone, tag, location, assignedApps, type, enabled, credentialId, credentialOwner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#getMonitorsCollection");
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
| **managementZone** | **Long**| Filters the resulting set of monitors to those which are part of the specified management zone.    Specify the ID of the management zone here. | [optional] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of monitors by specified tags.   You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The monitor has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;. | [optional] |
| **location** | **String**| Filters the resulting set of monitors to those assigned to a specified Synthetic location.     Specify the ID of the location here. | [optional] |
| **assignedApps** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of monitors to those assigned to the specified applications.   You can specify several applications in the following format: &#x60;assignedApps&#x3D;app1&amp;assignedApps&#x3D;app2&#x60;. The monitor has to have **all** the specified applications assigned.   Specify Dynatrace entity IDs of applications here. | [optional] |
| **type** | **String**| Filters the resulting set of monitors to those of the specified type: &#x60;BROWSER&#x60; or &#x60;HTTP&#x60;. | [optional] |
| **enabled** | **Boolean**| Filters the resulting set of monitors to those which are enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). | [optional] |
| **credentialId** | **String**| Filters the resulting set of monitors to those using the specified credential set.   Specify the ID of the credentials set here. | [optional] |
| **credentialOwner** | **String**| Filters the resulting set of monitors to those using a credential owned by the specified user. | [optional] |

### Return type

[**Monitors**](Monitors.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMonitorsCollectionWithHttpInfo

> ApiResponse<Monitors> getMonitorsCollection getMonitorsCollectionWithHttpInfo(managementZone, tag, location, assignedApps, type, enabled, credentialId, credentialOwner)

Lists all synthetic monitors in your Dynatrace environment

The full list can be lengthy, but you can narrow it down by specifying filter query parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        Long managementZone = 56L; // Long | Filters the resulting set of monitors to those which are part of the specified management zone.    Specify the ID of the management zone here.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of monitors by specified tags.   You can specify several tags in the following format: `tag=tag1&tag=tag2`. The monitor has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: `[context]key:value`.
        String location = "location_example"; // String | Filters the resulting set of monitors to those assigned to a specified Synthetic location.     Specify the ID of the location here.
        Set<String> assignedApps = Arrays.asList(); // Set<String> | Filters the resulting set of monitors to those assigned to the specified applications.   You can specify several applications in the following format: `assignedApps=app1&assignedApps=app2`. The monitor has to have **all** the specified applications assigned.   Specify Dynatrace entity IDs of applications here.
        String type = "type_example"; // String | Filters the resulting set of monitors to those of the specified type: `BROWSER` or `HTTP`.
        Boolean enabled = true; // Boolean | Filters the resulting set of monitors to those which are enabled (`true`) or disabled (`false`).
        String credentialId = "credentialId_example"; // String | Filters the resulting set of monitors to those using the specified credential set.   Specify the ID of the credentials set here.
        String credentialOwner = "credentialOwner_example"; // String | Filters the resulting set of monitors to those using a credential owned by the specified user.
        try {
            ApiResponse<Monitors> response = apiInstance.getMonitorsCollectionWithHttpInfo(managementZone, tag, location, assignedApps, type, enabled, credentialId, credentialOwner);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#getMonitorsCollection");
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
| **managementZone** | **Long**| Filters the resulting set of monitors to those which are part of the specified management zone.    Specify the ID of the management zone here. | [optional] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of monitors by specified tags.   You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The monitor has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;. | [optional] |
| **location** | **String**| Filters the resulting set of monitors to those assigned to a specified Synthetic location.     Specify the ID of the location here. | [optional] |
| **assignedApps** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of monitors to those assigned to the specified applications.   You can specify several applications in the following format: &#x60;assignedApps&#x3D;app1&amp;assignedApps&#x3D;app2&#x60;. The monitor has to have **all** the specified applications assigned.   Specify Dynatrace entity IDs of applications here. | [optional] |
| **type** | **String**| Filters the resulting set of monitors to those of the specified type: &#x60;BROWSER&#x60; or &#x60;HTTP&#x60;. | [optional] |
| **enabled** | **Boolean**| Filters the resulting set of monitors to those which are enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). | [optional] |
| **credentialId** | **String**| Filters the resulting set of monitors to those using the specified credential set.   Specify the ID of the credentials set here. | [optional] |
| **credentialOwner** | **String**| Filters the resulting set of monitors to those using a credential owned by the specified user. | [optional] |

### Return type

ApiResponse<[**Monitors**](Monitors.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## replaceMonitor

> void replaceMonitor(monitorId, syntheticMonitorUpdate)

Updates parameters of the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the synthetic monitor to be updated.
        SyntheticMonitorUpdate syntheticMonitorUpdate = new SyntheticMonitorUpdate(); // SyntheticMonitorUpdate | 
        try {
            apiInstance.replaceMonitor(monitorId, syntheticMonitorUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#replaceMonitor");
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
| **monitorId** | **String**| The ID of the synthetic monitor to be updated. | |
| **syntheticMonitorUpdate** | [**SyntheticMonitorUpdate**](SyntheticMonitorUpdate.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The synthetic monitor has been updated. The response doesn&#39;t have a body. |  -  |

## replaceMonitorWithHttpInfo

> ApiResponse<Void> replaceMonitor replaceMonitorWithHttpInfo(monitorId, syntheticMonitorUpdate)

Updates parameters of the specified synthetic monitor

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticMonitorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticMonitorsApi apiInstance = new SyntheticMonitorsApi(defaultClient);
        String monitorId = "monitorId_example"; // String | The ID of the synthetic monitor to be updated.
        SyntheticMonitorUpdate syntheticMonitorUpdate = new SyntheticMonitorUpdate(); // SyntheticMonitorUpdate | 
        try {
            ApiResponse<Void> response = apiInstance.replaceMonitorWithHttpInfo(monitorId, syntheticMonitorUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticMonitorsApi#replaceMonitor");
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
| **monitorId** | **String**| The ID of the synthetic monitor to be updated. | |
| **syntheticMonitorUpdate** | [**SyntheticMonitorUpdate**](SyntheticMonitorUpdate.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The synthetic monitor has been updated. The response doesn&#39;t have a body. |  -  |

