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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * An instance of the OneAgent code module.
 */
@ApiModel(description = "An instance of the OneAgent code module.")
@JsonPropertyOrder({
  ModuleInstance.JSON_PROPERTY_INSTANCE_NAME,
  ModuleInstance.JSON_PROPERTY_MODULE_VERSION,
  ModuleInstance.JSON_PROPERTY_FAULTY_VERSION,
  ModuleInstance.JSON_PROPERTY_ACTIVE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ModuleInstance {
  public static final String JSON_PROPERTY_INSTANCE_NAME = "instanceName";
  private String instanceName;

  public static final String JSON_PROPERTY_MODULE_VERSION = "moduleVersion";
  private String moduleVersion;

  public static final String JSON_PROPERTY_FAULTY_VERSION = "faultyVersion";
  private Boolean faultyVersion;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public ModuleInstance() { 
  }

  public ModuleInstance instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * The name of the instance.
   * @return instanceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the instance.")
  @JsonProperty(JSON_PROPERTY_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstanceName() {
    return instanceName;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  public ModuleInstance moduleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

   /**
   * The version of the code module.
   * @return moduleVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the code module.")
  @JsonProperty(JSON_PROPERTY_MODULE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModuleVersion() {
    return moduleVersion;
  }


  @JsonProperty(JSON_PROPERTY_MODULE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }


  public ModuleInstance faultyVersion(Boolean faultyVersion) {
    this.faultyVersion = faultyVersion;
    return this;
  }

   /**
   * The code module version is faulty (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return faultyVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code module version is faulty (`true`) or not (`false`).")
  @JsonProperty(JSON_PROPERTY_FAULTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFaultyVersion() {
    return faultyVersion;
  }


  @JsonProperty(JSON_PROPERTY_FAULTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaultyVersion(Boolean faultyVersion) {
    this.faultyVersion = faultyVersion;
  }


  public ModuleInstance active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The code module instance is active (&#x60;true&#x60;) or inactive (&#x60;false&#x60;).
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code module instance is active (`true`) or inactive (`false`).")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  /**
   * Return true if this ModuleInstance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleInstance moduleInstance = (ModuleInstance) o;
    return Objects.equals(this.instanceName, moduleInstance.instanceName) &&
        Objects.equals(this.moduleVersion, moduleInstance.moduleVersion) &&
        Objects.equals(this.faultyVersion, moduleInstance.faultyVersion) &&
        Objects.equals(this.active, moduleInstance.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceName, moduleVersion, faultyVersion, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleInstance {\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    faultyVersion: ").append(toIndentedString(faultyVersion)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

