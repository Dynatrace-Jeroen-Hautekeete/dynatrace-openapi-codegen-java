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

import com.dynatrace.apis.envv1.model.Threshold;
import com.dynatrace.apis.envv1.model.ThresholdRegistrationMessage;

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
public class ThresholdApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ThresholdApi() {
    this(new ApiClient());
  }

  public ThresholdApi(ApiClient apiClient) {
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
   * Creates or updates an existing threshold for a plugin or a custom event
   * 
   * @param thresholdId The ID of the threshold to create or update. (required)
   * @param thresholdRegistrationMessage JSON body of the request, containing threshold parameters. (optional)
   * @return Threshold
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public Threshold createCustomThreshold(String thresholdId, ThresholdRegistrationMessage thresholdRegistrationMessage) throws ApiException {
    ApiResponse<Threshold> localVarResponse = createCustomThresholdWithHttpInfo(thresholdId, thresholdRegistrationMessage);
    return localVarResponse.getData();
  }

  /**
   * Creates or updates an existing threshold for a plugin or a custom event
   * 
   * @param thresholdId The ID of the threshold to create or update. (required)
   * @param thresholdRegistrationMessage JSON body of the request, containing threshold parameters. (optional)
   * @return ApiResponse&lt;Threshold&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Threshold> createCustomThresholdWithHttpInfo(String thresholdId, ThresholdRegistrationMessage thresholdRegistrationMessage) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createCustomThresholdRequestBuilder(thresholdId, thresholdRegistrationMessage);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createCustomThreshold", localVarResponse);
        }
        return new ApiResponse<Threshold>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Threshold>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createCustomThresholdRequestBuilder(String thresholdId, ThresholdRegistrationMessage thresholdRegistrationMessage) throws ApiException {
    // verify the required parameter 'thresholdId' is set
    if (thresholdId == null) {
      throw new ApiException(400, "Missing the required parameter 'thresholdId' when calling createCustomThreshold");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/thresholds/{thresholdId}"
        .replace("{thresholdId}", ApiClient.urlEncode(thresholdId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(thresholdRegistrationMessage);
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
   * Deletes the specified threshold
   * 
   * @param thresholdId The ID of the threshold to delete. (required)
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public void deleteCustomThreshold(String thresholdId) throws ApiException {
    deleteCustomThresholdWithHttpInfo(thresholdId);
  }

  /**
   * Deletes the specified threshold
   * 
   * @param thresholdId The ID of the threshold to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> deleteCustomThresholdWithHttpInfo(String thresholdId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteCustomThresholdRequestBuilder(thresholdId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteCustomThreshold", localVarResponse);
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

  private HttpRequest.Builder deleteCustomThresholdRequestBuilder(String thresholdId) throws ApiException {
    // verify the required parameter 'thresholdId' is set
    if (thresholdId == null) {
      throw new ApiException(400, "Missing the required parameter 'thresholdId' when calling deleteCustomThreshold");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/thresholds/{thresholdId}"
        .replace("{thresholdId}", ApiClient.urlEncode(thresholdId.toString()));

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
   * Gets all configured thresholds for plugins and custom events in your environment
   * 
   * @param filter Filters thresholds by the source. (optional)
   * @return List&lt;Threshold&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public List<Threshold> readCustomThresholds(String filter) throws ApiException {
    ApiResponse<List<Threshold>> localVarResponse = readCustomThresholdsWithHttpInfo(filter);
    return localVarResponse.getData();
  }

  /**
   * Gets all configured thresholds for plugins and custom events in your environment
   * 
   * @param filter Filters thresholds by the source. (optional)
   * @return ApiResponse&lt;List&lt;Threshold&gt;&gt;
   * @throws ApiException if fails to make API call
   * @deprecated
   */
  @Deprecated
  public ApiResponse<List<Threshold>> readCustomThresholdsWithHttpInfo(String filter) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = readCustomThresholdsRequestBuilder(filter);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("readCustomThresholds", localVarResponse);
        }
        return new ApiResponse<List<Threshold>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<Threshold>>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder readCustomThresholdsRequestBuilder(String filter) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/thresholds";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filter", filter));

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