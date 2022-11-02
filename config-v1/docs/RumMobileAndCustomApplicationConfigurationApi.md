# RumMobileAndCustomApplicationConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#createMobileApplicationConfig) | **POST** /applications/mobile | Creates a new mobile or custom application |
| [**createMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#createMobileApplicationConfigWithHttpInfo) | **POST** /applications/mobile | Creates a new mobile or custom application |
| [**createMobileKeyUserAction**](RumMobileAndCustomApplicationConfigurationApi.md#createMobileKeyUserAction) | **POST** /applications/mobile/{applicationId}/keyUserActions/{actionName} | Marks the user action as a key user action in the specified application |
| [**createMobileKeyUserActionWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#createMobileKeyUserActionWithHttpInfo) | **POST** /applications/mobile/{applicationId}/keyUserActions/{actionName} | Marks the user action as a key user action in the specified application |
| [**createSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#createSessionProperty) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties | Creates a new mobile session or user action property for the specified application |
| [**createSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#createSessionPropertyWithHttpInfo) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties | Creates a new mobile session or user action property for the specified application |
| [**deleteMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#deleteMobileApplicationConfig) | **DELETE** /applications/mobile/{id} | Deletes the specified mobile or custom application |
| [**deleteMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#deleteMobileApplicationConfigWithHttpInfo) | **DELETE** /applications/mobile/{id} | Deletes the specified mobile or custom application |
| [**deleteMobileKeyUserAction**](RumMobileAndCustomApplicationConfigurationApi.md#deleteMobileKeyUserAction) | **DELETE** /applications/mobile/{applicationId}/keyUserActions/{actionName} | Removes the specified user action from the list of key user actions in the specified application |
| [**deleteMobileKeyUserActionWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#deleteMobileKeyUserActionWithHttpInfo) | **DELETE** /applications/mobile/{applicationId}/keyUserActions/{actionName} | Removes the specified user action from the list of key user actions in the specified application |
| [**deleteSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#deleteSessionProperty) | **DELETE** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Deletes the specified mobile session or user action property for an application |
| [**deleteSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#deleteSessionPropertyWithHttpInfo) | **DELETE** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Deletes the specified mobile session or user action property for an application |
| [**getMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#getMobileApplicationConfig) | **GET** /applications/mobile/{id} | Gets the configuration of the specified mobile or custom application |
| [**getMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#getMobileApplicationConfigWithHttpInfo) | **GET** /applications/mobile/{id} | Gets the configuration of the specified mobile or custom application |
| [**getSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#getSessionProperty) | **GET** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Gets the specified mobile session or user action property of an application |
| [**getSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#getSessionPropertyWithHttpInfo) | **GET** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Gets the specified mobile session or user action property of an application |
| [**listMobileApplicationConfigs**](RumMobileAndCustomApplicationConfigurationApi.md#listMobileApplicationConfigs) | **GET** /applications/mobile | Lists all existing mobile and custom applications |
| [**listMobileApplicationConfigsWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#listMobileApplicationConfigsWithHttpInfo) | **GET** /applications/mobile | Lists all existing mobile and custom applications |
| [**listMobileKeyUserActions**](RumMobileAndCustomApplicationConfigurationApi.md#listMobileKeyUserActions) | **GET** /applications/mobile/{applicationId}/keyUserActions | Gets the list of key user actions in the specified application |
| [**listMobileKeyUserActionsWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#listMobileKeyUserActionsWithHttpInfo) | **GET** /applications/mobile/{applicationId}/keyUserActions | Gets the list of key user actions in the specified application |
| [**listSessionProperties**](RumMobileAndCustomApplicationConfigurationApi.md#listSessionProperties) | **GET** /applications/mobile/{applicationId}/userActionAndSessionProperties | Lists all mobile session and user action properties for the specified application |
| [**listSessionPropertiesWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#listSessionPropertiesWithHttpInfo) | **GET** /applications/mobile/{applicationId}/userActionAndSessionProperties | Lists all mobile session and user action properties for the specified application |
| [**updateMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#updateMobileApplicationConfig) | **PUT** /applications/mobile/{id} | Updates the configuration of the specified mobile or custom application |
| [**updateMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#updateMobileApplicationConfigWithHttpInfo) | **PUT** /applications/mobile/{id} | Updates the configuration of the specified mobile or custom application |
| [**updateSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#updateSessionProperty) | **PUT** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Updates the specified mobile session or user action property for an application |
| [**updateSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#updateSessionPropertyWithHttpInfo) | **PUT** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key} | Updates the specified mobile session or user action property for an application |
| [**validateCreateMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#validateCreateMobileApplicationConfig) | **POST** /applications/mobile/validator | Validates the payload for the &#x60;POST /applications/mobile&#x60; request |
| [**validateCreateMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#validateCreateMobileApplicationConfigWithHttpInfo) | **POST** /applications/mobile/validator | Validates the payload for the &#x60;POST /applications/mobile&#x60; request |
| [**validateCreateSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#validateCreateSessionProperty) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties/validator | Validates the payload for the &#x60;POST /applications/mobile/{applicationId}/userActionAndSessionProperties&#x60; request |
| [**validateCreateSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#validateCreateSessionPropertyWithHttpInfo) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties/validator | Validates the payload for the &#x60;POST /applications/mobile/{applicationId}/userActionAndSessionProperties&#x60; request |
| [**validateUpdateMobileApplicationConfig**](RumMobileAndCustomApplicationConfigurationApi.md#validateUpdateMobileApplicationConfig) | **POST** /applications/mobile/{id}/validator | Validates the payload for the &#x60;PUT /applications/mobile/{id}&#x60; request. |
| [**validateUpdateMobileApplicationConfigWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#validateUpdateMobileApplicationConfigWithHttpInfo) | **POST** /applications/mobile/{id}/validator | Validates the payload for the &#x60;PUT /applications/mobile/{id}&#x60; request. |
| [**validateUpdateSessionProperty**](RumMobileAndCustomApplicationConfigurationApi.md#validateUpdateSessionProperty) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}/validator | Validates the payload for the &#x60;PUT /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}&#x60; request |
| [**validateUpdateSessionPropertyWithHttpInfo**](RumMobileAndCustomApplicationConfigurationApi.md#validateUpdateSessionPropertyWithHttpInfo) | **POST** /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}/validator | Validates the payload for the &#x60;PUT /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}&#x60; request |



## createMobileApplicationConfig

> EntityShortRepresentation createMobileApplicationConfig(newMobileCustomAppConfig)

Creates a new mobile or custom application

The body must not provide an identifier. An identifier is assigned automatically by Dynatrace.   You can, however, provide your own applicationId. If you don&#39;t specify an applicationId, it is assigned automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        NewMobileCustomAppConfig newMobileCustomAppConfig = new NewMobileCustomAppConfig(); // NewMobileCustomAppConfig | The JSON body of the request. Contains the parameters of the new mobile or custom application.
        try {
            EntityShortRepresentation result = apiInstance.createMobileApplicationConfig(newMobileCustomAppConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createMobileApplicationConfig");
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
| **newMobileCustomAppConfig** | [**NewMobileCustomAppConfig**](NewMobileCustomAppConfig.md)| The JSON body of the request. Contains the parameters of the new mobile or custom application. | [optional] |

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
| **201** | Success. The application has been created. The response contains the identifier and name of the new application. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **409** | Failed. The applicationId is already used by another application. |  -  |

## createMobileApplicationConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createMobileApplicationConfig createMobileApplicationConfigWithHttpInfo(newMobileCustomAppConfig)

Creates a new mobile or custom application

The body must not provide an identifier. An identifier is assigned automatically by Dynatrace.   You can, however, provide your own applicationId. If you don&#39;t specify an applicationId, it is assigned automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        NewMobileCustomAppConfig newMobileCustomAppConfig = new NewMobileCustomAppConfig(); // NewMobileCustomAppConfig | The JSON body of the request. Contains the parameters of the new mobile or custom application.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createMobileApplicationConfigWithHttpInfo(newMobileCustomAppConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createMobileApplicationConfig");
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
| **newMobileCustomAppConfig** | [**NewMobileCustomAppConfig**](NewMobileCustomAppConfig.md)| The JSON body of the request. Contains the parameters of the new mobile or custom application. | [optional] |

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
| **201** | Success. The application has been created. The response contains the identifier and name of the new application. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **409** | Failed. The applicationId is already used by another application. |  -  |


## createMobileKeyUserAction

> KeyUserActionMobile createMobileKeyUserAction(applicationId, actionName)

Marks the user action as a key user action in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String actionName = "actionName_example"; // String | The name of the user action to be marked as a key user action.
        try {
            KeyUserActionMobile result = apiInstance.createMobileKeyUserAction(applicationId, actionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createMobileKeyUserAction");
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
| **applicationId** | **String**| The ID of the required application. | |
| **actionName** | **String**| The name of the user action to be marked as a key user action. | |

### Return type

[**KeyUserActionMobile**](KeyUserActionMobile.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The action has been marked as a key user action. The response contains its name. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |
| **409** | Failed. The max number of key user actions has been reached for the application. |  -  |

## createMobileKeyUserActionWithHttpInfo

> ApiResponse<KeyUserActionMobile> createMobileKeyUserAction createMobileKeyUserActionWithHttpInfo(applicationId, actionName)

Marks the user action as a key user action in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String actionName = "actionName_example"; // String | The name of the user action to be marked as a key user action.
        try {
            ApiResponse<KeyUserActionMobile> response = apiInstance.createMobileKeyUserActionWithHttpInfo(applicationId, actionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createMobileKeyUserAction");
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
| **applicationId** | **String**| The ID of the required application. | |
| **actionName** | **String**| The name of the user action to be marked as a key user action. | |

### Return type

ApiResponse<[**KeyUserActionMobile**](KeyUserActionMobile.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The action has been marked as a key user action. The response contains its name. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |
| **409** | Failed. The max number of key user actions has been reached for the application. |  -  |


## createSessionProperty

> MobileSessionUserActionPropertyShort createSessionProperty(applicationId, mobileSessionUserActionProperty)

Creates a new mobile session or user action property for the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        MobileSessionUserActionProperty mobileSessionUserActionProperty = new MobileSessionUserActionProperty(); // MobileSessionUserActionProperty | The JSON body of the request. Contains the configuration of the property.
        try {
            MobileSessionUserActionPropertyShort result = apiInstance.createSessionProperty(applicationId, mobileSessionUserActionProperty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **mobileSessionUserActionProperty** | [**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)| The JSON body of the request. Contains the configuration of the property. | [optional] |

### Return type

[**MobileSessionUserActionPropertyShort**](MobileSessionUserActionPropertyShort.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The property has been created. The response contains the ID of the new property. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createSessionPropertyWithHttpInfo

> ApiResponse<MobileSessionUserActionPropertyShort> createSessionProperty createSessionPropertyWithHttpInfo(applicationId, mobileSessionUserActionProperty)

Creates a new mobile session or user action property for the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        MobileSessionUserActionProperty mobileSessionUserActionProperty = new MobileSessionUserActionProperty(); // MobileSessionUserActionProperty | The JSON body of the request. Contains the configuration of the property.
        try {
            ApiResponse<MobileSessionUserActionPropertyShort> response = apiInstance.createSessionPropertyWithHttpInfo(applicationId, mobileSessionUserActionProperty);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#createSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **mobileSessionUserActionProperty** | [**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)| The JSON body of the request. Contains the configuration of the property. | [optional] |

### Return type

ApiResponse<[**MobileSessionUserActionPropertyShort**](MobileSessionUserActionPropertyShort.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The property has been created. The response contains the ID of the new property. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteMobileApplicationConfig

> void deleteMobileApplicationConfig(id)

Deletes the specified mobile or custom application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the application to be deleted.
        try {
            apiInstance.deleteMobileApplicationConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteMobileApplicationConfig");
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
| **id** | **String**| The ID of the application to be deleted. | |

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
| **204** | Success. The application has been deleted. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## deleteMobileApplicationConfigWithHttpInfo

> ApiResponse<Void> deleteMobileApplicationConfig deleteMobileApplicationConfigWithHttpInfo(id)

Deletes the specified mobile or custom application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the application to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteMobileApplicationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteMobileApplicationConfig");
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
| **id** | **String**| The ID of the application to be deleted. | |

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
| **204** | Success. The application has been deleted. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## deleteMobileKeyUserAction

> void deleteMobileKeyUserAction(applicationId, actionName)

Removes the specified user action from the list of key user actions in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String actionName = "actionName_example"; // String | The ID of the user action to be removed from the key user actions list.
        try {
            apiInstance.deleteMobileKeyUserAction(applicationId, actionName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteMobileKeyUserAction");
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
| **applicationId** | **String**| The ID of the required application. | |
| **actionName** | **String**| The ID of the user action to be removed from the key user actions list. | |

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
| **204** | Success. The user action has been removed from the list of key user actions. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## deleteMobileKeyUserActionWithHttpInfo

> ApiResponse<Void> deleteMobileKeyUserAction deleteMobileKeyUserActionWithHttpInfo(applicationId, actionName)

Removes the specified user action from the list of key user actions in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String actionName = "actionName_example"; // String | The ID of the user action to be removed from the key user actions list.
        try {
            ApiResponse<Void> response = apiInstance.deleteMobileKeyUserActionWithHttpInfo(applicationId, actionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteMobileKeyUserAction");
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
| **applicationId** | **String**| The ID of the required application. | |
| **actionName** | **String**| The ID of the user action to be removed from the key user actions list. | |

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
| **204** | Success. The user action has been removed from the list of key user actions. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## deleteSessionProperty

> void deleteSessionProperty(applicationId, key)

Deletes the specified mobile session or user action property for an application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        try {
            apiInstance.deleteSessionProperty(applicationId, key);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |

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
| **204** | Success. The property has been deleted. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## deleteSessionPropertyWithHttpInfo

> ApiResponse<Void> deleteSessionProperty deleteSessionPropertyWithHttpInfo(applicationId, key)

Deletes the specified mobile session or user action property for an application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        try {
            ApiResponse<Void> response = apiInstance.deleteSessionPropertyWithHttpInfo(applicationId, key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#deleteSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |

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
| **204** | Success. The property has been deleted. The response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## getMobileApplicationConfig

> MobileCustomAppConfig getMobileApplicationConfig(id)

Gets the configuration of the specified mobile or custom application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required mobile or custom application.
        try {
            MobileCustomAppConfig result = apiInstance.getMobileApplicationConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#getMobileApplicationConfig");
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
| **id** | **String**| The ID of the required mobile or custom application. | |

### Return type

[**MobileCustomAppConfig**](MobileCustomAppConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## getMobileApplicationConfigWithHttpInfo

> ApiResponse<MobileCustomAppConfig> getMobileApplicationConfig getMobileApplicationConfigWithHttpInfo(id)

Gets the configuration of the specified mobile or custom application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required mobile or custom application.
        try {
            ApiResponse<MobileCustomAppConfig> response = apiInstance.getMobileApplicationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#getMobileApplicationConfig");
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
| **id** | **String**| The ID of the required mobile or custom application. | |

### Return type

ApiResponse<[**MobileCustomAppConfig**](MobileCustomAppConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## getSessionProperty

> MobileSessionUserActionProperty getSessionProperty(applicationId, key)

Gets the specified mobile session or user action property of an application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        try {
            MobileSessionUserActionProperty result = apiInstance.getSessionProperty(applicationId, key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#getSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |

### Return type

[**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## getSessionPropertyWithHttpInfo

> ApiResponse<MobileSessionUserActionProperty> getSessionProperty getSessionPropertyWithHttpInfo(applicationId, key)

Gets the specified mobile session or user action property of an application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        try {
            ApiResponse<MobileSessionUserActionProperty> response = apiInstance.getSessionPropertyWithHttpInfo(applicationId, key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#getSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |

### Return type

ApiResponse<[**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## listMobileApplicationConfigs

> StubList listMobileApplicationConfigs()

Lists all existing mobile and custom applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        try {
            StubList result = apiInstance.listMobileApplicationConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listMobileApplicationConfigs");
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

## listMobileApplicationConfigsWithHttpInfo

> ApiResponse<StubList> listMobileApplicationConfigs listMobileApplicationConfigsWithHttpInfo()

Lists all existing mobile and custom applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listMobileApplicationConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listMobileApplicationConfigs");
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


## listMobileKeyUserActions

> KeyUserActionMobileList listMobileKeyUserActions(applicationId)

Gets the list of key user actions in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        try {
            KeyUserActionMobileList result = apiInstance.listMobileKeyUserActions(applicationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listMobileKeyUserActions");
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
| **applicationId** | **String**| The ID of the required application. | |

### Return type

[**KeyUserActionMobileList**](KeyUserActionMobileList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## listMobileKeyUserActionsWithHttpInfo

> ApiResponse<KeyUserActionMobileList> listMobileKeyUserActions listMobileKeyUserActionsWithHttpInfo(applicationId)

Gets the list of key user actions in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        try {
            ApiResponse<KeyUserActionMobileList> response = apiInstance.listMobileKeyUserActionsWithHttpInfo(applicationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listMobileKeyUserActions");
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
| **applicationId** | **String**| The ID of the required application. | |

### Return type

ApiResponse<[**KeyUserActionMobileList**](KeyUserActionMobileList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## listSessionProperties

> MobileSessionUserActionPropertyList listSessionProperties(applicationId)

Lists all mobile session and user action properties for the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        try {
            MobileSessionUserActionPropertyList result = apiInstance.listSessionProperties(applicationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listSessionProperties");
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
| **applicationId** | **String**| The ID of the required application. | |

### Return type

[**MobileSessionUserActionPropertyList**](MobileSessionUserActionPropertyList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listSessionPropertiesWithHttpInfo

> ApiResponse<MobileSessionUserActionPropertyList> listSessionProperties listSessionPropertiesWithHttpInfo(applicationId)

Lists all mobile session and user action properties for the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        try {
            ApiResponse<MobileSessionUserActionPropertyList> response = apiInstance.listSessionPropertiesWithHttpInfo(applicationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#listSessionProperties");
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
| **applicationId** | **String**| The ID of the required application. | |

### Return type

ApiResponse<[**MobileSessionUserActionPropertyList**](MobileSessionUserActionPropertyList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateMobileApplicationConfig

> void updateMobileApplicationConfig(id, mobileCustomAppConfig)

Updates the configuration of the specified mobile or custom application

You can&#39;t change applicationId and applicationType with this request.  All other values must be included in the body, depending on the applicationType.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the application to be updated.
        MobileCustomAppConfig mobileCustomAppConfig = new MobileCustomAppConfig(); // MobileCustomAppConfig | The JSON body of the request. Contains updated configuration of the mobile or custom application.   Do not set the identifier in the body.
        try {
            apiInstance.updateMobileApplicationConfig(id, mobileCustomAppConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#updateMobileApplicationConfig");
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
| **id** | **String**| The ID of the application to be updated. | |
| **mobileCustomAppConfig** | [**MobileCustomAppConfig**](MobileCustomAppConfig.md)| The JSON body of the request. Contains updated configuration of the mobile or custom application.   Do not set the identifier in the body. | [optional] |

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
| **204** | Success. The application has been updated. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateMobileApplicationConfigWithHttpInfo

> ApiResponse<Void> updateMobileApplicationConfig updateMobileApplicationConfigWithHttpInfo(id, mobileCustomAppConfig)

Updates the configuration of the specified mobile or custom application

You can&#39;t change applicationId and applicationType with this request.  All other values must be included in the body, depending on the applicationType.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the application to be updated.
        MobileCustomAppConfig mobileCustomAppConfig = new MobileCustomAppConfig(); // MobileCustomAppConfig | The JSON body of the request. Contains updated configuration of the mobile or custom application.   Do not set the identifier in the body.
        try {
            ApiResponse<Void> response = apiInstance.updateMobileApplicationConfigWithHttpInfo(id, mobileCustomAppConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#updateMobileApplicationConfig");
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
| **id** | **String**| The ID of the application to be updated. | |
| **mobileCustomAppConfig** | [**MobileCustomAppConfig**](MobileCustomAppConfig.md)| The JSON body of the request. Contains updated configuration of the mobile or custom application.   Do not set the identifier in the body. | [optional] |

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
| **204** | Success. The application has been updated. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateSessionProperty

> MobileSessionUserActionPropertyShort updateSessionProperty(applicationId, key, mobileSessionUserActionPropertyUpd)

Updates the specified mobile session or user action property for an application

If the property with the specified ID does not exist, a new property is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        MobileSessionUserActionPropertyUpd mobileSessionUserActionPropertyUpd = new MobileSessionUserActionPropertyUpd(); // MobileSessionUserActionPropertyUpd | The JSON body of the request. Contains the configuration of the property.
        try {
            MobileSessionUserActionPropertyShort result = apiInstance.updateSessionProperty(applicationId, key, mobileSessionUserActionPropertyUpd);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#updateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |
| **mobileSessionUserActionPropertyUpd** | [**MobileSessionUserActionPropertyUpd**](MobileSessionUserActionPropertyUpd.md)| The JSON body of the request. Contains the configuration of the property. | [optional] |

### Return type

[**MobileSessionUserActionPropertyShort**](MobileSessionUserActionPropertyShort.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The property has been created. The response contains the ID of the new property. |  -  |
| **204** | Success. The property has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateSessionPropertyWithHttpInfo

> ApiResponse<MobileSessionUserActionPropertyShort> updateSessionProperty updateSessionPropertyWithHttpInfo(applicationId, key, mobileSessionUserActionPropertyUpd)

Updates the specified mobile session or user action property for an application

If the property with the specified ID does not exist, a new property is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        MobileSessionUserActionPropertyUpd mobileSessionUserActionPropertyUpd = new MobileSessionUserActionPropertyUpd(); // MobileSessionUserActionPropertyUpd | The JSON body of the request. Contains the configuration of the property.
        try {
            ApiResponse<MobileSessionUserActionPropertyShort> response = apiInstance.updateSessionPropertyWithHttpInfo(applicationId, key, mobileSessionUserActionPropertyUpd);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#updateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |
| **mobileSessionUserActionPropertyUpd** | [**MobileSessionUserActionPropertyUpd**](MobileSessionUserActionPropertyUpd.md)| The JSON body of the request. Contains the configuration of the property. | [optional] |

### Return type

ApiResponse<[**MobileSessionUserActionPropertyShort**](MobileSessionUserActionPropertyShort.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The property has been created. The response contains the ID of the new property. |  -  |
| **204** | Success. The property has been updated. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateMobileApplicationConfig

> void validateCreateMobileApplicationConfig(newMobileCustomAppConfig)

Validates the payload for the &#x60;POST /applications/mobile&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        NewMobileCustomAppConfig newMobileCustomAppConfig = new NewMobileCustomAppConfig(); // NewMobileCustomAppConfig | The JSON body of the request. Contains the mobile or custom application configuration to be validated.
        try {
            apiInstance.validateCreateMobileApplicationConfig(newMobileCustomAppConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateCreateMobileApplicationConfig");
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
| **newMobileCustomAppConfig** | [**NewMobileCustomAppConfig**](NewMobileCustomAppConfig.md)| The JSON body of the request. Contains the mobile or custom application configuration to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateMobileApplicationConfigWithHttpInfo

> ApiResponse<Void> validateCreateMobileApplicationConfig validateCreateMobileApplicationConfigWithHttpInfo(newMobileCustomAppConfig)

Validates the payload for the &#x60;POST /applications/mobile&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        NewMobileCustomAppConfig newMobileCustomAppConfig = new NewMobileCustomAppConfig(); // NewMobileCustomAppConfig | The JSON body of the request. Contains the mobile or custom application configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateMobileApplicationConfigWithHttpInfo(newMobileCustomAppConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateCreateMobileApplicationConfig");
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
| **newMobileCustomAppConfig** | [**NewMobileCustomAppConfig**](NewMobileCustomAppConfig.md)| The JSON body of the request. Contains the mobile or custom application configuration to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateSessionProperty

> void validateCreateSessionProperty(applicationId, mobileSessionUserActionProperty)

Validates the payload for the &#x60;POST /applications/mobile/{applicationId}/userActionAndSessionProperties&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        MobileSessionUserActionProperty mobileSessionUserActionProperty = new MobileSessionUserActionProperty(); // MobileSessionUserActionProperty | The JSON body of the request. Contains the configuration of the property to be validated.
        try {
            apiInstance.validateCreateSessionProperty(applicationId, mobileSessionUserActionProperty);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateCreateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **mobileSessionUserActionProperty** | [**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)| The JSON body of the request. Contains the configuration of the property to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateSessionPropertyWithHttpInfo

> ApiResponse<Void> validateCreateSessionProperty validateCreateSessionPropertyWithHttpInfo(applicationId, mobileSessionUserActionProperty)

Validates the payload for the &#x60;POST /applications/mobile/{applicationId}/userActionAndSessionProperties&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        MobileSessionUserActionProperty mobileSessionUserActionProperty = new MobileSessionUserActionProperty(); // MobileSessionUserActionProperty | The JSON body of the request. Contains the configuration of the property to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateSessionPropertyWithHttpInfo(applicationId, mobileSessionUserActionProperty);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateCreateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **mobileSessionUserActionProperty** | [**MobileSessionUserActionProperty**](MobileSessionUserActionProperty.md)| The JSON body of the request. Contains the configuration of the property to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateMobileApplicationConfig

> void validateUpdateMobileApplicationConfig(id, mobileCustomAppConfig)

Validates the payload for the &#x60;PUT /applications/mobile/{id}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the mobile or custom application to be validated.
        MobileCustomAppConfig mobileCustomAppConfig = new MobileCustomAppConfig(); // MobileCustomAppConfig | The JSON body of the request. Contains the mobile or custom application configuration to be validated.
        try {
            apiInstance.validateUpdateMobileApplicationConfig(id, mobileCustomAppConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateUpdateMobileApplicationConfig");
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
| **id** | **String**| The ID of the mobile or custom application to be validated. | |
| **mobileCustomAppConfig** | [**MobileCustomAppConfig**](MobileCustomAppConfig.md)| The JSON body of the request. Contains the mobile or custom application configuration to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateMobileApplicationConfigWithHttpInfo

> ApiResponse<Void> validateUpdateMobileApplicationConfig validateUpdateMobileApplicationConfigWithHttpInfo(id, mobileCustomAppConfig)

Validates the payload for the &#x60;PUT /applications/mobile/{id}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the mobile or custom application to be validated.
        MobileCustomAppConfig mobileCustomAppConfig = new MobileCustomAppConfig(); // MobileCustomAppConfig | The JSON body of the request. Contains the mobile or custom application configuration to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateMobileApplicationConfigWithHttpInfo(id, mobileCustomAppConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateUpdateMobileApplicationConfig");
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
| **id** | **String**| The ID of the mobile or custom application to be validated. | |
| **mobileCustomAppConfig** | [**MobileCustomAppConfig**](MobileCustomAppConfig.md)| The JSON body of the request. Contains the mobile or custom application configuration to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateSessionProperty

> void validateUpdateSessionProperty(applicationId, key, mobileSessionUserActionPropertyUpd)

Validates the payload for the &#x60;PUT /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        MobileSessionUserActionPropertyUpd mobileSessionUserActionPropertyUpd = new MobileSessionUserActionPropertyUpd(); // MobileSessionUserActionPropertyUpd | The JSON body of the request. Contains the configuration of the property to be validated.
        try {
            apiInstance.validateUpdateSessionProperty(applicationId, key, mobileSessionUserActionPropertyUpd);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateUpdateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |
| **mobileSessionUserActionPropertyUpd** | [**MobileSessionUserActionPropertyUpd**](MobileSessionUserActionPropertyUpd.md)| The JSON body of the request. Contains the configuration of the property to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateSessionPropertyWithHttpInfo

> ApiResponse<Void> validateUpdateSessionProperty validateUpdateSessionPropertyWithHttpInfo(applicationId, key, mobileSessionUserActionPropertyUpd)

Validates the payload for the &#x60;PUT /applications/mobile/{applicationId}/userActionAndSessionProperties/{key}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileAndCustomApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileAndCustomApplicationConfigurationApi apiInstance = new RumMobileAndCustomApplicationConfigurationApi(defaultClient);
        String applicationId = "applicationId_example"; // String | The ID of the required application.
        String key = "key_example"; // String | The key of the required mobile session or user action property.
        MobileSessionUserActionPropertyUpd mobileSessionUserActionPropertyUpd = new MobileSessionUserActionPropertyUpd(); // MobileSessionUserActionPropertyUpd | The JSON body of the request. Contains the configuration of the property to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateSessionPropertyWithHttpInfo(applicationId, key, mobileSessionUserActionPropertyUpd);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileAndCustomApplicationConfigurationApi#validateUpdateSessionProperty");
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
| **applicationId** | **String**| The ID of the required application. | |
| **key** | **String**| The key of the required mobile session or user action property. | |
| **mobileSessionUserActionPropertyUpd** | [**MobileSessionUserActionPropertyUpd**](MobileSessionUserActionPropertyUpd.md)| The JSON body of the request. Contains the configuration of the property to be validated. | [optional] |

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
| **204** | Success. The submitted configuration is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

