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
 * Entity validation error for remote configuration management.
 */
@ApiModel(description = "Entity validation error for remote configuration management.")
@JsonPropertyOrder({
  RemoteConfigurationManagementEntityValidationError.JSON_PROPERTY_REASONS,
  RemoteConfigurationManagementEntityValidationError.JSON_PROPERTY_ENTITY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class RemoteConfigurationManagementEntityValidationError {
  /**
   * Gets or Sets reasons
   */
  public enum ReasonsEnum {
    CLOUD_NATIVE_NOT_SUPPORTED("CLOUD_NATIVE_NOT_SUPPORTED"),
    
    NOT_ALLOWED_WITH_CLUSTER_ACTIVE_GATE("NOT_ALLOWED_WITH_CLUSTER_ACTIVE_GATE"),
    
    NOT_CONNECTED("NOT_CONNECTED"),
    
    RUNNING_IN_CONTAINER("RUNNING_IN_CONTAINER"),
    
    STANDALONE_NOT_SUPPORTED("STANDALONE_NOT_SUPPORTED"),
    
    VERSION_NOT_SUPPORTED("VERSION_NOT_SUPPORTED");

    private String value;

    ReasonsEnum(String value) {
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
    public static ReasonsEnum fromValue(String value) {
      for (ReasonsEnum b : ReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASONS = "reasons";
  private List<ReasonsEnum> reasons = null;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private String entity;

  public RemoteConfigurationManagementEntityValidationError() { 
  }

  public RemoteConfigurationManagementEntityValidationError reasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
    return this;
  }

  public RemoteConfigurationManagementEntityValidationError addReasonsItem(ReasonsEnum reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * The reason of entity validation failure.
   * @return reasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"RUNNING_IN_CONTAINER\"]", value = "The reason of entity validation failure.")
  @JsonProperty(JSON_PROPERTY_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReasonsEnum> getReasons() {
    return reasons;
  }


  @JsonProperty(JSON_PROPERTY_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasons(List<ReasonsEnum> reasons) {
    this.reasons = reasons;
  }


  public RemoteConfigurationManagementEntityValidationError entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The ID of the entity for which validation failed.
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "entityId", value = "The ID of the entity for which validation failed.")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(String entity) {
    this.entity = entity;
  }


  /**
   * Return true if this RemoteConfigurationManagementEntityValidationError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteConfigurationManagementEntityValidationError remoteConfigurationManagementEntityValidationError = (RemoteConfigurationManagementEntityValidationError) o;
    return Objects.equals(this.reasons, remoteConfigurationManagementEntityValidationError.reasons) &&
        Objects.equals(this.entity, remoteConfigurationManagementEntityValidationError.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasons, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteConfigurationManagementEntityValidationError {\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

