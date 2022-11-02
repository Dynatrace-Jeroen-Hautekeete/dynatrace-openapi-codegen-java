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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Filtering parameters for a timeseries query.
 */
@ApiModel(description = "Filtering parameters for a timeseries query.")
@JsonPropertyOrder({
  TimeseriesQueryMessage.JSON_PROPERTY_TIMESERIES_ID,
  TimeseriesQueryMessage.JSON_PROPERTY_AGGREGATION_TYPE,
  TimeseriesQueryMessage.JSON_PROPERTY_START_TIMESTAMP,
  TimeseriesQueryMessage.JSON_PROPERTY_END_TIMESTAMP,
  TimeseriesQueryMessage.JSON_PROPERTY_PREDICT,
  TimeseriesQueryMessage.JSON_PROPERTY_RELATIVE_TIME,
  TimeseriesQueryMessage.JSON_PROPERTY_QUERY_MODE,
  TimeseriesQueryMessage.JSON_PROPERTY_ENTITIES,
  TimeseriesQueryMessage.JSON_PROPERTY_TAGS,
  TimeseriesQueryMessage.JSON_PROPERTY_FILTERS,
  TimeseriesQueryMessage.JSON_PROPERTY_PERCENTILE,
  TimeseriesQueryMessage.JSON_PROPERTY_INCLUDE_PARENT_IDS,
  TimeseriesQueryMessage.JSON_PROPERTY_CONSIDER_MAINTENANCE_WINDOWS_FOR_AVAILABILITY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class TimeseriesQueryMessage {
  public static final String JSON_PROPERTY_TIMESERIES_ID = "timeseriesId";
  private String timeseriesId;

  /**
   * The aggregation type for the resulting data points.   If the requested metric doesn&#39;t support the specified aggregation, the request will result in an error.
   */
  public enum AggregationTypeEnum {
    AVG("AVG"),
    
    COUNT("COUNT"),
    
    MAX("MAX"),
    
    MEDIAN("MEDIAN"),
    
    MIN("MIN"),
    
    PERCENTILE("PERCENTILE"),
    
    SUM("SUM");

    private String value;

    AggregationTypeEnum(String value) {
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
    public static AggregationTypeEnum fromValue(String value) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregationType";
  private AggregationTypeEnum aggregationType;

  public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
  private Long startTimestamp;

  public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
  private Long endTimestamp;

  public static final String JSON_PROPERTY_PREDICT = "predict";
  private Boolean predict;

  /**
   * The relative timeframe, back from the current time.
   */
  public enum RelativeTimeEnum {
    _10MINS("10mins"),
    
    _15MINS("15mins"),
    
    _2HOURS("2hours"),
    
    _30MINS("30mins"),
    
    _3DAYS("3days"),
    
    _5MINS("5mins"),
    
    _6HOURS("6hours"),
    
    DAY("day"),
    
    HOUR("hour"),
    
    MIN("min"),
    
    MONTH("month"),
    
    WEEK("week");

    private String value;

    RelativeTimeEnum(String value) {
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
    public static RelativeTimeEnum fromValue(String value) {
      for (RelativeTimeEnum b : RelativeTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RELATIVE_TIME = "relativeTime";
  private RelativeTimeEnum relativeTime;

  /**
   * Defines the type of result that the call should return. Valid result modes are:  &#x60;series&#x60;: returns all the data points of the metric in the specified timeframe.  &#x60;total&#x60;: returns one scalar value for the specified timeframe.   By default, the &#x60;series&#x60; mode is used.
   */
  public enum QueryModeEnum {
    SERIES("SERIES"),
    
    TOTAL("TOTAL");

    private String value;

    QueryModeEnum(String value) {
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
    public static QueryModeEnum fromValue(String value) {
      for (QueryModeEnum b : QueryModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUERY_MODE = "queryMode";
  private QueryModeEnum queryMode;

  public static final String JSON_PROPERTY_ENTITIES = "entities";
  private Set<String> entities = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Set<String> tags = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Map<String, String> filters = null;

  public static final String JSON_PROPERTY_PERCENTILE = "percentile";
  private Integer percentile;

  public static final String JSON_PROPERTY_INCLUDE_PARENT_IDS = "includeParentIds";
  private Boolean includeParentIds;

  public static final String JSON_PROPERTY_CONSIDER_MAINTENANCE_WINDOWS_FOR_AVAILABILITY = "considerMaintenanceWindowsForAvailability";
  private Boolean considerMaintenanceWindowsForAvailability;

  public TimeseriesQueryMessage() { 
  }

  public TimeseriesQueryMessage timeseriesId(String timeseriesId) {
    this.timeseriesId = timeseriesId;
    return this;
  }

   /**
   * The case-sensitive ID of the metric, where you want to read data points.   You can execute a GET timeseries request, to obtain the list of available metrics.
   * @return timeseriesId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The case-sensitive ID of the metric, where you want to read data points.   You can execute a GET timeseries request, to obtain the list of available metrics.")
  @JsonProperty(JSON_PROPERTY_TIMESERIES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeseriesId() {
    return timeseriesId;
  }


  @JsonProperty(JSON_PROPERTY_TIMESERIES_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeseriesId(String timeseriesId) {
    this.timeseriesId = timeseriesId;
  }


  public TimeseriesQueryMessage aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * The aggregation type for the resulting data points.   If the requested metric doesn&#39;t support the specified aggregation, the request will result in an error.
   * @return aggregationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregation type for the resulting data points.   If the requested metric doesn't support the specified aggregation, the request will result in an error.")
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }


  public TimeseriesQueryMessage startTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

   /**
   * The start timestamp of the timeframe, in UTC milliseconds.
   * @return startTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start timestamp of the timeframe, in UTC milliseconds.")
  @JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartTimestamp() {
    return startTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTimestamp(Long startTimestamp) {
    this.startTimestamp = startTimestamp;
  }


  public TimeseriesQueryMessage endTimestamp(Long endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

   /**
   * The start timestamp of the timeframe, in UTC milliseconds.   If later than the current time, Dynatrace automatically uses current time instead.   The timeframe must not exceed 6 months.
   * @return endTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start timestamp of the timeframe, in UTC milliseconds.   If later than the current time, Dynatrace automatically uses current time instead.   The timeframe must not exceed 6 months.")
  @JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndTimestamp() {
    return endTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTimestamp(Long endTimestamp) {
    this.endTimestamp = endTimestamp;
  }


  public TimeseriesQueryMessage predict(Boolean predict) {
    this.predict = predict;
    return this;
  }

   /**
   * The flag to predict future data points.
   * @return predict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flag to predict future data points.")
  @JsonProperty(JSON_PROPERTY_PREDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPredict() {
    return predict;
  }


  @JsonProperty(JSON_PROPERTY_PREDICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredict(Boolean predict) {
    this.predict = predict;
  }


  public TimeseriesQueryMessage relativeTime(RelativeTimeEnum relativeTime) {
    this.relativeTime = relativeTime;
    return this;
  }

   /**
   * The relative timeframe, back from the current time.
   * @return relativeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The relative timeframe, back from the current time.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelativeTimeEnum getRelativeTime() {
    return relativeTime;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeTime(RelativeTimeEnum relativeTime) {
    this.relativeTime = relativeTime;
  }


  public TimeseriesQueryMessage queryMode(QueryModeEnum queryMode) {
    this.queryMode = queryMode;
    return this;
  }

   /**
   * Defines the type of result that the call should return. Valid result modes are:  &#x60;series&#x60;: returns all the data points of the metric in the specified timeframe.  &#x60;total&#x60;: returns one scalar value for the specified timeframe.   By default, the &#x60;series&#x60; mode is used.
   * @return queryMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the type of result that the call should return. Valid result modes are:  `series`: returns all the data points of the metric in the specified timeframe.  `total`: returns one scalar value for the specified timeframe.   By default, the `series` mode is used.")
  @JsonProperty(JSON_PROPERTY_QUERY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QueryModeEnum getQueryMode() {
    return queryMode;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryMode(QueryModeEnum queryMode) {
    this.queryMode = queryMode;
  }


  public TimeseriesQueryMessage entities(Set<String> entities) {
    this.entities = entities;
    return this;
  }

  public TimeseriesQueryMessage addEntitiesItem(String entitiesItem) {
    if (this.entities == null) {
      this.entities = new LinkedHashSet<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Filters requested data points by entities which should deliver them. You can specify several entities at once.   Allowed values are Dynatrace entity IDs.   If the selected entity doesn&#39;t support the requested metric, the request will result in an error.
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filters requested data points by entities which should deliver them. You can specify several entities at once.   Allowed values are Dynatrace entity IDs.   If the selected entity doesn't support the requested metric, the request will result in an error.")
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getEntities() {
    return entities;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntities(Set<String> entities) {
    this.entities = entities;
  }


  public TimeseriesQueryMessage tags(Set<String> tags) {
    this.tags = tags;
    return this;
  }

  public TimeseriesQueryMessage addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Filters requiested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: &#x60;tags&#x3D;tag1&amp;tags&#x3D;tag2&#x60;. The entity has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: &#x60;[context]key:value&#x60;.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filters requiested data points by entity which should deliver them. Only data from entities with the specified tag is delivered.   You can specify several tags in the following format: `tags=tag1&tags=tag2`. The entity has to match *all* the specified tags.   In case of key-value tags, such as imported AWS or CloudFoundry tags use following format: `[context]key:value`.")
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


  public TimeseriesQueryMessage filters(Map<String, String> filters) {
    this.filters = filters;
    return this;
  }

  public TimeseriesQueryMessage putFiltersItem(String key, String filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * A filter is an object, containing map of filter keys and its values. Valid filter keys are:   &#x60;processType&#x60;: Filters by process type. See Process types for allowed values. &#x60;osType&#x60;: Filters by operating system. See OS types for allowed values. &#x60;serviceType&#x60;: Filters by service type. See Service types for allowed values. &#x60;technology&#x60;: Filters by technology type. See Technology types for allowed values. &#x60;webServiceName&#x60;: Filters by web service name. &#x60;webServiceNamespace&#x60;: Filters by the web service namespace. &#x60;host&#x60;: Filters by entity ID of the host, for example HOST-007.
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A filter is an object, containing map of filter keys and its values. Valid filter keys are:   `processType`: Filters by process type. See Process types for allowed values. `osType`: Filters by operating system. See OS types for allowed values. `serviceType`: Filters by service type. See Service types for allowed values. `technology`: Filters by technology type. See Technology types for allowed values. `webServiceName`: Filters by web service name. `webServiceNamespace`: Filters by the web service namespace. `host`: Filters by entity ID of the host, for example HOST-007.")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(Map<String, String> filters) {
    this.filters = filters;
  }


  public TimeseriesQueryMessage percentile(Integer percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * Specifies which percentile of the selected response time metric should be delivered.  Only applicable to the &#x60;PERCENTILE&#x60; aggregation type.   Valid values for percentile are between 1 and 99.   Please keep in mind that percentile export is only possible for response-time based metrics such as application and service response times.
   * @return percentile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which percentile of the selected response time metric should be delivered.  Only applicable to the `PERCENTILE` aggregation type.   Valid values for percentile are between 1 and 99.   Please keep in mind that percentile export is only possible for response-time based metrics such as application and service response times.")
  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPercentile() {
    return percentile;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentile(Integer percentile) {
    this.percentile = percentile;
  }


  public TimeseriesQueryMessage includeParentIds(Boolean includeParentIds) {
    this.includeParentIds = includeParentIds;
    return this;
  }

   /**
   * Specifies whether the results should exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001
   * @return includeParentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the results should exposes dimension mappings between parent entities and their children.  For instance: SERVICE-0000000000000001, SERVICE_METHOD-0000000000000001")
  @JsonProperty(JSON_PROPERTY_INCLUDE_PARENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeParentIds() {
    return includeParentIds;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_PARENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeParentIds(Boolean includeParentIds) {
    this.includeParentIds = includeParentIds;
  }


  public TimeseriesQueryMessage considerMaintenanceWindowsForAvailability(Boolean considerMaintenanceWindowsForAvailability) {
    this.considerMaintenanceWindowsForAvailability = considerMaintenanceWindowsForAvailability;
    return this;
  }

   /**
   * Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment.
   * @return considerMaintenanceWindowsForAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exclude (`true`) or include (`false`) data points from any [maintenance window](https://dt-url.net/b2123rg0), defined in your environment.")
  @JsonProperty(JSON_PROPERTY_CONSIDER_MAINTENANCE_WINDOWS_FOR_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConsiderMaintenanceWindowsForAvailability() {
    return considerMaintenanceWindowsForAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CONSIDER_MAINTENANCE_WINDOWS_FOR_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsiderMaintenanceWindowsForAvailability(Boolean considerMaintenanceWindowsForAvailability) {
    this.considerMaintenanceWindowsForAvailability = considerMaintenanceWindowsForAvailability;
  }


  /**
   * Return true if this TimeseriesQueryMessage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesQueryMessage timeseriesQueryMessage = (TimeseriesQueryMessage) o;
    return Objects.equals(this.timeseriesId, timeseriesQueryMessage.timeseriesId) &&
        Objects.equals(this.aggregationType, timeseriesQueryMessage.aggregationType) &&
        Objects.equals(this.startTimestamp, timeseriesQueryMessage.startTimestamp) &&
        Objects.equals(this.endTimestamp, timeseriesQueryMessage.endTimestamp) &&
        Objects.equals(this.predict, timeseriesQueryMessage.predict) &&
        Objects.equals(this.relativeTime, timeseriesQueryMessage.relativeTime) &&
        Objects.equals(this.queryMode, timeseriesQueryMessage.queryMode) &&
        Objects.equals(this.entities, timeseriesQueryMessage.entities) &&
        Objects.equals(this.tags, timeseriesQueryMessage.tags) &&
        Objects.equals(this.filters, timeseriesQueryMessage.filters) &&
        Objects.equals(this.percentile, timeseriesQueryMessage.percentile) &&
        Objects.equals(this.includeParentIds, timeseriesQueryMessage.includeParentIds) &&
        Objects.equals(this.considerMaintenanceWindowsForAvailability, timeseriesQueryMessage.considerMaintenanceWindowsForAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeseriesId, aggregationType, startTimestamp, endTimestamp, predict, relativeTime, queryMode, entities, tags, filters, percentile, includeParentIds, considerMaintenanceWindowsForAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesQueryMessage {\n");
    sb.append("    timeseriesId: ").append(toIndentedString(timeseriesId)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    predict: ").append(toIndentedString(predict)).append("\n");
    sb.append("    relativeTime: ").append(toIndentedString(relativeTime)).append("\n");
    sb.append("    queryMode: ").append(toIndentedString(queryMode)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    includeParentIds: ").append(toIndentedString(includeParentIds)).append("\n");
    sb.append("    considerMaintenanceWindowsForAvailability: ").append(toIndentedString(considerMaintenanceWindowsForAvailability)).append("\n");
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
