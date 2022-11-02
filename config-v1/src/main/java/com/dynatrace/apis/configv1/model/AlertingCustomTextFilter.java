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
 * Configuration of a matching filter.
 */
@ApiModel(description = "Configuration of a matching filter.")
@JsonPropertyOrder({
  AlertingCustomTextFilter.JSON_PROPERTY_ENABLED,
  AlertingCustomTextFilter.JSON_PROPERTY_VALUE,
  AlertingCustomTextFilter.JSON_PROPERTY_OPERATOR,
  AlertingCustomTextFilter.JSON_PROPERTY_NEGATE,
  AlertingCustomTextFilter.JSON_PROPERTY_CASE_INSENSITIVE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AlertingCustomTextFilter {
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  /**
   * Operator of the comparison.    You can reverse it by setting **negate** to &#x60;true&#x60;.
   */
  public enum OperatorEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    CONTAINS("CONTAINS"),
    
    CONTAINS_REGEX("CONTAINS_REGEX"),
    
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS");

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

  public static final String JSON_PROPERTY_CASE_INSENSITIVE = "caseInsensitive";
  private Boolean caseInsensitive;

  public AlertingCustomTextFilter() { 
  }

  public AlertingCustomTextFilter enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The filter is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The filter is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AlertingCustomTextFilter value(String value) {
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


  public AlertingCustomTextFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operator of the comparison.    You can reverse it by setting **negate** to &#x60;true&#x60;.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Operator of the comparison.    You can reverse it by setting **negate** to `true`.")
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


  public AlertingCustomTextFilter negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**.
   * @return negate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Reverses the comparison **operator**. For example it turns the **begins with** into **does not begin with**.")
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


  public AlertingCustomTextFilter caseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
    return this;
  }

   /**
   * The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).    If not set, then &#x60;false&#x60; is used, making the condition case sensitive.
   * @return caseInsensitive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The condition is case sensitive (`false`) or case insensitive (`true`).    If not set, then `false` is used, making the condition case sensitive.")
  @JsonProperty(JSON_PROPERTY_CASE_INSENSITIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCaseInsensitive() {
    return caseInsensitive;
  }


  @JsonProperty(JSON_PROPERTY_CASE_INSENSITIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCaseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
  }


  /**
   * Return true if this AlertingCustomTextFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertingCustomTextFilter alertingCustomTextFilter = (AlertingCustomTextFilter) o;
    return Objects.equals(this.enabled, alertingCustomTextFilter.enabled) &&
        Objects.equals(this.value, alertingCustomTextFilter.value) &&
        Objects.equals(this.operator, alertingCustomTextFilter.operator) &&
        Objects.equals(this.negate, alertingCustomTextFilter.negate) &&
        Objects.equals(this.caseInsensitive, alertingCustomTextFilter.caseInsensitive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, value, operator, negate, caseInsensitive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertingCustomTextFilter {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
    sb.append("    caseInsensitive: ").append(toIndentedString(caseInsensitive)).append("\n");
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
