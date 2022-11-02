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
import com.dynatrace.apis.configv1.model.ConditionKey;
import com.dynatrace.apis.configv1.model.CustomHostMetadataConditionKey;
import com.dynatrace.apis.configv1.model.CustomProcessMetadataConditionKey;
import com.dynatrace.apis.configv1.model.ProcessMetadataConditionKey;
import com.dynatrace.apis.configv1.model.StaticConditionKey;
import com.dynatrace.apis.configv1.model.StringConditionKey;
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
 * The key for dynamic attributes of the &#x60;PROCESS_PREDEFINED_METADATA_KEY&#x60; type.
 */
@ApiModel(description = "The key for dynamic attributes of the `PROCESS_PREDEFINED_METADATA_KEY` type.")
@JsonPropertyOrder({
  ProcessMetadataConditionKey.JSON_PROPERTY_DYNAMIC_KEY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CustomHostMetadataConditionKey.class, name = "HOST_CUSTOM_METADATA_KEY"),
  @JsonSubTypes.Type(value = CustomProcessMetadataConditionKey.class, name = "PROCESS_CUSTOM_METADATA_KEY"),
  @JsonSubTypes.Type(value = ProcessMetadataConditionKey.class, name = "PROCESS_PREDEFINED_METADATA_KEY"),
  @JsonSubTypes.Type(value = StaticConditionKey.class, name = "STATIC"),
  @JsonSubTypes.Type(value = StringConditionKey.class, name = "STRING"),
})

public class ProcessMetadataConditionKey extends ConditionKey {
  /**
   * The key of the attribute, which need dynamic keys.   Not applicable otherwise, as the attibute itself acts as a key.
   */
  public enum DynamicKeyEnum {
    AMAZON_ECR_IMAGE_ACCOUNT_ID("AMAZON_ECR_IMAGE_ACCOUNT_ID"),
    
    AMAZON_ECR_IMAGE_REGION("AMAZON_ECR_IMAGE_REGION"),
    
    AMAZON_LAMBDA_FUNCTION_NAME("AMAZON_LAMBDA_FUNCTION_NAME"),
    
    AMAZON_REGION("AMAZON_REGION"),
    
    APACHE_CONFIG_PATH("APACHE_CONFIG_PATH"),
    
    APACHE_SPARK_MASTER_IP_ADDRESS("APACHE_SPARK_MASTER_IP_ADDRESS"),
    
    ASP_DOT_NET_CORE_APPLICATION_PATH("ASP_DOT_NET_CORE_APPLICATION_PATH"),
    
    AWS_ECS_CLUSTER("AWS_ECS_CLUSTER"),
    
    AWS_ECS_CONTAINERNAME("AWS_ECS_CONTAINERNAME"),
    
    AWS_ECS_FAMILY("AWS_ECS_FAMILY"),
    
    AWS_ECS_REVISION("AWS_ECS_REVISION"),
    
    CASSANDRA_CLUSTER_NAME("CASSANDRA_CLUSTER_NAME"),
    
    CATALINA_BASE("CATALINA_BASE"),
    
    CATALINA_HOME("CATALINA_HOME"),
    
    CLOUD_FOUNDRY_APP_ID("CLOUD_FOUNDRY_APP_ID"),
    
    CLOUD_FOUNDRY_APP_NAME("CLOUD_FOUNDRY_APP_NAME"),
    
    CLOUD_FOUNDRY_INSTANCE_INDEX("CLOUD_FOUNDRY_INSTANCE_INDEX"),
    
    CLOUD_FOUNDRY_SPACE_ID("CLOUD_FOUNDRY_SPACE_ID"),
    
    CLOUD_FOUNDRY_SPACE_NAME("CLOUD_FOUNDRY_SPACE_NAME"),
    
    COLDFUSION_JVM_CONFIG_FILE("COLDFUSION_JVM_CONFIG_FILE"),
    
    COLDFUSION_SERVICE_NAME("COLDFUSION_SERVICE_NAME"),
    
    COMMAND_LINE_ARGS("COMMAND_LINE_ARGS"),
    
    CONTAINER_ID("CONTAINER_ID"),
    
    CONTAINER_IMAGE_NAME("CONTAINER_IMAGE_NAME"),
    
    CONTAINER_IMAGE_VERSION("CONTAINER_IMAGE_VERSION"),
    
    DECLARATIVE_ID("DECLARATIVE_ID"),
    
    DOTNET_COMMAND("DOTNET_COMMAND"),
    
    DOTNET_COMMAND_PATH("DOTNET_COMMAND_PATH"),
    
    DYNATRACE_CLUSTER_ID("DYNATRACE_CLUSTER_ID"),
    
    DYNATRACE_NODE_ID("DYNATRACE_NODE_ID"),
    
