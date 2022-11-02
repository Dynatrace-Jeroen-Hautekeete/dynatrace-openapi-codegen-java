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
 * An item of a collection property.
 */
@ApiModel(description = "An item of a collection property.")
@JsonPropertyOrder({
  Item.JSON_PROPERTY_REFERENCED_TYPE,
  Item.JSON_PROPERTY_UI_CUSTOMIZATION,
  Item.JSON_PROPERTY_DOCUMENTATION,
  Item.JSON_PROPERTY_DATASOURCE,
  Item.JSON_PROPERTY_SUB_TYPE,
  Item.JSON_PROPERTY_DISPLAY_NAME,
  Item.JSON_PROPERTY_TYPE,
  Item.JSON_PROPERTY_DESCRIPTION,
  Item.JSON_PROPERTY_METADATA,
  Item.JSON_PROPERTY_CONSTRAINTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class Item {
  public static final String JSON_PROPERTY_REFERENCED_TYPE = "referencedType";
  private String referencedType;

  public static final String JSON_PROPERTY_UI_CUSTOMIZATION = "uiCustomization";
  private UiCustomization uiCustomization;

  public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
  private String documentation;

  public static final String JSON_PROPERTY_DATASOURCE = "datasource";
  private DatasourceDefinition datasource;

  public static final String JSON_PROPERTY_SUB_TYPE = "subType";
  private String subType;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Object type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private List<Constraint> constraints = null;

  public Item() { 
  }

  public Item referencedType(String referencedType) {
    this.referencedType = referencedType;
    return this;
  }

   /**
   * The type referenced by the item&#39;s value.
   * @return referencedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "itemReferencedType", value = "The type referenced by the item's value.")
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


  public Item uiCustomization(UiCustomization uiCustomization) {
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


  public Item documentation(String documentation) {
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


  public Item datasource(DatasourceDefinition datasource) {
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


  public Item subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * The subtype of the item&#39;s value.
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "itemSubType", value = "The subtype of the item's value.")
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


  public Item displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the item.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "itemDisplayName", value = "The display name of the item.")
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


  public Item type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the item&#39;s value.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the item's value.")
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


  public Item description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the item.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "itemDescription", value = "A short description of the item.")
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


  public Item metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Item putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata of the items.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata of the items.")
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


  public Item constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Item addConstraintsItem(Constraint constraintsItem) {
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


  /**
   * Return true if this Item object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.referencedType, item.referencedType) &&
        Objects.equals(this.uiCustomization, item.uiCustomization) &&
        Objects.equals(this.documentation, item.documentation) &&
        Objects.equals(this.datasource, item.datasource) &&
        Objects.equals(this.subType, item.subType) &&
        Objects.equals(this.displayName, item.displayName) &&
        Objects.equals(this.type, item.type) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.metadata, item.metadata) &&
        Objects.equals(this.constraints, item.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedType, uiCustomization, documentation, datasource, subType, displayName, type, description, metadata, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    referencedType: ").append(toIndentedString(referencedType)).append("\n");
    sb.append("    uiCustomization: ").append(toIndentedString(uiCustomization)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

