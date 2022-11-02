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
import com.dynatrace.apis.envv2.model.Filter;
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
 * Optional filters that took effect.
 */
@ApiModel(description = "Optional filters that took effect.")
@JsonPropertyOrder({
  AppliedFilter.JSON_PROPERTY_APPLIED_TO,
  AppliedFilter.JSON_PROPERTY_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class AppliedFilter {
  public static final String JSON_PROPERTY_APPLIED_TO = "appliedTo";
  private List<String> appliedTo = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTER = "filter";
  private Filter filter;

  public AppliedFilter() { 
  }

  public AppliedFilter appliedTo(List<String> appliedTo) {
    this.appliedTo = appliedTo;
    return this;
  }

  public AppliedFilter addAppliedToItem(String appliedToItem) {
    this.appliedTo.add(appliedToItem);
    return this;
  }

   /**
   * The keys of all metrics that this filter has been applied to.   Can contain multiple metrics for complex expressions and always at least one key.
   * @return appliedTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The keys of all metrics that this filter has been applied to.   Can contain multiple metrics for complex expressions and always at least one key.")
  @JsonProperty(JSON_PROPERTY_APPLIED_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAppliedTo() {
    return appliedTo;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppliedTo(List<String> appliedTo) {
    this.appliedTo = appliedTo;
  }


  public AppliedFilter filter(Filter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Filter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(Filter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this AppliedFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedFilter appliedFilter = (AppliedFilter) o;
    return Objects.equals(this.appliedTo, appliedFilter.appliedTo) &&
        Objects.equals(this.filter, appliedFilter.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedTo, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedFilter {\n");
    sb.append("    appliedTo: ").append(toIndentedString(appliedTo)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
