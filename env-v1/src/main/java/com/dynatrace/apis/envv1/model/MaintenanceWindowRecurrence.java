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
 * The recurrence of the maintenance window.
 */
@ApiModel(description = "The recurrence of the maintenance window.")
@JsonPropertyOrder({
  MaintenanceWindowRecurrence.JSON_PROPERTY_DAY,
  MaintenanceWindowRecurrence.JSON_PROPERTY_DAY_OF_MONTH,
  MaintenanceWindowRecurrence.JSON_PROPERTY_START,
  MaintenanceWindowRecurrence.JSON_PROPERTY_DURATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class MaintenanceWindowRecurrence {
  /**
   * The day of the week for weekly maintenance.    The format is the full name of the day in upper case, for example &#x60;WEDNESDAY&#x60;.
   */
  public enum DayEnum {
    FRIDAY("FRIDAY"),
    
    MONDAY("MONDAY"),
    
    SATURDAY("SATURDAY"),
    
    SUNDAY("SUNDAY"),
    
    THURSDAY("THURSDAY"),
    
    TUESDAY("TUESDAY"),
    
    WEDNESDAY("WEDNESDAY");

    private String value;

    DayEnum(String value) {
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
    public static DayEnum fromValue(String value) {
      for (DayEnum b : DayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DAY = "day";
  private DayEnum day;

  public static final String JSON_PROPERTY_DAY_OF_MONTH = "dayOfMonth";
  private Integer dayOfMonth;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public MaintenanceWindowRecurrence() { 
  }

  public MaintenanceWindowRecurrence day(DayEnum day) {
    this.day = day;
    return this;
  }

   /**
   * The day of the week for weekly maintenance.    The format is the full name of the day in upper case, for example &#x60;WEDNESDAY&#x60;.
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The day of the week for weekly maintenance.    The format is the full name of the day in upper case, for example `WEDNESDAY`.")
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DayEnum getDay() {
    return day;
  }


  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay(DayEnum day) {
    this.day = day;
  }


  public MaintenanceWindowRecurrence dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * The day of the month for monthly maintenance.
   * @return dayOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The day of the month for monthly maintenance.")
  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  public MaintenanceWindowRecurrence start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The start time of the maintenance window. The format is &#x60;HH:mm&#x60;.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start time of the maintenance window. The format is `HH:mm`.")
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


  public MaintenanceWindowRecurrence duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the maintenance window in minutes.
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The duration of the maintenance window in minutes.")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  /**
   * Return true if this MaintenanceWindowRecurrence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowRecurrence maintenanceWindowRecurrence = (MaintenanceWindowRecurrence) o;
    return Objects.equals(this.day, maintenanceWindowRecurrence.day) &&
        Objects.equals(this.dayOfMonth, maintenanceWindowRecurrence.dayOfMonth) &&
        Objects.equals(this.start, maintenanceWindowRecurrence.start) &&
        Objects.equals(this.duration, maintenanceWindowRecurrence.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, dayOfMonth, start, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowRecurrence {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

