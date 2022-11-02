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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ProcessGroupInstanceToRelationships
 */
@JsonPropertyOrder({
  ProcessGroupInstanceToRelationships.JSON_PROPERTY_RUNS_ON_PROCESS_GROUP_INSTANCE,
  ProcessGroupInstanceToRelationships.JSON_PROPERTY_IS_NETWORK_CLIENT_OF
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ProcessGroupInstanceToRelationships {
  public static final String JSON_PROPERTY_RUNS_ON_PROCESS_GROUP_INSTANCE = "runsOnProcessGroupInstance";
  private List<String> runsOnProcessGroupInstance = null;

  public static final String JSON_PROPERTY_IS_NETWORK_CLIENT_OF = "isNetworkClientOf";
  private List<String> isNetworkClientOf = null;

  public ProcessGroupInstanceToRelationships() { 
  }

  public ProcessGroupInstanceToRelationships runsOnProcessGroupInstance(List<String> runsOnProcessGroupInstance) {
    this.runsOnProcessGroupInstance = runsOnProcessGroupInstance;
    return this;
  }

  public ProcessGroupInstanceToRelationships addRunsOnProcessGroupInstanceItem(String runsOnProcessGroupInstanceItem) {
    if (this.runsOnProcessGroupInstance == null) {
      this.runsOnProcessGroupInstance = new ArrayList<>();
    }
    this.runsOnProcessGroupInstance.add(runsOnProcessGroupInstanceItem);
    return this;
  }

   /**
   * Get runsOnProcessGroupInstance
   * @return runsOnProcessGroupInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUNS_ON_PROCESS_GROUP_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRunsOnProcessGroupInstance() {
    return runsOnProcessGroupInstance;
  }


  @JsonProperty(JSON_PROPERTY_RUNS_ON_PROCESS_GROUP_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunsOnProcessGroupInstance(List<String> runsOnProcessGroupInstance) {
    this.runsOnProcessGroupInstance = runsOnProcessGroupInstance;
  }


  public ProcessGroupInstanceToRelationships isNetworkClientOf(List<String> isNetworkClientOf) {
    this.isNetworkClientOf = isNetworkClientOf;
    return this;
  }

  public ProcessGroupInstanceToRelationships addIsNetworkClientOfItem(String isNetworkClientOfItem) {
    if (this.isNetworkClientOf == null) {
      this.isNetworkClientOf = new ArrayList<>();
    }
    this.isNetworkClientOf.add(isNetworkClientOfItem);
    return this;
  }

   /**
   * Get isNetworkClientOf
   * @return isNetworkClientOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_NETWORK_CLIENT_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIsNetworkClientOf() {
    return isNetworkClientOf;
  }


  @JsonProperty(JSON_PROPERTY_IS_NETWORK_CLIENT_OF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNetworkClientOf(List<String> isNetworkClientOf) {
    this.isNetworkClientOf = isNetworkClientOf;
  }


  /**
   * Return true if this ProcessGroupInstance_toRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupInstanceToRelationships processGroupInstanceToRelationships = (ProcessGroupInstanceToRelationships) o;
    return Objects.equals(this.runsOnProcessGroupInstance, processGroupInstanceToRelationships.runsOnProcessGroupInstance) &&
        Objects.equals(this.isNetworkClientOf, processGroupInstanceToRelationships.isNetworkClientOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runsOnProcessGroupInstance, isNetworkClientOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupInstanceToRelationships {\n");
    sb.append("    runsOnProcessGroupInstance: ").append(toIndentedString(runsOnProcessGroupInstance)).append("\n");
    sb.append("    isNetworkClientOf: ").append(toIndentedString(isNetworkClientOf)).append("\n");
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

