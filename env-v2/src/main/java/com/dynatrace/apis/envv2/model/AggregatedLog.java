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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Aggregated log records.
 */
@ApiModel(description = "Aggregated log records.")
@JsonPropertyOrder({
  AggregatedLog.JSON_PROPERTY_AGGREGATION_RESULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class AggregatedLog {
  public static final String JSON_PROPERTY_AGGREGATION_RESULT = "aggregationResult";
  private Map<String, Map<String, Map<String, Long>>> aggregationResult = null;

  public AggregatedLog() { 
  }

  public AggregatedLog aggregationResult(Map<String, Map<String, Map<String, Long>>> aggregationResult) {
    this.aggregationResult = aggregationResult;
    return this;
  }

  public AggregatedLog putAggregationResultItem(String key, Map<String, Map<String, Long>> aggregationResultItem) {
    if (this.aggregationResult == null) {
      this.aggregationResult = new HashMap<>();
    }
    this.aggregationResult.put(key, aggregationResultItem);
    return this;
  }

   /**
   * Aggregated log records.
   * @return aggregationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aggregated log records.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, Map<String, Long>>> getAggregationResult() {
    return aggregationResult;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationResult(Map<String, Map<String, Map<String, Long>>> aggregationResult) {
    this.aggregationResult = aggregationResult;
  }


  /**
   * Return true if this AggregatedLog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedLog aggregatedLog = (AggregatedLog) o;
    return Objects.equals(this.aggregationResult, aggregatedLog.aggregationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedLog {\n");
    sb.append("    aggregationResult: ").append(toIndentedString(aggregationResult)).append("\n");
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

