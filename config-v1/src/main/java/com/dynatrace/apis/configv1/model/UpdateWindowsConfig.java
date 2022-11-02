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
import com.dynatrace.apis.configv1.model.UpdateWindow;
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
 * Basic information about all configured maintenance windows
 */
@ApiModel(description = "Basic information about all configured maintenance windows")
@JsonPropertyOrder({
  UpdateWindowsConfig.JSON_PROPERTY_WINDOWS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class UpdateWindowsConfig {
  public static final String JSON_PROPERTY_WINDOWS = "windows";
  private List<UpdateWindow> windows = new ArrayList<>();

  public UpdateWindowsConfig() { 
  }

  public UpdateWindowsConfig windows(List<UpdateWindow> windows) {
    this.windows = windows;
    return this;
  }

  public UpdateWindowsConfig addWindowsItem(UpdateWindow windowsItem) {
    this.windows.add(windowsItem);
    return this;
  }

   /**
   * List of maintenance windows when the OneAgent update can start. If there is no value and update should be performed, the update will start at earliest convenience.
   * @return windows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of maintenance windows when the OneAgent update can start. If there is no value and update should be performed, the update will start at earliest convenience.")
  @JsonProperty(JSON_PROPERTY_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UpdateWindow> getWindows() {
    return windows;
  }


  @JsonProperty(JSON_PROPERTY_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWindows(List<UpdateWindow> windows) {
    this.windows = windows;
  }


  /**
   * Return true if this UpdateWindowsConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWindowsConfig updateWindowsConfig = (UpdateWindowsConfig) o;
    return Objects.equals(this.windows, updateWindowsConfig.windows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWindowsConfig {\n");
    sb.append("    windows: ").append(toIndentedString(windows)).append("\n");
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
