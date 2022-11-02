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
 * Comparison for &#x60;PAAS_TYPE&#x60; attributes.
 */
@ApiModel(description = "Comparison for `PAAS_TYPE` attributes.")
@JsonPropertyOrder({
  PaasTypeComparison.JSON_PROPERTY_OPERATOR,
  PaasTypeComparison.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class PaasTypeComparison extends ComparisonBasic {
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
    AWS_ECS_EC2("AWS_ECS_EC2"),
    
    AWS_ECS_FARGATE("AWS_ECS_FARGATE"),
    
    AWS_LAMBDA("AWS_LAMBDA"),
    
    AZURE_FUNCTIONS("AZURE_FUNCTIONS"),
    
    AZURE_WEBSITES("AZURE_WEBSITES"),
    
    CLOUD_FOUNDRY("CLOUD_FOUNDRY"),
    
    GOOGLE_APP_ENGINE("GOOGLE_APP_ENGINE"),
    
    HEROKU("HEROKU"),
    
    KUBERNETES("KUBERNETES"),
    
    OPENSHIFT("OPENSHIFT");

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

  public PaasTypeComparison() { 
  }

  public PaasTypeComparison operator(OperatorEnum operator) {
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


  public PaasTypeComparison value(ValueEnum value) {
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
   * Return true if this PaasTypeComparison object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaasTypeComparison paasTypeComparison = (PaasTypeComparison) o;
    return Objects.equals(this.operator, paasTypeComparison.operator) &&
        Objects.equals(this.value, paasTypeComparison.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaasTypeComparison {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("PaasTypeComparison", PaasTypeComparison.class);
  JSON.registerDiscriminator(PaasTypeComparison.class, "type", mappings);
}
}

