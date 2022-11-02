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
 * The short representation of a remote environment.
 */
@ApiModel(description = "The short representation of a remote environment.")
@JsonPropertyOrder({
  RemoteEnvironmentConfigStub.JSON_PROPERTY_NETWORK_SCOPE,
  RemoteEnvironmentConfigStub.JSON_PROPERTY_NAME,
  RemoteEnvironmentConfigStub.JSON_PROPERTY_ID,
  RemoteEnvironmentConfigStub.JSON_PROPERTY_URI
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class RemoteEnvironmentConfigStub {
  /**
   * The network scope of the remote environment: * &#x60;EXTERNAL&#x60;: The remote environment is located in an another network.  * &#x60;INTERNAL&#x60;: The remote environment is located in the same network.  * &#x60;CLUSTER&#x60;: The remote environment is located in the same cluster.   Dynatrace SaaS can only use &#x60;EXTERNAL&#x60;.  If not set, &#x60;EXTERNAL&#x60; is used.
   */
  public enum NetworkScopeEnum {
    CLUSTER("CLUSTER"),
    
    EXTERNAL("EXTERNAL"),
    
    INTERNAL("INTERNAL");

    private String value;

    NetworkScopeEnum(String value) {
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
    public static NetworkScopeEnum fromValue(String value) {
      for (NetworkScopeEnum b : NetworkScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NETWORK_SCOPE = "networkScope";
  private NetworkScopeEnum networkScope;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public RemoteEnvironmentConfigStub() { 
  }

  public RemoteEnvironmentConfigStub networkScope(NetworkScopeEnum networkScope) {
    this.networkScope = networkScope;
    return this;
  }

   /**
   * The network scope of the remote environment: * &#x60;EXTERNAL&#x60;: The remote environment is located in an another network.  * &#x60;INTERNAL&#x60;: The remote environment is located in the same network.  * &#x60;CLUSTER&#x60;: The remote environment is located in the same cluster.   Dynatrace SaaS can only use &#x60;EXTERNAL&#x60;.  If not set, &#x60;EXTERNAL&#x60; is used.
   * @return networkScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The network scope of the remote environment: * `EXTERNAL`: The remote environment is located in an another network.  * `INTERNAL`: The remote environment is located in the same network.  * `CLUSTER`: The remote environment is located in the same cluster.   Dynatrace SaaS can only use `EXTERNAL`.  If not set, `EXTERNAL` is used.")
  @JsonProperty(JSON_PROPERTY_NETWORK_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkScopeEnum getNetworkScope() {
    return networkScope;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkScope(NetworkScopeEnum networkScope) {
    this.networkScope = networkScope;
  }


  public RemoteEnvironmentConfigStub name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public RemoteEnvironmentConfigStub id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public RemoteEnvironmentConfigStub uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The display name of the remote environment.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the remote environment.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * Return true if this RemoteEnvironmentConfigStub object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteEnvironmentConfigStub remoteEnvironmentConfigStub = (RemoteEnvironmentConfigStub) o;
    return Objects.equals(this.networkScope, remoteEnvironmentConfigStub.networkScope) &&
        Objects.equals(this.name, remoteEnvironmentConfigStub.name) &&
        Objects.equals(this.id, remoteEnvironmentConfigStub.id) &&
        Objects.equals(this.uri, remoteEnvironmentConfigStub.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkScope, name, id, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteEnvironmentConfigStub {\n");
    sb.append("    networkScope: ").append(toIndentedString(networkScope)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

