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
import com.dynatrace.apis.envv1.model.EntityBaselineData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The baseline data for an application and its children for each available duration metric.   A duration metric is one of the following:  * **DOM interactive**  * **HTML downloaded**  * **Load event end**  * **Load event start**  * **Response time**  * **Speed index**  * **Time to first byte**  * **Visually complete**
 */
@ApiModel(description = "The baseline data for an application and its children for each available duration metric.   A duration metric is one of the following:  * **DOM interactive**  * **HTML downloaded**  * **Load event end**  * **Load event start**  * **Response time**  * **Speed index**  * **Time to first byte**  * **Visually complete**")
@JsonPropertyOrder({
  ApplicationBaselineValues.JSON_PROPERTY_ENTITY_ID,
  ApplicationBaselineValues.JSON_PROPERTY_DISPLAY_NAME,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_DOM_INTERACTIVE_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_HTML_DOWNLOADED_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_LOAD_EVENT_END_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_LOAD_EVENT_START_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_RESPONSE_TIME_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_SPEED_INDEX_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_TIME_TO_FIRST_BYTE_BASELINES,
  ApplicationBaselineValues.JSON_PROPERTY_APPLICATION_VISUAL_COMPLETE_BASELINES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ApplicationBaselineValues {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_APPLICATION_DOM_INTERACTIVE_BASELINES = "applicationDomInteractiveBaselines";
  private Set<EntityBaselineData> applicationDomInteractiveBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_HTML_DOWNLOADED_BASELINES = "applicationHtmlDownloadedBaselines";
  private Set<EntityBaselineData> applicationHtmlDownloadedBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_LOAD_EVENT_END_BASELINES = "applicationLoadEventEndBaselines";
  private Set<EntityBaselineData> applicationLoadEventEndBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_LOAD_EVENT_START_BASELINES = "applicationLoadEventStartBaselines";
  private Set<EntityBaselineData> applicationLoadEventStartBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_RESPONSE_TIME_BASELINES = "applicationResponseTimeBaselines";
  private Set<EntityBaselineData> applicationResponseTimeBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_SPEED_INDEX_BASELINES = "applicationSpeedIndexBaselines";
  private Set<EntityBaselineData> applicationSpeedIndexBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_TIME_TO_FIRST_BYTE_BASELINES = "applicationTimeToFirstByteBaselines";
  private Set<EntityBaselineData> applicationTimeToFirstByteBaselines = null;

  public static final String JSON_PROPERTY_APPLICATION_VISUAL_COMPLETE_BASELINES = "applicationVisualCompleteBaselines";
  private Set<EntityBaselineData> applicationVisualCompleteBaselines = null;

  public ApplicationBaselineValues() { 
  }

  public ApplicationBaselineValues entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * The Dynatrace entity ID of the application.
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Dynatrace entity ID of the application.")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public ApplicationBaselineValues displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the application as displayed in the UI.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the application as displayed in the UI.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ApplicationBaselineValues applicationDomInteractiveBaselines(Set<EntityBaselineData> applicationDomInteractiveBaselines) {
    this.applicationDomInteractiveBaselines = applicationDomInteractiveBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationDomInteractiveBaselinesItem(EntityBaselineData applicationDomInteractiveBaselinesItem) {
    if (this.applicationDomInteractiveBaselines == null) {
      this.applicationDomInteractiveBaselines = new LinkedHashSet<>();
    }
    this.applicationDomInteractiveBaselines.add(applicationDomInteractiveBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **DOM interactive** duration metric.
   * @return applicationDomInteractiveBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **DOM interactive** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_DOM_INTERACTIVE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationDomInteractiveBaselines() {
    return applicationDomInteractiveBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_DOM_INTERACTIVE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationDomInteractiveBaselines(Set<EntityBaselineData> applicationDomInteractiveBaselines) {
    this.applicationDomInteractiveBaselines = applicationDomInteractiveBaselines;
  }


  public ApplicationBaselineValues applicationHtmlDownloadedBaselines(Set<EntityBaselineData> applicationHtmlDownloadedBaselines) {
    this.applicationHtmlDownloadedBaselines = applicationHtmlDownloadedBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationHtmlDownloadedBaselinesItem(EntityBaselineData applicationHtmlDownloadedBaselinesItem) {
    if (this.applicationHtmlDownloadedBaselines == null) {
      this.applicationHtmlDownloadedBaselines = new LinkedHashSet<>();
    }
    this.applicationHtmlDownloadedBaselines.add(applicationHtmlDownloadedBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **HTML downloaded** duration metric.
   * @return applicationHtmlDownloadedBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **HTML downloaded** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_HTML_DOWNLOADED_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationHtmlDownloadedBaselines() {
    return applicationHtmlDownloadedBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_HTML_DOWNLOADED_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationHtmlDownloadedBaselines(Set<EntityBaselineData> applicationHtmlDownloadedBaselines) {
    this.applicationHtmlDownloadedBaselines = applicationHtmlDownloadedBaselines;
  }


  public ApplicationBaselineValues applicationLoadEventEndBaselines(Set<EntityBaselineData> applicationLoadEventEndBaselines) {
    this.applicationLoadEventEndBaselines = applicationLoadEventEndBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationLoadEventEndBaselinesItem(EntityBaselineData applicationLoadEventEndBaselinesItem) {
    if (this.applicationLoadEventEndBaselines == null) {
      this.applicationLoadEventEndBaselines = new LinkedHashSet<>();
    }
    this.applicationLoadEventEndBaselines.add(applicationLoadEventEndBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Load event end** duration metric.
   * @return applicationLoadEventEndBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Load event end** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_LOAD_EVENT_END_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationLoadEventEndBaselines() {
    return applicationLoadEventEndBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_LOAD_EVENT_END_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationLoadEventEndBaselines(Set<EntityBaselineData> applicationLoadEventEndBaselines) {
    this.applicationLoadEventEndBaselines = applicationLoadEventEndBaselines;
  }


  public ApplicationBaselineValues applicationLoadEventStartBaselines(Set<EntityBaselineData> applicationLoadEventStartBaselines) {
    this.applicationLoadEventStartBaselines = applicationLoadEventStartBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationLoadEventStartBaselinesItem(EntityBaselineData applicationLoadEventStartBaselinesItem) {
    if (this.applicationLoadEventStartBaselines == null) {
      this.applicationLoadEventStartBaselines = new LinkedHashSet<>();
    }
    this.applicationLoadEventStartBaselines.add(applicationLoadEventStartBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Load event start** duration metric.
   * @return applicationLoadEventStartBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Load event start** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_LOAD_EVENT_START_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationLoadEventStartBaselines() {
    return applicationLoadEventStartBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_LOAD_EVENT_START_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationLoadEventStartBaselines(Set<EntityBaselineData> applicationLoadEventStartBaselines) {
    this.applicationLoadEventStartBaselines = applicationLoadEventStartBaselines;
  }


  public ApplicationBaselineValues applicationResponseTimeBaselines(Set<EntityBaselineData> applicationResponseTimeBaselines) {
    this.applicationResponseTimeBaselines = applicationResponseTimeBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationResponseTimeBaselinesItem(EntityBaselineData applicationResponseTimeBaselinesItem) {
    if (this.applicationResponseTimeBaselines == null) {
      this.applicationResponseTimeBaselines = new LinkedHashSet<>();
    }
    this.applicationResponseTimeBaselines.add(applicationResponseTimeBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Response time** duration metric.
   * @return applicationResponseTimeBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Response time** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_RESPONSE_TIME_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationResponseTimeBaselines() {
    return applicationResponseTimeBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_RESPONSE_TIME_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationResponseTimeBaselines(Set<EntityBaselineData> applicationResponseTimeBaselines) {
    this.applicationResponseTimeBaselines = applicationResponseTimeBaselines;
  }


  public ApplicationBaselineValues applicationSpeedIndexBaselines(Set<EntityBaselineData> applicationSpeedIndexBaselines) {
    this.applicationSpeedIndexBaselines = applicationSpeedIndexBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationSpeedIndexBaselinesItem(EntityBaselineData applicationSpeedIndexBaselinesItem) {
    if (this.applicationSpeedIndexBaselines == null) {
      this.applicationSpeedIndexBaselines = new LinkedHashSet<>();
    }
    this.applicationSpeedIndexBaselines.add(applicationSpeedIndexBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Speed index** duration metric.
   * @return applicationSpeedIndexBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Speed index** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_SPEED_INDEX_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationSpeedIndexBaselines() {
    return applicationSpeedIndexBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_SPEED_INDEX_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationSpeedIndexBaselines(Set<EntityBaselineData> applicationSpeedIndexBaselines) {
    this.applicationSpeedIndexBaselines = applicationSpeedIndexBaselines;
  }


  public ApplicationBaselineValues applicationTimeToFirstByteBaselines(Set<EntityBaselineData> applicationTimeToFirstByteBaselines) {
    this.applicationTimeToFirstByteBaselines = applicationTimeToFirstByteBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationTimeToFirstByteBaselinesItem(EntityBaselineData applicationTimeToFirstByteBaselinesItem) {
    if (this.applicationTimeToFirstByteBaselines == null) {
      this.applicationTimeToFirstByteBaselines = new LinkedHashSet<>();
    }
    this.applicationTimeToFirstByteBaselines.add(applicationTimeToFirstByteBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Time to first byte** duration metric.
   * @return applicationTimeToFirstByteBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Time to first byte** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_TIME_TO_FIRST_BYTE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationTimeToFirstByteBaselines() {
    return applicationTimeToFirstByteBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_TIME_TO_FIRST_BYTE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationTimeToFirstByteBaselines(Set<EntityBaselineData> applicationTimeToFirstByteBaselines) {
    this.applicationTimeToFirstByteBaselines = applicationTimeToFirstByteBaselines;
  }


  public ApplicationBaselineValues applicationVisualCompleteBaselines(Set<EntityBaselineData> applicationVisualCompleteBaselines) {
    this.applicationVisualCompleteBaselines = applicationVisualCompleteBaselines;
    return this;
  }

  public ApplicationBaselineValues addApplicationVisualCompleteBaselinesItem(EntityBaselineData applicationVisualCompleteBaselinesItem) {
    if (this.applicationVisualCompleteBaselines == null) {
      this.applicationVisualCompleteBaselines = new LinkedHashSet<>();
    }
    this.applicationVisualCompleteBaselines.add(applicationVisualCompleteBaselinesItem);
    return this;
  }

   /**
   * The baseline data for the **Visually complete** duration metric.
   * @return applicationVisualCompleteBaselines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The baseline data for the **Visually complete** duration metric.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_VISUAL_COMPLETE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<EntityBaselineData> getApplicationVisualCompleteBaselines() {
    return applicationVisualCompleteBaselines;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_APPLICATION_VISUAL_COMPLETE_BASELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationVisualCompleteBaselines(Set<EntityBaselineData> applicationVisualCompleteBaselines) {
    this.applicationVisualCompleteBaselines = applicationVisualCompleteBaselines;
  }


  /**
   * Return true if this ApplicationBaselineValues object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationBaselineValues applicationBaselineValues = (ApplicationBaselineValues) o;
    return Objects.equals(this.entityId, applicationBaselineValues.entityId) &&
        Objects.equals(this.displayName, applicationBaselineValues.displayName) &&
        Objects.equals(this.applicationDomInteractiveBaselines, applicationBaselineValues.applicationDomInteractiveBaselines) &&
        Objects.equals(this.applicationHtmlDownloadedBaselines, applicationBaselineValues.applicationHtmlDownloadedBaselines) &&
        Objects.equals(this.applicationLoadEventEndBaselines, applicationBaselineValues.applicationLoadEventEndBaselines) &&
        Objects.equals(this.applicationLoadEventStartBaselines, applicationBaselineValues.applicationLoadEventStartBaselines) &&
        Objects.equals(this.applicationResponseTimeBaselines, applicationBaselineValues.applicationResponseTimeBaselines) &&
        Objects.equals(this.applicationSpeedIndexBaselines, applicationBaselineValues.applicationSpeedIndexBaselines) &&
        Objects.equals(this.applicationTimeToFirstByteBaselines, applicationBaselineValues.applicationTimeToFirstByteBaselines) &&
        Objects.equals(this.applicationVisualCompleteBaselines, applicationBaselineValues.applicationVisualCompleteBaselines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, displayName, applicationDomInteractiveBaselines, applicationHtmlDownloadedBaselines, applicationLoadEventEndBaselines, applicationLoadEventStartBaselines, applicationResponseTimeBaselines, applicationSpeedIndexBaselines, applicationTimeToFirstByteBaselines, applicationVisualCompleteBaselines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationBaselineValues {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    applicationDomInteractiveBaselines: ").append(toIndentedString(applicationDomInteractiveBaselines)).append("\n");
    sb.append("    applicationHtmlDownloadedBaselines: ").append(toIndentedString(applicationHtmlDownloadedBaselines)).append("\n");
    sb.append("    applicationLoadEventEndBaselines: ").append(toIndentedString(applicationLoadEventEndBaselines)).append("\n");
    sb.append("    applicationLoadEventStartBaselines: ").append(toIndentedString(applicationLoadEventStartBaselines)).append("\n");
    sb.append("    applicationResponseTimeBaselines: ").append(toIndentedString(applicationResponseTimeBaselines)).append("\n");
    sb.append("    applicationSpeedIndexBaselines: ").append(toIndentedString(applicationSpeedIndexBaselines)).append("\n");
    sb.append("    applicationTimeToFirstByteBaselines: ").append(toIndentedString(applicationTimeToFirstByteBaselines)).append("\n");
    sb.append("    applicationVisualCompleteBaselines: ").append(toIndentedString(applicationVisualCompleteBaselines)).append("\n");
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

