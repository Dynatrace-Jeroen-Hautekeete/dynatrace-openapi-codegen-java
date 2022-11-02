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
 * A DTO for synthetic Location IDs.
 */
@ApiModel(description = "A DTO for synthetic Location IDs.")
@JsonPropertyOrder({
  SyntheticLocationIdsDto.JSON_PROPERTY_ENTITY_ID,
  SyntheticLocationIdsDto.JSON_PROPERTY_GEO_LOCATION_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SyntheticLocationIdsDto {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_GEO_LOCATION_ID = "geoLocationId";
  private String geoLocationId;

  public SyntheticLocationIdsDto() { 
  }

  public SyntheticLocationIdsDto entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Entity ID to be transferred
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Entity ID to be transferred")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SyntheticLocationIdsDto geoLocationId(String geoLocationId) {
    this.geoLocationId = geoLocationId;
    return this;
  }

   /**
   * GeoLocation ID to be transferred
   * @return geoLocationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "GeoLocation ID to be transferred")
  @JsonProperty(JSON_PROPERTY_GEO_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGeoLocationId() {
    return geoLocationId;
  }


  @JsonProperty(JSON_PROPERTY_GEO_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGeoLocationId(String geoLocationId) {
    this.geoLocationId = geoLocationId;
  }


  /**
   * Return true if this SyntheticLocationIdsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticLocationIdsDto syntheticLocationIdsDto = (SyntheticLocationIdsDto) o;
    return Objects.equals(this.entityId, syntheticLocationIdsDto.entityId) &&
        Objects.equals(this.geoLocationId, syntheticLocationIdsDto.geoLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, geoLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticLocationIdsDto {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    geoLocationId: ").append(toIndentedString(geoLocationId)).append("\n");
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

