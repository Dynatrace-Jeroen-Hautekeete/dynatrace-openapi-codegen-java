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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The status of public synthetic locations.
 */
@ApiModel(description = "The status of public synthetic locations.")
@JsonPropertyOrder({
  SyntheticPublicLocationsStatus.JSON_PROPERTY_PUBLIC_LOCATIONS_ENABLED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class SyntheticPublicLocationsStatus {
  public static final String JSON_PROPERTY_PUBLIC_LOCATIONS_ENABLED = "publicLocationsEnabled";
  private Boolean publicLocationsEnabled;

  public SyntheticPublicLocationsStatus() { 
  }

  public SyntheticPublicLocationsStatus publicLocationsEnabled(Boolean publicLocationsEnabled) {
    this.publicLocationsEnabled = publicLocationsEnabled;
    return this;
  }

   /**
   * Synthetic monitors can (&#x60;true&#x60;) or can&#39;t (&#x60;false&#x60;) run on public synthetic locations.
   * @return publicLocationsEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Synthetic monitors can (`true`) or can't (`false`) run on public synthetic locations.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_LOCATIONS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPublicLocationsEnabled() {
    return publicLocationsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_LOCATIONS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicLocationsEnabled(Boolean publicLocationsEnabled) {
    this.publicLocationsEnabled = publicLocationsEnabled;
  }


  /**
   * Return true if this SyntheticPublicLocationsStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticPublicLocationsStatus syntheticPublicLocationsStatus = (SyntheticPublicLocationsStatus) o;
    return Objects.equals(this.publicLocationsEnabled, syntheticPublicLocationsStatus.publicLocationsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicLocationsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticPublicLocationsStatus {\n");
    sb.append("    publicLocationsEnabled: ").append(toIndentedString(publicLocationsEnabled)).append("\n");
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

