

# EnvironmentAutoUpdateConfig

Environment-wide configuration of OneAgents auto-updates.   Applies to all OneAgents connecting to the environment if their **setting** parameter is set to `INHERITED`. Otherwise, the host group or host level setting applies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**setting** | [**SettingEnum**](#SettingEnum) | The auto-update state of OneAgents connecting to the environment:   * &#x60;ENABLED&#x60;: OneAgents automatically update to the most recent version.  * &#x60;DISABLED&#x60;: OneAgents update to the version specified in the **version** field.  OneAgents that connect to the environment use this configuration only when their **setting** parameter is set to &#x60;INHERITED&#x60;. |  |
|**version** | **String** | The version to which the OneAgent must be updated.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example &#x60;1.181.0&#x60;) or &#x60;&lt;major&gt;.&lt;minor&gt;&#x60; format (for example &#x60;1.181&#x60;). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. If no suitable installer is found for the provided version or the value is set to &#x60;null&#x60;, OneAgent won&#39;t be updated.   Only applicable when the **setting** parameter is set to &#x60;DISABLED&#x60;. |  [optional] |
|**updateWindows** | [**UpdateWindowsConfig**](UpdateWindowsConfig.md) |  |  [optional] |



## Enum: SettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |



