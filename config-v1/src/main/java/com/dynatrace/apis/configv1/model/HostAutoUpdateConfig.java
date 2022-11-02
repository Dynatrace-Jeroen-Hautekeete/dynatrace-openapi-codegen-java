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
 * Configuration of OneAgent auto-update.
 */
@ApiModel(description = "Configuration of OneAgent auto-update.")
@JsonPropertyOrder({
  HostAutoUpdateConfig.JSON_PROPERTY_METADATA,
  HostAutoUpdateConfig.JSON_PROPERTY_ID,
  HostAutoUpdateConfig.JSON_PROPERTY_SETTING,
  HostAutoUpdateConfig.JSON_PROPERTY_VERSION,
  HostAutoUpdateConfig.JSON_PROPERTY_UPDATE_WINDOWS,
  HostAutoUpdateConfig.JSON_PROPERTY_EFFECTIVE_SETTING,
  HostAutoUpdateConfig.JSON_PROPERTY_EFFECTIVE_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class HostAutoUpdateConfig {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The auto-update state of OneAgents on the host:   * &#x60;ENABLED&#x60;: OneAgent automatically updates to the most recent version.  * &#x60;DISABLED&#x60;: OneAgent updates to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the host group (if the host is a member of a host group) or the environment-wide configuration (if the host doesn&#39;t belong to a host group) is used.
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
   * The actual state of the auto-update on the host.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the host group or the environment-wide configuration.
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

  public HostAutoUpdateConfig() { 
  }

  @JsonCreator
  public HostAutoUpdateConfig(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_SETTING) EffectiveSettingEnum effectiveSetting, 
    @JsonProperty(JSON_PROPERTY_EFFECTIVE_VERSION) String effectiveVersion
  ) {
  this();
    this.id = id;
    this.effectiveSetting = effectiveSetting;
    this.effectiveVersion = effectiveVersion;
  }

  public HostAutoUpdateConfig metadata(ConfigurationMetadata metadata) {
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
   * The Dynatrace entity ID of the host where OneAgent is deployed.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOST-0123456789ABCDE", value = "The Dynatrace entity ID of the host where OneAgent is deployed.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public HostAutoUpdateConfig setting(SettingEnum setting) {
    this.setting = setting;
    return this;
  }

   /**
   * The auto-update state of OneAgents on the host:   * &#x60;ENABLED&#x60;: OneAgent automatically updates to the most recent version.  * &#x60;DISABLED&#x60;: OneAgent updates to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the host group (if the host is a member of a host group) or the environment-wide configuration (if the host doesn&#39;t belong to a host group) is used.
   * @return setting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DISABLED", required = true, value = "The auto-update state of OneAgents on the host:   * `ENABLED`: OneAgent automatically updates to the most recent version.  * `DISABLED`: OneAgent updates to the version specified in the **version** field. * `INHERITED`: The setting from the host group (if the host is a member of a host group) or the environment-wide configuration (if the host doesn't belong to a host group) is used.")
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


  public HostAutoUpdateConfig version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version to which the OneAgent must be updated.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;.&lt;timestamp&gt;&#x60; format (for example &#x60;1.191.0.20200326-161115&#x60;). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   If no suitable installer is found for the provided version or the value is set to &#x60;null&#x60;, OneAgent won&#39;t be updated.   Only applicable when the **effectiveSetting** value is &#x60;DISABLED&#x60;.   If the **setting** parameter is set to &#x60;INHERITED&#x60; but the **version** is still set, it will result in a one-time update: OneAgent will be updated to the specified version and the **version** value will be set to &#x60;null&#x60;. For further updates the parent setting will be used.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.191.0.20200326-161115", value = "The version to which the OneAgent must be updated.   Specify the version in the `<major>.<minor>.<revision>.<timestamp>` format (for example `1.191.0.20200326-161115`). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   If no suitable installer is found for the provided version or the value is set to `null`, OneAgent won't be updated.   Only applicable when the **effectiveSetting** value is `DISABLED`.   If the **setting** parameter is set to `INHERITED` but the **version** is still set, it will result in a one-time update: OneAgent will be updated to the specified version and the **version** value will be set to `null`. For further updates the parent setting will be used.")
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


  public HostAutoUpdateConfig updateWindows(UpdateWindowsConfig updateWindows) {
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
   * The actual state of the auto-update on the host.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the host group or the environment-wide configuration.
   * @return effectiveSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DISABLED", value = "The actual state of the auto-update on the host.   Applicable only if the **setting** parameter is set to `INHERITED`. In that case the value is taken from the host group or the environment-wide configuration.")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EffectiveSettingEnum getEffectiveSetting() {
    return effectiveSetting;
  }




   /**
   * The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60; and the **version** parameter is set to &#x60;null&#x60;. In that case the value is taken from the host group or the environment-wide configuration.
   * @return effectiveVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.191.0.20200326-161115", value = "The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to `INHERITED` and the **version** parameter is set to `null`. In that case the value is taken from the host group or the environment-wide configuration.")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEffectiveVersion() {
    return effectiveVersion;
  }




  /**
   * Return true if this HostAutoUpdateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostAutoUpdateConfig hostAutoUpdateConfig = (HostAutoUpdateConfig) o;
    return Objects.equals(this.metadata, hostAutoUpdateConfig.metadata) &&
        Objects.equals(this.id, hostAutoUpdateConfig.id) &&
        Objects.equals(this.setting, hostAutoUpdateConfig.setting) &&
        Objects.equals(this.version, hostAutoUpdateConfig.version) &&
        Objects.equals(this.updateWindows, hostAutoUpdateConfig.updateWindows) &&
        Objects.equals(this.effectiveSetting, hostAutoUpdateConfig.effectiveSetting) &&
        Objects.equals(this.effectiveVersion, hostAutoUpdateConfig.effectiveVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, setting, version, updateWindows, effectiveSetting, effectiveVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostAutoUpdateConfig {\n");
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
