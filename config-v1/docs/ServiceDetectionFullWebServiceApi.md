# ServiceDetectionFullWebServiceApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#createServiceDetectionRule) | **POST** /service/detectionRules/FULL_WEB_SERVICE | Creates a new service detection rule |
| [**createServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#createServiceDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_SERVICE | Creates a new service detection rule |
| [**deleteServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#deleteServiceDetectionRule) | **DELETE** /service/detectionRules/FULL_WEB_SERVICE/{id} | Deletes the specified service detection rule |
| [**deleteServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#deleteServiceDetectionRuleWithHttpInfo) | **DELETE** /service/detectionRules/FULL_WEB_SERVICE/{id} | Deletes the specified service detection rule |
| [**getServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#getServiceDetectionRule) | **GET** /service/detectionRules/FULL_WEB_SERVICE/{id} | Shows the properties of the specified service detection rule |
| [**getServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#getServiceDetectionRuleWithHttpInfo) | **GET** /service/detectionRules/FULL_WEB_SERVICE/{id} | Shows the properties of the specified service detection rule |
| [**listServiceDetectionRules**](ServiceDetectionFullWebServiceApi.md#listServiceDetectionRules) | **GET** /service/detectionRules/FULL_WEB_SERVICE | Lists all full web service detection rules |
| [**listServiceDetectionRulesWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#listServiceDetectionRulesWithHttpInfo) | **GET** /service/detectionRules/FULL_WEB_SERVICE | Lists all full web service detection rules |
| [**orderServiceDetectionRules**](ServiceDetectionFullWebServiceApi.md#orderServiceDetectionRules) | **PUT** /service/detectionRules/FULL_WEB_SERVICE/order | Reorders the service detection rules of the specified type |
| [**orderServiceDetectionRulesWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#orderServiceDetectionRulesWithHttpInfo) | **PUT** /service/detectionRules/FULL_WEB_SERVICE/order | Reorders the service detection rules of the specified type |
| [**updateServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#updateServiceDetectionRule) | **PUT** /service/detectionRules/FULL_WEB_SERVICE/{id} | Updates an existing service detection rule |
| [**updateServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#updateServiceDetectionRuleWithHttpInfo) | **PUT** /service/detectionRules/FULL_WEB_SERVICE/{id} | Updates an existing service detection rule |
| [**validateCreateServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#validateCreateServiceDetectionRule) | **POST** /service/detectionRules/FULL_WEB_SERVICE/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_SERVICE&#x60; request |
| [**validateCreateServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#validateCreateServiceDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_SERVICE/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_SERVICE&#x60; request |
| [**validateUpdateServiceDetectionRule**](ServiceDetectionFullWebServiceApi.md#validateUpdateServiceDetectionRule) | **POST** /service/detectionRules/FULL_WEB_SERVICE/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/{id}&#x60; request |
| [**validateUpdateServiceDetectionRuleWithHttpInfo**](ServiceDetectionFullWebServiceApi.md#validateUpdateServiceDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/FULL_WEB_SERVICE/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/{id}&#x60; request |



## createServiceDetectionRule

> EntityShortRepresentation createServiceDetectionRule(position, fullWebServiceRule)

Creates a new service detection rule

The body must not provide an ID as it will be automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/reorder` request.
        try {
            EntityShortRepresentation result = apiInstance.createServiceDetectionRule(position, fullWebServiceRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#createServiceDetectionRule");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the end of the rule list.   * &#x60;PREPEND&#x60;: on top of the rule list.    | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/reorder&#x60; request. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response contains short representation of the rule, including the ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createServiceDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createServiceDetectionRule createServiceDetectionRuleWithHttpInfo(position, fullWebServiceRule)

Creates a new service detection rule

The body must not provide an ID as it will be automatically assigned.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/reorder` request.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createServiceDetectionRuleWithHttpInfo(position, fullWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#createServiceDetectionRule");
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
| **position** | **String**| The position of the new rule:    * &#x60;APPEND&#x60;: at the end of the rule list.   * &#x60;PREPEND&#x60;: on top of the rule list.    | [optional] [default to APPEND] [enum: APPEND, PREPEND] |
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/reorder&#x60; request. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response contains short representation of the rule, including the ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteServiceDetectionRule

> void deleteServiceDetectionRule(id)

Deletes the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            apiInstance.deleteServiceDetectionRule(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#deleteServiceDetectionRule");
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

## deleteServiceDetectionRuleWithHttpInfo

> ApiResponse<Void> deleteServiceDetectionRule deleteServiceDetectionRuleWithHttpInfo(id)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteServiceDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#deleteServiceDetectionRule");
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


## getServiceDetectionRule

> FullWebServiceRule getServiceDetectionRule(id)

Shows the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            FullWebServiceRule result = apiInstance.getServiceDetectionRule(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#getServiceDetectionRule");
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

[**FullWebServiceRule**](FullWebServiceRule.md)


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

## getServiceDetectionRuleWithHttpInfo

> ApiResponse<FullWebServiceRule> getServiceDetectionRule getServiceDetectionRuleWithHttpInfo(id)

Shows the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            ApiResponse<FullWebServiceRule> response = apiInstance.getServiceDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#getServiceDetectionRule");
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

ApiResponse<[**FullWebServiceRule**](FullWebServiceRule.md)>


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


## listServiceDetectionRules

> StubList listServiceDetectionRules()

Lists all full web service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        try {
            StubList result = apiInstance.listServiceDetectionRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#listServiceDetectionRules");
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

## listServiceDetectionRulesWithHttpInfo

> ApiResponse<StubList> listServiceDetectionRules listServiceDetectionRulesWithHttpInfo()

Lists all full web service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listServiceDetectionRulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#listServiceDetectionRules");
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


## orderServiceDetectionRules

> void orderServiceDetectionRules(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            apiInstance.orderServiceDetectionRules(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#orderServiceDetectionRules");
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

## orderServiceDetectionRulesWithHttpInfo

> ApiResponse<Void> orderServiceDetectionRules orderServiceDetectionRulesWithHttpInfo(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            ApiResponse<Void> response = apiInstance.orderServiceDetectionRulesWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#orderServiceDetectionRules");
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


## updateServiceDetectionRule

> EntityShortRepresentation updateServiceDetectionRule(id, fullWebServiceRule)

Updates an existing service detection rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created and appended to the end of the rule list.    The request keeps an existing order of rules, unless the **order** parameter is set.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            EntityShortRepresentation result = apiInstance.updateServiceDetectionRule(id, fullWebServiceRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#updateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response contains short representation of the rule, including the ID. |  -  |
| **204** | Success. The service detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateServiceDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateServiceDetectionRule updateServiceDetectionRuleWithHttpInfo(id, fullWebServiceRule)

Updates an existing service detection rule

If the rule with the specified ID doesn&#39;t exist, a new rule will be created and appended to the end of the rule list.    The request keeps an existing order of rules, unless the **order** parameter is set.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateServiceDetectionRuleWithHttpInfo(id, fullWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#updateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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
| **201** | Success. The new service detection rule has been created. The response contains short representation of the rule, including the ID. |  -  |
| **204** | Success. The service detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateServiceDetectionRule

> void validateCreateServiceDetectionRule(fullWebServiceRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_SERVICE&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | 
        try {
            apiInstance.validateCreateServiceDetectionRule(fullWebServiceRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#validateCreateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)|  | |

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

## validateCreateServiceDetectionRuleWithHttpInfo

> ApiResponse<Void> validateCreateServiceDetectionRule validateCreateServiceDetectionRuleWithHttpInfo(fullWebServiceRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/FULL_WEB_SERVICE&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateCreateServiceDetectionRuleWithHttpInfo(fullWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#validateCreateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)|  | |

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


## validateUpdateServiceDetectionRule

> void validateUpdateServiceDetectionRule(id, fullWebServiceRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | 
        try {
            apiInstance.validateUpdateServiceDetectionRule(id, fullWebServiceRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#validateUpdateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)|  | |

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

## validateUpdateServiceDetectionRuleWithHttpInfo

> ApiResponse<Void> validateUpdateServiceDetectionRule validateUpdateServiceDetectionRuleWithHttpInfo(id, fullWebServiceRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/FULL_WEB_SERVICE/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionFullWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionFullWebServiceApi apiInstance = new ServiceDetectionFullWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        FullWebServiceRule fullWebServiceRule = new FullWebServiceRule(); // FullWebServiceRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateServiceDetectionRuleWithHttpInfo(id, fullWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionFullWebServiceApi#validateUpdateServiceDetectionRule");
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
| **fullWebServiceRule** | [**FullWebServiceRule**](FullWebServiceRule.md)|  | |

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

