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
 * Criterion for data explorer filters.
 */
@ApiModel(description = "Criterion for data explorer filters.")
@JsonPropertyOrder({
  DexpFilterCriterion.JSON_PROPERTY_VALUE,
  DexpFilterCriterion.JSON_PROPERTY_EVALUATOR,
  DexpFilterCriterion.JSON_PROPERTY_MATCH_EXACTLY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class DexpFilterCriterion {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  /**
   * Gets or Sets evaluator
   */
  public enum EvaluatorEnum {
    EQ("EQ"),
    
    IN("IN"),
    
    NE("NE"),
    
    PREFIX("PREFIX");

    private String value;

    EvaluatorEnum(String value) {
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
    public static EvaluatorEnum fromValue(String value) {
      for (EvaluatorEnum b : EvaluatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVALUATOR = "evaluator";
  private EvaluatorEnum evaluator;

  public static final String JSON_PROPERTY_MATCH_EXACTLY = "matchExactly";
  private Boolean matchExactly;

  public DexpFilterCriterion() { 
  }

  public DexpFilterCriterion value(String value) {
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

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public DexpFilterCriterion evaluator(EvaluatorEnum evaluator) {
    this.evaluator = evaluator;
    return this;
  }

   /**
   * Get evaluator
   * @return evaluator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVALUATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EvaluatorEnum getEvaluator() {
    return evaluator;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluator(EvaluatorEnum evaluator) {
    this.evaluator = evaluator;
  }


  public DexpFilterCriterion matchExactly(Boolean matchExactly) {
    this.matchExactly = matchExactly;
    return this;
  }

   /**
   * Get matchExactly
   * @return matchExactly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_EXACTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMatchExactly() {
    return matchExactly;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_EXACTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchExactly(Boolean matchExactly) {
    this.matchExactly = matchExactly;
  }


  /**
   * Return true if this DexpFilterCriterion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DexpFilterCriterion dexpFilterCriterion = (DexpFilterCriterion) o;
    return Objects.equals(this.value, dexpFilterCriterion.value) &&
        Objects.equals(this.evaluator, dexpFilterCriterion.evaluator) &&
        Objects.equals(this.matchExactly, dexpFilterCriterion.matchExactly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, evaluator, matchExactly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexpFilterCriterion {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    matchExactly: ").append(toIndentedString(matchExactly)).append("\n");
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
