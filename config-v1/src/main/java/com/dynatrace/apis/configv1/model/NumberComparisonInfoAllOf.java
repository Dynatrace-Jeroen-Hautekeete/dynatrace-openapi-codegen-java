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
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NumberComparisonInfoAllOf
 */
@JsonPropertyOrder({
  NumberComparisonInfoAllOf.JSON_PROPERTY_COMPARISON,
  NumberComparisonInfoAllOf.JSON_PROPERTY_VALUE,
  NumberComparisonInfoAllOf.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class NumberComparisonInfoAllOf {
  /**
   * Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;.
   */
  public enum ComparisonEnum {
    EQUALS("EQUALS"),
    
    EQUALS_ANY_OF("EQUALS_ANY_OF"),
    
    EXISTS("EXISTS"),
    
    GREATER_THAN("GREATER_THAN"),
    
    GREATER_THAN_OR_EQUAL("GREATER_THAN_OR_EQUAL"),
    
    LOWER_THAN("LOWER_THAN"),
    
    LOWER_THAN_OR_EQUAL("LOWER_THAN_OR_EQUAL");

    private String value;

    ComparisonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComparisonEnum fromValue(String value) {
      for (ComparisonEnum b : ComparisonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMPARISON = "comparison";
  private ComparisonEnum comparison;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<BigDecimal> values = null;

  public NumberComparisonInfoAllOf() { 
  }

  public NumberComparisonInfoAllOf comparison(ComparisonEnum comparison) {
    this.comparison = comparison;
    return this;
  }

   /**
   * Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;.
   * @return comparison
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operator of the comparision. You can reverse it by setting **negate** to `true`.")
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComparisonEnum getComparison() {
    return comparison;
  }


  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComparison(ComparisonEnum comparison) {
    this.comparison = comparison;
  }


  public NumberComparisonInfoAllOf value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value to compare to.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to compare to.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public NumberComparisonInfoAllOf values(Set<BigDecimal> values) {
    this.values = values;
    return this;
  }

  public NumberComparisonInfoAllOf addValuesItem(BigDecimal valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The values to compare to.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The values to compare to.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<BigDecimal> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(Set<BigDecimal> values) {
    this.values = values;
  }


  /**
   * Return true if this NumberComparisonInfo_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberComparisonInfoAllOf numberComparisonInfoAllOf = (NumberComparisonInfoAllOf) o;
    return Objects.equals(this.comparison, numberComparisonInfoAllOf.comparison) &&
        Objects.equals(this.value, numberComparisonInfoAllOf.value) &&
        Objects.equals(this.values, numberComparisonInfoAllOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparison, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberComparisonInfoAllOf {\n");
    sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

