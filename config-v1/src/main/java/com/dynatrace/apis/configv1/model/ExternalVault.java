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
import com.dynatrace.apis.configv1.model.AzureClientSecret;
import com.dynatrace.apis.configv1.model.HashicorpApprole;
import com.dynatrace.apis.configv1.model.HashicorpCertificate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.dynatrace.apis.configv1.JSON;
/**
 * Information for synchronization credentials with external vault
 */
@ApiModel(description = "Information for synchronization credentials with external vault")
@JsonPropertyOrder({
  ExternalVault.JSON_PROPERTY_SOURCE_AUTH_METHOD,
  ExternalVault.JSON_PROPERTY_VAULT_URL,
  ExternalVault.JSON_PROPERTY_USERNAME_SECRET_NAME,
  ExternalVault.JSON_PROPERTY_PASSWORD_SECRET_NAME,
  ExternalVault.JSON_PROPERTY_TOKEN_SECRET_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "sourceAuthMethod", // ignore manually set sourceAuthMethod, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the sourceAuthMethod to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "sourceAuthMethod", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AzureClientSecret.class, name = "AZURE_KEY_VAULT_CLIENT_SECRET"),
  @JsonSubTypes.Type(value = AzureClientSecret.class, name = "AzureClientSecret"),
  @JsonSubTypes.Type(value = HashicorpApprole.class, name = "HASHICORP_VAULT_APPROLE"),
  @JsonSubTypes.Type(value = HashicorpCertificate.class, name = "HASHICORP_VAULT_CERTIFICATE"),
  @JsonSubTypes.Type(value = HashicorpApprole.class, name = "HashicorpApprole"),
  @JsonSubTypes.Type(value = HashicorpCertificate.class, name = "HashicorpCertificate"),
})

public class ExternalVault {
  /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;HASHICORP_VAULT_APPROLE&#x60; -&gt; HashicorpApprole  * &#x60;HASHICORP_VAULT_CERTIFICATE&#x60; -&gt; HashicorpCertificate  * &#x60;AZURE_KEY_VAULT_CLIENT_SECRET&#x60; -&gt; AzureClientSecret  
   */
  public enum SourceAuthMethodEnum {
    AZURE_KEY_VAULT_CLIENT_SECRET("AZURE_KEY_VAULT_CLIENT_SECRET"),
    
    HASHICORP_VAULT_APPROLE("HASHICORP_VAULT_APPROLE"),
    
    HASHICORP_VAULT_CERTIFICATE("HASHICORP_VAULT_CERTIFICATE");

    private String value;

