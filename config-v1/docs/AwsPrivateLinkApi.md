# AwsPrivateLinkApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/config/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllAllowlistedAccounts**](AwsPrivateLinkApi.md#getAllAllowlistedAccounts) | **GET** /aws/privateLink/allowlistedAccounts | Gets the information about all allowlisted accounts in AWS PrivateLink |
| [**getAllAllowlistedAccountsWithHttpInfo**](AwsPrivateLinkApi.md#getAllAllowlistedAccountsWithHttpInfo) | **GET** /aws/privateLink/allowlistedAccounts | Gets the information about all allowlisted accounts in AWS PrivateLink |
| [**getPrivateLinkConfig**](AwsPrivateLinkApi.md#getPrivateLinkConfig) | **GET** /aws/privateLink | Gets the configuration information about AWS PrivateLink |
| [**getPrivateLinkConfigWithHttpInfo**](AwsPrivateLinkApi.md#getPrivateLinkConfigWithHttpInfo) | **GET** /aws/privateLink | Gets the configuration information about AWS PrivateLink |
| [**putAllowlistedAccount**](AwsPrivateLinkApi.md#putAllowlistedAccount) | **PUT** /aws/privateLink/allowlistedAccounts/{id} | Updates the given AWS account id in the allowlist in AWS PrivateLink |
| [**putAllowlistedAccountWithHttpInfo**](AwsPrivateLinkApi.md#putAllowlistedAccountWithHttpInfo) | **PUT** /aws/privateLink/allowlistedAccounts/{id} | Updates the given AWS account id in the allowlist in AWS PrivateLink |
| [**putPrivateLinkConfig**](AwsPrivateLinkApi.md#putPrivateLinkConfig) | **PUT** /aws/privateLink | Updates the configuration information about AWS PrivateLink |
| [**putPrivateLinkConfigWithHttpInfo**](AwsPrivateLinkApi.md#putPrivateLinkConfigWithHttpInfo) | **PUT** /aws/privateLink | Updates the configuration information about AWS PrivateLink |
| [**removeAllowlistedAccount**](AwsPrivateLinkApi.md#removeAllowlistedAccount) | **DELETE** /aws/privateLink/allowlistedAccounts/{id} | Removes one AWS account from the allowlist in AWS PrivateLink |
| [**removeAllowlistedAccountWithHttpInfo**](AwsPrivateLinkApi.md#removeAllowlistedAccountWithHttpInfo) | **DELETE** /aws/privateLink/allowlistedAccounts/{id} | Removes one AWS account from the allowlist in AWS PrivateLink |



## getAllAllowlistedAccounts

> AllowlistedAwsAccountList getAllAllowlistedAccounts()

Gets the information about all allowlisted accounts in AWS PrivateLink

Lists the account ids of all allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        try {
            AllowlistedAwsAccountList result = apiInstance.getAllAllowlistedAccounts();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#getAllAllowlistedAccounts");
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

[**AllowlistedAwsAccountList**](AllowlistedAwsAccountList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The list is provided in the response body. |  -  |

## getAllAllowlistedAccountsWithHttpInfo

> ApiResponse<AllowlistedAwsAccountList> getAllAllowlistedAccounts getAllAllowlistedAccountsWithHttpInfo()

Gets the information about all allowlisted accounts in AWS PrivateLink

Lists the account ids of all allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        try {
            ApiResponse<AllowlistedAwsAccountList> response = apiInstance.getAllAllowlistedAccountsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#getAllAllowlistedAccounts");
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

ApiResponse<[**AllowlistedAwsAccountList**](AllowlistedAwsAccountList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The list is provided in the response body. |  -  |


## getPrivateLinkConfig

> AwsPrivateLinkConfig getPrivateLinkConfig()

Gets the configuration information about AWS PrivateLink

Gets all configuration settings for AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        try {
            AwsPrivateLinkConfig result = apiInstance.getPrivateLinkConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#getPrivateLinkConfig");
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

[**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The result is provided in the response body. |  -  |

## getPrivateLinkConfigWithHttpInfo

> ApiResponse<AwsPrivateLinkConfig> getPrivateLinkConfig getPrivateLinkConfigWithHttpInfo()

Gets the configuration information about AWS PrivateLink

Gets all configuration settings for AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        try {
            ApiResponse<AwsPrivateLinkConfig> response = apiInstance.getPrivateLinkConfigWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#getPrivateLinkConfig");
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

ApiResponse<[**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The result is provided in the response body. |  -  |


## putAllowlistedAccount

> AllowlistedAwsAccount putAllowlistedAccount(id, allowlistedAwsAccount)

Updates the given AWS account id in the allowlist in AWS PrivateLink

Updates the given AWS account id in the allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        String id = "id_example"; // String | The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the provided payload.
        AllowlistedAwsAccount allowlistedAwsAccount = new AllowlistedAwsAccount(); // AllowlistedAwsAccount | The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the path.
        try {
            AllowlistedAwsAccount result = apiInstance.putAllowlistedAccount(id, allowlistedAwsAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#putAllowlistedAccount");
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
| **id** | **String**| The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the provided payload. | |
| **allowlistedAwsAccount** | [**AllowlistedAwsAccount**](AllowlistedAwsAccount.md)| The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the path. | |

### Return type

[**AllowlistedAwsAccount**](AllowlistedAwsAccount.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The account id has been added to the PrivateLink allowlist. |  -  |
| **204** | Success. The account id already exists in the PrivateLink allowlist. |  -  |
| **400** | Error. Wrong format of the provided AWS account id (length &#x3D; 12 characters, only digits). |  -  |

## putAllowlistedAccountWithHttpInfo

> ApiResponse<AllowlistedAwsAccount> putAllowlistedAccount putAllowlistedAccountWithHttpInfo(id, allowlistedAwsAccount)

Updates the given AWS account id in the allowlist in AWS PrivateLink

Updates the given AWS account id in the allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        String id = "id_example"; // String | The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the provided payload.
        AllowlistedAwsAccount allowlistedAwsAccount = new AllowlistedAwsAccount(); // AllowlistedAwsAccount | The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the path.
        try {
            ApiResponse<AllowlistedAwsAccount> response = apiInstance.putAllowlistedAccountWithHttpInfo(id, allowlistedAwsAccount);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#putAllowlistedAccount");
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
| **id** | **String**| The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the provided payload. | |
| **allowlistedAwsAccount** | [**AllowlistedAwsAccount**](AllowlistedAwsAccount.md)| The AWS account id to be updated in the AWS PrivateLink allowlist, has to match the id in the path. | |

### Return type

ApiResponse<[**AllowlistedAwsAccount**](AllowlistedAwsAccount.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The account id has been added to the PrivateLink allowlist. |  -  |
| **204** | Success. The account id already exists in the PrivateLink allowlist. |  -  |
| **400** | Error. Wrong format of the provided AWS account id (length &#x3D; 12 characters, only digits). |  -  |


## putPrivateLinkConfig

> AwsPrivateLinkConfig putPrivateLinkConfig(awsPrivateLinkConfig)

Updates the configuration information about AWS PrivateLink

Updates the configuration settings for AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        AwsPrivateLinkConfig awsPrivateLinkConfig = new AwsPrivateLinkConfig(); // AwsPrivateLinkConfig | The AWS PrivateLink configuration.
        try {
            AwsPrivateLinkConfig result = apiInstance.putPrivateLinkConfig(awsPrivateLinkConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#putPrivateLinkConfig");
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
| **awsPrivateLinkConfig** | [**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)| The AWS PrivateLink configuration. | |

### Return type

[**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The configuration settings have been updated. |  -  |

## putPrivateLinkConfigWithHttpInfo

> ApiResponse<AwsPrivateLinkConfig> putPrivateLinkConfig putPrivateLinkConfigWithHttpInfo(awsPrivateLinkConfig)

Updates the configuration information about AWS PrivateLink

Updates the configuration settings for AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        AwsPrivateLinkConfig awsPrivateLinkConfig = new AwsPrivateLinkConfig(); // AwsPrivateLinkConfig | The AWS PrivateLink configuration.
        try {
            ApiResponse<AwsPrivateLinkConfig> response = apiInstance.putPrivateLinkConfigWithHttpInfo(awsPrivateLinkConfig);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#putPrivateLinkConfig");
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
| **awsPrivateLinkConfig** | [**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)| The AWS PrivateLink configuration. | |

### Return type

ApiResponse<[**AwsPrivateLinkConfig**](AwsPrivateLinkConfig.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. The configuration settings have been updated. |  -  |


## removeAllowlistedAccount

> void removeAllowlistedAccount(id)

Removes one AWS account from the allowlist in AWS PrivateLink

Removes the given AWS account id from the allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        String id = "id_example"; // String | The AWS account id to be deleted from the AWS PrivateLink allowlist
        try {
            apiInstance.removeAllowlistedAccount(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#removeAllowlistedAccount");
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
| **id** | **String**| The AWS account id to be deleted from the AWS PrivateLink allowlist | |

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
| **204** | Success. The account id has been removed from the PrivateLink allowlist. |  -  |
| **400** | Error. Wrong format of the provided AWS account id (length &#x3D; 12 characters, only digits). |  -  |

## removeAllowlistedAccountWithHttpInfo

> ApiResponse<Void> removeAllowlistedAccount removeAllowlistedAccountWithHttpInfo(id)

Removes one AWS account from the allowlist in AWS PrivateLink

Removes the given AWS account id from the allowlisted accounts in AWS PrivateLink for this tenant

### Example

```java
// Import classes:
import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Configuration;
import com.dynatrace.apis.configv1.auth.*;
import com.dynatrace.apis.configv1.models.*;
import com.dynatrace.apis.configv1.api.AwsPrivateLinkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/config/v1");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        AwsPrivateLinkApi apiInstance = new AwsPrivateLinkApi(defaultClient);
        String id = "id_example"; // String | The AWS account id to be deleted from the AWS PrivateLink allowlist
        try {
            ApiResponse<Void> response = apiInstance.removeAllowlistedAccountWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsPrivateLinkApi#removeAllowlistedAccount");
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
| **id** | **String**| The AWS account id to be deleted from the AWS PrivateLink allowlist | |

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
| **204** | Success. The account id has been removed from the PrivateLink allowlist. |  -  |
| **400** | Error. Wrong format of the provided AWS account id (length &#x3D; 12 characters, only digits). |  -  |

