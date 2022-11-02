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
import com.dynatrace.apis.configv1.model.ExternalVault;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TokenCredentialsAllOf
 */
@JsonPropertyOrder({
  TokenCredentialsAllOf.JSON_PROPERTY_TOKEN,
  TokenCredentialsAllOf.JSON_PROPERTY_EXTERNAL_VAULT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class TokenCredentialsAllOf {
  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_EXTERNAL_VAULT = "externalVault";
  private ExternalVault externalVault;

  public TokenCredentialsAllOf() { 
  }

  public TokenCredentialsAllOf token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token in the string format.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token in the string format.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public TokenCredentialsAllOf externalVault(ExternalVault externalVault) {
    this.externalVault = externalVault;
    return this;
  }

   /**
   * Get externalVault
   * @return externalVault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_VAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalVault getExternalVault() {
    return externalVault;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_VAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalVault(ExternalVault externalVault) {
    this.externalVault = externalVault;
  }


  /**
   * Return true if this TokenCredentials_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenCredentialsAllOf tokenCredentialsAllOf = (TokenCredentialsAllOf) o;
    return Objects.equals(this.token, tokenCredentialsAllOf.token) &&
        Objects.equals(this.externalVault, tokenCredentialsAllOf.externalVault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, externalVault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCredentialsAllOf {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    externalVault: ").append(toIndentedString(externalVault)).append("\n");
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

