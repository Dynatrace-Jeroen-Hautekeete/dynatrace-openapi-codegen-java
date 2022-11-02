# ServiceDetectionFullWebRequestApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#createRequestDetectionRule) | **POST** /service/detectionRules/FULL_WEB_REQUEST | Creates a new service detection rule |
| [**createRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#createRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_REQUEST | Creates a new service detection rule |
| [**deleteRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#deleteRequestDetectionRule) | **DELETE** /service/detectionRules/FULL_WEB_REQUEST/{id} | Deletes the specified service detection rule |
| [**deleteRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#deleteRequestDetectionRuleWithHttpInfo) | **DELETE** /service/detectionRules/FULL_WEB_REQUEST/{id} | Deletes the specified service detection rule |
| [**getRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#getRequestDetectionRule) | **GET** /service/detectionRules/FULL_WEB_REQUEST/{id} | Gets the properties of the specified service detection rule |
| [**getRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#getRequestDetectionRuleWithHttpInfo) | **GET** /service/detectionRules/FULL_WEB_REQUEST/{id} | Gets the properties of the specified service detection rule |
| [**listRequestDetectionRules**](ServiceDetectionFullWebRequestApi.md#listRequestDetectionRules) | **GET** /service/detectionRules/FULL_WEB_REQUEST | Lists all full web request service detection rules |
| [**listRequestDetectionRulesWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#listRequestDetectionRulesWithHttpInfo) | **GET** /service/detectionRules/FULL_WEB_REQUEST | Lists all full web request service detection rules |
| [**orderRequestDetectionRules**](ServiceDetectionFullWebRequestApi.md#orderRequestDetectionRules) | **PUT** /service/detectionRules/FULL_WEB_REQUEST/order | Reorders the service detection rules of the specified type |
| [**orderRequestDetectionRulesWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#orderRequestDetectionRulesWithHttpInfo) | **PUT** /service/detectionRules/FULL_WEB_REQUEST/order | Reorders the service detection rules of the specified type |
| [**updateRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#updateRequestDetectionRule) | **PUT** /service/detectionRules/FULL_WEB_REQUEST/{id} | Updates an existing service detection rule |
| [**updateRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#updateRequestDetectionRuleWithHttpInfo) | **PUT** /service/detectionRules/FULL_WEB_REQUEST/{id} | Updates an existing service detection rule |
| [**validateCreateRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#validateCreateRequestDetectionRule) | **POST** /service/detectionRules/FULL_WEB_REQUEST/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_REQUEST&#x60; request |
| [**validateCreateRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#validateCreateRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_REQUEST/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_REQUEST&#x60; request |
| [**validateUpdateRequestDetectionRule**](ServiceDetectionFullWebRequestApi.md#validateUpdateRequestDetectionRule) | **POST** /service/detectionRules/FULL_WEB_REQUEST/{id}/validator | Validates the payload for the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/{id}&#x60; request |
| [**validateUpdateRequestDetectionRuleWithHttpInfo**](ServiceDetectionFullWebRequestApi.md#validateUpdateRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_REQUEST/{id}/validator | Validates the payload for the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/{id}&#x60; request |



## createRequestDetectionRule

> EntityShortRepresentation createRequestDetectionRule(position, fullWebRequestRule)

Creates a new service detection rule

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the bottom of the rule list.   * `PREPEND`: at the top of the rule list.    If not set, the `APPEND` is used.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order, use the `PUT /service/detectionRules/FULL_WEB_REQUEST/reorder` request.
        try {
            EntityShortRepresentation result = apiInstance.createRequestDetectionRule(position, fullWebRequestRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#createRequestDetectionRule");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the bottom of the rule list.   * &#x60;PREPEND&#x60;: at the top of the rule list.    If not set, the &#x60;APPEND&#x60; is used. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order, use the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/reorder&#x60; request. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response body contains the ID of the rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRequestDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRequestDetectionRule createRequestDetectionRuleWithHttpInfo(position, fullWebRequestRule)

Creates a new service detection rule

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
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the bottom of the rule list.   * `PREPEND`: at the top of the rule list.    If not set, the `APPEND` is used.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order, use the `PUT /service/detectionRules/FULL_WEB_REQUEST/reorder` request.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRequestDetectionRuleWithHttpInfo(position, fullWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#createRequestDetectionRule");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the bottom of the rule list.   * &#x60;PREPEND&#x60;: at the top of the rule list.    If not set, the &#x60;APPEND&#x60; is used. | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order, use the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/reorder&#x60; request. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response body contains the ID of the rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRequestDetectionRule

> void deleteRequestDetectionRule(id)

Deletes the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            apiInstance.deleteRequestDetectionRule(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#deleteRequestDetectionRule");
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
| **id** | **UUID**| The ID of the service detection rule to be deleted. | |

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
| **404** | Failed. The rule with the specified ID doesn&#39;t exist. |  -  |

## deleteRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> deleteRequestDetectionRule deleteRequestDetectionRuleWithHttpInfo(id)

Deletes the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteRequestDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#deleteRequestDetectionRule");
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
| **id** | **UUID**| The ID of the service detection rule to be deleted. | |

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
| **404** | Failed. The rule with the specified ID doesn&#39;t exist. |  -  |


## getRequestDetectionRule

> FullWebRequestRule getRequestDetectionRule(id)

Gets the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            FullWebRequestRule result = apiInstance.getRequestDetectionRule(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#getRequestDetectionRule");
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
| **id** | **UUID**| The ID of the required service detection rule. | |

### Return type

[**FullWebRequestRule**](FullWebRequestRule.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains properties of the specified rule. |  -  |
| **404** | Failed. The rule with the specified ID doesn&#39;t exist. |  -  |

## getRequestDetectionRuleWithHttpInfo

> ApiResponse<FullWebRequestRule> getRequestDetectionRule getRequestDetectionRuleWithHttpInfo(id)

Gets the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            ApiResponse<FullWebRequestRule> response = apiInstance.getRequestDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#getRequestDetectionRule");
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
| **id** | **UUID**| The ID of the required service detection rule. | |

### Return type

ApiResponse<[**FullWebRequestRule**](FullWebRequestRule.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains properties of the specified rule. |  -  |
| **404** | Failed. The rule with the specified ID doesn&#39;t exist. |  -  |


## listRequestDetectionRules

> StubList listRequestDetectionRules()

Lists all full web request service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        try {
            StubList result = apiInstance.listRequestDetectionRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#listRequestDetectionRules");
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
| **200** | Success. The response contains the ordered list of rules. |  -  |

## listRequestDetectionRulesWithHttpInfo

> ApiResponse<StubList> listRequestDetectionRules listRequestDetectionRulesWithHttpInfo()

Lists all full web request service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listRequestDetectionRulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#listRequestDetectionRules");
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
| **200** | Success. The response contains the ordered list of rules. |  -  |


## orderRequestDetectionRules

> void orderRequestDetectionRules(stubList)

Reorders the service detection rules of the specified type

The request reorders the rules of the specified type according to the order of the IDs in the body of the request.    Rules that are omitted in the body of the request will retain their relative order but will be placed *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            apiInstance.orderRequestDetectionRules(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#orderRequestDetectionRules");
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
| **stubList** | [**StubList**](StubList.md)| The JSON body of the request containing the service detection rules in the required order. | [optional] |

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
| **204** | Success. Service detection rules have been reordered. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## orderRequestDetectionRulesWithHttpInfo

> ApiResponse<Void> orderRequestDetectionRules orderRequestDetectionRulesWithHttpInfo(stubList)

Reorders the service detection rules of the specified type

The request reorders the rules of the specified type according to the order of the IDs in the body of the request.    Rules that are omitted in the body of the request will retain their relative order but will be placed *after* all those present in the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            ApiResponse<Void> response = apiInstance.orderRequestDetectionRulesWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#orderRequestDetectionRules");
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
| **stubList** | [**StubList**](StubList.md)| The JSON body of the request containing the service detection rules in the required order. | [optional] |

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
| **204** | Success. Service detection rules have been reordered. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## updateRequestDetectionRule

> EntityShortRepresentation updateRequestDetectionRule(id, fullWebRequestRule)

Updates an existing service detection rule

If a rule with the specified ID doesn&#39;t exist, a new rule is created and appended to the end of the rule list.    The request keeps the existing order of rules, unless the **order** parameter is set.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains updated parameters of the service detection rule.
        try {
            EntityShortRepresentation result = apiInstance.updateRequestDetectionRule(id, fullWebRequestRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#updateRequestDetectionRule");
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
| **id** | **UUID**| The ID of the rule to be updated. | |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains updated parameters of the service detection rule. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response body contains the ID of the rule. |  -  |
| **204** | Success. The service detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateRequestDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateRequestDetectionRule updateRequestDetectionRuleWithHttpInfo(id, fullWebRequestRule)

Updates an existing service detection rule

If a rule with the specified ID doesn&#39;t exist, a new rule is created and appended to the end of the rule list.    The request keeps the existing order of rules, unless the **order** parameter is set.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains updated parameters of the service detection rule.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateRequestDetectionRuleWithHttpInfo(id, fullWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#updateRequestDetectionRule");
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
| **id** | **UUID**| The ID of the rule to be updated. | |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains updated parameters of the service detection rule. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response body contains the ID of the rule. |  -  |
| **204** | Success. The service detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateRequestDetectionRule

> void validateCreateRequestDetectionRule(fullWebRequestRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_REQUEST&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the service detection rule to be validated.
        try {
            apiInstance.validateCreateRequestDetectionRule(fullWebRequestRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#validateCreateRequestDetectionRule");
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
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the service detection rule to be validated. | [optional] |

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
| **204** | Validated. The service detection rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> validateCreateRequestDetectionRule validateCreateRequestDetectionRuleWithHttpInfo(fullWebRequestRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_REQUEST&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the service detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRequestDetectionRuleWithHttpInfo(fullWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#validateCreateRequestDetectionRule");
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
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the service detection rule to be validated. | [optional] |

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
| **204** | Validated. The service detection rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateUpdateRequestDetectionRule

> void validateUpdateRequestDetectionRule(id, fullWebRequestRule)

Validates the payload for the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the service detection rule to be validated.
        try {
            apiInstance.validateUpdateRequestDetectionRule(id, fullWebRequestRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#validateUpdateRequestDetectionRule");
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
| **id** | **UUID**| The ID of the service detection rule to be validated. | |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the service detection rule to be validated. | [optional] |

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
| **204** | Validated. The service detection rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateUpdateRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> validateUpdateRequestDetectionRule validateUpdateRequestDetectionRuleWithHttpInfo(id, fullWebRequestRule)

Validates the payload for the &#x60;PUT /service/detectionRules/FULL_WEB_REQUEST/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebRequestApi apiInstance = new ServiceDetectionFullWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        FullWebRequestRule fullWebRequestRule = new FullWebRequestRule(); // FullWebRequestRule | The JSON body of the request. Contains parameters of the service detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRequestDetectionRuleWithHttpInfo(id, fullWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebRequestApi#validateUpdateRequestDetectionRule");
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
| **id** | **UUID**| The ID of the service detection rule to be validated. | |
| **fullWebRequestRule** | [**FullWebRequestRule**](FullWebRequestRule.md)| The JSON body of the request. Contains parameters of the service detection rule to be validated. | [optional] |

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
| **204** | Validated. The service detection rule is valid. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

