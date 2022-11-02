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
 * The TO position of a relationship.
 */
@ApiModel(description = "The TO position of a relationship.")
@JsonPropertyOrder({
  ToPosition.JSON_PROPERTY_TO_TYPES,
  ToPosition.JSON_PROPERTY_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class ToPosition {
  public static final String JSON_PROPERTY_TO_TYPES = "toTypes";
  private List<String> toTypes = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ToPosition() { 
  }

  public ToPosition toTypes(List<String> toTypes) {
    this.toTypes = toTypes;
    return this;
  }

  public ToPosition addToTypesItem(String toTypesItem) {
    if (this.toTypes == null) {
      this.toTypes = new ArrayList<>();
    }
    this.toTypes.add(toTypesItem);
    return this;
  }

   /**
   * A list of monitored entity types that can occupy the TO position.
   * @return toTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of monitored entity types that can occupy the TO position.")
  @JsonProperty(JSON_PROPERTY_TO_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getToTypes() {
    return toTypes;
  }


  @JsonProperty(JSON_PROPERTY_TO_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToTypes(List<String> toTypes) {
    this.toTypes = toTypes;
  }


  public ToPosition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the relationship.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the relationship.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this ToPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToPosition toPosition = (ToPosition) o;
    return Objects.equals(this.toTypes, toPosition.toTypes) &&
        Objects.equals(this.id, toPosition.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toTypes, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToPosition {\n");
    sb.append("    toTypes: ").append(toIndentedString(toTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

