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
import com.dynatrace.apis.envv1.model.Host;
import com.dynatrace.apis.envv1.model.ModuleInfo;
import com.dynatrace.apis.envv1.model.PluginInfo;
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
 * OneAgent deployment on a host.
 */
@ApiModel(description = "OneAgent deployment on a host.")
@JsonPropertyOrder({
  HostAgentInfo.JSON_PROPERTY_HOST_INFO,
  HostAgentInfo.JSON_PROPERTY_FAULTY_VERSION,
  HostAgentInfo.JSON_PROPERTY_ACTIVE,
  HostAgentInfo.JSON_PROPERTY_CONFIGURED_MONITORING_MODE,
  HostAgentInfo.JSON_PROPERTY_MONITORING_TYPE,
  HostAgentInfo.JSON_PROPERTY_AUTO_UPDATE_SETTING,
  HostAgentInfo.JSON_PROPERTY_UPDATE_STATUS,
  HostAgentInfo.JSON_PROPERTY_AVAILABLE_VERSIONS,
  HostAgentInfo.JSON_PROPERTY_CONFIGURED_MONITORING_ENABLED,
  HostAgentInfo.JSON_PROPERTY_AVAILABILITY_STATE,
  HostAgentInfo.JSON_PROPERTY_DETAILED_AVAILABILITY_STATE,
  HostAgentInfo.JSON_PROPERTY_CURRENT_ACTIVE_GATE_ID,
  HostAgentInfo.JSON_PROPERTY_CURRENT_ACTIVE_GATE_IDS,
  HostAgentInfo.JSON_PROPERTY_CURRENT_NETWORK_ZONE_ID,
  HostAgentInfo.JSON_PROPERTY_MODULES,
  HostAgentInfo.JSON_PROPERTY_PLUGINS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class HostAgentInfo {
  public static final String JSON_PROPERTY_HOST_INFO = "hostInfo";
  private Host hostInfo;

  public static final String JSON_PROPERTY_FAULTY_VERSION = "faultyVersion";
  private Boolean faultyVersion;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  /**
   * Configured monitoring mode of OneAgent.
   */
  public enum ConfiguredMonitoringModeEnum {
    CLOUD_INFRASTRUCTURE("CLOUD_INFRASTRUCTURE"),
    
    FULL_STACK("FULL_STACK");

    private String value;

    ConfiguredMonitoringModeEnum(String value) {
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
    public static ConfiguredMonitoringModeEnum fromValue(String value) {
      for (ConfiguredMonitoringModeEnum b : ConfiguredMonitoringModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONFIGURED_MONITORING_MODE = "configuredMonitoringMode";
  private ConfiguredMonitoringModeEnum configuredMonitoringMode;

  /**
   * The monitoring mode of OneAgent.
   */
  public enum MonitoringTypeEnum {
    CLOUD_INFRASTRUCTURE("CLOUD_INFRASTRUCTURE"),
    
    FULL_STACK("FULL_STACK"),
    
    STANDALONE("STANDALONE");

    private String value;

    MonitoringTypeEnum(String value) {
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
    public static MonitoringTypeEnum fromValue(String value) {
      for (MonitoringTypeEnum b : MonitoringTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MONITORING_TYPE = "monitoringType";
  private MonitoringTypeEnum monitoringType;

  /**
   * The effective auto-update setting of OneAgent. For host with inherited configuration it is calculated from its parent&#39;s configuration
   */
  public enum AutoUpdateSettingEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    AutoUpdateSettingEnum(String value) {
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
    public static AutoUpdateSettingEnum fromValue(String value) {
      for (AutoUpdateSettingEnum b : AutoUpdateSettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTO_UPDATE_SETTING = "autoUpdateSetting";
  private AutoUpdateSettingEnum autoUpdateSetting;

  /**
   * The current update status of OneAgent.
   */
  public enum UpdateStatusEnum {
    INCOMPATIBLE("INCOMPATIBLE"),
    
    OUTDATED("OUTDATED"),
    
    SCHEDULED("SCHEDULED"),
    
    SUPPRESSED("SUPPRESSED"),
    
    UNKNOWN("UNKNOWN"),
    
    UP2DATE("UP2DATE"),
    
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    
    UPDATE_PENDING("UPDATE_PENDING"),
    
    UPDATE_PROBLEM("UPDATE_PROBLEM");

    private String value;

    UpdateStatusEnum(String value) {
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
    public static UpdateStatusEnum fromValue(String value) {
      for (UpdateStatusEnum b : UpdateStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UPDATE_STATUS = "updateStatus";
  private UpdateStatusEnum updateStatus;

  public static final String JSON_PROPERTY_AVAILABLE_VERSIONS = "availableVersions";
  private Set<String> availableVersions = null;

  public static final String JSON_PROPERTY_CONFIGURED_MONITORING_ENABLED = "configuredMonitoringEnabled";
  private Boolean configuredMonitoringEnabled;

  /**
   * The availability state of OneAgent.
   */
  public enum AvailabilityStateEnum {
    CRASHED("CRASHED"),
    
    LOST("LOST"),
    
    MONITORED("MONITORED"),
    
    PRE_MONITORED("PRE_MONITORED"),
    
    SHUTDOWN("SHUTDOWN"),
    
    UNEXPECTED_SHUTDOWN("UNEXPECTED_SHUTDOWN"),
    
    UNKNOWN("UNKNOWN"),
    
    UNMONITORED("UNMONITORED");

    private String value;

    AvailabilityStateEnum(String value) {
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
    public static AvailabilityStateEnum fromValue(String value) {
      for (AvailabilityStateEnum b : AvailabilityStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AVAILABILITY_STATE = "availabilityState";
  private AvailabilityStateEnum availabilityState;

  /**
   * The detailed availability state of OneAgent.
   */
  public enum DetailedAvailabilityStateEnum {
    CRASHED_FAILURE("CRASHED_FAILURE"),
    
    CRASHED_UNKNOWN("CRASHED_UNKNOWN"),
    
    LOST_AGENT_UPGRADE_FAILED("LOST_AGENT_UPGRADE_FAILED"),
    
    LOST_CONNECTION("LOST_CONNECTION"),
    
    LOST_UNKNOWN("LOST_UNKNOWN"),
    
    MONITORED("MONITORED"),
    
    MONITORED_AGENT_ENABLED("MONITORED_AGENT_ENABLED"),
    
    MONITORED_AGENT_REGISTERED("MONITORED_AGENT_REGISTERED"),
    
    MONITORED_AGENT_UPGRADE_STARTED("MONITORED_AGENT_UPGRADE_STARTED"),
    
    MONITORED_AGENT_VERSION_ACCEPTED("MONITORED_AGENT_VERSION_ACCEPTED"),
    
    MONITORED_ENABLED("MONITORED_ENABLED"),
    
    PRE_MONITORED("PRE_MONITORED"),
    
    SHUTDOWN_AGENT_LOST("SHUTDOWN_AGENT_LOST"),
    
    SHUTDOWN_GRACEFUL("SHUTDOWN_GRACEFUL"),
    
    SHUTDOWN_SPOT_INSTANCE("SHUTDOWN_SPOT_INSTANCE"),
    
    SHUTDOWN_STOPPED("SHUTDOWN_STOPPED"),
    
    SHUTDOWN_UNKNOWN("SHUTDOWN_UNKNOWN"),
    
    SHUTDOWN_UNKNOWN_UNEXPECTED("SHUTDOWN_UNKNOWN_UNEXPECTED"),
    
    UNKNOWN("UNKNOWN"),
    
    UNMONITORED_AGENT_DISABLED("UNMONITORED_AGENT_DISABLED"),
    
    UNMONITORED_AGENT_LOST("UNMONITORED_AGENT_LOST"),
    
    UNMONITORED_AGENT_RESTART_TRIGGERED("UNMONITORED_AGENT_RESTART_TRIGGERED"),
    
    UNMONITORED_AGENT_STOPPED("UNMONITORED_AGENT_STOPPED"),
    
    UNMONITORED_AGENT_UNINSTALLED("UNMONITORED_AGENT_UNINSTALLED"),
    
    UNMONITORED_AGENT_UNREGISTERED("UNMONITORED_AGENT_UNREGISTERED"),
    
    UNMONITORED_AGENT_UPGRADE_FAILED("UNMONITORED_AGENT_UPGRADE_FAILED"),
    
    UNMONITORED_AGENT_VERSION_REJECTED("UNMONITORED_AGENT_VERSION_REJECTED"),
    
    UNMONITORED_DISABLED("UNMONITORED_DISABLED"),
    
    UNMONITORED_ID_CHANGED("UNMONITORED_ID_CHANGED"),
    
    UNMONITORED_TERMINATED("UNMONITORED_TERMINATED"),
    
    UNMONITORED_UNKNOWN("UNMONITORED_UNKNOWN");

    private String value;

    DetailedAvailabilityStateEnum(String value) {
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
    public static DetailedAvailabilityStateEnum fromValue(String value) {
      for (DetailedAvailabilityStateEnum b : DetailedAvailabilityStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DETAILED_AVAILABILITY_STATE = "detailedAvailabilityState";
  private DetailedAvailabilityStateEnum detailedAvailabilityState;

  public static final String JSON_PROPERTY_CURRENT_ACTIVE_GATE_ID = "currentActiveGateId";
  private Integer currentActiveGateId;

  public static final String JSON_PROPERTY_CURRENT_ACTIVE_GATE_IDS = "currentActiveGateIds";
  private List<String> currentActiveGateIds = null;

  public static final String JSON_PROPERTY_CURRENT_NETWORK_ZONE_ID = "currentNetworkZoneId";
  private String currentNetworkZoneId;

  public static final String JSON_PROPERTY_MODULES = "modules";
  private List<ModuleInfo> modules = null;

  public static final String JSON_PROPERTY_PLUGINS = "plugins";
  private List<PluginInfo> plugins = null;

  public HostAgentInfo() { 
  }

  public HostAgentInfo hostInfo(Host hostInfo) {
    this.hostInfo = hostInfo;
    return this;
  }

   /**
   * Get hostInfo
   * @return hostInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Host getHostInfo() {
    return hostInfo;
  }


  @JsonProperty(JSON_PROPERTY_HOST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostInfo(Host hostInfo) {
    this.hostInfo = hostInfo;
  }


  public HostAgentInfo faultyVersion(Boolean faultyVersion) {
    this.faultyVersion = faultyVersion;
    return this;
  }

   /**
   * OneAgent version is faulty (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return faultyVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OneAgent version is faulty (`true`) or not (`false`).")
  @JsonProperty(JSON_PROPERTY_FAULTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFaultyVersion() {
    return faultyVersion;
  }


  @JsonProperty(JSON_PROPERTY_FAULTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaultyVersion(Boolean faultyVersion) {
    this.faultyVersion = faultyVersion;
  }


  public HostAgentInfo active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * OneAgent is active (&#x60;true&#x60;) or inactive (&#x60;false&#x60;).
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OneAgent is active (`true`) or inactive (`false`).")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public HostAgentInfo configuredMonitoringMode(ConfiguredMonitoringModeEnum configuredMonitoringMode) {
    this.configuredMonitoringMode = configuredMonitoringMode;
    return this;
  }

   /**
   * Configured monitoring mode of OneAgent.
   * @return configuredMonitoringMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configured monitoring mode of OneAgent.")
  @JsonProperty(JSON_PROPERTY_CONFIGURED_MONITORING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfiguredMonitoringModeEnum getConfiguredMonitoringMode() {
    return configuredMonitoringMode;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURED_MONITORING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguredMonitoringMode(ConfiguredMonitoringModeEnum configuredMonitoringMode) {
    this.configuredMonitoringMode = configuredMonitoringMode;
  }


  public HostAgentInfo monitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
    return this;
  }

   /**
   * The monitoring mode of OneAgent.
   * @return monitoringType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monitoring mode of OneAgent.")
  @JsonProperty(JSON_PROPERTY_MONITORING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitoringTypeEnum getMonitoringType() {
    return monitoringType;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoringType(MonitoringTypeEnum monitoringType) {
    this.monitoringType = monitoringType;
  }


  public HostAgentInfo autoUpdateSetting(AutoUpdateSettingEnum autoUpdateSetting) {
    this.autoUpdateSetting = autoUpdateSetting;
    return this;
  }

   /**
   * The effective auto-update setting of OneAgent. For host with inherited configuration it is calculated from its parent&#39;s configuration
   * @return autoUpdateSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The effective auto-update setting of OneAgent. For host with inherited configuration it is calculated from its parent's configuration")
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutoUpdateSettingEnum getAutoUpdateSetting() {
    return autoUpdateSetting;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUpdateSetting(AutoUpdateSettingEnum autoUpdateSetting) {
    this.autoUpdateSetting = autoUpdateSetting;
  }


  public HostAgentInfo updateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

   /**
   * The current update status of OneAgent.
   * @return updateStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current update status of OneAgent.")
  @JsonProperty(JSON_PROPERTY_UPDATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateStatusEnum getUpdateStatus() {
    return updateStatus;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
  }


  public HostAgentInfo availableVersions(Set<String> availableVersions) {
    this.availableVersions = availableVersions;
    return this;
  }

  public HostAgentInfo addAvailableVersionsItem(String availableVersionsItem) {
    if (this.availableVersions == null) {
      this.availableVersions = new LinkedHashSet<>();
    }
    this.availableVersions.add(availableVersionsItem);
    return this;
  }

   /**
   * A list of versions OneAgent can be updated to.
   * @return availableVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of versions OneAgent can be updated to.")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAvailableVersions() {
    return availableVersions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_AVAILABLE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableVersions(Set<String> availableVersions) {
    this.availableVersions = availableVersions;
  }


  public HostAgentInfo configuredMonitoringEnabled(Boolean configuredMonitoringEnabled) {
    this.configuredMonitoringEnabled = configuredMonitoringEnabled;
    return this;
  }

   /**
   * Monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) in the OneAgent configuration.
   * @return configuredMonitoringEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monitoring is enabled (`true`) or disabled (`false`) in the OneAgent configuration.")
  @JsonProperty(JSON_PROPERTY_CONFIGURED_MONITORING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConfiguredMonitoringEnabled() {
    return configuredMonitoringEnabled;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURED_MONITORING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguredMonitoringEnabled(Boolean configuredMonitoringEnabled) {
    this.configuredMonitoringEnabled = configuredMonitoringEnabled;
  }


  public HostAgentInfo availabilityState(AvailabilityStateEnum availabilityState) {
    this.availabilityState = availabilityState;
    return this;
  }

   /**
   * The availability state of OneAgent.
   * @return availabilityState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability state of OneAgent.")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvailabilityStateEnum getAvailabilityState() {
    return availabilityState;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityState(AvailabilityStateEnum availabilityState) {
    this.availabilityState = availabilityState;
  }


  public HostAgentInfo detailedAvailabilityState(DetailedAvailabilityStateEnum detailedAvailabilityState) {
    this.detailedAvailabilityState = detailedAvailabilityState;
    return this;
  }

   /**
   * The detailed availability state of OneAgent.
   * @return detailedAvailabilityState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detailed availability state of OneAgent.")
  @JsonProperty(JSON_PROPERTY_DETAILED_AVAILABILITY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DetailedAvailabilityStateEnum getDetailedAvailabilityState() {
    return detailedAvailabilityState;
  }


  @JsonProperty(JSON_PROPERTY_DETAILED_AVAILABILITY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailedAvailabilityState(DetailedAvailabilityStateEnum detailedAvailabilityState) {
    this.detailedAvailabilityState = detailedAvailabilityState;
  }


  public HostAgentInfo currentActiveGateId(Integer currentActiveGateId) {
    this.currentActiveGateId = currentActiveGateId;
    return this;
  }

   /**
   * This field is deprecated and provided for backward compatibility.   Use the **currentActiveGateIds** field instead.
   * @return currentActiveGateId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is deprecated and provided for backward compatibility.   Use the **currentActiveGateIds** field instead.")
  @JsonProperty(JSON_PROPERTY_CURRENT_ACTIVE_GATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentActiveGateId() {
    return currentActiveGateId;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ACTIVE_GATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentActiveGateId(Integer currentActiveGateId) {
    this.currentActiveGateId = currentActiveGateId;
  }


  public HostAgentInfo currentActiveGateIds(List<String> currentActiveGateIds) {
    this.currentActiveGateIds = currentActiveGateIds;
    return this;
  }

  public HostAgentInfo addCurrentActiveGateIdsItem(String currentActiveGateIdsItem) {
    if (this.currentActiveGateIds == null) {
      this.currentActiveGateIds = new ArrayList<>();
    }
    this.currentActiveGateIds.add(currentActiveGateIdsItem);
    return this;
  }

   /**
   * The list of ActiveGate IDs of ActiveGates to which OneAgent is currently connected.
   * @return currentActiveGateIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of ActiveGate IDs of ActiveGates to which OneAgent is currently connected.")
  @JsonProperty(JSON_PROPERTY_CURRENT_ACTIVE_GATE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCurrentActiveGateIds() {
    return currentActiveGateIds;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ACTIVE_GATE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentActiveGateIds(List<String> currentActiveGateIds) {
    this.currentActiveGateIds = currentActiveGateIds;
  }


  public HostAgentInfo currentNetworkZoneId(String currentNetworkZoneId) {
    this.currentNetworkZoneId = currentNetworkZoneId;
    return this;
  }

   /**
   * The ID of the network zone that OneAgent is using.
   * @return currentNetworkZoneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the network zone that OneAgent is using.")
  @JsonProperty(JSON_PROPERTY_CURRENT_NETWORK_ZONE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentNetworkZoneId() {
    return currentNetworkZoneId;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_NETWORK_ZONE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentNetworkZoneId(String currentNetworkZoneId) {
    this.currentNetworkZoneId = currentNetworkZoneId;
  }


  public HostAgentInfo modules(List<ModuleInfo> modules) {
    this.modules = modules;
    return this;
  }

  public HostAgentInfo addModulesItem(ModuleInfo modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * A list of code modules deployed on the host.
   * @return modules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of code modules deployed on the host.")
  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModuleInfo> getModules() {
    return modules;
  }


  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModules(List<ModuleInfo> modules) {
    this.modules = modules;
  }


  public HostAgentInfo plugins(List<PluginInfo> plugins) {
    this.plugins = plugins;
    return this;
  }

  public HostAgentInfo addPluginsItem(PluginInfo pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * A list of plugins deployed on the host.
   * @return plugins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of plugins deployed on the host.")
  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PluginInfo> getPlugins() {
    return plugins;
  }


  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlugins(List<PluginInfo> plugins) {
    this.plugins = plugins;
  }


  /**
   * Return true if this HostAgentInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostAgentInfo hostAgentInfo = (HostAgentInfo) o;
    return Objects.equals(this.hostInfo, hostAgentInfo.hostInfo) &&
        Objects.equals(this.faultyVersion, hostAgentInfo.faultyVersion) &&
        Objects.equals(this.active, hostAgentInfo.active) &&
        Objects.equals(this.configuredMonitoringMode, hostAgentInfo.configuredMonitoringMode) &&
        Objects.equals(this.monitoringType, hostAgentInfo.monitoringType) &&
        Objects.equals(this.autoUpdateSetting, hostAgentInfo.autoUpdateSetting) &&
        Objects.equals(this.updateStatus, hostAgentInfo.updateStatus) &&
        Objects.equals(this.availableVersions, hostAgentInfo.availableVersions) &&
        Objects.equals(this.configuredMonitoringEnabled, hostAgentInfo.configuredMonitoringEnabled) &&
        Objects.equals(this.availabilityState, hostAgentInfo.availabilityState) &&
        Objects.equals(this.detailedAvailabilityState, hostAgentInfo.detailedAvailabilityState) &&
        Objects.equals(this.currentActiveGateId, hostAgentInfo.currentActiveGateId) &&
        Objects.equals(this.currentActiveGateIds, hostAgentInfo.currentActiveGateIds) &&
        Objects.equals(this.currentNetworkZoneId, hostAgentInfo.currentNetworkZoneId) &&
        Objects.equals(this.modules, hostAgentInfo.modules) &&
        Objects.equals(this.plugins, hostAgentInfo.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostInfo, faultyVersion, active, configuredMonitoringMode, monitoringType, autoUpdateSetting, updateStatus, availableVersions, configuredMonitoringEnabled, availabilityState, detailedAvailabilityState, currentActiveGateId, currentActiveGateIds, currentNetworkZoneId, modules, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostAgentInfo {\n");
    sb.append("    hostInfo: ").append(toIndentedString(hostInfo)).append("\n");
    sb.append("    faultyVersion: ").append(toIndentedString(faultyVersion)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    configuredMonitoringMode: ").append(toIndentedString(configuredMonitoringMode)).append("\n");
    sb.append("    monitoringType: ").append(toIndentedString(monitoringType)).append("\n");
    sb.append("    autoUpdateSetting: ").append(toIndentedString(autoUpdateSetting)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    configuredMonitoringEnabled: ").append(toIndentedString(configuredMonitoringEnabled)).append("\n");
    sb.append("    availabilityState: ").append(toIndentedString(availabilityState)).append("\n");
    sb.append("    detailedAvailabilityState: ").append(toIndentedString(detailedAvailabilityState)).append("\n");
    sb.append("    currentActiveGateId: ").append(toIndentedString(currentActiveGateId)).append("\n");
    sb.append("    currentActiveGateIds: ").append(toIndentedString(currentActiveGateIds)).append("\n");
    sb.append("    currentNetworkZoneId: ").append(toIndentedString(currentNetworkZoneId)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

