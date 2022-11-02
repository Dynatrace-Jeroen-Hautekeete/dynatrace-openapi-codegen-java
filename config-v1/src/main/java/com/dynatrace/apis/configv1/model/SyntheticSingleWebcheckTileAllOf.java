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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SyntheticSingleWebcheckTileAllOf
 */
@JsonPropertyOrder({
  SyntheticSingleWebcheckTileAllOf.JSON_PROPERTY_ASSIGNED_ENTITIES,
  SyntheticSingleWebcheckTileAllOf.JSON_PROPERTY_EXCLUDE_MAINTENANCE_WINDOWS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class SyntheticSingleWebcheckTileAllOf {
  public static final String JSON_PROPERTY_ASSIGNED_ENTITIES = "assignedEntities";
  private List<String> assignedEntities = null;

  public static final String JSON_PROPERTY_EXCLUDE_MAINTENANCE_WINDOWS = "excludeMaintenanceWindows";
  private Boolean excludeMaintenanceWindows;

  public SyntheticSingleWebcheckTileAllOf() { 
  }

  public SyntheticSingleWebcheckTileAllOf assignedEntities(List<String> assignedEntities) {
    this.assignedEntities = assignedEntities;
    return this;
  }

  public SyntheticSingleWebcheckTileAllOf addAssignedEntitiesItem(String assignedEntitiesItem) {
    if (this.assignedEntities == null) {
      this.assignedEntities = new ArrayList<>();
    }
    this.assignedEntities.add(assignedEntitiesItem);
    return this;
  }

   /**
   * The list of Dynatrace entities, assigned to the tile.
   * @return assignedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Dynatrace entities, assigned to the tile.")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAssignedEntities() {
    return assignedEntities;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedEntities(List<String> assignedEntities) {
    this.assignedEntities = assignedEntities;
  }


  public SyntheticSingleWebcheckTileAllOf excludeMaintenanceWindows(Boolean excludeMaintenanceWindows) {
    this.excludeMaintenanceWindows = excludeMaintenanceWindows;
    return this;
  }

   /**
   * Include (&#x60;false&#39;) or exclude (&#x60;true&#x60;) maintenance windows from availability calculations.
   * @return excludeMaintenanceWindows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include (`false') or exclude (`true`) maintenance windows from availability calculations.")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_MAINTENANCE_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExcludeMaintenanceWindows() {
    return excludeMaintenanceWindows;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_MAINTENANCE_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeMaintenanceWindows(Boolean excludeMaintenanceWindows) {
    this.excludeMaintenanceWindows = excludeMaintenanceWindows;
  }


  /**
   * Return true if this SyntheticSingleWebcheckTile_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticSingleWebcheckTileAllOf syntheticSingleWebcheckTileAllOf = (SyntheticSingleWebcheckTileAllOf) o;
    return Objects.equals(this.assignedEntities, syntheticSingleWebcheckTileAllOf.assignedEntities) &&
        Objects.equals(this.excludeMaintenanceWindows, syntheticSingleWebcheckTileAllOf.excludeMaintenanceWindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedEntities, excludeMaintenanceWindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticSingleWebcheckTileAllOf {\n");
    sb.append("    assignedEntities: ").append(toIndentedString(assignedEntities)).append("\n");
    sb.append("    excludeMaintenanceWindows: ").append(toIndentedString(excludeMaintenanceWindows)).append("\n");
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

