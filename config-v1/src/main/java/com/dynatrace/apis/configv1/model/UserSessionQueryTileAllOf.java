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
import com.dynatrace.apis.configv1.model.UserSessionQueryTileConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UserSessionQueryTileAllOf
 */
@JsonPropertyOrder({
  UserSessionQueryTileAllOf.JSON_PROPERTY_CUSTOM_NAME,
  UserSessionQueryTileAllOf.JSON_PROPERTY_QUERY,
  UserSessionQueryTileAllOf.JSON_PROPERTY_TYPE,
  UserSessionQueryTileAllOf.JSON_PROPERTY_TIME_FRAME_SHIFT,
  UserSessionQueryTileAllOf.JSON_PROPERTY_VISUALIZATION_CONFIG,
  UserSessionQueryTileAllOf.JSON_PROPERTY_LIMIT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class UserSessionQueryTileAllOf {
  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  /**
   * The visualization of the tile.
   */
  public enum TypeEnum {
    COLUMN_CHART("COLUMN_CHART"),
    
    FUNNEL("FUNNEL"),
    
    LINE_CHART("LINE_CHART"),
    
    NOT_CONFIGURED("NOT_CONFIGURED"),
    
    PIE_CHART("PIE_CHART"),
    
    SINGLE_VALUE("SINGLE_VALUE"),
    
    TABLE("TABLE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TIME_FRAME_SHIFT = "timeFrameShift";
  private String timeFrameShift;

  public static final String JSON_PROPERTY_VISUALIZATION_CONFIG = "visualizationConfig";
  private UserSessionQueryTileConfiguration visualizationConfig;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public UserSessionQueryTileAllOf() { 
  }

  public UserSessionQueryTileAllOf customName(String customName) {
    this.customName = customName;
    return this;
  }

   /**
   * The name of the tile, set by user.
   * @return customName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the tile, set by user.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomName() {
    return customName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomName(String customName) {
    this.customName = customName;
  }


  public UserSessionQueryTileAllOf query(String query) {
    this.query = query;
    return this;
  }

   /**
   * A [user session query](https://dt-url.net/dtusql) executed by the tile.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A [user session query](https://dt-url.net/dtusql) executed by the tile.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(String query) {
    this.query = query;
  }


  public UserSessionQueryTileAllOf type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The visualization of the tile.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The visualization of the tile.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UserSessionQueryTileAllOf timeFrameShift(String timeFrameShift) {
    this.timeFrameShift = timeFrameShift;
    return this;
  }

   /**
   * The comparison timeframe of the query.    If specified, you additionally get the results of the same query with the specified time shift.
   * @return timeFrameShift
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comparison timeframe of the query.    If specified, you additionally get the results of the same query with the specified time shift.")
  @JsonProperty(JSON_PROPERTY_TIME_FRAME_SHIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeFrameShift() {
    return timeFrameShift;
  }


  @JsonProperty(JSON_PROPERTY_TIME_FRAME_SHIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeFrameShift(String timeFrameShift) {
    this.timeFrameShift = timeFrameShift;
  }


  public UserSessionQueryTileAllOf visualizationConfig(UserSessionQueryTileConfiguration visualizationConfig) {
    this.visualizationConfig = visualizationConfig;
    return this;
  }

   /**
   * Get visualizationConfig
   * @return visualizationConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VISUALIZATION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserSessionQueryTileConfiguration getVisualizationConfig() {
    return visualizationConfig;
  }


  @JsonProperty(JSON_PROPERTY_VISUALIZATION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualizationConfig(UserSessionQueryTileConfiguration visualizationConfig) {
    this.visualizationConfig = visualizationConfig;
  }


  public UserSessionQueryTileAllOf limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The limit of the results, if not set will use the default value of the system
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit of the results, if not set will use the default value of the system")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  /**
   * Return true if this UserSessionQueryTile_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSessionQueryTileAllOf userSessionQueryTileAllOf = (UserSessionQueryTileAllOf) o;
    return Objects.equals(this.customName, userSessionQueryTileAllOf.customName) &&
        Objects.equals(this.query, userSessionQueryTileAllOf.query) &&
        Objects.equals(this.type, userSessionQueryTileAllOf.type) &&
        Objects.equals(this.timeFrameShift, userSessionQueryTileAllOf.timeFrameShift) &&
        Objects.equals(this.visualizationConfig, userSessionQueryTileAllOf.visualizationConfig) &&
        Objects.equals(this.limit, userSessionQueryTileAllOf.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customName, query, type, timeFrameShift, visualizationConfig, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSessionQueryTileAllOf {\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeFrameShift: ").append(toIndentedString(timeFrameShift)).append("\n");
    sb.append("    visualizationConfig: ").append(toIndentedString(visualizationConfig)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

