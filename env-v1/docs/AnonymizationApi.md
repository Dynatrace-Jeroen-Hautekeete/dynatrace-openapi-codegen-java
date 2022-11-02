# AnonymizationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**anonymize**](AnonymizationApi.md#anonymize) | **PUT** /anonymize/anonymizationJobs | Creates user session anonymization job |
| [**anonymizeWithHttpInfo**](AnonymizationApi.md#anonymizeWithHttpInfo) | **PUT** /anonymize/anonymizationJobs | Creates user session anonymization job |
| [**getStatus**](AnonymizationApi.md#getStatus) | **GET** /anonymize/anonymizationJobs/{requestId} | Shows the progress of the specified anonymization job |
| [**getStatusWithHttpInfo**](AnonymizationApi.md#getStatusWithHttpInfo) | **GET** /anonymize/anonymizationJobs/{requestId} | Shows the progress of the specified anonymization job |



## anonymize

> AnonymizationIdResult anonymize(startTimestamp, endTimestamp, userIds, ips, additionalField)

Creates user session anonymization job

The job anonymizes all user sessions in the specified timeframe by masking the specified fields.   To identify user sessions to be anonymized you can specify either userID, or IP address, or both. If you specify both the **OR** logic applies.   You can&#39;t undo the anonymization.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.AnonymizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnonymizationApi apiInstance = new AnonymizationApi(defaultClient);
        Long startTimestamp = 0L; // Long | The start timestamp of the user session to anonymize, in UTC milliseconds.   If not set the earliest available time is used.
        Long endTimestamp = 0L; // Long | The end timestamp of the user session to anonymize, in UTC milliseconds.   If not set the current time is used.
        List<String> userIds = Arrays.asList(); // List<String> | The UserID of the user to anonymize.    You can specify several IDs, in the following format: `userIds=user1&userIds=user2`.
        List<String> ips = Arrays.asList(); // List<String> | The IP address of the user to anonymize. All user sessions from this IP will be anonymized.   You can specify several IPs, in the following format: `ips=ip1&ips=ip2`.
        List<String> additionalField = Arrays.asList(); // List<String> | A list of fields to be anonymized.   You can specify several fields, in the following format: `additionalField=field1&additionalField=field2`.
        try {
            AnonymizationIdResult result = apiInstance.anonymize(startTimestamp, endTimestamp, userIds, ips, additionalField);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymizationApi#anonymize");
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
| **startTimestamp** | **Long**| The start timestamp of the user session to anonymize, in UTC milliseconds.   If not set the earliest available time is used. | [optional] [default to 0] |
| **endTimestamp** | **Long**| The end timestamp of the user session to anonymize, in UTC milliseconds.   If not set the current time is used. | [optional] [default to 0] |
| **userIds** | [**List&lt;String&gt;**](String.md)| The UserID of the user to anonymize.    You can specify several IDs, in the following format: &#x60;userIds&#x3D;user1&amp;userIds&#x3D;user2&#x60;. | [optional] |
| **ips** | [**List&lt;String&gt;**](String.md)| The IP address of the user to anonymize. All user sessions from this IP will be anonymized.   You can specify several IPs, in the following format: &#x60;ips&#x3D;ip1&amp;ips&#x3D;ip2&#x60;. | [optional] |
| **additionalField** | [**List&lt;String&gt;**](String.md)| A list of fields to be anonymized.   You can specify several fields, in the following format: &#x60;additionalField&#x3D;field1&amp;additionalField&#x3D;field2&#x60;. | [optional] [enum: ip, content, country, region, city, userId, isp, stringProperties, longProperties, doubleProperties, dateProperties, carrier, userActions.name, userActions.domain, userActions.targetUrl, userActions.syntheticEvent, userActions.stringProperties, userActions.longProperties, userActions.doubleProperties, userActions.dateProperties, events.name, events.domain, events.page, events.pageGroup, events.pageReferrer, events.pageReferrerGroup] |

### Return type

[**AnonymizationIdResult**](AnonymizationIdResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains the ID of the anonymization job. You can use the ID to check the job status. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |

## anonymizeWithHttpInfo

> ApiResponse<AnonymizationIdResult> anonymize anonymizeWithHttpInfo(startTimestamp, endTimestamp, userIds, ips, additionalField)

Creates user session anonymization job

The job anonymizes all user sessions in the specified timeframe by masking the specified fields.   To identify user sessions to be anonymized you can specify either userID, or IP address, or both. If you specify both the **OR** logic applies.   You can&#39;t undo the anonymization.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.AnonymizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnonymizationApi apiInstance = new AnonymizationApi(defaultClient);
        Long startTimestamp = 0L; // Long | The start timestamp of the user session to anonymize, in UTC milliseconds.   If not set the earliest available time is used.
        Long endTimestamp = 0L; // Long | The end timestamp of the user session to anonymize, in UTC milliseconds.   If not set the current time is used.
        List<String> userIds = Arrays.asList(); // List<String> | The UserID of the user to anonymize.    You can specify several IDs, in the following format: `userIds=user1&userIds=user2`.
        List<String> ips = Arrays.asList(); // List<String> | The IP address of the user to anonymize. All user sessions from this IP will be anonymized.   You can specify several IPs, in the following format: `ips=ip1&ips=ip2`.
        List<String> additionalField = Arrays.asList(); // List<String> | A list of fields to be anonymized.   You can specify several fields, in the following format: `additionalField=field1&additionalField=field2`.
        try {
            ApiResponse<AnonymizationIdResult> response = apiInstance.anonymizeWithHttpInfo(startTimestamp, endTimestamp, userIds, ips, additionalField);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymizationApi#anonymize");
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
| **startTimestamp** | **Long**| The start timestamp of the user session to anonymize, in UTC milliseconds.   If not set the earliest available time is used. | [optional] [default to 0] |
| **endTimestamp** | **Long**| The end timestamp of the user session to anonymize, in UTC milliseconds.   If not set the current time is used. | [optional] [default to 0] |
| **userIds** | [**List&lt;String&gt;**](String.md)| The UserID of the user to anonymize.    You can specify several IDs, in the following format: &#x60;userIds&#x3D;user1&amp;userIds&#x3D;user2&#x60;. | [optional] |
| **ips** | [**List&lt;String&gt;**](String.md)| The IP address of the user to anonymize. All user sessions from this IP will be anonymized.   You can specify several IPs, in the following format: &#x60;ips&#x3D;ip1&amp;ips&#x3D;ip2&#x60;. | [optional] |
| **additionalField** | [**List&lt;String&gt;**](String.md)| A list of fields to be anonymized.   You can specify several fields, in the following format: &#x60;additionalField&#x3D;field1&amp;additionalField&#x3D;field2&#x60;. | [optional] [enum: ip, content, country, region, city, userId, isp, stringProperties, longProperties, doubleProperties, dateProperties, carrier, userActions.name, userActions.domain, userActions.targetUrl, userActions.syntheticEvent, userActions.stringProperties, userActions.longProperties, userActions.doubleProperties, userActions.dateProperties, events.name, events.domain, events.page, events.pageGroup, events.pageReferrer, events.pageReferrerGroup] |

### Return type

ApiResponse<[**AnonymizationIdResult**](AnonymizationIdResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains the ID of the anonymization job. You can use the ID to check the job status. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |


## getStatus

> AnonymizationProgressResult getStatus(requestId)

Shows the progress of the specified anonymization job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.AnonymizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnonymizationApi apiInstance = new AnonymizationApi(defaultClient);
        String requestId = "requestId_example"; // String | The ID of the required anonymization job.
        try {
            AnonymizationProgressResult result = apiInstance.getStatus(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymizationApi#getStatus");
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
| **requestId** | **String**| The ID of the required anonymization job. | |

### Return type

[**AnonymizationProgressResult**](AnonymizationProgressResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains the status of the anonymization job. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |

## getStatusWithHttpInfo

> ApiResponse<AnonymizationProgressResult> getStatus getStatusWithHttpInfo(requestId)

Shows the progress of the specified anonymization job

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.AnonymizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnonymizationApi apiInstance = new AnonymizationApi(defaultClient);
        String requestId = "requestId_example"; // String | The ID of the required anonymization job.
        try {
            ApiResponse<AnonymizationProgressResult> response = apiInstance.getStatusWithHttpInfo(requestId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnonymizationApi#getStatus");
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
| **requestId** | **String**| The ID of the required anonymization job. | |

### Return type

ApiResponse<[**AnonymizationProgressResult**](AnonymizationProgressResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains the status of the anonymization job. |  -  |
| **400** | Failed. The input is invalid. See the response body for details. |  -  |

