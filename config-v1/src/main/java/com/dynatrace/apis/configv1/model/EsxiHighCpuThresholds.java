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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Custom thresholds for CPU saturation detection on ESXi. If not set then the automatic mode is used.    **All** conditions must be fulfilled to trigger an alert.
 */
@ApiModel(description = "Custom thresholds for CPU saturation detection on ESXi. If not set then the automatic mode is used.    **All** conditions must be fulfilled to trigger an alert.")
@JsonPropertyOrder({
  EsxiHighCpuThresholds.JSON_PROPERTY_CPU_USAGE_PERCENTAGE,
  EsxiHighCpuThresholds.JSON_PROPERTY_VM_CPU_READY_PERCENTAGE,
  EsxiHighCpuThresholds.JSON_PROPERTY_CPU_PEAK_PERCENTAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class EsxiHighCpuThresholds {
  public static final String JSON_PROPERTY_CPU_USAGE_PERCENTAGE = "cpuUsagePercentage";
  private Integer cpuUsagePercentage;

  public static final String JSON_PROPERTY_VM_CPU_READY_PERCENTAGE = "vmCpuReadyPercentage";
  private Integer vmCpuReadyPercentage;

  public static final String JSON_PROPERTY_CPU_PEAK_PERCENTAGE = "cpuPeakPercentage";
  private Integer cpuPeakPercentage;

  public EsxiHighCpuThresholds() { 
  }

  public EsxiHighCpuThresholds cpuUsagePercentage(Integer cpuUsagePercentage) {
    this.cpuUsagePercentage = cpuUsagePercentage;
    return this;
  }

   /**
   * CPU usage is higher than *X*% in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return cpuUsagePercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "CPU usage is higher than *X*% in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_CPU_USAGE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCpuUsagePercentage() {
    return cpuUsagePercentage;
  }


  @JsonProperty(JSON_PROPERTY_CPU_USAGE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCpuUsagePercentage(Integer cpuUsagePercentage) {
    this.cpuUsagePercentage = cpuUsagePercentage;
  }


  public EsxiHighCpuThresholds vmCpuReadyPercentage(Integer vmCpuReadyPercentage) {
    this.vmCpuReadyPercentage = vmCpuReadyPercentage;
    return this;
  }

   /**
   * VM CPU ready is higher than *X*% in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return vmCpuReadyPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VM CPU ready is higher than *X*% in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_VM_CPU_READY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVmCpuReadyPercentage() {
    return vmCpuReadyPercentage;
  }


  @JsonProperty(JSON_PROPERTY_VM_CPU_READY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVmCpuReadyPercentage(Integer vmCpuReadyPercentage) {
    this.vmCpuReadyPercentage = vmCpuReadyPercentage;
  }


  public EsxiHighCpuThresholds cpuPeakPercentage(Integer cpuPeakPercentage) {
    this.cpuPeakPercentage = cpuPeakPercentage;
    return this;
  }

   /**
   * At least one peak higher than *X*% occurred in 3 out of 5 samples.
   * minimum: 1
   * maximum: 100
   * @return cpuPeakPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "At least one peak higher than *X*% occurred in 3 out of 5 samples.")
  @JsonProperty(JSON_PROPERTY_CPU_PEAK_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCpuPeakPercentage() {
    return cpuPeakPercentage;
  }


  @JsonProperty(JSON_PROPERTY_CPU_PEAK_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCpuPeakPercentage(Integer cpuPeakPercentage) {
    this.cpuPeakPercentage = cpuPeakPercentage;
  }


  /**
   * Return true if this EsxiHighCpuThresholds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsxiHighCpuThresholds esxiHighCpuThresholds = (EsxiHighCpuThresholds) o;
    return Objects.equals(this.cpuUsagePercentage, esxiHighCpuThresholds.cpuUsagePercentage) &&
        Objects.equals(this.vmCpuReadyPercentage, esxiHighCpuThresholds.vmCpuReadyPercentage) &&
        Objects.equals(this.cpuPeakPercentage, esxiHighCpuThresholds.cpuPeakPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUsagePercentage, vmCpuReadyPercentage, cpuPeakPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsxiHighCpuThresholds {\n");
    sb.append("    cpuUsagePercentage: ").append(toIndentedString(cpuUsagePercentage)).append("\n");
    sb.append("    vmCpuReadyPercentage: ").append(toIndentedString(vmCpuReadyPercentage)).append("\n");
    sb.append("    cpuPeakPercentage: ").append(toIndentedString(cpuPeakPercentage)).append("\n");
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
