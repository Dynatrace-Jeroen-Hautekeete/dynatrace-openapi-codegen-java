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
import com.dynatrace.apis.configv1.model.AzureSupportingService;
import com.dynatrace.apis.configv1.model.CloudTag;
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
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
 * Configuration of Azure app-level credentials.
 */
@ApiModel(description = "Configuration of Azure app-level credentials.")
@JsonPropertyOrder({
  AzureCredentials.JSON_PROPERTY_METADATA,
  AzureCredentials.JSON_PROPERTY_ID,
  AzureCredentials.JSON_PROPERTY_LABEL,
  AzureCredentials.JSON_PROPERTY_APP_ID,
  AzureCredentials.JSON_PROPERTY_DIRECTORY_ID,
  AzureCredentials.JSON_PROPERTY_KEY,
  AzureCredentials.JSON_PROPERTY_ACTIVE,
  AzureCredentials.JSON_PROPERTY_AUTO_TAGGING,
  AzureCredentials.JSON_PROPERTY_MONITOR_ONLY_TAGGED_ENTITIES,
  AzureCredentials.JSON_PROPERTY_MONITOR_ONLY_TAG_PAIRS,
  AzureCredentials.JSON_PROPERTY_MONITOR_ONLY_EXCLUDING_TAG_PAIRS,
  AzureCredentials.JSON_PROPERTY_SUPPORTING_SERVICES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AzureCredentials {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_DIRECTORY_ID = "directoryId";
  private String directoryId;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_AUTO_TAGGING = "autoTagging";
  private Boolean autoTagging;

  public static final String JSON_PROPERTY_MONITOR_ONLY_TAGGED_ENTITIES = "monitorOnlyTaggedEntities";
  private Boolean monitorOnlyTaggedEntities;

  public static final String JSON_PROPERTY_MONITOR_ONLY_TAG_PAIRS = "monitorOnlyTagPairs";
  private Set<CloudTag> monitorOnlyTagPairs = null;

  public static final String JSON_PROPERTY_MONITOR_ONLY_EXCLUDING_TAG_PAIRS = "monitorOnlyExcludingTagPairs";
  private Set<CloudTag> monitorOnlyExcludingTagPairs = null;

  public static final String JSON_PROPERTY_SUPPORTING_SERVICES = "supportingServices";
  private List<AzureSupportingService> supportingServices = null;

  public AzureCredentials() { 
  }

  @JsonCreator
  public AzureCredentials(
    @JsonProperty(JSON_PROPERTY_ID) String id
  ) {
  this();
    this.id = id;
  }

  public AzureCredentials metadata(ConfigurationMetadata metadata) {
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
   * The Dynatrace entity ID of the Azure credentials configuration.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Dynatrace entity ID of the Azure credentials configuration.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public AzureCredentials label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The unique name of the Azure credentials configuration.   Allowed characters are letters, numbers, and spaces. Also the special characters &#x60;.+-_&#x60; are allowed.
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique name of the Azure credentials configuration.   Allowed characters are letters, numbers, and spaces. Also the special characters `.+-_` are allowed.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(String label) {
    this.label = label;
  }


  public AzureCredentials appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The application ID (also referred to as client ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected.
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application ID (also referred to as client ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected.")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }


  public AzureCredentials directoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

   /**
   * The directory ID (also referred to as tenant ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected.
   * @return directoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The directory ID (also referred to as tenant ID).   The field is **required** when creating a new credentials configuration.    The field is ignored during an update, the old value remains unaffected.")
  @JsonProperty(JSON_PROPERTY_DIRECTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectoryId() {
    return directoryId;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
  }


  public AzureCredentials key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The secret key associated with the application ID.   For security reasons, GET requests return this field as &#x60;null&#x60;.    Submit your key on creation or update of the configuration.    The field is **required** when creating a new credentials configuration. If the field is omitted during an update, the old value remains unaffected.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secret key associated with the application ID.   For security reasons, GET requests return this field as `null`.    Submit your key on creation or update of the configuration.    The field is **required** when creating a new credentials configuration. If the field is omitted during an update, the old value remains unaffected.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public AzureCredentials active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The monitoring is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).   If not set on creation, the &#x60;true&#x60; value is used.   If the field is omitted during an update, the old value remains unaffected.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monitoring is enabled (`true`) or disabled (`false`).   If not set on creation, the `true` value is used.   If the field is omitted during an update, the old value remains unaffected.")
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


  public AzureCredentials autoTagging(Boolean autoTagging) {
    this.autoTagging = autoTagging;
    return this;
  }

   /**
   * The automatic capture of Azure tags is on (&#x60;true&#x60;) or off (&#x60;false&#x60;).
   * @return autoTagging
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The automatic capture of Azure tags is on (`true`) or off (`false`).")
  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAutoTagging() {
    return autoTagging;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoTagging(Boolean autoTagging) {
    this.autoTagging = autoTagging;
  }


  public AzureCredentials monitorOnlyTaggedEntities(Boolean monitorOnlyTaggedEntities) {
    this.monitorOnlyTaggedEntities = monitorOnlyTaggedEntities;
    return this;
  }

   /**
   * Monitor only resources that have specified Azure tags (&#x60;true&#x60;) or all resources (&#x60;false&#x60;).
   * @return monitorOnlyTaggedEntities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Monitor only resources that have specified Azure tags (`true`) or all resources (`false`).")
  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_TAGGED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMonitorOnlyTaggedEntities() {
    return monitorOnlyTaggedEntities;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_TAGGED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitorOnlyTaggedEntities(Boolean monitorOnlyTaggedEntities) {
    this.monitorOnlyTaggedEntities = monitorOnlyTaggedEntities;
  }


  public AzureCredentials monitorOnlyTagPairs(Set<CloudTag> monitorOnlyTagPairs) {
    this.monitorOnlyTagPairs = monitorOnlyTagPairs;
    return this;
  }

  public AzureCredentials addMonitorOnlyTagPairsItem(CloudTag monitorOnlyTagPairsItem) {
    if (this.monitorOnlyTagPairs == null) {
      this.monitorOnlyTagPairs = new LinkedHashSet<>();
    }
    this.monitorOnlyTagPairs.add(monitorOnlyTagPairsItem);
    return this;
  }

   /**
   * A list of Azure tags to be monitored.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags is monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to &#x60;true&#x60;.
   * @return monitorOnlyTagPairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Azure tags to be monitored.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags is monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`.")
  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_TAG_PAIRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<CloudTag> getMonitorOnlyTagPairs() {
    return monitorOnlyTagPairs;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_TAG_PAIRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorOnlyTagPairs(Set<CloudTag> monitorOnlyTagPairs) {
    this.monitorOnlyTagPairs = monitorOnlyTagPairs;
  }


  public AzureCredentials monitorOnlyExcludingTagPairs(Set<CloudTag> monitorOnlyExcludingTagPairs) {
    this.monitorOnlyExcludingTagPairs = monitorOnlyExcludingTagPairs;
    return this;
  }

  public AzureCredentials addMonitorOnlyExcludingTagPairsItem(CloudTag monitorOnlyExcludingTagPairsItem) {
    if (this.monitorOnlyExcludingTagPairs == null) {
      this.monitorOnlyExcludingTagPairs = new LinkedHashSet<>();
    }
    this.monitorOnlyExcludingTagPairs.add(monitorOnlyExcludingTagPairsItem);
    return this;
  }

   /**
   * A list of Azure tags to be excluded from monitoring.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags will not be monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to &#x60;true&#x60;.
   * @return monitorOnlyExcludingTagPairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Azure tags to be excluded from monitoring.   You can specify up to 20 tags. A resource tagged with *any* of the specified tags will not be monitored.   Only applicable when the **monitorOnlyTaggedEntities** parameter is set to `true`.")
  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_EXCLUDING_TAG_PAIRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<CloudTag> getMonitorOnlyExcludingTagPairs() {
    return monitorOnlyExcludingTagPairs;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_MONITOR_ONLY_EXCLUDING_TAG_PAIRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorOnlyExcludingTagPairs(Set<CloudTag> monitorOnlyExcludingTagPairs) {
    this.monitorOnlyExcludingTagPairs = monitorOnlyExcludingTagPairs;
  }


  public AzureCredentials supportingServices(List<AzureSupportingService> supportingServices) {
    this.supportingServices = supportingServices;
    return this;
  }

  public AzureCredentials addSupportingServicesItem(AzureSupportingService supportingServicesItem) {
    if (this.supportingServices == null) {
      this.supportingServices = new ArrayList<>();
    }
    this.supportingServices.add(supportingServicesItem);
    return this;
  }

   /**
   * **Deprecated**. To manage services use [/azure/credentials/{id}/services](https://dt-url.net/1w62s27) operation. Built-in services are not supported here.  A list of Azure services to be monitored. Available services are listed by [/azure/supportedServices](https://dt-url.net/wt42sdq) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/kx2351b).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. 
   * @return supportingServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Deprecated**. To manage services use [/azure/credentials/{id}/services](https://dt-url.net/1w62s27) operation. Built-in services are not supported here.  A list of Azure services to be monitored. Available services are listed by [/azure/supportedServices](https://dt-url.net/wt42sdq) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/kx2351b).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. ")
  @JsonProperty(JSON_PROPERTY_SUPPORTING_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AzureSupportingService> getSupportingServices() {
    return supportingServices;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTING_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportingServices(List<AzureSupportingService> supportingServices) {
    this.supportingServices = supportingServices;
  }


  /**
   * Return true if this AzureCredentials object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureCredentials azureCredentials = (AzureCredentials) o;
    return Objects.equals(this.metadata, azureCredentials.metadata) &&
        Objects.equals(this.id, azureCredentials.id) &&
        Objects.equals(this.label, azureCredentials.label) &&
        Objects.equals(this.appId, azureCredentials.appId) &&
        Objects.equals(this.directoryId, azureCredentials.directoryId) &&
        Objects.equals(this.key, azureCredentials.key) &&
        Objects.equals(this.active, azureCredentials.active) &&
        Objects.equals(this.autoTagging, azureCredentials.autoTagging) &&
        Objects.equals(this.monitorOnlyTaggedEntities, azureCredentials.monitorOnlyTaggedEntities) &&
        Objects.equals(this.monitorOnlyTagPairs, azureCredentials.monitorOnlyTagPairs) &&
        Objects.equals(this.monitorOnlyExcludingTagPairs, azureCredentials.monitorOnlyExcludingTagPairs) &&
        Objects.equals(this.supportingServices, azureCredentials.supportingServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, label, appId, directoryId, key, active, autoTagging, monitorOnlyTaggedEntities, monitorOnlyTagPairs, monitorOnlyExcludingTagPairs, supportingServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureCredentials {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    autoTagging: ").append(toIndentedString(autoTagging)).append("\n");
    sb.append("    monitorOnlyTaggedEntities: ").append(toIndentedString(monitorOnlyTaggedEntities)).append("\n");
    sb.append("    monitorOnlyTagPairs: ").append(toIndentedString(monitorOnlyTagPairs)).append("\n");
    sb.append("    monitorOnlyExcludingTagPairs: ").append(toIndentedString(monitorOnlyExcludingTagPairs)).append("\n");
    sb.append("    supportingServices: ").append(toIndentedString(supportingServices)).append("\n");
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

