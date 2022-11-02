# TopologySmartscapeProcessGroupApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcessGroups**](TopologySmartscapeProcessGroupApi.md#getProcessGroups) | **GET** /entity/infrastructure/process-groups | Lists all process groups of your environment, along with their parameters |
| [**getProcessGroupsWithHttpInfo**](TopologySmartscapeProcessGroupApi.md#getProcessGroupsWithHttpInfo) | **GET** /entity/infrastructure/process-groups | Lists all process groups of your environment, along with their parameters |
| [**getSingleProcessGroup**](TopologySmartscapeProcessGroupApi.md#getSingleProcessGroup) | **GET** /entity/infrastructure/process-groups/{meIdentifier} | List properties of the specified process group |
| [**getSingleProcessGroupWithHttpInfo**](TopologySmartscapeProcessGroupApi.md#getSingleProcessGroupWithHttpInfo) | **GET** /entity/infrastructure/process-groups/{meIdentifier} | List properties of the specified process group |
| [**updateProcessGroup**](TopologySmartscapeProcessGroupApi.md#updateProcessGroup) | **POST** /entity/infrastructure/process-groups/{meIdentifier} | Updates properties of the specified process group |
| [**updateProcessGroupWithHttpInfo**](TopologySmartscapeProcessGroupApi.md#updateProcessGroupWithHttpInfo) | **POST** /entity/infrastructure/process-groups/{meIdentifier} | Updates properties of the specified process group |



## getProcessGroups

> List<ProcessGroup> getProcessGroups(startTimestamp, endTimestamp, relativeTime, tag, entity, host, managementZone, includeDetails, pageSize, nextPageKey)

Lists all process groups of your environment, along with their parameters

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of process groups by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The process group has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified process groups only.    To specify several process groups use the following format: `entity=ID1&entity=ID2`.
        Set<String> host = Arrays.asList(); // Set<String> | Filters process groups by the host they're running at.    Specify Dynatrace IDs of the host you're interested in.    To specify several hosts use the following format: `host=hostID1&host=hostID2`.    The **OR** logic applies.
        Long managementZone = 56L; // Long | Only return process groups that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of process groups per result page.    If not set, pagination is not used and the result contains all process groups fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            List<ProcessGroup> result = apiInstance.getProcessGroups(startTimestamp, endTimestamp, relativeTime, tag, entity, host, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#getProcessGroups");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of process groups by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The process group has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified process groups only.    To specify several process groups use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **host** | [**Set&lt;String&gt;**](String.md)| Filters process groups by the host they&#39;re running at.    Specify Dynatrace IDs of the host you&#39;re interested in.    To specify several hosts use the following format: &#x60;host&#x3D;hostID1&amp;host&#x3D;hostID2&#x60;.    The **OR** logic applies. | [optional] |
| **managementZone** | **Long**| Only return process groups that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of process groups per result page.    If not set, pagination is not used and the result contains all process groups fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

[**List&lt;ProcessGroup&gt;**](ProcessGroup.md)


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

## getProcessGroupsWithHttpInfo

> ApiResponse<List<ProcessGroup>> getProcessGroups getProcessGroupsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, host, managementZone, includeDetails, pageSize, nextPageKey)

Lists all process groups of your environment, along with their parameters

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
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of process groups by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The process group has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified process groups only.    To specify several process groups use the following format: `entity=ID1&entity=ID2`.
        Set<String> host = Arrays.asList(); // Set<String> | Filters process groups by the host they're running at.    Specify Dynatrace IDs of the host you're interested in.    To specify several hosts use the following format: `host=hostID1&host=hostID2`.    The **OR** logic applies.
        Long managementZone = 56L; // Long | Only return process groups that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of process groups per result page.    If not set, pagination is not used and the result contains all process groups fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            ApiResponse<List<ProcessGroup>> response = apiInstance.getProcessGroupsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, host, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#getProcessGroups");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of process groups by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The process group has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified process groups only.    To specify several process groups use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **host** | [**Set&lt;String&gt;**](String.md)| Filters process groups by the host they&#39;re running at.    Specify Dynatrace IDs of the host you&#39;re interested in.    To specify several hosts use the following format: &#x60;host&#x3D;hostID1&amp;host&#x3D;hostID2&#x60;.    The **OR** logic applies. | [optional] |
| **managementZone** | **Long**| Only return process groups that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of process groups per result page.    If not set, pagination is not used and the result contains all process groups fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

ApiResponse<[**List&lt;ProcessGroup&gt;**](ProcessGroup.md)>


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


## getSingleProcessGroup

> ProcessGroup getSingleProcessGroup(meIdentifier)

List properties of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            ProcessGroup result = apiInstance.getSingleProcessGroup(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#getSingleProcessGroup");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required process group. | |

### Return type

[**ProcessGroup**](ProcessGroup.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleProcessGroupWithHttpInfo

> ApiResponse<ProcessGroup> getSingleProcessGroup getSingleProcessGroupWithHttpInfo(meIdentifier)

List properties of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            ApiResponse<ProcessGroup> response = apiInstance.getSingleProcessGroupWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#getSingleProcessGroup");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required process group. | |

### Return type

ApiResponse<[**ProcessGroup**](ProcessGroup.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateProcessGroup

> void updateProcessGroup(meIdentifier, updateEntity)

Updates properties of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the process group to be updated.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | The JSON body of the request. Contains tags to be added to the process group.
        try {
            apiInstance.updateProcessGroup(meIdentifier, updateEntity);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#updateProcessGroup");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the process group to be updated. | |
| **updateEntity** | [**UpdateEntity**](UpdateEntity.md)| The JSON body of the request. Contains tags to be added to the process group. | [optional] |

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
| **204** | Success. The parameters of the process group have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateProcessGroupWithHttpInfo

> ApiResponse<Void> updateProcessGroup updateProcessGroupWithHttpInfo(meIdentifier, updateEntity)

Updates properties of the specified process group

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeProcessGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeProcessGroupApi apiInstance = new TopologySmartscapeProcessGroupApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the process group to be updated.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | The JSON body of the request. Contains tags to be added to the process group.
        try {
            ApiResponse<Void> response = apiInstance.updateProcessGroupWithHttpInfo(meIdentifier, updateEntity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeProcessGroupApi#updateProcessGroup");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the process group to be updated. | |
| **updateEntity** | [**UpdateEntity**](UpdateEntity.md)| The JSON body of the request. Contains tags to be added to the process group. | [optional] |

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
| **204** | Success. The parameters of the process group have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

