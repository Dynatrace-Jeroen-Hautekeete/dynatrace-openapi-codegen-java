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
 * PublicSyntheticLocationAllOf
 */
@JsonPropertyOrder({
  PublicSyntheticLocationAllOf.JSON_PROPERTY_CLOUD_PLATFORM,
  PublicSyntheticLocationAllOf.JSON_PROPERTY_IPS,
  PublicSyntheticLocationAllOf.JSON_PROPERTY_STAGE,
  PublicSyntheticLocationAllOf.JSON_PROPERTY_BROWSER_TYPE,
  PublicSyntheticLocationAllOf.JSON_PROPERTY_BROWSER_VERSION,
  PublicSyntheticLocationAllOf.JSON_PROPERTY_CAPABILITIES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class PublicSyntheticLocationAllOf {
  /**
   * The cloud provider where the location is hosted.
   */
  public enum CloudPlatformEnum {
    ALIBABA("ALIBABA"),
    
    AMAZON_EC2("AMAZON_EC2"),
    
    AZURE("AZURE"),
    
    DYNATRACE_CLOUD("DYNATRACE_CLOUD"),
    
    GOOGLE_CLOUD("GOOGLE_CLOUD"),
    
    INTEROUTE("INTEROUTE"),
    
    OTHER("OTHER"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    CloudPlatformEnum(String value) {
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
    public static CloudPlatformEnum fromValue(String value) {
      for (CloudPlatformEnum b : CloudPlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CLOUD_PLATFORM = "cloudPlatform";
  private CloudPlatformEnum cloudPlatform;

  public static final String JSON_PROPERTY_IPS = "ips";
  private Set<String> ips = null;

  /**
   * The stage of the location.
   */
  public enum StageEnum {
    BETA("BETA"),
    
    COMING_SOON("COMING_SOON"),
    
    DELETED("DELETED"),
    
    GA("GA");

    private String value;

    StageEnum(String value) {
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
    public static StageEnum fromValue(String value) {
      for (StageEnum b : StageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STAGE = "stage";
  private StageEnum stage;

  public static final String JSON_PROPERTY_BROWSER_TYPE = "browserType";
  private String browserType;

  public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
  private String browserVersion;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private List<String> capabilities = null;

  public PublicSyntheticLocationAllOf() { 
  }

  public PublicSyntheticLocationAllOf cloudPlatform(CloudPlatformEnum cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
    return this;
  }

   /**
   * The cloud provider where the location is hosted.
   * @return cloudPlatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud provider where the location is hosted.")
  @JsonProperty(JSON_PROPERTY_CLOUD_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudPlatformEnum getCloudPlatform() {
    return cloudPlatform;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudPlatform(CloudPlatformEnum cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }


  public PublicSyntheticLocationAllOf ips(Set<String> ips) {
    this.ips = ips;
    return this;
  }

  public PublicSyntheticLocationAllOf addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new LinkedHashSet<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * The list of IP addresses assigned to the location.
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of IP addresses assigned to the location.")
  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getIps() {
    return ips;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIps(Set<String> ips) {
    this.ips = ips;
  }


  public PublicSyntheticLocationAllOf stage(StageEnum stage) {
    this.stage = stage;
    return this;
  }

   /**
   * The stage of the location.
   * @return stage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stage of the location.")
  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StageEnum getStage() {
    return stage;
  }


  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStage(StageEnum stage) {
    this.stage = stage;
  }


  public PublicSyntheticLocationAllOf browserType(String browserType) {
    this.browserType = browserType;
    return this;
  }

   /**
   * The type of the browser the location is using to execute browser monitors.
   * @return browserType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the browser the location is using to execute browser monitors.")
  @JsonProperty(JSON_PROPERTY_BROWSER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserType() {
    return browserType;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserType(String browserType) {
    this.browserType = browserType;
  }


  public PublicSyntheticLocationAllOf browserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

   /**
   * The version of the browser the location is using to execute browser monitors.
   * @return browserVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the browser the location is using to execute browser monitors.")
  @JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserVersion() {
    return browserVersion;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }


  public PublicSyntheticLocationAllOf capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PublicSyntheticLocationAllOf addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * A list of location capabilities.
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of location capabilities.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }


  /**
   * Return true if this PublicSyntheticLocation_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicSyntheticLocationAllOf publicSyntheticLocationAllOf = (PublicSyntheticLocationAllOf) o;
    return Objects.equals(this.cloudPlatform, publicSyntheticLocationAllOf.cloudPlatform) &&
        Objects.equals(this.ips, publicSyntheticLocationAllOf.ips) &&
        Objects.equals(this.stage, publicSyntheticLocationAllOf.stage) &&
        Objects.equals(this.browserType, publicSyntheticLocationAllOf.browserType) &&
        Objects.equals(this.browserVersion, publicSyntheticLocationAllOf.browserVersion) &&
        Objects.equals(this.capabilities, publicSyntheticLocationAllOf.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudPlatform, ips, stage, browserType, browserVersion, capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSyntheticLocationAllOf {\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    browserType: ").append(toIndentedString(browserType)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

