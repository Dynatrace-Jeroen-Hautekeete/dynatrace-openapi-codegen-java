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
import com.dynatrace.apis.configv1.model.MetricEventMonitoringStrategy;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * A static threshold monitoring strategy to alert on hard limits within a given metric. An example is the violation of a critical memory limit.
 */
@ApiModel(description = "A static threshold monitoring strategy to alert on hard limits within a given metric. An example is the violation of a critical memory limit.")
@JsonPropertyOrder({
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_SAMPLES,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_VIOLATING_SAMPLES,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_DEALERTING_SAMPLES,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_ALERT_CONDITION,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_ALERTING_ON_MISSING_DATA,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_THRESHOLD,
  MetricEventStaticThresholdMonitoringStrategy.JSON_PROPERTY_UNIT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class MetricEventStaticThresholdMonitoringStrategy extends MetricEventMonitoringStrategy {
  public static final String JSON_PROPERTY_SAMPLES = "samples";
  private Integer samples;

  public static final String JSON_PROPERTY_VIOLATING_SAMPLES = "violatingSamples";
  private Integer violatingSamples;

  public static final String JSON_PROPERTY_DEALERTING_SAMPLES = "dealertingSamples";
  private Integer dealertingSamples;

  /**
   * The condition for the **threshold** value check: above or below.
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

  public static final String JSON_PROPERTY_ALERTING_ON_MISSING_DATA = "alertingOnMissingData";
  private Boolean alertingOnMissingData;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Double threshold;

  /**
   * The unit of the threshold, matching the metric definition.
   */
  public enum UnitEnum {
    BILLION("BILLION"),
    
    BIT("BIT"),
    
    BIT_PER_HOUR("BIT_PER_HOUR"),
    
    BIT_PER_MINUTE("BIT_PER_MINUTE"),
    
    BIT_PER_SECOND("BIT_PER_SECOND"),
    
    BYTE("BYTE"),
    
    BYTE_PER_HOUR("BYTE_PER_HOUR"),
    
    BYTE_PER_MINUTE("BYTE_PER_MINUTE"),
    
    BYTE_PER_SECOND("BYTE_PER_SECOND"),
    
    CORES("CORES"),
    
    COUNT("COUNT"),
    
    DAY("DAY"),
    
    DECIBEL_MILLI_WATT("DECIBEL_MILLI_WATT"),
    
    GIBI_BYTE("GIBI_BYTE"),
    
    GIGA("GIGA"),
    
    GIGA_BYTE("GIGA_BYTE"),
    
    HOUR("HOUR"),
    
    KIBI_BYTE("KIBI_BYTE"),
    
    KIBI_BYTE_PER_HOUR("KIBI_BYTE_PER_HOUR"),
    
    KIBI_BYTE_PER_MINUTE("KIBI_BYTE_PER_MINUTE"),
    
    KIBI_BYTE_PER_SECOND("KIBI_BYTE_PER_SECOND"),
    
    KILO("KILO"),
    
    KILO_BYTE("KILO_BYTE"),
    
    KILO_BYTE_PER_HOUR("KILO_BYTE_PER_HOUR"),
    
    KILO_BYTE_PER_MINUTE("KILO_BYTE_PER_MINUTE"),
    
    KILO_BYTE_PER_SECOND("KILO_BYTE_PER_SECOND"),
    
    KILO_METRE_PER_HOUR("KILO_METRE_PER_HOUR"),
    
    MEBI_BYTE("MEBI_BYTE"),
    
    MEBI_BYTE_PER_HOUR("MEBI_BYTE_PER_HOUR"),
    
    MEBI_BYTE_PER_MINUTE("MEBI_BYTE_PER_MINUTE"),
    
    MEBI_BYTE_PER_SECOND("MEBI_BYTE_PER_SECOND"),
    
    MEGA("MEGA"),
    
    MEGA_BYTE("MEGA_BYTE"),
    
    MEGA_BYTE_PER_HOUR("MEGA_BYTE_PER_HOUR"),
    
    MEGA_BYTE_PER_MINUTE("MEGA_BYTE_PER_MINUTE"),
    
    MEGA_BYTE_PER_SECOND("MEGA_BYTE_PER_SECOND"),
    
    METRE_PER_HOUR("METRE_PER_HOUR"),
    
    METRE_PER_SECOND("METRE_PER_SECOND"),
    
    MICRO_SECOND("MICRO_SECOND"),
    
    MILLION("MILLION"),
    
    MILLI_CORES("MILLI_CORES"),
    
    MILLI_SECOND("MILLI_SECOND"),
    
    MILLI_SECOND_PER_MINUTE("MILLI_SECOND_PER_MINUTE"),
    
    MINUTE("MINUTE"),
    
    MONTH("MONTH"),
    
    MSU("MSU"),
    
    NANO_SECOND("NANO_SECOND"),
    
    NANO_SECOND_PER_MINUTE("NANO_SECOND_PER_MINUTE"),
    
    NOT_APPLICABLE("NOT_APPLICABLE"),
    
    PERCENT("PERCENT"),
    
    PER_HOUR("PER_HOUR"),
    
    PER_MINUTE("PER_MINUTE"),
    
    PER_SECOND("PER_SECOND"),
    
    PIXEL("PIXEL"),
    
    PROMILLE("PROMILLE"),
    
    RATIO("RATIO"),
    
    SECOND("SECOND"),
    
    STATE("STATE"),
    
    UNSPECIFIED("UNSPECIFIED"),
    
    WEEK("WEEK"),
    
    YEAR("YEAR");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIT = "unit";
  private UnitEnum unit;

  public MetricEventStaticThresholdMonitoringStrategy() { 
  }

  public MetricEventStaticThresholdMonitoringStrategy samples(Integer samples) {
    this.samples = samples;
    return this;
  }

   /**
   * The number of one-minute samples that form the sliding evaluation window.
   * minimum: 3
   * maximum: 60
   * @return samples
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of one-minute samples that form the sliding evaluation window.")
  @JsonProperty(JSON_PROPERTY_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSamples() {
    return samples;
  }


  @JsonProperty(JSON_PROPERTY_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSamples(Integer samples) {
    this.samples = samples;
  }


  public MetricEventStaticThresholdMonitoringStrategy violatingSamples(Integer violatingSamples) {
    this.violatingSamples = violatingSamples;
    return this;
  }

   /**
   * The number of one-minute samples within the evaluation window that must violate the threshold to trigger an event.
   * minimum: 1
   * @return violatingSamples
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of one-minute samples within the evaluation window that must violate the threshold to trigger an event.")
  @JsonProperty(JSON_PROPERTY_VIOLATING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getViolatingSamples() {
    return violatingSamples;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolatingSamples(Integer violatingSamples) {
    this.violatingSamples = violatingSamples;
  }


  public MetricEventStaticThresholdMonitoringStrategy dealertingSamples(Integer dealertingSamples) {
    this.dealertingSamples = dealertingSamples;
    return this;
  }

   /**
   * The number of one-minute samples within the evaluation window that must go back to normal to close the event.
   * minimum: 3
   * @return dealertingSamples
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of one-minute samples within the evaluation window that must go back to normal to close the event.")
  @JsonProperty(JSON_PROPERTY_DEALERTING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDealertingSamples() {
    return dealertingSamples;
  }


  @JsonProperty(JSON_PROPERTY_DEALERTING_SAMPLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDealertingSamples(Integer dealertingSamples) {
    this.dealertingSamples = dealertingSamples;
  }


  public MetricEventStaticThresholdMonitoringStrategy alertCondition(AlertConditionEnum alertCondition) {
    this.alertCondition = alertCondition;
    return this;
  }

   /**
   * The condition for the **threshold** value check: above or below.
   * @return alertCondition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The condition for the **threshold** value check: above or below.")
  @JsonProperty(JSON_PROPERTY_ALERT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AlertConditionEnum getAlertCondition() {
    return alertCondition;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlertCondition(AlertConditionEnum alertCondition) {
    this.alertCondition = alertCondition;
  }


  public MetricEventStaticThresholdMonitoringStrategy alertingOnMissingData(Boolean alertingOnMissingData) {
    this.alertingOnMissingData = alertingOnMissingData;
    return this;
  }

   /**
   * If true, also one-minute samples without data are counted as violating samples.
   * @return alertingOnMissingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, also one-minute samples without data are counted as violating samples.")
  @JsonProperty(JSON_PROPERTY_ALERTING_ON_MISSING_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlertingOnMissingData() {
    return alertingOnMissingData;
  }


  @JsonProperty(JSON_PROPERTY_ALERTING_ON_MISSING_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertingOnMissingData(Boolean alertingOnMissingData) {
    this.alertingOnMissingData = alertingOnMissingData;
  }


  public MetricEventStaticThresholdMonitoringStrategy threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The value of the static threshold based on the specified unit.
   * @return threshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value of the static threshold based on the specified unit.")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public MetricEventStaticThresholdMonitoringStrategy unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the threshold, matching the metric definition.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unit of the threshold, matching the metric definition.")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnitEnum getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  /**
   * Return true if this MetricEventStaticThresholdMonitoringStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricEventStaticThresholdMonitoringStrategy metricEventStaticThresholdMonitoringStrategy = (MetricEventStaticThresholdMonitoringStrategy) o;
    return Objects.equals(this.samples, metricEventStaticThresholdMonitoringStrategy.samples) &&
        Objects.equals(this.violatingSamples, metricEventStaticThresholdMonitoringStrategy.violatingSamples) &&
        Objects.equals(this.dealertingSamples, metricEventStaticThresholdMonitoringStrategy.dealertingSamples) &&
        Objects.equals(this.alertCondition, metricEventStaticThresholdMonitoringStrategy.alertCondition) &&
        Objects.equals(this.alertingOnMissingData, metricEventStaticThresholdMonitoringStrategy.alertingOnMissingData) &&
        Objects.equals(this.threshold, metricEventStaticThresholdMonitoringStrategy.threshold) &&
        Objects.equals(this.unit, metricEventStaticThresholdMonitoringStrategy.unit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samples, violatingSamples, dealertingSamples, alertCondition, alertingOnMissingData, threshold, unit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricEventStaticThresholdMonitoringStrategy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    violatingSamples: ").append(toIndentedString(violatingSamples)).append("\n");
    sb.append("    dealertingSamples: ").append(toIndentedString(dealertingSamples)).append("\n");
    sb.append("    alertCondition: ").append(toIndentedString(alertCondition)).append("\n");
    sb.append("    alertingOnMissingData: ").append(toIndentedString(alertingOnMissingData)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
  mappings.put("MetricEventStaticThresholdMonitoringStrategy", MetricEventStaticThresholdMonitoringStrategy.class);
  JSON.registerDiscriminator(MetricEventStaticThresholdMonitoringStrategy.class, "type", mappings);
}
}
