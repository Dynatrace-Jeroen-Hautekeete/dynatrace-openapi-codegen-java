# RumWebApplicationConfigurationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKeyUserAction**](RumWebApplicationConfigurationApi.md#createKeyUserAction) | **POST** /applications/web/{id}/keyUserActions | Marks the user action as a key user action in the specified web application |
| [**createKeyUserActionWithHttpInfo**](RumWebApplicationConfigurationApi.md#createKeyUserActionWithHttpInfo) | **POST** /applications/web/{id}/keyUserActions | Marks the user action as a key user action in the specified web application |
| [**createOrUpdateDefaultConfiguration**](RumWebApplicationConfigurationApi.md#createOrUpdateDefaultConfiguration) | **PUT** /applications/web/default | Updates the configuration of the default web application |
| [**createOrUpdateDefaultConfigurationWithHttpInfo**](RumWebApplicationConfigurationApi.md#createOrUpdateDefaultConfigurationWithHttpInfo) | **PUT** /applications/web/default | Updates the configuration of the default web application |
| [**createWebApplicationConfig**](RumWebApplicationConfigurationApi.md#createWebApplicationConfig) | **POST** /applications/web | Creates a new web application |
| [**createWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#createWebApplicationConfigWithHttpInfo) | **POST** /applications/web | Creates a new web application |
| [**deleteKeyUserAction**](RumWebApplicationConfigurationApi.md#deleteKeyUserAction) | **DELETE** /applications/web/{id}/keyUserActions/{keyUserActionId} | Removes the specified user action from the list of key user actions in the specified web application |
| [**deleteKeyUserActionWithHttpInfo**](RumWebApplicationConfigurationApi.md#deleteKeyUserActionWithHttpInfo) | **DELETE** /applications/web/{id}/keyUserActions/{keyUserActionId} | Removes the specified user action from the list of key user actions in the specified web application |
| [**deleteWebApplicationConfig**](RumWebApplicationConfigurationApi.md#deleteWebApplicationConfig) | **DELETE** /applications/web/{id} | Deletes the specified web application |
| [**deleteWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#deleteWebApplicationConfigWithHttpInfo) | **DELETE** /applications/web/{id} | Deletes the specified web application |
| [**getApplicationErrorConfig**](RumWebApplicationConfigurationApi.md#getApplicationErrorConfig) | **GET** /applications/web/{id}/errorRules | Gets the configuration of error rules in the specified application |
| [**getApplicationErrorConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#getApplicationErrorConfigWithHttpInfo) | **GET** /applications/web/{id}/errorRules | Gets the configuration of error rules in the specified application |
| [**getDataPrivacySettings**](RumWebApplicationConfigurationApi.md#getDataPrivacySettings) | **GET** /applications/web/{id}/dataPrivacy | Gets the data privacy settings of the specified web application |
| [**getDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#getDataPrivacySettingsWithHttpInfo) | **GET** /applications/web/{id}/dataPrivacy | Gets the data privacy settings of the specified web application |
| [**getDefaultApplication**](RumWebApplicationConfigurationApi.md#getDefaultApplication) | **GET** /applications/web/default | Gets the configuration of the default web application |
| [**getDefaultApplicationWithHttpInfo**](RumWebApplicationConfigurationApi.md#getDefaultApplicationWithHttpInfo) | **GET** /applications/web/default | Gets the configuration of the default web application |
| [**getDefaultApplicationDataPrivacySettings**](RumWebApplicationConfigurationApi.md#getDefaultApplicationDataPrivacySettings) | **GET** /applications/web/default/dataPrivacy | Gets the data privacy settings of the default web application |
| [**getDefaultApplicationDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#getDefaultApplicationDataPrivacySettingsWithHttpInfo) | **GET** /applications/web/default/dataPrivacy | Gets the data privacy settings of the default web application |
| [**getWebApplicationConfig**](RumWebApplicationConfigurationApi.md#getWebApplicationConfig) | **GET** /applications/web/{id} | Gets the configuration of the specified web application |
| [**getWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#getWebApplicationConfigWithHttpInfo) | **GET** /applications/web/{id} | Gets the configuration of the specified web application |
| [**listDataPrivacySettings**](RumWebApplicationConfigurationApi.md#listDataPrivacySettings) | **GET** /applications/web/dataPrivacy | Lists data privacy settings of all web applications |
| [**listDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#listDataPrivacySettingsWithHttpInfo) | **GET** /applications/web/dataPrivacy | Lists data privacy settings of all web applications |
| [**listKeyUserActions**](RumWebApplicationConfigurationApi.md#listKeyUserActions) | **GET** /applications/web/{id}/keyUserActions | Gets the list of key user actions in the specified web application |
| [**listKeyUserActionsWithHttpInfo**](RumWebApplicationConfigurationApi.md#listKeyUserActionsWithHttpInfo) | **GET** /applications/web/{id}/keyUserActions | Gets the list of key user actions in the specified web application |
| [**listWebApplicationConfigs**](RumWebApplicationConfigurationApi.md#listWebApplicationConfigs) | **GET** /applications/web | Lists all existing web applications |
| [**listWebApplicationConfigsWithHttpInfo**](RumWebApplicationConfigurationApi.md#listWebApplicationConfigsWithHttpInfo) | **GET** /applications/web | Lists all existing web applications |
| [**updateApplicationErrorConfig**](RumWebApplicationConfigurationApi.md#updateApplicationErrorConfig) | **PUT** /applications/web/{id}/errorRules | Updates the configuration of error rules in the specified application |
| [**updateApplicationErrorConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#updateApplicationErrorConfigWithHttpInfo) | **PUT** /applications/web/{id}/errorRules | Updates the configuration of error rules in the specified application |
| [**updateDataPrivacySettings**](RumWebApplicationConfigurationApi.md#updateDataPrivacySettings) | **PUT** /applications/web/{id}/dataPrivacy | Updates the data privacy settings of the specified web application |
| [**updateDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#updateDataPrivacySettingsWithHttpInfo) | **PUT** /applications/web/{id}/dataPrivacy | Updates the data privacy settings of the specified web application |
| [**updateDefaultApplicationDataPrivacySettings**](RumWebApplicationConfigurationApi.md#updateDefaultApplicationDataPrivacySettings) | **PUT** /applications/web/default/dataPrivacy | Updates the data privacy settings of the default web application |
| [**updateDefaultApplicationDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#updateDefaultApplicationDataPrivacySettingsWithHttpInfo) | **PUT** /applications/web/default/dataPrivacy | Updates the data privacy settings of the default web application |
| [**updateWebApplicationConfig**](RumWebApplicationConfigurationApi.md#updateWebApplicationConfig) | **PUT** /applications/web/{id} | Updates the configuration of the specified web application or creates a new one |
| [**updateWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#updateWebApplicationConfigWithHttpInfo) | **PUT** /applications/web/{id} | Updates the configuration of the specified web application or creates a new one |
| [**validateCreateWebApplicationConfig**](RumWebApplicationConfigurationApi.md#validateCreateWebApplicationConfig) | **POST** /applications/web/validator | Validates the configuration of the web application for the &#x60;POST /applications/web&#x60; request |
| [**validateCreateWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#validateCreateWebApplicationConfigWithHttpInfo) | **POST** /applications/web/validator | Validates the configuration of the web application for the &#x60;POST /applications/web&#x60; request |
| [**validateDataPrivacySettings**](RumWebApplicationConfigurationApi.md#validateDataPrivacySettings) | **POST** /applications/web/{id}/dataPrivacy/validator | Validates data privacy settings for the &#x60;PUT /applications/web/{id}/dataPrivacy&#x60; request |
| [**validateDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#validateDataPrivacySettingsWithHttpInfo) | **POST** /applications/web/{id}/dataPrivacy/validator | Validates data privacy settings for the &#x60;PUT /applications/web/{id}/dataPrivacy&#x60; request |
| [**validateDefaultApplicationDataPrivacySettings**](RumWebApplicationConfigurationApi.md#validateDefaultApplicationDataPrivacySettings) | **POST** /applications/web/default/dataPrivacy/validator | Validates data privacy settings of the default web application for the &#x60;PUT /applications/web/default/dataPrivacy&#x60; request |
| [**validateDefaultApplicationDataPrivacySettingsWithHttpInfo**](RumWebApplicationConfigurationApi.md#validateDefaultApplicationDataPrivacySettingsWithHttpInfo) | **POST** /applications/web/default/dataPrivacy/validator | Validates data privacy settings of the default web application for the &#x60;PUT /applications/web/default/dataPrivacy&#x60; request |
| [**validateDefaultConfiguration**](RumWebApplicationConfigurationApi.md#validateDefaultConfiguration) | **POST** /applications/web/default/validator | Validates the configuration of the default web application for the &#x60;PUT /applications/web/default&#x60; request |
| [**validateDefaultConfigurationWithHttpInfo**](RumWebApplicationConfigurationApi.md#validateDefaultConfigurationWithHttpInfo) | **POST** /applications/web/default/validator | Validates the configuration of the default web application for the &#x60;PUT /applications/web/default&#x60; request |
| [**validateUpdateWebApplicationConfig**](RumWebApplicationConfigurationApi.md#validateUpdateWebApplicationConfig) | **POST** /applications/web/{id}/validator | Validates the configuration of the web application for the &#x60;PUT /applications/web/{id}&#x60; request. |
| [**validateUpdateWebApplicationConfigWithHttpInfo**](RumWebApplicationConfigurationApi.md#validateUpdateWebApplicationConfigWithHttpInfo) | **POST** /applications/web/{id}/validator | Validates the configuration of the web application for the &#x60;PUT /applications/web/{id}&#x60; request. |



## createKeyUserAction

> EntityShortRepresentation createKeyUserAction(id, keyUserAction)

Marks the user action as a key user action in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        KeyUserAction keyUserAction = new KeyUserAction(); // KeyUserAction | The JSON body of the request. Contains the action to be marked as a key user action.
        try {
            EntityShortRepresentation result = apiInstance.createKeyUserAction(id, keyUserAction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createKeyUserAction");
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
| **id** | **String**| The ID of the required web application. | |
| **keyUserAction** | [**KeyUserAction**](KeyUserAction.md)| The JSON body of the request. Contains the action to be marked as a key user action. | [optional] |

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
| **201** | Success. The action has been marked as a key user action. The response contains its ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createKeyUserActionWithHttpInfo

> ApiResponse<EntityShortRepresentation> createKeyUserAction createKeyUserActionWithHttpInfo(id, keyUserAction)

Marks the user action as a key user action in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        KeyUserAction keyUserAction = new KeyUserAction(); // KeyUserAction | The JSON body of the request. Contains the action to be marked as a key user action.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createKeyUserActionWithHttpInfo(id, keyUserAction);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createKeyUserAction");
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
| **id** | **String**| The ID of the required web application. | |
| **keyUserAction** | [**KeyUserAction**](KeyUserAction.md)| The JSON body of the request. Contains the action to be marked as a key user action. | [optional] |

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
| **201** | Success. The action has been marked as a key user action. The response contains its ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createOrUpdateDefaultConfiguration

> void createOrUpdateDefaultConfiguration(webApplicationConfig)

Updates the configuration of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the new parameters of the default web application.
        try {
            apiInstance.createOrUpdateDefaultConfiguration(webApplicationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createOrUpdateDefaultConfiguration");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the new parameters of the default web application. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateDefaultConfigurationWithHttpInfo

> ApiResponse<Void> createOrUpdateDefaultConfiguration createOrUpdateDefaultConfigurationWithHttpInfo(webApplicationConfig)

Updates the configuration of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the new parameters of the default web application.
        try {
            ApiResponse<Void> response = apiInstance.createOrUpdateDefaultConfigurationWithHttpInfo(webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createOrUpdateDefaultConfiguration");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the new parameters of the default web application. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## createWebApplicationConfig

> EntityShortRepresentation createWebApplicationConfig(webApplicationConfig)

Creates a new web application

The body must not provide an ID as that will be automatically assigned by Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing parameters of the new web application configuraiton.
        try {
            EntityShortRepresentation result = apiInstance.createWebApplicationConfig(webApplicationConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createWebApplicationConfig");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing parameters of the new web application configuraiton. | [optional] |

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
| **201** | Success. The response body contains the ID and name of the new web application. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createWebApplicationConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createWebApplicationConfig createWebApplicationConfigWithHttpInfo(webApplicationConfig)

Creates a new web application

The body must not provide an ID as that will be automatically assigned by Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing parameters of the new web application configuraiton.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createWebApplicationConfigWithHttpInfo(webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#createWebApplicationConfig");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing parameters of the new web application configuraiton. | [optional] |

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
| **201** | Success. The response body contains the ID and name of the new web application. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteKeyUserAction

> void deleteKeyUserAction(id, keyUserActionId)

Removes the specified user action from the list of key user actions in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        String keyUserActionId = "keyUserActionId_example"; // String | The ID of the user action to be removed from the key user actions list.
        try {
            apiInstance.deleteKeyUserAction(id, keyUserActionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#deleteKeyUserAction");
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
| **id** | **String**| The ID of the required web application. | |
| **keyUserActionId** | **String**| The ID of the user action to be removed from the key user actions list. | |

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

## deleteKeyUserActionWithHttpInfo

> ApiResponse<Void> deleteKeyUserAction deleteKeyUserActionWithHttpInfo(id, keyUserActionId)

Removes the specified user action from the list of key user actions in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        String keyUserActionId = "keyUserActionId_example"; // String | The ID of the user action to be removed from the key user actions list.
        try {
            ApiResponse<Void> response = apiInstance.deleteKeyUserActionWithHttpInfo(id, keyUserActionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#deleteKeyUserAction");
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
| **id** | **String**| The ID of the required web application. | |
| **keyUserActionId** | **String**| The ID of the user action to be removed from the key user actions list. | |

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


## deleteWebApplicationConfig

> void deleteWebApplicationConfig(id)

Deletes the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to delete.
        try {
            apiInstance.deleteWebApplicationConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#deleteWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to delete. | |

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
| **204** | Success. The application has been deleted. The response does not have a body. |  -  |

## deleteWebApplicationConfigWithHttpInfo

> ApiResponse<Void> deleteWebApplicationConfig deleteWebApplicationConfigWithHttpInfo(id)

Deletes the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteWebApplicationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#deleteWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to delete. | |

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
| **204** | Success. The application has been deleted. The response does not have a body. |  -  |


## getApplicationErrorConfig

> ApplicationErrorRules getApplicationErrorConfig(id)

Gets the configuration of error rules in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        try {
            ApplicationErrorRules result = apiInstance.getApplicationErrorConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getApplicationErrorConfig");
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
| **id** | **String**| The ID of the required web application. | |

### Return type

[**ApplicationErrorRules**](ApplicationErrorRules.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getApplicationErrorConfigWithHttpInfo

> ApiResponse<ApplicationErrorRules> getApplicationErrorConfig getApplicationErrorConfigWithHttpInfo(id)

Gets the configuration of error rules in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        try {
            ApiResponse<ApplicationErrorRules> response = apiInstance.getApplicationErrorConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getApplicationErrorConfig");
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
| **id** | **String**| The ID of the required web application. | |

### Return type

ApiResponse<[**ApplicationErrorRules**](ApplicationErrorRules.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDataPrivacySettings

> ApplicationDataPrivacy getDataPrivacySettings(id)

Gets the data privacy settings of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application where you want to check data privacy settings.
        try {
            ApplicationDataPrivacy result = apiInstance.getDataPrivacySettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDataPrivacySettings");
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
| **id** | **String**| The ID of the web application where you want to check data privacy settings. | |

### Return type

[**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDataPrivacySettingsWithHttpInfo

> ApiResponse<ApplicationDataPrivacy> getDataPrivacySettings getDataPrivacySettingsWithHttpInfo(id)

Gets the data privacy settings of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application where you want to check data privacy settings.
        try {
            ApiResponse<ApplicationDataPrivacy> response = apiInstance.getDataPrivacySettingsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDataPrivacySettings");
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
| **id** | **String**| The ID of the web application where you want to check data privacy settings. | |

### Return type

ApiResponse<[**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDefaultApplication

> WebApplicationConfig getDefaultApplication()

Gets the configuration of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            WebApplicationConfig result = apiInstance.getDefaultApplication();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDefaultApplication");
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

[**WebApplicationConfig**](WebApplicationConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDefaultApplicationWithHttpInfo

> ApiResponse<WebApplicationConfig> getDefaultApplication getDefaultApplicationWithHttpInfo()

Gets the configuration of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApiResponse<WebApplicationConfig> response = apiInstance.getDefaultApplicationWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDefaultApplication");
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

ApiResponse<[**WebApplicationConfig**](WebApplicationConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDefaultApplicationDataPrivacySettings

> ApplicationDataPrivacy getDefaultApplicationDataPrivacySettings()

Gets the data privacy settings of the default web application

Default application is pre-configured in your Dynatrace environment. By default all the traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApplicationDataPrivacy result = apiInstance.getDefaultApplicationDataPrivacySettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDefaultApplicationDataPrivacySettings");
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

[**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDefaultApplicationDataPrivacySettingsWithHttpInfo

> ApiResponse<ApplicationDataPrivacy> getDefaultApplicationDataPrivacySettings getDefaultApplicationDataPrivacySettingsWithHttpInfo()

Gets the data privacy settings of the default web application

Default application is pre-configured in your Dynatrace environment. By default all the traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApiResponse<ApplicationDataPrivacy> response = apiInstance.getDefaultApplicationDataPrivacySettingsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getDefaultApplicationDataPrivacySettings");
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

ApiResponse<[**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getWebApplicationConfig

> WebApplicationConfig getWebApplicationConfig(id)

Gets the configuration of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the requested web application.
        try {
            WebApplicationConfig result = apiInstance.getWebApplicationConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getWebApplicationConfig");
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
| **id** | **String**| The ID of the requested web application. | |

### Return type

[**WebApplicationConfig**](WebApplicationConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getWebApplicationConfigWithHttpInfo

> ApiResponse<WebApplicationConfig> getWebApplicationConfig getWebApplicationConfigWithHttpInfo(id)

Gets the configuration of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the requested web application.
        try {
            ApiResponse<WebApplicationConfig> response = apiInstance.getWebApplicationConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#getWebApplicationConfig");
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
| **id** | **String**| The ID of the requested web application. | |

### Return type

ApiResponse<[**WebApplicationConfig**](WebApplicationConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listDataPrivacySettings

> ApplicationDataPrivacyList listDataPrivacySettings()

Lists data privacy settings of all web applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApplicationDataPrivacyList result = apiInstance.listDataPrivacySettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listDataPrivacySettings");
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

[**ApplicationDataPrivacyList**](ApplicationDataPrivacyList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listDataPrivacySettingsWithHttpInfo

> ApiResponse<ApplicationDataPrivacyList> listDataPrivacySettings listDataPrivacySettingsWithHttpInfo()

Lists data privacy settings of all web applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApiResponse<ApplicationDataPrivacyList> response = apiInstance.listDataPrivacySettingsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listDataPrivacySettings");
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

ApiResponse<[**ApplicationDataPrivacyList**](ApplicationDataPrivacyList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listKeyUserActions

> KeyUserActionList listKeyUserActions(id)

Gets the list of key user actions in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        try {
            KeyUserActionList result = apiInstance.listKeyUserActions(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listKeyUserActions");
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
| **id** | **String**| The ID of the required web application. | |

### Return type

[**KeyUserActionList**](KeyUserActionList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listKeyUserActionsWithHttpInfo

> ApiResponse<KeyUserActionList> listKeyUserActions listKeyUserActionsWithHttpInfo(id)

Gets the list of key user actions in the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        try {
            ApiResponse<KeyUserActionList> response = apiInstance.listKeyUserActionsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listKeyUserActions");
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
| **id** | **String**| The ID of the required web application. | |

### Return type

ApiResponse<[**KeyUserActionList**](KeyUserActionList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listWebApplicationConfigs

> StubList listWebApplicationConfigs()

Lists all existing web applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            StubList result = apiInstance.listWebApplicationConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listWebApplicationConfigs");
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

## listWebApplicationConfigsWithHttpInfo

> ApiResponse<StubList> listWebApplicationConfigs listWebApplicationConfigsWithHttpInfo()

Lists all existing web applications

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listWebApplicationConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#listWebApplicationConfigs");
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


## updateApplicationErrorConfig

> void updateApplicationErrorConfig(id, applicationErrorRules)

Updates the configuration of error rules in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        ApplicationErrorRules applicationErrorRules = new ApplicationErrorRules(); // ApplicationErrorRules | The JSON body of the request. Contains the updated configuration of error rules.
        try {
            apiInstance.updateApplicationErrorConfig(id, applicationErrorRules);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateApplicationErrorConfig");
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
| **id** | **String**| The ID of the required web application. | |
| **applicationErrorRules** | [**ApplicationErrorRules**](ApplicationErrorRules.md)| The JSON body of the request. Contains the updated configuration of error rules. | [optional] |

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

## updateApplicationErrorConfigWithHttpInfo

> ApiResponse<Void> updateApplicationErrorConfig updateApplicationErrorConfigWithHttpInfo(id, applicationErrorRules)

Updates the configuration of error rules in the specified application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the required web application.
        ApplicationErrorRules applicationErrorRules = new ApplicationErrorRules(); // ApplicationErrorRules | The JSON body of the request. Contains the updated configuration of error rules.
        try {
            ApiResponse<Void> response = apiInstance.updateApplicationErrorConfigWithHttpInfo(id, applicationErrorRules);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateApplicationErrorConfig");
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
| **id** | **String**| The ID of the required web application. | |
| **applicationErrorRules** | [**ApplicationErrorRules**](ApplicationErrorRules.md)| The JSON body of the request. Contains the updated configuration of error rules. | [optional] |

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


## updateDataPrivacySettings

> void updateDataPrivacySettings(id, applicationDataPrivacy)

Updates the data privacy settings of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application, where you want to update data privacy settings.
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            apiInstance.updateDataPrivacySettings(id, applicationDataPrivacy);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateDataPrivacySettings");
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
| **id** | **String**| The ID of the web application, where you want to update data privacy settings. | |
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **204** | Success. Data privacy settings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateDataPrivacySettingsWithHttpInfo

> ApiResponse<Void> updateDataPrivacySettings updateDataPrivacySettingsWithHttpInfo(id, applicationDataPrivacy)

Updates the data privacy settings of the specified web application

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application, where you want to update data privacy settings.
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            ApiResponse<Void> response = apiInstance.updateDataPrivacySettingsWithHttpInfo(id, applicationDataPrivacy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateDataPrivacySettings");
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
| **id** | **String**| The ID of the web application, where you want to update data privacy settings. | |
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **204** | Success. Data privacy settings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateDefaultApplicationDataPrivacySettings

> void updateDefaultApplicationDataPrivacySettings(applicationDataPrivacy)

Updates the data privacy settings of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            apiInstance.updateDefaultApplicationDataPrivacySettings(applicationDataPrivacy);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateDefaultApplicationDataPrivacySettings");
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
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **204** | Success. Data privacy settings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateDefaultApplicationDataPrivacySettingsWithHttpInfo

> ApiResponse<Void> updateDefaultApplicationDataPrivacySettings updateDefaultApplicationDataPrivacySettingsWithHttpInfo(applicationDataPrivacy)

Updates the data privacy settings of the default web application

Default application is pre-configured in your Dynatrace environment. By default all traffic goes to this application.   After you configure your own applications, all the traffic, which doesn&#39;t fit to any of your applications, goes to the default one.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            ApiResponse<Void> response = apiInstance.updateDefaultApplicationDataPrivacySettingsWithHttpInfo(applicationDataPrivacy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateDefaultApplicationDataPrivacySettings");
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
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **204** | Success. Data privacy settings have been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateWebApplicationConfig

> EntityShortRepresentation updateWebApplicationConfig(id, webApplicationConfig)

Updates the configuration of the specified web application or creates a new one

If the application with the specified ID does not exist, a new application will be created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to update.   If you set the ID in the body as well, it must match this ID.
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing updated configuration of the web application.
        try {
            EntityShortRepresentation result = apiInstance.updateWebApplicationConfig(id, webApplicationConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to update.   If you set the ID in the body as well, it must match this ID. | |
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing updated configuration of the web application. | [optional] |

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
| **201** | Success. The new configuration has been created. The response body contains the ID and name of the new web application. |  -  |
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateWebApplicationConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateWebApplicationConfig updateWebApplicationConfigWithHttpInfo(id, webApplicationConfig)

Updates the configuration of the specified web application or creates a new one

If the application with the specified ID does not exist, a new application will be created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to update.   If you set the ID in the body as well, it must match this ID.
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing updated configuration of the web application.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateWebApplicationConfigWithHttpInfo(id, webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#updateWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to update.   If you set the ID in the body as well, it must match this ID. | |
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing updated configuration of the web application. | [optional] |

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
| **201** | Success. The new configuration has been created. The response body contains the ID and name of the new web application. |  -  |
| **204** | Success. Configuration has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateWebApplicationConfig

> void validateCreateWebApplicationConfig(webApplicationConfig)

Validates the configuration of the web application for the &#x60;POST /applications/web&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the web application configuration to validate.
        try {
            apiInstance.validateCreateWebApplicationConfig(webApplicationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateCreateWebApplicationConfig");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateCreateWebApplicationConfigWithHttpInfo

> ApiResponse<Void> validateCreateWebApplicationConfig validateCreateWebApplicationConfigWithHttpInfo(webApplicationConfig)

Validates the configuration of the web application for the &#x60;POST /applications/web&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the web application configuration to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateWebApplicationConfigWithHttpInfo(webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateCreateWebApplicationConfig");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateDataPrivacySettings

> void validateDataPrivacySettings(id, applicationDataPrivacy)

Validates data privacy settings for the &#x60;PUT /applications/web/{id}/dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application, where you want to validate data privacy settings.
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            apiInstance.validateDataPrivacySettings(id, applicationDataPrivacy);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDataPrivacySettings");
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
| **id** | **String**| The ID of the web application, where you want to validate data privacy settings. | |
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateDataPrivacySettingsWithHttpInfo

> ApiResponse<Void> validateDataPrivacySettings validateDataPrivacySettingsWithHttpInfo(id, applicationDataPrivacy)

Validates data privacy settings for the &#x60;PUT /applications/web/{id}/dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application, where you want to validate data privacy settings.
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing new data privacy settings.
        try {
            ApiResponse<Void> response = apiInstance.validateDataPrivacySettingsWithHttpInfo(id, applicationDataPrivacy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDataPrivacySettings");
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
| **id** | **String**| The ID of the web application, where you want to validate data privacy settings. | |
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing new data privacy settings. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateDefaultApplicationDataPrivacySettings

> void validateDefaultApplicationDataPrivacySettings(applicationDataPrivacy)

Validates data privacy settings of the default web application for the &#x60;PUT /applications/web/default/dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing the data privacy settings to validate.
        try {
            apiInstance.validateDefaultApplicationDataPrivacySettings(applicationDataPrivacy);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDefaultApplicationDataPrivacySettings");
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
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing the data privacy settings to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateDefaultApplicationDataPrivacySettingsWithHttpInfo

> ApiResponse<Void> validateDefaultApplicationDataPrivacySettings validateDefaultApplicationDataPrivacySettingsWithHttpInfo(applicationDataPrivacy)

Validates data privacy settings of the default web application for the &#x60;PUT /applications/web/default/dataPrivacy&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        ApplicationDataPrivacy applicationDataPrivacy = new ApplicationDataPrivacy(); // ApplicationDataPrivacy | JSON body of the request, containing the data privacy settings to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateDefaultApplicationDataPrivacySettingsWithHttpInfo(applicationDataPrivacy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDefaultApplicationDataPrivacySettings");
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
| **applicationDataPrivacy** | [**ApplicationDataPrivacy**](ApplicationDataPrivacy.md)| JSON body of the request, containing the data privacy settings to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateDefaultConfiguration

> void validateDefaultConfiguration(webApplicationConfig)

Validates the configuration of the default web application for the &#x60;PUT /applications/web/default&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing web application configuration to validate.
        try {
            apiInstance.validateDefaultConfiguration(webApplicationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDefaultConfiguration");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateDefaultConfigurationWithHttpInfo

> ApiResponse<Void> validateDefaultConfiguration validateDefaultConfigurationWithHttpInfo(webApplicationConfig)

Validates the configuration of the default web application for the &#x60;PUT /applications/web/default&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing web application configuration to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateDefaultConfigurationWithHttpInfo(webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateDefaultConfiguration");
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
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateWebApplicationConfig

> void validateUpdateWebApplicationConfig(id, webApplicationConfig)

Validates the configuration of the web application for the &#x60;PUT /applications/web/{id}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to validate.
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the web application configuration to validate.
        try {
            apiInstance.validateUpdateWebApplicationConfig(id, webApplicationConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateUpdateWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to validate. | |
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateWebApplicationConfigWithHttpInfo

> ApiResponse<Void> validateUpdateWebApplicationConfig validateUpdateWebApplicationConfigWithHttpInfo(id, webApplicationConfig)

Validates the configuration of the web application for the &#x60;PUT /applications/web/{id}&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumWebApplicationConfigurationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumWebApplicationConfigurationApi apiInstance = new RumWebApplicationConfigurationApi(defaultClient);
        String id = "id_example"; // String | The ID of the web application to validate.
        WebApplicationConfig webApplicationConfig = new WebApplicationConfig(); // WebApplicationConfig | JSON body of the request, containing the web application configuration to validate.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateWebApplicationConfigWithHttpInfo(id, webApplicationConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumWebApplicationConfigurationApi#validateUpdateWebApplicationConfig");
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
| **id** | **String**| The ID of the web application to validate. | |
| **webApplicationConfig** | [**WebApplicationConfig**](WebApplicationConfig.md)| JSON body of the request, containing the web application configuration to validate. | [optional] |

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
| **400** | Failed. The input is invalid. |  -  |

