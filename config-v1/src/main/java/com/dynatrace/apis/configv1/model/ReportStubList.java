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
import com.dynatrace.apis.configv1.model.DashboardReportStub;
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
 * A list of short representations of reports.
 */
@ApiModel(description = "A list of short representations of reports.")
@JsonPropertyOrder({
  ReportStubList.JSON_PROPERTY_VALUES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ReportStubList {
  public static final String JSON_PROPERTY_VALUES = "values";
  private List<DashboardReportStub> values = new ArrayList<>();

  public ReportStubList() { 
  }

  public ReportStubList values(List<DashboardReportStub> values) {
    this.values = values;
    return this;
  }

  public ReportStubList addValuesItem(DashboardReportStub valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of reports.
   * @return values
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of reports.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DashboardReportStub> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(List<DashboardReportStub> values) {
    this.values = values;
  }


  /**
   * Return true if this ReportStubList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportStubList reportStubList = (ReportStubList) o;
    return Objects.equals(this.values, reportStubList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportStubList {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

