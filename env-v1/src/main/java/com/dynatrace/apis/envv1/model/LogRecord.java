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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The analysis result for a single log entry.
 */
@ApiModel(description = "The analysis result for a single log entry.")
@JsonPropertyOrder({
  LogRecord.JSON_PROPERTY_TIMESTAMP,
  LogRecord.JSON_PROPERTY_LOG_LEVEL,
  LogRecord.JSON_PROPERTY_HOST_ID,
  LogRecord.JSON_PROPERTY_TEXT,
  LogRecord.JSON_PROPERTY_CUSTOM_FIELDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class LogRecord {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_LOG_LEVEL = "logLevel";
  private String logLevel;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private String hostId;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, Object> customFields = null;

  public LogRecord() { 
  }

  public LogRecord timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the log entry, in UTC milliseconds.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the log entry, in UTC milliseconds.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public LogRecord logLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * The severity level of the log entry.
   * @return logLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The severity level of the log entry.")
  @JsonProperty(JSON_PROPERTY_LOG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogLevel() {
    return logLevel;
  }


  @JsonProperty(JSON_PROPERTY_LOG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }


  public LogRecord hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * The entity ID of the host that produced the log.    Not applicable to OS logs.
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity ID of the host that produced the log.    Not applicable to OS logs.")
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public LogRecord text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text of the log entry.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text of the log entry.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public LogRecord customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LogRecord putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * The map of the log entry custom fields.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The map of the log entry custom fields.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  /**
   * Return true if this LogRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRecord logRecord = (LogRecord) o;
    return Objects.equals(this.timestamp, logRecord.timestamp) &&
        Objects.equals(this.logLevel, logRecord.logLevel) &&
        Objects.equals(this.hostId, logRecord.hostId) &&
        Objects.equals(this.text, logRecord.text) &&
        Objects.equals(this.customFields, logRecord.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, logLevel, hostId, text, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRecord {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
