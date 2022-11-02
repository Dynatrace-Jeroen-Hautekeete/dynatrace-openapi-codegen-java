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
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.dynatrace.apis.configv1.model.DetectionRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomService
 */
@JsonPropertyOrder({
  CustomService.JSON_PROPERTY_METADATA,
  CustomService.JSON_PROPERTY_ID,
  CustomService.JSON_PROPERTY_NAME,
  CustomService.JSON_PROPERTY_ORDER,
  CustomService.JSON_PROPERTY_ENABLED,
  CustomService.JSON_PROPERTY_RULES,
  CustomService.JSON_PROPERTY_QUEUE_ENTRY_POINT,
  CustomService.JSON_PROPERTY_QUEUE_ENTRY_POINT_TYPE,
  CustomService.JSON_PROPERTY_PROCESS_GROUPS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class CustomService {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private String order;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<DetectionRule> rules = new ArrayList<>();

  public static final String JSON_PROPERTY_QUEUE_ENTRY_POINT = "queueEntryPoint";
  private Boolean queueEntryPoint;

  /**
   * The queue entry point type..
   */
  public enum QueueEntryPointTypeEnum {
    IBM_MQ("IBM_MQ"),
    
    JMS("JMS"),
    
    KAFKA("KAFKA"),
    
    MSMQ("MSMQ"),
    
    RABBIT_MQ("RABBIT_MQ");

    private String value;

    QueueEntryPointTypeEnum(String value) {
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
    public static QueueEntryPointTypeEnum fromValue(String value) {
      for (QueueEntryPointTypeEnum b : QueueEntryPointTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUEUE_ENTRY_POINT_TYPE = "queueEntryPointType";
  private QueueEntryPointTypeEnum queueEntryPointType;

  public static final String JSON_PROPERTY_PROCESS_GROUPS = "processGroups";
  private List<String> processGroups = null;

  public CustomService() { 
  }

  public CustomService metadata(ConfigurationMetadata metadata) {
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


  public CustomService id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the custom service.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the custom service.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public CustomService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom service, displayed in the UI.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the custom service, displayed in the UI.")
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


  public CustomService order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The order string. Sorting custom services alphabetically by their order string determines their relative ordering.  Typically this is managed by Dynatrace internally and will not be present in GET responses.
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order string. Sorting custom services alphabetically by their order string determines their relative ordering.  Typically this is managed by Dynatrace internally and will not be present in GET responses.")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(String order) {
    this.order = order;
  }


  public CustomService enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Custom service enabled/disabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Custom service enabled/disabled.")
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


  public CustomService rules(List<DetectionRule> rules) {
    this.rules = rules;
    return this;
  }

  public CustomService addRulesItem(DetectionRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The list of rules defining the custom service.
   * @return rules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of rules defining the custom service.")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DetectionRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRules(List<DetectionRule> rules) {
    this.rules = rules;
  }


  public CustomService queueEntryPoint(Boolean queueEntryPoint) {
    this.queueEntryPoint = queueEntryPoint;
    return this;
  }

   /**
   * The queue entry point flag.   Set to &#x60;true&#x60; for custom messaging services.
   * @return queueEntryPoint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The queue entry point flag.   Set to `true` for custom messaging services.")
  @JsonProperty(JSON_PROPERTY_QUEUE_ENTRY_POINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getQueueEntryPoint() {
    return queueEntryPoint;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_ENTRY_POINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueEntryPoint(Boolean queueEntryPoint) {
    this.queueEntryPoint = queueEntryPoint;
  }


  public CustomService queueEntryPointType(QueueEntryPointTypeEnum queueEntryPointType) {
    this.queueEntryPointType = queueEntryPointType;
    return this;
  }

   /**
   * The queue entry point type..
   * @return queueEntryPointType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The queue entry point type..")
  @JsonProperty(JSON_PROPERTY_QUEUE_ENTRY_POINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QueueEntryPointTypeEnum getQueueEntryPointType() {
    return queueEntryPointType;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_ENTRY_POINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueueEntryPointType(QueueEntryPointTypeEnum queueEntryPointType) {
    this.queueEntryPointType = queueEntryPointType;
  }


  public CustomService processGroups(List<String> processGroups) {
    this.processGroups = processGroups;
    return this;
  }

  public CustomService addProcessGroupsItem(String processGroupsItem) {
    if (this.processGroups == null) {
      this.processGroups = new ArrayList<>();
    }
    this.processGroups.add(processGroupsItem);
    return this;
  }

   /**
   * The list of process groups the custom service should belong to.
   * @return processGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of process groups the custom service should belong to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProcessGroups() {
    return processGroups;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessGroups(List<String> processGroups) {
    this.processGroups = processGroups;
  }


  /**
   * Return true if this CustomService object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomService customService = (CustomService) o;
    return Objects.equals(this.metadata, customService.metadata) &&
        Objects.equals(this.id, customService.id) &&
        Objects.equals(this.name, customService.name) &&
        Objects.equals(this.order, customService.order) &&
        Objects.equals(this.enabled, customService.enabled) &&
        Objects.equals(this.rules, customService.rules) &&
        Objects.equals(this.queueEntryPoint, customService.queueEntryPoint) &&
        Objects.equals(this.queueEntryPointType, customService.queueEntryPointType) &&
        Objects.equals(this.processGroups, customService.processGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, name, order, enabled, rules, queueEntryPoint, queueEntryPointType, processGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomService {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    queueEntryPoint: ").append(toIndentedString(queueEntryPoint)).append("\n");
    sb.append("    queueEntryPointType: ").append(toIndentedString(queueEntryPointType)).append("\n");
    sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
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
