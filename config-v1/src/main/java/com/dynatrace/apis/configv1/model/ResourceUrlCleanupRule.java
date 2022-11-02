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
 * A rule for the URL cleanup rule.
 */
@ApiModel(description = "A rule for the URL cleanup rule.")
@JsonPropertyOrder({
  ResourceUrlCleanupRule.JSON_PROPERTY_RESOURCE_NAME,
  ResourceUrlCleanupRule.JSON_PROPERTY_REGULAR_EXPRESSION,
  ResourceUrlCleanupRule.JSON_PROPERTY_REPLACE_WITH
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ResourceUrlCleanupRule {
  public static final String JSON_PROPERTY_RESOURCE_NAME = "resourceName";
  private String resourceName;

  public static final String JSON_PROPERTY_REGULAR_EXPRESSION = "regularExpression";
  private String regularExpression;

  public static final String JSON_PROPERTY_REPLACE_WITH = "replaceWith";
  private String replaceWith;

  public ResourceUrlCleanupRule() { 
  }

  public ResourceUrlCleanupRule resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * The name of the rule.
   * @return resourceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the rule.")
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceName() {
    return resourceName;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public ResourceUrlCleanupRule regularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
    return this;
  }

   /**
   * The pattern (regular expression) to look for.
   * @return regularExpression
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The pattern (regular expression) to look for.")
  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegularExpression() {
    return regularExpression;
  }


  @JsonProperty(JSON_PROPERTY_REGULAR_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }


  public ResourceUrlCleanupRule replaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
    return this;
  }

   /**
   * The text to replace the found pattern with.
   * @return replaceWith
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The text to replace the found pattern with.")
  @JsonProperty(JSON_PROPERTY_REPLACE_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReplaceWith() {
    return replaceWith;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReplaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
  }


  /**
   * Return true if this ResourceUrlCleanupRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUrlCleanupRule resourceUrlCleanupRule = (ResourceUrlCleanupRule) o;
    return Objects.equals(this.resourceName, resourceUrlCleanupRule.resourceName) &&
        Objects.equals(this.regularExpression, resourceUrlCleanupRule.regularExpression) &&
        Objects.equals(this.replaceWith, resourceUrlCleanupRule.replaceWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, regularExpression, replaceWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUrlCleanupRule {\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
    sb.append("    replaceWith: ").append(toIndentedString(replaceWith)).append("\n");
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

