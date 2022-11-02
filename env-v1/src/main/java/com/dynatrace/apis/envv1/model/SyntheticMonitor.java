/*
 * Dynatrace Environment API
 * Documentation of the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/xc03k3c).  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv1.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dynatrace.apis.envv1.model.AnomalyDetection;
import com.dynatrace.apis.envv1.model.BrowserSyntheticMonitor;
import com.dynatrace.apis.envv1.model.HttpSyntheticMonitor;
import com.dynatrace.apis.envv1.model.ManagementZone;
import com.dynatrace.apis.envv1.model.TagWithSourceInfo;
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


import com.dynatrace.apis.envv1.JSON;
/**
 * The synthetic monitor.    The actual set of fields depends the type of the monitor. Find the list of actual objects in the description of the **type** field or see [Synthetic monitors API - JSON models](https://dt-url.net/2523se9).
 */
@ApiModel(description = "The synthetic monitor.    The actual set of fields depends the type of the monitor. Find the list of actual objects in the description of the **type** field or see [Synthetic monitors API - JSON models](https://dt-url.net/2523se9).")
@JsonPropertyOrder({
  SyntheticMonitor.JSON_PROPERTY_ENTITY_ID,
  SyntheticMonitor.JSON_PROPERTY_NAME,
  SyntheticMonitor.JSON_PROPERTY_FREQUENCY_MIN,
  SyntheticMonitor.JSON_PROPERTY_ENABLED,
  SyntheticMonitor.JSON_PROPERTY_TYPE,
  SyntheticMonitor.JSON_PROPERTY_CREATED_FROM,
  SyntheticMonitor.JSON_PROPERTY_SCRIPT,
  SyntheticMonitor.JSON_PROPERTY_LOCATIONS,
  SyntheticMonitor.JSON_PROPERTY_ANOMALY_DETECTION,
  SyntheticMonitor.JSON_PROPERTY_TAGS,
  SyntheticMonitor.JSON_PROPERTY_MANAGEMENT_ZONES,
  SyntheticMonitor.JSON_PROPERTY_AUTOMATICALLY_ASSIGNED_APPS,
  SyntheticMonitor.JSON_PROPERTY_MANUALLY_ASSIGNED_APPS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BrowserSyntheticMonitor.class, name = "BrowserSyntheticMonitor"),
  @JsonSubTypes.Type(value = HttpSyntheticMonitor.class, name = "HttpSyntheticMonitor"),
})

public class SyntheticMonitor {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FREQUENCY_MIN = "frequencyMin";
  private Integer frequencyMin;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BROWSER&#x60; -&gt; BrowserSyntheticMonitor  * &#x60;HTTP&#x60; -&gt; HttpSyntheticMonitor  
   */
  public enum TypeEnum {
    BROWSER("BROWSER"),
    
    HTTP("HTTP");

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

  /**
   * The origin of a monitor
   */
  public enum CreatedFromEnum {
    API("API"),
    
    GUI("GUI");

    private String value;

