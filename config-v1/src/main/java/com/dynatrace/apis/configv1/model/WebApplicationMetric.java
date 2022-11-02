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
import com.dynatrace.apis.configv1.model.UserActionFilter;
import com.dynatrace.apis.configv1.model.WebApplicationDimensionDefinition;
import com.dynatrace.apis.configv1.model.WebApplicationMetricDefinition;
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
 * Descriptor of the calculated web application metric.
 */
@ApiModel(description = "Descriptor of the calculated web application metric.")
@JsonPropertyOrder({
  WebApplicationMetric.JSON_PROPERTY_APPLICATION_IDENTIFIER,
  WebApplicationMetric.JSON_PROPERTY_NAME,
  WebApplicationMetric.JSON_PROPERTY_METRIC_KEY,
  WebApplicationMetric.JSON_PROPERTY_ENABLED,
  WebApplicationMetric.JSON_PROPERTY_METRIC_DEFINITION,
  WebApplicationMetric.JSON_PROPERTY_DIMENSIONS,
  WebApplicationMetric.JSON_PROPERTY_USER_ACTION_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class WebApplicationMetric {
  public static final String JSON_PROPERTY_APPLICATION_IDENTIFIER = "applicationIdentifier";
  private String applicationIdentifier;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METRIC_KEY = "metricKey";
  private String metricKey;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_METRIC_DEFINITION = "metricDefinition";
  private WebApplicationMetricDefinition metricDefinition;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<WebApplicationDimensionDefinition> dimensions = null;

  public static final String JSON_PROPERTY_USER_ACTION_FILTER = "userActionFilter";
  private UserActionFilter userActionFilter;

  public WebApplicationMetric() { 
  }

  public WebApplicationMetric applicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
    return this;
  }

   /**
   * The Dynatrace entity ID of the application to which the metric belongs.
   * @return applicationIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Dynatrace entity ID of the application to which the metric belongs.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApplicationIdentifier() {
    return applicationIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
  }


  public WebApplicationMetric name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The displayed name of the metric.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The displayed name of the metric.")
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


  public WebApplicationMetric metricKey(String metricKey) {
    this.metricKey = metricKey;
    return this;
  }

   /**
   * The unique key of the metric.    The key must have the &#x60;calc:apps&#x60; prefix.
   * @return metricKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique key of the metric.    The key must have the `calc:apps` prefix.")
  @JsonProperty(JSON_PROPERTY_METRIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetricKey() {
    return metricKey;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricKey(String metricKey) {
    this.metricKey = metricKey;
  }


  public WebApplicationMetric enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The metric is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The metric is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public WebApplicationMetric metricDefinition(WebApplicationMetricDefinition metricDefinition) {
    this.metricDefinition = metricDefinition;
    return this;
  }

   /**
   * Get metricDefinition
   * @return metricDefinition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WebApplicationMetricDefinition getMetricDefinition() {
    return metricDefinition;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricDefinition(WebApplicationMetricDefinition metricDefinition) {
    this.metricDefinition = metricDefinition;
  }


  public WebApplicationMetric dimensions(List<WebApplicationDimensionDefinition> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public WebApplicationMetric addDimensionsItem(WebApplicationDimensionDefinition dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * A list of metric dimensions.
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of metric dimensions.")
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebApplicationDimensionDefinition> getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(List<WebApplicationDimensionDefinition> dimensions) {
    this.dimensions = dimensions;
  }


  public WebApplicationMetric userActionFilter(UserActionFilter userActionFilter) {
    this.userActionFilter = userActionFilter;
    return this;
  }

   /**
   * Get userActionFilter
   * @return userActionFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ACTION_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserActionFilter getUserActionFilter() {
    return userActionFilter;
  }


  @JsonProperty(JSON_PROPERTY_USER_ACTION_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserActionFilter(UserActionFilter userActionFilter) {
    this.userActionFilter = userActionFilter;
  }


  /**
   * Return true if this WebApplicationMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebApplicationMetric webApplicationMetric = (WebApplicationMetric) o;
    return Objects.equals(this.applicationIdentifier, webApplicationMetric.applicationIdentifier) &&
        Objects.equals(this.name, webApplicationMetric.name) &&
        Objects.equals(this.metricKey, webApplicationMetric.metricKey) &&
        Objects.equals(this.enabled, webApplicationMetric.enabled) &&
        Objects.equals(this.metricDefinition, webApplicationMetric.metricDefinition) &&
        Objects.equals(this.dimensions, webApplicationMetric.dimensions) &&
        Objects.equals(this.userActionFilter, webApplicationMetric.userActionFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIdentifier, name, metricKey, enabled, metricDefinition, dimensions, userActionFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebApplicationMetric {\n");
    sb.append("    applicationIdentifier: ").append(toIndentedString(applicationIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metricKey: ").append(toIndentedString(metricKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metricDefinition: ").append(toIndentedString(metricDefinition)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    userActionFilter: ").append(toIndentedString(userActionFilter)).append("\n");
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
