# TopologySmartscapeApplicationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplications**](TopologySmartscapeApplicationApi.md#getApplications) | **GET** /entity/applications | Gets the list of all applications in your environment along with their parameters |
| [**getApplicationsWithHttpInfo**](TopologySmartscapeApplicationApi.md#getApplicationsWithHttpInfo) | **GET** /entity/applications | Gets the list of all applications in your environment along with their parameters |
| [**getBaselineValuesForSingleApplication**](TopologySmartscapeApplicationApi.md#getBaselineValuesForSingleApplication) | **GET** /entity/applications/{meIdentifier}/baseline | Gets baseline data for the specified application | maturity&#x3D;EARLY_ADOPTER |
| [**getBaselineValuesForSingleApplicationWithHttpInfo**](TopologySmartscapeApplicationApi.md#getBaselineValuesForSingleApplicationWithHttpInfo) | **GET** /entity/applications/{meIdentifier}/baseline | Gets baseline data for the specified application | maturity&#x3D;EARLY_ADOPTER |
| [**getSingleApplication**](TopologySmartscapeApplicationApi.md#getSingleApplication) | **GET** /entity/applications/{meIdentifier} | Gets parameters of the specified application |
| [**getSingleApplicationWithHttpInfo**](TopologySmartscapeApplicationApi.md#getSingleApplicationWithHttpInfo) | **GET** /entity/applications/{meIdentifier} | Gets parameters of the specified application |
| [**updateApplication**](TopologySmartscapeApplicationApi.md#updateApplication) | **POST** /entity/applications/{meIdentifier} | Updates parameters of the specified application |
| [**updateApplicationWithHttpInfo**](TopologySmartscapeApplicationApi.md#updateApplicationWithHttpInfo) | **POST** /entity/applications/{meIdentifier} | Updates parameters of the specified application |



## getApplications

> List<Application> getApplications(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey)

Gets the list of all applications in your environment along with their parameters

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of applications by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The application has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified applications only.    To specify several applications use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return applications that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of applications per result page.    If not set, pagination is not used and the result contains all applications fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            List<Application> result = apiInstance.getApplications(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getApplications");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of applications by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The application has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified applications only.    To specify several applications use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return applications that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of applications per result page.    If not set, pagination is not used and the result contains all applications fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

[**List&lt;Application&gt;**](Application.md)


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

## getApplicationsWithHttpInfo

> ApiResponse<List<Application>> getApplications getApplicationsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey)

Gets the list of all applications in your environment along with their parameters

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
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of applications by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The application has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified applications only.    To specify several applications use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return applications that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of applications per result page.    If not set, pagination is not used and the result contains all applications fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            ApiResponse<List<Application>> response = apiInstance.getApplicationsWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getApplications");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of applications by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The application has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified applications only.    To specify several applications use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return applications that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of applications per result page.    If not set, pagination is not used and the result contains all applications fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

ApiResponse<[**List&lt;Application&gt;**](Application.md)>


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


## getBaselineValuesForSingleApplication

> ApplicationBaselineValues getBaselineValuesForSingleApplication(meIdentifier)

Gets baseline data for the specified application | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required application.
        try {
            ApplicationBaselineValues result = apiInstance.getBaselineValuesForSingleApplication(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getBaselineValuesForSingleApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required application. | |

### Return type

[**ApplicationBaselineValues**](ApplicationBaselineValues.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getBaselineValuesForSingleApplicationWithHttpInfo

> ApiResponse<ApplicationBaselineValues> getBaselineValuesForSingleApplication getBaselineValuesForSingleApplicationWithHttpInfo(meIdentifier)

Gets baseline data for the specified application | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required application.
        try {
            ApiResponse<ApplicationBaselineValues> response = apiInstance.getBaselineValuesForSingleApplicationWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getBaselineValuesForSingleApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required application. | |

### Return type

ApiResponse<[**ApplicationBaselineValues**](ApplicationBaselineValues.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSingleApplication

> Application getSingleApplication(meIdentifier)

Gets parameters of the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required application.
        try {
            Application result = apiInstance.getSingleApplication(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getSingleApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required application. | |

### Return type

[**Application**](Application.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleApplicationWithHttpInfo

> ApiResponse<Application> getSingleApplication getSingleApplicationWithHttpInfo(meIdentifier)

Gets parameters of the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required application.
        try {
            ApiResponse<Application> response = apiInstance.getSingleApplicationWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#getSingleApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required application. | |

### Return type

ApiResponse<[**Application**](Application.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateApplication

> void updateApplication(meIdentifier, updateEntity)

Updates parameters of the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the application you want to update.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            apiInstance.updateApplication(meIdentifier, updateEntity);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#updateApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the application you want to update. | |
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
| **204** | Success. The parameters of the application have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateApplicationWithHttpInfo

> ApiResponse<Void> updateApplication updateApplicationWithHttpInfo(meIdentifier, updateEntity)

Updates parameters of the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeApplicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeApplicationApi apiInstance = new TopologySmartscapeApplicationApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the application you want to update.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            ApiResponse<Void> response = apiInstance.updateApplicationWithHttpInfo(meIdentifier, updateEntity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeApplicationApi#updateApplication");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the application you want to update. | |
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
| **204** | Success. The parameters of the application have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

