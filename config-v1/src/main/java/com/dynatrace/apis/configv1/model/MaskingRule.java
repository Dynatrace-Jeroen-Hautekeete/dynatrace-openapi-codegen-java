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
 * The masking rule defining how data is hidden.
 */
@ApiModel(description = "The masking rule defining how data is hidden.")
@JsonPropertyOrder({
  MaskingRule.JSON_PROPERTY_MASKING_RULE_TYPE,
  MaskingRule.JSON_PROPERTY_SELECTOR,
  MaskingRule.JSON_PROPERTY_USER_INTERACTION_HIDDEN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class MaskingRule {
  /**
   * The type of the masking rule.
   */
  public enum MaskingRuleTypeEnum {
    ATTRIBUTE("ATTRIBUTE"),
    
    ELEMENT("ELEMENT");

    private String value;

    MaskingRuleTypeEnum(String value) {
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
    public static MaskingRuleTypeEnum fromValue(String value) {
      for (MaskingRuleTypeEnum b : MaskingRuleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MASKING_RULE_TYPE = "maskingRuleType";
  private MaskingRuleTypeEnum maskingRuleType;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private String selector;

  public static final String JSON_PROPERTY_USER_INTERACTION_HIDDEN = "userInteractionHidden";
  private Boolean userInteractionHidden;

  public MaskingRule() { 
  }

  public MaskingRule maskingRuleType(MaskingRuleTypeEnum maskingRuleType) {
    this.maskingRuleType = maskingRuleType;
    return this;
  }

   /**
   * The type of the masking rule.
   * @return maskingRuleType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the masking rule.")
  @JsonProperty(JSON_PROPERTY_MASKING_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MaskingRuleTypeEnum getMaskingRuleType() {
    return maskingRuleType;
  }


  @JsonProperty(JSON_PROPERTY_MASKING_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaskingRuleType(MaskingRuleTypeEnum maskingRuleType) {
    this.maskingRuleType = maskingRuleType;
  }


  public MaskingRule selector(String selector) {
    this.selector = selector;
    return this;
  }

   /**
   * The selector for the element or the attribute to be masked.   Specify a CSS expression for an element or a [regular expression](https://dt-url.net/k9e0iaq) for an attribute.
   * @return selector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The selector for the element or the attribute to be masked.   Specify a CSS expression for an element or a [regular expression](https://dt-url.net/k9e0iaq) for an attribute.")
  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSelector() {
    return selector;
  }


  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelector(String selector) {
    this.selector = selector;
  }


  public MaskingRule userInteractionHidden(Boolean userInteractionHidden) {
    this.userInteractionHidden = userInteractionHidden;
    return this;
  }

   /**
   * Interactions with the element are (&#x60;true&#x60;) or are not (&#x60;false) masked.
   * @return userInteractionHidden
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Interactions with the element are (`true`) or are not (`false) masked.")
  @JsonProperty(JSON_PROPERTY_USER_INTERACTION_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUserInteractionHidden() {
    return userInteractionHidden;
  }


  @JsonProperty(JSON_PROPERTY_USER_INTERACTION_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserInteractionHidden(Boolean userInteractionHidden) {
    this.userInteractionHidden = userInteractionHidden;
  }


  /**
   * Return true if this MaskingRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingRule maskingRule = (MaskingRule) o;
    return Objects.equals(this.maskingRuleType, maskingRule.maskingRuleType) &&
        Objects.equals(this.selector, maskingRule.selector) &&
        Objects.equals(this.userInteractionHidden, maskingRule.userInteractionHidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskingRuleType, selector, userInteractionHidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingRule {\n");
    sb.append("    maskingRuleType: ").append(toIndentedString(maskingRuleType)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    userInteractionHidden: ").append(toIndentedString(userInteractionHidden)).append("\n");
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

