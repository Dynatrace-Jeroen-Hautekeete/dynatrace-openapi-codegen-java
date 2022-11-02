# HubCapabilitiesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateReleaseNotes**](HubCapabilitiesApi.md#updateReleaseNotes) | **PUT** /hub/capabilities/{extensionFQN}/releases/{extensionVersion}/releaseNotes | Sets or updates the release notes of the specified extension release | maturity&#x3D;EARLY_ADOPTER |
| [**updateReleaseNotesWithHttpInfo**](HubCapabilitiesApi.md#updateReleaseNotesWithHttpInfo) | **PUT** /hub/capabilities/{extensionFQN}/releases/{extensionVersion}/releaseNotes | Sets or updates the release notes of the specified extension release | maturity&#x3D;EARLY_ADOPTER |
| [**uploadMetadataForExtension**](HubCapabilitiesApi.md#uploadMetadataForExtension) | **PUT** /hub/capabilities/{extensionFQN}/metadata | Create/Replace metadata for an extension that does not have Dynatrace distributed metadata. | maturity&#x3D;EARLY_ADOPTER |
| [**uploadMetadataForExtensionWithHttpInfo**](HubCapabilitiesApi.md#uploadMetadataForExtensionWithHttpInfo) | **PUT** /hub/capabilities/{extensionFQN}/metadata | Create/Replace metadata for an extension that does not have Dynatrace distributed metadata. | maturity&#x3D;EARLY_ADOPTER |



## updateReleaseNotes

> void updateReleaseNotes(extensionFQN, extensionVersion, extensionReleaseNotesDto)

Sets or updates the release notes of the specified extension release | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.HubCapabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        HubCapabilitiesApi apiInstance = new HubCapabilitiesApi(defaultClient);
        String extensionFQN = "extensionFQN_example"; // String | Fully qualified name of the extension
        String extensionVersion = "extensionVersion_example"; // String | Version of the extension release
        ExtensionReleaseNotesDto extensionReleaseNotesDto = new ExtensionReleaseNotesDto(); // ExtensionReleaseNotesDto | The JSON body of the request. Contains the markdown for release notes
        try {
            apiInstance.updateReleaseNotes(extensionFQN, extensionVersion, extensionReleaseNotesDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling HubCapabilitiesApi#updateReleaseNotes");
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
| **extensionFQN** | **String**| Fully qualified name of the extension | |
| **extensionVersion** | **String**| Version of the extension release | |
| **extensionReleaseNotesDto** | [**ExtensionReleaseNotesDto**](ExtensionReleaseNotesDto.md)| The JSON body of the request. Contains the markdown for release notes | [optional] |

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
| **204** | Extension release notes updated |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |
| **503** | Unavailable |  -  |

## updateReleaseNotesWithHttpInfo

> ApiResponse<Void> updateReleaseNotes updateReleaseNotesWithHttpInfo(extensionFQN, extensionVersion, extensionReleaseNotesDto)

Sets or updates the release notes of the specified extension release | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.HubCapabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        HubCapabilitiesApi apiInstance = new HubCapabilitiesApi(defaultClient);
        String extensionFQN = "extensionFQN_example"; // String | Fully qualified name of the extension
        String extensionVersion = "extensionVersion_example"; // String | Version of the extension release
        ExtensionReleaseNotesDto extensionReleaseNotesDto = new ExtensionReleaseNotesDto(); // ExtensionReleaseNotesDto | The JSON body of the request. Contains the markdown for release notes
        try {
            ApiResponse<Void> response = apiInstance.updateReleaseNotesWithHttpInfo(extensionFQN, extensionVersion, extensionReleaseNotesDto);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling HubCapabilitiesApi#updateReleaseNotes");
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
| **extensionFQN** | **String**| Fully qualified name of the extension | |
| **extensionVersion** | **String**| Version of the extension release | |
| **extensionReleaseNotesDto** | [**ExtensionReleaseNotesDto**](ExtensionReleaseNotesDto.md)| The JSON body of the request. Contains the markdown for release notes | [optional] |

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
| **204** | Extension release notes updated |  -  |
| **404** | Not found |  -  |
| **400** | Bad request |  -  |
| **503** | Unavailable |  -  |


## uploadMetadataForExtension

> void uploadMetadataForExtension(extensionFQN, logo, name, description)

Create/Replace metadata for an extension that does not have Dynatrace distributed metadata. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.HubCapabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        HubCapabilitiesApi apiInstance = new HubCapabilitiesApi(defaultClient);
        String extensionFQN = "extensionFQN_example"; // String | Fully qualified name of the extension
        File logo = new File("/path/to/file"); // File | Logo of the extension
        String name = "name_example"; // String | If left empty or blank the extensionFQN will be used as name
        String description = "description_example"; // String | 
        try {
            apiInstance.uploadMetadataForExtension(extensionFQN, logo, name, description);
        } catch (ApiException e) {
            System.err.println("Exception when calling HubCapabilitiesApi#uploadMetadataForExtension");
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
| **extensionFQN** | **String**| Fully qualified name of the extension | |
| **logo** | **File**| Logo of the extension | [optional] |
| **name** | **String**| If left empty or blank the extensionFQN will be used as name | [optional] |
| **description** | **String**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Extension metadata uploaded |  -  |

## uploadMetadataForExtensionWithHttpInfo

> ApiResponse<Void> uploadMetadataForExtension uploadMetadataForExtensionWithHttpInfo(extensionFQN, logo, name, description)

Create/Replace metadata for an extension that does not have Dynatrace distributed metadata. | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.HubCapabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        HubCapabilitiesApi apiInstance = new HubCapabilitiesApi(defaultClient);
        String extensionFQN = "extensionFQN_example"; // String | Fully qualified name of the extension
        File logo = new File("/path/to/file"); // File | Logo of the extension
        String name = "name_example"; // String | If left empty or blank the extensionFQN will be used as name
        String description = "description_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.uploadMetadataForExtensionWithHttpInfo(extensionFQN, logo, name, description);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling HubCapabilitiesApi#uploadMetadataForExtension");
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
| **extensionFQN** | **String**| Fully qualified name of the extension | |
| **logo** | **File**| Logo of the extension | [optional] |
| **name** | **String**| If left empty or blank the extensionFQN will be used as name | [optional] |
| **description** | **String**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Extension metadata uploaded |  -  |

