# AuditLogsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLog**](AuditLogsApi.md#getLog) | **GET** /auditlogs/{id} | Gets the specified entry of the audit log | maturity&#x3D;EARLY_ADOPTER |
| [**getLogWithHttpInfo**](AuditLogsApi.md#getLogWithHttpInfo) | **GET** /auditlogs/{id} | Gets the specified entry of the audit log | maturity&#x3D;EARLY_ADOPTER |
| [**getLogs**](AuditLogsApi.md#getLogs) | **GET** /auditlogs | Gets the audit log of your Dynatrace environment | maturity&#x3D;EARLY_ADOPTER |
| [**getLogsWithHttpInfo**](AuditLogsApi.md#getLogsWithHttpInfo) | **GET** /auditlogs | Gets the audit log of your Dynatrace environment | maturity&#x3D;EARLY_ADOPTER |



## getLog

> AuditLogEntry getLog(id)

Gets the specified entry of the audit log | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required log entry.
        try {
            AuditLogEntry result = apiInstance.getLog(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getLog");
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
| **id** | **String**| The ID of the required log entry. | |

### Return type

[**AuditLogEntry**](AuditLogEntry.md)


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
| **400** | Failed. Invalid ID format. |  -  |

## getLogWithHttpInfo

> ApiResponse<AuditLogEntry> getLog getLogWithHttpInfo(id)

Gets the specified entry of the audit log | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required log entry.
        try {
            ApiResponse<AuditLogEntry> response = apiInstance.getLogWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getLog");
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
| **id** | **String**| The ID of the required log entry. | |

### Return type

ApiResponse<[**AuditLogEntry**](AuditLogEntry.md)>


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
| **400** | Failed. Invalid ID format. |  -  |


## getLogs

> AuditLog getLogs(nextPageKey, pageSize, filter, from, to, sort)

Gets the audit log of your Dynatrace environment | maturity&#x3D;EARLY_ADOPTER

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of log entries in a single response payload.   The maximal allowed page size is 5000.   If not set, 1000 is used.
        String filter = "filter_example"; // String | Filters the audit log. You can use the following criteria:  * User: `user(\"userIdentification\")`. The `EQUALS` operator applies.  * Event type: `eventType(\"value\")`. The `EQUALS` operator applies.  * Category of a logged operation: `category(\"value\")`. The `EQUALS` operator applies.  * Entity ID: `entityId(\"id\")`. The `CONTAINS` operator applies.   For each criterion, you can specify multiple alternatives with comma-separated values. In this case, the OR logic applies. For example, `eventType(\"CREATE\",\"UPDATE\")` means eventType can be \"CREATE\" or \"UPDATE\".   You can specify multiple comma-separated criteria, such as `eventType(\"CREATE\",\"UPDATE\"),category(\"CONFIG\")`. Only results matching **all** criteria are included in response.   Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes:  * Tilde `~`  * Quote `\"`
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sort = "-timestamp"; // String | The sorting of audit log entries:  * `timestamp`: Oldest first.  * `-timestamp`: Newest first.   If not set, the newest first sorting is applied.
        try {
            AuditLog result = apiInstance.getLogs(nextPageKey, pageSize, filter, from, to, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getLogs");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of log entries in a single response payload.   The maximal allowed page size is 5000.   If not set, 1000 is used. | [optional] |
| **filter** | **String**| Filters the audit log. You can use the following criteria:  * User: &#x60;user(\&quot;userIdentification\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Event type: &#x60;eventType(\&quot;value\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Category of a logged operation: &#x60;category(\&quot;value\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator applies.   For each criterion, you can specify multiple alternatives with comma-separated values. In this case, the OR logic applies. For example, &#x60;eventType(\&quot;CREATE\&quot;,\&quot;UPDATE\&quot;)&#x60; means eventType can be \&quot;CREATE\&quot; or \&quot;UPDATE\&quot;.   You can specify multiple comma-separated criteria, such as &#x60;eventType(\&quot;CREATE\&quot;,\&quot;UPDATE\&quot;),category(\&quot;CONFIG\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes:  * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sort** | **String**| The sorting of audit log entries:  * &#x60;timestamp&#x60;: Oldest first.  * &#x60;-timestamp&#x60;: Newest first.   If not set, the newest first sorting is applied. | [optional] [default to -timestamp] |

### Return type

[**AuditLog**](AuditLog.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getLogsWithHttpInfo

> ApiResponse<AuditLog> getLogs getLogsWithHttpInfo(nextPageKey, pageSize, filter, from, to, sort)

Gets the audit log of your Dynatrace environment | maturity&#x3D;EARLY_ADOPTER

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AuditLogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AuditLogsApi apiInstance = new AuditLogsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of log entries in a single response payload.   The maximal allowed page size is 5000.   If not set, 1000 is used.
        String filter = "filter_example"; // String | Filters the audit log. You can use the following criteria:  * User: `user(\"userIdentification\")`. The `EQUALS` operator applies.  * Event type: `eventType(\"value\")`. The `EQUALS` operator applies.  * Category of a logged operation: `category(\"value\")`. The `EQUALS` operator applies.  * Entity ID: `entityId(\"id\")`. The `CONTAINS` operator applies.   For each criterion, you can specify multiple alternatives with comma-separated values. In this case, the OR logic applies. For example, `eventType(\"CREATE\",\"UPDATE\")` means eventType can be \"CREATE\" or \"UPDATE\".   You can specify multiple comma-separated criteria, such as `eventType(\"CREATE\",\"UPDATE\"),category(\"CONFIG\")`. Only results matching **all** criteria are included in response.   Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes:  * Tilde `~`  * Quote `\"`
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sort = "-timestamp"; // String | The sorting of audit log entries:  * `timestamp`: Oldest first.  * `-timestamp`: Newest first.   If not set, the newest first sorting is applied.
        try {
            ApiResponse<AuditLog> response = apiInstance.getLogsWithHttpInfo(nextPageKey, pageSize, filter, from, to, sort);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditLogsApi#getLogs");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of log entries in a single response payload.   The maximal allowed page size is 5000.   If not set, 1000 is used. | [optional] |
| **filter** | **String**| Filters the audit log. You can use the following criteria:  * User: &#x60;user(\&quot;userIdentification\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Event type: &#x60;eventType(\&quot;value\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Category of a logged operation: &#x60;category(\&quot;value\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator applies.  * Entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator applies.   For each criterion, you can specify multiple alternatives with comma-separated values. In this case, the OR logic applies. For example, &#x60;eventType(\&quot;CREATE\&quot;,\&quot;UPDATE\&quot;)&#x60; means eventType can be \&quot;CREATE\&quot; or \&quot;UPDATE\&quot;.   You can specify multiple comma-separated criteria, such as &#x60;eventType(\&quot;CREATE\&quot;,\&quot;UPDATE\&quot;),category(\&quot;CONFIG\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes:  * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sort** | **String**| The sorting of audit log entries:  * &#x60;timestamp&#x60;: Oldest first.  * &#x60;-timestamp&#x60;: Newest first.   If not set, the newest first sorting is applied. | [optional] [default to -timestamp] |

### Return type

ApiResponse<[**AuditLog**](AuditLog.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

