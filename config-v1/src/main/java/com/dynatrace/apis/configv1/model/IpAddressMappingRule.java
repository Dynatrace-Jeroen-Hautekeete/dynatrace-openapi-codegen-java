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
import com.dynatrace.apis.configv1.model.IpAddressMappingLocation;
import com.dynatrace.apis.configv1.model.IpAddressRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of the IP address mapping to the geographic location.
 */
@ApiModel(description = "Configuration of the IP address mapping to the geographic location.")
@JsonPropertyOrder({
  IpAddressMappingRule.JSON_PROPERTY_IP_ADDRESS_MAPPING_LOCATION,
  IpAddressMappingRule.JSON_PROPERTY_IP_ADDRESS_RANGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class IpAddressMappingRule {
  public static final String JSON_PROPERTY_IP_ADDRESS_MAPPING_LOCATION = "ipAddressMappingLocation";
  private IpAddressMappingLocation ipAddressMappingLocation;

  public static final String JSON_PROPERTY_IP_ADDRESS_RANGE = "ipAddressRange";
  private IpAddressRange ipAddressRange;

  public IpAddressMappingRule() { 
  }

  public IpAddressMappingRule ipAddressMappingLocation(IpAddressMappingLocation ipAddressMappingLocation) {
    this.ipAddressMappingLocation = ipAddressMappingLocation;
    return this;
  }

   /**
   * Get ipAddressMappingLocation
   * @return ipAddressMappingLocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_MAPPING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IpAddressMappingLocation getIpAddressMappingLocation() {
    return ipAddressMappingLocation;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_MAPPING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpAddressMappingLocation(IpAddressMappingLocation ipAddressMappingLocation) {
    this.ipAddressMappingLocation = ipAddressMappingLocation;
  }


  public IpAddressMappingRule ipAddressRange(IpAddressRange ipAddressRange) {
    this.ipAddressRange = ipAddressRange;
    return this;
  }

   /**
   * Get ipAddressRange
   * @return ipAddressRange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IpAddressRange getIpAddressRange() {
    return ipAddressRange;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpAddressRange(IpAddressRange ipAddressRange) {
    this.ipAddressRange = ipAddressRange;
  }


  /**
   * Return true if this IpAddressMappingRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddressMappingRule ipAddressMappingRule = (IpAddressMappingRule) o;
    return Objects.equals(this.ipAddressMappingLocation, ipAddressMappingRule.ipAddressMappingLocation) &&
        Objects.equals(this.ipAddressRange, ipAddressMappingRule.ipAddressRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddressMappingLocation, ipAddressRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddressMappingRule {\n");
    sb.append("    ipAddressMappingLocation: ").append(toIndentedString(ipAddressMappingLocation)).append("\n");
    sb.append("    ipAddressRange: ").append(toIndentedString(ipAddressRange)).append("\n");
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

