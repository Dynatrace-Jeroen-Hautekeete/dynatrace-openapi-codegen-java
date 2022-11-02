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
 * The performance threshold rule.
 */
@ApiModel(description = "The performance threshold rule.")
@JsonPropertyOrder({
  LoadingTimeThreshold.JSON_PROPERTY_TYPE,
  LoadingTimeThreshold.JSON_PROPERTY_VALUE_MS,
  LoadingTimeThreshold.JSON_PROPERTY_REQUEST_INDEX,
  LoadingTimeThreshold.JSON_PROPERTY_EVENT_INDEX
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class LoadingTimeThreshold {
  /**
   * The type of the threshold: total loading time or action loading time.
   */
  public enum TypeEnum {
    ACTION("ACTION"),
    
    TOTAL("TOTAL");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_VALUE_MS = "valueMs";
  private Integer valueMs;

  public static final String JSON_PROPERTY_REQUEST_INDEX = "requestIndex";
  private Integer requestIndex;

  public static final String JSON_PROPERTY_EVENT_INDEX = "eventIndex";
  private Integer eventIndex;

  public LoadingTimeThreshold() { 
  }

  public LoadingTimeThreshold type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the threshold: total loading time or action loading time.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the threshold: total loading time or action loading time.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public LoadingTimeThreshold valueMs(Integer valueMs) {
    this.valueMs = valueMs;
    return this;
  }

   /**
   * Notify if monitor takes longer than *X* milliseconds to load.
   * minimum: 0
   * @return valueMs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Notify if monitor takes longer than *X* milliseconds to load.")
  @JsonProperty(JSON_PROPERTY_VALUE_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getValueMs() {
    return valueMs;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValueMs(Integer valueMs) {
    this.valueMs = valueMs;
  }


  public LoadingTimeThreshold requestIndex(Integer requestIndex) {
    this.requestIndex = requestIndex;
    return this;
  }

   /**
   * Specify the request to which an ACTION threshold applies.
   * minimum: 1
   * @return requestIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the request to which an ACTION threshold applies.")
  @JsonProperty(JSON_PROPERTY_REQUEST_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequestIndex() {
    return requestIndex;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestIndex(Integer requestIndex) {
    this.requestIndex = requestIndex;
  }


  public LoadingTimeThreshold eventIndex(Integer eventIndex) {
    this.eventIndex = eventIndex;
    return this;
  }

   /**
   * Specify the event to which an ACTION threshold applies.
   * minimum: 1
   * @return eventIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the event to which an ACTION threshold applies.")
  @JsonProperty(JSON_PROPERTY_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEventIndex() {
    return eventIndex;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventIndex(Integer eventIndex) {
    this.eventIndex = eventIndex;
  }


  /**
   * Return true if this LoadingTimeThreshold object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadingTimeThreshold loadingTimeThreshold = (LoadingTimeThreshold) o;
    return Objects.equals(this.type, loadingTimeThreshold.type) &&
        Objects.equals(this.valueMs, loadingTimeThreshold.valueMs) &&
        Objects.equals(this.requestIndex, loadingTimeThreshold.requestIndex) &&
        Objects.equals(this.eventIndex, loadingTimeThreshold.eventIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, valueMs, requestIndex, eventIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadingTimeThreshold {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueMs: ").append(toIndentedString(valueMs)).append("\n");
    sb.append("    requestIndex: ").append(toIndentedString(requestIndex)).append("\n");
    sb.append("    eventIndex: ").append(toIndentedString(eventIndex)).append("\n");
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

