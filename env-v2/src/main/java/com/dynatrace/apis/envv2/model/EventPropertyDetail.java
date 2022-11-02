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
 * Configuration of an event property.
 */
@ApiModel(description = "Configuration of an event property.")
@JsonPropertyOrder({
  EventPropertyDetail.JSON_PROPERTY_DISPLAY_NAME,
  EventPropertyDetail.JSON_PROPERTY_KEY,
  EventPropertyDetail.JSON_PROPERTY_WRITABLE,
  EventPropertyDetail.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class EventPropertyDetail {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_WRITABLE = "writable";
  private Boolean writable;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public EventPropertyDetail() { 
  }

  public EventPropertyDetail displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the event property.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Custom description", value = "The display name of the event property.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public EventPropertyDetail key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The event property key.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dt.event.description", value = "The event property key.")
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


  public EventPropertyDetail writable(Boolean writable) {
    this.writable = writable;
    return this;
  }

   /**
   * Indicates whether the property may be set during event ingestion.
   * @return writable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the property may be set during event ingestion.")
  @JsonProperty(JSON_PROPERTY_WRITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWritable() {
    return writable;
  }


  @JsonProperty(JSON_PROPERTY_WRITABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWritable(Boolean writable) {
    this.writable = writable;
  }


  public EventPropertyDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the event property.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the event property.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this EventPropertyDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPropertyDetail eventPropertyDetail = (EventPropertyDetail) o;
    return Objects.equals(this.displayName, eventPropertyDetail.displayName) &&
        Objects.equals(this.key, eventPropertyDetail.key) &&
        Objects.equals(this.writable, eventPropertyDetail.writable) &&
        Objects.equals(this.description, eventPropertyDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, key, writable, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPropertyDetail {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    writable: ").append(toIndentedString(writable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

