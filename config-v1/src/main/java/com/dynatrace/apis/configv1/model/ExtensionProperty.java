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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A property of an extension.
 */
@ApiModel(description = "A property of an extension.")
@JsonPropertyOrder({
  ExtensionProperty.JSON_PROPERTY_KEY,
  ExtensionProperty.JSON_PROPERTY_TYPE,
  ExtensionProperty.JSON_PROPERTY_DEFAULT_VALUE,
  ExtensionProperty.JSON_PROPERTY_DROPDOWN_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ExtensionProperty {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private String defaultValue;

  public static final String JSON_PROPERTY_DROPDOWN_VALUES = "dropdownValues";
  private List<String> dropdownValues = null;

  public ExtensionProperty() { 
  }

  public ExtensionProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the property.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the property.")
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


  public ExtensionProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the property.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ExtensionProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of the property.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default value of the property.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ExtensionProperty dropdownValues(List<String> dropdownValues) {
    this.dropdownValues = dropdownValues;
    return this;
  }

  public ExtensionProperty addDropdownValuesItem(String dropdownValuesItem) {
    if (this.dropdownValues == null) {
      this.dropdownValues = new ArrayList<>();
    }
    this.dropdownValues.add(dropdownValuesItem);
    return this;
  }

   /**
   * The list of possible values of the property.    If such a list is defined, only values from this list can be assigned to the property.
   * @return dropdownValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of possible values of the property.    If such a list is defined, only values from this list can be assigned to the property.")
  @JsonProperty(JSON_PROPERTY_DROPDOWN_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDropdownValues() {
    return dropdownValues;
  }


  @JsonProperty(JSON_PROPERTY_DROPDOWN_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDropdownValues(List<String> dropdownValues) {
    this.dropdownValues = dropdownValues;
  }


  /**
   * Return true if this ExtensionProperty object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionProperty extensionProperty = (ExtensionProperty) o;
    return Objects.equals(this.key, extensionProperty.key) &&
        Objects.equals(this.type, extensionProperty.type) &&
        Objects.equals(this.defaultValue, extensionProperty.defaultValue) &&
        Objects.equals(this.dropdownValues, extensionProperty.dropdownValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, defaultValue, dropdownValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionProperty {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    dropdownValues: ").append(toIndentedString(dropdownValues)).append("\n");
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
