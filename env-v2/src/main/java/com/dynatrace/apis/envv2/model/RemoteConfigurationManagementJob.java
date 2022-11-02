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
import com.dynatrace.apis.envv2.model.RemoteConfigurationManagementOperation;
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
 * Remote configuration management job.
 */
@ApiModel(description = "Remote configuration management job.")
@JsonPropertyOrder({
  RemoteConfigurationManagementJob.JSON_PROPERTY_TIMEOUT_TIME,
  RemoteConfigurationManagementJob.JSON_PROPERTY_PROCESSED_ENTITIES_COUNT,
  RemoteConfigurationManagementJob.JSON_PROPERTY_TOTAL_ENTITIES_COUNT,
  RemoteConfigurationManagementJob.JSON_PROPERTY_OPERATIONS,
  RemoteConfigurationManagementJob.JSON_PROPERTY_ENTITY_TYPE,
  RemoteConfigurationManagementJob.JSON_PROPERTY_ID,
  RemoteConfigurationManagementJob.JSON_PROPERTY_START_TIME,
  RemoteConfigurationManagementJob.JSON_PROPERTY_END_TIME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class RemoteConfigurationManagementJob {
  public static final String JSON_PROPERTY_TIMEOUT_TIME = "timeoutTime";
  private String timeoutTime;

  public static final String JSON_PROPERTY_PROCESSED_ENTITIES_COUNT = "processedEntitiesCount";
  private Integer processedEntitiesCount;

  public static final String JSON_PROPERTY_TOTAL_ENTITIES_COUNT = "totalEntitiesCount";
  private Integer totalEntitiesCount;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  private List<RemoteConfigurationManagementOperation> operations = null;

  /**
   * Type of entities modified by remote configuration management.
   */
  public enum EntityTypeEnum {
    ACTIVE_GATE("ACTIVE_GATE"),
    
    ONE_AGENT("ONE_AGENT");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityTypeEnum entityType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public RemoteConfigurationManagementJob() { 
  }

  public RemoteConfigurationManagementJob timeoutTime(String timeoutTime) {
    this.timeoutTime = timeoutTime;
    return this;
  }

   /**
   * Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the running remote configuration management job will time-out. This field is present only for running jobs.
   * @return timeoutTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-05T08:15:30.144Z", value = "Date (in ISO 8601 format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z') when the running remote configuration management job will time-out. This field is present only for running jobs.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeoutTime() {
    return timeoutTime;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutTime(String timeoutTime) {
    this.timeoutTime = timeoutTime;
  }


  public RemoteConfigurationManagementJob processedEntitiesCount(Integer processedEntitiesCount) {
    this.processedEntitiesCount = processedEntitiesCount;
    return this;
  }

   /**
   * Number of entities that were already processed at the time the response was created.
   * @return processedEntitiesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of entities that were already processed at the time the response was created.")
  @JsonProperty(JSON_PROPERTY_PROCESSED_ENTITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProcessedEntitiesCount() {
    return processedEntitiesCount;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSED_ENTITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessedEntitiesCount(Integer processedEntitiesCount) {
    this.processedEntitiesCount = processedEntitiesCount;
  }


  public RemoteConfigurationManagementJob totalEntitiesCount(Integer totalEntitiesCount) {
    this.totalEntitiesCount = totalEntitiesCount;
    return this;
  }

   /**
   * Total number of entities to process.
   * @return totalEntitiesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of entities to process.")
  @JsonProperty(JSON_PROPERTY_TOTAL_ENTITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalEntitiesCount() {
    return totalEntitiesCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ENTITIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalEntitiesCount(Integer totalEntitiesCount) {
    this.totalEntitiesCount = totalEntitiesCount;
  }


  public RemoteConfigurationManagementJob operations(List<RemoteConfigurationManagementOperation> operations) {
    this.operations = operations;
    return this;
  }

  public RemoteConfigurationManagementJob addOperationsItem(RemoteConfigurationManagementOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * A list of executed remote configuration management jobs.
   * @return operations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of executed remote configuration management jobs.")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RemoteConfigurationManagementOperation> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(List<RemoteConfigurationManagementOperation> operations) {
    this.operations = operations;
  }


  public RemoteConfigurationManagementJob entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Type of entities modified by remote configuration management.
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE_GATE or ONE_AGENT", value = "Type of entities modified by remote configuration management.")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public RemoteConfigurationManagementJob id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the remote configuration management job.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7974003406714390819", value = "The ID of the remote configuration management job.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public RemoteConfigurationManagementJob startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-05T08:15:30.144Z", value = "Date (in ISO 8601 format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z') when the remote configuration management job was started.")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public RemoteConfigurationManagementJob endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Date (in ISO 8601 format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;) when the remote configuration management job was finished. This field is present only for finished jobs.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-05T08:15:30.144Z", value = "Date (in ISO 8601 format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z') when the remote configuration management job was finished. This field is present only for finished jobs.")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  /**
   * Return true if this RemoteConfigurationManagementJob object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteConfigurationManagementJob remoteConfigurationManagementJob = (RemoteConfigurationManagementJob) o;
    return Objects.equals(this.timeoutTime, remoteConfigurationManagementJob.timeoutTime) &&
        Objects.equals(this.processedEntitiesCount, remoteConfigurationManagementJob.processedEntitiesCount) &&
        Objects.equals(this.totalEntitiesCount, remoteConfigurationManagementJob.totalEntitiesCount) &&
        Objects.equals(this.operations, remoteConfigurationManagementJob.operations) &&
        Objects.equals(this.entityType, remoteConfigurationManagementJob.entityType) &&
        Objects.equals(this.id, remoteConfigurationManagementJob.id) &&
        Objects.equals(this.startTime, remoteConfigurationManagementJob.startTime) &&
        Objects.equals(this.endTime, remoteConfigurationManagementJob.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutTime, processedEntitiesCount, totalEntitiesCount, operations, entityType, id, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteConfigurationManagementJob {\n");
    sb.append("    timeoutTime: ").append(toIndentedString(timeoutTime)).append("\n");
    sb.append("    processedEntitiesCount: ").append(toIndentedString(processedEntitiesCount)).append("\n");
    sb.append("    totalEntitiesCount: ").append(toIndentedString(totalEntitiesCount)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

