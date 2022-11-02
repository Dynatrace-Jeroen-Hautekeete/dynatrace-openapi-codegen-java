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

import com.dynatrace.apis.configv1.model.ConditionalNamingRule;
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.dynatrace.apis.configv1.model.ErrorEnvelope;
import com.dynatrace.apis.configv1.model.StubList;
import java.util.UUID;

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
public class ConditionalNamingApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ConditionalNamingApi() {
    this(new ApiClient());
  }

  public ConditionalNamingApi(ApiClient apiClient) {
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
   * Creates a new naming rule
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation createNamingRule(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = createNamingRuleWithHttpInfo(type, conditionalNamingRule);
    return localVarResponse.getData();
  }

  /**
   * Creates a new naming rule
   * The body must not provide an ID. An ID is assigned automatically by the Dynatrace server.
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains parameters of the new naming rule.   Do not specify the **id** of the rule.   The value of the **type** field must match the **type** path parameter. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> createNamingRuleWithHttpInfo(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createNamingRuleRequestBuilder(type, conditionalNamingRule);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createNamingRule", localVarResponse);
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

  private HttpRequest.Builder createNamingRuleRequestBuilder(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling createNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}"
        .replace("{type}", ApiClient.urlEncode(type.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(conditionalNamingRule);
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
   * Deletes the specified naming rule
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be deleted. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteNamingRule(String type, UUID id) throws ApiException {
    deleteNamingRuleWithHttpInfo(type, id);
  }

  /**
   * Deletes the specified naming rule
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be deleted. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteNamingRuleWithHttpInfo(String type, UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteNamingRuleRequestBuilder(type, id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteNamingRule", localVarResponse);
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

  private HttpRequest.Builder deleteNamingRuleRequestBuilder(String type, UUID id) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling deleteNamingRule");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}/{id}"
        .replace("{type}", ApiClient.urlEncode(type.toString()))
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
   * Lists the parameters of the specified naming rule
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the required naming rule. (required)
   * @return ConditionalNamingRule
   * @throws ApiException if fails to make API call
   */
  public ConditionalNamingRule getNamingRule(String type, UUID id) throws ApiException {
    ApiResponse<ConditionalNamingRule> localVarResponse = getNamingRuleWithHttpInfo(type, id);
    return localVarResponse.getData();
  }

  /**
   * Lists the parameters of the specified naming rule
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the required naming rule. (required)
   * @return ApiResponse&lt;ConditionalNamingRule&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConditionalNamingRule> getNamingRuleWithHttpInfo(String type, UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getNamingRuleRequestBuilder(type, id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getNamingRule", localVarResponse);
        }
        return new ApiResponse<ConditionalNamingRule>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ConditionalNamingRule>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getNamingRuleRequestBuilder(String type, UUID id) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling getNamingRule");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}/{id}"
        .replace("{type}", ApiClient.urlEncode(type.toString()))
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
   * Lists all configured naming rules of the specified type
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @return StubList
   * @throws ApiException if fails to make API call
   */
  public StubList listNamingRules(String type) throws ApiException {
    ApiResponse<StubList> localVarResponse = listNamingRulesWithHttpInfo(type);
    return localVarResponse.getData();
  }

  /**
   * Lists all configured naming rules of the specified type
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @return ApiResponse&lt;StubList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StubList> listNamingRulesWithHttpInfo(String type) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listNamingRulesRequestBuilder(type);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listNamingRules", localVarResponse);
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

  private HttpRequest.Builder listNamingRulesRequestBuilder(String type) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling listNamingRules");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}"
        .replace("{type}", ApiClient.urlEncode(type.toString()));

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
   * Updates the specified naming rule
   * If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be updated. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter. (optional)
   * @return EntityShortRepresentation
   * @throws ApiException if fails to make API call
   */
  public EntityShortRepresentation updateNamingRule(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    ApiResponse<EntityShortRepresentation> localVarResponse = updateNamingRuleWithHttpInfo(type, id, conditionalNamingRule);
    return localVarResponse.getData();
  }

  /**
   * Updates the specified naming rule
   * If the rule with the specified ID doesn&#39;t exist, a new rule will be created at the end of the rules list and will be the last to evaluate.
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be updated. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains updated parameters of the naming rule.   The value of the **type** field must match the **type** path parameter. (optional)
   * @return ApiResponse&lt;EntityShortRepresentation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EntityShortRepresentation> updateNamingRuleWithHttpInfo(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateNamingRuleRequestBuilder(type, id, conditionalNamingRule);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateNamingRule", localVarResponse);
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

  private HttpRequest.Builder updateNamingRuleRequestBuilder(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling updateNamingRule");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}/{id}"
        .replace("{type}", ApiClient.urlEncode(type.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(conditionalNamingRule);
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
   * Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains the naming rule parameters to be validated. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateCreateNamingRule(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    validateCreateNamingRuleWithHttpInfo(type, conditionalNamingRule);
  }

  /**
   * Validates the payload for the &#x60;POST /conditionalNaming/{type}&#x60; request
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains the naming rule parameters to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateCreateNamingRuleWithHttpInfo(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateCreateNamingRuleRequestBuilder(type, conditionalNamingRule);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateCreateNamingRule", localVarResponse);
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

  private HttpRequest.Builder validateCreateNamingRuleRequestBuilder(String type, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling validateCreateNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}/validator"
        .replace("{type}", ApiClient.urlEncode(type.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(conditionalNamingRule);
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
   * Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be validated. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains the naming rule parameters to be validated. (optional)
   * @throws ApiException if fails to make API call
   */
  public void validateUpdateNamingRule(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    validateUpdateNamingRuleWithHttpInfo(type, id, conditionalNamingRule);
  }

  /**
   * Validates the payload for the &#x60;PUT /conditionalNaming/{type}/{id}&#x60; request
   * 
   * @param type The type of the rule, defined by the type of Dynatrace entities to which the rule applies. (required)
   * @param id The ID of the naming rule to be validated. (required)
   * @param conditionalNamingRule The JSON body of the request. Contains the naming rule parameters to be validated. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> validateUpdateNamingRuleWithHttpInfo(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = validateUpdateNamingRuleRequestBuilder(type, id, conditionalNamingRule);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("validateUpdateNamingRule", localVarResponse);
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

  private HttpRequest.Builder validateUpdateNamingRuleRequestBuilder(String type, UUID id, ConditionalNamingRule conditionalNamingRule) throws ApiException {
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling validateUpdateNamingRule");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling validateUpdateNamingRule");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/conditionalNaming/{type}/{id}/validator"
        .replace("{type}", ApiClient.urlEncode(type.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json; charset&#x3D;utf-8");
    localVarRequestBuilder.header("Accept", "application/json; charset&#x3D;utf-8");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(conditionalNamingRule);
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
