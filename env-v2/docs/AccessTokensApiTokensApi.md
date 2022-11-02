# AccessTokensApiTokensApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiToken**](AccessTokensApiTokensApi.md#createApiToken) | **POST** /apiTokens | Creates a new API token |
| [**createApiTokenWithHttpInfo**](AccessTokensApiTokensApi.md#createApiTokenWithHttpInfo) | **POST** /apiTokens | Creates a new API token |
| [**deleteApiToken**](AccessTokensApiTokensApi.md#deleteApiToken) | **DELETE** /apiTokens/{id} | Deletes an API token |
| [**deleteApiTokenWithHttpInfo**](AccessTokensApiTokensApi.md#deleteApiTokenWithHttpInfo) | **DELETE** /apiTokens/{id} | Deletes an API token |
| [**getApiToken**](AccessTokensApiTokensApi.md#getApiToken) | **GET** /apiTokens/{id} | Gets API token metadata by token ID |
| [**getApiTokenWithHttpInfo**](AccessTokensApiTokensApi.md#getApiTokenWithHttpInfo) | **GET** /apiTokens/{id} | Gets API token metadata by token ID |
| [**listApiTokens**](AccessTokensApiTokensApi.md#listApiTokens) | **GET** /apiTokens | Lists all available API tokens |
| [**listApiTokensWithHttpInfo**](AccessTokensApiTokensApi.md#listApiTokensWithHttpInfo) | **GET** /apiTokens | Lists all available API tokens |
| [**lookupApiToken**](AccessTokensApiTokensApi.md#lookupApiToken) | **POST** /apiTokens/lookup | Gets API token metadata by token secret |
| [**lookupApiTokenWithHttpInfo**](AccessTokensApiTokensApi.md#lookupApiTokenWithHttpInfo) | **POST** /apiTokens/lookup | Gets API token metadata by token secret |
| [**updateApiToken**](AccessTokensApiTokensApi.md#updateApiToken) | **PUT** /apiTokens/{id} | Updates an API token |
| [**updateApiTokenWithHttpInfo**](AccessTokensApiTokensApi.md#updateApiTokenWithHttpInfo) | **PUT** /apiTokens/{id} | Updates an API token |



## createApiToken

> ApiTokenCreated createApiToken(apiTokenCreate)

Creates a new API token

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        ApiTokenCreate apiTokenCreate = new ApiTokenCreate(); // ApiTokenCreate | The JSON body of the request. Contains parameters of the new API token.
        try {
            ApiTokenCreated result = apiInstance.createApiToken(apiTokenCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#createApiToken");
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
| **apiTokenCreate** | [**ApiTokenCreate**](ApiTokenCreate.md)| The JSON body of the request. Contains parameters of the new API token. | |

### Return type

[**ApiTokenCreated**](ApiTokenCreated.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The body of the response contains the token secret. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## createApiTokenWithHttpInfo

> ApiResponse<ApiTokenCreated> createApiToken createApiTokenWithHttpInfo(apiTokenCreate)

Creates a new API token

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        ApiTokenCreate apiTokenCreate = new ApiTokenCreate(); // ApiTokenCreate | The JSON body of the request. Contains parameters of the new API token.
        try {
            ApiResponse<ApiTokenCreated> response = apiInstance.createApiTokenWithHttpInfo(apiTokenCreate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#createApiToken");
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
| **apiTokenCreate** | [**ApiTokenCreate**](ApiTokenCreate.md)| The JSON body of the request. Contains parameters of the new API token. | |

### Return type

ApiResponse<[**ApiTokenCreated**](ApiTokenCreated.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The body of the response contains the token secret. |  -  |
| **400** | Failed. The input is invalid. |  -  |


## deleteApiToken

> void deleteApiToken(id)

Deletes an API token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can't delete the token you're using for authentication of the request.
        try {
            apiInstance.deleteApiToken(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#deleteApiToken");
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
| **id** | **String**| The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can&#39;t delete the token you&#39;re using for authentication of the request. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. You can&#39;t delete the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## deleteApiTokenWithHttpInfo

> ApiResponse<Void> deleteApiToken deleteApiTokenWithHttpInfo(id)

Deletes an API token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can't delete the token you're using for authentication of the request.
        try {
            ApiResponse<Void> response = apiInstance.deleteApiTokenWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#deleteApiToken");
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
| **id** | **String**| The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can&#39;t delete the token you&#39;re using for authentication of the request. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. You can&#39;t delete the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## getApiToken

> ApiToken getApiToken(id)

Gets API token metadata by token ID

The token secret is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token.
        try {
            ApiToken result = apiInstance.getApiToken(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#getApiToken");
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
| **id** | **String**| The ID of the token. | |

### Return type

[**ApiToken**](ApiToken.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## getApiTokenWithHttpInfo

> ApiResponse<ApiToken> getApiToken getApiTokenWithHttpInfo(id)

Gets API token metadata by token ID

The token secret is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token.
        try {
            ApiResponse<ApiToken> response = apiInstance.getApiTokenWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#getApiToken");
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
| **id** | **String**| The ID of the token. | |

### Return type

ApiResponse<[**ApiToken**](ApiToken.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## listApiTokens

> ApiTokenList listApiTokens(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort)

Lists all available API tokens

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used.
        String apiTokenSelector = "apiTokenSelector_example"; // String | Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: `owner(\"value\")`. The user that owns the token. Case-sensitive. * Personal access token: `personalAccessToken(false)`. Set to `true` to include only personal access tokens or to `false` to include only API tokens. * Token scope: `scope(\"scope1\",\"scope2\")`. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (`,`). Only results matching **all** criteria are included into response.
        String fields = "fields_example"; // String | Specifies the fields to be included in the response.  The following fields are included by default:   * `id`  * `name`  * `enabled`  * `owner`  * `creationDate`   To remove fields from the response, specify them with the minus (`-`) operator as a comma-separated list (for example, `-creationDate,-owner`).   You can include additional fields:   * `personalAccessToken`  * `expirationDate`  * `lastUsedDate`  * `lastUsedIpAddress`  * `modifiedDate`  * `scopes`   * `additionalMetadata`   To add fields to the response, specify them with the plus (`+`) operator as a comma-separated list (for example, `+expirationDate,+scopes`). You can combine adding and removing of fields (for example, `+scopes,-creationDate`).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, `creationDate,expirationDate,owner`). The ID is always included in the response.   The **fields** string must be URL-encoded.
        String from = "from_example"; // String | Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String to = "to_example"; // String | Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sort = "-creationDate"; // String | The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * `name`: token name (`+` a...z or `-` z...a)   * `lastUsedDate` last used (`+` never used tokens first `-` most recently used tokens first)   * `creationDate` (`+` oldest tokens first `-` newest tokens first)   * `expirationDate` (`+` tokens that expire soon first `-` unlimited tokens first)   * `modifiedDate` last modified (`+` never modified tokens first `-` most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first.
        try {
            ApiTokenList result = apiInstance.listApiTokens(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#listApiTokens");
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
| **pageSize** | **Long**| The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used. | [optional] |
| **apiTokenSelector** | **String**| Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: &#x60;owner(\&quot;value\&quot;)&#x60;. The user that owns the token. Case-sensitive. * Personal access token: &#x60;personalAccessToken(false)&#x60;. Set to &#x60;true&#x60; to include only personal access tokens or to &#x60;false&#x60; to include only API tokens. * Token scope: &#x60;scope(\&quot;scope1\&quot;,\&quot;scope2\&quot;)&#x60;. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (&#x60;,&#x60;). Only results matching **all** criteria are included into response. | [optional] |
| **fields** | **String**| Specifies the fields to be included in the response.  The following fields are included by default:   * &#x60;id&#x60;  * &#x60;name&#x60;  * &#x60;enabled&#x60;  * &#x60;owner&#x60;  * &#x60;creationDate&#x60;   To remove fields from the response, specify them with the minus (&#x60;-&#x60;) operator as a comma-separated list (for example, &#x60;-creationDate,-owner&#x60;).   You can include additional fields:   * &#x60;personalAccessToken&#x60;  * &#x60;expirationDate&#x60;  * &#x60;lastUsedDate&#x60;  * &#x60;lastUsedIpAddress&#x60;  * &#x60;modifiedDate&#x60;  * &#x60;scopes&#x60;   * &#x60;additionalMetadata&#x60;   To add fields to the response, specify them with the plus (&#x60;+&#x60;) operator as a comma-separated list (for example, &#x60;+expirationDate,+scopes&#x60;). You can combine adding and removing of fields (for example, &#x60;+scopes,-creationDate&#x60;).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, &#x60;creationDate,expirationDate,owner&#x60;). The ID is always included in the response.   The **fields** string must be URL-encoded. | [optional] |
| **from** | **String**| Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **to** | **String**| Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sort** | **String**| The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * &#x60;name&#x60;: token name (&#x60;+&#x60; a...z or &#x60;-&#x60; z...a)   * &#x60;lastUsedDate&#x60; last used (&#x60;+&#x60; never used tokens first &#x60;-&#x60; most recently used tokens first)   * &#x60;creationDate&#x60; (&#x60;+&#x60; oldest tokens first &#x60;-&#x60; newest tokens first)   * &#x60;expirationDate&#x60; (&#x60;+&#x60; tokens that expire soon first &#x60;-&#x60; unlimited tokens first)   * &#x60;modifiedDate&#x60; last modified (&#x60;+&#x60; never modified tokens first &#x60;-&#x60; most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first. | [optional] [default to -creationDate] |

### Return type

[**ApiTokenList**](ApiTokenList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |

## listApiTokensWithHttpInfo

> ApiResponse<ApiTokenList> listApiTokens listApiTokensWithHttpInfo(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort)

Lists all available API tokens

You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used.
        String apiTokenSelector = "apiTokenSelector_example"; // String | Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: `owner(\"value\")`. The user that owns the token. Case-sensitive. * Personal access token: `personalAccessToken(false)`. Set to `true` to include only personal access tokens or to `false` to include only API tokens. * Token scope: `scope(\"scope1\",\"scope2\")`. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (`,`). Only results matching **all** criteria are included into response.
        String fields = "fields_example"; // String | Specifies the fields to be included in the response.  The following fields are included by default:   * `id`  * `name`  * `enabled`  * `owner`  * `creationDate`   To remove fields from the response, specify them with the minus (`-`) operator as a comma-separated list (for example, `-creationDate,-owner`).   You can include additional fields:   * `personalAccessToken`  * `expirationDate`  * `lastUsedDate`  * `lastUsedIpAddress`  * `modifiedDate`  * `scopes`   * `additionalMetadata`   To add fields to the response, specify them with the plus (`+`) operator as a comma-separated list (for example, `+expirationDate,+scopes`). You can combine adding and removing of fields (for example, `+scopes,-creationDate`).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, `creationDate,expirationDate,owner`). The ID is always included in the response.   The **fields** string must be URL-encoded.
        String from = "from_example"; // String | Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String to = "to_example"; // String | Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String sort = "-creationDate"; // String | The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * `name`: token name (`+` a...z or `-` z...a)   * `lastUsedDate` last used (`+` never used tokens first `-` most recently used tokens first)   * `creationDate` (`+` oldest tokens first `-` newest tokens first)   * `expirationDate` (`+` tokens that expire soon first `-` unlimited tokens first)   * `modifiedDate` last modified (`+` never modified tokens first `-` most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first.
        try {
            ApiResponse<ApiTokenList> response = apiInstance.listApiTokensWithHttpInfo(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#listApiTokens");
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
| **pageSize** | **Long**| The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used. | [optional] |
| **apiTokenSelector** | **String**| Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: &#x60;owner(\&quot;value\&quot;)&#x60;. The user that owns the token. Case-sensitive. * Personal access token: &#x60;personalAccessToken(false)&#x60;. Set to &#x60;true&#x60; to include only personal access tokens or to &#x60;false&#x60; to include only API tokens. * Token scope: &#x60;scope(\&quot;scope1\&quot;,\&quot;scope2\&quot;)&#x60;. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (&#x60;,&#x60;). Only results matching **all** criteria are included into response. | [optional] |
| **fields** | **String**| Specifies the fields to be included in the response.  The following fields are included by default:   * &#x60;id&#x60;  * &#x60;name&#x60;  * &#x60;enabled&#x60;  * &#x60;owner&#x60;  * &#x60;creationDate&#x60;   To remove fields from the response, specify them with the minus (&#x60;-&#x60;) operator as a comma-separated list (for example, &#x60;-creationDate,-owner&#x60;).   You can include additional fields:   * &#x60;personalAccessToken&#x60;  * &#x60;expirationDate&#x60;  * &#x60;lastUsedDate&#x60;  * &#x60;lastUsedIpAddress&#x60;  * &#x60;modifiedDate&#x60;  * &#x60;scopes&#x60;   * &#x60;additionalMetadata&#x60;   To add fields to the response, specify them with the plus (&#x60;+&#x60;) operator as a comma-separated list (for example, &#x60;+expirationDate,+scopes&#x60;). You can combine adding and removing of fields (for example, &#x60;+scopes,-creationDate&#x60;).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, &#x60;creationDate,expirationDate,owner&#x60;). The ID is always included in the response.   The **fields** string must be URL-encoded. | [optional] |
| **from** | **String**| Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **to** | **String**| Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **sort** | **String**| The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * &#x60;name&#x60;: token name (&#x60;+&#x60; a...z or &#x60;-&#x60; z...a)   * &#x60;lastUsedDate&#x60; last used (&#x60;+&#x60; never used tokens first &#x60;-&#x60; most recently used tokens first)   * &#x60;creationDate&#x60; (&#x60;+&#x60; oldest tokens first &#x60;-&#x60; newest tokens first)   * &#x60;expirationDate&#x60; (&#x60;+&#x60; tokens that expire soon first &#x60;-&#x60; unlimited tokens first)   * &#x60;modifiedDate&#x60; last modified (&#x60;+&#x60; never modified tokens first &#x60;-&#x60; most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first. | [optional] [default to -creationDate] |

### Return type

ApiResponse<[**ApiTokenList**](ApiTokenList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Failed. The input is invalid. |  -  |


## lookupApiToken

> ApiToken lookupApiToken(apiTokenSecret)

Gets API token metadata by token secret

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        ApiTokenSecret apiTokenSecret = new ApiTokenSecret(); // ApiTokenSecret | The JSON body of the request. Contains the required token.
        try {
            ApiToken result = apiInstance.lookupApiToken(apiTokenSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#lookupApiToken");
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
| **apiTokenSecret** | [**ApiTokenSecret**](ApiTokenSecret.md)| The JSON body of the request. Contains the required token. | |

### Return type

[**ApiToken**](ApiToken.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |

## lookupApiTokenWithHttpInfo

> ApiResponse<ApiToken> lookupApiToken lookupApiTokenWithHttpInfo(apiTokenSecret)

Gets API token metadata by token secret

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        ApiTokenSecret apiTokenSecret = new ApiTokenSecret(); // ApiTokenSecret | The JSON body of the request. Contains the required token.
        try {
            ApiResponse<ApiToken> response = apiInstance.lookupApiTokenWithHttpInfo(apiTokenSecret);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#lookupApiToken");
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
| **apiTokenSecret** | [**ApiTokenSecret**](ApiTokenSecret.md)| The JSON body of the request. Contains the required token. | |

### Return type

ApiResponse<[**ApiToken**](ApiToken.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested resource doesn&#39;t exist. |  -  |


## updateApiToken

> void updateApiToken(id, apiTokenUpdate)

Updates an API token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be updated.    You can't disable the token you're using for authentication of the request.
        ApiTokenUpdate apiTokenUpdate = new ApiTokenUpdate(); // ApiTokenUpdate | The JSON body of the request. Contains updated parameters of the API token.
        try {
            apiInstance.updateApiToken(id, apiTokenUpdate);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#updateApiToken");
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
| **id** | **String**| The ID of the token to be updated.    You can&#39;t disable the token you&#39;re using for authentication of the request. | |
| **apiTokenUpdate** | [**ApiTokenUpdate**](ApiTokenUpdate.md)| The JSON body of the request. Contains updated parameters of the API token. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

## updateApiTokenWithHttpInfo

> ApiResponse<Void> updateApiToken updateApiTokenWithHttpInfo(id, apiTokenUpdate)

Updates an API token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.AccessTokensApiTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AccessTokensApiTokensApi apiInstance = new AccessTokensApiTokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be updated.    You can't disable the token you're using for authentication of the request.
        ApiTokenUpdate apiTokenUpdate = new ApiTokenUpdate(); // ApiTokenUpdate | The JSON body of the request. Contains updated parameters of the API token.
        try {
            ApiResponse<Void> response = apiInstance.updateApiTokenWithHttpInfo(id, apiTokenUpdate);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApiTokensApi#updateApiToken");
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
| **id** | **String**| The ID of the token to be updated.    You can&#39;t disable the token you&#39;re using for authentication of the request. | |
| **apiTokenUpdate** | [**ApiTokenUpdate**](ApiTokenUpdate.md)| The JSON body of the request. Contains updated parameters of the API token. | |

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
| **204** | Success. Response doesn&#39;t have a body. |  -  |
| **400** | Failed. The input is invalid. |  -  |

