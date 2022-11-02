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
import com.dynatrace.apis.envv1.model.AgentVersion;
import com.dynatrace.apis.envv1.model.EntityShortRepresentation;
import com.dynatrace.apis.envv1.model.MonitoringState;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceFromRelationships;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceModule;
import com.dynatrace.apis.envv1.model.ProcessGroupInstanceToRelationships;
import com.dynatrace.apis.envv1.model.ProcessGroupMetadata;
import com.dynatrace.apis.envv1.model.TagInfo;
import com.dynatrace.apis.envv1.model.TechnologyInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Parameters of a process.
 */
@ApiModel(description = "Parameters of a process.")
@JsonPropertyOrder({
  ProcessGroupInstance.JSON_PROPERTY_ENTITY_ID,
  ProcessGroupInstance.JSON_PROPERTY_DISPLAY_NAME,
  ProcessGroupInstance.JSON_PROPERTY_CUSTOMIZED_NAME,
  ProcessGroupInstance.JSON_PROPERTY_DISCOVERED_NAME,
  ProcessGroupInstance.JSON_PROPERTY_FIRST_SEEN_TIMESTAMP,
  ProcessGroupInstance.JSON_PROPERTY_LAST_SEEN_TIMESTAMP,
  ProcessGroupInstance.JSON_PROPERTY_TAGS,
  ProcessGroupInstance.JSON_PROPERTY_FROM_RELATIONSHIPS,
  ProcessGroupInstance.JSON_PROPERTY_TO_RELATIONSHIPS,
  ProcessGroupInstance.JSON_PROPERTY_METADATA,
  ProcessGroupInstance.JSON_PROPERTY_MONITORING_STATE,
  ProcessGroupInstance.JSON_PROPERTY_LISTEN_PORTS,
  ProcessGroupInstance.JSON_PROPERTY_AGENT_VERSIONS,
  ProcessGroupInstance.JSON_PROPERTY_AZURE_HOST_NAME,
  ProcessGroupInstance.JSON_PROPERTY_AZURE_SITE_NAME,
  ProcessGroupInstance.JSON_PROPERTY_VERSIONED_MODULES,
  ProcessGroupInstance.JSON_PROPERTY_BITNESS,
  ProcessGroupInstance.JSON_PROPERTY_MODULES,
  ProcessGroupInstance.JSON_PROPERTY_SOFTWARE_TECHNOLOGIES,
  ProcessGroupInstance.JSON_PROPERTY_MANAGEMENT_ZONES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ProcessGroupInstance {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_CUSTOMIZED_NAME = "customizedName";
  private String customizedName;

  public static final String JSON_PROPERTY_DISCOVERED_NAME = "discoveredName";
  private String discoveredName;

  public static final String JSON_PROPERTY_FIRST_SEEN_TIMESTAMP = "firstSeenTimestamp";
  private Long firstSeenTimestamp;

  public static final String JSON_PROPERTY_LAST_SEEN_TIMESTAMP = "lastSeenTimestamp";
  private Long lastSeenTimestamp;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Set<TagInfo> tags = null;

  public static final String JSON_PROPERTY_FROM_RELATIONSHIPS = "fromRelationships";
  private ProcessGroupInstanceFromRelationships fromRelationships;

  public static final String JSON_PROPERTY_TO_RELATIONSHIPS = "toRelationships";
  private ProcessGroupInstanceToRelationships toRelationships;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ProcessGroupMetadata metadata;

  public static final String JSON_PROPERTY_MONITORING_STATE = "monitoringState";
  private MonitoringState monitoringState;

  public static final String JSON_PROPERTY_LISTEN_PORTS = "listenPorts";
  private List<Integer> listenPorts = null;

  public static final String JSON_PROPERTY_AGENT_VERSIONS = "agentVersions";
  private List<AgentVersion> agentVersions = null;

  public static final String JSON_PROPERTY_AZURE_HOST_NAME = "azureHostName";
  private String azureHostName;

  public static final String JSON_PROPERTY_AZURE_SITE_NAME = "azureSiteName";
  private String azureSiteName;

  public static final String JSON_PROPERTY_VERSIONED_MODULES = "versionedModules";
  private List<ProcessGroupInstanceModule> versionedModules = null;

  /**
   * Gets or Sets bitness
   */
  public enum BitnessEnum {
    _32BIT("32bit"),
    
    _64BIT("64bit");

    private String value;

    BitnessEnum(String value) {
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
    public static BitnessEnum fromValue(String value) {
      for (BitnessEnum b : BitnessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BITNESS = "bitness";
  private BitnessEnum bitness;

  public static final String JSON_PROPERTY_MODULES = "modules";
  private List<String> modules = null;

  public static final String JSON_PROPERTY_SOFTWARE_TECHNOLOGIES = "softwareTechnologies";
  private List<TechnologyInfo> softwareTechnologies = null;

  public static final String JSON_PROPERTY_MANAGEMENT_ZONES = "managementZones";
  private List<EntityShortRepresentation> managementZones = null;

  public ProcessGroupInstance() { 
  }

  public ProcessGroupInstance entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The Dynatrace entity ID of the required entity.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Dynatrace entity ID of the required entity.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public ProcessGroupInstance displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the Dynatrace entity as displayed in the UI.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Dynatrace entity as displayed in the UI.")
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


  public ProcessGroupInstance customizedName(String customizedName) {
    this.customizedName = customizedName;
    return this;
  }

   /**
   * The customized name of the entity
   * @return customizedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customized name of the entity")
  @JsonProperty(JSON_PROPERTY_CUSTOMIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomizedName() {
    return customizedName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomizedName(String customizedName) {
    this.customizedName = customizedName;
  }


  public ProcessGroupInstance discoveredName(String discoveredName) {
    this.discoveredName = discoveredName;
    return this;
  }

   /**
   * The discovered name of the entity
   * @return discoveredName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The discovered name of the entity")
  @JsonProperty(JSON_PROPERTY_DISCOVERED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscoveredName() {
    return discoveredName;
  }


  @JsonProperty(JSON_PROPERTY_DISCOVERED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscoveredName(String discoveredName) {
    this.discoveredName = discoveredName;
  }


  public ProcessGroupInstance firstSeenTimestamp(Long firstSeenTimestamp) {
    this.firstSeenTimestamp = firstSeenTimestamp;
    return this;
  }

   /**
   * The timestamp of when the entity was first detected, in UTC milliseconds
   * @return firstSeenTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of when the entity was first detected, in UTC milliseconds")
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFirstSeenTimestamp() {
    return firstSeenTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstSeenTimestamp(Long firstSeenTimestamp) {
    this.firstSeenTimestamp = firstSeenTimestamp;
  }


  public ProcessGroupInstance lastSeenTimestamp(Long lastSeenTimestamp) {
    this.lastSeenTimestamp = lastSeenTimestamp;
    return this;
  }

   /**
   * The timestamp of when the entity was last detected, in UTC milliseconds
   * @return lastSeenTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of when the entity was last detected, in UTC milliseconds")
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastSeenTimestamp() {
    return lastSeenTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SEEN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSeenTimestamp(Long lastSeenTimestamp) {
    this.lastSeenTimestamp = lastSeenTimestamp;
  }


  public ProcessGroupInstance tags(Set<TagInfo> tags) {
    this.tags = tags;
    return this;
  }

  public ProcessGroupInstance addTagsItem(TagInfo tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The list of entity tags.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of entity tags.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TagInfo> getTags() {
    return tags;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Set<TagInfo> tags) {
    this.tags = tags;
  }


  public ProcessGroupInstance fromRelationships(ProcessGroupInstanceFromRelationships fromRelationships) {
    this.fromRelationships = fromRelationships;
    return this;
  }

   /**
   * Get fromRelationships
   * @return fromRelationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessGroupInstanceFromRelationships getFromRelationships() {
    return fromRelationships;
  }


  @JsonProperty(JSON_PROPERTY_FROM_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromRelationships(ProcessGroupInstanceFromRelationships fromRelationships) {
    this.fromRelationships = fromRelationships;
  }


  public ProcessGroupInstance toRelationships(ProcessGroupInstanceToRelationships toRelationships) {
    this.toRelationships = toRelationships;
    return this;
  }

   /**
   * Get toRelationships
   * @return toRelationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessGroupInstanceToRelationships getToRelationships() {
    return toRelationships;
  }


  @JsonProperty(JSON_PROPERTY_TO_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToRelationships(ProcessGroupInstanceToRelationships toRelationships) {
    this.toRelationships = toRelationships;
  }


  public ProcessGroupInstance metadata(ProcessGroupMetadata metadata) {
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

  public ProcessGroupMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ProcessGroupMetadata metadata) {
    this.metadata = metadata;
  }


  public ProcessGroupInstance monitoringState(MonitoringState monitoringState) {
    this.monitoringState = monitoringState;
    return this;
  }

   /**
   * Get monitoringState
   * @return monitoringState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITORING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitoringState getMonitoringState() {
    return monitoringState;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoringState(MonitoringState monitoringState) {
    this.monitoringState = monitoringState;
  }


  public ProcessGroupInstance listenPorts(List<Integer> listenPorts) {
    this.listenPorts = listenPorts;
    return this;
  }

  public ProcessGroupInstance addListenPortsItem(Integer listenPortsItem) {
    if (this.listenPorts == null) {
      this.listenPorts = new ArrayList<>();
    }
    this.listenPorts.add(listenPortsItem);
    return this;
  }

   /**
   * Get listenPorts
   * @return listenPorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LISTEN_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getListenPorts() {
    return listenPorts;
  }


  @JsonProperty(JSON_PROPERTY_LISTEN_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListenPorts(List<Integer> listenPorts) {
    this.listenPorts = listenPorts;
  }


  public ProcessGroupInstance agentVersions(List<AgentVersion> agentVersions) {
    this.agentVersions = agentVersions;
    return this;
  }

  public ProcessGroupInstance addAgentVersionsItem(AgentVersion agentVersionsItem) {
    if (this.agentVersions == null) {
      this.agentVersions = new ArrayList<>();
    }
    this.agentVersions.add(agentVersionsItem);
    return this;
  }

   /**
   * Versions of OneAgents currently running on the entity.
   * @return agentVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Versions of OneAgents currently running on the entity.")
  @JsonProperty(JSON_PROPERTY_AGENT_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentVersion> getAgentVersions() {
    return agentVersions;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentVersions(List<AgentVersion> agentVersions) {
    this.agentVersions = agentVersions;
  }


  public ProcessGroupInstance azureHostName(String azureHostName) {
    this.azureHostName = azureHostName;
    return this;
  }

   /**
   * Get azureHostName
   * @return azureHostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE_HOST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAzureHostName() {
    return azureHostName;
  }


  @JsonProperty(JSON_PROPERTY_AZURE_HOST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzureHostName(String azureHostName) {
    this.azureHostName = azureHostName;
  }


  public ProcessGroupInstance azureSiteName(String azureSiteName) {
    this.azureSiteName = azureSiteName;
    return this;
  }

   /**
   * Get azureSiteName
   * @return azureSiteName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE_SITE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAzureSiteName() {
    return azureSiteName;
  }


  @JsonProperty(JSON_PROPERTY_AZURE_SITE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzureSiteName(String azureSiteName) {
    this.azureSiteName = azureSiteName;
  }


  public ProcessGroupInstance versionedModules(List<ProcessGroupInstanceModule> versionedModules) {
    this.versionedModules = versionedModules;
    return this;
  }

  public ProcessGroupInstance addVersionedModulesItem(ProcessGroupInstanceModule versionedModulesItem) {
    if (this.versionedModules == null) {
      this.versionedModules = new ArrayList<>();
    }
    this.versionedModules.add(versionedModulesItem);
    return this;
  }

   /**
   * Get versionedModules
   * @return versionedModules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSIONED_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProcessGroupInstanceModule> getVersionedModules() {
    return versionedModules;
  }


  @JsonProperty(JSON_PROPERTY_VERSIONED_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionedModules(List<ProcessGroupInstanceModule> versionedModules) {
    this.versionedModules = versionedModules;
  }


  public ProcessGroupInstance bitness(BitnessEnum bitness) {
    this.bitness = bitness;
    return this;
  }

   /**
   * Get bitness
   * @return bitness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BITNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BitnessEnum getBitness() {
    return bitness;
  }


  @JsonProperty(JSON_PROPERTY_BITNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBitness(BitnessEnum bitness) {
    this.bitness = bitness;
  }


  public ProcessGroupInstance modules(List<String> modules) {
    this.modules = modules;
    return this;
  }

  public ProcessGroupInstance addModulesItem(String modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * Get modules
   * @return modules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getModules() {
    return modules;
  }


  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModules(List<String> modules) {
    this.modules = modules;
  }


  public ProcessGroupInstance softwareTechnologies(List<TechnologyInfo> softwareTechnologies) {
    this.softwareTechnologies = softwareTechnologies;
    return this;
  }

  public ProcessGroupInstance addSoftwareTechnologiesItem(TechnologyInfo softwareTechnologiesItem) {
    if (this.softwareTechnologies == null) {
      this.softwareTechnologies = new ArrayList<>();
    }
    this.softwareTechnologies.add(softwareTechnologiesItem);
    return this;
  }

   /**
   * Get softwareTechnologies
   * @return softwareTechnologies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_TECHNOLOGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TechnologyInfo> getSoftwareTechnologies() {
    return softwareTechnologies;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_TECHNOLOGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareTechnologies(List<TechnologyInfo> softwareTechnologies) {
    this.softwareTechnologies = softwareTechnologies;
  }


  public ProcessGroupInstance managementZones(List<EntityShortRepresentation> managementZones) {
    this.managementZones = managementZones;
    return this;
  }

  public ProcessGroupInstance addManagementZonesItem(EntityShortRepresentation managementZonesItem) {
    if (this.managementZones == null) {
      this.managementZones = new ArrayList<>();
    }
    this.managementZones.add(managementZonesItem);
    return this;
  }

   /**
   * The management zones that the entity is part of.
   * @return managementZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The management zones that the entity is part of.")
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EntityShortRepresentation> getManagementZones() {
    return managementZones;
  }


  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagementZones(List<EntityShortRepresentation> managementZones) {
    this.managementZones = managementZones;
  }


  /**
   * Return true if this ProcessGroupInstance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupInstance processGroupInstance = (ProcessGroupInstance) o;
    return Objects.equals(this.entityId, processGroupInstance.entityId) &&
        Objects.equals(this.displayName, processGroupInstance.displayName) &&
        Objects.equals(this.customizedName, processGroupInstance.customizedName) &&
        Objects.equals(this.discoveredName, processGroupInstance.discoveredName) &&
        Objects.equals(this.firstSeenTimestamp, processGroupInstance.firstSeenTimestamp) &&
        Objects.equals(this.lastSeenTimestamp, processGroupInstance.lastSeenTimestamp) &&
        Objects.equals(this.tags, processGroupInstance.tags) &&
        Objects.equals(this.fromRelationships, processGroupInstance.fromRelationships) &&
        Objects.equals(this.toRelationships, processGroupInstance.toRelationships) &&
        Objects.equals(this.metadata, processGroupInstance.metadata) &&
        Objects.equals(this.monitoringState, processGroupInstance.monitoringState) &&
        Objects.equals(this.listenPorts, processGroupInstance.listenPorts) &&
        Objects.equals(this.agentVersions, processGroupInstance.agentVersions) &&
        Objects.equals(this.azureHostName, processGroupInstance.azureHostName) &&
        Objects.equals(this.azureSiteName, processGroupInstance.azureSiteName) &&
        Objects.equals(this.versionedModules, processGroupInstance.versionedModules) &&
        Objects.equals(this.bitness, processGroupInstance.bitness) &&
        Objects.equals(this.modules, processGroupInstance.modules) &&
        Objects.equals(this.softwareTechnologies, processGroupInstance.softwareTechnologies) &&
        Objects.equals(this.managementZones, processGroupInstance.managementZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, displayName, customizedName, discoveredName, firstSeenTimestamp, lastSeenTimestamp, tags, fromRelationships, toRelationships, metadata, monitoringState, listenPorts, agentVersions, azureHostName, azureSiteName, versionedModules, bitness, modules, softwareTechnologies, managementZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupInstance {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    customizedName: ").append(toIndentedString(customizedName)).append("\n");
    sb.append("    discoveredName: ").append(toIndentedString(discoveredName)).append("\n");
    sb.append("    firstSeenTimestamp: ").append(toIndentedString(firstSeenTimestamp)).append("\n");
    sb.append("    lastSeenTimestamp: ").append(toIndentedString(lastSeenTimestamp)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fromRelationships: ").append(toIndentedString(fromRelationships)).append("\n");
    sb.append("    toRelationships: ").append(toIndentedString(toRelationships)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monitoringState: ").append(toIndentedString(monitoringState)).append("\n");
    sb.append("    listenPorts: ").append(toIndentedString(listenPorts)).append("\n");
    sb.append("    agentVersions: ").append(toIndentedString(agentVersions)).append("\n");
    sb.append("    azureHostName: ").append(toIndentedString(azureHostName)).append("\n");
    sb.append("    azureSiteName: ").append(toIndentedString(azureSiteName)).append("\n");
    sb.append("    versionedModules: ").append(toIndentedString(versionedModules)).append("\n");
    sb.append("    bitness: ").append(toIndentedString(bitness)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    softwareTechnologies: ").append(toIndentedString(softwareTechnologies)).append("\n");
    sb.append("    managementZones: ").append(toIndentedString(managementZones)).append("\n");
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

