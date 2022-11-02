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
import com.dynatrace.apis.configv1.model.ResourceTimingSettings;
import com.dynatrace.apis.configv1.model.TimeoutSettings;
import com.dynatrace.apis.configv1.model.VisuallyComplete2Settings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Settings for content capture.
 */
@ApiModel(description = "Settings for content capture.")
@JsonPropertyOrder({
  ContentCapture.JSON_PROPERTY_RESOURCE_TIMING_SETTINGS,
  ContentCapture.JSON_PROPERTY_JAVA_SCRIPT_ERRORS,
  ContentCapture.JSON_PROPERTY_TIMEOUT_SETTINGS,
  ContentCapture.JSON_PROPERTY_VISUALLY_COMPLETE_AND_SPEED_INDEX,
  ContentCapture.JSON_PROPERTY_VISUALLY_COMPLETE2_SETTINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ContentCapture {
  public static final String JSON_PROPERTY_RESOURCE_TIMING_SETTINGS = "resourceTimingSettings";
  private ResourceTimingSettings resourceTimingSettings;

  public static final String JSON_PROPERTY_JAVA_SCRIPT_ERRORS = "javaScriptErrors";
  private Boolean javaScriptErrors;

  public static final String JSON_PROPERTY_TIMEOUT_SETTINGS = "timeoutSettings";
  private TimeoutSettings timeoutSettings;

  public static final String JSON_PROPERTY_VISUALLY_COMPLETE_AND_SPEED_INDEX = "visuallyCompleteAndSpeedIndex";
  private Boolean visuallyCompleteAndSpeedIndex;

  public static final String JSON_PROPERTY_VISUALLY_COMPLETE2_SETTINGS = "visuallyComplete2Settings";
  private VisuallyComplete2Settings visuallyComplete2Settings;

  public ContentCapture() { 
  }

  public ContentCapture resourceTimingSettings(ResourceTimingSettings resourceTimingSettings) {
    this.resourceTimingSettings = resourceTimingSettings;
    return this;
  }

   /**
   * Get resourceTimingSettings
   * @return resourceTimingSettings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TIMING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResourceTimingSettings getResourceTimingSettings() {
    return resourceTimingSettings;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TIMING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceTimingSettings(ResourceTimingSettings resourceTimingSettings) {
    this.resourceTimingSettings = resourceTimingSettings;
  }


  public ContentCapture javaScriptErrors(Boolean javaScriptErrors) {
    this.javaScriptErrors = javaScriptErrors;
    return this;
  }

   /**
   * JavaScript errors monitoring enabled/disabled.
   * @return javaScriptErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "JavaScript errors monitoring enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getJavaScriptErrors() {
    return javaScriptErrors;
  }


  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJavaScriptErrors(Boolean javaScriptErrors) {
    this.javaScriptErrors = javaScriptErrors;
  }


  public ContentCapture timeoutSettings(TimeoutSettings timeoutSettings) {
    this.timeoutSettings = timeoutSettings;
    return this;
  }

   /**
   * Get timeoutSettings
   * @return timeoutSettings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TimeoutSettings getTimeoutSettings() {
    return timeoutSettings;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeoutSettings(TimeoutSettings timeoutSettings) {
    this.timeoutSettings = timeoutSettings;
  }


  public ContentCapture visuallyCompleteAndSpeedIndex(Boolean visuallyCompleteAndSpeedIndex) {
    this.visuallyCompleteAndSpeedIndex = visuallyCompleteAndSpeedIndex;
    return this;
  }

   /**
   * Visually complete and Speed index support enabled/disabled.
   * @return visuallyCompleteAndSpeedIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Visually complete and Speed index support enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_VISUALLY_COMPLETE_AND_SPEED_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVisuallyCompleteAndSpeedIndex() {
    return visuallyCompleteAndSpeedIndex;
  }


  @JsonProperty(JSON_PROPERTY_VISUALLY_COMPLETE_AND_SPEED_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisuallyCompleteAndSpeedIndex(Boolean visuallyCompleteAndSpeedIndex) {
    this.visuallyCompleteAndSpeedIndex = visuallyCompleteAndSpeedIndex;
  }


  public ContentCapture visuallyComplete2Settings(VisuallyComplete2Settings visuallyComplete2Settings) {
    this.visuallyComplete2Settings = visuallyComplete2Settings;
    return this;
  }

   /**
   * Get visuallyComplete2Settings
   * @return visuallyComplete2Settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VISUALLY_COMPLETE2_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisuallyComplete2Settings getVisuallyComplete2Settings() {
    return visuallyComplete2Settings;
  }


  @JsonProperty(JSON_PROPERTY_VISUALLY_COMPLETE2_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisuallyComplete2Settings(VisuallyComplete2Settings visuallyComplete2Settings) {
    this.visuallyComplete2Settings = visuallyComplete2Settings;
  }


  /**
   * Return true if this ContentCapture object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentCapture contentCapture = (ContentCapture) o;
    return Objects.equals(this.resourceTimingSettings, contentCapture.resourceTimingSettings) &&
        Objects.equals(this.javaScriptErrors, contentCapture.javaScriptErrors) &&
        Objects.equals(this.timeoutSettings, contentCapture.timeoutSettings) &&
        Objects.equals(this.visuallyCompleteAndSpeedIndex, contentCapture.visuallyCompleteAndSpeedIndex) &&
        Objects.equals(this.visuallyComplete2Settings, contentCapture.visuallyComplete2Settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTimingSettings, javaScriptErrors, timeoutSettings, visuallyCompleteAndSpeedIndex, visuallyComplete2Settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCapture {\n");
    sb.append("    resourceTimingSettings: ").append(toIndentedString(resourceTimingSettings)).append("\n");
    sb.append("    javaScriptErrors: ").append(toIndentedString(javaScriptErrors)).append("\n");
    sb.append("    timeoutSettings: ").append(toIndentedString(timeoutSettings)).append("\n");
    sb.append("    visuallyCompleteAndSpeedIndex: ").append(toIndentedString(visuallyCompleteAndSpeedIndex)).append("\n");
    sb.append("    visuallyComplete2Settings: ").append(toIndentedString(visuallyComplete2Settings)).append("\n");
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
