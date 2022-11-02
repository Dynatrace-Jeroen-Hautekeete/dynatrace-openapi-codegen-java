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
 * Configuration of technology monitoring.
 */
@ApiModel(description = "Configuration of technology monitoring.")
@JsonPropertyOrder({
  Technology.JSON_PROPERTY_TYPE,
  Technology.JSON_PROPERTY_MONITORING_ENABLED,
  Technology.JSON_PROPERTY_SCOPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class Technology {
  /**
   * The type of the technology.
   */
  public enum TypeEnum {
    AIX_KERNEL_EXT("AIX_KERNEL_EXT"),
    
    APACHE("APACHE"),
    
    CIM_V2("CIM_V2"),
    
    DOCKER("DOCKER"),
    
    DOCKER_WIN("DOCKER_WIN"),
    
    DOT_NET("DOT_NET"),
    
    DOT_NET_CORE("DOT_NET_CORE"),
    
    EXTENSIONS("EXTENSIONS"),
    
    EXTENSIONS_DS_GENERIC("EXTENSIONS_DS_GENERIC"),
    
    EXTENSIONS_STATSD("EXTENSIONS_STATSD"),
    
    GARDEN("GARDEN"),
    
    GO("GO"),
    
    GO_STATIC("GO_STATIC"),
    
    IBM_INTEGRATION_BUS("IBM_INTEGRATION_BUS"),
    
    IIS("IIS"),
    
    JAVA("JAVA"),
    
    LOG_ANALYTICS("LOG_ANALYTICS"),
    
    NETTRACER("NETTRACER"),
    
    NETWORK("NETWORK"),
    
    NGINX("NGINX"),
    
    NODE_JS("NODE_JS"),
    
    OPENTRACINGNATIVE("OPENTRACINGNATIVE"),
    
    PHP("PHP"),
    
    PHP_81("PHP_81"),
    
    PHP_CGI("PHP_CGI"),
    
    PHP_CLI("PHP_CLI"),
    
    PHP_WIN("PHP_WIN"),
    
    PROCESS("PROCESS"),
    
    RUBY("RUBY"),
    
    SDK("SDK"),
    
    VARNISH("VARNISH"),
    
    Z_OS("Z_OS");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_MONITORING_ENABLED = "monitoringEnabled";
  private Boolean monitoringEnabled;

  /**
   * The validity of the configuration:   * &#x60;HOST&#x60;: The setting is valid for OneAgent on host only. Other OneAgents, connected to the same Dynatrace server may have different setting.  * &#x60;ENVIRONMENT&#x60;: The setting is valid for all OneAgents, connected to the Dynatrace server.
   */
  public enum ScopeEnum {
    ENVIRONMENT("ENVIRONMENT"),
    
    HOST("HOST");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private ScopeEnum scope;

  public Technology() { 
  }

  public Technology type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the technology.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "JAVA", required = true, value = "The type of the technology.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Technology monitoringEnabled(Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
    return this;
  }

   /**
   * The monitoring of the technology is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return monitoringEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "The monitoring of the technology is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_MONITORING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMonitoringEnabled() {
    return monitoringEnabled;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitoringEnabled(Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
  }


  public Technology scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The validity of the configuration:   * &#x60;HOST&#x60;: The setting is valid for OneAgent on host only. Other OneAgents, connected to the same Dynatrace server may have different setting.  * &#x60;ENVIRONMENT&#x60;: The setting is valid for all OneAgents, connected to the Dynatrace server.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENVIRONMENT", value = "The validity of the configuration:   * `HOST`: The setting is valid for OneAgent on host only. Other OneAgents, connected to the same Dynatrace server may have different setting.  * `ENVIRONMENT`: The setting is valid for all OneAgents, connected to the Dynatrace server.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScopeEnum getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  /**
   * Return true if this Technology object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Technology technology = (Technology) o;
    return Objects.equals(this.type, technology.type) &&
        Objects.equals(this.monitoringEnabled, technology.monitoringEnabled) &&
        Objects.equals(this.scope, technology.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, monitoringEnabled, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Technology {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    monitoringEnabled: ").append(toIndentedString(monitoringEnabled)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

