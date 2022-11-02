# TokensApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](TokensApi.md#createToken) | **POST** /tokens | Creates a new token |
| [**createTokenWithHttpInfo**](TokensApi.md#createTokenWithHttpInfo) | **POST** /tokens | Creates a new token |
| [**deleteToken**](TokensApi.md#deleteToken) | **DELETE** /tokens/{id} | Deletes the specified token |
| [**deleteTokenWithHttpInfo**](TokensApi.md#deleteTokenWithHttpInfo) | **DELETE** /tokens/{id} | Deletes the specified token |
| [**getTokenMetadata**](TokensApi.md#getTokenMetadata) | **GET** /tokens/{id} | Lists token metadata by token ID |
| [**getTokenMetadataWithHttpInfo**](TokensApi.md#getTokenMetadataWithHttpInfo) | **GET** /tokens/{id} | Lists token metadata by token ID |
| [**getTokenMetadataBySecret**](TokensApi.md#getTokenMetadataBySecret) | **POST** /tokens/lookup | Lists token metadata by token itself |
| [**getTokenMetadataBySecretWithHttpInfo**](TokensApi.md#getTokenMetadataBySecretWithHttpInfo) | **POST** /tokens/lookup | Lists token metadata by token itself |
| [**listTokens**](TokensApi.md#listTokens) | **GET** /tokens | Lists available tokens in your environment |
| [**listTokensWithHttpInfo**](TokensApi.md#listTokensWithHttpInfo) | **GET** /tokens | Lists available tokens in your environment |
| [**updateToken**](TokensApi.md#updateToken) | **PUT** /tokens/{id} | Updates the specified token |
| [**updateTokenWithHttpInfo**](TokensApi.md#updateTokenWithHttpInfo) | **PUT** /tokens/{id} | Updates the specified token |



## createToken

> Token createToken(createToken)

Creates a new token

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        CreateToken createToken = new CreateToken(); // CreateToken | The JSON body of the request. Contains parameters of the new token.
        try {
            Token result = apiInstance.createToken(createToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#createToken");
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
| **createToken** | [**CreateToken**](CreateToken.md)| The JSON body of the request. Contains parameters of the new token. | |

### Return type

[**Token**](Token.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The response body contains the token itself. |  * Location - Token Id <br>  |
| **400** | Failed. The input is invalid. Response body provides details. |  -  |

## createTokenWithHttpInfo

> ApiResponse<Token> createToken createTokenWithHttpInfo(createToken)

Creates a new token

The newly created token will be owned by the same user who owns the token used for authentication of the call.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        CreateToken createToken = new CreateToken(); // CreateToken | The JSON body of the request. Contains parameters of the new token.
        try {
            ApiResponse<Token> response = apiInstance.createTokenWithHttpInfo(createToken);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#createToken");
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
| **createToken** | [**CreateToken**](CreateToken.md)| The JSON body of the request. Contains parameters of the new token. | |

### Return type

ApiResponse<[**Token**](Token.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8, text/plain; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The token has been created. The response body contains the token itself. |  * Location - Token Id <br>  |
| **400** | Failed. The input is invalid. Response body provides details. |  -  |


## deleteToken

> void deleteToken(id)

Deletes the specified token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be deleted. Can either be the public identifier or the secret.   You can't delete the token you're using for authentication of the request.
        try {
            apiInstance.deleteToken(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#deleteToken");
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
| **id** | **String**| The ID of the token to be deleted. Can either be the public identifier or the secret.   You can&#39;t delete the token you&#39;re using for authentication of the request. | |

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
| **204** | Success |  -  |
| **400** | Failed. You can&#39;t delete the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested token has not been found. |  -  |

## deleteTokenWithHttpInfo

> ApiResponse<Void> deleteToken deleteTokenWithHttpInfo(id)

Deletes the specified token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be deleted. Can either be the public identifier or the secret.   You can't delete the token you're using for authentication of the request.
        try {
            ApiResponse<Void> response = apiInstance.deleteTokenWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#deleteToken");
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
| **id** | **String**| The ID of the token to be deleted. Can either be the public identifier or the secret.   You can&#39;t delete the token you&#39;re using for authentication of the request. | |

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
| **204** | Success |  -  |
| **400** | Failed. You can&#39;t delete the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested token has not been found. |  -  |


## getTokenMetadata

> TokenMetadata getTokenMetadata(id)

Lists token metadata by token ID

The token itself is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the required token.
        try {
            TokenMetadata result = apiInstance.getTokenMetadata(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#getTokenMetadata");
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
| **id** | **String**| The ID of the required token. | |

### Return type

[**TokenMetadata**](TokenMetadata.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested token has not been found. |  -  |

## getTokenMetadataWithHttpInfo

> ApiResponse<TokenMetadata> getTokenMetadata getTokenMetadataWithHttpInfo(id)

Lists token metadata by token ID

The token itself is **not** exposed.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the required token.
        try {
            ApiResponse<TokenMetadata> response = apiInstance.getTokenMetadataWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#getTokenMetadata");
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
| **id** | **String**| The ID of the required token. | |

### Return type

ApiResponse<[**TokenMetadata**](TokenMetadata.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Failed. The requested token has not been found. |  -  |


## getTokenMetadataBySecret

> TokenMetadata getTokenMetadataBySecret(token)

Lists token metadata by token itself

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        Token token = new Token(); // Token | The JSON body of the request. Contains the required token.
        try {
            TokenMetadata result = apiInstance.getTokenMetadataBySecret(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#getTokenMetadataBySecret");
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
| **token** | [**Token**](Token.md)| The JSON body of the request. Contains the required token. | |

### Return type

[**TokenMetadata**](TokenMetadata.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

## getTokenMetadataBySecretWithHttpInfo

> ApiResponse<TokenMetadata> getTokenMetadataBySecret getTokenMetadataBySecretWithHttpInfo(token)

Lists token metadata by token itself

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        Token token = new Token(); // Token | The JSON body of the request. Contains the required token.
        try {
            ApiResponse<TokenMetadata> response = apiInstance.getTokenMetadataBySecretWithHttpInfo(token);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#getTokenMetadataBySecret");
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
| **token** | [**Token**](Token.md)| The JSON body of the request. Contains the required token. | |

### Return type

ApiResponse<[**TokenMetadata**](TokenMetadata.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## listTokens

> StubList listTokens(limit, user, permissions, from, to)

Lists available tokens in your environment

You can narrow down the output by adding parameters. The token has to match *all* the specified parameters.    You can also specify the limit of returned tokens.   **This list may contain tokens which were created automatically** (e.g. InstallerDownload, Mobile, ...) and are not visible on the &#x60;Settings&#x60; page. Deleting those might have unintended side-effects as they might still be in use.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        Integer limit = 1000; // Integer | Limits the maximum number of returned tokens.    If not set the value of `1000` is used.    Maximum value is 1000000.
        String user = "user_example"; // String | Filters the resulting set of tokens by user, who owns the token.
        Set<String> permissions = Arrays.asList(); // Set<String> | Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: `permissions=scope1&permissions=scope2`. The token must have *all* the specified scopes.
        Long from = 56L; // Long | Last used after this timestamp (UTC milliseconds).
        Long to = 56L; // Long | Last used before this timestamp (UTC milliseconds).
        try {
            StubList result = apiInstance.listTokens(limit, user, permissions, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#listTokens");
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
| **limit** | **Integer**| Limits the maximum number of returned tokens.    If not set the value of &#x60;1000&#x60; is used.    Maximum value is 1000000. | [optional] [default to 1000] |
| **user** | **String**| Filters the resulting set of tokens by user, who owns the token. | [optional] |
| **permissions** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: &#x60;permissions&#x3D;scope1&amp;permissions&#x3D;scope2&#x60;. The token must have *all* the specified scopes. | [optional] [enum: ActiveGateCertManagement, AdvancedSyntheticIntegration, AppMonIntegration, CaptureRequestData, DTAQLAccess, DataExport, DataImport, DataPrivacy, Davis, DiagnosticExport, DssFileManagement, ExternalSyntheticIntegration, InstallerDownload, LogExport, MemoryDump, Mobile, PluginUpload, ReadConfig, ReadSyntheticData, RestRequestForwarding, RumBrowserExtension, RumJavaScriptTagManagement, SupportAlert, TenantTokenManagement, UserSessionAnonymization, ViewDashboard, ViewReport, WriteConfig, WriteSyntheticData, activeGateTokenManagement.create, activeGateTokenManagement.read, activeGateTokenManagement.write, activeGates.read, activeGates.write, apiTokens.read, apiTokens.write, auditLogs.read, credentialVault.read, credentialVault.write, entities.read, entities.write, events.ingest, events.read, extensionConfigurations.read, extensionConfigurations.write, extensionEnvironment.read, extensionEnvironment.write, extensions.read, extensions.write, geographicRegions.read, hub.read, hub.write, logs.ingest, logs.read, metrics.ingest, metrics.read, metrics.write, networkZones.read, networkZones.write, oneAgents.read, oneAgents.write, openTelemetryTrace.ingest, problems.read, problems.write, releases.read, securityProblems.read, securityProblems.write, settings.read, settings.write, slo.read, slo.write, syntheticExecutions.read, syntheticExecutions.write, syntheticLocations.read, syntheticLocations.write, tenantTokenRotation.write, traces.lookup] |
| **from** | **Long**| Last used after this timestamp (UTC milliseconds). | [optional] |
| **to** | **Long**| Last used before this timestamp (UTC milliseconds). | [optional] |

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

## listTokensWithHttpInfo

> ApiResponse<StubList> listTokens listTokensWithHttpInfo(limit, user, permissions, from, to)

Lists available tokens in your environment

You can narrow down the output by adding parameters. The token has to match *all* the specified parameters.    You can also specify the limit of returned tokens.   **This list may contain tokens which were created automatically** (e.g. InstallerDownload, Mobile, ...) and are not visible on the &#x60;Settings&#x60; page. Deleting those might have unintended side-effects as they might still be in use.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        Integer limit = 1000; // Integer | Limits the maximum number of returned tokens.    If not set the value of `1000` is used.    Maximum value is 1000000.
        String user = "user_example"; // String | Filters the resulting set of tokens by user, who owns the token.
        Set<String> permissions = Arrays.asList(); // Set<String> | Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: `permissions=scope1&permissions=scope2`. The token must have *all* the specified scopes.
        Long from = 56L; // Long | Last used after this timestamp (UTC milliseconds).
        Long to = 56L; // Long | Last used before this timestamp (UTC milliseconds).
        try {
            ApiResponse<StubList> response = apiInstance.listTokensWithHttpInfo(limit, user, permissions, from, to);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#listTokens");
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
| **limit** | **Integer**| Limits the maximum number of returned tokens.    If not set the value of &#x60;1000&#x60; is used.    Maximum value is 1000000. | [optional] [default to 1000] |
| **user** | **String**| Filters the resulting set of tokens by user, who owns the token. | [optional] |
| **permissions** | [**Set&lt;String&gt;**](String.md)| Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: &#x60;permissions&#x3D;scope1&amp;permissions&#x3D;scope2&#x60;. The token must have *all* the specified scopes. | [optional] [enum: ActiveGateCertManagement, AdvancedSyntheticIntegration, AppMonIntegration, CaptureRequestData, DTAQLAccess, DataExport, DataImport, DataPrivacy, Davis, DiagnosticExport, DssFileManagement, ExternalSyntheticIntegration, InstallerDownload, LogExport, MemoryDump, Mobile, PluginUpload, ReadConfig, ReadSyntheticData, RestRequestForwarding, RumBrowserExtension, RumJavaScriptTagManagement, SupportAlert, TenantTokenManagement, UserSessionAnonymization, ViewDashboard, ViewReport, WriteConfig, WriteSyntheticData, activeGateTokenManagement.create, activeGateTokenManagement.read, activeGateTokenManagement.write, activeGates.read, activeGates.write, apiTokens.read, apiTokens.write, auditLogs.read, credentialVault.read, credentialVault.write, entities.read, entities.write, events.ingest, events.read, extensionConfigurations.read, extensionConfigurations.write, extensionEnvironment.read, extensionEnvironment.write, extensions.read, extensions.write, geographicRegions.read, hub.read, hub.write, logs.ingest, logs.read, metrics.ingest, metrics.read, metrics.write, networkZones.read, networkZones.write, oneAgents.read, oneAgents.write, openTelemetryTrace.ingest, problems.read, problems.write, releases.read, securityProblems.read, securityProblems.write, settings.read, settings.write, slo.read, slo.write, syntheticExecutions.read, syntheticExecutions.write, syntheticLocations.read, syntheticLocations.write, tenantTokenRotation.write, traces.lookup] |
| **from** | **Long**| Last used after this timestamp (UTC milliseconds). | [optional] |
| **to** | **Long**| Last used before this timestamp (UTC milliseconds). | [optional] |

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


## updateToken

> void updateToken(id, updateToken)

Updates the specified token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be updated.    You can't update the token you're using for authentication of the request.
        UpdateToken updateToken = new UpdateToken(); // UpdateToken | The JSON body of the request. Contains updated parameters of the token.
        try {
            apiInstance.updateToken(id, updateToken);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#updateToken");
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
| **id** | **String**| The ID of the token to be updated.    You can&#39;t update the token you&#39;re using for authentication of the request. | |
| **updateToken** | [**UpdateToken**](UpdateToken.md)| The JSON body of the request. Contains updated parameters of the token. | |

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
| **204** | Success. The token has been updated. |  -  |
| **400** | Failed. You can&#39;t update the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested token has not been found. |  -  |

## updateTokenWithHttpInfo

> ApiResponse<Void> updateToken updateTokenWithHttpInfo(id, updateToken)

Updates the specified token

### Example

```java
// Import classes:
import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Configuration;
import com.dynatrace.apis.envv1.auth.*;
import com.dynatrace.apis.envv1.models.*;
import com.dynatrace.apis.envv1.api.TokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        TokensApi apiInstance = new TokensApi(defaultClient);
        String id = "id_example"; // String | The ID of the token to be updated.    You can't update the token you're using for authentication of the request.
        UpdateToken updateToken = new UpdateToken(); // UpdateToken | The JSON body of the request. Contains updated parameters of the token.
        try {
            ApiResponse<Void> response = apiInstance.updateTokenWithHttpInfo(id, updateToken);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling TokensApi#updateToken");
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
| **id** | **String**| The ID of the token to be updated.    You can&#39;t update the token you&#39;re using for authentication of the request. | |
| **updateToken** | [**UpdateToken**](UpdateToken.md)| The JSON body of the request. Contains updated parameters of the token. | |

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
| **204** | Success. The token has been updated. |  -  |
| **400** | Failed. You can&#39;t update the token you&#39;re using for authentication of the request. |  -  |
| **404** | Failed. The requested token has not been found. |  -  |

