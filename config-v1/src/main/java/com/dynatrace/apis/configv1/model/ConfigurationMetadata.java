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
 * Metadata useful for debugging
 */
@ApiModel(description = "Metadata useful for debugging")
@JsonPropertyOrder({
  ConfigurationMetadata.JSON_PROPERTY_CONFIGURATION_VERSIONS,
  ConfigurationMetadata.JSON_PROPERTY_CURRENT_CONFIGURATION_VERSIONS,
  ConfigurationMetadata.JSON_PROPERTY_CLUSTER_VERSION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ConfigurationMetadata {
  public static final String JSON_PROPERTY_CONFIGURATION_VERSIONS = "configurationVersions";
  private List<Long> configurationVersions = null;

  public static final String JSON_PROPERTY_CURRENT_CONFIGURATION_VERSIONS = "currentConfigurationVersions";
  private List<String> currentConfigurationVersions = null;

  public static final String JSON_PROPERTY_CLUSTER_VERSION = "clusterVersion";
  private String clusterVersion;

  public ConfigurationMetadata() { 
  }

  public ConfigurationMetadata configurationVersions(List<Long> configurationVersions) {
    this.configurationVersions = configurationVersions;
    return this;
  }

  public ConfigurationMetadata addConfigurationVersionsItem(Long configurationVersionsItem) {
    if (this.configurationVersions == null) {
      this.configurationVersions = new ArrayList<>();
    }
    this.configurationVersions.add(configurationVersionsItem);
    return this;
  }

   /**
   * A sorted list of the version numbers of the configuration.
   * @return configurationVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[4,2]", value = "A sorted list of the version numbers of the configuration.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConfigurationVersions() {
    return configurationVersions;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationVersions(List<Long> configurationVersions) {
    this.configurationVersions = configurationVersions;
  }


  public ConfigurationMetadata currentConfigurationVersions(List<String> currentConfigurationVersions) {
    this.currentConfigurationVersions = currentConfigurationVersions;
    return this;
  }

  public ConfigurationMetadata addCurrentConfigurationVersionsItem(String currentConfigurationVersionsItem) {
    if (this.currentConfigurationVersions == null) {
      this.currentConfigurationVersions = new ArrayList<>();
    }
    this.currentConfigurationVersions.add(currentConfigurationVersionsItem);
    return this;
  }

   /**
   * A sorted list of version numbers of the configuration.
   * @return currentConfigurationVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"1.0.4\",\"1.23\"]", value = "A sorted list of version numbers of the configuration.")
  @JsonProperty(JSON_PROPERTY_CURRENT_CONFIGURATION_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCurrentConfigurationVersions() {
    return currentConfigurationVersions;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CONFIGURATION_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentConfigurationVersions(List<String> currentConfigurationVersions) {
    this.currentConfigurationVersions = currentConfigurationVersions;
  }


  public ConfigurationMetadata clusterVersion(String clusterVersion) {
    this.clusterVersion = clusterVersion;
    return this;
  }

   /**
   * Dynatrace version.
   * @return clusterVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.192.1", value = "Dynatrace version.")
  @JsonProperty(JSON_PROPERTY_CLUSTER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterVersion() {
    return clusterVersion;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterVersion(String clusterVersion) {
    this.clusterVersion = clusterVersion;
  }


  /**
   * Return true if this ConfigurationMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationMetadata configurationMetadata = (ConfigurationMetadata) o;
    return Objects.equals(this.configurationVersions, configurationMetadata.configurationVersions) &&
        Objects.equals(this.currentConfigurationVersions, configurationMetadata.currentConfigurationVersions) &&
        Objects.equals(this.clusterVersion, configurationMetadata.clusterVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersions, currentConfigurationVersions, clusterVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationMetadata {\n");
    sb.append("    configurationVersions: ").append(toIndentedString(configurationVersions)).append("\n");
    sb.append("    currentConfigurationVersions: ").append(toIndentedString(currentConfigurationVersions)).append("\n");
    sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
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

