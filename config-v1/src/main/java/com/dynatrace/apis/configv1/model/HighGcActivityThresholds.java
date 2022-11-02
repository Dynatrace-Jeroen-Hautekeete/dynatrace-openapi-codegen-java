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
 * Custom thresholds for high GC activity. If not set, automatic mode is used.    Meeting **any** of these conditions triggers an alert.
 */
@ApiModel(description = "Custom thresholds for high GC activity. If not set, automatic mode is used.    Meeting **any** of these conditions triggers an alert.")
@JsonPropertyOrder({
  HighGcActivityThresholds.JSON_PROPERTY_GC_TIME_PERCENTAGE,
  HighGcActivityThresholds.JSON_PROPERTY_GC_SUSPENSION_PERCENTAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class HighGcActivityThresholds {
  public static final String JSON_PROPERTY_GC_TIME_PERCENTAGE = "gcTimePercentage";
  private Integer gcTimePercentage;

  public static final String JSON_PROPERTY_GC_SUSPENSION_PERCENTAGE = "gcSuspensionPercentage";
  private Integer gcSuspensionPercentage;

  public HighGcActivityThresholds() { 
  }

  public HighGcActivityThresholds gcTimePercentage(Integer gcTimePercentage) {
    this.gcTimePercentage = gcTimePercentage;
    return this;
  }

   /**
   * GC time is higher than *X*% in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return gcTimePercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "GC time is higher than *X*% in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_GC_TIME_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGcTimePercentage() {
    return gcTimePercentage;
  }


  @JsonProperty(JSON_PROPERTY_GC_TIME_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGcTimePercentage(Integer gcTimePercentage) {
    this.gcTimePercentage = gcTimePercentage;
  }


  public HighGcActivityThresholds gcSuspensionPercentage(Integer gcSuspensionPercentage) {
    this.gcSuspensionPercentage = gcSuspensionPercentage;
    return this;
  }

   /**
   * GC suspension is higher than *X*% in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return gcSuspensionPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "GC suspension is higher than *X*% in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_GC_SUSPENSION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGcSuspensionPercentage() {
    return gcSuspensionPercentage;
  }


  @JsonProperty(JSON_PROPERTY_GC_SUSPENSION_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGcSuspensionPercentage(Integer gcSuspensionPercentage) {
    this.gcSuspensionPercentage = gcSuspensionPercentage;
  }


  /**
   * Return true if this HighGcActivityThresholds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HighGcActivityThresholds highGcActivityThresholds = (HighGcActivityThresholds) o;
    return Objects.equals(this.gcTimePercentage, highGcActivityThresholds.gcTimePercentage) &&
        Objects.equals(this.gcSuspensionPercentage, highGcActivityThresholds.gcSuspensionPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gcTimePercentage, gcSuspensionPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HighGcActivityThresholds {\n");
    sb.append("    gcTimePercentage: ").append(toIndentedString(gcTimePercentage)).append("\n");
    sb.append("    gcSuspensionPercentage: ").append(toIndentedString(gcSuspensionPercentage)).append("\n");
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
