# DashboardsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /dashboards | Creates a dashboard |
| [**createDashboardWithHttpInfo**](DashboardsApi.md#createDashboardWithHttpInfo) | **POST** /dashboards | Creates a dashboard |
| [**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /dashboards/{id} | Deletes the specified dashboard |
| [**deleteDashboardWithHttpInfo**](DashboardsApi.md#deleteDashboardWithHttpInfo) | **DELETE** /dashboards/{id} | Deletes the specified dashboard |
| [**getDashboard**](DashboardsApi.md#getDashboard) | **GET** /dashboards/{id} | Gets the properties of the specified dashboard |
| [**getDashboardWithHttpInfo**](DashboardsApi.md#getDashboardWithHttpInfo) | **GET** /dashboards/{id} | Gets the properties of the specified dashboard |
| [**getDashboardSharingSettings**](DashboardsApi.md#getDashboardSharingSettings) | **GET** /dashboards/{id}/shareSettings | Gets the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER |
| [**getDashboardSharingSettingsWithHttpInfo**](DashboardsApi.md#getDashboardSharingSettingsWithHttpInfo) | **GET** /dashboards/{id}/shareSettings | Gets the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER |
| [**getDashboardStubsList**](DashboardsApi.md#getDashboardStubsList) | **GET** /dashboards | Lists all dashboards of the environment |
| [**getDashboardStubsListWithHttpInfo**](DashboardsApi.md#getDashboardStubsListWithHttpInfo) | **GET** /dashboards | Lists all dashboards of the environment |
| [**migrateDashboard**](DashboardsApi.md#migrateDashboard) | **PUT** /dashboards/{dashboardId}/migrate | Migrate all the Custom Charting tiles to DataExplorer ones | maturity&#x3D;EARLY_ADOPTER |
| [**migrateDashboardWithHttpInfo**](DashboardsApi.md#migrateDashboardWithHttpInfo) | **PUT** /dashboards/{dashboardId}/migrate | Migrate all the Custom Charting tiles to DataExplorer ones | maturity&#x3D;EARLY_ADOPTER |
| [**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /dashboards/{id} | Updates the specified dashboard |
| [**updateDashboardWithHttpInfo**](DashboardsApi.md#updateDashboardWithHttpInfo) | **PUT** /dashboards/{id} | Updates the specified dashboard |
| [**updateShareSettings**](DashboardsApi.md#updateShareSettings) | **PUT** /dashboards/{id}/shareSettings | Updates the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER |
| [**updateShareSettingsWithHttpInfo**](DashboardsApi.md#updateShareSettingsWithHttpInfo) | **PUT** /dashboards/{id}/shareSettings | Updates the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER |
| [**validateDashboardCreation**](DashboardsApi.md#validateDashboardCreation) | **POST** /dashboards/validator | Validates the payload for the &#39;POST /dashboards&#39; request |
| [**validateDashboardCreationWithHttpInfo**](DashboardsApi.md#validateDashboardCreationWithHttpInfo) | **POST** /dashboards/validator | Validates the payload for the &#39;POST /dashboards&#39; request |
| [**validateDashboardUpdate**](DashboardsApi.md#validateDashboardUpdate) | **POST** /dashboards/{id}/validator | Validates the payload for the &#39;PUT /dashboards/{id}&#39; request |
| [**validateDashboardUpdateWithHttpInfo**](DashboardsApi.md#validateDashboardUpdateWithHttpInfo) | **POST** /dashboards/{id}/validator | Validates the payload for the &#39;PUT /dashboards/{id}&#39; request |
| [**validateShareSettingsUpdate**](DashboardsApi.md#validateShareSettingsUpdate) | **POST** /dashboards/{id}/shareSettings/validator | Validates the payload for the &#39;PUT /dashboards/{id}/shareSettings&#39; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateShareSettingsUpdateWithHttpInfo**](DashboardsApi.md#validateShareSettingsUpdateWithHttpInfo) | **POST** /dashboards/{id}/shareSettings/validator | Validates the payload for the &#39;PUT /dashboards/{id}/shareSettings&#39; request | maturity&#x3D;EARLY_ADOPTER |



## createDashboard

> EntityShortRepresentation createDashboard(dashboard)

Creates a dashboard

The body must not provide an ID. An ID is assigned automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains parameters of the new dashboard.
        try {
            EntityShortRepresentation result = apiInstance.createDashboard(dashboard);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains parameters of the new dashboard. | [optional] |

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
| **201** | Success. The new dashboard has been created. The response body contains the generated ID. |  -  |
| **400** | Failed. The input is invalid |  -  |

## createDashboardWithHttpInfo

> ApiResponse<EntityShortRepresentation> createDashboard createDashboardWithHttpInfo(dashboard)

Creates a dashboard

The body must not provide an ID. An ID is assigned automatically by Dynatrace.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains parameters of the new dashboard.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createDashboardWithHttpInfo(dashboard);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains parameters of the new dashboard. | [optional] |

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
| **201** | Success. The new dashboard has been created. The response body contains the generated ID. |  -  |
| **400** | Failed. The input is invalid |  -  |


## deleteDashboard

> void deleteDashboard(id)

Deletes the specified dashboard

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be deleted.
        try {
            apiInstance.deleteDashboard(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
| **id** | **String**| The ID of the dashboard to be deleted. | |

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
| **204** | Success. The dashboard has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteDashboardWithHttpInfo

> ApiResponse<Void> deleteDashboard deleteDashboardWithHttpInfo(id)

Deletes the specified dashboard

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteDashboardWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
| **id** | **String**| The ID of the dashboard to be deleted. | |

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
| **204** | Success. The dashboard has been deleted. Response doesn&#39;t have a body. |  -  |


## getDashboard

> Dashboard getDashboard(id)

Gets the properties of the specified dashboard

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        try {
            Dashboard result = apiInstance.getDashboard(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboard");
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
| **id** | **String**| The ID of the required dashboard. | |

### Return type

[**Dashboard**](Dashboard.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains parameters of the dashboard. |  -  |

## getDashboardWithHttpInfo

> ApiResponse<Dashboard> getDashboard getDashboardWithHttpInfo(id)

Gets the properties of the specified dashboard

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        try {
            ApiResponse<Dashboard> response = apiInstance.getDashboardWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboard");
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
| **id** | **String**| The ID of the required dashboard. | |

### Return type

ApiResponse<[**Dashboard**](Dashboard.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains parameters of the dashboard. |  -  |


## getDashboardSharingSettings

> DashboardSharing getDashboardSharingSettings(id)

Gets the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        try {
            DashboardSharing result = apiInstance.getDashboardSharingSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardSharingSettings");
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
| **id** | **String**| The ID of the required dashboard. | |

### Return type

[**DashboardSharing**](DashboardSharing.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDashboardSharingSettingsWithHttpInfo

> ApiResponse<DashboardSharing> getDashboardSharingSettings getDashboardSharingSettingsWithHttpInfo(id)

Gets the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        try {
            ApiResponse<DashboardSharing> response = apiInstance.getDashboardSharingSettingsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardSharingSettings");
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
| **id** | **String**| The ID of the required dashboard. | |

### Return type

ApiResponse<[**DashboardSharing**](DashboardSharing.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getDashboardStubsList

> DashboardList getDashboardStubsList(owner, tags)

Lists all dashboards of the environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String owner = "owner_example"; // String | The owner of the dashboard.
        List<String> tags = Arrays.asList(); // List<String> | A list of tags applied to the dashboard.    The dashboard must match **all** the specified tags.
        try {
            DashboardList result = apiInstance.getDashboardStubsList(owner, tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardStubsList");
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
| **owner** | **String**| The owner of the dashboard. | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| A list of tags applied to the dashboard.    The dashboard must match **all** the specified tags. | [optional] |

### Return type

[**DashboardList**](DashboardList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getDashboardStubsListWithHttpInfo

> ApiResponse<DashboardList> getDashboardStubsList getDashboardStubsListWithHttpInfo(owner, tags)

Lists all dashboards of the environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String owner = "owner_example"; // String | The owner of the dashboard.
        List<String> tags = Arrays.asList(); // List<String> | A list of tags applied to the dashboard.    The dashboard must match **all** the specified tags.
        try {
            ApiResponse<DashboardList> response = apiInstance.getDashboardStubsListWithHttpInfo(owner, tags);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#getDashboardStubsList");
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
| **owner** | **String**| The owner of the dashboard. | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| A list of tags applied to the dashboard.    The dashboard must match **all** the specified tags. | [optional] |

### Return type

ApiResponse<[**DashboardList**](DashboardList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## migrateDashboard

> void migrateDashboard(dashboardId)

Migrate all the Custom Charting tiles to DataExplorer ones | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "dashboardId_example"; // String | The ID of the dashboard to be migrated.
        try {
            apiInstance.migrateDashboard(dashboardId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#migrateDashboard");
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
| **dashboardId** | **String**| The ID of the dashboard to be migrated. | |

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
| **200** | Success. The tiles were migrated |  -  |
| **404** | Dashboard not found |  -  |

## migrateDashboardWithHttpInfo

> ApiResponse<Void> migrateDashboard migrateDashboardWithHttpInfo(dashboardId)

Migrate all the Custom Charting tiles to DataExplorer ones | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String dashboardId = "dashboardId_example"; // String | The ID of the dashboard to be migrated.
        try {
            ApiResponse<Void> response = apiInstance.migrateDashboardWithHttpInfo(dashboardId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#migrateDashboard");
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
| **dashboardId** | **String**| The ID of the dashboard to be migrated. | |

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
| **200** | Success. The tiles were migrated |  -  |
| **404** | Dashboard not found |  -  |


## updateDashboard

> EntityShortRepresentation updateDashboard(id, dashboard)

Updates the specified dashboard

If the dashboard with the specified ID doesn&#39;t exist, a new dashboard is created

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be updated.    The ID in the request body must match this ID.
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains updated parameters of the dashboard.
        try {
            EntityShortRepresentation result = apiInstance.updateDashboard(id, dashboard);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateDashboard");
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
| **id** | **String**| The ID of the dashboard to be updated.    The ID in the request body must match this ID. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains updated parameters of the dashboard. | [optional] |

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
| **201** | Success. The new dashboard has been created. Response doesn&#39;t have a body. |  -  |
| **204** | Success. The dashboard has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

## updateDashboardWithHttpInfo

> ApiResponse<EntityShortRepresentation> updateDashboard updateDashboardWithHttpInfo(id, dashboard)

Updates the specified dashboard

If the dashboard with the specified ID doesn&#39;t exist, a new dashboard is created

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be updated.    The ID in the request body must match this ID.
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains updated parameters of the dashboard.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.updateDashboardWithHttpInfo(id, dashboard);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateDashboard");
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
| **id** | **String**| The ID of the dashboard to be updated.    The ID in the request body must match this ID. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains updated parameters of the dashboard. | [optional] |

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
| **201** | Success. The new dashboard has been created. Response doesn&#39;t have a body. |  -  |
| **204** | Success. The dashboard has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |


## updateShareSettings

> void updateShareSettings(id, dashboardSharing)

Updates the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        DashboardSharing dashboardSharing = new DashboardSharing(); // DashboardSharing | The JSON body of the request. Contains updated parameters of the dashboard sharing.
        try {
            apiInstance.updateShareSettings(id, dashboardSharing);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateShareSettings");
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
| **id** | **String**| The ID of the required dashboard. | |
| **dashboardSharing** | [**DashboardSharing**](DashboardSharing.md)| The JSON body of the request. Contains updated parameters of the dashboard sharing. | [optional] |

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

## updateShareSettingsWithHttpInfo

> ApiResponse<Void> updateShareSettings updateShareSettingsWithHttpInfo(id, dashboardSharing)

Updates the sharing configuration of the specified dashboard | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required dashboard.
        DashboardSharing dashboardSharing = new DashboardSharing(); // DashboardSharing | The JSON body of the request. Contains updated parameters of the dashboard sharing.
        try {
            ApiResponse<Void> response = apiInstance.updateShareSettingsWithHttpInfo(id, dashboardSharing);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#updateShareSettings");
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
| **id** | **String**| The ID of the required dashboard. | |
| **dashboardSharing** | [**DashboardSharing**](DashboardSharing.md)| The JSON body of the request. Contains updated parameters of the dashboard sharing. | [optional] |

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


## validateDashboardCreation

> void validateDashboardCreation(dashboard)

Validates the payload for the &#39;POST /dashboards&#39; request

The body must not provide an ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Containing the dashboard to be validated.
        try {
            apiInstance.validateDashboardCreation(dashboard);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateDashboardCreation");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Containing the dashboard to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateDashboardCreationWithHttpInfo

> ApiResponse<Void> validateDashboardCreation validateDashboardCreationWithHttpInfo(dashboard)

Validates the payload for the &#39;POST /dashboards&#39; request

The body must not provide an ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Containing the dashboard to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateDashboardCreationWithHttpInfo(dashboard);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateDashboardCreation");
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
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Containing the dashboard to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateDashboardUpdate

> void validateDashboardUpdate(id, dashboard)

Validates the payload for the &#39;PUT /dashboards/{id}&#39; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be validated.    The ID in the request body must match this ID.
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains the dashboard to be validated.
        try {
            apiInstance.validateDashboardUpdate(id, dashboard);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateDashboardUpdate");
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
| **id** | **String**| The ID of the dashboard to be validated.    The ID in the request body must match this ID. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains the dashboard to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateDashboardUpdateWithHttpInfo

> ApiResponse<Void> validateDashboardUpdate validateDashboardUpdateWithHttpInfo(id, dashboard)

Validates the payload for the &#39;PUT /dashboards/{id}&#39; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be validated.    The ID in the request body must match this ID.
        Dashboard dashboard = new Dashboard(); // Dashboard | The JSON body of the request. Contains the dashboard to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateDashboardUpdateWithHttpInfo(id, dashboard);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateDashboardUpdate");
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
| **id** | **String**| The ID of the dashboard to be validated.    The ID in the request body must match this ID. | |
| **dashboard** | [**Dashboard**](Dashboard.md)| The JSON body of the request. Contains the dashboard to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |


## validateShareSettingsUpdate

> void validateShareSettingsUpdate(id, dashboardSharing)

Validates the payload for the &#39;PUT /dashboards/{id}/shareSettings&#39; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be validated.    The ID in the request body must match this ID.
        DashboardSharing dashboardSharing = new DashboardSharing(); // DashboardSharing | The JSON body of the request. Contains parameters of the dashboard sharing to be validated.
        try {
            apiInstance.validateShareSettingsUpdate(id, dashboardSharing);
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateShareSettingsUpdate");
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
| **id** | **String**| The ID of the dashboard to be validated.    The ID in the request body must match this ID. | |
| **dashboardSharing** | [**DashboardSharing**](DashboardSharing.md)| The JSON body of the request. Contains parameters of the dashboard sharing to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard share setting is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

## validateShareSettingsUpdateWithHttpInfo

> ApiResponse<Void> validateShareSettingsUpdate validateShareSettingsUpdateWithHttpInfo(id, dashboardSharing)

Validates the payload for the &#39;PUT /dashboards/{id}/shareSettings&#39; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        String id = "id_example"; // String | The ID of the dashboard to be validated.    The ID in the request body must match this ID.
        DashboardSharing dashboardSharing = new DashboardSharing(); // DashboardSharing | The JSON body of the request. Contains parameters of the dashboard sharing to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateShareSettingsUpdateWithHttpInfo(id, dashboardSharing);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling DashboardsApi#validateShareSettingsUpdate");
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
| **id** | **String**| The ID of the dashboard to be validated.    The ID in the request body must match this ID. | |
| **dashboardSharing** | [**DashboardSharing**](DashboardSharing.md)| The JSON body of the request. Contains parameters of the dashboard sharing to be validated. | [optional] |

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
| **204** | Validated. The submitted dashboard share setting is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid |  -  |

