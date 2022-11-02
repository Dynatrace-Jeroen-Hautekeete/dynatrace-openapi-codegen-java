# ServiceLevelObjectivesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlert**](ServiceLevelObjectivesApi.md#createAlert) | **POST** /slo/{id}/alert | Creates an alert of the provided alert type for an SLO |
| [**createAlertWithHttpInfo**](ServiceLevelObjectivesApi.md#createAlertWithHttpInfo) | **POST** /slo/{id}/alert | Creates an alert of the provided alert type for an SLO |
| [**createSlo**](ServiceLevelObjectivesApi.md#createSlo) | **POST** /slo | Creates a new SLO |
| [**createSloWithHttpInfo**](ServiceLevelObjectivesApi.md#createSloWithHttpInfo) | **POST** /slo | Creates a new SLO |
| [**deleteSlo**](ServiceLevelObjectivesApi.md#deleteSlo) | **DELETE** /slo/{id} | Deletes an SLO |
| [**deleteSloWithHttpInfo**](ServiceLevelObjectivesApi.md#deleteSloWithHttpInfo) | **DELETE** /slo/{id} | Deletes an SLO |
| [**getSlo**](ServiceLevelObjectivesApi.md#getSlo) | **GET** /slo | Lists all available SLOs along with calculated values |
| [**getSloWithHttpInfo**](ServiceLevelObjectivesApi.md#getSloWithHttpInfo) | **GET** /slo | Lists all available SLOs along with calculated values |
| [**getSloById**](ServiceLevelObjectivesApi.md#getSloById) | **GET** /slo/{id} | Gets parameters and calculated values of a specific SLO |
| [**getSloByIdWithHttpInfo**](ServiceLevelObjectivesApi.md#getSloByIdWithHttpInfo) | **GET** /slo/{id} | Gets parameters and calculated values of a specific SLO |
| [**updateSloById**](ServiceLevelObjectivesApi.md#updateSloById) | **PUT** /slo/{id} | Updates an existing SLO |
| [**updateSloByIdWithHttpInfo**](ServiceLevelObjectivesApi.md#updateSloByIdWithHttpInfo) | **PUT** /slo/{id} | Updates an existing SLO |



## createAlert

> void createAlert(id, abstractSloAlertDto, from, to, timeFrame)

Creates an alert of the provided alert type for an SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        AbstractSloAlertDto abstractSloAlertDto = new AbstractSloAlertDto(); // AbstractSloAlertDto | The JSON body of the request. Contains the parameters of the new SLO alert.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        try {
            apiInstance.createAlert(id, abstractSloAlertDto, from, to, timeFrame);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#createAlert");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **abstractSloAlertDto** | [**AbstractSloAlertDto**](AbstractSloAlertDto.md)| The JSON body of the request. Contains the parameters of the new SLO alert. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |

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
| **201** | Success. The new alert has been created. Response doesn&#39;t have a body. The **location** response header contains the ID of the new alert. |  * location - The location of the new resource created by this request. <br>  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **412** | Precondition for creating an SLO alert not fulfilled. The SLO func metric cannot be created or is not created by the SLO. |  -  |
| **500** | Internal server error. |  -  |

## createAlertWithHttpInfo

> ApiResponse<Void> createAlert createAlertWithHttpInfo(id, abstractSloAlertDto, from, to, timeFrame)

Creates an alert of the provided alert type for an SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        AbstractSloAlertDto abstractSloAlertDto = new AbstractSloAlertDto(); // AbstractSloAlertDto | The JSON body of the request. Contains the parameters of the new SLO alert.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        try {
            ApiResponse<Void> response = apiInstance.createAlertWithHttpInfo(id, abstractSloAlertDto, from, to, timeFrame);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#createAlert");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **abstractSloAlertDto** | [**AbstractSloAlertDto**](AbstractSloAlertDto.md)| The JSON body of the request. Contains the parameters of the new SLO alert. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |

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
| **201** | Success. The new alert has been created. Response doesn&#39;t have a body. The **location** response header contains the ID of the new alert. |  * location - The location of the new resource created by this request. <br>  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **412** | Precondition for creating an SLO alert not fulfilled. The SLO func metric cannot be created or is not created by the SLO. |  -  |
| **500** | Internal server error. |  -  |


## createSlo

> void createSlo(sloConfigItemDtoImpl)

Creates a new SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        SloConfigItemDtoImpl sloConfigItemDtoImpl = new SloConfigItemDtoImpl(); // SloConfigItemDtoImpl | The JSON body of the request. Contains the parameters of the new SLO.
        try {
            apiInstance.createSlo(sloConfigItemDtoImpl);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#createSlo");
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
| **sloConfigItemDtoImpl** | [**SloConfigItemDtoImpl**](SloConfigItemDtoImpl.md)| The JSON body of the request. Contains the parameters of the new SLO. | |

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
| **201** | Success. The new SLO has been created. Response doesn&#39;t have a body. The **location** response header contains the ID of the new SLO. |  * location - The location of the new resource created by this request. <br>  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **500** | Internal server error. |  -  |

## createSloWithHttpInfo

> ApiResponse<Void> createSlo createSloWithHttpInfo(sloConfigItemDtoImpl)

Creates a new SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        SloConfigItemDtoImpl sloConfigItemDtoImpl = new SloConfigItemDtoImpl(); // SloConfigItemDtoImpl | The JSON body of the request. Contains the parameters of the new SLO.
        try {
            ApiResponse<Void> response = apiInstance.createSloWithHttpInfo(sloConfigItemDtoImpl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#createSlo");
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
| **sloConfigItemDtoImpl** | [**SloConfigItemDtoImpl**](SloConfigItemDtoImpl.md)| The JSON body of the request. Contains the parameters of the new SLO. | |

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
| **201** | Success. The new SLO has been created. Response doesn&#39;t have a body. The **location** response header contains the ID of the new SLO. |  * location - The location of the new resource created by this request. <br>  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **500** | Internal server error. |  -  |


## deleteSlo

> void deleteSlo(id)

Deletes an SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        try {
            apiInstance.deleteSlo(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#deleteSlo");
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
| **id** | **UUID**| The ID of the required SLO. | |

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
| **204** | Success. The SLO has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **500** | Internal server error. |  -  |

## deleteSloWithHttpInfo

> ApiResponse<Void> deleteSlo deleteSloWithHttpInfo(id)

Deletes an SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        try {
            ApiResponse<Void> response = apiInstance.deleteSloWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#deleteSlo");
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
| **id** | **UUID**| The ID of the required SLO. | |

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
| **204** | Success. The SLO has been deleted. Response doesn&#39;t have a body. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **409** | Failed. Conflicting resource. |  -  |
| **500** | Internal server error. |  -  |


## getSlo

> SLOs getSlo(nextPageKey, pageSize, from, to, sloSelector, sort, timeFrame, demo, evaluate, enabledSlos, showGlobalSlos)

Lists all available SLOs along with calculated values

By default the values are calculated for the SLO&#39;s own timeframe. You can use a custom timeframe:   1. Set the **timeFrame** parameter to &#x60;GTF&#x60;.  2. Provide the timeframe in **from** and **to** parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of SLOs in a single response payload.   The maximal allowed page size is 10000.   If not set, 10 is used.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sloSelector = ""; // String | The scope of the query. Only SLOs matching the provided criteria are included in the response.   You can add one or several of the criteria listed below. * SLO ID: id(\"id-1\",\"id-2\"). * Name: name(\"name\"). Filters for an SLO with the given name. The filter is case-sensitive. * Health state: healthState(\"HEALTHY\") or healthState(\"UNHEALTHY\"). You can specify only one health state. * Text: text(\"value\"). Filters for all SLOs that contain the given value in their name or description. The filter is case-insensitive. * Problem: problemDisplayName(\"value\"). Filters for all SLOs that are related to a given problem display name (e.g. P-12345).  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/slo?sloSelector=name(\"Service Availability\"), .../api/v2/slo?sloSelector=id(\"id\"), .../api/v2/slo?sloSelector=text(\"Description\"),healthState(\"HEALTHY\").  The special characters ~ and \" need to be escaped using a ~ (e.g. double quote search text(\"~\"\").
        String sort = "name"; // String | The sorting of SLO entries:  * `name`: Names in ascending order.  * `-name`: Names in descending order.   If not set, the ascending order is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        Boolean demo = false; // Boolean | Get your SLOs (`false`) or a set of demo SLOs (`true`).
        String evaluate = "true"; // String | Get your SLOs without them being evaluated (`false`) or with evaluations (`true`) with maximum `pageSize` of 25.
        String enabledSlos = "true"; // String | Get your enabled SLOs (`true`), disabled ones (`false`) or both enabled and disabled ones (`all`).
        Boolean showGlobalSlos = true; // Boolean | Get your global SLOs (`true`) regardless of the selected filter or filter them out (`false`).
        try {
            SLOs result = apiInstance.getSlo(nextPageKey, pageSize, from, to, sloSelector, sort, timeFrame, demo, evaluate, enabledSlos, showGlobalSlos);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#getSlo");
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
| **pageSize** | **Long**| The amount of SLOs in a single response payload.   The maximal allowed page size is 10000.   If not set, 10 is used. | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sloSelector** | **String**| The scope of the query. Only SLOs matching the provided criteria are included in the response.   You can add one or several of the criteria listed below. * SLO ID: id(\&quot;id-1\&quot;,\&quot;id-2\&quot;). * Name: name(\&quot;name\&quot;). Filters for an SLO with the given name. The filter is case-sensitive. * Health state: healthState(\&quot;HEALTHY\&quot;) or healthState(\&quot;UNHEALTHY\&quot;). You can specify only one health state. * Text: text(\&quot;value\&quot;). Filters for all SLOs that contain the given value in their name or description. The filter is case-insensitive. * Problem: problemDisplayName(\&quot;value\&quot;). Filters for all SLOs that are related to a given problem display name (e.g. P-12345).  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/slo?sloSelector&#x3D;name(\&quot;Service Availability\&quot;), .../api/v2/slo?sloSelector&#x3D;id(\&quot;id\&quot;), .../api/v2/slo?sloSelector&#x3D;text(\&quot;Description\&quot;),healthState(\&quot;HEALTHY\&quot;).  The special characters ~ and \&quot; need to be escaped using a ~ (e.g. double quote search text(\&quot;~\&quot;\&quot;). | [optional] [default to ] |
| **sort** | **String**| The sorting of SLO entries:  * &#x60;name&#x60;: Names in ascending order.  * &#x60;-name&#x60;: Names in descending order.   If not set, the ascending order is used. | [optional] [default to name] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |
| **demo** | **Boolean**| Get your SLOs (&#x60;false&#x60;) or a set of demo SLOs (&#x60;true&#x60;). | [optional] [default to false] |
| **evaluate** | **String**| Get your SLOs without them being evaluated (&#x60;false&#x60;) or with evaluations (&#x60;true&#x60;) with maximum &#x60;pageSize&#x60; of 25. | [optional] [default to false] [enum: true, false] |
| **enabledSlos** | **String**| Get your enabled SLOs (&#x60;true&#x60;), disabled ones (&#x60;false&#x60;) or both enabled and disabled ones (&#x60;all&#x60;). | [optional] [default to true] [enum: true, false, all] |
| **showGlobalSlos** | **Boolean**| Get your global SLOs (&#x60;true&#x60;) regardless of the selected filter or filter them out (&#x60;false&#x60;). | [optional] [default to true] |

### Return type

[**SLOs**](SLOs.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the parameters and calculated values of the requested SLO. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## getSloWithHttpInfo

> ApiResponse<SLOs> getSlo getSloWithHttpInfo(nextPageKey, pageSize, from, to, sloSelector, sort, timeFrame, demo, evaluate, enabledSlos, showGlobalSlos)

Lists all available SLOs along with calculated values

By default the values are calculated for the SLO&#39;s own timeframe. You can use a custom timeframe:   1. Set the **timeFrame** parameter to &#x60;GTF&#x60;.  2. Provide the timeframe in **from** and **to** parameters.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of SLOs in a single response payload.   The maximal allowed page size is 10000.   If not set, 10 is used.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sloSelector = ""; // String | The scope of the query. Only SLOs matching the provided criteria are included in the response.   You can add one or several of the criteria listed below. * SLO ID: id(\"id-1\",\"id-2\"). * Name: name(\"name\"). Filters for an SLO with the given name. The filter is case-sensitive. * Health state: healthState(\"HEALTHY\") or healthState(\"UNHEALTHY\"). You can specify only one health state. * Text: text(\"value\"). Filters for all SLOs that contain the given value in their name or description. The filter is case-insensitive. * Problem: problemDisplayName(\"value\"). Filters for all SLOs that are related to a given problem display name (e.g. P-12345).  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/slo?sloSelector=name(\"Service Availability\"), .../api/v2/slo?sloSelector=id(\"id\"), .../api/v2/slo?sloSelector=text(\"Description\"),healthState(\"HEALTHY\").  The special characters ~ and \" need to be escaped using a ~ (e.g. double quote search text(\"~\"\").
        String sort = "name"; // String | The sorting of SLO entries:  * `name`: Names in ascending order.  * `-name`: Names in descending order.   If not set, the ascending order is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        Boolean demo = false; // Boolean | Get your SLOs (`false`) or a set of demo SLOs (`true`).
        String evaluate = "true"; // String | Get your SLOs without them being evaluated (`false`) or with evaluations (`true`) with maximum `pageSize` of 25.
        String enabledSlos = "true"; // String | Get your enabled SLOs (`true`), disabled ones (`false`) or both enabled and disabled ones (`all`).
        Boolean showGlobalSlos = true; // Boolean | Get your global SLOs (`true`) regardless of the selected filter or filter them out (`false`).
        try {
            ApiResponse<SLOs> response = apiInstance.getSloWithHttpInfo(nextPageKey, pageSize, from, to, sloSelector, sort, timeFrame, demo, evaluate, enabledSlos, showGlobalSlos);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#getSlo");
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
| **pageSize** | **Long**| The amount of SLOs in a single response payload.   The maximal allowed page size is 10000.   If not set, 10 is used. | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sloSelector** | **String**| The scope of the query. Only SLOs matching the provided criteria are included in the response.   You can add one or several of the criteria listed below. * SLO ID: id(\&quot;id-1\&quot;,\&quot;id-2\&quot;). * Name: name(\&quot;name\&quot;). Filters for an SLO with the given name. The filter is case-sensitive. * Health state: healthState(\&quot;HEALTHY\&quot;) or healthState(\&quot;UNHEALTHY\&quot;). You can specify only one health state. * Text: text(\&quot;value\&quot;). Filters for all SLOs that contain the given value in their name or description. The filter is case-insensitive. * Problem: problemDisplayName(\&quot;value\&quot;). Filters for all SLOs that are related to a given problem display name (e.g. P-12345).  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/slo?sloSelector&#x3D;name(\&quot;Service Availability\&quot;), .../api/v2/slo?sloSelector&#x3D;id(\&quot;id\&quot;), .../api/v2/slo?sloSelector&#x3D;text(\&quot;Description\&quot;),healthState(\&quot;HEALTHY\&quot;).  The special characters ~ and \&quot; need to be escaped using a ~ (e.g. double quote search text(\&quot;~\&quot;\&quot;). | [optional] [default to ] |
| **sort** | **String**| The sorting of SLO entries:  * &#x60;name&#x60;: Names in ascending order.  * &#x60;-name&#x60;: Names in descending order.   If not set, the ascending order is used. | [optional] [default to name] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |
| **demo** | **Boolean**| Get your SLOs (&#x60;false&#x60;) or a set of demo SLOs (&#x60;true&#x60;). | [optional] [default to false] |
| **evaluate** | **String**| Get your SLOs without them being evaluated (&#x60;false&#x60;) or with evaluations (&#x60;true&#x60;) with maximum &#x60;pageSize&#x60; of 25. | [optional] [default to false] [enum: true, false] |
| **enabledSlos** | **String**| Get your enabled SLOs (&#x60;true&#x60;), disabled ones (&#x60;false&#x60;) or both enabled and disabled ones (&#x60;all&#x60;). | [optional] [default to true] [enum: true, false, all] |
| **showGlobalSlos** | **Boolean**| Get your global SLOs (&#x60;true&#x60;) regardless of the selected filter or filter them out (&#x60;false&#x60;). | [optional] [default to true] |

### Return type

ApiResponse<[**SLOs**](SLOs.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the parameters and calculated values of the requested SLO. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## getSloById

> SLO getSloById(id, from, to, timeFrame)

Gets parameters and calculated values of a specific SLO

If **from** and **to** parameters are provided, the SLO is calculated for that timeframe; otherwise the SLO&#39;s own timeframe is used.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        try {
            SLO result = apiInstance.getSloById(id, from, to, timeFrame);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#getSloById");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |

### Return type

[**SLO**](SLO.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the parameters and calculated values of the requested SLO. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getSloByIdWithHttpInfo

> ApiResponse<SLO> getSloById getSloByIdWithHttpInfo(id, from, to, timeFrame)

Gets parameters and calculated values of a specific SLO

If **from** and **to** parameters are provided, the SLO is calculated for that timeframe; otherwise the SLO&#39;s own timeframe is used.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two weeks is used (`now-2w`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String timeFrame = "CURRENT"; // String | The timeframe to calculate the SLO values:   * `CURRENT`: SLO's own timeframe.  * `GTF`: timeframe specified by **from** and **to** parameters.   If not set, the `CURRENT` value is used.
        try {
            ApiResponse<SLO> response = apiInstance.getSloByIdWithHttpInfo(id, from, to, timeFrame);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#getSloById");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **timeFrame** | **String**| The timeframe to calculate the SLO values:   * &#x60;CURRENT&#x60;: SLO&#39;s own timeframe.  * &#x60;GTF&#x60;: timeframe specified by **from** and **to** parameters.   If not set, the &#x60;CURRENT&#x60; value is used. | [optional] [default to CURRENT] [enum: CURRENT, GTF] |

### Return type

ApiResponse<[**SLO**](SLO.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the parameters and calculated values of the requested SLO. |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## updateSloById

> void updateSloById(id, sloConfigItemDtoImpl)

Updates an existing SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        SloConfigItemDtoImpl sloConfigItemDtoImpl = new SloConfigItemDtoImpl(); // SloConfigItemDtoImpl | The JSON body of the request. Contains the updated parameters of the SLO.
        try {
            apiInstance.updateSloById(id, sloConfigItemDtoImpl);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#updateSloById");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **sloConfigItemDtoImpl** | [**SloConfigItemDtoImpl**](SloConfigItemDtoImpl.md)| The JSON body of the request. Contains the updated parameters of the SLO. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **500** | Internal server error. |  -  |

## updateSloByIdWithHttpInfo

> ApiResponse<Void> updateSloById updateSloByIdWithHttpInfo(id, sloConfigItemDtoImpl)

Updates an existing SLO

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required SLO.
        SloConfigItemDtoImpl sloConfigItemDtoImpl = new SloConfigItemDtoImpl(); // SloConfigItemDtoImpl | The JSON body of the request. Contains the updated parameters of the SLO.
        try {
            ApiResponse<Void> response = apiInstance.updateSloByIdWithHttpInfo(id, sloConfigItemDtoImpl);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#updateSloById");
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
| **id** | **UUID**| The ID of the required SLO. | |
| **sloConfigItemDtoImpl** | [**SloConfigItemDtoImpl**](SloConfigItemDtoImpl.md)| The JSON body of the request. Contains the updated parameters of the SLO. | |

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
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |
| **500** | Internal server error. |  -  |

