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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The metadata of a unit.
 */
@ApiModel(description = "The metadata of a unit.")
@JsonPropertyOrder({
  Unit.JSON_PROPERTY_UNIT_ID,
  Unit.JSON_PROPERTY_DISPLAY_NAME,
  Unit.JSON_PROPERTY_SYMBOL,
  Unit.JSON_PROPERTY_DESCRIPTION,
  Unit.JSON_PROPERTY_DISPLAY_NAME_PLURAL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class Unit {
  public static final String JSON_PROPERTY_UNIT_ID = "unitId";
  private String unitId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME_PLURAL = "displayNamePlural";
  private String displayNamePlural;

  public Unit() { 
  }

  public Unit unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

   /**
   * The ID of the unit.
   * @return unitId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the unit.")
  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnitId() {
    return unitId;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }


  public Unit displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the unit.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the unit.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Unit symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the unit.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the unit.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public Unit description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the unit.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the unit.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Unit displayNamePlural(String displayNamePlural) {
    this.displayNamePlural = displayNamePlural;
    return this;
  }

   /**
   * The plural display name of the unit.
   * @return displayNamePlural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The plural display name of the unit.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME_PLURAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayNamePlural() {
    return displayNamePlural;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME_PLURAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayNamePlural(String displayNamePlural) {
    this.displayNamePlural = displayNamePlural;
  }


  /**
   * Return true if this Unit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unit unit = (Unit) o;
    return Objects.equals(this.unitId, unit.unitId) &&
        Objects.equals(this.displayName, unit.displayName) &&
        Objects.equals(this.symbol, unit.symbol) &&
        Objects.equals(this.description, unit.description) &&
        Objects.equals(this.displayNamePlural, unit.displayNamePlural);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, displayName, symbol, description, displayNamePlural);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayNamePlural: ").append(toIndentedString(displayNamePlural)).append("\n");
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

