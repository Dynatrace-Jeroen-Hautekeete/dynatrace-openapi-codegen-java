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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * Configuration of the Slack notification.
 */
@ApiModel(description = "Configuration of the Slack notification.")
@JsonPropertyOrder({
  SlackNotificationConfig.JSON_PROPERTY_URL,
  SlackNotificationConfig.JSON_PROPERTY_CHANNEL,
  SlackNotificationConfig.JSON_PROPERTY_TITLE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class SlackNotificationConfig extends NotificationConfig {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private String channel;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public SlackNotificationConfig() { 
  }

  public SlackNotificationConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the Slack WebHook.   This is confidential information, therefore GET requests return this field with the &#x60;null&#x60; value, and it is optional for PUT requests.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the Slack WebHook.   This is confidential information, therefore GET requests return this field with the `null` value, and it is optional for PUT requests.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public SlackNotificationConfig channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel (for example, &#x60;#general&#x60;) or the user (for example, &#x60;@john.smith&#x60;) to send the message to.
   * @return channel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The channel (for example, `#general`) or the user (for example, `@john.smith`) to send the message to.")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannel(String channel) {
    this.channel = channel;
  }


  public SlackNotificationConfig title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The content of the message.   You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsText}&#x60;: All problem event details, including root cause, as a text-formatted string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.  
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The content of the message.   You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas.  ")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this SlackNotificationConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SlackNotificationConfig slackNotificationConfig = (SlackNotificationConfig) o;
    return Objects.equals(this.url, slackNotificationConfig.url) &&
        Objects.equals(this.channel, slackNotificationConfig.channel) &&
        Objects.equals(this.title, slackNotificationConfig.title) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, channel, title, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SlackNotificationConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
  mappings.put("SlackNotificationConfig", SlackNotificationConfig.class);
  JSON.registerDiscriminator(SlackNotificationConfig.class, "type", mappings);
}
}
