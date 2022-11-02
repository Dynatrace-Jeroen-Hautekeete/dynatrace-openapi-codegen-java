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
import com.dynatrace.apis.configv1.model.AlertingProfileTagFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A severity rule of the alerting profile.    A severity rule defines the level of severity that must be met before an alert is sent our for a detected problem. Additionally it restricts the alerting to certain monitored entities.
 */
@ApiModel(description = "A severity rule of the alerting profile.    A severity rule defines the level of severity that must be met before an alert is sent our for a detected problem. Additionally it restricts the alerting to certain monitored entities.")
@JsonPropertyOrder({
  AlertingProfileSeverityRule.JSON_PROPERTY_SEVERITY_LEVEL,
  AlertingProfileSeverityRule.JSON_PROPERTY_TAG_FILTER,
  AlertingProfileSeverityRule.JSON_PROPERTY_DELAY_IN_MINUTES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AlertingProfileSeverityRule {
  /**
   * The severity level to trigger the alert.
   */
  public enum SeverityLevelEnum {
    AVAILABILITY("AVAILABILITY"),
    
    CUSTOM_ALERT("CUSTOM_ALERT"),
    
    ERROR("ERROR"),
    
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

  public static final String JSON_PROPERTY_TAG_FILTER = "tagFilter";
  private AlertingProfileTagFilter tagFilter;

  public static final String JSON_PROPERTY_DELAY_IN_MINUTES = "delayInMinutes";
  private Integer delayInMinutes;

  public AlertingProfileSeverityRule() { 
  }

  public AlertingProfileSeverityRule severityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
    return this;
  }

   /**
   * The severity level to trigger the alert.
   * @return severityLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The severity level to trigger the alert.")
  @JsonProperty(JSON_PROPERTY_SEVERITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SeverityLevelEnum getSeverityLevel() {
    return severityLevel;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeverityLevel(SeverityLevelEnum severityLevel) {
    this.severityLevel = severityLevel;
  }


  public AlertingProfileSeverityRule tagFilter(AlertingProfileTagFilter tagFilter) {
    this.tagFilter = tagFilter;
    return this;
  }

   /**
   * Get tagFilter
   * @return tagFilter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAG_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertingProfileTagFilter getTagFilter() {
    return tagFilter;
  }


  @JsonProperty(JSON_PROPERTY_TAG_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTagFilter(AlertingProfileTagFilter tagFilter) {
    this.tagFilter = tagFilter;
  }


  public AlertingProfileSeverityRule delayInMinutes(Integer delayInMinutes) {
    this.delayInMinutes = delayInMinutes;
    return this;
  }

   /**
   * Send a notification if a problem remains open longer than *X* minutes.
   * minimum: 0
   * maximum: 10000
   * @return delayInMinutes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Send a notification if a problem remains open longer than *X* minutes.")
  @JsonProperty(JSON_PROPERTY_DELAY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDelayInMinutes() {
    return delayInMinutes;
  }


  @JsonProperty(JSON_PROPERTY_DELAY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelayInMinutes(Integer delayInMinutes) {
    this.delayInMinutes = delayInMinutes;
  }


  /**
   * Return true if this AlertingProfileSeverityRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertingProfileSeverityRule alertingProfileSeverityRule = (AlertingProfileSeverityRule) o;
    return Objects.equals(this.severityLevel, alertingProfileSeverityRule.severityLevel) &&
        Objects.equals(this.tagFilter, alertingProfileSeverityRule.tagFilter) &&
        Objects.equals(this.delayInMinutes, alertingProfileSeverityRule.delayInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severityLevel, tagFilter, delayInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertingProfileSeverityRule {\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    tagFilter: ").append(toIndentedString(tagFilter)).append("\n");
    sb.append("    delayInMinutes: ").append(toIndentedString(delayInMinutes)).append("\n");
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

