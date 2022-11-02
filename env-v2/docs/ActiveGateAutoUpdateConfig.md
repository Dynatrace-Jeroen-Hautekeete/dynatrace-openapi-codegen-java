

# ActiveGateAutoUpdateConfig

Configuration of the ActiveGate auto-updates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**setting** | [**SettingEnum**](#SettingEnum) | The state of the ActiveGate auto-update: enabled, disabled, or inherited.   If set to &#x60;INHERITED&#x60;, the setting is inherited from the global configuration set on the environment or Managed cluster level. |  |
|**effectiveSetting** | [**EffectiveSettingEnum**](#EffectiveSettingEnum) | The actual state of the ActiveGate auto-update.   Applicable only if the **setting** parameter is set to &#x60;INHERITED&#x60;. In that case, the value is taken from the parent setting. Otherwise, it&#39;s just a duplicate of the **setting** value. |  [optional] [readonly] |



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



