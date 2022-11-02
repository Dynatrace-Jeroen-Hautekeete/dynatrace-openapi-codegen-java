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
 * StringComparisonAllOf
 */
@JsonPropertyOrder({
  StringComparisonAllOf.JSON_PROPERTY_OPERATOR,
  StringComparisonAllOf.JSON_PROPERTY_VALUE,
  StringComparisonAllOf.JSON_PROPERTY_CASE_SENSITIVE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class StringComparisonAllOf {
  /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   */
  public enum OperatorEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    CONTAINS("CONTAINS"),
    
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS"),
    
    EXISTS("EXISTS"),
    
    REGEX_MATCHES("REGEX_MATCHES");

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

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_CASE_SENSITIVE = "caseSensitive";
  private Boolean caseSensitive;

  public StringComparisonAllOf() { 
  }

  public StringComparisonAllOf operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operator of the comparison. You can reverse it by setting **negate** to `true`.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperatorEnum getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public StringComparisonAllOf value(String value) {
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

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public StringComparisonAllOf caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * The comparison is case-sensitive (&#x60;true&#x60;) or insensitive (&#x60;false&#x60;).
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comparison is case-sensitive (`true`) or insensitive (`false`).")
  @JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  @JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  /**
   * Return true if this StringComparison_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringComparisonAllOf stringComparisonAllOf = (StringComparisonAllOf) o;
    return Objects.equals(this.operator, stringComparisonAllOf.operator) &&
        Objects.equals(this.value, stringComparisonAllOf.value) &&
        Objects.equals(this.caseSensitive, stringComparisonAllOf.caseSensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, caseSensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringComparisonAllOf {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
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
