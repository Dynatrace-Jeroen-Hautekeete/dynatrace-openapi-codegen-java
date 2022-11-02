# ProblemApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeProblem**](ProblemApi.md#closeProblem) | **POST** /problem/details/{problemId}/close | Closes the specified problem and adds a closing comment to it |
| [**closeProblemWithHttpInfo**](ProblemApi.md#closeProblemWithHttpInfo) | **POST** /problem/details/{problemId}/close | Closes the specified problem and adds a closing comment to it |
| [**deleteComment**](ProblemApi.md#deleteComment) | **DELETE** /problem/details/{problemId}/comments/{commentId} | Deletes an existing comment to the specified problem. |
| [**deleteCommentWithHttpInfo**](ProblemApi.md#deleteCommentWithHttpInfo) | **DELETE** /problem/details/{problemId}/comments/{commentId} | Deletes an existing comment to the specified problem. |
| [**getComment**](ProblemApi.md#getComment) | **GET** /problem/details/{problemId}/comments | Gets all the comments to the specified problem |
| [**getCommentWithHttpInfo**](ProblemApi.md#getCommentWithHttpInfo) | **GET** /problem/details/{problemId}/comments | Gets all the comments to the specified problem |
| [**getDetails**](ProblemApi.md#getDetails) | **GET** /problem/details/{problemId} | Gets the properties of the specified problem |
| [**getDetailsWithHttpInfo**](ProblemApi.md#getDetailsWithHttpInfo) | **GET** /problem/details/{problemId} | Gets the properties of the specified problem |
| [**getFeed**](ProblemApi.md#getFeed) | **GET** /problem/feed | Gets the information about problems within the specified timeframe |
| [**getFeedWithHttpInfo**](ProblemApi.md#getFeedWithHttpInfo) | **GET** /problem/feed | Gets the information about problems within the specified timeframe |
| [**getProblemStatus**](ProblemApi.md#getProblemStatus) | **GET** /problem/status | Lists the number of open problems, split by impact level |
| [**getProblemStatusWithHttpInfo**](ProblemApi.md#getProblemStatusWithHttpInfo) | **GET** /problem/status | Lists the number of open problems, split by impact level |
| [**pushComment**](ProblemApi.md#pushComment) | **POST** /problem/details/{problemId}/comments | Adds a new comment to the specified problem |
| [**pushCommentWithHttpInfo**](ProblemApi.md#pushCommentWithHttpInfo) | **POST** /problem/details/{problemId}/comments | Adds a new comment to the specified problem |
| [**updateComment**](ProblemApi.md#updateComment) | **PUT** /problem/details/{problemId}/comments/{commentId} | Updates an existing comment to the specified problem |
| [**updateCommentWithHttpInfo**](ProblemApi.md#updateCommentWithHttpInfo) | **PUT** /problem/details/{problemId}/comments/{commentId} | Updates an existing comment to the specified problem |



## closeProblem

> ProblemCloseResult closeProblem(problemId, content)

Closes the specified problem and adds a closing comment to it

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem to be closed.
        String content = "content_example"; // String | The closing comment.
        try {
            ProblemCloseResult result = apiInstance.closeProblem(problemId, content);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#closeProblem");
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
| **problemId** | **String**| The ID of the problem to be closed. | |
| **content** | **String**| The closing comment. | |

### Return type

[**ProblemCloseResult**](ProblemCloseResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## closeProblemWithHttpInfo

> ApiResponse<ProblemCloseResult> closeProblem closeProblemWithHttpInfo(problemId, content)

Closes the specified problem and adds a closing comment to it

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem to be closed.
        String content = "content_example"; // String | The closing comment.
        try {
            ApiResponse<ProblemCloseResult> response = apiInstance.closeProblemWithHttpInfo(problemId, content);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#closeProblem");
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
| **problemId** | **String**| The ID of the problem to be closed. | |
| **content** | **String**| The closing comment. | |

### Return type

ApiResponse<[**ProblemCloseResult**](ProblemCloseResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteComment

> void deleteComment(problemId, commentId)

Deletes an existing comment to the specified problem.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to delete the comment.
        String commentId = "commentId_example"; // String | The ID of the comment to delete.
        try {
            apiInstance.deleteComment(problemId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#deleteComment");
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
| **problemId** | **String**| The ID of the problem where you want to delete the comment. | |
| **commentId** | **String**| The ID of the comment to delete. | |

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
| **0** | default response |  -  |

## deleteCommentWithHttpInfo

> ApiResponse<Void> deleteComment deleteCommentWithHttpInfo(problemId, commentId)

Deletes an existing comment to the specified problem.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to delete the comment.
        String commentId = "commentId_example"; // String | The ID of the comment to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteCommentWithHttpInfo(problemId, commentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#deleteComment");
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
| **problemId** | **String**| The ID of the problem where you want to delete the comment. | |
| **commentId** | **String**| The ID of the comment to delete. | |

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
| **0** | default response |  -  |


## getComment

> ProblemCommentList getComment(problemId)

Gets all the comments to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to read the comments.
        try {
            ProblemCommentList result = apiInstance.getComment(problemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getComment");
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
| **problemId** | **String**| The ID of the problem where you want to read the comments. | |

### Return type

[**ProblemCommentList**](ProblemCommentList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getCommentWithHttpInfo

> ApiResponse<ProblemCommentList> getComment getCommentWithHttpInfo(problemId)

Gets all the comments to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to read the comments.
        try {
            ApiResponse<ProblemCommentList> response = apiInstance.getCommentWithHttpInfo(problemId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getComment");
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
| **problemId** | **String**| The ID of the problem where you want to read the comments. | |

### Return type

ApiResponse<[**ProblemCommentList**](ProblemCommentList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDetails

> ProblemDetailsResultWrapper getDetails(problemId)

Gets the properties of the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem you're inquiring.
        try {
            ProblemDetailsResultWrapper result = apiInstance.getDetails(problemId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getDetails");
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
| **problemId** | **String**| The ID of the problem you&#39;re inquiring. | |

### Return type

[**ProblemDetailsResultWrapper**](ProblemDetailsResultWrapper.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDetailsWithHttpInfo

> ApiResponse<ProblemDetailsResultWrapper> getDetails getDetailsWithHttpInfo(problemId)

Gets the properties of the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem you're inquiring.
        try {
            ApiResponse<ProblemDetailsResultWrapper> response = apiInstance.getDetailsWithHttpInfo(problemId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getDetails");
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
| **problemId** | **String**| The ID of the problem you&#39;re inquiring. | |

### Return type

ApiResponse<[**ProblemDetailsResultWrapper**](ProblemDetailsResultWrapper.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getFeed

> ProblemFeedResultWrapper getFeed(relativeTime, startTimestamp, endTimestamp, status, impactLevel, severityLevel, tag, expandDetails)

Gets the information about problems within the specified timeframe

A problem is included in the response, if either start or end timestamp of the problem is within the defined timeframe.   The output is limited to **5,000** problems. You can narrow it down by specifying query parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String relativeTime = "10mins"; // String | The relative timeframe of the inquiry, back from the current time.
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in UTC milliseconds.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in UTC milliseconds.   If `endTimestamp` is later than the current time, the current time is used.   The timeframe must not exceed 31 days.
        String status = "CLOSED"; // String | Filters the result problems by the status.
        String impactLevel = "APPLICATION"; // String | Filters the result problems by the impact level.
        String severityLevel = "AVAILABILITY"; // String | Filters the result problems by the severity level.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the result problems by the tags of affected entities.You can specify several tags in the following format: `tag=tag1&tag=tag2`. The problem has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: `[context]key:value`.
        Boolean expandDetails = true; // Boolean | Includes(`true`) or excludes(`false`) related events to the response.    Defaults to `false`, excluding the related events.
        try {
            ProblemFeedResultWrapper result = apiInstance.getFeed(relativeTime, startTimestamp, endTimestamp, status, impactLevel, severityLevel, tag, expandDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getFeed");
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
| **relativeTime** | **String**| The relative timeframe of the inquiry, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in UTC milliseconds. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in UTC milliseconds.   If &#x60;endTimestamp&#x60; is later than the current time, the current time is used.   The timeframe must not exceed 31 days. | [optional] |
| **status** | **String**| Filters the result problems by the status. | [optional] [enum: CLOSED, OPEN] |
| **impactLevel** | **String**| Filters the result problems by the impact level. | [optional] [enum: APPLICATION, ENVIRONMENT, INFRASTRUCTURE, SERVICE] |
| **severityLevel** | **String**| Filters the result problems by the severity level. | [optional] [enum: AVAILABILITY, CUSTOM_ALERT, ERROR, MONITORING_UNAVAILABLE, PERFORMANCE, RESOURCE_CONTENTION] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the result problems by the tags of affected entities.You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The problem has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;. | [optional] |
| **expandDetails** | **Boolean**| Includes(&#x60;true&#x60;) or excludes(&#x60;false&#x60;) related events to the response.    Defaults to &#x60;false&#x60;, excluding the related events. | [optional] |

### Return type

[**ProblemFeedResultWrapper**](ProblemFeedResultWrapper.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getFeedWithHttpInfo

> ApiResponse<ProblemFeedResultWrapper> getFeed getFeedWithHttpInfo(relativeTime, startTimestamp, endTimestamp, status, impactLevel, severityLevel, tag, expandDetails)

Gets the information about problems within the specified timeframe

A problem is included in the response, if either start or end timestamp of the problem is within the defined timeframe.   The output is limited to **5,000** problems. You can narrow it down by specifying query parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String relativeTime = "10mins"; // String | The relative timeframe of the inquiry, back from the current time.
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in UTC milliseconds.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in UTC milliseconds.   If `endTimestamp` is later than the current time, the current time is used.   The timeframe must not exceed 31 days.
        String status = "CLOSED"; // String | Filters the result problems by the status.
        String impactLevel = "APPLICATION"; // String | Filters the result problems by the impact level.
        String severityLevel = "AVAILABILITY"; // String | Filters the result problems by the severity level.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the result problems by the tags of affected entities.You can specify several tags in the following format: `tag=tag1&tag=tag2`. The problem has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: `[context]key:value`.
        Boolean expandDetails = true; // Boolean | Includes(`true`) or excludes(`false`) related events to the response.    Defaults to `false`, excluding the related events.
        try {
            ApiResponse<ProblemFeedResultWrapper> response = apiInstance.getFeedWithHttpInfo(relativeTime, startTimestamp, endTimestamp, status, impactLevel, severityLevel, tag, expandDetails);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getFeed");
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
| **relativeTime** | **String**| The relative timeframe of the inquiry, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in UTC milliseconds. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in UTC milliseconds.   If &#x60;endTimestamp&#x60; is later than the current time, the current time is used.   The timeframe must not exceed 31 days. | [optional] |
| **status** | **String**| Filters the result problems by the status. | [optional] [enum: CLOSED, OPEN] |
| **impactLevel** | **String**| Filters the result problems by the impact level. | [optional] [enum: APPLICATION, ENVIRONMENT, INFRASTRUCTURE, SERVICE] |
| **severityLevel** | **String**| Filters the result problems by the severity level. | [optional] [enum: AVAILABILITY, CUSTOM_ALERT, ERROR, MONITORING_UNAVAILABLE, PERFORMANCE, RESOURCE_CONTENTION] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the result problems by the tags of affected entities.You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The problem has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;. | [optional] |
| **expandDetails** | **Boolean**| Includes(&#x60;true&#x60;) or excludes(&#x60;false&#x60;) related events to the response.    Defaults to &#x60;false&#x60;, excluding the related events. | [optional] |

### Return type

ApiResponse<[**ProblemFeedResultWrapper**](ProblemFeedResultWrapper.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getProblemStatus

> ProblemStatusResultWrapper getProblemStatus()

Lists the number of open problems, split by impact level

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        try {
            ProblemStatusResultWrapper result = apiInstance.getProblemStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getProblemStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ProblemStatusResultWrapper**](ProblemStatusResultWrapper.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getProblemStatusWithHttpInfo

> ApiResponse<ProblemStatusResultWrapper> getProblemStatus getProblemStatusWithHttpInfo()

Lists the number of open problems, split by impact level

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        try {
            ApiResponse<ProblemStatusResultWrapper> response = apiInstance.getProblemStatusWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#getProblemStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ProblemStatusResultWrapper**](ProblemStatusResultWrapper.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## pushComment

> ProblemComment pushComment(problemId, pushProblemComment)

Adds a new comment to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to add the comment.
        PushProblemComment pushProblemComment = new PushProblemComment(); // PushProblemComment | JSON body of the request, containing the comment.
        try {
            ProblemComment result = apiInstance.pushComment(problemId, pushProblemComment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#pushComment");
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
| **problemId** | **String**| The ID of the problem where you want to add the comment. | |
| **pushProblemComment** | [**PushProblemComment**](PushProblemComment.md)| JSON body of the request, containing the comment. | [optional] |

### Return type

[**ProblemComment**](ProblemComment.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## pushCommentWithHttpInfo

> ApiResponse<ProblemComment> pushComment pushCommentWithHttpInfo(problemId, pushProblemComment)

Adds a new comment to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to add the comment.
        PushProblemComment pushProblemComment = new PushProblemComment(); // PushProblemComment | JSON body of the request, containing the comment.
        try {
            ApiResponse<ProblemComment> response = apiInstance.pushCommentWithHttpInfo(problemId, pushProblemComment);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#pushComment");
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
| **problemId** | **String**| The ID of the problem where you want to add the comment. | |
| **pushProblemComment** | [**PushProblemComment**](PushProblemComment.md)| JSON body of the request, containing the comment. | [optional] |

### Return type

ApiResponse<[**ProblemComment**](ProblemComment.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateComment

> ProblemComment updateComment(problemId, commentId, pushProblemComment)

Updates an existing comment to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to edit the comment.
        String commentId = "commentId_example"; // String | The ID of the comment you want to edit.
        PushProblemComment pushProblemComment = new PushProblemComment(); // PushProblemComment | JSON body of the request, containing the updated comment.
        try {
            ProblemComment result = apiInstance.updateComment(problemId, commentId, pushProblemComment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#updateComment");
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
| **problemId** | **String**| The ID of the problem where you want to edit the comment. | |
| **commentId** | **String**| The ID of the comment you want to edit. | |
| **pushProblemComment** | [**PushProblemComment**](PushProblemComment.md)| JSON body of the request, containing the updated comment. | [optional] |

### Return type

[**ProblemComment**](ProblemComment.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## updateCommentWithHttpInfo

> ApiResponse<ProblemComment> updateComment updateCommentWithHttpInfo(problemId, commentId, pushProblemComment)

Updates an existing comment to the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ProblemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemApi apiInstance = new ProblemApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the problem where you want to edit the comment.
        String commentId = "commentId_example"; // String | The ID of the comment you want to edit.
        PushProblemComment pushProblemComment = new PushProblemComment(); // PushProblemComment | JSON body of the request, containing the updated comment.
        try {
            ApiResponse<ProblemComment> response = apiInstance.updateCommentWithHttpInfo(problemId, commentId, pushProblemComment);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemApi#updateComment");
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
| **problemId** | **String**| The ID of the problem where you want to edit the comment. | |
| **commentId** | **String**| The ID of the comment you want to edit. | |
| **pushProblemComment** | [**PushProblemComment**](PushProblemComment.md)| JSON body of the request, containing the updated comment. | [optional] |

### Return type

ApiResponse<[**ProblemComment**](ProblemComment.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

