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

import com.dynatrace.apis.envv1.model.CustomDevicePushMessage;
import com.dynatrace.apis.envv1.model.CustomDevicePushResult;
import com.dynatrace.apis.envv1.model.ErrorEnvelope;

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
public class TopologySmartscapeCustomDeviceApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public TopologySmartscapeCustomDeviceApi() {
    this(new ApiClient());
  }

  public TopologySmartscapeCustomDeviceApi(ApiClient apiClient) {
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
   * Creates or updates a custom device, or reports metric data points to the custom device.
   * 
   * @param customDeviceId The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don&#39;t use Dynatrace entity ID here. (required)
   * @param customDevicePushMessage The JSON body of the request. Contains parameters of a custom device. (optional)
   * @return CustomDevicePushResult
   * @throws ApiException if fails to make API call
   */
  public CustomDevicePushResult createCustomDataPoints(String customDeviceId, CustomDevicePushMessage customDevicePushMessage) throws ApiException {
    ApiResponse<CustomDevicePushResult> localVarResponse = createCustomDataPointsWithHttpInfo(customDeviceId, customDevicePushMessage);
    return localVarResponse.getData();
  }

  /**
   * Creates or updates a custom device, or reports metric data points to the custom device.
   * 
   * @param customDeviceId The ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated.   Don&#39;t use Dynatrace entity ID here. (required)
   * @param customDevicePushMessage The JSON body of the request. Contains parameters of a custom device. (optional)
   * @return ApiResponse&lt;CustomDevicePushResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CustomDevicePushResult> createCustomDataPointsWithHttpInfo(String customDeviceId, CustomDevicePushMessage customDevicePushMessage) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createCustomDataPointsRequestBuilder(customDeviceId, customDevicePushMessage);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createCustomDataPoints", localVarResponse);
        }
        return new ApiResponse<CustomDevicePushResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CustomDevicePushResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createCustomDataPointsRequestBuilder(String customDeviceId, CustomDevicePushMessage customDevicePushMessage) throws ApiException {
    // verify the required parameter 'customDeviceId' is set
    if (customDeviceId == null) {
      throw new ApiException(400, "Missing the required parameter 'customDeviceId' when calling createCustomDataPoints");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/entity/infrastructure/custom/{customDeviceId}"
        .replace("{customDeviceId}", ApiClient.urlEncode(customDeviceId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(customDevicePushMessage);
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
