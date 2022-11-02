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
import com.dynatrace.apis.configv1.model.CustomErrorRule;
import com.dynatrace.apis.configv1.model.HttpErrorRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of error rules in the web application.
 */
@ApiModel(description = "Configuration of error rules in the web application.")
@JsonPropertyOrder({
  ApplicationErrorRules.JSON_PROPERTY_IGNORE_JAVA_SCRIPT_ERRORS_IN_APDEX_CALCULATION,
  ApplicationErrorRules.JSON_PROPERTY_IGNORE_HTTP_ERRORS_IN_APDEX_CALCULATION,
  ApplicationErrorRules.JSON_PROPERTY_IGNORE_CUSTOM_ERRORS_IN_APDEX_CALCULATION,
  ApplicationErrorRules.JSON_PROPERTY_HTTP_ERROR_RULES,
  ApplicationErrorRules.JSON_PROPERTY_CUSTOM_ERROR_RULES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ApplicationErrorRules {
  public static final String JSON_PROPERTY_IGNORE_JAVA_SCRIPT_ERRORS_IN_APDEX_CALCULATION = "ignoreJavaScriptErrorsInApdexCalculation";
  private Boolean ignoreJavaScriptErrorsInApdexCalculation;

  public static final String JSON_PROPERTY_IGNORE_HTTP_ERRORS_IN_APDEX_CALCULATION = "ignoreHttpErrorsInApdexCalculation";
  private Boolean ignoreHttpErrorsInApdexCalculation;

  public static final String JSON_PROPERTY_IGNORE_CUSTOM_ERRORS_IN_APDEX_CALCULATION = "ignoreCustomErrorsInApdexCalculation";
  private Boolean ignoreCustomErrorsInApdexCalculation;

  public static final String JSON_PROPERTY_HTTP_ERROR_RULES = "httpErrorRules";
  private List<HttpErrorRule> httpErrorRules = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOM_ERROR_RULES = "customErrorRules";
  private List<CustomErrorRule> customErrorRules = new ArrayList<>();

  public ApplicationErrorRules() { 
  }

  public ApplicationErrorRules ignoreJavaScriptErrorsInApdexCalculation(Boolean ignoreJavaScriptErrorsInApdexCalculation) {
    this.ignoreJavaScriptErrorsInApdexCalculation = ignoreJavaScriptErrorsInApdexCalculation;
    return this;
  }

   /**
   * Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) JavaScript errors in Apdex calculation.
   * @return ignoreJavaScriptErrorsInApdexCalculation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation.")
  @JsonProperty(JSON_PROPERTY_IGNORE_JAVA_SCRIPT_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIgnoreJavaScriptErrorsInApdexCalculation() {
    return ignoreJavaScriptErrorsInApdexCalculation;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_JAVA_SCRIPT_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIgnoreJavaScriptErrorsInApdexCalculation(Boolean ignoreJavaScriptErrorsInApdexCalculation) {
    this.ignoreJavaScriptErrorsInApdexCalculation = ignoreJavaScriptErrorsInApdexCalculation;
  }


  public ApplicationErrorRules ignoreHttpErrorsInApdexCalculation(Boolean ignoreHttpErrorsInApdexCalculation) {
    this.ignoreHttpErrorsInApdexCalculation = ignoreHttpErrorsInApdexCalculation;
    return this;
  }

   /**
   * Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) HTTP errors listed in **httpErrorRules** in Apdex calculation.
   * @return ignoreHttpErrorsInApdexCalculation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation.")
  @JsonProperty(JSON_PROPERTY_IGNORE_HTTP_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIgnoreHttpErrorsInApdexCalculation() {
    return ignoreHttpErrorsInApdexCalculation;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_HTTP_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIgnoreHttpErrorsInApdexCalculation(Boolean ignoreHttpErrorsInApdexCalculation) {
    this.ignoreHttpErrorsInApdexCalculation = ignoreHttpErrorsInApdexCalculation;
  }


  public ApplicationErrorRules ignoreCustomErrorsInApdexCalculation(Boolean ignoreCustomErrorsInApdexCalculation) {
    this.ignoreCustomErrorsInApdexCalculation = ignoreCustomErrorsInApdexCalculation;
    return this;
  }

   /**
   * Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) custom errors listed in **customErrorRules** in Apdex calculation.
   * @return ignoreCustomErrorsInApdexCalculation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation.")
  @JsonProperty(JSON_PROPERTY_IGNORE_CUSTOM_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIgnoreCustomErrorsInApdexCalculation() {
    return ignoreCustomErrorsInApdexCalculation;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_CUSTOM_ERRORS_IN_APDEX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIgnoreCustomErrorsInApdexCalculation(Boolean ignoreCustomErrorsInApdexCalculation) {
    this.ignoreCustomErrorsInApdexCalculation = ignoreCustomErrorsInApdexCalculation;
  }


  public ApplicationErrorRules httpErrorRules(List<HttpErrorRule> httpErrorRules) {
    this.httpErrorRules = httpErrorRules;
    return this;
  }

  public ApplicationErrorRules addHttpErrorRulesItem(HttpErrorRule httpErrorRulesItem) {
    this.httpErrorRules.add(httpErrorRulesItem);
    return this;
  }

   /**
   * An ordered list of HTTP errors.   Rules are evaluated from top to bottom; the first matching rule applies.
   * @return httpErrorRules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An ordered list of HTTP errors.   Rules are evaluated from top to bottom; the first matching rule applies.")
  @JsonProperty(JSON_PROPERTY_HTTP_ERROR_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<HttpErrorRule> getHttpErrorRules() {
    return httpErrorRules;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_ERROR_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHttpErrorRules(List<HttpErrorRule> httpErrorRules) {
    this.httpErrorRules = httpErrorRules;
  }


  public ApplicationErrorRules customErrorRules(List<CustomErrorRule> customErrorRules) {
    this.customErrorRules = customErrorRules;
    return this;
  }

  public ApplicationErrorRules addCustomErrorRulesItem(CustomErrorRule customErrorRulesItem) {
    this.customErrorRules.add(customErrorRulesItem);
    return this;
  }

   /**
   * An ordered list of custom errors.   Rules are evaluated from top to bottom; the first matching rule applies.
   * @return customErrorRules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An ordered list of custom errors.   Rules are evaluated from top to bottom; the first matching rule applies.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ERROR_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CustomErrorRule> getCustomErrorRules() {
    return customErrorRules;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ERROR_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomErrorRules(List<CustomErrorRule> customErrorRules) {
    this.customErrorRules = customErrorRules;
  }


  /**
   * Return true if this ApplicationErrorRules object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationErrorRules applicationErrorRules = (ApplicationErrorRules) o;
    return Objects.equals(this.ignoreJavaScriptErrorsInApdexCalculation, applicationErrorRules.ignoreJavaScriptErrorsInApdexCalculation) &&
        Objects.equals(this.ignoreHttpErrorsInApdexCalculation, applicationErrorRules.ignoreHttpErrorsInApdexCalculation) &&
        Objects.equals(this.ignoreCustomErrorsInApdexCalculation, applicationErrorRules.ignoreCustomErrorsInApdexCalculation) &&
        Objects.equals(this.httpErrorRules, applicationErrorRules.httpErrorRules) &&
        Objects.equals(this.customErrorRules, applicationErrorRules.customErrorRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreJavaScriptErrorsInApdexCalculation, ignoreHttpErrorsInApdexCalculation, ignoreCustomErrorsInApdexCalculation, httpErrorRules, customErrorRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationErrorRules {\n");
    sb.append("    ignoreJavaScriptErrorsInApdexCalculation: ").append(toIndentedString(ignoreJavaScriptErrorsInApdexCalculation)).append("\n");
    sb.append("    ignoreHttpErrorsInApdexCalculation: ").append(toIndentedString(ignoreHttpErrorsInApdexCalculation)).append("\n");
    sb.append("    ignoreCustomErrorsInApdexCalculation: ").append(toIndentedString(ignoreCustomErrorsInApdexCalculation)).append("\n");
    sb.append("    httpErrorRules: ").append(toIndentedString(httpErrorRules)).append("\n");
    sb.append("    customErrorRules: ").append(toIndentedString(customErrorRules)).append("\n");
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

