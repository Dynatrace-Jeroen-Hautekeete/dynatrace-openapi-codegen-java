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
import com.dynatrace.apis.envv2.model.SecurityProblem;
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
 * A list of security problems.
 */
@ApiModel(description = "A list of security problems.")
@JsonPropertyOrder({
  SecurityProblemList.JSON_PROPERTY_TOTAL_COUNT,
  SecurityProblemList.JSON_PROPERTY_PAGE_SIZE,
  SecurityProblemList.JSON_PROPERTY_NEXT_PAGE_KEY,
  SecurityProblemList.JSON_PROPERTY_SECURITY_PROBLEMS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SecurityProblemList {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Long totalCount;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_NEXT_PAGE_KEY = "nextPageKey";
  private String nextPageKey;

  public static final String JSON_PROPERTY_SECURITY_PROBLEMS = "securityProblems";
  private List<SecurityProblem> securityProblems = null;

  public SecurityProblemList() { 
  }

  @JsonCreator
  public SecurityProblemList(
    @JsonProperty(JSON_PROPERTY_SECURITY_PROBLEMS) List<SecurityProblem> securityProblems
  ) {
  this();
    this.securityProblems = securityProblems;
  }

  public SecurityProblemList totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of entries in the result.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total number of entries in the result.")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public SecurityProblemList pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of entries per page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of entries per page.")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SecurityProblemList nextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
    return this;
  }

   /**
   * The cursor for the next page of results. Has the value of &#x60;null&#x60; on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result.
   * @return nextPageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AQAAABQBAAAABQ==", value = "The cursor for the next page of results. Has the value of `null` on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result.")
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageKey() {
    return nextPageKey;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
  }


   /**
   * A list of security problems.
   * @return securityProblems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of security problems.")
  @JsonProperty(JSON_PROPERTY_SECURITY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SecurityProblem> getSecurityProblems() {
    return securityProblems;
  }




  /**
   * Return true if this SecurityProblemList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityProblemList securityProblemList = (SecurityProblemList) o;
    return Objects.equals(this.totalCount, securityProblemList.totalCount) &&
        Objects.equals(this.pageSize, securityProblemList.pageSize) &&
        Objects.equals(this.nextPageKey, securityProblemList.nextPageKey) &&
        Objects.equals(this.securityProblems, securityProblemList.securityProblems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageSize, nextPageKey, securityProblems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityProblemList {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
    sb.append("    securityProblems: ").append(toIndentedString(securityProblems)).append("\n");
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
