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


package com.dynatrace.apis.envv2.model;

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
 * Configuration of an event type.
 */
@ApiModel(description = "Configuration of an event type.")
@JsonPropertyOrder({
  EventType.JSON_PROPERTY_SEVERITY_LEVEL,
  EventType.JSON_PROPERTY_DISPLAY_NAME,
  EventType.JSON_PROPERTY_TYPE,
  EventType.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class EventType {
  /**
   * The severity level associated with the event type.
   */
  public enum SeverityLevelEnum {
    AVAILABILITY("AVAILABILITY"),
    
    CUSTOM_ALERT("CUSTOM_ALERT"),
    
    ERROR("ERROR"),
    
    INFO("INFO"),
    
    MONITORING_UNAVAILABLE("MONITORING_UNAVAILABLE"),
    
    PERFORMANCE("PERFORMANCE"),
    
    RESOURCE_CONTENTION("RESOURCE_CONTENTION");

    private String value;

    SeverityLevelEnum(String value) {
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
    public static SeverityLevelEnum fromValue(String value) {
      for (SeverityLevelEnum b : SeverityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITY_LEVEL = "severityLevel";
  private SeverityLevelEnum severityLevel;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public EventType() { 
  }

  public EventType severityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
    return this;
  }

   /**
   * The severity level associated with the event type.
   * @return severityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERFORMANCE", value = "The severity level associated with the event type.")
  @JsonProperty(JSON_PROPERTY_SEVERITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeverityLevelEnum getSeverityLevel() {
    return severityLevel;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
  }


  public EventType displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the event type.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "High CPU", value = "The display name of the event type.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public EventType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The event type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OSI_HIGH_CPU", value = "The event type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public EventType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the event type.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the event type.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this EventType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventType eventType = (EventType) o;
    return Objects.equals(this.severityLevel, eventType.severityLevel) &&
        Objects.equals(this.displayName, eventType.displayName) &&
        Objects.equals(this.type, eventType.type) &&
        Objects.equals(this.description, eventType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severityLevel, displayName, type, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventType {\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

}
