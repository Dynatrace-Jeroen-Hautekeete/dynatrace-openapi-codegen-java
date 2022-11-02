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

import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.ManagementZone;
import com.dynatrace.apis.configv1.model.StubList;

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
public class ManagementZonesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ManagementZonesApi() {
    this(new ApiClient());
  }

  public ManagementZonesApi(ApiClient apiClient) {
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
   * Creates a new management zone
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param managementZone The JSON body of the request. Contains parameters of the new management zone. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation createManagementZone(ManagementZone managementZone) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = createManagementZoneWithHttpInfo(managementZone);
    return localVarResponse.getData();
  }

  /**
   * Creates a new management zone
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param managementZone The JSON body of the request. Contains parameters of the new management zone. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> createManagementZoneWithHttpInfo(ManagementZone managementZone) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createManagementZoneRequestBuilder(managementZone);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createManagementZone", localVarResponse);
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

  private HttpRequest.Builder createManagementZoneRequestBuilder(ManagementZone managementZone) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(managementZone);
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
   * Deletes the specified management zone
   * 
   * @param id The ID of the management zone to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteManagementZone(String id) throws ApiException {
    deleteManagementZoneWithHttpInfo(id);
  }

  /**
   * Deletes the specified management zone
   * 
   * @param id The ID of the management zone to delete. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteManagementZoneWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteManagementZoneRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteManagementZone", localVarResponse);
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

  private HttpRequest.Builder deleteManagementZoneRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteManagementZone");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones/{id}"
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
   * Lists the parameters of the specified management zone
   * 
   * @param id The ID of the required management zone. (required)
   * @param includeProcessGroupReferences Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed. (optional, default to false)
   * @return ManagementZone
   * @throws ApiException if fails to make API call
   */
  public ManagementZone getManagementZone(String id, Boolean includeProcessGroupReferences) throws ApiException {
    ApiResponse<ManagementZone> localVarResponse = getManagementZoneWithHttpInfo(id, includeProcessGroupReferences);
    return localVarResponse.getData();
  }

  /**
   * Lists the parameters of the specified management zone
   * 
   * @param id The ID of the required management zone. (required)
   * @param includeProcessGroupReferences Flag to include process group references to the response.    Process group references aren&#39;t compatible across environments. When this flag is set to false, conditions with process group references will be removed. If that leads to a rule having no conditions, the entire rule will be removed. (optional, default to false)
   * @return ApiResponse&lt;ManagementZone&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ManagementZone> getManagementZoneWithHttpInfo(String id, Boolean includeProcessGroupReferences) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getManagementZoneRequestBuilder(id, includeProcessGroupReferences);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getManagementZone", localVarResponse);
        }
        return new ApiResponse<ManagementZone>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ManagementZone>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getManagementZoneRequestBuilder(String id, Boolean includeProcessGroupReferences) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getManagementZone");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("includeProcessGroupReferences", includeProcessGroupReferences));

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
   * Lists all configured management zones
   * 
   * @return StubList
   * @throws ApiException if fails to make API call
   */
  public StubList listManagementZones() throws ApiException {
    ApiResponse<StubList> localVarResponse = listManagementZonesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists all configured management zones
   * 
   * @return ApiResponse&lt;StubList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StubList> listManagementZonesWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listManagementZonesRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listManagementZones", localVarResponse);
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

  private HttpRequest.Builder listManagementZonesRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones";

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
   * Updates the specified management zone
   * If a management zone with the specified ID doesn&#39;t exist, a new one is created.
   * @param id The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID. (required)
   * @param managementZone The JSON body of the request. Contains updated parameters of the management zone. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation updateManagementZone(String id, ManagementZone managementZone) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = updateManagementZoneWithHttpInfo(id, managementZone);
    return localVarResponse.getData();
  }

  /**
   * Updates the specified management zone
   * If a management zone with the specified ID doesn&#39;t exist, a new one is created.
   * @param id The ID of the management zone to be updated.   If you set the ID in the body as well, it must match this ID. (required)
   * @param managementZone The JSON body of the request. Contains updated parameters of the management zone. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> updateManagementZoneWithHttpInfo(String id, ManagementZone managementZone) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateManagementZoneRequestBuilder(id, managementZone);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateManagementZone", localVarResponse);
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

  private HttpRequest.Builder updateManagementZoneRequestBuilder(String id, ManagementZone managementZone) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateManagementZone");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(managementZone);
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
   * Validates a new management zone for the &#x60;POST /managementZones&#x60; request
   * 
   * @param managementZone The JSON body of the request, containing the management zone parameters to validate. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateCreateManagementZone(ManagementZone managementZone) throws ApiException {
    validateCreateManagementZoneWithHttpInfo(managementZone);
  }

  /**
   * Validates a new management zone for the &#x60;POST /managementZones&#x60; request
   * 
   * @param managementZone The JSON body of the request, containing the management zone parameters to validate. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateCreateManagementZoneWithHttpInfo(ManagementZone managementZone) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateCreateManagementZoneRequestBuilder(managementZone);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateCreateManagementZone", localVarResponse);
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

  private HttpRequest.Builder validateCreateManagementZoneRequestBuilder(ManagementZone managementZone) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones/validator";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(managementZone);
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
   * Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request
   * 
   * @param id The ID of the management zone to validate. (required)
   * @param managementZone The JSON body of the request, containing the management zone parameters to validate. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateUpdateManagementZone(String id, ManagementZone managementZone) throws ApiException {
    validateUpdateManagementZoneWithHttpInfo(id, managementZone);
  }

  /**
   * Validate updates of existing management zone for the &#x60;PUT /managementZones/{id}&#x60; request
   * 
   * @param id The ID of the management zone to validate. (required)
   * @param managementZone The JSON body of the request, containing the management zone parameters to validate. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateUpdateManagementZoneWithHttpInfo(String id, ManagementZone managementZone) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateUpdateManagementZoneRequestBuilder(id, managementZone);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateUpdateManagementZone", localVarResponse);
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

  private HttpRequest.Builder validateUpdateManagementZoneRequestBuilder(String id, ManagementZone managementZone) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling validateUpdateManagementZone");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/managementZones/{id}/validator"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(managementZone);
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