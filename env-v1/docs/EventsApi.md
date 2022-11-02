# EventsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventById**](EventsApi.md#getEventById) | **GET** /events/{eventId} | Gets the parameters of the specified event |
| [**getEventByIdWithHttpInfo**](EventsApi.md#getEventByIdWithHttpInfo) | **GET** /events/{eventId} | Gets the parameters of the specified event |
| [**postEvent**](EventsApi.md#postEvent) | **POST** /events | Pushes custom events to one or more monitored entities |
| [**postEventWithHttpInfo**](EventsApi.md#postEventWithHttpInfo) | **POST** /events | Pushes custom events to one or more monitored entities |
| [**queryEvents**](EventsApi.md#queryEvents) | **GET** /events | Lists all the events of your environment, along with their parameters |
| [**queryEventsWithHttpInfo**](EventsApi.md#queryEventsWithHttpInfo) | **GET** /events | Lists all the events of your environment, along with their parameters |



## getEventById

> EventRestEntry getEventById(eventId)

Gets the parameters of the specified event

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventId = "eventId_example"; // String | The ID of the required event.
        try {
            EventRestEntry result = apiInstance.getEventById(eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventById");
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
| **eventId** | **String**| The ID of the required event. | |

### Return type

[**EventRestEntry**](EventRestEntry.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getEventByIdWithHttpInfo

> ApiResponse<EventRestEntry> getEventById getEventByIdWithHttpInfo(eventId)

Gets the parameters of the specified event

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventId = "eventId_example"; // String | The ID of the required event.
        try {
            ApiResponse<EventRestEntry> response = apiInstance.getEventByIdWithHttpInfo(eventId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventById");
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
| **eventId** | **String**| The ID of the required event. | |

### Return type

ApiResponse<[**EventRestEntry**](EventRestEntry.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## postEvent

> EventStoreResult postEvent(eventCreation)

Pushes custom events to one or more monitored entities

You can use this endpoint to:   * Push information-only events from third-party systems such as CI platforms (Jenkins, Bamboo, Electric Cloud, etc.) to provide additional information for Dynatrace automated root cause analysis. The time of event closure is already known and the event IDs are returned instantly. You can report these events for up to **30 days** into the past. The information-only event types are:  &#x60;CUSTOM_ANNOTATION&#x60;   &#x60;CUSTOM_CONFIGURATION&#x60;   &#x60;CUSTOM_DEPLOYMENT&#x60;   &#x60;CUSTOM_INFO&#x60;   &#x60;MARKED_FOR_TERMINATION&#x60;   * Push problem-opening events (for example, an error rate increase) to trigger the Dynatrace automated root cause analysis engine.  Correlation IDs are returned instead of event IDs. These events stay open until the specified timeout expires. To prevent expiration, you can refresh these events by sending the same payload again. You can report these events for up to **60 minutes** into the past. The problem-opening event types are (sorted by severity level, descending):  &#x60;AVAILABILITY_EVENT&#x60;   &#x60;ERROR_EVENT&#x60;   &#x60;PERFORMANCE_EVENT&#x60;   &#x60;RESOURCE_CONTENTION&#x60;   The actual set of event parameters depends on the type of your event. To find the parameters mapping, see [POST an event](https://dt-url.net/1v63r77) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventCreation eventCreation = new EventCreation(); // EventCreation | The JSON body of the request, containing parameters of the event.
        try {
            EventStoreResult result = apiInstance.postEvent(eventCreation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEvent");
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
| **eventCreation** | [**EventCreation**](EventCreation.md)| The JSON body of the request, containing parameters of the event. | [optional] |

### Return type

[**EventStoreResult**](EventStoreResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## postEventWithHttpInfo

> ApiResponse<EventStoreResult> postEvent postEventWithHttpInfo(eventCreation)

Pushes custom events to one or more monitored entities

You can use this endpoint to:   * Push information-only events from third-party systems such as CI platforms (Jenkins, Bamboo, Electric Cloud, etc.) to provide additional information for Dynatrace automated root cause analysis. The time of event closure is already known and the event IDs are returned instantly. You can report these events for up to **30 days** into the past. The information-only event types are:  &#x60;CUSTOM_ANNOTATION&#x60;   &#x60;CUSTOM_CONFIGURATION&#x60;   &#x60;CUSTOM_DEPLOYMENT&#x60;   &#x60;CUSTOM_INFO&#x60;   &#x60;MARKED_FOR_TERMINATION&#x60;   * Push problem-opening events (for example, an error rate increase) to trigger the Dynatrace automated root cause analysis engine.  Correlation IDs are returned instead of event IDs. These events stay open until the specified timeout expires. To prevent expiration, you can refresh these events by sending the same payload again. You can report these events for up to **60 minutes** into the past. The problem-opening event types are (sorted by severity level, descending):  &#x60;AVAILABILITY_EVENT&#x60;   &#x60;ERROR_EVENT&#x60;   &#x60;PERFORMANCE_EVENT&#x60;   &#x60;RESOURCE_CONTENTION&#x60;   The actual set of event parameters depends on the type of your event. To find the parameters mapping, see [POST an event](https://dt-url.net/1v63r77) in Dynatrace Documentation.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventCreation eventCreation = new EventCreation(); // EventCreation | The JSON body of the request, containing parameters of the event.
        try {
            ApiResponse<EventStoreResult> response = apiInstance.postEventWithHttpInfo(eventCreation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEvent");
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
| **eventCreation** | [**EventCreation**](EventCreation.md)| The JSON body of the request, containing parameters of the event. | [optional] |

### Return type

ApiResponse<[**EventStoreResult**](EventStoreResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## queryEvents

> EventQueryResult queryEvents(from, to, relativeTime, eventType, entityId, cursor)

Lists all the events of your environment, along with their parameters

Because the possible number of events can be huge, the response is limited to 150 events. You can focus the output by specifying filtering parameters for the request.  An event is included in the response, if either start or end timestamp of the event is within the defined timeframe.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long from = 56L; // Long | Start timestamp of the query, in UTC milliseconds.    If not set, 30 days ago from now is used, unless **relativeTime** is set.
        Long to = 56L; // Long | End timestamp of the query, in UTC milliseconds.    If not set, the current timestamp is used, unless **relativeTime** is set.   The timeframe must not exceed 2 years.
        String relativeTime = "10mins"; // String | Relative timeframe, back from the current time.
        String eventType = "APPLICATION_JS_FRAMEWORK_DETECTED"; // String | Filters the resulting set of events by the event type.
        String entityId = "entityId_example"; // String | Filters the resulting set of events to the events, related to the specified Dynatrace entity.
        String cursor = "cursor_example"; // String | The response is limited to 150 events, so if you want to receive more you can use the cursor to get the next 150. This parameter should be empty when querying for the first time.    The cursor key can then be found in the **nextCursor** field of the previous response.   When using the cursor string, it is not necessary to specify the additional parameters, as that info is already encoded within the cursor.
        try {
            EventQueryResult result = apiInstance.queryEvents(from, to, relativeTime, eventType, entityId, cursor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#queryEvents");
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
| **from** | **Long**| Start timestamp of the query, in UTC milliseconds.    If not set, 30 days ago from now is used, unless **relativeTime** is set. | [optional] |
| **to** | **Long**| End timestamp of the query, in UTC milliseconds.    If not set, the current timestamp is used, unless **relativeTime** is set.   The timeframe must not exceed 2 years. | [optional] |
| **relativeTime** | **String**| Relative timeframe, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **eventType** | **String**| Filters the resulting set of events by the event type. | [optional] [enum: APPLICATION_JS_FRAMEWORK_DETECTED, APPLICATION_OVERLOAD_PREVENTION, AVAILABILITY_EVENT, CONNECTION_LOST, CPU_SATURATED, CUSTOM_ALERT, CUSTOM_ANNOTATION, CUSTOM_APPLICATION_OVERLOAD_PREVENTION, CUSTOM_APP_CRASH_RATE_INCREASED, CUSTOM_CONFIGURATION, CUSTOM_DEPLOYMENT, CUSTOM_INFO, DATABASE_CONNECTION_FAILURE, DEPLOYMENT_CHANGED_CHANGE, DEPLOYMENT_CHANGED_NEW, DEPLOYMENT_CHANGED_REMOVED, DYNATRACE_INTERNAL, EBS_VOLUME_HIGH_LATENCY, ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE, ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE, ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE, ERROR_EVENT, ESXI_HOST_VM_MOTION_ARRIVED, ESXI_HOST_VM_MOTION_LEFT, ESXI_HOST_VM_STARTED, ESXI_START, ESXI_VM_DISCONNECTED, ESXI_VM_MOTION, ESXI_VM_POWER_OFF, ESXI_VM_START, FAILURE_RATE_INCREASED, HIGH_CONNECTIVITY_FAILURES, HIGH_DROPPED_PACKETS_RATE, HIGH_GC_ACTIVITY, HIGH_LATENCY, HIGH_NETWORK_ERROR_RATE, HIGH_NETWORK_LOSS_RATE, HIGH_NETWORK_UTILIZATION, HOST_CONNECTION_FAILED, HOST_CONNECTION_LOST, HOST_DATASTORE_LOW_DISK_SPACE, HOST_DISK_LOW_INODES, HOST_GRACEFULLY_SHUTDOWN, HOST_LOG_AVAILABILITY, HOST_LOG_ERROR, HOST_LOG_MATCHED, HOST_LOG_PERFORMANCE, HOST_MAINTENANCE, HOST_NO_CONNECTION, HOST_OF_SERVICE_UNAVAILABLE, HOST_SHUTDOWN, HOST_TIMEOUT, HTTP_CHECK_GLOBAL_OUTAGE, HTTP_CHECK_LOCAL_OUTAGE, HTTP_CHECK_TEST_LOCATION_SLOWDOWN, INSUFFICIENT_DISK_QUEUE_DEPTH, JAVASCRIPT_ERROR_RATE_INCREASED, LAMBDA_FUNCTION_HIGH_ERROR_RATE, LOG_AVAILABILITY, LOG_ERROR, LOG_MATCHED, LOG_PERFORMANCE, LOW_DISK_SPACE, LOW_STORAGE_SPACE, MARKED_FOR_TERMINATION, MEMORY_RESOURCES_EXHAUSTED, MEMORY_SATURATED, MOBILE_APPLICATION_OVERLOAD_PREVENTION, MOBILE_APP_CRASH_RATE_INCREASED, MONITORING_UNAVAILABLE, OPENSTACK_HOST_VM_SHUTDOWN, OPENSTACK_HOST_VM_STARTED, OPENSTACK_KEYSTONE_SLOW, OPENSTACK_KEYSTONE_UNHEALTHY, OPENSTACK_VM_LAUNCH_FAILED, OPENSTACK_VM_MOTION, OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE, OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE, OVERLOADED_STORAGE, PERFORMANCE_EVENT, PGI_CRASHED_INFO, PGI_HAPROXY_QUEUED_REQUESTS_HIGH, PGI_HAPROXY_SESSION_USAGE_HIGH, PGI_LOG_MATCHED, PGI_MEMDUMP, PGI_MYSQL_SLOW_QUERIES_RATE_HIGH, PGI_OF_SERVICE_UNAVAILABLE, PGI_RMQ_HIGH_FILE_DESC_USAGE, PGI_RMQ_HIGH_MEM_USAGE, PGI_RMQ_HIGH_PROCESS_USAGE, PGI_RMQ_HIGH_SOCKETS_USAGE, PGI_RMQ_LOW_DISK_SPACE, PROCESS_CRASHED, PROCESS_CUSTOM_AVAILABILITY, PROCESS_CUSTOM_ERROR, PROCESS_CUSTOM_PERFORMANCE, PROCESS_GROUP_LOW_INSTANCE_COUNT, PROCESS_LOG_AVAILABILITY, PROCESS_LOG_ERROR, PROCESS_LOG_PERFORMANCE, PROCESS_RESTART, PROCESS_UNAVAILABLE, RDS_AZ_FAILOVER_COMPLETED, RDS_AZ_FAILOVER_STARTED, RDS_BACKUP_COMPLETED, RDS_BACKUP_STARTED, RDS_OF_SERVICE_UNAVAILABLE, RDS_RESTART, RDS_RESTART_SEQUENCE, RESOURCE_CONTENTION, SERVICE_RESPONSE_TIME_DEGRADED, SLOW_DISK, SYNTHETIC_AVAILABILITY, SYNTHETIC_NODE_OUTAGE, SYNTHETIC_PRIVATE_LOCATION_OUTAGE, SYNTHETIC_SLOWDOWN, THREADS_RESOURCES_EXHAUSTED, UNEXPECTED_HIGH_LOAD, UNEXPECTED_LOW_LOAD, USER_ACTION_DURATION_DEGRADATION, VIRTUAL_MACHINE_SHUTDOWN, WEB_CHECK_GLOBAL_OUTAGE, WEB_CHECK_LOCAL_OUTAGE] |
| **entityId** | **String**| Filters the resulting set of events to the events, related to the specified Dynatrace entity. | [optional] |
| **cursor** | **String**| The response is limited to 150 events, so if you want to receive more you can use the cursor to get the next 150. This parameter should be empty when querying for the first time.    The cursor key can then be found in the **nextCursor** field of the previous response.   When using the cursor string, it is not necessary to specify the additional parameters, as that info is already encoded within the cursor. | [optional] |

### Return type

[**EventQueryResult**](EventQueryResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## queryEventsWithHttpInfo

> ApiResponse<EventQueryResult> queryEvents queryEventsWithHttpInfo(from, to, relativeTime, eventType, entityId, cursor)

Lists all the events of your environment, along with their parameters

Because the possible number of events can be huge, the response is limited to 150 events. You can focus the output by specifying filtering parameters for the request.  An event is included in the response, if either start or end timestamp of the event is within the defined timeframe.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        EventsApi apiInstance = new EventsApi(defaultClient);
        Long from = 56L; // Long | Start timestamp of the query, in UTC milliseconds.    If not set, 30 days ago from now is used, unless **relativeTime** is set.
        Long to = 56L; // Long | End timestamp of the query, in UTC milliseconds.    If not set, the current timestamp is used, unless **relativeTime** is set.   The timeframe must not exceed 2 years.
        String relativeTime = "10mins"; // String | Relative timeframe, back from the current time.
        String eventType = "APPLICATION_JS_FRAMEWORK_DETECTED"; // String | Filters the resulting set of events by the event type.
        String entityId = "entityId_example"; // String | Filters the resulting set of events to the events, related to the specified Dynatrace entity.
        String cursor = "cursor_example"; // String | The response is limited to 150 events, so if you want to receive more you can use the cursor to get the next 150. This parameter should be empty when querying for the first time.    The cursor key can then be found in the **nextCursor** field of the previous response.   When using the cursor string, it is not necessary to specify the additional parameters, as that info is already encoded within the cursor.
        try {
            ApiResponse<EventQueryResult> response = apiInstance.queryEventsWithHttpInfo(from, to, relativeTime, eventType, entityId, cursor);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#queryEvents");
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
| **from** | **Long**| Start timestamp of the query, in UTC milliseconds.    If not set, 30 days ago from now is used, unless **relativeTime** is set. | [optional] |
| **to** | **Long**| End timestamp of the query, in UTC milliseconds.    If not set, the current timestamp is used, unless **relativeTime** is set.   The timeframe must not exceed 2 years. | [optional] |
| **relativeTime** | **String**| Relative timeframe, back from the current time. | [optional] [enum: 10mins, 15mins, 2hours, 30mins, 3days, 5mins, 6hours, day, hour, min, month, week] |
| **eventType** | **String**| Filters the resulting set of events by the event type. | [optional] [enum: APPLICATION_JS_FRAMEWORK_DETECTED, APPLICATION_OVERLOAD_PREVENTION, AVAILABILITY_EVENT, CONNECTION_LOST, CPU_SATURATED, CUSTOM_ALERT, CUSTOM_ANNOTATION, CUSTOM_APPLICATION_OVERLOAD_PREVENTION, CUSTOM_APP_CRASH_RATE_INCREASED, CUSTOM_CONFIGURATION, CUSTOM_DEPLOYMENT, CUSTOM_INFO, DATABASE_CONNECTION_FAILURE, DEPLOYMENT_CHANGED_CHANGE, DEPLOYMENT_CHANGED_NEW, DEPLOYMENT_CHANGED_REMOVED, DYNATRACE_INTERNAL, EBS_VOLUME_HIGH_LATENCY, ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE, ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE, ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE, ERROR_EVENT, ESXI_HOST_VM_MOTION_ARRIVED, ESXI_HOST_VM_MOTION_LEFT, ESXI_HOST_VM_STARTED, ESXI_START, ESXI_VM_DISCONNECTED, ESXI_VM_MOTION, ESXI_VM_POWER_OFF, ESXI_VM_START, FAILURE_RATE_INCREASED, HIGH_CONNECTIVITY_FAILURES, HIGH_DROPPED_PACKETS_RATE, HIGH_GC_ACTIVITY, HIGH_LATENCY, HIGH_NETWORK_ERROR_RATE, HIGH_NETWORK_LOSS_RATE, HIGH_NETWORK_UTILIZATION, HOST_CONNECTION_FAILED, HOST_CONNECTION_LOST, HOST_DATASTORE_LOW_DISK_SPACE, HOST_DISK_LOW_INODES, HOST_GRACEFULLY_SHUTDOWN, HOST_LOG_AVAILABILITY, HOST_LOG_ERROR, HOST_LOG_MATCHED, HOST_LOG_PERFORMANCE, HOST_MAINTENANCE, HOST_NO_CONNECTION, HOST_OF_SERVICE_UNAVAILABLE, HOST_SHUTDOWN, HOST_TIMEOUT, HTTP_CHECK_GLOBAL_OUTAGE, HTTP_CHECK_LOCAL_OUTAGE, HTTP_CHECK_TEST_LOCATION_SLOWDOWN, INSUFFICIENT_DISK_QUEUE_DEPTH, JAVASCRIPT_ERROR_RATE_INCREASED, LAMBDA_FUNCTION_HIGH_ERROR_RATE, LOG_AVAILABILITY, LOG_ERROR, LOG_MATCHED, LOG_PERFORMANCE, LOW_DISK_SPACE, LOW_STORAGE_SPACE, MARKED_FOR_TERMINATION, MEMORY_RESOURCES_EXHAUSTED, MEMORY_SATURATED, MOBILE_APPLICATION_OVERLOAD_PREVENTION, MOBILE_APP_CRASH_RATE_INCREASED, MONITORING_UNAVAILABLE, OPENSTACK_HOST_VM_SHUTDOWN, OPENSTACK_HOST_VM_STARTED, OPENSTACK_KEYSTONE_SLOW, OPENSTACK_KEYSTONE_UNHEALTHY, OPENSTACK_VM_LAUNCH_FAILED, OPENSTACK_VM_MOTION, OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE, OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE, OVERLOADED_STORAGE, PERFORMANCE_EVENT, PGI_CRASHED_INFO, PGI_HAPROXY_QUEUED_REQUESTS_HIGH, PGI_HAPROXY_SESSION_USAGE_HIGH, PGI_LOG_MATCHED, PGI_MEMDUMP, PGI_MYSQL_SLOW_QUERIES_RATE_HIGH, PGI_OF_SERVICE_UNAVAILABLE, PGI_RMQ_HIGH_FILE_DESC_USAGE, PGI_RMQ_HIGH_MEM_USAGE, PGI_RMQ_HIGH_PROCESS_USAGE, PGI_RMQ_HIGH_SOCKETS_USAGE, PGI_RMQ_LOW_DISK_SPACE, PROCESS_CRASHED, PROCESS_CUSTOM_AVAILABILITY, PROCESS_CUSTOM_ERROR, PROCESS_CUSTOM_PERFORMANCE, PROCESS_GROUP_LOW_INSTANCE_COUNT, PROCESS_LOG_AVAILABILITY, PROCESS_LOG_ERROR, PROCESS_LOG_PERFORMANCE, PROCESS_RESTART, PROCESS_UNAVAILABLE, RDS_AZ_FAILOVER_COMPLETED, RDS_AZ_FAILOVER_STARTED, RDS_BACKUP_COMPLETED, RDS_BACKUP_STARTED, RDS_OF_SERVICE_UNAVAILABLE, RDS_RESTART, RDS_RESTART_SEQUENCE, RESOURCE_CONTENTION, SERVICE_RESPONSE_TIME_DEGRADED, SLOW_DISK, SYNTHETIC_AVAILABILITY, SYNTHETIC_NODE_OUTAGE, SYNTHETIC_PRIVATE_LOCATION_OUTAGE, SYNTHETIC_SLOWDOWN, THREADS_RESOURCES_EXHAUSTED, UNEXPECTED_HIGH_LOAD, UNEXPECTED_LOW_LOAD, USER_ACTION_DURATION_DEGRADATION, VIRTUAL_MACHINE_SHUTDOWN, WEB_CHECK_GLOBAL_OUTAGE, WEB_CHECK_LOCAL_OUTAGE] |
| **entityId** | **String**| Filters the resulting set of events to the events, related to the specified Dynatrace entity. | [optional] |
| **cursor** | **String**| The response is limited to 150 events, so if you want to receive more you can use the cursor to get the next 150. This parameter should be empty when querying for the first time.    The cursor key can then be found in the **nextCursor** field of the previous response.   When using the cursor string, it is not necessary to specify the additional parameters, as that info is already encoded within the cursor. | [optional] |

### Return type

ApiResponse<[**EventQueryResult**](EventQueryResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

