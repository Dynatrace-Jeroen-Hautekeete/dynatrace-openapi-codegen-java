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
import com.dynatrace.apis.configv1.model.ComparisonInfo;
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
 * Comparison for &#x60;FAILED_STATE&#x60; attributes.
 */
@ApiModel(description = "Comparison for `FAILED_STATE` attributes.")
@JsonPropertyOrder({
  FailedStateComparisonInfo.JSON_PROPERTY_COMPARISON,
  FailedStateComparisonInfo.JSON_PROPERTY_VALUE,
  FailedStateComparisonInfo.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class FailedStateComparisonInfo extends ComparisonInfo {
  /**
   * Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;.
   */
  public enum ComparisonEnum {
    EQUALS("EQUALS"),
    
    EQUALS_ANY_OF("EQUALS_ANY_OF"),
    
    EXISTS("EXISTS");

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

  /**
   * The value to compare to.
   */
  public enum ValueEnum {
    FAILED("FAILED"),
    
    SUCCESSFUL("SUCCESSFUL");

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE = "value";
  private ValueEnum value;

  /**
   * The values to compare to.
   */
  public enum ValuesEnum {
    FAILED("FAILED"),
    
    SUCCESSFUL("SUCCESSFUL");

    private String value;

    ValuesEnum(String value) {
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
    public static ValuesEnum fromValue(String value) {
      for (ValuesEnum b : ValuesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<ValuesEnum> values = null;

  public FailedStateComparisonInfo() { 
  }

  public FailedStateComparisonInfo comparison(ComparisonEnum comparison) {
    this.comparison = comparison;
    return this;
  }

   /**
   * Operator of the comparision. You can reverse it by setting **negate** to &#x60;true&#x60;.
   * @return comparison
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Operator of the comparision. You can reverse it by setting **negate** to `true`.")
  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ComparisonEnum getComparison() {
    return comparison;
  }


  @JsonProperty(JSON_PROPERTY_COMPARISON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComparison(ComparisonEnum comparison) {
    this.comparison = comparison;
  }


  public FailedStateComparisonInfo value(ValueEnum value) {
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

  public ValueEnum getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(ValueEnum value) {
    this.value = value;
  }


  public FailedStateComparisonInfo values(Set<ValuesEnum> values) {
    this.values = values;
    return this;
  }

  public FailedStateComparisonInfo addValuesItem(ValuesEnum valuesItem) {
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

  public Set<ValuesEnum> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(Set<ValuesEnum> values) {
    this.values = values;
  }


  /**
   * Return true if this FailedStateComparisonInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedStateComparisonInfo failedStateComparisonInfo = (FailedStateComparisonInfo) o;
    return Objects.equals(this.comparison, failedStateComparisonInfo.comparison) &&
        Objects.equals(this.value, failedStateComparisonInfo.value) &&
        Objects.equals(this.values, failedStateComparisonInfo.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparison, value, values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedStateComparisonInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("FailedStateComparisonInfo", FailedStateComparisonInfo.class);
  JSON.registerDiscriminator(FailedStateComparisonInfo.class, "type", mappings);
}
}

