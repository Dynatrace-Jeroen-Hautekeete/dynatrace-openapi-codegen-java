# ReportsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdateReport**](ReportsApi.md#createOrUpdateReport) | **PUT** /reports/{id} | Updates an existing report | maturity&#x3D;EARLY_ADOPTER |
| [**createOrUpdateReportWithHttpInfo**](ReportsApi.md#createOrUpdateReportWithHttpInfo) | **PUT** /reports/{id} | Updates an existing report | maturity&#x3D;EARLY_ADOPTER |
| [**createReport**](ReportsApi.md#createReport) | **POST** /reports | Creates a report | maturity&#x3D;EARLY_ADOPTER |
| [**createReportWithHttpInfo**](ReportsApi.md#createReportWithHttpInfo) | **POST** /reports | Creates a report | maturity&#x3D;EARLY_ADOPTER |
| [**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** /reports/{id} | Deletes the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**deleteReportWithHttpInfo**](ReportsApi.md#deleteReportWithHttpInfo) | **DELETE** /reports/{id} | Deletes the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**getReport**](ReportsApi.md#getReport) | **GET** /reports/{id} | Gets the properties of the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**getReportWithHttpInfo**](ReportsApi.md#getReportWithHttpInfo) | **GET** /reports/{id} | Gets the properties of the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**listReports**](ReportsApi.md#listReports) | **GET** /reports | Lists all reports available in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**listReportsWithHttpInfo**](ReportsApi.md#listReportsWithHttpInfo) | **GET** /reports | Lists all reports available in your environment | maturity&#x3D;EARLY_ADOPTER |
| [**subscribeReport**](ReportsApi.md#subscribeReport) | **POST** /reports/{id}/subscribe | Subscribes to the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**subscribeReportWithHttpInfo**](ReportsApi.md#subscribeReportWithHttpInfo) | **POST** /reports/{id}/subscribe | Subscribes to the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**unsubscribeReport**](ReportsApi.md#unsubscribeReport) | **POST** /reports/{id}/unsubscribe | Unsubscribes from the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**unsubscribeReportWithHttpInfo**](ReportsApi.md#unsubscribeReportWithHttpInfo) | **POST** /reports/{id}/unsubscribe | Unsubscribes from the specified report | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateOrUpdateReport**](ReportsApi.md#validateCreateOrUpdateReport) | **POST** /reports/{id}/validator | Validates the payload for the &#x60;PUT /reports/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateOrUpdateReportWithHttpInfo**](ReportsApi.md#validateCreateOrUpdateReportWithHttpInfo) | **POST** /reports/{id}/validator | Validates the payload for the &#x60;PUT /reports/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateReport**](ReportsApi.md#validateCreateReport) | **POST** /reports/validator | Validates the payload for the &#x60;POST /reports&#x60; request | maturity&#x3D;EARLY_ADOPTER |
| [**validateCreateReportWithHttpInfo**](ReportsApi.md#validateCreateReportWithHttpInfo) | **POST** /reports/validator | Validates the payload for the &#x60;POST /reports&#x60; request | maturity&#x3D;EARLY_ADOPTER |



## createOrUpdateReport

> EntityShortRepresentation createOrUpdateReport(id, dashboardReport)

Updates an existing report | maturity&#x3D;EARLY_ADOPTER

If a report with the specified ID doesn&#39;t exist, a new report is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be updated.    The ID in the request body must match this ID.
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains updated parameters of the report.
        try {
            EntityShortRepresentation result = apiInstance.createOrUpdateReport(id, dashboardReport);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createOrUpdateReport");
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
| **id** | **String**| The ID of the report to be updated.    The ID in the request body must match this ID. | |
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains updated parameters of the report. | [optional] |

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
| **201** | Success. The new report has been created. The response contains the ID of the new report. |  -  |
| **204** | Success. The report has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateReportWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOrUpdateReport createOrUpdateReportWithHttpInfo(id, dashboardReport)

Updates an existing report | maturity&#x3D;EARLY_ADOPTER

If a report with the specified ID doesn&#39;t exist, a new report is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be updated.    The ID in the request body must match this ID.
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains updated parameters of the report.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOrUpdateReportWithHttpInfo(id, dashboardReport);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createOrUpdateReport");
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
| **id** | **String**| The ID of the report to be updated.    The ID in the request body must match this ID. | |
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains updated parameters of the report. | [optional] |

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
| **201** | Success. The new report has been created. The response contains the ID of the new report. |  -  |
| **204** | Success. The report has been updated. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createReport

> EntityShortRepresentation createReport(dashboardReport)

Creates a report | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains parameters of the new report.
        try {
            EntityShortRepresentation result = apiInstance.createReport(dashboardReport);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createReport");
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
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains parameters of the new report. | [optional] |

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
| **201** | Success. The new report has been created. The response contains the ID of the new report. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createReportWithHttpInfo

> ApiResponse<EntityShortRepresentation> createReport createReportWithHttpInfo(dashboardReport)

Creates a report | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains parameters of the new report.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createReportWithHttpInfo(dashboardReport);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#createReport");
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
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains parameters of the new report. | [optional] |

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
| **201** | Success. The new report has been created. The response contains the ID of the new report. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteReport

> void deleteReport(id)

Deletes the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be deleted.
        try {
            apiInstance.deleteReport(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#deleteReport");
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
| **id** | **String**| The ID of the report to be deleted. | |

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
| **204** | Success. The report has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteReportWithHttpInfo

> ApiResponse<Void> deleteReport deleteReportWithHttpInfo(id)

Deletes the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteReportWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#deleteReport");
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
| **id** | **String**| The ID of the report to be deleted. | |

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
| **204** | Success. The report has been deleted. Response doesn&#39;t have a body. |  -  |


## getReport

> DashboardReport getReport(id)

Gets the properties of the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required report.
        try {
            DashboardReport result = apiInstance.getReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#getReport");
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
| **id** | **String**| The ID of the required report. | |

### Return type

[**DashboardReport**](DashboardReport.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains parameters of the report. |  -  |

## getReportWithHttpInfo

> ApiResponse<DashboardReport> getReport getReportWithHttpInfo(id)

Gets the properties of the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required report.
        try {
            ApiResponse<DashboardReport> response = apiInstance.getReportWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#getReport");
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
| **id** | **String**| The ID of the required report. | |

### Return type

ApiResponse<[**DashboardReport**](DashboardReport.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response body contains parameters of the report. |  -  |


## listReports

> ReportStubList listReports(type, sourceId)

Lists all reports available in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String type = "DASHBOARD"; // String | Type of a report.
        String sourceId = "sourceId_example"; // String | Referencing source entity of a report (e.g. dashboard).
        try {
            ReportStubList result = apiInstance.listReports(type, sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#listReports");
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
| **type** | **String**| Type of a report. | [optional] [enum: DASHBOARD] |
| **sourceId** | **String**| Referencing source entity of a report (e.g. dashboard). | [optional] |

### Return type

[**ReportStubList**](ReportStubList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## listReportsWithHttpInfo

> ApiResponse<ReportStubList> listReports listReportsWithHttpInfo(type, sourceId)

Lists all reports available in your environment | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String type = "DASHBOARD"; // String | Type of a report.
        String sourceId = "sourceId_example"; // String | Referencing source entity of a report (e.g. dashboard).
        try {
            ApiResponse<ReportStubList> response = apiInstance.listReportsWithHttpInfo(type, sourceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#listReports");
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
| **type** | **String**| Type of a report. | [optional] [enum: DASHBOARD] |
| **sourceId** | **String**| Referencing source entity of a report (e.g. dashboard). | [optional] |

### Return type

ApiResponse<[**ReportStubList**](ReportStubList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## subscribeReport

> EntityShortRepresentation subscribeReport(id, reportSubscriptions)

Subscribes to the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to subscribe to.
        ReportSubscriptions reportSubscriptions = new ReportSubscriptions(); // ReportSubscriptions | The JSON body of the request. Contains a list of new subscribers.
        try {
            EntityShortRepresentation result = apiInstance.subscribeReport(id, reportSubscriptions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#subscribeReport");
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
| **id** | **String**| The ID of the report to subscribe to. | |
| **reportSubscriptions** | [**ReportSubscriptions**](ReportSubscriptions.md)| The JSON body of the request. Contains a list of new subscribers. | [optional] |

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
| **201** | Success. The new subscriptions have been created. The response body contains the report ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## subscribeReportWithHttpInfo

> ApiResponse<EntityShortRepresentation> subscribeReport subscribeReportWithHttpInfo(id, reportSubscriptions)

Subscribes to the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to subscribe to.
        ReportSubscriptions reportSubscriptions = new ReportSubscriptions(); // ReportSubscriptions | The JSON body of the request. Contains a list of new subscribers.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.subscribeReportWithHttpInfo(id, reportSubscriptions);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#subscribeReport");
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
| **id** | **String**| The ID of the report to subscribe to. | |
| **reportSubscriptions** | [**ReportSubscriptions**](ReportSubscriptions.md)| The JSON body of the request. Contains a list of new subscribers. | [optional] |

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
| **201** | Success. The new subscriptions have been created. The response body contains the report ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## unsubscribeReport

> EntityShortRepresentation unsubscribeReport(id, reportSubscriptions)

Unsubscribes from the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to unsubscribe from.
        ReportSubscriptions reportSubscriptions = new ReportSubscriptions(); // ReportSubscriptions | The JSON body of the request. Contains a list of recipients to be unsubscribed.
        try {
            EntityShortRepresentation result = apiInstance.unsubscribeReport(id, reportSubscriptions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#unsubscribeReport");
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
| **id** | **String**| The ID of the report to unsubscribe from. | |
| **reportSubscriptions** | [**ReportSubscriptions**](ReportSubscriptions.md)| The JSON body of the request. Contains a list of recipients to be unsubscribed. | [optional] |

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
| **201** | Success. The subscriptions have been revoked. The response body contains the report ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## unsubscribeReportWithHttpInfo

> ApiResponse<EntityShortRepresentation> unsubscribeReport unsubscribeReportWithHttpInfo(id, reportSubscriptions)

Unsubscribes from the specified report | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to unsubscribe from.
        ReportSubscriptions reportSubscriptions = new ReportSubscriptions(); // ReportSubscriptions | The JSON body of the request. Contains a list of recipients to be unsubscribed.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.unsubscribeReportWithHttpInfo(id, reportSubscriptions);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#unsubscribeReport");
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
| **id** | **String**| The ID of the report to unsubscribe from. | |
| **reportSubscriptions** | [**ReportSubscriptions**](ReportSubscriptions.md)| The JSON body of the request. Contains a list of recipients to be unsubscribed. | [optional] |

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
| **201** | Success. The subscriptions have been revoked. The response body contains the report ID. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateOrUpdateReport

> void validateCreateOrUpdateReport(id, dashboardReport)

Validates the payload for the &#x60;PUT /reports/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be validated.    The ID in the request body must match this ID.
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains the report to be validated.
        try {
            apiInstance.validateCreateOrUpdateReport(id, dashboardReport);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#validateCreateOrUpdateReport");
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
| **id** | **String**| The ID of the report to be validated.    The ID in the request body must match this ID. | |
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains the report to be validated. | [optional] |

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
| **204** | Validated. The submitted report is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateOrUpdateReportWithHttpInfo

> ApiResponse<Void> validateCreateOrUpdateReport validateCreateOrUpdateReportWithHttpInfo(id, dashboardReport)

Validates the payload for the &#x60;PUT /reports/{id}&#x60; request | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        String id = "id_example"; // String | The ID of the report to be validated.    The ID in the request body must match this ID.
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains the report to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateOrUpdateReportWithHttpInfo(id, dashboardReport);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#validateCreateOrUpdateReport");
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
| **id** | **String**| The ID of the report to be validated.    The ID in the request body must match this ID. | |
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains the report to be validated. | [optional] |

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
| **204** | Validated. The submitted report is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateReport

> void validateCreateReport(dashboardReport)

Validates the payload for the &#x60;POST /reports&#x60; request | maturity&#x3D;EARLY_ADOPTER

The body must not provide an ID.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains the report to be validated.
        try {
            apiInstance.validateCreateReport(dashboardReport);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#validateCreateReport");
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
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains the report to be validated. | [optional] |

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
| **204** | Validated. The submitted report is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateReportWithHttpInfo

> ApiResponse<Void> validateCreateReport validateCreateReportWithHttpInfo(dashboardReport)

Validates the payload for the &#x60;POST /reports&#x60; request | maturity&#x3D;EARLY_ADOPTER

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
import com.dynatrace.apis.configv1.api.ReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ReportsApi apiInstance = new ReportsApi(defaultClient);
        DashboardReport dashboardReport = new DashboardReport(); // DashboardReport | The JSON body of the request. Contains the report to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateReportWithHttpInfo(dashboardReport);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#validateCreateReport");
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
| **dashboardReport** | [**DashboardReport**](DashboardReport.md)| The JSON body of the request. Contains the report to be validated. | [optional] |

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
| **204** | Validated. The submitted report is valid. The response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

