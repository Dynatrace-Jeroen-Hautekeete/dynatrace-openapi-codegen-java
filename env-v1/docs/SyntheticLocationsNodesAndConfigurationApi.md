# SyntheticLocationsNodesAndConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLocation**](SyntheticLocationsNodesAndConfigurationApi.md#addLocation) | **POST** /synthetic/locations | Creates a new private synthetic location |
| [**addLocationWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#addLocationWithHttpInfo) | **POST** /synthetic/locations | Creates a new private synthetic location |
| [**getLocation**](SyntheticLocationsNodesAndConfigurationApi.md#getLocation) | **GET** /synthetic/locations/{locationId} | Gets properties of the specified location |
| [**getLocationWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#getLocationWithHttpInfo) | **GET** /synthetic/locations/{locationId} | Gets properties of the specified location |
| [**getLocations**](SyntheticLocationsNodesAndConfigurationApi.md#getLocations) | **GET** /synthetic/locations | Lists all synthetic locations (both public and private) available for your environment |
| [**getLocationsWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#getLocationsWithHttpInfo) | **GET** /synthetic/locations | Lists all synthetic locations (both public and private) available for your environment |
| [**getLocationsStatus**](SyntheticLocationsNodesAndConfigurationApi.md#getLocationsStatus) | **GET** /synthetic/locations/status | Returns whether public locations are enabled or not | maturity&#x3D;EARLY_ADOPTER |
| [**getLocationsStatusWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#getLocationsStatusWithHttpInfo) | **GET** /synthetic/locations/status | Returns whether public locations are enabled or not | maturity&#x3D;EARLY_ADOPTER |
| [**getNode**](SyntheticLocationsNodesAndConfigurationApi.md#getNode) | **GET** /synthetic/nodes/{nodeId} | Lists properties of the specified synthetic node |
| [**getNodeWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#getNodeWithHttpInfo) | **GET** /synthetic/nodes/{nodeId} | Lists properties of the specified synthetic node |
| [**getNodes**](SyntheticLocationsNodesAndConfigurationApi.md#getNodes) | **GET** /synthetic/nodes | Lists all synthetic nodes available in your environment |
| [**getNodesWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#getNodesWithHttpInfo) | **GET** /synthetic/nodes | Lists all synthetic nodes available in your environment |
| [**removeLocation**](SyntheticLocationsNodesAndConfigurationApi.md#removeLocation) | **DELETE** /synthetic/locations/{locationId} | Deletes the specified private synthetic location |
| [**removeLocationWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#removeLocationWithHttpInfo) | **DELETE** /synthetic/locations/{locationId} | Deletes the specified private synthetic location |
| [**updateLocation**](SyntheticLocationsNodesAndConfigurationApi.md#updateLocation) | **PUT** /synthetic/locations/{locationId} | Updates the specified synthetic location |
| [**updateLocationWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#updateLocationWithHttpInfo) | **PUT** /synthetic/locations/{locationId} | Updates the specified synthetic location |
| [**updateLocationsStatus**](SyntheticLocationsNodesAndConfigurationApi.md#updateLocationsStatus) | **PUT** /synthetic/locations/status | Enable/disable public synthetic locations | maturity&#x3D;EARLY_ADOPTER |
| [**updateLocationsStatusWithHttpInfo**](SyntheticLocationsNodesAndConfigurationApi.md#updateLocationsStatusWithHttpInfo) | **PUT** /synthetic/locations/status | Enable/disable public synthetic locations | maturity&#x3D;EARLY_ADOPTER |



## addLocation

> EntityIdDto addLocation(privateSyntheticLocation)

Creates a new private synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        PrivateSyntheticLocation privateSyntheticLocation = new PrivateSyntheticLocation(); // PrivateSyntheticLocation | The JSON body of the request. Contains parameters of the new private synthetic location.
        try {
            EntityIdDto result = apiInstance.addLocation(privateSyntheticLocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#addLocation");
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
| **privateSyntheticLocation** | [**PrivateSyntheticLocation**](PrivateSyntheticLocation.md)| The JSON body of the request. Contains parameters of the new private synthetic location. | [optional] |

### Return type

[**EntityIdDto**](EntityIdDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## addLocationWithHttpInfo

> ApiResponse<EntityIdDto> addLocation addLocationWithHttpInfo(privateSyntheticLocation)

Creates a new private synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        PrivateSyntheticLocation privateSyntheticLocation = new PrivateSyntheticLocation(); // PrivateSyntheticLocation | The JSON body of the request. Contains parameters of the new private synthetic location.
        try {
            ApiResponse<EntityIdDto> response = apiInstance.addLocationWithHttpInfo(privateSyntheticLocation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#addLocation");
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
| **privateSyntheticLocation** | [**PrivateSyntheticLocation**](PrivateSyntheticLocation.md)| The JSON body of the request. Contains parameters of the new private synthetic location. | [optional] |

### Return type

ApiResponse<[**EntityIdDto**](EntityIdDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLocation

> SyntheticLocation getLocation(locationId)

Gets properties of the specified location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the required location.
        try {
            SyntheticLocation result = apiInstance.getLocation(locationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the required location. | |

### Return type

[**SyntheticLocation**](SyntheticLocation.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains parameters of the synthetic location. |  -  |

## getLocationWithHttpInfo

> ApiResponse<SyntheticLocation> getLocation getLocationWithHttpInfo(locationId)

Gets properties of the specified location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the required location.
        try {
            ApiResponse<SyntheticLocation> response = apiInstance.getLocationWithHttpInfo(locationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the required location. | |

### Return type

ApiResponse<[**SyntheticLocation**](SyntheticLocation.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains parameters of the synthetic location. |  -  |


## getLocations

> SyntheticLocations getLocations(cloudPlatform, type)

Lists all synthetic locations (both public and private) available for your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String cloudPlatform = "AWS"; // String | Filters the resulting set of locations to those which are hosted on a specific cloud platform.
        String type = "PUBLIC"; // String | Filters the resulting set of locations by a specific type.
        try {
            SyntheticLocations result = apiInstance.getLocations(cloudPlatform, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocations");
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
| **cloudPlatform** | **String**| Filters the resulting set of locations to those which are hosted on a specific cloud platform. | [optional] [enum: AWS, AZURE, ALIBABA, GOOGLE_CLOUD, OTHER] |
| **type** | **String**| Filters the resulting set of locations by a specific type. | [optional] [enum: PUBLIC, PRIVATE] |

### Return type

[**SyntheticLocations**](SyntheticLocations.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getLocationsWithHttpInfo

> ApiResponse<SyntheticLocations> getLocations getLocationsWithHttpInfo(cloudPlatform, type)

Lists all synthetic locations (both public and private) available for your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String cloudPlatform = "AWS"; // String | Filters the resulting set of locations to those which are hosted on a specific cloud platform.
        String type = "PUBLIC"; // String | Filters the resulting set of locations by a specific type.
        try {
            ApiResponse<SyntheticLocations> response = apiInstance.getLocationsWithHttpInfo(cloudPlatform, type);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocations");
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
| **cloudPlatform** | **String**| Filters the resulting set of locations to those which are hosted on a specific cloud platform. | [optional] [enum: AWS, AZURE, ALIBABA, GOOGLE_CLOUD, OTHER] |
| **type** | **String**| Filters the resulting set of locations by a specific type. | [optional] [enum: PUBLIC, PRIVATE] |

### Return type

ApiResponse<[**SyntheticLocations**](SyntheticLocations.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getLocationsStatus

> SyntheticPublicLocationsStatus getLocationsStatus()

Returns whether public locations are enabled or not | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        try {
            SyntheticPublicLocationsStatus result = apiInstance.getLocationsStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocationsStatus");
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

[**SyntheticPublicLocationsStatus**](SyntheticPublicLocationsStatus.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the public locations status. |  -  |

## getLocationsStatusWithHttpInfo

> ApiResponse<SyntheticPublicLocationsStatus> getLocationsStatus getLocationsStatusWithHttpInfo()

Returns whether public locations are enabled or not | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        try {
            ApiResponse<SyntheticPublicLocationsStatus> response = apiInstance.getLocationsStatusWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getLocationsStatus");
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

ApiResponse<[**SyntheticPublicLocationsStatus**](SyntheticPublicLocationsStatus.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the public locations status. |  -  |


## getNode

> Node getNode(nodeId)

Lists properties of the specified synthetic node

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String nodeId = "nodeId_example"; // String | The ID of the required synthetic node.
        try {
            Node result = apiInstance.getNode(nodeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getNode");
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
| **nodeId** | **String**| The ID of the required synthetic node. | |

### Return type

[**Node**](Node.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getNodeWithHttpInfo

> ApiResponse<Node> getNode getNodeWithHttpInfo(nodeId)

Lists properties of the specified synthetic node

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String nodeId = "nodeId_example"; // String | The ID of the required synthetic node.
        try {
            ApiResponse<Node> response = apiInstance.getNodeWithHttpInfo(nodeId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getNode");
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
| **nodeId** | **String**| The ID of the required synthetic node. | |

### Return type

ApiResponse<[**Node**](Node.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getNodes

> Nodes getNodes()

Lists all synthetic nodes available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        try {
            Nodes result = apiInstance.getNodes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getNodes");
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

[**Nodes**](Nodes.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getNodesWithHttpInfo

> ApiResponse<Nodes> getNodes getNodesWithHttpInfo()

Lists all synthetic nodes available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        try {
            ApiResponse<Nodes> response = apiInstance.getNodesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#getNodes");
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

ApiResponse<[**Nodes**](Nodes.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## removeLocation

> void removeLocation(locationId)

Deletes the specified private synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the private synthetic location to be deleted.
        try {
            apiInstance.removeLocation(locationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#removeLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the private synthetic location to be deleted. | |

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

## removeLocationWithHttpInfo

> ApiResponse<Void> removeLocation removeLocationWithHttpInfo(locationId)

Deletes the specified private synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the private synthetic location to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.removeLocationWithHttpInfo(locationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#removeLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the private synthetic location to be deleted. | |

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


## updateLocation

> void updateLocation(locationId, syntheticLocationUpdate)

Updates the specified synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the synthetic location to be updated.
        SyntheticLocationUpdate syntheticLocationUpdate = new SyntheticLocationUpdate(); // SyntheticLocationUpdate | The JSON body of the request. Contains updated parameters of the private synthetic location or the status of the location.
        try {
            apiInstance.updateLocation(locationId, syntheticLocationUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#updateLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the synthetic location to be updated. | |
| **syntheticLocationUpdate** | [**SyntheticLocationUpdate**](SyntheticLocationUpdate.md)| The JSON body of the request. Contains updated parameters of the private synthetic location or the status of the location. | [optional] |

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
| **0** | default response |  -  |

## updateLocationWithHttpInfo

> ApiResponse<Void> updateLocation updateLocationWithHttpInfo(locationId, syntheticLocationUpdate)

Updates the specified synthetic location

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        String locationId = "locationId_example"; // String | The Dynatrace entity ID of the synthetic location to be updated.
        SyntheticLocationUpdate syntheticLocationUpdate = new SyntheticLocationUpdate(); // SyntheticLocationUpdate | The JSON body of the request. Contains updated parameters of the private synthetic location or the status of the location.
        try {
            ApiResponse<Void> response = apiInstance.updateLocationWithHttpInfo(locationId, syntheticLocationUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#updateLocation");
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
| **locationId** | **String**| The Dynatrace entity ID of the synthetic location to be updated. | |
| **syntheticLocationUpdate** | [**SyntheticLocationUpdate**](SyntheticLocationUpdate.md)| The JSON body of the request. Contains updated parameters of the private synthetic location or the status of the location. | [optional] |

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
| **0** | default response |  -  |


## updateLocationsStatus

> void updateLocationsStatus(syntheticPublicLocationsStatus)

Enable/disable public synthetic locations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        SyntheticPublicLocationsStatus syntheticPublicLocationsStatus = new SyntheticPublicLocationsStatus(); // SyntheticPublicLocationsStatus | The updated synthetic locations status
        try {
            apiInstance.updateLocationsStatus(syntheticPublicLocationsStatus);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#updateLocationsStatus");
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
| **syntheticPublicLocationsStatus** | [**SyntheticPublicLocationsStatus**](SyntheticPublicLocationsStatus.md)| The updated synthetic locations status | [optional] |

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
| **204** | Success. Locations status was updated successfully. |  -  |
| **409** | Conflict. Public locations could not be disabled since there are monitors assigned to them. |  -  |

## updateLocationsStatusWithHttpInfo

> ApiResponse<Void> updateLocationsStatus updateLocationsStatusWithHttpInfo(syntheticPublicLocationsStatus)

Enable/disable public synthetic locations | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.SyntheticLocationsNodesAndConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SyntheticLocationsNodesAndConfigurationApi apiInstance = new SyntheticLocationsNodesAndConfigurationApi(defaultClient);
        SyntheticPublicLocationsStatus syntheticPublicLocationsStatus = new SyntheticPublicLocationsStatus(); // SyntheticPublicLocationsStatus | The updated synthetic locations status
        try {
            ApiResponse<Void> response = apiInstance.updateLocationsStatusWithHttpInfo(syntheticPublicLocationsStatus);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticLocationsNodesAndConfigurationApi#updateLocationsStatus");
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
| **syntheticPublicLocationsStatus** | [**SyntheticPublicLocationsStatus**](SyntheticPublicLocationsStatus.md)| The updated synthetic locations status | [optional] |

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
| **204** | Success. Locations status was updated successfully. |  -  |
| **409** | Conflict. Public locations could not be disabled since there are monitors assigned to them. |  -  |

