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
import com.dynatrace.apis.configv1.model.AwsSupportingServiceConfig;
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
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
 * AwsMonitoredServicesDto
 */
@JsonPropertyOrder({
  AwsMonitoredServicesDto.JSON_PROPERTY_METADATA,
  AwsMonitoredServicesDto.JSON_PROPERTY_SERVICES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AwsMonitoredServicesDto {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<AwsSupportingServiceConfig> services = new ArrayList<>();

  public AwsMonitoredServicesDto() { 
  }

  public AwsMonitoredServicesDto metadata(ConfigurationMetadata metadata) {
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


  public AwsMonitoredServicesDto services(List<AwsSupportingServiceConfig> services) {
    this.services = services;
    return this;
  }

  public AwsMonitoredServicesDto addServicesItem(AwsSupportingServiceConfig servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * A list of AWS services to be monitored. Available services are listed by [/aws/supportedServices](https://dt-url.net/me02sh2) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/r12v0pkl).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. For built-in services, adjusting the list of metrics is not supported, therefore it needs to be null.
   * @return services
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of AWS services to be monitored. Available services are listed by [/aws/supportedServices](https://dt-url.net/me02sh2) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/r12v0pkl).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. For built-in services, adjusting the list of metrics is not supported, therefore it needs to be null.")
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AwsSupportingServiceConfig> getServices() {
    return services;
  }


  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServices(List<AwsSupportingServiceConfig> services) {
    this.services = services;
  }


  /**
   * Return true if this AwsMonitoredServicesDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsMonitoredServicesDto awsMonitoredServicesDto = (AwsMonitoredServicesDto) o;
    return Objects.equals(this.metadata, awsMonitoredServicesDto.metadata) &&
        Objects.equals(this.services, awsMonitoredServicesDto.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsMonitoredServicesDto {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

