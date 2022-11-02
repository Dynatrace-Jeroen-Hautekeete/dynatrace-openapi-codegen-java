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
import com.dynatrace.apis.envv2.model.DavisSecurityAdvice;
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
 * A list of advice from the Davis security advisor.
 */
@ApiModel(description = "A list of advice from the Davis security advisor.")
@JsonPropertyOrder({
  DavisSecurityAdviceList.JSON_PROPERTY_TOTAL_COUNT,
  DavisSecurityAdviceList.JSON_PROPERTY_PAGE_SIZE,
  DavisSecurityAdviceList.JSON_PROPERTY_NEXT_PAGE_KEY,
  DavisSecurityAdviceList.JSON_PROPERTY_ADVICES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class DavisSecurityAdviceList {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Long totalCount;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_NEXT_PAGE_KEY = "nextPageKey";
  private String nextPageKey;

  public static final String JSON_PROPERTY_ADVICES = "advices";
  private List<DavisSecurityAdvice> advices = null;

  public DavisSecurityAdviceList() { 
  }

  public DavisSecurityAdviceList totalCount(Long totalCount) {
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


  public DavisSecurityAdviceList pageSize(Integer pageSize) {
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


  public DavisSecurityAdviceList nextPageKey(String nextPageKey) {
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


  public DavisSecurityAdviceList advices(List<DavisSecurityAdvice> advices) {
    this.advices = advices;
    return this;
  }

  public DavisSecurityAdviceList addAdvicesItem(DavisSecurityAdvice advicesItem) {
    if (this.advices == null) {
      this.advices = new ArrayList<>();
    }
    this.advices.add(advicesItem);
    return this;
  }

   /**
   * Get advices
   * @return advices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DavisSecurityAdvice> getAdvices() {
    return advices;
  }


  @JsonProperty(JSON_PROPERTY_ADVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvices(List<DavisSecurityAdvice> advices) {
    this.advices = advices;
  }


  /**
   * Return true if this DavisSecurityAdviceList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DavisSecurityAdviceList davisSecurityAdviceList = (DavisSecurityAdviceList) o;
    return Objects.equals(this.totalCount, davisSecurityAdviceList.totalCount) &&
        Objects.equals(this.pageSize, davisSecurityAdviceList.pageSize) &&
        Objects.equals(this.nextPageKey, davisSecurityAdviceList.nextPageKey) &&
        Objects.equals(this.advices, davisSecurityAdviceList.advices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageSize, nextPageKey, advices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DavisSecurityAdviceList {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
    sb.append("    advices: ").append(toIndentedString(advices)).append("\n");
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
