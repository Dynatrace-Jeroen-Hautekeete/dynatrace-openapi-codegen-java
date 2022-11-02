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
import com.dynatrace.apis.configv1.model.ConditionsOpaqueAndExternalWebServiceAttributeTypeDto;
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.dynatrace.apis.configv1.model.Port;
import com.dynatrace.apis.configv1.model.UrlPath;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The service detection rule of the &#x60;OPAQUE_AND_EXTERNAL_WEB_SERVICE&#x60; type
 */
@ApiModel(description = "The service detection rule of the `OPAQUE_AND_EXTERNAL_WEB_SERVICE` type")
@JsonPropertyOrder({
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_TYPE,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_METADATA,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_MANAGEMENT_ZONES,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_ID,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_ORDER,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_NAME,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_DESCRIPTION,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_ENABLED,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_CONDITIONS,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_DETECT_AS_WEB_REQUEST_SERVICE,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_URL_PATH,
  OpaqueAndExternalWebServiceRule.JSON_PROPERTY_PORT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class OpaqueAndExternalWebServiceRule {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_MANAGEMENT_ZONES = "managementZones";
  private List<String> managementZones = null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ORDER = "order";
  private String order;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<ConditionsOpaqueAndExternalWebServiceAttributeTypeDto> conditions = null;

  public static final String JSON_PROPERTY_DETECT_AS_WEB_REQUEST_SERVICE = "detectAsWebRequestService";
  private Boolean detectAsWebRequestService;

  public static final String JSON_PROPERTY_URL_PATH = "urlPath";
  private UrlPath urlPath;

  public static final String JSON_PROPERTY_PORT = "port";
  private Port port;

  public OpaqueAndExternalWebServiceRule() { 
  }

  public OpaqueAndExternalWebServiceRule type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the service detection rule.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the service detection rule.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public OpaqueAndExternalWebServiceRule metadata(ConfigurationMetadata metadata) {
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


  public OpaqueAndExternalWebServiceRule managementZones(List<String> managementZones) {
    this.managementZones = managementZones;
    return this;
  }

  public OpaqueAndExternalWebServiceRule addManagementZonesItem(String managementZonesItem) {
    if (this.managementZones == null) {
      this.managementZones = new ArrayList<>();
    }
    this.managementZones.add(managementZonesItem);
    return this;
  }

   /**
   * The management zone (specified by the ID) of the process group for which this service detection rule should be created.    You can specify only 1 management zone here.
   * @return managementZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The management zone (specified by the ID) of the process group for which this service detection rule should be created.    You can specify only 1 management zone here.")
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getManagementZones() {
    return managementZones;
  }


  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagementZones(List<String> managementZones) {
    this.managementZones = managementZones;
  }


  public OpaqueAndExternalWebServiceRule id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the service detection rule.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the service detection rule.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public OpaqueAndExternalWebServiceRule order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The order of the rule in the rules list.    The rules are evaluated from top to bottom. The first matching rule applies.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order of the rule in the rules list.    The rules are evaluated from top to bottom. The first matching rule applies.")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(String order) {
    this.order = order;
  }


  public OpaqueAndExternalWebServiceRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the rule.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the rule.")
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


  public OpaqueAndExternalWebServiceRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A short description of the rule.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the rule.")
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


  public OpaqueAndExternalWebServiceRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The rule is enabled(&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The rule is enabled(`true`) or disabled (`false`).")
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


  public OpaqueAndExternalWebServiceRule conditions(List<ConditionsOpaqueAndExternalWebServiceAttributeTypeDto> conditions) {
    this.conditions = conditions;
    return this;
  }

  public OpaqueAndExternalWebServiceRule addConditionsItem(ConditionsOpaqueAndExternalWebServiceAttributeTypeDto conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * A list of conditions of the rule.   If several conditions are specified, the AND logic applies.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of conditions of the rule.   If several conditions are specified, the AND logic applies.")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConditionsOpaqueAndExternalWebServiceAttributeTypeDto> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<ConditionsOpaqueAndExternalWebServiceAttributeTypeDto> conditions) {
    this.conditions = conditions;
  }


  public OpaqueAndExternalWebServiceRule detectAsWebRequestService(Boolean detectAsWebRequestService) {
    this.detectAsWebRequestService = detectAsWebRequestService;
    return this;
  }

   /**
   * Detect the matching requests as web services (&#x60;false&#x60;) or web request services (&#x60;true&#x60;).   Setting this field to &#x60;true&#x60; prevents detecting of matching requests as opaque web services. An opaque web request service is created instead. If you need to further modify the resulting web request service, you need to create a separate rule of the &#x60;OPAQUE_AND_EXTERNAL_WEB_REQUEST&#x60; type.   Default is &#x60;false&#x60;, detecting matching requests as opaque web services.
   * @return detectAsWebRequestService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Detect the matching requests as web services (`false`) or web request services (`true`).   Setting this field to `true` prevents detecting of matching requests as opaque web services. An opaque web request service is created instead. If you need to further modify the resulting web request service, you need to create a separate rule of the `OPAQUE_AND_EXTERNAL_WEB_REQUEST` type.   Default is `false`, detecting matching requests as opaque web services.")
  @JsonProperty(JSON_PROPERTY_DETECT_AS_WEB_REQUEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDetectAsWebRequestService() {
    return detectAsWebRequestService;
  }


  @JsonProperty(JSON_PROPERTY_DETECT_AS_WEB_REQUEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectAsWebRequestService(Boolean detectAsWebRequestService) {
    this.detectAsWebRequestService = detectAsWebRequestService;
  }


  public OpaqueAndExternalWebServiceRule urlPath(UrlPath urlPath) {
    this.urlPath = urlPath;
    return this;
  }

   /**
   * Get urlPath
   * @return urlPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UrlPath getUrlPath() {
    return urlPath;
  }


  @JsonProperty(JSON_PROPERTY_URL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlPath(UrlPath urlPath) {
    this.urlPath = urlPath;
  }


  public OpaqueAndExternalWebServiceRule port(Port port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Port getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Port port) {
    this.port = port;
  }


  /**
   * Return true if this OpaqueAndExternalWebServiceRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpaqueAndExternalWebServiceRule opaqueAndExternalWebServiceRule = (OpaqueAndExternalWebServiceRule) o;
    return Objects.equals(this.type, opaqueAndExternalWebServiceRule.type) &&
        Objects.equals(this.metadata, opaqueAndExternalWebServiceRule.metadata) &&
        Objects.equals(this.managementZones, opaqueAndExternalWebServiceRule.managementZones) &&
        Objects.equals(this.id, opaqueAndExternalWebServiceRule.id) &&
        Objects.equals(this.order, opaqueAndExternalWebServiceRule.order) &&
        Objects.equals(this.name, opaqueAndExternalWebServiceRule.name) &&
        Objects.equals(this.description, opaqueAndExternalWebServiceRule.description) &&
        Objects.equals(this.enabled, opaqueAndExternalWebServiceRule.enabled) &&
        Objects.equals(this.conditions, opaqueAndExternalWebServiceRule.conditions) &&
        Objects.equals(this.detectAsWebRequestService, opaqueAndExternalWebServiceRule.detectAsWebRequestService) &&
        Objects.equals(this.urlPath, opaqueAndExternalWebServiceRule.urlPath) &&
        Objects.equals(this.port, opaqueAndExternalWebServiceRule.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, metadata, managementZones, id, order, name, description, enabled, conditions, detectAsWebRequestService, urlPath, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpaqueAndExternalWebServiceRule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    managementZones: ").append(toIndentedString(managementZones)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    detectAsWebRequestService: ").append(toIndentedString(detectAsWebRequestService)).append("\n");
    sb.append("    urlPath: ").append(toIndentedString(urlPath)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

