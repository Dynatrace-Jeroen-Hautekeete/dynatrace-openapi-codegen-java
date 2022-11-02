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
 * The configuration of traffic drops detection.
 */
@ApiModel(description = "The configuration of traffic drops detection.")
@JsonPropertyOrder({
  TrafficDropDetectionConfig.JSON_PROPERTY_ENABLED,
  TrafficDropDetectionConfig.JSON_PROPERTY_TRAFFIC_DROP_PERCENT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class TrafficDropDetectionConfig {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_TRAFFIC_DROP_PERCENT = "trafficDropPercent";
  private Integer trafficDropPercent;

  public TrafficDropDetectionConfig() { 
  }

  public TrafficDropDetectionConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The detection is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The detection is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public TrafficDropDetectionConfig trafficDropPercent(Integer trafficDropPercent) {
    this.trafficDropPercent = trafficDropPercent;
    return this;
  }

   /**
   * Alert if the observed traffic is less than *X* % of the expected value.
   * minimum: 0
   * maximum: 100
   * @return trafficDropPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alert if the observed traffic is less than *X* % of the expected value.")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_DROP_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTrafficDropPercent() {
    return trafficDropPercent;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_DROP_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficDropPercent(Integer trafficDropPercent) {
    this.trafficDropPercent = trafficDropPercent;
  }


  /**
   * Return true if this TrafficDropDetectionConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficDropDetectionConfig trafficDropDetectionConfig = (TrafficDropDetectionConfig) o;
    return Objects.equals(this.enabled, trafficDropDetectionConfig.enabled) &&
        Objects.equals(this.trafficDropPercent, trafficDropDetectionConfig.trafficDropPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, trafficDropPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficDropDetectionConfig {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    trafficDropPercent: ").append(toIndentedString(trafficDropPercent)).append("\n");
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
