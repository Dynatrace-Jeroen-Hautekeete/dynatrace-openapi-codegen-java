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
import com.dynatrace.apis.envv1.model.Problem;
import com.dynatrace.apis.envv1.model.ProblemFeedQueryResultMonitored;
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
 * Details on open problems in your environment.
 */
@ApiModel(description = "Details on open problems in your environment.")
@JsonPropertyOrder({
  ProblemFeedQueryResult.JSON_PROPERTY_PROBLEMS,
  ProblemFeedQueryResult.JSON_PROPERTY_MONITORED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ProblemFeedQueryResult {
  public static final String JSON_PROPERTY_PROBLEMS = "problems";
  private List<Problem> problems = null;

  public static final String JSON_PROPERTY_MONITORED = "monitored";
  private ProblemFeedQueryResultMonitored monitored;

  public ProblemFeedQueryResult() { 
  }

  public ProblemFeedQueryResult problems(List<Problem> problems) {
    this.problems = problems;
    return this;
  }

  public ProblemFeedQueryResult addProblemsItem(Problem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * The list of problems and their details.   Contains all problems within specified timeframe, open and closed.
   * @return problems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of problems and their details.   Contains all problems within specified timeframe, open and closed.")
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Problem> getProblems() {
    return problems;
  }


  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProblems(List<Problem> problems) {
    this.problems = problems;
  }


  public ProblemFeedQueryResult monitored(ProblemFeedQueryResultMonitored monitored) {
    this.monitored = monitored;
    return this;
  }

   /**
   * Get monitored
   * @return monitored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProblemFeedQueryResultMonitored getMonitored() {
    return monitored;
  }


  @JsonProperty(JSON_PROPERTY_MONITORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitored(ProblemFeedQueryResultMonitored monitored) {
    this.monitored = monitored;
  }


  /**
   * Return true if this ProblemFeedQueryResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemFeedQueryResult problemFeedQueryResult = (ProblemFeedQueryResult) o;
    return Objects.equals(this.problems, problemFeedQueryResult.problems) &&
        Objects.equals(this.monitored, problemFeedQueryResult.monitored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(problems, monitored);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemFeedQueryResult {\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    monitored: ").append(toIndentedString(monitored)).append("\n");
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

