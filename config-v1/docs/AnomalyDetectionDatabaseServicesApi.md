# AnomalyDetectionDatabaseServicesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDatabaseServiceAnomalyDetectionConfig**](AnomalyDetectionDatabaseServicesApi.md#getDatabaseServiceAnomalyDetectionConfig) | **GET** /anomalyDetection/databaseServices | Gets the configuration of anomaly detection for database services |
| [**getDatabaseServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionDatabaseServicesApi.md#getDatabaseServiceAnomalyDetectionConfigWithHttpInfo) | **GET** /anomalyDetection/databaseServices | Gets the configuration of anomaly detection for database services |
| [**updateDatabaseServiceAnomalyDetectionConfig**](AnomalyDetectionDatabaseServicesApi.md#updateDatabaseServiceAnomalyDetectionConfig) | **PUT** /anomalyDetection/databaseServices | Updates the configuration of anomaly detection for database services |
| [**updateDatabaseServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionDatabaseServicesApi.md#updateDatabaseServiceAnomalyDetectionConfigWithHttpInfo) | **PUT** /anomalyDetection/databaseServices | Updates the configuration of anomaly detection for database services |
| [**validateDatabaseServiceAnomalyDetectionConfig**](AnomalyDetectionDatabaseServicesApi.md#validateDatabaseServiceAnomalyDetectionConfig) | **POST** /anomalyDetection/databaseServices/validator | Validates the payload for the &#x60;PUT /anomalyDetection/databaseServices&#x60; request |
| [**validateDatabaseServiceAnomalyDetectionConfigWithHttpInfo**](AnomalyDetectionDatabaseServicesApi.md#validateDatabaseServiceAnomalyDetectionConfigWithHttpInfo) | **POST** /anomalyDetection/databaseServices/validator | Validates the payload for the &#x60;PUT /anomalyDetection/databaseServices&#x60; request |



## getDatabaseServiceAnomalyDetectionConfig

> DatabaseAnomalyDetectionConfig getDatabaseServiceAnomalyDetectionConfig()

Gets the configuration of anomaly detection for database services

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        try {
            DatabaseAnomalyDetectionConfig result = apiInstance.getDatabaseServiceAnomalyDetectionConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#getDatabaseServiceAnomalyDetectionConfig");
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

[**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDatabaseServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<DatabaseAnomalyDetectionConfig> getDatabaseServiceAnomalyDetectionConfig getDatabaseServiceAnomalyDetectionConfigWithHttpInfo()

Gets the configuration of anomaly detection for database services

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        try {
            ApiResponse<DatabaseAnomalyDetectionConfig> response = apiInstance.getDatabaseServiceAnomalyDetectionConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#getDatabaseServiceAnomalyDetectionConfig");
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

ApiResponse<[**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateDatabaseServiceAnomalyDetectionConfig

> void updateDatabaseServiceAnomalyDetectionConfig(databaseAnomalyDetectionConfig)

Updates the configuration of anomaly detection for database services

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        DatabaseAnomalyDetectionConfig databaseAnomalyDetectionConfig = new DatabaseAnomalyDetectionConfig(); // DatabaseAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the database service anomaly detection configuration.
        try {
            apiInstance.updateDatabaseServiceAnomalyDetectionConfig(databaseAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#updateDatabaseServiceAnomalyDetectionConfig");
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
| **databaseAnomalyDetectionConfig** | [**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the database service anomaly detection configuration. | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateDatabaseServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> updateDatabaseServiceAnomalyDetectionConfig updateDatabaseServiceAnomalyDetectionConfigWithHttpInfo(databaseAnomalyDetectionConfig)

Updates the configuration of anomaly detection for database services

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        DatabaseAnomalyDetectionConfig databaseAnomalyDetectionConfig = new DatabaseAnomalyDetectionConfig(); // DatabaseAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the database service anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.updateDatabaseServiceAnomalyDetectionConfigWithHttpInfo(databaseAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#updateDatabaseServiceAnomalyDetectionConfig");
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
| **databaseAnomalyDetectionConfig** | [**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the database service anomaly detection configuration. | [optional] |

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
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateDatabaseServiceAnomalyDetectionConfig

> void validateDatabaseServiceAnomalyDetectionConfig(databaseAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/databaseServices&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        DatabaseAnomalyDetectionConfig databaseAnomalyDetectionConfig = new DatabaseAnomalyDetectionConfig(); // DatabaseAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the database service anomaly detection configuration.
        try {
            apiInstance.validateDatabaseServiceAnomalyDetectionConfig(databaseAnomalyDetectionConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#validateDatabaseServiceAnomalyDetectionConfig");
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
| **databaseAnomalyDetectionConfig** | [**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the database service anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

## validateDatabaseServiceAnomalyDetectionConfigWithHttpInfo

> ApiResponse<Void> validateDatabaseServiceAnomalyDetectionConfig validateDatabaseServiceAnomalyDetectionConfigWithHttpInfo(databaseAnomalyDetectionConfig)

Validates the payload for the &#x60;PUT /anomalyDetection/databaseServices&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AnomalyDetectionDatabaseServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AnomalyDetectionDatabaseServicesApi apiInstance = new AnomalyDetectionDatabaseServicesApi(defaultClient);
        DatabaseAnomalyDetectionConfig databaseAnomalyDetectionConfig = new DatabaseAnomalyDetectionConfig(); // DatabaseAnomalyDetectionConfig | The JSON body of the request. Contains parameters of the database service anomaly detection configuration.
        try {
            ApiResponse<Void> response = apiInstance.validateDatabaseServiceAnomalyDetectionConfigWithHttpInfo(databaseAnomalyDetectionConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AnomalyDetectionDatabaseServicesApi#validateDatabaseServiceAnomalyDetectionConfig");
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
| **databaseAnomalyDetectionConfig** | [**DatabaseAnomalyDetectionConfig**](DatabaseAnomalyDetectionConfig.md)| The JSON body of the request. Contains parameters of the database service anomaly detection configuration. | [optional] |

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
| **400** | Failed. The input is invalid |  -  |

