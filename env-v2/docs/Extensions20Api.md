# Extensions20Api

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateExtensionEnvironmentConfiguration**](Extensions20Api.md#activateExtensionEnvironmentConfiguration) | **POST** /extensions/{extensionName}/environmentConfiguration | Activates the environment configuration from the specified version of the extension 2.0 |
| [**activateExtensionEnvironmentConfigurationWithHttpInfo**](Extensions20Api.md#activateExtensionEnvironmentConfigurationWithHttpInfo) | **POST** /extensions/{extensionName}/environmentConfiguration | Activates the environment configuration from the specified version of the extension 2.0 |
| [**createMonitoringConfiguration**](Extensions20Api.md#createMonitoringConfiguration) | **POST** /extensions/{extensionName}/monitoringConfigurations | Creates new monitoring configuration for the specified extension 2.0 |
| [**createMonitoringConfigurationWithHttpInfo**](Extensions20Api.md#createMonitoringConfigurationWithHttpInfo) | **POST** /extensions/{extensionName}/monitoringConfigurations | Creates new monitoring configuration for the specified extension 2.0 |
| [**deleteEnvironmentConfiguration**](Extensions20Api.md#deleteEnvironmentConfiguration) | **DELETE** /extensions/{extensionName}/environmentConfiguration | Deactivates the environment configuration of the specified extension 2.0 |
| [**deleteEnvironmentConfigurationWithHttpInfo**](Extensions20Api.md#deleteEnvironmentConfigurationWithHttpInfo) | **DELETE** /extensions/{extensionName}/environmentConfiguration | Deactivates the environment configuration of the specified extension 2.0 |
| [**extensionConfigurationSchema**](Extensions20Api.md#extensionConfigurationSchema) | **GET** /extensions/{extensionName}/{extensionVersion}/schema | Gets the configuration schema of the specified version of the extension 2.0 |
| [**extensionConfigurationSchemaWithHttpInfo**](Extensions20Api.md#extensionConfigurationSchemaWithHttpInfo) | **GET** /extensions/{extensionName}/{extensionVersion}/schema | Gets the configuration schema of the specified version of the extension 2.0 |
| [**extensionDetails**](Extensions20Api.md#extensionDetails) | **GET** /extensions/{extensionName}/{extensionVersion} | Gets details of the specified version of the extension 2.0 |
| [**extensionDetailsWithHttpInfo**](Extensions20Api.md#extensionDetailsWithHttpInfo) | **GET** /extensions/{extensionName}/{extensionVersion} | Gets details of the specified version of the extension 2.0 |
| [**extensionMonitoringConfigurations**](Extensions20Api.md#extensionMonitoringConfigurations) | **GET** /extensions/{extensionName}/monitoringConfigurations | Lists all the monitoring configurations of the specified extension 2.0 |
| [**extensionMonitoringConfigurationsWithHttpInfo**](Extensions20Api.md#extensionMonitoringConfigurationsWithHttpInfo) | **GET** /extensions/{extensionName}/monitoringConfigurations | Lists all the monitoring configurations of the specified extension 2.0 |
| [**getActiveEnvironmentConfiguration**](Extensions20Api.md#getActiveEnvironmentConfiguration) | **GET** /extensions/{extensionName}/environmentConfiguration | Gets the active environment configuration version of the specified extension 2.0 |
| [**getActiveEnvironmentConfigurationWithHttpInfo**](Extensions20Api.md#getActiveEnvironmentConfigurationWithHttpInfo) | **GET** /extensions/{extensionName}/environmentConfiguration | Gets the active environment configuration version of the specified extension 2.0 |
| [**getEnvironmentConfigurationEvents**](Extensions20Api.md#getEnvironmentConfigurationEvents) | **GET** /extensions/{extensionName}/environmentConfiguration/events | List of the latest extension environment configuration events |
| [**getEnvironmentConfigurationEventsWithHttpInfo**](Extensions20Api.md#getEnvironmentConfigurationEventsWithHttpInfo) | **GET** /extensions/{extensionName}/environmentConfiguration/events | List of the latest extension environment configuration events |
| [**getExtensionMonitoringConfigurationEvents**](Extensions20Api.md#getExtensionMonitoringConfigurationEvents) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId}/events | Gets the list of the events linked to specific monitoring configuration |
| [**getExtensionMonitoringConfigurationEventsWithHttpInfo**](Extensions20Api.md#getExtensionMonitoringConfigurationEventsWithHttpInfo) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId}/events | Gets the list of the events linked to specific monitoring configuration |
| [**getExtensionMonitoringConfigurationStatus**](Extensions20Api.md#getExtensionMonitoringConfigurationStatus) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId}/status | Gets the most recent status of the execution of given monitoring configuration |
| [**getExtensionMonitoringConfigurationStatusWithHttpInfo**](Extensions20Api.md#getExtensionMonitoringConfigurationStatusWithHttpInfo) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId}/status | Gets the most recent status of the execution of given monitoring configuration |
| [**getSchemaFile**](Extensions20Api.md#getSchemaFile) | **GET** /extensions/schemas/{schemaVersion}/{fileName} | Gets the extension 2.0 schema file in the specified version |
| [**getSchemaFileWithHttpInfo**](Extensions20Api.md#getSchemaFileWithHttpInfo) | **GET** /extensions/schemas/{schemaVersion}/{fileName} | Gets the extension 2.0 schema file in the specified version |
| [**listExtensionVersions**](Extensions20Api.md#listExtensionVersions) | **GET** /extensions/{extensionName} | Lists all versions of the extension 2.0 |
| [**listExtensionVersionsWithHttpInfo**](Extensions20Api.md#listExtensionVersionsWithHttpInfo) | **GET** /extensions/{extensionName} | Lists all versions of the extension 2.0 |
| [**listExtensions**](Extensions20Api.md#listExtensions) | **GET** /extensions | Lists all the extensions 2.0 available in your environment |
| [**listExtensionsWithHttpInfo**](Extensions20Api.md#listExtensionsWithHttpInfo) | **GET** /extensions | Lists all the extensions 2.0 available in your environment |
| [**listSchemaFiles**](Extensions20Api.md#listSchemaFiles) | **GET** /extensions/schemas/{schemaVersion} | Lists all the files available for the specified extension 2.0 schema version |
| [**listSchemaFilesWithHttpInfo**](Extensions20Api.md#listSchemaFilesWithHttpInfo) | **GET** /extensions/schemas/{schemaVersion} | Lists all the files available for the specified extension 2.0 schema version |
| [**listSchemas**](Extensions20Api.md#listSchemas) | **GET** /extensions/schemas | Lists all the extension 2.0 schemas versions available in your environment |
| [**listSchemasWithHttpInfo**](Extensions20Api.md#listSchemasWithHttpInfo) | **GET** /extensions/schemas | Lists all the extension 2.0 schemas versions available in your environment |
| [**monitoringConfigurationDetails**](Extensions20Api.md#monitoringConfigurationDetails) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Gets the details of the specified monitoring configuration |
| [**monitoringConfigurationDetailsWithHttpInfo**](Extensions20Api.md#monitoringConfigurationDetailsWithHttpInfo) | **GET** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Gets the details of the specified monitoring configuration |
| [**removeExtension**](Extensions20Api.md#removeExtension) | **DELETE** /extensions/{extensionName}/{extensionVersion} | Deletes the specified version of the extension 2.0 |
| [**removeExtensionWithHttpInfo**](Extensions20Api.md#removeExtensionWithHttpInfo) | **DELETE** /extensions/{extensionName}/{extensionVersion} | Deletes the specified version of the extension 2.0 |
| [**removeMonitoringConfiguration**](Extensions20Api.md#removeMonitoringConfiguration) | **DELETE** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Deletes the specified monitoring configuration |
| [**removeMonitoringConfigurationWithHttpInfo**](Extensions20Api.md#removeMonitoringConfigurationWithHttpInfo) | **DELETE** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Deletes the specified monitoring configuration |
| [**updateExtensionEnvironmentConfiguration**](Extensions20Api.md#updateExtensionEnvironmentConfiguration) | **PUT** /extensions/{extensionName}/environmentConfiguration | Updates the active environment configuration version of the extension 2.0 |
| [**updateExtensionEnvironmentConfigurationWithHttpInfo**](Extensions20Api.md#updateExtensionEnvironmentConfigurationWithHttpInfo) | **PUT** /extensions/{extensionName}/environmentConfiguration | Updates the active environment configuration version of the extension 2.0 |
| [**updateMonitoringConfiguration**](Extensions20Api.md#updateMonitoringConfiguration) | **PUT** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Updates the specified monitoring configuration |
| [**updateMonitoringConfigurationWithHttpInfo**](Extensions20Api.md#updateMonitoringConfigurationWithHttpInfo) | **PUT** /extensions/{extensionName}/monitoringConfigurations/{configurationId} | Updates the specified monitoring configuration |
| [**uploadExtension**](Extensions20Api.md#uploadExtension) | **POST** /extensions | Uploads or verifies a new extension 2.0 |
| [**uploadExtensionWithHttpInfo**](Extensions20Api.md#uploadExtensionWithHttpInfo) | **POST** /extensions | Uploads or verifies a new extension 2.0 |



## activateExtensionEnvironmentConfiguration

> ExtensionEnvironmentConfigurationVersion activateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion)

Activates the environment configuration from the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = new ExtensionEnvironmentConfigurationVersion(); // ExtensionEnvironmentConfigurationVersion | The version of the requested environment configuration.
        try {
            ExtensionEnvironmentConfigurationVersion result = apiInstance.activateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#activateExtensionEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionEnvironmentConfigurationVersion** | [**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)| The version of the requested environment configuration. | |

### Return type

[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration created. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## activateExtensionEnvironmentConfigurationWithHttpInfo

> ApiResponse<ExtensionEnvironmentConfigurationVersion> activateExtensionEnvironmentConfiguration activateExtensionEnvironmentConfigurationWithHttpInfo(extensionName, extensionEnvironmentConfigurationVersion)

Activates the environment configuration from the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = new ExtensionEnvironmentConfigurationVersion(); // ExtensionEnvironmentConfigurationVersion | The version of the requested environment configuration.
        try {
            ApiResponse<ExtensionEnvironmentConfigurationVersion> response = apiInstance.activateExtensionEnvironmentConfigurationWithHttpInfo(extensionName, extensionEnvironmentConfigurationVersion);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#activateExtensionEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionEnvironmentConfigurationVersion** | [**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)| The version of the requested environment configuration. | |

### Return type

ApiResponse<[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration created. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## createMonitoringConfiguration

> List<MonitoringConfigurationResponse> createMonitoringConfiguration(extensionName, monitoringConfigurationDto)

Creates new monitoring configuration for the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        List<MonitoringConfigurationDto> monitoringConfigurationDto = Arrays.asList(); // List<MonitoringConfigurationDto> | JSON body of the request, containing monitoring configuration parameters.
        try {
            List<MonitoringConfigurationResponse> result = apiInstance.createMonitoringConfiguration(extensionName, monitoringConfigurationDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#createMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **monitoringConfigurationDto** | [**List&lt;MonitoringConfigurationDto&gt;**](MonitoringConfigurationDto.md)| JSON body of the request, containing monitoring configuration parameters. | |

### Return type

[**List&lt;MonitoringConfigurationResponse&gt;**](MonitoringConfigurationResponse.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **207** | Multi-Status, if not all requests resulted in the same status |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## createMonitoringConfigurationWithHttpInfo

> ApiResponse<List<MonitoringConfigurationResponse>> createMonitoringConfiguration createMonitoringConfigurationWithHttpInfo(extensionName, monitoringConfigurationDto)

Creates new monitoring configuration for the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        List<MonitoringConfigurationDto> monitoringConfigurationDto = Arrays.asList(); // List<MonitoringConfigurationDto> | JSON body of the request, containing monitoring configuration parameters.
        try {
            ApiResponse<List<MonitoringConfigurationResponse>> response = apiInstance.createMonitoringConfigurationWithHttpInfo(extensionName, monitoringConfigurationDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#createMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **monitoringConfigurationDto** | [**List&lt;MonitoringConfigurationDto&gt;**](MonitoringConfigurationDto.md)| JSON body of the request, containing monitoring configuration parameters. | |

### Return type

ApiResponse<[**List&lt;MonitoringConfigurationResponse&gt;**](MonitoringConfigurationResponse.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **207** | Multi-Status, if not all requests resulted in the same status |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## deleteEnvironmentConfiguration

> ExtensionEnvironmentConfigurationVersion deleteEnvironmentConfiguration(extensionName)

Deactivates the environment configuration of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        try {
            ExtensionEnvironmentConfigurationVersion result = apiInstance.deleteEnvironmentConfiguration(extensionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#deleteEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |

### Return type

[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration deactivated. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## deleteEnvironmentConfigurationWithHttpInfo

> ApiResponse<ExtensionEnvironmentConfigurationVersion> deleteEnvironmentConfiguration deleteEnvironmentConfigurationWithHttpInfo(extensionName)

Deactivates the environment configuration of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        try {
            ApiResponse<ExtensionEnvironmentConfigurationVersion> response = apiInstance.deleteEnvironmentConfigurationWithHttpInfo(extensionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#deleteEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |

### Return type

ApiResponse<[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration deactivated. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## extensionConfigurationSchema

> SchemaDefinitionRestDto extensionConfigurationSchema(extensionName, extensionVersion)

Gets the configuration schema of the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        try {
            SchemaDefinitionRestDto result = apiInstance.extensionConfigurationSchema(extensionName, extensionVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionConfigurationSchema");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |

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
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## extensionConfigurationSchemaWithHttpInfo

> ApiResponse<SchemaDefinitionRestDto> extensionConfigurationSchema extensionConfigurationSchemaWithHttpInfo(extensionName, extensionVersion)

Gets the configuration schema of the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        try {
            ApiResponse<SchemaDefinitionRestDto> response = apiInstance.extensionConfigurationSchemaWithHttpInfo(extensionName, extensionVersion);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionConfigurationSchema");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |

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
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## extensionDetails

> Extension extensionDetails(extensionName, extensionVersion, accept)

Gets details of the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        String accept = "accept_example"; // String | Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset=utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server.
        try {
            Extension result = apiInstance.extensionDetails(extensionName, extensionVersion, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionDetails");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |
| **accept** | **String**| Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset&#x3D;utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server. | [optional] |

### Return type

[**Extension**](Extension.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **406** | Not acceptable |  -  |

## extensionDetailsWithHttpInfo

> ApiResponse<Extension> extensionDetails extensionDetailsWithHttpInfo(extensionName, extensionVersion, accept)

Gets details of the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        String accept = "accept_example"; // String | Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset=utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server.
        try {
            ApiResponse<Extension> response = apiInstance.extensionDetailsWithHttpInfo(extensionName, extensionVersion, accept);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionDetails");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |
| **accept** | **String**| Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset&#x3D;utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server. | [optional] |

### Return type

ApiResponse<[**Extension**](Extension.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **406** | Not acceptable |  -  |


## extensionMonitoringConfigurations

> ExtensionMonitoringConfigurationsList extensionMonitoringConfigurations(extensionName, nextPageKey, pageSize, version, active)

Lists all the monitoring configurations of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        String version = "version_example"; // String | Filters the resulting set of configurations by extension 2.0 version.
        Boolean active = true; // Boolean | Filters the resulting set of configurations by the active state.
        try {
            ExtensionMonitoringConfigurationsList result = apiInstance.extensionMonitoringConfigurations(extensionName, nextPageKey, pageSize, version, active);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionMonitoringConfigurations");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |
| **version** | **String**| Filters the resulting set of configurations by extension 2.0 version. | [optional] |
| **active** | **Boolean**| Filters the resulting set of configurations by the active state. | [optional] |

### Return type

[**ExtensionMonitoringConfigurationsList**](ExtensionMonitoringConfigurationsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## extensionMonitoringConfigurationsWithHttpInfo

> ApiResponse<ExtensionMonitoringConfigurationsList> extensionMonitoringConfigurations extensionMonitoringConfigurationsWithHttpInfo(extensionName, nextPageKey, pageSize, version, active)

Lists all the monitoring configurations of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        String version = "version_example"; // String | Filters the resulting set of configurations by extension 2.0 version.
        Boolean active = true; // Boolean | Filters the resulting set of configurations by the active state.
        try {
            ApiResponse<ExtensionMonitoringConfigurationsList> response = apiInstance.extensionMonitoringConfigurationsWithHttpInfo(extensionName, nextPageKey, pageSize, version, active);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#extensionMonitoringConfigurations");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |
| **version** | **String**| Filters the resulting set of configurations by extension 2.0 version. | [optional] |
| **active** | **Boolean**| Filters the resulting set of configurations by the active state. | [optional] |

### Return type

ApiResponse<[**ExtensionMonitoringConfigurationsList**](ExtensionMonitoringConfigurationsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getActiveEnvironmentConfiguration

> ExtensionEnvironmentConfigurationVersion getActiveEnvironmentConfiguration(extensionName)

Gets the active environment configuration version of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        try {
            ExtensionEnvironmentConfigurationVersion result = apiInstance.getActiveEnvironmentConfiguration(extensionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getActiveEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |

### Return type

[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getActiveEnvironmentConfigurationWithHttpInfo

> ApiResponse<ExtensionEnvironmentConfigurationVersion> getActiveEnvironmentConfiguration getActiveEnvironmentConfigurationWithHttpInfo(extensionName)

Gets the active environment configuration version of the specified extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        try {
            ApiResponse<ExtensionEnvironmentConfigurationVersion> response = apiInstance.getActiveEnvironmentConfigurationWithHttpInfo(extensionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getActiveEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |

### Return type

ApiResponse<[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getEnvironmentConfigurationEvents

> ExtensionEventsList getEnvironmentConfigurationEvents(extensionName, from, to, content, status)

List of the latest extension environment configuration events

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String content = "content_example"; // String | Content of the event
        String status = "ERROR"; // String | Status of the event
        try {
            ExtensionEventsList result = apiInstance.getEnvironmentConfigurationEvents(extensionName, from, to, content, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getEnvironmentConfigurationEvents");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **content** | **String**| Content of the event | [optional] |
| **status** | **String**| Status of the event | [optional] [enum: ERROR, INFO, NONE, WARN] |

### Return type

[**ExtensionEventsList**](ExtensionEventsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of the latest extension environment configuration events |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getEnvironmentConfigurationEventsWithHttpInfo

> ApiResponse<ExtensionEventsList> getEnvironmentConfigurationEvents getEnvironmentConfigurationEventsWithHttpInfo(extensionName, from, to, content, status)

List of the latest extension environment configuration events

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String content = "content_example"; // String | Content of the event
        String status = "ERROR"; // String | Status of the event
        try {
            ApiResponse<ExtensionEventsList> response = apiInstance.getEnvironmentConfigurationEventsWithHttpInfo(extensionName, from, to, content, status);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getEnvironmentConfigurationEvents");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **content** | **String**| Content of the event | [optional] |
| **status** | **String**| Status of the event | [optional] [enum: ERROR, INFO, NONE, WARN] |

### Return type

ApiResponse<[**ExtensionEventsList**](ExtensionEventsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of the latest extension environment configuration events |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getExtensionMonitoringConfigurationEvents

> ExtensionEventsList getExtensionMonitoringConfigurationEvents(extensionName, configurationId, from, to, dtEntityHost, dtActiveGateId, dtExtensionDs, content, status)

Gets the list of the events linked to specific monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String dtEntityHost = "dtEntityHost_example"; // String | Host that uses this monitoring configuration.  Example: `HOST-ABCDEF0123456789`
        String dtActiveGateId = "dtActiveGateId_example"; // String | Hexadecimal ID of Active Gate that uses this monitoring configuration.  Example: `0x1a2b3c4d`
        String dtExtensionDs = "dtExtensionDs_example"; // String | Data source that uses this monitoring configuration.  Example: `snmp`
        String content = "content_example"; // String | Content of the event
        String status = "ERROR"; // String | Status of the event
        try {
            ExtensionEventsList result = apiInstance.getExtensionMonitoringConfigurationEvents(extensionName, configurationId, from, to, dtEntityHost, dtActiveGateId, dtExtensionDs, content, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getExtensionMonitoringConfigurationEvents");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **dtEntityHost** | **String**| Host that uses this monitoring configuration.  Example: &#x60;HOST-ABCDEF0123456789&#x60; | [optional] |
| **dtActiveGateId** | **String**| Hexadecimal ID of Active Gate that uses this monitoring configuration.  Example: &#x60;0x1a2b3c4d&#x60; | [optional] |
| **dtExtensionDs** | **String**| Data source that uses this monitoring configuration.  Example: &#x60;snmp&#x60; | [optional] |
| **content** | **String**| Content of the event | [optional] |
| **status** | **String**| Status of the event | [optional] [enum: ERROR, INFO, NONE, WARN] |

### Return type

[**ExtensionEventsList**](ExtensionEventsList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getExtensionMonitoringConfigurationEventsWithHttpInfo

> ApiResponse<ExtensionEventsList> getExtensionMonitoringConfigurationEvents getExtensionMonitoringConfigurationEventsWithHttpInfo(extensionName, configurationId, from, to, dtEntityHost, dtActiveGateId, dtExtensionDs, content, status)

Gets the list of the events linked to specific monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String dtEntityHost = "dtEntityHost_example"; // String | Host that uses this monitoring configuration.  Example: `HOST-ABCDEF0123456789`
        String dtActiveGateId = "dtActiveGateId_example"; // String | Hexadecimal ID of Active Gate that uses this monitoring configuration.  Example: `0x1a2b3c4d`
        String dtExtensionDs = "dtExtensionDs_example"; // String | Data source that uses this monitoring configuration.  Example: `snmp`
        String content = "content_example"; // String | Content of the event
        String status = "ERROR"; // String | Status of the event
        try {
            ApiResponse<ExtensionEventsList> response = apiInstance.getExtensionMonitoringConfigurationEventsWithHttpInfo(extensionName, configurationId, from, to, dtEntityHost, dtActiveGateId, dtExtensionDs, content, status);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getExtensionMonitoringConfigurationEvents");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **dtEntityHost** | **String**| Host that uses this monitoring configuration.  Example: &#x60;HOST-ABCDEF0123456789&#x60; | [optional] |
| **dtActiveGateId** | **String**| Hexadecimal ID of Active Gate that uses this monitoring configuration.  Example: &#x60;0x1a2b3c4d&#x60; | [optional] |
| **dtExtensionDs** | **String**| Data source that uses this monitoring configuration.  Example: &#x60;snmp&#x60; | [optional] |
| **content** | **String**| Content of the event | [optional] |
| **status** | **String**| Status of the event | [optional] [enum: ERROR, INFO, NONE, WARN] |

### Return type

ApiResponse<[**ExtensionEventsList**](ExtensionEventsList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getExtensionMonitoringConfigurationStatus

> ExtensionStatusDto getExtensionMonitoringConfigurationStatus(extensionName, configurationId)

Gets the most recent status of the execution of given monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            ExtensionStatusDto result = apiInstance.getExtensionMonitoringConfigurationStatus(extensionName, configurationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getExtensionMonitoringConfigurationStatus");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

### Return type

[**ExtensionStatusDto**](ExtensionStatusDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getExtensionMonitoringConfigurationStatusWithHttpInfo

> ApiResponse<ExtensionStatusDto> getExtensionMonitoringConfigurationStatus getExtensionMonitoringConfigurationStatusWithHttpInfo(extensionName, configurationId)

Gets the most recent status of the execution of given monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            ApiResponse<ExtensionStatusDto> response = apiInstance.getExtensionMonitoringConfigurationStatusWithHttpInfo(extensionName, configurationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getExtensionMonitoringConfigurationStatus");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

### Return type

ApiResponse<[**ExtensionStatusDto**](ExtensionStatusDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getSchemaFile

> Object getSchemaFile(schemaVersion, fileName)

Gets the extension 2.0 schema file in the specified version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String schemaVersion = "schemaVersion_example"; // String | The version of the schema.
        String fileName = "fileName_example"; // String | The name of the schema file.
        try {
            Object result = apiInstance.getSchemaFile(schemaVersion, fileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getSchemaFile");
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
| **schemaVersion** | **String**| The version of the schema. | |
| **fileName** | **String**| The name of the schema file. | |

### Return type

**Object**


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getSchemaFileWithHttpInfo

> ApiResponse<Object> getSchemaFile getSchemaFileWithHttpInfo(schemaVersion, fileName)

Gets the extension 2.0 schema file in the specified version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String schemaVersion = "schemaVersion_example"; // String | The version of the schema.
        String fileName = "fileName_example"; // String | The name of the schema file.
        try {
            ApiResponse<Object> response = apiInstance.getSchemaFileWithHttpInfo(schemaVersion, fileName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#getSchemaFile");
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
| **schemaVersion** | **String**| The version of the schema. | |
| **fileName** | **String**| The name of the schema file. | |

### Return type

ApiResponse<**Object**>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## listExtensionVersions

> ExtensionList listExtensionVersions(extensionName, nextPageKey, pageSize)

Lists all versions of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        try {
            ExtensionList result = apiInstance.listExtensionVersions(extensionName, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listExtensionVersions");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |

### Return type

[**ExtensionList**](ExtensionList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## listExtensionVersionsWithHttpInfo

> ApiResponse<ExtensionList> listExtensionVersions listExtensionVersionsWithHttpInfo(extensionName, nextPageKey, pageSize)

Lists all versions of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        try {
            ApiResponse<ExtensionList> response = apiInstance.listExtensionVersionsWithHttpInfo(extensionName, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listExtensionVersions");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |

### Return type

ApiResponse<[**ExtensionList**](ExtensionList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## listExtensions

> ExtensionList listExtensions(nextPageKey, pageSize, name)

Lists all the extensions 2.0 available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        String name = "name_example"; // String | Filters the resulting set of extensions 2.0 by name. You can specify a partial name. In that case, the CONTAINS operator is used.
        try {
            ExtensionList result = apiInstance.listExtensions(nextPageKey, pageSize, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listExtensions");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |
| **name** | **String**| Filters the resulting set of extensions 2.0 by name. You can specify a partial name. In that case, the CONTAINS operator is used. | [optional] |

### Return type

[**ExtensionList**](ExtensionList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listExtensionsWithHttpInfo

> ApiResponse<ExtensionList> listExtensions listExtensionsWithHttpInfo(nextPageKey, pageSize, name)

Lists all the extensions 2.0 available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used.
        String name = "name_example"; // String | Filters the resulting set of extensions 2.0 by name. You can specify a partial name. In that case, the CONTAINS operator is used.
        try {
            ApiResponse<ExtensionList> response = apiInstance.listExtensionsWithHttpInfo(nextPageKey, pageSize, name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listExtensions");
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
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of extensions in a single response payload.   The maximal allowed page size is 100.   If not set, 20 is used. | [optional] |
| **name** | **String**| Filters the resulting set of extensions 2.0 by name. You can specify a partial name. In that case, the CONTAINS operator is used. | [optional] |

### Return type

ApiResponse<[**ExtensionList**](ExtensionList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listSchemaFiles

> SchemaFiles listSchemaFiles(schemaVersion, accept)

Lists all the files available for the specified extension 2.0 schema version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String schemaVersion = "schemaVersion_example"; // String | The version of the schema.
        String accept = "accept_example"; // String | Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset=utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server.
        try {
            SchemaFiles result = apiInstance.listSchemaFiles(schemaVersion, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listSchemaFiles");
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
| **schemaVersion** | **String**| The version of the schema. | |
| **accept** | **String**| Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset&#x3D;utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server. | [optional] |

### Return type

[**SchemaFiles**](SchemaFiles.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **406** | Not acceptable |  -  |

## listSchemaFilesWithHttpInfo

> ApiResponse<SchemaFiles> listSchemaFiles listSchemaFilesWithHttpInfo(schemaVersion, accept)

Lists all the files available for the specified extension 2.0 schema version

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String schemaVersion = "schemaVersion_example"; // String | The version of the schema.
        String accept = "accept_example"; // String | Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset=utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server.
        try {
            ApiResponse<SchemaFiles> response = apiInstance.listSchemaFilesWithHttpInfo(schemaVersion, accept);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listSchemaFiles");
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
| **schemaVersion** | **String**| The version of the schema. | |
| **accept** | **String**| Accept header. Specifies part of the extension 2.0 that will be returned:  * application/json; charset&#x3D;utf-8 - returns extension 2.0 metadata in JSON  * application/octet-stream - returns extension 2.0 zip package stored on the server. | [optional] |

### Return type

ApiResponse<[**SchemaFiles**](SchemaFiles.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **406** | Not acceptable |  -  |


## listSchemas

> SchemasList listSchemas()

Lists all the extension 2.0 schemas versions available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        try {
            SchemasList result = apiInstance.listSchemas();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listSchemas");
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

[**SchemasList**](SchemasList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listSchemasWithHttpInfo

> ApiResponse<SchemasList> listSchemas listSchemasWithHttpInfo()

Lists all the extension 2.0 schemas versions available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        try {
            ApiResponse<SchemasList> response = apiInstance.listSchemasWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#listSchemas");
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

ApiResponse<[**SchemasList**](SchemasList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## monitoringConfigurationDetails

> ExtensionMonitoringConfiguration monitoringConfigurationDetails(extensionName, configurationId)

Gets the details of the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            ExtensionMonitoringConfiguration result = apiInstance.monitoringConfigurationDetails(extensionName, configurationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#monitoringConfigurationDetails");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

### Return type

[**ExtensionMonitoringConfiguration**](ExtensionMonitoringConfiguration.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## monitoringConfigurationDetailsWithHttpInfo

> ApiResponse<ExtensionMonitoringConfiguration> monitoringConfigurationDetails monitoringConfigurationDetailsWithHttpInfo(extensionName, configurationId)

Gets the details of the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            ApiResponse<ExtensionMonitoringConfiguration> response = apiInstance.monitoringConfigurationDetailsWithHttpInfo(extensionName, configurationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#monitoringConfigurationDetails");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

### Return type

ApiResponse<[**ExtensionMonitoringConfiguration**](ExtensionMonitoringConfiguration.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## removeExtension

> Extension removeExtension(extensionName, extensionVersion)

Deletes the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        try {
            Extension result = apiInstance.removeExtension(extensionName, extensionVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#removeExtension");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |

### Return type

[**Extension**](Extension.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The extension 2.0 version has been deleted. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## removeExtensionWithHttpInfo

> ApiResponse<Extension> removeExtension removeExtensionWithHttpInfo(extensionName, extensionVersion)

Deletes the specified version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String extensionVersion = "extensionVersion_example"; // String | The version of the requested extension 2.0
        try {
            ApiResponse<Extension> response = apiInstance.removeExtensionWithHttpInfo(extensionName, extensionVersion);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#removeExtension");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionVersion** | **String**| The version of the requested extension 2.0 | |

### Return type

ApiResponse<[**Extension**](Extension.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The extension 2.0 version has been deleted. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## removeMonitoringConfiguration

> void removeMonitoringConfiguration(extensionName, configurationId)

Deletes the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            apiInstance.removeMonitoringConfiguration(extensionName, configurationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#removeMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

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
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## removeMonitoringConfigurationWithHttpInfo

> ApiResponse<Void> removeMonitoringConfiguration removeMonitoringConfigurationWithHttpInfo(extensionName, configurationId)

Deletes the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        try {
            ApiResponse<Void> response = apiInstance.removeMonitoringConfigurationWithHttpInfo(extensionName, configurationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#removeMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |

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
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## updateExtensionEnvironmentConfiguration

> ExtensionEnvironmentConfigurationVersion updateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion)

Updates the active environment configuration version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = new ExtensionEnvironmentConfigurationVersion(); // ExtensionEnvironmentConfigurationVersion | The version of the requested environment configuration.
        try {
            ExtensionEnvironmentConfigurationVersion result = apiInstance.updateExtensionEnvironmentConfiguration(extensionName, extensionEnvironmentConfigurationVersion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#updateExtensionEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionEnvironmentConfigurationVersion** | [**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)| The version of the requested environment configuration. | |

### Return type

[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## updateExtensionEnvironmentConfigurationWithHttpInfo

> ApiResponse<ExtensionEnvironmentConfigurationVersion> updateExtensionEnvironmentConfiguration updateExtensionEnvironmentConfigurationWithHttpInfo(extensionName, extensionEnvironmentConfigurationVersion)

Updates the active environment configuration version of the extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        ExtensionEnvironmentConfigurationVersion extensionEnvironmentConfigurationVersion = new ExtensionEnvironmentConfigurationVersion(); // ExtensionEnvironmentConfigurationVersion | The version of the requested environment configuration.
        try {
            ApiResponse<ExtensionEnvironmentConfigurationVersion> response = apiInstance.updateExtensionEnvironmentConfigurationWithHttpInfo(extensionName, extensionEnvironmentConfigurationVersion);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#updateExtensionEnvironmentConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **extensionEnvironmentConfigurationVersion** | [**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)| The version of the requested environment configuration. | |

### Return type

ApiResponse<[**ExtensionEnvironmentConfigurationVersion**](ExtensionEnvironmentConfigurationVersion.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Environment configuration updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## updateMonitoringConfiguration

> MonitoringConfigurationResponse updateMonitoringConfiguration(extensionName, configurationId, monitoringConfigurationUpdateDto)

Updates the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        MonitoringConfigurationUpdateDto monitoringConfigurationUpdateDto = new MonitoringConfigurationUpdateDto(); // MonitoringConfigurationUpdateDto | JSON body of the request, containing monitoring configuration parameters.
        try {
            MonitoringConfigurationResponse result = apiInstance.updateMonitoringConfiguration(extensionName, configurationId, monitoringConfigurationUpdateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#updateMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |
| **monitoringConfigurationUpdateDto** | [**MonitoringConfigurationUpdateDto**](MonitoringConfigurationUpdateDto.md)| JSON body of the request, containing monitoring configuration parameters. | |

### Return type

[**MonitoringConfigurationResponse**](MonitoringConfigurationResponse.md)


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
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## updateMonitoringConfigurationWithHttpInfo

> ApiResponse<MonitoringConfigurationResponse> updateMonitoringConfiguration updateMonitoringConfigurationWithHttpInfo(extensionName, configurationId, monitoringConfigurationUpdateDto)

Updates the specified monitoring configuration

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        String extensionName = "extensionName_example"; // String | The name of the requested extension 2.0.
        String configurationId = "configurationId_example"; // String | The ID of the requested monitoring configuration.
        MonitoringConfigurationUpdateDto monitoringConfigurationUpdateDto = new MonitoringConfigurationUpdateDto(); // MonitoringConfigurationUpdateDto | JSON body of the request, containing monitoring configuration parameters.
        try {
            ApiResponse<MonitoringConfigurationResponse> response = apiInstance.updateMonitoringConfigurationWithHttpInfo(extensionName, configurationId, monitoringConfigurationUpdateDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#updateMonitoringConfiguration");
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
| **extensionName** | **String**| The name of the requested extension 2.0. | |
| **configurationId** | **String**| The ID of the requested monitoring configuration. | |
| **monitoringConfigurationUpdateDto** | [**MonitoringConfigurationUpdateDto**](MonitoringConfigurationUpdateDto.md)| JSON body of the request, containing monitoring configuration parameters. | |

### Return type

ApiResponse<[**MonitoringConfigurationResponse**](MonitoringConfigurationResponse.md)>


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
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## uploadExtension

> ExtensionUploadResponseDto uploadExtension(_file, validateOnly)

Uploads or verifies a new extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        File _file = new File("/path/to/file"); // File | Extension 2.0 zip file to upload.
        Boolean validateOnly = false; // Boolean | Only run validation but do not persist the extension even if validation was successful.
        try {
            ExtensionUploadResponseDto result = apiInstance.uploadExtension(_file, validateOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#uploadExtension");
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
| **_file** | **File**| Extension 2.0 zip file to upload. | |
| **validateOnly** | **Boolean**| Only run validation but do not persist the extension even if validation was successful. | [optional] [default to false] |

### Return type

[**ExtensionUploadResponseDto**](ExtensionUploadResponseDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The extension is valid |  -  |
| **201** | Success. The extension 2.0 has been uploaded. |  -  |
| **400** | Failed. The input file is invalid. |  -  |
| **409** | Upload not possible yet, please try again in a few seconds. |  -  |

## uploadExtensionWithHttpInfo

> ApiResponse<ExtensionUploadResponseDto> uploadExtension uploadExtensionWithHttpInfo(_file, validateOnly)

Uploads or verifies a new extension 2.0

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.Extensions20Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        Extensions20Api apiInstance = new Extensions20Api(defaultClient);
        File _file = new File("/path/to/file"); // File | Extension 2.0 zip file to upload.
        Boolean validateOnly = false; // Boolean | Only run validation but do not persist the extension even if validation was successful.
        try {
            ApiResponse<ExtensionUploadResponseDto> response = apiInstance.uploadExtensionWithHttpInfo(_file, validateOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling Extensions20Api#uploadExtension");
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
| **_file** | **File**| Extension 2.0 zip file to upload. | |
| **validateOnly** | **Boolean**| Only run validation but do not persist the extension even if validation was successful. | [optional] [default to false] |

### Return type

ApiResponse<[**ExtensionUploadResponseDto**](ExtensionUploadResponseDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The extension is valid |  -  |
| **201** | Success. The extension 2.0 has been uploaded. |  -  |
| **400** | Failed. The input file is invalid. |  -  |
| **409** | Upload not possible yet, please try again in a few seconds. |  -  |

