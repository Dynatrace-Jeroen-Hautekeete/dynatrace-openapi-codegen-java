# ServiceDetectionOpaqueAndExternalWebServiceApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#createOpaqueAndExternalWebServiceRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE | Creates a new service detection rule |
| [**createOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#createOpaqueAndExternalWebServiceRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE | Creates a new service detection rule |
| [**deleteOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#deleteOpaqueAndExternalWebServiceRule) | **DELETE** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Deletes the specified service detection rule |
| [**deleteOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#deleteOpaqueAndExternalWebServiceRuleWithHttpInfo) | **DELETE** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Deletes the specified service detection rule |
| [**getOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#getOpaqueAndExternalWebServiceRule) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Shows the properties of the specified service detection rule |
| [**getOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#getOpaqueAndExternalWebServiceRuleWithHttpInfo) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Shows the properties of the specified service detection rule |
| [**listOpaqueAndExternalWebServiceRules**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#listOpaqueAndExternalWebServiceRules) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE | Lists all opaque and external web service detection rules |
| [**listOpaqueAndExternalWebServiceRulesWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#listOpaqueAndExternalWebServiceRulesWithHttpInfo) | **GET** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE | Lists all opaque and external web service detection rules |
| [**orderOpaqueAndExternalWebServiceRules**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#orderOpaqueAndExternalWebServiceRules) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/order | Reorders the service detection rules of the specified type |
| [**orderOpaqueAndExternalWebServiceRulesWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#orderOpaqueAndExternalWebServiceRulesWithHttpInfo) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/order | Reorders the service detection rules of the specified type |
| [**updateOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#updateOpaqueAndExternalWebServiceRule) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Updates an existing service detection rule |
| [**updateOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#updateOpaqueAndExternalWebServiceRuleWithHttpInfo) | **PUT** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id} | Updates an existing service detection rule |
| [**validateCreateOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#validateCreateOpaqueAndExternalWebServiceRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE&#x60; request |
| [**validateCreateOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#validateCreateOpaqueAndExternalWebServiceRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/validator | Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE&#x60; request |
| [**validateUpdateOpaqueAndExternalWebServiceRule**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#validateUpdateOpaqueAndExternalWebServiceRule) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}&#x60; request |
| [**validateUpdateOpaqueAndExternalWebServiceRuleWithHttpInfo**](ServiceDetectionOpaqueAndExternalWebServiceApi.md#validateUpdateOpaqueAndExternalWebServiceRuleWithHttpInfo) | **POST** /service/detectionRules/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}/validator | Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}&#x60; request |



## createOpaqueAndExternalWebServiceRule

> EntityShortRepresentation createOpaqueAndExternalWebServiceRule(position, opaqueAndExternalWebServiceRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/reorder` request.
        try {
            EntityShortRepresentation result = apiInstance.createOpaqueAndExternalWebServiceRule(position, opaqueAndExternalWebServiceRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#createOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/reorder&#x60; request. | [optional] |

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

## createOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOpaqueAndExternalWebServiceRule createOpaqueAndExternalWebServiceRuleWithHttpInfo(position, opaqueAndExternalWebServiceRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        String position = "APPEND"; // String | The position of the new rule:    * `APPEND`: at the end of the rule list.   * `PREPEND`: on top of the rule list.   
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the `PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/reorder` request.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOpaqueAndExternalWebServiceRuleWithHttpInfo(position, opaqueAndExternalWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#createOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)| The JSON body of the request containing parameters of the new service detection rule.    You must not specify the ID of the rule!   The **order** field is ignored in this request. To enforce a particular order use the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/reorder&#x60; request. | [optional] |

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


## deleteOpaqueAndExternalWebServiceRule

> void deleteOpaqueAndExternalWebServiceRule(id)

Deletes the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            apiInstance.deleteOpaqueAndExternalWebServiceRule(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#deleteOpaqueAndExternalWebServiceRule");
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

## deleteOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<Void> deleteOpaqueAndExternalWebServiceRule deleteOpaqueAndExternalWebServiceRuleWithHttpInfo(id)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteOpaqueAndExternalWebServiceRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#deleteOpaqueAndExternalWebServiceRule");
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


## getOpaqueAndExternalWebServiceRule

> OpaqueAndExternalWebServiceRule getOpaqueAndExternalWebServiceRule(id)

Shows the properties of the specified service detection rule

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            OpaqueAndExternalWebServiceRule result = apiInstance.getOpaqueAndExternalWebServiceRule(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#getOpaqueAndExternalWebServiceRule");
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

[**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)


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

## getOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<OpaqueAndExternalWebServiceRule> getOpaqueAndExternalWebServiceRule getOpaqueAndExternalWebServiceRuleWithHttpInfo(id)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required service detection rule.
        try {
            ApiResponse<OpaqueAndExternalWebServiceRule> response = apiInstance.getOpaqueAndExternalWebServiceRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#getOpaqueAndExternalWebServiceRule");
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

ApiResponse<[**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)>


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


## listOpaqueAndExternalWebServiceRules

> StubList listOpaqueAndExternalWebServiceRules()

Lists all opaque and external web service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        try {
            StubList result = apiInstance.listOpaqueAndExternalWebServiceRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#listOpaqueAndExternalWebServiceRules");
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

## listOpaqueAndExternalWebServiceRulesWithHttpInfo

> ApiResponse<StubList> listOpaqueAndExternalWebServiceRules listOpaqueAndExternalWebServiceRulesWithHttpInfo()

Lists all opaque and external web service detection rules

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.listOpaqueAndExternalWebServiceRulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#listOpaqueAndExternalWebServiceRules");
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


## orderOpaqueAndExternalWebServiceRules

> void orderOpaqueAndExternalWebServiceRules(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            apiInstance.orderOpaqueAndExternalWebServiceRules(stubList);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#orderOpaqueAndExternalWebServiceRules");
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

## orderOpaqueAndExternalWebServiceRulesWithHttpInfo

> ApiResponse<Void> orderOpaqueAndExternalWebServiceRules orderOpaqueAndExternalWebServiceRulesWithHttpInfo(stubList)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        StubList stubList = new StubList(); // StubList | The JSON body of the request containing the service detection rules in the required order.
        try {
            ApiResponse<Void> response = apiInstance.orderOpaqueAndExternalWebServiceRulesWithHttpInfo(stubList);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#orderOpaqueAndExternalWebServiceRules");
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


## updateOpaqueAndExternalWebServiceRule

> EntityShortRepresentation updateOpaqueAndExternalWebServiceRule(id, opaqueAndExternalWebServiceRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            EntityShortRepresentation result = apiInstance.updateOpaqueAndExternalWebServiceRule(id, opaqueAndExternalWebServiceRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#updateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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

## updateOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateOpaqueAndExternalWebServiceRule updateOpaqueAndExternalWebServiceRuleWithHttpInfo(id, opaqueAndExternalWebServiceRule)

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
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the rule to be updated.
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | The JSON body of the request containing updated parameters of the service detection rule.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateOpaqueAndExternalWebServiceRuleWithHttpInfo(id, opaqueAndExternalWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#updateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)| The JSON body of the request containing updated parameters of the service detection rule. | [optional] |

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


## validateCreateOpaqueAndExternalWebServiceRule

> void validateCreateOpaqueAndExternalWebServiceRule(opaqueAndExternalWebServiceRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | 
        try {
            apiInstance.validateCreateOpaqueAndExternalWebServiceRule(opaqueAndExternalWebServiceRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#validateCreateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)|  | |

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

## validateCreateOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<Void> validateCreateOpaqueAndExternalWebServiceRule validateCreateOpaqueAndExternalWebServiceRuleWithHttpInfo(opaqueAndExternalWebServiceRule)

Validates the payload for the &#x60;POST /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateCreateOpaqueAndExternalWebServiceRuleWithHttpInfo(opaqueAndExternalWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#validateCreateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)|  | |

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


## validateUpdateOpaqueAndExternalWebServiceRule

> void validateUpdateOpaqueAndExternalWebServiceRule(id, opaqueAndExternalWebServiceRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | 
        try {
            apiInstance.validateUpdateOpaqueAndExternalWebServiceRule(id, opaqueAndExternalWebServiceRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#validateUpdateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)|  | |

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

## validateUpdateOpaqueAndExternalWebServiceRuleWithHttpInfo

> ApiResponse<Void> validateUpdateOpaqueAndExternalWebServiceRule validateUpdateOpaqueAndExternalWebServiceRuleWithHttpInfo(id, opaqueAndExternalWebServiceRule)

Validate the payload for the &#x60;PUT /ruleBasedServiceDetection/OPAQUE_AND_EXTERNAL_WEB_SERVICE/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceDetectionOpaqueAndExternalWebServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceDetectionOpaqueAndExternalWebServiceApi apiInstance = new ServiceDetectionOpaqueAndExternalWebServiceApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the service detection rule to be validated.
        OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = new OpaqueAndExternalWebServiceRule(); // OpaqueAndExternalWebServiceRule | 
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateOpaqueAndExternalWebServiceRuleWithHttpInfo(id, opaqueAndExternalWebServiceRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceDetectionOpaqueAndExternalWebServiceApi#validateUpdateOpaqueAndExternalWebServiceRule");
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
| **opaqueAndExternalWebServiceRule** | [**OpaqueAndExternalWebServiceRule**](OpaqueAndExternalWebServiceRule.md)|  | |

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

