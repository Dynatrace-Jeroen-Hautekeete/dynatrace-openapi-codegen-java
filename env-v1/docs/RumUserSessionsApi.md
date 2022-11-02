# RumUserSessionsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDTAQLResultAsTable**](RumUserSessionsApi.md#getDTAQLResultAsTable) | **GET** /userSessionQueryLanguage/table | Returns the result of the query as a table structure |
| [**getDTAQLResultAsTableWithHttpInfo**](RumUserSessionsApi.md#getDTAQLResultAsTableWithHttpInfo) | **GET** /userSessionQueryLanguage/table | Returns the result of the query as a table structure |
| [**getDTAQLResultAsTree**](RumUserSessionsApi.md#getDTAQLResultAsTree) | **GET** /userSessionQueryLanguage/tree | Returns the result of the query as a tree structure |
| [**getDTAQLResultAsTreeWithHttpInfo**](RumUserSessionsApi.md#getDTAQLResultAsTreeWithHttpInfo) | **GET** /userSessionQueryLanguage/tree | Returns the result of the query as a tree structure |



## getDTAQLResultAsTable

> DtaqlResultAsTable getDTAQLResultAsTable(query, startTimestamp, endTimestamp, offsetUTC, pageSize, pageOffset, addDeepLinkFields, explain)

Returns the result of the query as a table structure

The result is a flat list of rows containing the requested columns.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumUserSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumUserSessionsApi apiInstance = new RumUserSessionsApi(defaultClient);
        String query = "query_example"; // String | The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the `UserSession` object.    Here is an example of the query: `SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city`.
        Long startTimestamp = 56L; // Long | The start timestamp of the query, in UTC milliseconds.   If not set or set as `0`, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Long endTimestamp = 56L; // Long | The end timestamp of the query, in UTC milliseconds.   If not set or set as `0`, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Integer offsetUTC = 56; // Integer | Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300.
        Integer pageSize = 56; // Integer | Optional limit on how many of the actual query results should be returned in the tabular result.
        Integer pageOffset = 56; // Integer | Optional offset of the requested results from the start of tabular results. Relates to pageSize.   E.g. on a query that might return 500 results, you might want to receive results in chunks of 50 rows.   this can be achieved by using pageSize=50, and setting pageOffset in subsequent calls.In the example adding pageOffset=50 returns result rows 51-100.
        Boolean addDeepLinkFields = false; // Boolean | Add (`true`) to enable deep linking of additional fields in the query.   If not set, then `false` is used
        Boolean explain = false; // Boolean | Add (`true`) or don't add (`false`) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then `false` is used
        try {
            DtaqlResultAsTable result = apiInstance.getDTAQLResultAsTable(query, startTimestamp, endTimestamp, offsetUTC, pageSize, pageOffset, addDeepLinkFields, explain);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumUserSessionsApi#getDTAQLResultAsTable");
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
| **query** | **String**| The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the &#x60;UserSession&#x60; object.    Here is an example of the query: &#x60;SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city&#x60;. | |
| **startTimestamp** | **Long**| The start timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **offsetUTC** | **Integer**| Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300. | [optional] |
| **pageSize** | **Integer**| Optional limit on how many of the actual query results should be returned in the tabular result. | [optional] |
| **pageOffset** | **Integer**| Optional offset of the requested results from the start of tabular results. Relates to pageSize.   E.g. on a query that might return 500 results, you might want to receive results in chunks of 50 rows.   this can be achieved by using pageSize&#x3D;50, and setting pageOffset in subsequent calls.In the example adding pageOffset&#x3D;50 returns result rows 51-100. | [optional] |
| **addDeepLinkFields** | **Boolean**| Add (&#x60;true&#x60;) to enable deep linking of additional fields in the query.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |
| **explain** | **Boolean**| Add (&#x60;true&#x60;) or don&#39;t add (&#x60;false&#x60;) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |

### Return type

[**DtaqlResultAsTable**](DtaqlResultAsTable.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the result of the query. |  -  |
| **400** | Failed. The query is missing. |  -  |
| **404** | Failed. The query is invalid. See the response body for more information. |  -  |
| **199** | The data structure of the user session. This response code is never returned. |  -  |

## getDTAQLResultAsTableWithHttpInfo

> ApiResponse<DtaqlResultAsTable> getDTAQLResultAsTable getDTAQLResultAsTableWithHttpInfo(query, startTimestamp, endTimestamp, offsetUTC, pageSize, pageOffset, addDeepLinkFields, explain)

Returns the result of the query as a table structure

The result is a flat list of rows containing the requested columns.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumUserSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumUserSessionsApi apiInstance = new RumUserSessionsApi(defaultClient);
        String query = "query_example"; // String | The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the `UserSession` object.    Here is an example of the query: `SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city`.
        Long startTimestamp = 56L; // Long | The start timestamp of the query, in UTC milliseconds.   If not set or set as `0`, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Long endTimestamp = 56L; // Long | The end timestamp of the query, in UTC milliseconds.   If not set or set as `0`, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Integer offsetUTC = 56; // Integer | Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300.
        Integer pageSize = 56; // Integer | Optional limit on how many of the actual query results should be returned in the tabular result.
        Integer pageOffset = 56; // Integer | Optional offset of the requested results from the start of tabular results. Relates to pageSize.   E.g. on a query that might return 500 results, you might want to receive results in chunks of 50 rows.   this can be achieved by using pageSize=50, and setting pageOffset in subsequent calls.In the example adding pageOffset=50 returns result rows 51-100.
        Boolean addDeepLinkFields = false; // Boolean | Add (`true`) to enable deep linking of additional fields in the query.   If not set, then `false` is used
        Boolean explain = false; // Boolean | Add (`true`) or don't add (`false`) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then `false` is used
        try {
            ApiResponse<DtaqlResultAsTable> response = apiInstance.getDTAQLResultAsTableWithHttpInfo(query, startTimestamp, endTimestamp, offsetUTC, pageSize, pageOffset, addDeepLinkFields, explain);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumUserSessionsApi#getDTAQLResultAsTable");
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
| **query** | **String**| The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the &#x60;UserSession&#x60; object.    Here is an example of the query: &#x60;SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city&#x60;. | |
| **startTimestamp** | **Long**| The start timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **offsetUTC** | **Integer**| Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300. | [optional] |
| **pageSize** | **Integer**| Optional limit on how many of the actual query results should be returned in the tabular result. | [optional] |
| **pageOffset** | **Integer**| Optional offset of the requested results from the start of tabular results. Relates to pageSize.   E.g. on a query that might return 500 results, you might want to receive results in chunks of 50 rows.   this can be achieved by using pageSize&#x3D;50, and setting pageOffset in subsequent calls.In the example adding pageOffset&#x3D;50 returns result rows 51-100. | [optional] |
| **addDeepLinkFields** | **Boolean**| Add (&#x60;true&#x60;) to enable deep linking of additional fields in the query.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |
| **explain** | **Boolean**| Add (&#x60;true&#x60;) or don&#39;t add (&#x60;false&#x60;) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |

### Return type

ApiResponse<[**DtaqlResultAsTable**](DtaqlResultAsTable.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the result of the query. |  -  |
| **400** | Failed. The query is missing. |  -  |
| **404** | Failed. The query is invalid. See the response body for more information. |  -  |
| **199** | The data structure of the user session. This response code is never returned. |  -  |


## getDTAQLResultAsTree

> DtaqlResultAsTree getDTAQLResultAsTree(query, startTimestamp, endTimestamp, offsetUTC, addDeepLinkFields, explain)

Returns the result of the query as a tree structure

To get a proper tree structure, you need to specify grouping in the query.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumUserSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumUserSessionsApi apiInstance = new RumUserSessionsApi(defaultClient);
        String query = "query_example"; // String | The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the `UserSession` object.    Here is an example of the query: `SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city`.
        Long startTimestamp = 56L; // Long | The start timestamp of the query, in UTC milliseconds.   If not set or set as `0`, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Long endTimestamp = 56L; // Long | The end timestamp of the query, in UTC milliseconds.   If not set or set as `0`, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Integer offsetUTC = 56; // Integer | Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300.
        Boolean addDeepLinkFields = false; // Boolean | Add (`true`) to enable deep linking of additional fields in the query.   If not set, then `false` is used
        Boolean explain = false; // Boolean | Add (`true`) or don't add (`false`) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then `false` is used
        try {
            DtaqlResultAsTree result = apiInstance.getDTAQLResultAsTree(query, startTimestamp, endTimestamp, offsetUTC, addDeepLinkFields, explain);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumUserSessionsApi#getDTAQLResultAsTree");
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
| **query** | **String**| The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the &#x60;UserSession&#x60; object.    Here is an example of the query: &#x60;SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city&#x60;. | |
| **startTimestamp** | **Long**| The start timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **offsetUTC** | **Integer**| Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300. | [optional] |
| **addDeepLinkFields** | **Boolean**| Add (&#x60;true&#x60;) to enable deep linking of additional fields in the query.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |
| **explain** | **Boolean**| Add (&#x60;true&#x60;) or don&#39;t add (&#x60;false&#x60;) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |

### Return type

[**DtaqlResultAsTree**](DtaqlResultAsTree.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the result of the query. |  -  |
| **400** | Failed. The query is missing. |  -  |
| **404** | Failed. The query is invalid. See the response body for more information. |  -  |
| **199** | The data structure of the user session. This response code is never returned. |  -  |

## getDTAQLResultAsTreeWithHttpInfo

> ApiResponse<DtaqlResultAsTree> getDTAQLResultAsTree getDTAQLResultAsTreeWithHttpInfo(query, startTimestamp, endTimestamp, offsetUTC, addDeepLinkFields, explain)

Returns the result of the query as a tree structure

To get a proper tree structure, you need to specify grouping in the query.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.RumUserSessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumUserSessionsApi apiInstance = new RumUserSessionsApi(defaultClient);
        String query = "query_example"; // String | The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the `UserSession` object.    Here is an example of the query: `SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city`.
        Long startTimestamp = 56L; // Long | The start timestamp of the query, in UTC milliseconds.   If not set or set as `0`, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Long endTimestamp = 56L; // Long | The end timestamp of the query, in UTC milliseconds.   If not set or set as `0`, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter).
        Integer offsetUTC = 56; // Integer | Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300.
        Boolean addDeepLinkFields = false; // Boolean | Add (`true`) to enable deep linking of additional fields in the query.   If not set, then `false` is used
        Boolean explain = false; // Boolean | Add (`true`) or don't add (`false`) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then `false` is used
        try {
            ApiResponse<DtaqlResultAsTree> response = apiInstance.getDTAQLResultAsTreeWithHttpInfo(query, startTimestamp, endTimestamp, offsetUTC, addDeepLinkFields, explain);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumUserSessionsApi#getDTAQLResultAsTree");
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
| **query** | **String**| The user session query to be executed. See [USQL documentation page](https://dt-url.net/dtusql) for syntax details.    You can find the available columns of the **usersession** table in the &#x60;UserSession&#x60; object.    Here is an example of the query: &#x60;SELECT country, city, COUNT(*) FROM usersession GROUP BY country, city&#x60;. | |
| **startTimestamp** | **Long**| The start timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, 2 hours behind the current time is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the query, in UTC milliseconds.   If not set or set as &#x60;0&#x60;, the current timestamp is used.   If the exact times are important, set the timeframe in the query itself (**query** parameter). | [optional] |
| **offsetUTC** | **Integer**| Optional offset of local time to UTC time in minutes. Offset will be applied to Date fields encountered in the query.   Can be positive or negative. E.g. if the local time is UTC+02:00, the timeOffset is 120. If it is UTC-05:00, timeOffset is -300. | [optional] |
| **addDeepLinkFields** | **Boolean**| Add (&#x60;true&#x60;) to enable deep linking of additional fields in the query.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |
| **explain** | **Boolean**| Add (&#x60;true&#x60;) or don&#39;t add (&#x60;false&#x60;) some additional information about the result to the response.   It helps to understand the query and how the result was calculated.   If not set, then &#x60;false&#x60; is used | [optional] [default to false] |

### Return type

ApiResponse<[**DtaqlResultAsTree**](DtaqlResultAsTree.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the result of the query. |  -  |
| **400** | Failed. The query is missing. |  -  |
| **404** | Failed. The query is invalid. See the response body for more information. |  -  |
| **199** | The data structure of the user session. This response code is never returned. |  -  |

