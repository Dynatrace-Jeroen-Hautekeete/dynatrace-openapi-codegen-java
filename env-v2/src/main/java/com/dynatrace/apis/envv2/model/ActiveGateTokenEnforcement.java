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
import com.dynatrace.apis.envv2.model.Duration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The status of ActiveGate tokens enforcement.
 */
@ApiModel(description = "The status of ActiveGate tokens enforcement.")
@JsonPropertyOrder({
  ActiveGateTokenEnforcement.JSON_PROPERTY_MANUAL_ENFORCED,
  ActiveGateTokenEnforcement.JSON_PROPERTY_AUTO_ENFORCED,
  ActiveGateTokenEnforcement.JSON_PROPERTY_AUTO_ENFORCEMENT_ESTIMATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class ActiveGateTokenEnforcement {
  public static final String JSON_PROPERTY_MANUAL_ENFORCED = "manualEnforced";
  private Boolean manualEnforced;

  public static final String JSON_PROPERTY_AUTO_ENFORCED = "autoEnforced";
  private Boolean autoEnforced;

  public static final String JSON_PROPERTY_AUTO_ENFORCEMENT_ESTIMATION = "autoEnforcementEstimation";
  private Duration autoEnforcementEstimation;

  public ActiveGateTokenEnforcement() { 
  }

  public ActiveGateTokenEnforcement manualEnforced(Boolean manualEnforced) {
    this.manualEnforced = manualEnforced;
    return this;
  }

   /**
   * If &#x60;true&#x60;, ActiveGate tokens are manually enforced by user.
   * @return manualEnforced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, ActiveGate tokens are manually enforced by user.")
  @JsonProperty(JSON_PROPERTY_MANUAL_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManualEnforced() {
    return manualEnforced;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManualEnforced(Boolean manualEnforced) {
    this.manualEnforced = manualEnforced;
  }


  public ActiveGateTokenEnforcement autoEnforced(Boolean autoEnforced) {
    this.autoEnforced = autoEnforced;
    return this;
  }

   /**
   * If &#x60;true&#x60;, ActiveGate tokens are enforced automatically.
   * @return autoEnforced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, ActiveGate tokens are enforced automatically.")
  @JsonProperty(JSON_PROPERTY_AUTO_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoEnforced() {
    return autoEnforced;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoEnforced(Boolean autoEnforced) {
    this.autoEnforced = autoEnforced;
  }


  public ActiveGateTokenEnforcement autoEnforcementEstimation(Duration autoEnforcementEstimation) {
    this.autoEnforcementEstimation = autoEnforcementEstimation;
    return this;
  }

   /**
   * Get autoEnforcementEstimation
   * @return autoEnforcementEstimation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_ENFORCEMENT_ESTIMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Duration getAutoEnforcementEstimation() {
    return autoEnforcementEstimation;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_ENFORCEMENT_ESTIMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoEnforcementEstimation(Duration autoEnforcementEstimation) {
    this.autoEnforcementEstimation = autoEnforcementEstimation;
  }


  /**
   * Return true if this ActiveGateTokenEnforcement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveGateTokenEnforcement activeGateTokenEnforcement = (ActiveGateTokenEnforcement) o;
    return Objects.equals(this.manualEnforced, activeGateTokenEnforcement.manualEnforced) &&
        Objects.equals(this.autoEnforced, activeGateTokenEnforcement.autoEnforced) &&
        Objects.equals(this.autoEnforcementEstimation, activeGateTokenEnforcement.autoEnforcementEstimation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualEnforced, autoEnforced, autoEnforcementEstimation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveGateTokenEnforcement {\n");
    sb.append("    manualEnforced: ").append(toIndentedString(manualEnforced)).append("\n");
    sb.append("    autoEnforced: ").append(toIndentedString(autoEnforced)).append("\n");
    sb.append("    autoEnforcementEstimation: ").append(toIndentedString(autoEnforcementEstimation)).append("\n");
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

