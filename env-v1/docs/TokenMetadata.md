

# TokenMetadata

Metadata of a token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the token. |  [optional] [readonly] |
|**name** | **String** | The name of the token. |  [optional] |
|**userId** | **String** | The owner of the token. |  [optional] [readonly] |
|**revoked** | **Boolean** | Revocation status of the token. Revoked tokens are disabled. |  [optional] |
|**created** | **Long** | The creation time as a unix timestamp in milliseconds. |  [optional] [readonly] |
|**expires** | **Long** | The expiration time as a unix timestamp in milliseconds. |  [optional] |
|**lastUse** | **Long** | The unix timestamp in milliseconds when the token was last used. |  [optional] [readonly] |
|**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) | A list of scopes assigned to the token. |  |
|**personalAccessToken** | **Boolean** | The token is a [personal access token](https://dt-url.net/wm03sop) (&#x60;true&#x60;) or an API token (&#x60;false&#x60;). |  [optional] [readonly] |



## Enum: List&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| ACTIVEGATECERTMANAGEMENT | &quot;ActiveGateCertManagement&quot; |
| ADVANCEDSYNTHETICINTEGRATION | &quot;AdvancedSyntheticIntegration&quot; |
| APPMONINTEGRATION | &quot;AppMonIntegration&quot; |
| CAPTUREREQUESTDATA | &quot;CaptureRequestData&quot; |
| DTAQLACCESS | &quot;DTAQLAccess&quot; |
| DATAEXPORT | &quot;DataExport&quot; |
| DATAIMPORT | &quot;DataImport&quot; |
| DATAPRIVACY | &quot;DataPrivacy&quot; |
| DAVIS | &quot;Davis&quot; |
| DIAGNOSTICEXPORT | &quot;DiagnosticExport&quot; |
| DSSFILEMANAGEMENT | &quot;DssFileManagement&quot; |
| EXTERNALSYNTHETICINTEGRATION | &quot;ExternalSyntheticIntegration&quot; |
| INSTALLERDOWNLOAD | &quot;InstallerDownload&quot; |
| LOGEXPORT | &quot;LogExport&quot; |
| MEMORYDUMP | &quot;MemoryDump&quot; |
| MOBILE | &quot;Mobile&quot; |
| PLUGINUPLOAD | &quot;PluginUpload&quot; |
| READCONFIG | &quot;ReadConfig&quot; |
| READSYNTHETICDATA | &quot;ReadSyntheticData&quot; |
| RESTREQUESTFORWARDING | &quot;RestRequestForwarding&quot; |
| RUMBROWSEREXTENSION | &quot;RumBrowserExtension&quot; |
| RUMJAVASCRIPTTAGMANAGEMENT | &quot;RumJavaScriptTagManagement&quot; |
| SUPPORTALERT | &quot;SupportAlert&quot; |
| TENANTTOKENMANAGEMENT | &quot;TenantTokenManagement&quot; |
| USERSESSIONANONYMIZATION | &quot;UserSessionAnonymization&quot; |
| VIEWDASHBOARD | &quot;ViewDashboard&quot; |
| VIEWREPORT | &quot;ViewReport&quot; |
| WRITECONFIG | &quot;WriteConfig&quot; |
| WRITESYNTHETICDATA | &quot;WriteSyntheticData&quot; |
| ACTIVEGATETOKENMANAGEMENT_CREATE | &quot;activeGateTokenManagement.create&quot; |
| ACTIVEGATETOKENMANAGEMENT_READ | &quot;activeGateTokenManagement.read&quot; |
| ACTIVEGATETOKENMANAGEMENT_WRITE | &quot;activeGateTokenManagement.write&quot; |
| ACTIVEGATES_READ | &quot;activeGates.read&quot; |
| ACTIVEGATES_WRITE | &quot;activeGates.write&quot; |
| APITOKENS_READ | &quot;apiTokens.read&quot; |
| APITOKENS_WRITE | &quot;apiTokens.write&quot; |
| AUDITLOGS_READ | &quot;auditLogs.read&quot; |
| CREDENTIALVAULT_READ | &quot;credentialVault.read&quot; |
| CREDENTIALVAULT_WRITE | &quot;credentialVault.write&quot; |
| ENTITIES_READ | &quot;entities.read&quot; |
| ENTITIES_WRITE | &quot;entities.write&quot; |
| EVENTS_INGEST | &quot;events.ingest&quot; |
| EVENTS_READ | &quot;events.read&quot; |
| EXTENSIONCONFIGURATIONS_READ | &quot;extensionConfigurations.read&quot; |
| EXTENSIONCONFIGURATIONS_WRITE | &quot;extensionConfigurations.write&quot; |
| EXTENSIONENVIRONMENT_READ | &quot;extensionEnvironment.read&quot; |
| EXTENSIONENVIRONMENT_WRITE | &quot;extensionEnvironment.write&quot; |
| EXTENSIONS_READ | &quot;extensions.read&quot; |
| EXTENSIONS_WRITE | &quot;extensions.write&quot; |
| GEOGRAPHICREGIONS_READ | &quot;geographicRegions.read&quot; |
| HUB_READ | &quot;hub.read&quot; |
| HUB_WRITE | &quot;hub.write&quot; |
| LOGS_INGEST | &quot;logs.ingest&quot; |
| LOGS_READ | &quot;logs.read&quot; |
| METRICS_INGEST | &quot;metrics.ingest&quot; |
| METRICS_READ | &quot;metrics.read&quot; |
| METRICS_WRITE | &quot;metrics.write&quot; |
| NETWORKZONES_READ | &quot;networkZones.read&quot; |
| NETWORKZONES_WRITE | &quot;networkZones.write&quot; |
| ONEAGENTS_READ | &quot;oneAgents.read&quot; |
| ONEAGENTS_WRITE | &quot;oneAgents.write&quot; |
| OPENTELEMETRYTRACE_INGEST | &quot;openTelemetryTrace.ingest&quot; |
| PROBLEMS_READ | &quot;problems.read&quot; |
| PROBLEMS_WRITE | &quot;problems.write&quot; |
| RELEASES_READ | &quot;releases.read&quot; |
| SECURITYPROBLEMS_READ | &quot;securityProblems.read&quot; |
| SECURITYPROBLEMS_WRITE | &quot;securityProblems.write&quot; |
| SETTINGS_READ | &quot;settings.read&quot; |
| SETTINGS_WRITE | &quot;settings.write&quot; |
| SLO_READ | &quot;slo.read&quot; |
| SLO_WRITE | &quot;slo.write&quot; |
| SYNTHETICEXECUTIONS_READ | &quot;syntheticExecutions.read&quot; |
| SYNTHETICEXECUTIONS_WRITE | &quot;syntheticExecutions.write&quot; |
| SYNTHETICLOCATIONS_READ | &quot;syntheticLocations.read&quot; |
| SYNTHETICLOCATIONS_WRITE | &quot;syntheticLocations.write&quot; |
| TENANTTOKENROTATION_WRITE | &quot;tenantTokenRotation.write&quot; |
| TRACES_LOOKUP | &quot;traces.lookup&quot; |



