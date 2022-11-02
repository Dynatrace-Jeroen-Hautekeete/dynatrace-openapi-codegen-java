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
 * A condition of the management zone dimensional rule.
 */
@ApiModel(description = "A condition of the management zone dimensional rule.")
@JsonPropertyOrder({
  MzDimensionalRuleCondition.JSON_PROPERTY_CONDITION_TYPE,
  MzDimensionalRuleCondition.JSON_PROPERTY_RULE_MATCHER,
  MzDimensionalRuleCondition.JSON_PROPERTY_KEY,
  MzDimensionalRuleCondition.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class MzDimensionalRuleCondition {
  /**
   * The type of the condition.
   */
  public enum ConditionTypeEnum {
    DIMENSION("DIMENSION"),
    
    LOG_FILE_NAME("LOG_FILE_NAME"),
    
    METRIC_KEY("METRIC_KEY");

    private String value;

    ConditionTypeEnum(String value) {
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
    public static ConditionTypeEnum fromValue(String value) {
      for (ConditionTypeEnum b : ConditionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONDITION_TYPE = "conditionType";
  private ConditionTypeEnum conditionType;

  /**
   * How we compare the values.
   */
  public enum RuleMatcherEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    EQUALS("EQUALS");

    private String value;

    RuleMatcherEnum(String value) {
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
    public static RuleMatcherEnum fromValue(String value) {
      for (RuleMatcherEnum b : RuleMatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RULE_MATCHER = "ruleMatcher";
  private RuleMatcherEnum ruleMatcher;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public MzDimensionalRuleCondition() { 
  }

  public MzDimensionalRuleCondition conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }

   /**
   * The type of the condition.
   * @return conditionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the condition.")
  @JsonProperty(JSON_PROPERTY_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }


  public MzDimensionalRuleCondition ruleMatcher(RuleMatcherEnum ruleMatcher) {
    this.ruleMatcher = ruleMatcher;
    return this;
  }

   /**
   * How we compare the values.
   * @return ruleMatcher
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "How we compare the values.")
  @JsonProperty(JSON_PROPERTY_RULE_MATCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RuleMatcherEnum getRuleMatcher() {
    return ruleMatcher;
  }


  @JsonProperty(JSON_PROPERTY_RULE_MATCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleMatcher(RuleMatcherEnum ruleMatcher) {
    this.ruleMatcher = ruleMatcher;
  }


  public MzDimensionalRuleCondition key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The reference value for comparison.   For conditions of the &#x60;DIMENSION&#x60; type, specify the key here.
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The reference value for comparison.   For conditions of the `DIMENSION` type, specify the key here.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public MzDimensionalRuleCondition value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the dimension.   Only applicable when the **conditionType** is set to &#x60;DIMENSION&#x60;.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the dimension.   Only applicable when the **conditionType** is set to `DIMENSION`.")
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


  /**
   * Return true if this MzDimensionalRuleCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MzDimensionalRuleCondition mzDimensionalRuleCondition = (MzDimensionalRuleCondition) o;
    return Objects.equals(this.conditionType, mzDimensionalRuleCondition.conditionType) &&
        Objects.equals(this.ruleMatcher, mzDimensionalRuleCondition.ruleMatcher) &&
        Objects.equals(this.key, mzDimensionalRuleCondition.key) &&
        Objects.equals(this.value, mzDimensionalRuleCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, ruleMatcher, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MzDimensionalRuleCondition {\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    ruleMatcher: ").append(toIndentedString(ruleMatcher)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

