# AnomalyDetectionMetricEventsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMetricEvent**](AnomalyDetectionMetricEventsApi.md#createMetricEvent) | **POST** /anomalyDetection/metricEvents | Creates a new metric event |
| [**createMetricEventWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#createMetricEventWithHttpInfo) | **POST** /anomalyDetection/metricEvents | Creates a new metric event |
| [**deleteMetricEvent**](AnomalyDetectionMetricEventsApi.md#deleteMetricEvent) | **DELETE** /anomalyDetection/metricEvents/{id} | Deletes the specified metric event |
| [**deleteMetricEventWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#deleteMetricEventWithHttpInfo) | **DELETE** /anomalyDetection/metricEvents/{id} | Deletes the specified metric event |
| [**getMetricEventConfig**](AnomalyDetectionMetricEventsApi.md#getMetricEventConfig) | **GET** /anomalyDetection/metricEvents/{id} | Gets the properties of the specified metric event |
| [**getMetricEventConfigWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#getMetricEventConfigWithHttpInfo) | **GET** /anomalyDetection/metricEvents/{id} | Gets the properties of the specified metric event |
| [**listMetricEventConfigs**](AnomalyDetectionMetricEventsApi.md#listMetricEventConfigs) | **GET** /anomalyDetection/metricEvents | Lists all configured metric events |
| [**listMetricEventConfigsWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#listMetricEventConfigsWithHttpInfo) | **GET** /anomalyDetection/metricEvents | Lists all configured metric events |
| [**updateMetricEvent**](AnomalyDetectionMetricEventsApi.md#updateMetricEvent) | **PUT** /anomalyDetection/metricEvents/{id} | Updates an existing metric event or creates a new one |
| [**updateMetricEventWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#updateMetricEventWithHttpInfo) | **PUT** /anomalyDetection/metricEvents/{id} | Updates an existing metric event or creates a new one |
| [**validateCreateMetricEvent**](AnomalyDetectionMetricEventsApi.md#validateCreateMetricEvent) | **POST** /anomalyDetection/metricEvents/validator | Validates the payload for the &#x60;POST /anomalyDetection/metricEvents&#x60; request |
| [**validateCreateMetricEventWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#validateCreateMetricEventWithHttpInfo) | **POST** /anomalyDetection/metricEvents/validator | Validates the payload for the &#x60;POST /anomalyDetection/metricEvents&#x60; request |
| [**validateUpdateMetricEvent**](AnomalyDetectionMetricEventsApi.md#validateUpdateMetricEvent) | **POST** /anomalyDetection/metricEvents/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/metricEvents/{id}&#x60; request |
| [**validateUpdateMetricEventWithHttpInfo**](AnomalyDetectionMetricEventsApi.md#validateUpdateMetricEventWithHttpInfo) | **POST** /anomalyDetection/metricEvents/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/metricEvents/{id}&#x60; request |



## createMetricEvent

> EntityShortRepresentation createMetricEvent(metricEvent)

Creates a new metric event

The response contains the ID of the newly created metric event.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains parameters of the new metric event.
        try {
            EntityShortRepresentation result = apiInstance.createMetricEvent(metricEvent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#createMetricEvent");
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
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains parameters of the new metric event. | [optional] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The metric event has been created. The response contains the ID and name of the newly created metric event |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createMetricEventWithHttpInfo

> ApiResponse<EntityShortRepresentation> createMetricEvent createMetricEventWithHttpInfo(metricEvent)

Creates a new metric event

The response contains the ID of the newly created metric event.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains parameters of the new metric event.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createMetricEventWithHttpInfo(metricEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#createMetricEvent");
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
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains parameters of the new metric event. | [optional] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The metric event has been created. The response contains the ID and name of the newly created metric event |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteMetricEvent

> void deleteMetricEvent(id)

Deletes the specified metric event

You can&#39;t delete events created by plugins.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be deleted.
        try {
            apiInstance.deleteMetricEvent(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#deleteMetricEvent");
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
| **id** | **String**| The ID of the metric event to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |

## deleteMetricEventWithHttpInfo

> ApiResponse<Void> deleteMetricEvent deleteMetricEventWithHttpInfo(id)

Deletes the specified metric event

You can&#39;t delete events created by plugins.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteMetricEventWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#deleteMetricEvent");
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
| **id** | **String**| The ID of the metric event to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |


## getMetricEventConfig

> MetricEvent getMetricEventConfig(id)

Gets the properties of the specified metric event

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required metric event.
        try {
            MetricEvent result = apiInstance.getMetricEventConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#getMetricEventConfig");
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
| **id** | **String**| The ID of the required metric event. | |

### Return type

[**MetricEvent**](MetricEvent.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getMetricEventConfigWithHttpInfo

> ApiResponse<MetricEvent> getMetricEventConfig getMetricEventConfigWithHttpInfo(id)

Gets the properties of the specified metric event

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required metric event.
        try {
            ApiResponse<MetricEvent> response = apiInstance.getMetricEventConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#getMetricEventConfig");
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
| **id** | **String**| The ID of the required metric event. | |

### Return type

ApiResponse<[**MetricEvent**](MetricEvent.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listMetricEventConfigs

> StubList listMetricEventConfigs(includeEntityFilterMetricEvents)

Lists all configured metric events

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        Boolean includeEntityFilterMetricEvents = false; // Boolean | Flag to include metric events with associated entities to the response.    Metric events with **entity** filters aren't compatible across environments. If set to `false`, metric events with entity filters will be removed.
        try {
            StubList result = apiInstance.listMetricEventConfigs(includeEntityFilterMetricEvents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#listMetricEventConfigs");
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
| **includeEntityFilterMetricEvents** | **Boolean**| Flag to include metric events with associated entities to the response.    Metric events with **entity** filters aren&#39;t compatible across environments. If set to &#x60;false&#x60;, metric events with entity filters will be removed. | [optional] [default to false] |

### Return type

[**StubList**](StubList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listMetricEventConfigsWithHttpInfo

> ApiResponse<StubList> listMetricEventConfigs listMetricEventConfigsWithHttpInfo(includeEntityFilterMetricEvents)

Lists all configured metric events

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        Boolean includeEntityFilterMetricEvents = false; // Boolean | Flag to include metric events with associated entities to the response.    Metric events with **entity** filters aren't compatible across environments. If set to `false`, metric events with entity filters will be removed.
        try {
            ApiResponse<StubList> response = apiInstance.listMetricEventConfigsWithHttpInfo(includeEntityFilterMetricEvents);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#listMetricEventConfigs");
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
| **includeEntityFilterMetricEvents** | **Boolean**| Flag to include metric events with associated entities to the response.    Metric events with **entity** filters aren&#39;t compatible across environments. If set to &#x60;false&#x60;, metric events with entity filters will be removed. | [optional] [default to false] |

### Return type

ApiResponse<[**StubList**](StubList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateMetricEvent

> EntityShortRepresentation updateMetricEvent(id, metricEvent)

Updates an existing metric event or creates a new one

If the metric event with the specified ID does not exist, a new metric event will be created.    You can&#39;t update the **type** of the metric event.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be updated.   If you also set the ID in the body, it must match this ID.
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains updated parameters of the metric event.
        try {
            EntityShortRepresentation result = apiInstance.updateMetricEvent(id, metricEvent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#updateMetricEvent");
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
| **id** | **String**| The ID of the metric event to be updated.   If you also set the ID in the body, it must match this ID. | |
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains updated parameters of the metric event. | [optional] |

### Return type

[**EntityShortRepresentation**](EntityShortRepresentation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new metric event has been created. The response contains the ID of the newly created metric event |  -  |
| **204** | Success. The metric event has been updated. The response is empty. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateMetricEventWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateMetricEvent updateMetricEventWithHttpInfo(id, metricEvent)

Updates an existing metric event or creates a new one

If the metric event with the specified ID does not exist, a new metric event will be created.    You can&#39;t update the **type** of the metric event.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be updated.   If you also set the ID in the body, it must match this ID.
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains updated parameters of the metric event.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateMetricEventWithHttpInfo(id, metricEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#updateMetricEvent");
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
| **id** | **String**| The ID of the metric event to be updated.   If you also set the ID in the body, it must match this ID. | |
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains updated parameters of the metric event. | [optional] |

### Return type

ApiResponse<[**EntityShortRepresentation**](EntityShortRepresentation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new metric event has been created. The response contains the ID of the newly created metric event |  -  |
| **204** | Success. The metric event has been updated. The response is empty. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateMetricEvent

> void validateCreateMetricEvent(metricEvent)

Validates the payload for the &#x60;POST /anomalyDetection/metricEvents&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains the metric event configuration to validate.
        try {
            apiInstance.validateCreateMetricEvent(metricEvent);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#validateCreateMetricEvent");
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
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains the metric event configuration to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateMetricEventWithHttpInfo

> ApiResponse<Void> validateCreateMetricEvent validateCreateMetricEventWithHttpInfo(metricEvent)

Validates the payload for the &#x60;POST /anomalyDetection/metricEvents&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains the metric event configuration to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateMetricEventWithHttpInfo(metricEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#validateCreateMetricEvent");
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
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains the metric event configuration to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateMetricEvent

> void validateUpdateMetricEvent(id, metricEvent)

Validates the payload for the &#x60;PUT /anomalyDetection/metricEvents/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be validated.
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains the metric event configuration to validate.
        try {
            apiInstance.validateUpdateMetricEvent(id, metricEvent);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#validateUpdateMetricEvent");
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
| **id** | **String**| The ID of the metric event to be validated. | |
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains the metric event configuration to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateMetricEventWithHttpInfo

> ApiResponse<Void> validateUpdateMetricEvent validateUpdateMetricEventWithHttpInfo(id, metricEvent)

Validates the payload for the &#x60;PUT /anomalyDetection/metricEvents/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionMetricEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionMetricEventsApi apiInstance = new AnomalyDetectionMetricEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the metric event to be validated.
        MetricEvent metricEvent = new MetricEvent(); // MetricEvent | The JSON body of the request. Contains the metric event configuration to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateMetricEventWithHttpInfo(id, metricEvent);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionMetricEventsApi#validateUpdateMetricEvent");
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
| **id** | **String**| The ID of the metric event to be validated. | |
| **metricEvent** | [**MetricEvent**](MetricEvent.md)| The JSON body of the request. Contains the metric event configuration to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

