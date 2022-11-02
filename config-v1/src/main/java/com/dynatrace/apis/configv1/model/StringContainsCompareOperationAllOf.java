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
 * StringContainsCompareOperationAllOf
 */
@JsonPropertyOrder({
  StringContainsCompareOperationAllOf.JSON_PROPERTY_NEGATE,
  StringContainsCompareOperationAllOf.JSON_PROPERTY_IGNORE_CASE,
  StringContainsCompareOperationAllOf.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class StringContainsCompareOperationAllOf {
  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public static final String JSON_PROPERTY_IGNORE_CASE = "ignoreCase";
  private Boolean ignoreCase;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<String> values = null;

  public StringContainsCompareOperationAllOf() { 
  }

  public StringContainsCompareOperationAllOf negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **contains** into **does not contain**.    If not set, then &#x60;false&#x60; is used.
   * @return negate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inverts the operation of the condition. Set to `true` to turn **contains** into **does not contain**.    If not set, then `false` is used.")
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


  public StringContainsCompareOperationAllOf ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).   If not set, then &#x60;false&#x60; is used, making the condition case sensitive.
   * @return ignoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The condition is case sensitive (`false`) or case insensitive (`true`).   If not set, then `false` is used, making the condition case sensitive.")
  @JsonProperty(JSON_PROPERTY_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreCase() {
    return ignoreCase;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }


  public StringContainsCompareOperationAllOf values(Set<String> values) {
    this.values = values;
    return this;
  }

  public StringContainsCompareOperationAllOf addValuesItem(String valuesItem) {
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

  public Set<String> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(Set<String> values) {
    this.values = values;
  }


  /**
   * Return true if this StringContainsCompareOperation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringContainsCompareOperationAllOf stringContainsCompareOperationAllOf = (StringContainsCompareOperationAllOf) o;
    return Objects.equals(this.negate, stringContainsCompareOperationAllOf.negate) &&
        Objects.equals(this.ignoreCase, stringContainsCompareOperationAllOf.ignoreCase) &&
        Objects.equals(this.values, stringContainsCompareOperationAllOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negate, ignoreCase, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringContainsCompareOperationAllOf {\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
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

