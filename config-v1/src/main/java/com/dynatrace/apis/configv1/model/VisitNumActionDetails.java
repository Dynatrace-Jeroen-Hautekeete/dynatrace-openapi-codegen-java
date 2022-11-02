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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of a number of user actions-based conversion goal.
 */
@ApiModel(description = "Configuration of a number of user actions-based conversion goal.")
@JsonPropertyOrder({
  VisitNumActionDetails.JSON_PROPERTY_NUM_USER_ACTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class VisitNumActionDetails {
  public static final String JSON_PROPERTY_NUM_USER_ACTIONS = "numUserActions";
  private Integer numUserActions;

  public VisitNumActionDetails() { 
  }

  public VisitNumActionDetails numUserActions(Integer numUserActions) {
    this.numUserActions = numUserActions;
    return this;
  }

   /**
   * The number of user actions to hit the conversion goal.
   * @return numUserActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of user actions to hit the conversion goal.")
  @JsonProperty(JSON_PROPERTY_NUM_USER_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumUserActions() {
    return numUserActions;
  }


  @JsonProperty(JSON_PROPERTY_NUM_USER_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumUserActions(Integer numUserActions) {
    this.numUserActions = numUserActions;
  }


  /**
   * Return true if this VisitNumActionDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitNumActionDetails visitNumActionDetails = (VisitNumActionDetails) o;
    return Objects.equals(this.numUserActions, visitNumActionDetails.numUserActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numUserActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitNumActionDetails {\n");
    sb.append("    numUserActions: ").append(toIndentedString(numUserActions)).append("\n");
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
