# TopologySmartscapeCustomDeviceApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomDataPoints**](TopologySmartscapeCustomDeviceApi.md#createCustomDataPoints) | **POST** /entity/infrastructure/custom/{customDeviceId} | Creates or updates a custom device, or reports metric data points to the custom device. |
| [**createCustomDataPointsWithHttpInfo**](TopologySmartscapeCustomDeviceApi.md#createCustomDataPointsWithHttpInfo) | **POST** /entity/infrastructure/custom/{customDeviceId} | Creates or updates a custom device, or reports metric data points to the custom device. |



## createCustomDataPoints

> CustomDevicePushResult createCustomDataPoints(customDeviceId, customDevicePushMessage)

Creates or updates a custom device, or reports metric data points to the custom device.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeCustomDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeCustomDeviceApi apiInstance = new TopologySmartscapeCustomDeviceApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don't use Dynatrace entity ID here.
        CustomDevicePushMessage customDevicePushMessage = new CustomDevicePushMessage(); // CustomDevicePushMessage | The JSON body of the request. Contains parameters of a custom device.
        try {
            CustomDevicePushResult result = apiInstance.createCustomDataPoints(customDeviceId, customDevicePushMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeCustomDeviceApi#createCustomDataPoints");
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
| **customDeviceId** | **String**| The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don&#39;t use Dynatrace entity ID here. | |
| **customDevicePushMessage** | [**CustomDevicePushMessage**](CustomDevicePushMessage.md)| The JSON body of the request. Contains parameters of a custom device. | [optional] |

### Return type

[**CustomDevicePushResult**](CustomDevicePushResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The custom device has been created or updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createCustomDataPointsWithHttpInfo

> ApiResponse<CustomDevicePushResult> createCustomDataPoints createCustomDataPointsWithHttpInfo(customDeviceId, customDevicePushMessage)

Creates or updates a custom device, or reports metric data points to the custom device.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TopologySmartscapeCustomDeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TopologySmartscapeCustomDeviceApi apiInstance = new TopologySmartscapeCustomDeviceApi(defaultClient);
        String customDeviceId = "customDeviceId_example"; // String | The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don't use Dynatrace entity ID here.
        CustomDevicePushMessage customDevicePushMessage = new CustomDevicePushMessage(); // CustomDevicePushMessage | The JSON body of the request. Contains parameters of a custom device.
        try {
            ApiResponse<CustomDevicePushResult> response = apiInstance.createCustomDataPointsWithHttpInfo(customDeviceId, customDevicePushMessage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologySmartscapeCustomDeviceApi#createCustomDataPoints");
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
| **customDeviceId** | **String**| The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don&#39;t use Dynatrace entity ID here. | |
| **customDevicePushMessage** | [**CustomDevicePushMessage**](CustomDevicePushMessage.md)| The JSON body of the request. Contains parameters of a custom device. | [optional] |

### Return type

ApiResponse<[**CustomDevicePushResult**](CustomDevicePushResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The custom device has been created or updated. |  -  |
| **400** | Failed. The input is invalid. |  -  |

