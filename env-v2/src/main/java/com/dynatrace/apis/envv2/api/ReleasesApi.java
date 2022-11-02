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
import com.dynatrace.apis.envv2.model.Releases;

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
public class ReleasesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ReleasesApi() {
    this(new ApiClient());
  }

  public ReleasesApi(ApiClient apiClient) {
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
   * Returns all releases
   * 
   * @param from The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). (optional)
   * @param to The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of Releases in a single response payload.   The maximal allowed page size is 1000.   If not set, 100 is used. (optional)
   * @param demo Get your Releases (&#x60;false&#x60;) or a set of demo Releases (&#x60;true&#x60;). (optional, default to false)
   * @param releasesSelector Defines the scope of the query. Only Releases matching the provided criteria are included in the response.  You can add one or several of the criteria listed below. * Management zone: type(PROCESS_GROUP_INSTANCE),mzName(\&quot;ManagementZone-A\&quot;). Filters for all releases in the given management zone. The filter is case-sensitive. * Monitoring state: monitoringState(\&quot;Active\&quot;) or monitoringState(\&quot;Inactive\&quot;). You can specify only one monitoring state.  * Health state: healthState(\&quot;HEALTHY\&quot;) or healthState(\&quot;UNHEALTHY\&quot;). You can specify only one health state. * Security vulnerability: affectedBySecurityProblem(\&quot;Detected\&quot;) or affectedBySecurityProblem(\&quot;Not detected\&quot;). You can specify only one security vulnerability state. * Name: entityName(\&quot;name\&quot;). Filters for all releases that contain the given value in their name. The filter is case-insensitive. * Entity ID: entityId(\&quot;id\&quot;). * Product: releasesProduct(\&quot;product\&quot;). Filters for all releases that contain the given value in their product. The filter is case-insensitive. * Stage: releasesStage(\&quot;stage\&quot;). Filters for all releases that contain the given value in their stage. The filter is case-insensitive. * Version: releasesVersion(\&quot;version\&quot;). Filters for all releases that contain the given value in their version. The filter is case-insensitive.  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/releases?releasesSelector&#x3D;name(\&quot;Server\&quot;),monitoringState(\&quot;Active\&quot;),healthState(\&quot;HEALTHY\&quot;),releasesVersion(\&quot;1.0.7\&quot;).  The special characters ~ and \&quot; need to be escaped using a ~ (e.g. double quote search entityName(\&quot;~\&quot;\&quot;). (optional, default to )
   * @param sort Specifies the field that is used for sorting the releases list. The field has a sign prefix (+/-) which corresponds to the sorting order (&#39;+&#39; for ascending and &#39;-&#39; for descending). If no sign prefix is set, then the default ascending sorting order will be applied. You can sort by the following properties: * &#39;product&#39;: Product name * &#39;name&#39;: Release name * &#39;stage&#39;: Stage name * &#39;version&#39;: Version * &#39;instances&#39;: Instances * &#39;traffic&#39;: Traffic  If not set, the ascending order sorting for name is applied. (optional, default to name)
   * @return Releases
   * @throws ApiException if fails to make API call
   */
  public Releases getReleases(String from, String to, String nextPageKey, Long pageSize, Boolean demo, String releasesSelector, String sort) throws ApiException {
    ApiResponse<Releases> localVarResponse = getReleasesWithHttpInfo(from, to, nextPageKey, pageSize, demo, releasesSelector, sort);
    return localVarResponse.getData();
  }

  /**
   * Returns all releases
   * 
   * @param from The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two weeks is used (&#x60;now-2w&#x60;). (optional)
   * @param to The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. (optional)
   * @param nextPageKey The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  (optional)
   * @param pageSize The amount of Releases in a single response payload.   The maximal allowed page size is 1000.   If not set, 100 is used. (optional)
   * @param demo Get your Releases (&#x60;false&#x60;) or a set of demo Releases (&#x60;true&#x60;). (optional, default to false)
   * @param releasesSelector Defines the scope of the query. Only Releases matching the provided criteria are included in the response.  You can add one or several of the criteria listed below. * Management zone: type(PROCESS_GROUP_INSTANCE),mzName(\&quot;ManagementZone-A\&quot;). Filters for all releases in the given management zone. The filter is case-sensitive. * Monitoring state: monitoringState(\&quot;Active\&quot;) or monitoringState(\&quot;Inactive\&quot;). You can specify only one monitoring state.  * Health state: healthState(\&quot;HEALTHY\&quot;) or healthState(\&quot;UNHEALTHY\&quot;). You can specify only one health state. * Security vulnerability: affectedBySecurityProblem(\&quot;Detected\&quot;) or affectedBySecurityProblem(\&quot;Not detected\&quot;). You can specify only one security vulnerability state. * Name: entityName(\&quot;name\&quot;). Filters for all releases that contain the given value in their name. The filter is case-insensitive. * Entity ID: entityId(\&quot;id\&quot;). * Product: releasesProduct(\&quot;product\&quot;). Filters for all releases that contain the given value in their product. The filter is case-insensitive. * Stage: releasesStage(\&quot;stage\&quot;). Filters for all releases that contain the given value in their stage. The filter is case-insensitive. * Version: releasesVersion(\&quot;version\&quot;). Filters for all releases that contain the given value in their version. The filter is case-insensitive.  To set several criteria, separate them with comma (,). Only results matching all criteria are included in the response. e.g., .../api/v2/releases?releasesSelector&#x3D;name(\&quot;Server\&quot;),monitoringState(\&quot;Active\&quot;),healthState(\&quot;HEALTHY\&quot;),releasesVersion(\&quot;1.0.7\&quot;).  The special characters ~ and \&quot; need to be escaped using a ~ (e.g. double quote search entityName(\&quot;~\&quot;\&quot;). (optional, default to )
   * @param sort Specifies the field that is used for sorting the releases list. The field has a sign prefix (+/-) which corresponds to the sorting order (&#39;+&#39; for ascending and &#39;-&#39; for descending). If no sign prefix is set, then the default ascending sorting order will be applied. You can sort by the following properties: * &#39;product&#39;: Product name * &#39;name&#39;: Release name * &#39;stage&#39;: Stage name * &#39;version&#39;: Version * &#39;instances&#39;: Instances * &#39;traffic&#39;: Traffic  If not set, the ascending order sorting for name is applied. (optional, default to name)
   * @return ApiResponse&lt;Releases&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Releases> getReleasesWithHttpInfo(String from, String to, String nextPageKey, Long pageSize, Boolean demo, String releasesSelector, String sort) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getReleasesRequestBuilder(from, to, nextPageKey, pageSize, demo, releasesSelector, sort);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getReleases", localVarResponse);
        }
        return new ApiResponse<Releases>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Releases>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getReleasesRequestBuilder(String from, String to, String nextPageKey, Long pageSize, Boolean demo, String releasesSelector, String sort) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/releases";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("from", from));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("to", to));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("nextPageKey", nextPageKey));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("demo", demo));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("releasesSelector", releasesSelector));
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
}