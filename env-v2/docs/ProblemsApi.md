# ProblemsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeProblem**](ProblemsApi.md#closeProblem) | **POST** /problems/{problemId}/close | Closes the specified problem and adds a closing comment on it |
| [**closeProblemWithHttpInfo**](ProblemsApi.md#closeProblemWithHttpInfo) | **POST** /problems/{problemId}/close | Closes the specified problem and adds a closing comment on it |
| [**createComment**](ProblemsApi.md#createComment) | **POST** /problems/{problemId}/comments | Adds a new comment on the specified problem |
| [**createCommentWithHttpInfo**](ProblemsApi.md#createCommentWithHttpInfo) | **POST** /problems/{problemId}/comments | Adds a new comment on the specified problem |
| [**deleteComment**](ProblemsApi.md#deleteComment) | **DELETE** /problems/{problemId}/comments/{commentId} | Deletes the specified comment from a problem |
| [**deleteCommentWithHttpInfo**](ProblemsApi.md#deleteCommentWithHttpInfo) | **DELETE** /problems/{problemId}/comments/{commentId} | Deletes the specified comment from a problem |
| [**getComment**](ProblemsApi.md#getComment) | **GET** /problems/{problemId}/comments/{commentId} | Gets the specified comment on a problem |
| [**getCommentWithHttpInfo**](ProblemsApi.md#getCommentWithHttpInfo) | **GET** /problems/{problemId}/comments/{commentId} | Gets the specified comment on a problem |
| [**getComments**](ProblemsApi.md#getComments) | **GET** /problems/{problemId}/comments | Gets all comments on the specified problem |
| [**getCommentsWithHttpInfo**](ProblemsApi.md#getCommentsWithHttpInfo) | **GET** /problems/{problemId}/comments | Gets all comments on the specified problem |
| [**getProblem**](ProblemsApi.md#getProblem) | **GET** /problems/{problemId} | Gets the properties of the specified problem |
| [**getProblemWithHttpInfo**](ProblemsApi.md#getProblemWithHttpInfo) | **GET** /problems/{problemId} | Gets the properties of the specified problem |
| [**getProblems**](ProblemsApi.md#getProblems) | **GET** /problems | Lists problems observed within the specified timeframe |
| [**getProblemsWithHttpInfo**](ProblemsApi.md#getProblemsWithHttpInfo) | **GET** /problems | Lists problems observed within the specified timeframe |
| [**updateComment**](ProblemsApi.md#updateComment) | **PUT** /problems/{problemId}/comments/{commentId} | Updates the specified comment on a problem |
| [**updateCommentWithHttpInfo**](ProblemsApi.md#updateCommentWithHttpInfo) | **PUT** /problems/{problemId}/comments/{commentId} | Updates the specified comment on a problem |



## closeProblem

> ProblemCloseResult closeProblem(problemId, problemCloseRequestDtoImpl)

Closes the specified problem and adds a closing comment on it

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        ProblemCloseRequestDtoImpl problemCloseRequestDtoImpl = new ProblemCloseRequestDtoImpl(); // ProblemCloseRequestDtoImpl | The JSON body of the request. Contains the closing comment on the problem.
        try {
            ProblemCloseResult result = apiInstance.closeProblem(problemId, problemCloseRequestDtoImpl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#closeProblem");
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
| **problemId** | **String**| The ID of the required problem. | |
| **problemCloseRequestDtoImpl** | [**ProblemCloseRequestDtoImpl**](ProblemCloseRequestDtoImpl.md)| The JSON body of the request. Contains the closing comment on the problem. | [optional] |

### Return type

[**ProblemCloseResult**](ProblemCloseResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | The problem is closed already the request hasn&#39;t been executed. |  -  |

## closeProblemWithHttpInfo

> ApiResponse<ProblemCloseResult> closeProblem closeProblemWithHttpInfo(problemId, problemCloseRequestDtoImpl)

Closes the specified problem and adds a closing comment on it

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        ProblemCloseRequestDtoImpl problemCloseRequestDtoImpl = new ProblemCloseRequestDtoImpl(); // ProblemCloseRequestDtoImpl | The JSON body of the request. Contains the closing comment on the problem.
        try {
            ApiResponse<ProblemCloseResult> response = apiInstance.closeProblemWithHttpInfo(problemId, problemCloseRequestDtoImpl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#closeProblem");
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
| **problemId** | **String**| The ID of the required problem. | |
| **problemCloseRequestDtoImpl** | [**ProblemCloseRequestDtoImpl**](ProblemCloseRequestDtoImpl.md)| The JSON body of the request. Contains the closing comment on the problem. | [optional] |

### Return type

ApiResponse<[**ProblemCloseResult**](ProblemCloseResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | The problem is closed already the request hasn&#39;t been executed. |  -  |


## createComment

> void createComment(problemId, commentRequestDtoImpl)

Adds a new comment on the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        CommentRequestDtoImpl commentRequestDtoImpl = new CommentRequestDtoImpl(); // CommentRequestDtoImpl | The JSON body of the request. Contains the comment to be added.
        try {
            apiInstance.createComment(problemId, commentRequestDtoImpl);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#createComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentRequestDtoImpl** | [**CommentRequestDtoImpl**](CommentRequestDtoImpl.md)| The JSON body of the request. Contains the comment to be added. | [optional] |

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
| **201** | Success. The comment has been added. |  -  |

## createCommentWithHttpInfo

> ApiResponse<Void> createComment createCommentWithHttpInfo(problemId, commentRequestDtoImpl)

Adds a new comment on the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        CommentRequestDtoImpl commentRequestDtoImpl = new CommentRequestDtoImpl(); // CommentRequestDtoImpl | The JSON body of the request. Contains the comment to be added.
        try {
            ApiResponse<Void> response = apiInstance.createCommentWithHttpInfo(problemId, commentRequestDtoImpl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#createComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentRequestDtoImpl** | [**CommentRequestDtoImpl**](CommentRequestDtoImpl.md)| The JSON body of the request. Contains the comment to be added. | [optional] |

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
| **201** | Success. The comment has been added. |  -  |


## deleteComment

> void deleteComment(problemId, commentId)

Deletes the specified comment from a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        try {
            apiInstance.deleteComment(problemId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#deleteComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |

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
| **204** | Success. The comment has been deleted. |  -  |

## deleteCommentWithHttpInfo

> ApiResponse<Void> deleteComment deleteCommentWithHttpInfo(problemId, commentId)

Deletes the specified comment from a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        try {
            ApiResponse<Void> response = apiInstance.deleteCommentWithHttpInfo(problemId, commentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#deleteComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |

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
| **204** | Success. The comment has been deleted. |  -  |


## getComment

> Comment getComment(problemId, commentId)

Gets the specified comment on a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        try {
            Comment result = apiInstance.getComment(problemId, commentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |

### Return type

[**Comment**](Comment.md)


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

> ApiResponse<Comment> getComment getCommentWithHttpInfo(problemId, commentId)

Gets the specified comment on a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        try {
            ApiResponse<Comment> response = apiInstance.getCommentWithHttpInfo(problemId, commentId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |

### Return type

ApiResponse<[**Comment**](Comment.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getComments

> CommentsList getComments(problemId, nextPageKey, pageSize)

Gets all comments on the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.  
        Long pageSize = 56L; // Long | The amount of comments in a single response payload.   The maximal allowed page size is 500.   If not set, 10 is used.
        try {
            CommentsList result = apiInstance.getComments(problemId, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getComments");
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
| **problemId** | **String**| The ID of the required problem. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.   | [optional] |
| **pageSize** | **Long**| The amount of comments in a single response payload.   The maximal allowed page size is 500.   If not set, 10 is used. | [optional] |

### Return type

[**CommentsList**](CommentsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getCommentsWithHttpInfo

> ApiResponse<CommentsList> getComments getCommentsWithHttpInfo(problemId, nextPageKey, pageSize)

Gets all comments on the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.  
        Long pageSize = 56L; // Long | The amount of comments in a single response payload.   The maximal allowed page size is 500.   If not set, 10 is used.
        try {
            ApiResponse<CommentsList> response = apiInstance.getCommentsWithHttpInfo(problemId, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getComments");
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
| **problemId** | **String**| The ID of the required problem. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.   | [optional] |
| **pageSize** | **Long**| The amount of comments in a single response payload.   The maximal allowed page size is 500.   If not set, 10 is used. | [optional] |

### Return type

ApiResponse<[**CommentsList**](CommentsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getProblem

> Problem getProblem(problemId, fields)

Gets the properties of the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String fields = "fields_example"; // String | A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can't remove them from the response):   * `evidenceDetails`: The details of the root cause. * `impactAnalysis`: The impact analysis of the problem on other entities/users. * `recentComments`: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, `evidenceDetails,impactAnalysis`).
        try {
            Problem result = apiInstance.getProblem(problemId, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getProblem");
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
| **problemId** | **String**| The ID of the required problem. | |
| **fields** | **String**| A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can&#39;t remove them from the response):   * &#x60;evidenceDetails&#x60;: The details of the root cause. * &#x60;impactAnalysis&#x60;: The impact analysis of the problem on other entities/users. * &#x60;recentComments&#x60;: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, &#x60;evidenceDetails,impactAnalysis&#x60;). | [optional] |

### Return type

[**Problem**](Problem.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getProblemWithHttpInfo

> ApiResponse<Problem> getProblem getProblemWithHttpInfo(problemId, fields)

Gets the properties of the specified problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String fields = "fields_example"; // String | A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can't remove them from the response):   * `evidenceDetails`: The details of the root cause. * `impactAnalysis`: The impact analysis of the problem on other entities/users. * `recentComments`: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, `evidenceDetails,impactAnalysis`).
        try {
            ApiResponse<Problem> response = apiInstance.getProblemWithHttpInfo(problemId, fields);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getProblem");
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
| **problemId** | **String**| The ID of the required problem. | |
| **fields** | **String**| A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can&#39;t remove them from the response):   * &#x60;evidenceDetails&#x60;: The details of the root cause. * &#x60;impactAnalysis&#x60;: The impact analysis of the problem on other entities/users. * &#x60;recentComments&#x60;: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, &#x60;evidenceDetails,impactAnalysis&#x60;). | [optional] |

### Return type

ApiResponse<[**Problem**](Problem.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getProblems

> Problems getProblems(fields, nextPageKey, pageSize, from, to, problemSelector, entitySelector, sort)

Lists problems observed within the specified timeframe

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String fields = "fields_example"; // String | A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can't remove them from the response):   * `evidenceDetails`: The details of the root cause. * `impactAnalysis`: The impact analysis of the problem on other entities/users. * `recentComments`: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, `evidenceDetails,impactAnalysis`).   The field is valid only for the current page of results. You must set it for each page you're requesting.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.  
        Long pageSize = 56L; // Long | The amount of problems in a single response payload.   The maximal allowed page size is 500.   If not set, 50 is used.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String problemSelector = "problemSelector_example"; // String | Defines the scope of the query. Only problems matching the specified criteria are included into response.   You can add one or several of the criteria listed below. For each criterion you can specify multiple comma-separated values, unless stated otherwise. If several values are specified, the **OR** logic applies. All values must be quoted.  * Status: `status(\"open\")` or `status(\"closed\")`. You can specify only one status.  * Severity level: `severityLevel(\"level-1\",\"level-2\")`. Find the possible values in the description of the **severityLevel** field of the response. * Impact level: `impactLevel(\"level-11\",\"level-2\")` Find the possible values in the description of the **impactLevel** field of the response. * Root cause entity: `rootCauseEntity(\"id-1\", \"id-2\")`.  * Management zone ID: `managementZoneIds(\"mZId-1\", \"mzId-2\")`.  * Management zone name: `managementZones(\"value-1\",\"value-2\")`.  * Impacted entities: `impactedEntities(\"id-1\", \"id-2\")`.  * Affected entities: `affectedEntities(\"id-1\", \"id-2\")`.  * Type of affected entities: `affectedEntityTypes(\"value-1\",\"value-2\")`.  * Problem ID: `problemId(\"id-1\", \"id-2\")`.  * Alerting profile ID: `problemFilterIds(\"id-1\", \"id-2\")`.  * Alerting profile name (contains, case-insensitive): `problemFilterNames(\"value-1\",\"value-2\")`.  * Alerting profile name (exact match, case-insensitive): `problemFilterNames.equals(\"value-1\",\"value-2\")`.  * Entity tags: `entityTags(\"[context]key:value\",\"key:value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. If a value-only tag has a colon (`:`) in it, you must escape the colon with a backslash(`\\`). Otherwise, the tag will be parsed as a `key:value tag`. All tag values are case-sensitive. * Display ID of the problem: `displayId(\"id-1\", \"id-2\")`.  * Under maintenance: `underMaintenance(true|false)`. Shows (true) or hides (false) all problems created during maintenance mode. * Text search: `text(\"value\")`. Text search on the following fields: problem title, event titles, displayId and the id of affected and impacted entities. The text search is case insensitive, partial matching and based on a relevance score. Therefore the `relevance` sort option should be used to get the most relevant problems first. The special characters `~` and `\"` need to be escaped using a `~` (e.g. double quote search `text(\"~\"\")`). The search value is limited to 30 characters.  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.   
        String entitySelector = "entitySelector_example"; // String | The entity scope of the query. You must set one of these criteria:   * Entity type: `type(\"TYPE\")`  * Dynatrace entity ID: `entityId(\"id\")`. You can specify several IDs, separated by a comma (`entityId(\"id-1\",\"id-2\")`). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the `EQUALS` operator is used unless otherwise specified.   * Tag: `tag(\"value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. Any colons (`:`) that are part of the key or value must be escaped with a backslash(`\\`), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: `mzId(123)`  * Management zone name: `mzName(\"value\")` * Entity name:   * `entityName.equals`: performs a non-casesensitive `EQUALS` query.   * `entityName.startsWith`: changes the operator to `BEGINS WITH`.   * `entityName.in`: enables you to provide multiple values. The `EQUALS` operator applies.   * `caseSensitive(entityName.equals(\"value\"))`: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): `healthState(\"HEALTHY\")` * First seen timestamp: `firstSeenTms.<operator>(now-3h)`. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * `lte`: earlier than or at the specified time  * `lt`: earlier than the specified time  * `gte`: later than or at the specified time  * `gt`: later than the specified time * Entity attribute: `<attribute>(\"value1\",\"value2\")` and `<attribute>.exists()`. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: `fromRelationships.<relationshipName>()` and `toRelationships.<relationshipName>()`. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: `not(<criterion>)`. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (`,`). For example, `type(\"HOST\"),healthState(\"HEALTHY\")`. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   The maximum number of entities that may be selected is limited to 10000.  
        String sort = "sort_example"; // String | Specifies a set of comma-separated (`,`) fields for sorting in the problem list.  You can sort by the following properties with a sign prefix for the sorting order.    * `status`: problem status (`+` open problems first or `-` closed problems first)  * `startTime`: problem start time (`+` old problems first or `-` new problems first)   * `relevance`: problem relevance (`+` least relevant problems first or `-` most relevant problems first) - can be used only in combination with text search   If no prefix is set, `+` is used.   You can specify several levels of sorting. For example, `+status,-startTime` sorts problems by status, open problems first. Within the status, problems are sorted by start time, oldest first.
        try {
            Problems result = apiInstance.getProblems(fields, nextPageKey, pageSize, from, to, problemSelector, entitySelector, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getProblems");
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
| **fields** | **String**| A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can&#39;t remove them from the response):   * &#x60;evidenceDetails&#x60;: The details of the root cause. * &#x60;impactAnalysis&#x60;: The impact analysis of the problem on other entities/users. * &#x60;recentComments&#x60;: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, &#x60;evidenceDetails,impactAnalysis&#x60;).   The field is valid only for the current page of results. You must set it for each page you&#39;re requesting. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.   | [optional] |
| **pageSize** | **Long**| The amount of problems in a single response payload.   The maximal allowed page size is 500.   If not set, 50 is used. | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **problemSelector** | **String**| Defines the scope of the query. Only problems matching the specified criteria are included into response.   You can add one or several of the criteria listed below. For each criterion you can specify multiple comma-separated values, unless stated otherwise. If several values are specified, the **OR** logic applies. All values must be quoted.  * Status: &#x60;status(\&quot;open\&quot;)&#x60; or &#x60;status(\&quot;closed\&quot;)&#x60;. You can specify only one status.  * Severity level: &#x60;severityLevel(\&quot;level-1\&quot;,\&quot;level-2\&quot;)&#x60;. Find the possible values in the description of the **severityLevel** field of the response. * Impact level: &#x60;impactLevel(\&quot;level-11\&quot;,\&quot;level-2\&quot;)&#x60; Find the possible values in the description of the **impactLevel** field of the response. * Root cause entity: &#x60;rootCauseEntity(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Management zone ID: &#x60;managementZoneIds(\&quot;mZId-1\&quot;, \&quot;mzId-2\&quot;)&#x60;.  * Management zone name: &#x60;managementZones(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Impacted entities: &#x60;impactedEntities(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Affected entities: &#x60;affectedEntities(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Type of affected entities: &#x60;affectedEntityTypes(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Problem ID: &#x60;problemId(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Alerting profile ID: &#x60;problemFilterIds(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Alerting profile name (contains, case-insensitive): &#x60;problemFilterNames(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Alerting profile name (exact match, case-insensitive): &#x60;problemFilterNames.equals(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Entity tags: &#x60;entityTags(\&quot;[context]key:value\&quot;,\&quot;key:value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. If a value-only tag has a colon (&#x60;:&#x60;) in it, you must escape the colon with a backslash(&#x60;\\&#x60;). Otherwise, the tag will be parsed as a &#x60;key:value tag&#x60;. All tag values are case-sensitive. * Display ID of the problem: &#x60;displayId(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Under maintenance: &#x60;underMaintenance(true|false)&#x60;. Shows (true) or hides (false) all problems created during maintenance mode. * Text search: &#x60;text(\&quot;value\&quot;)&#x60;. Text search on the following fields: problem title, event titles, displayId and the id of affected and impacted entities. The text search is case insensitive, partial matching and based on a relevance score. Therefore the &#x60;relevance&#x60; sort option should be used to get the most relevant problems first. The special characters &#x60;~&#x60; and &#x60;\&quot;&#x60; need to be escaped using a &#x60;~&#x60; (e.g. double quote search &#x60;text(\&quot;~\&quot;\&quot;)&#x60;). The search value is limited to 30 characters.  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.    | [optional] |
| **entitySelector** | **String**| The entity scope of the query. You must set one of these criteria:   * Entity type: &#x60;type(\&quot;TYPE\&quot;)&#x60;  * Dynatrace entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. You can specify several IDs, separated by a comma (&#x60;entityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.   * Tag: &#x60;tag(\&quot;value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. Any colons (&#x60;:&#x60;) that are part of the key or value must be escaped with a backslash(&#x60;\\&#x60;), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: &#x60;mzId(123)&#x60;  * Management zone name: &#x60;mzName(\&quot;value\&quot;)&#x60; * Entity name:   * &#x60;entityName.equals&#x60;: performs a non-casesensitive &#x60;EQUALS&#x60; query.   * &#x60;entityName.startsWith&#x60;: changes the operator to &#x60;BEGINS WITH&#x60;.   * &#x60;entityName.in&#x60;: enables you to provide multiple values. The &#x60;EQUALS&#x60; operator applies.   * &#x60;caseSensitive(entityName.equals(\&quot;value\&quot;))&#x60;: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): &#x60;healthState(\&quot;HEALTHY\&quot;)&#x60; * First seen timestamp: &#x60;firstSeenTms.&lt;operator&gt;(now-3h)&#x60;. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * &#x60;lte&#x60;: earlier than or at the specified time  * &#x60;lt&#x60;: earlier than the specified time  * &#x60;gte&#x60;: later than or at the specified time  * &#x60;gt&#x60;: later than the specified time * Entity attribute: &#x60;&lt;attribute&gt;(\&quot;value1\&quot;,\&quot;value2\&quot;)&#x60; and &#x60;&lt;attribute&gt;.exists()&#x60;. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: &#x60;fromRelationships.&lt;relationshipName&gt;()&#x60; and &#x60;toRelationships.&lt;relationshipName&gt;()&#x60;. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: &#x60;not(&lt;criterion&gt;)&#x60;. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;type(\&quot;HOST\&quot;),healthState(\&quot;HEALTHY\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   The maximum number of entities that may be selected is limited to 10000.   | [optional] |
| **sort** | **String**| Specifies a set of comma-separated (&#x60;,&#x60;) fields for sorting in the problem list.  You can sort by the following properties with a sign prefix for the sorting order.    * &#x60;status&#x60;: problem status (&#x60;+&#x60; open problems first or &#x60;-&#x60; closed problems first)  * &#x60;startTime&#x60;: problem start time (&#x60;+&#x60; old problems first or &#x60;-&#x60; new problems first)   * &#x60;relevance&#x60;: problem relevance (&#x60;+&#x60; least relevant problems first or &#x60;-&#x60; most relevant problems first) - can be used only in combination with text search   If no prefix is set, &#x60;+&#x60; is used.   You can specify several levels of sorting. For example, &#x60;+status,-startTime&#x60; sorts problems by status, open problems first. Within the status, problems are sorted by start time, oldest first. | [optional] |

### Return type

[**Problems**](Problems.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getProblemsWithHttpInfo

> ApiResponse<Problems> getProblems getProblemsWithHttpInfo(fields, nextPageKey, pageSize, from, to, problemSelector, entitySelector, sort)

Lists problems observed within the specified timeframe

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String fields = "fields_example"; // String | A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can't remove them from the response):   * `evidenceDetails`: The details of the root cause. * `impactAnalysis`: The impact analysis of the problem on other entities/users. * `recentComments`: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, `evidenceDetails,impactAnalysis`).   The field is valid only for the current page of results. You must set it for each page you're requesting.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.  
        Long pageSize = 56L; // Long | The amount of problems in a single response payload.   The maximal allowed page size is 500.   If not set, 50 is used.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String problemSelector = "problemSelector_example"; // String | Defines the scope of the query. Only problems matching the specified criteria are included into response.   You can add one or several of the criteria listed below. For each criterion you can specify multiple comma-separated values, unless stated otherwise. If several values are specified, the **OR** logic applies. All values must be quoted.  * Status: `status(\"open\")` or `status(\"closed\")`. You can specify only one status.  * Severity level: `severityLevel(\"level-1\",\"level-2\")`. Find the possible values in the description of the **severityLevel** field of the response. * Impact level: `impactLevel(\"level-11\",\"level-2\")` Find the possible values in the description of the **impactLevel** field of the response. * Root cause entity: `rootCauseEntity(\"id-1\", \"id-2\")`.  * Management zone ID: `managementZoneIds(\"mZId-1\", \"mzId-2\")`.  * Management zone name: `managementZones(\"value-1\",\"value-2\")`.  * Impacted entities: `impactedEntities(\"id-1\", \"id-2\")`.  * Affected entities: `affectedEntities(\"id-1\", \"id-2\")`.  * Type of affected entities: `affectedEntityTypes(\"value-1\",\"value-2\")`.  * Problem ID: `problemId(\"id-1\", \"id-2\")`.  * Alerting profile ID: `problemFilterIds(\"id-1\", \"id-2\")`.  * Alerting profile name (contains, case-insensitive): `problemFilterNames(\"value-1\",\"value-2\")`.  * Alerting profile name (exact match, case-insensitive): `problemFilterNames.equals(\"value-1\",\"value-2\")`.  * Entity tags: `entityTags(\"[context]key:value\",\"key:value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. If a value-only tag has a colon (`:`) in it, you must escape the colon with a backslash(`\\`). Otherwise, the tag will be parsed as a `key:value tag`. All tag values are case-sensitive. * Display ID of the problem: `displayId(\"id-1\", \"id-2\")`.  * Under maintenance: `underMaintenance(true|false)`. Shows (true) or hides (false) all problems created during maintenance mode. * Text search: `text(\"value\")`. Text search on the following fields: problem title, event titles, displayId and the id of affected and impacted entities. The text search is case insensitive, partial matching and based on a relevance score. Therefore the `relevance` sort option should be used to get the most relevant problems first. The special characters `~` and `\"` need to be escaped using a `~` (e.g. double quote search `text(\"~\"\")`). The search value is limited to 30 characters.  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.   
        String entitySelector = "entitySelector_example"; // String | The entity scope of the query. You must set one of these criteria:   * Entity type: `type(\"TYPE\")`  * Dynatrace entity ID: `entityId(\"id\")`. You can specify several IDs, separated by a comma (`entityId(\"id-1\",\"id-2\")`). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the `EQUALS` operator is used unless otherwise specified.   * Tag: `tag(\"value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. Any colons (`:`) that are part of the key or value must be escaped with a backslash(`\\`), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: `mzId(123)`  * Management zone name: `mzName(\"value\")` * Entity name:   * `entityName.equals`: performs a non-casesensitive `EQUALS` query.   * `entityName.startsWith`: changes the operator to `BEGINS WITH`.   * `entityName.in`: enables you to provide multiple values. The `EQUALS` operator applies.   * `caseSensitive(entityName.equals(\"value\"))`: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): `healthState(\"HEALTHY\")` * First seen timestamp: `firstSeenTms.<operator>(now-3h)`. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * `lte`: earlier than or at the specified time  * `lt`: earlier than the specified time  * `gte`: later than or at the specified time  * `gt`: later than the specified time * Entity attribute: `<attribute>(\"value1\",\"value2\")` and `<attribute>.exists()`. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: `fromRelationships.<relationshipName>()` and `toRelationships.<relationshipName>()`. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: `not(<criterion>)`. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (`,`). For example, `type(\"HOST\"),healthState(\"HEALTHY\")`. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   The maximum number of entities that may be selected is limited to 10000.  
        String sort = "sort_example"; // String | Specifies a set of comma-separated (`,`) fields for sorting in the problem list.  You can sort by the following properties with a sign prefix for the sorting order.    * `status`: problem status (`+` open problems first or `-` closed problems first)  * `startTime`: problem start time (`+` old problems first or `-` new problems first)   * `relevance`: problem relevance (`+` least relevant problems first or `-` most relevant problems first) - can be used only in combination with text search   If no prefix is set, `+` is used.   You can specify several levels of sorting. For example, `+status,-startTime` sorts problems by status, open problems first. Within the status, problems are sorted by start time, oldest first.
        try {
            ApiResponse<Problems> response = apiInstance.getProblemsWithHttpInfo(fields, nextPageKey, pageSize, from, to, problemSelector, entitySelector, sort);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#getProblems");
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
| **fields** | **String**| A list of additional problem properties you can add to the response.   The following properties are available (all other properties are always included and you can&#39;t remove them from the response):   * &#x60;evidenceDetails&#x60;: The details of the root cause. * &#x60;impactAnalysis&#x60;: The impact analysis of the problem on other entities/users. * &#x60;recentComments&#x60;: A list of the most recent comments to the problem.  To add properties, specify them as a comma-separated list (for example, &#x60;evidenceDetails,impactAnalysis&#x60;).   The field is valid only for the current page of results. You must set it for each page you&#39;re requesting. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters except the optional **fields** parameter.   | [optional] |
| **pageSize** | **Long**| The amount of problems in a single response payload.   The maximal allowed page size is 500.   If not set, 50 is used. | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **problemSelector** | **String**| Defines the scope of the query. Only problems matching the specified criteria are included into response.   You can add one or several of the criteria listed below. For each criterion you can specify multiple comma-separated values, unless stated otherwise. If several values are specified, the **OR** logic applies. All values must be quoted.  * Status: &#x60;status(\&quot;open\&quot;)&#x60; or &#x60;status(\&quot;closed\&quot;)&#x60;. You can specify only one status.  * Severity level: &#x60;severityLevel(\&quot;level-1\&quot;,\&quot;level-2\&quot;)&#x60;. Find the possible values in the description of the **severityLevel** field of the response. * Impact level: &#x60;impactLevel(\&quot;level-11\&quot;,\&quot;level-2\&quot;)&#x60; Find the possible values in the description of the **impactLevel** field of the response. * Root cause entity: &#x60;rootCauseEntity(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Management zone ID: &#x60;managementZoneIds(\&quot;mZId-1\&quot;, \&quot;mzId-2\&quot;)&#x60;.  * Management zone name: &#x60;managementZones(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Impacted entities: &#x60;impactedEntities(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Affected entities: &#x60;affectedEntities(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Type of affected entities: &#x60;affectedEntityTypes(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Problem ID: &#x60;problemId(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Alerting profile ID: &#x60;problemFilterIds(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Alerting profile name (contains, case-insensitive): &#x60;problemFilterNames(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Alerting profile name (exact match, case-insensitive): &#x60;problemFilterNames.equals(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60;.  * Entity tags: &#x60;entityTags(\&quot;[context]key:value\&quot;,\&quot;key:value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. If a value-only tag has a colon (&#x60;:&#x60;) in it, you must escape the colon with a backslash(&#x60;\\&#x60;). Otherwise, the tag will be parsed as a &#x60;key:value tag&#x60;. All tag values are case-sensitive. * Display ID of the problem: &#x60;displayId(\&quot;id-1\&quot;, \&quot;id-2\&quot;)&#x60;.  * Under maintenance: &#x60;underMaintenance(true|false)&#x60;. Shows (true) or hides (false) all problems created during maintenance mode. * Text search: &#x60;text(\&quot;value\&quot;)&#x60;. Text search on the following fields: problem title, event titles, displayId and the id of affected and impacted entities. The text search is case insensitive, partial matching and based on a relevance score. Therefore the &#x60;relevance&#x60; sort option should be used to get the most relevant problems first. The special characters &#x60;~&#x60; and &#x60;\&quot;&#x60; need to be escaped using a &#x60;~&#x60; (e.g. double quote search &#x60;text(\&quot;~\&quot;\&quot;)&#x60;). The search value is limited to 30 characters.  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.    | [optional] |
| **entitySelector** | **String**| The entity scope of the query. You must set one of these criteria:   * Entity type: &#x60;type(\&quot;TYPE\&quot;)&#x60;  * Dynatrace entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. You can specify several IDs, separated by a comma (&#x60;entityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.   * Tag: &#x60;tag(\&quot;value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. Any colons (&#x60;:&#x60;) that are part of the key or value must be escaped with a backslash(&#x60;\\&#x60;), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: &#x60;mzId(123)&#x60;  * Management zone name: &#x60;mzName(\&quot;value\&quot;)&#x60; * Entity name:   * &#x60;entityName.equals&#x60;: performs a non-casesensitive &#x60;EQUALS&#x60; query.   * &#x60;entityName.startsWith&#x60;: changes the operator to &#x60;BEGINS WITH&#x60;.   * &#x60;entityName.in&#x60;: enables you to provide multiple values. The &#x60;EQUALS&#x60; operator applies.   * &#x60;caseSensitive(entityName.equals(\&quot;value\&quot;))&#x60;: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): &#x60;healthState(\&quot;HEALTHY\&quot;)&#x60; * First seen timestamp: &#x60;firstSeenTms.&lt;operator&gt;(now-3h)&#x60;. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * &#x60;lte&#x60;: earlier than or at the specified time  * &#x60;lt&#x60;: earlier than the specified time  * &#x60;gte&#x60;: later than or at the specified time  * &#x60;gt&#x60;: later than the specified time * Entity attribute: &#x60;&lt;attribute&gt;(\&quot;value1\&quot;,\&quot;value2\&quot;)&#x60; and &#x60;&lt;attribute&gt;.exists()&#x60;. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: &#x60;fromRelationships.&lt;relationshipName&gt;()&#x60; and &#x60;toRelationships.&lt;relationshipName&gt;()&#x60;. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: &#x60;not(&lt;criterion&gt;)&#x60;. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;type(\&quot;HOST\&quot;),healthState(\&quot;HEALTHY\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   The maximum number of entities that may be selected is limited to 10000.   | [optional] |
| **sort** | **String**| Specifies a set of comma-separated (&#x60;,&#x60;) fields for sorting in the problem list.  You can sort by the following properties with a sign prefix for the sorting order.    * &#x60;status&#x60;: problem status (&#x60;+&#x60; open problems first or &#x60;-&#x60; closed problems first)  * &#x60;startTime&#x60;: problem start time (&#x60;+&#x60; old problems first or &#x60;-&#x60; new problems first)   * &#x60;relevance&#x60;: problem relevance (&#x60;+&#x60; least relevant problems first or &#x60;-&#x60; most relevant problems first) - can be used only in combination with text search   If no prefix is set, &#x60;+&#x60; is used.   You can specify several levels of sorting. For example, &#x60;+status,-startTime&#x60; sorts problems by status, open problems first. Within the status, problems are sorted by start time, oldest first. | [optional] |

### Return type

ApiResponse<[**Problems**](Problems.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateComment

> void updateComment(problemId, commentId, commentRequestDtoImpl)

Updates the specified comment on a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        CommentRequestDtoImpl commentRequestDtoImpl = new CommentRequestDtoImpl(); // CommentRequestDtoImpl | The JSON body of the request. Contains the updated comment.
        try {
            apiInstance.updateComment(problemId, commentId, commentRequestDtoImpl);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#updateComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |
| **commentRequestDtoImpl** | [**CommentRequestDtoImpl**](CommentRequestDtoImpl.md)| The JSON body of the request. Contains the updated comment. | [optional] |

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
| **204** | Success. The comment has been updated. |  -  |

## updateCommentWithHttpInfo

> ApiResponse<Void> updateComment updateCommentWithHttpInfo(problemId, commentId, commentRequestDtoImpl)

Updates the specified comment on a problem

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ProblemsApi apiInstance = new ProblemsApi(defaultClient);
        String problemId = "problemId_example"; // String | The ID of the required problem.
        String commentId = "commentId_example"; // String | The ID of the required comment.
        CommentRequestDtoImpl commentRequestDtoImpl = new CommentRequestDtoImpl(); // CommentRequestDtoImpl | The JSON body of the request. Contains the updated comment.
        try {
            ApiResponse<Void> response = apiInstance.updateCommentWithHttpInfo(problemId, commentId, commentRequestDtoImpl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProblemsApi#updateComment");
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
| **problemId** | **String**| The ID of the required problem. | |
| **commentId** | **String**| The ID of the required comment. | |
| **commentRequestDtoImpl** | [**CommentRequestDtoImpl**](CommentRequestDtoImpl.md)| The JSON body of the request. Contains the updated comment. | [optional] |

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
| **204** | Success. The comment has been updated. |  -  |

