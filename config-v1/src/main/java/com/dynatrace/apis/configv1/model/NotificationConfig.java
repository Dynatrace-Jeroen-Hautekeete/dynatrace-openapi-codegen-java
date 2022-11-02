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
import com.dynatrace.apis.configv1.model.AnsibleTowerNotificationConfig;
import com.dynatrace.apis.configv1.model.EmailNotificationConfig;
import com.dynatrace.apis.configv1.model.JiraNotificationConfig;
import com.dynatrace.apis.configv1.model.OpsGenieNotificationConfig;
import com.dynatrace.apis.configv1.model.PagerDutyNotificationConfig;
import com.dynatrace.apis.configv1.model.ServiceNowNotificationConfig;
import com.dynatrace.apis.configv1.model.SlackNotificationConfig;
import com.dynatrace.apis.configv1.model.TrelloNotificationConfig;
import com.dynatrace.apis.configv1.model.VictorOpsNotificationConfig;
import com.dynatrace.apis.configv1.model.WebHookNotificationConfig;
import com.dynatrace.apis.configv1.model.XMattersNotificationConfig;
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
 * Configuration of a notification. The actual set of fields depends on the &#x60;type&#x60; of the notification. See [Notifications API - JSON models](https://dt-url.net/9qm3k5u) in Dynatrace Documentation for example models of every notification type.
 */
@ApiModel(description = "Configuration of a notification. The actual set of fields depends on the `type` of the notification. See [Notifications API - JSON models](https://dt-url.net/9qm3k5u) in Dynatrace Documentation for example models of every notification type.")
@JsonPropertyOrder({
  NotificationConfig.JSON_PROPERTY_ID,
  NotificationConfig.JSON_PROPERTY_NAME,
  NotificationConfig.JSON_PROPERTY_ALERTING_PROFILE,
  NotificationConfig.JSON_PROPERTY_ACTIVE,
  NotificationConfig.JSON_PROPERTY_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AnsibleTowerNotificationConfig.class, name = "AnsibleTowerNotificationConfig"),
  @JsonSubTypes.Type(value = EmailNotificationConfig.class, name = "EmailNotificationConfig"),
  @JsonSubTypes.Type(value = JiraNotificationConfig.class, name = "JiraNotificationConfig"),
  @JsonSubTypes.Type(value = OpsGenieNotificationConfig.class, name = "OpsGenieNotificationConfig"),
  @JsonSubTypes.Type(value = PagerDutyNotificationConfig.class, name = "PagerDutyNotificationConfig"),
  @JsonSubTypes.Type(value = ServiceNowNotificationConfig.class, name = "ServiceNowNotificationConfig"),
  @JsonSubTypes.Type(value = SlackNotificationConfig.class, name = "SlackNotificationConfig"),
  @JsonSubTypes.Type(value = TrelloNotificationConfig.class, name = "TrelloNotificationConfig"),
  @JsonSubTypes.Type(value = VictorOpsNotificationConfig.class, name = "VictorOpsNotificationConfig"),
  @JsonSubTypes.Type(value = WebHookNotificationConfig.class, name = "WebHookNotificationConfig"),
  @JsonSubTypes.Type(value = XMattersNotificationConfig.class, name = "XMattersNotificationConfig"),
})

public class NotificationConfig {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ALERTING_PROFILE = "alertingProfile";
  private UUID alertingProfile;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;EMAIL&#x60; -&gt; EmailNotificationConfig  * &#x60;PAGER_DUTY&#x60; -&gt; PagerDutyNotificationConfig  * &#x60;WEBHOOK&#x60; -&gt; WebHookNotificationConfig  * &#x60;SLACK&#x60; -&gt; SlackNotificationConfig  * &#x60;VICTOROPS&#x60; -&gt; VictorOpsNotificationConfig  * &#x60;SERVICE_NOW&#x60; -&gt; ServiceNowNotificationConfig  * &#x60;XMATTERS&#x60; -&gt; XMattersNotificationConfig  * &#x60;ANSIBLETOWER&#x60; -&gt; AnsibleTowerNotificationConfig  * &#x60;OPS_GENIE&#x60; -&gt; OpsGenieNotificationConfig  * &#x60;JIRA&#x60; -&gt; JiraNotificationConfig  * &#x60;TRELLO&#x60; -&gt; TrelloNotificationConfig  
   */
  public enum TypeEnum {
    ANSIBLETOWER("ANSIBLETOWER"),
    
    EMAIL("EMAIL"),
    
    JIRA("JIRA"),
    
