# DavisSecurityAdvisorApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdviceForSecurityProblems**](DavisSecurityAdvisorApi.md#getAdviceForSecurityProblems) | **GET** /davis/securityAdvices | Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER |
| [**getAdviceForSecurityProblemsWithHttpInfo**](DavisSecurityAdvisorApi.md#getAdviceForSecurityProblemsWithHttpInfo) | **GET** /davis/securityAdvices | Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER |



## getAdviceForSecurityProblems

> DavisSecurityAdviceList getAdviceForSecurityProblems(managementZoneFilter, nextPageKey, pageSize)

Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER

You can narrow down the output by providing the management zone and pagination. If you specify a management zone, only problems originating from that zone are included to the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.DavisSecurityAdvisorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DavisSecurityAdvisorApi apiInstance = new DavisSecurityAdvisorApi(defaultClient);
        String managementZoneFilter = "managementZoneFilter_example"; // String | To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\"mzId-1\", \"mzId-2\").  * Management zone names: names(\"mz-1\", \"mz-2\").   You can specify several comma-separated criteria (for example, `names(\"myMz\"),ids(\"9130632296508575249\")`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used.
        try {
            DavisSecurityAdviceList result = apiInstance.getAdviceForSecurityProblems(managementZoneFilter, nextPageKey, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DavisSecurityAdvisorApi#getAdviceForSecurityProblems");
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
| **managementZoneFilter** | **String**| To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\&quot;mzId-1\&quot;, \&quot;mzId-2\&quot;).  * Management zone names: names(\&quot;mz-1\&quot;, \&quot;mz-2\&quot;).   You can specify several comma-separated criteria (for example, &#x60;names(\&quot;myMz\&quot;),ids(\&quot;9130632296508575249\&quot;)&#x60;). | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used. | [optional] |

### Return type

[**DavisSecurityAdviceList**](DavisSecurityAdviceList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAdviceForSecurityProblemsWithHttpInfo

> ApiResponse<DavisSecurityAdviceList> getAdviceForSecurityProblems getAdviceForSecurityProblemsWithHttpInfo(managementZoneFilter, nextPageKey, pageSize)

Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER

You can narrow down the output by providing the management zone and pagination. If you specify a management zone, only problems originating from that zone are included to the request.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.DavisSecurityAdvisorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        DavisSecurityAdvisorApi apiInstance = new DavisSecurityAdvisorApi(defaultClient);
        String managementZoneFilter = "managementZoneFilter_example"; // String | To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\"mzId-1\", \"mzId-2\").  * Management zone names: names(\"mz-1\", \"mz-2\").   You can specify several comma-separated criteria (for example, `names(\"myMz\"),ids(\"9130632296508575249\")`).
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used.
        try {
            ApiResponse<DavisSecurityAdviceList> response = apiInstance.getAdviceForSecurityProblemsWithHttpInfo(managementZoneFilter, nextPageKey, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DavisSecurityAdvisorApi#getAdviceForSecurityProblems");
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
| **managementZoneFilter** | **String**| To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\&quot;mzId-1\&quot;, \&quot;mzId-2\&quot;).  * Management zone names: names(\&quot;mz-1\&quot;, \&quot;mz-2\&quot;).   You can specify several comma-separated criteria (for example, &#x60;names(\&quot;myMz\&quot;),ids(\&quot;9130632296508575249\&quot;)&#x60;). | [optional] |
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used. | [optional] |

### Return type

ApiResponse<[**DavisSecurityAdviceList**](DavisSecurityAdviceList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

