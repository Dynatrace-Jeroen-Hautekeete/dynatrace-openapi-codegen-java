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
import com.dynatrace.apis.configv1.model.SessionReplayMaskingSetting;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Content masking settings for Session Replay.   For more details, see [Configure Session Replay](https://dt-url.net/0m03slq) in Dynatrace Documentation.
 */
@ApiModel(description = "Content masking settings for Session Replay.   For more details, see [Configure Session Replay](https://dt-url.net/0m03slq) in Dynatrace Documentation.")
@JsonPropertyOrder({
  SessionReplayContentMaskingSettings.JSON_PROPERTY_RECORDING_MASKING_SETTINGS_VERSION,
  SessionReplayContentMaskingSettings.JSON_PROPERTY_RECORDING_MASKING_SETTINGS,
  SessionReplayContentMaskingSettings.JSON_PROPERTY_PLAYBACK_MASKING_SETTINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class SessionReplayContentMaskingSettings {
  public static final String JSON_PROPERTY_RECORDING_MASKING_SETTINGS_VERSION = "recordingMaskingSettingsVersion";
  private Integer recordingMaskingSettingsVersion;

  public static final String JSON_PROPERTY_RECORDING_MASKING_SETTINGS = "recordingMaskingSettings";
  private SessionReplayMaskingSetting recordingMaskingSettings;

  public static final String JSON_PROPERTY_PLAYBACK_MASKING_SETTINGS = "playbackMaskingSettings";
  private SessionReplayMaskingSetting playbackMaskingSettings;

  public SessionReplayContentMaskingSettings() { 
  }

  public SessionReplayContentMaskingSettings recordingMaskingSettingsVersion(Integer recordingMaskingSettingsVersion) {
    this.recordingMaskingSettingsVersion = recordingMaskingSettingsVersion;
    return this;
  }

   /**
   * The version of the content masking.   You can use this API only with the version 2.   If you&#39;re using version 1, set this field to &#x60;2&#x60; in the PUT request to switch to version 2.
   * @return recordingMaskingSettingsVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The version of the content masking.   You can use this API only with the version 2.   If you're using version 1, set this field to `2` in the PUT request to switch to version 2.")
  @JsonProperty(JSON_PROPERTY_RECORDING_MASKING_SETTINGS_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRecordingMaskingSettingsVersion() {
    return recordingMaskingSettingsVersion;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_MASKING_SETTINGS_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordingMaskingSettingsVersion(Integer recordingMaskingSettingsVersion) {
    this.recordingMaskingSettingsVersion = recordingMaskingSettingsVersion;
  }


  public SessionReplayContentMaskingSettings recordingMaskingSettings(SessionReplayMaskingSetting recordingMaskingSettings) {
    this.recordingMaskingSettings = recordingMaskingSettings;
    return this;
  }

   /**
   * Get recordingMaskingSettings
   * @return recordingMaskingSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDING_MASKING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SessionReplayMaskingSetting getRecordingMaskingSettings() {
    return recordingMaskingSettings;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_MASKING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingMaskingSettings(SessionReplayMaskingSetting recordingMaskingSettings) {
    this.recordingMaskingSettings = recordingMaskingSettings;
  }


  public SessionReplayContentMaskingSettings playbackMaskingSettings(SessionReplayMaskingSetting playbackMaskingSettings) {
    this.playbackMaskingSettings = playbackMaskingSettings;
    return this;
  }

   /**
   * Get playbackMaskingSettings
   * @return playbackMaskingSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYBACK_MASKING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SessionReplayMaskingSetting getPlaybackMaskingSettings() {
    return playbackMaskingSettings;
  }


  @JsonProperty(JSON_PROPERTY_PLAYBACK_MASKING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaybackMaskingSettings(SessionReplayMaskingSetting playbackMaskingSettings) {
    this.playbackMaskingSettings = playbackMaskingSettings;
  }


  /**
   * Return true if this SessionReplayContentMaskingSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionReplayContentMaskingSettings sessionReplayContentMaskingSettings = (SessionReplayContentMaskingSettings) o;
    return Objects.equals(this.recordingMaskingSettingsVersion, sessionReplayContentMaskingSettings.recordingMaskingSettingsVersion) &&
        Objects.equals(this.recordingMaskingSettings, sessionReplayContentMaskingSettings.recordingMaskingSettings) &&
        Objects.equals(this.playbackMaskingSettings, sessionReplayContentMaskingSettings.playbackMaskingSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordingMaskingSettingsVersion, recordingMaskingSettings, playbackMaskingSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionReplayContentMaskingSettings {\n");
    sb.append("    recordingMaskingSettingsVersion: ").append(toIndentedString(recordingMaskingSettingsVersion)).append("\n");
    sb.append("    recordingMaskingSettings: ").append(toIndentedString(recordingMaskingSettings)).append("\n");
    sb.append("    playbackMaskingSettings: ").append(toIndentedString(playbackMaskingSettings)).append("\n");
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
