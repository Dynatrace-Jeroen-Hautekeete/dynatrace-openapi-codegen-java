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
 * A list of constraint violations
 */
@ApiModel(description = "A list of constraint violations")
@JsonPropertyOrder({
  ConstraintViolation.JSON_PROPERTY_PARAMETER_LOCATION,
  ConstraintViolation.JSON_PROPERTY_LOCATION,
  ConstraintViolation.JSON_PROPERTY_MESSAGE,
  ConstraintViolation.JSON_PROPERTY_PATH
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class ConstraintViolation {
  /**
   * Gets or Sets parameterLocation
   */
  public enum ParameterLocationEnum {
    PATH("PATH"),
    
    PAYLOAD_BODY("PAYLOAD_BODY"),
    
    QUERY("QUERY");

    private String value;

    ParameterLocationEnum(String value) {
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
    public static ParameterLocationEnum fromValue(String value) {
      for (ParameterLocationEnum b : ParameterLocationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PARAMETER_LOCATION = "parameterLocation";
  private ParameterLocationEnum parameterLocation;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public ConstraintViolation() { 
  }

  public ConstraintViolation parameterLocation(ParameterLocationEnum parameterLocation) {
    this.parameterLocation = parameterLocation;
    return this;
  }

   /**
   * Get parameterLocation
   * @return parameterLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ParameterLocationEnum getParameterLocation() {
    return parameterLocation;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterLocation(ParameterLocationEnum parameterLocation) {
    this.parameterLocation = parameterLocation;
  }


  public ConstraintViolation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public ConstraintViolation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ConstraintViolation path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  /**
   * Return true if this ConstraintViolation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstraintViolation constraintViolation = (ConstraintViolation) o;
    return Objects.equals(this.parameterLocation, constraintViolation.parameterLocation) &&
        Objects.equals(this.location, constraintViolation.location) &&
        Objects.equals(this.message, constraintViolation.message) &&
        Objects.equals(this.path, constraintViolation.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterLocation, location, message, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstraintViolation {\n");
    sb.append("    parameterLocation: ").append(toIndentedString(parameterLocation)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

