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
import com.dynatrace.apis.configv1.model.MetricEventAlertingScope;
import com.dynatrace.apis.configv1.model.TagFilter;
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
 * A scope filter for tags on entities.
 */
@ApiModel(description = "A scope filter for tags on entities.")
@JsonPropertyOrder({
  TagFilterAlertingScope.JSON_PROPERTY_TAG_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "filterType", // ignore manually set filterType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the filterType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "filterType", visible = true)

public class TagFilterAlertingScope extends MetricEventAlertingScope {
  public static final String JSON_PROPERTY_TAG_FILTER = "tagFilter";
  private TagFilter tagFilter;

  public TagFilterAlertingScope() { 
  }

  public TagFilterAlertingScope tagFilter(TagFilter tagFilter) {
    this.tagFilter = tagFilter;
    return this;
  }

   /**
   * Get tagFilter
   * @return tagFilter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAG_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TagFilter getTagFilter() {
    return tagFilter;
  }


  @JsonProperty(JSON_PROPERTY_TAG_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTagFilter(TagFilter tagFilter) {
    this.tagFilter = tagFilter;
  }


  /**
   * Return true if this TagFilterAlertingScope object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagFilterAlertingScope tagFilterAlertingScope = (TagFilterAlertingScope) o;
    return Objects.equals(this.tagFilter, tagFilterAlertingScope.tagFilter) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagFilter, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagFilterAlertingScope {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tagFilter: ").append(toIndentedString(tagFilter)).append("\n");
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
  mappings.put("TagFilterAlertingScope", TagFilterAlertingScope.class);
  JSON.registerDiscriminator(TagFilterAlertingScope.class, "filterType", mappings);
}
}
