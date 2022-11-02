# SettingsSchemasApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailableSchemaDefinitions**](SettingsSchemasApi.md#getAvailableSchemaDefinitions) | **GET** /settings/schemas | Lists available settings schemas |
| [**getAvailableSchemaDefinitionsWithHttpInfo**](SettingsSchemasApi.md#getAvailableSchemaDefinitionsWithHttpInfo) | **GET** /settings/schemas | Lists available settings schemas |
| [**getSchemaDefinition**](SettingsSchemasApi.md#getSchemaDefinition) | **GET** /settings/schemas/{schemaId} | Gets parameters of the specified settings schema |
| [**getSchemaDefinitionWithHttpInfo**](SettingsSchemasApi.md#getSchemaDefinitionWithHttpInfo) | **GET** /settings/schemas/{schemaId} | Gets parameters of the specified settings schema |



## getAvailableSchemaDefinitions

> SchemaList getAvailableSchemaDefinitions()

Lists available settings schemas

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsSchemasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsSchemasApi apiInstance = new SettingsSchemasApi(defaultClient);
        try {
            SchemaList result = apiInstance.getAvailableSchemaDefinitions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsSchemasApi#getAvailableSchemaDefinitions");
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

[**SchemaList**](SchemaList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAvailableSchemaDefinitionsWithHttpInfo

> ApiResponse<SchemaList> getAvailableSchemaDefinitions getAvailableSchemaDefinitionsWithHttpInfo()

Lists available settings schemas

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsSchemasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsSchemasApi apiInstance = new SettingsSchemasApi(defaultClient);
        try {
            ApiResponse<SchemaList> response = apiInstance.getAvailableSchemaDefinitionsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsSchemasApi#getAvailableSchemaDefinitions");
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

ApiResponse<[**SchemaList**](SchemaList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSchemaDefinition

> SchemaDefinitionRestDto getSchemaDefinition(schemaId, schemaVersion)

Gets parameters of the specified settings schema

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsSchemasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsSchemasApi apiInstance = new SettingsSchemasApi(defaultClient);
        String schemaId = "schemaId_example"; // String | The ID of the required schema.
        String schemaVersion = "schemaVersion_example"; // String | The version of the required schema.    If not set, the most recent version is returned.
        try {
            SchemaDefinitionRestDto result = apiInstance.getSchemaDefinition(schemaId, schemaVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsSchemasApi#getSchemaDefinition");
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
| **schemaId** | **String**| The ID of the required schema. | |
| **schemaVersion** | **String**| The version of the required schema.    If not set, the most recent version is returned. | [optional] |

### Return type

[**SchemaDefinitionRestDto**](SchemaDefinitionRestDto.md)


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
| **404** | Failed. The specified schema doesn&#39;t exist. |  -  |

## getSchemaDefinitionWithHttpInfo

> ApiResponse<SchemaDefinitionRestDto> getSchemaDefinition getSchemaDefinitionWithHttpInfo(schemaId, schemaVersion)

Gets parameters of the specified settings schema

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SettingsSchemasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SettingsSchemasApi apiInstance = new SettingsSchemasApi(defaultClient);
        String schemaId = "schemaId_example"; // String | The ID of the required schema.
        String schemaVersion = "schemaVersion_example"; // String | The version of the required schema.    If not set, the most recent version is returned.
        try {
            ApiResponse<SchemaDefinitionRestDto> response = apiInstance.getSchemaDefinitionWithHttpInfo(schemaId, schemaVersion);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsSchemasApi#getSchemaDefinition");
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
| **schemaId** | **String**| The ID of the required schema. | |
| **schemaVersion** | **String**| The version of the required schema.    If not set, the most recent version is returned. | [optional] |

### Return type

ApiResponse<[**SchemaDefinitionRestDto**](SchemaDefinitionRestDto.md)>


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
| **404** | Failed. The specified schema doesn&#39;t exist. |  -  |

