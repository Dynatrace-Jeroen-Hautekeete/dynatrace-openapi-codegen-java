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
import com.dynatrace.apis.configv1.model.CustomDeviceGroupNameAlertingScope;
import com.dynatrace.apis.configv1.model.EntityIdAlertingScope;
import com.dynatrace.apis.configv1.model.HostGroupNameAlertingScope;
import com.dynatrace.apis.configv1.model.HostNameAlertingScope;
import com.dynatrace.apis.configv1.model.ManagementZoneAlertingScope;
import com.dynatrace.apis.configv1.model.NameAlertingScope;
import com.dynatrace.apis.configv1.model.ProcessGroupIdAlertingScope;
import com.dynatrace.apis.configv1.model.ProcessGroupNameAlertingScope;
import com.dynatrace.apis.configv1.model.TagFilterAlertingScope;
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
 * A single filter for the alerting scope.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).
 */
@ApiModel(description = "A single filter for the alerting scope.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).")
@JsonPropertyOrder({
  MetricEventAlertingScope.JSON_PROPERTY_FILTER_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "filterType", // ignore manually set filterType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the filterType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "filterType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CustomDeviceGroupNameAlertingScope.class, name = "CustomDeviceGroupNameAlertingScope"),
  @JsonSubTypes.Type(value = EntityIdAlertingScope.class, name = "EntityIdAlertingScope"),
  @JsonSubTypes.Type(value = HostGroupNameAlertingScope.class, name = "HostGroupNameAlertingScope"),
  @JsonSubTypes.Type(value = HostNameAlertingScope.class, name = "HostNameAlertingScope"),
  @JsonSubTypes.Type(value = ManagementZoneAlertingScope.class, name = "ManagementZoneAlertingScope"),
  @JsonSubTypes.Type(value = NameAlertingScope.class, name = "NameAlertingScope"),
  @JsonSubTypes.Type(value = ProcessGroupIdAlertingScope.class, name = "ProcessGroupIdAlertingScope"),
  @JsonSubTypes.Type(value = ProcessGroupNameAlertingScope.class, name = "ProcessGroupNameAlertingScope"),
  @JsonSubTypes.Type(value = TagFilterAlertingScope.class, name = "TagFilterAlertingScope"),
})

public class MetricEventAlertingScope {
  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY_ID&#x60; -&gt; EntityIdAlertingScope  * &#x60;MANAGEMENT_ZONE&#x60; -&gt; ManagementZoneAlertingScope  * &#x60;TAG&#x60; -&gt; TagFilterAlertingScope  * &#x60;NAME&#x60; -&gt; NameAlertingScope  * &#x60;CUSTOM_DEVICE_GROUP_NAME&#x60; -&gt; CustomDeviceGroupNameAlertingScope  * &#x60;HOST_GROUP_NAME&#x60; -&gt; HostGroupNameAlertingScope  * &#x60;HOST_NAME&#x60; -&gt; HostNameAlertingScope  * &#x60;PROCESS_GROUP_ID&#x60; -&gt; ProcessGroupIdAlertingScope  * &#x60;PROCESS_GROUP_NAME&#x60; -&gt; ProcessGroupNameAlertingScope  
   */
  public enum FilterTypeEnum {
    CUSTOM_DEVICE_GROUP_NAME("CUSTOM_DEVICE_GROUP_NAME"),
    
    ENTITY_ID("ENTITY_ID"),
    
    HOST_GROUP_NAME("HOST_GROUP_NAME"),
    
    HOST_NAME("HOST_NAME"),
    
    MANAGEMENT_ZONE("MANAGEMENT_ZONE"),
    
    NAME("NAME"),
    
    PROCESS_GROUP_ID("PROCESS_GROUP_ID"),
    
    PROCESS_GROUP_NAME("PROCESS_GROUP_NAME"),
    
    TAG("TAG");

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

  public MetricEventAlertingScope() { 
  }

  public MetricEventAlertingScope filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY_ID&#x60; -&gt; EntityIdAlertingScope  * &#x60;MANAGEMENT_ZONE&#x60; -&gt; ManagementZoneAlertingScope  * &#x60;TAG&#x60; -&gt; TagFilterAlertingScope  * &#x60;NAME&#x60; -&gt; NameAlertingScope  * &#x60;CUSTOM_DEVICE_GROUP_NAME&#x60; -&gt; CustomDeviceGroupNameAlertingScope  * &#x60;HOST_GROUP_NAME&#x60; -&gt; HostGroupNameAlertingScope  * &#x60;HOST_NAME&#x60; -&gt; HostNameAlertingScope  * &#x60;PROCESS_GROUP_ID&#x60; -&gt; ProcessGroupIdAlertingScope  * &#x60;PROCESS_GROUP_NAME&#x60; -&gt; ProcessGroupNameAlertingScope  
   * @return filterType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `ENTITY_ID` -> EntityIdAlertingScope  * `MANAGEMENT_ZONE` -> ManagementZoneAlertingScope  * `TAG` -> TagFilterAlertingScope  * `NAME` -> NameAlertingScope  * `CUSTOM_DEVICE_GROUP_NAME` -> CustomDeviceGroupNameAlertingScope  * `HOST_GROUP_NAME` -> HostGroupNameAlertingScope  * `HOST_NAME` -> HostNameAlertingScope  * `PROCESS_GROUP_ID` -> ProcessGroupIdAlertingScope  * `PROCESS_GROUP_NAME` -> ProcessGroupNameAlertingScope  ")
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


  /**
   * Return true if this MetricEventAlertingScope object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricEventAlertingScope metricEventAlertingScope = (MetricEventAlertingScope) o;
    return Objects.equals(this.filterType, metricEventAlertingScope.filterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricEventAlertingScope {\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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
  mappings.put("CustomDeviceGroupNameAlertingScope", CustomDeviceGroupNameAlertingScope.class);
  mappings.put("EntityIdAlertingScope", EntityIdAlertingScope.class);
  mappings.put("HostGroupNameAlertingScope", HostGroupNameAlertingScope.class);
  mappings.put("HostNameAlertingScope", HostNameAlertingScope.class);
  mappings.put("ManagementZoneAlertingScope", ManagementZoneAlertingScope.class);
  mappings.put("NameAlertingScope", NameAlertingScope.class);
  mappings.put("ProcessGroupIdAlertingScope", ProcessGroupIdAlertingScope.class);
  mappings.put("ProcessGroupNameAlertingScope", ProcessGroupNameAlertingScope.class);
  mappings.put("TagFilterAlertingScope", TagFilterAlertingScope.class);
  mappings.put("MetricEventAlertingScope", MetricEventAlertingScope.class);
  JSON.registerDiscriminator(MetricEventAlertingScope.class, "filterType", mappings);
}
}

