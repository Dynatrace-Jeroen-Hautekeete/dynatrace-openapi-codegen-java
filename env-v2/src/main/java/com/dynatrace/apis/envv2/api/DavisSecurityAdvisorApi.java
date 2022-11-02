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

import com.dynatrace.apis.envv2.model.DavisSecurityAdviceList;

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
public class DavisSecurityAdvisorApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public DavisSecurityAdvisorApi() {
    this(new ApiClient());
  }

  public DavisSecurityAdvisorApi(ApiClient apiClient) {
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
   * Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER
   * You can narrow down the output by providing the management zone and pagination. If you specify a management zone, only problems originating from that zone are included to the request.
   * @param managementZoneFilter To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\&quot;mzId-1\&quot;, \&quot;mzId-2\&quot;).  * Management zone names: names(\&quot;mz-1\&quot;, \&quot;mz-2\&quot;).   You can specify several comma-separated criteria (for example, &#x60;names(\&quot;myMz\&quot;),ids(\&quot;9130632296508575249\&quot;)&#x60;). (optional)
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used. (optional)
   * @return DavisSecurityAdviceList
   * @throws ApiException if fails to make API call
   */
  public DavisSecurityAdviceList getAdviceForSecurityProblems(String managementZoneFilter, String nextPageKey, Long pageSize) throws ApiException {
    ApiResponse<DavisSecurityAdviceList> localVarResponse = getAdviceForSecurityProblemsWithHttpInfo(managementZoneFilter, nextPageKey, pageSize);
    return localVarResponse.getData();
  }

  /**
   * Provides advice for security problems. | maturity&#x3D;EARLY_ADOPTER
   * You can narrow down the output by providing the management zone and pagination. If you specify a management zone, only problems originating from that zone are included to the request.
   * @param managementZoneFilter To specify management zones, use one of the options listed below. For each option you can specify multiple comma-separated values. If several values are specified, the **OR** logic applies. All values are case-sensitive and must be quoted.   * Management zone ID: ids(\&quot;mzId-1\&quot;, \&quot;mzId-2\&quot;).  * Management zone names: names(\&quot;mz-1\&quot;, \&quot;mz-2\&quot;).   You can specify several comma-separated criteria (for example, &#x60;names(\&quot;myMz\&quot;),ids(\&quot;9130632296508575249\&quot;)&#x60;). (optional)
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of security advices in a single response payload.   The maximal allowed page size is 500.   If not set, 5 is used. (optional)
   * @return ApiResponse&lt;DavisSecurityAdviceList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DavisSecurityAdviceList> getAdviceForSecurityProblemsWithHttpInfo(String managementZoneFilter, String nextPageKey, Long pageSize) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAdviceForSecurityProblemsRequestBuilder(managementZoneFilter, nextPageKey, pageSize);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAdviceForSecurityProblems", localVarResponse);
        }
        return new ApiResponse<DavisSecurityAdviceList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DavisSecurityAdviceList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAdviceForSecurityProblemsRequestBuilder(String managementZoneFilter, String nextPageKey, Long pageSize) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/davis/securityAdvices";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("managementZoneFilter", managementZoneFilter));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nextPageKey", nextPageKey));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));

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