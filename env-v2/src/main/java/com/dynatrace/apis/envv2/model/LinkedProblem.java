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
 * The properties of the linked problem.
 */
@ApiModel(description = "The properties of the linked problem.")
@JsonPropertyOrder({
  LinkedProblem.JSON_PROPERTY_DISPLAY_ID,
  LinkedProblem.JSON_PROPERTY_PROBLEM_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class LinkedProblem {
  public static final String JSON_PROPERTY_DISPLAY_ID = "displayId";
  private String displayId;

  public static final String JSON_PROPERTY_PROBLEM_ID = "problemId";
  private String problemId;

  public LinkedProblem() { 
  }

  public LinkedProblem displayId(String displayId) {
    this.displayId = displayId;
    return this;
  }

   /**
   * The display ID of the problem.
   * @return displayId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The display ID of the problem.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayId() {
    return displayId;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayId(String displayId) {
    this.displayId = displayId;
  }


  public LinkedProblem problemId(String problemId) {
    this.problemId = problemId;
    return this;
  }

   /**
   * The ID of the problem.
   * @return problemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the problem.")
  @JsonProperty(JSON_PROPERTY_PROBLEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProblemId() {
    return problemId;
  }


  @JsonProperty(JSON_PROPERTY_PROBLEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProblemId(String problemId) {
    this.problemId = problemId;
  }


  /**
   * Return true if this LinkedProblem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedProblem linkedProblem = (LinkedProblem) o;
    return Objects.equals(this.displayId, linkedProblem.displayId) &&
        Objects.equals(this.problemId, linkedProblem.problemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayId, problemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedProblem {\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    problemId: ").append(toIndentedString(problemId)).append("\n");
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

