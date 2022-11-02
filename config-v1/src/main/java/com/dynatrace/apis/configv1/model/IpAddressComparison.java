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
import com.dynatrace.apis.configv1.model.ComparisonBasic;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * Comparison for &#x60;IP_ADDRESS&#x60; attributes.
 */
@ApiModel(description = "Comparison for `IP_ADDRESS` attributes.")
@JsonPropertyOrder({
  IpAddressComparison.JSON_PROPERTY_OPERATOR,
  IpAddressComparison.JSON_PROPERTY_VALUE,
  IpAddressComparison.JSON_PROPERTY_CASE_SENSITIVE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class IpAddressComparison extends ComparisonBasic {
  /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   */
  public enum OperatorEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    CONTAINS("CONTAINS"),
    
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS"),
    
    EXISTS("EXISTS"),
    
    IS_IP_IN_RANGE("IS_IP_IN_RANGE"),
    
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

  public IpAddressComparison() { 
  }

  public IpAddressComparison operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Operator of the comparison. You can reverse it by setting **negate** to `true`.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need.")
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


  public IpAddressComparison value(String value) {
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


  public IpAddressComparison caseSensitive(Boolean caseSensitive) {
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
   * Return true if this IpAddressComparison object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressComparison ipAddressComparison = (IpAddressComparison) o;
    return Objects.equals(this.operator, ipAddressComparison.operator) &&
        Objects.equals(this.value, ipAddressComparison.value) &&
        Objects.equals(this.caseSensitive, ipAddressComparison.caseSensitive) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, caseSensitive, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressComparison {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("IpAddressComparison", IpAddressComparison.class);
  JSON.registerDiscriminator(IpAddressComparison.class, "type", mappings);
}
}
