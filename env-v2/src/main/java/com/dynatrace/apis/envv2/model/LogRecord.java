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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A single log record.
 */
@ApiModel(description = "A single log record.")
@JsonPropertyOrder({
  LogRecord.JSON_PROPERTY_ADDITIONAL_COLUMNS,
  LogRecord.JSON_PROPERTY_TIMESTAMP,
  LogRecord.JSON_PROPERTY_EVENT_TYPE,
  LogRecord.JSON_PROPERTY_CONTENT,
  LogRecord.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class LogRecord {
  public static final String JSON_PROPERTY_ADDITIONAL_COLUMNS = "additionalColumns";
  private Map<String, List<String>> additionalColumns = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  /**
   * Type of event
   */
  public enum EventTypeEnum {
    K8S("K8S"),
    
    LOG("LOG"),
    
    SFM("SFM");

    private String value;

    EventTypeEnum(String value) {
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
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  /**
   * The log status (based on the log level).
   */
  public enum StatusEnum {
    ERROR("ERROR"),
    
    INFO("INFO"),
    
    NONE("NONE"),
    
    WARN("WARN");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public LogRecord() { 
  }

  public LogRecord additionalColumns(Map<String, List<String>> additionalColumns) {
    this.additionalColumns = additionalColumns;
    return this;
  }

  public LogRecord putAdditionalColumnsItem(String key, List<String> additionalColumnsItem) {
    if (this.additionalColumns == null) {
      this.additionalColumns = new HashMap<>();
    }
    this.additionalColumns.put(key, additionalColumnsItem);
    return this;
  }

   /**
   * Additional columns of the log record.
   * @return additionalColumns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional columns of the log record.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getAdditionalColumns() {
    return additionalColumns;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalColumns(Map<String, List<String>> additionalColumns) {
    this.additionalColumns = additionalColumns;
  }


  public LogRecord timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the log record, in UTC milliseconds.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the log record, in UTC milliseconds.")
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


  public LogRecord eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of event
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of event")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public LogRecord content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the log record.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the log record.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public LogRecord status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The log status (based on the log level).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The log status (based on the log level).")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
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
    return Objects.equals(this.additionalColumns, logRecord.additionalColumns) &&
        Objects.equals(this.timestamp, logRecord.timestamp) &&
        Objects.equals(this.eventType, logRecord.eventType) &&
        Objects.equals(this.content, logRecord.content) &&
        Objects.equals(this.status, logRecord.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalColumns, timestamp, eventType, content, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRecord {\n");
    sb.append("    additionalColumns: ").append(toIndentedString(additionalColumns)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

