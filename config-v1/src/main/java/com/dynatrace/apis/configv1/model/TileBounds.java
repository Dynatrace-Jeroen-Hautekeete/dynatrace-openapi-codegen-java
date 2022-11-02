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
 * The position and size of a tile.
 */
@ApiModel(description = "The position and size of a tile.")
@JsonPropertyOrder({
  TileBounds.JSON_PROPERTY_TOP,
  TileBounds.JSON_PROPERTY_LEFT,
  TileBounds.JSON_PROPERTY_WIDTH,
  TileBounds.JSON_PROPERTY_HEIGHT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class TileBounds {
  public static final String JSON_PROPERTY_TOP = "top";
  private Integer top;

  public static final String JSON_PROPERTY_LEFT = "left";
  private Integer left;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public TileBounds() { 
  }

  public TileBounds top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * The vertical distance from the top left corner of the dashboard to the top left corner of the tile, in pixels.
   * @return top
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vertical distance from the top left corner of the dashboard to the top left corner of the tile, in pixels.")
  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTop() {
    return top;
  }


  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTop(Integer top) {
    this.top = top;
  }


  public TileBounds left(Integer left) {
    this.left = left;
    return this;
  }

   /**
   * The horizontal distance from the top left corner of the dashboard to the top left corner of the tile, in pixels.
   * @return left
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The horizontal distance from the top left corner of the dashboard to the top left corner of the tile, in pixels.")
  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeft() {
    return left;
  }


  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeft(Integer left) {
    this.left = left;
  }


  public TileBounds width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the tile, in pixels.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the tile, in pixels.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public TileBounds height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the tile, in pixels.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the tile, in pixels.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Return true if this TileBounds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TileBounds tileBounds = (TileBounds) o;
    return Objects.equals(this.top, tileBounds.top) &&
        Objects.equals(this.left, tileBounds.left) &&
        Objects.equals(this.width, tileBounds.width) &&
        Objects.equals(this.height, tileBounds.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(top, left, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TileBounds {\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

