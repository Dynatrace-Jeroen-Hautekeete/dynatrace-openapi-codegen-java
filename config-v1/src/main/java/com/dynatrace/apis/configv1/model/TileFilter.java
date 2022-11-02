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
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A filter applied to a tile.    It overrides dashboard&#39;s filter.
 */
@ApiModel(description = "A filter applied to a tile.    It overrides dashboard's filter.")
@JsonPropertyOrder({
  TileFilter.JSON_PROPERTY_TIMEFRAME,
  TileFilter.JSON_PROPERTY_MANAGEMENT_ZONE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class TileFilter {
  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private String timeframe;

  public static final String JSON_PROPERTY_MANAGEMENT_ZONE = "managementZone";
  private EntityShortRepresentation managementZone;

  public TileFilter() { 
  }

  public TileFilter timeframe(String timeframe) {
    this.timeframe = timeframe;
    return this;
  }

   /**
   * The default timeframe of the tile.
   * @return timeframe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default timeframe of the tile.")
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeframe() {
    return timeframe;
  }


  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeframe(String timeframe) {
    this.timeframe = timeframe;
  }


  public TileFilter managementZone(EntityShortRepresentation managementZone) {
    this.managementZone = managementZone;
    return this;
  }

   /**
   * Get managementZone
   * @return managementZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityShortRepresentation getManagementZone() {
    return managementZone;
  }


  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagementZone(EntityShortRepresentation managementZone) {
    this.managementZone = managementZone;
  }


  /**
   * Return true if this TileFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TileFilter tileFilter = (TileFilter) o;
    return Objects.equals(this.timeframe, tileFilter.timeframe) &&
        Objects.equals(this.managementZone, tileFilter.managementZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeframe, managementZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TileFilter {\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    managementZone: ").append(toIndentedString(managementZone)).append("\n");
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

