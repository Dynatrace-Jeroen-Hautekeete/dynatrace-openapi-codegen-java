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
import com.dynatrace.apis.envv1.model.PrivateSyntheticLocation;
import com.dynatrace.apis.envv1.model.PublicSyntheticLocation;
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.envv1.JSON;
/**
 * Configuration of a synthetic location.    **countryCode**, **regionCode**, **city** parameters are optional as they can be retrieved based on **latitude** and **longitude** of location.   The actual set of fields depends on the type of the location. Find the list of actual objects in the description of the **type** field or see [Synthetic locations API v2 - JSON models](https://dt-url.net/3n43szj).
 */
@ApiModel(description = "Configuration of a synthetic location.    **countryCode**, **regionCode**, **city** parameters are optional as they can be retrieved based on **latitude** and **longitude** of location.   The actual set of fields depends on the type of the location. Find the list of actual objects in the description of the **type** field or see [Synthetic locations API v2 - JSON models](https://dt-url.net/3n43szj).")
@JsonPropertyOrder({
  SyntheticLocation.JSON_PROPERTY_ENTITY_ID,
  SyntheticLocation.JSON_PROPERTY_TYPE,
  SyntheticLocation.JSON_PROPERTY_NAME,
  SyntheticLocation.JSON_PROPERTY_COUNTRY_CODE,
  SyntheticLocation.JSON_PROPERTY_REGION_CODE,
  SyntheticLocation.JSON_PROPERTY_CITY,
  SyntheticLocation.JSON_PROPERTY_LATITUDE,
  SyntheticLocation.JSON_PROPERTY_LONGITUDE,
  SyntheticLocation.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PrivateSyntheticLocation.class, name = "PrivateSyntheticLocation"),
  @JsonSubTypes.Type(value = PublicSyntheticLocation.class, name = "PublicSyntheticLocation"),
})

public class SyntheticLocation {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;PUBLIC&#x60; -&gt; PublicSyntheticLocation  * &#x60;PRIVATE&#x60; -&gt; PrivateSyntheticLocation  * &#x60;CLUSTER&#x60; -&gt; PrivateSyntheticLocation  
   */
  public enum TypeEnum {
    CLUSTER("CLUSTER"),
    
    PRIVATE("PRIVATE"),
    
    PUBLIC("PUBLIC");

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

  public SyntheticLocation() { 
  }

  public SyntheticLocation entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The Dynatrace entity ID of the location.
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Dynatrace entity ID of the location.")
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


  public SyntheticLocation type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;PUBLIC&#x60; -&gt; PublicSyntheticLocation  * &#x60;PRIVATE&#x60; -&gt; PrivateSyntheticLocation  * &#x60;CLUSTER&#x60; -&gt; PrivateSyntheticLocation  
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `PUBLIC` -> PublicSyntheticLocation  * `PRIVATE` -> PrivateSyntheticLocation  * `CLUSTER` -> PrivateSyntheticLocation  ")
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


  public SyntheticLocation name(String name) {
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


  public SyntheticLocation countryCode(String countryCode) {
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


  public SyntheticLocation regionCode(String regionCode) {
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


  public SyntheticLocation city(String city) {
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


  public SyntheticLocation latitude(Double latitude) {
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


  public SyntheticLocation longitude(Double longitude) {
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


  public SyntheticLocation status(StatusEnum status) {
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


  /**
   * Return true if this SyntheticLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticLocation syntheticLocation = (SyntheticLocation) o;
    return Objects.equals(this.entityId, syntheticLocation.entityId) &&
        Objects.equals(this.type, syntheticLocation.type) &&
        Objects.equals(this.name, syntheticLocation.name) &&
        Objects.equals(this.countryCode, syntheticLocation.countryCode) &&
        Objects.equals(this.regionCode, syntheticLocation.regionCode) &&
        Objects.equals(this.city, syntheticLocation.city) &&
        Objects.equals(this.latitude, syntheticLocation.latitude) &&
        Objects.equals(this.longitude, syntheticLocation.longitude) &&
        Objects.equals(this.status, syntheticLocation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, type, name, countryCode, regionCode, city, latitude, longitude, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticLocation {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
  mappings.put("PrivateSyntheticLocation", PrivateSyntheticLocation.class);
  mappings.put("PublicSyntheticLocation", PublicSyntheticLocation.class);
  mappings.put("SyntheticLocation", SyntheticLocation.class);
  JSON.registerDiscriminator(SyntheticLocation.class, "type", mappings);
}
}

