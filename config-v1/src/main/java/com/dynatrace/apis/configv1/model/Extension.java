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
import com.dynatrace.apis.configv1.model.ExtensionProperty;
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
 * General configuration of an extension.
 */
@ApiModel(description = "General configuration of an extension.")
@JsonPropertyOrder({
  Extension.JSON_PROPERTY_ID,
  Extension.JSON_PROPERTY_NAME,
  Extension.JSON_PROPERTY_VERSION,
  Extension.JSON_PROPERTY_TYPE,
  Extension.JSON_PROPERTY_METRIC_GROUP,
  Extension.JSON_PROPERTY_METADATA,
  Extension.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class Extension {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  /**
   * The type of the extension. It indicates the runtime environment of the extension (for example, ACTIVEGATE).
   */
  public enum TypeEnum {
    ACTIVEGATE("ACTIVEGATE"),
    
    CODEMODULE("CODEMODULE"),
    
    JMX("JMX"),
    
    ONEAGENT("ONEAGENT"),
    
    PMI("PMI"),
    
    UNKNOWN("UNKNOWN");

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

  public static final String JSON_PROPERTY_METRIC_GROUP = "metricGroup";
  private String metricGroup;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ExtensionProperty> properties = null;

  public Extension() { 
  }

  public Extension id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the extension, for example &#x60;custom.remote.python.demo&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the extension, for example `custom.remote.python.demo`.")
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


  public Extension name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the extension, displayed in Dynatrace.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the extension, displayed in Dynatrace.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Extension version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the extension, displayed in Dynatrace.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the extension, displayed in Dynatrace.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public Extension type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the extension. It indicates the runtime environment of the extension (for example, ACTIVEGATE).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the extension. It indicates the runtime environment of the extension (for example, ACTIVEGATE).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Extension metricGroup(String metricGroup) {
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * The metricGroup of the extension used for grouping custom metrics into a hierarchical namespace.
   * @return metricGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The metricGroup of the extension used for grouping custom metrics into a hierarchical namespace.")
  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetricGroup() {
    return metricGroup;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricGroup(String metricGroup) {
    this.metricGroup = metricGroup;
  }


  public Extension metadata(ConfigurationMetadata metadata) {
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


  public Extension properties(List<ExtensionProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Extension addPropertiesItem(ExtensionProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * A list of extension properties.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of extension properties.")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtensionProperty> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(List<ExtensionProperty> properties) {
    this.properties = properties;
  }


  /**
   * Return true if this Extension object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extension extension = (Extension) o;
    return Objects.equals(this.id, extension.id) &&
        Objects.equals(this.name, extension.name) &&
        Objects.equals(this.version, extension.version) &&
        Objects.equals(this.type, extension.type) &&
        Objects.equals(this.metricGroup, extension.metricGroup) &&
        Objects.equals(this.metadata, extension.metadata) &&
        Objects.equals(this.properties, extension.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, type, metricGroup, metadata, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extension {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metricGroup: ").append(toIndentedString(metricGroup)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