    CreatedFromEnum(String value) {
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
    public static CreatedFromEnum fromValue(String value) {
      for (CreatedFromEnum b : CreatedFromEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CREATED_FROM = "createdFrom";
  private CreatedFromEnum createdFrom;

  public static final String JSON_PROPERTY_SCRIPT = "script";
  private Object script;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private Set<String> locations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ANOMALY_DETECTION = "anomalyDetection";
  private AnomalyDetection anomalyDetection;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Set<TagWithSourceInfo> tags = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_MANAGEMENT_ZONES = "managementZones";
  private Set<ManagementZone> managementZones = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_AUTOMATICALLY_ASSIGNED_APPS = "automaticallyAssignedApps";
  private Set<String> automaticallyAssignedApps = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_MANUALLY_ASSIGNED_APPS = "manuallyAssignedApps";
  private Set<String> manuallyAssignedApps = new LinkedHashSet<>();

  public SyntheticMonitor() { 
  }

  public SyntheticMonitor entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The entity ID of the monitor.
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The entity ID of the monitor.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SyntheticMonitor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the monitor.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the monitor.")
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


  public SyntheticMonitor frequencyMin(Integer frequencyMin) {
    this.frequencyMin = frequencyMin;
    return this;
  }

   /**
   * The frequency of the monitor, in minutes.    You can use one of the following values: &#x60;5&#x60;, &#x60;10&#x60;, &#x60;15&#x60;, &#x60;30&#x60;, and &#x60;60&#x60;.
   * @return frequencyMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The frequency of the monitor, in minutes.    You can use one of the following values: `5`, `10`, `15`, `30`, and `60`.")
  @JsonProperty(JSON_PROPERTY_FREQUENCY_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFrequencyMin() {
    return frequencyMin;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY_MIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequencyMin(Integer frequencyMin) {
    this.frequencyMin = frequencyMin;
  }


  public SyntheticMonitor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The monitor is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The monitor is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SyntheticMonitor type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;BROWSER&#x60; -&gt; BrowserSyntheticMonitor  * &#x60;HTTP&#x60; -&gt; HttpSyntheticMonitor  
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `BROWSER` -> BrowserSyntheticMonitor  * `HTTP` -> HttpSyntheticMonitor  ")
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


  public SyntheticMonitor createdFrom(CreatedFromEnum createdFrom) {
    this.createdFrom = createdFrom;
    return this;
  }

   /**
   * The origin of a monitor
   * @return createdFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The origin of a monitor")
  @JsonProperty(JSON_PROPERTY_CREATED_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreatedFromEnum getCreatedFrom() {
    return createdFrom;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedFrom(CreatedFromEnum createdFrom) {
    this.createdFrom = createdFrom;
  }


  public SyntheticMonitor script(Object script) {
    this.script = script;
    return this;
  }

   /**
   * The script of a [browser](https://dt-url.net/9c103rda) or HTTP monitor.
   * @return script
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script of a [browser](https://dt-url.net/9c103rda) or HTTP monitor.")
  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getScript() {
    return script;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScript(Object script) {
    this.script = script;
  }


  public SyntheticMonitor locations(Set<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticMonitor addLocationsItem(String locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * A list of locations from which the monitor is executed.    To specify a location, use its entity ID.
   * @return locations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of locations from which the monitor is executed.    To specify a location, use its entity ID.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getLocations() {
    return locations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(Set<String> locations) {
    this.locations = locations;
  }


  public SyntheticMonitor anomalyDetection(AnomalyDetection anomalyDetection) {
    this.anomalyDetection = anomalyDetection;
    return this;
  }

   /**
   * Get anomalyDetection
   * @return anomalyDetection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANOMALY_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnomalyDetection getAnomalyDetection() {
    return anomalyDetection;
  }


  @JsonProperty(JSON_PROPERTY_ANOMALY_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnomalyDetection(AnomalyDetection anomalyDetection) {
    this.anomalyDetection = anomalyDetection;
  }


  public SyntheticMonitor tags(Set<TagWithSourceInfo> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticMonitor addTagsItem(TagWithSourceInfo tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tags assigned to the monitor.
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A set of tags assigned to the monitor.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<TagWithSourceInfo> getTags() {
    return tags;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(Set<TagWithSourceInfo> tags) {
    this.tags = tags;
  }


  public SyntheticMonitor managementZones(Set<ManagementZone> managementZones) {
    this.managementZones = managementZones;
    return this;
  }

  public SyntheticMonitor addManagementZonesItem(ManagementZone managementZonesItem) {
    this.managementZones.add(managementZonesItem);
    return this;
  }

   /**
   * A set of management zones to which the monitor belongs to.
   * @return managementZones
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A set of management zones to which the monitor belongs to.")
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<ManagementZone> getManagementZones() {
    return managementZones;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManagementZones(Set<ManagementZone> managementZones) {
    this.managementZones = managementZones;
  }


  public SyntheticMonitor automaticallyAssignedApps(Set<String> automaticallyAssignedApps) {
    this.automaticallyAssignedApps = automaticallyAssignedApps;
    return this;
  }

  public SyntheticMonitor addAutomaticallyAssignedAppsItem(String automaticallyAssignedAppsItem) {
    this.automaticallyAssignedApps.add(automaticallyAssignedAppsItem);
    return this;
  }

   /**
   * A set of automatically assigned applications.
   * @return automaticallyAssignedApps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A set of automatically assigned applications.")
  @JsonProperty(JSON_PROPERTY_AUTOMATICALLY_ASSIGNED_APPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getAutomaticallyAssignedApps() {
    return automaticallyAssignedApps;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AUTOMATICALLY_ASSIGNED_APPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutomaticallyAssignedApps(Set<String> automaticallyAssignedApps) {
    this.automaticallyAssignedApps = automaticallyAssignedApps;
  }


  public SyntheticMonitor manuallyAssignedApps(Set<String> manuallyAssignedApps) {
    this.manuallyAssignedApps = manuallyAssignedApps;
    return this;
  }

  public SyntheticMonitor addManuallyAssignedAppsItem(String manuallyAssignedAppsItem) {
    this.manuallyAssignedApps.add(manuallyAssignedAppsItem);
    return this;
  }

   /**
   * A set of manually assigned applications.
   * @return manuallyAssignedApps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A set of manually assigned applications.")
  @JsonProperty(JSON_PROPERTY_MANUALLY_ASSIGNED_APPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getManuallyAssignedApps() {
    return manuallyAssignedApps;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MANUALLY_ASSIGNED_APPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManuallyAssignedApps(Set<String> manuallyAssignedApps) {
    this.manuallyAssignedApps = manuallyAssignedApps;
  }


  /**
   * Return true if this SyntheticMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticMonitor syntheticMonitor = (SyntheticMonitor) o;
    return Objects.equals(this.entityId, syntheticMonitor.entityId) &&
        Objects.equals(this.name, syntheticMonitor.name) &&
        Objects.equals(this.frequencyMin, syntheticMonitor.frequencyMin) &&
        Objects.equals(this.enabled, syntheticMonitor.enabled) &&
        Objects.equals(this.type, syntheticMonitor.type) &&
        Objects.equals(this.createdFrom, syntheticMonitor.createdFrom) &&
        Objects.equals(this.script, syntheticMonitor.script) &&
        Objects.equals(this.locations, syntheticMonitor.locations) &&
        Objects.equals(this.anomalyDetection, syntheticMonitor.anomalyDetection) &&
        Objects.equals(this.tags, syntheticMonitor.tags) &&
        Objects.equals(this.managementZones, syntheticMonitor.managementZones) &&
        Objects.equals(this.automaticallyAssignedApps, syntheticMonitor.automaticallyAssignedApps) &&
        Objects.equals(this.manuallyAssignedApps, syntheticMonitor.manuallyAssignedApps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name, frequencyMin, enabled, type, createdFrom, script, locations, anomalyDetection, tags, managementZones, automaticallyAssignedApps, manuallyAssignedApps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticMonitor {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    frequencyMin: ").append(toIndentedString(frequencyMin)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdFrom: ").append(toIndentedString(createdFrom)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    anomalyDetection: ").append(toIndentedString(anomalyDetection)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    managementZones: ").append(toIndentedString(managementZones)).append("\n");
    sb.append("    automaticallyAssignedApps: ").append(toIndentedString(automaticallyAssignedApps)).append("\n");
    sb.append("    manuallyAssignedApps: ").append(toIndentedString(manuallyAssignedApps)).append("\n");
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
  mappings.put("BrowserSyntheticMonitor", BrowserSyntheticMonitor.class);
  mappings.put("HttpSyntheticMonitor", HttpSyntheticMonitor.class);
  mappings.put("SyntheticMonitor", SyntheticMonitor.class);
  JSON.registerDiscriminator(SyntheticMonitor.class, "type", mappings);
}
}
