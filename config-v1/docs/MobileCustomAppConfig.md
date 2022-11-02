

# MobileCustomAppConfig

Configuration of an existing mobile or custom application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | The Dynatrace entity ID of the application. |  [optional] [readonly] |
|**name** | **String** | The name of the application. |  |
|**applicationType** | [**ApplicationTypeEnum**](#ApplicationTypeEnum) | The type of the application. |  [optional] [readonly] |
|**applicationId** | **String** | The UUID of the application.  It is used only by OneAgent to send data to Dynatrace. |  [optional] [readonly] |
|**iconType** | [**IconTypeEnum**](#IconTypeEnum) | Custom application icon.  Mobile apps always use the mobile device icon, so this icon can only be set for custom apps. |  [optional] |
|**costControlUserSessionPercentage** | **Integer** | The percentage of user sessions to be analyzed. |  |
|**apdexSettings** | [**MobileCustomApdex**](MobileCustomApdex.md) |  |  |
|**optInModeEnabled** | **Boolean** | The opt-in mode is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).  This value is only applicable to mobile and not to custom apps. |  [optional] |
|**sessionReplayEnabled** | **Boolean** | The session replay is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). This value is only applicable to mobile and not to custom apps. |  [optional] |
|**sessionReplayOnCrashEnabled** | **Boolean** | **Deprecated**. Please use &#x60;sessionReplayEnabled&#x60; to enable or disable session replay for mobile apps. |  [optional] |
|**beaconEndpointType** | [**BeaconEndpointTypeEnum**](#BeaconEndpointTypeEnum) | The type of the beacon endpoint. |  |
|**beaconEndpointUrl** | **String** | The URL of the beacon endpoint.  Only applicable when the **beaconEndpointType** is set to &#x60;ENVIRONMENT_ACTIVE_GATE&#x60; or &#x60;INSTRUMENTED_WEB_SERVER&#x60;. |  [optional] |



## Enum: ApplicationTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |



## Enum: IconTypeEnum

| Name | Value |
|---- | -----|
| AMAZON_ECHO | &quot;AMAZON_ECHO&quot; |
| DESKTOP | &quot;DESKTOP&quot; |
| EMBEDDED | &quot;EMBEDDED&quot; |
| IOT | &quot;IOT&quot; |
| MICROSOFT_HOLOLENS | &quot;MICROSOFT_HOLOLENS&quot; |
| UFO | &quot;UFO&quot; |
| USERS | &quot;USERS&quot; |



## Enum: BeaconEndpointTypeEnum

| Name | Value |
|---- | -----|
| CLUSTER_ACTIVE_GATE | &quot;CLUSTER_ACTIVE_GATE&quot; |
| ENVIRONMENT_ACTIVE_GATE | &quot;ENVIRONMENT_ACTIVE_GATE&quot; |
| INSTRUMENTED_WEB_SERVER | &quot;INSTRUMENTED_WEB_SERVER&quot; |



