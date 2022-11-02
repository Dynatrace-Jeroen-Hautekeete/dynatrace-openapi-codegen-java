

# HostAutoUpdateConfig

Configuration of OneAgent auto-update.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The Dynatrace entity ID of the host where OneAgent is deployed. |  [optional] [readonly] |
|**setting** | [**SettingEnum**](#SettingEnum) | The auto-update state of OneAgents on the host:   * &#x60;ENABLED&#x60;: OneAgent automatically updates to the most recent version.  * &#x60;DISABLED&#x60;: OneAgent updates to the version specified in the **version** field. * &#x60;INHERITED&#x60;: The setting from the host group (if the host is a member of a host group) or the environment-wide configuration (if the host doesn&#39;t belong to a host group) is used. |  |
|**version** | **String** | The version to which the OneAgent must be updated.   Specify the version in the &#x60;&lt;major&gt;.&lt;minor&gt;.&lt;revision&gt;.&lt;timestamp&gt;&#x60; format (for example &#x60;1.191.0.20200326-161115&#x60;). You can fetch the list of available versions with the [GET available versions](https://dt-url.net/fo23rb5) call.   If no suitable installer is found for the provided version or the value is set to &#x60;null&#x60;, OneAgent won&#39;t be updated.   Only applicable when the **effectiveSetting** value is &#x60;DISABLED&#x60;.   If the **setting** parameter is set to &#x60;INHERITED&#x60; but the **version** is still set, it will result in a one-time update: OneAgent will be updated to the specified version and the **version** value will be set to &#x60;null&#x60;. For further updates the parent setting will be used. |  [optional] |
|**updateWindows** | [**UpdateWindowsConfig**](UpdateWindowsConfig.md) |  |  [optional] |
|**effectiveSetting** | [**EffectiveSettingEnum**](#EffectiveSettingEnum) | The actual state of the auto-update on the host.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case the value is taken from the host group or the environment-wide configuration. |  [optional] [readonly] |
|**effectiveVersion** | **String** | The actual version to which the OneAgent must be updated.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60; and the **version** parameter is set to &#x60;null&#x60;. In that case the value is taken from the host group or the environment-wide configuration. |  [optional] [readonly] |



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



