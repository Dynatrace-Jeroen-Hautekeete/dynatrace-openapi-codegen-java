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
import com.dynatrace.apis.configv1.model.UpdateWindowsConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of OneAgent auto-update in a host group.   Applies to all OneAgents installed on hosts of the host group if their **setting** parameter is set to &#x60;INHERITED&#x60;. Otherwise, the host level setting applies.
 */
@ApiModel(description = "Configuration of OneAgent auto-update in a host group.   Applies to all OneAgents installed on hosts of the host group if their **setting** parameter is set to `INHERITED`. Otherwise, the host level setting applies.")
@JsonPropertyOrder({
  HostGroupAutoUpdateConfig.JSON_PROPERTY_METADATA,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_ID,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_SETTING,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_VERSION,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_UPDATE_WINDOWS,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_EFFECTIVE_SETTING,
  HostGroupAutoUpdateConfig.JSON_PROPERTY_EFFECTIVE_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class HostGroupAutoUpdateConfig {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The auto-update state of OneAgents in a host group:   * &#x60;ENABLED&#x60;: OneAgents automatically update to the most recent version.  * &#x60;DISABLED&#x60;: OneAgents update to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the environment-wide configuration is used.  OneAgents installed on hosts of the host group use this configuration only when their **setting** parameter is set to &#x60;INHERITED&#x60;.
   */
  public enum SettingEnum {
    DISABLED("DISABLED"),
    
    ENABLED("ENABLED"),
    
    INHERITED("INHERITED");

    private String value;

    SettingEnum(String value) {
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
    public static SettingEnum fromValue(String value) {
      for (SettingEnum b : SettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SETTING = "setting";
  private SettingEnum setting;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_UPDATE_WINDOWS = "updateWindows";
  private UpdateWindowsConfig updateWindows;

  /**
   * The actual state of the auto-update on the hosts in a host group.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the environment-wide setting.
   */
  public enum EffectiveSettingEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    EffectiveSettingEnum(String value) {
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
    public static EffectiveSettingEnum fromValue(String value) {
      for (EffectiveSettingEnum b : EffectiveSettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EFFECTIVE_SETTING = "effectiveSetting";
  private EffectiveSettingEnum effectiveSetting;

  public static final String JSON_PROPERTY_EFFECTIVE_VERSION = "effectiveVersion";
  private String effectiveVersion;

  public HostGroupAutoUpdateConfig() { 
  }

  @JsonCreator
  public HostGroupAutoUpdateConfig(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_SETTING) EffectiveSettingEnum effectiveSetting, 
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_VERSION) String effectiveVersion
  ) {
  this();
    this.id = id;
    this.effectiveSetting = effectiveSetting;
    this.effectiveVersion = effectiveVersion;
  }

  public HostGroupAutoUpdateConfig metadata(ConfigurationMetadata metadata) {
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


   /**
   * The Dynatrace entity ID of the host group.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOST_GROUP-0123456789ABCDE", value = "The Dynatrace entity ID of the host group.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public HostGroupAutoUpdateConfig setting(SettingEnum setting) {
    this.setting = setting;
    return this;
  }

   /**
   * The auto-update state of OneAgents in a host group:   * &#x60;ENABLED&#x60;: OneAgents automatically update to the most recent version.  * &#x60;DISABLED&#x60;: OneAgents update to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the environment-wide configuration is used.  OneAgents installed on hosts of the host group use this configuration only when their **setting** parameter is set to &#x60;INHERITED&#x60;.
   * @return setting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DISABLED", required = true, value = "The auto-update state of OneAgents in a host group:   * `ENABLED`: OneAgents automatically update to the most recent version.  * `DISABLED`: OneAgents update to the version specified in the **version** field. * `INHERITED`: The setting from the environment-wide configuration is used.  OneAgents installed on hosts of the host group use this configuration only when their **setting** parameter is set to `INHERITED`.")
  @JsonProperty(JSON_PROPERTY_SETTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SettingEnum getSetting() {
    return setting;
  }


  @JsonProperty(JSON_PROPERTY_SETTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSetting(SettingEnum setting) {
    this.setting = setting;
  }


  public HostGroupAutoUpdateConfig version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version to which the OneAgent must be updated.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example &#x60;1.181.0&#x60;) or &#x60;&lt;major&gt;.&lt;minor&gt;&#x60; format (for example &#x60;1.181&#x60;). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. If no suitable installer is found for the provided version or the value is set to &#x60;null&#x60;, OneAgent won&#39;t be updated.   Only applicable when the **setting** parameter is set to &#x60;DISABLED&#x60;.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.181.0", value = "The version to which the OneAgent must be updated.   Specify the version in the `<major>.<minor>.<revision>` format (for example `1.181.0`) or `<major>.<minor>` format (for example `1.181`). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. If no suitable installer is found for the provided version or the value is set to `null`, OneAgent won't be updated.   Only applicable when the **setting** parameter is set to `DISABLED`.")
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


  public HostGroupAutoUpdateConfig updateWindows(UpdateWindowsConfig updateWindows) {
    this.updateWindows = updateWindows;
    return this;
  }

   /**
   * Get updateWindows
   * @return updateWindows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateWindowsConfig getUpdateWindows() {
    return updateWindows;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateWindows(UpdateWindowsConfig updateWindows) {
    this.updateWindows = updateWindows;
  }


   /**
   * The actual state of the auto-update on the hosts in a host group.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the environment-wide setting.
   * @return effectiveSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DISABLED", value = "The actual state of the auto-update on the hosts in a host group.   Applicable only if the **setting** parameter is set to `INHERITED`. In that case the value is taken from the environment-wide setting.")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EffectiveSettingEnum getEffectiveSetting() {
    return effectiveSetting;
  }




   /**
   * The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the environment-wide setting.
   * @return effectiveVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.181.0", value = "The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to `INHERITED`. In that case the value is taken from the environment-wide setting.")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEffectiveVersion() {
    return effectiveVersion;
  }




  /**
   * Return true if this HostGroupAutoUpdateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostGroupAutoUpdateConfig hostGroupAutoUpdateConfig = (HostGroupAutoUpdateConfig) o;
    return Objects.equals(this.metadata, hostGroupAutoUpdateConfig.metadata) &&
        Objects.equals(this.id, hostGroupAutoUpdateConfig.id) &&
        Objects.equals(this.setting, hostGroupAutoUpdateConfig.setting) &&
        Objects.equals(this.version, hostGroupAutoUpdateConfig.version) &&
        Objects.equals(this.updateWindows, hostGroupAutoUpdateConfig.updateWindows) &&
        Objects.equals(this.effectiveSetting, hostGroupAutoUpdateConfig.effectiveSetting) &&
        Objects.equals(this.effectiveVersion, hostGroupAutoUpdateConfig.effectiveVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, setting, version, updateWindows, effectiveSetting, effectiveVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostGroupAutoUpdateConfig {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    updateWindows: ").append(toIndentedString(updateWindows)).append("\n");
    sb.append("    effectiveSetting: ").append(toIndentedString(effectiveSetting)).append("\n");
    sb.append("    effectiveVersion: ").append(toIndentedString(effectiveVersion)).append("\n");
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

