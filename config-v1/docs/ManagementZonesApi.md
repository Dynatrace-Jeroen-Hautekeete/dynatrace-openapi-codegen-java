# ManagementZonesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManagementZone**](ManagementZonesApi.md#createManagementZone) | **POST** /managementZones | Creates a new management zone |
| [**createManagementZoneWithHttpInfo**](ManagementZonesApi.md#createManagementZoneWithHttpInfo) | **POST** /managementZones | Creates a new management zone |
| [**deleteManagementZone**](ManagementZonesApi.md#deleteManagementZone) | **DELETE** /managementZones/{id} | Deletes the specified management zone |
| [**deleteManagementZoneWithHttpInfo**](ManagementZonesApi.md#deleteManagementZoneWithHttpInfo) | **DELETE** /managementZones/{id} | Deletes the specified management zone |
| [**getManagementZone**](ManagementZonesApi.md#getManagementZone) | **GET** /managementZones/{id} | Lists the parameters of the specified management zone |
| [**getManagementZoneWithHttpInfo**](ManagementZonesApi.md#getManagementZoneWithHttpInfo) | **GET** /managementZones/{id} | Lists the parameters of the specified management zone |
| [**listManagementZones**](ManagementZonesApi.md#listManagementZones) | **GET** /managementZones | Lists all configured management zones |
| [**listManagementZonesWithHttpInfo**](ManagementZonesApi.md#listManagementZonesWithHttpInfo) | **GET** /managementZones | Lists all configured management zones |
| [**updateManagementZone**](ManagementZonesApi.md#updateManagementZone) | **PUT** /managementZones/{id} | Updates the specified management zone |
| [**updateManagementZoneWithHttpInfo**](ManagementZonesApi.md#updateManagementZoneWithHttpInfo) | **PUT** /managementZones/{id} | Updates the specified management zone |
| [**validateCreateManagementZone**](ManagementZonesApi.md#validateCreateManagementZone) | **POST** /managementZones/validator | Validates a new management zone for the &#x60;POST /managementZones&#x60; request |
| [**validateCreateManagementZoneWithHttpInfo**](ManagementZonesApi.md#validateCreateManagementZoneWithHttpInfo) | **POST** /managementZones/validator | Validates a new management zone for the &#x60;POST /managementZones&#x60; request |
| [**validateUpdateManagementZone**](ManagementZonesApi.md#validateUpdateManagementZone) | **POST** /managementZones/{id}/validator | Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request |
| [**validateUpdateManagementZoneWithHttpInfo**](ManagementZonesApi.md#validateUpdateManagementZoneWithHttpInfo) | **POST** /managementZones/{id}/validator | Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request |



## createManagementZone

> EntityShortRepresentation createManagementZone(managementZone)

Creates a new management zone

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request. Contains parameters of the new management zone.
        try {
            EntityShortRepresentation result = apiInstance.createManagementZone(managementZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#createManagementZone");
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
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request. Contains parameters of the new management zone. | [optional] |

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
| **201** | Success. The management zone has been created. The response contains the ID of the new zone. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createManagementZoneWithHttpInfo

> ApiResponse<EntityShortRepresentation> createManagementZone createManagementZoneWithHttpInfo(managementZone)

Creates a new management zone

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request. Contains parameters of the new management zone.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createManagementZoneWithHttpInfo(managementZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#createManagementZone");
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
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request. Contains parameters of the new management zone. | [optional] |

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
| **201** | Success. The management zone has been created. The response contains the ID of the new zone. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteManagementZone

> void deleteManagementZone(id)

Deletes the specified management zone

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to delete.
        try {
            apiInstance.deleteManagementZone(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#deleteManagementZone");
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
| **id** | **String**| The ID of the management zone to delete. | |

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
| **204** | Deleted. Response does not have a body. |  -  |

## deleteManagementZoneWithHttpInfo

> ApiResponse<Void> deleteManagementZone deleteManagementZoneWithHttpInfo(id)

Deletes the specified management zone

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteManagementZoneWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#deleteManagementZone");
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
| **id** | **String**| The ID of the management zone to delete. | |

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
| **204** | Deleted. Response does not have a body. |  -  |


## getManagementZone

> ManagementZone getManagementZone(id, includeProcessGroupReferences)

Lists the parameters of the specified management zone

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required management zone.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed.
        try {
            ManagementZone result = apiInstance.getManagementZone(id, includeProcessGroupReferences);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#getManagementZone");
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
| **id** | **String**| The ID of the required management zone. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed. | [optional] [default to false] |

### Return type

[**ManagementZone**](ManagementZone.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getManagementZoneWithHttpInfo

> ApiResponse<ManagementZone> getManagementZone getManagementZoneWithHttpInfo(id, includeProcessGroupReferences)

Lists the parameters of the specified management zone

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required management zone.
        Boolean includeProcessGroupReferences = false; // Boolean | Flag to include process group references to the response.    Process group references aren't compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed.
        try {
            ApiResponse<ManagementZone> response = apiInstance.getManagementZoneWithHttpInfo(id, includeProcessGroupReferences);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#getManagementZone");
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
| **id** | **String**| The ID of the required management zone. | |
| **includeProcessGroupReferences** | **Boolean**| Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed. | [optional] [default to false] |

### Return type

ApiResponse<[**ManagementZone**](ManagementZone.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listManagementZones

> StubList listManagementZones()

Lists all configured management zones

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        try {
            StubList result = apiInstance.listManagementZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#listManagementZones");
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

## listManagementZonesWithHttpInfo

> ApiResponse<StubList> listManagementZones listManagementZonesWithHttpInfo()

Lists all configured management zones

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listManagementZonesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#listManagementZones");
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


## updateManagementZone

> EntityShortRepresentation updateManagementZone(id, managementZone)

Updates the specified management zone

If a management zone with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID.
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request. Contains updated parameters of the management zone.
        try {
            EntityShortRepresentation result = apiInstance.updateManagementZone(id, managementZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#updateManagementZone");
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
| **id** | **String**| The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request. Contains updated parameters of the management zone. | [optional] |

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
| **201** | Success. The management zone has been created. The response contains the ID of the new zone. |  -  |
| **204** | Success. The management zone has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateManagementZoneWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateManagementZone updateManagementZoneWithHttpInfo(id, managementZone)

Updates the specified management zone

If a management zone with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID.
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request. Contains updated parameters of the management zone.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateManagementZoneWithHttpInfo(id, managementZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#updateManagementZone");
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
| **id** | **String**| The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID. | |
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request. Contains updated parameters of the management zone. | [optional] |

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
| **201** | Success. The management zone has been created. The response contains the ID of the new zone. |  -  |
| **204** | Success. The management zone has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateManagementZone

> void validateCreateManagementZone(managementZone)

Validates a new management zone for the &#x60;POST /managementZones&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request, containing the management zone parameters to validate.
        try {
            apiInstance.validateCreateManagementZone(managementZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#validateCreateManagementZone");
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
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request, containing the management zone parameters to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateCreateManagementZoneWithHttpInfo

> ApiResponse<Void> validateCreateManagementZone validateCreateManagementZoneWithHttpInfo(managementZone)

Validates a new management zone for the &#x60;POST /managementZones&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request, containing the management zone parameters to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateManagementZoneWithHttpInfo(managementZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#validateCreateManagementZone");
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
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request, containing the management zone parameters to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateUpdateManagementZone

> void validateUpdateManagementZone(id, managementZone)

Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to validate.
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request, containing the management zone parameters to validate.
        try {
            apiInstance.validateUpdateManagementZone(id, managementZone);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#validateUpdateManagementZone");
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
| **id** | **String**| The ID of the management zone to validate. | |
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request, containing the management zone parameters to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateUpdateManagementZoneWithHttpInfo

> ApiResponse<Void> validateUpdateManagementZone validateUpdateManagementZoneWithHttpInfo(id, managementZone)

Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ManagementZonesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ManagementZonesApi apiInstance = new ManagementZonesApi(defaultClient);
        String id = "id_example"; // String | The ID of the management zone to validate.
        ManagementZone managementZone = new ManagementZone(); // ManagementZone | The JSON body of the request, containing the management zone parameters to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateManagementZoneWithHttpInfo(id, managementZone);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagementZonesApi#validateUpdateManagementZone");
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
| **id** | **String**| The ID of the management zone to validate. | |
| **managementZone** | [**ManagementZone**](ManagementZone.md)| The JSON body of the request, containing the management zone parameters to validate. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

