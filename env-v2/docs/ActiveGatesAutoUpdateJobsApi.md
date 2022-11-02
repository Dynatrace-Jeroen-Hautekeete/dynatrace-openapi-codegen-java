# ActiveGatesAutoUpdateJobsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUpdateJobForAg**](ActiveGatesAutoUpdateJobsApi.md#createUpdateJobForAg) | **POST** /activeGates/{agId}/updateJobs | Creates a new update job for the specified ActiveGate |
| [**createUpdateJobForAgWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#createUpdateJobForAgWithHttpInfo) | **POST** /activeGates/{agId}/updateJobs | Creates a new update job for the specified ActiveGate |
| [**deleteUpdateJobByJobIdForAg**](ActiveGatesAutoUpdateJobsApi.md#deleteUpdateJobByJobIdForAg) | **DELETE** /activeGates/{agId}/updateJobs/{jobId} | Deletes the specified update job |
| [**deleteUpdateJobByJobIdForAgWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#deleteUpdateJobByJobIdForAgWithHttpInfo) | **DELETE** /activeGates/{agId}/updateJobs/{jobId} | Deletes the specified update job |
| [**getAllUpdateJobList**](ActiveGatesAutoUpdateJobsApi.md#getAllUpdateJobList) | **GET** /activeGates/updateJobs | List ActiveGates with update jobs |
| [**getAllUpdateJobListWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#getAllUpdateJobListWithHttpInfo) | **GET** /activeGates/updateJobs | List ActiveGates with update jobs |
| [**getUpdateJobByJobIdForAg**](ActiveGatesAutoUpdateJobsApi.md#getUpdateJobByJobIdForAg) | **GET** /activeGates/{agId}/updateJobs/{jobId} | Gets the parameters of the specified update job |
| [**getUpdateJobByJobIdForAgWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#getUpdateJobByJobIdForAgWithHttpInfo) | **GET** /activeGates/{agId}/updateJobs/{jobId} | Gets the parameters of the specified update job |
| [**getUpdateJobListByAgId**](ActiveGatesAutoUpdateJobsApi.md#getUpdateJobListByAgId) | **GET** /activeGates/{agId}/updateJobs | Lists update jobs for the specified ActiveGate |
| [**getUpdateJobListByAgIdWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#getUpdateJobListByAgIdWithHttpInfo) | **GET** /activeGates/{agId}/updateJobs | Lists update jobs for the specified ActiveGate |
| [**validateUpdateJobForAg**](ActiveGatesAutoUpdateJobsApi.md#validateUpdateJobForAg) | **POST** /activeGates/{agId}/updateJobs/validator | Validates the payload for the &#x60;POST /activeGates/{agId}/updateJobs&#x60; request. |
| [**validateUpdateJobForAgWithHttpInfo**](ActiveGatesAutoUpdateJobsApi.md#validateUpdateJobForAgWithHttpInfo) | **POST** /activeGates/{agId}/updateJobs/validator | Validates the payload for the &#x60;POST /activeGates/{agId}/updateJobs&#x60; request. |



## createUpdateJobForAg

> UpdateJob createUpdateJobForAg(agId, updateJob)

Creates a new update job for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        UpdateJob updateJob = new UpdateJob(); // UpdateJob | JSON body of the request, containing update-job parameters.
        try {
            UpdateJob result = apiInstance.createUpdateJobForAg(agId, updateJob);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#createUpdateJobForAg");
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
| **updateJob** | [**UpdateJob**](UpdateJob.md)| JSON body of the request, containing update-job parameters. | |

### Return type

[**UpdateJob**](UpdateJob.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The update-job have been created. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createUpdateJobForAgWithHttpInfo

> ApiResponse<UpdateJob> createUpdateJobForAg createUpdateJobForAgWithHttpInfo(agId, updateJob)

Creates a new update job for the specified ActiveGate

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        UpdateJob updateJob = new UpdateJob(); // UpdateJob | JSON body of the request, containing update-job parameters.
        try {
            ApiResponse<UpdateJob> response = apiInstance.createUpdateJobForAgWithHttpInfo(agId, updateJob);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#createUpdateJobForAg");
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
| **updateJob** | [**UpdateJob**](UpdateJob.md)| JSON body of the request, containing update-job parameters. | |

### Return type

ApiResponse<[**UpdateJob**](UpdateJob.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The update-job have been created. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteUpdateJobByJobIdForAg

> void deleteUpdateJobByJobIdForAg(agId, jobId)

Deletes the specified update job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String jobId = "jobId_example"; // String | A unique identifier for a update-job of ActiveGate.
        try {
            apiInstance.deleteUpdateJobByJobIdForAg(agId, jobId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#deleteUpdateJobByJobIdForAg");
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
| **jobId** | **String**| A unique identifier for a update-job of ActiveGate. | |

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
| **204** | Success. The update-job have been deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Not found. See response body for details. |  -  |

## deleteUpdateJobByJobIdForAgWithHttpInfo

> ApiResponse<Void> deleteUpdateJobByJobIdForAg deleteUpdateJobByJobIdForAgWithHttpInfo(agId, jobId)

Deletes the specified update job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String jobId = "jobId_example"; // String | A unique identifier for a update-job of ActiveGate.
        try {
            ApiResponse<Void> response = apiInstance.deleteUpdateJobByJobIdForAgWithHttpInfo(agId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#deleteUpdateJobByJobIdForAg");
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
| **jobId** | **String**| A unique identifier for a update-job of ActiveGate. | |

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
| **204** | Success. The update-job have been deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Not found. See response body for details. |  -  |


## getAllUpdateJobList

> UpdateJobsAll getAllUpdateJobList(from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates)

List ActiveGates with update jobs

The response includes ActiveGates that have both completed (successful and failed) jobs and jobs in progress.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of one day is used (`now-1d`).   Maximum timeframe is 31 days.
        String to = "to_example"; // String | The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String startVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here.
        String startVersion = "startVersion_example"; // String | Filters the resulting set of update-jobs by the initial version (required format `<major>.<minor>.<revision>`).
        String updateType = "ACTIVE_GATE"; // String | Filters the resulting set of update-jobs by the update type.
        String targetVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here.
        String targetVersion = "targetVersion_example"; // String | Filters the resulting set of update-jobs by the target version (required format `<major>.<minor>.<revision>`).
        Boolean lastUpdates = false; // Boolean | If `true`, filters the resulting set of update jobs to the most recent update of each type.
        try {
            UpdateJobsAll result = apiInstance.getAllUpdateJobList(from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getAllUpdateJobList");
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
| **from** | **String**| The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of one day is used (&#x60;now-1d&#x60;).   Maximum timeframe is 31 days. | [optional] |
| **to** | **String**| The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **startVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **startVersion** | **String**| Filters the resulting set of update-jobs by the initial version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **updateType** | **String**| Filters the resulting set of update-jobs by the update type. | [optional] [enum: ACTIVE_GATE, REMOTE_PLUGIN_AGENT, SYNTHETIC, Z_REMOTE] |
| **targetVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **targetVersion** | **String**| Filters the resulting set of update-jobs by the target version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **lastUpdates** | **Boolean**| If &#x60;true&#x60;, filters the resulting set of update jobs to the most recent update of each type. | [optional] [default to false] |

### Return type

[**UpdateJobsAll**](UpdateJobsAll.md)


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

## getAllUpdateJobListWithHttpInfo

> ApiResponse<UpdateJobsAll> getAllUpdateJobList getAllUpdateJobListWithHttpInfo(from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates)

List ActiveGates with update jobs

The response includes ActiveGates that have both completed (successful and failed) jobs and jobs in progress.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String from = "from_example"; // String | The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of one day is used (`now-1d`).   Maximum timeframe is 31 days.
        String to = "to_example"; // String | The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String startVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here.
        String startVersion = "startVersion_example"; // String | Filters the resulting set of update-jobs by the initial version (required format `<major>.<minor>.<revision>`).
        String updateType = "ACTIVE_GATE"; // String | Filters the resulting set of update-jobs by the update type.
        String targetVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here.
        String targetVersion = "targetVersion_example"; // String | Filters the resulting set of update-jobs by the target version (required format `<major>.<minor>.<revision>`).
        Boolean lastUpdates = false; // Boolean | If `true`, filters the resulting set of update jobs to the most recent update of each type.
        try {
            ApiResponse<UpdateJobsAll> response = apiInstance.getAllUpdateJobListWithHttpInfo(from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getAllUpdateJobList");
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
| **from** | **String**| The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of one day is used (&#x60;now-1d&#x60;).   Maximum timeframe is 31 days. | [optional] |
| **to** | **String**| The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **startVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **startVersion** | **String**| Filters the resulting set of update-jobs by the initial version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **updateType** | **String**| Filters the resulting set of update-jobs by the update type. | [optional] [enum: ACTIVE_GATE, REMOTE_PLUGIN_AGENT, SYNTHETIC, Z_REMOTE] |
| **targetVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **targetVersion** | **String**| Filters the resulting set of update-jobs by the target version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **lastUpdates** | **Boolean**| If &#x60;true&#x60;, filters the resulting set of update jobs to the most recent update of each type. | [optional] [default to false] |

### Return type

ApiResponse<[**UpdateJobsAll**](UpdateJobsAll.md)>


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


## getUpdateJobByJobIdForAg

> UpdateJob getUpdateJobByJobIdForAg(agId, jobId)

Gets the parameters of the specified update job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String jobId = "jobId_example"; // String | A unique identifier for a update-job of ActiveGate.
        try {
            UpdateJob result = apiInstance.getUpdateJobByJobIdForAg(agId, jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getUpdateJobByJobIdForAg");
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
| **jobId** | **String**| A unique identifier for a update-job of ActiveGate. | |

### Return type

[**UpdateJob**](UpdateJob.md)


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

## getUpdateJobByJobIdForAgWithHttpInfo

> ApiResponse<UpdateJob> getUpdateJobByJobIdForAg getUpdateJobByJobIdForAgWithHttpInfo(agId, jobId)

Gets the parameters of the specified update job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String jobId = "jobId_example"; // String | A unique identifier for a update-job of ActiveGate.
        try {
            ApiResponse<UpdateJob> response = apiInstance.getUpdateJobByJobIdForAgWithHttpInfo(agId, jobId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getUpdateJobByJobIdForAg");
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
| **jobId** | **String**| A unique identifier for a update-job of ActiveGate. | |

### Return type

ApiResponse<[**UpdateJob**](UpdateJob.md)>


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


## getUpdateJobListByAgId

> UpdateJobList getUpdateJobListByAgId(agId, from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates)

Lists update jobs for the specified ActiveGate

The job can update the ActiveGate to the specified version or the latest available one.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String from = "from_example"; // String | The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of one week is used (`now-1w`).   Maximum timeframe is 31 days.
        String to = "to_example"; // String | The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String startVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here.
        String startVersion = "startVersion_example"; // String | Filters the resulting set of update-jobs by the initial version (required format `<major>.<minor>.<revision>`).
        String updateType = "ACTIVE_GATE"; // String | Filters the resulting set of update-jobs by the update type.
        String targetVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here.
        String targetVersion = "targetVersion_example"; // String | Filters the resulting set of update-jobs by the target version (required format `<major>.<minor>.<revision>`).
        Boolean lastUpdates = false; // Boolean | If `true`, filters the resulting set of update jobs to the most recent update of each type.
        try {
            UpdateJobList result = apiInstance.getUpdateJobListByAgId(agId, from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getUpdateJobListByAgId");
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
| **from** | **String**| The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of one week is used (&#x60;now-1w&#x60;).   Maximum timeframe is 31 days. | [optional] |
| **to** | **String**| The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **startVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **startVersion** | **String**| Filters the resulting set of update-jobs by the initial version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **updateType** | **String**| Filters the resulting set of update-jobs by the update type. | [optional] [enum: ACTIVE_GATE, REMOTE_PLUGIN_AGENT, SYNTHETIC, Z_REMOTE] |
| **targetVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **targetVersion** | **String**| Filters the resulting set of update-jobs by the target version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **lastUpdates** | **Boolean**| If &#x60;true&#x60;, filters the resulting set of update jobs to the most recent update of each type. | [optional] [default to false] |

### Return type

[**UpdateJobList**](UpdateJobList.md)


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

## getUpdateJobListByAgIdWithHttpInfo

> ApiResponse<UpdateJobList> getUpdateJobListByAgId getUpdateJobListByAgIdWithHttpInfo(agId, from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates)

Lists update jobs for the specified ActiveGate

The job can update the ActiveGate to the specified version or the latest available one.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        String from = "from_example"; // String | The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of one week is used (`now-1w`).   Maximum timeframe is 31 days.
        String to = "to_example"; // String | The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String startVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here.
        String startVersion = "startVersion_example"; // String | Filters the resulting set of update-jobs by the initial version (required format `<major>.<minor>.<revision>`).
        String updateType = "ACTIVE_GATE"; // String | Filters the resulting set of update-jobs by the update type.
        String targetVersionCompareType = "EQUAL"; // String | Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here.
        String targetVersion = "targetVersion_example"; // String | Filters the resulting set of update-jobs by the target version (required format `<major>.<minor>.<revision>`).
        Boolean lastUpdates = false; // Boolean | If `true`, filters the resulting set of update jobs to the most recent update of each type.
        try {
            ApiResponse<UpdateJobList> response = apiInstance.getUpdateJobListByAgIdWithHttpInfo(agId, from, to, startVersionCompareType, startVersion, updateType, targetVersionCompareType, targetVersion, lastUpdates);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#getUpdateJobListByAgId");
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
| **from** | **String**| The start of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of one week is used (&#x60;now-1w&#x60;).   Maximum timeframe is 31 days. | [optional] |
| **to** | **String**| The end of the requested timeframe for update jobs.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **startVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified initial version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **startVersion** | **String**| Filters the resulting set of update-jobs by the initial version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **updateType** | **String**| Filters the resulting set of update-jobs by the update type. | [optional] [enum: ACTIVE_GATE, REMOTE_PLUGIN_AGENT, SYNTHETIC, Z_REMOTE] |
| **targetVersionCompareType** | **String**| Filters the resulting set of update jobs by the specified target version.    Specify the comparison operator here. | [optional] [default to EQUAL] [enum: EQUAL, GREATER, GREATER_EQUAL, LOWER, LOWER_EQUAL] |
| **targetVersion** | **String**| Filters the resulting set of update-jobs by the target version (required format &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60;). | [optional] |
| **lastUpdates** | **Boolean**| If &#x60;true&#x60;, filters the resulting set of update jobs to the most recent update of each type. | [optional] [default to false] |

### Return type

ApiResponse<[**UpdateJobList**](UpdateJobList.md)>


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


## validateUpdateJobForAg

> void validateUpdateJobForAg(agId, updateJob)

Validates the payload for the &#x60;POST /activeGates/{agId}/updateJobs&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        UpdateJob updateJob = new UpdateJob(); // UpdateJob | JSON body of the request, containing update-job parameters.
        try {
            apiInstance.validateUpdateJobForAg(agId, updateJob);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#validateUpdateJobForAg");
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
| **updateJob** | [**UpdateJob**](UpdateJob.md)| JSON body of the request, containing update-job parameters. | |

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
| **204** | Validated. The submitted update-job is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateJobForAgWithHttpInfo

> ApiResponse<Void> validateUpdateJobForAg validateUpdateJobForAgWithHttpInfo(agId, updateJob)

Validates the payload for the &#x60;POST /activeGates/{agId}/updateJobs&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ActiveGatesAutoUpdateJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ActiveGatesAutoUpdateJobsApi apiInstance = new ActiveGatesAutoUpdateJobsApi(defaultClient);
        String agId = "agId_example"; // String | The ID of the required ActiveGate.
        UpdateJob updateJob = new UpdateJob(); // UpdateJob | JSON body of the request, containing update-job parameters.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateJobForAgWithHttpInfo(agId, updateJob);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ActiveGatesAutoUpdateJobsApi#validateUpdateJobForAg");
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
| **updateJob** | [**UpdateJob**](UpdateJob.md)| JSON body of the request, containing update-job parameters. | |

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
| **204** | Validated. The submitted update-job is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

