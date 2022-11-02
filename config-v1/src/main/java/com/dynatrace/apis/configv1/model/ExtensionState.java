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
 * The state of the extension.
 */
@ApiModel(description = "The state of the extension.")
@JsonPropertyOrder({
  ExtensionState.JSON_PROPERTY_EXTENSION_ID,
  ExtensionState.JSON_PROPERTY_VERSION,
  ExtensionState.JSON_PROPERTY_ENDPOINT_ID,
  ExtensionState.JSON_PROPERTY_STATE,
  ExtensionState.JSON_PROPERTY_STATE_DESCRIPTION,
  ExtensionState.JSON_PROPERTY_TIMESTAMP,
  ExtensionState.JSON_PROPERTY_HOST_ID,
  ExtensionState.JSON_PROPERTY_PROCESS_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:07:55.784964900+01:00[Europe/Brussels]")
public class ExtensionState {
  public static final String JSON_PROPERTY_EXTENSION_ID = "extensionId";
  private String extensionId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_ENDPOINT_ID = "endpointId";
  private String endpointId;

  /**
   * The state of the extension.
   */
  public enum StateEnum {
    ERROR_AUTH("ERROR_AUTH"),
    
    ERROR_COMMUNICATION_FAILURE("ERROR_COMMUNICATION_FAILURE"),
    
    ERROR_CONFIG("ERROR_CONFIG"),
    
    ERROR_TIMEOUT("ERROR_TIMEOUT"),
    
    ERROR_UNKNOWN("ERROR_UNKNOWN"),
    
    INCOMPATIBLE("INCOMPATIBLE"),
    
    LIMIT_REACHED("LIMIT_REACHED"),
    
    NOTHING_TO_REPORT("NOTHING_TO_REPORT"),
    
    OK("OK"),
    
    STATE_TYPE_UNKNOWN("STATE_TYPE_UNKNOWN"),
    
    UNINITIALIZED("UNINITIALIZED"),
    
    UNSUPPORTED("UNSUPPORTED"),
    
    WAITING_FOR_STATE("WAITING_FOR_STATE");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public static final String JSON_PROPERTY_STATE_DESCRIPTION = "stateDescription";
  private String stateDescription;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private String hostId;

  public static final String JSON_PROPERTY_PROCESS_ID = "processId";
  private String processId;

  public ExtensionState() { 
  }

  public ExtensionState extensionId(String extensionId) {
    this.extensionId = extensionId;
    return this;
  }

   /**
   * The ID of the extension.
   * @return extensionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the extension.")
  @JsonProperty(JSON_PROPERTY_EXTENSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtensionId() {
    return extensionId;
  }


  @JsonProperty(JSON_PROPERTY_EXTENSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtensionId(String extensionId) {
    this.extensionId = extensionId;
  }


  public ExtensionState version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the extension (for example &#x60;1.0.0&#x60;).
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the extension (for example `1.0.0`).")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public ExtensionState endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * The ID of the endpoint where the state is detected - Active Gate only.
   * @return endpointId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the endpoint where the state is detected - Active Gate only.")
  @JsonProperty(JSON_PROPERTY_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpointId() {
    return endpointId;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  public ExtensionState state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the extension.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the extension.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  public ExtensionState stateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

   /**
   * A short description of the state.
   * @return stateDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the state.")
  @JsonProperty(JSON_PROPERTY_STATE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateDescription() {
    return stateDescription;
  }


  @JsonProperty(JSON_PROPERTY_STATE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateDescription(String stateDescription) {
    this.stateDescription = stateDescription;
  }


  public ExtensionState timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when the state was detected, in UTC milliseconds.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the state was detected, in UTC milliseconds.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public ExtensionState hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * The ID of the host on which the extension runs.
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the host on which the extension runs.")
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public ExtensionState processId(String processId) {
    this.processId = processId;
    return this;
  }

   /**
   * The ID of the entity on which the extension is active.
   * @return processId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the entity on which the extension is active.")
  @JsonProperty(JSON_PROPERTY_PROCESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessId() {
    return processId;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessId(String processId) {
    this.processId = processId;
  }


  /**
   * Return true if this ExtensionState object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionState extensionState = (ExtensionState) o;
    return Objects.equals(this.extensionId, extensionState.extensionId) &&
        Objects.equals(this.version, extensionState.version) &&
        Objects.equals(this.endpointId, extensionState.endpointId) &&
        Objects.equals(this.state, extensionState.state) &&
        Objects.equals(this.stateDescription, extensionState.stateDescription) &&
        Objects.equals(this.timestamp, extensionState.timestamp) &&
        Objects.equals(this.hostId, extensionState.hostId) &&
        Objects.equals(this.processId, extensionState.processId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionId, version, endpointId, state, stateDescription, timestamp, hostId, processId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionState {\n");
    sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
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
