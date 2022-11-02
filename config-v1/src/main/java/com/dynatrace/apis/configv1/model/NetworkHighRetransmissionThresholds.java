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
 * Custom thresholds for high retransmission rate. If not set, automatic mode is used.    **All** of these conditions must be met to trigger an alert.
 */
@ApiModel(description = "Custom thresholds for high retransmission rate. If not set, automatic mode is used.    **All** of these conditions must be met to trigger an alert.")
@JsonPropertyOrder({
  NetworkHighRetransmissionThresholds.JSON_PROPERTY_RETRANSMISSION_RATE_PERCENTAGE,
  NetworkHighRetransmissionThresholds.JSON_PROPERTY_RETRANSMITTED_PACKETS_NUMBER_PER_MINUTE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class NetworkHighRetransmissionThresholds {
  public static final String JSON_PROPERTY_RETRANSMISSION_RATE_PERCENTAGE = "retransmissionRatePercentage";
  private Integer retransmissionRatePercentage;

  public static final String JSON_PROPERTY_RETRANSMITTED_PACKETS_NUMBER_PER_MINUTE = "retransmittedPacketsNumberPerMinute";
  private Integer retransmittedPacketsNumberPerMinute;

  public NetworkHighRetransmissionThresholds() { 
  }

  public NetworkHighRetransmissionThresholds retransmissionRatePercentage(Integer retransmissionRatePercentage) {
    this.retransmissionRatePercentage = retransmissionRatePercentage;
    return this;
  }

   /**
   * Retransmission rate is higher than *X*% in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return retransmissionRatePercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Retransmission rate is higher than *X*% in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_RETRANSMISSION_RATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRetransmissionRatePercentage() {
    return retransmissionRatePercentage;
  }


  @JsonProperty(JSON_PROPERTY_RETRANSMISSION_RATE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRetransmissionRatePercentage(Integer retransmissionRatePercentage) {
    this.retransmissionRatePercentage = retransmissionRatePercentage;
  }


  public NetworkHighRetransmissionThresholds retransmittedPacketsNumberPerMinute(Integer retransmittedPacketsNumberPerMinute) {
    this.retransmittedPacketsNumberPerMinute = retransmittedPacketsNumberPerMinute;
    return this;
  }

   /**
   * Number of retransmitted packets is higher than *X* packets per minute in 3 out of 5 samples.
   * minimum: 1
   * maximum: 10000
   * @return retransmittedPacketsNumberPerMinute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of retransmitted packets is higher than *X* packets per minute in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_RETRANSMITTED_PACKETS_NUMBER_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRetransmittedPacketsNumberPerMinute() {
    return retransmittedPacketsNumberPerMinute;
  }


  @JsonProperty(JSON_PROPERTY_RETRANSMITTED_PACKETS_NUMBER_PER_MINUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRetransmittedPacketsNumberPerMinute(Integer retransmittedPacketsNumberPerMinute) {
    this.retransmittedPacketsNumberPerMinute = retransmittedPacketsNumberPerMinute;
  }


  /**
   * Return true if this NetworkHighRetransmissionThresholds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkHighRetransmissionThresholds networkHighRetransmissionThresholds = (NetworkHighRetransmissionThresholds) o;
    return Objects.equals(this.retransmissionRatePercentage, networkHighRetransmissionThresholds.retransmissionRatePercentage) &&
        Objects.equals(this.retransmittedPacketsNumberPerMinute, networkHighRetransmissionThresholds.retransmittedPacketsNumberPerMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retransmissionRatePercentage, retransmittedPacketsNumberPerMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkHighRetransmissionThresholds {\n");
    sb.append("    retransmissionRatePercentage: ").append(toIndentedString(retransmissionRatePercentage)).append("\n");
    sb.append("    retransmittedPacketsNumberPerMinute: ").append(toIndentedString(retransmittedPacketsNumberPerMinute)).append("\n");
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
