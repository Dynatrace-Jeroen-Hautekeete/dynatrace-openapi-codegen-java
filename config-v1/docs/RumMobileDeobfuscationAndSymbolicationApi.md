# RumMobileDeobfuscationAndSymbolicationApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdate**](RumMobileDeobfuscationAndSymbolicationApi.md#createOrUpdate) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Upload a symbolication file. Either a ProGuard file for Android or a zip file containing all the iOS dSYM files.  |
| [**createOrUpdateWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#createOrUpdateWithHttpInfo) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Upload a symbolication file. Either a ProGuard file for Android or a zip file containing all the iOS dSYM files.  |
| [**createOrUpdatePinning**](RumMobileDeobfuscationAndSymbolicationApi.md#createOrUpdatePinning) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName}/pinning | Pin or unpin all symbolication files of a app version. A pinned file will not be deleted automtically, when running out of space. |
| [**createOrUpdatePinningWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#createOrUpdatePinningWithHttpInfo) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName}/pinning | Pin or unpin all symbolication files of a app version. A pinned file will not be deleted automtically, when running out of space. |
| [**deleteApp**](RumMobileDeobfuscationAndSymbolicationApi.md#deleteApp) | **DELETE** /symfiles/{applicationId} | Deletes all symbolication file belonging to the Dynatrace App specified |
| [**deleteAppWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#deleteAppWithHttpInfo) | **DELETE** /symfiles/{applicationId} | Deletes all symbolication file belonging to the Dynatrace App specified |
| [**deleteSingleFile**](RumMobileDeobfuscationAndSymbolicationApi.md#deleteSingleFile) | **DELETE** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Delete the symbolication file belonging to the given application, os and version |
| [**deleteSingleFileWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#deleteSingleFileWithHttpInfo) | **DELETE** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Delete the symbolication file belonging to the given application, os and version |
| [**getAll**](RumMobileDeobfuscationAndSymbolicationApi.md#getAll) | **GET** /symfiles | Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) from the Symbol File Store. |
| [**getAllWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getAllWithHttpInfo) | **GET** /symfiles | Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) from the Symbol File Store. |
| [**getAllPerApplication**](RumMobileDeobfuscationAndSymbolicationApi.md#getAllPerApplication) | **GET** /symfiles/{applicationId} | Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) for one single mobile application from the Symbol File Store of this tenant. |
| [**getAllPerApplicationWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getAllPerApplicationWithHttpInfo) | **GET** /symfiles/{applicationId} | Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) for one single mobile application from the Symbol File Store of this tenant. |
| [**getDssClientUrl**](RumMobileDeobfuscationAndSymbolicationApi.md#getDssClientUrl) | **GET** /symfiles/dtxdss-download | Gets a download link for the latest version of the DTXDssClient. |
| [**getDssClientUrlWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getDssClientUrlWithHttpInfo) | **GET** /symfiles/dtxdss-download | Gets a download link for the latest version of the DTXDssClient. |
| [**getInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getInfo) | **GET** /symfiles/info | Retrieves information about used/empty diskspace, number of stored files,.... |
| [**getInfoWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getInfoWithHttpInfo) | **GET** /symfiles/info | Retrieves information about used/empty diskspace, number of stored files,.... |
| [**getSingle**](RumMobileDeobfuscationAndSymbolicationApi.md#getSingle) | **GET** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Gets the metadata of the symbolication file belonging to the specified app version. There always can exist only one file per os and version |
| [**getSingleWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getSingleWithHttpInfo) | **GET** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName} | Gets the metadata of the symbolication file belonging to the specified app version. There always can exist only one file per os and version |
| [**getSupportedVersion**](RumMobileDeobfuscationAndSymbolicationApi.md#getSupportedVersion) | **GET** /symfiles/ios/supportedversion | Returns the supported file format version for iOS symbol files. |
| [**getSupportedVersionWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#getSupportedVersionWithHttpInfo) | **GET** /symfiles/ios/supportedversion | Returns the supported file format version for iOS symbol files. |
| [**validatePinning**](RumMobileDeobfuscationAndSymbolicationApi.md#validatePinning) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName}/pinning/validator | Validate updates of existing request attribute for the &#x60;PUT /{applicationId}/{packageName}/{os}/{versionName}/pinning&#x60; request. |
| [**validatePinningWithHttpInfo**](RumMobileDeobfuscationAndSymbolicationApi.md#validatePinningWithHttpInfo) | **PUT** /symfiles/{applicationId}/{packageName}/{os}/{versionCode}/{versionName}/pinning/validator | Validate updates of existing request attribute for the &#x60;PUT /{applicationId}/{packageName}/{os}/{versionName}/pinning&#x60; request. |



## createOrUpdate

> void createOrUpdate(applicationId, packageName, os, versionCode, versionName, body, contentType)

Upload a symbolication file. Either a ProGuard file for Android or a zip file containing all the iOS dSYM files. 

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app this file belongs to
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the uploaded file
        String os = "ANDROID"; // String | The operating system the file belongs to
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        File body = new File("/path/to/file"); // File | The file to be uploaded. A proguard file (*.txt) for Android or the zip file produced by the DTXDssClient provided with the OneAgent for iOS. 
        String contentType = "contentType_example"; // String | 
        try {
            apiInstance.createOrUpdate(applicationId, packageName, os, versionCode, versionName, body, contentType);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#createOrUpdate");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app this file belongs to | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the uploaded file | |
| **os** | **String**| The operating system the file belongs to | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **body** | **File**| The file to be uploaded. A proguard file (*.txt) for Android or the zip file produced by the DTXDssClient provided with the OneAgent for iOS.  | |
| **contentType** | **String**|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/x-compressed, application/x-zip-compressed, application/zip, text/plain
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The file has been uploaded and stored. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **413** | Failed. The symbol file storage quota is exhausted. |  -  |

## createOrUpdateWithHttpInfo

> ApiResponse<Void> createOrUpdate createOrUpdateWithHttpInfo(applicationId, packageName, os, versionCode, versionName, body, contentType)

Upload a symbolication file. Either a ProGuard file for Android or a zip file containing all the iOS dSYM files. 

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app this file belongs to
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the uploaded file
        String os = "ANDROID"; // String | The operating system the file belongs to
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        File body = new File("/path/to/file"); // File | The file to be uploaded. A proguard file (*.txt) for Android or the zip file produced by the DTXDssClient provided with the OneAgent for iOS. 
        String contentType = "contentType_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.createOrUpdateWithHttpInfo(applicationId, packageName, os, versionCode, versionName, body, contentType);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#createOrUpdate");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app this file belongs to | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the uploaded file | |
| **os** | **String**| The operating system the file belongs to | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **body** | **File**| The file to be uploaded. A proguard file (*.txt) for Android or the zip file produced by the DTXDssClient provided with the OneAgent for iOS.  | |
| **contentType** | **String**|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/x-compressed, application/x-zip-compressed, application/zip, text/plain
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The file has been uploaded and stored. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **413** | Failed. The symbol file storage quota is exhausted. |  -  |


## createOrUpdatePinning

> void createOrUpdatePinning(applicationId, packageName, os, versionCode, versionName, symbolFilePinning)

Pin or unpin all symbolication files of a app version. A pinned file will not be deleted automtically, when running out of space.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app which should be (un)pinned
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned
        String os = "ANDROID"; // String | The operating system for which the files will be (un)pinned
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        SymbolFilePinning symbolFilePinning = new SymbolFilePinning(); // SymbolFilePinning | JSON body of the request, containing the pinning status to set.
        try {
            apiInstance.createOrUpdatePinning(applicationId, packageName, os, versionCode, versionName, symbolFilePinning);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#createOrUpdatePinning");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app which should be (un)pinned | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned | |
| **os** | **String**| The operating system for which the files will be (un)pinned | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **symbolFilePinning** | [**SymbolFilePinning**](SymbolFilePinning.md)| JSON body of the request, containing the pinning status to set. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The pinning status of the filed has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdatePinningWithHttpInfo

> ApiResponse<Void> createOrUpdatePinning createOrUpdatePinningWithHttpInfo(applicationId, packageName, os, versionCode, versionName, symbolFilePinning)

Pin or unpin all symbolication files of a app version. A pinned file will not be deleted automtically, when running out of space.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app which should be (un)pinned
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned
        String os = "ANDROID"; // String | The operating system for which the files will be (un)pinned
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        SymbolFilePinning symbolFilePinning = new SymbolFilePinning(); // SymbolFilePinning | JSON body of the request, containing the pinning status to set.
        try {
            ApiResponse<Void> response = apiInstance.createOrUpdatePinningWithHttpInfo(applicationId, packageName, os, versionCode, versionName, symbolFilePinning);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#createOrUpdatePinning");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app which should be (un)pinned | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned | |
| **os** | **String**| The operating system for which the files will be (un)pinned | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **symbolFilePinning** | [**SymbolFilePinning**](SymbolFilePinning.md)| JSON body of the request, containing the pinning status to set. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The pinning status of the filed has been updated. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteApp

> void deleteApp(applicationId)

Deletes all symbolication file belonging to the Dynatrace App specified

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the mobile application the files will be deleted
        try {
            apiInstance.deleteApp(applicationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#deleteApp");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the mobile application the files will be deleted | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. All files belonging to the given Dynatrace mobile application have been deleted successfully. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## deleteAppWithHttpInfo

> ApiResponse<Void> deleteApp deleteAppWithHttpInfo(applicationId)

Deletes all symbolication file belonging to the Dynatrace App specified

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the mobile application the files will be deleted
        try {
            ApiResponse<Void> response = apiInstance.deleteAppWithHttpInfo(applicationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#deleteApp");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the mobile application the files will be deleted | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. All files belonging to the given Dynatrace mobile application have been deleted successfully. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteSingleFile

> void deleteSingleFile(applicationId, packageName, os, versionCode, versionName)

Delete the symbolication file belonging to the given application, os and version

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the mobile application where a file should be deleted
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the file to be deleted
        String os = "ANDROID"; // String | The operating system the file belongs to
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) of the file to be deleted
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) of the file to be deleted
        try {
            apiInstance.deleteSingleFile(applicationId, packageName, os, versionCode, versionName);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#deleteSingleFile");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the mobile application where a file should be deleted | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the file to be deleted | |
| **os** | **String**| The operating system the file belongs to | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) of the file to be deleted | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) of the file to be deleted | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The file has been deleted successfully. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## deleteSingleFileWithHttpInfo

> ApiResponse<Void> deleteSingleFile deleteSingleFileWithHttpInfo(applicationId, packageName, os, versionCode, versionName)

Delete the symbolication file belonging to the given application, os and version

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the mobile application where a file should be deleted
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the file to be deleted
        String os = "ANDROID"; // String | The operating system the file belongs to
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) of the file to be deleted
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) of the file to be deleted
        try {
            ApiResponse<Void> response = apiInstance.deleteSingleFileWithHttpInfo(applicationId, packageName, os, versionCode, versionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#deleteSingleFile");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the mobile application where a file should be deleted | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the file to be deleted | |
| **os** | **String**| The operating system the file belongs to | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) of the file to be deleted | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) of the file to be deleted | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success. The file has been deleted successfully. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getAll

> SymbolFileList getAll()

Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) from the Symbol File Store.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            SymbolFileList result = apiInstance.getAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getAll");
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

[**SymbolFileList**](SymbolFileList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllWithHttpInfo

> ApiResponse<SymbolFileList> getAll getAllWithHttpInfo()

Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) from the Symbol File Store.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            ApiResponse<SymbolFileList> response = apiInstance.getAllWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getAll");
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

ApiResponse<[**SymbolFileList**](SymbolFileList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllPerApplication

> SymbolFileList getAllPerApplication(applicationId)

Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) for one single mobile application from the Symbol File Store of this tenant.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace for the mobile application to be queried
        try {
            SymbolFileList result = apiInstance.getAllPerApplication(applicationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getAllPerApplication");
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
| **applicationId** | **UUID**| The application id used in Dynatrace for the mobile application to be queried | |

### Return type

[**SymbolFileList**](SymbolFileList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAllPerApplicationWithHttpInfo

> ApiResponse<SymbolFileList> getAllPerApplication getAllPerApplicationWithHttpInfo(applicationId)

Lists the metadata of all symbolication files (ProGuard files for Android or dSYM files for iOS Apps) for one single mobile application from the Symbol File Store of this tenant.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace for the mobile application to be queried
        try {
            ApiResponse<SymbolFileList> response = apiInstance.getAllPerApplicationWithHttpInfo(applicationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getAllPerApplication");
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
| **applicationId** | **UUID**| The application id used in Dynatrace for the mobile application to be queried | |

### Return type

ApiResponse<[**SymbolFileList**](SymbolFileList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDssClientUrl

> SymbolFileClientLinkDto getDssClientUrl()

Gets a download link for the latest version of the DTXDssClient.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            SymbolFileClientLinkDto result = apiInstance.getDssClientUrl();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getDssClientUrl");
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

[**SymbolFileClientLinkDto**](SymbolFileClientLinkDto.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDssClientUrlWithHttpInfo

> ApiResponse<SymbolFileClientLinkDto> getDssClientUrl getDssClientUrlWithHttpInfo()

Gets a download link for the latest version of the DTXDssClient.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            ApiResponse<SymbolFileClientLinkDto> response = apiInstance.getDssClientUrlWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getDssClientUrl");
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

ApiResponse<[**SymbolFileClientLinkDto**](SymbolFileClientLinkDto.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getInfo

> SymbolFileStorageInfo getInfo()

Retrieves information about used/empty diskspace, number of stored files,....

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            SymbolFileStorageInfo result = apiInstance.getInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getInfo");
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

[**SymbolFileStorageInfo**](SymbolFileStorageInfo.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getInfoWithHttpInfo

> ApiResponse<SymbolFileStorageInfo> getInfo getInfoWithHttpInfo()

Retrieves information about used/empty diskspace, number of stored files,....

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            ApiResponse<SymbolFileStorageInfo> response = apiInstance.getInfoWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getInfo");
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

ApiResponse<[**SymbolFileStorageInfo**](SymbolFileStorageInfo.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSingle

> SymbolFile getSingle(applicationId, packageName, os, versionCode, versionName)

Gets the metadata of the symbolication file belonging to the specified app version. There always can exist only one file per os and version

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace for the mobile application to be queried
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app to be queried
        String os = "ANDROID"; // String | The operating system for which the file should be displayed.
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) of the file to be retrieved
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) of the file to be retrieved
        try {
            SymbolFile result = apiInstance.getSingle(applicationId, packageName, os, versionCode, versionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getSingle");
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
| **applicationId** | **UUID**| The application id used in Dynatrace for the mobile application to be queried | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app to be queried | |
| **os** | **String**| The operating system for which the file should be displayed. | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) of the file to be retrieved | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) of the file to be retrieved | |

### Return type

[**SymbolFile**](SymbolFile.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSingleWithHttpInfo

> ApiResponse<SymbolFile> getSingle getSingleWithHttpInfo(applicationId, packageName, os, versionCode, versionName)

Gets the metadata of the symbolication file belonging to the specified app version. There always can exist only one file per os and version

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace for the mobile application to be queried
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app to be queried
        String os = "ANDROID"; // String | The operating system for which the file should be displayed.
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) of the file to be retrieved
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) of the file to be retrieved
        try {
            ApiResponse<SymbolFile> response = apiInstance.getSingleWithHttpInfo(applicationId, packageName, os, versionCode, versionName);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getSingle");
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
| **applicationId** | **UUID**| The application id used in Dynatrace for the mobile application to be queried | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app to be queried | |
| **os** | **String**| The operating system for which the file should be displayed. | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) of the file to be retrieved | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) of the file to be retrieved | |

### Return type

ApiResponse<[**SymbolFile**](SymbolFile.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSupportedVersion

> SupportedVersion getSupportedVersion()

Returns the supported file format version for iOS symbol files.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            SupportedVersion result = apiInstance.getSupportedVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getSupportedVersion");
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

[**SupportedVersion**](SupportedVersion.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getSupportedVersionWithHttpInfo

> ApiResponse<SupportedVersion> getSupportedVersion getSupportedVersionWithHttpInfo()

Returns the supported file format version for iOS symbol files.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        try {
            ApiResponse<SupportedVersion> response = apiInstance.getSupportedVersionWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#getSupportedVersion");
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

ApiResponse<[**SupportedVersion**](SupportedVersion.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## validatePinning

> void validatePinning(applicationId, packageName, os, versionCode, versionName, symbolFilePinning)

Validate updates of existing request attribute for the &#x60;PUT /{applicationId}/{packageName}/{os}/{versionName}/pinning&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app which should be (un)pinned
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned
        String os = "ANDROID"; // String | The operating system for which the files will be (un)pinned
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        SymbolFilePinning symbolFilePinning = new SymbolFilePinning(); // SymbolFilePinning | JSON body of the request, containing the pinning status to set.
        try {
            apiInstance.validatePinning(applicationId, packageName, os, versionCode, versionName, symbolFilePinning);
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#validatePinning");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app which should be (un)pinned | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned | |
| **os** | **String**| The operating system for which the files will be (un)pinned | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **symbolFilePinning** | [**SymbolFilePinning**](SymbolFilePinning.md)| JSON body of the request, containing the pinning status to set. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted body is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validatePinningWithHttpInfo

> ApiResponse<Void> validatePinning validatePinningWithHttpInfo(applicationId, packageName, os, versionCode, versionName, symbolFilePinning)

Validate updates of existing request attribute for the &#x60;PUT /{applicationId}/{packageName}/{os}/{versionName}/pinning&#x60; request.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.RumMobileDeobfuscationAndSymbolicationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        RumMobileDeobfuscationAndSymbolicationApi apiInstance = new RumMobileDeobfuscationAndSymbolicationApi(defaultClient);
        UUID applicationId = UUID.randomUUID(); // UUID | The application id used in Dynatrace of the app which should be (un)pinned
        String packageName = "packageName_example"; // String | The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned
        String os = "ANDROID"; // String | The operating system for which the files will be (un)pinned
        String versionCode = "versionCode_example"; // String | The version code (Android) / CFBundleVersion (iOS) the file belongs to
        String versionName = "versionName_example"; // String | The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to
        SymbolFilePinning symbolFilePinning = new SymbolFilePinning(); // SymbolFilePinning | JSON body of the request, containing the pinning status to set.
        try {
            ApiResponse<Void> response = apiInstance.validatePinningWithHttpInfo(applicationId, packageName, os, versionCode, versionName, symbolFilePinning);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RumMobileDeobfuscationAndSymbolicationApi#validatePinning");
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
| **applicationId** | **UUID**| The application id used in Dynatrace of the app which should be (un)pinned | |
| **packageName** | **String**| The CFBundleIdentifier (iOS) or the package name (Android) which identifies the app associated with the files to be (un)pinned | |
| **os** | **String**| The operating system for which the files will be (un)pinned | [enum: ANDROID, IOS, TVOS] |
| **versionCode** | **String**| The version code (Android) / CFBundleVersion (iOS) the file belongs to | |
| **versionName** | **String**| The version name (Android) / CFBundleShortVersionString (iOS) the file belongs to | |
| **symbolFilePinning** | [**SymbolFilePinning**](SymbolFilePinning.md)| JSON body of the request, containing the pinning status to set. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Validated. The submitted body is valid. Response does not have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

