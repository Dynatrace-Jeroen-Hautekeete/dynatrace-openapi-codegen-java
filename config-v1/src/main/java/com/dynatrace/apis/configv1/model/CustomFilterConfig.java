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
import com.dynatrace.apis.configv1.model.CustomFilterChartConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of the custom filter of a tile.
 */
@ApiModel(description = "Configuration of the custom filter of a tile.")
@JsonPropertyOrder({
  CustomFilterConfig.JSON_PROPERTY_TYPE,
  CustomFilterConfig.JSON_PROPERTY_CUSTOM_NAME,
  CustomFilterConfig.JSON_PROPERTY_DEFAULT_NAME,
  CustomFilterConfig.JSON_PROPERTY_CHART_CONFIG,
  CustomFilterConfig.JSON_PROPERTY_FILTERS_PER_ENTITY_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CustomFilterConfig {
  /**
   * The type of the filter.    It shows to which entity the filter belongs.    Custom charts have the &#x60;MIXED&#x60; type.
   */
  public enum TypeEnum {
    ALB("ALB"),
    
    APPLICATION("APPLICATION"),
    
    APPLICATION_METHOD("APPLICATION_METHOD"),
    
    APPMON("APPMON"),
    
    ASG("ASG"),
    
    AWS_CREDENTIALS("AWS_CREDENTIALS"),
    
    AWS_CUSTOM_SERVICE("AWS_CUSTOM_SERVICE"),
    
    AWS_LAMBDA_FUNCTION("AWS_LAMBDA_FUNCTION"),
    
    CLOUD_APPLICATION("CLOUD_APPLICATION"),
    
    CLOUD_APPLICATION_INSTANCE("CLOUD_APPLICATION_INSTANCE"),
    
    CLOUD_APPLICATION_NAMESPACE("CLOUD_APPLICATION_NAMESPACE"),
    
    CONTAINER_GROUP_INSTANCE("CONTAINER_GROUP_INSTANCE"),
    
    CUSTOM_APPLICATION("CUSTOM_APPLICATION"),
    
    CUSTOM_DEVICES("CUSTOM_DEVICES"),
    
    CUSTOM_SERVICES("CUSTOM_SERVICES"),
    
    DATABASE("DATABASE"),
    
    DATABASE_KEY_REQUEST("DATABASE_KEY_REQUEST"),
    
    DCRUM_APPLICATION("DCRUM_APPLICATION"),
    
    DCRUM_ENTITY("DCRUM_ENTITY"),
    
    DYNAMO_DB("DYNAMO_DB"),
    
    EBS("EBS"),
    
    EC2("EC2"),
    
    ELB("ELB"),
    
    ENVIRONMENT("ENVIRONMENT"),
    
    ESXI("ESXI"),
    
    EXTERNAL_SYNTHETIC_TEST("EXTERNAL_SYNTHETIC_TEST"),
    
    GLOBAL_BACKGROUND_ACTIVITY("GLOBAL_BACKGROUND_ACTIVITY"),
    
    HOST("HOST"),
    
    IOT("IOT"),
    
    KUBERNETES_CLUSTER("KUBERNETES_CLUSTER"),
    
    KUBERNETES_NODE("KUBERNETES_NODE"),
    
    MDA_SERVICE("MDA_SERVICE"),
    
    MIXED("MIXED"),
    
    MOBILE_APPLICATION("MOBILE_APPLICATION"),
    
    MONITORED_ENTITY("MONITORED_ENTITY"),
    
    NLB("NLB"),
    
    PG_BACKGROUND_ACTIVITY("PG_BACKGROUND_ACTIVITY"),
    
    PROBLEM("PROBLEM"),
    
    PROCESS_GROUP_INSTANCE("PROCESS_GROUP_INSTANCE"),
    
    RDS("RDS"),
    
    REMOTE_PLUGIN("REMOTE_PLUGIN"),
    
    SERVICE("SERVICE"),
    
    SERVICE_KEY_REQUEST("SERVICE_KEY_REQUEST"),
    
    SYNTHETIC_BROWSER_MONITOR("SYNTHETIC_BROWSER_MONITOR"),
    
    SYNTHETIC_HTTPCHECK("SYNTHETIC_HTTPCHECK"),
    
    SYNTHETIC_HTTPCHECK_STEP("SYNTHETIC_HTTPCHECK_STEP"),
    
    SYNTHETIC_LOCATION("SYNTHETIC_LOCATION"),
    
    SYNTHETIC_TEST("SYNTHETIC_TEST"),
    
    SYNTHETIC_TEST_STEP("SYNTHETIC_TEST_STEP"),
    
    UI_ENTITY("UI_ENTITY"),
    
    VIRTUAL_MACHINE("VIRTUAL_MACHINE"),
    
    WEB_CHECK("WEB_CHECK");

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

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_DEFAULT_NAME = "defaultName";
  private String defaultName;

  public static final String JSON_PROPERTY_CHART_CONFIG = "chartConfig";
  private CustomFilterChartConfig chartConfig;

  public static final String JSON_PROPERTY_FILTERS_PER_ENTITY_TYPE = "filtersPerEntityType";
  private Map<String, Map<String, Set<String>>> filtersPerEntityType = new HashMap<>();

  public CustomFilterConfig() { 
  }

  public CustomFilterConfig type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the filter.    It shows to which entity the filter belongs.    Custom charts have the &#x60;MIXED&#x60; type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the filter.    It shows to which entity the filter belongs.    Custom charts have the `MIXED` type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CustomFilterConfig customName(String customName) {
    this.customName = customName;
    return this;
  }

   /**
   * The name of the tile, set by user
   * @return customName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the tile, set by user")
  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomName() {
    return customName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomName(String customName) {
    this.customName = customName;
  }


  public CustomFilterConfig defaultName(String defaultName) {
    this.defaultName = defaultName;
    return this;
  }

   /**
   * The default name of the tile
   * @return defaultName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default name of the tile")
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultName() {
    return defaultName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }


  public CustomFilterConfig chartConfig(CustomFilterChartConfig chartConfig) {
    this.chartConfig = chartConfig;
    return this;
  }

   /**
   * Get chartConfig
   * @return chartConfig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHART_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomFilterChartConfig getChartConfig() {
    return chartConfig;
  }


  @JsonProperty(JSON_PROPERTY_CHART_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChartConfig(CustomFilterChartConfig chartConfig) {
    this.chartConfig = chartConfig;
  }


  public CustomFilterConfig filtersPerEntityType(Map<String, Map<String, Set<String>>> filtersPerEntityType) {
    this.filtersPerEntityType = filtersPerEntityType;
    return this;
  }

  public CustomFilterConfig putFiltersPerEntityTypeItem(String key, Map<String, Set<String>> filtersPerEntityTypeItem) {
    this.filtersPerEntityType.put(key, filtersPerEntityTypeItem);
    return this;
  }

   /**
   * A list of filters, applied to specific entity types.
   * @return filtersPerEntityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of filters, applied to specific entity types.")
  @JsonProperty(JSON_PROPERTY_FILTERS_PER_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Map<String, Set<String>>> getFiltersPerEntityType() {
    return filtersPerEntityType;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS_PER_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiltersPerEntityType(Map<String, Map<String, Set<String>>> filtersPerEntityType) {
    this.filtersPerEntityType = filtersPerEntityType;
  }


  /**
   * Return true if this CustomFilterConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFilterConfig customFilterConfig = (CustomFilterConfig) o;
    return Objects.equals(this.type, customFilterConfig.type) &&
        Objects.equals(this.customName, customFilterConfig.customName) &&
        Objects.equals(this.defaultName, customFilterConfig.defaultName) &&
        Objects.equals(this.chartConfig, customFilterConfig.chartConfig) &&
        Objects.equals(this.filtersPerEntityType, customFilterConfig.filtersPerEntityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, customName, defaultName, chartConfig, filtersPerEntityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFilterConfig {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    chartConfig: ").append(toIndentedString(chartConfig)).append("\n");
    sb.append("    filtersPerEntityType: ").append(toIndentedString(filtersPerEntityType)).append("\n");
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
