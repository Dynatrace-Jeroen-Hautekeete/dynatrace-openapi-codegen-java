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
 * RemoveNumbersTransformationAllOf
 */
@JsonPropertyOrder({
  RemoveNumbersTransformationAllOf.JSON_PROPERTY_MIN_DIGIT_COUNT,
  RemoveNumbersTransformationAllOf.JSON_PROPERTY_INCLUDE_HEX_NUMBERS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class RemoveNumbersTransformationAllOf {
  public static final String JSON_PROPERTY_MIN_DIGIT_COUNT = "minDigitCount";
  private Integer minDigitCount;

  public static final String JSON_PROPERTY_INCLUDE_HEX_NUMBERS = "includeHexNumbers";
  private Boolean includeHexNumbers;

  public RemoveNumbersTransformationAllOf() { 
  }

  public RemoveNumbersTransformationAllOf minDigitCount(Integer minDigitCount) {
    this.minDigitCount = minDigitCount;
    return this;
  }

   /**
   * Remove numbers that contain at least *X* digits.
   * minimum: 1
   * @return minDigitCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remove numbers that contain at least *X* digits.")
  @JsonProperty(JSON_PROPERTY_MIN_DIGIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinDigitCount() {
    return minDigitCount;
  }


  @JsonProperty(JSON_PROPERTY_MIN_DIGIT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinDigitCount(Integer minDigitCount) {
    this.minDigitCount = minDigitCount;
  }


  public RemoveNumbersTransformationAllOf includeHexNumbers(Boolean includeHexNumbers) {
    this.includeHexNumbers = includeHexNumbers;
    return this;
  }

   /**
   * Remove (&#x60;true&#x60;) or keep (&#x60;false&#x60;) hexadecimal numbers.    If not set, then &#x60;false&#x60; is used, keeping hexadecimal numbers.
   * @return includeHexNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remove (`true`) or keep (`false`) hexadecimal numbers.    If not set, then `false` is used, keeping hexadecimal numbers.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_HEX_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeHexNumbers() {
    return includeHexNumbers;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_HEX_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeHexNumbers(Boolean includeHexNumbers) {
    this.includeHexNumbers = includeHexNumbers;
  }


  /**
   * Return true if this RemoveNumbersTransformation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveNumbersTransformationAllOf removeNumbersTransformationAllOf = (RemoveNumbersTransformationAllOf) o;
    return Objects.equals(this.minDigitCount, removeNumbersTransformationAllOf.minDigitCount) &&
        Objects.equals(this.includeHexNumbers, removeNumbersTransformationAllOf.includeHexNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDigitCount, includeHexNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveNumbersTransformationAllOf {\n");
    sb.append("    minDigitCount: ").append(toIndentedString(minDigitCount)).append("\n");
    sb.append("    includeHexNumbers: ").append(toIndentedString(includeHexNumbers)).append("\n");
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

