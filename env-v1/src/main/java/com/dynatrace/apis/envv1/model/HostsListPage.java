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
import com.dynatrace.apis.envv1.model.HostAgentInfo;
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
 * A list of hosts with OneAgent deployment information for each host.
 */
@ApiModel(description = "A list of hosts with OneAgent deployment information for each host.")
@JsonPropertyOrder({
  HostsListPage.JSON_PROPERTY_PERCENTAGE_OF_ENVIRONMENT_SEARCHED,
  HostsListPage.JSON_PROPERTY_NEXT_PAGE_KEY,
  HostsListPage.JSON_PROPERTY_HOSTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class HostsListPage {
  public static final String JSON_PROPERTY_PERCENTAGE_OF_ENVIRONMENT_SEARCHED = "percentageOfEnvironmentSearched";
  private Double percentageOfEnvironmentSearched;

  public static final String JSON_PROPERTY_NEXT_PAGE_KEY = "nextPageKey";
  private String nextPageKey;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<HostAgentInfo> hosts = null;

  public HostsListPage() { 
  }

  public HostsListPage percentageOfEnvironmentSearched(Double percentageOfEnvironmentSearched) {
    this.percentageOfEnvironmentSearched = percentageOfEnvironmentSearched;
    return this;
  }

   /**
   * The progress of the environment search, in percent.
   * @return percentageOfEnvironmentSearched
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The progress of the environment search, in percent.")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_OF_ENVIRONMENT_SEARCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPercentageOfEnvironmentSearched() {
    return percentageOfEnvironmentSearched;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_OF_ENVIRONMENT_SEARCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentageOfEnvironmentSearched(Double percentageOfEnvironmentSearched) {
    this.percentageOfEnvironmentSearched = percentageOfEnvironmentSearched;
  }


  public HostsListPage nextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
    return this;
  }

   /**
   * The cursor for the next page of results.    Has the value of &#x60;null&#x60; on the last page.   There might be another page of results even if the current page is empty.
   * @return nextPageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cursor for the next page of results.    Has the value of `null` on the last page.   There might be another page of results even if the current page is empty.")
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


  public HostsListPage hosts(List<HostAgentInfo> hosts) {
    this.hosts = hosts;
    return this;
  }

  public HostsListPage addHostsItem(HostAgentInfo hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * A list of hosts with OneAgent deployment information for each host.
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of hosts with OneAgent deployment information for each host.")
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HostAgentInfo> getHosts() {
    return hosts;
  }


  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHosts(List<HostAgentInfo> hosts) {
    this.hosts = hosts;
  }


  /**
   * Return true if this HostsListPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostsListPage hostsListPage = (HostsListPage) o;
    return Objects.equals(this.percentageOfEnvironmentSearched, hostsListPage.percentageOfEnvironmentSearched) &&
        Objects.equals(this.nextPageKey, hostsListPage.nextPageKey) &&
        Objects.equals(this.hosts, hostsListPage.hosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentageOfEnvironmentSearched, nextPageKey, hosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostsListPage {\n");
    sb.append("    percentageOfEnvironmentSearched: ").append(toIndentedString(percentageOfEnvironmentSearched)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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
