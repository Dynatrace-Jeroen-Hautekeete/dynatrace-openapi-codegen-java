# SettingsObjectsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSettingsObjectByObjectId**](SettingsObjectsApi.md#deleteSettingsObjectByObjectId) | **DELETE** /settings/objects/{objectId} | Deletes the specified settings object |
| [**deleteSettingsObjectByObjectIdWithHttpInfo**](SettingsObjectsApi.md#deleteSettingsObjectByObjectIdWithHttpInfo) | **DELETE** /settings/objects/{objectId} | Deletes the specified settings object |
| [**getEffectiveSettingsValues**](SettingsObjectsApi.md#getEffectiveSettingsValues) | **GET** /settings/effectiveValues | Lists effective settings values |
| [**getEffectiveSettingsValuesWithHttpInfo**](SettingsObjectsApi.md#getEffectiveSettingsValuesWithHttpInfo) | **GET** /settings/effectiveValues | Lists effective settings values |
| [**getSettingsObjectByObjectId**](SettingsObjectsApi.md#getSettingsObjectByObjectId) | **GET** /settings/objects/{objectId} | Gets the specified settings object |
| [**getSettingsObjectByObjectIdWithHttpInfo**](SettingsObjectsApi.md#getSettingsObjectByObjectIdWithHttpInfo) | **GET** /settings/objects/{objectId} | Gets the specified settings object |
| [**getSettingsObjects**](SettingsObjectsApi.md#getSettingsObjects) | **GET** /settings/objects | Lists persisted settings objects |
| [**getSettingsObjectsWithHttpInfo**](SettingsObjectsApi.md#getSettingsObjectsWithHttpInfo) | **GET** /settings/objects | Lists persisted settings objects |
| [**postSettingsObjects**](SettingsObjectsApi.md#postSettingsObjects) | **POST** /settings/objects | Creates a new settings object |
| [**postSettingsObjectsWithHttpInfo**](SettingsObjectsApi.md#postSettingsObjectsWithHttpInfo) | **POST** /settings/objects | Creates a new settings object |
| [**putSettingsObjectByObjectId**](SettingsObjectsApi.md#putSettingsObjectByObjectId) | **PUT** /settings/objects/{objectId} | Updates an existing settings object |
| [**putSettingsObjectByObjectIdWithHttpInfo**](SettingsObjectsApi.md#putSettingsObjectByObjectIdWithHttpInfo) | **PUT** /settings/objects/{objectId} | Updates an existing settings object |



## deleteSettingsObjectByObjectId

> void deleteSettingsObjectByObjectId(objectId, updateToken)

Deletes the specified settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        String updateToken = "updateToken_example"; // String | The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn't any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks.
        try {
            apiInstance.deleteSettingsObjectByObjectId(objectId, updateToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#deleteSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |
| **updateToken** | **String**| The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn&#39;t any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |

## deleteSettingsObjectByObjectIdWithHttpInfo

> ApiResponse<Void> deleteSettingsObjectByObjectId deleteSettingsObjectByObjectIdWithHttpInfo(objectId, updateToken)

Deletes the specified settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        String updateToken = "updateToken_example"; // String | The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn't any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks.
        try {
            ApiResponse<Void> response = apiInstance.deleteSettingsObjectByObjectIdWithHttpInfo(objectId, updateToken);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#deleteSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |
| **updateToken** | **String**| The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn&#39;t any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |


## getEffectiveSettingsValues

> EffectiveSettingsValuesList getEffectiveSettingsValues(schemaIds, scope, fields, nextPageKey, pageSize)

Lists effective settings values

Lists effective settings values for selected schemas at a selected scope (or entity). This operation evaluates the hierarchy of persisted objects (see [/settings/objects](#/Settings%20-%20Objects/getSettingsObjects))  It will always return a result for a schema/scope combination, even if the schema would not be relevant to the given scope/entity.  If no object along the hierarchy is persisted, the default value as defined in the schema will be returned.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String schemaIds = "schemaIds_example"; // String | A list of comma-separated schema IDs to which the requested objects belong.   Only considered on load of the first page, when the **nextPageKey** is not set.
        String scope = "scope_example"; // String | The scope that the requested objects target.   The selection only matches objects directly targeting the specified scope. For example, `environment` will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, this parameter is required. 
        String fields = "origin,value"; // String | A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, `origin,value`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            EffectiveSettingsValuesList result = apiInstance.getEffectiveSettingsValues(schemaIds, scope, fields, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getEffectiveSettingsValues");
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
| **schemaIds** | **String**| A list of comma-separated schema IDs to which the requested objects belong.   Only considered on load of the first page, when the **nextPageKey** is not set. | [optional] |
| **scope** | **String**| The scope that the requested objects target.   The selection only matches objects directly targeting the specified scope. For example, &#x60;environment&#x60; will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, this parameter is required.  | [optional] |
| **fields** | **String**| A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, &#x60;origin,value&#x60;). | [optional] [default to origin,value] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

[**EffectiveSettingsValuesList**](EffectiveSettingsValuesList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified schema or scope is not found. |  -  |

## getEffectiveSettingsValuesWithHttpInfo

> ApiResponse<EffectiveSettingsValuesList> getEffectiveSettingsValues getEffectiveSettingsValuesWithHttpInfo(schemaIds, scope, fields, nextPageKey, pageSize)

Lists effective settings values

Lists effective settings values for selected schemas at a selected scope (or entity). This operation evaluates the hierarchy of persisted objects (see [/settings/objects](#/Settings%20-%20Objects/getSettingsObjects))  It will always return a result for a schema/scope combination, even if the schema would not be relevant to the given scope/entity.  If no object along the hierarchy is persisted, the default value as defined in the schema will be returned.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String schemaIds = "schemaIds_example"; // String | A list of comma-separated schema IDs to which the requested objects belong.   Only considered on load of the first page, when the **nextPageKey** is not set.
        String scope = "scope_example"; // String | The scope that the requested objects target.   The selection only matches objects directly targeting the specified scope. For example, `environment` will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, this parameter is required. 
        String fields = "origin,value"; // String | A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, `origin,value`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            ApiResponse<EffectiveSettingsValuesList> response = apiInstance.getEffectiveSettingsValuesWithHttpInfo(schemaIds, scope, fields, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getEffectiveSettingsValues");
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
| **schemaIds** | **String**| A list of comma-separated schema IDs to which the requested objects belong.   Only considered on load of the first page, when the **nextPageKey** is not set. | [optional] |
| **scope** | **String**| The scope that the requested objects target.   The selection only matches objects directly targeting the specified scope. For example, &#x60;environment&#x60; will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, this parameter is required.  | [optional] |
| **fields** | **String**| A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, &#x60;origin,value&#x60;). | [optional] [default to origin,value] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

ApiResponse<[**EffectiveSettingsValuesList**](EffectiveSettingsValuesList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The specified schema or scope is not found. |  -  |


## getSettingsObjectByObjectId

> SettingsObject getSettingsObjectByObjectId(objectId)

Gets the specified settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        try {
            SettingsObject result = apiInstance.getSettingsObjectByObjectId(objectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |

### Return type

[**SettingsObject**](SettingsObject.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | No object available for the given objectId |  -  |

## getSettingsObjectByObjectIdWithHttpInfo

> ApiResponse<SettingsObject> getSettingsObjectByObjectId getSettingsObjectByObjectIdWithHttpInfo(objectId)

Gets the specified settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        try {
            ApiResponse<SettingsObject> response = apiInstance.getSettingsObjectByObjectIdWithHttpInfo(objectId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |

### Return type

ApiResponse<[**SettingsObject**](SettingsObject.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | No object available for the given objectId |  -  |


## getSettingsObjects

> ObjectsList getSettingsObjects(schemaIds, scopes, fields, nextPageKey, pageSize)

Lists persisted settings objects

Lists persisted settings objects for selected schemas at selected scopes (or entities).  If nothing is persisted or if all persisted settings objects are not accessible due to missing permissions, no items will be returned.  To query the effective values (including schema defaults) please see [/settings/effectiveValues](#/Settings%20-%20Objects/getEffectiveSettingsValues).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String schemaIds = "schemaIds_example"; // String | A list of comma-separated schema IDs to which the requested objects belong.   To load the first page, when the **nextPageKey** is not set, either this parameter or **scopes** is required.   To load all objects belonging to the given schema IDs leave the **scopes** parameter empty.
        String scopes = "scopes_example"; // String | A list of comma-separated scopes, that the requested objects target.   The selection only matches objects directly targeting the specified scopes. For example, `environment` will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, either this parameter or **schemaIds** is required.   To load all objects belonging to the given scopes leave the **schemaIds** parameter empty.
        String fields = "objectId,value"; // String | A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, `objectId,value`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            ObjectsList result = apiInstance.getSettingsObjects(schemaIds, scopes, fields, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getSettingsObjects");
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
| **schemaIds** | **String**| A list of comma-separated schema IDs to which the requested objects belong.   To load the first page, when the **nextPageKey** is not set, either this parameter or **scopes** is required.   To load all objects belonging to the given schema IDs leave the **scopes** parameter empty. | [optional] |
| **scopes** | **String**| A list of comma-separated scopes, that the requested objects target.   The selection only matches objects directly targeting the specified scopes. For example, &#x60;environment&#x60; will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, either this parameter or **schemaIds** is required.   To load all objects belonging to the given scopes leave the **schemaIds** parameter empty. | [optional] |
| **fields** | **String**| A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, &#x60;objectId,value&#x60;). | [optional] [default to objectId,value] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

[**ObjectsList**](ObjectsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Accessible objects returned. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The specified schema or scope is not found. |  -  |

## getSettingsObjectsWithHttpInfo

> ApiResponse<ObjectsList> getSettingsObjects getSettingsObjectsWithHttpInfo(schemaIds, scopes, fields, nextPageKey, pageSize)

Lists persisted settings objects

Lists persisted settings objects for selected schemas at selected scopes (or entities).  If nothing is persisted or if all persisted settings objects are not accessible due to missing permissions, no items will be returned.  To query the effective values (including schema defaults) please see [/settings/effectiveValues](#/Settings%20-%20Objects/getEffectiveSettingsValues).

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String schemaIds = "schemaIds_example"; // String | A list of comma-separated schema IDs to which the requested objects belong.   To load the first page, when the **nextPageKey** is not set, either this parameter or **scopes** is required.   To load all objects belonging to the given schema IDs leave the **scopes** parameter empty.
        String scopes = "scopes_example"; // String | A list of comma-separated scopes, that the requested objects target.   The selection only matches objects directly targeting the specified scopes. For example, `environment` will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, either this parameter or **schemaIds** is required.   To load all objects belonging to the given scopes leave the **schemaIds** parameter empty.
        String fields = "objectId,value"; // String | A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, `objectId,value`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        try {
            ApiResponse<ObjectsList> response = apiInstance.getSettingsObjectsWithHttpInfo(schemaIds, scopes, fields, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#getSettingsObjects");
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
| **schemaIds** | **String**| A list of comma-separated schema IDs to which the requested objects belong.   To load the first page, when the **nextPageKey** is not set, either this parameter or **scopes** is required.   To load all objects belonging to the given schema IDs leave the **scopes** parameter empty. | [optional] |
| **scopes** | **String**| A list of comma-separated scopes, that the requested objects target.   The selection only matches objects directly targeting the specified scopes. For example, &#x60;environment&#x60; will not match objects that target a host within environment.   To load the first page, when the **nextPageKey** is not set, either this parameter or **schemaIds** is required.   To load all objects belonging to the given scopes leave the **schemaIds** parameter empty. | [optional] |
| **fields** | **String**| A list of fields to be included to the response. The provided set of fields replaces the default set.    Specify the required top-level fields, separated by commas (for example, &#x60;objectId,value&#x60;). | [optional] [default to objectId,value] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of settings objects in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |

### Return type

ApiResponse<[**ObjectsList**](ObjectsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Accessible objects returned. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The specified schema or scope is not found. |  -  |


## postSettingsObjects

> List<SettingsObjectResponse> postSettingsObjects(validateOnly, settingsObjectCreate)

Creates a new settings object

You can upload several objects at once. In that case each object returns its own response code. Check the response body for details.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        Boolean validateOnly = false; // Boolean | If `true`, the request runs only validation of the submitted settings objects, without saving them.
        List<SettingsObjectCreate> settingsObjectCreate = Arrays.asList(); // List<SettingsObjectCreate> | The JSON body of the request. Contains the settings objects.
        try {
            List<SettingsObjectResponse> result = apiInstance.postSettingsObjects(validateOnly, settingsObjectCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#postSettingsObjects");
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
| **validateOnly** | **Boolean**| If &#x60;true&#x60;, the request runs only validation of the submitted settings objects, without saving them. | [optional] [default to false] |
| **settingsObjectCreate** | [**List&lt;SettingsObjectCreate&gt;**](SettingsObjectCreate.md)| The JSON body of the request. Contains the settings objects. | [optional] |

### Return type

[**List&lt;SettingsObjectResponse&gt;**](SettingsObjectResponse.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **207** | Multi-status: different objects in the payload resulted in different statuses. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |

## postSettingsObjectsWithHttpInfo

> ApiResponse<List<SettingsObjectResponse>> postSettingsObjects postSettingsObjectsWithHttpInfo(validateOnly, settingsObjectCreate)

Creates a new settings object

You can upload several objects at once. In that case each object returns its own response code. Check the response body for details.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        Boolean validateOnly = false; // Boolean | If `true`, the request runs only validation of the submitted settings objects, without saving them.
        List<SettingsObjectCreate> settingsObjectCreate = Arrays.asList(); // List<SettingsObjectCreate> | The JSON body of the request. Contains the settings objects.
        try {
            ApiResponse<List<SettingsObjectResponse>> response = apiInstance.postSettingsObjectsWithHttpInfo(validateOnly, settingsObjectCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#postSettingsObjects");
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
| **validateOnly** | **Boolean**| If &#x60;true&#x60;, the request runs only validation of the submitted settings objects, without saving them. | [optional] [default to false] |
| **settingsObjectCreate** | [**List&lt;SettingsObjectCreate&gt;**](SettingsObjectCreate.md)| The JSON body of the request. Contains the settings objects. | [optional] |

### Return type

ApiResponse<[**List&lt;SettingsObjectResponse&gt;**](SettingsObjectResponse.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **207** | Multi-status: different objects in the payload resulted in different statuses. |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |


## putSettingsObjectByObjectId

> SettingsObjectResponse putSettingsObjectByObjectId(objectId, settingsObjectUpdate)

Updates an existing settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        SettingsObjectUpdate settingsObjectUpdate = new SettingsObjectUpdate(); // SettingsObjectUpdate | The JSON body of the request. Contains updated parameters of the settings object.
        try {
            SettingsObjectResponse result = apiInstance.putSettingsObjectByObjectId(objectId, settingsObjectUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#putSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |
| **settingsObjectUpdate** | [**SettingsObjectUpdate**](SettingsObjectUpdate.md)| The JSON body of the request. Contains updated parameters of the settings object. | [optional] |

### Return type

[**SettingsObjectResponse**](SettingsObjectResponse.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |

## putSettingsObjectByObjectIdWithHttpInfo

> ApiResponse<SettingsObjectResponse> putSettingsObjectByObjectId putSettingsObjectByObjectIdWithHttpInfo(objectId, settingsObjectUpdate)

Updates an existing settings object

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsObjectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsObjectsApi apiInstance = new SettingsObjectsApi(defaultClient);
        String objectId = "objectId_example"; // String | The ID of the required settings object.
        SettingsObjectUpdate settingsObjectUpdate = new SettingsObjectUpdate(); // SettingsObjectUpdate | The JSON body of the request. Contains updated parameters of the settings object.
        try {
            ApiResponse<SettingsObjectResponse> response = apiInstance.putSettingsObjectByObjectIdWithHttpInfo(objectId, settingsObjectUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsObjectsApi#putSettingsObjectByObjectId");
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
| **objectId** | **String**| The ID of the required settings object. | |
| **settingsObjectUpdate** | [**SettingsObjectUpdate**](SettingsObjectUpdate.md)| The JSON body of the request. Contains updated parameters of the settings object. | [optional] |

### Return type

ApiResponse<[**SettingsObjectResponse**](SettingsObjectResponse.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Failed. Forbidden. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **400** | Failed. Schema validation failed. |  -  |

