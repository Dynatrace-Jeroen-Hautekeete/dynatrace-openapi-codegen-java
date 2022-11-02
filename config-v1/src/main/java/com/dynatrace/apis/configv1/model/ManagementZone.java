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
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.dynatrace.apis.configv1.model.EntitySelectorBasedMzRule;
import com.dynatrace.apis.configv1.model.MzDimensionalRule;
import com.dynatrace.apis.configv1.model.MzRule;
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
 * The configuration of the management zone. It defines how the management zone applies.
 */
@ApiModel(description = "The configuration of the management zone. It defines how the management zone applies.")
@JsonPropertyOrder({
  ManagementZone.JSON_PROPERTY_METADATA,
  ManagementZone.JSON_PROPERTY_ID,
  ManagementZone.JSON_PROPERTY_NAME,
  ManagementZone.JSON_PROPERTY_DESCRIPTION,
  ManagementZone.JSON_PROPERTY_RULES,
  ManagementZone.JSON_PROPERTY_DIMENSIONAL_RULES,
  ManagementZone.JSON_PROPERTY_ENTITY_SELECTOR_BASED_RULES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ManagementZone {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<MzRule> rules = null;

  public static final String JSON_PROPERTY_DIMENSIONAL_RULES = "dimensionalRules";
  private List<MzDimensionalRule> dimensionalRules = null;

  public static final String JSON_PROPERTY_ENTITY_SELECTOR_BASED_RULES = "entitySelectorBasedRules";
  private List<EntitySelectorBasedMzRule> entitySelectorBasedRules = null;

  public ManagementZone() { 
  }

  public ManagementZone metadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
  }


  public ManagementZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the management zone.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The ID of the management zone.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ManagementZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the management zone.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the management zone.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ManagementZone description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the management zone.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the management zone.")
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


  public ManagementZone rules(List<MzRule> rules) {
    this.rules = rules;
    return this;
  }

  public ManagementZone addRulesItem(MzRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of rules for management zone usage.   If several rules are specified, the **OR** logic applies.
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of rules for management zone usage.   If several rules are specified, the **OR** logic applies.")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MzRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<MzRule> rules) {
    this.rules = rules;
  }


  public ManagementZone dimensionalRules(List<MzDimensionalRule> dimensionalRules) {
    this.dimensionalRules = dimensionalRules;
    return this;
  }

  public ManagementZone addDimensionalRulesItem(MzDimensionalRule dimensionalRulesItem) {
    if (this.dimensionalRules == null) {
      this.dimensionalRules = new ArrayList<>();
    }
    this.dimensionalRules.add(dimensionalRulesItem);
    return this;
  }

   /**
   * A list of dimensional data rules for management zone usage.   If several rules are specified, the **OR** logic applies.
   * @return dimensionalRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of dimensional data rules for management zone usage.   If several rules are specified, the **OR** logic applies.")
  @JsonProperty(JSON_PROPERTY_DIMENSIONAL_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MzDimensionalRule> getDimensionalRules() {
    return dimensionalRules;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONAL_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionalRules(List<MzDimensionalRule> dimensionalRules) {
    this.dimensionalRules = dimensionalRules;
  }


  public ManagementZone entitySelectorBasedRules(List<EntitySelectorBasedMzRule> entitySelectorBasedRules) {
    this.entitySelectorBasedRules = entitySelectorBasedRules;
    return this;
  }

  public ManagementZone addEntitySelectorBasedRulesItem(EntitySelectorBasedMzRule entitySelectorBasedRulesItem) {
    if (this.entitySelectorBasedRules == null) {
      this.entitySelectorBasedRules = new ArrayList<>();
    }
    this.entitySelectorBasedRules.add(entitySelectorBasedRulesItem);
    return this;
  }

   /**
   * A list of entity-selector based rules for management zone usage.  If several rules are specified, the **OR** logic applies.
   * @return entitySelectorBasedRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of entity-selector based rules for management zone usage.  If several rules are specified, the **OR** logic applies.")
  @JsonProperty(JSON_PROPERTY_ENTITY_SELECTOR_BASED_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EntitySelectorBasedMzRule> getEntitySelectorBasedRules() {
    return entitySelectorBasedRules;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_SELECTOR_BASED_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntitySelectorBasedRules(List<EntitySelectorBasedMzRule> entitySelectorBasedRules) {
    this.entitySelectorBasedRules = entitySelectorBasedRules;
  }


  /**
   * Return true if this ManagementZone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementZone managementZone = (ManagementZone) o;
    return Objects.equals(this.metadata, managementZone.metadata) &&
        Objects.equals(this.id, managementZone.id) &&
        Objects.equals(this.name, managementZone.name) &&
        Objects.equals(this.description, managementZone.description) &&
        Objects.equals(this.rules, managementZone.rules) &&
        Objects.equals(this.dimensionalRules, managementZone.dimensionalRules) &&
        Objects.equals(this.entitySelectorBasedRules, managementZone.entitySelectorBasedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, name, description, rules, dimensionalRules, entitySelectorBasedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementZone {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    dimensionalRules: ").append(toIndentedString(dimensionalRules)).append("\n");
    sb.append("    entitySelectorBasedRules: ").append(toIndentedString(entitySelectorBasedRules)).append("\n");
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
