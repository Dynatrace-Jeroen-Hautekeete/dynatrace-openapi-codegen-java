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
 * HostToRelationships
 */
@JsonPropertyOrder({
  HostToRelationships.JSON_PROPERTY_IS_SITE_OF,
  HostToRelationships.JSON_PROPERTY_IS_PROCESS_OF,
  HostToRelationships.JSON_PROPERTY_IS_NETWORK_CLIENT_OF_HOST,
  HostToRelationships.JSON_PROPERTY_RUNS_ON
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class HostToRelationships {
  public static final String JSON_PROPERTY_IS_SITE_OF = "isSiteOf";
  private List<String> isSiteOf = null;

  public static final String JSON_PROPERTY_IS_PROCESS_OF = "isProcessOf";
  private List<String> isProcessOf = null;

  public static final String JSON_PROPERTY_IS_NETWORK_CLIENT_OF_HOST = "isNetworkClientOfHost";
  private List<String> isNetworkClientOfHost = null;

  public static final String JSON_PROPERTY_RUNS_ON = "runsOn";
  private List<String> runsOn = null;

  public HostToRelationships() { 
  }

  public HostToRelationships isSiteOf(List<String> isSiteOf) {
    this.isSiteOf = isSiteOf;
    return this;
  }

  public HostToRelationships addIsSiteOfItem(String isSiteOfItem) {
    if (this.isSiteOf == null) {
      this.isSiteOf = new ArrayList<>();
    }
    this.isSiteOf.add(isSiteOfItem);
    return this;
  }

   /**
   * Get isSiteOf
   * @return isSiteOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SITE_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIsSiteOf() {
    return isSiteOf;
  }


  @JsonProperty(JSON_PROPERTY_IS_SITE_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSiteOf(List<String> isSiteOf) {
    this.isSiteOf = isSiteOf;
  }


  public HostToRelationships isProcessOf(List<String> isProcessOf) {
    this.isProcessOf = isProcessOf;
    return this;
  }

  public HostToRelationships addIsProcessOfItem(String isProcessOfItem) {
    if (this.isProcessOf == null) {
      this.isProcessOf = new ArrayList<>();
    }
    this.isProcessOf.add(isProcessOfItem);
    return this;
  }

   /**
   * Get isProcessOf
   * @return isProcessOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PROCESS_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIsProcessOf() {
    return isProcessOf;
  }


  @JsonProperty(JSON_PROPERTY_IS_PROCESS_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsProcessOf(List<String> isProcessOf) {
    this.isProcessOf = isProcessOf;
  }


  public HostToRelationships isNetworkClientOfHost(List<String> isNetworkClientOfHost) {
    this.isNetworkClientOfHost = isNetworkClientOfHost;
    return this;
  }

  public HostToRelationships addIsNetworkClientOfHostItem(String isNetworkClientOfHostItem) {
    if (this.isNetworkClientOfHost == null) {
      this.isNetworkClientOfHost = new ArrayList<>();
    }
    this.isNetworkClientOfHost.add(isNetworkClientOfHostItem);
    return this;
  }

   /**
   * Get isNetworkClientOfHost
   * @return isNetworkClientOfHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_NETWORK_CLIENT_OF_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIsNetworkClientOfHost() {
    return isNetworkClientOfHost;
  }


  @JsonProperty(JSON_PROPERTY_IS_NETWORK_CLIENT_OF_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNetworkClientOfHost(List<String> isNetworkClientOfHost) {
    this.isNetworkClientOfHost = isNetworkClientOfHost;
  }


  public HostToRelationships runsOn(List<String> runsOn) {
    this.runsOn = runsOn;
    return this;
  }

  public HostToRelationships addRunsOnItem(String runsOnItem) {
    if (this.runsOn == null) {
      this.runsOn = new ArrayList<>();
    }
    this.runsOn.add(runsOnItem);
    return this;
  }

   /**
   * Get runsOn
   * @return runsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUNS_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRunsOn() {
    return runsOn;
  }


  @JsonProperty(JSON_PROPERTY_RUNS_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunsOn(List<String> runsOn) {
    this.runsOn = runsOn;
  }


  /**
   * Return true if this Host_toRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostToRelationships hostToRelationships = (HostToRelationships) o;
    return Objects.equals(this.isSiteOf, hostToRelationships.isSiteOf) &&
        Objects.equals(this.isProcessOf, hostToRelationships.isProcessOf) &&
        Objects.equals(this.isNetworkClientOfHost, hostToRelationships.isNetworkClientOfHost) &&
        Objects.equals(this.runsOn, hostToRelationships.runsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSiteOf, isProcessOf, isNetworkClientOfHost, runsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostToRelationships {\n");
    sb.append("    isSiteOf: ").append(toIndentedString(isSiteOf)).append("\n");
    sb.append("    isProcessOf: ").append(toIndentedString(isProcessOf)).append("\n");
    sb.append("    isNetworkClientOfHost: ").append(toIndentedString(isNetworkClientOfHost)).append("\n");
    sb.append("    runsOn: ").append(toIndentedString(runsOn)).append("\n");
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
