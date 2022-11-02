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
 * PublicCertificateCredentialsAllOf
 */
@JsonPropertyOrder({
  PublicCertificateCredentialsAllOf.JSON_PROPERTY_CERTIFICATE,
  PublicCertificateCredentialsAllOf.JSON_PROPERTY_PASSWORD,
  PublicCertificateCredentialsAllOf.JSON_PROPERTY_CERTIFICATE_FORMAT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class PublicCertificateCredentialsAllOf {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  /**
   * The certificate format.
   */
  public enum CertificateFormatEnum {
    PEM("PEM"),
    
    PKCS12("PKCS12"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    CertificateFormatEnum(String value) {
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
    public static CertificateFormatEnum fromValue(String value) {
      for (CertificateFormatEnum b : CertificateFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CERTIFICATE_FORMAT = "certificateFormat";
  private CertificateFormatEnum certificateFormat;

  public PublicCertificateCredentialsAllOf() { 
  }

  public PublicCertificateCredentialsAllOf certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The certificate in the string format.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The certificate in the string format.")
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


  public PublicCertificateCredentialsAllOf password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password of the credential (not supported).
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The password of the credential (not supported).")
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


  public PublicCertificateCredentialsAllOf certificateFormat(CertificateFormatEnum certificateFormat) {
    this.certificateFormat = certificateFormat;
    return this;
  }

   /**
   * The certificate format.
   * @return certificateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The certificate format.")
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CertificateFormatEnum getCertificateFormat() {
    return certificateFormat;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificateFormat(CertificateFormatEnum certificateFormat) {
    this.certificateFormat = certificateFormat;
  }


  /**
   * Return true if this PublicCertificateCredentials_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicCertificateCredentialsAllOf publicCertificateCredentialsAllOf = (PublicCertificateCredentialsAllOf) o;
    return Objects.equals(this.certificate, publicCertificateCredentialsAllOf.certificate) &&
        Objects.equals(this.password, publicCertificateCredentialsAllOf.password) &&
        Objects.equals(this.certificateFormat, publicCertificateCredentialsAllOf.certificateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, password, certificateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicCertificateCredentialsAllOf {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    certificateFormat: ").append(toIndentedString(certificateFormat)).append("\n");
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

