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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Parameters of a new API token.
 */
@ApiModel(description = "Parameters of a new API token.")
@JsonPropertyOrder({
  ApiTokenCreate.JSON_PROPERTY_PERSONAL_ACCESS_TOKEN,
  ApiTokenCreate.JSON_PROPERTY_EXPIRATION_DATE,
  ApiTokenCreate.JSON_PROPERTY_NAME,
  ApiTokenCreate.JSON_PROPERTY_SCOPES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-02T15:08:06.080821500+01:00[Europe/Brussels]")
public class ApiTokenCreate {
  public static final String JSON_PROPERTY_PERSONAL_ACCESS_TOKEN = "personalAccessToken";
  private Boolean personalAccessToken;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets scopes
   */
  public enum ScopesEnum {
    INSTALLERDOWNLOAD("InstallerDownload"),
    
    DATAEXPORT("DataExport"),
    
    PLUGINUPLOAD("PluginUpload"),
    
    SUPPORTALERT("SupportAlert"),
    
    ADVANCEDSYNTHETICINTEGRATION("AdvancedSyntheticIntegration"),
    
    EXTERNALSYNTHETICINTEGRATION("ExternalSyntheticIntegration"),
    
    APPMONINTEGRATION("AppMonIntegration"),
    
    RUMBROWSEREXTENSION("RumBrowserExtension"),
    
    LOGEXPORT("LogExport"),
    
    READCONFIG("ReadConfig"),
    
    WRITECONFIG("WriteConfig"),
    
    DTAQLACCESS("DTAQLAccess"),
    
    USERSESSIONANONYMIZATION("UserSessionAnonymization"),
    
    DATAPRIVACY("DataPrivacy"),
    
    CAPTUREREQUESTDATA("CaptureRequestData"),
    
    DAVIS("Davis"),
    
    DSSFILEMANAGEMENT("DssFileManagement"),
    
    RUMJAVASCRIPTTAGMANAGEMENT("RumJavaScriptTagManagement"),
    
    TENANTTOKENMANAGEMENT("TenantTokenManagement"),
    
    ACTIVEGATECERTMANAGEMENT("ActiveGateCertManagement"),
    
    RESTREQUESTFORWARDING("RestRequestForwarding"),
    
    READSYNTHETICDATA("ReadSyntheticData"),
    
    DATAIMPORT("DataImport"),
    
    SYNTHETICEXECUTIONS_WRITE("syntheticExecutions.write"),
    
    SYNTHETICEXECUTIONS_READ("syntheticExecutions.read"),
    
    AUDITLOGS_READ("auditLogs.read"),
    
    METRICS_READ("metrics.read"),
    
    METRICS_WRITE("metrics.write"),
    
    ENTITIES_READ("entities.read"),
    
    ENTITIES_WRITE("entities.write"),
    
    PROBLEMS_READ("problems.read"),
    
    PROBLEMS_WRITE("problems.write"),
    
    EVENTS_READ("events.read"),
    
    EVENTS_INGEST("events.ingest"),
    
    NETWORKZONES_READ("networkZones.read"),
    
    NETWORKZONES_WRITE("networkZones.write"),
    
    ACTIVEGATES_READ("activeGates.read"),
    
    ACTIVEGATES_WRITE("activeGates.write"),
    
    ACTIVEGATETOKENMANAGEMENT_READ("activeGateTokenManagement.read"),
    
    ACTIVEGATETOKENMANAGEMENT_CREATE("activeGateTokenManagement.create"),
    
    ACTIVEGATETOKENMANAGEMENT_WRITE("activeGateTokenManagement.write"),
    
    CREDENTIALVAULT_READ("credentialVault.read"),
    
    CREDENTIALVAULT_WRITE("credentialVault.write"),
    
    EXTENSIONS_READ("extensions.read"),
    
    EXTENSIONS_WRITE("extensions.write"),
    
    EXTENSIONCONFIGURATIONS_READ("extensionConfigurations.read"),
    
    EXTENSIONCONFIGURATIONS_WRITE("extensionConfigurations.write"),
    
    EXTENSIONENVIRONMENT_READ("extensionEnvironment.read"),
    
    EXTENSIONENVIRONMENT_WRITE("extensionEnvironment.write"),
    
    METRICS_INGEST("metrics.ingest"),
    
    SECURITYPROBLEMS_READ("securityProblems.read"),
    
    SECURITYPROBLEMS_WRITE("securityProblems.write"),
    
    SYNTHETICLOCATIONS_READ("syntheticLocations.read"),
    
    SYNTHETICLOCATIONS_WRITE("syntheticLocations.write"),
    
    SETTINGS_READ("settings.read"),
    
    SETTINGS_WRITE("settings.write"),
    
    TENANTTOKENROTATION_WRITE("tenantTokenRotation.write"),
    
    SLO_READ("slo.read"),
    
    SLO_WRITE("slo.write"),
    
    RELEASES_READ("releases.read"),
    
    APITOKENS_READ("apiTokens.read"),
    
    APITOKENS_WRITE("apiTokens.write"),
    
    OPENTELEMETRYTRACE_INGEST("openTelemetryTrace.ingest"),
    
    LOGS_READ("logs.read"),
    
    LOGS_INGEST("logs.ingest"),
    
    GEOGRAPHICREGIONS_READ("geographicRegions.read"),
    
    HUB_READ("hub.read"),
    
    ONEAGENTS_READ("oneAgents.read"),
    
    ONEAGENTS_WRITE("oneAgents.write"),
    
    TRACES_LOOKUP("traces.lookup"),
    
    HUB_WRITE("hub.write");

    private String value;

    ScopesEnum(String value) {
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
    public static ScopesEnum fromValue(String value) {
      for (ScopesEnum b : ScopesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<ScopesEnum> scopes = new ArrayList<>();

  public ApiTokenCreate() { 
  }

  public ApiTokenCreate personalAccessToken(Boolean personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
    return this;
  }

   /**
   * The token is a personal access token (&#x60;true&#x60;) or an API token (&#x60;false&#x60;).    Personal access tokens are tied to the permissions of their owner.
   * @return personalAccessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The token is a personal access token (`true`) or an API token (`false`).    Personal access tokens are tied to the permissions of their owner.")
  @JsonProperty(JSON_PROPERTY_PERSONAL_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPersonalAccessToken() {
    return personalAccessToken;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAL_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalAccessToken(Boolean personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
  }


  public ApiTokenCreate expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the token.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the token never expires.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "now+14d", value = "The expiration date of the token.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the token never expires.")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public ApiTokenCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the token.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tokenName", required = true, value = "The name of the token.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiTokenCreate scopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ApiTokenCreate addScopesItem(ScopesEnum scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A list of the scopes to be assigned to the token.  * &#x60;InstallerDownload&#x60;: PaaS integration - Installer download.  * &#x60;DataExport&#x60;: Access problem and event feed, metrics, and topology.  * &#x60;PluginUpload&#x60;: Upload Extension.  * &#x60;SupportAlert&#x60;: PaaS integration - Support alert.  * &#x60;AdvancedSyntheticIntegration&#x60;: Dynatrace module integration - Synthetic Classic.  * &#x60;ExternalSyntheticIntegration&#x60;: Create and read synthetic monitors, locations, and nodes.  * &#x60;AppMonIntegration&#x60;: Dynatrace module integration - AppMon.  * &#x60;RumBrowserExtension&#x60;: RUM Browser Extension.  * &#x60;LogExport&#x60;: Read logs.  * &#x60;ReadConfig&#x60;: Read configuration.  * &#x60;WriteConfig&#x60;: Write configuration.  * &#x60;DTAQLAccess&#x60;: User sessions.  * &#x60;UserSessionAnonymization&#x60;: Anonymize user session data for data privacy reasons.  * &#x60;DataPrivacy&#x60;: Change data privacy settings.  * &#x60;CaptureRequestData&#x60;: Capture request data.  * &#x60;Davis&#x60;: Dynatrace module integration - Davis.  * &#x60;DssFileManagement&#x60;: Mobile symbolication file management.  * &#x60;RumJavaScriptTagManagement&#x60;: Real user monitoring JavaScript tag management.  * &#x60;TenantTokenManagement&#x60;: Token management.  * &#x60;ActiveGateCertManagement&#x60;: ActiveGate certificate management.  * &#x60;RestRequestForwarding&#x60;: Fetch data from a remote environment.  * &#x60;ReadSyntheticData&#x60;: Read synthetic monitors, locations, and nodes.  * &#x60;DataImport&#x60;: Data ingest, e.g.: metrics and events.  * &#x60;syntheticExecutions.write&#x60;: Write synthetic monitor executions.  * &#x60;syntheticExecutions.read&#x60;: Read synthetic monitor execution results.  * &#x60;auditLogs.read&#x60;: Read audit logs.  * &#x60;metrics.read&#x60;: Read metrics.  * &#x60;metrics.write&#x60;: Write metrics.  * &#x60;entities.read&#x60;: Read entities.  * &#x60;entities.write&#x60;: Write entities.  * &#x60;problems.read&#x60;: Read problems.  * &#x60;problems.write&#x60;: Write problems.  * &#x60;events.read&#x60;: Read events.  * &#x60;events.ingest&#x60;: Ingest events.  * &#x60;networkZones.read&#x60;: Read network zones.  * &#x60;networkZones.write&#x60;: Write network zones.  * &#x60;activeGates.read&#x60;: Read ActiveGates.  * &#x60;activeGates.write&#x60;: Write ActiveGates.  * &#x60;activeGateTokenManagement.read&#x60;: Read ActiveGate tokens.  * &#x60;activeGateTokenManagement.create&#x60;: Create ActiveGate tokens.  * &#x60;activeGateTokenManagement.write&#x60;: Write ActiveGate tokens.  * &#x60;credentialVault.read&#x60;: Read credential vault entries.  * &#x60;credentialVault.write&#x60;: Write credential vault entries.  * &#x60;extensions.read&#x60;: Read extensions.  * &#x60;extensions.write&#x60;: Write extensions.  * &#x60;extensionConfigurations.read&#x60;: Read extension monitoring configurations.  * &#x60;extensionConfigurations.write&#x60;: Write extension monitoring configurations.  * &#x60;extensionEnvironment.read&#x60;: Read extension environment configurations.  * &#x60;extensionEnvironment.write&#x60;: Write extension environment configurations.  * &#x60;metrics.ingest&#x60;: Ingest metrics.  * &#x60;securityProblems.read&#x60;: Read security problems.  * &#x60;securityProblems.write&#x60;: Write security problems.  * &#x60;syntheticLocations.read&#x60;: Read synthetic locations.  * &#x60;syntheticLocations.write&#x60;: Write synthetic locations.  * &#x60;settings.read&#x60;: Read settings.  * &#x60;settings.write&#x60;: Write settings.  * &#x60;tenantTokenRotation.write&#x60;: Tenant token rotation.  * &#x60;slo.read&#x60;: Read SLO.  * &#x60;slo.write&#x60;: Write SLO.  * &#x60;releases.read&#x60;: Read releases.  * &#x60;apiTokens.read&#x60;: Read API tokens.  * &#x60;apiTokens.write&#x60;: Write API tokens.  * &#x60;openTelemetryTrace.ingest&#x60;: Ingest OpenTelemetry traces.  * &#x60;logs.read&#x60;: Read logs.  * &#x60;logs.ingest&#x60;: Ingest logs.  * &#x60;geographicRegions.read&#x60;: Read Geographic regions.  * &#x60;hub.read&#x60;: Read Hub related data.  * &#x60;oneAgents.read&#x60;: Read OneAgents.  * &#x60;oneAgents.write&#x60;: Write OneAgents.  * &#x60;traces.lookup&#x60;: Look up a single trace.  * &#x60;hub.write&#x60;: Write Hub related data.  
   * @return scopes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the scopes to be assigned to the token.  * `InstallerDownload`: PaaS integration - Installer download.  * `DataExport`: Access problem and event feed, metrics, and topology.  * `PluginUpload`: Upload Extension.  * `SupportAlert`: PaaS integration - Support alert.  * `AdvancedSyntheticIntegration`: Dynatrace module integration - Synthetic Classic.  * `ExternalSyntheticIntegration`: Create and read synthetic monitors, locations, and nodes.  * `AppMonIntegration`: Dynatrace module integration - AppMon.  * `RumBrowserExtension`: RUM Browser Extension.  * `LogExport`: Read logs.  * `ReadConfig`: Read configuration.  * `WriteConfig`: Write configuration.  * `DTAQLAccess`: User sessions.  * `UserSessionAnonymization`: Anonymize user session data for data privacy reasons.  * `DataPrivacy`: Change data privacy settings.  * `CaptureRequestData`: Capture request data.  * `Davis`: Dynatrace module integration - Davis.  * `DssFileManagement`: Mobile symbolication file management.  * `RumJavaScriptTagManagement`: Real user monitoring JavaScript tag management.  * `TenantTokenManagement`: Token management.  * `ActiveGateCertManagement`: ActiveGate certificate management.  * `RestRequestForwarding`: Fetch data from a remote environment.  * `ReadSyntheticData`: Read synthetic monitors, locations, and nodes.  * `DataImport`: Data ingest, e.g.: metrics and events.  * `syntheticExecutions.write`: Write synthetic monitor executions.  * `syntheticExecutions.read`: Read synthetic monitor execution results.  * `auditLogs.read`: Read audit logs.  * `metrics.read`: Read metrics.  * `metrics.write`: Write metrics.  * `entities.read`: Read entities.  * `entities.write`: Write entities.  * `problems.read`: Read problems.  * `problems.write`: Write problems.  * `events.read`: Read events.  * `events.ingest`: Ingest events.  * `networkZones.read`: Read network zones.  * `networkZones.write`: Write network zones.  * `activeGates.read`: Read ActiveGates.  * `activeGates.write`: Write ActiveGates.  * `activeGateTokenManagement.read`: Read ActiveGate tokens.  * `activeGateTokenManagement.create`: Create ActiveGate tokens.  * `activeGateTokenManagement.write`: Write ActiveGate tokens.  * `credentialVault.read`: Read credential vault entries.  * `credentialVault.write`: Write credential vault entries.  * `extensions.read`: Read extensions.  * `extensions.write`: Write extensions.  * `extensionConfigurations.read`: Read extension monitoring configurations.  * `extensionConfigurations.write`: Write extension monitoring configurations.  * `extensionEnvironment.read`: Read extension environment configurations.  * `extensionEnvironment.write`: Write extension environment configurations.  * `metrics.ingest`: Ingest metrics.  * `securityProblems.read`: Read security problems.  * `securityProblems.write`: Write security problems.  * `syntheticLocations.read`: Read synthetic locations.  * `syntheticLocations.write`: Write synthetic locations.  * `settings.read`: Read settings.  * `settings.write`: Write settings.  * `tenantTokenRotation.write`: Tenant token rotation.  * `slo.read`: Read SLO.  * `slo.write`: Write SLO.  * `releases.read`: Read releases.  * `apiTokens.read`: Read API tokens.  * `apiTokens.write`: Write API tokens.  * `openTelemetryTrace.ingest`: Ingest OpenTelemetry traces.  * `logs.read`: Read logs.  * `logs.ingest`: Ingest logs.  * `geographicRegions.read`: Read Geographic regions.  * `hub.read`: Read Hub related data.  * `oneAgents.read`: Read OneAgents.  * `oneAgents.write`: Write OneAgents.  * `traces.lookup`: Look up a single trace.  * `hub.write`: Write Hub related data.  ")
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ScopesEnum> getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }


  /**
   * Return true if this ApiTokenCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTokenCreate apiTokenCreate = (ApiTokenCreate) o;
    return Objects.equals(this.personalAccessToken, apiTokenCreate.personalAccessToken) &&
        Objects.equals(this.expirationDate, apiTokenCreate.expirationDate) &&
        Objects.equals(this.name, apiTokenCreate.name) &&
        Objects.equals(this.scopes, apiTokenCreate.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalAccessToken, expirationDate, name, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTokenCreate {\n");
    sb.append("    personalAccessToken: ").append(toIndentedString(personalAccessToken)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
