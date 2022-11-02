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
import com.dynatrace.apis.envv1.model.Host4pg;
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
 * LogFile4pg
 */
@JsonPropertyOrder({
  LogFile4pg.JSON_PROPERTY_PATH,
  LogFile4pg.JSON_PROPERTY_SIZE,
  LogFile4pg.JSON_PROPERTY_HOSTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class LogFile4pg {
  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_HOSTS = "hosts";
  private List<Host4pg> hosts = null;

  public LogFile4pg() { 
  }

  public LogFile4pg path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The full path to the log.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full path to the log.")
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


  public LogFile4pg size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the log, bytes
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the log, bytes")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public LogFile4pg hosts(List<Host4pg> hosts) {
    this.hosts = hosts;
    return this;
  }

  public LogFile4pg addHostsItem(Host4pg hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * The distribution of the process group log across hosts.
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distribution of the process group log across hosts.")
  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Host4pg> getHosts() {
    return hosts;
  }


  @JsonProperty(JSON_PROPERTY_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHosts(List<Host4pg> hosts) {
    this.hosts = hosts;
  }


  /**
   * Return true if this LogFile4pg object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogFile4pg logFile4pg = (LogFile4pg) o;
    return Objects.equals(this.path, logFile4pg.path) &&
        Objects.equals(this.size, logFile4pg.size) &&
        Objects.equals(this.hosts, logFile4pg.hosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, size, hosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogFile4pg {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
