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
import com.dynatrace.apis.envv2.model.AzureClientSecretConfig;
import com.dynatrace.apis.envv2.model.ExternalVaultConfig;
import com.dynatrace.apis.envv2.model.HashicorpApproleConfig;
import com.dynatrace.apis.envv2.model.HashicorpCertificateConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.envv2.JSON;
/**
 * HashicorpCertificateConfig
 */
@JsonPropertyOrder({
  HashicorpCertificateConfig.JSON_PROPERTY_PATH_TO_CREDENTIALS,
  HashicorpCertificateConfig.JSON_PROPERTY_CERTIFICATE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "sourceAuthMethod", // ignore manually set sourceAuthMethod, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the sourceAuthMethod to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "sourceAuthMethod", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AzureClientSecretConfig.class, name = "AZURE_KEY_VAULT_CLIENT_SECRET"),
  @JsonSubTypes.Type(value = HashicorpApproleConfig.class, name = "HASHICORP_VAULT_APPROLE"),
  @JsonSubTypes.Type(value = HashicorpCertificateConfig.class, name = "HASHICORP_VAULT_CERTIFICATE"),
})

public class HashicorpCertificateConfig extends ExternalVaultConfig {
  public static final String JSON_PROPERTY_PATH_TO_CREDENTIALS = "pathToCredentials";
  private String pathToCredentials;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private String certificate;

  public HashicorpCertificateConfig() { 
  }

  public HashicorpCertificateConfig pathToCredentials(String pathToCredentials) {
    this.pathToCredentials = pathToCredentials;
    return this;
  }

   /**
   * Get pathToCredentials
   * @return pathToCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public HashicorpCertificateConfig certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
   * Return true if this HashicorpCertificateConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashicorpCertificateConfig hashicorpCertificateConfig = (HashicorpCertificateConfig) o;
    return Objects.equals(this.pathToCredentials, hashicorpCertificateConfig.pathToCredentials) &&
        Objects.equals(this.certificate, hashicorpCertificateConfig.certificate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathToCredentials, certificate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashicorpCertificateConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("AZURE_KEY_VAULT_CLIENT_SECRET", AzureClientSecretConfig.class);
  mappings.put("HASHICORP_VAULT_APPROLE", HashicorpApproleConfig.class);
  mappings.put("HASHICORP_VAULT_CERTIFICATE", HashicorpCertificateConfig.class);
  mappings.put("HashicorpCertificateConfig", HashicorpCertificateConfig.class);
  JSON.registerDiscriminator(HashicorpCertificateConfig.class, "sourceAuthMethod", mappings);
}
}

