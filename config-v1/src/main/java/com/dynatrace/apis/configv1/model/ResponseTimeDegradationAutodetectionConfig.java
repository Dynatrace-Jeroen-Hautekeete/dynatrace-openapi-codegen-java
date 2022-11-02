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
 * Parameters of the response time degradation auto-detection. Required if the **detectionMode** is &#x60;DETECT_AUTOMATICALLY&#x60;. Not applicable otherwise.   Violation of **any** criterion triggers an alert.
 */
@ApiModel(description = "Parameters of the response time degradation auto-detection. Required if the **detectionMode** is `DETECT_AUTOMATICALLY`. Not applicable otherwise.   Violation of **any** criterion triggers an alert.")
@JsonPropertyOrder({
  ResponseTimeDegradationAutodetectionConfig.JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_MILLISECONDS,
  ResponseTimeDegradationAutodetectionConfig.JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_PERCENT,
  ResponseTimeDegradationAutodetectionConfig.JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_MILLISECONDS,
  ResponseTimeDegradationAutodetectionConfig.JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_PERCENT,
  ResponseTimeDegradationAutodetectionConfig.JSON_PROPERTY_LOAD_THRESHOLD
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ResponseTimeDegradationAutodetectionConfig {
  public static final String JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_MILLISECONDS = "responseTimeDegradationMilliseconds";
  private Integer responseTimeDegradationMilliseconds;

  public static final String JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_PERCENT = "responseTimeDegradationPercent";
  private Integer responseTimeDegradationPercent;

  public static final String JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_MILLISECONDS = "slowestResponseTimeDegradationMilliseconds";
  private Integer slowestResponseTimeDegradationMilliseconds;

  public static final String JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_PERCENT = "slowestResponseTimeDegradationPercent";
  private Integer slowestResponseTimeDegradationPercent;

  /**
   * Minimal service load to detect response time degradation.    Response time degradation of services with smaller load won&#39;t trigger alerts.
   */
  public enum LoadThresholdEnum {
    FIFTEEN_REQUESTS_PER_MINUTE("FIFTEEN_REQUESTS_PER_MINUTE"),
    
    FIVE_REQUESTS_PER_MINUTE("FIVE_REQUESTS_PER_MINUTE"),
    
    ONE_REQUEST_PER_MINUTE("ONE_REQUEST_PER_MINUTE"),
    
    TEN_REQUESTS_PER_MINUTE("TEN_REQUESTS_PER_MINUTE");

    private String value;

    LoadThresholdEnum(String value) {
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
    public static LoadThresholdEnum fromValue(String value) {
      for (LoadThresholdEnum b : LoadThresholdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LOAD_THRESHOLD = "loadThreshold";
  private LoadThresholdEnum loadThreshold;

  public ResponseTimeDegradationAutodetectionConfig() { 
  }

  public ResponseTimeDegradationAutodetectionConfig responseTimeDegradationMilliseconds(Integer responseTimeDegradationMilliseconds) {
    this.responseTimeDegradationMilliseconds = responseTimeDegradationMilliseconds;
    return this;
  }

   /**
   * Alert if the response time degrades beyond *X* milliseconds.
   * minimum: 0
   * maximum: 100000
   * @return responseTimeDegradationMilliseconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alert if the response time degrades beyond *X* milliseconds.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResponseTimeDegradationMilliseconds() {
    return responseTimeDegradationMilliseconds;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseTimeDegradationMilliseconds(Integer responseTimeDegradationMilliseconds) {
    this.responseTimeDegradationMilliseconds = responseTimeDegradationMilliseconds;
  }


  public ResponseTimeDegradationAutodetectionConfig responseTimeDegradationPercent(Integer responseTimeDegradationPercent) {
    this.responseTimeDegradationPercent = responseTimeDegradationPercent;
    return this;
  }

   /**
   * Alert if the response time degrades beyond *X* %.
   * minimum: 0
   * maximum: 1000
   * @return responseTimeDegradationPercent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alert if the response time degrades beyond *X* %.")
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getResponseTimeDegradationPercent() {
    return responseTimeDegradationPercent;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME_DEGRADATION_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseTimeDegradationPercent(Integer responseTimeDegradationPercent) {
    this.responseTimeDegradationPercent = responseTimeDegradationPercent;
  }


  public ResponseTimeDegradationAutodetectionConfig slowestResponseTimeDegradationMilliseconds(Integer slowestResponseTimeDegradationMilliseconds) {
    this.slowestResponseTimeDegradationMilliseconds = slowestResponseTimeDegradationMilliseconds;
    return this;
  }

   /**
   * Alert if the response time of the slowest 10% degrades beyond *X* milliseconds.
   * minimum: 0
   * maximum: 100000
   * @return slowestResponseTimeDegradationMilliseconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alert if the response time of the slowest 10% degrades beyond *X* milliseconds.")
  @JsonProperty(JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSlowestResponseTimeDegradationMilliseconds() {
    return slowestResponseTimeDegradationMilliseconds;
  }


  @JsonProperty(JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_MILLISECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowestResponseTimeDegradationMilliseconds(Integer slowestResponseTimeDegradationMilliseconds) {
    this.slowestResponseTimeDegradationMilliseconds = slowestResponseTimeDegradationMilliseconds;
  }


  public ResponseTimeDegradationAutodetectionConfig slowestResponseTimeDegradationPercent(Integer slowestResponseTimeDegradationPercent) {
    this.slowestResponseTimeDegradationPercent = slowestResponseTimeDegradationPercent;
    return this;
  }

   /**
   * Alert if the response time of the slowest 10% degrades beyond *X* %.
   * minimum: 0
   * maximum: 1000
   * @return slowestResponseTimeDegradationPercent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alert if the response time of the slowest 10% degrades beyond *X* %.")
  @JsonProperty(JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSlowestResponseTimeDegradationPercent() {
    return slowestResponseTimeDegradationPercent;
  }


  @JsonProperty(JSON_PROPERTY_SLOWEST_RESPONSE_TIME_DEGRADATION_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlowestResponseTimeDegradationPercent(Integer slowestResponseTimeDegradationPercent) {
    this.slowestResponseTimeDegradationPercent = slowestResponseTimeDegradationPercent;
  }


  public ResponseTimeDegradationAutodetectionConfig loadThreshold(LoadThresholdEnum loadThreshold) {
    this.loadThreshold = loadThreshold;
    return this;
  }

   /**
   * Minimal service load to detect response time degradation.    Response time degradation of services with smaller load won&#39;t trigger alerts.
   * @return loadThreshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Minimal service load to detect response time degradation.    Response time degradation of services with smaller load won't trigger alerts.")
  @JsonProperty(JSON_PROPERTY_LOAD_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LoadThresholdEnum getLoadThreshold() {
    return loadThreshold;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoadThreshold(LoadThresholdEnum loadThreshold) {
    this.loadThreshold = loadThreshold;
  }


  /**
   * Return true if this ResponseTimeDegradationAutodetectionConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTimeDegradationAutodetectionConfig responseTimeDegradationAutodetectionConfig = (ResponseTimeDegradationAutodetectionConfig) o;
    return Objects.equals(this.responseTimeDegradationMilliseconds, responseTimeDegradationAutodetectionConfig.responseTimeDegradationMilliseconds) &&
        Objects.equals(this.responseTimeDegradationPercent, responseTimeDegradationAutodetectionConfig.responseTimeDegradationPercent) &&
        Objects.equals(this.slowestResponseTimeDegradationMilliseconds, responseTimeDegradationAutodetectionConfig.slowestResponseTimeDegradationMilliseconds) &&
        Objects.equals(this.slowestResponseTimeDegradationPercent, responseTimeDegradationAutodetectionConfig.slowestResponseTimeDegradationPercent) &&
        Objects.equals(this.loadThreshold, responseTimeDegradationAutodetectionConfig.loadThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseTimeDegradationMilliseconds, responseTimeDegradationPercent, slowestResponseTimeDegradationMilliseconds, slowestResponseTimeDegradationPercent, loadThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTimeDegradationAutodetectionConfig {\n");
    sb.append("    responseTimeDegradationMilliseconds: ").append(toIndentedString(responseTimeDegradationMilliseconds)).append("\n");
    sb.append("    responseTimeDegradationPercent: ").append(toIndentedString(responseTimeDegradationPercent)).append("\n");
    sb.append("    slowestResponseTimeDegradationMilliseconds: ").append(toIndentedString(slowestResponseTimeDegradationMilliseconds)).append("\n");
    sb.append("    slowestResponseTimeDegradationPercent: ").append(toIndentedString(slowestResponseTimeDegradationPercent)).append("\n");
    sb.append("    loadThreshold: ").append(toIndentedString(loadThreshold)).append("\n");
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

