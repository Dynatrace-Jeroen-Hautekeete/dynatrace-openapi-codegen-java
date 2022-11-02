# TopologySmartscapeHostApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHosts**](TopologySmartscapeHostApi.md#getHosts) | **GET** /entity/infrastructure/hosts | Lists all available hosts in your environment |
| [**getHostsWithHttpInfo**](TopologySmartscapeHostApi.md#getHostsWithHttpInfo) | **GET** /entity/infrastructure/hosts | Lists all available hosts in your environment |
| [**getSingleHost**](TopologySmartscapeHostApi.md#getSingleHost) | **GET** /entity/infrastructure/hosts/{meIdentifier} | Gets parameters of the specified host |
| [**getSingleHostWithHttpInfo**](TopologySmartscapeHostApi.md#getSingleHostWithHttpInfo) | **GET** /entity/infrastructure/hosts/{meIdentifier} | Gets parameters of the specified host |
| [**removeTags**](TopologySmartscapeHostApi.md#removeTags) | **DELETE** /entity/infrastructure/hosts/{meIdentifier}/tags/{tag} | Remove tag of the specified host |
| [**removeTagsWithHttpInfo**](TopologySmartscapeHostApi.md#removeTagsWithHttpInfo) | **DELETE** /entity/infrastructure/hosts/{meIdentifier}/tags/{tag} | Remove tag of the specified host |
| [**updateHost**](TopologySmartscapeHostApi.md#updateHost) | **POST** /entity/infrastructure/hosts/{meIdentifier} | Updates properties of the specified host |
| [**updateHostWithHttpInfo**](TopologySmartscapeHostApi.md#updateHostWithHttpInfo) | **POST** /entity/infrastructure/hosts/{meIdentifier} | Updates properties of the specified host |



## getHosts

> List<Host> getHosts(startTimestamp, endTimestamp, relativeTime, tag, showMonitoringCandidates, entity, managementZone, hostGroupId, hostGroupName, includeDetails, pageSize, nextPageKey)

Lists all available hosts in your environment

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Boolean showMonitoringCandidates = true; // Boolean | Includes (`true`) or excludes (`false`) a monitoring candidate in the response.   Monitoring candidates are network entities that are detected but not monitored.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified hosts only.    To specify several hosts use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return hosts that are part of the specified management zone.
        String hostGroupId = "hostGroupId_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you're interested in.
        String hostGroupName = "hostGroupName_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you're interested in.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of hosts per result page.    If not set, pagination is not used and the result contains all hosts fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            List<Host> result = apiInstance.getHosts(startTimestamp, endTimestamp, relativeTime, tag, showMonitoringCandidates, entity, managementZone, hostGroupId, hostGroupName, includeDetails, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#getHosts");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **showMonitoringCandidates** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) a monitoring candidate in the response.   Monitoring candidates are network entities that are detected but not monitored. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified hosts only.    To specify several hosts use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return hosts that are part of the specified management zone. | [optional] |
| **hostGroupId** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you&#39;re interested in. | [optional] |
| **hostGroupName** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you&#39;re interested in. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of hosts per result page.    If not set, pagination is not used and the result contains all hosts fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

[**List&lt;Host&gt;**](Host.md)


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

## getHostsWithHttpInfo

> ApiResponse<List<Host>> getHosts getHostsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, showMonitoringCandidates, entity, managementZone, hostGroupId, hostGroupName, includeDetails, pageSize, nextPageKey)

Lists all available hosts in your environment

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
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Boolean showMonitoringCandidates = true; // Boolean | Includes (`true`) or excludes (`false`) a monitoring candidate in the response.   Monitoring candidates are network entities that are detected but not monitored.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified hosts only.    To specify several hosts use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return hosts that are part of the specified management zone.
        String hostGroupId = "hostGroupId_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you're interested in.
        String hostGroupName = "hostGroupName_example"; // String | Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you're interested in.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of hosts per result page.    If not set, pagination is not used and the result contains all hosts fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            ApiResponse<List<Host>> response = apiInstance.getHostsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, showMonitoringCandidates, entity, managementZone, hostGroupId, hostGroupName, includeDetails, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#getHosts");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of hosts by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The host has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **showMonitoringCandidates** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) a monitoring candidate in the response.   Monitoring candidates are network entities that are detected but not monitored. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified hosts only.    To specify several hosts use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return hosts that are part of the specified management zone. | [optional] |
| **hostGroupId** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the Dynatrace IDs of the host group you&#39;re interested in. | [optional] |
| **hostGroupName** | **String**| Filters the resulting set of hosts by the specified host group.    Specify the name of the host group you&#39;re interested in. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of hosts per result page.    If not set, pagination is not used and the result contains all hosts fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

ApiResponse<[**List&lt;Host&gt;**](Host.md)>


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


## getSingleHost

> Host getSingleHost(meIdentifier)

Gets parameters of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required host.
        try {
            Host result = apiInstance.getSingleHost(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#getSingleHost");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

[**Host**](Host.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleHostWithHttpInfo

> ApiResponse<Host> getSingleHost getSingleHostWithHttpInfo(meIdentifier)

Gets parameters of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required host.
        try {
            ApiResponse<Host> response = apiInstance.getSingleHostWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#getSingleHost");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required host. | |

### Return type

ApiResponse<[**Host**](Host.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## removeTags

> void removeTags(meIdentifier, tag)

Remove tag of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the host.
        String tag = "tag_example"; // String | The tag to be removed.
        try {
            apiInstance.removeTags(meIdentifier, tag);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#removeTags");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the host. | |
| **tag** | **String**| The tag to be removed. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The tag of the host has been removed. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failure. The tag could not be found. |  -  |

## removeTagsWithHttpInfo

> ApiResponse<Void> removeTags removeTagsWithHttpInfo(meIdentifier, tag)

Remove tag of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the host.
        String tag = "tag_example"; // String | The tag to be removed.
        try {
            ApiResponse<Void> response = apiInstance.removeTagsWithHttpInfo(meIdentifier, tag);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#removeTags");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the host. | |
| **tag** | **String**| The tag to be removed. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The tag of the host has been removed. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failure. The tag could not be found. |  -  |


## updateHost

> void updateHost(meIdentifier, updateEntity)

Updates properties of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the host to be updated.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            apiInstance.updateHost(meIdentifier, updateEntity);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#updateHost");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the host to be updated. | |
| **updateEntity** | [**UpdateEntity**](UpdateEntity.md)|  | [optional] |

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
| **204** | Success. The parameters of the host have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateHostWithHttpInfo

> ApiResponse<Void> updateHost updateHostWithHttpInfo(meIdentifier, updateEntity)

Updates properties of the specified host

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeHostApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeHostApi apiInstance = new TopologySmartscapeHostApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the host to be updated.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            ApiResponse<Void> response = apiInstance.updateHostWithHttpInfo(meIdentifier, updateEntity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeHostApi#updateHost");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the host to be updated. | |
| **updateEntity** | [**UpdateEntity**](UpdateEntity.md)|  | [optional] |

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
| **204** | Success. The parameters of the host have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

