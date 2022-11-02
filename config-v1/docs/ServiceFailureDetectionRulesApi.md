# ServiceFailureDetectionRulesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeRuleId**](ServiceFailureDetectionRulesApi.md#changeRuleId) | **PUT** /service/failureDetection/parameterSelection/rules/{id}/changeId | Changes the ID of the specified rule | maturity&#x3D;EARLY_ADOPTER |
| [**changeRuleIdWithHttpInfo**](ServiceFailureDetectionRulesApi.md#changeRuleIdWithHttpInfo) | **PUT** /service/failureDetection/parameterSelection/rules/{id}/changeId | Changes the ID of the specified rule | maturity&#x3D;EARLY_ADOPTER |
| [**createOrUpdateRule**](ServiceFailureDetectionRulesApi.md#createOrUpdateRule) | **PUT** /service/failureDetection/parameterSelection/rules/{id} | Updates the specified failure detection rule rule | maturity&#x3D;EARLY_ADOPTER |
| [**createOrUpdateRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#createOrUpdateRuleWithHttpInfo) | **PUT** /service/failureDetection/parameterSelection/rules/{id} | Updates the specified failure detection rule rule | maturity&#x3D;EARLY_ADOPTER |
| [**createRule**](ServiceFailureDetectionRulesApi.md#createRule) | **POST** /service/failureDetection/parameterSelection/rules | Creates a new failure detection rule | maturity&#x3D;EARLY_ADOPTER |
| [**createRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#createRuleWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/rules | Creates a new failure detection rule | maturity&#x3D;EARLY_ADOPTER |
| [**deleteRule**](ServiceFailureDetectionRulesApi.md#deleteRule) | **DELETE** /service/failureDetection/parameterSelection/rules/{id} | Deletes the specified failure detection rule | maturity&#x3D;EARLY_ADOPTER |
| [**deleteRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#deleteRuleWithHttpInfo) | **DELETE** /service/failureDetection/parameterSelection/rules/{id} | Deletes the specified failure detection rule | maturity&#x3D;EARLY_ADOPTER |
| [**getAllRules**](ServiceFailureDetectionRulesApi.md#getAllRules) | **GET** /service/failureDetection/parameterSelection/rules | Lists all available failure detection rules | maturity&#x3D;EARLY_ADOPTER |
| [**getAllRulesWithHttpInfo**](ServiceFailureDetectionRulesApi.md#getAllRulesWithHttpInfo) | **GET** /service/failureDetection/parameterSelection/rules | Lists all available failure detection rules | maturity&#x3D;EARLY_ADOPTER |
| [**getRule**](ServiceFailureDetectionRulesApi.md#getRule) | **GET** /service/failureDetection/parameterSelection/rules/{id} | Gets the properties of the specified rule | maturity&#x3D;EARLY_ADOPTER |
| [**getRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#getRuleWithHttpInfo) | **GET** /service/failureDetection/parameterSelection/rules/{id} | Gets the properties of the specified rule | maturity&#x3D;EARLY_ADOPTER |
| [**reorderRules**](ServiceFailureDetectionRulesApi.md#reorderRules) | **PUT** /service/failureDetection/parameterSelection/rules/reorderRules | Reorders failure detection rules | maturity&#x3D;EARLY_ADOPTER |
| [**reorderRulesWithHttpInfo**](ServiceFailureDetectionRulesApi.md#reorderRulesWithHttpInfo) | **PUT** /service/failureDetection/parameterSelection/rules/reorderRules | Reorders failure detection rules | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateRule**](ServiceFailureDetectionRulesApi.md#validateCreateRule) | **POST** /service/failureDetection/parameterSelection/rules/validator | Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/rules&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#validateCreateRuleWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/rules/validator | Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/rules&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateRule**](ServiceFailureDetectionRulesApi.md#validateUpdateRule) | **POST** /service/failureDetection/parameterSelection/rules/{id}/validator | Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/rules/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateRuleWithHttpInfo**](ServiceFailureDetectionRulesApi.md#validateUpdateRuleWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/rules/{id}/validator | Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/rules/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## changeRuleId

> void changeRuleId(id, entityShortRepresentation)

Changes the ID of the specified rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        EntityShortRepresentation entityShortRepresentation = new EntityShortRepresentation(); // EntityShortRepresentation | The JSON body of the request. Contains the new ID of the rule. All other fields are ignored.
        try {
            apiInstance.changeRuleId(id, entityShortRepresentation);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#changeRuleId");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **entityShortRepresentation** | [**EntityShortRepresentation**](EntityShortRepresentation.md)| The JSON body of the request. Contains the new ID of the rule. All other fields are ignored. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |

## changeRuleIdWithHttpInfo

> ApiResponse<Void> changeRuleId changeRuleIdWithHttpInfo(id, entityShortRepresentation)

Changes the ID of the specified rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        EntityShortRepresentation entityShortRepresentation = new EntityShortRepresentation(); // EntityShortRepresentation | The JSON body of the request. Contains the new ID of the rule. All other fields are ignored.
        try {
            ApiResponse<Void> response = apiInstance.changeRuleIdWithHttpInfo(id, entityShortRepresentation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#changeRuleId");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **entityShortRepresentation** | [**EntityShortRepresentation**](EntityShortRepresentation.md)| The JSON body of the request. Contains the new ID of the rule. All other fields are ignored. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createOrUpdateRule

> EntityShortRepresentation createOrUpdateRule(id, failureDetectionRule)

Updates the specified failure detection rule rule | maturity&#x3D;EARLY_ADOPTER

If a rule with the specified ID doesn&#39;t exist, a new one is created and appended to the end of the rule list.   Rules are evaluated from top to bottom, the first matching rule applies.To enforce a particular order use the reorder request.   The failure detection parameter set used by the rule must exist at the time of rule creation.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the updated configuration of the failure detection rule.   You can't update the ID with this request. Use the change ID request instead.
        try {
            EntityShortRepresentation result = apiInstance.createOrUpdateRule(id, failureDetectionRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#createOrUpdateRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the updated configuration of the failure detection rule.   You can&#39;t update the ID with this request. Use the change ID request instead. | [optional] |

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
| **201** | Success. The new failure detection rule has been created. The response contains the ID of the new rule. |  -  |
| **204** | Success. The failure detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOrUpdateRule createOrUpdateRuleWithHttpInfo(id, failureDetectionRule)

Updates the specified failure detection rule rule | maturity&#x3D;EARLY_ADOPTER

If a rule with the specified ID doesn&#39;t exist, a new one is created and appended to the end of the rule list.   Rules are evaluated from top to bottom, the first matching rule applies.To enforce a particular order use the reorder request.   The failure detection parameter set used by the rule must exist at the time of rule creation.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the updated configuration of the failure detection rule.   You can't update the ID with this request. Use the change ID request instead.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOrUpdateRuleWithHttpInfo(id, failureDetectionRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#createOrUpdateRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the updated configuration of the failure detection rule.   You can&#39;t update the ID with this request. Use the change ID request instead. | [optional] |

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
| **201** | Success. The new failure detection rule has been created. The response contains the ID of the new rule. |  -  |
| **204** | Success. The failure detection rule has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createRule

> EntityShortRepresentation createRule(failureDetectionRule)

Creates a new failure detection rule | maturity&#x3D;EARLY_ADOPTER

The new rule is appended to the end of the rule list.   Rules are evaluated from top to bottom, the first matching rule applies.To enforce a particular order use the reorder request.   The failure detection parameter set used by the rule must exist at the time of rule creation.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the configuration of the new failure detection rule.   Dynatrace will generate a random UUID for you, if you don't specify an ID.
        try {
            EntityShortRepresentation result = apiInstance.createRule(failureDetectionRule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#createRule");
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
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the configuration of the new failure detection rule.   Dynatrace will generate a random UUID for you, if you don&#39;t specify an ID. | [optional] |

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
| **201** | Success. The new failure detection rule has been created. The response contains the ID of the new rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createRuleWithHttpInfo

> ApiResponse<EntityShortRepresentation> createRule createRuleWithHttpInfo(failureDetectionRule)

Creates a new failure detection rule | maturity&#x3D;EARLY_ADOPTER

The new rule is appended to the end of the rule list.   Rules are evaluated from top to bottom, the first matching rule applies.To enforce a particular order use the reorder request.   The failure detection parameter set used by the rule must exist at the time of rule creation.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the configuration of the new failure detection rule.   Dynatrace will generate a random UUID for you, if you don't specify an ID.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createRuleWithHttpInfo(failureDetectionRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#createRule");
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
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the configuration of the new failure detection rule.   Dynatrace will generate a random UUID for you, if you don&#39;t specify an ID. | [optional] |

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
| **201** | Success. The new failure detection rule has been created. The response contains the ID of the new rule. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteRule

> void deleteRule(id)

Deletes the specified failure detection rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        try {
            apiInstance.deleteRule(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#deleteRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |

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
| **204** | Success. The failure detection rule has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## deleteRuleWithHttpInfo

> ApiResponse<Void> deleteRule deleteRuleWithHttpInfo(id)

Deletes the specified failure detection rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        try {
            ApiResponse<Void> response = apiInstance.deleteRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#deleteRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |

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
| **204** | Success. The failure detection rule has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## getAllRules

> StubList getAllRules()

Lists all available failure detection rules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        try {
            StubList result = apiInstance.getAllRules();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#getAllRules");
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

## getAllRulesWithHttpInfo

> ApiResponse<StubList> getAllRules getAllRulesWithHttpInfo()

Lists all available failure detection rules | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getAllRulesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#getAllRules");
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


## getRule

> FailureDetectionRule getRule(id)

Gets the properties of the specified rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        try {
            FailureDetectionRule result = apiInstance.getRule(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#getRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |

### Return type

[**FailureDetectionRule**](FailureDetectionRule.md)


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

## getRuleWithHttpInfo

> ApiResponse<FailureDetectionRule> getRule getRuleWithHttpInfo(id)

Gets the properties of the specified rule | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        try {
            ApiResponse<FailureDetectionRule> response = apiInstance.getRuleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#getRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |

### Return type

ApiResponse<[**FailureDetectionRule**](FailureDetectionRule.md)>


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


## reorderRules

> void reorderRules(fdpSelectionRuleOrder)

Reorders failure detection rules | maturity&#x3D;EARLY_ADOPTER

Rules are evaluated from top to bottom, the first matching rule applies.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FdpSelectionRuleOrder fdpSelectionRuleOrder = new FdpSelectionRuleOrder(); // FdpSelectionRuleOrder | The JSON body of the request. Contains the failure detection rules in the required order.
        try {
            apiInstance.reorderRules(fdpSelectionRuleOrder);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#reorderRules");
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
| **fdpSelectionRuleOrder** | [**FdpSelectionRuleOrder**](FdpSelectionRuleOrder.md)| The JSON body of the request. Contains the failure detection rules in the required order. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |

## reorderRulesWithHttpInfo

> ApiResponse<Void> reorderRules reorderRulesWithHttpInfo(fdpSelectionRuleOrder)

Reorders failure detection rules | maturity&#x3D;EARLY_ADOPTER

Rules are evaluated from top to bottom, the first matching rule applies.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FdpSelectionRuleOrder fdpSelectionRuleOrder = new FdpSelectionRuleOrder(); // FdpSelectionRuleOrder | The JSON body of the request. Contains the failure detection rules in the required order.
        try {
            ApiResponse<Void> response = apiInstance.reorderRulesWithHttpInfo(fdpSelectionRuleOrder);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#reorderRules");
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
| **fdpSelectionRuleOrder** | [**FdpSelectionRuleOrder**](FdpSelectionRuleOrder.md)| The JSON body of the request. Contains the failure detection rules in the required order. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateRule

> void validateCreateRule(failureDetectionRule)

Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/rules&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the parameters of the failure detection rule to be validated.
        try {
            apiInstance.validateCreateRule(failureDetectionRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#validateCreateRule");
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
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the parameters of the failure detection rule to be validated. | [optional] |

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

## validateCreateRuleWithHttpInfo

> ApiResponse<Void> validateCreateRule validateCreateRuleWithHttpInfo(failureDetectionRule)

Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/rules&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the parameters of the failure detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateRuleWithHttpInfo(failureDetectionRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#validateCreateRule");
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
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the parameters of the failure detection rule to be validated. | [optional] |

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


## validateUpdateRule

> void validateUpdateRule(id, failureDetectionRule)

Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/rules/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the configuration of the failure detection rule to be validated.
        try {
            apiInstance.validateUpdateRule(id, failureDetectionRule);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#validateUpdateRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the configuration of the failure detection rule to be validated. | [optional] |

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

## validateUpdateRuleWithHttpInfo

> ApiResponse<Void> validateUpdateRule validateUpdateRuleWithHttpInfo(id, failureDetectionRule)

Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/rules/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionRulesApi apiInstance = new ServiceFailureDetectionRulesApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection rule. 
        FailureDetectionRule failureDetectionRule = new FailureDetectionRule(); // FailureDetectionRule | The JSON body of the request. Contains the configuration of the failure detection rule to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateRuleWithHttpInfo(id, failureDetectionRule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionRulesApi#validateUpdateRule");
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
| **id** | **String**| The ID of the required failure detection rule.  | |
| **failureDetectionRule** | [**FailureDetectionRule**](FailureDetectionRule.md)| The JSON body of the request. Contains the configuration of the failure detection rule to be validated. | [optional] |

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

