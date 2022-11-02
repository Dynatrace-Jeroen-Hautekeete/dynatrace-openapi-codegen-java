/*
 * Dynatrace Configuration API
 * Documentation of the Dynatrace Configuration API. To read about use-cases and examples, see [Dynatrace Documentation](https://dt-url.net/4u43kxw).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.dynatrace.apis.configv1.api;

import com.dynatrace.apis.configv1.ApiClient;
import com.dynatrace.apis.configv1.ApiException;
import com.dynatrace.apis.configv1.ApiResponse;
import com.dynatrace.apis.configv1.Pair;

import com.dynatrace.apis.configv1.model.Credentials;
import com.dynatrace.apis.configv1.model.CredentialsList;
import com.dynatrace.apis.configv1.model.CredentialsResponseElement;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CredentialVaultApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public CredentialVaultApi() {
    this(new ApiClient());
  }

  public CredentialVaultApi(ApiClient apiClient) {
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
   * Creates a new credentials set
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param credentials The JSON body of the request. Contains parameters of the new credentials set. (required)
   * @return CredentialsResponseElement
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CredentialsResponseElement createCredentials(Credentials credentials) throws ApiException {
    ApiResponse<CredentialsResponseElement> localVarResponse = createCredentialsWithHttpInfo(credentials);
    return localVarResponse.getData();
  }

  /**
   * Creates a new credentials set
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param credentials The JSON body of the request. Contains parameters of the new credentials set. (required)
   * @return ApiResponse&lt;CredentialsResponseElement&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CredentialsResponseElement> createCredentialsWithHttpInfo(Credentials credentials) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createCredentialsRequestBuilder(credentials);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createCredentials", localVarResponse);
        }
        return new ApiResponse<CredentialsResponseElement>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CredentialsResponseElement>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createCredentialsRequestBuilder(Credentials credentials) throws ApiException {
    // verify the required parameter 'credentials' is set
    if (credentials == null) {
      throw new ApiException(400, "Missing the required parameter 'credentials' when calling createCredentials");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/credentials";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(credentials);
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
   * Gets the metadata of the specified credentials set
   * The credentials set itself (username/certificate and password) is not included in the response.
   * @param id The Dynatrace entity ID of the required credentials set. (required)
   * @return CredentialsResponseElement
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CredentialsResponseElement getCredentials(String id) throws ApiException {
    ApiResponse<CredentialsResponseElement> localVarResponse = getCredentialsWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets the metadata of the specified credentials set
   * The credentials set itself (username/certificate and password) is not included in the response.
   * @param id The Dynatrace entity ID of the required credentials set. (required)
   * @return ApiResponse&lt;CredentialsResponseElement&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CredentialsResponseElement> getCredentialsWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCredentialsRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getCredentials", localVarResponse);
        }
        return new ApiResponse<CredentialsResponseElement>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CredentialsResponseElement>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getCredentialsRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCredentials");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/credentials/{id}"
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
   * Lists all sets of credentials for synthetic monitors stored in your environment
   * 
   * @param type Filters the result by the specified credentials type. (optional)
   * @return CredentialsList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CredentialsList listCredentials(String type) throws ApiException {
    ApiResponse<CredentialsList> localVarResponse = listCredentialsWithHttpInfo(type);
    return localVarResponse.getData();
  }

  /**
   * Lists all sets of credentials for synthetic monitors stored in your environment
   * 
   * @param type Filters the result by the specified credentials type. (optional)
   * @return ApiResponse&lt;CredentialsList&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CredentialsList> listCredentialsWithHttpInfo(String type) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listCredentialsRequestBuilder(type);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listCredentials", localVarResponse);
        }
        return new ApiResponse<CredentialsList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CredentialsList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listCredentialsRequestBuilder(String type) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/credentials";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));

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
   * Deletes the specified credentials set
   * 
   * @param id The ID of the credentials set to be deleted. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void removeCredentials(String id) throws ApiException {
    removeCredentialsWithHttpInfo(id);
  }

  /**
   * Deletes the specified credentials set
   * 
   * @param id The ID of the credentials set to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> removeCredentialsWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = removeCredentialsRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("removeCredentials", localVarResponse);
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

  private HttpRequest.Builder removeCredentialsRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeCredentials");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/credentials/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

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
   * Updates the specified credentials set
   * 
   * @param id The Dynatrace entity ID of the credentials set to be updated. (required)
   * @param credentials The JSON body of the request. Contains updated parameters of the credentials set. (required)
   * @return CredentialsResponseElement
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public CredentialsResponseElement updateCredentials(String id, Credentials credentials) throws ApiException {
    ApiResponse<CredentialsResponseElement> localVarResponse = updateCredentialsWithHttpInfo(id, credentials);
    return localVarResponse.getData();
  }

  /**
   * Updates the specified credentials set
   * 
   * @param id The Dynatrace entity ID of the credentials set to be updated. (required)
   * @param credentials The JSON body of the request. Contains updated parameters of the credentials set. (required)
   * @return ApiResponse&lt;CredentialsResponseElement&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<CredentialsResponseElement> updateCredentialsWithHttpInfo(String id, Credentials credentials) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateCredentialsRequestBuilder(id, credentials);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateCredentials", localVarResponse);
        }
        return new ApiResponse<CredentialsResponseElement>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CredentialsResponseElement>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder updateCredentialsRequestBuilder(String id, Credentials credentials) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCredentials");
    }
    // verify the required parameter 'credentials' is set
    if (credentials == null) {
      throw new ApiException(400, "Missing the required parameter 'credentials' when calling updateCredentials");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/credentials/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(credentials);
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
