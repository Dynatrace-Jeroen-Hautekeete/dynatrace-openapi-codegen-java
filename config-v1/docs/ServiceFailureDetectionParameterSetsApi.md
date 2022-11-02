# ServiceFailureDetectionParameterSetsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeFdpId**](ServiceFailureDetectionParameterSetsApi.md#changeFdpId) | **PUT** /service/failureDetection/parameterSelection/parameterSets/{id}/changeId | Changes the ID of the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**changeFdpIdWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#changeFdpIdWithHttpInfo) | **PUT** /service/failureDetection/parameterSelection/parameterSets/{id}/changeId | Changes the ID of the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**createFdp**](ServiceFailureDetectionParameterSetsApi.md#createFdp) | **POST** /service/failureDetection/parameterSelection/parameterSets | Creates a new failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**createFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#createFdpWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/parameterSets | Creates a new failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**createOrUpdateFdp**](ServiceFailureDetectionParameterSetsApi.md#createOrUpdateFdp) | **PUT** /service/failureDetection/parameterSelection/parameterSets/{id} | Updates the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**createOrUpdateFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#createOrUpdateFdpWithHttpInfo) | **PUT** /service/failureDetection/parameterSelection/parameterSets/{id} | Updates the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**deleteFdp**](ServiceFailureDetectionParameterSetsApi.md#deleteFdp) | **DELETE** /service/failureDetection/parameterSelection/parameterSets/{id} | Deletes the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**deleteFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#deleteFdpWithHttpInfo) | **DELETE** /service/failureDetection/parameterSelection/parameterSets/{id} | Deletes the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**getAllFdps**](ServiceFailureDetectionParameterSetsApi.md#getAllFdps) | **GET** /service/failureDetection/parameterSelection/parameterSets | Lists all available failure detection parameter sets | maturity&#x3D;EARLY_ADOPTER |
| [**getAllFdpsWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#getAllFdpsWithHttpInfo) | **GET** /service/failureDetection/parameterSelection/parameterSets | Lists all available failure detection parameter sets | maturity&#x3D;EARLY_ADOPTER |
| [**getFdp**](ServiceFailureDetectionParameterSetsApi.md#getFdp) | **GET** /service/failureDetection/parameterSelection/parameterSets/{id} | Gets the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**getFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#getFdpWithHttpInfo) | **GET** /service/failureDetection/parameterSelection/parameterSets/{id} | Gets the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateFdp**](ServiceFailureDetectionParameterSetsApi.md#validateCreateFdp) | **POST** /service/failureDetection/parameterSelection/parameterSets/validator | Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/parameterSets&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#validateCreateFdpWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/parameterSets/validator | Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/parameterSets&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateFdp**](ServiceFailureDetectionParameterSetsApi.md#validateUpdateFdp) | **POST** /service/failureDetection/parameterSelection/parameterSets/{id}/validator | Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/parameterSets/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateUpdateFdpWithHttpInfo**](ServiceFailureDetectionParameterSetsApi.md#validateUpdateFdpWithHttpInfo) | **POST** /service/failureDetection/parameterSelection/parameterSets/{id}/validator | Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/parameterSets/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## changeFdpId

> void changeFdpId(id, entityShortRepresentation)

Changes the ID of the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

Rules that use the set will be automatically adapted to the new ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        EntityShortRepresentation entityShortRepresentation = new EntityShortRepresentation(); // EntityShortRepresentation | The JSON body of the request. Contains the new ID of the set. All other fields are ignored.
        try {
            apiInstance.changeFdpId(id, entityShortRepresentation);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#changeFdpId");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **entityShortRepresentation** | [**EntityShortRepresentation**](EntityShortRepresentation.md)| The JSON body of the request. Contains the new ID of the set. All other fields are ignored. | |

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

## changeFdpIdWithHttpInfo

> ApiResponse<Void> changeFdpId changeFdpIdWithHttpInfo(id, entityShortRepresentation)

Changes the ID of the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

Rules that use the set will be automatically adapted to the new ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        EntityShortRepresentation entityShortRepresentation = new EntityShortRepresentation(); // EntityShortRepresentation | The JSON body of the request. Contains the new ID of the set. All other fields are ignored.
        try {
            ApiResponse<Void> response = apiInstance.changeFdpIdWithHttpInfo(id, entityShortRepresentation);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#changeFdpId");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **entityShortRepresentation** | [**EntityShortRepresentation**](EntityShortRepresentation.md)| The JSON body of the request. Contains the new ID of the set. All other fields are ignored. | |

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


## createFdp

> EntityShortRepresentation createFdp(failureDetectionParameterSet)

Creates a new failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the new failure detection parameter set.   Dynatrace will generate a random UUID for you, if you don't specify an ID.
        try {
            EntityShortRepresentation result = apiInstance.createFdp(failureDetectionParameterSet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#createFdp");
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
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the new failure detection parameter set.   Dynatrace will generate a random UUID for you, if you don&#39;t specify an ID. | [optional] |

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
| **201** | Success. The new failure detection parameter set has been created. The response contains the ID of the new set. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createFdpWithHttpInfo

> ApiResponse<EntityShortRepresentation> createFdp createFdpWithHttpInfo(failureDetectionParameterSet)

Creates a new failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the new failure detection parameter set.   Dynatrace will generate a random UUID for you, if you don't specify an ID.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createFdpWithHttpInfo(failureDetectionParameterSet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#createFdp");
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
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the new failure detection parameter set.   Dynatrace will generate a random UUID for you, if you don&#39;t specify an ID. | [optional] |

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
| **201** | Success. The new failure detection parameter set has been created. The response contains the ID of the new set. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createOrUpdateFdp

> EntityShortRepresentation createOrUpdateFdp(id, failureDetectionParameterSet)

Updates the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

If a set with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the updated failure detection parameter set.   You can't update the ID with this request. Use the change ID request instead.
        try {
            EntityShortRepresentation result = apiInstance.createOrUpdateFdp(id, failureDetectionParameterSet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#createOrUpdateFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the updated failure detection parameter set.   You can&#39;t update the ID with this request. Use the change ID request instead. | [optional] |

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
| **201** | Success. The new failure detection parameter set has been created. The response contains the ID of the new set. |  -  |
| **204** | Success. The failure detection parameter set has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateFdpWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOrUpdateFdp createOrUpdateFdpWithHttpInfo(id, failureDetectionParameterSet)

Updates the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

If a set with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the updated failure detection parameter set.   You can't update the ID with this request. Use the change ID request instead.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOrUpdateFdpWithHttpInfo(id, failureDetectionParameterSet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#createOrUpdateFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the updated failure detection parameter set.   You can&#39;t update the ID with this request. Use the change ID request instead. | [optional] |

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
| **201** | Success. The new failure detection parameter set has been created. The response contains the ID of the new set. |  -  |
| **204** | Success. The failure detection parameter set has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteFdp

> void deleteFdp(id)

Deletes the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

You cannot delete the set that is used by any failure detection rule.   If you need to delete such a set, switch the rule to a new set or delete the rule first.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        try {
            apiInstance.deleteFdp(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#deleteFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |

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
| **204** | Success. The failure detection parameter set has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |

## deleteFdpWithHttpInfo

> ApiResponse<Void> deleteFdp deleteFdpWithHttpInfo(id)

Deletes the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

You cannot delete the set that is used by any failure detection rule.   If you need to delete such a set, switch the rule to a new set or delete the rule first.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        try {
            ApiResponse<Void> response = apiInstance.deleteFdpWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#deleteFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |

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
| **204** | Success. The failure detection parameter set has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The specified entity doesn&#39;t exist. |  -  |


## getAllFdps

> StubList getAllFdps()

Lists all available failure detection parameter sets | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        try {
            StubList result = apiInstance.getAllFdps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#getAllFdps");
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

## getAllFdpsWithHttpInfo

> ApiResponse<StubList> getAllFdps getAllFdpsWithHttpInfo()

Lists all available failure detection parameter sets | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getAllFdpsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#getAllFdps");
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


## getFdp

> FailureDetectionParameterSet getFdp(id)

Gets the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        try {
            FailureDetectionParameterSet result = apiInstance.getFdp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#getFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |

### Return type

[**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)


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

## getFdpWithHttpInfo

> ApiResponse<FailureDetectionParameterSet> getFdp getFdpWithHttpInfo(id)

Gets the specified failure detection parameter set | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        try {
            ApiResponse<FailureDetectionParameterSet> response = apiInstance.getFdpWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#getFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |

### Return type

ApiResponse<[**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)>


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


## validateCreateFdp

> void validateCreateFdp(failureDetectionParameterSet)

Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/parameterSets&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the failure detection parameter set to be validated.
        try {
            apiInstance.validateCreateFdp(failureDetectionParameterSet);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#validateCreateFdp");
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
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the failure detection parameter set to be validated. | [optional] |

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

## validateCreateFdpWithHttpInfo

> ApiResponse<Void> validateCreateFdp validateCreateFdpWithHttpInfo(failureDetectionParameterSet)

Validates the payload for the &#x60;POST /service/failureDetection/parameterSelection/parameterSets&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the failure detection parameter set to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateFdpWithHttpInfo(failureDetectionParameterSet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#validateCreateFdp");
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
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the failure detection parameter set to be validated. | [optional] |

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


## validateUpdateFdp

> void validateUpdateFdp(id, failureDetectionParameterSet)

Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/parameterSets/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the failure detection parameter set to be validated.
        try {
            apiInstance.validateUpdateFdp(id, failureDetectionParameterSet);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#validateUpdateFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the failure detection parameter set to be validated. | [optional] |

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

## validateUpdateFdpWithHttpInfo

> ApiResponse<Void> validateUpdateFdp validateUpdateFdpWithHttpInfo(id, failureDetectionParameterSet)

Validates the payload for the &#x60;PUT /service/failureDetection/parameterSelection/parameterSets/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ServiceFailureDetectionParameterSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceFailureDetectionParameterSetsApi apiInstance = new ServiceFailureDetectionParameterSetsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required failure detection parameter set.
        FailureDetectionParameterSet failureDetectionParameterSet = new FailureDetectionParameterSet(); // FailureDetectionParameterSet | The JSON body of the request. Contains the failure detection parameter set to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateUpdateFdpWithHttpInfo(id, failureDetectionParameterSet);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceFailureDetectionParameterSetsApi#validateUpdateFdp");
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
| **id** | **String**| The ID of the required failure detection parameter set. | |
| **failureDetectionParameterSet** | [**FailureDetectionParameterSet**](FailureDetectionParameterSet.md)| The JSON body of the request. Contains the failure detection parameter set to be validated. | [optional] |

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

