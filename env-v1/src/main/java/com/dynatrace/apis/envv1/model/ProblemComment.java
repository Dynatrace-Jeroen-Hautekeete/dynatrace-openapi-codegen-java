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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The comment to the problem.
 */
@ApiModel(description = "The comment to the problem.")
@JsonPropertyOrder({
  ProblemComment.JSON_PROPERTY_ID,
  ProblemComment.JSON_PROPERTY_CREATED_AT_TIMESTAMP,
  ProblemComment.JSON_PROPERTY_CONTENT,
  ProblemComment.JSON_PROPERTY_USER_NAME,
  ProblemComment.JSON_PROPERTY_CONTEXT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:03.911513100+01:00[Europe/Brussels]")
public class ProblemComment {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT_TIMESTAMP = "createdAtTimestamp";
  private Long createdAtTimestamp;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private String context;

  public ProblemComment() { 
  }

  public ProblemComment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the comment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the comment.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ProblemComment createdAtTimestamp(Long createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * The timestamp of the comment creation, in UTC milliseconds.
   * @return createdAtTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the comment creation, in UTC milliseconds.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtTimestamp(Long createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }


  public ProblemComment content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The text of the comment.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text of the comment.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public ProblemComment userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The author of the comment.
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The author of the comment.")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ProblemComment context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The context of the comment.   Could be any textual comment. You can only set it via REST API.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The context of the comment.   Could be any textual comment. You can only set it via REST API.")
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContext(String context) {
    this.context = context;
  }


  /**
   * Return true if this ProblemComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemComment problemComment = (ProblemComment) o;
    return Objects.equals(this.id, problemComment.id) &&
        Objects.equals(this.createdAtTimestamp, problemComment.createdAtTimestamp) &&
        Objects.equals(this.content, problemComment.content) &&
        Objects.equals(this.userName, problemComment.userName) &&
        Objects.equals(this.context, problemComment.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAtTimestamp, content, userName, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemComment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
