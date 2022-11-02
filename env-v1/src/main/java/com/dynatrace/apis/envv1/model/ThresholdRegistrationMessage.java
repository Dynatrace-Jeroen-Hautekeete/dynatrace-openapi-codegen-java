/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv1.model;

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
 * Parameters of a single plugin or custom event threshold.
 */
@ApiModel(description = "Parameters of a single plugin or custom event threshold.")
@JsonPropertyOrder({
  ThresholdRegistrationMessage.JSON_PROPERTY_THRESHOLD_ID,
  ThresholdRegistrationMessage.JSON_PROPERTY_TIMESERIES_ID,
  ThresholdRegistrationMessage.JSON_PROPERTY_THRESHOLD,
  ThresholdRegistrationMessage.JSON_PROPERTY_ALERT_CONDITION,
  ThresholdRegistrationMessage.JSON_PROPERTY_SAMPLES,
  ThresholdRegistrationMessage.JSON_PROPERTY_VIOLATING_SAMPLES,
  ThresholdRegistrationMessage.JSON_PROPERTY_DEALERTING_SAMPLES,
  ThresholdRegistrationMessage.JSON_PROPERTY_EVENT_TYPE,
  ThresholdRegistrationMessage.JSON_PROPERTY_EVENT_NAME,
  ThresholdRegistrationMessage.JSON_PROPERTY_DESCRIPTION,
  ThresholdRegistrationMessage.JSON_PROPERTY_ENABLED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ThresholdRegistrationMessage {
  public static final String JSON_PROPERTY_THRESHOLD_ID = "thresholdId";
  private String thresholdId;

  public static final String JSON_PROPERTY_TIMESERIES_ID = "timeseriesId";
  private String timeseriesId;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Double threshold;

  /**
   * The condition for the threshold value check: above or below.
   */
  public enum AlertConditionEnum {
    ABOVE("ABOVE"),
    
    BELOW("BELOW");

    private String value;

    AlertConditionEnum(String value) {
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
    public static AlertConditionEnum fromValue(String value) {
      for (AlertConditionEnum b : AlertConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALERT_CONDITION = "alertCondition";
  private AlertConditionEnum alertCondition;

  public static final String JSON_PROPERTY_SAMPLES = "samples";
  private Integer samples;

  public static final String JSON_PROPERTY_VIOLATING_SAMPLES = "violatingSamples";
  private Integer violatingSamples;

  public static final String JSON_PROPERTY_DEALERTING_SAMPLES = "dealertingSamples";
  private Integer dealertingSamples;

  /**
   * The type of the event to trigger on the threshold violation.
   */
  public enum EventTypeEnum {
    AVAILABILITY_EVENT("AVAILABILITY_EVENT"),
    
    ERROR_EVENT("ERROR_EVENT"),
    
    PERFORMANCE_EVENT("PERFORMANCE_EVENT");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_EVENT_NAME = "eventName";
  private String eventName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public ThresholdRegistrationMessage() { 
  }

  public ThresholdRegistrationMessage thresholdId(String thresholdId) {
    this.thresholdId = thresholdId;
    return this;
  }

   /**
   * The ID of the threshold.
   * @return thresholdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the threshold.")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThresholdId() {
    return thresholdId;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdId(String thresholdId) {
    this.thresholdId = thresholdId;
  }


  public ThresholdRegistrationMessage timeseriesId(String timeseriesId) {
    this.timeseriesId = timeseriesId;
    return this;
  }

   /**
   * The case-sensitive ID of the metric evaluated by threshold.    You can find metric IDs, by performing the GET request to the &#x60;timeseries&#x60; endpoint of the API.
   * @return timeseriesId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case-sensitive ID of the metric evaluated by threshold.    You can find metric IDs, by performing the GET request to the `timeseries` endpoint of the API.")
  @JsonProperty(JSON_PROPERTY_TIMESERIES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeseriesId() {
    return timeseriesId;
  }


  @JsonProperty(JSON_PROPERTY_TIMESERIES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeseriesId(String timeseriesId) {
    this.timeseriesId = timeseriesId;
  }


  public ThresholdRegistrationMessage threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The value of the threshold.
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the threshold.")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public ThresholdRegistrationMessage alertCondition(AlertConditionEnum alertCondition) {
    this.alertCondition = alertCondition;
    return this;
  }

   /**
   * The condition for the threshold value check: above or below.
   * @return alertCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The condition for the threshold value check: above or below.")
  @JsonProperty(JSON_PROPERTY_ALERT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertConditionEnum getAlertCondition() {
    return alertCondition;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertCondition(AlertConditionEnum alertCondition) {
    this.alertCondition = alertCondition;
  }


  public ThresholdRegistrationMessage samples(Integer samples) {
    this.samples = samples;
    return this;
  }

   /**
   * The number of one-minute samples to form the sliding evaluation window.
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of one-minute samples to form the sliding evaluation window.")
  @JsonProperty(JSON_PROPERTY_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSamples() {
    return samples;
  }


  @JsonProperty(JSON_PROPERTY_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSamples(Integer samples) {
    this.samples = samples;
  }


  public ThresholdRegistrationMessage violatingSamples(Integer violatingSamples) {
    this.violatingSamples = violatingSamples;
    return this;
  }

   /**
   * How many one-minute samples within the evaluation window should violate the threshold to trigger an event.
   * @return violatingSamples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many one-minute samples within the evaluation window should violate the threshold to trigger an event.")
  @JsonProperty(JSON_PROPERTY_VIOLATING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViolatingSamples() {
    return violatingSamples;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolatingSamples(Integer violatingSamples) {
    this.violatingSamples = violatingSamples;
  }


  public ThresholdRegistrationMessage dealertingSamples(Integer dealertingSamples) {
    this.dealertingSamples = dealertingSamples;
    return this;
  }

   /**
   * How many one-minute samples within the evaluation window should go back to normal to close the event.
   * @return dealertingSamples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many one-minute samples within the evaluation window should go back to normal to close the event.")
  @JsonProperty(JSON_PROPERTY_DEALERTING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDealertingSamples() {
    return dealertingSamples;
  }


  @JsonProperty(JSON_PROPERTY_DEALERTING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealertingSamples(Integer dealertingSamples) {
    this.dealertingSamples = dealertingSamples;
  }


  public ThresholdRegistrationMessage eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the event to trigger on the threshold violation.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the event to trigger on the threshold violation.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public ThresholdRegistrationMessage eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The name of the event, displayed in the UI.
   * @return eventName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the event, displayed in the UI.")
  @JsonProperty(JSON_PROPERTY_EVENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventName() {
    return eventName;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public ThresholdRegistrationMessage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the event, triggered by a threshold violation.    You can use the following placeholders:  {severity}: the actual metric value,  {alert_condition}: above or below threshold condition,  {threshold}: the threshold value,{violating_samples}: the number of samples, violating the threshold,  {dimensions}: metric&#39;s dimension that violated the threshold.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the event, triggered by a threshold violation.    You can use the following placeholders:  {severity}: the actual metric value,  {alert_condition}: above or below threshold condition,  {threshold}: the threshold value,{violating_samples}: the number of samples, violating the threshold,  {dimensions}: metric's dimension that violated the threshold.")
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


  public ThresholdRegistrationMessage enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The threshold is enabled/disabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The threshold is enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Return true if this ThresholdRegistrationMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdRegistrationMessage thresholdRegistrationMessage = (ThresholdRegistrationMessage) o;
    return Objects.equals(this.thresholdId, thresholdRegistrationMessage.thresholdId) &&
        Objects.equals(this.timeseriesId, thresholdRegistrationMessage.timeseriesId) &&
        Objects.equals(this.threshold, thresholdRegistrationMessage.threshold) &&
        Objects.equals(this.alertCondition, thresholdRegistrationMessage.alertCondition) &&
        Objects.equals(this.samples, thresholdRegistrationMessage.samples) &&
        Objects.equals(this.violatingSamples, thresholdRegistrationMessage.violatingSamples) &&
        Objects.equals(this.dealertingSamples, thresholdRegistrationMessage.dealertingSamples) &&
        Objects.equals(this.eventType, thresholdRegistrationMessage.eventType) &&
        Objects.equals(this.eventName, thresholdRegistrationMessage.eventName) &&
        Objects.equals(this.description, thresholdRegistrationMessage.description) &&
        Objects.equals(this.enabled, thresholdRegistrationMessage.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdId, timeseriesId, threshold, alertCondition, samples, violatingSamples, dealertingSamples, eventType, eventName, description, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdRegistrationMessage {\n");
    sb.append("    thresholdId: ").append(toIndentedString(thresholdId)).append("\n");
    sb.append("    timeseriesId: ").append(toIndentedString(timeseriesId)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    alertCondition: ").append(toIndentedString(alertCondition)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    violatingSamples: ").append(toIndentedString(violatingSamples)).append("\n");
    sb.append("    dealertingSamples: ").append(toIndentedString(dealertingSamples)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