    SourceAuthMethodEnum(String value) {
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
    public static SourceAuthMethodEnum fromValue(String value) {
      for (SourceAuthMethodEnum b : SourceAuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE_AUTH_METHOD = "sourceAuthMethod";
  private SourceAuthMethodEnum sourceAuthMethod;

  public static final String JSON_PROPERTY_VAULT_URL = "vaultUrl";
  private String vaultUrl;

  public static final String JSON_PROPERTY_USERNAME_SECRET_NAME = "usernameSecretName";
  private String usernameSecretName;

  public static final String JSON_PROPERTY_PASSWORD_SECRET_NAME = "passwordSecretName";
  private String passwordSecretName;

  public static final String JSON_PROPERTY_TOKEN_SECRET_NAME = "tokenSecretName";
  private String tokenSecretName;

  public ExternalVault() { 
  }

  public ExternalVault sourceAuthMethod(SourceAuthMethodEnum sourceAuthMethod) {
    this.sourceAuthMethod = sourceAuthMethod;
    return this;
  }

   /**
   * Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;HASHICORP_VAULT_APPROLE&#x60; -&gt; HashicorpApprole  * &#x60;HASHICORP_VAULT_CERTIFICATE&#x60; -&gt; HashicorpCertificate  * &#x60;AZURE_KEY_VAULT_CLIENT_SECRET&#x60; -&gt; AzureClientSecret  
   * @return sourceAuthMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the actual set of fields depending on the value. See one of the following objects:   * `HASHICORP_VAULT_APPROLE` -> HashicorpApprole  * `HASHICORP_VAULT_CERTIFICATE` -> HashicorpCertificate  * `AZURE_KEY_VAULT_CLIENT_SECRET` -> AzureClientSecret  ")
  @JsonProperty(JSON_PROPERTY_SOURCE_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceAuthMethodEnum getSourceAuthMethod() {
    return sourceAuthMethod;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAuthMethod(SourceAuthMethodEnum sourceAuthMethod) {
    this.sourceAuthMethod = sourceAuthMethod;
  }


  public ExternalVault vaultUrl(String vaultUrl) {
    this.vaultUrl = vaultUrl;
    return this;
  }

   /**
   * External vault URL.
   * @return vaultUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External vault URL.")
  @JsonProperty(JSON_PROPERTY_VAULT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVaultUrl() {
    return vaultUrl;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVaultUrl(String vaultUrl) {
    this.vaultUrl = vaultUrl;
  }


  public ExternalVault usernameSecretName(String usernameSecretName) {
    this.usernameSecretName = usernameSecretName;
    return this;
  }

   /**
   * The name of the secret saved in external vault where username is stored.
   * @return usernameSecretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the secret saved in external vault where username is stored.")
  @JsonProperty(JSON_PROPERTY_USERNAME_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsernameSecretName() {
    return usernameSecretName;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsernameSecretName(String usernameSecretName) {
    this.usernameSecretName = usernameSecretName;
  }


  public ExternalVault passwordSecretName(String passwordSecretName) {
    this.passwordSecretName = passwordSecretName;
    return this;
  }

   /**
   * The name of the secret saved in external vault where password is stored.
   * @return passwordSecretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the secret saved in external vault where password is stored.")
  @JsonProperty(JSON_PROPERTY_PASSWORD_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPasswordSecretName() {
    return passwordSecretName;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordSecretName(String passwordSecretName) {
    this.passwordSecretName = passwordSecretName;
  }


  public ExternalVault tokenSecretName(String tokenSecretName) {
    this.tokenSecretName = tokenSecretName;
    return this;
  }

   /**
   * The name of the secret saved in external vault where token is stored.
   * @return tokenSecretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the secret saved in external vault where token is stored.")
  @JsonProperty(JSON_PROPERTY_TOKEN_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenSecretName() {
    return tokenSecretName;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_SECRET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenSecretName(String tokenSecretName) {
    this.tokenSecretName = tokenSecretName;
  }


  /**
   * Return true if this ExternalVault object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalVault externalVault = (ExternalVault) o;
    return Objects.equals(this.sourceAuthMethod, externalVault.sourceAuthMethod) &&
        Objects.equals(this.vaultUrl, externalVault.vaultUrl) &&
        Objects.equals(this.usernameSecretName, externalVault.usernameSecretName) &&
        Objects.equals(this.passwordSecretName, externalVault.passwordSecretName) &&
        Objects.equals(this.tokenSecretName, externalVault.tokenSecretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAuthMethod, vaultUrl, usernameSecretName, passwordSecretName, tokenSecretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalVault {\n");
    sb.append("    sourceAuthMethod: ").append(toIndentedString(sourceAuthMethod)).append("\n");
    sb.append("    vaultUrl: ").append(toIndentedString(vaultUrl)).append("\n");
    sb.append("    usernameSecretName: ").append(toIndentedString(usernameSecretName)).append("\n");
    sb.append("    passwordSecretName: ").append(toIndentedString(passwordSecretName)).append("\n");
    sb.append("    tokenSecretName: ").append(toIndentedString(tokenSecretName)).append("\n");
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
  mappings.put("AZURE_KEY_VAULT_CLIENT_SECRET", AzureClientSecret.class);
  mappings.put("AzureClientSecret", AzureClientSecret.class);
  mappings.put("HASHICORP_VAULT_APPROLE", HashicorpApprole.class);
  mappings.put("HASHICORP_VAULT_CERTIFICATE", HashicorpCertificate.class);
  mappings.put("HashicorpApprole", HashicorpApprole.class);
  mappings.put("HashicorpCertificate", HashicorpCertificate.class);
  mappings.put("ExternalVault", ExternalVault.class);
  JSON.registerDiscriminator(ExternalVault.class, "sourceAuthMethod", mappings);
}
}
