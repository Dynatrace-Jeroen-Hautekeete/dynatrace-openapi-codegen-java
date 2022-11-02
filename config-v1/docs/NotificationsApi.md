# NotificationsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNotificationConfig**](NotificationsApi.md#createNotificationConfig) | **POST** /notifications | Creates a new notification configuration |
| [**createNotificationConfigWithHttpInfo**](NotificationsApi.md#createNotificationConfigWithHttpInfo) | **POST** /notifications | Creates a new notification configuration |
| [**deleteNotificationConfig**](NotificationsApi.md#deleteNotificationConfig) | **DELETE** /notifications/{id} | Deletes the specified notification configuration |
| [**deleteNotificationConfigWithHttpInfo**](NotificationsApi.md#deleteNotificationConfigWithHttpInfo) | **DELETE** /notifications/{id} | Deletes the specified notification configuration |
| [**getNotificationConfig**](NotificationsApi.md#getNotificationConfig) | **GET** /notifications/{id} | Gets the properties of the specified notification configuration |
| [**getNotificationConfigWithHttpInfo**](NotificationsApi.md#getNotificationConfigWithHttpInfo) | **GET** /notifications/{id} | Gets the properties of the specified notification configuration |
| [**listNotificationConfigs**](NotificationsApi.md#listNotificationConfigs) | **GET** /notifications | Lists all notification configurations available in your environment |
| [**listNotificationConfigsWithHttpInfo**](NotificationsApi.md#listNotificationConfigsWithHttpInfo) | **GET** /notifications | Lists all notification configurations available in your environment |
| [**updateNotificationConfig**](NotificationsApi.md#updateNotificationConfig) | **PUT** /notifications/{id} | Updates an existing notification configuration or creates a new one |
| [**updateNotificationConfigWithHttpInfo**](NotificationsApi.md#updateNotificationConfigWithHttpInfo) | **PUT** /notifications/{id} | Updates an existing notification configuration or creates a new one |
| [**validateCreateNotificationConfig**](NotificationsApi.md#validateCreateNotificationConfig) | **POST** /notifications/validator | Validates the payload for the &#x60;POST /notifications&#x60; request |
| [**validateCreateNotificationConfigWithHttpInfo**](NotificationsApi.md#validateCreateNotificationConfigWithHttpInfo) | **POST** /notifications/validator | Validates the payload for the &#x60;POST /notifications&#x60; request |
| [**validateUpdateNotificationConfig**](NotificationsApi.md#validateUpdateNotificationConfig) | **POST** /notifications/{id}/validator | Validates the payload the &#x60;PUT /notifications/{id}&#x60; request |
| [**validateUpdateNotificationConfigWithHttpInfo**](NotificationsApi.md#validateUpdateNotificationConfigWithHttpInfo) | **POST** /notifications/{id}/validator | Validates the payload the &#x60;PUT /notifications/{id}&#x60; request |



## createNotificationConfig

> void createNotificationConfig(notificationConfig)

Creates a new notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains parameters of the new notification configuration.
        try {
            apiInstance.createNotificationConfig(notificationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotificationConfig");
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
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains parameters of the new notification configuration. | [optional] |

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
| **201** | Success. The new notification configuration has been created. The response contains the ID of the new notification configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createNotificationConfigWithHttpInfo

> ApiResponse<Void> createNotificationConfig createNotificationConfigWithHttpInfo(notificationConfig)

Creates a new notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains parameters of the new notification configuration.
        try {
            ApiResponse<Void> response = apiInstance.createNotificationConfigWithHttpInfo(notificationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#createNotificationConfig");
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
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains parameters of the new notification configuration. | [optional] |

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
| **201** | Success. The new notification configuration has been created. The response contains the ID of the new notification configuration. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteNotificationConfig

> void deleteNotificationConfig(id)

Deletes the specified notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be deleted.
        try {
            apiInstance.deleteNotificationConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be deleted. | |

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
| **204** | Success. The notification configuration has been deleted. The response doesn&#39;t have a body. |  -  |

## deleteNotificationConfigWithHttpInfo

> ApiResponse<Void> deleteNotificationConfig deleteNotificationConfigWithHttpInfo(id)

Deletes the specified notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteNotificationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#deleteNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be deleted. | |

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
| **204** | Success. The notification configuration has been deleted. The response doesn&#39;t have a body. |  -  |


## getNotificationConfig

> NotificationConfig getNotificationConfig(id)

Gets the properties of the specified notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required notification configuration.
        try {
            NotificationConfig result = apiInstance.getNotificationConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#getNotificationConfig");
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
| **id** | **UUID**| The ID of the required notification configuration. | |

### Return type

[**NotificationConfig**](NotificationConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getNotificationConfigWithHttpInfo

> ApiResponse<NotificationConfig> getNotificationConfig getNotificationConfigWithHttpInfo(id)

Gets the properties of the specified notification configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required notification configuration.
        try {
            ApiResponse<NotificationConfig> response = apiInstance.getNotificationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#getNotificationConfig");
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
| **id** | **UUID**| The ID of the required notification configuration. | |

### Return type

ApiResponse<[**NotificationConfig**](NotificationConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listNotificationConfigs

> NotificationConfigStubListDto listNotificationConfigs()

Lists all notification configurations available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        try {
            NotificationConfigStubListDto result = apiInstance.listNotificationConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#listNotificationConfigs");
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

[**NotificationConfigStubListDto**](NotificationConfigStubListDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listNotificationConfigsWithHttpInfo

> ApiResponse<NotificationConfigStubListDto> listNotificationConfigs listNotificationConfigsWithHttpInfo()

Lists all notification configurations available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        try {
            ApiResponse<NotificationConfigStubListDto> response = apiInstance.listNotificationConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#listNotificationConfigs");
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

ApiResponse<[**NotificationConfigStubListDto**](NotificationConfigStubListDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateNotificationConfig

> NotificationConfigStub updateNotificationConfig(id, notificationConfig)

Updates an existing notification configuration or creates a new one

If a notification configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be updated.    If you set the ID in the body as well, it must match this ID.
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains updated parameters of the notification configuration.
        try {
            NotificationConfigStub result = apiInstance.updateNotificationConfig(id, notificationConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#updateNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains updated parameters of the notification configuration. | [optional] |

### Return type

[**NotificationConfigStub**](NotificationConfigStub.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new notification configuration has been created. The response contains the ID of the new notification configuration. |  -  |
| **204** | Success. The notification configuration has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateNotificationConfigWithHttpInfo

> ApiResponse<NotificationConfigStub> updateNotificationConfig updateNotificationConfigWithHttpInfo(id, notificationConfig)

Updates an existing notification configuration or creates a new one

If a notification configuration with the specified ID doesn&#39;t exist, a new configuration is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be updated.    If you set the ID in the body as well, it must match this ID.
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains updated parameters of the notification configuration.
        try {
            ApiResponse<NotificationConfigStub> response = apiInstance.updateNotificationConfigWithHttpInfo(id, notificationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#updateNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains updated parameters of the notification configuration. | [optional] |

### Return type

ApiResponse<[**NotificationConfigStub**](NotificationConfigStub.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The new notification configuration has been created. The response contains the ID of the new notification configuration. |  -  |
| **204** | Success. The notification configuration has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateNotificationConfig

> void validateCreateNotificationConfig(notificationConfig)

Validates the payload for the &#x60;POST /notifications&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains the notification configuration to be validated.
        try {
            apiInstance.validateCreateNotificationConfig(notificationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#validateCreateNotificationConfig");
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
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains the notification configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateNotificationConfigWithHttpInfo

> ApiResponse<Void> validateCreateNotificationConfig validateCreateNotificationConfigWithHttpInfo(notificationConfig)

Validates the payload for the &#x60;POST /notifications&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains the notification configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateNotificationConfigWithHttpInfo(notificationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#validateCreateNotificationConfig");
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
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains the notification configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateNotificationConfig

> void validateUpdateNotificationConfig(id, notificationConfig)

Validates the payload the &#x60;PUT /notifications/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be validated.
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains the notification configuration to be validated.
        try {
            apiInstance.validateUpdateNotificationConfig(id, notificationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#validateUpdateNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be validated. | |
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains the notification configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateNotificationConfigWithHttpInfo

> ApiResponse<Void> validateUpdateNotificationConfig validateUpdateNotificationConfigWithHttpInfo(id, notificationConfig)

Validates the payload the &#x60;PUT /notifications/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.NotificationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        NotificationsApi apiInstance = new NotificationsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the notification configuration to be validated.
        NotificationConfig notificationConfig = new NotificationConfig(); // NotificationConfig | The JSON body of the request. Contains the notification configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateNotificationConfigWithHttpInfo(id, notificationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationsApi#validateUpdateNotificationConfig");
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
| **id** | **UUID**| The ID of the notification configuration to be validated. | |
| **notificationConfig** | [**NotificationConfig**](NotificationConfig.md)| The JSON body of the request. Contains the notification configuration to be validated. | [optional] |

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
| **204** | Validated. The submitted configuration is valid. The response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