    ELASTICSEARCH_CLUSTER_NAME("ELASTICSEARCH_CLUSTER_NAME"),
    
    ELASTICSEARCH_NODE_NAME("ELASTICSEARCH_NODE_NAME"),
    
    EQUINOX_CONFIG_PATH("EQUINOX_CONFIG_PATH"),
    
    EXE_NAME("EXE_NAME"),
    
    EXE_PATH("EXE_PATH"),
    
    GLASS_FISH_DOMAIN_NAME("GLASS_FISH_DOMAIN_NAME"),
    
    GLASS_FISH_INSTANCE_NAME("GLASS_FISH_INSTANCE_NAME"),
    
    GOOGLE_APP_ENGINE_INSTANCE("GOOGLE_APP_ENGINE_INSTANCE"),
    
    GOOGLE_APP_ENGINE_SERVICE("GOOGLE_APP_ENGINE_SERVICE"),
    
    GOOGLE_CLOUD_PROJECT("GOOGLE_CLOUD_PROJECT"),
    
    HYBRIS_BIN_DIRECTORY("HYBRIS_BIN_DIRECTORY"),
    
    HYBRIS_CONFIG_DIRECTORY("HYBRIS_CONFIG_DIRECTORY"),
    
    HYBRIS_DATA_DIRECTORY("HYBRIS_DATA_DIRECTORY"),
    
    IBM_CICS_REGION("IBM_CICS_REGION"),
    
    IBM_CTG_NAME("IBM_CTG_NAME"),
    
    IBM_IMS_CONNECT_REGION("IBM_IMS_CONNECT_REGION"),
    
    IBM_IMS_CONTROL_REGION("IBM_IMS_CONTROL_REGION"),
    
    IBM_IMS_MESSAGE_PROCESSING_REGION("IBM_IMS_MESSAGE_PROCESSING_REGION"),
    
    IBM_IMS_SOAP_GW_NAME("IBM_IMS_SOAP_GW_NAME"),
    
    IBM_INTEGRATION_NODE_NAME("IBM_INTEGRATION_NODE_NAME"),
    
    IBM_INTEGRATION_SERVER_NAME("IBM_INTEGRATION_SERVER_NAME"),
    
    IIS_APP_POOL("IIS_APP_POOL"),
    
    IIS_ROLE_NAME("IIS_ROLE_NAME"),
    
    JAVA_JAR_FILE("JAVA_JAR_FILE"),
    
    JAVA_JAR_PATH("JAVA_JAR_PATH"),
    
    JAVA_MAIN_CLASS("JAVA_MAIN_CLASS"),
    
    JAVA_MAIN_MODULE("JAVA_MAIN_MODULE"),
    
    JBOSS_HOME("JBOSS_HOME"),
    
    JBOSS_MODE("JBOSS_MODE"),
    
    JBOSS_SERVER_NAME("JBOSS_SERVER_NAME"),
    
    KUBERNETES_BASE_POD_NAME("KUBERNETES_BASE_POD_NAME"),
    
    KUBERNETES_CONTAINER_NAME("KUBERNETES_CONTAINER_NAME"),
    
    KUBERNETES_FULL_POD_NAME("KUBERNETES_FULL_POD_NAME"),
    
    KUBERNETES_NAMESPACE("KUBERNETES_NAMESPACE"),
    
    KUBERNETES_POD_UID("KUBERNETES_POD_UID"),
    
    KUBERNETES_RULE_RESULT("KUBERNETES_RULE_RESULT"),
    
    MSSQL_INSTANCE_NAME("MSSQL_INSTANCE_NAME"),
    
    NODE_JS_APP_BASE_DIRECTORY("NODE_JS_APP_BASE_DIRECTORY"),
    
    NODE_JS_APP_NAME("NODE_JS_APP_NAME"),
    
    NODE_JS_SCRIPT_NAME("NODE_JS_SCRIPT_NAME"),
    
    ORACLE_SID("ORACLE_SID"),
    
    PG_ID_CALC_INPUT_KEY_LINKAGE("PG_ID_CALC_INPUT_KEY_LINKAGE"),
    
    PHP_SCRIPT_PATH("PHP_SCRIPT_PATH"),
    
    PHP_WORKING_DIRECTORY("PHP_WORKING_DIRECTORY"),
    
    RUBY_APP_ROOT_PATH("RUBY_APP_ROOT_PATH"),
    
    RUBY_SCRIPT_PATH("RUBY_SCRIPT_PATH"),
    
    RULE_RESULT("RULE_RESULT"),
    
    SOFTWAREAG_INSTALL_ROOT("SOFTWAREAG_INSTALL_ROOT"),
    
    SOFTWAREAG_PRODUCTPROPNAME("SOFTWAREAG_PRODUCTPROPNAME"),
    
