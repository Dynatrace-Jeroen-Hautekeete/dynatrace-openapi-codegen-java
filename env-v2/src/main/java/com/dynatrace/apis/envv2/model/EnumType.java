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
import com.dynatrace.apis.envv2.model.EnumValue;
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
 * Definition of an enum property.
 */
@ApiModel(description = "Definition of an enum property.")
@JsonPropertyOrder({
  EnumType.JSON_PROPERTY_ENUM_CLASS,
  EnumType.JSON_PROPERTY_ITEMS,
  EnumType.JSON_PROPERTY_TYPE,
  EnumType.JSON_PROPERTY_DOCUMENTATION,
  EnumType.JSON_PROPERTY_DISPLAY_NAME,
  EnumType.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class EnumType {
  public static final String JSON_PROPERTY_ENUM_CLASS = "enumClass";
  private String enumClass;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<EnumValue> items = new ArrayList<>();

  /**
   * The type of the property.
   */
  public enum TypeEnum {
    ENUM("enum");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  private String documentation;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public EnumType() { 
  }

  public EnumType enumClass(String enumClass) {
    this.enumClass = enumClass;
    return this;
  }

   /**
   * An existing Java enum class that holds the allowed values of the enum.
   * @return enumClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "enumClass", value = "An existing Java enum class that holds the allowed values of the enum.")
  @JsonProperty(JSON_PROPERTY_ENUM_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnumClass() {
    return enumClass;
  }


  @JsonProperty(JSON_PROPERTY_ENUM_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnumClass(String enumClass) {
    this.enumClass = enumClass;
  }


  public EnumType items(List<EnumValue> items) {
    this.items = items;
    return this;
  }

  public EnumType addItemsItem(EnumValue itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of allowed values of the enum.
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of allowed values of the enum.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<EnumValue> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<EnumValue> items) {
    this.items = items;
  }


  public EnumType type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "enum", required = true, value = "The type of the property.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public EnumType documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

   /**
   * An extended description and/or links to documentation.
   * @return documentation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "typeDocumentation", required = true, value = "An extended description and/or links to documentation.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentation() {
    return documentation;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }


  public EnumType displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "typeDisplayName", value = "The display name of the property.")
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


  public EnumType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the property.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "typeDescription", required = true, value = "A short description of the property.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this EnumType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumType enumType = (EnumType) o;
    return Objects.equals(this.enumClass, enumType.enumClass) &&
        Objects.equals(this.items, enumType.items) &&
        Objects.equals(this.type, enumType.type) &&
        Objects.equals(this.documentation, enumType.documentation) &&
        Objects.equals(this.displayName, enumType.displayName) &&
        Objects.equals(this.description, enumType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumClass, items, type, documentation, displayName, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumType {\n");
    sb.append("    enumClass: ").append(toIndentedString(enumClass)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
