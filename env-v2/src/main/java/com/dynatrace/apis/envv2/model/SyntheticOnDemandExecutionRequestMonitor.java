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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contains monitors to be executed on demand from the locations specified.
 */
@ApiModel(description = "Contains monitors to be executed on demand from the locations specified.")
@JsonPropertyOrder({
  SyntheticOnDemandExecutionRequestMonitor.JSON_PROPERTY_MONITOR_ID,
  SyntheticOnDemandExecutionRequestMonitor.JSON_PROPERTY_LOCATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SyntheticOnDemandExecutionRequestMonitor {
  public static final String JSON_PROPERTY_MONITOR_ID = "monitorId";
  private String monitorId;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public SyntheticOnDemandExecutionRequestMonitor() { 
  }

  public SyntheticOnDemandExecutionRequestMonitor monitorId(String monitorId) {
    this.monitorId = monitorId;
    return this;
  }

   /**
   * The monitor identifier
   * @return monitorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The monitor identifier")
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMonitorId() {
    return monitorId;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitorId(String monitorId) {
    this.monitorId = monitorId;
  }


  public SyntheticOnDemandExecutionRequestMonitor locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticOnDemandExecutionRequestMonitor addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The locations from where the monitor is to be executed.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locations from where the monitor is to be executed.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  /**
   * Return true if this SyntheticOnDemandExecutionRequestMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticOnDemandExecutionRequestMonitor syntheticOnDemandExecutionRequestMonitor = (SyntheticOnDemandExecutionRequestMonitor) o;
    return Objects.equals(this.monitorId, syntheticOnDemandExecutionRequestMonitor.monitorId) &&
        Objects.equals(this.locations, syntheticOnDemandExecutionRequestMonitor.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorId, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticOnDemandExecutionRequestMonitor {\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

