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
 * HashicorpApproleConfigAllOf
 */
@JsonPropertyOrder({
  HashicorpApproleConfigAllOf.JSON_PROPERTY_PATH_TO_CREDENTIALS,
  HashicorpApproleConfigAllOf.JSON_PROPERTY_ROLE_ID,
  HashicorpApproleConfigAllOf.JSON_PROPERTY_SECRET_ID,
  HashicorpApproleConfigAllOf.JSON_PROPERTY_VAULT_NAMESPACE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class HashicorpApproleConfigAllOf {
  public static final String JSON_PROPERTY_PATH_TO_CREDENTIALS = "pathToCredentials";
  private String pathToCredentials;

  public static final String JSON_PROPERTY_ROLE_ID = "roleId";
  private String roleId;

  public static final String JSON_PROPERTY_SECRET_ID = "secretId";
  private String secretId;

  public static final String JSON_PROPERTY_VAULT_NAMESPACE = "vaultNamespace";
  private String vaultNamespace;

  public HashicorpApproleConfigAllOf() { 
  }

  public HashicorpApproleConfigAllOf pathToCredentials(String pathToCredentials) {
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


  public HashicorpApproleConfigAllOf roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public HashicorpApproleConfigAllOf secretId(String secretId) {
    this.secretId = secretId;
    return this;
  }

   /**
   * Get secretId
   * @return secretId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECRET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretId() {
    return secretId;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }


  public HashicorpApproleConfigAllOf vaultNamespace(String vaultNamespace) {
    this.vaultNamespace = vaultNamespace;
    return this;
  }

   /**
   * Get vaultNamespace
   * @return vaultNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VAULT_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVaultNamespace() {
    return vaultNamespace;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVaultNamespace(String vaultNamespace) {
    this.vaultNamespace = vaultNamespace;
  }


  /**
   * Return true if this HashicorpApproleConfig_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashicorpApproleConfigAllOf hashicorpApproleConfigAllOf = (HashicorpApproleConfigAllOf) o;
    return Objects.equals(this.pathToCredentials, hashicorpApproleConfigAllOf.pathToCredentials) &&
        Objects.equals(this.roleId, hashicorpApproleConfigAllOf.roleId) &&
        Objects.equals(this.secretId, hashicorpApproleConfigAllOf.secretId) &&
        Objects.equals(this.vaultNamespace, hashicorpApproleConfigAllOf.vaultNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathToCredentials, roleId, secretId, vaultNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashicorpApproleConfigAllOf {\n");
    sb.append("    pathToCredentials: ").append(toIndentedString(pathToCredentials)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    vaultNamespace: ").append(toIndentedString(vaultNamespace)).append("\n");
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
