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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of a new settings object.
 */
@ApiModel(description = "Configuration of a new settings object.")
@JsonPropertyOrder({
  SettingsObjectCreate.JSON_PROPERTY_SCHEMA_VERSION,
  SettingsObjectCreate.JSON_PROPERTY_INSERT_AFTER,
  SettingsObjectCreate.JSON_PROPERTY_EXTERNAL_ID,
  SettingsObjectCreate.JSON_PROPERTY_SCHEMA_ID,
  SettingsObjectCreate.JSON_PROPERTY_SCOPE,
  SettingsObjectCreate.JSON_PROPERTY_VALUE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SettingsObjectCreate {
  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schemaVersion";
  private String schemaVersion;

  public static final String JSON_PROPERTY_INSERT_AFTER = "insertAfter";
  private String insertAfter;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_SCHEMA_ID = "schemaId";
  private String schemaId;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public SettingsObjectCreate() { 
  }

  public SettingsObjectCreate schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The version of the schema on which the object is based.
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0.0", value = "The version of the schema on which the object is based.")
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaVersion() {
    return schemaVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public SettingsObjectCreate insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

   /**
   * The position of the new object. The new object will be added after the specified one.   If &#x60;null&#x60;, the new object will be placed in the last position.   If set to empty string, the new object will be placed in the first position.   Only applicable for objects based on schemas with ordered objects (schema&#39;s **ordered** parameter is set to &#x60;true&#x60;).
   * @return insertAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y2ktaGdyb3VwLTEyMythZjhjOThlOS0wN2I0LTMyMGEtOTQzNi02NTEyMmVlNWY4NGQ=", value = "The position of the new object. The new object will be added after the specified one.   If `null`, the new object will be placed in the last position.   If set to empty string, the new object will be placed in the first position.   Only applicable for objects based on schemas with ordered objects (schema's **ordered** parameter is set to `true`).")
  @JsonProperty(JSON_PROPERTY_INSERT_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertAfter() {
    return insertAfter;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }


  public SettingsObjectCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External identifier for the object being created
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External identifier for the object being created")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SettingsObjectCreate schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

   /**
   * The schema on which the object is based.
   * @return schemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "builtin:container.built-in-monitoring-rule", required = true, value = "The schema on which the object is based.")
  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSchemaId() {
    return schemaId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public SettingsObjectCreate scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope that the object targets.  If omitted on creation of a new object and if the schema supports scope generation, the operation will generate a scope from the provided value.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOST-D3A3C5A146830A79", value = "The scope that the object targets.  If omitted on creation of a new object and if the schema supports scope generation, the operation will generate a scope from the provided value.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }


  public SettingsObjectCreate value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the setting.    It defines the actual values of settings&#39; parameters.   The actual content depends on the object&#39;s schema.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"autoMonitoring\":true}", required = true, value = "The value of the setting.    It defines the actual values of settings' parameters.   The actual content depends on the object's schema.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * Return true if this SettingsObjectCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsObjectCreate settingsObjectCreate = (SettingsObjectCreate) o;
    return Objects.equals(this.schemaVersion, settingsObjectCreate.schemaVersion) &&
        Objects.equals(this.insertAfter, settingsObjectCreate.insertAfter) &&
        Objects.equals(this.externalId, settingsObjectCreate.externalId) &&
        Objects.equals(this.schemaId, settingsObjectCreate.schemaId) &&
        Objects.equals(this.scope, settingsObjectCreate.scope) &&
        Objects.equals(this.value, settingsObjectCreate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaVersion, insertAfter, externalId, schemaId, scope, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsObjectCreate {\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

