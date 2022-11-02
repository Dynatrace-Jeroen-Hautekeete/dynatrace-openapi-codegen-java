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

import com.dynatrace.apis.configv1.model.AlertingProfile;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.StubList;
import java.util.UUID;

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
public class AlertingProfilesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AlertingProfilesApi() {
    this(new ApiClient());
  }

  public AlertingProfilesApi(ApiClient apiClient) {
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
   * Creates a new alerting profile
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param alertingProfile The JSON body of the request. Contains parameters of the new alerting profile. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public EntityShortRepresentation createAlertingProfile(AlertingProfile alertingProfile) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = createAlertingProfileWithHttpInfo(alertingProfile);
    return localVarResponse.getData();
  }

  /**
   * Creates a new alerting profile
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param alertingProfile The JSON body of the request. Contains parameters of the new alerting profile. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<EntityShortRepresentation> createAlertingProfileWithHttpInfo(AlertingProfile alertingProfile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createAlertingProfileRequestBuilder(alertingProfile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createAlertingProfile", localVarResponse);
        }
        return new ApiResponse<EntityShortRepresentation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<EntityShortRepresentation>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createAlertingProfileRequestBuilder(AlertingProfile alertingProfile) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(alertingProfile);
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
   * Updates an existing alerting profile
   * If an alerting profile with the specified ID doesn&#39;t exist, a new one is created.
   * @param id The ID of the alerting profile to be updated. (required)
   * @param alertingProfile The JSON body of the request. Contains updated parameters of the alerting profile. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public EntityShortRepresentation createOrUpdateAlertingProfile(UUID id, AlertingProfile alertingProfile) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = createOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile);
    return localVarResponse.getData();
  }

  /**
   * Updates an existing alerting profile
   * If an alerting profile with the specified ID doesn&#39;t exist, a new one is created.
   * @param id The ID of the alerting profile to be updated. (required)
   * @param alertingProfile The JSON body of the request. Contains updated parameters of the alerting profile. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<EntityShortRepresentation> createOrUpdateAlertingProfileWithHttpInfo(UUID id, AlertingProfile alertingProfile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createOrUpdateAlertingProfileRequestBuilder(id, alertingProfile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createOrUpdateAlertingProfile", localVarResponse);
        }
        return new ApiResponse<EntityShortRepresentation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<EntityShortRepresentation>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createOrUpdateAlertingProfileRequestBuilder(UUID id, AlertingProfile alertingProfile) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createOrUpdateAlertingProfile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(alertingProfile);
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
  /**
   * Deletes the specified alerting profile
   * The default alerting profile cannot be deleted.
   * @param id The ID of the alerting profile to be deleted. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteAlertingProfile(UUID id) throws ApiException {
    deleteAlertingProfileWithHttpInfo(id);
  }

  /**
   * Deletes the specified alerting profile
   * The default alerting profile cannot be deleted.
   * @param id The ID of the alerting profile to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteAlertingProfileWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteAlertingProfileRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteAlertingProfile", localVarResponse);
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

  private HttpRequest.Builder deleteAlertingProfileRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAlertingProfile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles/{id}"
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
   * Gets the properties of the specified alerting profile
   * 
   * @param id The ID of the required alerting profile. (required)
   * @return AlertingProfile
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public AlertingProfile getAlertingProfile(UUID id) throws ApiException {
    ApiResponse<AlertingProfile> localVarResponse = getAlertingProfileWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets the properties of the specified alerting profile
   * 
   * @param id The ID of the required alerting profile. (required)
   * @return ApiResponse&lt;AlertingProfile&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AlertingProfile> getAlertingProfileWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAlertingProfileRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAlertingProfile", localVarResponse);
        }
        return new ApiResponse<AlertingProfile>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AlertingProfile>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAlertingProfileRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAlertingProfile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles/{id}"
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
   * Lists all alerting profiles available in your environment
   * 
   * @return StubList
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public StubList getAlertingProfiles() throws ApiException {
    ApiResponse<StubList> localVarResponse = getAlertingProfilesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists all alerting profiles available in your environment
   * 
   * @return ApiResponse&lt;StubList&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<StubList> getAlertingProfilesWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAlertingProfilesRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAlertingProfiles", localVarResponse);
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

  private HttpRequest.Builder getAlertingProfilesRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles";

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
   * Validates the payload the &#x60;POST /alertingProfiles&#x60; request
   * 
   * @param alertingProfile The JSON body of the request. Contains parameters of the alerting profile to be validated. (optional)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void validateCreateAlertingProfile(AlertingProfile alertingProfile) throws ApiException {
    validateCreateAlertingProfileWithHttpInfo(alertingProfile);
  }

  /**
   * Validates the payload the &#x60;POST /alertingProfiles&#x60; request
   * 
   * @param alertingProfile The JSON body of the request. Contains parameters of the alerting profile to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> validateCreateAlertingProfileWithHttpInfo(AlertingProfile alertingProfile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateCreateAlertingProfileRequestBuilder(alertingProfile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateCreateAlertingProfile", localVarResponse);
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

  private HttpRequest.Builder validateCreateAlertingProfileRequestBuilder(AlertingProfile alertingProfile) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles/validator";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(alertingProfile);
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
   * Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request
   * 
   * @param id The ID of the alerting profile to be validated. (required)
   * @param alertingProfile The JSON body of the request. Contains parameters of the alerting profile to be validated. (optional)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void validateCreateOrUpdateAlertingProfile(UUID id, AlertingProfile alertingProfile) throws ApiException {
    validateCreateOrUpdateAlertingProfileWithHttpInfo(id, alertingProfile);
  }

  /**
   * Validates the payload the &#x60;PUT /alertingProfiles/{id}&#x60; request
   * 
   * @param id The ID of the alerting profile to be validated. (required)
   * @param alertingProfile The JSON body of the request. Contains parameters of the alerting profile to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> validateCreateOrUpdateAlertingProfileWithHttpInfo(UUID id, AlertingProfile alertingProfile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateCreateOrUpdateAlertingProfileRequestBuilder(id, alertingProfile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateCreateOrUpdateAlertingProfile", localVarResponse);
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

  private HttpRequest.Builder validateCreateOrUpdateAlertingProfileRequestBuilder(UUID id, AlertingProfile alertingProfile) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling validateCreateOrUpdateAlertingProfile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/alertingProfiles/{id}/validator"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(alertingProfile);
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
}