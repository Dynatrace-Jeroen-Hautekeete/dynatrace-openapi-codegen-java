# AnomalyDetectionDiskEventsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#createDiskEventConfig) | **POST** /anomalyDetection/diskEvents | Creates a new disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**createDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#createDiskEventConfigWithHttpInfo) | **POST** /anomalyDetection/diskEvents | Creates a new disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**deleteDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#deleteDiskEventConfig) | **DELETE** /anomalyDetection/diskEvents/{id} | Deletes the specified disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**deleteDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#deleteDiskEventConfigWithHttpInfo) | **DELETE** /anomalyDetection/diskEvents/{id} | Deletes the specified disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**getDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#getDiskEventConfig) | **GET** /anomalyDetection/diskEvents/{id} | Gets the properties of the specified disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**getDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#getDiskEventConfigWithHttpInfo) | **GET** /anomalyDetection/diskEvents/{id} | Gets the properties of the specified disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**listDiskEventConfigs**](AnomalyDetectionDiskEventsApi.md#listDiskEventConfigs) | **GET** /anomalyDetection/diskEvents | Lists all existing disk event rules | maturity&#x3D;EARLY_ADOPTER |
| [**listDiskEventConfigsWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#listDiskEventConfigsWithHttpInfo) | **GET** /anomalyDetection/diskEvents | Lists all existing disk event rules | maturity&#x3D;EARLY_ADOPTER |
| [**updateDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#updateDiskEventConfig) | **PUT** /anomalyDetection/diskEvents/{id} | Updates or creates a disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**updateDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#updateDiskEventConfigWithHttpInfo) | **PUT** /anomalyDetection/diskEvents/{id} | Updates or creates a disk event rule | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#validateCreateDiskEventConfig) | **POST** /anomalyDetection/diskEvents/validator | Validates the payload for the &#x60;POST /anomalyDetection/diskEvents&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#validateCreateDiskEventConfigWithHttpInfo) | **POST** /anomalyDetection/diskEvents/validator | Validates the payload for the &#x60;POST /anomalyDetection/diskEvents&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateDiskEventConfig**](AnomalyDetectionDiskEventsApi.md#validateUpdateDiskEventConfig) | **POST** /anomalyDetection/diskEvents/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/diskEvents/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateDiskEventConfigWithHttpInfo**](AnomalyDetectionDiskEventsApi.md#validateUpdateDiskEventConfigWithHttpInfo) | **POST** /anomalyDetection/diskEvents/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/diskEvents/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createDiskEventConfig

> EntityShortRepresentation createDiskEventConfig(diskEventAnomalyDetectionConfig)

Creates a new disk event rule | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains parameters of the new disk event rule.
        try {
            EntityShortRepresentation result = apiInstance.createDiskEventConfig(diskEventAnomalyDetectionConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#createDiskEventConfig");
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
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains parameters of the new disk event rule. | [optional] |

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
| **201** | Success. The new disk event rule has been created. The ID of the new disk event rule is returned. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createDiskEventConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createDiskEventConfig createDiskEventConfigWithHttpInfo(diskEventAnomalyDetectionConfig)

Creates a new disk event rule | maturity&#x3D;EARLY_ADOPTER

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
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains parameters of the new disk event rule.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createDiskEventConfigWithHttpInfo(diskEventAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#createDiskEventConfig");
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
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains parameters of the new disk event rule. | [optional] |

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
| **201** | Success. The new disk event rule has been created. The ID of the new disk event rule is returned. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteDiskEventConfig

> void deleteDiskEventConfig(id)

Deletes the specified disk event rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be deleted.
        try {
            apiInstance.deleteDiskEventConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#deleteDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be deleted. | |

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
| **204** | Success. The disk event rule has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteDiskEventConfigWithHttpInfo

> ApiResponse<Void> deleteDiskEventConfig deleteDiskEventConfigWithHttpInfo(id)

Deletes the specified disk event rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteDiskEventConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#deleteDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be deleted. | |

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
| **204** | Success. The disk event rule has been deleted. Response doesn&#39;t have a body. |  -  |


## getDiskEventConfig

> DiskEventAnomalyDetectionConfig getDiskEventConfig(id)

Gets the properties of the specified disk event rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required disk event rule.
        try {
            DiskEventAnomalyDetectionConfig result = apiInstance.getDiskEventConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#getDiskEventConfig");
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
| **id** | **String**| The ID of the required disk event rule. | |

### Return type

[**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDiskEventConfigWithHttpInfo

> ApiResponse<DiskEventAnomalyDetectionConfig> getDiskEventConfig getDiskEventConfigWithHttpInfo(id)

Gets the properties of the specified disk event rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required disk event rule.
        try {
            ApiResponse<DiskEventAnomalyDetectionConfig> response = apiInstance.getDiskEventConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#getDiskEventConfig");
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
| **id** | **String**| The ID of the required disk event rule. | |

### Return type

ApiResponse<[**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listDiskEventConfigs

> StubList listDiskEventConfigs()

Lists all existing disk event rules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        try {
            StubList result = apiInstance.listDiskEventConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#listDiskEventConfigs");
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

## listDiskEventConfigsWithHttpInfo

> ApiResponse<StubList> listDiskEventConfigs listDiskEventConfigsWithHttpInfo()

Lists all existing disk event rules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listDiskEventConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#listDiskEventConfigs");
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


## updateDiskEventConfig

> EntityShortRepresentation updateDiskEventConfig(id, diskEventAnomalyDetectionConfig)

Updates or creates a disk event rule | maturity&#x3D;EARLY_ADOPTER

If a disk event rule with the specified ID does not exist, a new rule is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be updated.
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains updated disk event rule parameters.
        try {
            EntityShortRepresentation result = apiInstance.updateDiskEventConfig(id, diskEventAnomalyDetectionConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#updateDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be updated. | |
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains updated disk event rule parameters. | [optional] |

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
| **201** | Success. The new disk event rule has been created. The ID of the new disk event rule is returned. |  -  |
| **204** | Success. The disk event rule has been updated. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. The specified ID is reserved for internal use. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateDiskEventConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateDiskEventConfig updateDiskEventConfigWithHttpInfo(id, diskEventAnomalyDetectionConfig)

Updates or creates a disk event rule | maturity&#x3D;EARLY_ADOPTER

If a disk event rule with the specified ID does not exist, a new rule is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be updated.
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains updated disk event rule parameters.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateDiskEventConfigWithHttpInfo(id, diskEventAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#updateDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be updated. | |
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains updated disk event rule parameters. | [optional] |

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
| **201** | Success. The new disk event rule has been created. The ID of the new disk event rule is returned. |  -  |
| **204** | Success. The disk event rule has been updated. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. The specified ID is reserved for internal use. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateCreateDiskEventConfig

> void validateCreateDiskEventConfig(diskEventAnomalyDetectionConfig)

Validates the payload for the &#x60;POST /anomalyDetection/diskEvents&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains the disk event rule to be validated.
        try {
            apiInstance.validateCreateDiskEventConfig(diskEventAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#validateCreateDiskEventConfig");
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
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains the disk event rule to be validated. | [optional] |

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
| **204** | Validated. The submitted disk event rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateCreateDiskEventConfigWithHttpInfo

> ApiResponse<Void> validateCreateDiskEventConfig validateCreateDiskEventConfigWithHttpInfo(diskEventAnomalyDetectionConfig)

Validates the payload for the &#x60;POST /anomalyDetection/diskEvents&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains the disk event rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateDiskEventConfigWithHttpInfo(diskEventAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#validateCreateDiskEventConfig");
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
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains the disk event rule to be validated. | [optional] |

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
| **204** | Validated. The submitted disk event rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateUpdateDiskEventConfig

> void validateUpdateDiskEventConfig(id, diskEventAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/diskEvents/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be validated.
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains the disk event rule to be validated.
        try {
            apiInstance.validateUpdateDiskEventConfig(id, diskEventAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#validateUpdateDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be validated. | |
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains the disk event rule to be validated. | [optional] |

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
| **204** | Validated. The submitted disk event rule is valid. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. The specified ID is reserved for internal use. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateUpdateDiskEventConfigWithHttpInfo

> ApiResponse<Void> validateUpdateDiskEventConfig validateUpdateDiskEventConfigWithHttpInfo(id, diskEventAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/diskEvents/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDiskEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDiskEventsApi apiInstance = new AnomalyDetectionDiskEventsApi(defaultClient);
        String id = "id_example"; // String | The ID of the disk event rule to be validated.
        DiskEventAnomalyDetectionConfig diskEventAnomalyDetectionConfig = new DiskEventAnomalyDetectionConfig(); // DiskEventAnomalyDetectionConfig | JSON body of the request. Contains the disk event rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateDiskEventConfigWithHttpInfo(id, diskEventAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDiskEventsApi#validateUpdateDiskEventConfig");
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
| **id** | **String**| The ID of the disk event rule to be validated. | |
| **diskEventAnomalyDetectionConfig** | [**DiskEventAnomalyDetectionConfig**](DiskEventAnomalyDetectionConfig.md)| JSON body of the request. Contains the disk event rule to be validated. | [optional] |

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
| **204** | Validated. The submitted disk event rule is valid. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. The specified ID is reserved for internal use. |  -  |
| **400** | Failed. The input is invalid |  -  |

