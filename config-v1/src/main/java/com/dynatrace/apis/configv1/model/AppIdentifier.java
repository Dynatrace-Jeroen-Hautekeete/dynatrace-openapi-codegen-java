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
 * The appId, the app version and the bundle id which uniquely identify the app
 */
@ApiModel(description = "The appId, the app version and the bundle id which uniquely identify the app")
@JsonPropertyOrder({
  AppIdentifier.JSON_PROPERTY_ID,
  AppIdentifier.JSON_PROPERTY_VERSION_CODE,
  AppIdentifier.JSON_PROPERTY_VERSION_NAME,
  AppIdentifier.JSON_PROPERTY_PACKAGE_NAME,
  AppIdentifier.JSON_PROPERTY_OS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AppIdentifier {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION_CODE = "versionCode";
  private String versionCode;

  public static final String JSON_PROPERTY_VERSION_NAME = "versionName";
  private String versionName;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  /**
   * The operating system where the file belongs to
   */
  public enum OsEnum {
    ANDROID("ANDROID"),
    
    IOS("IOS"),
    
    TVOS("TVOS");

    private String value;

    OsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OsEnum fromValue(String value) {
      for (OsEnum b : OsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OS = "os";
  private OsEnum os;

  public AppIdentifier() { 
  }

  public AppIdentifier id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id where the file belongs to
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id where the file belongs to")
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


  public AppIdentifier versionCode(String versionCode) {
    this.versionCode = versionCode;
    return this;
  }

   /**
   * The version code (Android) / bundle version (iOS) the file belongs to
   * @return versionCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The version code (Android) / bundle version (iOS) the file belongs to")
  @JsonProperty(JSON_PROPERTY_VERSION_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersionCode() {
    return versionCode;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
  }


  public AppIdentifier versionName(String versionName) {
    this.versionName = versionName;
    return this;
  }

   /**
   * The version name (Android) / bundle versions string (iOS) the file belongs to
   * @return versionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The version name (Android) / bundle versions string (iOS) the file belongs to")
  @JsonProperty(JSON_PROPERTY_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersionName() {
    return versionName;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }


  public AppIdentifier packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

   /**
   * The bundleId (iOS) or package name (Android) the file belongs to
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bundleId (iOS) or package name (Android) the file belongs to")
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageName() {
    return packageName;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public AppIdentifier os(OsEnum os) {
    this.os = os;
    return this;
  }

   /**
   * The operating system where the file belongs to
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The operating system where the file belongs to")
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OsEnum getOs() {
    return os;
  }


  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOs(OsEnum os) {
    this.os = os;
  }


  /**
   * Return true if this AppIdentifier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppIdentifier appIdentifier = (AppIdentifier) o;
    return Objects.equals(this.id, appIdentifier.id) &&
        Objects.equals(this.versionCode, appIdentifier.versionCode) &&
        Objects.equals(this.versionName, appIdentifier.versionName) &&
        Objects.equals(this.packageName, appIdentifier.packageName) &&
        Objects.equals(this.os, appIdentifier.os);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionCode, versionName, packageName, os);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppIdentifier {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
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

