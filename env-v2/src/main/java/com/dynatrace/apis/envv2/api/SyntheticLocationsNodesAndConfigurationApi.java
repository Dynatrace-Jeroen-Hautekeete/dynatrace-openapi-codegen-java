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

import com.dynatrace.apis.envv2.model.Node;
import com.dynatrace.apis.envv2.model.Nodes;
import com.dynatrace.apis.envv2.model.PrivateSyntheticLocation;
import com.dynatrace.apis.envv2.model.SyntheticConfigDto;
import com.dynatrace.apis.envv2.model.SyntheticLocation;
import com.dynatrace.apis.envv2.model.SyntheticLocationIdsDto;
import com.dynatrace.apis.envv2.model.SyntheticLocationUpdate;
import com.dynatrace.apis.envv2.model.SyntheticLocations;
import com.dynatrace.apis.envv2.model.SyntheticPublicLocationsStatus;

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
public class SyntheticLocationsNodesAndConfigurationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SyntheticLocationsNodesAndConfigurationApi() {
    this(new ApiClient());
  }

  public SyntheticLocationsNodesAndConfigurationApi(ApiClient apiClient) {
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
   * Creates a new private synthetic location
   * 
   * @param privateSyntheticLocation The JSON body of the request. Contains parameters of the new private synthetic location. (optional)
   * @return SyntheticLocationIdsDto
   * @throws ApiException if fails to make API call
   */
  public SyntheticLocationIdsDto addLocation(PrivateSyntheticLocation privateSyntheticLocation) throws ApiException {
    ApiResponse<SyntheticLocationIdsDto> localVarResponse = addLocationWithHttpInfo(privateSyntheticLocation);
    return localVarResponse.getData();
  }

  /**
   * Creates a new private synthetic location
   * 
   * @param privateSyntheticLocation The JSON body of the request. Contains parameters of the new private synthetic location. (optional)
   * @return ApiResponse&lt;SyntheticLocationIdsDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticLocationIdsDto> addLocationWithHttpInfo(PrivateSyntheticLocation privateSyntheticLocation) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = addLocationRequestBuilder(privateSyntheticLocation);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("addLocation", localVarResponse);
        }
        return new ApiResponse<SyntheticLocationIdsDto>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticLocationIdsDto>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder addLocationRequestBuilder(PrivateSyntheticLocation privateSyntheticLocation) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(privateSyntheticLocation);
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
   * Gets set of synthetic related parameters defined for whole tenant (affects all monitors and all private locations). | maturity&#x3D;EARLY_ADOPTER
   * 
   * @return SyntheticConfigDto
   * @throws ApiException if fails to make API call
   */
  public SyntheticConfigDto getConfiguration() throws ApiException {
    ApiResponse<SyntheticConfigDto> localVarResponse = getConfigurationWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Gets set of synthetic related parameters defined for whole tenant (affects all monitors and all private locations). | maturity&#x3D;EARLY_ADOPTER
   * 
   * @return ApiResponse&lt;SyntheticConfigDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticConfigDto> getConfigurationWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getConfigurationRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getConfiguration", localVarResponse);
        }
        return new ApiResponse<SyntheticConfigDto>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticConfigDto>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getConfigurationRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/config";

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
   * Gets properties of the specified location
   * 
   * @param locationId The Dynatrace entity ID of the required location. (required)
   * @return SyntheticLocation
   * @throws ApiException if fails to make API call
   */
  public SyntheticLocation getLocation(String locationId) throws ApiException {
    ApiResponse<SyntheticLocation> localVarResponse = getLocationWithHttpInfo(locationId);
    return localVarResponse.getData();
  }

  /**
   * Gets properties of the specified location
   * 
   * @param locationId The Dynatrace entity ID of the required location. (required)
   * @return ApiResponse&lt;SyntheticLocation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticLocation> getLocationWithHttpInfo(String locationId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLocationRequestBuilder(locationId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getLocation", localVarResponse);
        }
        return new ApiResponse<SyntheticLocation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticLocation>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getLocationRequestBuilder(String locationId) throws ApiException {
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling getLocation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations/{locationId}"
        .replace("{locationId}", ApiClient.urlEncode(locationId.toString()));

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
   * Lists all synthetic locations (both public and private) available for your environment
   * 
   * @param cloudPlatform Filters the resulting set of locations to those which are hosted on a specific cloud platform. (optional)
   * @param type Filters the resulting set of locations to those of a specific type. (optional)
   * @return SyntheticLocations
   * @throws ApiException if fails to make API call
   */
  public SyntheticLocations getLocations(String cloudPlatform, String type) throws ApiException {
    ApiResponse<SyntheticLocations> localVarResponse = getLocationsWithHttpInfo(cloudPlatform, type);
    return localVarResponse.getData();
  }

  /**
   * Lists all synthetic locations (both public and private) available for your environment
   * 
   * @param cloudPlatform Filters the resulting set of locations to those which are hosted on a specific cloud platform. (optional)
   * @param type Filters the resulting set of locations to those of a specific type. (optional)
   * @return ApiResponse&lt;SyntheticLocations&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticLocations> getLocationsWithHttpInfo(String cloudPlatform, String type) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLocationsRequestBuilder(cloudPlatform, type);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getLocations", localVarResponse);
        }
        return new ApiResponse<SyntheticLocations>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticLocations>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getLocationsRequestBuilder(String cloudPlatform, String type) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("cloudPlatform", cloudPlatform));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));

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
   * Checks the status of public synthetic locations
   * 
   * @return SyntheticPublicLocationsStatus
   * @throws ApiException if fails to make API call
   */
  public SyntheticPublicLocationsStatus getLocationsStatus() throws ApiException {
    ApiResponse<SyntheticPublicLocationsStatus> localVarResponse = getLocationsStatusWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Checks the status of public synthetic locations
   * 
   * @return ApiResponse&lt;SyntheticPublicLocationsStatus&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticPublicLocationsStatus> getLocationsStatusWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getLocationsStatusRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getLocationsStatus", localVarResponse);
        }
        return new ApiResponse<SyntheticPublicLocationsStatus>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticPublicLocationsStatus>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getLocationsStatusRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations/status";

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
   * Lists properties of the specified synthetic node
   * 
   * @param nodeId The ID of the required synthetic node. (required)
   * @return Node
   * @throws ApiException if fails to make API call
   */
  public Node getNode(String nodeId) throws ApiException {
    ApiResponse<Node> localVarResponse = getNodeWithHttpInfo(nodeId);
    return localVarResponse.getData();
  }

  /**
   * Lists properties of the specified synthetic node
   * 
   * @param nodeId The ID of the required synthetic node. (required)
   * @return ApiResponse&lt;Node&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Node> getNodeWithHttpInfo(String nodeId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getNodeRequestBuilder(nodeId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getNode", localVarResponse);
        }
        return new ApiResponse<Node>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Node>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getNodeRequestBuilder(String nodeId) throws ApiException {
    // verify the required parameter 'nodeId' is set
    if (nodeId == null) {
      throw new ApiException(400, "Missing the required parameter 'nodeId' when calling getNode");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/nodes/{nodeId}"
        .replace("{nodeId}", ApiClient.urlEncode(nodeId.toString()));

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
   * Lists all synthetic nodes available in your environment
   * 
   * @return Nodes
   * @throws ApiException if fails to make API call
   */
  public Nodes getNodes() throws ApiException {
    ApiResponse<Nodes> localVarResponse = getNodesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists all synthetic nodes available in your environment
   * 
   * @return ApiResponse&lt;Nodes&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Nodes> getNodesWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getNodesRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getNodes", localVarResponse);
        }
        return new ApiResponse<Nodes>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Nodes>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getNodesRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/nodes";

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
   * Deletes the specified private synthetic location
   * 
   * @param locationId The Dynatrace entity ID of the private synthetic location to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void removeLocation(String locationId) throws ApiException {
    removeLocationWithHttpInfo(locationId);
  }

  /**
   * Deletes the specified private synthetic location
   * 
   * @param locationId The Dynatrace entity ID of the private synthetic location to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> removeLocationWithHttpInfo(String locationId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = removeLocationRequestBuilder(locationId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("removeLocation", localVarResponse);
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

  private HttpRequest.Builder removeLocationRequestBuilder(String locationId) throws ApiException {
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling removeLocation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations/{locationId}"
        .replace("{locationId}", ApiClient.urlEncode(locationId.toString()));

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
   * Updates set of synthetic related parameters defined for whole tenant (affects all monitors and all private locations). | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param syntheticConfigDto  (optional)
   * @return SyntheticConfigDto
   * @throws ApiException if fails to make API call
   */
  public SyntheticConfigDto updateConfiguration(SyntheticConfigDto syntheticConfigDto) throws ApiException {
    ApiResponse<SyntheticConfigDto> localVarResponse = updateConfigurationWithHttpInfo(syntheticConfigDto);
    return localVarResponse.getData();
  }

  /**
   * Updates set of synthetic related parameters defined for whole tenant (affects all monitors and all private locations). | maturity&#x3D;EARLY_ADOPTER
   * 
   * @param syntheticConfigDto  (optional)
   * @return ApiResponse&lt;SyntheticConfigDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SyntheticConfigDto> updateConfigurationWithHttpInfo(SyntheticConfigDto syntheticConfigDto) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateConfigurationRequestBuilder(syntheticConfigDto);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateConfiguration", localVarResponse);
        }
        return new ApiResponse<SyntheticConfigDto>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SyntheticConfigDto>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder updateConfigurationRequestBuilder(SyntheticConfigDto syntheticConfigDto) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/config";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(syntheticConfigDto);
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
   * Updates the specified synthetic location
   * For public locations you can only change the location status.
   * @param locationId The Dynatrace entity ID of the synthetic location to be updated. (required)
   * @param syntheticLocationUpdate The JSON body of the request. Contains updated parameters of the location. (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateLocation(String locationId, SyntheticLocationUpdate syntheticLocationUpdate) throws ApiException {
    updateLocationWithHttpInfo(locationId, syntheticLocationUpdate);
  }

  /**
   * Updates the specified synthetic location
   * For public locations you can only change the location status.
   * @param locationId The Dynatrace entity ID of the synthetic location to be updated. (required)
   * @param syntheticLocationUpdate The JSON body of the request. Contains updated parameters of the location. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateLocationWithHttpInfo(String locationId, SyntheticLocationUpdate syntheticLocationUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateLocationRequestBuilder(locationId, syntheticLocationUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateLocation", localVarResponse);
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

  private HttpRequest.Builder updateLocationRequestBuilder(String locationId, SyntheticLocationUpdate syntheticLocationUpdate) throws ApiException {
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updateLocation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations/{locationId}"
        .replace("{locationId}", ApiClient.urlEncode(locationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(syntheticLocationUpdate);
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
   * Changes the status of public synthetic locations
   * 
   * @param syntheticPublicLocationsStatus The new status of public synthetic locations. (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateLocationsStatus(SyntheticPublicLocationsStatus syntheticPublicLocationsStatus) throws ApiException {
    updateLocationsStatusWithHttpInfo(syntheticPublicLocationsStatus);
  }

  /**
   * Changes the status of public synthetic locations
   * 
   * @param syntheticPublicLocationsStatus The new status of public synthetic locations. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateLocationsStatusWithHttpInfo(SyntheticPublicLocationsStatus syntheticPublicLocationsStatus) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateLocationsStatusRequestBuilder(syntheticPublicLocationsStatus);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateLocationsStatus", localVarResponse);
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

  private HttpRequest.Builder updateLocationsStatusRequestBuilder(SyntheticPublicLocationsStatus syntheticPublicLocationsStatus) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/synthetic/locations/status";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(syntheticPublicLocationsStatus);
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
}
