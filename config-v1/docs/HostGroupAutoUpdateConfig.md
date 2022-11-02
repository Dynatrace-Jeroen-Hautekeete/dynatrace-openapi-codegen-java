

# HostGroupAutoUpdateConfig

Configuration of OneAgent auto-update in a host group.   Applies to all OneAgents installed on hosts of the host group if their **setting** parameter is set to `INHERITED`. Otherwise, the host level setting applies.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The Dynatrace entity ID of the host group. |  [optional] [readonly] |
|**setting** | [**SettingEnum**](#SettingEnum) | The auto-update state of OneAgents in a host group:   * &#x60;ENABLED&#x60;: OneAgents automatically update to the most recent version.  * &#x60;DISABLED&#x60;: OneAgents update to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the environment-wide configuration is used.  OneAgents installed on hosts of the host group use this configuration only when their **setting** parameter is set to &#x60;INHERITED&#x60;. |  |
|**version** | **String** | The version to which the OneAgent must be updated.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;&#x60; format (for example &#x60;1.181.0&#x60;) or &#x60;&lt;major&gt;.&lt;minor&gt;&#x60; format (for example &#x60;1.181&#x60;). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call. If no suitable installer is found for the provided version or the value is set to &#x60;null&#x60;, OneAgent won&#39;t be updated.   Only applicable when the **setting** parameter is set to &#x60;DISABLED&#x60;. |  [optional] |
|**updateWindows** | [**UpdateWindowsConfig**](UpdateWindowsConfig.md) |  |  [optional] |
|**effectiveSetting** | [**EffectiveSettingEnum**](#EffectiveSettingEnum) | The actual state of the auto-update on the hosts in a host group.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the environment-wide setting. |  [optional] [readonly] |
|**effectiveVersion** | **String** | The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the environment-wide setting. |  [optional] [readonly] |



## Enum: SettingEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| INHERITED | &quot;INHERITED&quot; |



## Enum: EffectiveSettingEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;ENABLED&quot; |
| DISABLED | &quot;DISABLED&quot; |



