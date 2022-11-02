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
 * Configuration of the custom error in the web application.
 */
@ApiModel(description = "Configuration of the custom error in the web application.")
@JsonPropertyOrder({
  CustomErrorRule.JSON_PROPERTY_KEY_PATTERN,
  CustomErrorRule.JSON_PROPERTY_KEY_MATCHER,
  CustomErrorRule.JSON_PROPERTY_VALUE_PATTERN,
  CustomErrorRule.JSON_PROPERTY_VALUE_MATCHER,
  CustomErrorRule.JSON_PROPERTY_CAPTURE,
  CustomErrorRule.JSON_PROPERTY_IMPACT_APDEX,
  CustomErrorRule.JSON_PROPERTY_CUSTOM_ALERTING
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CustomErrorRule {
  public static final String JSON_PROPERTY_KEY_PATTERN = "keyPattern";
  private String keyPattern;

  /**
   * The matching operation for the **keyPattern**.
   */
  public enum KeyMatcherEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    CONTAINS("CONTAINS"),
    
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS");

    private String value;

    KeyMatcherEnum(String value) {
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
    public static KeyMatcherEnum fromValue(String value) {
      for (KeyMatcherEnum b : KeyMatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KEY_MATCHER = "keyMatcher";
  private KeyMatcherEnum keyMatcher;

  public static final String JSON_PROPERTY_VALUE_PATTERN = "valuePattern";
  private String valuePattern;

  /**
   * The matching operation for the **valuePattern**.
   */
  public enum ValueMatcherEnum {
    BEGINS_WITH("BEGINS_WITH"),
    
    CONTAINS("CONTAINS"),
    
    ENDS_WITH("ENDS_WITH"),
    
    EQUALS("EQUALS");

    private String value;

    ValueMatcherEnum(String value) {
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
    public static ValueMatcherEnum fromValue(String value) {
      for (ValueMatcherEnum b : ValueMatcherEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VALUE_MATCHER = "valueMatcher";
  private ValueMatcherEnum valueMatcher;

  public static final String JSON_PROPERTY_CAPTURE = "capture";
  private Boolean capture;

  public static final String JSON_PROPERTY_IMPACT_APDEX = "impactApdex";
  private Boolean impactApdex;

  public static final String JSON_PROPERTY_CUSTOM_ALERTING = "customAlerting";
  private Boolean customAlerting;

  public CustomErrorRule() { 
  }

  public CustomErrorRule keyPattern(String keyPattern) {
    this.keyPattern = keyPattern;
    return this;
  }

   /**
   * The key of the error to look for.
   * @return keyPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the error to look for.")
  @JsonProperty(JSON_PROPERTY_KEY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyPattern() {
    return keyPattern;
  }


  @JsonProperty(JSON_PROPERTY_KEY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyPattern(String keyPattern) {
    this.keyPattern = keyPattern;
  }


  public CustomErrorRule keyMatcher(KeyMatcherEnum keyMatcher) {
    this.keyMatcher = keyMatcher;
    return this;
  }

   /**
   * The matching operation for the **keyPattern**.
   * @return keyMatcher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The matching operation for the **keyPattern**.")
  @JsonProperty(JSON_PROPERTY_KEY_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeyMatcherEnum getKeyMatcher() {
    return keyMatcher;
  }


  @JsonProperty(JSON_PROPERTY_KEY_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyMatcher(KeyMatcherEnum keyMatcher) {
    this.keyMatcher = keyMatcher;
  }


  public CustomErrorRule valuePattern(String valuePattern) {
    this.valuePattern = valuePattern;
    return this;
  }

   /**
   * The value of the error to look for.
   * @return valuePattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the error to look for.")
  @JsonProperty(JSON_PROPERTY_VALUE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValuePattern() {
    return valuePattern;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValuePattern(String valuePattern) {
    this.valuePattern = valuePattern;
  }


  public CustomErrorRule valueMatcher(ValueMatcherEnum valueMatcher) {
    this.valueMatcher = valueMatcher;
    return this;
  }

   /**
   * The matching operation for the **valuePattern**.
   * @return valueMatcher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The matching operation for the **valuePattern**.")
  @JsonProperty(JSON_PROPERTY_VALUE_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueMatcherEnum getValueMatcher() {
    return valueMatcher;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_MATCHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueMatcher(ValueMatcherEnum valueMatcher) {
    this.valueMatcher = valueMatcher;
  }


  public CustomErrorRule capture(Boolean capture) {
    this.capture = capture;
    return this;
  }

   /**
   * Capture (&#x60;true&#x60;) or ignore (&#x60;false&#x60;) the error.
   * @return capture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Capture (`true`) or ignore (`false`) the error.")
  @JsonProperty(JSON_PROPERTY_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCapture() {
    return capture;
  }


  @JsonProperty(JSON_PROPERTY_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapture(Boolean capture) {
    this.capture = capture;
  }


  public CustomErrorRule impactApdex(Boolean impactApdex) {
    this.impactApdex = impactApdex;
    return this;
  }

   /**
   * Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Apdex calculation.
   * @return impactApdex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Include (`true`) or exclude (`false`) the error in Apdex calculation.")
  @JsonProperty(JSON_PROPERTY_IMPACT_APDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getImpactApdex() {
    return impactApdex;
  }


  @JsonProperty(JSON_PROPERTY_IMPACT_APDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImpactApdex(Boolean impactApdex) {
    this.impactApdex = impactApdex;
  }


  public CustomErrorRule customAlerting(Boolean customAlerting) {
    this.customAlerting = customAlerting;
    return this;
  }

   /**
   * Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Davis AI [problem detection and analysis](https://dt-url.net/a963kd2).
   * @return customAlerting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Include (`true`) or exclude (`false`) the error in Davis AI [problem detection and analysis](https://dt-url.net/a963kd2).")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ALERTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCustomAlerting() {
    return customAlerting;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ALERTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomAlerting(Boolean customAlerting) {
    this.customAlerting = customAlerting;
  }


  /**
   * Return true if this CustomErrorRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomErrorRule customErrorRule = (CustomErrorRule) o;
    return Objects.equals(this.keyPattern, customErrorRule.keyPattern) &&
        Objects.equals(this.keyMatcher, customErrorRule.keyMatcher) &&
        Objects.equals(this.valuePattern, customErrorRule.valuePattern) &&
        Objects.equals(this.valueMatcher, customErrorRule.valueMatcher) &&
        Objects.equals(this.capture, customErrorRule.capture) &&
        Objects.equals(this.impactApdex, customErrorRule.impactApdex) &&
        Objects.equals(this.customAlerting, customErrorRule.customAlerting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPattern, keyMatcher, valuePattern, valueMatcher, capture, impactApdex, customAlerting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomErrorRule {\n");
    sb.append("    keyPattern: ").append(toIndentedString(keyPattern)).append("\n");
    sb.append("    keyMatcher: ").append(toIndentedString(keyMatcher)).append("\n");
    sb.append("    valuePattern: ").append(toIndentedString(valuePattern)).append("\n");
    sb.append("    valueMatcher: ").append(toIndentedString(valueMatcher)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    impactApdex: ").append(toIndentedString(impactApdex)).append("\n");
    sb.append("    customAlerting: ").append(toIndentedString(customAlerting)).append("\n");
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

