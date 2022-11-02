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

import com.dynatrace.apis.envv2.model.ErrorEnvelope;
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementJob;
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementJobList;
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementOperationActiveGateRequest;
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementPreviewList;
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementValidationResult;

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
public class ActiveGatesRemoteConfigurationManagementApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ActiveGatesRemoteConfigurationManagementApi() {
    this(new ApiClient());
  }

  public ActiveGatesRemoteConfigurationManagementApi(ApiClient apiClient) {
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
   * Creates a new remote configuration management job
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @return RemoteConfigurationManagementJob
   * @throws ApiException if fails to make API call
   */
  public RemoteConfigurationManagementJob createRemoteIdentityOperationJob(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    ApiResponse<RemoteConfigurationManagementJob> localVarResponse = createRemoteIdentityOperationJobWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
    return localVarResponse.getData();
  }

  /**
   * Creates a new remote configuration management job
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @return ApiResponse&lt;RemoteConfigurationManagementJob&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoteConfigurationManagementJob> createRemoteIdentityOperationJobWithHttpInfo(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createRemoteIdentityOperationJobRequestBuilder(remoteConfigurationManagementOperationActiveGateRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createRemoteIdentityOperationJob", localVarResponse);
        }
        return new ApiResponse<RemoteConfigurationManagementJob>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RemoteConfigurationManagementJob>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createRemoteIdentityOperationJobRequestBuilder(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    // verify the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' is set
    if (remoteConfigurationManagementOperationActiveGateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' when calling createRemoteIdentityOperationJob");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(remoteConfigurationManagementOperationActiveGateRequest);
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
   * Creates a preview for remote configuration management job
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @return RemoteConfigurationManagementPreviewList
   * @throws ApiException if fails to make API call
   */
  public RemoteConfigurationManagementPreviewList createRemoteIdentityOperationPreview(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    ApiResponse<RemoteConfigurationManagementPreviewList> localVarResponse = createRemoteIdentityOperationPreviewWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
    return localVarResponse.getData();
  }

  /**
   * Creates a preview for remote configuration management job
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @return ApiResponse&lt;RemoteConfigurationManagementPreviewList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoteConfigurationManagementPreviewList> createRemoteIdentityOperationPreviewWithHttpInfo(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createRemoteIdentityOperationPreviewRequestBuilder(remoteConfigurationManagementOperationActiveGateRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createRemoteIdentityOperationPreview", localVarResponse);
        }
        return new ApiResponse<RemoteConfigurationManagementPreviewList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RemoteConfigurationManagementPreviewList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createRemoteIdentityOperationPreviewRequestBuilder(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    // verify the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' is set
    if (remoteConfigurationManagementOperationActiveGateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' when calling createRemoteIdentityOperationPreview");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement/preview";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(remoteConfigurationManagementOperationActiveGateRequest);
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
   * Gets remote configuration management job that is currently running
   * The currently running remote configuration management job may be related to ActiveGates or OneAgents. There is a limit of one concurrent remote configuration management job, regardless of the entity type.
   * @return RemoteConfigurationManagementJob
   * @throws ApiException if fails to make API call
   */
  public RemoteConfigurationManagementJob getCurrentRemoteIdentityOperationJob() throws ApiException {
    ApiResponse<RemoteConfigurationManagementJob> localVarResponse = getCurrentRemoteIdentityOperationJobWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Gets remote configuration management job that is currently running
   * The currently running remote configuration management job may be related to ActiveGates or OneAgents. There is a limit of one concurrent remote configuration management job, regardless of the entity type.
   * @return ApiResponse&lt;RemoteConfigurationManagementJob&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoteConfigurationManagementJob> getCurrentRemoteIdentityOperationJobWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getCurrentRemoteIdentityOperationJobRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getCurrentRemoteIdentityOperationJob", localVarResponse);
        }
        return new ApiResponse<RemoteConfigurationManagementJob>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RemoteConfigurationManagementJob>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getCurrentRemoteIdentityOperationJobRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement/current";

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
   * Gets the specified remote configuration management job
   * 
   * @param id The ID of the required remote configuration management job. (required)
   * @return RemoteConfigurationManagementJob
   * @throws ApiException if fails to make API call
   */
  public RemoteConfigurationManagementJob getRemoteIdentityOperationJob(String id) throws ApiException {
    ApiResponse<RemoteConfigurationManagementJob> localVarResponse = getRemoteIdentityOperationJobWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets the specified remote configuration management job
   * 
   * @param id The ID of the required remote configuration management job. (required)
   * @return ApiResponse&lt;RemoteConfigurationManagementJob&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoteConfigurationManagementJob> getRemoteIdentityOperationJobWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getRemoteIdentityOperationJobRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getRemoteIdentityOperationJob", localVarResponse);
        }
        return new ApiResponse<RemoteConfigurationManagementJob>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RemoteConfigurationManagementJob>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getRemoteIdentityOperationJobRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRemoteIdentityOperationJob");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement/{id}"
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
   * Lists finished ActiveGate remote configuration management jobs
   * The response includes finished jobs for the last 7 days.
   * @param from The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    (optional)
   * @param to The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @return RemoteConfigurationManagementJobList
   * @throws ApiException if fails to make API call
   */
  public RemoteConfigurationManagementJobList getRemoteIdentityOperations(String from, String to) throws ApiException {
    ApiResponse<RemoteConfigurationManagementJobList> localVarResponse = getRemoteIdentityOperationsWithHttpInfo(from, to);
    return localVarResponse.getData();
  }

  /**
   * Lists finished ActiveGate remote configuration management jobs
   * The response includes finished jobs for the last 7 days.
   * @param from The start of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    (optional)
   * @param to The end of the requested timeframe for a remote configuration management job.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @return ApiResponse&lt;RemoteConfigurationManagementJobList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoteConfigurationManagementJobList> getRemoteIdentityOperationsWithHttpInfo(String from, String to) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getRemoteIdentityOperationsRequestBuilder(from, to);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getRemoteIdentityOperations", localVarResponse);
        }
        return new ApiResponse<RemoteConfigurationManagementJobList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RemoteConfigurationManagementJobList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getRemoteIdentityOperationsRequestBuilder(String from, String to) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement";

    List<Pair> localVarQueryParams = new ArrayList<>();
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
   * Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request.
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @throws ApiException if fails to make API call
   */
  public void validateRemoteIdentityOperation(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    validateRemoteIdentityOperationWithHttpInfo(remoteConfigurationManagementOperationActiveGateRequest);
  }

  /**
   * Validates the payload for the &#x60;POST /activeGates/remoteConfigurationManagement&#x60; request.
   * 
   * @param remoteConfigurationManagementOperationActiveGateRequest JSON body of the request, containing remote configuration management job definition. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateRemoteIdentityOperationWithHttpInfo(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateRemoteIdentityOperationRequestBuilder(remoteConfigurationManagementOperationActiveGateRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateRemoteIdentityOperation", localVarResponse);
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

  private HttpRequest.Builder validateRemoteIdentityOperationRequestBuilder(RemoteConfigurationManagementOperationActiveGateRequest remoteConfigurationManagementOperationActiveGateRequest) throws ApiException {
    // verify the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' is set
    if (remoteConfigurationManagementOperationActiveGateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'remoteConfigurationManagementOperationActiveGateRequest' when calling validateRemoteIdentityOperation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/remoteConfigurationManagement/validator";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(remoteConfigurationManagementOperationActiveGateRequest);
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