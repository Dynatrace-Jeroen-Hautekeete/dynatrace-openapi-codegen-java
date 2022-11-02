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
 * IBM integration bus label node name condition for which the value is captured.
 */
@ApiModel(description = "IBM integration bus label node name condition for which the value is captured.")
@JsonPropertyOrder({
  ValueCondition.JSON_PROPERTY_OPERATOR,
  ValueCondition.JSON_PROPERTY_NEGATE,
  ValueCondition.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ValueCondition {
  /**
   * Operator comparing the extracted value to the comparison value.
   */
  public enum OperatorEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    BEGINS_WITH_ANY_OF("BEGINS_WITH_ANY_OF"),
    
    CONTAINS("CONTAINS"),
    
    ENDS_WITH("ENDS_WITH"),
    
    ENDS_WITH_ANY_OF("ENDS_WITH_ANY_OF"),
    
    EQUALS("EQUALS"),
    
    EQUALS_ANY_OF("EQUALS_ANY_OF");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private OperatorEnum operator;

  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public ValueCondition() { 
  }

  public ValueCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator comparing the extracted value to the comparison value.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Operator comparing the extracted value to the comparison value.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OperatorEnum getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public ValueCondition negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Negate the comparison.
   * @return negate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Negate the comparison.")
  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  public ValueCondition value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value to compare to.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value to compare to.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this ValueCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueCondition valueCondition = (ValueCondition) o;
    return Objects.equals(this.operator, valueCondition.operator) &&
        Objects.equals(this.negate, valueCondition.negate) &&
        Objects.equals(this.value, valueCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, negate, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueCondition {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
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
