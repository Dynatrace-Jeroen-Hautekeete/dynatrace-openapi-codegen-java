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
import com.dynatrace.apis.configv1.model.SyntheticMetricDimension;
import com.dynatrace.apis.configv1.model.SyntheticMetricFilter;
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
 * Definition of the calculated synthetic metric.
 */
@ApiModel(description = "Definition of the calculated synthetic metric.")
@JsonPropertyOrder({
  CalculatedSyntheticMetric.JSON_PROPERTY_MONITOR_IDENTIFIER,
  CalculatedSyntheticMetric.JSON_PROPERTY_NAME,
  CalculatedSyntheticMetric.JSON_PROPERTY_METRIC_KEY,
  CalculatedSyntheticMetric.JSON_PROPERTY_ENABLED,
  CalculatedSyntheticMetric.JSON_PROPERTY_METRIC,
  CalculatedSyntheticMetric.JSON_PROPERTY_DIMENSIONS,
  CalculatedSyntheticMetric.JSON_PROPERTY_FILTER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CalculatedSyntheticMetric {
  public static final String JSON_PROPERTY_MONITOR_IDENTIFIER = "monitorIdentifier";
  private String monitorIdentifier;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METRIC_KEY = "metricKey";
  private String metricKey;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  /**
   * The type of the synthetic metric.
   */
  public enum MetricEnum {
    APPLICATIONCACHE("ApplicationCache"),
    
    CALLBACK("Callback"),
    
    CUMULATIVELAYOUTSHIFT("CumulativeLayoutShift"),
    
    DNSLOOKUP("DNSLookup"),
    
    DOMCOMPLETE("DOMComplete"),
    
    DOMCONTENTLOADED("DOMContentLoaded"),
    
    DOMINTERACTIVE("DOMInteractive"),
    
    FAILEDREQUESTSRESOURCES("FailedRequestsResources"),
    
    FIRSTCONTENTFULPAINT("FirstContentfulPaint"),
    
    FIRSTINPUTDELAY("FirstInputDelay"),
    
    FIRSTINPUTSTART("FirstInputStart"),
    
    FIRSTPAINT("FirstPaint"),
    
    HTMLDOWNLOADED("HTMLDownloaded"),
    
    HTTPERRORS("HttpErrors"),
    
    JAVASCRIPTERRORS("JavaScriptErrors"),
    
    LARGESTCONTENTFULPAINT("LargestContentfulPaint"),
    
    LOADEVENTEND("LoadEventEnd"),
    
    LOADEVENTSTART("LoadEventStart"),
    
    LONGTASKS("LongTasks"),
    
    NAVIGATIONSTART("NavigationStart"),
    
    ONDOMCONTENTLOADED("OnDOMContentLoaded"),
    
    ONLOAD("OnLoad"),
    
    PROCESSING("Processing"),
    
    REDIRECTTIME("RedirectTime"),
    
    REQUEST("Request"),
    
    REQUESTSTART("RequestStart"),
    
    RESOURCECOUNT("ResourceCount"),
    
    RESPONSE("Response"),
    
    SECURECONNECT("SecureConnect"),
    
    SPEEDINDEX("SpeedIndex"),
    
    TCPCONNECT("TCPConnect"),
    
    TIMETOFIRSTBYTE("TimeToFirstByte"),
    
    TOTALDURATION("TotalDuration"),
    
    TRANSFERSIZE("TransferSize"),
    
    USERACTIONDURATION("UserActionDuration"),
    
    VISUALLYCOMPLETE("VisuallyComplete");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MetricEnum fromValue(String value) {
      for (MetricEnum b : MetricEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_METRIC = "metric";
  private MetricEnum metric;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private List<SyntheticMetricDimension> dimensions = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SyntheticMetricFilter filter;

  public CalculatedSyntheticMetric() { 
  }

  public CalculatedSyntheticMetric monitorIdentifier(String monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
    return this;
  }

   /**
   * The Dynatrace entity ID of the synthetic monitor to which the metric belongs.
   * @return monitorIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Dynatrace entity ID of the synthetic monitor to which the metric belongs.")
  @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMonitorIdentifier() {
    return monitorIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitorIdentifier(String monitorIdentifier) {
    this.monitorIdentifier = monitorIdentifier;
  }


  public CalculatedSyntheticMetric name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the metric, displayed in the UI.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the metric, displayed in the UI.")
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


  public CalculatedSyntheticMetric metricKey(String metricKey) {
    this.metricKey = metricKey;
    return this;
  }

   /**
   * The unique key of the metric.    The key must have the &#x60;calc:synthetic&#x60; prefix.
   * @return metricKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique key of the metric.    The key must have the `calc:synthetic` prefix.")
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


  public CalculatedSyntheticMetric enabled(Boolean enabled) {
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


  public CalculatedSyntheticMetric metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The type of the synthetic metric.
   * @return metric
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the synthetic metric.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MetricEnum getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  public CalculatedSyntheticMetric dimensions(List<SyntheticMetricDimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public CalculatedSyntheticMetric addDimensionsItem(SyntheticMetricDimension dimensionsItem) {
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

  public List<SyntheticMetricDimension> getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(List<SyntheticMetricDimension> dimensions) {
    this.dimensions = dimensions;
  }


  public CalculatedSyntheticMetric filter(SyntheticMetricFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticMetricFilter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(SyntheticMetricFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this CalculatedSyntheticMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatedSyntheticMetric calculatedSyntheticMetric = (CalculatedSyntheticMetric) o;
    return Objects.equals(this.monitorIdentifier, calculatedSyntheticMetric.monitorIdentifier) &&
        Objects.equals(this.name, calculatedSyntheticMetric.name) &&
        Objects.equals(this.metricKey, calculatedSyntheticMetric.metricKey) &&
        Objects.equals(this.enabled, calculatedSyntheticMetric.enabled) &&
        Objects.equals(this.metric, calculatedSyntheticMetric.metric) &&
        Objects.equals(this.dimensions, calculatedSyntheticMetric.dimensions) &&
        Objects.equals(this.filter, calculatedSyntheticMetric.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorIdentifier, name, metricKey, enabled, metric, dimensions, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatedSyntheticMetric {\n");
    sb.append("    monitorIdentifier: ").append(toIndentedString(monitorIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metricKey: ").append(toIndentedString(metricKey)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
