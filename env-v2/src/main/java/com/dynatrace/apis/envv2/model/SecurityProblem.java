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
import com.dynatrace.apis.envv2.model.CodeLevelVulnerabilityDetails;
import com.dynatrace.apis.envv2.model.ManagementZone;
import com.dynatrace.apis.envv2.model.RiskAssessment;
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
 * Parameters of a security problem
 */
@ApiModel(description = "Parameters of a security problem")
@JsonPropertyOrder({
  SecurityProblem.JSON_PROPERTY_SECURITY_PROBLEM_ID,
  SecurityProblem.JSON_PROPERTY_DISPLAY_ID,
  SecurityProblem.JSON_PROPERTY_STATUS,
  SecurityProblem.JSON_PROPERTY_MUTED,
  SecurityProblem.JSON_PROPERTY_EXTERNAL_VULNERABILITY_ID,
  SecurityProblem.JSON_PROPERTY_VULNERABILITY_TYPE,
  SecurityProblem.JSON_PROPERTY_TITLE,
  SecurityProblem.JSON_PROPERTY_PACKAGE_NAME,
  SecurityProblem.JSON_PROPERTY_URL,
  SecurityProblem.JSON_PROPERTY_TECHNOLOGY,
  SecurityProblem.JSON_PROPERTY_FIRST_SEEN_TIMESTAMP,
  SecurityProblem.JSON_PROPERTY_LAST_UPDATED_TIMESTAMP,
  SecurityProblem.JSON_PROPERTY_RISK_ASSESSMENT,
  SecurityProblem.JSON_PROPERTY_MANAGEMENT_ZONES,
  SecurityProblem.JSON_PROPERTY_CVE_IDS,
  SecurityProblem.JSON_PROPERTY_CODE_LEVEL_VULNERABILITY_DETAILS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class SecurityProblem {
  public static final String JSON_PROPERTY_SECURITY_PROBLEM_ID = "securityProblemId";
  private String securityProblemId;

  public static final String JSON_PROPERTY_DISPLAY_ID = "displayId";
  private String displayId;

  /**
   * The status of the security problem.
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    RESOLVED("RESOLVED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_MUTED = "muted";
  private Boolean muted;

  public static final String JSON_PROPERTY_EXTERNAL_VULNERABILITY_ID = "externalVulnerabilityId";
  private String externalVulnerabilityId;

  /**
   * The type of the vulnerability.
   */
  public enum VulnerabilityTypeEnum {
    CODE_LEVEL("CODE_LEVEL"),
    
    RUNTIME("RUNTIME"),
    
    THIRD_PARTY("THIRD_PARTY");

    private String value;

    VulnerabilityTypeEnum(String value) {
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
    public static VulnerabilityTypeEnum fromValue(String value) {
      for (VulnerabilityTypeEnum b : VulnerabilityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VULNERABILITY_TYPE = "vulnerabilityType";
  private VulnerabilityTypeEnum vulnerabilityType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * The technology of the security problem.
   */
  public enum TechnologyEnum {
    DOTNET("DOTNET"),
    
    GO("GO"),
    
    JAVA("JAVA"),
    
    KUBERNETES("KUBERNETES"),
    
    NODE_JS("NODE_JS"),
    
    PHP("PHP");

    private String value;

    TechnologyEnum(String value) {
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
    public static TechnologyEnum fromValue(String value) {
      for (TechnologyEnum b : TechnologyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TECHNOLOGY = "technology";
  private TechnologyEnum technology;

  public static final String JSON_PROPERTY_FIRST_SEEN_TIMESTAMP = "firstSeenTimestamp";
  private Long firstSeenTimestamp;

  public static final String JSON_PROPERTY_LAST_UPDATED_TIMESTAMP = "lastUpdatedTimestamp";
  private Long lastUpdatedTimestamp;

  public static final String JSON_PROPERTY_RISK_ASSESSMENT = "riskAssessment";
  private RiskAssessment riskAssessment;

  public static final String JSON_PROPERTY_MANAGEMENT_ZONES = "managementZones";
  private List<ManagementZone> managementZones = null;

  public static final String JSON_PROPERTY_CVE_IDS = "cveIds";
  private List<String> cveIds = null;

  public static final String JSON_PROPERTY_CODE_LEVEL_VULNERABILITY_DETAILS = "codeLevelVulnerabilityDetails";
  private CodeLevelVulnerabilityDetails codeLevelVulnerabilityDetails;

  public SecurityProblem() { 
  }

  @JsonCreator
  public SecurityProblem(
    @JsonProperty(JSON_PROPERTY_SECURITY_PROBLEM_ID) String securityProblemId, 
    @JsonProperty(JSON_PROPERTY_DISPLAY_ID) String displayId, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_MUTED) Boolean muted, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_VULNERABILITY_ID) String externalVulnerabilityId, 
    @JsonProperty(JSON_PROPERTY_VULNERABILITY_TYPE) VulnerabilityTypeEnum vulnerabilityType, 
    @JsonProperty(JSON_PROPERTY_TITLE) String title, 
    @JsonProperty(JSON_PROPERTY_PACKAGE_NAME) String packageName, 
    @JsonProperty(JSON_PROPERTY_URL) String url, 
    @JsonProperty(JSON_PROPERTY_TECHNOLOGY) TechnologyEnum technology, 
    @JsonProperty(JSON_PROPERTY_FIRST_SEEN_TIMESTAMP) Long firstSeenTimestamp, 
    @JsonProperty(JSON_PROPERTY_LAST_UPDATED_TIMESTAMP) Long lastUpdatedTimestamp, 
    @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES) List<ManagementZone> managementZones, 
    @JsonProperty(JSON_PROPERTY_CVE_IDS) List<String> cveIds
  ) {
  this();
    this.securityProblemId = securityProblemId;
    this.displayId = displayId;
    this.status = status;
    this.muted = muted;
    this.externalVulnerabilityId = externalVulnerabilityId;
    this.vulnerabilityType = vulnerabilityType;
    this.title = title;
    this.packageName = packageName;
    this.url = url;
    this.technology = technology;
    this.firstSeenTimestamp = firstSeenTimestamp;
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    this.managementZones = managementZones;
    this.cveIds = cveIds;
  }

   /**
   * The ID of the security problem.
   * @return securityProblemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the security problem.")
  @JsonProperty(JSON_PROPERTY_SECURITY_PROBLEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecurityProblemId() {
    return securityProblemId;
  }




   /**
   * The display ID of the security problem.
   * @return displayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display ID of the security problem.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayId() {
    return displayId;
  }




   /**
   * The status of the security problem.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the security problem.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * The security problem is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) muted.
   * @return muted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The security problem is (`true`) or is not (`false`) muted.")
  @JsonProperty(JSON_PROPERTY_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMuted() {
    return muted;
  }




   /**
   * The external vulnerability ID of the security problem.
   * @return externalVulnerabilityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The external vulnerability ID of the security problem.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_VULNERABILITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalVulnerabilityId() {
    return externalVulnerabilityId;
  }




   /**
   * The type of the vulnerability.
   * @return vulnerabilityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the vulnerability.")
  @JsonProperty(JSON_PROPERTY_VULNERABILITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VulnerabilityTypeEnum getVulnerabilityType() {
    return vulnerabilityType;
  }




   /**
   * The title of the security problem.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the security problem.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }




   /**
   * The package name of the security problem.
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The package name of the security problem.")
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageName() {
    return packageName;
  }




   /**
   * The URL to the security problem details page.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to the security problem details page.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




   /**
   * The technology of the security problem.
   * @return technology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The technology of the security problem.")
  @JsonProperty(JSON_PROPERTY_TECHNOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TechnologyEnum getTechnology() {
    return technology;
  }




   /**
   * The timestamp of the first occurrence of the security problem.
   * @return firstSeenTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the first occurrence of the security problem.")
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFirstSeenTimestamp() {
    return firstSeenTimestamp;
  }




   /**
   * The timestamp of the most recent security problem change.
   * @return lastUpdatedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the most recent security problem change.")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }




  public SecurityProblem riskAssessment(RiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
    return this;
  }

   /**
   * Get riskAssessment
   * @return riskAssessment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RiskAssessment getRiskAssessment() {
    return riskAssessment;
  }


  @JsonProperty(JSON_PROPERTY_RISK_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskAssessment(RiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
  }


   /**
   * A list of management zones which the affected entities belong to.
   * @return managementZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of management zones which the affected entities belong to.")
  @JsonProperty(JSON_PROPERTY_MANAGEMENT_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ManagementZone> getManagementZones() {
    return managementZones;
  }




   /**
   * A list of CVE IDs of the security problem.
   * @return cveIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of CVE IDs of the security problem.")
  @JsonProperty(JSON_PROPERTY_CVE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCveIds() {
    return cveIds;
  }




  public SecurityProblem codeLevelVulnerabilityDetails(CodeLevelVulnerabilityDetails codeLevelVulnerabilityDetails) {
    this.codeLevelVulnerabilityDetails = codeLevelVulnerabilityDetails;
    return this;
  }

   /**
   * Get codeLevelVulnerabilityDetails
   * @return codeLevelVulnerabilityDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE_LEVEL_VULNERABILITY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CodeLevelVulnerabilityDetails getCodeLevelVulnerabilityDetails() {
    return codeLevelVulnerabilityDetails;
  }


  @JsonProperty(JSON_PROPERTY_CODE_LEVEL_VULNERABILITY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeLevelVulnerabilityDetails(CodeLevelVulnerabilityDetails codeLevelVulnerabilityDetails) {
    this.codeLevelVulnerabilityDetails = codeLevelVulnerabilityDetails;
  }


  /**
   * Return true if this SecurityProblem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityProblem securityProblem = (SecurityProblem) o;
    return Objects.equals(this.securityProblemId, securityProblem.securityProblemId) &&
        Objects.equals(this.displayId, securityProblem.displayId) &&
        Objects.equals(this.status, securityProblem.status) &&
        Objects.equals(this.muted, securityProblem.muted) &&
        Objects.equals(this.externalVulnerabilityId, securityProblem.externalVulnerabilityId) &&
        Objects.equals(this.vulnerabilityType, securityProblem.vulnerabilityType) &&
        Objects.equals(this.title, securityProblem.title) &&
        Objects.equals(this.packageName, securityProblem.packageName) &&
        Objects.equals(this.url, securityProblem.url) &&
        Objects.equals(this.technology, securityProblem.technology) &&
        Objects.equals(this.firstSeenTimestamp, securityProblem.firstSeenTimestamp) &&
        Objects.equals(this.lastUpdatedTimestamp, securityProblem.lastUpdatedTimestamp) &&
        Objects.equals(this.riskAssessment, securityProblem.riskAssessment) &&
        Objects.equals(this.managementZones, securityProblem.managementZones) &&
        Objects.equals(this.cveIds, securityProblem.cveIds) &&
        Objects.equals(this.codeLevelVulnerabilityDetails, securityProblem.codeLevelVulnerabilityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityProblemId, displayId, status, muted, externalVulnerabilityId, vulnerabilityType, title, packageName, url, technology, firstSeenTimestamp, lastUpdatedTimestamp, riskAssessment, managementZones, cveIds, codeLevelVulnerabilityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityProblem {\n");
    sb.append("    securityProblemId: ").append(toIndentedString(securityProblemId)).append("\n");
    sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    externalVulnerabilityId: ").append(toIndentedString(externalVulnerabilityId)).append("\n");
    sb.append("    vulnerabilityType: ").append(toIndentedString(vulnerabilityType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    firstSeenTimestamp: ").append(toIndentedString(firstSeenTimestamp)).append("\n");
    sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
    sb.append("    riskAssessment: ").append(toIndentedString(riskAssessment)).append("\n");
    sb.append("    managementZones: ").append(toIndentedString(managementZones)).append("\n");
    sb.append("    cveIds: ").append(toIndentedString(cveIds)).append("\n");
    sb.append("    codeLevelVulnerabilityDetails: ").append(toIndentedString(codeLevelVulnerabilityDetails)).append("\n");
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

