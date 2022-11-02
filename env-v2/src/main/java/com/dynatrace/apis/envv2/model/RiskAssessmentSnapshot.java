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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A snapshot of the risk assessment of a security problem.
 */
@ApiModel(description = "A snapshot of the risk assessment of a security problem.")
@JsonPropertyOrder({
  RiskAssessmentSnapshot.JSON_PROPERTY_RISK_LEVEL,
  RiskAssessmentSnapshot.JSON_PROPERTY_RISK_SCORE,
  RiskAssessmentSnapshot.JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES,
  RiskAssessmentSnapshot.JSON_PROPERTY_NUMBER_OF_REACHABLE_DATA_ASSETS,
  RiskAssessmentSnapshot.JSON_PROPERTY_PUBLIC_EXPLOIT,
  RiskAssessmentSnapshot.JSON_PROPERTY_EXPOSURE,
  RiskAssessmentSnapshot.JSON_PROPERTY_VULNERABLE_FUNCTION_USAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class RiskAssessmentSnapshot {
  /**
   * The Davis risk level.    It is calculated by Dynatrace on the basis of CVSS score.
   */
  public enum RiskLevelEnum {
    CRITICAL("CRITICAL"),
    
    HIGH("HIGH"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    NONE("NONE");

    private String value;

    RiskLevelEnum(String value) {
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
    public static RiskLevelEnum fromValue(String value) {
      for (RiskLevelEnum b : RiskLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RISK_LEVEL = "riskLevel";
  private RiskLevelEnum riskLevel;

  public static final String JSON_PROPERTY_RISK_SCORE = "riskScore";
  private Float riskScore;

  public static final String JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES = "numberOfAffectedEntities";
  private Integer numberOfAffectedEntities;

  public static final String JSON_PROPERTY_NUMBER_OF_REACHABLE_DATA_ASSETS = "numberOfReachableDataAssets";
  private Integer numberOfReachableDataAssets;

  /**
   * The availability status of public exploits.
   */
  public enum PublicExploitEnum {
    AVAILABLE("AVAILABLE"),
    
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    PublicExploitEnum(String value) {
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
    public static PublicExploitEnum fromValue(String value) {
      for (PublicExploitEnum b : PublicExploitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUBLIC_EXPLOIT = "publicExploit";
  private PublicExploitEnum publicExploit;

  /**
   * The level of exposure of affected entities.
   */
  public enum ExposureEnum {
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    NOT_DETECTED("NOT_DETECTED"),
    
    PUBLIC_NETWORK("PUBLIC_NETWORK");

    private String value;

    ExposureEnum(String value) {
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
    public static ExposureEnum fromValue(String value) {
      for (ExposureEnum b : ExposureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EXPOSURE = "exposure";
  private ExposureEnum exposure;

  /**
   * The state of vulnerable code execution.
   */
  public enum VulnerableFunctionUsageEnum {
    IN_USE("IN_USE"),
    
    NOT_AVAILABLE("NOT_AVAILABLE"),
    
    NOT_IN_USE("NOT_IN_USE");

    private String value;

    VulnerableFunctionUsageEnum(String value) {
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
    public static VulnerableFunctionUsageEnum fromValue(String value) {
      for (VulnerableFunctionUsageEnum b : VulnerableFunctionUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VULNERABLE_FUNCTION_USAGE = "vulnerableFunctionUsage";
  private VulnerableFunctionUsageEnum vulnerableFunctionUsage;

  public RiskAssessmentSnapshot() { 
  }

  @JsonCreator
  public RiskAssessmentSnapshot(
    @JsonProperty(JSON_PROPERTY_RISK_LEVEL) RiskLevelEnum riskLevel, 
    @JsonProperty(JSON_PROPERTY_RISK_SCORE) Float riskScore, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES) Integer numberOfAffectedEntities, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_REACHABLE_DATA_ASSETS) Integer numberOfReachableDataAssets, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_EXPLOIT) PublicExploitEnum publicExploit, 
    @JsonProperty(JSON_PROPERTY_EXPOSURE) ExposureEnum exposure, 
    @JsonProperty(JSON_PROPERTY_VULNERABLE_FUNCTION_USAGE) VulnerableFunctionUsageEnum vulnerableFunctionUsage
  ) {
  this();
    this.riskLevel = riskLevel;
    this.riskScore = riskScore;
    this.numberOfAffectedEntities = numberOfAffectedEntities;
    this.numberOfReachableDataAssets = numberOfReachableDataAssets;
    this.publicExploit = publicExploit;
    this.exposure = exposure;
    this.vulnerableFunctionUsage = vulnerableFunctionUsage;
  }

   /**
   * The Davis risk level.    It is calculated by Dynatrace on the basis of CVSS score.
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Davis risk level.    It is calculated by Dynatrace on the basis of CVSS score.")
  @JsonProperty(JSON_PROPERTY_RISK_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RiskLevelEnum getRiskLevel() {
    return riskLevel;
  }




   /**
   * The Davis risk score (1-10).    It is calculated by Dynatrace on the basis of CVSS score.
   * @return riskScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Davis risk score (1-10).    It is calculated by Dynatrace on the basis of CVSS score.")
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getRiskScore() {
    return riskScore;
  }




   /**
   * The number of currently affected entities.
   * @return numberOfAffectedEntities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of currently affected entities.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_AFFECTED_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfAffectedEntities() {
    return numberOfAffectedEntities;
  }




   /**
   * The number of data assets that are currently reachable by affected entities.
   * @return numberOfReachableDataAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of data assets that are currently reachable by affected entities.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_REACHABLE_DATA_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfReachableDataAssets() {
    return numberOfReachableDataAssets;
  }




   /**
   * The availability status of public exploits.
   * @return publicExploit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability status of public exploits.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_EXPLOIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PublicExploitEnum getPublicExploit() {
    return publicExploit;
  }




   /**
   * The level of exposure of affected entities.
   * @return exposure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The level of exposure of affected entities.")
  @JsonProperty(JSON_PROPERTY_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExposureEnum getExposure() {
    return exposure;
  }




   /**
   * The state of vulnerable code execution.
   * @return vulnerableFunctionUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of vulnerable code execution.")
  @JsonProperty(JSON_PROPERTY_VULNERABLE_FUNCTION_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VulnerableFunctionUsageEnum getVulnerableFunctionUsage() {
    return vulnerableFunctionUsage;
  }




  /**
   * Return true if this RiskAssessmentSnapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskAssessmentSnapshot riskAssessmentSnapshot = (RiskAssessmentSnapshot) o;
    return Objects.equals(this.riskLevel, riskAssessmentSnapshot.riskLevel) &&
        Objects.equals(this.riskScore, riskAssessmentSnapshot.riskScore) &&
        Objects.equals(this.numberOfAffectedEntities, riskAssessmentSnapshot.numberOfAffectedEntities) &&
        Objects.equals(this.numberOfReachableDataAssets, riskAssessmentSnapshot.numberOfReachableDataAssets) &&
        Objects.equals(this.publicExploit, riskAssessmentSnapshot.publicExploit) &&
        Objects.equals(this.exposure, riskAssessmentSnapshot.exposure) &&
        Objects.equals(this.vulnerableFunctionUsage, riskAssessmentSnapshot.vulnerableFunctionUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskLevel, riskScore, numberOfAffectedEntities, numberOfReachableDataAssets, publicExploit, exposure, vulnerableFunctionUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskAssessmentSnapshot {\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    numberOfAffectedEntities: ").append(toIndentedString(numberOfAffectedEntities)).append("\n");
    sb.append("    numberOfReachableDataAssets: ").append(toIndentedString(numberOfReachableDataAssets)).append("\n");
    sb.append("    publicExploit: ").append(toIndentedString(publicExploit)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    vulnerableFunctionUsage: ").append(toIndentedString(vulnerableFunctionUsage)).append("\n");
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
