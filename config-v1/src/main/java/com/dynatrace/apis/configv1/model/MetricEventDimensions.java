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
import com.dynatrace.apis.configv1.model.MetricEventEntityDimensions;
import com.dynatrace.apis.configv1.model.MetricEventStringDimensions;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * A single filter for the metrics dimensions.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).
 */
@ApiModel(description = "A single filter for the metrics dimensions.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).")
@JsonPropertyOrder({
  MetricEventDimensions.JSON_PROPERTY_FILTER_TYPE,
  MetricEventDimensions.JSON_PROPERTY_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "filterType", // ignore manually set filterType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the filterType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "filterType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = MetricEventEntityDimensions.class, name = "MetricEventEntityDimensions"),
  @JsonSubTypes.Type(value = MetricEventStringDimensions.class, name = "MetricEventStringDimensions"),
})

public class MetricEventDimensions {
  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY&#x60; -&gt; MetricEventEntityDimensions  * &#x60;STRING&#x60; -&gt; MetricEventStringDimensions  
   */
  public enum FilterTypeEnum {
    ENTITY("ENTITY"),
    
    STRING("STRING");

    private String value;

    FilterTypeEnum(String value) {
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
    public static FilterTypeEnum fromValue(String value) {
      for (FilterTypeEnum b : FilterTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FILTER_TYPE = "filterType";
  private FilterTypeEnum filterType;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public MetricEventDimensions() { 
  }

  public MetricEventDimensions filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY&#x60; -&gt; MetricEventEntityDimensions  * &#x60;STRING&#x60; -&gt; MetricEventStringDimensions  
   * @return filterType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `ENTITY` -> MetricEventEntityDimensions  * `STRING` -> MetricEventStringDimensions  ")
  @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FilterTypeEnum getFilterType() {
    return filterType;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  public MetricEventDimensions key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The dimensions key on the metric.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dimensions key on the metric.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Return true if this MetricEventDimensions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricEventDimensions metricEventDimensions = (MetricEventDimensions) o;
    return Objects.equals(this.filterType, metricEventDimensions.filterType) &&
        Objects.equals(this.key, metricEventDimensions.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricEventDimensions {\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("MetricEventEntityDimensions", MetricEventEntityDimensions.class);
  mappings.put("MetricEventStringDimensions", MetricEventStringDimensions.class);
  mappings.put("MetricEventDimensions", MetricEventDimensions.class);
  JSON.registerDiscriminator(MetricEventDimensions.class, "filterType", mappings);
}
}
