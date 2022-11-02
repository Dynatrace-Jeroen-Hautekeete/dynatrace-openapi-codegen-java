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
import com.dynatrace.apis.envv2.model.ConstraintViolation;
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
 * Error
 */
@JsonPropertyOrder({
  Error.JSON_PROPERTY_CONSTRAINT_VIOLATIONS,
  Error.JSON_PROPERTY_MESSAGE,
  Error.JSON_PROPERTY_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class Error {
  public static final String JSON_PROPERTY_CONSTRAINT_VIOLATIONS = "constraintViolations";
  private List<ConstraintViolation> constraintViolations = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_CODE = "code";
  private Integer code;

  public Error() { 
  }

  public Error constraintViolations(List<ConstraintViolation> constraintViolations) {
    this.constraintViolations = constraintViolations;
    return this;
  }

  public Error addConstraintViolationsItem(ConstraintViolation constraintViolationsItem) {
    if (this.constraintViolations == null) {
      this.constraintViolations = new ArrayList<>();
    }
    this.constraintViolations.add(constraintViolationsItem);
    return this;
  }

   /**
   * A list of constraint violations
   * @return constraintViolations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of constraint violations")
  @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConstraintViolation> getConstraintViolations() {
    return constraintViolations;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraintViolations(List<ConstraintViolation> constraintViolations) {
    this.constraintViolations = constraintViolations;
  }


  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message")
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


  public Error code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The HTTP status code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP status code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Return true if this Error object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.constraintViolations, error.constraintViolations) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.code, error.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintViolations, message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    constraintViolations: ").append(toIndentedString(constraintViolations)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
