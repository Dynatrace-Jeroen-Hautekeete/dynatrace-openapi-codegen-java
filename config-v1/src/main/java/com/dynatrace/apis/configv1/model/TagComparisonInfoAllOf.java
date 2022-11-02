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
import com.dynatrace.apis.configv1.model.TagInfo;
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
 * TagComparisonInfoAllOf
 */
@JsonPropertyOrder({
  TagComparisonInfoAllOf.JSON_PROPERTY_COMPARISON,
  TagComparisonInfoAllOf.JSON_PROPERTY_VALUE,
  TagComparisonInfoAllOf.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class TagComparisonInfoAllOf {
  /**
   * Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;.
   */
  public enum ComparisonEnum {
    EQUALS("EQUALS"),
    
    EQUALS_ANY_OF("EQUALS_ANY_OF"),
    
    TAG_KEY_EQUALS("TAG_KEY_EQUALS"),
    
    TAG_KEY_EQUALS_ANY_OF("TAG_KEY_EQUALS_ANY_OF");

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
  private TagInfo value;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<TagInfo> values = null;

  public TagComparisonInfoAllOf() { 
  }

  public TagComparisonInfoAllOf comparison(ComparisonEnum comparison) {
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


  public TagComparisonInfoAllOf value(TagInfo value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TagInfo getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(TagInfo value) {
    this.value = value;
  }


  public TagComparisonInfoAllOf values(Set<TagInfo> values) {
    this.values = values;
    return this;
  }

  public TagComparisonInfoAllOf addValuesItem(TagInfo valuesItem) {
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

  public Set<TagInfo> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(Set<TagInfo> values) {
    this.values = values;
  }


  /**
   * Return true if this TagComparisonInfo_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagComparisonInfoAllOf tagComparisonInfoAllOf = (TagComparisonInfoAllOf) o;
    return Objects.equals(this.comparison, tagComparisonInfoAllOf.comparison) &&
        Objects.equals(this.value, tagComparisonInfoAllOf.value) &&
        Objects.equals(this.values, tagComparisonInfoAllOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparison, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagComparisonInfoAllOf {\n");
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

