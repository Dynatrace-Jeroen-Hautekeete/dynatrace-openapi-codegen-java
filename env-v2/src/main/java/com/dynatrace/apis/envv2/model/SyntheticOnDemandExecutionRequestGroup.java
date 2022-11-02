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
 * Contains parameters for the on-demand execution of monitors identified by tags, applications, or services.
 */
@ApiModel(description = "Contains parameters for the on-demand execution of monitors identified by tags, applications, or services.")
@JsonPropertyOrder({
  SyntheticOnDemandExecutionRequestGroup.JSON_PROPERTY_TAGS,
  SyntheticOnDemandExecutionRequestGroup.JSON_PROPERTY_APPLICATIONS,
  SyntheticOnDemandExecutionRequestGroup.JSON_PROPERTY_SERVICES,
  SyntheticOnDemandExecutionRequestGroup.JSON_PROPERTY_LOCATIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SyntheticOnDemandExecutionRequestGroup {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Set<String> tags = null;

  public static final String JSON_PROPERTY_APPLICATIONS = "applications";
  private Set<String> applications = null;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private Set<String> services = null;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<String> locations = null;

  public SyntheticOnDemandExecutionRequestGroup() { 
  }

  public SyntheticOnDemandExecutionRequestGroup tags(Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticOnDemandExecutionRequestGroup addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags. Only monitors with all tags assigned will be executed.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags. Only monitors with all tags assigned will be executed.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getTags() {
    return tags;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Set<String> tags) {
    this.tags = tags;
  }


  public SyntheticOnDemandExecutionRequestGroup applications(Set<String> applications) {
    this.applications = applications;
    return this;
  }

  public SyntheticOnDemandExecutionRequestGroup addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = new LinkedHashSet<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * List of application identifiers. Only monitors with all applications assigned will be executed.
   * @return applications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of application identifiers. Only monitors with all applications assigned will be executed.")
  @JsonProperty(JSON_PROPERTY_APPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getApplications() {
    return applications;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplications(Set<String> applications) {
    this.applications = applications;
  }


  public SyntheticOnDemandExecutionRequestGroup services(Set<String> services) {
    this.services = services;
    return this;
  }

  public SyntheticOnDemandExecutionRequestGroup addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new LinkedHashSet<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of service identifiers. Only monitors with all services assigned will be executed.
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of service identifiers. Only monitors with all services assigned will be executed.")
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getServices() {
    return services;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServices(Set<String> services) {
    this.services = services;
  }


  public SyntheticOnDemandExecutionRequestGroup locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public SyntheticOnDemandExecutionRequestGroup addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The locations from where monitors are to be executed.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locations from where monitors are to be executed.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocations(List<String> locations) {
    this.locations = locations;
  }


  /**
   * Return true if this SyntheticOnDemandExecutionRequestGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticOnDemandExecutionRequestGroup syntheticOnDemandExecutionRequestGroup = (SyntheticOnDemandExecutionRequestGroup) o;
    return Objects.equals(this.tags, syntheticOnDemandExecutionRequestGroup.tags) &&
        Objects.equals(this.applications, syntheticOnDemandExecutionRequestGroup.applications) &&
        Objects.equals(this.services, syntheticOnDemandExecutionRequestGroup.services) &&
        Objects.equals(this.locations, syntheticOnDemandExecutionRequestGroup.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, applications, services, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticOnDemandExecutionRequestGroup {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

