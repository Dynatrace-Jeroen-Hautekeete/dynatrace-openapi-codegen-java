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
 * An entity related to a security problem.
 */
@ApiModel(description = "An entity related to a security problem.")
@JsonPropertyOrder({
  RelatedEntity.JSON_PROPERTY_ID,
  RelatedEntity.JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES,
  RelatedEntity.JSON_PROPERTY_AFFECTED_ENTITIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class RelatedEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES = "numberOfAffectedEntities";
  private Long numberOfAffectedEntities;

  public static final String JSON_PROPERTY_AFFECTED_ENTITIES = "affectedEntities";
  private List<String> affectedEntities = null;

  public RelatedEntity() { 
  }

  @JsonCreator
  public RelatedEntity(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES) Long numberOfAffectedEntities, 
    @JsonProperty(JSON_PROPERTY_AFFECTED_ENTITIES) List<String> affectedEntities
  ) {
  this();
    this.id = id;
    this.numberOfAffectedEntities = numberOfAffectedEntities;
    this.affectedEntities = affectedEntities;
  }

   /**
   * The Dynatrace entity ID of the entity.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Dynatrace entity ID of the entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The number of affected entities related to the entity.
   * @return numberOfAffectedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of affected entities related to the entity.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfAffectedEntities() {
    return numberOfAffectedEntities;
  }




   /**
   * A list of affected entities related to the entity.
   * @return affectedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of affected entities related to the entity.")
  @JsonProperty(JSON_PROPERTY_AFFECTED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAffectedEntities() {
    return affectedEntities;
  }




  /**
   * Return true if this RelatedEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedEntity relatedEntity = (RelatedEntity) o;
    return Objects.equals(this.id, relatedEntity.id) &&
        Objects.equals(this.numberOfAffectedEntities, relatedEntity.numberOfAffectedEntities) &&
        Objects.equals(this.affectedEntities, relatedEntity.affectedEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numberOfAffectedEntities, affectedEntities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfAffectedEntities: ").append(toIndentedString(numberOfAffectedEntities)).append("\n");
    sb.append("    affectedEntities: ").append(toIndentedString(affectedEntities)).append("\n");
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
