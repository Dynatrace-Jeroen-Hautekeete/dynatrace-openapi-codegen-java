# RumApplicationDetectionRulesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#createApplicationDetectionConfig) | **POST** /applicationDetectionRules | Creates a new application detection rule |
| [**createApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#createApplicationDetectionConfigWithHttpInfo) | **POST** /applicationDetectionRules | Creates a new application detection rule |
| [**deleteApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#deleteApplicationDetectionConfig) | **DELETE** /applicationDetectionRules/{id} | Deletes the specified application detection rule |
| [**deleteApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#deleteApplicationDetectionConfigWithHttpInfo) | **DELETE** /applicationDetectionRules/{id} | Deletes the specified application detection rule |
| [**getApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#getApplicationDetectionConfig) | **GET** /applicationDetectionRules/{id} | Gets the parameters of the specified application detection rule |
| [**getApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#getApplicationDetectionConfigWithHttpInfo) | **GET** /applicationDetectionRules/{id} | Gets the parameters of the specified application detection rule |
| [**listApplicationDetectionConfigs**](RumApplicationDetectionRulesApi.md#listApplicationDetectionConfigs) | **GET** /applicationDetectionRules | Lists all available application detection rules |
| [**listApplicationDetectionConfigsWithHttpInfo**](RumApplicationDetectionRulesApi.md#listApplicationDetectionConfigsWithHttpInfo) | **GET** /applicationDetectionRules | Lists all available application detection rules |
| [**orderApplicationDetectionConfigs**](RumApplicationDetectionRulesApi.md#orderApplicationDetectionConfigs) | **PUT** /applicationDetectionRules/order | Reorders the application detection rules |
| [**orderApplicationDetectionConfigsWithHttpInfo**](RumApplicationDetectionRulesApi.md#orderApplicationDetectionConfigsWithHttpInfo) | **PUT** /applicationDetectionRules/order | Reorders the application detection rules |
| [**updateApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#updateApplicationDetectionConfig) | **PUT** /applicationDetectionRules/{id} | Updates the specified application detection rule |
| [**updateApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#updateApplicationDetectionConfigWithHttpInfo) | **PUT** /applicationDetectionRules/{id} | Updates the specified application detection rule |
| [**validateCreateApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#validateCreateApplicationDetectionConfig) | **POST** /applicationDetectionRules/validator | Validates the payload for the &#x60;POST /applicationDetection&#x60; request |
| [**validateCreateApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#validateCreateApplicationDetectionConfigWithHttpInfo) | **POST** /applicationDetectionRules/validator | Validates the payload for the &#x60;POST /applicationDetection&#x60; request |
| [**validateUpdateApplicationDetectionConfig**](RumApplicationDetectionRulesApi.md#validateUpdateApplicationDetectionConfig) | **POST** /applicationDetectionRules/{id}/validator | Validate the payload for the &#x60;PUT /applicationDetection/{id}&#x60; request |
| [**validateUpdateApplicationDetectionConfigWithHttpInfo**](RumApplicationDetectionRulesApi.md#validateUpdateApplicationDetectionConfigWithHttpInfo) | **POST** /applicationDetectionRules/{id}/validator | Validate the payload for the &#x60;PUT /applicationDetection/{id}&#x60; request |



## createApplicationDetectionConfig

> EntityShortRepresentation createApplicationDetectionConfig(position, applicationDetectionRuleConfig)

Creates a new application detection rule

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.   You can only create detection rules for an existing application. If you need to create a rule for an application that doesn&#39;t exist yet, [create an application first](https://dt-url.net/vt03khh) and then configure detection rules for it.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the bottom of the rule list.   * `PREPEND`: at the top of the rule list.    If not set, the `APPEND` is used.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains configuration of the new application detection rule.    You must not specify the ID of the rule.   The **order** field is ignored in this request. To enforce a particular order use the `PUT /applicationDetectionRules/order` request.
        try {
            EntityShortRepresentation result = apiInstance.createApplicationDetectionConfig(position, applicationDetectionRuleConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#createApplicationDetectionConfig");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the bottom of the rule list.   * &#x60;PREPEND&#x60;: at the top of the rule list.    If not set, the &#x60;APPEND&#x60; is used. | [optional] [enum: APPEND, PREPEND] |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains configuration of the new application detection rule.    You must not specify the ID of the rule.   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /applicationDetectionRules/order&#x60; request. | [optional] |

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
| **201** | Success. The application detection rule has been created. Response contains the ID of the new rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createApplicationDetectionConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> createApplicationDetectionConfig createApplicationDetectionConfigWithHttpInfo(position, applicationDetectionRuleConfig)

Creates a new application detection rule

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.   You can only create detection rules for an existing application. If you need to create a rule for an application that doesn&#39;t exist yet, [create an application first](https://dt-url.net/vt03khh) and then configure detection rules for it.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the bottom of the rule list.   * `PREPEND`: at the top of the rule list.    If not set, the `APPEND` is used.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains configuration of the new application detection rule.    You must not specify the ID of the rule.   The **order** field is ignored in this request. To enforce a particular order use the `PUT /applicationDetectionRules/order` request.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createApplicationDetectionConfigWithHttpInfo(position, applicationDetectionRuleConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#createApplicationDetectionConfig");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the bottom of the rule list.   * &#x60;PREPEND&#x60;: at the top of the rule list.    If not set, the &#x60;APPEND&#x60; is used. | [optional] [enum: APPEND, PREPEND] |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains configuration of the new application detection rule.    You must not specify the ID of the rule.   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /applicationDetectionRules/order&#x60; request. | [optional] |

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
| **201** | Success. The application detection rule has been created. Response contains the ID of the new rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteApplicationDetectionConfig

> void deleteApplicationDetectionConfig(id)

Deletes the specified application detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be deleted.
        try {
            apiInstance.deleteApplicationDetectionConfig(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#deleteApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |

## deleteApplicationDetectionConfigWithHttpInfo

> ApiResponse<Void> deleteApplicationDetectionConfig deleteApplicationDetectionConfigWithHttpInfo(id)

Deletes the specified application detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteApplicationDetectionConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#deleteApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be deleted. | |

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
| **204** | Deleted. Response doesn&#39;t have a body. |  -  |


## getApplicationDetectionConfig

> ApplicationDetectionRuleConfig getApplicationDetectionConfig(id)

Gets the parameters of the specified application detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required application detection rule.
        try {
            ApplicationDetectionRuleConfig result = apiInstance.getApplicationDetectionConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#getApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the required application detection rule. | |

### Return type

[**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getApplicationDetectionConfigWithHttpInfo

> ApiResponse<ApplicationDetectionRuleConfig> getApplicationDetectionConfig getApplicationDetectionConfigWithHttpInfo(id)

Gets the parameters of the specified application detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required application detection rule.
        try {
            ApiResponse<ApplicationDetectionRuleConfig> response = apiInstance.getApplicationDetectionConfigWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#getApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the required application detection rule. | |

### Return type

ApiResponse<[**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listApplicationDetectionConfigs

> StubList listApplicationDetectionConfigs()

Lists all available application detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        try {
            StubList result = apiInstance.listApplicationDetectionConfigs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#listApplicationDetectionConfigs");
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

## listApplicationDetectionConfigsWithHttpInfo

> ApiResponse<StubList> listApplicationDetectionConfigs listApplicationDetectionConfigsWithHttpInfo()

Lists all available application detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listApplicationDetectionConfigsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#listApplicationDetectionConfigs");
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


## orderApplicationDetectionConfigs

> void orderApplicationDetectionConfigs(stubList)

Reorders the application detection rules

This request reorders the application detection rules according to the submitted list of IDs. Application detection rules not present in the body of the request will retain their relative ordering but are placed *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request. Contains the IDs of the application detection rules in the desired order. Any further properties (**name**, **description**) are ignored.
        try {
            apiInstance.orderApplicationDetectionConfigs(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#orderApplicationDetectionConfigs");
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
| **stubList** | [**StubList**](StubList.md)| The JSON body of the request. Contains the IDs of the application detection rules in the desired order. Any further properties (**name**, **description**) are ignored. | [optional] |

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
| **204** | Success. Application detection rules have been reordered. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## orderApplicationDetectionConfigsWithHttpInfo

> ApiResponse<Void> orderApplicationDetectionConfigs orderApplicationDetectionConfigsWithHttpInfo(stubList)

Reorders the application detection rules

This request reorders the application detection rules according to the submitted list of IDs. Application detection rules not present in the body of the request will retain their relative ordering but are placed *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request. Contains the IDs of the application detection rules in the desired order. Any further properties (**name**, **description**) are ignored.
        try {
            ApiResponse<Void> response = apiInstance.orderApplicationDetectionConfigsWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#orderApplicationDetectionConfigs");
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
| **stubList** | [**StubList**](StubList.md)| The JSON body of the request. Contains the IDs of the application detection rules in the desired order. Any further properties (**name**, **description**) are ignored. | [optional] |

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
| **204** | Success. Application detection rules have been reordered. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateApplicationDetectionConfig

> EntityShortRepresentation updateApplicationDetectionConfig(id, applicationDetectionRuleConfig)

Updates the specified application detection rule

If the application detection rule with the specified ID doesn&#39;t exist, a new application is created and appended to the end of the rule list.   If the **order** parameter is set for an existing rule, the request uses this value. Otherwise it keeps the existing order of rules.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be updated.    If you set the ID in the body as well, it must match this ID.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains updated parameters of the application detection rule.    If the **order** parameter is set, the rule is placed to this position.
        try {
            EntityShortRepresentation result = apiInstance.updateApplicationDetectionConfig(id, applicationDetectionRuleConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#updateApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains updated parameters of the application detection rule.    If the **order** parameter is set, the rule is placed to this position. | [optional] |

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
| **201** | Success. Application detection rule has been created. Response contains the ID of the new rule. |  -  |
| **204** | Success. Application detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateApplicationDetectionConfigWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateApplicationDetectionConfig updateApplicationDetectionConfigWithHttpInfo(id, applicationDetectionRuleConfig)

Updates the specified application detection rule

If the application detection rule with the specified ID doesn&#39;t exist, a new application is created and appended to the end of the rule list.   If the **order** parameter is set for an existing rule, the request uses this value. Otherwise it keeps the existing order of rules.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be updated.    If you set the ID in the body as well, it must match this ID.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains updated parameters of the application detection rule.    If the **order** parameter is set, the rule is placed to this position.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateApplicationDetectionConfigWithHttpInfo(id, applicationDetectionRuleConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#updateApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be updated.    If you set the ID in the body as well, it must match this ID. | |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains updated parameters of the application detection rule.    If the **order** parameter is set, the rule is placed to this position. | [optional] |

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
| **201** | Success. Application detection rule has been created. Response contains the ID of the new rule. |  -  |
| **204** | Success. Application detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateApplicationDetectionConfig

> void validateCreateApplicationDetectionConfig(applicationDetectionRuleConfig)

Validates the payload for the &#x60;POST /applicationDetection&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains the application detection rule to be validated.
        try {
            apiInstance.validateCreateApplicationDetectionConfig(applicationDetectionRuleConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#validateCreateApplicationDetectionConfig");
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
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains the application detection rule to be validated. | [optional] |

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

## validateCreateApplicationDetectionConfigWithHttpInfo

> ApiResponse<Void> validateCreateApplicationDetectionConfig validateCreateApplicationDetectionConfigWithHttpInfo(applicationDetectionRuleConfig)

Validates the payload for the &#x60;POST /applicationDetection&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains the application detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateApplicationDetectionConfigWithHttpInfo(applicationDetectionRuleConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#validateCreateApplicationDetectionConfig");
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
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains the application detection rule to be validated. | [optional] |

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


## validateUpdateApplicationDetectionConfig

> void validateUpdateApplicationDetectionConfig(id, applicationDetectionRuleConfig)

Validate the payload for the &#x60;PUT /applicationDetection/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be validated.    If you set the ID in the body as well, it must match this ID.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains the application detection rule to be validated.
        try {
            apiInstance.validateUpdateApplicationDetectionConfig(id, applicationDetectionRuleConfig);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#validateUpdateApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be validated.    If you set the ID in the body as well, it must match this ID. | |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains the application detection rule to be validated. | [optional] |

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

## validateUpdateApplicationDetectionConfigWithHttpInfo

> ApiResponse<Void> validateUpdateApplicationDetectionConfig validateUpdateApplicationDetectionConfigWithHttpInfo(id, applicationDetectionRuleConfig)

Validate the payload for the &#x60;PUT /applicationDetection/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumApplicationDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumApplicationDetectionRulesApi apiInstance = new RumApplicationDetectionRulesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the application detection rule to be validated.    If you set the ID in the body as well, it must match this ID.
        ApplicationDetectionRuleConfig applicationDetectionRuleConfig = new ApplicationDetectionRuleConfig(); // ApplicationDetectionRuleConfig | The JSON body of the request. Contains the application detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateApplicationDetectionConfigWithHttpInfo(id, applicationDetectionRuleConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumApplicationDetectionRulesApi#validateUpdateApplicationDetectionConfig");
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
| **id** | **UUID**| The ID of the application detection rule to be validated.    If you set the ID in the body as well, it must match this ID. | |
| **applicationDetectionRuleConfig** | [**ApplicationDetectionRuleConfig**](ApplicationDetectionRuleConfig.md)| The JSON body of the request. Contains the application detection rule to be validated. | [optional] |

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

