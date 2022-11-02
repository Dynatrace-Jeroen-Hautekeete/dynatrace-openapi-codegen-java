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
import com.dynatrace.apis.configv1.model.CompareOperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * The condition of the &#x60;STRING_CONTAINS&#x60; type.   The condition checks whether the string value contains the specified text.
 */
@ApiModel(description = "The condition of the `STRING_CONTAINS` type.   The condition checks whether the string value contains the specified text.")
@JsonPropertyOrder({
  StringContainsCompareOperation.JSON_PROPERTY_NEGATE,
  StringContainsCompareOperation.JSON_PROPERTY_IGNORE_CASE,
  StringContainsCompareOperation.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class StringContainsCompareOperation extends CompareOperation {
  public static final String JSON_PROPERTY_NEGATE = "negate";
  private Boolean negate;

  public static final String JSON_PROPERTY_IGNORE_CASE = "ignoreCase";
  private Boolean ignoreCase;

  public static final String JSON_PROPERTY_VALUES = "values";
  private Set<String> values = new LinkedHashSet<>();

  public StringContainsCompareOperation() { 
  }

  public StringContainsCompareOperation negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

   /**
   * Inverts the operation of the condition. Set to &#x60;true&#x60; to turn **contains** into **does not contain**.    If not set, then &#x60;false&#x60; is used.
   * @return negate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Inverts the operation of the condition. Set to `true` to turn **contains** into **does not contain**.    If not set, then `false` is used.")
  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNegate() {
    return negate;
  }


  @JsonProperty(JSON_PROPERTY_NEGATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegate(Boolean negate) {
    this.negate = negate;
  }


  public StringContainsCompareOperation ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * The condition is case sensitive (&#x60;false&#x60;) or case insensitive (&#x60;true&#x60;).   If not set, then &#x60;false&#x60; is used, making the condition case sensitive.
   * @return ignoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The condition is case sensitive (`false`) or case insensitive (`true`).   If not set, then `false` is used, making the condition case sensitive.")
  @JsonProperty(JSON_PROPERTY_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIgnoreCase() {
    return ignoreCase;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }


  public StringContainsCompareOperation values(Set<String> values) {
    this.values = values;
    return this;
  }

  public StringContainsCompareOperation addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The value to compare to.   If several values are specified, the OR logic applies.
   * @return values
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value to compare to.   If several values are specified, the OR logic applies.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getValues() {
    return values;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(Set<String> values) {
    this.values = values;
  }


  /**
   * Return true if this StringContainsCompareOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringContainsCompareOperation stringContainsCompareOperation = (StringContainsCompareOperation) o;
    return Objects.equals(this.negate, stringContainsCompareOperation.negate) &&
        Objects.equals(this.ignoreCase, stringContainsCompareOperation.ignoreCase) &&
        Objects.equals(this.values, stringContainsCompareOperation.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negate, ignoreCase, values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringContainsCompareOperation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
  mappings.put("StringContainsCompareOperation", StringContainsCompareOperation.class);
  JSON.registerDiscriminator(StringContainsCompareOperation.class, "type", mappings);
}
}

