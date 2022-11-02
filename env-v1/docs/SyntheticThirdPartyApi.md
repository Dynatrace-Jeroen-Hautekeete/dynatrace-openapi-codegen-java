# SyntheticThirdPartyApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pushEvents**](SyntheticThirdPartyApi.md#pushEvents) | **POST** /synthetic/ext/events | Pushes third-party synthetic events to Dynatrace |
| [**pushEventsWithHttpInfo**](SyntheticThirdPartyApi.md#pushEventsWithHttpInfo) | **POST** /synthetic/ext/events | Pushes third-party synthetic events to Dynatrace |
| [**pushStateModification**](SyntheticThirdPartyApi.md#pushStateModification) | **POST** /synthetic/ext/stateModifications | Modifies the operation state of all third-party monitors |
| [**pushStateModificationWithHttpInfo**](SyntheticThirdPartyApi.md#pushStateModificationWithHttpInfo) | **POST** /synthetic/ext/stateModifications | Modifies the operation state of all third-party monitors |
| [**testResults**](SyntheticThirdPartyApi.md#testResults) | **POST** /synthetic/ext/tests | Pushes third-party synthetic monitors, locations, and results to Dynatrace |
| [**testResultsWithHttpInfo**](SyntheticThirdPartyApi.md#testResultsWithHttpInfo) | **POST** /synthetic/ext/tests | Pushes third-party synthetic monitors, locations, and results to Dynatrace |



## pushEvents

> void pushEvents(model3rdPartySyntheticEvents)

Pushes third-party synthetic events to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        Model3rdPartySyntheticEvents model3rdPartySyntheticEvents = new Model3rdPartySyntheticEvents(); // Model3rdPartySyntheticEvents | The JSON body of the request. Contains third-party synthetic events.
        try {
            apiInstance.pushEvents(model3rdPartySyntheticEvents);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#pushEvents");
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
| **model3rdPartySyntheticEvents** | [**Model3rdPartySyntheticEvents**](Model3rdPartySyntheticEvents.md)| The JSON body of the request. Contains third-party synthetic events. | |

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
| **204** | Success. The information is accepted and stored. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## pushEventsWithHttpInfo

> ApiResponse<Void> pushEvents pushEventsWithHttpInfo(model3rdPartySyntheticEvents)

Pushes third-party synthetic events to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        Model3rdPartySyntheticEvents model3rdPartySyntheticEvents = new Model3rdPartySyntheticEvents(); // Model3rdPartySyntheticEvents | The JSON body of the request. Contains third-party synthetic events.
        try {
            ApiResponse<Void> response = apiInstance.pushEventsWithHttpInfo(model3rdPartySyntheticEvents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#pushEvents");
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
| **model3rdPartySyntheticEvents** | [**Model3rdPartySyntheticEvents**](Model3rdPartySyntheticEvents.md)| The JSON body of the request. Contains third-party synthetic events. | |

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
| **204** | Success. The information is accepted and stored. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## pushStateModification

> void pushStateModification(stateModification)

Modifies the operation state of all third-party monitors

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        StateModification stateModification = new StateModification(); // StateModification | The JSON body of the request. Contains new operational status of third-party synthetic monitors.
        try {
            apiInstance.pushStateModification(stateModification);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#pushStateModification");
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
| **stateModification** | [**StateModification**](StateModification.md)| The JSON body of the request. Contains new operational status of third-party synthetic monitors. | |

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
| **204** | Success. The state of third-party monitors has been changed. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## pushStateModificationWithHttpInfo

> ApiResponse<Void> pushStateModification pushStateModificationWithHttpInfo(stateModification)

Modifies the operation state of all third-party monitors

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        StateModification stateModification = new StateModification(); // StateModification | The JSON body of the request. Contains new operational status of third-party synthetic monitors.
        try {
            ApiResponse<Void> response = apiInstance.pushStateModificationWithHttpInfo(stateModification);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#pushStateModification");
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
| **stateModification** | [**StateModification**](StateModification.md)| The JSON body of the request. Contains new operational status of third-party synthetic monitors. | |

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
| **204** | Success. The state of third-party monitors has been changed. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## testResults

> void testResults(model3rdPartySyntheticTests)

Pushes third-party synthetic monitors, locations, and results to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        Model3rdPartySyntheticTests model3rdPartySyntheticTests = new Model3rdPartySyntheticTests(); // Model3rdPartySyntheticTests | The JSON body of the request. Contains third-party synthetic monitors, locations, and results.
        try {
            apiInstance.testResults(model3rdPartySyntheticTests);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#testResults");
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
| **model3rdPartySyntheticTests** | [**Model3rdPartySyntheticTests**](Model3rdPartySyntheticTests.md)| The JSON body of the request. Contains third-party synthetic monitors, locations, and results. | |

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
| **204** | Success. The information is accepted and stored. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## testResultsWithHttpInfo

> ApiResponse<Void> testResults testResultsWithHttpInfo(model3rdPartySyntheticTests)

Pushes third-party synthetic monitors, locations, and results to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticThirdPartyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticThirdPartyApi apiInstance = new SyntheticThirdPartyApi(defaultClient);
        Model3rdPartySyntheticTests model3rdPartySyntheticTests = new Model3rdPartySyntheticTests(); // Model3rdPartySyntheticTests | The JSON body of the request. Contains third-party synthetic monitors, locations, and results.
        try {
            ApiResponse<Void> response = apiInstance.testResultsWithHttpInfo(model3rdPartySyntheticTests);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticThirdPartyApi#testResults");
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
| **model3rdPartySyntheticTests** | [**Model3rdPartySyntheticTests**](Model3rdPartySyntheticTests.md)| The JSON body of the request. Contains third-party synthetic monitors, locations, and results. | |

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
| **204** | Success. The information is accepted and stored. |  -  |
| **400** | Failed. The input is invalid. |  -  |

