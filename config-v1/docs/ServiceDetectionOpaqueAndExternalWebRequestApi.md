# ServiceDetectionOpaqueAndExternalWebRequestApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#createOpaqueAndExternalWebRequestDetectionRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST | Creates a new service detection rule |
| [**createOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#createOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST | Creates a new service detection rule |
| [**deleteOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#deleteOpaqueAndExternalWebRequestDetectionRule) | **DELETE** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Deletes the specified service detection rule |
| [**deleteOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#deleteOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **DELETE** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Deletes the specified service detection rule |
| [**getOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#getOpaqueAndExternalWebRequestDetectionRule) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Shows the properties of the specified service detection rule |
| [**getOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#getOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Shows the properties of the specified service detection rule |
| [**listOpaqueAndExternalWebRequestDetectionRules**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#listOpaqueAndExternalWebRequestDetectionRules) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST | Lists all opaque and external web request service detection rules |
| [**listOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#listOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST | Lists all opaque and external web request service detection rules |
| [**orderOpaqueAndExternalWebRequestDetectionRules**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#orderOpaqueAndExternalWebRequestDetectionRules) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/order | Reorders the service detection rules of the specified type |
| [**orderOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#orderOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/order | Reorders the service detection rules of the specified type |
| [**updateOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#updateOpaqueAndExternalWebRequestDetectionRule) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Updates an existing service detection rule |
| [**updateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#updateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id} | Updates an existing service detection rule |
| [**validateCreateOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#validateCreateOpaqueAndExternalWebRequestDetectionRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; request |
| [**validateCreateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#validateCreateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; request |
| [**validateUpdateOpaqueAndExternalWebRequestDetectionRule**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#validateUpdateOpaqueAndExternalWebRequestDetectionRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}&#x60; request |
| [**validateUpdateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebRequestApi.md#validateUpdateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}&#x60; request |



## createOpaqueAndExternalWebRequestDetectionRule

> EntityShortRepresentation createOpaqueAndExternalWebRequestDetectionRule(position, opaqueAndExternalWebRequestRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/reorder` request.
        try {
            EntityShortRepresentation result = apiInstance.createOpaqueAndExternalWebRequestDetectionRule(position, opaqueAndExternalWebRequestRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#createOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/reorder&#x60; request. | [optional] |

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

## createOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOpaqueAndExternalWebRequestDetectionRule createOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(position, opaqueAndExternalWebRequestRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/reorder` request.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(position, opaqueAndExternalWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#createOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/reorder&#x60; request. | [optional] |

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


## deleteOpaqueAndExternalWebRequestDetectionRule

> void deleteOpaqueAndExternalWebRequestDetectionRule(id)

Deletes the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            apiInstance.deleteOpaqueAndExternalWebRequestDetectionRule(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#deleteOpaqueAndExternalWebRequestDetectionRule");
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

## deleteOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> deleteOpaqueAndExternalWebRequestDetectionRule deleteOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#deleteOpaqueAndExternalWebRequestDetectionRule");
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


## getOpaqueAndExternalWebRequestDetectionRule

> OpaqueAndExternalWebRequestRule getOpaqueAndExternalWebRequestDetectionRule(id)

Shows the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            OpaqueAndExternalWebRequestRule result = apiInstance.getOpaqueAndExternalWebRequestDetectionRule(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#getOpaqueAndExternalWebRequestDetectionRule");
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

[**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)


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

## getOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<OpaqueAndExternalWebRequestRule> getOpaqueAndExternalWebRequestDetectionRule getOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            ApiResponse<OpaqueAndExternalWebRequestRule> response = apiInstance.getOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#getOpaqueAndExternalWebRequestDetectionRule");
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

ApiResponse<[**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)>


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


## listOpaqueAndExternalWebRequestDetectionRules

> StubList listOpaqueAndExternalWebRequestDetectionRules()

Lists all opaque and external web request service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        try {
            StubList result = apiInstance.listOpaqueAndExternalWebRequestDetectionRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#listOpaqueAndExternalWebRequestDetectionRules");
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

## listOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo

> ApiResponse<StubList> listOpaqueAndExternalWebRequestDetectionRules listOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo()

Lists all opaque and external web request service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#listOpaqueAndExternalWebRequestDetectionRules");
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


## orderOpaqueAndExternalWebRequestDetectionRules

> void orderOpaqueAndExternalWebRequestDetectionRules(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            apiInstance.orderOpaqueAndExternalWebRequestDetectionRules(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#orderOpaqueAndExternalWebRequestDetectionRules");
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

## orderOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo

> ApiResponse<Void> orderOpaqueAndExternalWebRequestDetectionRules orderOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            ApiResponse<Void> response = apiInstance.orderOpaqueAndExternalWebRequestDetectionRulesWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#orderOpaqueAndExternalWebRequestDetectionRules");
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


## updateOpaqueAndExternalWebRequestDetectionRule

> EntityShortRepresentation updateOpaqueAndExternalWebRequestDetectionRule(id, opaqueAndExternalWebRequestRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            EntityShortRepresentation result = apiInstance.updateOpaqueAndExternalWebRequestDetectionRule(id, opaqueAndExternalWebRequestRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#updateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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

## updateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateOpaqueAndExternalWebRequestDetectionRule updateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id, opaqueAndExternalWebRequestRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id, opaqueAndExternalWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#updateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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


## validateCreateOpaqueAndExternalWebRequestDetectionRule

> void validateCreateOpaqueAndExternalWebRequestDetectionRule(opaqueAndExternalWebRequestRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | 
        try {
            apiInstance.validateCreateOpaqueAndExternalWebRequestDetectionRule(opaqueAndExternalWebRequestRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#validateCreateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)|  | |

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

## validateCreateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> validateCreateOpaqueAndExternalWebRequestDetectionRule validateCreateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(opaqueAndExternalWebRequestRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateCreateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(opaqueAndExternalWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#validateCreateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)|  | |

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


## validateUpdateOpaqueAndExternalWebRequestDetectionRule

> void validateUpdateOpaqueAndExternalWebRequestDetectionRule(id, opaqueAndExternalWebRequestRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | 
        try {
            apiInstance.validateUpdateOpaqueAndExternalWebRequestDetectionRule(id, opaqueAndExternalWebRequestRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#validateUpdateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)|  | |

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

## validateUpdateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo

> ApiResponse<Void> validateUpdateOpaqueAndExternalWebRequestDetectionRule validateUpdateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id, opaqueAndExternalWebRequestRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_REQUEST/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebRequestApi apiInstance = new ServiceDetectionOpaqueAndExternalWebRequestApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        OpaqueAndExternalWebRequestRule opaqueAndExternalWebRequestRule = new OpaqueAndExternalWebRequestRule(); // OpaqueAndExternalWebRequestRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateOpaqueAndExternalWebRequestDetectionRuleWithHttpInfo(id, opaqueAndExternalWebRequestRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebRequestApi#validateUpdateOpaqueAndExternalWebRequestDetectionRule");
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
| **opaqueAndExternalWebRequestRule** | [**OpaqueAndExternalWebRequestRule**](OpaqueAndExternalWebRequestRule.md)|  | |

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

