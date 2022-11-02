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

import com.dynatrace.apis.envv2.model.ActiveGate;
import com.dynatrace.apis.envv2.model.ActiveGateList;
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
public class ActiveGatesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ActiveGatesApi() {
    this(new ApiClient());
  }

  public ActiveGatesApi(ApiClient apiClient) {
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
   * Lists all available ActiveGates
   * The response includes all ActiveGates that are currently connected to the environment or have been connected during last 2 hours.
   * @param hostname Filters the resulting set of ActiveGates by the name of the host it&#39;s running on.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param osType Filters the resulting set of ActiveGates by the OS type of the host it&#39;s running on. (optional)
   * @param networkAddress Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param loadBalancerAddress Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param type Filters the resulting set of ActiveGates by the ActiveGate type. (optional)
   * @param networkZone Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param updateStatus Filters the resulting set of ActiveGates by the auto-update status. (optional)
   * @param versionCompareType Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here. (optional, default to EQUAL)
   * @param version Filters the resulting set of ActiveGates by the specified version.    Specify the version in &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example, &#x60;1.195.0&#x60;) here. (optional)
   * @param autoUpdate Filters the resulting set of ActiveGates by the actual state of auto-update. (optional)
   * @param group Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param online Filters the resulting set of ActiveGates by the communication status. (optional)
   * @param enabledModule Filters the resulting set of ActiveGates by the enabled modules. (optional
   * @param disabledModule Filters the resulting set of ActiveGates by the disabled modules. (optional
   * @param containerized Filters the resulting set of ActiveGates to those which are running in container (&#x60;true&#x60;) or not (&#x60;false&#x60;). (optional)
   * @param tokenState Filters the resulting set of ActiveGates to those with authorization token in specified state. (optional)
   * @param tokenExpirationSet Filters the resulting set of ActiveGates to those with set expiration date for authorization token. (optional)
   * @return ActiveGateList
   * @throws ApiException if fails to make API call
   */
  public ActiveGateList getAllActiveGates(String hostname, String osType, String networkAddress, String loadBalancerAddress, String type, String networkZone, String updateStatus, String versionCompareType, String version, String autoUpdate, String group, Boolean online, List<String> enabledModule, List<String> disabledModule, Boolean containerized, String tokenState, Boolean tokenExpirationSet) throws ApiException {
    ApiResponse<ActiveGateList> localVarResponse = getAllActiveGatesWithHttpInfo(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet);
    return localVarResponse.getData();
  }

  /**
   * Lists all available ActiveGates
   * The response includes all ActiveGates that are currently connected to the environment or have been connected during last 2 hours.
   * @param hostname Filters the resulting set of ActiveGates by the name of the host it&#39;s running on.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param osType Filters the resulting set of ActiveGates by the OS type of the host it&#39;s running on. (optional)
   * @param networkAddress Filters the resulting set of ActiveGates by the network address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param loadBalancerAddress Filters the resulting set of ActiveGates by the Load Balancer address.    You can specify a partial address. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param type Filters the resulting set of ActiveGates by the ActiveGate type. (optional)
   * @param networkZone Filters the resulting set of ActiveGates by the network zone.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param updateStatus Filters the resulting set of ActiveGates by the auto-update status. (optional)
   * @param versionCompareType Filters the resulting set of ActiveGates by the specified version.    Specify the comparison operator here. (optional, default to EQUAL)
   * @param version Filters the resulting set of ActiveGates by the specified version.    Specify the version in &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example, &#x60;1.195.0&#x60;) here. (optional)
   * @param autoUpdate Filters the resulting set of ActiveGates by the actual state of auto-update. (optional)
   * @param group Filters the resulting set of ActiveGates by the group.    You can specify a partial name. In that case, the &#x60;CONTAINS&#x60; operator is used. (optional)
   * @param online Filters the resulting set of ActiveGates by the communication status. (optional)
   * @param enabledModule Filters the resulting set of ActiveGates by the enabled modules. (optional
   * @param disabledModule Filters the resulting set of ActiveGates by the disabled modules. (optional
   * @param containerized Filters the resulting set of ActiveGates to those which are running in container (&#x60;true&#x60;) or not (&#x60;false&#x60;). (optional)
   * @param tokenState Filters the resulting set of ActiveGates to those with authorization token in specified state. (optional)
   * @param tokenExpirationSet Filters the resulting set of ActiveGates to those with set expiration date for authorization token. (optional)
   * @return ApiResponse&lt;ActiveGateList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActiveGateList> getAllActiveGatesWithHttpInfo(String hostname, String osType, String networkAddress, String loadBalancerAddress, String type, String networkZone, String updateStatus, String versionCompareType, String version, String autoUpdate, String group, Boolean online, List<String> enabledModule, List<String> disabledModule, Boolean containerized, String tokenState, Boolean tokenExpirationSet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAllActiveGatesRequestBuilder(hostname, osType, networkAddress, loadBalancerAddress, type, networkZone, updateStatus, versionCompareType, version, autoUpdate, group, online, enabledModule, disabledModule, containerized, tokenState, tokenExpirationSet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAllActiveGates", localVarResponse);
        }
        return new ApiResponse<ActiveGateList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActiveGateList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAllActiveGatesRequestBuilder(String hostname, String osType, String networkAddress, String loadBalancerAddress, String type, String networkZone, String updateStatus, String versionCompareType, String version, String autoUpdate, String group, Boolean online, List<String> enabledModule, List<String> disabledModule, Boolean containerized, String tokenState, Boolean tokenExpirationSet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("hostname", hostname));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("osType", osType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("networkAddress", networkAddress));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("loadBalancerAddress", loadBalancerAddress));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("networkZone", networkZone));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("updateStatus", updateStatus));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("versionCompareType", versionCompareType));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("version", version));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("autoUpdate", autoUpdate));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("group", group));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("online", online));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "enabledModule", enabledModule));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("multi", "disabledModule", disabledModule));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("containerized", containerized));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("tokenState", tokenState));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("tokenExpirationSet", tokenExpirationSet));

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
   * Gets the details of the specified ActiveGate
   * 
   * @param agId The ID of the required ActiveGate. (required)
   * @return ActiveGate
   * @throws ApiException if fails to make API call
   */
  public ActiveGate getOneActiveGateById(String agId) throws ApiException {
    ApiResponse<ActiveGate> localVarResponse = getOneActiveGateByIdWithHttpInfo(agId);
    return localVarResponse.getData();
  }

  /**
   * Gets the details of the specified ActiveGate
   * 
   * @param agId The ID of the required ActiveGate. (required)
   * @return ApiResponse&lt;ActiveGate&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ActiveGate> getOneActiveGateByIdWithHttpInfo(String agId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getOneActiveGateByIdRequestBuilder(agId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getOneActiveGateById", localVarResponse);
        }
        return new ApiResponse<ActiveGate>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ActiveGate>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getOneActiveGateByIdRequestBuilder(String agId) throws ApiException {
    // verify the required parameter 'agId' is set
    if (agId == null) {
      throw new ApiException(400, "Missing the required parameter 'agId' when calling getOneActiveGateById");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/activeGates/{agId}"
        .replace("{agId}", ApiClient.urlEncode(agId.toString()));

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
}