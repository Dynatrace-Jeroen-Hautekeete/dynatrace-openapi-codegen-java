# TopologySmartscapeProcessApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcesses**](TopologySmartscapeProcessApi.md#getProcesses) | **GET** /entity/infrastructure/processes | Lists all monitored processes along with their parameters |
| [**getProcessesWithHttpInfo**](TopologySmartscapeProcessApi.md#getProcessesWithHttpInfo) | **GET** /entity/infrastructure/processes | Lists all monitored processes along with their parameters |
| [**getSingleProcess**](TopologySmartscapeProcessApi.md#getSingleProcess) | **GET** /entity/infrastructure/processes/{meIdentifier} | List properties of the specified process |
| [**getSingleProcessWithHttpInfo**](TopologySmartscapeProcessApi.md#getSingleProcessWithHttpInfo) | **GET** /entity/infrastructure/processes/{meIdentifier} | List properties of the specified process |



## getProcesses

> List<ProcessGroupInstance> getProcesses(startTimestamp, endTimestamp, relativeTime, tag, entity, hostTag, host, actualMonitoringState, expectedMonitoringState, managementZone, includeDetails, pageSize, nextPageKey)

Lists all monitored processes along with their parameters

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessApi apiInstance = new TopologySmartscapeProcessApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of processes by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The process has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified processes only.    To specify several processes use the following format: `entity=ID1&entity=ID2`.
        Set<String> hostTag = Arrays.asList(); // Set<String> | Filters processes by the host they're running at.    Specify tags of the host you're interested in.
        Set<String> host = Arrays.asList(); // Set<String> | Filters processes by the host they're running at.    Specify Dynatrace IDs of the host you're interested in.    To specify several hosts use the following format: `host=hostID1&host=hostID2`.    The **OR** logic applies.
        String actualMonitoringState = "OFF"; // String | Filters processes by the actual monitoring state of the process.
        String expectedMonitoringState = "OFF"; // String | Filters processes by the expected monitoring state of the process.
        Long managementZone = 56L; // Long | Only return processes that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of processes per result page.    If not set, pagination is not used and the result contains all processes fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            List<ProcessGroupInstance> result = apiInstance.getProcesses(startTimestamp, endTimestamp, relativeTime, tag, entity, hostTag, host, actualMonitoringState, expectedMonitoringState, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessApi#getProcesses");
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
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days. | [optional] |
| **relativeTime** | **String**| The relative timeframe, back from now. | [optional] [enum: min, 5mins, 10mins, 15mins, 30mins, hour, 2hours, 6hours, day, 3days] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of processes by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The process has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified processes only.    To specify several processes use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **hostTag** | [**Set&lt;String&gt;**](String.md)| Filters processes by the host they&#39;re running at.    Specify tags of the host you&#39;re interested in. | [optional] |
| **host** | [**Set&lt;String&gt;**](String.md)| Filters processes by the host they&#39;re running at.    Specify Dynatrace IDs of the host you&#39;re interested in.    To specify several hosts use the following format: &#x60;host&#x3D;hostID1&amp;host&#x3D;hostID2&#x60;.    The **OR** logic applies. | [optional] |
| **actualMonitoringState** | **String**| Filters processes by the actual monitoring state of the process. | [optional] [enum: OFF, ON] |
| **expectedMonitoringState** | **String**| Filters processes by the expected monitoring state of the process. | [optional] [enum: OFF, ON] |
| **managementZone** | **Long**| Only return processes that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of processes per result page.    If not set, pagination is not used and the result contains all processes fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

[**List&lt;ProcessGroupInstance&gt;**](ProcessGroupInstance.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Total-Count - The estimated number of results. <br>  * Next-Page-Key - The cursor for the next page of results. Without it you&#39;ll get the first page again.   The cursor must be URL-encoded. <br>  * Page-Size - The maximum number of results per page. <br>  |
| **400** | Failed. The input is invalid. |  -  |

## getProcessesWithHttpInfo

> ApiResponse<List<ProcessGroupInstance>> getProcesses getProcessesWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, hostTag, host, actualMonitoringState, expectedMonitoringState, managementZone, includeDetails, pageSize, nextPageKey)

Lists all monitored processes along with their parameters

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessApi apiInstance = new TopologySmartscapeProcessApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of processes by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The process has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified processes only.    To specify several processes use the following format: `entity=ID1&entity=ID2`.
        Set<String> hostTag = Arrays.asList(); // Set<String> | Filters processes by the host they're running at.    Specify tags of the host you're interested in.
        Set<String> host = Arrays.asList(); // Set<String> | Filters processes by the host they're running at.    Specify Dynatrace IDs of the host you're interested in.    To specify several hosts use the following format: `host=hostID1&host=hostID2`.    The **OR** logic applies.
        String actualMonitoringState = "OFF"; // String | Filters processes by the actual monitoring state of the process.
        String expectedMonitoringState = "OFF"; // String | Filters processes by the expected monitoring state of the process.
        Long managementZone = 56L; // Long | Only return processes that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of processes per result page.    If not set, pagination is not used and the result contains all processes fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            ApiResponse<List<ProcessGroupInstance>> response = apiInstance.getProcessesWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, hostTag, host, actualMonitoringState, expectedMonitoringState, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessApi#getProcesses");
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
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days. | [optional] |
| **relativeTime** | **String**| The relative timeframe, back from now. | [optional] [enum: min, 5mins, 10mins, 15mins, 30mins, hour, 2hours, 6hours, day, 3days] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of processes by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The process has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified processes only.    To specify several processes use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **hostTag** | [**Set&lt;String&gt;**](String.md)| Filters processes by the host they&#39;re running at.    Specify tags of the host you&#39;re interested in. | [optional] |
| **host** | [**Set&lt;String&gt;**](String.md)| Filters processes by the host they&#39;re running at.    Specify Dynatrace IDs of the host you&#39;re interested in.    To specify several hosts use the following format: &#x60;host&#x3D;hostID1&amp;host&#x3D;hostID2&#x60;.    The **OR** logic applies. | [optional] |
| **actualMonitoringState** | **String**| Filters processes by the actual monitoring state of the process. | [optional] [enum: OFF, ON] |
| **expectedMonitoringState** | **String**| Filters processes by the expected monitoring state of the process. | [optional] [enum: OFF, ON] |
| **managementZone** | **Long**| Only return processes that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of processes per result page.    If not set, pagination is not used and the result contains all processes fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

ApiResponse<[**List&lt;ProcessGroupInstance&gt;**](ProcessGroupInstance.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * Total-Count - The estimated number of results. <br>  * Next-Page-Key - The cursor for the next page of results. Without it you&#39;ll get the first page again.   The cursor must be URL-encoded. <br>  * Page-Size - The maximum number of results per page. <br>  |
| **400** | Failed. The input is invalid. |  -  |


## getSingleProcess

> ProcessGroupInstance getSingleProcess(meIdentifier)

List properties of the specified process

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessApi apiInstance = new TopologySmartscapeProcessApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required process.
        try {
            ProcessGroupInstance result = apiInstance.getSingleProcess(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessApi#getSingleProcess");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required process. | |

### Return type

[**ProcessGroupInstance**](ProcessGroupInstance.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleProcessWithHttpInfo

> ApiResponse<ProcessGroupInstance> getSingleProcess getSingleProcessWithHttpInfo(meIdentifier)

List properties of the specified process

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessApi apiInstance = new TopologySmartscapeProcessApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required process.
        try {
            ApiResponse<ProcessGroupInstance> response = apiInstance.getSingleProcessWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessApi#getSingleProcess");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required process. | |

### Return type

ApiResponse<[**ProcessGroupInstance**](ProcessGroupInstance.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

