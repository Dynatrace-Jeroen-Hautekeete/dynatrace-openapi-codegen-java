/*
 * Dynatrace Environment API
 *  Documentation of the Dynatrace Environment API v2. Resources here generally supersede those in v1. Migration of resources from v1 is in progress.   If you miss a resource, consider using the Dynatrace Environment API v1. To read about use cases and examples, see [Dynatrace Documentation](https://dt-url.net/2u23k1k) .  Notes about compatibility: * Operations marked as early adopter or preview may be changed in non-compatible ways, although we try to avoid this. * We may add new enum constants without incrementing the API version; thus, clients need to handle unknown enum constants gracefully.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dynatrace.apis.envv2.model;

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
 * CredentialsDetailsUsernamePasswordResponseElementAllOf
 */
@JsonPropertyOrder({
  CredentialsDetailsUsernamePasswordResponseElementAllOf.JSON_PROPERTY_USERNAME,
  CredentialsDetailsUsernamePasswordResponseElementAllOf.JSON_PROPERTY_PASSWORD
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class CredentialsDetailsUsernamePasswordResponseElementAllOf {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public CredentialsDetailsUsernamePasswordResponseElementAllOf() { 
  }

  public CredentialsDetailsUsernamePasswordResponseElementAllOf username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Plain text username value
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plain text username value")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public CredentialsDetailsUsernamePasswordResponseElementAllOf password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Plain text password value
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plain text password value")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Return true if this CredentialsDetailsUsernamePasswordResponseElement_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsDetailsUsernamePasswordResponseElementAllOf credentialsDetailsUsernamePasswordResponseElementAllOf = (CredentialsDetailsUsernamePasswordResponseElementAllOf) o;
    return Objects.equals(this.username, credentialsDetailsUsernamePasswordResponseElementAllOf.username) &&
        Objects.equals(this.password, credentialsDetailsUsernamePasswordResponseElementAllOf.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsDetailsUsernamePasswordResponseElementAllOf {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
