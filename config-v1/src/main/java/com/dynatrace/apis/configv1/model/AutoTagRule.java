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
import com.dynatrace.apis.configv1.model.EntityRuleEngineCondition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A rule for the auto-tag.    Defines the conditions of tag usage.
 */
@ApiModel(description = "A rule for the auto-tag.    Defines the conditions of tag usage.")
@JsonPropertyOrder({
  AutoTagRule.JSON_PROPERTY_TYPE,
  AutoTagRule.JSON_PROPERTY_ENABLED,
  AutoTagRule.JSON_PROPERTY_VALUE_FORMAT,
  AutoTagRule.JSON_PROPERTY_NORMALIZATION,
  AutoTagRule.JSON_PROPERTY_PROPAGATION_TYPES,
  AutoTagRule.JSON_PROPERTY_CONDITIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AutoTagRule {
  /**
   * Type of entities to which the rule applies.
   */
  public enum TypeEnum {
    APPLICATION("APPLICATION"),
    
    AWS_APPLICATION_LOAD_BALANCER("AWS_APPLICATION_LOAD_BALANCER"),
    
    AWS_CLASSIC_LOAD_BALANCER("AWS_CLASSIC_LOAD_BALANCER"),
    
    AWS_NETWORK_LOAD_BALANCER("AWS_NETWORK_LOAD_BALANCER"),
    
    AWS_RELATIONAL_DATABASE_SERVICE("AWS_RELATIONAL_DATABASE_SERVICE"),
    
    AZURE("AZURE"),
    
    CUSTOM_APPLICATION("CUSTOM_APPLICATION"),
    
    CUSTOM_DEVICE("CUSTOM_DEVICE"),
    
    DCRUM_APPLICATION("DCRUM_APPLICATION"),
    
    ESXI_HOST("ESXI_HOST"),
    
    EXTERNAL_SYNTHETIC_TEST("EXTERNAL_SYNTHETIC_TEST"),
    
    HOST("HOST"),
    
    HTTP_CHECK("HTTP_CHECK"),
    
    MOBILE_APPLICATION("MOBILE_APPLICATION"),
    
    PROCESS_GROUP("PROCESS_GROUP"),
    
    SERVICE("SERVICE"),
    
    SYNTHETIC_TEST("SYNTHETIC_TEST");

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

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_VALUE_FORMAT = "valueFormat";
  private String valueFormat;

  /**
   * Changes applied to the value after applying the value format. Default is LEAVE_TEXT_AS_IS.
   */
  public enum NormalizationEnum {
    LEAVE_TEXT_AS_IS("LEAVE_TEXT_AS_IS"),
    
    TO_LOWER_CASE("TO_LOWER_CASE"),
    
    TO_UPPER_CASE("TO_UPPER_CASE");

    private String value;

    NormalizationEnum(String value) {
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
    public static NormalizationEnum fromValue(String value) {
      for (NormalizationEnum b : NormalizationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_NORMALIZATION = "normalization";
  private JsonNullable<NormalizationEnum> normalization = JsonNullable.<NormalizationEnum>undefined();

  /**
   * Gets or Sets propagationTypes
   */
  public enum PropagationTypesEnum {
    AZURE_TO_PG("AZURE_TO_PG"),
    
    AZURE_TO_SERVICE("AZURE_TO_SERVICE"),
    
    HOST_TO_PROCESS_GROUP_INSTANCE("HOST_TO_PROCESS_GROUP_INSTANCE"),
    
    PROCESS_GROUP_TO_HOST("PROCESS_GROUP_TO_HOST"),
    
    PROCESS_GROUP_TO_SERVICE("PROCESS_GROUP_TO_SERVICE"),
    
    SERVICE_TO_HOST_LIKE("SERVICE_TO_HOST_LIKE"),
    
    SERVICE_TO_PROCESS_GROUP_LIKE("SERVICE_TO_PROCESS_GROUP_LIKE");

    private String value;

    PropagationTypesEnum(String value) {
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
    public static PropagationTypesEnum fromValue(String value) {
      for (PropagationTypesEnum b : PropagationTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROPAGATION_TYPES = "propagationTypes";
  private List<PropagationTypesEnum> propagationTypes = null;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<EntityRuleEngineCondition> conditions = new ArrayList<>();

  public AutoTagRule() { 
  }

  public AutoTagRule type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of entities to which the rule applies.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of entities to which the rule applies.")
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


  public AutoTagRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Tag rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tag rule is enabled (`true`) or disabled (`false`).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AutoTagRule valueFormat(String valueFormat) {
    this.valueFormat = valueFormat;
    return this;
  }

   /**
   * The value of the auto-tag. If specified, the tag is used in the &#x60;name:valueFormat&#x60; format.   For example, you can extend the &#x60;Infrastructure&#x60; tag to &#x60;Infrastructure:Windows&#x60; and &#x60;Infrastructure:Linux&#x60;.   You can use the following placeholders here:   * &#x60;{AwsAutoScalingGroup:Name}&#x60;  * &#x60;{AwsAvailabilityZone:Name}&#x60;  * &#x60;{AwsElasticLoadBalancer:Name}&#x60;  * &#x60;{AwsRelationalDatabaseService:DBName}&#x60;  * &#x60;{AwsRelationalDatabaseService:Endpoint}&#x60;  * &#x60;{AwsRelationalDatabaseService:Engine}&#x60;  * &#x60;{AwsRelationalDatabaseService:InstanceClass}&#x60;  * &#x60;{AwsRelationalDatabaseService:Name}&#x60;  * &#x60;{AwsRelationalDatabaseService:Port}&#x60;  * &#x60;{AzureRegion:Name}&#x60;  * &#x60;{AzureScaleSet:Name}&#x60;  * &#x60;{AzureVm:Name}&#x60;  * &#x60;{CloudFoundryOrganization:Name}&#x60;  * &#x60;{CustomDevice:DetectedName}&#x60;  * &#x60;{CustomDevice:DnsName}&#x60;  * &#x60;{CustomDevice:IpAddress}&#x60;  * &#x60;{CustomDevice:Port}&#x60;  * &#x60;{DockerContainerGroupInstance:ContainerName}&#x60;  * &#x60;{DockerContainerGroupInstance:FullImageName}&#x60;  * &#x60;{DockerContainerGroupInstance:ImageVersion}&#x60;  * &#x60;{DockerContainerGroupInstance:StrippedImageName}&#x60;  * &#x60;{ESXIHost:HardwareModel}&#x60;  * &#x60;{ESXIHost:HardwareVendor}&#x60;  * &#x60;{ESXIHost:Name}&#x60;  * &#x60;{ESXIHost:ProductName}&#x60;  * &#x60;{ESXIHost:ProductVersion}&#x60;  * &#x60;{Ec2Instance:AmiId}&#x60;  * &#x60;{Ec2Instance:BeanstalkEnvironmentName}&#x60;  * &#x60;{Ec2Instance:InstanceId}&#x60;  * &#x60;{Ec2Instance:InstanceType}&#x60;  * &#x60;{Ec2Instance:LocalHostName}&#x60;  * &#x60;{Ec2Instance:Name}&#x60;  * &#x60;{Ec2Instance:PublicHostName}&#x60;  * &#x60;{Ec2Instance:SecurityGroup}&#x60;  * &#x60;{GoogleComputeInstance:Id}&#x60;  * &#x60;{GoogleComputeInstance:IpAddresses}&#x60;  * &#x60;{GoogleComputeInstance:MachineType}&#x60;  * &#x60;{GoogleComputeInstance:Name}&#x60;  * &#x60;{GoogleComputeInstance:ProjectId}&#x60;  * &#x60;{GoogleComputeInstance:Project}&#x60;  * &#x60;{Host:AWSNameTag}&#x60;  * &#x60;{Host:AixLogicalCpuCount}&#x60;  * &#x60;{Host:AzureHostName}&#x60;  * &#x60;{Host:AzureSiteName}&#x60;  * &#x60;{Host:BoshDeploymentId}&#x60;  * &#x60;{Host:BoshInstanceId}&#x60;  * &#x60;{Host:BoshInstanceName}&#x60;  * &#x60;{Host:BoshName}&#x60;  * &#x60;{Host:BoshStemcellVersion}&#x60;  * &#x60;{Host:CpuCores}&#x60;  * &#x60;{Host:DetectedName}&#x60;  * &#x60;{Host:Environment:AppName}&#x60;  * &#x60;{Host:Environment:BoshReleaseVersion}&#x60;  * &#x60;{Host:Environment:Environment}&#x60;  * &#x60;{Host:Environment:Link}&#x60;  * &#x60;{Host:Environment:Organization}&#x60;  * &#x60;{Host:Environment:Owner}&#x60;  * &#x60;{Host:Environment:Support}&#x60;  * &#x60;{Host:IpAddress}&#x60;  * &#x60;{Host:LogicalCpuCores}&#x60;  * &#x60;{Host:OneAgentCustomHostName}&#x60;  * &#x60;{Host:OperatingSystemVersion}&#x60;  * &#x60;{Host:PaasMemoryLimit}&#x60;  * &#x60;{HostGroup:Name}&#x60;  * &#x60;{KubernetesCluster:Name}&#x60;  * &#x60;{KubernetesNode:DetectedName}&#x60;  * &#x60;{OpenstackAvailabilityZone:Name}&#x60;  * &#x60;{OpenstackZone:Name}&#x60;  * &#x60;{OpenstackComputeNode:Name}&#x60;  * &#x60;{OpenstackProject:Name}&#x60;  * &#x60;{OpenstackVm:UnstanceType}&#x60;  * &#x60;{OpenstackVm:Name}&#x60;  * &#x60;{OpenstackVm:SecurityGroup}&#x60;  * &#x60;{ProcessGroup:AmazonECRImageAccountId}&#x60;  * &#x60;{ProcessGroup:AmazonECRImageRegion}&#x60;  * &#x60;{ProcessGroup:AmazonECSCluster}&#x60;  * &#x60;{ProcessGroup:AmazonECSContainerName}&#x60;  * &#x60;{ProcessGroup:AmazonECSFamily}&#x60;  * &#x60;{ProcessGroup:AmazonECSRevision}&#x60;  * &#x60;{ProcessGroup:AmazonLambdaFunctionName}&#x60;  * &#x60;{ProcessGroup:AmazonRegion}&#x60;  * &#x60;{ProcessGroup:ApacheConfigPath}&#x60;  * &#x60;{ProcessGroup:ApacheSparkMasterIpAddress}&#x60;  * &#x60;{ProcessGroup:AspDotNetCoreApplicationPath}&#x60;  * &#x60;{ProcessGroup:AspDotNetCoreApplicationPath}&#x60;  * &#x60;{ProcessGroup:AzureHostName}&#x60;  * &#x60;{ProcessGroup:AzureSiteName}&#x60;  * &#x60;{ProcessGroup:CassandraClusterName}&#x60;  * &#x60;{ProcessGroup:CatalinaBase}&#x60;  * &#x60;{ProcessGroup:CatalinaHome}&#x60;  * &#x60;{ProcessGroup:CloudFoundryAppId}&#x60;  * &#x60;{ProcessGroup:CloudFoundryAppName}&#x60;  * &#x60;{ProcessGroup:CloudFoundryInstanceIndex}&#x60;  * &#x60;{ProcessGroup:CloudFoundrySpaceId}&#x60;  * &#x60;{ProcessGroup:CloudFoundrySpaceName}&#x60;  * &#x60;{ProcessGroup:ColdFusionJvmConfigFile}&#x60;  * &#x60;{ProcessGroup:ColdFusionServiceName}&#x60;  * &#x60;{ProcessGroup:CommandLineArgs}&#x60;  * &#x60;{ProcessGroup:DetectedName}&#x60;  * &#x60;{ProcessGroup:DotNetCommandPath}&#x60;  * &#x60;{ProcessGroup:DotNetCommand}&#x60;  * &#x60;{ProcessGroup:DotNetClusterId}&#x60;  * &#x60;{ProcessGroup:DotNetNodeId}&#x60;  * &#x60;{ProcessGroup:ElasticsearchClusterName}&#x60;  * &#x60;{ProcessGroup:ElasticsearchNodeName}&#x60;  * &#x60;{ProcessGroup:EquinoxConfigPath}&#x60;  * &#x60;{ProcessGroup:ExeName}&#x60;  * &#x60;{ProcessGroup:ExePath}&#x60;  * &#x60;{ProcessGroup:GlassFishDomainName}&#x60;  * &#x60;{ProcessGroup:GlassFishInstanceName}&#x60;  * &#x60;{ProcessGroup:GoogleAppEngineInstance}&#x60;  * &#x60;{ProcessGroup:GoogleAppEngineService}&#x60;  * &#x60;{ProcessGroup:GoogleCloudProject}&#x60;  * &#x60;{ProcessGroup:HybrisBinDirectory}&#x60;  * &#x60;{ProcessGroup:HybrisConfigDirectory}&#x60;  * &#x60;{ProcessGroup:HybrisConfigDirectory}&#x60;  * &#x60;{ProcessGroup:HybrisDataDirectory}&#x60;  * &#x60;{ProcessGroup:IBMCicsRegion}&#x60;  * &#x60;{ProcessGroup:IBMCtgName}&#x60;  * &#x60;{ProcessGroup:IBMImsConnectRegion}&#x60;  * &#x60;{ProcessGroup:IBMImsControlRegion}&#x60;  * &#x60;{ProcessGroup:IBMImsMessageProcessingRegion}&#x60;  * &#x60;{ProcessGroup:IBMImsSoapGwName}&#x60;  * &#x60;{ProcessGroup:IBMIntegrationNodeName}&#x60;  * &#x60;{ProcessGroup:IBMIntegrationServerName}&#x60;  * &#x60;{ProcessGroup:IISAppPool}&#x60;  * &#x60;{ProcessGroup:IISRoleName}&#x60;  * &#x60;{ProcessGroup:JbossHome}&#x60;  * &#x60;{ProcessGroup:JbossMode}&#x60;  * &#x60;{ProcessGroup:JbossServerName}&#x60;  * &#x60;{ProcessGroup:JavaJarFile}&#x60;  * &#x60;{ProcessGroup:JavaJarPath}&#x60;  * &#x60;{ProcessGroup:JavaMainCLass}&#x60;  * &#x60;{ProcessGroup:KubernetesBasePodName}&#x60;  * &#x60;{ProcessGroup:KubernetesContainerName}&#x60;  * &#x60;{ProcessGroup:KubernetesFullPodName}&#x60;  * &#x60;{ProcessGroup:KubernetesNamespace}&#x60;  * &#x60;{ProcessGroup:KubernetesPodUid}&#x60;  * &#x60;{ProcessGroup:MssqlInstanceName}&#x60;  * &#x60;{ProcessGroup:NodeJsAppBaseDirectory}&#x60;  * &#x60;{ProcessGroup:NodeJsAppName}&#x60;  * &#x60;{ProcessGroup:NodeJsScriptName}&#x60;  * &#x60;{ProcessGroup:OracleSid}&#x60;  * &#x60;{ProcessGroup:PHPScriptPath}&#x60;  * &#x60;{ProcessGroup:PHPWorkingDirectory}&#x60;  * &#x60;{ProcessGroup:Ports}&#x60;  * &#x60;{ProcessGroup:RubyAppRootPath}&#x60;  * &#x60;{ProcessGroup:RubyScriptPath}&#x60;  * &#x60;{ProcessGroup:SoftwareAGInstallRoot}&#x60;  * &#x60;{ProcessGroup:SoftwareAGProductPropertyName}&#x60;  * &#x60;{ProcessGroup:SpringBootAppName}&#x60;  * &#x60;{ProcessGroup:SpringBootProfileName}&#x60;  * &#x60;{ProcessGroup:SpringBootStartupClass}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksAppNodeName}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksAppSpaceName}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksCeAppName}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksCeVersion}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksDomainName}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksEnginePropertyFilePath}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksEnginePropertyFile}&#x60;  * &#x60;{ProcessGroup:TIBCOBusinessWorksHome}&#x60;  * &#x60;{ProcessGroup:VarnishInstanceName}&#x60;  * &#x60;{ProcessGroup:WebLogicClusterName}&#x60;  * &#x60;{ProcessGroup:WebLogicDomainName}&#x60;  * &#x60;{ProcessGroup:WebLogicHome}&#x60;  * &#x60;{ProcessGroup:WebLogicName}&#x60;  * &#x60;{ProcessGroup:WebSphereCellName}&#x60;  * &#x60;{ProcessGroup:WebSphereClusterName}&#x60;  * &#x60;{ProcessGroup:WebSphereNodeName}&#x60;  * &#x60;{ProcessGroup:WebSphereServerName}&#x60;  * &#x60;{ProcessGroup:ActorSystem}&#x60;  * &#x60;{Service:STGServerName}&#x60;  * &#x60;{Service:DatabaseHostName}&#x60;  * &#x60;{Service:DatabaseName}&#x60;  * &#x60;{Service:DatabaseVendor}&#x60;  * &#x60;{Service:DetectedName}&#x60;  * &#x60;{Service:EndpointPath}&#x60;  * &#x60;{Service:EndpointPathGatewayUrl}&#x60;  * &#x60;{Service:IIBApplicationName}&#x60;  * &#x60;{Service:MessageListenerClassName}&#x60;  * &#x60;{Service:Port}&#x60;  * &#x60;{Service:PublicDomainName}&#x60;  * &#x60;{Service:RemoteEndpoint}&#x60;  * &#x60;{Service:RemoteName}&#x60;  * &#x60;{Service:WebApplicationId}&#x60;  * &#x60;{Service:WebContextRoot}&#x60;  * &#x60;{Service:WebServerName}&#x60;  * &#x60;{Service:WebServiceNamespace}&#x60;  * &#x60;{Service:WebServiceName}&#x60;  * &#x60;{VmwareDatacenter:Name}&#x60;  * &#x60;{VmwareVm:Name}&#x60;  
   * @return valueFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the auto-tag. If specified, the tag is used in the `name:valueFormat` format.   For example, you can extend the `Infrastructure` tag to `Infrastructure:Windows` and `Infrastructure:Linux`.   You can use the following placeholders here:   * `{AwsAutoScalingGroup:Name}`  * `{AwsAvailabilityZone:Name}`  * `{AwsElasticLoadBalancer:Name}`  * `{AwsRelationalDatabaseService:DBName}`  * `{AwsRelationalDatabaseService:Endpoint}`  * `{AwsRelationalDatabaseService:Engine}`  * `{AwsRelationalDatabaseService:InstanceClass}`  * `{AwsRelationalDatabaseService:Name}`  * `{AwsRelationalDatabaseService:Port}`  * `{AzureRegion:Name}`  * `{AzureScaleSet:Name}`  * `{AzureVm:Name}`  * `{CloudFoundryOrganization:Name}`  * `{CustomDevice:DetectedName}`  * `{CustomDevice:DnsName}`  * `{CustomDevice:IpAddress}`  * `{CustomDevice:Port}`  * `{DockerContainerGroupInstance:ContainerName}`  * `{DockerContainerGroupInstance:FullImageName}`  * `{DockerContainerGroupInstance:ImageVersion}`  * `{DockerContainerGroupInstance:StrippedImageName}`  * `{ESXIHost:HardwareModel}`  * `{ESXIHost:HardwareVendor}`  * `{ESXIHost:Name}`  * `{ESXIHost:ProductName}`  * `{ESXIHost:ProductVersion}`  * `{Ec2Instance:AmiId}`  * `{Ec2Instance:BeanstalkEnvironmentName}`  * `{Ec2Instance:InstanceId}`  * `{Ec2Instance:InstanceType}`  * `{Ec2Instance:LocalHostName}`  * `{Ec2Instance:Name}`  * `{Ec2Instance:PublicHostName}`  * `{Ec2Instance:SecurityGroup}`  * `{GoogleComputeInstance:Id}`  * `{GoogleComputeInstance:IpAddresses}`  * `{GoogleComputeInstance:MachineType}`  * `{GoogleComputeInstance:Name}`  * `{GoogleComputeInstance:ProjectId}`  * `{GoogleComputeInstance:Project}`  * `{Host:AWSNameTag}`  * `{Host:AixLogicalCpuCount}`  * `{Host:AzureHostName}`  * `{Host:AzureSiteName}`  * `{Host:BoshDeploymentId}`  * `{Host:BoshInstanceId}`  * `{Host:BoshInstanceName}`  * `{Host:BoshName}`  * `{Host:BoshStemcellVersion}`  * `{Host:CpuCores}`  * `{Host:DetectedName}`  * `{Host:Environment:AppName}`  * `{Host:Environment:BoshReleaseVersion}`  * `{Host:Environment:Environment}`  * `{Host:Environment:Link}`  * `{Host:Environment:Organization}`  * `{Host:Environment:Owner}`  * `{Host:Environment:Support}`  * `{Host:IpAddress}`  * `{Host:LogicalCpuCores}`  * `{Host:OneAgentCustomHostName}`  * `{Host:OperatingSystemVersion}`  * `{Host:PaasMemoryLimit}`  * `{HostGroup:Name}`  * `{KubernetesCluster:Name}`  * `{KubernetesNode:DetectedName}`  * `{OpenstackAvailabilityZone:Name}`  * `{OpenstackZone:Name}`  * `{OpenstackComputeNode:Name}`  * `{OpenstackProject:Name}`  * `{OpenstackVm:UnstanceType}`  * `{OpenstackVm:Name}`  * `{OpenstackVm:SecurityGroup}`  * `{ProcessGroup:AmazonECRImageAccountId}`  * `{ProcessGroup:AmazonECRImageRegion}`  * `{ProcessGroup:AmazonECSCluster}`  * `{ProcessGroup:AmazonECSContainerName}`  * `{ProcessGroup:AmazonECSFamily}`  * `{ProcessGroup:AmazonECSRevision}`  * `{ProcessGroup:AmazonLambdaFunctionName}`  * `{ProcessGroup:AmazonRegion}`  * `{ProcessGroup:ApacheConfigPath}`  * `{ProcessGroup:ApacheSparkMasterIpAddress}`  * `{ProcessGroup:AspDotNetCoreApplicationPath}`  * `{ProcessGroup:AspDotNetCoreApplicationPath}`  * `{ProcessGroup:AzureHostName}`  * `{ProcessGroup:AzureSiteName}`  * `{ProcessGroup:CassandraClusterName}`  * `{ProcessGroup:CatalinaBase}`  * `{ProcessGroup:CatalinaHome}`  * `{ProcessGroup:CloudFoundryAppId}`  * `{ProcessGroup:CloudFoundryAppName}`  * `{ProcessGroup:CloudFoundryInstanceIndex}`  * `{ProcessGroup:CloudFoundrySpaceId}`  * `{ProcessGroup:CloudFoundrySpaceName}`  * `{ProcessGroup:ColdFusionJvmConfigFile}`  * `{ProcessGroup:ColdFusionServiceName}`  * `{ProcessGroup:CommandLineArgs}`  * `{ProcessGroup:DetectedName}`  * `{ProcessGroup:DotNetCommandPath}`  * `{ProcessGroup:DotNetCommand}`  * `{ProcessGroup:DotNetClusterId}`  * `{ProcessGroup:DotNetNodeId}`  * `{ProcessGroup:ElasticsearchClusterName}`  * `{ProcessGroup:ElasticsearchNodeName}`  * `{ProcessGroup:EquinoxConfigPath}`  * `{ProcessGroup:ExeName}`  * `{ProcessGroup:ExePath}`  * `{ProcessGroup:GlassFishDomainName}`  * `{ProcessGroup:GlassFishInstanceName}`  * `{ProcessGroup:GoogleAppEngineInstance}`  * `{ProcessGroup:GoogleAppEngineService}`  * `{ProcessGroup:GoogleCloudProject}`  * `{ProcessGroup:HybrisBinDirectory}`  * `{ProcessGroup:HybrisConfigDirectory}`  * `{ProcessGroup:HybrisConfigDirectory}`  * `{ProcessGroup:HybrisDataDirectory}`  * `{ProcessGroup:IBMCicsRegion}`  * `{ProcessGroup:IBMCtgName}`  * `{ProcessGroup:IBMImsConnectRegion}`  * `{ProcessGroup:IBMImsControlRegion}`  * `{ProcessGroup:IBMImsMessageProcessingRegion}`  * `{ProcessGroup:IBMImsSoapGwName}`  * `{ProcessGroup:IBMIntegrationNodeName}`  * `{ProcessGroup:IBMIntegrationServerName}`  * `{ProcessGroup:IISAppPool}`  * `{ProcessGroup:IISRoleName}`  * `{ProcessGroup:JbossHome}`  * `{ProcessGroup:JbossMode}`  * `{ProcessGroup:JbossServerName}`  * `{ProcessGroup:JavaJarFile}`  * `{ProcessGroup:JavaJarPath}`  * `{ProcessGroup:JavaMainCLass}`  * `{ProcessGroup:KubernetesBasePodName}`  * `{ProcessGroup:KubernetesContainerName}`  * `{ProcessGroup:KubernetesFullPodName}`  * `{ProcessGroup:KubernetesNamespace}`  * `{ProcessGroup:KubernetesPodUid}`  * `{ProcessGroup:MssqlInstanceName}`  * `{ProcessGroup:NodeJsAppBaseDirectory}`  * `{ProcessGroup:NodeJsAppName}`  * `{ProcessGroup:NodeJsScriptName}`  * `{ProcessGroup:OracleSid}`  * `{ProcessGroup:PHPScriptPath}`  * `{ProcessGroup:PHPWorkingDirectory}`  * `{ProcessGroup:Ports}`  * `{ProcessGroup:RubyAppRootPath}`  * `{ProcessGroup:RubyScriptPath}`  * `{ProcessGroup:SoftwareAGInstallRoot}`  * `{ProcessGroup:SoftwareAGProductPropertyName}`  * `{ProcessGroup:SpringBootAppName}`  * `{ProcessGroup:SpringBootProfileName}`  * `{ProcessGroup:SpringBootStartupClass}`  * `{ProcessGroup:TIBCOBusinessWorksAppNodeName}`  * `{ProcessGroup:TIBCOBusinessWorksAppSpaceName}`  * `{ProcessGroup:TIBCOBusinessWorksCeAppName}`  * `{ProcessGroup:TIBCOBusinessWorksCeVersion}`  * `{ProcessGroup:TIBCOBusinessWorksDomainName}`  * `{ProcessGroup:TIBCOBusinessWorksEnginePropertyFilePath}`  * `{ProcessGroup:TIBCOBusinessWorksEnginePropertyFile}`  * `{ProcessGroup:TIBCOBusinessWorksHome}`  * `{ProcessGroup:VarnishInstanceName}`  * `{ProcessGroup:WebLogicClusterName}`  * `{ProcessGroup:WebLogicDomainName}`  * `{ProcessGroup:WebLogicHome}`  * `{ProcessGroup:WebLogicName}`  * `{ProcessGroup:WebSphereCellName}`  * `{ProcessGroup:WebSphereClusterName}`  * `{ProcessGroup:WebSphereNodeName}`  * `{ProcessGroup:WebSphereServerName}`  * `{ProcessGroup:ActorSystem}`  * `{Service:STGServerName}`  * `{Service:DatabaseHostName}`  * `{Service:DatabaseName}`  * `{Service:DatabaseVendor}`  * `{Service:DetectedName}`  * `{Service:EndpointPath}`  * `{Service:EndpointPathGatewayUrl}`  * `{Service:IIBApplicationName}`  * `{Service:MessageListenerClassName}`  * `{Service:Port}`  * `{Service:PublicDomainName}`  * `{Service:RemoteEndpoint}`  * `{Service:RemoteName}`  * `{Service:WebApplicationId}`  * `{Service:WebContextRoot}`  * `{Service:WebServerName}`  * `{Service:WebServiceNamespace}`  * `{Service:WebServiceName}`  * `{VmwareDatacenter:Name}`  * `{VmwareVm:Name}`  ")
  @JsonProperty(JSON_PROPERTY_VALUE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueFormat() {
    return valueFormat;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueFormat(String valueFormat) {
    this.valueFormat = valueFormat;
  }


  public AutoTagRule normalization(NormalizationEnum normalization) {
    this.normalization = JsonNullable.<NormalizationEnum>of(normalization);
    return this;
  }

   /**
   * Changes applied to the value after applying the value format. Default is LEAVE_TEXT_AS_IS.
   * @return normalization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Changes applied to the value after applying the value format. Default is LEAVE_TEXT_AS_IS.")
  @JsonIgnore

  public NormalizationEnum getNormalization() {
        return normalization.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NORMALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NormalizationEnum> getNormalization_JsonNullable() {
    return normalization;
  }
  
  @JsonProperty(JSON_PROPERTY_NORMALIZATION)
  public void setNormalization_JsonNullable(JsonNullable<NormalizationEnum> normalization) {
    this.normalization = normalization;
  }

  public void setNormalization(NormalizationEnum normalization) {
    this.normalization = JsonNullable.<NormalizationEnum>of(normalization);
  }


  public AutoTagRule propagationTypes(List<PropagationTypesEnum> propagationTypes) {
    this.propagationTypes = propagationTypes;
    return this;
  }

  public AutoTagRule addPropagationTypesItem(PropagationTypesEnum propagationTypesItem) {
    if (this.propagationTypes == null) {
      this.propagationTypes = new ArrayList<>();
    }
    this.propagationTypes.add(propagationTypesItem);
    return this;
  }

   /**
   * How to apply the tag to underlying entities:   * &#x60;SERVICE_TO_PROCESS_GROUP_LIKE&#x60;: Apply to underlying process groups of matching services.  * &#x60;SERVICE_TO_HOST_LIKE&#x60;: Apply to underlying hosts of matching services.  * &#x60;PROCESS_GROUP_TO_HOST&#x60;: Apply to underlying hosts of matching process groups.  * &#x60;PROCESS_GROUP_TO_SERVICE&#x60;: Apply to all services provided by the process groups.  * &#x60;HOST_TO_PROCESS_GROUP_INSTANCE&#x60;: Apply to processes running on matching hosts.  *  &#x60;AZURE_TO_PG&#x60;: Apply to process groups connected to matching Azure entities.  * &#x60;AZURE_TO_SERVICE&#x60;: Apply to services provided by matching Azure entities.
   * @return propagationTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How to apply the tag to underlying entities:   * `SERVICE_TO_PROCESS_GROUP_LIKE`: Apply to underlying process groups of matching services.  * `SERVICE_TO_HOST_LIKE`: Apply to underlying hosts of matching services.  * `PROCESS_GROUP_TO_HOST`: Apply to underlying hosts of matching process groups.  * `PROCESS_GROUP_TO_SERVICE`: Apply to all services provided by the process groups.  * `HOST_TO_PROCESS_GROUP_INSTANCE`: Apply to processes running on matching hosts.  *  `AZURE_TO_PG`: Apply to process groups connected to matching Azure entities.  * `AZURE_TO_SERVICE`: Apply to services provided by matching Azure entities.")
  @JsonProperty(JSON_PROPERTY_PROPAGATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PropagationTypesEnum> getPropagationTypes() {
    return propagationTypes;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagationTypes(List<PropagationTypesEnum> propagationTypes) {
    this.propagationTypes = propagationTypes;
  }


  public AutoTagRule conditions(List<EntityRuleEngineCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public AutoTagRule addConditionsItem(EntityRuleEngineCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * A list of matching rules for the auto-tag.   The tag applies only when **all** conditions are fulfilled.
   * @return conditions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of matching rules for the auto-tag.   The tag applies only when **all** conditions are fulfilled.")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<EntityRuleEngineCondition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConditions(List<EntityRuleEngineCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * Return true if this AutoTagRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTagRule autoTagRule = (AutoTagRule) o;
    return Objects.equals(this.type, autoTagRule.type) &&
        Objects.equals(this.enabled, autoTagRule.enabled) &&
        Objects.equals(this.valueFormat, autoTagRule.valueFormat) &&
        equalsNullable(this.normalization, autoTagRule.normalization) &&
        Objects.equals(this.propagationTypes, autoTagRule.propagationTypes) &&
        Objects.equals(this.conditions, autoTagRule.conditions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, enabled, valueFormat, hashCodeNullable(normalization), propagationTypes, conditions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoTagRule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    valueFormat: ").append(toIndentedString(valueFormat)).append("\n");
    sb.append("    normalization: ").append(toIndentedString(normalization)).append("\n");
    sb.append("    propagationTypes: ").append(toIndentedString(propagationTypes)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
