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
import com.dynatrace.apis.configv1.model.EntityShortRepresentation;
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
 * A list of configurations.
 */
@ApiModel(description = "A list of configurations.")
@JsonPropertyOrder({
  ExtensionConfigurationList.JSON_PROPERTY_CONFIGURATIONS_LIST,
  ExtensionConfigurationList.JSON_PROPERTY_TOTAL_RESULTS,
  ExtensionConfigurationList.JSON_PROPERTY_NEXT_PAGE_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ExtensionConfigurationList {
  public static final String JSON_PROPERTY_CONFIGURATIONS_LIST = "configurationsList";
  private List<EntityShortRepresentation> configurationsList = null;

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "totalResults";
  private Integer totalResults;

  public static final String JSON_PROPERTY_NEXT_PAGE_KEY = "nextPageKey";
  private String nextPageKey;

  public ExtensionConfigurationList() { 
  }

  public ExtensionConfigurationList configurationsList(List<EntityShortRepresentation> configurationsList) {
    this.configurationsList = configurationsList;
    return this;
  }

  public ExtensionConfigurationList addConfigurationsListItem(EntityShortRepresentation configurationsListItem) {
    if (this.configurationsList == null) {
      this.configurationsList = new ArrayList<>();
    }
    this.configurationsList.add(configurationsListItem);
    return this;
  }

   /**
   * List of configurations.
   * @return configurationsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of configurations.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EntityShortRepresentation> getConfigurationsList() {
    return configurationsList;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATIONS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationsList(List<EntityShortRepresentation> configurationsList) {
    this.configurationsList = configurationsList;
  }


  public ExtensionConfigurationList totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * The total number of entries in the result.
   * @return totalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of entries in the result.")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public ExtensionConfigurationList nextPageKey(String nextPageKey) {
    this.nextPageKey = nextPageKey;
    return this;
  }

   /**
   * The cursor for the next page of results. Has the value of &#x60;null&#x60; on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result.
   * @return nextPageKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cursor for the next page of results. Has the value of `null` on the last page.   Use it in the **nextPageKey** query parameter to obtain subsequent pages of the result.")
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
   * Return true if this ExtensionConfigurationList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionConfigurationList extensionConfigurationList = (ExtensionConfigurationList) o;
    return Objects.equals(this.configurationsList, extensionConfigurationList.configurationsList) &&
        Objects.equals(this.totalResults, extensionConfigurationList.totalResults) &&
        Objects.equals(this.nextPageKey, extensionConfigurationList.nextPageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationsList, totalResults, nextPageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionConfigurationList {\n");
    sb.append("    configurationsList: ").append(toIndentedString(configurationsList)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    nextPageKey: ").append(toIndentedString(nextPageKey)).append("\n");
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

