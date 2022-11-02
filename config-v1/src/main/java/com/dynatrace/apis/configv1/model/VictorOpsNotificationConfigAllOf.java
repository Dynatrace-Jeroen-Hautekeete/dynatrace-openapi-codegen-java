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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VictorOpsNotificationConfigAllOf
 */
@JsonPropertyOrder({
  VictorOpsNotificationConfigAllOf.JSON_PROPERTY_API_KEY,
  VictorOpsNotificationConfigAllOf.JSON_PROPERTY_ROUTING_KEY,
  VictorOpsNotificationConfigAllOf.JSON_PROPERTY_MESSAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class VictorOpsNotificationConfigAllOf {
  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_ROUTING_KEY = "routingKey";
  private String routingKey;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public VictorOpsNotificationConfigAllOf() { 
  }

  public VictorOpsNotificationConfigAllOf apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The API key for the target VictorOps account.
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API key for the target VictorOps account.")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public VictorOpsNotificationConfigAllOf routingKey(String routingKey) {
    this.routingKey = routingKey;
    return this;
  }

   /**
   * The routing key, defining the group to be notified.
   * @return routingKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The routing key, defining the group to be notified.")
  @JsonProperty(JSON_PROPERTY_ROUTING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoutingKey() {
    return routingKey;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingKey(String routingKey) {
    this.routingKey = routingKey;
  }


  public VictorOpsNotificationConfigAllOf message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The content of the message.   You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{ProblemDetailsText}&#x60;: All problem event details, including root cause, as a text-formatted string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the message.   You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  ")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this VictorOpsNotificationConfig_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VictorOpsNotificationConfigAllOf victorOpsNotificationConfigAllOf = (VictorOpsNotificationConfigAllOf) o;
    return Objects.equals(this.apiKey, victorOpsNotificationConfigAllOf.apiKey) &&
        Objects.equals(this.routingKey, victorOpsNotificationConfigAllOf.routingKey) &&
        Objects.equals(this.message, victorOpsNotificationConfigAllOf.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, routingKey, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VictorOpsNotificationConfigAllOf {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

}

