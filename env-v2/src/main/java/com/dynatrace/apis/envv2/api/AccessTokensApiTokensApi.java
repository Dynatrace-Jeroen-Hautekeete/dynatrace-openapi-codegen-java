/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.dynatrace.apis.envv2.api;

import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Pair;

import com.dynatrace.apis.envv2.model.ApiToken;
import com.dynatrace.apis.envv2.model.ApiTokenCreate;
import com.dynatrace.apis.envv2.model.ApiTokenCreated;
import com.dynatrace.apis.envv2.model.ApiTokenList;
import com.dynatrace.apis.envv2.model.ApiTokenSecret;
import com.dynatrace.apis.envv2.model.ApiTokenUpdate;
import com.dynatrace.apis.envv2.model.ErrorEnvelope;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class AccessTokensApiTokensApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AccessTokensApiTokensApi() {
    this(new ApiClient());
  }

  public AccessTokensApiTokensApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Creates a new API token
   * The newly created token will be owned by the same user who owns the token used for authentication of the call.
   * @param apiTokenCreate The JSON body of the request. Contains parameters of the new API token. (required)
   * @return ApiTokenCreated
   * @throws ApiException if fails to make API call
   */
  public ApiTokenCreated createApiToken(ApiTokenCreate apiTokenCreate) throws ApiException {
    ApiResponse<ApiTokenCreated> localVarResponse = createApiTokenWithHttpInfo(apiTokenCreate);
    return localVarResponse.getData();
  }

  /**
   * Creates a new API token
   * The newly created token will be owned by the same user who owns the token used for authentication of the call.
   * @param apiTokenCreate The JSON body of the request. Contains parameters of the new API token. (required)
   * @return ApiResponse&lt;ApiTokenCreated&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTokenCreated> createApiTokenWithHttpInfo(ApiTokenCreate apiTokenCreate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createApiTokenRequestBuilder(apiTokenCreate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createApiToken", localVarResponse);
        }
        return new ApiResponse<ApiTokenCreated>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ApiTokenCreated>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createApiTokenRequestBuilder(ApiTokenCreate apiTokenCreate) throws ApiException {
    // verify the required parameter 'apiTokenCreate' is set
    if (apiTokenCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'apiTokenCreate' when calling createApiToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(apiTokenCreate);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Deletes an API token
   * 
   * @param id The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can&#39;t delete the token you&#39;re using for authentication of the request. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteApiToken(String id) throws ApiException {
    deleteApiTokenWithHttpInfo(id);
  }

  /**
   * Deletes an API token
   * 
   * @param id The ID of the token to be deleted.   You can specify either the ID or the secret of the token.   You can&#39;t delete the token you&#39;re using for authentication of the request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteApiTokenWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteApiTokenRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteApiToken", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteApiTokenRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteApiToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Gets API token metadata by token ID
   * The token secret is **not** exposed.
   * @param id The ID of the token. (required)
   * @return ApiToken
   * @throws ApiException if fails to make API call
   */
  public ApiToken getApiToken(String id) throws ApiException {
    ApiResponse<ApiToken> localVarResponse = getApiTokenWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets API token metadata by token ID
   * The token secret is **not** exposed.
   * @param id The ID of the token. (required)
   * @return ApiResponse&lt;ApiToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiToken> getApiTokenWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getApiTokenRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getApiToken", localVarResponse);
        }
        return new ApiResponse<ApiToken>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ApiToken>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getApiTokenRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getApiToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Lists all available API tokens
   * You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used. (optional)
   * @param apiTokenSelector Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: &#x60;owner(\&quot;value\&quot;)&#x60;. The user that owns the token. Case-sensitive. * Personal access token: &#x60;personalAccessToken(false)&#x60;. Set to &#x60;true&#x60; to include only personal access tokens or to &#x60;false&#x60; to include only API tokens. * Token scope: &#x60;scope(\&quot;scope1\&quot;,\&quot;scope2\&quot;)&#x60;. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (&#x60;,&#x60;). Only results matching **all** criteria are included into response. (optional)
   * @param fields Specifies the fields to be included in the response.  The following fields are included by default:   * &#x60;id&#x60;  * &#x60;name&#x60;  * &#x60;enabled&#x60;  * &#x60;owner&#x60;  * &#x60;creationDate&#x60;   To remove fields from the response, specify them with the minus (&#x60;-&#x60;) operator as a comma-separated list (for example, &#x60;-creationDate,-owner&#x60;).   You can include additional fields:   * &#x60;personalAccessToken&#x60;  * &#x60;expirationDate&#x60;  * &#x60;lastUsedDate&#x60;  * &#x60;lastUsedIpAddress&#x60;  * &#x60;modifiedDate&#x60;  * &#x60;scopes&#x60;   * &#x60;additionalMetadata&#x60;   To add fields to the response, specify them with the plus (&#x60;+&#x60;) operator as a comma-separated list (for example, &#x60;+expirationDate,+scopes&#x60;). You can combine adding and removing of fields (for example, &#x60;+scopes,-creationDate&#x60;).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, &#x60;creationDate,expirationDate,owner&#x60;). The ID is always included in the response.   The **fields** string must be URL-encoded. (optional)
   * @param from Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    (optional)
   * @param to Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param sort The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * &#x60;name&#x60;: token name (&#x60;+&#x60; a...z or &#x60;-&#x60; z...a)   * &#x60;lastUsedDate&#x60; last used (&#x60;+&#x60; never used tokens first &#x60;-&#x60; most recently used tokens first)   * &#x60;creationDate&#x60; (&#x60;+&#x60; oldest tokens first &#x60;-&#x60; newest tokens first)   * &#x60;expirationDate&#x60; (&#x60;+&#x60; tokens that expire soon first &#x60;-&#x60; unlimited tokens first)   * &#x60;modifiedDate&#x60; last modified (&#x60;+&#x60; never modified tokens first &#x60;-&#x60; most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first. (optional, default to -creationDate)
   * @return ApiTokenList
   * @throws ApiException if fails to make API call
   */
  public ApiTokenList listApiTokens(String nextPageKey, Long pageSize, String apiTokenSelector, String fields, String from, String to, String sort) throws ApiException {
    ApiResponse<ApiTokenList> localVarResponse = listApiTokensWithHttpInfo(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort);
    return localVarResponse.getData();
  }

  /**
   * Lists all available API tokens
   * You can limit the output by using pagination:  1. Specify the number of results per page in the **pageSize** query parameter.  2. Use the cursor from the **nextPageKey** field of the previous response in the **nextPageKey** query parameter to obtain subsequent pages.
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of API tokens in a single response payload.   The maximal allowed page size is 10000 and the minimal allowed page size is 100.   If not set, 200 is used. (optional)
   * @param apiTokenSelector Filters the resulting sets of tokens. Only tokens matching the specified criteria are included into response.   You can set one or more of the following criteria:   * Owner: &#x60;owner(\&quot;value\&quot;)&#x60;. The user that owns the token. Case-sensitive. * Personal access token: &#x60;personalAccessToken(false)&#x60;. Set to &#x60;true&#x60; to include only personal access tokens or to &#x60;false&#x60; to include only API tokens. * Token scope: &#x60;scope(\&quot;scope1\&quot;,\&quot;scope2\&quot;)&#x60;. If several values are specified, the **OR** logic applies.   To set multiple criteria, separate them with commas (&#x60;,&#x60;). Only results matching **all** criteria are included into response. (optional)
   * @param fields Specifies the fields to be included in the response.  The following fields are included by default:   * &#x60;id&#x60;  * &#x60;name&#x60;  * &#x60;enabled&#x60;  * &#x60;owner&#x60;  * &#x60;creationDate&#x60;   To remove fields from the response, specify them with the minus (&#x60;-&#x60;) operator as a comma-separated list (for example, &#x60;-creationDate,-owner&#x60;).   You can include additional fields:   * &#x60;personalAccessToken&#x60;  * &#x60;expirationDate&#x60;  * &#x60;lastUsedDate&#x60;  * &#x60;lastUsedIpAddress&#x60;  * &#x60;modifiedDate&#x60;  * &#x60;scopes&#x60;   * &#x60;additionalMetadata&#x60;   To add fields to the response, specify them with the plus (&#x60;+&#x60;) operator as a comma-separated list (for example, &#x60;+expirationDate,+scopes&#x60;). You can combine adding and removing of fields (for example, &#x60;+scopes,-creationDate&#x60;).   Alternatively, you can define the desired set of fields in the response. Specify the required fields as a comma-separated list, without operators (for example, &#x60;creationDate,expirationDate,owner&#x60;). The ID is always included in the response.   The **fields** string must be URL-encoded. (optional)
   * @param from Filters tokens based on the last usage time.  The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    (optional)
   * @param to Filters tokens based on the last usage time.  The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param sort The sort order of the token list.   You can sort by the following properties with a sign prefix for the sort order:    * &#x60;name&#x60;: token name (&#x60;+&#x60; a...z or &#x60;-&#x60; z...a)   * &#x60;lastUsedDate&#x60; last used (&#x60;+&#x60; never used tokens first &#x60;-&#x60; most recently used tokens first)   * &#x60;creationDate&#x60; (&#x60;+&#x60; oldest tokens first &#x60;-&#x60; newest tokens first)   * &#x60;expirationDate&#x60; (&#x60;+&#x60; tokens that expire soon first &#x60;-&#x60; unlimited tokens first)   * &#x60;modifiedDate&#x60; last modified (&#x60;+&#x60; never modified tokens first &#x60;-&#x60; most recently modified tokens first)   If no prefix is set, + is used.   If not set, tokens are sorted by creation date with newest first. (optional, default to -creationDate)
   * @return ApiResponse&lt;ApiTokenList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiTokenList> listApiTokensWithHttpInfo(String nextPageKey, Long pageSize, String apiTokenSelector, String fields, String from, String to, String sort) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listApiTokensRequestBuilder(nextPageKey, pageSize, apiTokenSelector, fields, from, to, sort);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listApiTokens", localVarResponse);
        }
        return new ApiResponse<ApiTokenList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ApiTokenList>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listApiTokensRequestBuilder(String nextPageKey, Long pageSize, String apiTokenSelector, String fields, String from, String to, String sort) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nextPageKey", nextPageKey));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("apiTokenSelector", apiTokenSelector));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fields", fields));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("from", from));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("to", to));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sort", sort));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Gets API token metadata by token secret
   * 
   * @param apiTokenSecret The JSON body of the request. Contains the required token. (required)
   * @return ApiToken
   * @throws ApiException if fails to make API call
   */
  public ApiToken lookupApiToken(ApiTokenSecret apiTokenSecret) throws ApiException {
    ApiResponse<ApiToken> localVarResponse = lookupApiTokenWithHttpInfo(apiTokenSecret);
    return localVarResponse.getData();
  }

  /**
   * Gets API token metadata by token secret
   * 
   * @param apiTokenSecret The JSON body of the request. Contains the required token. (required)
   * @return ApiResponse&lt;ApiToken&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ApiToken> lookupApiTokenWithHttpInfo(ApiTokenSecret apiTokenSecret) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = lookupApiTokenRequestBuilder(apiTokenSecret);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("lookupApiToken", localVarResponse);
        }
        return new ApiResponse<ApiToken>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ApiToken>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder lookupApiTokenRequestBuilder(ApiTokenSecret apiTokenSecret) throws ApiException {
    // verify the required parameter 'apiTokenSecret' is set
    if (apiTokenSecret == null) {
      throw new ApiException(400, "Missing the required parameter 'apiTokenSecret' when calling lookupApiToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens/lookup";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(apiTokenSecret);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Updates an API token
   * 
   * @param id The ID of the token to be updated.    You can&#39;t disable the token you&#39;re using for authentication of the request. (required)
   * @param apiTokenUpdate The JSON body of the request. Contains updated parameters of the API token. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateApiToken(String id, ApiTokenUpdate apiTokenUpdate) throws ApiException {
    updateApiTokenWithHttpInfo(id, apiTokenUpdate);
  }

  /**
   * Updates an API token
   * 
   * @param id The ID of the token to be updated.    You can&#39;t disable the token you&#39;re using for authentication of the request. (required)
   * @param apiTokenUpdate The JSON body of the request. Contains updated parameters of the API token. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateApiTokenWithHttpInfo(String id, ApiTokenUpdate apiTokenUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateApiTokenRequestBuilder(id, apiTokenUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateApiToken", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateApiTokenRequestBuilder(String id, ApiTokenUpdate apiTokenUpdate) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateApiToken");
    }
    // verify the required parameter 'apiTokenUpdate' is set
    if (apiTokenUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'apiTokenUpdate' when calling updateApiToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/apiTokens/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(apiTokenUpdate);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}