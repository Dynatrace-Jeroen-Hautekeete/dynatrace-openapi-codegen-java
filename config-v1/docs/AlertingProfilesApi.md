# AlertingProfilesApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAlertingProfile**](AlertingProfilesApi.md#createAlertingProfile) | **POST** /alertingProfiles | Creates a new alerting profile |
| [**createAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#createAlertingProfileWithHttpInfo) | **POST** /alertingProfiles | Creates a new alerting profile |
| [**createOrUpdateAlertingProfile**](AlertingProfilesApi.md#createOrUpdateAlertingProfile) | **PUT** /alertingProfiles/{id} | Updates an existing alerting profile |
| [**createOrUpdateAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#createOrUpdateAlertingProfileWithHttpInfo) | **PUT** /alertingProfiles/{id} | Updates an existing alerting profile |
| [**deleteAlertingProfile**](AlertingProfilesApi.md#deleteAlertingProfile) | **DELETE** /alertingProfiles/{id} | Deletes the specified alerting profile |
| [**deleteAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#deleteAlertingProfileWithHttpInfo) | **DELETE** /alertingProfiles/{id} | Deletes the specified alerting profile |
| [**getAlertingProfile**](AlertingProfilesApi.md#getAlertingProfile) | **GET** /alertingProfiles/{id} | Gets the properties of the specified alerting profile |
| [**getAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#getAlertingProfileWithHttpInfo) | **GET** /alertingProfiles/{id} | Gets the properties of the specified alerting profile |
| [**getAlertingProfiles**](AlertingProfilesApi.md#getAlertingProfiles) | **GET** /alertingProfiles | Lists all alerting profiles available in your environment |
| [**getAlertingProfilesWithHttpInfo**](AlertingProfilesApi.md#getAlertingProfilesWithHttpInfo) | **GET** /alertingProfiles | Lists all alerting profiles available in your environment |
| [**validateCreateAlertingProfile**](AlertingProfilesApi.md#validateCreateAlertingProfile) | **POST** /alertingProfiles/validator | Validates the payload the &#x60;POST /alertingProfiles&#x60; request |
| [**validateCreateAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#validateCreateAlertingProfileWithHttpInfo) | **POST** /alertingProfiles/validator | Validates the payload the &#x60;POST /alertingProfiles&#x60; request |
| [**validateCreateOrUpdateAlertingProfile**](AlertingProfilesApi.md#validateCreateOrUpdateAlertingProfile) | **POST** /alertingProfiles/{id}/validator | Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request |
| [**validateCreateOrUpdateAlertingProfileWithHttpInfo**](AlertingProfilesApi.md#validateCreateOrUpdateAlertingProfileWithHttpInfo) | **POST** /alertingProfiles/{id}/validator | Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request |



## createAlertingProfile

> EntityShortRepresentation createAlertingProfile(alertingProfile)

Creates a new alerting profile

The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the new alerting profile.
        try {
            EntityShortRepresentation result = apiInstance.createAlertingProfile(alertingProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#createAlertingProfile");
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
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the new alerting profile. | [optional] |

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
| **201** | Success. The new alerting profile has been created. The response contains the ID of the new alerting profile. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createAlertingProfileWithHttpInfo

> ApiResponse<EntityShortRepresentation> createAlertingProfile createAlertingProfileWithHttpInfo(alertingProfile)

Creates a new alerting profile

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
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the new alerting profile.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createAlertingProfileWithHttpInfo(alertingProfile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#createAlertingProfile");
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
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the new alerting profile. | [optional] |

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
| **201** | Success. The new alerting profile has been created. The response contains the ID of the new alerting profile. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## createOrUpdateAlertingProfile

> EntityShortRepresentation createOrUpdateAlertingProfile(id, alertingProfile)

Updates an existing alerting profile

If an alerting profile with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be updated.
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains updated parameters of the alerting profile.
        try {
            EntityShortRepresentation result = apiInstance.createOrUpdateAlertingProfile(id, alertingProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#createOrUpdateAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be updated. | |
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains updated parameters of the alerting profile. | [optional] |

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
| **204** | Success. The alerting profile has been updated. Response doesn&#39;t have a body. |  -  |
| **201** | Success. The new alerting profile has been created. The response contains the ID of the new alerting profile. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createOrUpdateAlertingProfileWithHttpInfo

> ApiResponse<EntityShortRepresentation> createOrUpdateAlertingProfile createOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile)

Updates an existing alerting profile

If an alerting profile with the specified ID doesn&#39;t exist, a new one is created.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be updated.
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains updated parameters of the alerting profile.
        try {
            ApiResponse<EntityShortRepresentation> response = apiInstance.createOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#createOrUpdateAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be updated. | |
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains updated parameters of the alerting profile. | [optional] |

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
| **204** | Success. The alerting profile has been updated. Response doesn&#39;t have a body. |  -  |
| **201** | Success. The new alerting profile has been created. The response contains the ID of the new alerting profile. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteAlertingProfile

> void deleteAlertingProfile(id)

Deletes the specified alerting profile

The default alerting profile cannot be deleted.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be deleted.
        try {
            apiInstance.deleteAlertingProfile(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#deleteAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be deleted. | |

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
| **204** | Success. The alerting profile has been deleted. Response doesn&#39;t have a body. |  -  |

## deleteAlertingProfileWithHttpInfo

> ApiResponse<Void> deleteAlertingProfile deleteAlertingProfileWithHttpInfo(id)

Deletes the specified alerting profile

The default alerting profile cannot be deleted.

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be deleted.
        try {
            ApiResponse<Void> response = apiInstance.deleteAlertingProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#deleteAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be deleted. | |

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
| **204** | Success. The alerting profile has been deleted. Response doesn&#39;t have a body. |  -  |


## getAlertingProfile

> AlertingProfile getAlertingProfile(id)

Gets the properties of the specified alerting profile

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required alerting profile.
        try {
            AlertingProfile result = apiInstance.getAlertingProfile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#getAlertingProfile");
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
| **id** | **UUID**| The ID of the required alerting profile. | |

### Return type

[**AlertingProfile**](AlertingProfile.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAlertingProfileWithHttpInfo

> ApiResponse<AlertingProfile> getAlertingProfile getAlertingProfileWithHttpInfo(id)

Gets the properties of the specified alerting profile

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the required alerting profile.
        try {
            ApiResponse<AlertingProfile> response = apiInstance.getAlertingProfileWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#getAlertingProfile");
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
| **id** | **UUID**| The ID of the required alerting profile. | |

### Return type

ApiResponse<[**AlertingProfile**](AlertingProfile.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAlertingProfiles

> StubList getAlertingProfiles()

Lists all alerting profiles available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        try {
            StubList result = apiInstance.getAlertingProfiles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#getAlertingProfiles");
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

[**StubList**](StubList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getAlertingProfilesWithHttpInfo

> ApiResponse<StubList> getAlertingProfiles getAlertingProfilesWithHttpInfo()

Lists all alerting profiles available in your environment

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        try {
            ApiResponse<StubList> response = apiInstance.getAlertingProfilesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#getAlertingProfiles");
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

ApiResponse<[**StubList**](StubList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## validateCreateAlertingProfile

> void validateCreateAlertingProfile(alertingProfile)

Validates the payload the &#x60;POST /alertingProfiles&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the alerting profile to be validated.
        try {
            apiInstance.validateCreateAlertingProfile(alertingProfile);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#validateCreateAlertingProfile");
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
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the alerting profile to be validated. | [optional] |

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
| **204** | Validated. The submitted alerting profile is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateAlertingProfileWithHttpInfo

> ApiResponse<Void> validateCreateAlertingProfile validateCreateAlertingProfileWithHttpInfo(alertingProfile)

Validates the payload the &#x60;POST /alertingProfiles&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the alerting profile to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateAlertingProfileWithHttpInfo(alertingProfile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#validateCreateAlertingProfile");
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
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the alerting profile to be validated. | [optional] |

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
| **204** | Validated. The submitted alerting profile is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |


## validateCreateOrUpdateAlertingProfile

> void validateCreateOrUpdateAlertingProfile(id, alertingProfile)

Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be validated.
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the alerting profile to be validated.
        try {
            apiInstance.validateCreateOrUpdateAlertingProfile(id, alertingProfile);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#validateCreateOrUpdateAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be validated. | |
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the alerting profile to be validated. | [optional] |

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
| **204** | Validated. The submitted alerting profile is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

## validateCreateOrUpdateAlertingProfileWithHttpInfo

> ApiResponse<Void> validateCreateOrUpdateAlertingProfile validateCreateOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile)

Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AlertingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AlertingProfilesApi apiInstance = new AlertingProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the alerting profile to be validated.
        AlertingProfile alertingProfile = new AlertingProfile(); // AlertingProfile | The JSON body of the request. Contains parameters of the alerting profile to be validated.
        try {
            ApiResponse<Void> response = apiInstance.validateCreateOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AlertingProfilesApi#validateCreateOrUpdateAlertingProfile");
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
| **id** | **UUID**| The ID of the alerting profile to be validated. | |
| **alertingProfile** | [**AlertingProfile**](AlertingProfile.md)| The JSON body of the request. Contains parameters of the alerting profile to be validated. | [optional] |

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
| **204** | Validated. The submitted alerting profile is valid. Response doesn&#39;t have a body |  -  |
| **400** | Failed. The input is invalid. |  -  |