    OPS_GENIE("OPS_GENIE"),
    
    PAGER_DUTY("PAGER_DUTY"),
    
    SERVICE_NOW("SERVICE_NOW"),
    
    SLACK("SLACK"),
    
    TRELLO("TRELLO"),
    
    VICTOROPS("VICTOROPS"),
    
    WEBHOOK("WEBHOOK"),
    
    XMATTERS("XMATTERS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public NotificationConfig() { 
  }

  public NotificationConfig id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification configuration.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the notification configuration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public NotificationConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the notification configuration.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the notification configuration.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public NotificationConfig alertingProfile(UUID alertingProfile) {
    this.alertingProfile = alertingProfile;
    return this;
  }

   /**
   * The ID of the associated alerting profile.
   * @return alertingProfile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the associated alerting profile.")
  @JsonProperty(JSON_PROPERTY_ALERTING_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getAlertingProfile() {
    return alertingProfile;
  }


  @JsonProperty(JSON_PROPERTY_ALERTING_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlertingProfile(UUID alertingProfile) {
    this.alertingProfile = alertingProfile;
  }


  public NotificationConfig active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The configuration is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The configuration is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public NotificationConfig type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;EMAIL&#x60; -&gt; EmailNotificationConfig  * &#x60;PAGER_DUTY&#x60; -&gt; PagerDutyNotificationConfig  * &#x60;WEBHOOK&#x60; -&gt; WebHookNotificationConfig  * &#x60;SLACK&#x60; -&gt; SlackNotificationConfig  * &#x60;VICTOROPS&#x60; -&gt; VictorOpsNotificationConfig  * &#x60;SERVICE_NOW&#x60; -&gt; ServiceNowNotificationConfig  * &#x60;XMATTERS&#x60; -&gt; XMattersNotificationConfig  * &#x60;ANSIBLETOWER&#x60; -&gt; AnsibleTowerNotificationConfig  * &#x60;OPS_GENIE&#x60; -&gt; OpsGenieNotificationConfig  * &#x60;JIRA&#x60; -&gt; JiraNotificationConfig  * &#x60;TRELLO&#x60; -&gt; TrelloNotificationConfig  
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `EMAIL` -> EmailNotificationConfig  * `PAGER_DUTY` -> PagerDutyNotificationConfig  * `WEBHOOK` -> WebHookNotificationConfig  * `SLACK` -> SlackNotificationConfig  * `VICTOROPS` -> VictorOpsNotificationConfig  * `SERVICE_NOW` -> ServiceNowNotificationConfig  * `XMATTERS` -> XMattersNotificationConfig  * `ANSIBLETOWER` -> AnsibleTowerNotificationConfig  * `OPS_GENIE` -> OpsGenieNotificationConfig  * `JIRA` -> JiraNotificationConfig  * `TRELLO` -> TrelloNotificationConfig  ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this NotificationConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationConfig notificationConfig = (NotificationConfig) o;
    return Objects.equals(this.id, notificationConfig.id) &&
        Objects.equals(this.name, notificationConfig.name) &&
        Objects.equals(this.alertingProfile, notificationConfig.alertingProfile) &&
        Objects.equals(this.active, notificationConfig.active) &&
        Objects.equals(this.type, notificationConfig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alertingProfile, active, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationConfig {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alertingProfile: ").append(toIndentedString(alertingProfile)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  mappings.put("AnsibleTowerNotificationConfig", AnsibleTowerNotificationConfig.class);
  mappings.put("EmailNotificationConfig", EmailNotificationConfig.class);
  mappings.put("JiraNotificationConfig", JiraNotificationConfig.class);
  mappings.put("OpsGenieNotificationConfig", OpsGenieNotificationConfig.class);
  mappings.put("PagerDutyNotificationConfig", PagerDutyNotificationConfig.class);
  mappings.put("ServiceNowNotificationConfig", ServiceNowNotificationConfig.class);
  mappings.put("SlackNotificationConfig", SlackNotificationConfig.class);
  mappings.put("TrelloNotificationConfig", TrelloNotificationConfig.class);
  mappings.put("VictorOpsNotificationConfig", VictorOpsNotificationConfig.class);
  mappings.put("WebHookNotificationConfig", WebHookNotificationConfig.class);
  mappings.put("XMattersNotificationConfig", XMattersNotificationConfig.class);
  mappings.put("NotificationConfig", NotificationConfig.class);
  JSON.registerDiscriminator(NotificationConfig.class, "type", mappings);
}
}
