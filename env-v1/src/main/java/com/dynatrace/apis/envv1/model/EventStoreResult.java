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
 * Contains IDs of all custom events, created by an event push call.
 */
@ApiModel(description = "Contains IDs of all custom events, created by an event push call.")
@JsonPropertyOrder({
  EventStoreResult.JSON_PROPERTY_STORED_EVENT_IDS,
  EventStoreResult.JSON_PROPERTY_STORED_IDS,
  EventStoreResult.JSON_PROPERTY_STORED_CORRELATION_IDS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class EventStoreResult {
  public static final String JSON_PROPERTY_STORED_EVENT_IDS = "storedEventIds";
  private List<Long> storedEventIds = null;

  public static final String JSON_PROPERTY_STORED_IDS = "storedIds";
  private List<String> storedIds = null;

  public static final String JSON_PROPERTY_STORED_CORRELATION_IDS = "storedCorrelationIds";
  private List<String> storedCorrelationIds = null;

  public EventStoreResult() { 
  }

  public EventStoreResult storedEventIds(List<Long> storedEventIds) {
    this.storedEventIds = storedEventIds;
    return this;
  }

  public EventStoreResult addStoredEventIdsItem(Long storedEventIdsItem) {
    if (this.storedEventIds == null) {
      this.storedEventIds = new ArrayList<>();
    }
    this.storedEventIds.add(storedEventIdsItem);
    return this;
  }

   /**
   * List of event IDs for information-only-events.    This field is provided for compatibility reasons. You should use the values from the **storedIds** field instead.
   * @return storedEventIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of event IDs for information-only-events.    This field is provided for compatibility reasons. You should use the values from the **storedIds** field instead.")
  @JsonProperty(JSON_PROPERTY_STORED_EVENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getStoredEventIds() {
    return storedEventIds;
  }


  @JsonProperty(JSON_PROPERTY_STORED_EVENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredEventIds(List<Long> storedEventIds) {
    this.storedEventIds = storedEventIds;
  }


  public EventStoreResult storedIds(List<String> storedIds) {
    this.storedIds = storedIds;
    return this;
  }

  public EventStoreResult addStoredIdsItem(String storedIdsItem) {
    if (this.storedIds == null) {
      this.storedIds = new ArrayList<>();
    }
    this.storedIds.add(storedIdsItem);
    return this;
  }

   /**
   * List of **encoded** event IDs for information-only-events.
   * @return storedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of **encoded** event IDs for information-only-events.")
  @JsonProperty(JSON_PROPERTY_STORED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStoredIds() {
    return storedIds;
  }


  @JsonProperty(JSON_PROPERTY_STORED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredIds(List<String> storedIds) {
    this.storedIds = storedIds;
  }


  public EventStoreResult storedCorrelationIds(List<String> storedCorrelationIds) {
    this.storedCorrelationIds = storedCorrelationIds;
    return this;
  }

  public EventStoreResult addStoredCorrelationIdsItem(String storedCorrelationIdsItem) {
    if (this.storedCorrelationIds == null) {
      this.storedCorrelationIds = new ArrayList<>();
    }
    this.storedCorrelationIds.add(storedCorrelationIdsItem);
    return this;
  }

   /**
   * List of correlation IDs for problem-opening-events.
   * @return storedCorrelationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of correlation IDs for problem-opening-events.")
  @JsonProperty(JSON_PROPERTY_STORED_CORRELATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStoredCorrelationIds() {
    return storedCorrelationIds;
  }


  @JsonProperty(JSON_PROPERTY_STORED_CORRELATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredCorrelationIds(List<String> storedCorrelationIds) {
    this.storedCorrelationIds = storedCorrelationIds;
  }


  /**
   * Return true if this EventStoreResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventStoreResult eventStoreResult = (EventStoreResult) o;
    return Objects.equals(this.storedEventIds, eventStoreResult.storedEventIds) &&
        Objects.equals(this.storedIds, eventStoreResult.storedIds) &&
        Objects.equals(this.storedCorrelationIds, eventStoreResult.storedCorrelationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedEventIds, storedIds, storedCorrelationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventStoreResult {\n");
    sb.append("    storedEventIds: ").append(toIndentedString(storedEventIds)).append("\n");
    sb.append("    storedIds: ").append(toIndentedString(storedIds)).append("\n");
    sb.append("    storedCorrelationIds: ").append(toIndentedString(storedCorrelationIds)).append("\n");
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
