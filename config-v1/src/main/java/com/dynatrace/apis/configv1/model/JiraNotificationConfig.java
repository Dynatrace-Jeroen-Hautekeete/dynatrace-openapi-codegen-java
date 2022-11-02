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
 * Configuration of the Jira notification.
 */
@ApiModel(description = "Configuration of the Jira notification.")
@JsonPropertyOrder({
  JiraNotificationConfig.JSON_PROPERTY_USERNAME,
  JiraNotificationConfig.JSON_PROPERTY_PASSWORD,
  JiraNotificationConfig.JSON_PROPERTY_URL,
  JiraNotificationConfig.JSON_PROPERTY_PROJECT_KEY,
  JiraNotificationConfig.JSON_PROPERTY_ISSUE_TYPE,
  JiraNotificationConfig.JSON_PROPERTY_SUMMARY,
  JiraNotificationConfig.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class JiraNotificationConfig extends NotificationConfig {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PROJECT_KEY = "projectKey";
  private String projectKey;

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issueType";
  private String issueType;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public JiraNotificationConfig() { 
  }

  public JiraNotificationConfig username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the Jira profile.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The username of the Jira profile.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public JiraNotificationConfig password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for the Jira profile.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password for the Jira profile.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public JiraNotificationConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the Jira API endpoint.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL of the Jira API endpoint.")
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


  public JiraNotificationConfig projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

   /**
   * The project key of the Jira issue to be created by this notification.
   * @return projectKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project key of the Jira issue to be created by this notification.")
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProjectKey() {
    return projectKey;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public JiraNotificationConfig issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

   /**
   * The type of the Jira issue to be created by this notification.
   * @return issueType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the Jira issue to be created by this notification.")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssueType() {
    return issueType;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  public JiraNotificationConfig summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * The summary of the Jira issue to be created by this notification.   You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsText}&#x60;: All problem event details, including root cause, as a text-formatted string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.  
   * @return summary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The summary of the Jira issue to be created by this notification.   You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas.  ")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  public JiraNotificationConfig description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the Jira issue to be created by this notification.    You can use same placeholders as in issue summary.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the Jira issue to be created by this notification.    You can use same placeholders as in issue summary.")
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
   * Return true if this JiraNotificationConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraNotificationConfig jiraNotificationConfig = (JiraNotificationConfig) o;
    return Objects.equals(this.username, jiraNotificationConfig.username) &&
        Objects.equals(this.password, jiraNotificationConfig.password) &&
        Objects.equals(this.url, jiraNotificationConfig.url) &&
        Objects.equals(this.projectKey, jiraNotificationConfig.projectKey) &&
        Objects.equals(this.issueType, jiraNotificationConfig.issueType) &&
        Objects.equals(this.summary, jiraNotificationConfig.summary) &&
        Objects.equals(this.description, jiraNotificationConfig.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, url, projectKey, issueType, summary, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraNotificationConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
  mappings.put("JiraNotificationConfig", JiraNotificationConfig.class);
  JSON.registerDiscriminator(JiraNotificationConfig.class, "type", mappings);
}
}
