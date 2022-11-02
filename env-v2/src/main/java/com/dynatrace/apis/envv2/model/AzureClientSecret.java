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
import com.dynatrace.apis.envv2.model.AzureClientSecret;
import com.dynatrace.apis.envv2.model.ExternalVault;
import com.dynatrace.apis.envv2.model.HashicorpApprole;
import com.dynatrace.apis.envv2.model.HashicorpCertificate;
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


import com.dynatrace.apis.envv2.JSON;
/**
 * Synchronization credentials with Azure Key Vault using client secret authentication method
 */
@ApiModel(description = "Synchronization credentials with Azure Key Vault using client secret authentication method")
@JsonPropertyOrder({
  AzureClientSecret.JSON_PROPERTY_TENANT_ID,
  AzureClientSecret.JSON_PROPERTY_CLIENT_ID,
  AzureClientSecret.JSON_PROPERTY_CLIENT_SECRET
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "sourceAuthMethod", // ignore manually set sourceAuthMethod, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the sourceAuthMethod to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "sourceAuthMethod", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AzureClientSecret.class, name = "AZURE_KEY_VAULT_CLIENT_SECRET"),
  @JsonSubTypes.Type(value = HashicorpApprole.class, name = "HASHICORP_VAULT_APPROLE"),
  @JsonSubTypes.Type(value = HashicorpCertificate.class, name = "HASHICORP_VAULT_CERTIFICATE"),
})

public class AzureClientSecret extends ExternalVault {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public AzureClientSecret() { 
  }

  public AzureClientSecret tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant (directory) ID of Azure application in Azure Active Directory which has permission to access secrets in Azure Key Vault.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant (directory) ID of Azure application in Azure Active Directory which has permission to access secrets in Azure Key Vault.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public AzureClientSecret clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client (application) ID of Azure application in Azure Active Directory which has permission to access secrets in Azure Key Vault.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client (application) ID of Azure application in Azure Active Directory which has permission to access secrets in Azure Key Vault.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AzureClientSecret clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret generated for Azure application in Azure Active Directory used for proving identity when requesting a token used later for accessing secrets in Azure Key Vault.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Client secret generated for Azure application in Azure Active Directory used for proving identity when requesting a token used later for accessing secrets in Azure Key Vault.")
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * Return true if this AzureClientSecret object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureClientSecret azureClientSecret = (AzureClientSecret) o;
    return Objects.equals(this.tenantId, azureClientSecret.tenantId) &&
        Objects.equals(this.clientId, azureClientSecret.clientId) &&
        Objects.equals(this.clientSecret, azureClientSecret.clientSecret) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, clientId, clientSecret, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureClientSecret {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
  mappings.put("HASHICORP_VAULT_APPROLE", HashicorpApprole.class);
  mappings.put("HASHICORP_VAULT_CERTIFICATE", HashicorpCertificate.class);
  mappings.put("AzureClientSecret", AzureClientSecret.class);
  JSON.registerDiscriminator(AzureClientSecret.class, "sourceAuthMethod", mappings);
}
}

