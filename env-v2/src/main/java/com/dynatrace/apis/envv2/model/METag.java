/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv2.model;

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
 * The tag of a monitored entity.
 */
@ApiModel(description = "The tag of a monitored entity.")
@JsonPropertyOrder({
  METag.JSON_PROPERTY_STRING_REPRESENTATION,
  METag.JSON_PROPERTY_VALUE,
  METag.JSON_PROPERTY_KEY,
  METag.JSON_PROPERTY_CONTEXT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class METag {
  public static final String JSON_PROPERTY_STRING_REPRESENTATION = "stringRepresentation";
  private String stringRepresentation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public METag() { 
  }

  public METag stringRepresentation(String stringRepresentation) {
    this.stringRepresentation = stringRepresentation;
    return this;
  }

   /**
   * The string representation of the tag.
   * @return stringRepresentation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string representation of the tag.")
  @JsonProperty(JSON_PROPERTY_STRING_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStringRepresentation() {
    return stringRepresentation;
  }


  @JsonProperty(JSON_PROPERTY_STRING_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringRepresentation(String stringRepresentation) {
    this.stringRepresentation = stringRepresentation;
  }


  public METag value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the tag.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the tag.")
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


  public METag key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the tag.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the tag.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public METag context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The origin of the tag, such as AWS or Cloud Foundry.    Custom tags use the &#x60;CONTEXTLESS&#x60; value.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The origin of the tag, such as AWS or Cloud Foundry.    Custom tags use the `CONTEXTLESS` value.")
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContext(String context) {
    this.context = context;
  }


  /**
   * Return true if this METag object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    METag meTag = (METag) o;
    return Objects.equals(this.stringRepresentation, meTag.stringRepresentation) &&
        Objects.equals(this.value, meTag.value) &&
        Objects.equals(this.key, meTag.key) &&
        Objects.equals(this.context, meTag.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringRepresentation, value, key, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class METag {\n");
    sb.append("    stringRepresentation: ").append(toIndentedString(stringRepresentation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

