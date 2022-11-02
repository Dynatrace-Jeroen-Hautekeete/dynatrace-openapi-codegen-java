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
 * FdcPredicateIntegerLessThanOrEqualAllOf
 */
@JsonPropertyOrder({
  FdcPredicateIntegerLessThanOrEqualAllOf.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class FdcPredicateIntegerLessThanOrEqualAllOf {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public FdcPredicateIntegerLessThanOrEqualAllOf() { 
  }

  public FdcPredicateIntegerLessThanOrEqualAllOf value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The reference value. The condition is fulfilled when the attribute (which is an integer) is less than or equals this value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference value. The condition is fulfilled when the attribute (which is an integer) is less than or equals this value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   * Return true if this FdcPredicateIntegerLessThanOrEqual_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FdcPredicateIntegerLessThanOrEqualAllOf fdcPredicateIntegerLessThanOrEqualAllOf = (FdcPredicateIntegerLessThanOrEqualAllOf) o;
    return Objects.equals(this.value, fdcPredicateIntegerLessThanOrEqualAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FdcPredicateIntegerLessThanOrEqualAllOf {\n");
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

