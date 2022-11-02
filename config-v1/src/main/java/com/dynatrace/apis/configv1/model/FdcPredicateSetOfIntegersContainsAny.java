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
import com.dynatrace.apis.configv1.model.FdcPredicate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * The predicate of the &#x60;SET_OF_INTEGERS_CONTAINS_ANY&#x60; type. It checks whether the attribute (which is a set of integers) contains one of the reference values.
 */
@ApiModel(description = "The predicate of the `SET_OF_INTEGERS_CONTAINS_ANY` type. It checks whether the attribute (which is a set of integers) contains one of the reference values.")
@JsonPropertyOrder({
  FdcPredicateSetOfIntegersContainsAny.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class FdcPredicateSetOfIntegersContainsAny extends FdcPredicate {
  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<Integer> values = new LinkedHashSet<>();

  public FdcPredicateSetOfIntegersContainsAny() { 
  }

  public FdcPredicateSetOfIntegersContainsAny values(Set<Integer> values) {
    this.values = values;
    return this;
  }

  public FdcPredicateSetOfIntegersContainsAny addValuesItem(Integer valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of reference values. The condition is fulfilled when the attribute (which is a set of integers) contains *any* of these.
   * @return values
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of reference values. The condition is fulfilled when the attribute (which is a set of integers) contains *any* of these.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Integer> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(Set<Integer> values) {
    this.values = values;
  }


  /**
   * Return true if this FdcPredicateSetOfIntegersContainsAny object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FdcPredicateSetOfIntegersContainsAny fdcPredicateSetOfIntegersContainsAny = (FdcPredicateSetOfIntegersContainsAny) o;
    return Objects.equals(this.values, fdcPredicateSetOfIntegersContainsAny.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FdcPredicateSetOfIntegersContainsAny {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("FdcPredicateSetOfIntegersContainsAny", FdcPredicateSetOfIntegersContainsAny.class);
  JSON.registerDiscriminator(FdcPredicateSetOfIntegersContainsAny.class, "type", mappings);
}
}
