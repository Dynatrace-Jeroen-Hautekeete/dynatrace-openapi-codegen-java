/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.dynatrace.apis.envv1.api;

import com.dynatrace.apis.envv1.ApiClient;
import com.dynatrace.apis.envv1.ApiException;
import com.dynatrace.apis.envv1.ApiResponse;
import com.dynatrace.apis.envv1.Pair;

import com.dynatrace.apis.envv1.model.CreateToken;
import com.dynatrace.apis.envv1.model.ErrorEnvelope;
import java.util.Set;
import com.dynatrace.apis.envv1.model.StubList;
import com.dynatrace.apis.envv1.model.Token;
import com.dynatrace.apis.envv1.model.TokenMetadata;
import com.dynatrace.apis.envv1.model.UpdateToken;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class TokensApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public TokensApi() {
    this(new ApiClient());
  }

  public TokensApi(ApiClient apiClient) {
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
   * Creates a new token
   * The newly created token will be owned by the same user who owns the token used for authentication of the call.
   * @param createToken The JSON body of the request. Contains parameters of the new token. (required)
   * @return Token
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Token createToken(CreateToken createToken) throws ApiException {
    ApiResponse<Token> localVarResponse = createTokenWithHttpInfo(createToken);
    return localVarResponse.getData();
  }

  /**
   * Creates a new token
   * The newly created token will be owned by the same user who owns the token used for authentication of the call.
   * @param createToken The JSON body of the request. Contains parameters of the new token. (required)
   * @return ApiResponse&lt;Token&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Token> createTokenWithHttpInfo(CreateToken createToken) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createTokenRequestBuilder(createToken);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createToken", localVarResponse);
        }
        return new ApiResponse<Token>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Token>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createTokenRequestBuilder(CreateToken createToken) throws ApiException {
    // verify the required parameter 'createToken' is set
    if (createToken == null) {
      throw new ApiException(400, "Missing the required parameter 'createToken' when calling createToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8, text/csv; header&#x3D;present; charset&#x3D;utf-8, text/csv; header&#x3D;absent; charset&#x3D;utf-8, text/plain; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createToken);
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
   * Deletes the specified token
   * 
   * @param id The ID of the token to be deleted. Can either be the public identifier or the secret.   You can&#39;t delete the token you&#39;re using for authentication of the request. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteToken(String id) throws ApiException {
    deleteTokenWithHttpInfo(id);
  }

  /**
   * Deletes the specified token
   * 
   * @param id The ID of the token to be deleted. Can either be the public identifier or the secret.   You can&#39;t delete the token you&#39;re using for authentication of the request. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteTokenWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteTokenRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteToken", localVarResponse);
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

  private HttpRequest.Builder deleteTokenRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens/{id}"
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
   * Lists token metadata by token ID
   * The token itself is **not** exposed.
   * @param id The ID of the required token. (required)
   * @return TokenMetadata
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public TokenMetadata getTokenMetadata(String id) throws ApiException {
    ApiResponse<TokenMetadata> localVarResponse = getTokenMetadataWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Lists token metadata by token ID
   * The token itself is **not** exposed.
   * @param id The ID of the required token. (required)
   * @return ApiResponse&lt;TokenMetadata&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<TokenMetadata> getTokenMetadataWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTokenMetadataRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getTokenMetadata", localVarResponse);
        }
        return new ApiResponse<TokenMetadata>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TokenMetadata>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getTokenMetadataRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTokenMetadata");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens/{id}"
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
   * Lists token metadata by token itself
   * 
   * @param token The JSON body of the request. Contains the required token. (required)
   * @return TokenMetadata
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public TokenMetadata getTokenMetadataBySecret(Token token) throws ApiException {
    ApiResponse<TokenMetadata> localVarResponse = getTokenMetadataBySecretWithHttpInfo(token);
    return localVarResponse.getData();
  }

  /**
   * Lists token metadata by token itself
   * 
   * @param token The JSON body of the request. Contains the required token. (required)
   * @return ApiResponse&lt;TokenMetadata&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<TokenMetadata> getTokenMetadataBySecretWithHttpInfo(Token token) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getTokenMetadataBySecretRequestBuilder(token);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getTokenMetadataBySecret", localVarResponse);
        }
        return new ApiResponse<TokenMetadata>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TokenMetadata>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getTokenMetadataBySecretRequestBuilder(Token token) throws ApiException {
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling getTokenMetadataBySecret");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens/lookup";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(token);
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
   * Lists available tokens in your environment
   * You can narrow down the output by adding parameters. The token has to match *all* the specified parameters.    You can also specify the limit of returned tokens.   **This list may contain tokens which were created automatically** (e.g. InstallerDownload, Mobile, ...) and are not visible on the &#x60;Settings&#x60; page. Deleting those might have unintended side-effects as they might still be in use.
   * @param limit Limits the maximum number of returned tokens.    If not set the value of &#x60;1000&#x60; is used.    Maximum value is 1000000. (optional, default to 1000)
   * @param user Filters the resulting set of tokens by user, who owns the token. (optional)
   * @param permissions Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: &#x60;permissions&#x3D;scope1&amp;permissions&#x3D;scope2&#x60;. The token must have *all* the specified scopes. (optional
   * @param from Last used after this timestamp (UTC milliseconds). (optional)
   * @param to Last used before this timestamp (UTC milliseconds). (optional)
   * @return StubList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public StubList listTokens(Integer limit, String user, Set<String> permissions, Long from, Long to) throws ApiException {
    ApiResponse<StubList> localVarResponse = listTokensWithHttpInfo(limit, user, permissions, from, to);
    return localVarResponse.getData();
  }

  /**
   * Lists available tokens in your environment
   * You can narrow down the output by adding parameters. The token has to match *all* the specified parameters.    You can also specify the limit of returned tokens.   **This list may contain tokens which were created automatically** (e.g. InstallerDownload, Mobile, ...) and are not visible on the &#x60;Settings&#x60; page. Deleting those might have unintended side-effects as they might still be in use.
   * @param limit Limits the maximum number of returned tokens.    If not set the value of &#x60;1000&#x60; is used.    Maximum value is 1000000. (optional, default to 1000)
   * @param user Filters the resulting set of tokens by user, who owns the token. (optional)
   * @param permissions Filters the resulting set of tokens by scopes assigned to the token.    You can specify several permissions in the following format: &#x60;permissions&#x3D;scope1&amp;permissions&#x3D;scope2&#x60;. The token must have *all* the specified scopes. (optional
   * @param from Last used after this timestamp (UTC milliseconds). (optional)
   * @param to Last used before this timestamp (UTC milliseconds). (optional)
   * @return ApiResponse&lt;StubList&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<StubList> listTokensWithHttpInfo(Integer limit, String user, Set<String> permissions, Long from, Long to) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listTokensRequestBuilder(limit, user, permissions, from, to);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listTokens", localVarResponse);
        }
        return new ApiResponse<StubList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<StubList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listTokensRequestBuilder(Integer limit, String user, Set<String> permissions, Long from, Long to) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("user", user));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "permissions", permissions));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("from", from));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("to", to));

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
   * Updates the specified token
   * 
   * @param id The ID of the token to be updated.    You can&#39;t update the token you&#39;re using for authentication of the request. (required)
   * @param updateToken The JSON body of the request. Contains updated parameters of the token. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void updateToken(String id, UpdateToken updateToken) throws ApiException {
    updateTokenWithHttpInfo(id, updateToken);
  }

  /**
   * Updates the specified token
   * 
   * @param id The ID of the token to be updated.    You can&#39;t update the token you&#39;re using for authentication of the request. (required)
   * @param updateToken The JSON body of the request. Contains updated parameters of the token. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> updateTokenWithHttpInfo(String id, UpdateToken updateToken) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateTokenRequestBuilder(id, updateToken);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateToken", localVarResponse);
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

  private HttpRequest.Builder updateTokenRequestBuilder(String id, UpdateToken updateToken) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateToken");
    }
    // verify the required parameter 'updateToken' is set
    if (updateToken == null) {
      throw new ApiException(400, "Missing the required parameter 'updateToken' when calling updateToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/tokens/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateToken);
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