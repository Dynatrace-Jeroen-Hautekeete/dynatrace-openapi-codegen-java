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
import com.dynatrace.apis.configv1.model.AppIdentifier;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SymbolFile
 */
@JsonPropertyOrder({
  SymbolFile.JSON_PROPERTY_APPLICATION_NAME,
  SymbolFile.JSON_PROPERTY_SIZE,
  SymbolFile.JSON_PROPERTY_APP_ID,
  SymbolFile.JSON_PROPERTY_UPLOAD_TIMESTAMP,
  SymbolFile.JSON_PROPERTY_PINNED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class SymbolFile {
  public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
  private String applicationName;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private AppIdentifier appId;

  public static final String JSON_PROPERTY_UPLOAD_TIMESTAMP = "uploadTimestamp";
  private Long uploadTimestamp;

  public static final String JSON_PROPERTY_PINNED = "pinned";
  private Boolean pinned;

  public SymbolFile() { 
  }

  public SymbolFile applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the application this file belongs to
   * @return applicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the application this file belongs to")
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationName() {
    return applicationName;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public SymbolFile size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file in KB
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the file in KB")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public SymbolFile appId(AppIdentifier appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppIdentifier getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(AppIdentifier appId) {
    this.appId = appId;
  }


  public SymbolFile uploadTimestamp(Long uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
    return this;
  }

   /**
   * The timestamp of the upload time of the file, in UTC milliseconds
   * @return uploadTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the upload time of the file, in UTC milliseconds")
  @JsonProperty(JSON_PROPERTY_UPLOAD_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUploadTimestamp() {
    return uploadTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadTimestamp(Long uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
  }


  public SymbolFile pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

   /**
   * Is the file pinned and therefore cannot be deleted.
   * @return pinned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the file pinned and therefore cannot be deleted.")
  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPinned() {
    return pinned;
  }


  @JsonProperty(JSON_PROPERTY_PINNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }


  /**
   * Return true if this SymbolFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolFile symbolFile = (SymbolFile) o;
    return Objects.equals(this.applicationName, symbolFile.applicationName) &&
        Objects.equals(this.size, symbolFile.size) &&
        Objects.equals(this.appId, symbolFile.appId) &&
        Objects.equals(this.uploadTimestamp, symbolFile.uploadTimestamp) &&
        Objects.equals(this.pinned, symbolFile.pinned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, size, appId, uploadTimestamp, pinned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolFile {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    uploadTimestamp: ").append(toIndentedString(uploadTimestamp)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
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
