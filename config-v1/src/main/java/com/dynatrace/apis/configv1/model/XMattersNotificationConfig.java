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


package com.dynatrace.apis.configv1.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dynatrace.apis.configv1.model.HttpHeader;
import com.dynatrace.apis.configv1.model.NotificationConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * Configuration of the xMatters notification.
 */
@ApiModel(description = "Configuration of the xMatters notification.")
@JsonPropertyOrder({
  XMattersNotificationConfig.JSON_PROPERTY_URL,
  XMattersNotificationConfig.JSON_PROPERTY_ACCEPT_ANY_CERTIFICATE,
  XMattersNotificationConfig.JSON_PROPERTY_HEADERS,
  XMattersNotificationConfig.JSON_PROPERTY_PAYLOAD
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class XMattersNotificationConfig extends NotificationConfig {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_ACCEPT_ANY_CERTIFICATE = "acceptAnyCertificate";
  private Boolean acceptAnyCertificate;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<HttpHeader> headers = null;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public XMattersNotificationConfig() { 
  }

  public XMattersNotificationConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the xMatters WebHook.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL of the xMatters WebHook.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public XMattersNotificationConfig acceptAnyCertificate(Boolean acceptAnyCertificate) {
    this.acceptAnyCertificate = acceptAnyCertificate;
    return this;
  }

   /**
   * Accept any, including self-signed and invalid, SSL certificate (&#x60;true&#x60;) or only trusted (&#x60;false&#x60;) certificates.
   * @return acceptAnyCertificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates.")
  @JsonProperty(JSON_PROPERTY_ACCEPT_ANY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAcceptAnyCertificate() {
    return acceptAnyCertificate;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPT_ANY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcceptAnyCertificate(Boolean acceptAnyCertificate) {
    this.acceptAnyCertificate = acceptAnyCertificate;
  }


  public XMattersNotificationConfig headers(List<HttpHeader> headers) {
    this.headers = headers;
    return this;
  }

  public XMattersNotificationConfig addHeadersItem(HttpHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * A list of the additional HTTP headers.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the additional HTTP headers.")
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpHeader> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(List<HttpHeader> headers) {
    this.headers = headers;
  }


  public XMattersNotificationConfig payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The content of the message.   You can use the following placeholders:  * &#x60;{ImpactedEntities}&#x60;: Details about the entities impacted by the problem in form of a JSON array.  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsHTML}&#x60;: All problem event details, including root cause, as an HTML-formatted string.  * &#x60;{ProblemDetailsJSON}&#x60;: All problem event details, including root cause, as a JSON object.  * &#x60;{ProblemDetailsMarkdown}&#x60;: All problem event details, including root cause, as a [Markdown-formatted](https://dt-url.net/1yk3kkq) string.  * &#x60;{ProblemDetailsText}&#x60;: All problem event details, including root cause, as a text-formatted string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.  
   * @return payload
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The content of the message.   You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://dt-url.net/1yk3kkq) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas.  ")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayload(String payload) {
    this.payload = payload;
  }


  /**
   * Return true if this XMattersNotificationConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XMattersNotificationConfig xmattersNotificationConfig = (XMattersNotificationConfig) o;
    return Objects.equals(this.url, xmattersNotificationConfig.url) &&
        Objects.equals(this.acceptAnyCertificate, xmattersNotificationConfig.acceptAnyCertificate) &&
        Objects.equals(this.headers, xmattersNotificationConfig.headers) &&
        Objects.equals(this.payload, xmattersNotificationConfig.payload) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, acceptAnyCertificate, headers, payload, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XMattersNotificationConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    acceptAnyCertificate: ").append(toIndentedString(acceptAnyCertificate)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("XMattersNotificationConfig", XMattersNotificationConfig.class);
  JSON.registerDiscriminator(XMattersNotificationConfig.class, "type", mappings);
}
}
