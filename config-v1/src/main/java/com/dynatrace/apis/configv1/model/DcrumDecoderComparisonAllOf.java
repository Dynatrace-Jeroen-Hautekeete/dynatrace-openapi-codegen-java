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
 * DcrumDecoderComparisonAllOf
 */
@JsonPropertyOrder({
  DcrumDecoderComparisonAllOf.JSON_PROPERTY_OPERATOR,
  DcrumDecoderComparisonAllOf.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class DcrumDecoderComparisonAllOf {
  /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   */
  public enum OperatorEnum {
    EQUALS("EQUALS"),
    
    EXISTS("EXISTS");

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

  /**
   * The value to compare to.
   */
  public enum ValueEnum {
    ALL_OTHER("ALL_OTHER"),
    
    CITRIX_APPFLOW("CITRIX_APPFLOW"),
    
    CITRIX_ICA("CITRIX_ICA"),
    
    CITRIX_ICA_OVER_SSL("CITRIX_ICA_OVER_SSL"),
    
    DB2_DRDA("DB2_DRDA"),
    
    HTTP("HTTP"),
    
    HTTPS("HTTPS"),
    
    HTTP_EXPRESS("HTTP_EXPRESS"),
    
    INFORMIX("INFORMIX"),
    
    MYSQL("MYSQL"),
    
    ORACLE("ORACLE"),
    
    SAP_GUI("SAP_GUI"),
    
    SAP_GUI_OVER_HTTP("SAP_GUI_OVER_HTTP"),
    
    SAP_GUI_OVER_HTTPS("SAP_GUI_OVER_HTTPS"),
    
    SAP_HANA_DB("SAP_HANA_DB"),
    
    SAP_RFC("SAP_RFC"),
    
    SSL("SSL"),
    
    TDS("TDS");

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

  public DcrumDecoderComparisonAllOf() { 
  }

  public DcrumDecoderComparisonAllOf operator(OperatorEnum operator) {
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


  public DcrumDecoderComparisonAllOf value(ValueEnum value) {
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


  /**
   * Return true if this DcrumDecoderComparison_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DcrumDecoderComparisonAllOf dcrumDecoderComparisonAllOf = (DcrumDecoderComparisonAllOf) o;
    return Objects.equals(this.operator, dcrumDecoderComparisonAllOf.operator) &&
        Objects.equals(this.value, dcrumDecoderComparisonAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DcrumDecoderComparisonAllOf {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

