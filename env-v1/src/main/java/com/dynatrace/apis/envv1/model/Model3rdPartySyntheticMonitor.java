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
import com.dynatrace.apis.envv1.model.SyntheticTestLocation;
import com.dynatrace.apis.envv1.model.SyntheticTestStep;
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
 * The third-party synthetic monitor.
 */
@ApiModel(description = "The third-party synthetic monitor.")
@JsonPropertyOrder({
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_ID,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_TITLE,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_DESCRIPTION,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_TEST_SETUP,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_DRILLDOWN_LINK,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_EDIT_LINK,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_ENABLED,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_DELETED,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_LOCATIONS,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_STEPS,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_SCHEDULE_INTERVAL_IN_SECONDS,
  Model3rdPartySyntheticMonitor.JSON_PROPERTY_NO_DATA_TIMEOUT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class Model3rdPartySyntheticMonitor {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TEST_SETUP = "testSetup";
  private String testSetup;

  public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
  private Long expirationTimestamp;

  public static final String JSON_PROPERTY_DRILLDOWN_LINK = "drilldownLink";
  private String drilldownLink;

  public static final String JSON_PROPERTY_EDIT_LINK = "editLink";
  private String editLink;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private Set<SyntheticTestLocation> locations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticTestStep> steps = null;

  public static final String JSON_PROPERTY_SCHEDULE_INTERVAL_IN_SECONDS = "scheduleIntervalInSeconds";
  private Integer scheduleIntervalInSeconds;

  public static final String JSON_PROPERTY_NO_DATA_TIMEOUT = "noDataTimeout";
  private Integer noDataTimeout;

  public Model3rdPartySyntheticMonitor() { 
  }

  public Model3rdPartySyntheticMonitor id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the monitor.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the monitor.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Model3rdPartySyntheticMonitor title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The name of the monitor.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the monitor.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public Model3rdPartySyntheticMonitor description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the monitor.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the monitor.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Model3rdPartySyntheticMonitor testSetup(String testSetup) {
    this.testSetup = testSetup;
    return this;
  }

   /**
   * The information on monitor setup, for example &#x60;browser&#x60;.
   * @return testSetup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The information on monitor setup, for example `browser`.")
  @JsonProperty(JSON_PROPERTY_TEST_SETUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestSetup() {
    return testSetup;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SETUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestSetup(String testSetup) {
    this.testSetup = testSetup;
  }


  public Model3rdPartySyntheticMonitor expirationTimestamp(Long expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

   /**
   * The timestamp of the monitor expiration, in UTC milliseconds.
   * @return expirationTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the monitor expiration, in UTC milliseconds.")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExpirationTimestamp() {
    return expirationTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationTimestamp(Long expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }


  public Model3rdPartySyntheticMonitor drilldownLink(String drilldownLink) {
    this.drilldownLink = drilldownLink;
    return this;
  }

   /**
   * The URL to the results of monitor execution.
   * @return drilldownLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the results of monitor execution.")
  @JsonProperty(JSON_PROPERTY_DRILLDOWN_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDrilldownLink() {
    return drilldownLink;
  }


  @JsonProperty(JSON_PROPERTY_DRILLDOWN_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrilldownLink(String drilldownLink) {
    this.drilldownLink = drilldownLink;
  }


  public Model3rdPartySyntheticMonitor editLink(String editLink) {
    this.editLink = editLink;
    return this;
  }

   /**
   * The URL to edit the monitor in the original UI.
   * @return editLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to edit the monitor in the original UI.")
  @JsonProperty(JSON_PROPERTY_EDIT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditLink() {
    return editLink;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditLink(String editLink) {
    this.editLink = editLink;
  }


  public Model3rdPartySyntheticMonitor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The monitor is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). Default is &#x60;true&#x60;.   If &#x60;true&#x60;, set the **deleted** parameter to &#x60;false&#x60;.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The monitor is enabled (`true`) or disabled (`false`). Default is `true`.   If `true`, set the **deleted** parameter to `false`.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Model3rdPartySyntheticMonitor deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * The flag of the deleted monitor. Default is &#x60;false&#x60;.    If &#x60;true&#x60;, set the **enabled** parameter to &#x60;false&#x60;.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flag of the deleted monitor. Default is `false`.    If `true`, set the **enabled** parameter to `false`.")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Model3rdPartySyntheticMonitor locations(Set<SyntheticTestLocation> locations) {
    this.locations = locations;
    return this;
  }

  public Model3rdPartySyntheticMonitor addLocationsItem(SyntheticTestLocation locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Locations from which the synthetic monitor runs.
   * @return locations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Locations from which the synthetic monitor runs.")
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<SyntheticTestLocation> getLocations() {
    return locations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(Set<SyntheticTestLocation> locations) {
    this.locations = locations;
  }


  public Model3rdPartySyntheticMonitor steps(List<SyntheticTestStep> steps) {
    this.steps = steps;
    return this;
  }

  public Model3rdPartySyntheticMonitor addStepsItem(SyntheticTestStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Steps of the third-party monitor.
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Steps of the third-party monitor.")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticTestStep> getSteps() {
    return steps;
  }


  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSteps(List<SyntheticTestStep> steps) {
    this.steps = steps;
  }


  public Model3rdPartySyntheticMonitor scheduleIntervalInSeconds(Integer scheduleIntervalInSeconds) {
    this.scheduleIntervalInSeconds = scheduleIntervalInSeconds;
    return this;
  }

   /**
   * The frequency of the monitor, in seconds. The monitor is repeated with the specified interval at the third-party source.   Dynatrace expects results of a monitor execution with the specified interval. If you report results to Dynatrace less often, adjust the **noDataTimeout** value accordingly.
   * @return scheduleIntervalInSeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The frequency of the monitor, in seconds. The monitor is repeated with the specified interval at the third-party source.   Dynatrace expects results of a monitor execution with the specified interval. If you report results to Dynatrace less often, adjust the **noDataTimeout** value accordingly.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_INTERVAL_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getScheduleIntervalInSeconds() {
    return scheduleIntervalInSeconds;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_INTERVAL_IN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduleIntervalInSeconds(Integer scheduleIntervalInSeconds) {
    this.scheduleIntervalInSeconds = scheduleIntervalInSeconds;
  }


  public Model3rdPartySyntheticMonitor noDataTimeout(Integer noDataTimeout) {
    this.noDataTimeout = noDataTimeout;
    return this;
  }

   /**
   * The timeout of the monitor, in seconds. If no result is reported within this time, the availability state switches to unmonitored. Default is doubled frequency of the monitor.
   * @return noDataTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timeout of the monitor, in seconds. If no result is reported within this time, the availability state switches to unmonitored. Default is doubled frequency of the monitor.")
  @JsonProperty(JSON_PROPERTY_NO_DATA_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoDataTimeout() {
    return noDataTimeout;
  }


  @JsonProperty(JSON_PROPERTY_NO_DATA_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoDataTimeout(Integer noDataTimeout) {
    this.noDataTimeout = noDataTimeout;
  }


  /**
   * Return true if this 3rdPartySyntheticMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model3rdPartySyntheticMonitor _3rdPartySyntheticMonitor = (Model3rdPartySyntheticMonitor) o;
    return Objects.equals(this.id, _3rdPartySyntheticMonitor.id) &&
        Objects.equals(this.title, _3rdPartySyntheticMonitor.title) &&
        Objects.equals(this.description, _3rdPartySyntheticMonitor.description) &&
        Objects.equals(this.testSetup, _3rdPartySyntheticMonitor.testSetup) &&
        Objects.equals(this.expirationTimestamp, _3rdPartySyntheticMonitor.expirationTimestamp) &&
        Objects.equals(this.drilldownLink, _3rdPartySyntheticMonitor.drilldownLink) &&
        Objects.equals(this.editLink, _3rdPartySyntheticMonitor.editLink) &&
        Objects.equals(this.enabled, _3rdPartySyntheticMonitor.enabled) &&
        Objects.equals(this.deleted, _3rdPartySyntheticMonitor.deleted) &&
        Objects.equals(this.locations, _3rdPartySyntheticMonitor.locations) &&
        Objects.equals(this.steps, _3rdPartySyntheticMonitor.steps) &&
        Objects.equals(this.scheduleIntervalInSeconds, _3rdPartySyntheticMonitor.scheduleIntervalInSeconds) &&
        Objects.equals(this.noDataTimeout, _3rdPartySyntheticMonitor.noDataTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, testSetup, expirationTimestamp, drilldownLink, editLink, enabled, deleted, locations, steps, scheduleIntervalInSeconds, noDataTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model3rdPartySyntheticMonitor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    testSetup: ").append(toIndentedString(testSetup)).append("\n");
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    drilldownLink: ").append(toIndentedString(drilldownLink)).append("\n");
    sb.append("    editLink: ").append(toIndentedString(editLink)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    scheduleIntervalInSeconds: ").append(toIndentedString(scheduleIntervalInSeconds)).append("\n");
    sb.append("    noDataTimeout: ").append(toIndentedString(noDataTimeout)).append("\n");
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
