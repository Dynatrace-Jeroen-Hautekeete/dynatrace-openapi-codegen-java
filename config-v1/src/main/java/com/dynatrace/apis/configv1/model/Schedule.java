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
import com.dynatrace.apis.configv1.model.Recurrence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The schedule of the maintenance window.
 */
@ApiModel(description = "The schedule of the maintenance window.")
@JsonPropertyOrder({
  Schedule.JSON_PROPERTY_RECURRENCE_TYPE,
  Schedule.JSON_PROPERTY_RECURRENCE,
  Schedule.JSON_PROPERTY_START,
  Schedule.JSON_PROPERTY_END,
  Schedule.JSON_PROPERTY_ZONE_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class Schedule {
  /**
   * The type of the schedule recurrence.
   */
  public enum RecurrenceTypeEnum {
    DAILY("DAILY"),
    
    MONTHLY("MONTHLY"),
    
    ONCE("ONCE"),
    
    WEEKLY("WEEKLY");

    private String value;

    RecurrenceTypeEnum(String value) {
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
    public static RecurrenceTypeEnum fromValue(String value) {
      for (RecurrenceTypeEnum b : RecurrenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECURRENCE_TYPE = "recurrenceType";
  private RecurrenceTypeEnum recurrenceType;

  public static final String JSON_PROPERTY_RECURRENCE = "recurrence";
  private Recurrence recurrence;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public static final String JSON_PROPERTY_ZONE_ID = "zoneId";
  private String zoneId;

  public Schedule() { 
  }

  public Schedule recurrenceType(RecurrenceTypeEnum recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * The type of the schedule recurrence.
   * @return recurrenceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the schedule recurrence.")
  @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecurrenceTypeEnum getRecurrenceType() {
    return recurrenceType;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecurrenceType(RecurrenceTypeEnum recurrenceType) {
    this.recurrenceType = recurrenceType;
  }


  public Schedule recurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Recurrence getRecurrence() {
    return recurrence;
  }


  @JsonProperty(JSON_PROPERTY_RECURRENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }


  public Schedule start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The start date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public Schedule end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The end date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The end date and time of the maintenance window validity period in yyyy-mm-dd HH:mm format.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  public Schedule zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * The time zone of the start and end time. Default time zone is UTC.   You can use either UTC offset &#x60;UTC+01:00&#x60; format or the IANA Time Zone Database format (for example, &#x60;Europe/Vienna&#x60;).
   * @return zoneId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time zone of the start and end time. Default time zone is UTC.   You can use either UTC offset `UTC+01:00` format or the IANA Time Zone Database format (for example, `Europe/Vienna`).")
  @JsonProperty(JSON_PROPERTY_ZONE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getZoneId() {
    return zoneId;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  /**
   * Return true if this Schedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.recurrenceType, schedule.recurrenceType) &&
        Objects.equals(this.recurrence, schedule.recurrence) &&
        Objects.equals(this.start, schedule.start) &&
        Objects.equals(this.end, schedule.end) &&
        Objects.equals(this.zoneId, schedule.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrenceType, recurrence, start, end, zoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
