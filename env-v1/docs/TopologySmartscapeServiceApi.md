# TopologySmartscapeServiceApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBaselineValuesForSingleService**](TopologySmartscapeServiceApi.md#getBaselineValuesForSingleService) | **GET** /entity/services/{meIdentifier}/baseline | Gets baseline data for the specified service | maturity&#x3D;EARLY_ADOPTER |
| [**getBaselineValuesForSingleServiceWithHttpInfo**](TopologySmartscapeServiceApi.md#getBaselineValuesForSingleServiceWithHttpInfo) | **GET** /entity/services/{meIdentifier}/baseline | Gets baseline data for the specified service | maturity&#x3D;EARLY_ADOPTER |
| [**getServices**](TopologySmartscapeServiceApi.md#getServices) | **GET** /entity/services | Lists all available services in your environment |
| [**getServicesWithHttpInfo**](TopologySmartscapeServiceApi.md#getServicesWithHttpInfo) | **GET** /entity/services | Lists all available services in your environment |
| [**getSingleService**](TopologySmartscapeServiceApi.md#getSingleService) | **GET** /entity/services/{meIdentifier} | Gets parameters of the specified service |
| [**getSingleServiceWithHttpInfo**](TopologySmartscapeServiceApi.md#getSingleServiceWithHttpInfo) | **GET** /entity/services/{meIdentifier} | Gets parameters of the specified service |
| [**updateService**](TopologySmartscapeServiceApi.md#updateService) | **POST** /entity/services/{meIdentifier} | Updates parameters of the specified service |
| [**updateServiceWithHttpInfo**](TopologySmartscapeServiceApi.md#updateServiceWithHttpInfo) | **POST** /entity/services/{meIdentifier} | Updates parameters of the specified service |



## getBaselineValuesForSingleService

> ServiceBaselineValues getBaselineValuesForSingleService(meIdentifier)

Gets baseline data for the specified service | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required service.
        try {
            ServiceBaselineValues result = apiInstance.getBaselineValuesForSingleService(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getBaselineValuesForSingleService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required service. | |

### Return type

[**ServiceBaselineValues**](ServiceBaselineValues.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getBaselineValuesForSingleServiceWithHttpInfo

> ApiResponse<ServiceBaselineValues> getBaselineValuesForSingleService getBaselineValuesForSingleServiceWithHttpInfo(meIdentifier)

Gets baseline data for the specified service | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required service.
        try {
            ApiResponse<ServiceBaselineValues> response = apiInstance.getBaselineValuesForSingleServiceWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getBaselineValuesForSingleService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required service. | |

### Return type

ApiResponse<[**ServiceBaselineValues**](ServiceBaselineValues.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getServices

> List<Service> getServices(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey)

Lists all available services in your environment

You can narrow down the output by specifying filtering parameters for the request.   You can additionally limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Then use the URL-encoded cursor from the **Next-Page-Key** response header in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of services by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The service has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified services only.    To specify several services use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return services that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of services per result page.    If not set, pagination is not used and the result contains all services fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            List<Service> result = apiInstance.getServices(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getServices");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of services by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The service has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified services only.    To specify several services use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return services that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of services per result page.    If not set, pagination is not used and the result contains all services fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

[**List&lt;Service&gt;**](Service.md)


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

## getServicesWithHttpInfo

> ApiResponse<List<Service>> getServices getServicesWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey)

Lists all available services in your environment

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
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then 72 hours behind from now is used.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If not set, then the current timestamp is used.   The timeframe must not exceed 3 days.
        String relativeTime = "min"; // String | The relative timeframe, back from now.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters the resulting set of services by the specified tag. You can specify several tags in the following format: `tag=tag1&tag=tag2`. The service has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: `tag=[context]key:value`. For custom key-value tags, omit the context: `tag=key:value`.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters result to the specified services only.    To specify several services use the following format: `entity=ID1&entity=ID2`.
        Long managementZone = 56L; // Long | Only return services that are part of the specified management zone.
        Boolean includeDetails = true; // Boolean | Includes (`true`) or excludes (`false`) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then `true` is used.
        Integer pageSize = 56; // Integer | The number of services per result page.    If not set, pagination is not used and the result contains all services fitting the specified filtering criteria.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you're using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages.
        try {
            ApiResponse<List<Service>> response = apiInstance.getServicesWithHttpInfo(startTimestamp, endTimestamp, relativeTime, tag, entity, managementZone, includeDetails, pageSize, nextPageKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getServices");
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
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of services by the specified tag. You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The service has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags, use the following format: &#x60;tag&#x3D;[context]key:value&#x60;. For custom key-value tags, omit the context: &#x60;tag&#x3D;key:value&#x60;. | [optional] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters result to the specified services only.    To specify several services use the following format: &#x60;entity&#x3D;ID1&amp;entity&#x3D;ID2&#x60;. | [optional] |
| **managementZone** | **Long**| Only return services that are part of the specified management zone. | [optional] |
| **includeDetails** | **Boolean**| Includes (&#x60;true&#x60;) or excludes (&#x60;false&#x60;) details which are queried from related entities.  Excluding details may make queries faster.   If not set, then &#x60;true&#x60; is used. | [optional] [default to true] |
| **pageSize** | **Integer**| The number of services per result page.    If not set, pagination is not used and the result contains all services fitting the specified filtering criteria. | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **Next-Page-Key** header of the previous response.   If you&#39;re using pagination, the first page is always returned without this cursor.   You must keep all other query parameters as they were in the first request to obtain subsequent pages. | [optional] |

### Return type

ApiResponse<[**List&lt;Service&gt;**](Service.md)>


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


## getSingleService

> Service getSingleService(meIdentifier)

Gets parameters of the specified service

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required service.
        try {
            Service result = apiInstance.getSingleService(meIdentifier);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getSingleService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required service. | |

### Return type

[**Service**](Service.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleServiceWithHttpInfo

> ApiResponse<Service> getSingleService getSingleServiceWithHttpInfo(meIdentifier)

Gets parameters of the specified service

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the required service.
        try {
            ApiResponse<Service> response = apiInstance.getSingleServiceWithHttpInfo(meIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#getSingleService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the required service. | |

### Return type

ApiResponse<[**Service**](Service.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateService

> void updateService(meIdentifier, updateEntity)

Updates parameters of the specified service

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the service you're inquiring.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            apiInstance.updateService(meIdentifier, updateEntity);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#updateService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the service you&#39;re inquiring. | |
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
| **204** | Success. The parameters of the service have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateServiceWithHttpInfo

> ApiResponse<Void> updateService updateServiceWithHttpInfo(meIdentifier, updateEntity)

Updates parameters of the specified service

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeServiceApi apiInstance = new TopologySmartscapeServiceApi(defaultClient);
        String meIdentifier = "meIdentifier_example"; // String | The Dynatrace entity ID of the service you're inquiring.
        UpdateEntity updateEntity = new UpdateEntity(); // UpdateEntity | 
        try {
            ApiResponse<Void> response = apiInstance.updateServiceWithHttpInfo(meIdentifier, updateEntity);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeServiceApi#updateService");
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
| **meIdentifier** | **String**| The Dynatrace entity ID of the service you&#39;re inquiring. | |
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
| **204** | Success. The parameters of the service have been updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

