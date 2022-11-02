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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Global event capture settings.
 */
@ApiModel(description = "Global event capture settings.")
@JsonPropertyOrder({
  GlobalEventCaptureSettings.JSON_PROPERTY_MOUSE_UP,
  GlobalEventCaptureSettings.JSON_PROPERTY_MOUSE_DOWN,
  GlobalEventCaptureSettings.JSON_PROPERTY_CLICK,
  GlobalEventCaptureSettings.JSON_PROPERTY_DOUBLE_CLICK,
  GlobalEventCaptureSettings.JSON_PROPERTY_KEY_UP,
  GlobalEventCaptureSettings.JSON_PROPERTY_KEY_DOWN,
  GlobalEventCaptureSettings.JSON_PROPERTY_SCROLL,
  GlobalEventCaptureSettings.JSON_PROPERTY_ADDITIONAL_EVENT_CAPTURED_AS_USER_INPUT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class GlobalEventCaptureSettings {
  public static final String JSON_PROPERTY_MOUSE_UP = "mouseUp";
  private Boolean mouseUp;

  public static final String JSON_PROPERTY_MOUSE_DOWN = "mouseDown";
  private Boolean mouseDown;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Boolean click;

  public static final String JSON_PROPERTY_DOUBLE_CLICK = "doubleClick";
  private Boolean doubleClick;

  public static final String JSON_PROPERTY_KEY_UP = "keyUp";
  private Boolean keyUp;

  public static final String JSON_PROPERTY_KEY_DOWN = "keyDown";
  private Boolean keyDown;

  public static final String JSON_PROPERTY_SCROLL = "scroll";
  private Boolean scroll;

  public static final String JSON_PROPERTY_ADDITIONAL_EVENT_CAPTURED_AS_USER_INPUT = "additionalEventCapturedAsUserInput";
  private String additionalEventCapturedAsUserInput;

  public GlobalEventCaptureSettings() { 
  }

  public GlobalEventCaptureSettings mouseUp(Boolean mouseUp) {
    this.mouseUp = mouseUp;
    return this;
  }

   /**
   * MouseUp enabled/disabled.
   * @return mouseUp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "MouseUp enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_MOUSE_UP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMouseUp() {
    return mouseUp;
  }


  @JsonProperty(JSON_PROPERTY_MOUSE_UP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMouseUp(Boolean mouseUp) {
    this.mouseUp = mouseUp;
  }


  public GlobalEventCaptureSettings mouseDown(Boolean mouseDown) {
    this.mouseDown = mouseDown;
    return this;
  }

   /**
   * MouseDown enabled/disabled.
   * @return mouseDown
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "MouseDown enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_MOUSE_DOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMouseDown() {
    return mouseDown;
  }


  @JsonProperty(JSON_PROPERTY_MOUSE_DOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMouseDown(Boolean mouseDown) {
    this.mouseDown = mouseDown;
  }


  public GlobalEventCaptureSettings click(Boolean click) {
    this.click = click;
    return this;
  }

   /**
   * Click enabled/disabled.
   * @return click
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Click enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClick(Boolean click) {
    this.click = click;
  }


  public GlobalEventCaptureSettings doubleClick(Boolean doubleClick) {
    this.doubleClick = doubleClick;
    return this;
  }

   /**
   * DoubleClick enabled/disabled.
   * @return doubleClick
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "DoubleClick enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_DOUBLE_CLICK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDoubleClick() {
    return doubleClick;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE_CLICK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDoubleClick(Boolean doubleClick) {
    this.doubleClick = doubleClick;
  }


  public GlobalEventCaptureSettings keyUp(Boolean keyUp) {
    this.keyUp = keyUp;
    return this;
  }

   /**
   * KeyUp enabled/disabled.
   * @return keyUp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "KeyUp enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_KEY_UP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getKeyUp() {
    return keyUp;
  }


  @JsonProperty(JSON_PROPERTY_KEY_UP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyUp(Boolean keyUp) {
    this.keyUp = keyUp;
  }


  public GlobalEventCaptureSettings keyDown(Boolean keyDown) {
    this.keyDown = keyDown;
    return this;
  }

   /**
   * KeyDown enabled/disabled.
   * @return keyDown
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "KeyDown enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_KEY_DOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getKeyDown() {
    return keyDown;
  }


  @JsonProperty(JSON_PROPERTY_KEY_DOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyDown(Boolean keyDown) {
    this.keyDown = keyDown;
  }


  public GlobalEventCaptureSettings scroll(Boolean scroll) {
    this.scroll = scroll;
    return this;
  }

   /**
   * Scroll enabled/disabled.
   * @return scroll
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Scroll enabled/disabled.")
  @JsonProperty(JSON_PROPERTY_SCROLL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getScroll() {
    return scroll;
  }


  @JsonProperty(JSON_PROPERTY_SCROLL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScroll(Boolean scroll) {
    this.scroll = scroll;
  }


  public GlobalEventCaptureSettings additionalEventCapturedAsUserInput(String additionalEventCapturedAsUserInput) {
    this.additionalEventCapturedAsUserInput = additionalEventCapturedAsUserInput;
    return this;
  }

   /**
   * Additional events to be captured globally as user input.   For example, DragStart or DragEnd.
   * @return additionalEventCapturedAsUserInput
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Additional events to be captured globally as user input.   For example, DragStart or DragEnd.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EVENT_CAPTURED_AS_USER_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAdditionalEventCapturedAsUserInput() {
    return additionalEventCapturedAsUserInput;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EVENT_CAPTURED_AS_USER_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalEventCapturedAsUserInput(String additionalEventCapturedAsUserInput) {
    this.additionalEventCapturedAsUserInput = additionalEventCapturedAsUserInput;
  }


  /**
   * Return true if this GlobalEventCaptureSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalEventCaptureSettings globalEventCaptureSettings = (GlobalEventCaptureSettings) o;
    return Objects.equals(this.mouseUp, globalEventCaptureSettings.mouseUp) &&
        Objects.equals(this.mouseDown, globalEventCaptureSettings.mouseDown) &&
        Objects.equals(this.click, globalEventCaptureSettings.click) &&
        Objects.equals(this.doubleClick, globalEventCaptureSettings.doubleClick) &&
        Objects.equals(this.keyUp, globalEventCaptureSettings.keyUp) &&
        Objects.equals(this.keyDown, globalEventCaptureSettings.keyDown) &&
        Objects.equals(this.scroll, globalEventCaptureSettings.scroll) &&
        Objects.equals(this.additionalEventCapturedAsUserInput, globalEventCaptureSettings.additionalEventCapturedAsUserInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mouseUp, mouseDown, click, doubleClick, keyUp, keyDown, scroll, additionalEventCapturedAsUserInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEventCaptureSettings {\n");
    sb.append("    mouseUp: ").append(toIndentedString(mouseUp)).append("\n");
    sb.append("    mouseDown: ").append(toIndentedString(mouseDown)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    doubleClick: ").append(toIndentedString(doubleClick)).append("\n");
    sb.append("    keyUp: ").append(toIndentedString(keyUp)).append("\n");
    sb.append("    keyDown: ").append(toIndentedString(keyDown)).append("\n");
    sb.append("    scroll: ").append(toIndentedString(scroll)).append("\n");
    sb.append("    additionalEventCapturedAsUserInput: ").append(toIndentedString(additionalEventCapturedAsUserInput)).append("\n");
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

