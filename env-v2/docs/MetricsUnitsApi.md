# MetricsUnitsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allUnits**](MetricsUnitsApi.md#allUnits) | **GET** /units | Lists all available units |
| [**allUnitsWithHttpInfo**](MetricsUnitsApi.md#allUnitsWithHttpInfo) | **GET** /units | Lists all available units |
| [**convert**](MetricsUnitsApi.md#convert) | **GET** /units/{unitId}/convert | Converts a value of the given source unit into a given target unit if specified, or finds an appropriate unit if no target is specified, respecting the preferred number format if specified. |
| [**convertWithHttpInfo**](MetricsUnitsApi.md#convertWithHttpInfo) | **GET** /units/{unitId}/convert | Converts a value of the given source unit into a given target unit if specified, or finds an appropriate unit if no target is specified, respecting the preferred number format if specified. |
| [**unit**](MetricsUnitsApi.md#unit) | **GET** /units/{unitId} | Gets the properties of the specified unit |
| [**unitWithHttpInfo**](MetricsUnitsApi.md#unitWithHttpInfo) | **GET** /units/{unitId} | Gets the properties of the specified unit |



## allUnits

> UnitList allUnits(unitSelector, fields)

Lists all available units

You can narrow down the output by providing filter criteria in the **unitSelector** field.  

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitSelector = "unitSelector_example"; // String | Selects units to be included to the response. Available criteria:  * Compatibility: `compatibleTo(\"unit\",\"display-format\")`. Returns units that can be converted to the specified unit. The optional display format (`binary` or `decimal`) argument is supported by bit- and byte-based units and returns only units for the specified format.
        String fields = "fields_example"; // String | Defines the list of properties to be included in the response. The ID of the unit is **always** included. The following additional properties are available:   * `displayName`: The display name of the unit.  * `symbol`: The symbol of the unit.  * `description`: A short description of the unit.  By default, the ID, the display name, and the symbol are included.   To add properties, list them with leading plus `+`. To exclude default properties, list them with leading minus `-`.  To specify several properties, join them with a comma (for example `fields=+description,-symbol`).  If you specify just one property, the response contains the unitId and the specified property. To return unit IDs only, specify `unitId` here.
        try {
            UnitList result = apiInstance.allUnits(unitSelector, fields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#allUnits");
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
| **unitSelector** | **String**| Selects units to be included to the response. Available criteria:  * Compatibility: &#x60;compatibleTo(\&quot;unit\&quot;,\&quot;display-format\&quot;)&#x60;. Returns units that can be converted to the specified unit. The optional display format (&#x60;binary&#x60; or &#x60;decimal&#x60;) argument is supported by bit- and byte-based units and returns only units for the specified format. | [optional] |
| **fields** | **String**| Defines the list of properties to be included in the response. The ID of the unit is **always** included. The following additional properties are available:   * &#x60;displayName&#x60;: The display name of the unit.  * &#x60;symbol&#x60;: The symbol of the unit.  * &#x60;description&#x60;: A short description of the unit.  By default, the ID, the display name, and the symbol are included.   To add properties, list them with leading plus &#x60;+&#x60;. To exclude default properties, list them with leading minus &#x60;-&#x60;.  To specify several properties, join them with a comma (for example &#x60;fields&#x3D;+description,-symbol&#x60;).  If you specify just one property, the response contains the unitId and the specified property. To return unit IDs only, specify &#x60;unitId&#x60; here. | [optional] |

### Return type

[**UnitList**](UnitList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## allUnitsWithHttpInfo

> ApiResponse<UnitList> allUnits allUnitsWithHttpInfo(unitSelector, fields)

Lists all available units

You can narrow down the output by providing filter criteria in the **unitSelector** field.  

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitSelector = "unitSelector_example"; // String | Selects units to be included to the response. Available criteria:  * Compatibility: `compatibleTo(\"unit\",\"display-format\")`. Returns units that can be converted to the specified unit. The optional display format (`binary` or `decimal`) argument is supported by bit- and byte-based units and returns only units for the specified format.
        String fields = "fields_example"; // String | Defines the list of properties to be included in the response. The ID of the unit is **always** included. The following additional properties are available:   * `displayName`: The display name of the unit.  * `symbol`: The symbol of the unit.  * `description`: A short description of the unit.  By default, the ID, the display name, and the symbol are included.   To add properties, list them with leading plus `+`. To exclude default properties, list them with leading minus `-`.  To specify several properties, join them with a comma (for example `fields=+description,-symbol`).  If you specify just one property, the response contains the unitId and the specified property. To return unit IDs only, specify `unitId` here.
        try {
            ApiResponse<UnitList> response = apiInstance.allUnitsWithHttpInfo(unitSelector, fields);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#allUnits");
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
| **unitSelector** | **String**| Selects units to be included to the response. Available criteria:  * Compatibility: &#x60;compatibleTo(\&quot;unit\&quot;,\&quot;display-format\&quot;)&#x60;. Returns units that can be converted to the specified unit. The optional display format (&#x60;binary&#x60; or &#x60;decimal&#x60;) argument is supported by bit- and byte-based units and returns only units for the specified format. | [optional] |
| **fields** | **String**| Defines the list of properties to be included in the response. The ID of the unit is **always** included. The following additional properties are available:   * &#x60;displayName&#x60;: The display name of the unit.  * &#x60;symbol&#x60;: The symbol of the unit.  * &#x60;description&#x60;: A short description of the unit.  By default, the ID, the display name, and the symbol are included.   To add properties, list them with leading plus &#x60;+&#x60;. To exclude default properties, list them with leading minus &#x60;-&#x60;.  To specify several properties, join them with a comma (for example &#x60;fields&#x3D;+description,-symbol&#x60;).  If you specify just one property, the response contains the unitId and the specified property. To return unit IDs only, specify &#x60;unitId&#x60; here. | [optional] |

### Return type

ApiResponse<[**UnitList**](UnitList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## convert

> UnitConversionResult convert(unitId, value, targetUnit, numberFormat)

Converts a value of the given source unit into a given target unit if specified, or finds an appropriate unit if no target is specified, respecting the preferred number format if specified.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitId = "unitId_example"; // String | The ID of the source unit.
        Double value = 3.4D; // Double | The value to be converted.
        String targetUnit = "targetUnit_example"; // String | The ID of the target unit.
        String numberFormat = "numberFormat_example"; // String | The preferred number format. Only taken into account if no target unit is specified.
        try {
            UnitConversionResult result = apiInstance.convert(unitId, value, targetUnit, numberFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#convert");
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
| **unitId** | **String**| The ID of the source unit. | |
| **value** | **Double**| The value to be converted. | |
| **targetUnit** | **String**| The ID of the target unit. | [optional] |
| **numberFormat** | **String**| The preferred number format. Only taken into account if no target unit is specified. | [optional] |

### Return type

[**UnitConversionResult**](UnitConversionResult.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. The requested resource is not found or the query is incorrect. |  -  |

## convertWithHttpInfo

> ApiResponse<UnitConversionResult> convert convertWithHttpInfo(unitId, value, targetUnit, numberFormat)

Converts a value of the given source unit into a given target unit if specified, or finds an appropriate unit if no target is specified, respecting the preferred number format if specified.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitId = "unitId_example"; // String | The ID of the source unit.
        Double value = 3.4D; // Double | The value to be converted.
        String targetUnit = "targetUnit_example"; // String | The ID of the target unit.
        String numberFormat = "numberFormat_example"; // String | The preferred number format. Only taken into account if no target unit is specified.
        try {
            ApiResponse<UnitConversionResult> response = apiInstance.convertWithHttpInfo(unitId, value, targetUnit, numberFormat);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#convert");
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
| **unitId** | **String**| The ID of the source unit. | |
| **value** | **Double**| The value to be converted. | |
| **targetUnit** | **String**| The ID of the target unit. | [optional] |
| **numberFormat** | **String**| The preferred number format. Only taken into account if no target unit is specified. | [optional] |

### Return type

ApiResponse<[**UnitConversionResult**](UnitConversionResult.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. The requested resource is not found or the query is incorrect. |  -  |


## unit

> Unit unit(unitId)

Gets the properties of the specified unit

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitId = "unitId_example"; // String | The ID of the required unit.
        try {
            Unit result = apiInstance.unit(unitId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#unit");
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
| **unitId** | **String**| The ID of the required unit. | |

### Return type

[**Unit**](Unit.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. The requested resource is not found or the query is incorrect. |  -  |

## unitWithHttpInfo

> ApiResponse<Unit> unit unitWithHttpInfo(unitId)

Gets the properties of the specified unit

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsUnitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsUnitsApi apiInstance = new MetricsUnitsApi(defaultClient);
        String unitId = "unitId_example"; // String | The ID of the required unit.
        try {
            ApiResponse<Unit> response = apiInstance.unitWithHttpInfo(unitId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsUnitsApi#unit");
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
| **unitId** | **String**| The ID of the required unit. | |

### Return type

ApiResponse<[**Unit**](Unit.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not found. The requested resource is not found or the query is incorrect. |  -  |

