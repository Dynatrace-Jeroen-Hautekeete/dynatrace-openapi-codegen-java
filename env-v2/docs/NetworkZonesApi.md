# NetworkZonesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdateNetworkZone**](NetworkZonesApi.md#createOrUpdateNetworkZone) | **PUT** /networkZones/{id} | Updates an existing network zone or creates a new one |
| [**createOrUpdateNetworkZoneWithHttpInfo**](NetworkZonesApi.md#createOrUpdateNetworkZoneWithHttpInfo) | **PUT** /networkZones/{id} | Updates an existing network zone or creates a new one |
| [**deleteNetworkZone**](NetworkZonesApi.md#deleteNetworkZone) | **DELETE** /networkZones/{id} | Deletes the specified network zone |
| [**deleteNetworkZoneWithHttpInfo**](NetworkZonesApi.md#deleteNetworkZoneWithHttpInfo) | **DELETE** /networkZones/{id} | Deletes the specified network zone |
| [**getAllNetworkZones**](NetworkZonesApi.md#getAllNetworkZones) | **GET** /networkZones | Lists all existing network zones |
| [**getAllNetworkZonesWithHttpInfo**](NetworkZonesApi.md#getAllNetworkZonesWithHttpInfo) | **GET** /networkZones | Lists all existing network zones |
| [**getHostStats**](NetworkZonesApi.md#getHostStats) | **GET** /networkZones/{id}/hostConnectionStatistics | Gets the statistics about hosts using the network zone |
| [**getHostStatsWithHttpInfo**](NetworkZonesApi.md#getHostStatsWithHttpInfo) | **GET** /networkZones/{id}/hostConnectionStatistics | Gets the statistics about hosts using the network zone |
| [**getNetworkZoneSettings**](NetworkZonesApi.md#getNetworkZoneSettings) | **GET** /networkZoneSettings | Gets the global configuration of network zones |
| [**getNetworkZoneSettingsWithHttpInfo**](NetworkZonesApi.md#getNetworkZoneSettingsWithHttpInfo) | **GET** /networkZoneSettings | Gets the global configuration of network zones |
| [**getSingleNetworkZone**](NetworkZonesApi.md#getSingleNetworkZone) | **GET** /networkZones/{id} | Gets parameters of the specified network zone |
| [**getSingleNetworkZoneWithHttpInfo**](NetworkZonesApi.md#getSingleNetworkZoneWithHttpInfo) | **GET** /networkZones/{id} | Gets parameters of the specified network zone |
| [**updateNetworkZoneSettings**](NetworkZonesApi.md#updateNetworkZoneSettings) | **PUT** /networkZoneSettings | Updates the global configuration of network zones |
| [**updateNetworkZoneSettingsWithHttpInfo**](NetworkZonesApi.md#updateNetworkZoneSettingsWithHttpInfo) | **PUT** /networkZoneSettings | Updates the global configuration of network zones |



## createOrUpdateNetworkZone

> EntityShortRepresentation createOrUpdateNetworkZone(id, networkZone)

Updates an existing network zone or creates a new one

If the network zone with the specified ID does not exist, a new network zone is created.    The ID is not case sensitive. Dynatrace stores the ID in lowercase.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the network zone to be updated.    If you set the ID in the body as well, it must match this ID.    The ID is not case sensitive. Dynatrace stores the ID in lowercase.
        NetworkZone networkZone = new NetworkZone(); // NetworkZone | The JSON body of the request. Contains parameters of the network zone.
        try {
            EntityShortRepresentation result = apiInstance.createOrUpdateNetworkZone(id, networkZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#createOrUpdateNetworkZone");
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
| **id** | **String**| The ID of the network zone to be updated.    If you set the ID in the body as well, it must match this ID.    The ID is not case sensitive. Dynatrace stores the ID in lowercase. | |
| **networkZone** | [**NetworkZone**](NetworkZone.md)| The JSON body of the request. Contains parameters of the network zone. | |

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
| **201** | Success. The new network zone has been created. The response body contains the ID of the new network zone. |  -  |
| **204** | Success. The network zone has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateNetworkZoneWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOrUpdateNetworkZone createOrUpdateNetworkZoneWithHttpInfo(id, networkZone)

Updates an existing network zone or creates a new one

If the network zone with the specified ID does not exist, a new network zone is created.    The ID is not case sensitive. Dynatrace stores the ID in lowercase.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the network zone to be updated.    If you set the ID in the body as well, it must match this ID.    The ID is not case sensitive. Dynatrace stores the ID in lowercase.
        NetworkZone networkZone = new NetworkZone(); // NetworkZone | The JSON body of the request. Contains parameters of the network zone.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOrUpdateNetworkZoneWithHttpInfo(id, networkZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#createOrUpdateNetworkZone");
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
| **id** | **String**| The ID of the network zone to be updated.    If you set the ID in the body as well, it must match this ID.    The ID is not case sensitive. Dynatrace stores the ID in lowercase. | |
| **networkZone** | [**NetworkZone**](NetworkZone.md)| The JSON body of the request. Contains parameters of the network zone. | |

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
| **201** | Success. The new network zone has been created. The response body contains the ID of the new network zone. |  -  |
| **204** | Success. The network zone has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteNetworkZone

> void deleteNetworkZone(id)

Deletes the specified network zone

You can only delete an empty network zone (a zone that no ActiveGate or OneAgent is using).    If the network zone is used as an alternative zone for any OneAgent, it will be automatically removed from the list of possible alternatives.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the network zone to be deleted.
        try {
            apiInstance.deleteNetworkZone(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#deleteNetworkZone");
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
| **id** | **String**| The ID of the network zone to be deleted. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See error message in the response body for details. |  -  |

## deleteNetworkZoneWithHttpInfo

> ApiResponse<Void> deleteNetworkZone deleteNetworkZoneWithHttpInfo(id)

Deletes the specified network zone

You can only delete an empty network zone (a zone that no ActiveGate or OneAgent is using).    If the network zone is used as an alternative zone for any OneAgent, it will be automatically removed from the list of possible alternatives.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the network zone to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteNetworkZoneWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#deleteNetworkZone");
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
| **id** | **String**| The ID of the network zone to be deleted. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. See error message in the response body for details. |  -  |


## getAllNetworkZones

> NetworkZoneList getAllNetworkZones()

Lists all existing network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        try {
            NetworkZoneList result = apiInstance.getAllNetworkZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getAllNetworkZones");
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

[**NetworkZoneList**](NetworkZoneList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllNetworkZonesWithHttpInfo

> ApiResponse<NetworkZoneList> getAllNetworkZones getAllNetworkZonesWithHttpInfo()

Lists all existing network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        try {
            ApiResponse<NetworkZoneList> response = apiInstance.getAllNetworkZonesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getAllNetworkZones");
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

ApiResponse<[**NetworkZoneList**](NetworkZoneList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getHostStats

> NetworkZoneConnectionStatistics getHostStats(id, filter)

Gets the statistics about hosts using the network zone

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required network zone.
        String filter = "all"; // String | Filters the resulting set of hosts:   * `all`: All hosts using the zone.  * `configuredButNotConnectedOnly`: Hosts from the network zone that use other zones.  * `connectedAsAlternativeOnly`: Hosts that use the network zone as an alternative.  * `connectedAsFailoverOnly`: Hosts from other zones that use the zone (not configured as an alternative) even though ActiveGates of higher priority are available.  * `connectedAsFailoverWithoutOwnActiveGatesOnly`: Hosts from other zones that use the zone (not configured as an alternative) and **no** ActiveGates of higher priority are available.   If not set, `all` is used.
        try {
            NetworkZoneConnectionStatistics result = apiInstance.getHostStats(id, filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getHostStats");
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
| **id** | **String**| The ID of the required network zone. | |
| **filter** | **String**| Filters the resulting set of hosts:   * &#x60;all&#x60;: All hosts using the zone.  * &#x60;configuredButNotConnectedOnly&#x60;: Hosts from the network zone that use other zones.  * &#x60;connectedAsAlternativeOnly&#x60;: Hosts that use the network zone as an alternative.  * &#x60;connectedAsFailoverOnly&#x60;: Hosts from other zones that use the zone (not configured as an alternative) even though ActiveGates of higher priority are available.  * &#x60;connectedAsFailoverWithoutOwnActiveGatesOnly&#x60;: Hosts from other zones that use the zone (not configured as an alternative) and **no** ActiveGates of higher priority are available.   If not set, &#x60;all&#x60; is used. | [optional] [default to all] [enum: all, configuredButNotConnectedOnly, connectedAsAlternativeOnly, connectedAsFailoverOnly, connectedAsFailoverWithoutOwnActiveGatesOnly] |

### Return type

[**NetworkZoneConnectionStatistics**](NetworkZoneConnectionStatistics.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getHostStatsWithHttpInfo

> ApiResponse<NetworkZoneConnectionStatistics> getHostStats getHostStatsWithHttpInfo(id, filter)

Gets the statistics about hosts using the network zone

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required network zone.
        String filter = "all"; // String | Filters the resulting set of hosts:   * `all`: All hosts using the zone.  * `configuredButNotConnectedOnly`: Hosts from the network zone that use other zones.  * `connectedAsAlternativeOnly`: Hosts that use the network zone as an alternative.  * `connectedAsFailoverOnly`: Hosts from other zones that use the zone (not configured as an alternative) even though ActiveGates of higher priority are available.  * `connectedAsFailoverWithoutOwnActiveGatesOnly`: Hosts from other zones that use the zone (not configured as an alternative) and **no** ActiveGates of higher priority are available.   If not set, `all` is used.
        try {
            ApiResponse<NetworkZoneConnectionStatistics> response = apiInstance.getHostStatsWithHttpInfo(id, filter);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getHostStats");
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
| **id** | **String**| The ID of the required network zone. | |
| **filter** | **String**| Filters the resulting set of hosts:   * &#x60;all&#x60;: All hosts using the zone.  * &#x60;configuredButNotConnectedOnly&#x60;: Hosts from the network zone that use other zones.  * &#x60;connectedAsAlternativeOnly&#x60;: Hosts that use the network zone as an alternative.  * &#x60;connectedAsFailoverOnly&#x60;: Hosts from other zones that use the zone (not configured as an alternative) even though ActiveGates of higher priority are available.  * &#x60;connectedAsFailoverWithoutOwnActiveGatesOnly&#x60;: Hosts from other zones that use the zone (not configured as an alternative) and **no** ActiveGates of higher priority are available.   If not set, &#x60;all&#x60; is used. | [optional] [default to all] [enum: all, configuredButNotConnectedOnly, connectedAsAlternativeOnly, connectedAsFailoverOnly, connectedAsFailoverWithoutOwnActiveGatesOnly] |

### Return type

ApiResponse<[**NetworkZoneConnectionStatistics**](NetworkZoneConnectionStatistics.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getNetworkZoneSettings

> NetworkZoneSettings getNetworkZoneSettings()

Gets the global configuration of network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        try {
            NetworkZoneSettings result = apiInstance.getNetworkZoneSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getNetworkZoneSettings");
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

[**NetworkZoneSettings**](NetworkZoneSettings.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getNetworkZoneSettingsWithHttpInfo

> ApiResponse<NetworkZoneSettings> getNetworkZoneSettings getNetworkZoneSettingsWithHttpInfo()

Gets the global configuration of network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        try {
            ApiResponse<NetworkZoneSettings> response = apiInstance.getNetworkZoneSettingsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getNetworkZoneSettings");
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

ApiResponse<[**NetworkZoneSettings**](NetworkZoneSettings.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSingleNetworkZone

> NetworkZone getSingleNetworkZone(id)

Gets parameters of the specified network zone

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required network zone.
        try {
            NetworkZone result = apiInstance.getSingleNetworkZone(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getSingleNetworkZone");
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
| **id** | **String**| The ID of the required network zone. | |

### Return type

[**NetworkZone**](NetworkZone.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleNetworkZoneWithHttpInfo

> ApiResponse<NetworkZone> getSingleNetworkZone getSingleNetworkZoneWithHttpInfo(id)

Gets parameters of the specified network zone

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required network zone.
        try {
            ApiResponse<NetworkZone> response = apiInstance.getSingleNetworkZoneWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getSingleNetworkZone");
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
| **id** | **String**| The ID of the required network zone. | |

### Return type

ApiResponse<[**NetworkZone**](NetworkZone.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateNetworkZoneSettings

> void updateNetworkZoneSettings(networkZoneSettings)

Updates the global configuration of network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        NetworkZoneSettings networkZoneSettings = new NetworkZoneSettings(); // NetworkZoneSettings | The JSON body of the request. Contains global configuration of network zones.
        try {
            apiInstance.updateNetworkZoneSettings(networkZoneSettings);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#updateNetworkZoneSettings");
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
| **networkZoneSettings** | [**NetworkZoneSettings**](NetworkZoneSettings.md)| The JSON body of the request. Contains global configuration of network zones. | |

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
| **204** | Success. The global network zones configuration has been updated. Response doesn&#39;t have a body. |  -  |

## updateNetworkZoneSettingsWithHttpInfo

> ApiResponse<Void> updateNetworkZoneSettings updateNetworkZoneSettingsWithHttpInfo(networkZoneSettings)

Updates the global configuration of network zones

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.NetworkZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NetworkZonesApi apiInstance = new NetworkZonesApi(defaultClient);
        NetworkZoneSettings networkZoneSettings = new NetworkZoneSettings(); // NetworkZoneSettings | The JSON body of the request. Contains global configuration of network zones.
        try {
            ApiResponse<Void> response = apiInstance.updateNetworkZoneSettingsWithHttpInfo(networkZoneSettings);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#updateNetworkZoneSettings");
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
| **networkZoneSettings** | [**NetworkZoneSettings**](NetworkZoneSettings.md)| The JSON body of the request. Contains global configuration of network zones. | |

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
| **204** | Success. The global network zones configuration has been updated. Response doesn&#39;t have a body. |  -  |

