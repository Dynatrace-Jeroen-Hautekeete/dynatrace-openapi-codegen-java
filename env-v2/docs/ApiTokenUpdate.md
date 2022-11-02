

# ApiTokenUpdate

The update of the API token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the token. |  [optional] |
|**enabled** | **Boolean** | The token is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;) |  [optional] |
|**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | The list of scopes assigned to the token.   Apart from the new scopes, you need to submit the existing scopes you want to keep, too. Any existing scope, missing in the payload, is removed.  * &#x60;InstallerDownload&#x60;: PaaS integration - Installer download.  * &#x60;DataExport&#x60;: Access problem and event feed, metrics, and topology.  * &#x60;PluginUpload&#x60;: Upload Extension.  * &#x60;SupportAlert&#x60;: PaaS integration - Support alert.  * &#x60;AdvancedSyntheticIntegration&#x60;: Dynatrace module integration - Synthetic Classic.  * &#x60;ExternalSyntheticIntegration&#x60;: Create and read synthetic monitors, locations, and nodes.  * &#x60;AppMonIntegration&#x60;: Dynatrace module integration - AppMon.  * &#x60;RumBrowserExtension&#x60;: RUM Browser Extension.  * &#x60;LogExport&#x60;: Read logs.  * &#x60;ReadConfig&#x60;: Read configuration.  * &#x60;WriteConfig&#x60;: Write configuration.  * &#x60;DTAQLAccess&#x60;: User sessions.  * &#x60;UserSessionAnonymization&#x60;: Anonymize user session data for data privacy reasons.  * &#x60;DataPrivacy&#x60;: Change data privacy settings.  * &#x60;CaptureRequestData&#x60;: Capture request data.  * &#x60;Davis&#x60;: Dynatrace module integration - Davis.  * &#x60;DssFileManagement&#x60;: Mobile symbolication file management.  * &#x60;RumJavaScriptTagManagement&#x60;: Real user monitoring JavaScript tag management.  * &#x60;TenantTokenManagement&#x60;: Token management.  * &#x60;ActiveGateCertManagement&#x60;: ActiveGate certificate management.  * &#x60;RestRequestForwarding&#x60;: Fetch data from a remote environment.  * &#x60;ReadSyntheticData&#x60;: Read synthetic monitors, locations, and nodes.  * &#x60;DataImport&#x60;: Data ingest, e.g.: metrics and events.  * &#x60;syntheticExecutions.write&#x60;: Write synthetic monitor executions.  * &#x60;syntheticExecutions.read&#x60;: Read synthetic monitor execution results.  * &#x60;auditLogs.read&#x60;: Read audit logs.  * &#x60;metrics.read&#x60;: Read metrics.  * &#x60;metrics.write&#x60;: Write metrics.  * &#x60;entities.read&#x60;: Read entities.  * &#x60;entities.write&#x60;: Write entities.  * &#x60;problems.read&#x60;: Read problems.  * &#x60;problems.write&#x60;: Write problems.  * &#x60;events.read&#x60;: Read events.  * &#x60;events.ingest&#x60;: Ingest events.  * &#x60;networkZones.read&#x60;: Read network zones.  * &#x60;networkZones.write&#x60;: Write network zones.  * &#x60;activeGates.read&#x60;: Read ActiveGates.  * &#x60;activeGates.write&#x60;: Write ActiveGates.  * &#x60;activeGateTokenManagement.read&#x60;: Read ActiveGate tokens.  * &#x60;activeGateTokenManagement.create&#x60;: Create ActiveGate tokens.  * &#x60;activeGateTokenManagement.write&#x60;: Write ActiveGate tokens.  * &#x60;credentialVault.read&#x60;: Read credential vault entries.  * &#x60;credentialVault.write&#x60;: Write credential vault entries.  * &#x60;extensions.read&#x60;: Read extensions.  * &#x60;extensions.write&#x60;: Write extensions.  * &#x60;extensionConfigurations.read&#x60;: Read extension monitoring configurations.  * &#x60;extensionConfigurations.write&#x60;: Write extension monitoring configurations.  * &#x60;extensionEnvironment.read&#x60;: Read extension environment configurations.  * &#x60;extensionEnvironment.write&#x60;: Write extension environment configurations.  * &#x60;metrics.ingest&#x60;: Ingest metrics.  * &#x60;securityProblems.read&#x60;: Read security problems.  * &#x60;securityProblems.write&#x60;: Write security problems.  * &#x60;syntheticLocations.read&#x60;: Read synthetic locations.  * &#x60;syntheticLocations.write&#x60;: Write synthetic locations.  * &#x60;settings.read&#x60;: Read settings.  * &#x60;settings.write&#x60;: Write settings.  * &#x60;tenantTokenRotation.write&#x60;: Tenant token rotation.  * &#x60;slo.read&#x60;: Read SLO.  * &#x60;slo.write&#x60;: Write SLO.  * &#x60;releases.read&#x60;: Read releases.  * &#x60;apiTokens.read&#x60;: Read API tokens.  * &#x60;apiTokens.write&#x60;: Write API tokens.  * &#x60;openTelemetryTrace.ingest&#x60;: Ingest OpenTelemetry traces.  * &#x60;logs.read&#x60;: Read logs.  * &#x60;logs.ingest&#x60;: Ingest logs.  * &#x60;geographicRegions.read&#x60;: Read Geographic regions.  * &#x60;hub.read&#x60;: Read Hub related data.  * &#x60;oneAgents.read&#x60;: Read OneAgents.  * &#x60;oneAgents.write&#x60;: Write OneAgents.  * &#x60;traces.lookup&#x60;: Look up a single trace.  * &#x60;hub.write&#x60;: Write Hub related data.   |  [optional] |



