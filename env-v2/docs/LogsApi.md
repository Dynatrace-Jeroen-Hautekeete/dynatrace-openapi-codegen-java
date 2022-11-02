# LogsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportLogRecords**](LogsApi.md#exportLogRecords) | **GET** /logs/export | Exports log records | maturity&#x3D;EARLY_ADOPTER |
| [**exportLogRecordsWithHttpInfo**](LogsApi.md#exportLogRecordsWithHttpInfo) | **GET** /logs/export | Exports log records | maturity&#x3D;EARLY_ADOPTER |
| [**getLogHistogramData**](LogsApi.md#getLogHistogramData) | **GET** /logs/aggregate | Gets aggregated log records | maturity&#x3D;EARLY_ADOPTER |
| [**getLogHistogramDataWithHttpInfo**](LogsApi.md#getLogHistogramDataWithHttpInfo) | **GET** /logs/aggregate | Gets aggregated log records | maturity&#x3D;EARLY_ADOPTER |
| [**getLogRecords**](LogsApi.md#getLogRecords) | **GET** /logs/search | Reads log records | maturity&#x3D;EARLY_ADOPTER |
| [**getLogRecordsWithHttpInfo**](LogsApi.md#getLogRecordsWithHttpInfo) | **GET** /logs/search | Reads log records | maturity&#x3D;EARLY_ADOPTER |
| [**storeLog**](LogsApi.md#storeLog) | **POST** /logs/ingest | Pushes log records to Dynatrace | maturity&#x3D;EARLY_ADOPTER |
| [**storeLogWithHttpInfo**](LogsApi.md#storeLogWithHttpInfo) | **POST** /logs/ingest | Pushes log records to Dynatrace | maturity&#x3D;EARLY_ADOPTER |



## exportLogRecords

> ExportedLogRecordList exportLogRecords(from, to, nextPageKey, pageSize, query, sort)

Exports log records | maturity&#x3D;EARLY_ADOPTER

Returns the first *X* records (specified in the **pageSize** query parameter).   Unlike the **search** API, this API does not split the result into slices and has no limit for the total number of records. Log records are sorted by the criteria specified in the **sort** query parameter.   In order to fetch large amount of records (exceeding the **pageSize** value), one should repeat the **export** call with **nextPageKey** param.  

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 1000L; // Long | The number of results per result page.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        String sort = "-timestamp"; // String | Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the `+` option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected).
        try {
            ExportedLogRecordList result = apiInstance.exportLogRecords(from, to, nextPageKey, pageSize, query, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#exportLogRecords");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The number of results per result page. | [optional] [default to 1000] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **sort** | **String**| Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the &#x60;+&#x60; option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected). | [optional] [default to -timestamp] |

### Return type

[**ExportedLogRecordList**](ExportedLogRecordList.md)


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
| **501** | Failed. The server either does not recognize the request method, or it lacks the ability to fulfill the request. May happen when Grail log storage is enabled. |  -  |

## exportLogRecordsWithHttpInfo

> ApiResponse<ExportedLogRecordList> exportLogRecords exportLogRecordsWithHttpInfo(from, to, nextPageKey, pageSize, query, sort)

Exports log records | maturity&#x3D;EARLY_ADOPTER

Returns the first *X* records (specified in the **pageSize** query parameter).   Unlike the **search** API, this API does not split the result into slices and has no limit for the total number of records. Log records are sorted by the criteria specified in the **sort** query parameter.   In order to fetch large amount of records (exceeding the **pageSize** value), one should repeat the **export** call with **nextPageKey** param.  

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 1000L; // Long | The number of results per result page.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        String sort = "-timestamp"; // String | Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the `+` option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected).
        try {
            ApiResponse<ExportedLogRecordList> response = apiInstance.exportLogRecordsWithHttpInfo(from, to, nextPageKey, pageSize, query, sort);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#exportLogRecords");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The number of results per result page. | [optional] [default to 1000] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **sort** | **String**| Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the &#x60;+&#x60; option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected). | [optional] [default to -timestamp] |

### Return type

ApiResponse<[**ExportedLogRecordList**](ExportedLogRecordList.md)>


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
| **501** | Failed. The server either does not recognize the request method, or it lacks the ability to fulfill the request. May happen when Grail log storage is enabled. |  -  |


## getLogHistogramData

> AggregatedLog getLogHistogramData(from, to, query, timeBuckets, maxGroupValues, groupBy)

Gets aggregated log records | maturity&#x3D;EARLY_ADOPTER

Returns the aggregated number of occurrences of log values divided into time slots.   It is possible that the timeframe covered by results exceeds the specified timeframe. In that case the request returns fewer time slots than specified in the **timeBuckets** query parameter.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        Integer timeBuckets = 1; // Integer | The number of time slots in the result.   The query timeframe is divided equally into the specified number of slots.   The minimum length of a slot is 1 ms.   If not set, 1 is used.
        Integer maxGroupValues = 10; // Integer | The maximum number of values in each group.   You can get up to 100 values per group.   If not set, 10 is used.
        List<String> groupBy = Arrays.asList(); // List<String> | The groupings to be included in the response.   You can specify several groups in the following format: `groupBy=status&groupBy=log.source`.   If not set, all possible groups are returned. You can use this option to check for possible grouping values.   Unique log data attributes (high-cardinality attributes) for example, `span_id` or `trace_id` cannot be used for grouping.
        try {
            AggregatedLog result = apiInstance.getLogHistogramData(from, to, query, timeBuckets, maxGroupValues, groupBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#getLogHistogramData");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **timeBuckets** | **Integer**| The number of time slots in the result.   The query timeframe is divided equally into the specified number of slots.   The minimum length of a slot is 1 ms.   If not set, 1 is used. | [optional] [default to 1] |
| **maxGroupValues** | **Integer**| The maximum number of values in each group.   You can get up to 100 values per group.   If not set, 10 is used. | [optional] [default to 10] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| The groupings to be included in the response.   You can specify several groups in the following format: &#x60;groupBy&#x3D;status&amp;groupBy&#x3D;log.source&#x60;.   If not set, all possible groups are returned. You can use this option to check for possible grouping values.   Unique log data attributes (high-cardinality attributes) for example, &#x60;span_id&#x60; or &#x60;trace_id&#x60; cannot be used for grouping. | [optional] |

### Return type

[**AggregatedLog**](AggregatedLog.md)


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

## getLogHistogramDataWithHttpInfo

> ApiResponse<AggregatedLog> getLogHistogramData getLogHistogramDataWithHttpInfo(from, to, query, timeBuckets, maxGroupValues, groupBy)

Gets aggregated log records | maturity&#x3D;EARLY_ADOPTER

Returns the aggregated number of occurrences of log values divided into time slots.   It is possible that the timeframe covered by results exceeds the specified timeframe. In that case the request returns fewer time slots than specified in the **timeBuckets** query parameter.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        Integer timeBuckets = 1; // Integer | The number of time slots in the result.   The query timeframe is divided equally into the specified number of slots.   The minimum length of a slot is 1 ms.   If not set, 1 is used.
        Integer maxGroupValues = 10; // Integer | The maximum number of values in each group.   You can get up to 100 values per group.   If not set, 10 is used.
        List<String> groupBy = Arrays.asList(); // List<String> | The groupings to be included in the response.   You can specify several groups in the following format: `groupBy=status&groupBy=log.source`.   If not set, all possible groups are returned. You can use this option to check for possible grouping values.   Unique log data attributes (high-cardinality attributes) for example, `span_id` or `trace_id` cannot be used for grouping.
        try {
            ApiResponse<AggregatedLog> response = apiInstance.getLogHistogramDataWithHttpInfo(from, to, query, timeBuckets, maxGroupValues, groupBy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#getLogHistogramData");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **timeBuckets** | **Integer**| The number of time slots in the result.   The query timeframe is divided equally into the specified number of slots.   The minimum length of a slot is 1 ms.   If not set, 1 is used. | [optional] [default to 1] |
| **maxGroupValues** | **Integer**| The maximum number of values in each group.   You can get up to 100 values per group.   If not set, 10 is used. | [optional] [default to 10] |
| **groupBy** | [**List&lt;String&gt;**](String.md)| The groupings to be included in the response.   You can specify several groups in the following format: &#x60;groupBy&#x3D;status&amp;groupBy&#x3D;log.source&#x60;.   If not set, all possible groups are returned. You can use this option to check for possible grouping values.   Unique log data attributes (high-cardinality attributes) for example, &#x60;span_id&#x60; or &#x60;trace_id&#x60; cannot be used for grouping. | [optional] |

### Return type

ApiResponse<[**AggregatedLog**](AggregatedLog.md)>


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


## getLogRecords

> LogRecordsList getLogRecords(from, to, limit, query, sort, nextSliceKey)

Reads log records | maturity&#x3D;EARLY_ADOPTER

Returns the first *X* records (specified in the **limit** query parameter). Log records are sorted by the criteria specified in the **sort** query parameter.   If the query is too large to be processed in a single request, it is divided into slices. In that case the first response contains the **nextSliceKey** cursor for the second slice. Use it in the **nextSliceKey** query parameter to obtain the second slice, which contains **nextSliceKey** cursor for the third slice, and so on.   Results can be distributed unevenly between slices and some slices might be empty.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        Integer limit = 1000; // Integer | The desired amount of log records.   The maximal allowed limit is 1000.   If not set, 1000 is used.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        String sort = "-timestamp"; // String | Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the `+` option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected).
        String nextSliceKey = "nextSliceKey_example"; // String | The cursor for the next slice of results. You can find it in the **nextSliceKey** field of the previous response.   The first slice is always returned if you don't specify this parameter.   If this parameter is set, all other query parameters are ignored.
        try {
            LogRecordsList result = apiInstance.getLogRecords(from, to, limit, query, sort, nextSliceKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#getLogRecords");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **limit** | **Integer**| The desired amount of log records.   The maximal allowed limit is 1000.   If not set, 1000 is used. | [optional] [default to 1000] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **sort** | **String**| Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the &#x60;+&#x60; option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected). | [optional] [default to -timestamp] |
| **nextSliceKey** | **String**| The cursor for the next slice of results. You can find it in the **nextSliceKey** field of the previous response.   The first slice is always returned if you don&#39;t specify this parameter.   If this parameter is set, all other query parameters are ignored. | [optional] |

### Return type

[**LogRecordsList**](LogRecordsList.md)


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

## getLogRecordsWithHttpInfo

> ApiResponse<LogRecordsList> getLogRecords getLogRecordsWithHttpInfo(from, to, limit, query, sort, nextSliceKey)

Reads log records | maturity&#x3D;EARLY_ADOPTER

Returns the first *X* records (specified in the **limit** query parameter). Log records are sorted by the criteria specified in the **sort** query parameter.   If the query is too large to be processed in a single request, it is divided into slices. In that case the first response contains the **nextSliceKey** cursor for the second slice. Use it in the **nextSliceKey** query parameter to obtain the second slice, which contains **nextSliceKey** cursor for the third slice, and so on.   Results can be distributed unevenly between slices and some slices might be empty.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        Integer limit = 1000; // Integer | The desired amount of log records.   The maximal allowed limit is 1000.   If not set, 1000 is used.
        String query = ""; // String | The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f).
        String sort = "-timestamp"; // String | Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the `+` option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected).
        String nextSliceKey = "nextSliceKey_example"; // String | The cursor for the next slice of results. You can find it in the **nextSliceKey** field of the previous response.   The first slice is always returned if you don't specify this parameter.   If this parameter is set, all other query parameters are ignored.
        try {
            ApiResponse<LogRecordsList> response = apiInstance.getLogRecordsWithHttpInfo(from, to, limit, query, sort, nextSliceKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#getLogRecords");
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
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **limit** | **Integer**| The desired amount of log records.   The maximal allowed limit is 1000.   If not set, 1000 is used. | [optional] [default to 1000] |
| **query** | **String**| The log search query.   The query must use the [Dynatrace search query language](https://dt-url.net/pe03s6f). | [optional] [default to ] |
| **sort** | **String**| Defines the ordering of the log records.  Each field has a sign prefix (+/-) for sorting order. If no sign prefix is set, then the &#x60;+&#x60; option will be applied.   Currently, ordering is available only for the timestamp (+timestamp for the oldest records first, or -timestamp for the newest records first).   When millisecond resolution provided by the timestamp is not enough, log records are sorted based on the order in which they appear in the log source (remote process writing to REST API endpoint or remote process from which logs are collected). | [optional] [default to -timestamp] |
| **nextSliceKey** | **String**| The cursor for the next slice of results. You can find it in the **nextSliceKey** field of the previous response.   The first slice is always returned if you don&#39;t specify this parameter.   If this parameter is set, all other query parameters are ignored. | [optional] |

### Return type

ApiResponse<[**LogRecordsList**](LogRecordsList.md)>


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


## storeLog

> SuccessEnvelope storeLog(body)

Pushes log records to Dynatrace | maturity&#x3D;EARLY_ADOPTER

Ingested logs are stored in the indexed log storage.   This endpoint requires an ActiveGate with the **Log Analytics Collector** module enabled.   The maximum payload size of a single request is **5 MB**. Requests with a greater payload are rejected, and the API returns a 413 response code.  If the ingested payload is a JSON array, the maximum array size is **5000**. Requests with a greater payload are rejected, and the API returns a 413 response code.  &lt;br /&gt;**Log events per minute (SaaS)**:   Trial tenants: 10k, paid one: 100k per minute by default.   If your log data stream within your cluster exceeds the limit, all log events above the limit are ignored.   &lt;br /&gt;**Log events per minute (Managed)**:   10k/minute per cluster by default.   If your log data stream within your cluster exceeds the limit, all log events above the limit are ignored.   If you increase resources (RAM) in your nodes, you can increase the limit based on the cluster resources size using an API call or Cluster Management Console (CMC).   &lt;br /&gt;Refresh cluster limit using the API call   See [Update log events per cluster for Log Monitoring](https://dt-url.net/f123yeu).   &lt;br /&gt;Refresh cluster limit using Cluster Management Console (CMC)   1. In the CMC, select **Environments** and the environment for which you wish to update the total log events per cluster.   2. On the environment details page, in the **Cluster overload prevention settings** section, select the **Refresh cluster limit**.   **High-cardinality attributes:**   Unique log data attributes (high-cardinality attributes) such as &#x60;span_id&#x60; and &#x60;trace_id&#x60; generate unnecessarily excessive facet lists that may impact log viewer performance. Because of this, they aren&#39;t listed in log viewer facets. You can still use them in a log viewer advanced search query.   

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        Object body = [{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog","timestamp":"2022-01-17T22:12:31.0000","severity":"error","custom.attribute":"attribute value"},{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog","timestamp":"2022-01-17T22:12:35.0000"},{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog"},{"content":"Exception: Custom error log sent via Generic Log Ingest"}]; // Object | The body of the request. Contains one or more log events to be ingested.   The endpoint accepts one of the following payload types, defined by the **Accept** header:   * `text/plain`: supports only one log event.  * `application/json`: supports multiple log events in a single payload.
        try {
            SuccessEnvelope result = apiInstance.storeLog(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#storeLog");
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
| **body** | **Object**| The body of the request. Contains one or more log events to be ingested.   The endpoint accepts one of the following payload types, defined by the **Accept** header:   * &#x60;text/plain&#x60;: supports only one log event.  * &#x60;application/json&#x60;: supports multiple log events in a single payload. | [optional] |

### Return type

[**SuccessEnvelope**](SuccessEnvelope.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8, text/plain; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Only a part of input events were ingested due to event size limits or JSON parsing issues. |  -  |
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **402** | Failed. You can&#39;t add more logs to the storage, because you are out of [Davis Data Units](https://dt-url.net/dduLog) (DDU). Purchase additional DDUs. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. This may happen when no ActiveGate is available with the Log Analytics Collector module enabled. |  -  |
| **413** | Failed. Request payload size is too big. This may happen when the payload byte size exceeds the limit or when the ingested payload is a JSON array with the size exceeding the limit. |  -  |
| **429** | Failed. Too Many Requests. This happens when log ingest is disabled. |  -  |
| **501** | Failed. The server either does not recognize the request method, or it lacks the ability to fulfil the request. May happen when indexed log storage is not enabled. |  -  |

## storeLogWithHttpInfo

> ApiResponse<SuccessEnvelope> storeLog storeLogWithHttpInfo(body)

Pushes log records to Dynatrace | maturity&#x3D;EARLY_ADOPTER

Ingested logs are stored in the indexed log storage.   This endpoint requires an ActiveGate with the **Log Analytics Collector** module enabled.   The maximum payload size of a single request is **5 MB**. Requests with a greater payload are rejected, and the API returns a 413 response code.  If the ingested payload is a JSON array, the maximum array size is **5000**. Requests with a greater payload are rejected, and the API returns a 413 response code.  &lt;br /&gt;**Log events per minute (SaaS)**:   Trial tenants: 10k, paid one: 100k per minute by default.   If your log data stream within your cluster exceeds the limit, all log events above the limit are ignored.   &lt;br /&gt;**Log events per minute (Managed)**:   10k/minute per cluster by default.   If your log data stream within your cluster exceeds the limit, all log events above the limit are ignored.   If you increase resources (RAM) in your nodes, you can increase the limit based on the cluster resources size using an API call or Cluster Management Console (CMC).   &lt;br /&gt;Refresh cluster limit using the API call   See [Update log events per cluster for Log Monitoring](https://dt-url.net/f123yeu).   &lt;br /&gt;Refresh cluster limit using Cluster Management Console (CMC)   1. In the CMC, select **Environments** and the environment for which you wish to update the total log events per cluster.   2. On the environment details page, in the **Cluster overload prevention settings** section, select the **Refresh cluster limit**.   **High-cardinality attributes:**   Unique log data attributes (high-cardinality attributes) such as &#x60;span_id&#x60; and &#x60;trace_id&#x60; generate unnecessarily excessive facet lists that may impact log viewer performance. Because of this, they aren&#39;t listed in log viewer facets. You can still use them in a log viewer advanced search query.   

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.LogsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        LogsApi apiInstance = new LogsApi(defaultClient);
        Object body = [{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog","timestamp":"2022-01-17T22:12:31.0000","severity":"error","custom.attribute":"attribute value"},{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog","timestamp":"2022-01-17T22:12:35.0000"},{"content":"Exception: Custom error log sent via Generic Log Ingest","log.source":"/var/log/syslog"},{"content":"Exception: Custom error log sent via Generic Log Ingest"}]; // Object | The body of the request. Contains one or more log events to be ingested.   The endpoint accepts one of the following payload types, defined by the **Accept** header:   * `text/plain`: supports only one log event.  * `application/json`: supports multiple log events in a single payload.
        try {
            ApiResponse<SuccessEnvelope> response = apiInstance.storeLogWithHttpInfo(body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsApi#storeLog");
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
| **body** | **Object**| The body of the request. Contains one or more log events to be ingested.   The endpoint accepts one of the following payload types, defined by the **Accept** header:   * &#x60;text/plain&#x60;: supports only one log event.  * &#x60;application/json&#x60;: supports multiple log events in a single payload. | [optional] |

### Return type

ApiResponse<[**SuccessEnvelope**](SuccessEnvelope.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8, text/plain; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Only a part of input events were ingested due to event size limits or JSON parsing issues. |  -  |
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **402** | Failed. You can&#39;t add more logs to the storage, because you are out of [Davis Data Units](https://dt-url.net/dduLog) (DDU). Purchase additional DDUs. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. This may happen when no ActiveGate is available with the Log Analytics Collector module enabled. |  -  |
| **413** | Failed. Request payload size is too big. This may happen when the payload byte size exceeds the limit or when the ingested payload is a JSON array with the size exceeding the limit. |  -  |
| **429** | Failed. Too Many Requests. This happens when log ingest is disabled. |  -  |
| **501** | Failed. The server either does not recognize the request method, or it lacks the ability to fulfil the request. May happen when indexed log storage is not enabled. |  -  |

