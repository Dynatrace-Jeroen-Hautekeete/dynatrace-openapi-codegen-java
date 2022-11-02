# ConditionalNamingApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNamingRule**](ConditionalNamingApi.md#createNamingRule) | **POST** /conditionalNaming/{type} | Creates a new naming rule |
| [**createNamingRuleWithHttpInfo**](ConditionalNamingApi.md#createNamingRuleWithHttpInfo) | **POST** /conditionalNaming/{type} | Creates a new naming rule |
| [**deleteNamingRule**](ConditionalNamingApi.md#deleteNamingRule) | **DELETE** /conditionalNaming/{type}/{id} | Deletes the specified naming rule |
| [**deleteNamingRuleWithHttpInfo**](ConditionalNamingApi.md#deleteNamingRuleWithHttpInfo) | **DELETE** /conditionalNaming/{type}/{id} | Deletes the specified naming rule |
| [**getNamingRule**](ConditionalNamingApi.md#getNamingRule) | **GET** /conditionalNaming/{type}/{id} | Lists the parameters of the specified naming rule |
| [**getNamingRuleWithHttpInfo**](ConditionalNamingApi.md#getNamingRuleWithHttpInfo) | **GET** /conditionalNaming/{type}/{id} | Lists the parameters of the specified naming rule |
| [**listNamingRules**](ConditionalNamingApi.md#listNamingRules) | **GET** /conditionalNaming/{type} | Lists all configured naming rules of the specified type |
| [**listNamingRulesWithHttpInfo**](ConditionalNamingApi.md#listNamingRulesWithHttpInfo) | **GET** /conditionalNaming/{type} | Lists all configured naming rules of the specified type |
| [**updateNamingRule**](ConditionalNamingApi.md#updateNamingRule) | **PUT** /conditionalNaming/{type}/{id} | Updates the specified naming rule |
| [**updateNamingRuleWithHttpInfo**](ConditionalNamingApi.md#updateNamingRuleWithHttpInfo) | **PUT** /conditionalNaming/{type}/{id} | Updates the specified naming rule |
| [**validateCreateNamingRule**](ConditionalNamingApi.md#validateCreateNamingRule) | **POST** /conditionalNaming/{type}/validator | Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request |
| [**validateCreateNamingRuleWithHttpInfo**](ConditionalNamingApi.md#validateCreateNamingRuleWithHttpInfo) | **POST** /conditionalNaming/{type}/validator | Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request |
| [**validateUpdateNamingRule**](ConditionalNamingApi.md#validateUpdateNamingRule) | **POST** /conditionalNaming/{type}/{id}/validator | Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request |
| [**validateUpdateNamingRuleWithHttpInfo**](ConditionalNamingApi.md#validateUpdateNamingRuleWithHttpInfo) | **POST** /conditionalNaming/{type}/{id}/validator | Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request |



## createNamingRule

> EntityShortRepresentation createNamingRule(type, conditionalNamingRule)

Creates a new naming rule

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter.
        try {
            EntityShortRepresentation result = apiInstance.createNamingRule(type, conditionalNamingRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#createNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter. | [optional] |

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
| **201** | Success. The naming rule has been created. The response contains the ID of the new rule |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createNamingRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createNamingRule createNamingRuleWithHttpInfo(type, conditionalNamingRule)

Creates a new naming rule

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
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createNamingRuleWithHttpInfo(type, conditionalNamingRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#createNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter. | [optional] |

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
| **201** | Success. The naming rule has been created. The response contains the ID of the new rule |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteNamingRule

> void deleteNamingRule(type, id)

Deletes the specified naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be deleted.
        try {
            apiInstance.deleteNamingRule(type, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#deleteNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be deleted. | |

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

## deleteNamingRuleWithHttpInfo

> ApiResponse<Void> deleteNamingRule deleteNamingRuleWithHttpInfo(type, id)

Deletes the specified naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteNamingRuleWithHttpInfo(type, id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#deleteNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be deleted. | |

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


## getNamingRule

> ConditionalNamingRule getNamingRule(type, id)

Lists the parameters of the specified naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the required naming rule.
        try {
            ConditionalNamingRule result = apiInstance.getNamingRule(type, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#getNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the required naming rule. | |

### Return type

[**ConditionalNamingRule**](ConditionalNamingRule.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getNamingRuleWithHttpInfo

> ApiResponse<ConditionalNamingRule> getNamingRule getNamingRuleWithHttpInfo(type, id)

Lists the parameters of the specified naming rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the required naming rule.
        try {
            ApiResponse<ConditionalNamingRule> response = apiInstance.getNamingRuleWithHttpInfo(type, id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#getNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the required naming rule. | |

### Return type

ApiResponse<[**ConditionalNamingRule**](ConditionalNamingRule.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listNamingRules

> StubList listNamingRules(type)

Lists all configured naming rules of the specified type

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        try {
            StubList result = apiInstance.listNamingRules(type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#listNamingRules");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |

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

## listNamingRulesWithHttpInfo

> ApiResponse<StubList> listNamingRules listNamingRulesWithHttpInfo(type)

Lists all configured naming rules of the specified type

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        try {
            ApiResponse<StubList> response = apiInstance.listNamingRulesWithHttpInfo(type);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#listNamingRules");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |

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


## updateNamingRule

> EntityShortRepresentation updateNamingRule(type, id, conditionalNamingRule)

Updates the specified naming rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be updated.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter.
        try {
            EntityShortRepresentation result = apiInstance.updateNamingRule(type, id, conditionalNamingRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#updateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be updated. | |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter. | [optional] |

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
| **201** | Success. The naming rule has been created. The response contains the ID of the new rule. |  -  |
| **204** | Success. The naming rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateNamingRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateNamingRule updateNamingRuleWithHttpInfo(type, id, conditionalNamingRule)

Updates the specified naming rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be updated.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateNamingRuleWithHttpInfo(type, id, conditionalNamingRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#updateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be updated. | |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter. | [optional] |

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
| **201** | Success. The naming rule has been created. The response contains the ID of the new rule. |  -  |
| **204** | Success. The naming rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateNamingRule

> void validateCreateNamingRule(type, conditionalNamingRule)

Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains the naming rule parameters to be validated.
        try {
            apiInstance.validateCreateNamingRule(type, conditionalNamingRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#validateCreateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains the naming rule parameters to be validated. | [optional] |

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

## validateCreateNamingRuleWithHttpInfo

> ApiResponse<Void> validateCreateNamingRule validateCreateNamingRuleWithHttpInfo(type, conditionalNamingRule)

Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains the naming rule parameters to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateNamingRuleWithHttpInfo(type, conditionalNamingRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#validateCreateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains the naming rule parameters to be validated. | [optional] |

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


## validateUpdateNamingRule

> void validateUpdateNamingRule(type, id, conditionalNamingRule)

Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be validated.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains the naming rule parameters to be validated.
        try {
            apiInstance.validateUpdateNamingRule(type, id, conditionalNamingRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#validateUpdateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be validated. | |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains the naming rule parameters to be validated. | [optional] |

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

## validateUpdateNamingRuleWithHttpInfo

> ApiResponse<Void> validateUpdateNamingRule validateUpdateNamingRuleWithHttpInfo(type, id, conditionalNamingRule)

Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ConditionalNamingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ConditionalNamingApi apiInstance = new ConditionalNamingApi(defaultClient);
        String type = "processGroup"; // String | The type of the rule, defined by the type of Dynatrace entities to which the rule applies.
        UUID id = UUID.randomUUID(); // UUID | The ID of the naming rule to be validated.
        ConditionalNamingRule conditionalNamingRule = new ConditionalNamingRule(); // ConditionalNamingRule | The JSON body of the request. Contains the naming rule parameters to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateNamingRuleWithHttpInfo(type, id, conditionalNamingRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConditionalNamingApi#validateUpdateNamingRule");
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
| **type** | **String**| The type of the rule, defined by the type of Dynatrace entities to which the rule applies. | [enum: processGroup, host, service] |
| **id** | **UUID**| The ID of the naming rule to be validated. | |
| **conditionalNamingRule** | [**ConditionalNamingRule**](ConditionalNamingRule.md)| The JSON body of the request. Contains the naming rule parameters to be validated. | [optional] |

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

