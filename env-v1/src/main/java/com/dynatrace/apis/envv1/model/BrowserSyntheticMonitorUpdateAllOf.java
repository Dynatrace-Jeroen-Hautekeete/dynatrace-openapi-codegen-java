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
import com.dynatrace.apis.envv1.model.KeyPerformanceMetrics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BrowserSyntheticMonitorUpdateAllOf
 */
@JsonPropertyOrder({
  BrowserSyntheticMonitorUpdateAllOf.JSON_PROPERTY_KEY_PERFORMANCE_METRICS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class BrowserSyntheticMonitorUpdateAllOf {
  public static final String JSON_PROPERTY_KEY_PERFORMANCE_METRICS = "keyPerformanceMetrics";
  private KeyPerformanceMetrics keyPerformanceMetrics;

  public BrowserSyntheticMonitorUpdateAllOf() { 
  }

  public BrowserSyntheticMonitorUpdateAllOf keyPerformanceMetrics(KeyPerformanceMetrics keyPerformanceMetrics) {
    this.keyPerformanceMetrics = keyPerformanceMetrics;
    return this;
  }

   /**
   * Get keyPerformanceMetrics
   * @return keyPerformanceMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY_PERFORMANCE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyPerformanceMetrics getKeyPerformanceMetrics() {
    return keyPerformanceMetrics;
  }


  @JsonProperty(JSON_PROPERTY_KEY_PERFORMANCE_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyPerformanceMetrics(KeyPerformanceMetrics keyPerformanceMetrics) {
    this.keyPerformanceMetrics = keyPerformanceMetrics;
  }


  /**
   * Return true if this BrowserSyntheticMonitorUpdate_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserSyntheticMonitorUpdateAllOf browserSyntheticMonitorUpdateAllOf = (BrowserSyntheticMonitorUpdateAllOf) o;
    return Objects.equals(this.keyPerformanceMetrics, browserSyntheticMonitorUpdateAllOf.keyPerformanceMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPerformanceMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserSyntheticMonitorUpdateAllOf {\n");
    sb.append("    keyPerformanceMetrics: ").append(toIndentedString(keyPerformanceMetrics)).append("\n");
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
