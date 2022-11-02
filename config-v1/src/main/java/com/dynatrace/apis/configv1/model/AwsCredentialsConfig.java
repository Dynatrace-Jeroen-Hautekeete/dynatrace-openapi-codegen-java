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
import com.dynatrace.apis.configv1.model.AwsAuthenticationData;
import com.dynatrace.apis.configv1.model.AwsConfigTag;
import com.dynatrace.apis.configv1.model.AwsSupportingServiceConfig;
import com.dynatrace.apis.configv1.model.ConfigurationMetadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Configuration of an AWS credentials.
 */
@ApiModel(description = "Configuration of an AWS credentials.")
@JsonPropertyOrder({
  AwsCredentialsConfig.JSON_PROPERTY_METADATA,
  AwsCredentialsConfig.JSON_PROPERTY_ID,
  AwsCredentialsConfig.JSON_PROPERTY_CONNECTION_STATUS,
  AwsCredentialsConfig.JSON_PROPERTY_LABEL,
  AwsCredentialsConfig.JSON_PROPERTY_PARTITION_TYPE,
  AwsCredentialsConfig.JSON_PROPERTY_AUTHENTICATION_DATA,
  AwsCredentialsConfig.JSON_PROPERTY_TAGGED_ONLY,
  AwsCredentialsConfig.JSON_PROPERTY_TAGS_TO_MONITOR,
  AwsCredentialsConfig.JSON_PROPERTY_SUPPORTING_SERVICES_TO_MONITOR
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class AwsCredentialsConfig {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ConfigurationMetadata metadata;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * The status of the connection to the AWS environment.    * &#x60;CONNECTED&#x60;: There was a connection within last 10 minutes.  * &#x60;DISCONNECTED&#x60;: A problem occurred with establishing connection using these credentials. Check whether the data is correct.  * &#x60;UNINITIALIZED&#x60;: The successful connection has never been established for these credentials.
   */
  public enum ConnectionStatusEnum {
    CONNECTED("CONNECTED"),
    
    DISCONNECTED("DISCONNECTED"),
    
    UNINITIALIZED("UNINITIALIZED");

    private String value;

    ConnectionStatusEnum(String value) {
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
    public static ConnectionStatusEnum fromValue(String value) {
      for (ConnectionStatusEnum b : ConnectionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONNECTION_STATUS = "connectionStatus";
  private ConnectionStatusEnum connectionStatus;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  /**
   * The type of the AWS partition.
   */
  public enum PartitionTypeEnum {
    CN("AWS_CN"),
    
    DEFAULT("AWS_DEFAULT"),
    
    US_GOV("AWS_US_GOV");

    private String value;

    PartitionTypeEnum(String value) {
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
    public static PartitionTypeEnum fromValue(String value) {
      for (PartitionTypeEnum b : PartitionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PARTITION_TYPE = "partitionType";
  private PartitionTypeEnum partitionType;

  public static final String JSON_PROPERTY_AUTHENTICATION_DATA = "authenticationData";
  private AwsAuthenticationData authenticationData;

  public static final String JSON_PROPERTY_TAGGED_ONLY = "taggedOnly";
  private Boolean taggedOnly;

  public static final String JSON_PROPERTY_TAGS_TO_MONITOR = "tagsToMonitor";
  private List<AwsConfigTag> tagsToMonitor = new ArrayList<>();

  public static final String JSON_PROPERTY_SUPPORTING_SERVICES_TO_MONITOR = "supportingServicesToMonitor";
  private List<AwsSupportingServiceConfig> supportingServicesToMonitor = null;

  public AwsCredentialsConfig() { 
  }

  @JsonCreator
  public AwsCredentialsConfig(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CONNECTION_STATUS) ConnectionStatusEnum connectionStatus
  ) {
  this();
    this.id = id;
    this.connectionStatus = connectionStatus;
  }

  public AwsCredentialsConfig metadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ConfigurationMetadata metadata) {
    this.metadata = metadata;
  }


   /**
   * The unique ID of the credentials.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the credentials.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The status of the connection to the AWS environment.    * &#x60;CONNECTED&#x60;: There was a connection within last 10 minutes.  * &#x60;DISCONNECTED&#x60;: A problem occurred with establishing connection using these credentials. Check whether the data is correct.  * &#x60;UNINITIALIZED&#x60;: The successful connection has never been established for these credentials.
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the connection to the AWS environment.    * `CONNECTED`: There was a connection within last 10 minutes.  * `DISCONNECTED`: A problem occurred with establishing connection using these credentials. Check whether the data is correct.  * `UNINITIALIZED`: The successful connection has never been established for these credentials.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionStatusEnum getConnectionStatus() {
    return connectionStatus;
  }




  public AwsCredentialsConfig label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The name of the credentials.
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the credentials.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLabel(String label) {
    this.label = label;
  }


  public AwsCredentialsConfig partitionType(PartitionTypeEnum partitionType) {
    this.partitionType = partitionType;
    return this;
  }

   /**
   * The type of the AWS partition.
   * @return partitionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the AWS partition.")
  @JsonProperty(JSON_PROPERTY_PARTITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PartitionTypeEnum getPartitionType() {
    return partitionType;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartitionType(PartitionTypeEnum partitionType) {
    this.partitionType = partitionType;
  }


  public AwsCredentialsConfig authenticationData(AwsAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
    return this;
  }

   /**
   * Get authenticationData
   * @return authenticationData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AwsAuthenticationData getAuthenticationData() {
    return authenticationData;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthenticationData(AwsAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
  }


  public AwsCredentialsConfig taggedOnly(Boolean taggedOnly) {
    this.taggedOnly = taggedOnly;
    return this;
  }

   /**
   * Monitor only resources which have specified AWS tags (&#x60;true&#x60;) or all resources (&#x60;false&#x60;).
   * @return taggedOnly
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Monitor only resources which have specified AWS tags (`true`) or all resources (`false`).")
  @JsonProperty(JSON_PROPERTY_TAGGED_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTaggedOnly() {
    return taggedOnly;
  }


  @JsonProperty(JSON_PROPERTY_TAGGED_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaggedOnly(Boolean taggedOnly) {
    this.taggedOnly = taggedOnly;
  }


  public AwsCredentialsConfig tagsToMonitor(List<AwsConfigTag> tagsToMonitor) {
    this.tagsToMonitor = tagsToMonitor;
    return this;
  }

  public AwsCredentialsConfig addTagsToMonitorItem(AwsConfigTag tagsToMonitorItem) {
    this.tagsToMonitor.add(tagsToMonitorItem);
    return this;
  }

   /**
   * A list of AWS tags to be monitored.   You can specify up to 10 tags.   Only applicable when the **taggedOnly** parameter is set to &#x60;true&#x60;.
   * @return tagsToMonitor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of AWS tags to be monitored.   You can specify up to 10 tags.   Only applicable when the **taggedOnly** parameter is set to `true`.")
  @JsonProperty(JSON_PROPERTY_TAGS_TO_MONITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AwsConfigTag> getTagsToMonitor() {
    return tagsToMonitor;
  }


  @JsonProperty(JSON_PROPERTY_TAGS_TO_MONITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTagsToMonitor(List<AwsConfigTag> tagsToMonitor) {
    this.tagsToMonitor = tagsToMonitor;
  }


  public AwsCredentialsConfig supportingServicesToMonitor(List<AwsSupportingServiceConfig> supportingServicesToMonitor) {
    this.supportingServicesToMonitor = supportingServicesToMonitor;
    return this;
  }

  public AwsCredentialsConfig addSupportingServicesToMonitorItem(AwsSupportingServiceConfig supportingServicesToMonitorItem) {
    if (this.supportingServicesToMonitor == null) {
      this.supportingServicesToMonitor = new ArrayList<>();
    }
    this.supportingServicesToMonitor.add(supportingServicesToMonitorItem);
    return this;
  }

   /**
   * **Deprecated**. To manage services use [/aws/credentials/{id}/services](https://dt-url.net/l022s6v) operation. Built-in services are not supported here.  A list of AWS services to be monitored. Available services are listed by [/aws/supportedServices](https://dt-url.net/me02sh2) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/r12v0pkl).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. 
   * @return supportingServicesToMonitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Deprecated**. To manage services use [/aws/credentials/{id}/services](https://dt-url.net/l022s6v) operation. Built-in services are not supported here.  A list of AWS services to be monitored. Available services are listed by [/aws/supportedServices](https://dt-url.net/me02sh2) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/r12v0pkl).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring. ")
  @JsonProperty(JSON_PROPERTY_SUPPORTING_SERVICES_TO_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsSupportingServiceConfig> getSupportingServicesToMonitor() {
    return supportingServicesToMonitor;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTING_SERVICES_TO_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportingServicesToMonitor(List<AwsSupportingServiceConfig> supportingServicesToMonitor) {
    this.supportingServicesToMonitor = supportingServicesToMonitor;
  }


  /**
   * Return true if this AwsCredentialsConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsCredentialsConfig awsCredentialsConfig = (AwsCredentialsConfig) o;
    return Objects.equals(this.metadata, awsCredentialsConfig.metadata) &&
        Objects.equals(this.id, awsCredentialsConfig.id) &&
        Objects.equals(this.connectionStatus, awsCredentialsConfig.connectionStatus) &&
        Objects.equals(this.label, awsCredentialsConfig.label) &&
        Objects.equals(this.partitionType, awsCredentialsConfig.partitionType) &&
        Objects.equals(this.authenticationData, awsCredentialsConfig.authenticationData) &&
        Objects.equals(this.taggedOnly, awsCredentialsConfig.taggedOnly) &&
        Objects.equals(this.tagsToMonitor, awsCredentialsConfig.tagsToMonitor) &&
        Objects.equals(this.supportingServicesToMonitor, awsCredentialsConfig.supportingServicesToMonitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, id, connectionStatus, label, partitionType, authenticationData, taggedOnly, tagsToMonitor, supportingServicesToMonitor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsCredentialsConfig {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    partitionType: ").append(toIndentedString(partitionType)).append("\n");
    sb.append("    authenticationData: ").append(toIndentedString(authenticationData)).append("\n");
    sb.append("    taggedOnly: ").append(toIndentedString(taggedOnly)).append("\n");
    sb.append("    tagsToMonitor: ").append(toIndentedString(tagsToMonitor)).append("\n");
    sb.append("    supportingServicesToMonitor: ").append(toIndentedString(supportingServicesToMonitor)).append("\n");
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

