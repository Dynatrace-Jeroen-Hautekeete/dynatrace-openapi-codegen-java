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

import com.dynatrace.apis.configv1.model.AzureCredentials;
import com.dynatrace.apis.configv1.model.AzureCredentialsCreation;
import com.dynatrace.apis.configv1.model.AzureMonitoredServicesDto;
import com.dynatrace.apis.configv1.model.CloudSupportedServicesList;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
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
public class AzureCredentialsConfigurationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AzureCredentialsConfigurationApi() {
    this(new ApiClient());
  }

  public AzureCredentialsConfigurationApi(ApiClient apiClient) {
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
   * Creates a new Azure credentials configuration
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param azureCredentialsCreation The JSON body of the request. Contains parameters of the new Azure credentials configuration. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation createAzureCredentialsConfig(AzureCredentialsCreation azureCredentialsCreation) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = createAzureCredentialsConfigWithHttpInfo(azureCredentialsCreation);
    return localVarResponse.getData();
  }

  /**
   * Creates a new Azure credentials configuration
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param azureCredentialsCreation The JSON body of the request. Contains parameters of the new Azure credentials configuration. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> createAzureCredentialsConfigWithHttpInfo(AzureCredentialsCreation azureCredentialsCreation) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createAzureCredentialsConfigRequestBuilder(azureCredentialsCreation);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createAzureCredentialsConfig", localVarResponse);
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

  private HttpRequest.Builder createAzureCredentialsConfigRequestBuilder(AzureCredentialsCreation azureCredentialsCreation) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureCredentialsCreation);
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
   * Deletes the specified Azure credentials configuration
   * 
   * @param id The ID of the Azure credentials configuration to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAzureCredentialsConfig(String id) throws ApiException {
    deleteAzureCredentialsConfigWithHttpInfo(id);
  }

  /**
   * Deletes the specified Azure credentials configuration
   * 
   * @param id The ID of the Azure credentials configuration to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAzureCredentialsConfigWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteAzureCredentialsConfigRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteAzureCredentialsConfig", localVarResponse);
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

  private HttpRequest.Builder deleteAzureCredentialsConfigRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAzureCredentialsConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "*/*");

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
   * Gets the configuration of the specified Azure credentials
   * 
   * @param id The ID of the required Azure credentials configuration. (required)
   * @return AzureCredentials
   * @throws ApiException if fails to make API call
   */
  public AzureCredentials getAzureCredentialsConfig(String id) throws ApiException {
    ApiResponse<AzureCredentials> localVarResponse = getAzureCredentialsConfigWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets the configuration of the specified Azure credentials
   * 
   * @param id The ID of the required Azure credentials configuration. (required)
   * @return ApiResponse&lt;AzureCredentials&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AzureCredentials> getAzureCredentialsConfigWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAzureCredentialsConfigRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAzureCredentialsConfig", localVarResponse);
        }
        return new ApiResponse<AzureCredentials>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AzureCredentials>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAzureCredentialsConfigRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAzureCredentialsConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}"
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
   * Gets the monitored services configuration of the specified Azure credentials
   * 
   * @param id The ID of the required Azure credentials configuration. (required)
   * @return AzureMonitoredServicesDto
   * @throws ApiException if fails to make API call
   */
  public AzureMonitoredServicesDto getAzureServicesConfig(String id) throws ApiException {
    ApiResponse<AzureMonitoredServicesDto> localVarResponse = getAzureServicesConfigWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Gets the monitored services configuration of the specified Azure credentials
   * 
   * @param id The ID of the required Azure credentials configuration. (required)
   * @return ApiResponse&lt;AzureMonitoredServicesDto&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AzureMonitoredServicesDto> getAzureServicesConfigWithHttpInfo(String id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAzureServicesConfigRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAzureServicesConfig", localVarResponse);
        }
        return new ApiResponse<AzureMonitoredServicesDto>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<AzureMonitoredServicesDto>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getAzureServicesConfigRequestBuilder(String id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAzureServicesConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}/services"
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
   * Gets the list of Azure supported services
   * You can use this list for adding services to Azure credentials
   * @return CloudSupportedServicesList
   * @throws ApiException if fails to make API call
   */
  public CloudSupportedServicesList getSupportedServices1() throws ApiException {
    ApiResponse<CloudSupportedServicesList> localVarResponse = getSupportedServices1WithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Gets the list of Azure supported services
   * You can use this list for adding services to Azure credentials
   * @return ApiResponse&lt;CloudSupportedServicesList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CloudSupportedServicesList> getSupportedServices1WithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSupportedServices1RequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSupportedServices1", localVarResponse);
        }
        return new ApiResponse<CloudSupportedServicesList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CloudSupportedServicesList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getSupportedServices1RequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/supportedServices";

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
   * Lists all available Azure credentials configurations
   * 
   * @return StubList
   * @throws ApiException if fails to make API call
   */
  public StubList listAzureCredentialsConfigs() throws ApiException {
    ApiResponse<StubList> localVarResponse = listAzureCredentialsConfigsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Lists all available Azure credentials configurations
   * 
   * @return ApiResponse&lt;StubList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StubList> listAzureCredentialsConfigsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listAzureCredentialsConfigsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listAzureCredentialsConfigs", localVarResponse);
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

  private HttpRequest.Builder listAzureCredentialsConfigsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials";

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
   * Updates an existing Azure credentials configuration
   * * You can&#39;t change the Application ID or Directory ID of an Azure configuration. If you need to change them, create a new credentials configuration.  * If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.
   * @param id The ID of the Azure credentials configuration to be updated. (required)
   * @param azureCredentials The JSON body of the request. Contains updated parameters of the Azure credentials configuration. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation updateAzureCredentialsConfig(String id, AzureCredentials azureCredentials) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = updateAzureCredentialsConfigWithHttpInfo(id, azureCredentials);
    return localVarResponse.getData();
  }

  /**
   * Updates an existing Azure credentials configuration
   * * You can&#39;t change the Application ID or Directory ID of an Azure configuration. If you need to change them, create a new credentials configuration.  * If a configuration with the specified ID doesn&#39;t exist, a new configuration is created.
   * @param id The ID of the Azure credentials configuration to be updated. (required)
   * @param azureCredentials The JSON body of the request. Contains updated parameters of the Azure credentials configuration. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> updateAzureCredentialsConfigWithHttpInfo(String id, AzureCredentials azureCredentials) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateAzureCredentialsConfigRequestBuilder(id, azureCredentials);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateAzureCredentialsConfig", localVarResponse);
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

  private HttpRequest.Builder updateAzureCredentialsConfigRequestBuilder(String id, AzureCredentials azureCredentials) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAzureCredentialsConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureCredentials);
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
   * Replace an existing monitored services configuration of the specified Azure credentials
   * 
   * @param id The ID of the Azure credentials to be updated with new monitored services configuration. (required)
   * @param azureMonitoredServicesDto The JSON body of the request. Contains updated monitored services configuration for Azure credentials. (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateAzureServicesConfig(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    updateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto);
  }

  /**
   * Replace an existing monitored services configuration of the specified Azure credentials
   * 
   * @param id The ID of the Azure credentials to be updated with new monitored services configuration. (required)
   * @param azureMonitoredServicesDto The JSON body of the request. Contains updated monitored services configuration for Azure credentials. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateAzureServicesConfigWithHttpInfo(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateAzureServicesConfigRequestBuilder(id, azureMonitoredServicesDto);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateAzureServicesConfig", localVarResponse);
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

  private HttpRequest.Builder updateAzureServicesConfigRequestBuilder(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAzureServicesConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}/services"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureMonitoredServicesDto);
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
   * Validates the payload for the &#x60;POST /azure/credentials&#x60; request
   * 
   * @param azureCredentials The JSON body of the request. Contains the Azure credentials configuration to be validated. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateAzureCredentialsConfig(AzureCredentials azureCredentials) throws ApiException {
    validateAzureCredentialsConfigWithHttpInfo(azureCredentials);
  }

  /**
   * Validates the payload for the &#x60;POST /azure/credentials&#x60; request
   * 
   * @param azureCredentials The JSON body of the request. Contains the Azure credentials configuration to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateAzureCredentialsConfigWithHttpInfo(AzureCredentials azureCredentials) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateAzureCredentialsConfigRequestBuilder(azureCredentials);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateAzureCredentialsConfig", localVarResponse);
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

  private HttpRequest.Builder validateAzureCredentialsConfigRequestBuilder(AzureCredentials azureCredentials) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/validator";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureCredentials);
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
   * Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request
   * 
   * @param id The ID of the Azure credentials for which the monitored services configuration is going to be validated. (required)
   * @param azureMonitoredServicesDto The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateAzureServicesConfig(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    validateAzureServicesConfigWithHttpInfo(id, azureMonitoredServicesDto);
  }

  /**
   * Validates the payload for the &#x60;PUT /azure/credentials/{id}/services&#x60; request
   * 
   * @param id The ID of the Azure credentials for which the monitored services configuration is going to be validated. (required)
   * @param azureMonitoredServicesDto The JSON body of the request. Contains a monitored services configuration for Azure credentials to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateAzureServicesConfigWithHttpInfo(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateAzureServicesConfigRequestBuilder(id, azureMonitoredServicesDto);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateAzureServicesConfig", localVarResponse);
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

  private HttpRequest.Builder validateAzureServicesConfigRequestBuilder(String id, AzureMonitoredServicesDto azureMonitoredServicesDto) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling validateAzureServicesConfig");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}/services/validator"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureMonitoredServicesDto);
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
   * Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request
   * 
   * @param id The ID of the Azure credentials configuration to be validated. (required)
   * @param azureCredentials The JSON body of the request. Contains the Azure credentials configuration to be validated. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateConfigurationUpdate(String id, AzureCredentials azureCredentials) throws ApiException {
    validateConfigurationUpdateWithHttpInfo(id, azureCredentials);
  }

  /**
   * Validates the payload for the &#x60;PUT /azure/credentials/{id}&#x60; request
   * 
   * @param id The ID of the Azure credentials configuration to be validated. (required)
   * @param azureCredentials The JSON body of the request. Contains the Azure credentials configuration to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateConfigurationUpdateWithHttpInfo(String id, AzureCredentials azureCredentials) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateConfigurationUpdateRequestBuilder(id, azureCredentials);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateConfigurationUpdate", localVarResponse);
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

  private HttpRequest.Builder validateConfigurationUpdateRequestBuilder(String id, AzureCredentials azureCredentials) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling validateConfigurationUpdate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/azure/credentials/{id}/validator"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(azureCredentials);
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