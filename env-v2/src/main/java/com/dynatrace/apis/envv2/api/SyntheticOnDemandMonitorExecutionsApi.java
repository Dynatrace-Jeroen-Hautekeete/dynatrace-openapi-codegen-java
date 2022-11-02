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

import com.dynatrace.apis.envv2.model.SyntheticOnDemandBatchStatus;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecution;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutionRequest;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutionResult;
import com.dynatrace.apis.envv2.model.SyntheticOnDemandExecutions;

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
public class SyntheticOnDemandMonitorExecutionsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SyntheticOnDemandMonitorExecutionsApi() {
    this(new ApiClient());
  }

  public SyntheticOnDemandMonitorExecutionsApi(ApiClient apiClient) {
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
   * Triggers on-demand executions for synthetic monitors | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param syntheticOnDemandExecutionRequest The JSON body of the request. Contains the parameters of the triggered on-demand execution. (optional)
   * @return SyntheticOnDemandExecutionResult
   * @throws ApiException if fails to make API call
   */
  public SyntheticOnDemandExecutionResult execute(SyntheticOnDemandExecutionRequest syntheticOnDemandExecutionRequest) throws ApiException {
    ApiResponse<SyntheticOnDemandExecutionResult> localVarResponse = executeWithHttpInfo(syntheticOnDemandExecutionRequest);
    return localVarResponse.getData();
  }

  /**
   * Triggers on-demand executions for synthetic monitors | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param syntheticOnDemandExecutionRequest The JSON body of the request. Contains the parameters of the triggered on-demand execution. (optional)
   * @return ApiResponse&lt;SyntheticOnDemandExecutionResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticOnDemandExecutionResult> executeWithHttpInfo(SyntheticOnDemandExecutionRequest syntheticOnDemandExecutionRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = executeRequestBuilder(syntheticOnDemandExecutionRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("execute", localVarResponse);
        }
        return new ApiResponse<SyntheticOnDemandExecutionResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticOnDemandExecutionResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder executeRequestBuilder(SyntheticOnDemandExecutionRequest syntheticOnDemandExecutionRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/executions/batch";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(syntheticOnDemandExecutionRequest);
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
   * Gets summary information and the list of failed executions for the given batch ID | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param batchId The batch identifier of the executions. (required)
   * @return SyntheticOnDemandBatchStatus
   * @throws ApiException if fails to make API call
   */
  public SyntheticOnDemandBatchStatus getBatch(Long batchId) throws ApiException {
    ApiResponse<SyntheticOnDemandBatchStatus> localVarResponse = getBatchWithHttpInfo(batchId);
    return localVarResponse.getData();
  }

  /**
   * Gets summary information and the list of failed executions for the given batch ID | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param batchId The batch identifier of the executions. (required)
   * @return ApiResponse&lt;SyntheticOnDemandBatchStatus&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticOnDemandBatchStatus> getBatchWithHttpInfo(Long batchId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getBatchRequestBuilder(batchId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getBatch", localVarResponse);
        }
        return new ApiResponse<SyntheticOnDemandBatchStatus>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticOnDemandBatchStatus>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getBatchRequestBuilder(Long batchId) throws ApiException {
    // verify the required parameter 'batchId' is set
    if (batchId == null) {
      throw new ApiException(400, "Missing the required parameter 'batchId' when calling getBatch");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/executions/batch/{batchId}"
        .replace("{batchId}", ApiClient.urlEncode(batchId.toString()));

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
   * Gets basic results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionId The identifier of the on-demand execution. (required)
   * @return SyntheticOnDemandExecution
   * @throws ApiException if fails to make API call
   */
  public SyntheticOnDemandExecution getExecution(Long executionId) throws ApiException {
    ApiResponse<SyntheticOnDemandExecution> localVarResponse = getExecutionWithHttpInfo(executionId);
    return localVarResponse.getData();
  }

  /**
   * Gets basic results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionId The identifier of the on-demand execution. (required)
   * @return ApiResponse&lt;SyntheticOnDemandExecution&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticOnDemandExecution> getExecutionWithHttpInfo(Long executionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExecutionRequestBuilder(executionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getExecution", localVarResponse);
        }
        return new ApiResponse<SyntheticOnDemandExecution>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticOnDemandExecution>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getExecutionRequestBuilder(Long executionId) throws ApiException {
    // verify the required parameter 'executionId' is set
    if (executionId == null) {
      throw new ApiException(400, "Missing the required parameter 'executionId' when calling getExecution");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/executions/{executionId}"
        .replace("{executionId}", ApiClient.urlEncode(executionId.toString()));

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
   * Gets detailed results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionId The identifier of the on-demand execution. (required)
   * @return SyntheticOnDemandExecution
   * @throws ApiException if fails to make API call
   */
  public SyntheticOnDemandExecution getExecutionFullReport(Long executionId) throws ApiException {
    ApiResponse<SyntheticOnDemandExecution> localVarResponse = getExecutionFullReportWithHttpInfo(executionId);
    return localVarResponse.getData();
  }

  /**
   * Gets detailed results of the specified on-demand execution | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionId The identifier of the on-demand execution. (required)
   * @return ApiResponse&lt;SyntheticOnDemandExecution&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticOnDemandExecution> getExecutionFullReportWithHttpInfo(Long executionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExecutionFullReportRequestBuilder(executionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getExecutionFullReport", localVarResponse);
        }
        return new ApiResponse<SyntheticOnDemandExecution>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticOnDemandExecution>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getExecutionFullReportRequestBuilder(Long executionId) throws ApiException {
    // verify the required parameter 'executionId' is set
    if (executionId == null) {
      throw new ApiException(400, "Missing the required parameter 'executionId' when calling getExecutionFullReport");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/executions/{executionId}/fullReport"
        .replace("{executionId}", ApiClient.urlEncode(executionId.toString()));

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
   * Gets the list of all on-demand executions of synthetic monitors | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionStage Filters the resulting set of executions by their stage. (optional)
   * @param schedulingFrom The start of the requested timeframe for scheduling timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param schedulingTo The end of the requested timeframe for scheduling timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param executionFrom The start of the requested timeframe for execution timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param executionTo The end of the requested timeframe for execution timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param dataDeliveryFrom The start of the requested timeframe for data delivering timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param dataDeliveryTo The end of the requested timeframe for data delivering timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param batchId Filters the resulting set of the executions by batch. Specify the ID of the batch. (optional)
   * @param monitorId Filters the resulting set of the executions by monitor synthetic monitor. Specify the ID of the monitor. (optional)
   * @param locationId Filters the resulting set of the executions by Synthetic location. Specify the ID of the location. (optional)
   * @param userId Filters the resulting set of executions by scheduled user. (optional)
   * @param source Filters the resulting set of the executions by the source of the triggering request. (optional)
   * @return SyntheticOnDemandExecutions
   * @throws ApiException if fails to make API call
   */
  public SyntheticOnDemandExecutions getExecutions(String executionStage, String schedulingFrom, String schedulingTo, String executionFrom, String executionTo, String dataDeliveryFrom, String dataDeliveryTo, Long batchId, String monitorId, String locationId, String userId, String source) throws ApiException {
    ApiResponse<SyntheticOnDemandExecutions> localVarResponse = getExecutionsWithHttpInfo(executionStage, schedulingFrom, schedulingTo, executionFrom, executionTo, dataDeliveryFrom, dataDeliveryTo, batchId, monitorId, locationId, userId, source);
    return localVarResponse.getData();
  }

  /**
   * Gets the list of all on-demand executions of synthetic monitors | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param executionStage Filters the resulting set of executions by their stage. (optional)
   * @param schedulingFrom The start of the requested timeframe for scheduling timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param schedulingTo The end of the requested timeframe for scheduling timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param executionFrom The start of the requested timeframe for execution timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param executionTo The end of the requested timeframe for execution timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param dataDeliveryFrom The start of the requested timeframe for data delivering timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the maximum relative timeframe of six hours is used (&#x60;now-6h&#x60;). (optional)
   * @param dataDeliveryTo The end of the requested timeframe for data delivering timestamps.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param batchId Filters the resulting set of the executions by batch. Specify the ID of the batch. (optional)
   * @param monitorId Filters the resulting set of the executions by monitor synthetic monitor. Specify the ID of the monitor. (optional)
   * @param locationId Filters the resulting set of the executions by Synthetic location. Specify the ID of the location. (optional)
   * @param userId Filters the resulting set of executions by scheduled user. (optional)
   * @param source Filters the resulting set of the executions by the source of the triggering request. (optional)
   * @return ApiResponse&lt;SyntheticOnDemandExecutions&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticOnDemandExecutions> getExecutionsWithHttpInfo(String executionStage, String schedulingFrom, String schedulingTo, String executionFrom, String executionTo, String dataDeliveryFrom, String dataDeliveryTo, Long batchId, String monitorId, String locationId, String userId, String source) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getExecutionsRequestBuilder(executionStage, schedulingFrom, schedulingTo, executionFrom, executionTo, dataDeliveryFrom, dataDeliveryTo, batchId, monitorId, locationId, userId, source);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getExecutions", localVarResponse);
        }
        return new ApiResponse<SyntheticOnDemandExecutions>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticOnDemandExecutions>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getExecutionsRequestBuilder(String executionStage, String schedulingFrom, String schedulingTo, String executionFrom, String executionTo, String dataDeliveryFrom, String dataDeliveryTo, Long batchId, String monitorId, String locationId, String userId, String source) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/executions";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("executionStage", executionStage));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("schedulingFrom", schedulingFrom));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("schedulingTo", schedulingTo));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("executionFrom", executionFrom));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("executionTo", executionTo));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dataDeliveryFrom", dataDeliveryFrom));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("dataDeliveryTo", dataDeliveryTo));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("batchId", batchId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("monitorId", monitorId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("locationId", locationId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("userId", userId));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("source", source));

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
}
