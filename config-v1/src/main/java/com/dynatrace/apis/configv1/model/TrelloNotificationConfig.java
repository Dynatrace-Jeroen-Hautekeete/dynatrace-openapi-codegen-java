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
 * Configuration of the Trello notification.
 */
@ApiModel(description = "Configuration of the Trello notification.")
@JsonPropertyOrder({
  TrelloNotificationConfig.JSON_PROPERTY_APPLICATION_KEY,
  TrelloNotificationConfig.JSON_PROPERTY_AUTHORIZATION_TOKEN,
  TrelloNotificationConfig.JSON_PROPERTY_BOARD_ID,
  TrelloNotificationConfig.JSON_PROPERTY_LIST_ID,
  TrelloNotificationConfig.JSON_PROPERTY_RESOLVED_LIST_ID,
  TrelloNotificationConfig.JSON_PROPERTY_TEXT,
  TrelloNotificationConfig.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class TrelloNotificationConfig extends NotificationConfig {
  public static final String JSON_PROPERTY_APPLICATION_KEY = "applicationKey";
  private String applicationKey;

  public static final String JSON_PROPERTY_AUTHORIZATION_TOKEN = "authorizationToken";
  private String authorizationToken;

  public static final String JSON_PROPERTY_BOARD_ID = "boardId";
  private String boardId;

  public static final String JSON_PROPERTY_LIST_ID = "listId";
  private String listId;

  public static final String JSON_PROPERTY_RESOLVED_LIST_ID = "resolvedListId";
  private String resolvedListId;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public TrelloNotificationConfig() { 
  }

  public TrelloNotificationConfig applicationKey(String applicationKey) {
    this.applicationKey = applicationKey;
    return this;
  }

   /**
   * The application key for the Trello account.
   * @return applicationKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The application key for the Trello account.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationKey() {
    return applicationKey;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationKey(String applicationKey) {
    this.applicationKey = applicationKey;
  }


  public TrelloNotificationConfig authorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
    return this;
  }

   /**
   * The application token for the Trello account.
   * @return authorizationToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application token for the Trello account.")
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationToken() {
    return authorizationToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationToken(String authorizationToken) {
    this.authorizationToken = authorizationToken;
  }


  public TrelloNotificationConfig boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The Trello board to which the card should be assigned.
   * @return boardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Trello board to which the card should be assigned.")
  @JsonProperty(JSON_PROPERTY_BOARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBoardId() {
    return boardId;
  }


  @JsonProperty(JSON_PROPERTY_BOARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }


  public TrelloNotificationConfig listId(String listId) {
    this.listId = listId;
    return this;
  }

   /**
   * The Trello list to which the card should be assigned.
   * @return listId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Trello list to which the card should be assigned.")
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListId(String listId) {
    this.listId = listId;
  }


  public TrelloNotificationConfig resolvedListId(String resolvedListId) {
    this.resolvedListId = resolvedListId;
    return this;
  }

   /**
   * The Trello list to which the card of the resolved problem should be assigned.
   * @return resolvedListId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Trello list to which the card of the resolved problem should be assigned.")
  @JsonProperty(JSON_PROPERTY_RESOLVED_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResolvedListId() {
    return resolvedListId;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVED_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResolvedListId(String resolvedListId) {
    this.resolvedListId = resolvedListId;
  }


  public TrelloNotificationConfig text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the generated Trello card.   You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsMarkdown}&#x60;: All problem event details, including root cause, as a [Markdown-formatted](https://dt-url.net/1yk3kkq) string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.  
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The text of the generated Trello card.   You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://dt-url.net/1yk3kkq) string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas.  ")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(String text) {
    this.text = text;
  }


  public TrelloNotificationConfig description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the Trello card.    You can use same placeholders as in card text.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the Trello card.    You can use same placeholders as in card text.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this TrelloNotificationConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrelloNotificationConfig trelloNotificationConfig = (TrelloNotificationConfig) o;
    return Objects.equals(this.applicationKey, trelloNotificationConfig.applicationKey) &&
        Objects.equals(this.authorizationToken, trelloNotificationConfig.authorizationToken) &&
        Objects.equals(this.boardId, trelloNotificationConfig.boardId) &&
        Objects.equals(this.listId, trelloNotificationConfig.listId) &&
        Objects.equals(this.resolvedListId, trelloNotificationConfig.resolvedListId) &&
        Objects.equals(this.text, trelloNotificationConfig.text) &&
        Objects.equals(this.description, trelloNotificationConfig.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKey, authorizationToken, boardId, listId, resolvedListId, text, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrelloNotificationConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    resolvedListId: ").append(toIndentedString(resolvedListId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
  mappings.put("TrelloNotificationConfig", TrelloNotificationConfig.class);
  JSON.registerDiscriminator(TrelloNotificationConfig.class, "type", mappings);
}
}

