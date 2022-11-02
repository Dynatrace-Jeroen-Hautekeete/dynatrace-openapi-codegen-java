# GeographicRegionsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCities**](GeographicRegionsApi.md#getCities) | **GET** /rum/cities/{countryCode}/{regionCode} | Lists all cities of a country&#39;s region |
| [**getCitiesWithHttpInfo**](GeographicRegionsApi.md#getCitiesWithHttpInfo) | **GET** /rum/cities/{countryCode}/{regionCode} | Lists all cities of a country&#39;s region |
| [**getCountries**](GeographicRegionsApi.md#getCountries) | **GET** /rum/countries | Lists all countries |
| [**getCountriesWithHttpInfo**](GeographicRegionsApi.md#getCountriesWithHttpInfo) | **GET** /rum/countries | Lists all countries |
| [**getRegions**](GeographicRegionsApi.md#getRegions) | **GET** /rum/regions | Lists all countries along with their regions |
| [**getRegionsWithHttpInfo**](GeographicRegionsApi.md#getRegionsWithHttpInfo) | **GET** /rum/regions | Lists all countries along with their regions |
| [**getRegionsAndCities**](GeographicRegionsApi.md#getRegionsAndCities) | **GET** /rum/cities/{countryCode} | Lists all cities of a country |
| [**getRegionsAndCitiesWithHttpInfo**](GeographicRegionsApi.md#getRegionsAndCitiesWithHttpInfo) | **GET** /rum/cities/{countryCode} | Lists all cities of a country |
| [**getRegionsOfCountry**](GeographicRegionsApi.md#getRegionsOfCountry) | **GET** /rum/regions/{countryCode} | Lists all regions of a country |
| [**getRegionsOfCountryWithHttpInfo**](GeographicRegionsApi.md#getRegionsOfCountryWithHttpInfo) | **GET** /rum/regions/{countryCode} | Lists all regions of a country |



## getCities

> CountryWithRegionsWithCities getCities(countryCode, regionCode)

Lists all cities of a country&#39;s region

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        String regionCode = "regionCode_example"; // String | The code of the required region.    To fetch the list of available region codes, use the [GET regions of the country](https://dt-url.net/az230x0) request.
        try {
            CountryWithRegionsWithCities result = apiInstance.getCities(countryCode, regionCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getCities");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |
| **regionCode** | **String**| The code of the required region.    To fetch the list of available region codes, use the [GET regions of the country](https://dt-url.net/az230x0) request. | |

### Return type

[**CountryWithRegionsWithCities**](CountryWithRegionsWithCities.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of region&#39;s cities. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getCitiesWithHttpInfo

> ApiResponse<CountryWithRegionsWithCities> getCities getCitiesWithHttpInfo(countryCode, regionCode)

Lists all cities of a country&#39;s region

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        String regionCode = "regionCode_example"; // String | The code of the required region.    To fetch the list of available region codes, use the [GET regions of the country](https://dt-url.net/az230x0) request.
        try {
            ApiResponse<CountryWithRegionsWithCities> response = apiInstance.getCitiesWithHttpInfo(countryCode, regionCode);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getCities");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |
| **regionCode** | **String**| The code of the required region.    To fetch the list of available region codes, use the [GET regions of the country](https://dt-url.net/az230x0) request. | |

### Return type

ApiResponse<[**CountryWithRegionsWithCities**](CountryWithRegionsWithCities.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of region&#39;s cities. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getCountries

> CountryList getCountries()

Lists all countries

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        try {
            CountryList result = apiInstance.getCountries();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getCountries");
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

[**CountryList**](CountryList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of countries. |  -  |

## getCountriesWithHttpInfo

> ApiResponse<CountryList> getCountries getCountriesWithHttpInfo()

Lists all countries

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        try {
            ApiResponse<CountryList> response = apiInstance.getCountriesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getCountries");
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

ApiResponse<[**CountryList**](CountryList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of countries. |  -  |


## getRegions

> CountryListWithRegions getRegions()

Lists all countries along with their regions

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        try {
            CountryListWithRegions result = apiInstance.getRegions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegions");
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

[**CountryListWithRegions**](CountryListWithRegions.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of countries with regional divisions. |  -  |

## getRegionsWithHttpInfo

> ApiResponse<CountryListWithRegions> getRegions getRegionsWithHttpInfo()

Lists all countries along with their regions

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        try {
            ApiResponse<CountryListWithRegions> response = apiInstance.getRegionsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegions");
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

ApiResponse<[**CountryListWithRegions**](CountryListWithRegions.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of countries with regional divisions. |  -  |


## getRegionsAndCities

> CountryWithRegionsWithCities getRegionsAndCities(countryCode)

Lists all cities of a country

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        try {
            CountryWithRegionsWithCities result = apiInstance.getRegionsAndCities(countryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegionsAndCities");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |

### Return type

[**CountryWithRegionsWithCities**](CountryWithRegionsWithCities.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of country&#39;s cities. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getRegionsAndCitiesWithHttpInfo

> ApiResponse<CountryWithRegionsWithCities> getRegionsAndCities getRegionsAndCitiesWithHttpInfo(countryCode)

Lists all cities of a country

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        try {
            ApiResponse<CountryWithRegionsWithCities> response = apiInstance.getRegionsAndCitiesWithHttpInfo(countryCode);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegionsAndCities");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |

### Return type

ApiResponse<[**CountryWithRegionsWithCities**](CountryWithRegionsWithCities.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of country&#39;s cities. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getRegionsOfCountry

> CountryWithRegions getRegionsOfCountry(countryCode)

Lists all regions of a country

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        try {
            CountryWithRegions result = apiInstance.getRegionsOfCountry(countryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegionsOfCountry");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |

### Return type

[**CountryWithRegions**](CountryWithRegions.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of country&#39;s regions. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getRegionsOfCountryWithHttpInfo

> ApiResponse<CountryWithRegions> getRegionsOfCountry getRegionsOfCountryWithHttpInfo(countryCode)

Lists all regions of a country

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.GeographicRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        GeographicRegionsApi apiInstance = new GeographicRegionsApi(defaultClient);
        String countryCode = "countryCode_example"; // String | The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request.
        try {
            ApiResponse<CountryWithRegions> response = apiInstance.getRegionsOfCountryWithHttpInfo(countryCode);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeographicRegionsApi#getRegionsOfCountry");
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
| **countryCode** | **String**| The ISO code of the required country.    To fetch the list of available country codes, use the [GET all countries](https://dt-url.net/37030go) request. | |

### Return type

ApiResponse<[**CountryWithRegions**](CountryWithRegions.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of country&#39;s regions. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

