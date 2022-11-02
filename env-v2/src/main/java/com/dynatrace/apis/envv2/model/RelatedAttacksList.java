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
 * A list of related attacks of the security problem.   Related attacks are attacks on the exposed security problem.
 */
@ApiModel(description = "A list of related attacks of the security problem.   Related attacks are attacks on the exposed security problem.")
@JsonPropertyOrder({
  RelatedAttacksList.JSON_PROPERTY_ATTACKS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class RelatedAttacksList {
  public static final String JSON_PROPERTY_ATTACKS = "attacks";
  private List<String> attacks = null;

  public RelatedAttacksList() { 
  }

  @JsonCreator
  public RelatedAttacksList(
    @JsonProperty(JSON_PROPERTY_ATTACKS) List<String> attacks
  ) {
  this();
    this.attacks = attacks;
  }

   /**
   * A list of related attack ids.
   * @return attacks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of related attack ids.")
  @JsonProperty(JSON_PROPERTY_ATTACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAttacks() {
    return attacks;
  }




  /**
   * Return true if this RelatedAttacksList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedAttacksList relatedAttacksList = (RelatedAttacksList) o;
    return Objects.equals(this.attacks, relatedAttacksList.attacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedAttacksList {\n");
    sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
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

