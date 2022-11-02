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
 * HashicorpCertificateAllOf
 */
@JsonPropertyOrder({
  HashicorpCertificateAllOf.JSON_PROPERTY_PATH_TO_CREDENTIALS,
  HashicorpCertificateAllOf.JSON_PROPERTY_CERTIFICATE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class HashicorpCertificateAllOf {
  public static final String JSON_PROPERTY_PATH_TO_CREDENTIALS = "pathToCredentials";
  private String pathToCredentials;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public HashicorpCertificateAllOf() { 
  }

  public HashicorpCertificateAllOf pathToCredentials(String pathToCredentials) {
    this.pathToCredentials = pathToCredentials;
    return this;
  }

   /**
   * Path to folder where credentials in HashiCorp Vault are stored.
   * @return pathToCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to folder where credentials in HashiCorp Vault are stored.")
  @JsonProperty(JSON_PROPERTY_PATH_TO_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPathToCredentials() {
    return pathToCredentials;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TO_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathToCredentials(String pathToCredentials) {
    this.pathToCredentials = pathToCredentials;
  }


  public HashicorpCertificateAllOf certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * ID of certificate saved in Dynatrace CV. Using this certificate you can authenticate to your HashiCorp Vault.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of certificate saved in Dynatrace CV. Using this certificate you can authenticate to your HashiCorp Vault.")
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  /**
   * Return true if this HashicorpCertificate_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashicorpCertificateAllOf hashicorpCertificateAllOf = (HashicorpCertificateAllOf) o;
    return Objects.equals(this.pathToCredentials, hashicorpCertificateAllOf.pathToCredentials) &&
        Objects.equals(this.certificate, hashicorpCertificateAllOf.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathToCredentials, certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashicorpCertificateAllOf {\n");
    sb.append("    pathToCredentials: ").append(toIndentedString(pathToCredentials)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

