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
import com.dynatrace.apis.configv1.model.AwsSupportingServiceMetric;
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
 * A service to be monitored.
 */
@ApiModel(description = "A service to be monitored.")
@JsonPropertyOrder({
  AwsSupportingServiceConfig.JSON_PROPERTY_NAME,
  AwsSupportingServiceConfig.JSON_PROPERTY_MONITORED_METRICS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AwsSupportingServiceConfig {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MONITORED_METRICS = "monitoredMetrics";
  private List<AwsSupportingServiceMetric> monitoredMetrics = null;

  public AwsSupportingServiceConfig() { 
  }

  public AwsSupportingServiceConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the service. Valid supported service names can be discovered using /aws/supportedServices restAPI
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the service. Valid supported service names can be discovered using /aws/supportedServices restAPI")
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


  public AwsSupportingServiceConfig monitoredMetrics(List<AwsSupportingServiceMetric> monitoredMetrics) {
    this.monitoredMetrics = monitoredMetrics;
    return this;
  }

  public AwsSupportingServiceConfig addMonitoredMetricsItem(AwsSupportingServiceMetric monitoredMetricsItem) {
    if (this.monitoredMetrics == null) {
      this.monitoredMetrics = new ArrayList<>();
    }
    this.monitoredMetrics.add(monitoredMetricsItem);
    return this;
  }

   /**
   * A list of metrics to be monitored for this service. If the list is null then recommended list of metrics for this service will be monitored.
   * @return monitoredMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of metrics to be monitored for this service. If the list is null then recommended list of metrics for this service will be monitored.")
  @JsonProperty(JSON_PROPERTY_MONITORED_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsSupportingServiceMetric> getMonitoredMetrics() {
    return monitoredMetrics;
  }


  @JsonProperty(JSON_PROPERTY_MONITORED_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoredMetrics(List<AwsSupportingServiceMetric> monitoredMetrics) {
    this.monitoredMetrics = monitoredMetrics;
  }


  /**
   * Return true if this AwsSupportingServiceConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsSupportingServiceConfig awsSupportingServiceConfig = (AwsSupportingServiceConfig) o;
    return Objects.equals(this.name, awsSupportingServiceConfig.name) &&
        Objects.equals(this.monitoredMetrics, awsSupportingServiceConfig.monitoredMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, monitoredMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsSupportingServiceConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    monitoredMetrics: ").append(toIndentedString(monitoredMetrics)).append("\n");
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

