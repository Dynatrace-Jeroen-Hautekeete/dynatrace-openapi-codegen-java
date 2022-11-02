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
import com.dynatrace.apis.envv2.model.SchemaDefinitionRestDto;
import com.dynatrace.apis.envv2.model.SchemaList;

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
public class SettingsSchemasApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SettingsSchemasApi() {
    this(new ApiClient());
  }

  public SettingsSchemasApi(ApiClient apiClient) {
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
   * Lists available settings schemas
   * 
   * @return SchemaList
   * @throws ApiException if fails to make API call
   */
  public SchemaList getAvailableSchemaDefinitions() throws ApiException {
    ApiResponse<SchemaList> localVarResponse = getAvailableSchemaDefinitionsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists available settings schemas
   * 
   * @return ApiResponse&lt;SchemaList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaList> getAvailableSchemaDefinitionsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAvailableSchemaDefinitionsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAvailableSchemaDefinitions", localVarResponse);
        }
        return new ApiResponse<SchemaList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SchemaList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAvailableSchemaDefinitionsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/settings/schemas";

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
   * Gets parameters of the specified settings schema
   * 
   * @param schemaId The ID of the required schema. (required)
   * @param schemaVersion The version of the required schema.    If not set, the most recent version is returned. (optional)
   * @return SchemaDefinitionRestDto
   * @throws ApiException if fails to make API call
   */
  public SchemaDefinitionRestDto getSchemaDefinition(String schemaId, String schemaVersion) throws ApiException {
    ApiResponse<SchemaDefinitionRestDto> localVarResponse = getSchemaDefinitionWithHttpInfo(schemaId, schemaVersion);
    return localVarResponse.getData();
  }

  /**
   * Gets parameters of the specified settings schema
   * 
   * @param schemaId The ID of the required schema. (required)
   * @param schemaVersion The version of the required schema.    If not set, the most recent version is returned. (optional)
   * @return ApiResponse&lt;SchemaDefinitionRestDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SchemaDefinitionRestDto> getSchemaDefinitionWithHttpInfo(String schemaId, String schemaVersion) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSchemaDefinitionRequestBuilder(schemaId, schemaVersion);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSchemaDefinition", localVarResponse);
        }
        return new ApiResponse<SchemaDefinitionRestDto>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SchemaDefinitionRestDto>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getSchemaDefinitionRequestBuilder(String schemaId, String schemaVersion) throws ApiException {
    // verify the required parameter 'schemaId' is set
    if (schemaId == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaId' when calling getSchemaDefinition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/settings/schemas/{schemaId}"
        .replace("{schemaId}", ApiClient.urlEncode(schemaId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("schemaVersion", schemaVersion));

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
