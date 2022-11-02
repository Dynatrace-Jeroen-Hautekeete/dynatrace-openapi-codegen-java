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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FdcPredicateTagKeyEqualsAllOf
 */
@JsonPropertyOrder({
  FdcPredicateTagKeyEqualsAllOf.JSON_PROPERTY_KEYS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class FdcPredicateTagKeyEqualsAllOf {
  public static final String JSON_PROPERTY_KEYS = "keys";
  private Set<String> keys = null;

  public FdcPredicateTagKeyEqualsAllOf() { 
  }

  public FdcPredicateTagKeyEqualsAllOf keys(Set<String> keys) {
    this.keys = keys;
    return this;
  }

  public FdcPredicateTagKeyEqualsAllOf addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new LinkedHashSet<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * A list of reference values. The condition is fulfilled when the attribute (which is the key of a tag) equals *any* of these.
   * @return keys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of reference values. The condition is fulfilled when the attribute (which is the key of a tag) equals *any* of these.")
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getKeys() {
    return keys;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(Set<String> keys) {
    this.keys = keys;
  }


  /**
   * Return true if this FdcPredicateTagKeyEquals_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FdcPredicateTagKeyEqualsAllOf fdcPredicateTagKeyEqualsAllOf = (FdcPredicateTagKeyEqualsAllOf) o;
    return Objects.equals(this.keys, fdcPredicateTagKeyEqualsAllOf.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FdcPredicateTagKeyEqualsAllOf {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
