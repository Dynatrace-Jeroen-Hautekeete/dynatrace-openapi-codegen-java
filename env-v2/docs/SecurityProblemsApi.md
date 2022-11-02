# SecurityProblemsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRemediationItems**](SecurityProblemsApi.md#getRemediationItems) | **GET** /securityProblems/{id}/remediationItems | Lists remediation items of a third-party security problem | maturity&#x3D;EARLY_ADOPTER |
| [**getRemediationItemsWithHttpInfo**](SecurityProblemsApi.md#getRemediationItemsWithHttpInfo) | **GET** /securityProblems/{id}/remediationItems | Lists remediation items of a third-party security problem | maturity&#x3D;EARLY_ADOPTER |
| [**getSecurityProblem**](SecurityProblemsApi.md#getSecurityProblem) | **GET** /securityProblems/{id} | Gets parameters of a security problem | maturity&#x3D;EARLY_ADOPTER |
| [**getSecurityProblemWithHttpInfo**](SecurityProblemsApi.md#getSecurityProblemWithHttpInfo) | **GET** /securityProblems/{id} | Gets parameters of a security problem | maturity&#x3D;EARLY_ADOPTER |
| [**getSecurityProblems**](SecurityProblemsApi.md#getSecurityProblems) | **GET** /securityProblems | Lists all security problems | maturity&#x3D;EARLY_ADOPTER |
| [**getSecurityProblemsWithHttpInfo**](SecurityProblemsApi.md#getSecurityProblemsWithHttpInfo) | **GET** /securityProblems | Lists all security problems | maturity&#x3D;EARLY_ADOPTER |
| [**getVulnerableFunctions**](SecurityProblemsApi.md#getVulnerableFunctions) | **GET** /securityProblems/{id}/vulnerableFunctions | Lists all vulnerable functions and their usage for a third-party security problem | maturity&#x3D;EARLY_ADOPTER |
| [**getVulnerableFunctionsWithHttpInfo**](SecurityProblemsApi.md#getVulnerableFunctionsWithHttpInfo) | **GET** /securityProblems/{id}/vulnerableFunctions | Lists all vulnerable functions and their usage for a third-party security problem | maturity&#x3D;EARLY_ADOPTER |
| [**muteSecurityProblem**](SecurityProblemsApi.md#muteSecurityProblem) | **POST** /securityProblems/{id}/mute | Mutes a security problem | maturity&#x3D;EARLY_ADOPTER |
| [**muteSecurityProblemWithHttpInfo**](SecurityProblemsApi.md#muteSecurityProblemWithHttpInfo) | **POST** /securityProblems/{id}/mute | Mutes a security problem | maturity&#x3D;EARLY_ADOPTER |
| [**setRemediationItemMuteState**](SecurityProblemsApi.md#setRemediationItemMuteState) | **PUT** /securityProblems/{id}/remediationItems/{itemId}/muteState | Sets the mute state of a remediation item | maturity&#x3D;EARLY_ADOPTER |
| [**setRemediationItemMuteStateWithHttpInfo**](SecurityProblemsApi.md#setRemediationItemMuteStateWithHttpInfo) | **PUT** /securityProblems/{id}/remediationItems/{itemId}/muteState | Sets the mute state of a remediation item | maturity&#x3D;EARLY_ADOPTER |
| [**unmuteSecurityProblem**](SecurityProblemsApi.md#unmuteSecurityProblem) | **POST** /securityProblems/{id}/unmute | Un-mutes a security problem | maturity&#x3D;EARLY_ADOPTER |
| [**unmuteSecurityProblemWithHttpInfo**](SecurityProblemsApi.md#unmuteSecurityProblemWithHttpInfo) | **POST** /securityProblems/{id}/unmute | Un-mutes a security problem | maturity&#x3D;EARLY_ADOPTER |



## getRemediationItems

> RemediationItemList getRemediationItems(id, remediationItemSelector)

Lists remediation items of a third-party security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String remediationItemSelector = "remediationItemSelector_example"; // String | Defines the scope of the query. Only remediable entities matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the `EQUALS` operator is used unless otherwise specified.  * Vulnerability state: `vulnerabilityState(\"value\")`. Find the possible values in the description of the **vulnerabilityState** field of the response. If not set, all entities are returned. * Muted: `muted(\"value\")`. Possible values are `TRUE` or `FALSE`. * Reachable data asset assessment: `assessment.dataAssets(\"value\")` Possible values are `REACHABLE`, and `NOT_DETECTED`. * Network exposure assessment: `assessment.exposure(\"value\")` Possible values are `PUBLIC_NETWORK`, and `NOT_DETECTED`. * Vulnerable function usage assessment: `assessment.vulnerableFunctionUsage(\"value\")` Possible values are `IN_USE`, and `NOT_IN_USE`. * Vulnerable function in use contains: `assessment.vulnerableFunctionInUseContains(\"value\")`. Possible values are `class::function`, `class::` and `function`. The `CONTAINS` operator is used. Only vulnerable functions in use are considered. * Assessment accuracy: `assessment.accuracy(\"value\")` Possible values are `FULL` and `REDUCED`. * Entity name contains: `entityNameContains(\"value-1\")`. The `CONTAINS` operator is used.  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        try {
            RemediationItemList result = apiInstance.getRemediationItems(id, remediationItemSelector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getRemediationItems");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **remediationItemSelector** | **String**| Defines the scope of the query. Only remediable entities matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Vulnerability state: &#x60;vulnerabilityState(\&quot;value\&quot;)&#x60;. Find the possible values in the description of the **vulnerabilityState** field of the response. If not set, all entities are returned. * Muted: &#x60;muted(\&quot;value\&quot;)&#x60;. Possible values are &#x60;TRUE&#x60; or &#x60;FALSE&#x60;. * Reachable data asset assessment: &#x60;assessment.dataAssets(\&quot;value\&quot;)&#x60; Possible values are &#x60;REACHABLE&#x60;, and &#x60;NOT_DETECTED&#x60;. * Network exposure assessment: &#x60;assessment.exposure(\&quot;value\&quot;)&#x60; Possible values are &#x60;PUBLIC_NETWORK&#x60;, and &#x60;NOT_DETECTED&#x60;. * Vulnerable function usage assessment: &#x60;assessment.vulnerableFunctionUsage(\&quot;value\&quot;)&#x60; Possible values are &#x60;IN_USE&#x60;, and &#x60;NOT_IN_USE&#x60;. * Vulnerable function in use contains: &#x60;assessment.vulnerableFunctionInUseContains(\&quot;value\&quot;)&#x60;. Possible values are &#x60;class::function&#x60;, &#x60;class::&#x60; and &#x60;function&#x60;. The &#x60;CONTAINS&#x60; operator is used. Only vulnerable functions in use are considered. * Assessment accuracy: &#x60;assessment.accuracy(\&quot;value\&quot;)&#x60; Possible values are &#x60;FULL&#x60; and &#x60;REDUCED&#x60;. * Entity name contains: &#x60;entityNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used.  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |

### Return type

[**RemediationItemList**](RemediationItemList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of remediation items of a problem. |  -  |

## getRemediationItemsWithHttpInfo

> ApiResponse<RemediationItemList> getRemediationItems getRemediationItemsWithHttpInfo(id, remediationItemSelector)

Lists remediation items of a third-party security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String remediationItemSelector = "remediationItemSelector_example"; // String | Defines the scope of the query. Only remediable entities matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the `EQUALS` operator is used unless otherwise specified.  * Vulnerability state: `vulnerabilityState(\"value\")`. Find the possible values in the description of the **vulnerabilityState** field of the response. If not set, all entities are returned. * Muted: `muted(\"value\")`. Possible values are `TRUE` or `FALSE`. * Reachable data asset assessment: `assessment.dataAssets(\"value\")` Possible values are `REACHABLE`, and `NOT_DETECTED`. * Network exposure assessment: `assessment.exposure(\"value\")` Possible values are `PUBLIC_NETWORK`, and `NOT_DETECTED`. * Vulnerable function usage assessment: `assessment.vulnerableFunctionUsage(\"value\")` Possible values are `IN_USE`, and `NOT_IN_USE`. * Vulnerable function in use contains: `assessment.vulnerableFunctionInUseContains(\"value\")`. Possible values are `class::function`, `class::` and `function`. The `CONTAINS` operator is used. Only vulnerable functions in use are considered. * Assessment accuracy: `assessment.accuracy(\"value\")` Possible values are `FULL` and `REDUCED`. * Entity name contains: `entityNameContains(\"value-1\")`. The `CONTAINS` operator is used.  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        try {
            ApiResponse<RemediationItemList> response = apiInstance.getRemediationItemsWithHttpInfo(id, remediationItemSelector);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getRemediationItems");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **remediationItemSelector** | **String**| Defines the scope of the query. Only remediable entities matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Vulnerability state: &#x60;vulnerabilityState(\&quot;value\&quot;)&#x60;. Find the possible values in the description of the **vulnerabilityState** field of the response. If not set, all entities are returned. * Muted: &#x60;muted(\&quot;value\&quot;)&#x60;. Possible values are &#x60;TRUE&#x60; or &#x60;FALSE&#x60;. * Reachable data asset assessment: &#x60;assessment.dataAssets(\&quot;value\&quot;)&#x60; Possible values are &#x60;REACHABLE&#x60;, and &#x60;NOT_DETECTED&#x60;. * Network exposure assessment: &#x60;assessment.exposure(\&quot;value\&quot;)&#x60; Possible values are &#x60;PUBLIC_NETWORK&#x60;, and &#x60;NOT_DETECTED&#x60;. * Vulnerable function usage assessment: &#x60;assessment.vulnerableFunctionUsage(\&quot;value\&quot;)&#x60; Possible values are &#x60;IN_USE&#x60;, and &#x60;NOT_IN_USE&#x60;. * Vulnerable function in use contains: &#x60;assessment.vulnerableFunctionInUseContains(\&quot;value\&quot;)&#x60;. Possible values are &#x60;class::function&#x60;, &#x60;class::&#x60; and &#x60;function&#x60;. The &#x60;CONTAINS&#x60; operator is used. Only vulnerable functions in use are considered. * Assessment accuracy: &#x60;assessment.accuracy(\&quot;value\&quot;)&#x60; Possible values are &#x60;FULL&#x60; and &#x60;REDUCED&#x60;. * Entity name contains: &#x60;entityNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used.  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |

### Return type

ApiResponse<[**RemediationItemList**](RemediationItemList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of remediation items of a problem. |  -  |


## getSecurityProblem

> SecurityProblemDetails getSecurityProblem(id, fields, from)

Gets parameters of a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        String fields = "fields_example"; // String | A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can't remove them from the response):  * `riskAssessment`: A risk assessment of the security problem. * `managementZones`: The management zone where the security problem occurred. * `codeLevelVulnerabilityDetails`: Details of the code-level vulnerability. * `description`: The description of the vulnerability. * `events`: The security problem's last 10 events within the last 365 days, sorted from newest to oldest. * `vulnerableComponents`: A list of vulnerable components of the security problem within the provided filter range.  * `affectedEntities`: A list of affected entities of the security problem within the provided filter range.  * `exposedEntities`: A list of exposed entities of the security problem within the provided filter range.  * `reachableDataAssets`: A list of data assets reachable by affected entities of the security problem within the provided filter range.  * `relatedEntities`: A list of related entities of the security problem within the provided filter range.  * `relatedContainerImages`: A list of related container images of the security problem within the provided filter range.  * `relatedAttacks`: A list of attacks detected on the exposed security problem.   To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, `+riskAssessment,+managementZones`). 
        String from = "from_example"; // String | Based on the timeframe start the affected-, related- and vulnerable entities are being calculated. You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the default timeframe start of 24 hours in the past is used (`now-24h`).  The timeframe start must not be older than 365 days.
        try {
            SecurityProblemDetails result = apiInstance.getSecurityProblem(id, fields, from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **fields** | **String**| A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can&#39;t remove them from the response):  * &#x60;riskAssessment&#x60;: A risk assessment of the security problem. * &#x60;managementZones&#x60;: The management zone where the security problem occurred. * &#x60;codeLevelVulnerabilityDetails&#x60;: Details of the code-level vulnerability. * &#x60;description&#x60;: The description of the vulnerability. * &#x60;events&#x60;: The security problem&#39;s last 10 events within the last 365 days, sorted from newest to oldest. * &#x60;vulnerableComponents&#x60;: A list of vulnerable components of the security problem within the provided filter range.  * &#x60;affectedEntities&#x60;: A list of affected entities of the security problem within the provided filter range.  * &#x60;exposedEntities&#x60;: A list of exposed entities of the security problem within the provided filter range.  * &#x60;reachableDataAssets&#x60;: A list of data assets reachable by affected entities of the security problem within the provided filter range.  * &#x60;relatedEntities&#x60;: A list of related entities of the security problem within the provided filter range.  * &#x60;relatedContainerImages&#x60;: A list of related container images of the security problem within the provided filter range.  * &#x60;relatedAttacks&#x60;: A list of attacks detected on the exposed security problem.   To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, &#x60;+riskAssessment,+managementZones&#x60;).  | [optional] |
| **from** | **String**| Based on the timeframe start the affected-, related- and vulnerable entities are being calculated. You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the default timeframe start of 24 hours in the past is used (&#x60;now-24h&#x60;).  The timeframe start must not be older than 365 days. | [optional] |

### Return type

[**SecurityProblemDetails**](SecurityProblemDetails.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains parameters of the security problem. |  -  |

## getSecurityProblemWithHttpInfo

> ApiResponse<SecurityProblemDetails> getSecurityProblem getSecurityProblemWithHttpInfo(id, fields, from)

Gets parameters of a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        String fields = "fields_example"; // String | A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can't remove them from the response):  * `riskAssessment`: A risk assessment of the security problem. * `managementZones`: The management zone where the security problem occurred. * `codeLevelVulnerabilityDetails`: Details of the code-level vulnerability. * `description`: The description of the vulnerability. * `events`: The security problem's last 10 events within the last 365 days, sorted from newest to oldest. * `vulnerableComponents`: A list of vulnerable components of the security problem within the provided filter range.  * `affectedEntities`: A list of affected entities of the security problem within the provided filter range.  * `exposedEntities`: A list of exposed entities of the security problem within the provided filter range.  * `reachableDataAssets`: A list of data assets reachable by affected entities of the security problem within the provided filter range.  * `relatedEntities`: A list of related entities of the security problem within the provided filter range.  * `relatedContainerImages`: A list of related container images of the security problem within the provided filter range.  * `relatedAttacks`: A list of attacks detected on the exposed security problem.   To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, `+riskAssessment,+managementZones`). 
        String from = "from_example"; // String | Based on the timeframe start the affected-, related- and vulnerable entities are being calculated. You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the default timeframe start of 24 hours in the past is used (`now-24h`).  The timeframe start must not be older than 365 days.
        try {
            ApiResponse<SecurityProblemDetails> response = apiInstance.getSecurityProblemWithHttpInfo(id, fields, from);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **fields** | **String**| A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can&#39;t remove them from the response):  * &#x60;riskAssessment&#x60;: A risk assessment of the security problem. * &#x60;managementZones&#x60;: The management zone where the security problem occurred. * &#x60;codeLevelVulnerabilityDetails&#x60;: Details of the code-level vulnerability. * &#x60;description&#x60;: The description of the vulnerability. * &#x60;events&#x60;: The security problem&#39;s last 10 events within the last 365 days, sorted from newest to oldest. * &#x60;vulnerableComponents&#x60;: A list of vulnerable components of the security problem within the provided filter range.  * &#x60;affectedEntities&#x60;: A list of affected entities of the security problem within the provided filter range.  * &#x60;exposedEntities&#x60;: A list of exposed entities of the security problem within the provided filter range.  * &#x60;reachableDataAssets&#x60;: A list of data assets reachable by affected entities of the security problem within the provided filter range.  * &#x60;relatedEntities&#x60;: A list of related entities of the security problem within the provided filter range.  * &#x60;relatedContainerImages&#x60;: A list of related container images of the security problem within the provided filter range.  * &#x60;relatedAttacks&#x60;: A list of attacks detected on the exposed security problem.   To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, &#x60;+riskAssessment,+managementZones&#x60;).  | [optional] |
| **from** | **String**| Based on the timeframe start the affected-, related- and vulnerable entities are being calculated. You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the default timeframe start of 24 hours in the past is used (&#x60;now-24h&#x60;).  The timeframe start must not be older than 365 days. | [optional] |

### Return type

ApiResponse<[**SecurityProblemDetails**](SecurityProblemDetails.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains parameters of the security problem. |  -  |


## getSecurityProblems

> SecurityProblemList getSecurityProblems(nextPageKey, pageSize, securityProblemSelector, sort, fields, from, to)

Lists all security problems | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of security problems in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        String securityProblemSelector = "securityProblemSelector_example"; // String | Defines the scope of the query. Only security problems matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the `EQUALS` operator is used unless otherwise specified.  * Status: `status(\"value\")`. Find the possible values in the description of the **status** field of the response. If not set, all security problems are returned. * Muted: `muted(\"value\")`. Possible values are `TRUE` or `FALSE`. * Risk level: `riskLevel(\"value\")`. The Davis risk level. Find the possible values in the description of the **riskLevel** field of the response. * Minimum risk score: `minRiskScore(\"5.5\")`. The Davis minimum risk score. The `GREATER THAN OR EQUAL TO` operator is used. Specify a number between `1.0` and `10.0`. * Maximum risk score: `maxRiskScore(\"5.5\")`. The Davis maximum risk score. The `LESS THAN` operator is used. Specify a number between `1.0` and `10.0`. * Base risk level: `baseRiskLevel(\"value\")`. The Base risk level from the CVSS. Find the possible values in the description of the **riskLevel** field of the response. * Minimum base risk score: `minBaseRiskScore(\"5.5\")`. The minimum base risk score from the CVSS. The `GREATER THAN OR EQUAL TO` operator is used. Specify a number between `1.0` and `10.0`. * Maximum base risk score: `maxBaseRiskScore(\"5.5\")`. The maximum base risk score from the CVSS. The `LESS THAN` operator is used. Specify a number between `1.0` and `10.0`. * External vulnerability ID contains: `externalVulnerabilityIdContains(\"id-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * External vulnerability ID: `externalVulnerabilityId(\"id-1\",\"id-2\")`.  * CVE ID: `cveId(\"id\")`. * Risk assessment `riskAssessment(\"value-1\",\"value-2\")` Possible values are `EXPOSED`, `SENSITIVE`, `EXPLOIT`, `VULNERABLE_FUNCTION_IN_USE` and `ACCURACY_REDUCED`. * Related host ID: `relatedHostIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related host name: `relatedHostNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related host name contains: `relatedHostNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Related Kubernetes cluster ID: `relatedKubernetesClusterIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related Kubernetes cluster name: `relatedKubernetesClusterNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related Kubernetes cluster name contains: `relatedKubernetesClusterNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Related Kubernetes workload ID: `relatedKubernetesWorkloadIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related Kubernetes workload name: `relatedKubernetesWorkloadNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related Kubernetes workload name contains: `relatedKubernetesWorkloadNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Management zone ID: `managementZoneIds(\"mzId-1\",\"mzId-2\")`. * Management zone name: `managementZones(\"name-1\",\"name-2\")`. Values are case-sensitive. * Affected process group ID: `affectedPgIds(\"pgId-1\", \"pgId-2\")`. Specify Dynatrace entity IDs here. * Affected process group name: `affectedPgNames(\"name-1\", \"name-2\")`. Values are case-sensitive. * Affected process group name contains: `affectedPgNameContains(\"name-1\")`. The `CONTAINS` operator is used. * Vulnerable component ID: `vulnerableComponentIds(\"componentId-1\", \"componentId-2\")`. Specify component IDs here. * Vulnerable component name: `vulnerableComponentNames(\"name-1\", \"name-2\")`. Values are case-sensitive. * Vulnerable component name contains: `vulnerableComponentNameContains(\"name-1\")`. The `CONTAINS` operator is used. * Host tags: `hostTags(\"hostTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Process group tags: `pgTags(\"pgTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Process group instance tags: `pgiTags(\"pgiTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Tags: `tags(\"tag-1\")`. The `CONTAINS` operator is used. This selector picks hosts, process groups, and process group instances at the same time. Maximum value length is 48 characters. * Display ID: `displayIds(\"S-1234\",\"S-5678\")`. The `EQUALS` operator is used. * Technology: `technology(\"technology-1\",\"technology-2\")`. Find the possible values in the description of the **technology** field of the response. The `EQUALS` operator is used. * Vulnerability type: `vulnerabilityType(\"type-1\",\"type-2\")`. Possible values are `THIRD_PARTY`, `CODE_LEVEL`, `RUNTIME`.  Risk score and risk category are mutually exclusive (cannot be used at the same time).  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        String sort = "sort_example"; // String | Specifies one or more fields for sorting the security problem list. Multiple fields can be concatenated using a comma (`,`) as a separator (e.g. `+status,-timestamp`).  You can sort by the following properties with a sign prefix for the sorting order.   * `status`: The security problem status (`+` open first or `-` resolved first)  * `muted`: The security problem mute state (`+` unmuted first or `-` muted first)  * `technology`: The security problem technology  * `firstSeenTimestamp`: The timestamp of the first occurrence of the security problem (`+` new problems first or `-` old problems first)  * `lastUpdatedTimestamp`: The timestamp of the last update of the security problem (`+` recently updated problems first or `-`  earlier updated problems first) * `securityProblemId`: The auto-generated ID of the security problem (`+` lower number first or `-` higher number first)  * `externalVulnerabilityId`: The ID of the external vulnerability (`+` lower number first or `-` higher number first)  * `displayId`: The display ID (`+` lower number first or `-` higher number first)  * `riskAssessment.riskScore`: The Davis security score (`+` lower score first or `-` higher score first)  * `riskAssessment.riskLevel`: The Davis security level (`+` lower level first or `-` higher level first)  * `riskAssessment.exposure`: Whether the problem is exposed to the internet  * `riskAssessment.dataAssets`: Whether data assets are affected  * `riskAssessment.vulnerableFunctionUsage`: Whether vulnerable functions are used  * `riskAssessment.assessmentAccuracy`: The assessments accuracy (`+` less accuracy first or `-` more accuracy first)   If no prefix is set, `+` is used.
        String fields = "fields_example"; // String | A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can't remove them from the response):  * `riskAssessment`: A risk assessment of the security problem. * `managementZones`: The management zone where the security problem occurred. * `codeLevelVulnerabilityDetails`: Details of the code-level vulnerability.  To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, `+riskAssessment,+managementZones`). 
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of thirty days is used (`now-30d`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.  The end of the timeframe must not be older than 365 days.
        try {
            SecurityProblemList result = apiInstance.getSecurityProblems(nextPageKey, pageSize, securityProblemSelector, sort, fields, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getSecurityProblems");
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
| **pageSize** | **Long**| The amount of security problems in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |
| **securityProblemSelector** | **String**| Defines the scope of the query. Only security problems matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Status: &#x60;status(\&quot;value\&quot;)&#x60;. Find the possible values in the description of the **status** field of the response. If not set, all security problems are returned. * Muted: &#x60;muted(\&quot;value\&quot;)&#x60;. Possible values are &#x60;TRUE&#x60; or &#x60;FALSE&#x60;. * Risk level: &#x60;riskLevel(\&quot;value\&quot;)&#x60;. The Davis risk level. Find the possible values in the description of the **riskLevel** field of the response. * Minimum risk score: &#x60;minRiskScore(\&quot;5.5\&quot;)&#x60;. The Davis minimum risk score. The &#x60;GREATER THAN OR EQUAL TO&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Maximum risk score: &#x60;maxRiskScore(\&quot;5.5\&quot;)&#x60;. The Davis maximum risk score. The &#x60;LESS THAN&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Base risk level: &#x60;baseRiskLevel(\&quot;value\&quot;)&#x60;. The Base risk level from the CVSS. Find the possible values in the description of the **riskLevel** field of the response. * Minimum base risk score: &#x60;minBaseRiskScore(\&quot;5.5\&quot;)&#x60;. The minimum base risk score from the CVSS. The &#x60;GREATER THAN OR EQUAL TO&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Maximum base risk score: &#x60;maxBaseRiskScore(\&quot;5.5\&quot;)&#x60;. The maximum base risk score from the CVSS. The &#x60;LESS THAN&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * External vulnerability ID contains: &#x60;externalVulnerabilityIdContains(\&quot;id-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * External vulnerability ID: &#x60;externalVulnerabilityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;.  * CVE ID: &#x60;cveId(\&quot;id\&quot;)&#x60;. * Risk assessment &#x60;riskAssessment(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60; Possible values are &#x60;EXPOSED&#x60;, &#x60;SENSITIVE&#x60;, &#x60;EXPLOIT&#x60;, &#x60;VULNERABLE_FUNCTION_IN_USE&#x60; and &#x60;ACCURACY_REDUCED&#x60;. * Related host ID: &#x60;relatedHostIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related host name: &#x60;relatedHostNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related host name contains: &#x60;relatedHostNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Related Kubernetes cluster ID: &#x60;relatedKubernetesClusterIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related Kubernetes cluster name: &#x60;relatedKubernetesClusterNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related Kubernetes cluster name contains: &#x60;relatedKubernetesClusterNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Related Kubernetes workload ID: &#x60;relatedKubernetesWorkloadIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related Kubernetes workload name: &#x60;relatedKubernetesWorkloadNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related Kubernetes workload name contains: &#x60;relatedKubernetesWorkloadNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Management zone ID: &#x60;managementZoneIds(\&quot;mzId-1\&quot;,\&quot;mzId-2\&quot;)&#x60;. * Management zone name: &#x60;managementZones(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Affected process group ID: &#x60;affectedPgIds(\&quot;pgId-1\&quot;, \&quot;pgId-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Affected process group name: &#x60;affectedPgNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Affected process group name contains: &#x60;affectedPgNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Vulnerable component ID: &#x60;vulnerableComponentIds(\&quot;componentId-1\&quot;, \&quot;componentId-2\&quot;)&#x60;. Specify component IDs here. * Vulnerable component name: &#x60;vulnerableComponentNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Vulnerable component name contains: &#x60;vulnerableComponentNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Host tags: &#x60;hostTags(\&quot;hostTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Process group tags: &#x60;pgTags(\&quot;pgTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Process group instance tags: &#x60;pgiTags(\&quot;pgiTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Tags: &#x60;tags(\&quot;tag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. This selector picks hosts, process groups, and process group instances at the same time. Maximum value length is 48 characters. * Display ID: &#x60;displayIds(\&quot;S-1234\&quot;,\&quot;S-5678\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator is used. * Technology: &#x60;technology(\&quot;technology-1\&quot;,\&quot;technology-2\&quot;)&#x60;. Find the possible values in the description of the **technology** field of the response. The &#x60;EQUALS&#x60; operator is used. * Vulnerability type: &#x60;vulnerabilityType(\&quot;type-1\&quot;,\&quot;type-2\&quot;)&#x60;. Possible values are &#x60;THIRD_PARTY&#x60;, &#x60;CODE_LEVEL&#x60;, &#x60;RUNTIME&#x60;.  Risk score and risk category are mutually exclusive (cannot be used at the same time).  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **sort** | **String**| Specifies one or more fields for sorting the security problem list. Multiple fields can be concatenated using a comma (&#x60;,&#x60;) as a separator (e.g. &#x60;+status,-timestamp&#x60;).  You can sort by the following properties with a sign prefix for the sorting order.   * &#x60;status&#x60;: The security problem status (&#x60;+&#x60; open first or &#x60;-&#x60; resolved first)  * &#x60;muted&#x60;: The security problem mute state (&#x60;+&#x60; unmuted first or &#x60;-&#x60; muted first)  * &#x60;technology&#x60;: The security problem technology  * &#x60;firstSeenTimestamp&#x60;: The timestamp of the first occurrence of the security problem (&#x60;+&#x60; new problems first or &#x60;-&#x60; old problems first)  * &#x60;lastUpdatedTimestamp&#x60;: The timestamp of the last update of the security problem (&#x60;+&#x60; recently updated problems first or &#x60;-&#x60;  earlier updated problems first) * &#x60;securityProblemId&#x60;: The auto-generated ID of the security problem (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;externalVulnerabilityId&#x60;: The ID of the external vulnerability (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;displayId&#x60;: The display ID (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;riskAssessment.riskScore&#x60;: The Davis security score (&#x60;+&#x60; lower score first or &#x60;-&#x60; higher score first)  * &#x60;riskAssessment.riskLevel&#x60;: The Davis security level (&#x60;+&#x60; lower level first or &#x60;-&#x60; higher level first)  * &#x60;riskAssessment.exposure&#x60;: Whether the problem is exposed to the internet  * &#x60;riskAssessment.dataAssets&#x60;: Whether data assets are affected  * &#x60;riskAssessment.vulnerableFunctionUsage&#x60;: Whether vulnerable functions are used  * &#x60;riskAssessment.assessmentAccuracy&#x60;: The assessments accuracy (&#x60;+&#x60; less accuracy first or &#x60;-&#x60; more accuracy first)   If no prefix is set, &#x60;+&#x60; is used. | [optional] |
| **fields** | **String**| A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can&#39;t remove them from the response):  * &#x60;riskAssessment&#x60;: A risk assessment of the security problem. * &#x60;managementZones&#x60;: The management zone where the security problem occurred. * &#x60;codeLevelVulnerabilityDetails&#x60;: Details of the code-level vulnerability.  To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, &#x60;+riskAssessment,+managementZones&#x60;).  | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of thirty days is used (&#x60;now-30d&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used.  The end of the timeframe must not be older than 365 days. | [optional] |

### Return type

[**SecurityProblemList**](SecurityProblemList.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of security problems. |  -  |

## getSecurityProblemsWithHttpInfo

> ApiResponse<SecurityProblemList> getSecurityProblems getSecurityProblemsWithHttpInfo(nextPageKey, pageSize, securityProblemSelector, sort, fields, from, to)

Lists all security problems | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of security problems in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.
        String securityProblemSelector = "securityProblemSelector_example"; // String | Defines the scope of the query. Only security problems matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the `EQUALS` operator is used unless otherwise specified.  * Status: `status(\"value\")`. Find the possible values in the description of the **status** field of the response. If not set, all security problems are returned. * Muted: `muted(\"value\")`. Possible values are `TRUE` or `FALSE`. * Risk level: `riskLevel(\"value\")`. The Davis risk level. Find the possible values in the description of the **riskLevel** field of the response. * Minimum risk score: `minRiskScore(\"5.5\")`. The Davis minimum risk score. The `GREATER THAN OR EQUAL TO` operator is used. Specify a number between `1.0` and `10.0`. * Maximum risk score: `maxRiskScore(\"5.5\")`. The Davis maximum risk score. The `LESS THAN` operator is used. Specify a number between `1.0` and `10.0`. * Base risk level: `baseRiskLevel(\"value\")`. The Base risk level from the CVSS. Find the possible values in the description of the **riskLevel** field of the response. * Minimum base risk score: `minBaseRiskScore(\"5.5\")`. The minimum base risk score from the CVSS. The `GREATER THAN OR EQUAL TO` operator is used. Specify a number between `1.0` and `10.0`. * Maximum base risk score: `maxBaseRiskScore(\"5.5\")`. The maximum base risk score from the CVSS. The `LESS THAN` operator is used. Specify a number between `1.0` and `10.0`. * External vulnerability ID contains: `externalVulnerabilityIdContains(\"id-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * External vulnerability ID: `externalVulnerabilityId(\"id-1\",\"id-2\")`.  * CVE ID: `cveId(\"id\")`. * Risk assessment `riskAssessment(\"value-1\",\"value-2\")` Possible values are `EXPOSED`, `SENSITIVE`, `EXPLOIT`, `VULNERABLE_FUNCTION_IN_USE` and `ACCURACY_REDUCED`. * Related host ID: `relatedHostIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related host name: `relatedHostNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related host name contains: `relatedHostNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Related Kubernetes cluster ID: `relatedKubernetesClusterIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related Kubernetes cluster name: `relatedKubernetesClusterNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related Kubernetes cluster name contains: `relatedKubernetesClusterNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Related Kubernetes workload ID: `relatedKubernetesWorkloadIds(\"value-1\", \"value-2\")`. Specify Dynatrace entity IDs here. * Related Kubernetes workload name: `relatedKubernetesWorkloadNames(\"value-1\", \"value-2\")`. Values are case-sensitive. * Related Kubernetes workload name contains: `relatedKubernetesWorkloadNameContains(\"value-1\")`. The `CONTAINS` operator is used. * Management zone ID: `managementZoneIds(\"mzId-1\",\"mzId-2\")`. * Management zone name: `managementZones(\"name-1\",\"name-2\")`. Values are case-sensitive. * Affected process group ID: `affectedPgIds(\"pgId-1\", \"pgId-2\")`. Specify Dynatrace entity IDs here. * Affected process group name: `affectedPgNames(\"name-1\", \"name-2\")`. Values are case-sensitive. * Affected process group name contains: `affectedPgNameContains(\"name-1\")`. The `CONTAINS` operator is used. * Vulnerable component ID: `vulnerableComponentIds(\"componentId-1\", \"componentId-2\")`. Specify component IDs here. * Vulnerable component name: `vulnerableComponentNames(\"name-1\", \"name-2\")`. Values are case-sensitive. * Vulnerable component name contains: `vulnerableComponentNameContains(\"name-1\")`. The `CONTAINS` operator is used. * Host tags: `hostTags(\"hostTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Process group tags: `pgTags(\"pgTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Process group instance tags: `pgiTags(\"pgiTag-1\")`. The `CONTAINS` operator is used. Maximum value length is 48 characters. * Tags: `tags(\"tag-1\")`. The `CONTAINS` operator is used. This selector picks hosts, process groups, and process group instances at the same time. Maximum value length is 48 characters. * Display ID: `displayIds(\"S-1234\",\"S-5678\")`. The `EQUALS` operator is used. * Technology: `technology(\"technology-1\",\"technology-2\")`. Find the possible values in the description of the **technology** field of the response. The `EQUALS` operator is used. * Vulnerability type: `vulnerabilityType(\"type-1\",\"type-2\")`. Possible values are `THIRD_PARTY`, `CODE_LEVEL`, `RUNTIME`.  Risk score and risk category are mutually exclusive (cannot be used at the same time).  To set several criteria, separate them with a comma (`,`). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        String sort = "sort_example"; // String | Specifies one or more fields for sorting the security problem list. Multiple fields can be concatenated using a comma (`,`) as a separator (e.g. `+status,-timestamp`).  You can sort by the following properties with a sign prefix for the sorting order.   * `status`: The security problem status (`+` open first or `-` resolved first)  * `muted`: The security problem mute state (`+` unmuted first or `-` muted first)  * `technology`: The security problem technology  * `firstSeenTimestamp`: The timestamp of the first occurrence of the security problem (`+` new problems first or `-` old problems first)  * `lastUpdatedTimestamp`: The timestamp of the last update of the security problem (`+` recently updated problems first or `-`  earlier updated problems first) * `securityProblemId`: The auto-generated ID of the security problem (`+` lower number first or `-` higher number first)  * `externalVulnerabilityId`: The ID of the external vulnerability (`+` lower number first or `-` higher number first)  * `displayId`: The display ID (`+` lower number first or `-` higher number first)  * `riskAssessment.riskScore`: The Davis security score (`+` lower score first or `-` higher score first)  * `riskAssessment.riskLevel`: The Davis security level (`+` lower level first or `-` higher level first)  * `riskAssessment.exposure`: Whether the problem is exposed to the internet  * `riskAssessment.dataAssets`: Whether data assets are affected  * `riskAssessment.vulnerableFunctionUsage`: Whether vulnerable functions are used  * `riskAssessment.assessmentAccuracy`: The assessments accuracy (`+` less accuracy first or `-` more accuracy first)   If no prefix is set, `+` is used.
        String fields = "fields_example"; // String | A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can't remove them from the response):  * `riskAssessment`: A risk assessment of the security problem. * `managementZones`: The management zone where the security problem occurred. * `codeLevelVulnerabilityDetails`: Details of the code-level vulnerability.  To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, `+riskAssessment,+managementZones`). 
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of thirty days is used (`now-30d`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.  The end of the timeframe must not be older than 365 days.
        try {
            ApiResponse<SecurityProblemList> response = apiInstance.getSecurityProblemsWithHttpInfo(nextPageKey, pageSize, securityProblemSelector, sort, fields, from, to);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getSecurityProblems");
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
| **pageSize** | **Long**| The amount of security problems in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used. | [optional] |
| **securityProblemSelector** | **String**| Defines the scope of the query. Only security problems matching the specified criteria are included in the response.  You can add one or more of the following criteria. Values are *not* case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Status: &#x60;status(\&quot;value\&quot;)&#x60;. Find the possible values in the description of the **status** field of the response. If not set, all security problems are returned. * Muted: &#x60;muted(\&quot;value\&quot;)&#x60;. Possible values are &#x60;TRUE&#x60; or &#x60;FALSE&#x60;. * Risk level: &#x60;riskLevel(\&quot;value\&quot;)&#x60;. The Davis risk level. Find the possible values in the description of the **riskLevel** field of the response. * Minimum risk score: &#x60;minRiskScore(\&quot;5.5\&quot;)&#x60;. The Davis minimum risk score. The &#x60;GREATER THAN OR EQUAL TO&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Maximum risk score: &#x60;maxRiskScore(\&quot;5.5\&quot;)&#x60;. The Davis maximum risk score. The &#x60;LESS THAN&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Base risk level: &#x60;baseRiskLevel(\&quot;value\&quot;)&#x60;. The Base risk level from the CVSS. Find the possible values in the description of the **riskLevel** field of the response. * Minimum base risk score: &#x60;minBaseRiskScore(\&quot;5.5\&quot;)&#x60;. The minimum base risk score from the CVSS. The &#x60;GREATER THAN OR EQUAL TO&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * Maximum base risk score: &#x60;maxBaseRiskScore(\&quot;5.5\&quot;)&#x60;. The maximum base risk score from the CVSS. The &#x60;LESS THAN&#x60; operator is used. Specify a number between &#x60;1.0&#x60; and &#x60;10.0&#x60;. * External vulnerability ID contains: &#x60;externalVulnerabilityIdContains(\&quot;id-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * External vulnerability ID: &#x60;externalVulnerabilityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;.  * CVE ID: &#x60;cveId(\&quot;id\&quot;)&#x60;. * Risk assessment &#x60;riskAssessment(\&quot;value-1\&quot;,\&quot;value-2\&quot;)&#x60; Possible values are &#x60;EXPOSED&#x60;, &#x60;SENSITIVE&#x60;, &#x60;EXPLOIT&#x60;, &#x60;VULNERABLE_FUNCTION_IN_USE&#x60; and &#x60;ACCURACY_REDUCED&#x60;. * Related host ID: &#x60;relatedHostIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related host name: &#x60;relatedHostNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related host name contains: &#x60;relatedHostNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Related Kubernetes cluster ID: &#x60;relatedKubernetesClusterIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related Kubernetes cluster name: &#x60;relatedKubernetesClusterNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related Kubernetes cluster name contains: &#x60;relatedKubernetesClusterNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Related Kubernetes workload ID: &#x60;relatedKubernetesWorkloadIds(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Related Kubernetes workload name: &#x60;relatedKubernetesWorkloadNames(\&quot;value-1\&quot;, \&quot;value-2\&quot;)&#x60;. Values are case-sensitive. * Related Kubernetes workload name contains: &#x60;relatedKubernetesWorkloadNameContains(\&quot;value-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Management zone ID: &#x60;managementZoneIds(\&quot;mzId-1\&quot;,\&quot;mzId-2\&quot;)&#x60;. * Management zone name: &#x60;managementZones(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Affected process group ID: &#x60;affectedPgIds(\&quot;pgId-1\&quot;, \&quot;pgId-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Affected process group name: &#x60;affectedPgNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Affected process group name contains: &#x60;affectedPgNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Vulnerable component ID: &#x60;vulnerableComponentIds(\&quot;componentId-1\&quot;, \&quot;componentId-2\&quot;)&#x60;. Specify component IDs here. * Vulnerable component name: &#x60;vulnerableComponentNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case-sensitive. * Vulnerable component name contains: &#x60;vulnerableComponentNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. * Host tags: &#x60;hostTags(\&quot;hostTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Process group tags: &#x60;pgTags(\&quot;pgTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Process group instance tags: &#x60;pgiTags(\&quot;pgiTag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. Maximum value length is 48 characters. * Tags: &#x60;tags(\&quot;tag-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used. This selector picks hosts, process groups, and process group instances at the same time. Maximum value length is 48 characters. * Display ID: &#x60;displayIds(\&quot;S-1234\&quot;,\&quot;S-5678\&quot;)&#x60;. The &#x60;EQUALS&#x60; operator is used. * Technology: &#x60;technology(\&quot;technology-1\&quot;,\&quot;technology-2\&quot;)&#x60;. Find the possible values in the description of the **technology** field of the response. The &#x60;EQUALS&#x60; operator is used. * Vulnerability type: &#x60;vulnerabilityType(\&quot;type-1\&quot;,\&quot;type-2\&quot;)&#x60;. Possible values are &#x60;THIRD_PARTY&#x60;, &#x60;CODE_LEVEL&#x60;, &#x60;RUNTIME&#x60;.  Risk score and risk category are mutually exclusive (cannot be used at the same time).  To set several criteria, separate them with a comma (&#x60;,&#x60;). Only results matching **all** criteria are included in the response.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **sort** | **String**| Specifies one or more fields for sorting the security problem list. Multiple fields can be concatenated using a comma (&#x60;,&#x60;) as a separator (e.g. &#x60;+status,-timestamp&#x60;).  You can sort by the following properties with a sign prefix for the sorting order.   * &#x60;status&#x60;: The security problem status (&#x60;+&#x60; open first or &#x60;-&#x60; resolved first)  * &#x60;muted&#x60;: The security problem mute state (&#x60;+&#x60; unmuted first or &#x60;-&#x60; muted first)  * &#x60;technology&#x60;: The security problem technology  * &#x60;firstSeenTimestamp&#x60;: The timestamp of the first occurrence of the security problem (&#x60;+&#x60; new problems first or &#x60;-&#x60; old problems first)  * &#x60;lastUpdatedTimestamp&#x60;: The timestamp of the last update of the security problem (&#x60;+&#x60; recently updated problems first or &#x60;-&#x60;  earlier updated problems first) * &#x60;securityProblemId&#x60;: The auto-generated ID of the security problem (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;externalVulnerabilityId&#x60;: The ID of the external vulnerability (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;displayId&#x60;: The display ID (&#x60;+&#x60; lower number first or &#x60;-&#x60; higher number first)  * &#x60;riskAssessment.riskScore&#x60;: The Davis security score (&#x60;+&#x60; lower score first or &#x60;-&#x60; higher score first)  * &#x60;riskAssessment.riskLevel&#x60;: The Davis security level (&#x60;+&#x60; lower level first or &#x60;-&#x60; higher level first)  * &#x60;riskAssessment.exposure&#x60;: Whether the problem is exposed to the internet  * &#x60;riskAssessment.dataAssets&#x60;: Whether data assets are affected  * &#x60;riskAssessment.vulnerableFunctionUsage&#x60;: Whether vulnerable functions are used  * &#x60;riskAssessment.assessmentAccuracy&#x60;: The assessments accuracy (&#x60;+&#x60; less accuracy first or &#x60;-&#x60; more accuracy first)   If no prefix is set, &#x60;+&#x60; is used. | [optional] |
| **fields** | **String**| A list of additional security problem properties you can add to the response.  The following properties are available (all other properties are always included and you can&#39;t remove them from the response):  * &#x60;riskAssessment&#x60;: A risk assessment of the security problem. * &#x60;managementZones&#x60;: The management zone where the security problem occurred. * &#x60;codeLevelVulnerabilityDetails&#x60;: Details of the code-level vulnerability.  To add properties, specify them in a comma-separated list and prefix each property with a plus (for example, &#x60;+riskAssessment,+managementZones&#x60;).  | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of thirty days is used (&#x60;now-30d&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used.  The end of the timeframe must not be older than 365 days. | [optional] |

### Return type

ApiResponse<[**SecurityProblemList**](SecurityProblemList.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of security problems. |  -  |


## getVulnerableFunctions

> VulnerableFunctionsContainer getVulnerableFunctions(id, vulnerableFunctionsSelector, groupBy)

Lists all vulnerable functions and their usage for a third-party security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String vulnerableFunctionsSelector = "vulnerableFunctionsSelector_example"; // String | Defines the scope of the query. Only vulnerable functions matching the specified criteria are included in the response.  You can add the following criteria. Values are *not* case sensitive and the `EQUALS` operator is used unless otherwise specified.  * Management zone ID: `managementZoneIds(\"mzId-1\",\"mzId-2\")`. * Management zone name: `managementZones(\"name-1\",\"name-2\")`. Values are case sensitive. * Process group ID: `processGroupIds(\"pgId-1\", \"pgId-2\")`. Specify Dynatrace entity IDs here. * Process group name: `processGroupNames(\"name-1\", \"name-2\")`. Values are case sensitive. * Process group name contains: `processGroupNameContains(\"name-1\")`. The `CONTAINS` operator is used.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        String groupBy = "groupBy_example"; // String | Defines additional grouping types in which vulnerable functions should be displayed.  You can add one of the following grouping types.  * Process group: `PROCESS_GROUP`
        try {
            VulnerableFunctionsContainer result = apiInstance.getVulnerableFunctions(id, vulnerableFunctionsSelector, groupBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getVulnerableFunctions");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **vulnerableFunctionsSelector** | **String**| Defines the scope of the query. Only vulnerable functions matching the specified criteria are included in the response.  You can add the following criteria. Values are *not* case sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Management zone ID: &#x60;managementZoneIds(\&quot;mzId-1\&quot;,\&quot;mzId-2\&quot;)&#x60;. * Management zone name: &#x60;managementZones(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;. Values are case sensitive. * Process group ID: &#x60;processGroupIds(\&quot;pgId-1\&quot;, \&quot;pgId-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Process group name: &#x60;processGroupNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case sensitive. * Process group name contains: &#x60;processGroupNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **groupBy** | **String**| Defines additional grouping types in which vulnerable functions should be displayed.  You can add one of the following grouping types.  * Process group: &#x60;PROCESS_GROUP&#x60; | [optional] |

### Return type

[**VulnerableFunctionsContainer**](VulnerableFunctionsContainer.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of vulnerable functions. |  -  |

## getVulnerableFunctionsWithHttpInfo

> ApiResponse<VulnerableFunctionsContainer> getVulnerableFunctions getVulnerableFunctionsWithHttpInfo(id, vulnerableFunctionsSelector, groupBy)

Lists all vulnerable functions and their usage for a third-party security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String vulnerableFunctionsSelector = "vulnerableFunctionsSelector_example"; // String | Defines the scope of the query. Only vulnerable functions matching the specified criteria are included in the response.  You can add the following criteria. Values are *not* case sensitive and the `EQUALS` operator is used unless otherwise specified.  * Management zone ID: `managementZoneIds(\"mzId-1\",\"mzId-2\")`. * Management zone name: `managementZones(\"name-1\",\"name-2\")`. Values are case sensitive. * Process group ID: `processGroupIds(\"pgId-1\", \"pgId-2\")`. Specify Dynatrace entity IDs here. * Process group name: `processGroupNames(\"name-1\", \"name-2\")`. Values are case sensitive. * Process group name contains: `processGroupNameContains(\"name-1\")`. The `CONTAINS` operator is used.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (`~`) inside quotes: * Tilde `~`  * Quote `\"`
        String groupBy = "groupBy_example"; // String | Defines additional grouping types in which vulnerable functions should be displayed.  You can add one of the following grouping types.  * Process group: `PROCESS_GROUP`
        try {
            ApiResponse<VulnerableFunctionsContainer> response = apiInstance.getVulnerableFunctionsWithHttpInfo(id, vulnerableFunctionsSelector, groupBy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#getVulnerableFunctions");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **vulnerableFunctionsSelector** | **String**| Defines the scope of the query. Only vulnerable functions matching the specified criteria are included in the response.  You can add the following criteria. Values are *not* case sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.  * Management zone ID: &#x60;managementZoneIds(\&quot;mzId-1\&quot;,\&quot;mzId-2\&quot;)&#x60;. * Management zone name: &#x60;managementZones(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;. Values are case sensitive. * Process group ID: &#x60;processGroupIds(\&quot;pgId-1\&quot;, \&quot;pgId-2\&quot;)&#x60;. Specify Dynatrace entity IDs here. * Process group name: &#x60;processGroupNames(\&quot;name-1\&quot;, \&quot;name-2\&quot;)&#x60;. Values are case sensitive. * Process group name contains: &#x60;processGroupNameContains(\&quot;name-1\&quot;)&#x60;. The &#x60;CONTAINS&#x60; operator is used.  Specify the value of a criterion as a quoted string. The following special characters must be escaped with a tilde (&#x60;~&#x60;) inside quotes: * Tilde &#x60;~&#x60;  * Quote &#x60;\&quot;&#x60; | [optional] |
| **groupBy** | **String**| Defines additional grouping types in which vulnerable functions should be displayed.  You can add one of the following grouping types.  * Process group: &#x60;PROCESS_GROUP&#x60; | [optional] |

### Return type

ApiResponse<[**VulnerableFunctionsContainer**](VulnerableFunctionsContainer.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The response contains the list of vulnerable functions. |  -  |


## muteSecurityProblem

> void muteSecurityProblem(id, securityProblemMute)

Mutes a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        SecurityProblemMute securityProblemMute = new SecurityProblemMute(); // SecurityProblemMute | The JSON body of the request. Contains the muting information.
        try {
            apiInstance.muteSecurityProblem(id, securityProblemMute);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#muteSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **securityProblemMute** | [**SecurityProblemMute**](SecurityProblemMute.md)| The JSON body of the request. Contains the muting information. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The security problem has been muted. |  -  |
| **204** | Not executed. The security problem is already muted. |  -  |

## muteSecurityProblemWithHttpInfo

> ApiResponse<Void> muteSecurityProblem muteSecurityProblemWithHttpInfo(id, securityProblemMute)

Mutes a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        SecurityProblemMute securityProblemMute = new SecurityProblemMute(); // SecurityProblemMute | The JSON body of the request. Contains the muting information.
        try {
            ApiResponse<Void> response = apiInstance.muteSecurityProblemWithHttpInfo(id, securityProblemMute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#muteSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **securityProblemMute** | [**SecurityProblemMute**](SecurityProblemMute.md)| The JSON body of the request. Contains the muting information. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The security problem has been muted. |  -  |
| **204** | Not executed. The security problem is already muted. |  -  |


## setRemediationItemMuteState

> void setRemediationItemMuteState(id, itemId, remediationItemMuteStateChange)

Sets the mute state of a remediation item | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String itemId = "itemId_example"; // String | The ID of the remediation item.
        RemediationItemMuteStateChange remediationItemMuteStateChange = new RemediationItemMuteStateChange(); // RemediationItemMuteStateChange | The JSON body of the request. Contains the mute state information to be applied.
        try {
            apiInstance.setRemediationItemMuteState(id, itemId, remediationItemMuteStateChange);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#setRemediationItemMuteState");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **itemId** | **String**| The ID of the remediation item. | |
| **remediationItemMuteStateChange** | [**RemediationItemMuteStateChange**](RemediationItemMuteStateChange.md)| The JSON body of the request. Contains the mute state information to be applied. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The requested mute state has been applied to the remediation item. |  -  |
| **204** | Not executed. The remediation item was previously put into the requested mute state by the same user with the same reason and comment. |  -  |

## setRemediationItemMuteStateWithHttpInfo

> ApiResponse<Void> setRemediationItemMuteState setRemediationItemMuteStateWithHttpInfo(id, itemId, remediationItemMuteStateChange)

Sets the mute state of a remediation item | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required third-party security problem.
        String itemId = "itemId_example"; // String | The ID of the remediation item.
        RemediationItemMuteStateChange remediationItemMuteStateChange = new RemediationItemMuteStateChange(); // RemediationItemMuteStateChange | The JSON body of the request. Contains the mute state information to be applied.
        try {
            ApiResponse<Void> response = apiInstance.setRemediationItemMuteStateWithHttpInfo(id, itemId, remediationItemMuteStateChange);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#setRemediationItemMuteState");
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
| **id** | **String**| The ID of the required third-party security problem. | |
| **itemId** | **String**| The ID of the remediation item. | |
| **remediationItemMuteStateChange** | [**RemediationItemMuteStateChange**](RemediationItemMuteStateChange.md)| The JSON body of the request. Contains the mute state information to be applied. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The requested mute state has been applied to the remediation item. |  -  |
| **204** | Not executed. The remediation item was previously put into the requested mute state by the same user with the same reason and comment. |  -  |


## unmuteSecurityProblem

> void unmuteSecurityProblem(id, securityProblemUnmute)

Un-mutes a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        SecurityProblemUnmute securityProblemUnmute = new SecurityProblemUnmute(); // SecurityProblemUnmute | The JSON body of the request. Contains the un-muting information.
        try {
            apiInstance.unmuteSecurityProblem(id, securityProblemUnmute);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#unmuteSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **securityProblemUnmute** | [**SecurityProblemUnmute**](SecurityProblemUnmute.md)| The JSON body of the request. Contains the un-muting information. | [optional] |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The security problem has been un-muted. |  -  |
| **204** | Not executed. The security problem is already un-muted. |  -  |

## unmuteSecurityProblemWithHttpInfo

> ApiResponse<Void> unmuteSecurityProblem unmuteSecurityProblemWithHttpInfo(id, securityProblemUnmute)

Un-mutes a security problem | maturity&#x3D;EARLY_ADOPTER

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.SecurityProblemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        SecurityProblemsApi apiInstance = new SecurityProblemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the required security problem.
        SecurityProblemUnmute securityProblemUnmute = new SecurityProblemUnmute(); // SecurityProblemUnmute | The JSON body of the request. Contains the un-muting information.
        try {
            ApiResponse<Void> response = apiInstance.unmuteSecurityProblemWithHttpInfo(id, securityProblemUnmute);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityProblemsApi#unmuteSecurityProblem");
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
| **id** | **String**| The ID of the required security problem. | |
| **securityProblemUnmute** | [**SecurityProblemUnmute**](SecurityProblemUnmute.md)| The JSON body of the request. Contains the un-muting information. | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. The security problem has been un-muted. |  -  |
| **204** | Not executed. The security problem is already un-muted. |  -  |

