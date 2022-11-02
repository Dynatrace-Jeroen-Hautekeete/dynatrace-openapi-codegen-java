# ClusterTimeApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentClusterTime**](ClusterTimeApi.md#getCurrentClusterTime) | **GET** /time | Gets the current time of the Dynatrace server in UTC milliseconds |
| [**getCurrentClusterTimeWithHttpInfo**](ClusterTimeApi.md#getCurrentClusterTimeWithHttpInfo) | **GET** /time | Gets the current time of the Dynatrace server in UTC milliseconds |



## getCurrentClusterTime

> Long getCurrentClusterTime()

Gets the current time of the Dynatrace server in UTC milliseconds

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ClusterTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");

        ClusterTimeApi apiInstance = new ClusterTimeApi(defaultClient);
        try {
            Long result = apiInstance.getCurrentClusterTime();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterTimeApi#getCurrentClusterTime");
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

**Long**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getCurrentClusterTimeWithHttpInfo

> ApiResponse<Long> getCurrentClusterTime getCurrentClusterTimeWithHttpInfo()

Gets the current time of the Dynatrace server in UTC milliseconds

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.ClusterTimeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");

        ClusterTimeApi apiInstance = new ClusterTimeApi(defaultClient);
        try {
            ApiResponse<Long> response = apiInstance.getCurrentClusterTimeWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ClusterTimeApi#getCurrentClusterTime");
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

ApiResponse<**Long**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

