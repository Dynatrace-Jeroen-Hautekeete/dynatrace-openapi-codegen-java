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
import com.dynatrace.apis.envv2.model.ExecutionStep;
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
 * Contains extended monitor&#39;s execution details.
 */
@ApiModel(description = "Contains extended monitor's execution details.")
@JsonPropertyOrder({
  ExecutionFullResults.JSON_PROPERTY_STATUS,
  ExecutionFullResults.JSON_PROPERTY_FAILURE_MESSAGE,
  ExecutionFullResults.JSON_PROPERTY_ERROR_CODE,
  ExecutionFullResults.JSON_PROPERTY_EXECUTION_STEP_COUNT,
  ExecutionFullResults.JSON_PROPERTY_EXECUTION_STEPS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class ExecutionFullResults {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_FAILURE_MESSAGE = "failureMessage";
  private String failureMessage;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_EXECUTION_STEP_COUNT = "executionStepCount";
  private Integer executionStepCount;

  public static final String JSON_PROPERTY_EXECUTION_STEPS = "executionSteps";
  private List<ExecutionStep> executionSteps = null;

  public ExecutionFullResults() { 
  }

  public ExecutionFullResults status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Execution status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Execution status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public ExecutionFullResults failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Failure message.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Failure message.")
  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailureMessage() {
    return failureMessage;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public ExecutionFullResults errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code.
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error code.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ExecutionFullResults executionStepCount(Integer executionStepCount) {
    this.executionStepCount = executionStepCount;
    return this;
  }

   /**
   * Number executed steps.
   * @return executionStepCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number executed steps.")
  @JsonProperty(JSON_PROPERTY_EXECUTION_STEP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExecutionStepCount() {
    return executionStepCount;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_STEP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionStepCount(Integer executionStepCount) {
    this.executionStepCount = executionStepCount;
  }


  public ExecutionFullResults executionSteps(List<ExecutionStep> executionSteps) {
    this.executionSteps = executionSteps;
    return this;
  }

  public ExecutionFullResults addExecutionStepsItem(ExecutionStep executionStepsItem) {
    if (this.executionSteps == null) {
      this.executionSteps = new ArrayList<>();
    }
    this.executionSteps.add(executionStepsItem);
    return this;
  }

   /**
   * Details about the monitor&#39;s step execution.
   * @return executionSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about the monitor's step execution.")
  @JsonProperty(JSON_PROPERTY_EXECUTION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExecutionStep> getExecutionSteps() {
    return executionSteps;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionSteps(List<ExecutionStep> executionSteps) {
    this.executionSteps = executionSteps;
  }


  /**
   * Return true if this ExecutionFullResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionFullResults executionFullResults = (ExecutionFullResults) o;
    return Objects.equals(this.status, executionFullResults.status) &&
        Objects.equals(this.failureMessage, executionFullResults.failureMessage) &&
        Objects.equals(this.errorCode, executionFullResults.errorCode) &&
        Objects.equals(this.executionStepCount, executionFullResults.executionStepCount) &&
        Objects.equals(this.executionSteps, executionFullResults.executionSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, failureMessage, errorCode, executionStepCount, executionSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionFullResults {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    executionStepCount: ").append(toIndentedString(executionStepCount)).append("\n");
    sb.append("    executionSteps: ").append(toIndentedString(executionSteps)).append("\n");
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
