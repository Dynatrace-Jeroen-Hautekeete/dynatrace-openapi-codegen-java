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
 * IntEqualsCompareOperationAllOf
 */
@JsonPropertyOrder({
  IntEqualsCompareOperationAllOf.JSON_PROPERTY_NEGATE,
  IntEqualsCompareOperationAllOf.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class IntEqualsCompareOperationAllOf {
  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<Integer> values = null;

  public IntEqualsCompareOperationAllOf() { 
  }

  public IntEqualsCompareOperationAllOf negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **equals** into **does not equal**.    If not set, then &#x60;false&#x60; is used.
   * @return negate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inverts the operation of the condition. Set to `true` to turn **equals** into **does not equal**.    If not set, then `false` is used.")
  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  public IntEqualsCompareOperationAllOf values(Set<Integer> values) {
    this.values = values;
    return this;
  }

  public IntEqualsCompareOperationAllOf addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The value to compare to.   If several values are specified, the OR logic applies.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to compare to.   If several values are specified, the OR logic applies.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Integer> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(Set<Integer> values) {
    this.values = values;
  }


  /**
   * Return true if this IntEqualsCompareOperation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntEqualsCompareOperationAllOf intEqualsCompareOperationAllOf = (IntEqualsCompareOperationAllOf) o;
    return Objects.equals(this.negate, intEqualsCompareOperationAllOf.negate) &&
        Objects.equals(this.values, intEqualsCompareOperationAllOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negate, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntEqualsCompareOperationAllOf {\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
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

}
