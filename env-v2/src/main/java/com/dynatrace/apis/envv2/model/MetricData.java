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
import com.dynatrace.apis.envv2.model.MetricSeriesCollection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A list of metrics and their data points.
 */
@ApiModel(description = "A list of metrics and their data points.")
@JsonPropertyOrder({
  MetricData.JSON_PROPERTY_RESOLUTION,
  MetricData.JSON_PROPERTY_NEXT_PAGE_KEY,
  MetricData.JSON_PROPERTY_TOTAL_COUNT,
  MetricData.JSON_PROPERTY_RESULT,
  MetricData.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class MetricData {
  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;

  public static final String JSON_PROPERTY_NEXT_PAGE_KEY = "nextPageKey";
  private String nextPageKey;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Long totalCount;

  public static final String JSON_PROPERTY_RESULT = "result";
  private List<MetricSeriesCollection> result = new ArrayList<>();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<String> warnings = null;

  public MetricData() { 
  }

  public MetricData resolution(String resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * The timeslot resolution in the result.
   * @return resolution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The timeslot resolution in the result.")
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }


  public MetricData nextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
    return this;
  }

   /**
   * Deprecated. This field is returned for compatibility reasons. It always has the value of &#x60;null&#x60;.
   * @return nextPageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated. This field is returned for compatibility reasons. It always has the value of `null`.")
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageKey() {
    return nextPageKey;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
  }


  public MetricData totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of primary entities in the result.   Has the &#x60;0&#x60; value if none of the requested metrics is suitable for pagination.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of primary entities in the result.   Has the `0` value if none of the requested metrics is suitable for pagination.")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public MetricData result(List<MetricSeriesCollection> result) {
    this.result = result;
    return this;
  }

  public MetricData addResultItem(MetricSeriesCollection resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * A list of metrics and their data points.
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of metrics and their data points.")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MetricSeriesCollection> getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(List<MetricSeriesCollection> result) {
    this.result = result;
  }


  public MetricData warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public MetricData addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this MetricData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricData metricData = (MetricData) o;
    return Objects.equals(this.resolution, metricData.resolution) &&
        Objects.equals(this.nextPageKey, metricData.nextPageKey) &&
        Objects.equals(this.totalCount, metricData.totalCount) &&
        Objects.equals(this.result, metricData.result) &&
        Objects.equals(this.warnings, metricData.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, nextPageKey, totalCount, result, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricData {\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
