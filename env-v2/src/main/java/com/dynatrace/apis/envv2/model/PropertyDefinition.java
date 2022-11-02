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
import com.dynatrace.apis.envv2.model.Constraint;
import com.dynatrace.apis.envv2.model.DatasourceDefinition;
import com.dynatrace.apis.envv2.model.Item;
import com.dynatrace.apis.envv2.model.Precondition;
import com.dynatrace.apis.envv2.model.UiCustomization;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of a property in a settings schema.
 */
@ApiModel(description = "Configuration of a property in a settings schema.")
@JsonPropertyOrder({
  PropertyDefinition.JSON_PROPERTY_REFERENCED_TYPE,
  PropertyDefinition.JSON_PROPERTY_MAX_OBJECTS,
  PropertyDefinition.JSON_PROPERTY_UI_CUSTOMIZATION,
  PropertyDefinition.JSON_PROPERTY_DOCUMENTATION,
  PropertyDefinition.JSON_PROPERTY_PRECONDITION,
  PropertyDefinition.JSON_PROPERTY_DATASOURCE,
  PropertyDefinition.JSON_PROPERTY_MIN_OBJECTS,
  PropertyDefinition.JSON_PROPERTY_MODIFICATION_POLICY,
  PropertyDefinition.JSON_PROPERTY_ITEMS,
  PropertyDefinition.JSON_PROPERTY_SUB_TYPE,
  PropertyDefinition.JSON_PROPERTY_DISPLAY_NAME,
  PropertyDefinition.JSON_PROPERTY_DEFAULT,
  PropertyDefinition.JSON_PROPERTY_TYPE,
  PropertyDefinition.JSON_PROPERTY_DESCRIPTION,
  PropertyDefinition.JSON_PROPERTY_METADATA,
  PropertyDefinition.JSON_PROPERTY_CONSTRAINTS,
  PropertyDefinition.JSON_PROPERTY_NULLABLE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class PropertyDefinition {
  public static final String JSON_PROPERTY_REFERENCED_TYPE = "referencedType";
  private String referencedType;

  public static final String JSON_PROPERTY_MAX_OBJECTS = "maxObjects";
  private Integer maxObjects;

  public static final String JSON_PROPERTY_UI_CUSTOMIZATION = "uiCustomization";
  private UiCustomization uiCustomization;

  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  private String documentation;

  public static final String JSON_PROPERTY_PRECONDITION = "precondition";
  private Precondition precondition;

  public static final String JSON_PROPERTY_DATASOURCE = "datasource";
  private DatasourceDefinition datasource;

  public static final String JSON_PROPERTY_MIN_OBJECTS = "minObjects";
  private Integer minObjects;

  /**
   * Modification policy of the property.
   */
  public enum ModificationPolicyEnum {
    ALWAYS("ALWAYS"),
    
    DEFAULT("DEFAULT"),
    
    NEVER("NEVER");

    private String value;

    ModificationPolicyEnum(String value) {
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
    public static ModificationPolicyEnum fromValue(String value) {
      for (ModificationPolicyEnum b : ModificationPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODIFICATION_POLICY = "modificationPolicy";
  private ModificationPolicyEnum modificationPolicy;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private Item items;

  public static final String JSON_PROPERTY_SUB_TYPE = "subType";
  private String subType;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_DEFAULT = "default";
  private Object _default;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Object type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<Constraint> constraints = null;

  public static final String JSON_PROPERTY_NULLABLE = "nullable";
  private Boolean nullable;

  public PropertyDefinition() { 
  }

  public PropertyDefinition referencedType(String referencedType) {
    this.referencedType = referencedType;
    return this;
  }

   /**
   * The type referenced by the property value
   * @return referencedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertyReferencedType", value = "The type referenced by the property value")
  @JsonProperty(JSON_PROPERTY_REFERENCED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferencedType() {
    return referencedType;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferencedType(String referencedType) {
    this.referencedType = referencedType;
  }


  public PropertyDefinition maxObjects(Integer maxObjects) {
    this.maxObjects = maxObjects;
    return this;
  }

   /**
   * The maximum number of **objects** in a collection property.    Has the value of &#x60;1&#x60; for singletons.
   * @return maxObjects
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum number of **objects** in a collection property.    Has the value of `1` for singletons.")
  @JsonProperty(JSON_PROPERTY_MAX_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxObjects() {
    return maxObjects;
  }


  @JsonProperty(JSON_PROPERTY_MAX_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxObjects(Integer maxObjects) {
    this.maxObjects = maxObjects;
  }


  public PropertyDefinition uiCustomization(UiCustomization uiCustomization) {
    this.uiCustomization = uiCustomization;
    return this;
  }

   /**
   * Get uiCustomization
   * @return uiCustomization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UI_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UiCustomization getUiCustomization() {
    return uiCustomization;
  }


  @JsonProperty(JSON_PROPERTY_UI_CUSTOMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiCustomization(UiCustomization uiCustomization) {
    this.uiCustomization = uiCustomization;
  }


  public PropertyDefinition documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

   /**
   * An extended description and/or links to documentation.
   * @return documentation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertyDocumentation", value = "An extended description and/or links to documentation.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentation() {
    return documentation;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }


  public PropertyDefinition precondition(Precondition precondition) {
    this.precondition = precondition;
    return this;
  }

   /**
   * Get precondition
   * @return precondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Precondition getPrecondition() {
    return precondition;
  }


  @JsonProperty(JSON_PROPERTY_PRECONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrecondition(Precondition precondition) {
    this.precondition = precondition;
  }


  public PropertyDefinition datasource(DatasourceDefinition datasource) {
    this.datasource = datasource;
    return this;
  }

   /**
   * Get datasource
   * @return datasource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatasourceDefinition getDatasource() {
    return datasource;
  }


  @JsonProperty(JSON_PROPERTY_DATASOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasource(DatasourceDefinition datasource) {
    this.datasource = datasource;
  }


  public PropertyDefinition minObjects(Integer minObjects) {
    this.minObjects = minObjects;
    return this;
  }

   /**
   * The minimum number of **objects** in a collection property.
   * @return minObjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The minimum number of **objects** in a collection property.")
  @JsonProperty(JSON_PROPERTY_MIN_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinObjects() {
    return minObjects;
  }


  @JsonProperty(JSON_PROPERTY_MIN_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinObjects(Integer minObjects) {
    this.minObjects = minObjects;
  }


  public PropertyDefinition modificationPolicy(ModificationPolicyEnum modificationPolicy) {
    this.modificationPolicy = modificationPolicy;
    return this;
  }

   /**
   * Modification policy of the property.
   * @return modificationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALWAYS", value = "Modification policy of the property.")
  @JsonProperty(JSON_PROPERTY_MODIFICATION_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModificationPolicyEnum getModificationPolicy() {
    return modificationPolicy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFICATION_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModificationPolicy(ModificationPolicyEnum modificationPolicy) {
    this.modificationPolicy = modificationPolicy;
  }


  public PropertyDefinition items(Item items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Item getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(Item items) {
    this.items = items;
  }


  public PropertyDefinition subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * The subtype of the property&#39;s value.
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertySubType", value = "The subtype of the property's value.")
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubType() {
    return subType;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubType(String subType) {
    this.subType = subType;
  }


  public PropertyDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertyDisplayName", value = "The display name of the property.")
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


  public PropertyDefinition _default(Object _default) {
    this._default = _default;
    return this;
  }

   /**
   * The default value to be used when no value is provided.   If a non-singleton has the value of &#x60;null&#x60;, it means an empty collection.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertyDefaultValue", value = "The default value to be used when no value is provided.   If a non-singleton has the value of `null`, it means an empty collection.")
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getDefault() {
    return _default;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefault(Object _default) {
    this._default = _default;
  }


  public PropertyDefinition type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the property&#39;s value.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the property's value.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(Object type) {
    this.type = type;
  }


  public PropertyDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the property.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "propertyDescription", value = "A short description of the property.")
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


  public PropertyDefinition metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public PropertyDefinition putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata of the property.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata of the property.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public PropertyDefinition constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public PropertyDefinition addConstraintsItem(Constraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * A list of constraints limiting the values to be accepted.
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of constraints limiting the values to be accepted.")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Constraint> getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
  }


  public PropertyDefinition nullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

   /**
   * The value can (&#x60;true&#x60;) or can&#39;t (&#x60;false&#x60;) be &#x60;null&#x60;.
   * @return nullable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "The value can (`true`) or can't (`false`) be `null`.")
  @JsonProperty(JSON_PROPERTY_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getNullable() {
    return nullable;
  }


  @JsonProperty(JSON_PROPERTY_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }


  /**
   * Return true if this PropertyDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyDefinition propertyDefinition = (PropertyDefinition) o;
    return Objects.equals(this.referencedType, propertyDefinition.referencedType) &&
        Objects.equals(this.maxObjects, propertyDefinition.maxObjects) &&
        Objects.equals(this.uiCustomization, propertyDefinition.uiCustomization) &&
        Objects.equals(this.documentation, propertyDefinition.documentation) &&
        Objects.equals(this.precondition, propertyDefinition.precondition) &&
        Objects.equals(this.datasource, propertyDefinition.datasource) &&
        Objects.equals(this.minObjects, propertyDefinition.minObjects) &&
        Objects.equals(this.modificationPolicy, propertyDefinition.modificationPolicy) &&
        Objects.equals(this.items, propertyDefinition.items) &&
        Objects.equals(this.subType, propertyDefinition.subType) &&
        Objects.equals(this.displayName, propertyDefinition.displayName) &&
        Objects.equals(this._default, propertyDefinition._default) &&
        Objects.equals(this.type, propertyDefinition.type) &&
        Objects.equals(this.description, propertyDefinition.description) &&
        Objects.equals(this.metadata, propertyDefinition.metadata) &&
        Objects.equals(this.constraints, propertyDefinition.constraints) &&
        Objects.equals(this.nullable, propertyDefinition.nullable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedType, maxObjects, uiCustomization, documentation, precondition, datasource, minObjects, modificationPolicy, items, subType, displayName, _default, type, description, metadata, constraints, nullable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinition {\n");
    sb.append("    referencedType: ").append(toIndentedString(referencedType)).append("\n");
    sb.append("    maxObjects: ").append(toIndentedString(maxObjects)).append("\n");
    sb.append("    uiCustomization: ").append(toIndentedString(uiCustomization)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    precondition: ").append(toIndentedString(precondition)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    minObjects: ").append(toIndentedString(minObjects)).append("\n");
    sb.append("    modificationPolicy: ").append(toIndentedString(modificationPolicy)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
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