## Enum: List&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| INSTALLERDOWNLOAD | &quot;InstallerDownload&quot; |
| DATAEXPORT | &quot;DataExport&quot; |
| PLUGINUPLOAD | &quot;PluginUpload&quot; |
| SUPPORTALERT | &quot;SupportAlert&quot; |
| ADVANCEDSYNTHETICINTEGRATION | &quot;AdvancedSyntheticIntegration&quot; |
| EXTERNALSYNTHETICINTEGRATION | &quot;ExternalSyntheticIntegration&quot; |
| APPMONINTEGRATION | &quot;AppMonIntegration&quot; |
| RUMBROWSEREXTENSION | &quot;RumBrowserExtension&quot; |
| LOGEXPORT | &quot;LogExport&quot; |
| READCONFIG | &quot;ReadConfig&quot; |
| WRITECONFIG | &quot;WriteConfig&quot; |
| DTAQLACCESS | &quot;DTAQLAccess&quot; |
| USERSESSIONANONYMIZATION | &quot;UserSessionAnonymization&quot; |
| DATAPRIVACY | &quot;DataPrivacy&quot; |
| CAPTUREREQUESTDATA | &quot;CaptureRequestData&quot; |
| DAVIS | &quot;Davis&quot; |
| DSSFILEMANAGEMENT | &quot;DssFileManagement&quot; |
| RUMJAVASCRIPTTAGMANAGEMENT | &quot;RumJavaScriptTagManagement&quot; |
| TENANTTOKENMANAGEMENT | &quot;TenantTokenManagement&quot; |
| ACTIVEGATECERTMANAGEMENT | &quot;ActiveGateCertManagement&quot; |
| RESTREQUESTFORWARDING | &quot;RestRequestForwarding&quot; |
| READSYNTHETICDATA | &quot;ReadSyntheticData&quot; |
| DATAIMPORT | &quot;DataImport&quot; |
| SYNTHETICEXECUTIONS_WRITE | &quot;syntheticExecutions.write&quot; |
| SYNTHETICEXECUTIONS_READ | &quot;syntheticExecutions.read&quot; |
| AUDITLOGS_READ | &quot;auditLogs.read&quot; |
| METRICS_READ | &quot;metrics.read&quot; |
| METRICS_WRITE | &quot;metrics.write&quot; |
| ENTITIES_READ | &quot;entities.read&quot; |
| ENTITIES_WRITE | &quot;entities.write&quot; |
| PROBLEMS_READ | &quot;problems.read&quot; |
| PROBLEMS_WRITE | &quot;problems.write&quot; |
| EVENTS_READ | &quot;events.read&quot; |
| EVENTS_INGEST | &quot;events.ingest&quot; |
| NETWORKZONES_READ | &quot;networkZones.read&quot; |
| NETWORKZONES_WRITE | &quot;networkZones.write&quot; |
| ACTIVEGATES_READ | &quot;activeGates.read&quot; |
| ACTIVEGATES_WRITE | &quot;activeGates.write&quot; |
| ACTIVEGATETOKENMANAGEMENT_READ | &quot;activeGateTokenManagement.read&quot; |
| ACTIVEGATETOKENMANAGEMENT_CREATE | &quot;activeGateTokenManagement.create&quot; |
| ACTIVEGATETOKENMANAGEMENT_WRITE | &quot;activeGateTokenManagement.write&quot; |
| CREDENTIALVAULT_READ | &quot;credentialVault.read&quot; |
| CREDENTIALVAULT_WRITE | &quot;credentialVault.write&quot; |
| EXTENSIONS_READ | &quot;extensions.read&quot; |
| EXTENSIONS_WRITE | &quot;extensions.write&quot; |
| EXTENSIONCONFIGURATIONS_READ | &quot;extensionConfigurations.read&quot; |
| EXTENSIONCONFIGURATIONS_WRITE | &quot;extensionConfigurations.write&quot; |
| EXTENSIONENVIRONMENT_READ | &quot;extensionEnvironment.read&quot; |
| EXTENSIONENVIRONMENT_WRITE | &quot;extensionEnvironment.write&quot; |
| METRICS_INGEST | &quot;metrics.ingest&quot; |
| SECURITYPROBLEMS_READ | &quot;securityProblems.read&quot; |
| SECURITYPROBLEMS_WRITE | &quot;securityProblems.write&quot; |
| SYNTHETICLOCATIONS_READ | &quot;syntheticLocations.read&quot; |
| SYNTHETICLOCATIONS_WRITE | &quot;syntheticLocations.write&quot; |
| SETTINGS_READ | &quot;settings.read&quot; |
| SETTINGS_WRITE | &quot;settings.write&quot; |
| TENANTTOKENROTATION_WRITE | &quot;tenantTokenRotation.write&quot; |
| SLO_READ | &quot;slo.read&quot; |
| SLO_WRITE | &quot;slo.write&quot; |
| RELEASES_READ | &quot;releases.read&quot; |
| APITOKENS_READ | &quot;apiTokens.read&quot; |
| APITOKENS_WRITE | &quot;apiTokens.write&quot; |
| OPENTELEMETRYTRACE_INGEST | &quot;openTelemetryTrace.ingest&quot; |
| LOGS_READ | &quot;logs.read&quot; |
| LOGS_INGEST | &quot;logs.ingest&quot; |
| GEOGRAPHICREGIONS_READ | &quot;geographicRegions.read&quot; |
| HUB_READ | &quot;hub.read&quot; |
| ONEAGENTS_READ | &quot;oneAgents.read&quot; |
| ONEAGENTS_WRITE | &quot;oneAgents.write&quot; |
| TRACES_LOOKUP | &quot;traces.lookup&quot; |
| HUB_WRITE | &quot;hub.write&quot; |



