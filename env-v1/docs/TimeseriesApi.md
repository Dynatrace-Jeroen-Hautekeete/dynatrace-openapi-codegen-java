# TimeseriesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomTimeseries**](TimeseriesApi.md#createCustomTimeseries) | **PUT** /timeseries/{timeseriesIdentifier} | Creates a new custom metric |
| [**createCustomTimeseriesWithHttpInfo**](TimeseriesApi.md#createCustomTimeseriesWithHttpInfo) | **PUT** /timeseries/{timeseriesIdentifier} | Creates a new custom metric |
| [**deleteCustomTimeseries**](TimeseriesApi.md#deleteCustomTimeseries) | **DELETE** /timeseries/{timeseriesIdentifier} | Deletes the specified custom metric |
| [**deleteCustomTimeseriesWithHttpInfo**](TimeseriesApi.md#deleteCustomTimeseriesWithHttpInfo) | **DELETE** /timeseries/{timeseriesIdentifier} | Deletes the specified custom metric |
| [**getAllTimeseriesDefinitions**](TimeseriesApi.md#getAllTimeseriesDefinitions) | **GET** /timeseries | Lists all metric definitions, with the parameters of each metric |
| [**getAllTimeseriesDefinitionsWithHttpInfo**](TimeseriesApi.md#getAllTimeseriesDefinitionsWithHttpInfo) | **GET** /timeseries | Lists all metric definitions, with the parameters of each metric |
| [**readTimeseriesComplex**](TimeseriesApi.md#readTimeseriesComplex) | **POST** /timeseries/{timeseriesIdentifier} | Lists all available metric data points, matching the specified parameters |
| [**readTimeseriesComplexWithHttpInfo**](TimeseriesApi.md#readTimeseriesComplexWithHttpInfo) | **POST** /timeseries/{timeseriesIdentifier} | Lists all available metric data points, matching the specified parameters |
| [**readTimeseriesData**](TimeseriesApi.md#readTimeseriesData) | **GET** /timeseries/{timeseriesIdentifier} | Gets the parameters of the specified metric and, optionally, its data points |
| [**readTimeseriesDataWithHttpInfo**](TimeseriesApi.md#readTimeseriesDataWithHttpInfo) | **GET** /timeseries/{timeseriesIdentifier} | Gets the parameters of the specified metric and, optionally, its data points |



## createCustomTimeseries

> TimeseriesDefinition createCustomTimeseries(timeseriesIdentifier, timeseriesRegistrationMessage)

Creates a new custom metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The ID for the new metric. It must start with the `custom:` prefix.   You can use alphanumeric characters and the following punctuation marks: periods (`.`), hyphens (`-`), and commas (`,`). A number cannot follow a punctuation mark.   If you use the ID of an existing metric the respective parameters will be updated.   The length of ID is limited to **256 characters**.
        TimeseriesRegistrationMessage timeseriesRegistrationMessage = new TimeseriesRegistrationMessage(); // TimeseriesRegistrationMessage | The JSON body of the request. Contains parameters of the new custom metric.
        try {
            TimeseriesDefinition result = apiInstance.createCustomTimeseries(timeseriesIdentifier, timeseriesRegistrationMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#createCustomTimeseries");
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
| **timeseriesIdentifier** | **String**| The ID for the new metric. It must start with the &#x60;custom:&#x60; prefix.   You can use alphanumeric characters and the following punctuation marks: periods (&#x60;.&#x60;), hyphens (&#x60;-&#x60;), and commas (&#x60;,&#x60;). A number cannot follow a punctuation mark.   If you use the ID of an existing metric the respective parameters will be updated.   The length of ID is limited to **256 characters**. | |
| **timeseriesRegistrationMessage** | [**TimeseriesRegistrationMessage**](TimeseriesRegistrationMessage.md)| The JSON body of the request. Contains parameters of the new custom metric. | [optional] |

### Return type

[**TimeseriesDefinition**](TimeseriesDefinition.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The custom metric has been created. |  -  |

## createCustomTimeseriesWithHttpInfo

> ApiResponse<TimeseriesDefinition> createCustomTimeseries createCustomTimeseriesWithHttpInfo(timeseriesIdentifier, timeseriesRegistrationMessage)

Creates a new custom metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The ID for the new metric. It must start with the `custom:` prefix.   You can use alphanumeric characters and the following punctuation marks: periods (`.`), hyphens (`-`), and commas (`,`). A number cannot follow a punctuation mark.   If you use the ID of an existing metric the respective parameters will be updated.   The length of ID is limited to **256 characters**.
        TimeseriesRegistrationMessage timeseriesRegistrationMessage = new TimeseriesRegistrationMessage(); // TimeseriesRegistrationMessage | The JSON body of the request. Contains parameters of the new custom metric.
        try {
            ApiResponse<TimeseriesDefinition> response = apiInstance.createCustomTimeseriesWithHttpInfo(timeseriesIdentifier, timeseriesRegistrationMessage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#createCustomTimeseries");
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
| **timeseriesIdentifier** | **String**| The ID for the new metric. It must start with the &#x60;custom:&#x60; prefix.   You can use alphanumeric characters and the following punctuation marks: periods (&#x60;.&#x60;), hyphens (&#x60;-&#x60;), and commas (&#x60;,&#x60;). A number cannot follow a punctuation mark.   If you use the ID of an existing metric the respective parameters will be updated.   The length of ID is limited to **256 characters**. | |
| **timeseriesRegistrationMessage** | [**TimeseriesRegistrationMessage**](TimeseriesRegistrationMessage.md)| The JSON body of the request. Contains parameters of the new custom metric. | [optional] |

### Return type

ApiResponse<[**TimeseriesDefinition**](TimeseriesDefinition.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The custom metric has been created. |  -  |


## deleteCustomTimeseries

> void deleteCustomTimeseries(timeseriesIdentifier)

Deletes the specified custom metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The ID of the metric to delete.
        try {
            apiInstance.deleteCustomTimeseries(timeseriesIdentifier);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#deleteCustomTimeseries");
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
| **timeseriesIdentifier** | **String**| The ID of the metric to delete. | |

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
| **204** | Success. The custom metric has been deleted. |  -  |

## deleteCustomTimeseriesWithHttpInfo

> ApiResponse<Void> deleteCustomTimeseries deleteCustomTimeseriesWithHttpInfo(timeseriesIdentifier)

Deletes the specified custom metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The ID of the metric to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteCustomTimeseriesWithHttpInfo(timeseriesIdentifier);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#deleteCustomTimeseries");
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
| **timeseriesIdentifier** | **String**| The ID of the metric to delete. | |

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
| **204** | Success. The custom metric has been deleted. |  -  |


## getAllTimeseriesDefinitions

> List<TimeseriesDefinition> getAllTimeseriesDefinitions(source, detailedSource)

Lists all metric definitions, with the parameters of each metric

You can specify filtering parameters to return only matched metrics. If no parameters are specified, the call will list all the defined metrics.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String source = "ALL"; // String | The type of the metric, such as BUILTIN or CUSTOM.
        String detailedSource = "detailedSource_example"; // String | The feature where metrics originates, such as Synthetic or RUM.
        try {
            List<TimeseriesDefinition> result = apiInstance.getAllTimeseriesDefinitions(source, detailedSource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#getAllTimeseriesDefinitions");
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
| **source** | **String**| The type of the metric, such as BUILTIN or CUSTOM. | [optional] [enum: ALL, BUILTIN, CUSTOM, PLUGIN, REMOTE_PLUGIN] |
| **detailedSource** | **String**| The feature where metrics originates, such as Synthetic or RUM. | [optional] |

### Return type

[**List&lt;TimeseriesDefinition&gt;**](TimeseriesDefinition.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllTimeseriesDefinitionsWithHttpInfo

> ApiResponse<List<TimeseriesDefinition>> getAllTimeseriesDefinitions getAllTimeseriesDefinitionsWithHttpInfo(source, detailedSource)

Lists all metric definitions, with the parameters of each metric

You can specify filtering parameters to return only matched metrics. If no parameters are specified, the call will list all the defined metrics.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String source = "ALL"; // String | The type of the metric, such as BUILTIN or CUSTOM.
        String detailedSource = "detailedSource_example"; // String | The feature where metrics originates, such as Synthetic or RUM.
        try {
            ApiResponse<List<TimeseriesDefinition>> response = apiInstance.getAllTimeseriesDefinitionsWithHttpInfo(source, detailedSource);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#getAllTimeseriesDefinitions");
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
| **source** | **String**| The type of the metric, such as BUILTIN or CUSTOM. | [optional] [enum: ALL, BUILTIN, CUSTOM, PLUGIN, REMOTE_PLUGIN] |
| **detailedSource** | **String**| The feature where metrics originates, such as Synthetic or RUM. | [optional] |

### Return type

ApiResponse<[**List&lt;TimeseriesDefinition&gt;**](TimeseriesDefinition.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## readTimeseriesComplex

> TimeseriesQueryResultWrapper readTimeseriesComplex(timeseriesIdentifier, timeseriesQueryMessage)

Lists all available metric data points, matching the specified parameters

Provides advanced filtering possibilities, comparing to the &#x60;GET /timeseries/{metricIdentifier}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The case-sensitive ID of the timeseries from which you want to read parameters and data points.
        TimeseriesQueryMessage timeseriesQueryMessage = new TimeseriesQueryMessage(); // TimeseriesQueryMessage | The JSON body of the request, containing parameters to identify the required data points.
        try {
            TimeseriesQueryResultWrapper result = apiInstance.readTimeseriesComplex(timeseriesIdentifier, timeseriesQueryMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#readTimeseriesComplex");
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
| **timeseriesIdentifier** | **String**| The case-sensitive ID of the timeseries from which you want to read parameters and data points. | |
| **timeseriesQueryMessage** | [**TimeseriesQueryMessage**](TimeseriesQueryMessage.md)| The JSON body of the request, containing parameters to identify the required data points. | [optional] |

### Return type

[**TimeseriesQueryResultWrapper**](TimeseriesQueryResultWrapper.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## readTimeseriesComplexWithHttpInfo

> ApiResponse<TimeseriesQueryResultWrapper> readTimeseriesComplex readTimeseriesComplexWithHttpInfo(timeseriesIdentifier, timeseriesQueryMessage)

Lists all available metric data points, matching the specified parameters

Provides advanced filtering possibilities, comparing to the &#x60;GET /timeseries/{metricIdentifier}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The case-sensitive ID of the timeseries from which you want to read parameters and data points.
        TimeseriesQueryMessage timeseriesQueryMessage = new TimeseriesQueryMessage(); // TimeseriesQueryMessage | The JSON body of the request, containing parameters to identify the required data points.
        try {
            ApiResponse<TimeseriesQueryResultWrapper> response = apiInstance.readTimeseriesComplexWithHttpInfo(timeseriesIdentifier, timeseriesQueryMessage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#readTimeseriesComplex");
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
| **timeseriesIdentifier** | **String**| The case-sensitive ID of the timeseries from which you want to read parameters and data points. | |
| **timeseriesQueryMessage** | [**TimeseriesQueryMessage**](TimeseriesQueryMessage.md)| The JSON body of the request, containing parameters to identify the required data points. | [optional] |

### Return type

ApiResponse<[**TimeseriesQueryResultWrapper**](TimeseriesQueryResultWrapper.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## readTimeseriesData

> TimeseriesQueryResult readTimeseriesData(timeseriesIdentifier, includeData, aggregationType, startTimestamp, endTimestamp, predict, relativeTime, queryMode, entity, tag, percentile, includeParentIds, considerMaintenanceWindowsForAvailability)

Gets the parameters of the specified metric and, optionally, its data points

To obtain data points, set **includeData** to &#x60;true&#x60;.   You can obtain either data points or the scalar result of the specified timeseries, depending on the **queryMode**.   To obtain data points, you must specify the timeframe, either as **relativeTime** or as a combination of **startTimestamp** and **endTimestamp**.   You must also provide the **aggregationType**, supported by the metric.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The case-sensitive ID of the timeseries, from which you want to read parameters and data points.
        Boolean includeData = true; // Boolean | The flag to include data points in the response. Set to `true` to obtain data points. You must also specify the timeframe and aggregation type.   Defaults to `false`, meaning data points are not included.
        String aggregationType = "AVG"; // String | The aggregation type for the resulting data points.   If the requested metric doesn't support the specified aggregation, the request will result in an error.
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in UTC milliseconds.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If later than the current time, Dynatrace automatically uses the current time instead.   The timeframe must not exceed 6 months.
        Boolean predict = true; // Boolean | The flag to predict future data points.
        String relativeTime = "10mins"; // String | The relative timeframe, back from the current time.
        String queryMode = "SERIES"; // String | The type of result that the call should return. Valid result modes are:   `series`: returns all the data points of the timeseries in specified timeframe.  `total`: returns one scalar value for the specified timeframe.   By default, the `series` mode is used.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters requested data points by the entity that should deliver them. Allowed values are Dynatrace entity IDs.   You can specify several entities in the following format: `entity=entity1&entity=entity2`. The entity has to match at least one of the specified IDs.   If the selected entity doesn't support the requested timeseries, the request will result in an error.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters requested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: `tag=tag1&tag=tag2`. The entity has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use the `key:value` format. If there's also a context, use the `[context]key:value` format.
        Integer percentile = 56; // Integer | Specifies which percentile of the selected response time metric should be delivered.  Applicable only to the `PERCENTILE` aggregation type.   Valid values for percentile are between 1 and 99.   Keep in mind that percentile export is possible only for response-time-based metrics such as application and service response times.
        Boolean includeParentIds = true; // Boolean | If set to true the result exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001
        Boolean considerMaintenanceWindowsForAvailability = true; // Boolean | Exclude (`true`) or include (`false`) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment.
        try {
            TimeseriesQueryResult result = apiInstance.readTimeseriesData(timeseriesIdentifier, includeData, aggregationType, startTimestamp, endTimestamp, predict, relativeTime, queryMode, entity, tag, percentile, includeParentIds, considerMaintenanceWindowsForAvailability);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#readTimeseriesData");
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
| **timeseriesIdentifier** | **String**| The case-sensitive ID of the timeseries, from which you want to read parameters and data points. | |
| **includeData** | **Boolean**| The flag to include data points in the response. Set to &#x60;true&#x60; to obtain data points. You must also specify the timeframe and aggregation type.   Defaults to &#x60;false&#x60;, meaning data points are not included. | [optional] |
| **aggregationType** | **String**| The aggregation type for the resulting data points.   If the requested metric doesn&#39;t support the specified aggregation, the request will result in an error. | [optional] [enum: AVG, COUNT, MAX, MEDIAN, MIN, PERCENTILE, SUM] |
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in UTC milliseconds. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in milliseconds (UTC).   If later than the current time, Dynatrace automatically uses the current time instead.   The timeframe must not exceed 6 months. | [optional] |
| **predict** | **Boolean**| The flag to predict future data points. | [optional] |
| **relativeTime** | **String**| The relative timeframe, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **queryMode** | **String**| The type of result that the call should return. Valid result modes are:   &#x60;series&#x60;: returns all the data points of the timeseries in specified timeframe.  &#x60;total&#x60;: returns one scalar value for the specified timeframe.   By default, the &#x60;series&#x60; mode is used. | [optional] [enum: SERIES, TOTAL] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters requested data points by the entity that should deliver them. Allowed values are Dynatrace entity IDs.   You can specify several entities in the following format: &#x60;entity&#x3D;entity1&amp;entity&#x3D;entity2&#x60;. The entity has to match at least one of the specified IDs.   If the selected entity doesn&#39;t support the requested timeseries, the request will result in an error. | [optional] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters requested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The entity has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use the &#x60;key:value&#x60; format. If there&#39;s also a context, use the &#x60;[context]key:value&#x60; format. | [optional] |
| **percentile** | **Integer**| Specifies which percentile of the selected response time metric should be delivered.  Applicable only to the &#x60;PERCENTILE&#x60; aggregation type.   Valid values for percentile are between 1 and 99.   Keep in mind that percentile export is possible only for response-time-based metrics such as application and service response times. | [optional] |
| **includeParentIds** | **Boolean**| If set to true the result exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001 | [optional] |
| **considerMaintenanceWindowsForAvailability** | **Boolean**| Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment. | [optional] |

### Return type

[**TimeseriesQueryResult**](TimeseriesQueryResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## readTimeseriesDataWithHttpInfo

> ApiResponse<TimeseriesQueryResult> readTimeseriesData readTimeseriesDataWithHttpInfo(timeseriesIdentifier, includeData, aggregationType, startTimestamp, endTimestamp, predict, relativeTime, queryMode, entity, tag, percentile, includeParentIds, considerMaintenanceWindowsForAvailability)

Gets the parameters of the specified metric and, optionally, its data points

To obtain data points, set **includeData** to &#x60;true&#x60;.   You can obtain either data points or the scalar result of the specified timeseries, depending on the **queryMode**.   To obtain data points, you must specify the timeframe, either as **relativeTime** or as a combination of **startTimestamp** and **endTimestamp**.   You must also provide the **aggregationType**, supported by the metric.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TimeseriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TimeseriesApi apiInstance = new TimeseriesApi(defaultClient);
        String timeseriesIdentifier = "timeseriesIdentifier_example"; // String | The case-sensitive ID of the timeseries, from which you want to read parameters and data points.
        Boolean includeData = true; // Boolean | The flag to include data points in the response. Set to `true` to obtain data points. You must also specify the timeframe and aggregation type.   Defaults to `false`, meaning data points are not included.
        String aggregationType = "AVG"; // String | The aggregation type for the resulting data points.   If the requested metric doesn't support the specified aggregation, the request will result in an error.
        Long startTimestamp = 56L; // Long | The start timestamp of the requested timeframe, in UTC milliseconds.
        Long endTimestamp = 56L; // Long | The end timestamp of the requested timeframe, in milliseconds (UTC).   If later than the current time, Dynatrace automatically uses the current time instead.   The timeframe must not exceed 6 months.
        Boolean predict = true; // Boolean | The flag to predict future data points.
        String relativeTime = "10mins"; // String | The relative timeframe, back from the current time.
        String queryMode = "SERIES"; // String | The type of result that the call should return. Valid result modes are:   `series`: returns all the data points of the timeseries in specified timeframe.  `total`: returns one scalar value for the specified timeframe.   By default, the `series` mode is used.
        Set<String> entity = Arrays.asList(); // Set<String> | Filters requested data points by the entity that should deliver them. Allowed values are Dynatrace entity IDs.   You can specify several entities in the following format: `entity=entity1&entity=entity2`. The entity has to match at least one of the specified IDs.   If the selected entity doesn't support the requested timeseries, the request will result in an error.
        Set<String> tag = Arrays.asList(); // Set<String> | Filters requested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: `tag=tag1&tag=tag2`. The entity has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use the `key:value` format. If there's also a context, use the `[context]key:value` format.
        Integer percentile = 56; // Integer | Specifies which percentile of the selected response time metric should be delivered.  Applicable only to the `PERCENTILE` aggregation type.   Valid values for percentile are between 1 and 99.   Keep in mind that percentile export is possible only for response-time-based metrics such as application and service response times.
        Boolean includeParentIds = true; // Boolean | If set to true the result exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001
        Boolean considerMaintenanceWindowsForAvailability = true; // Boolean | Exclude (`true`) or include (`false`) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment.
        try {
            ApiResponse<TimeseriesQueryResult> response = apiInstance.readTimeseriesDataWithHttpInfo(timeseriesIdentifier, includeData, aggregationType, startTimestamp, endTimestamp, predict, relativeTime, queryMode, entity, tag, percentile, includeParentIds, considerMaintenanceWindowsForAvailability);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeseriesApi#readTimeseriesData");
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
| **timeseriesIdentifier** | **String**| The case-sensitive ID of the timeseries, from which you want to read parameters and data points. | |
| **includeData** | **Boolean**| The flag to include data points in the response. Set to &#x60;true&#x60; to obtain data points. You must also specify the timeframe and aggregation type.   Defaults to &#x60;false&#x60;, meaning data points are not included. | [optional] |
| **aggregationType** | **String**| The aggregation type for the resulting data points.   If the requested metric doesn&#39;t support the specified aggregation, the request will result in an error. | [optional] [enum: AVG, COUNT, MAX, MEDIAN, MIN, PERCENTILE, SUM] |
| **startTimestamp** | **Long**| The start timestamp of the requested timeframe, in UTC milliseconds. | [optional] |
| **endTimestamp** | **Long**| The end timestamp of the requested timeframe, in milliseconds (UTC).   If later than the current time, Dynatrace automatically uses the current time instead.   The timeframe must not exceed 6 months. | [optional] |
| **predict** | **Boolean**| The flag to predict future data points. | [optional] |
| **relativeTime** | **String**| The relative timeframe, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **queryMode** | **String**| The type of result that the call should return. Valid result modes are:   &#x60;series&#x60;: returns all the data points of the timeseries in specified timeframe.  &#x60;total&#x60;: returns one scalar value for the specified timeframe.   By default, the &#x60;series&#x60; mode is used. | [optional] [enum: SERIES, TOTAL] |
| **entity** | [**Set&lt;String&gt;**](String.md)| Filters requested data points by the entity that should deliver them. Allowed values are Dynatrace entity IDs.   You can specify several entities in the following format: &#x60;entity&#x3D;entity1&amp;entity&#x3D;entity2&#x60;. The entity has to match at least one of the specified IDs.   If the selected entity doesn&#39;t support the requested timeseries, the request will result in an error. | [optional] |
| **tag** | [**Set&lt;String&gt;**](String.md)| Filters requested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: &#x60;tag&#x3D;tag1&amp;tag&#x3D;tag2&#x60;. The entity has to match **all** the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use the &#x60;key:value&#x60; format. If there&#39;s also a context, use the &#x60;[context]key:value&#x60; format. | [optional] |
| **percentile** | **Integer**| Specifies which percentile of the selected response time metric should be delivered.  Applicable only to the &#x60;PERCENTILE&#x60; aggregation type.   Valid values for percentile are between 1 and 99.   Keep in mind that percentile export is possible only for response-time-based metrics such as application and service response times. | [optional] |
| **includeParentIds** | **Boolean**| If set to true the result exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001 | [optional] |
| **considerMaintenanceWindowsForAvailability** | **Boolean**| Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment. | [optional] |

### Return type

ApiResponse<[**TimeseriesQueryResult**](TimeseriesQueryResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

