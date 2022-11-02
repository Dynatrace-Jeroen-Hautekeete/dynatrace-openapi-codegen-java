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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FdpTagStringStartsWithAllOf
 */
@JsonPropertyOrder({
  FdpTagStringStartsWithAllOf.JSON_PROPERTY_IGNORE_CASE,
  FdpTagStringStartsWithAllOf.JSON_PROPERTY_NEGATED,
  FdpTagStringStartsWithAllOf.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class FdpTagStringStartsWithAllOf {
  public static final String JSON_PROPERTY_IGNORE_CASE = "ignoreCase";
  private Boolean ignoreCase;

  public static final String JSON_PROPERTY_NEGATED = "negated";
  private Boolean negated;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public FdpTagStringStartsWithAllOf() { 
  }

  public FdpTagStringStartsWithAllOf ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FdpTagStringStartsWithAllOf negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

   /**
   * Get negated
   * @return negated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNegated() {
    return negated;
  }


  @JsonProperty(JSON_PROPERTY_NEGATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }


  public FdpTagStringStartsWithAllOf value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The reference value. The condition is fulfilled when the tag (which is a string) starts with this value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference value. The condition is fulfilled when the tag (which is a string) starts with this value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this FdpTagStringStartsWith_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FdpTagStringStartsWithAllOf fdpTagStringStartsWithAllOf = (FdpTagStringStartsWithAllOf) o;
    return Objects.equals(this.ignoreCase, fdpTagStringStartsWithAllOf.ignoreCase) &&
        Objects.equals(this.negated, fdpTagStringStartsWithAllOf.negated) &&
        Objects.equals(this.value, fdpTagStringStartsWithAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreCase, negated, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FdpTagStringStartsWithAllOf {\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

