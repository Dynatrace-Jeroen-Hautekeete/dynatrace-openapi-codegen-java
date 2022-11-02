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
 * RequestDto
 */
@JsonPropertyOrder({
  RequestDto.JSON_PROPERTY_ENTITY_ID,
  RequestDto.JSON_PROPERTY_NAME,
  RequestDto.JSON_PROPERTY_SEQUENCE_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class RequestDto {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEQUENCE_NUMBER = "sequenceNumber";
  private Integer sequenceNumber;

  public RequestDto() { 
  }

  public RequestDto entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Request identifier
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request identifier")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public RequestDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Request name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RequestDto sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Request sequence number
   * @return sequenceNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request sequence number")
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  /**
   * Return true if this RequestDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDto requestDto = (RequestDto) o;
    return Objects.equals(this.entityId, requestDto.entityId) &&
        Objects.equals(this.name, requestDto.name) &&
        Objects.equals(this.sequenceNumber, requestDto.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDto {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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
