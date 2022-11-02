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
 * Global outage handling configuration.
 */
@ApiModel(description = "Global outage handling configuration.")
@JsonPropertyOrder({
  GlobalOutagePolicy.JSON_PROPERTY_CONSECUTIVE_RUNS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class GlobalOutagePolicy {
  public static final String JSON_PROPERTY_CONSECUTIVE_RUNS = "consecutiveRuns";
  private Integer consecutiveRuns;

  public GlobalOutagePolicy() { 
  }

  public GlobalOutagePolicy consecutiveRuns(Integer consecutiveRuns) {
    this.consecutiveRuns = consecutiveRuns;
    return this;
  }

   /**
   * Alert if all locations are unable to access the web application *X* times consecutively.
   * minimum: 1
   * maximum: 5
   * @return consecutiveRuns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Alert if all locations are unable to access the web application *X* times consecutively.")
  @JsonProperty(JSON_PROPERTY_CONSECUTIVE_RUNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getConsecutiveRuns() {
    return consecutiveRuns;
  }


  @JsonProperty(JSON_PROPERTY_CONSECUTIVE_RUNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsecutiveRuns(Integer consecutiveRuns) {
    this.consecutiveRuns = consecutiveRuns;
  }


  /**
   * Return true if this GlobalOutagePolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalOutagePolicy globalOutagePolicy = (GlobalOutagePolicy) o;
    return Objects.equals(this.consecutiveRuns, globalOutagePolicy.consecutiveRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consecutiveRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalOutagePolicy {\n");
    sb.append("    consecutiveRuns: ").append(toIndentedString(consecutiveRuns)).append("\n");
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