    SPRINGBOOT_APP_NAME("SPRINGBOOT_APP_NAME"),
    
    SPRINGBOOT_PROFILE_NAME("SPRINGBOOT_PROFILE_NAME"),
    
    SPRINGBOOT_STARTUP_CLASS("SPRINGBOOT_STARTUP_CLASS"),
    
    TIBCO_BUSINESSWORKS_CE_APP_NAME("TIBCO_BUSINESSWORKS_CE_APP_NAME"),
    
    TIBCO_BUSINESSWORKS_CE_VERSION("TIBCO_BUSINESSWORKS_CE_VERSION"),
    
    TIBCO_BUSINESS_WORKS_APP_NODE_NAME("TIBCO_BUSINESS_WORKS_APP_NODE_NAME"),
    
    TIBCO_BUSINESS_WORKS_APP_SPACE_NAME("TIBCO_BUSINESS_WORKS_APP_SPACE_NAME"),
    
    TIBCO_BUSINESS_WORKS_DOMAIN_NAME("TIBCO_BUSINESS_WORKS_DOMAIN_NAME"),
    
    TIBCO_BUSINESS_WORKS_ENGINE_PROPERTY_FILE("TIBCO_BUSINESS_WORKS_ENGINE_PROPERTY_FILE"),
    
    TIBCO_BUSINESS_WORKS_ENGINE_PROPERTY_FILE_PATH("TIBCO_BUSINESS_WORKS_ENGINE_PROPERTY_FILE_PATH"),
    
    TIBCO_BUSINESS_WORKS_HOME("TIBCO_BUSINESS_WORKS_HOME"),
    
    VARNISH_INSTANCE_NAME("VARNISH_INSTANCE_NAME"),
    
    WEBSPHERE_LIBERTY_SERVER_NAME("WEBSPHERE_LIBERTY_SERVER_NAME"),
    
    WEB_LOGIC_CLUSTER_NAME("WEB_LOGIC_CLUSTER_NAME"),
    
    WEB_LOGIC_DOMAIN_NAME("WEB_LOGIC_DOMAIN_NAME"),
    
    WEB_LOGIC_HOME("WEB_LOGIC_HOME"),
    
    WEB_LOGIC_NAME("WEB_LOGIC_NAME"),
    
    WEB_SPHERE_CELL_NAME("WEB_SPHERE_CELL_NAME"),
    
    WEB_SPHERE_CLUSTER_NAME("WEB_SPHERE_CLUSTER_NAME"),
    
    WEB_SPHERE_NODE_NAME("WEB_SPHERE_NODE_NAME"),
    
    WEB_SPHERE_SERVER_NAME("WEB_SPHERE_SERVER_NAME");

    private String value;

    DynamicKeyEnum(String value) {
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
    public static DynamicKeyEnum fromValue(String value) {
      for (DynamicKeyEnum b : DynamicKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DYNAMIC_KEY = "dynamicKey";
  private DynamicKeyEnum dynamicKey;

  public ProcessMetadataConditionKey() { 
  }

  public ProcessMetadataConditionKey dynamicKey(DynamicKeyEnum dynamicKey) {
    this.dynamicKey = dynamicKey;
    return this;
  }

   /**
   * The key of the attribute, which need dynamic keys.   Not applicable otherwise, as the attibute itself acts as a key.
   * @return dynamicKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The key of the attribute, which need dynamic keys.   Not applicable otherwise, as the attibute itself acts as a key.")
  @JsonProperty(JSON_PROPERTY_DYNAMIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DynamicKeyEnum getDynamicKey() {
    return dynamicKey;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDynamicKey(DynamicKeyEnum dynamicKey) {
    this.dynamicKey = dynamicKey;
  }


  /**
   * Return true if this ProcessMetadataConditionKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessMetadataConditionKey processMetadataConditionKey = (ProcessMetadataConditionKey) o;
    return Objects.equals(this.dynamicKey, processMetadataConditionKey.dynamicKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessMetadataConditionKey {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dynamicKey: ").append(toIndentedString(dynamicKey)).append("\n");
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
  mappings.put("HOST_CUSTOM_METADATA_KEY", CustomHostMetadataConditionKey.class);
  mappings.put("PROCESS_CUSTOM_METADATA_KEY", CustomProcessMetadataConditionKey.class);
  mappings.put("PROCESS_PREDEFINED_METADATA_KEY", ProcessMetadataConditionKey.class);
  mappings.put("STATIC", StaticConditionKey.class);
  mappings.put("STRING", StringConditionKey.class);
  mappings.put("ProcessMetadataConditionKey", ProcessMetadataConditionKey.class);
  JSON.registerDiscriminator(ProcessMetadataConditionKey.class, "type", mappings);
}
}

