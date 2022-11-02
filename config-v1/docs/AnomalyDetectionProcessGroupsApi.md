# AnomalyDetectionProcessGroupsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLocalAvailabilityConfig**](AnomalyDetectionProcessGroupsApi.md#deleteLocalAvailabilityConfig) | **DELETE** /anomalyDetection/processGroups/{id} | Switches off anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**deleteLocalAvailabilityConfigWithHttpInfo**](AnomalyDetectionProcessGroupsApi.md#deleteLocalAvailabilityConfigWithHttpInfo) | **DELETE** /anomalyDetection/processGroups/{id} | Switches off anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**getLocalAvailabilityConfig**](AnomalyDetectionProcessGroupsApi.md#getLocalAvailabilityConfig) | **GET** /anomalyDetection/processGroups/{id} | Gets the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**getLocalAvailabilityConfigWithHttpInfo**](AnomalyDetectionProcessGroupsApi.md#getLocalAvailabilityConfigWithHttpInfo) | **GET** /anomalyDetection/processGroups/{id} | Gets the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**setLocalAvailabilityConfig**](AnomalyDetectionProcessGroupsApi.md#setLocalAvailabilityConfig) | **PUT** /anomalyDetection/processGroups/{id} | Updates the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**setLocalAvailabilityConfigWithHttpInfo**](AnomalyDetectionProcessGroupsApi.md#setLocalAvailabilityConfigWithHttpInfo) | **PUT** /anomalyDetection/processGroups/{id} | Updates the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER |
| [**validateLocalPgAvailabilityAlertingEvent**](AnomalyDetectionProcessGroupsApi.md#validateLocalPgAvailabilityAlertingEvent) | **POST** /anomalyDetection/processGroups/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/processGroups/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateLocalPgAvailabilityAlertingEventWithHttpInfo**](AnomalyDetectionProcessGroupsApi.md#validateLocalPgAvailabilityAlertingEventWithHttpInfo) | **POST** /anomalyDetection/processGroups/{id}/validator | Validates the payload for the &#x60;PUT /anomalyDetection/processGroups/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## deleteLocalAvailabilityConfig

> void deleteLocalAvailabilityConfig(id)

Switches off anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            apiInstance.deleteLocalAvailabilityConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#deleteLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Process group doesn&#39;t exist |  -  |

## deleteLocalAvailabilityConfigWithHttpInfo

> ApiResponse<Void> deleteLocalAvailabilityConfig deleteLocalAvailabilityConfigWithHttpInfo(id)

Switches off anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            ApiResponse<Void> response = apiInstance.deleteLocalAvailabilityConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#deleteLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Process group doesn&#39;t exist |  -  |


## getLocalAvailabilityConfig

> AnomalyDetectionPG getLocalAvailabilityConfig(id)

Gets the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            AnomalyDetectionPG result = apiInstance.getLocalAvailabilityConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#getLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |

### Return type

[**AnomalyDetectionPG**](AnomalyDetectionPG.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Process group doesn&#39;t exist |  -  |

## getLocalAvailabilityConfigWithHttpInfo

> ApiResponse<AnomalyDetectionPG> getLocalAvailabilityConfig getLocalAvailabilityConfigWithHttpInfo(id)

Gets the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        try {
            ApiResponse<AnomalyDetectionPG> response = apiInstance.getLocalAvailabilityConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#getLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |

### Return type

ApiResponse<[**AnomalyDetectionPG**](AnomalyDetectionPG.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Process group doesn&#39;t exist |  -  |


## setLocalAvailabilityConfig

> void setLocalAvailabilityConfig(id, anomalyDetectionPG)

Updates the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        AnomalyDetectionPG anomalyDetectionPG = new AnomalyDetectionPG(); // AnomalyDetectionPG | The JSON body of the request. Contains parameters of anomaly detection for a process group.
        try {
            apiInstance.setLocalAvailabilityConfig(id, anomalyDetectionPG);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#setLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |
| **anomalyDetectionPG** | [**AnomalyDetectionPG**](AnomalyDetectionPG.md)| The JSON body of the request. Contains parameters of anomaly detection for a process group. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## setLocalAvailabilityConfigWithHttpInfo

> ApiResponse<Void> setLocalAvailabilityConfig setLocalAvailabilityConfigWithHttpInfo(id, anomalyDetectionPG)

Updates the configuration of anomaly detection for the specified process group | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        AnomalyDetectionPG anomalyDetectionPG = new AnomalyDetectionPG(); // AnomalyDetectionPG | The JSON body of the request. Contains parameters of anomaly detection for a process group.
        try {
            ApiResponse<Void> response = apiInstance.setLocalAvailabilityConfigWithHttpInfo(id, anomalyDetectionPG);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#setLocalAvailabilityConfig");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |
| **anomalyDetectionPG** | [**AnomalyDetectionPG**](AnomalyDetectionPG.md)| The JSON body of the request. Contains parameters of anomaly detection for a process group. | [optional] |

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
| **204** | Success. The configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateLocalPgAvailabilityAlertingEvent

> void validateLocalPgAvailabilityAlertingEvent(id, anomalyDetectionPG)

Validates the payload for the &#x60;PUT /anomalyDetection/processGroups/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        AnomalyDetectionPG anomalyDetectionPG = new AnomalyDetectionPG(); // AnomalyDetectionPG | The JSON body of the request. Contains anomaly detection configuration to be validated.
        try {
            apiInstance.validateLocalPgAvailabilityAlertingEvent(id, anomalyDetectionPG);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#validateLocalPgAvailabilityAlertingEvent");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |
| **anomalyDetectionPG** | [**AnomalyDetectionPG**](AnomalyDetectionPG.md)| The JSON body of the request. Contains anomaly detection configuration to be validated. | [optional] |

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

## validateLocalPgAvailabilityAlertingEventWithHttpInfo

> ApiResponse<Void> validateLocalPgAvailabilityAlertingEvent validateLocalPgAvailabilityAlertingEventWithHttpInfo(id, anomalyDetectionPG)

Validates the payload for the &#x60;PUT /anomalyDetection/processGroups/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionProcessGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionProcessGroupsApi apiInstance = new AnomalyDetectionProcessGroupsApi(defaultClient);
        String id = "id_example"; // String | The Dynatrace entity ID of the required process group.
        AnomalyDetectionPG anomalyDetectionPG = new AnomalyDetectionPG(); // AnomalyDetectionPG | The JSON body of the request. Contains anomaly detection configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateLocalPgAvailabilityAlertingEventWithHttpInfo(id, anomalyDetectionPG);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionProcessGroupsApi#validateLocalPgAvailabilityAlertingEvent");
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
| **id** | **String**| The Dynatrace entity ID of the required process group. | |
| **anomalyDetectionPG** | [**AnomalyDetectionPG**](AnomalyDetectionPG.md)| The JSON body of the request. Contains anomaly detection configuration to be validated. | [optional] |

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

