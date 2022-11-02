/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv2.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dynatrace.apis.envv2.model.SyntheticLocationUpdate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.envv2.JSON;
/**
 * Configuration of a private synthetic location
 */
@ApiModel(description = "Configuration of a private synthetic location")
@JsonPropertyOrder({
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_NODES,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_NAME,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_COUNTRY_CODE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_REGION_CODE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_CITY,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_LATITUDE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_LONGITUDE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_STATUS,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_AVAILABILITY_LOCATION_OUTAGE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_AVAILABILITY_NODE_OUTAGE,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_LOCATION_NODE_OUTAGE_DELAY_IN_MINUTES,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_AVAILABILITY_NOTIFICATIONS_ENABLED,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_AUTO_UPDATE_CHROMIUM,
  SyntheticPrivateLocationUpdate.JSON_PROPERTY_DEPLOYMENT_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class SyntheticPrivateLocationUpdate extends SyntheticLocationUpdate {
  public static final String JSON_PROPERTY_NODES = "nodes";
  private List<String> nodes = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_REGION_CODE = "regionCode";
  private String regionCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  /**
   * The status of the location:   * &#x60;ENABLED&#x60;: The location is displayed as active in the UI. You can assign monitors to the location.  * &#x60;DISABLED&#x60;: The location is displayed as inactive in the UI. You can&#39;t assign monitors to the location. Monitors already assigned to the location will stay there and will be executed from the location.  * &#x60;HIDDEN&#x60;: The location is not displayed in the UI. You can&#39;t assign monitors to the location. You can only set location as &#x60;HIDDEN&#x60; when no monitor is assigned to it.
   */
  public enum StatusEnum {
    DISABLED("DISABLED"),
    
    ENABLED("ENABLED"),
    
    HIDDEN("HIDDEN");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_AVAILABILITY_LOCATION_OUTAGE = "availabilityLocationOutage";
  private Boolean availabilityLocationOutage;

  public static final String JSON_PROPERTY_AVAILABILITY_NODE_OUTAGE = "availabilityNodeOutage";
  private Boolean availabilityNodeOutage;

  public static final String JSON_PROPERTY_LOCATION_NODE_OUTAGE_DELAY_IN_MINUTES = "locationNodeOutageDelayInMinutes";
  private Integer locationNodeOutageDelayInMinutes;

  public static final String JSON_PROPERTY_AVAILABILITY_NOTIFICATIONS_ENABLED = "availabilityNotificationsEnabled";
  private Boolean availabilityNotificationsEnabled;

  public static final String JSON_PROPERTY_AUTO_UPDATE_CHROMIUM = "autoUpdateChromium";
  private Boolean autoUpdateChromium;

  /**
   * The deployment type of the location:   * &#x60;STANDARD&#x60;: The location is deployed on Windows or Linux. * &#x60;KUBERNETES&#x60;: The location is deployed on Kubernetes.
   */
  public enum DeploymentTypeEnum {
    KUBERNETES("KUBERNETES"),
    
    STANDARD("STANDARD");

    private String value;

    DeploymentTypeEnum(String value) {
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
    public static DeploymentTypeEnum fromValue(String value) {
      for (DeploymentTypeEnum b : DeploymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEPLOYMENT_TYPE = "deploymentType";
  private DeploymentTypeEnum deploymentType;

  public SyntheticPrivateLocationUpdate() { 
  }

  public SyntheticPrivateLocationUpdate nodes(List<String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public SyntheticPrivateLocationUpdate addNodesItem(String nodesItem) {
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * A list of synthetic nodes belonging to the location.    You can retrieve the list of available nodes with the [GET all nodes](https://dt-url.net/miy3rpl) call.
   * @return nodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of synthetic nodes belonging to the location.    You can retrieve the list of available nodes with the [GET all nodes](https://dt-url.net/miy3rpl) call.")
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getNodes() {
    return nodes;
  }


  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }


  public SyntheticPrivateLocationUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the location.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the location.")
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


  public SyntheticPrivateLocationUpdate countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code of the location.    Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for example, &#x60;AT&#x60; for Austria or &#x60;PL&#x60; for Poland).
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country code of the location.    Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for example, `AT` for Austria or `PL` for Poland).")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public SyntheticPrivateLocationUpdate regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The region code of the location.    For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca) use ISO 3166-2 state codes (without &#x60;US-&#x60; or &#x60;CA-&#x60; prefix), for example, &#x60;VA&#x60; for Virginia or &#x60;OR&#x60; for Oregon.    For the rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes).
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region code of the location.    For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca) use ISO 3166-2 state codes (without `US-` or `CA-` prefix), for example, `VA` for Virginia or `OR` for Oregon.    For the rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes).")
  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionCode() {
    return regionCode;
  }


  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public SyntheticPrivateLocationUpdate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the location.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city of the location.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public SyntheticPrivateLocationUpdate latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the location in &#x60;DDD.dddd&#x60; format.
   * @return latitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The latitude of the location in `DDD.dddd` format.")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public SyntheticPrivateLocationUpdate longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the location in &#x60;DDD.dddd&#x60; format.
   * @return longitude
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The longitude of the location in `DDD.dddd` format.")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public SyntheticPrivateLocationUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the location:   * &#x60;ENABLED&#x60;: The location is displayed as active in the UI. You can assign monitors to the location.  * &#x60;DISABLED&#x60;: The location is displayed as inactive in the UI. You can&#39;t assign monitors to the location. Monitors already assigned to the location will stay there and will be executed from the location.  * &#x60;HIDDEN&#x60;: The location is not displayed in the UI. You can&#39;t assign monitors to the location. You can only set location as &#x60;HIDDEN&#x60; when no monitor is assigned to it.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the location:   * `ENABLED`: The location is displayed as active in the UI. You can assign monitors to the location.  * `DISABLED`: The location is displayed as inactive in the UI. You can't assign monitors to the location. Monitors already assigned to the location will stay there and will be executed from the location.  * `HIDDEN`: The location is not displayed in the UI. You can't assign monitors to the location. You can only set location as `HIDDEN` when no monitor is assigned to it.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SyntheticPrivateLocationUpdate availabilityLocationOutage(Boolean availabilityLocationOutage) {
    this.availabilityLocationOutage = availabilityLocationOutage;
    return this;
  }

   /**
   * The alerting of location outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return availabilityLocationOutage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The alerting of location outage is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_LOCATION_OUTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailabilityLocationOutage() {
    return availabilityLocationOutage;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_LOCATION_OUTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityLocationOutage(Boolean availabilityLocationOutage) {
    this.availabilityLocationOutage = availabilityLocationOutage;
  }


  public SyntheticPrivateLocationUpdate availabilityNodeOutage(Boolean availabilityNodeOutage) {
    this.availabilityNodeOutage = availabilityNodeOutage;
    return this;
  }

   /**
   * The alerting of node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).    If enabled, the outage of *any* node in the location triggers an alert.
   * @return availabilityNodeOutage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The alerting of node outage is enabled (`true`) or disabled (`false`).    If enabled, the outage of *any* node in the location triggers an alert.")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_NODE_OUTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailabilityNodeOutage() {
    return availabilityNodeOutage;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_NODE_OUTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityNodeOutage(Boolean availabilityNodeOutage) {
    this.availabilityNodeOutage = availabilityNodeOutage;
  }


  public SyntheticPrivateLocationUpdate locationNodeOutageDelayInMinutes(Integer locationNodeOutageDelayInMinutes) {
    this.locationNodeOutageDelayInMinutes = locationNodeOutageDelayInMinutes;
    return this;
  }

   /**
   * Alert if the location or node outage lasts longer than *X* minutes.    Only applicable when **availabilityLocationOutage** or **availabilityNodeOutage** is set to &#x60;true&#x60;.
   * minimum: 1
   * maximum: 5
   * @return locationNodeOutageDelayInMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alert if the location or node outage lasts longer than *X* minutes.    Only applicable when **availabilityLocationOutage** or **availabilityNodeOutage** is set to `true`.")
  @JsonProperty(JSON_PROPERTY_LOCATION_NODE_OUTAGE_DELAY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLocationNodeOutageDelayInMinutes() {
    return locationNodeOutageDelayInMinutes;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_NODE_OUTAGE_DELAY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationNodeOutageDelayInMinutes(Integer locationNodeOutageDelayInMinutes) {
    this.locationNodeOutageDelayInMinutes = locationNodeOutageDelayInMinutes;
  }


  public SyntheticPrivateLocationUpdate availabilityNotificationsEnabled(Boolean availabilityNotificationsEnabled) {
    this.availabilityNotificationsEnabled = availabilityNotificationsEnabled;
    return this;
  }

   /**
   * The notifications of location and node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return availabilityNotificationsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The notifications of location and node outage is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_NOTIFICATIONS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailabilityNotificationsEnabled() {
    return availabilityNotificationsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_NOTIFICATIONS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityNotificationsEnabled(Boolean availabilityNotificationsEnabled) {
    this.availabilityNotificationsEnabled = availabilityNotificationsEnabled;
  }


  public SyntheticPrivateLocationUpdate autoUpdateChromium(Boolean autoUpdateChromium) {
    this.autoUpdateChromium = autoUpdateChromium;
    return this;
  }

   /**
   * Auto upgrade of Chromium is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return autoUpdateChromium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auto upgrade of Chromium is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_CHROMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpdateChromium() {
    return autoUpdateChromium;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_UPDATE_CHROMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUpdateChromium(Boolean autoUpdateChromium) {
    this.autoUpdateChromium = autoUpdateChromium;
  }


  public SyntheticPrivateLocationUpdate deploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * The deployment type of the location:   * &#x60;STANDARD&#x60;: The location is deployed on Windows or Linux. * &#x60;KUBERNETES&#x60;: The location is deployed on Kubernetes.
   * @return deploymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The deployment type of the location:   * `STANDARD`: The location is deployed on Windows or Linux. * `KUBERNETES`: The location is deployed on Kubernetes.")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeploymentTypeEnum getDeploymentType() {
    return deploymentType;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentType(DeploymentTypeEnum deploymentType) {
    this.deploymentType = deploymentType;
  }


  /**
   * Return true if this SyntheticPrivateLocationUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticPrivateLocationUpdate syntheticPrivateLocationUpdate = (SyntheticPrivateLocationUpdate) o;
    return Objects.equals(this.nodes, syntheticPrivateLocationUpdate.nodes) &&
        Objects.equals(this.name, syntheticPrivateLocationUpdate.name) &&
        Objects.equals(this.countryCode, syntheticPrivateLocationUpdate.countryCode) &&
        Objects.equals(this.regionCode, syntheticPrivateLocationUpdate.regionCode) &&
        Objects.equals(this.city, syntheticPrivateLocationUpdate.city) &&
        Objects.equals(this.latitude, syntheticPrivateLocationUpdate.latitude) &&
        Objects.equals(this.longitude, syntheticPrivateLocationUpdate.longitude) &&
        Objects.equals(this.status, syntheticPrivateLocationUpdate.status) &&
        Objects.equals(this.availabilityLocationOutage, syntheticPrivateLocationUpdate.availabilityLocationOutage) &&
        Objects.equals(this.availabilityNodeOutage, syntheticPrivateLocationUpdate.availabilityNodeOutage) &&
        Objects.equals(this.locationNodeOutageDelayInMinutes, syntheticPrivateLocationUpdate.locationNodeOutageDelayInMinutes) &&
        Objects.equals(this.availabilityNotificationsEnabled, syntheticPrivateLocationUpdate.availabilityNotificationsEnabled) &&
        Objects.equals(this.autoUpdateChromium, syntheticPrivateLocationUpdate.autoUpdateChromium) &&
        Objects.equals(this.deploymentType, syntheticPrivateLocationUpdate.deploymentType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, name, countryCode, regionCode, city, latitude, longitude, status, availabilityLocationOutage, availabilityNodeOutage, locationNodeOutageDelayInMinutes, availabilityNotificationsEnabled, autoUpdateChromium, deploymentType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticPrivateLocationUpdate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    availabilityLocationOutage: ").append(toIndentedString(availabilityLocationOutage)).append("\n");
    sb.append("    availabilityNodeOutage: ").append(toIndentedString(availabilityNodeOutage)).append("\n");
    sb.append("    locationNodeOutageDelayInMinutes: ").append(toIndentedString(locationNodeOutageDelayInMinutes)).append("\n");
    sb.append("    availabilityNotificationsEnabled: ").append(toIndentedString(availabilityNotificationsEnabled)).append("\n");
    sb.append("    autoUpdateChromium: ").append(toIndentedString(autoUpdateChromium)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
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
  mappings.put("SyntheticPrivateLocationUpdate", SyntheticPrivateLocationUpdate.class);
  JSON.registerDiscriminator(SyntheticPrivateLocationUpdate.class, "type", mappings);
}
}

