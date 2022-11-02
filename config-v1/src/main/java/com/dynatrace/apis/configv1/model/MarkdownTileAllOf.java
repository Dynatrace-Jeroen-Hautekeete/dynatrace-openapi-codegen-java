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
 * MarkdownTileAllOf
 */
@JsonPropertyOrder({
  MarkdownTileAllOf.JSON_PROPERTY_MARKDOWN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class MarkdownTileAllOf {
  public static final String JSON_PROPERTY_MARKDOWN = "markdown";
  private String markdown;

  public MarkdownTileAllOf() { 
  }

  public MarkdownTileAllOf markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

   /**
   * The markdown-formatted content of the tile.
   * @return markdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The markdown-formatted content of the tile.")
  @JsonProperty(JSON_PROPERTY_MARKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarkdown() {
    return markdown;
  }


  @JsonProperty(JSON_PROPERTY_MARKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }


  /**
   * Return true if this MarkdownTile_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkdownTileAllOf markdownTileAllOf = (MarkdownTileAllOf) o;
    return Objects.equals(this.markdown, markdownTileAllOf.markdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkdownTileAllOf {\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
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

