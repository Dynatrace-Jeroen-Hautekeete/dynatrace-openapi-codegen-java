# ActiveGatesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllActiveGates**](ActiveGatesApi.md#getAllActiveGates) | **GET** /activeGates | Lists all available ActiveGates |
| [**getAllActiveGatesWithHttpInfo**](ActiveGatesApi.md#getAllActiveGatesWithHttpInfo) | **GET** /activeGates | Lists all available ActiveGates |
| [**getOneActiveGateById**](ActiveGatesApi.md#getOneActiveGateById) | **GET** /activeGates/{agId} | Gets the details of the specified ActiveGate |
| [**getOneActiveGateByIdWithHttpInfo**](ActiveGatesApi.md#getOneActiveGateByIdWithHttpInfo) | **GET** /activeGates/{agId} | Gets the details of the specified ActiveGate |



## getAllActiveGates

> ActiveGateList getAllActiveGates(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet)

Lists all available ActiveGates

The response includes all ActiveGates that are currently connected to the environment or have been connected during last 2 hours.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesApi apiInstance = new ActiveGatesApi(defaultClient);
        String hostname = "hostname_example"; // String | Filters the resulting set of ActiveGates by the name of the host it's running on.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        String osType = "LINUX"; // String | Filters the resulting set of ActiveGates by the OS type of the host it's running on.
        String networkAddress = "networkAddress_example"; // String | Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the `CONTAINS` operator is used.
        String loadBalancerAddress = "loadBalancerAddress_example"; // String | Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the `CONTAINS` operator is used.
        String type = "ENVIRONMENT"; // String | Filters the resulting set of ActiveGates by the ActiveGate type.
        String networkZone = "networkZone_example"; // String | Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        String updateStatus = "INCOMPATIBLE"; // String | Filters the resulting set of ActiveGates by the auto-update status.
        String versionCompareType = "EQUAL"; // String | Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here.
        String version = "version_example"; // String | Filters the resulting set of ActiveGates by the specified version.    Specify the version in `<major>.<minor>.<revision>` format (for example, `1.195.0`) here.
        String autoUpdate = "DISABLED"; // String | Filters the resulting set of ActiveGates by the actual state of auto-update.
        String group = "group_example"; // String | Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        Boolean online = true; // Boolean | Filters the resulting set of ActiveGates by the communication status.
        List<String> enabledModule = Arrays.asList(); // List<String> | Filters the resulting set of ActiveGates by the enabled modules.
        List<String> disabledModule = Arrays.asList(); // List<String> | Filters the resulting set of ActiveGates by the disabled modules.
        Boolean containerized = true; // Boolean | Filters the resulting set of ActiveGates to those which are running in container (`true`) or not (`false`).
        String tokenState = "ABSENT"; // String | Filters the resulting set of ActiveGates to those with authorization token in specified state.
        Boolean tokenExpirationSet = true; // Boolean | Filters the resulting set of ActiveGates to those with set expiration date for authorization token.
        try {
            ActiveGateList result = apiInstance.getAllActiveGates(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesApi#getAllActiveGates");
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
| **hostname** | **String**| Filters the resulting set of ActiveGates by the name of the host it&#39;s running on.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **osType** | **String**| Filters the resulting set of ActiveGates by the OS type of the host it&#39;s running on. | [optional] [enum: LINUX, WINDOWS] |
| **networkAddress** | **String**| Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **loadBalancerAddress** | **String**| Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **type** | **String**| Filters the resulting set of ActiveGates by the ActiveGate type. | [optional] [enum: ENVIRONMENT, ENVIRONMENT_MULTI] |
| **networkZone** | **String**| Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **updateStatus** | **String**| Filters the resulting set of ActiveGates by the auto-update status. | [optional] [enum: INCOMPATIBLE, OUTDATED, SCHEDULED, SUPPRESSED, UNKNOWN, UP2DATE, UPDATE_IN_PROGRESS, UPDATE_PENDING, UPDATE_PROBLEM] |
| **versionCompareType** | **String**| Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **version** | **String**| Filters the resulting set of ActiveGates by the specified version.    Specify the version in &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example, &#x60;1.195.0&#x60;) here. | [optional] |
| **autoUpdate** | **String**| Filters the resulting set of ActiveGates by the actual state of auto-update. | [optional] [enum: DISABLED, ENABLED] |
| **group** | **String**| Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **online** | **Boolean**| Filters the resulting set of ActiveGates by the communication status. | [optional] |
| **enabledModule** | [**List&lt;String&gt;**](String.md)| Filters the resulting set of ActiveGates by the enabled modules. | [optional] [enum: AWS, AZURE, BEACON_FORWARDER, CLOUD_FOUNDRY, DB_INSIGHT, EXTENSIONS_V1, EXTENSIONS_V2, KUBERNETES, LOGS, MEMORY_DUMPS, METRIC_API, ONE_AGENT_ROUTING, OTLP_INGEST, REST_API, SYNTHETIC, VMWARE, Z_OS] |
| **disabledModule** | [**List&lt;String&gt;**](String.md)| Filters the resulting set of ActiveGates by the disabled modules. | [optional] [enum: AWS, AZURE, BEACON_FORWARDER, CLOUD_FOUNDRY, DB_INSIGHT, EXTENSIONS_V1, EXTENSIONS_V2, KUBERNETES, LOGS, MEMORY_DUMPS, METRIC_API, ONE_AGENT_ROUTING, OTLP_INGEST, REST_API, SYNTHETIC, VMWARE, Z_OS] |
| **containerized** | **Boolean**| Filters the resulting set of ActiveGates to those which are running in container (&#x60;true&#x60;) or not (&#x60;false&#x60;). | [optional] |
| **tokenState** | **String**| Filters the resulting set of ActiveGates to those with authorization token in specified state. | [optional] [enum: ABSENT, EXPIRING, INVALID, UNKNOWN, UNSUPPORTED, VALID] |
| **tokenExpirationSet** | **Boolean**| Filters the resulting set of ActiveGates to those with set expiration date for authorization token. | [optional] |

### Return type

[**ActiveGateList**](ActiveGateList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |

## getAllActiveGatesWithHttpInfo

> ApiResponse<ActiveGateList> getAllActiveGates getAllActiveGatesWithHttpInfo(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet)

Lists all available ActiveGates

The response includes all ActiveGates that are currently connected to the environment or have been connected during last 2 hours.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesApi apiInstance = new ActiveGatesApi(defaultClient);
        String hostname = "hostname_example"; // String | Filters the resulting set of ActiveGates by the name of the host it's running on.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        String osType = "LINUX"; // String | Filters the resulting set of ActiveGates by the OS type of the host it's running on.
        String networkAddress = "networkAddress_example"; // String | Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the `CONTAINS` operator is used.
        String loadBalancerAddress = "loadBalancerAddress_example"; // String | Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the `CONTAINS` operator is used.
        String type = "ENVIRONMENT"; // String | Filters the resulting set of ActiveGates by the ActiveGate type.
        String networkZone = "networkZone_example"; // String | Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        String updateStatus = "INCOMPATIBLE"; // String | Filters the resulting set of ActiveGates by the auto-update status.
        String versionCompareType = "EQUAL"; // String | Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here.
        String version = "version_example"; // String | Filters the resulting set of ActiveGates by the specified version.    Specify the version in `<major>.<minor>.<revision>` format (for example, `1.195.0`) here.
        String autoUpdate = "DISABLED"; // String | Filters the resulting set of ActiveGates by the actual state of auto-update.
        String group = "group_example"; // String | Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the `CONTAINS` operator is used.
        Boolean online = true; // Boolean | Filters the resulting set of ActiveGates by the communication status.
        List<String> enabledModule = Arrays.asList(); // List<String> | Filters the resulting set of ActiveGates by the enabled modules.
        List<String> disabledModule = Arrays.asList(); // List<String> | Filters the resulting set of ActiveGates by the disabled modules.
        Boolean containerized = true; // Boolean | Filters the resulting set of ActiveGates to those which are running in container (`true`) or not (`false`).
        String tokenState = "ABSENT"; // String | Filters the resulting set of ActiveGates to those with authorization token in specified state.
        Boolean tokenExpirationSet = true; // Boolean | Filters the resulting set of ActiveGates to those with set expiration date for authorization token.
        try {
            ApiResponse<ActiveGateList> response = apiInstance.getAllActiveGatesWithHttpInfo(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesApi#getAllActiveGates");
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
| **hostname** | **String**| Filters the resulting set of ActiveGates by the name of the host it&#39;s running on.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **osType** | **String**| Filters the resulting set of ActiveGates by the OS type of the host it&#39;s running on. | [optional] [enum: LINUX, WINDOWS] |
| **networkAddress** | **String**| Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **loadBalancerAddress** | **String**| Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **type** | **String**| Filters the resulting set of ActiveGates by the ActiveGate type. | [optional] [enum: ENVIRONMENT, ENVIRONMENT_MULTI] |
| **networkZone** | **String**| Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **updateStatus** | **String**| Filters the resulting set of ActiveGates by the auto-update status. | [optional] [enum: INCOMPATIBLE, OUTDATED, SCHEDULED, SUPPRESSED, UNKNOWN, UP2DATE, UPDATE_IN_PROGRESS, UPDATE_PENDING, UPDATE_PROBLEM] |
| **versionCompareType** | **String**| Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **version** | **String**| Filters the resulting set of ActiveGates by the specified version.    Specify the version in &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example, &#x60;1.195.0&#x60;) here. | [optional] |
| **autoUpdate** | **String**| Filters the resulting set of ActiveGates by the actual state of auto-update. | [optional] [enum: DISABLED, ENABLED] |
| **group** | **String**| Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. | [optional] |
| **online** | **Boolean**| Filters the resulting set of ActiveGates by the communication status. | [optional] |
| **enabledModule** | [**List&lt;String&gt;**](String.md)| Filters the resulting set of ActiveGates by the enabled modules. | [optional] [enum: AWS, AZURE, BEACON_FORWARDER, CLOUD_FOUNDRY, DB_INSIGHT, EXTENSIONS_V1, EXTENSIONS_V2, KUBERNETES, LOGS, MEMORY_DUMPS, METRIC_API, ONE_AGENT_ROUTING, OTLP_INGEST, REST_API, SYNTHETIC, VMWARE, Z_OS] |
| **disabledModule** | [**List&lt;String&gt;**](String.md)| Filters the resulting set of ActiveGates by the disabled modules. | [optional] [enum: AWS, AZURE, BEACON_FORWARDER, CLOUD_FOUNDRY, DB_INSIGHT, EXTENSIONS_V1, EXTENSIONS_V2, KUBERNETES, LOGS, MEMORY_DUMPS, METRIC_API, ONE_AGENT_ROUTING, OTLP_INGEST, REST_API, SYNTHETIC, VMWARE, Z_OS] |
| **containerized** | **Boolean**| Filters the resulting set of ActiveGates to those which are running in container (&#x60;true&#x60;) or not (&#x60;false&#x60;). | [optional] |
| **tokenState** | **String**| Filters the resulting set of ActiveGates to those with authorization token in specified state. | [optional] [enum: ABSENT, EXPIRING, INVALID, UNKNOWN, UNSUPPORTED, VALID] |
| **tokenExpirationSet** | **Boolean**| Filters the resulting set of ActiveGates to those with set expiration date for authorization token. | [optional] |

### Return type

ApiResponse<[**ActiveGateList**](ActiveGateList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getOneActiveGateById

> ActiveGate getOneActiveGateById(agId)

Gets the details of the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesApi apiInstance = new ActiveGatesApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        try {
            ActiveGate result = apiInstance.getOneActiveGateById(agId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesApi#getOneActiveGateById");
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

[**ActiveGate**](ActiveGate.md)


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

## getOneActiveGateByIdWithHttpInfo

> ApiResponse<ActiveGate> getOneActiveGateById getOneActiveGateByIdWithHttpInfo(agId)

Gets the details of the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesApi apiInstance = new ActiveGatesApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        try {
            ApiResponse<ActiveGate> response = apiInstance.getOneActiveGateByIdWithHttpInfo(agId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesApi#getOneActiveGateById");
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

ApiResponse<[**ActiveGate**](ActiveGate.md)>


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

