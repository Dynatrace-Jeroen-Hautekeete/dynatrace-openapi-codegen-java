

# UserSession

A [user session](https://dt-url.net/xv183rb8), encompassing multiple user actions and additional information about a user's visit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantId** | **String** | The ID of the Dynatrace environment that captured the user session.   This field can not be queried via the User Session Query Language. |  [optional] |
|**userSessionId** | **String** | The unique ID of the user session. |  [optional] |
|**startTime** | **Long** | The timestamp of the first user action in the user session, in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The timestamp of the last user action in the user session, in UTC milliseconds. |  [optional] |
|**duration** | **Long** | The duration of the user session, in milliseconds.    This is calculated as the amount of time between the start of the first user action and the end of the last user action. |  [optional] |
|**internalUserId** | **String** | The unique ID of the user that triggered the user session. |  [optional] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | The type of the user. Indicates either a real human user (&#x60;REAL_USER&#x60;) or a robot (&#x60;ROBOT&#x60; or &#x60;SYNTHETIC&#x60;). |  [optional] |
|**reasonForNoSessionReplay** | [**ReasonForNoSessionReplayEnum**](#ReasonForNoSessionReplayEnum) | The reason for absence of Session Replay. |  [optional] |
|**reasonForNoSessionReplayMobile** | [**ReasonForNoSessionReplayMobileEnum**](#ReasonForNoSessionReplayMobileEnum) | The reason for absence of Session Replay on mobile. |  [optional] |
|**applicationType** | [**ApplicationTypeEnum**](#ApplicationTypeEnum) | The type of the application used in the user session. |  [optional] |
|**bounce** | **Boolean** | The user session has (&#x60;true&#x60;) or doesn&#39;t have (&#x60;false&#x60;) a bounce.    A bounce means there is only one (or less) user action in the user session. |  [optional] |
|**newUser** | **Boolean** | The user is a first-time (&#x60;true&#x60;) or a returning user (&#x60;false&#x60;). |  [optional] |
|**userActionCount** | **Integer** | The number of user actions in the user session. |  [optional] |
|**totalErrorCount** | **Integer** | The number of errors detected in the user session. |  [optional] |
|**totalLicenseCreditCount** | **Integer** | The amount of [DEM units](https://dt-url.net/ch03s4d) consumed by the session. |  [optional] |
|**matchingConversionGoalsCount** | **Integer** | The number of conversion goals achieved by the user session. |  [optional] |
|**matchingConversionGoals** | **List&lt;String&gt;** | A list of conversion goals achieved by the user session.    Additionally, you can define conversion goals for a single user action. |  [optional] |
|**ip** | **String** | The IP address (IPv4 or IPv6) from which the user session originates. |  [optional] |
|**continent** | **String** | The continent from which the user session originates (based on the IP address). |  [optional] |
|**country** | **String** | The country from which the user session originates (based on the IP address). |  [optional] |
|**region** | **String** | The region from which the user session originates (based on the IP address). |  [optional] |
|**city** | **String** | The city from which the user session originates (based on the IP address). |  [optional] |
|**browserType** | **String** | The type of browser used for the user session. |  [optional] |
|**browserFamily** | **String** | The family of the browser used for the user session. |  [optional] |
|**browserMajorVersion** | **String** | The version of the browser used for the user session. |  [optional] |
|**osFamily** | **String** | The type of operating system used for the user session. |  [optional] |
|**osVersion** | **String** | The version of the operating system used for the user session. |  [optional] |
|**manufacturer** | **String** | The detected manufacturer of the device used for the user session. |  [optional] |
|**device** | **String** | The detected device used for the user session. |  [optional] |
|**userId** | **String** | The user ID provided for the user session by session tagging. |  [optional] |
|**screenHeight** | **Integer** | The detected screen height of the device used for the user session. |  [optional] |
|**screenWidth** | **Integer** | The detected screen width of the device used for the user session. |  [optional] |
|**screenOrientation** | [**ScreenOrientationEnum**](#ScreenOrientationEnum) | The detected screen orientation of the device used on the device for the user session. |  [optional] |
|**displayResolution** | [**DisplayResolutionEnum**](#DisplayResolutionEnum) | The detected screen resolution of the device used for the user session. |  [optional] |
|**hasCrash** | **Boolean** | The user session includes (&#x60;true&#x60;) or doesn&#39;t include (&#x60;false&#x60;) a crash. |  [optional] |
|**crashGroupId** | **String** | If a mobile session crashed, this is the ID of the group to which the crashed session belongs.    If the session did not crash or the session is not a mobile session, it has the &#x60;null&#x60; value. |  [optional] |
|**hasSessionReplay** | **Boolean** | Session Replay is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) available for the session. |  [optional] |
|**isp** | **String** | The internet service provider from which the user session originates (based on the IP address). |  [optional] |
|**clientType** | **String** | Additional information about the client.   This field can not be queried via the user session query language. Use the **browserType** field instead. |  [optional] |
|**browserMonitorId** | **String** | The ID of the Synthetic browser monitor that created the session. |  [optional] |
|**browserMonitorName** | **String** | The name of the Synthetic browser monitor that created the session. |  [optional] |
|**stringProperties** | [**List&lt;StringProperty&gt;**](StringProperty.md) | A list of custom properties of the user session with string values. |  [optional] |
|**longProperties** | [**List&lt;LongProperty&gt;**](LongProperty.md) | A list of custom properties of the user session with integer (short or long) values. |  [optional] |
|**doubleProperties** | [**List&lt;DoubleProperty&gt;**](DoubleProperty.md) | A list of custom properties of the user session with floating-point numerical values. |  [optional] |
|**dateProperties** | [**List&lt;DateProperty&gt;**](DateProperty.md) | A list of custom properties of the user session with date values. |  [optional] |
|**userActions** | [**List&lt;UserSessionUserAction&gt;**](UserSessionUserAction.md) | A list of user actions recorded in the user session. |  [optional] |
|**events** | [**List&lt;UserSessionEvents&gt;**](UserSessionEvents.md) | A list of additional events recorded in the user session. |  [optional] |
|**errors** | [**List&lt;UserSessionErrors&gt;**](UserSessionErrors.md) | A list of errors recorded in the user session. |  [optional] |
|**syntheticEvents** | [**List&lt;UserSessionSyntheticEvent&gt;**](UserSessionSyntheticEvent.md) | A list of synthetic events recorded in the user session. |  [optional] |
|**appVersion** | **String** | The version of the application where the user session has been recorded.    This information is provided by another integration, such as OpenKit. |  [optional] |
|**endReason** | [**EndReasonEnum**](#EndReasonEnum) | The reason for the end of the user session. |  [optional] |
|**numberOfRageClicks** | **Integer** | The number of rage clicks detected in the user session. |  [optional] |
|**numberOfRageTaps** | **Integer** | The number of rage taps detected in the user session. |  [optional] |
|**userExperienceScore** | [**UserExperienceScoreEnum**](#UserExperienceScoreEnum) | The user experience score of the user session. |  [optional] |
|**carrier** | **String** | The carrier information of the mobile user session. |  [optional] |
|**networkTechnology** | **String** | The network technology information of the mobile user session. |  [optional] |
|**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | The serialized connection type of the mobile user session. |  [optional] |
|**replayStart** | **Long** | The timestamp of the Session Replay start, in UTC milliseconds. |  [optional] |
|**replayEnd** | **Long** | The timestamp of the Session Replay end, in UTC milliseconds. |  [optional] |
|**clientTimeOffset** | **Integer** | The time offset of the client, in milliseconds |  [optional] |
|**rootedOrJailbroken** | **Boolean** | The mobile device is rooted/jailbroken (&#x60;true&#x60;) or genuine (&#x60;false&#x60;).   Has the value of &#x60;null&#x60; if the status is unknown or undefined. Custom applications always report unknown/undefined. |  [optional] |
|**hasError** | **Boolean** | The user session includes (&#x60;true&#x60;) or doesn&#39;t include (&#x60;false&#x60;) an error. |  [optional] |
|**partNumber** | **Integer** | User sessions can be split into multiple parts for various technical reasons (e.g. after 200 user actions). This &#x60;partNumber&#x60; represents the number of each part of the overall user session. |  [optional] |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| REAL_USER | &quot;REAL_USER&quot; |
| ROBOT | &quot;ROBOT&quot; |
| SYNTHETIC | &quot;SYNTHETIC&quot; |



## Enum: ReasonForNoSessionReplayEnum

| Name | Value |
|---- | -----|
| KILLED_EMERGENCY | &quot;KILLED_EMERGENCY&quot; |
| KILLED_ERROR | &quot;KILLED_ERROR&quot; |
| KILLED_MIN_JS_AGENT_VERSION | &quot;KILLED_MIN_JS_AGENT_VERSION&quot; |
| KILLED_NO_LICENSE | &quot;KILLED_NO_LICENSE&quot; |
| KILLED_WRONG_CONTENT_TYPE | &quot;KILLED_WRONG_CONTENT_TYPE&quot; |
| MISCONFIGURED_CLUSTER | &quot;MISCONFIGURED_CLUSTER&quot; |
| MODULE_DISABLED | &quot;MODULE_DISABLED&quot; |
| NO_ACTIVITY | &quot;NO_ACTIVITY&quot; |
| OPTED_OUT_SESSION | &quot;OPTED_OUT_SESSION&quot; |
| OPT_IN_MODE | &quot;OPT_IN_MODE&quot; |
| ROBOT_DETECTED | &quot;ROBOT_DETECTED&quot; |
| SAMPLED_OUT | &quot;SAMPLED_OUT&quot; |
| UNABLE_TO_LOAD_WORKER | &quot;UNABLE_TO_LOAD_WORKER&quot; |
| UNHANDLED_EXCEPTION | &quot;UNHANDLED_EXCEPTION&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UNSUPPORTED_BROWSER | &quot;UNSUPPORTED_BROWSER&quot; |
| VIEW_EXCLUDED | &quot;VIEW_EXCLUDED&quot; |



## Enum: ReasonForNoSessionReplayMobileEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| NO_AGENT | &quot;NO_AGENT&quot; |
| OPTED_OUT | &quot;OPTED_OUT&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: ApplicationTypeEnum

| Name | Value |
|---- | -----|
| AMP_APPLICATION | &quot;AMP_APPLICATION&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |
| WEB_APPLICATION | &quot;WEB_APPLICATION&quot; |



## Enum: ScreenOrientationEnum

| Name | Value |
|---- | -----|
| LANDSCAPE | &quot;LANDSCAPE&quot; |
| PORTRAIT | &quot;PORTRAIT&quot; |
| UNDEFINED | &quot;UNDEFINED&quot; |



## Enum: DisplayResolutionEnum

| Name | Value |
|---- | -----|
| CGA | &quot;CGA&quot; |
| DCI2K | &quot;DCI2K&quot; |
| DCI4K | &quot;DCI4K&quot; |
| DVGA | &quot;DVGA&quot; |
| FHD | &quot;FHD&quot; |
| FWVGA | &quot;FWVGA&quot; |
| FWXGA | &quot;FWXGA&quot; |
| GHDPLUS | &quot;GHDPlus&quot; |
| HD | &quot;HD&quot; |
| HQVGA | &quot;HQVGA&quot; |
| HQVGA2 | &quot;HQVGA2&quot; |
| HSXGA | &quot;HSXGA&quot; |
| HUXGA | &quot;HUXGA&quot; |
| HVGA | &quot;HVGA&quot; |
| HXGA | &quot;HXGA&quot; |
| NTSC | &quot;NTSC&quot; |
| PAL | &quot;PAL&quot; |
| QHD | &quot;QHD&quot; |
| QQVGA | &quot;QQVGA&quot; |
| QSXGA | &quot;QSXGA&quot; |
| QUXGA | &quot;QUXGA&quot; |
| QVGA | &quot;QVGA&quot; |
| QWXGA | &quot;QWXGA&quot; |
| QXGA | &quot;QXGA&quot; |
| SVGA | &quot;SVGA&quot; |
| SXGA | &quot;SXGA&quot; |
| SXGAMINUS | &quot;SXGAMinus&quot; |
| SXGAPLUS | &quot;SXGAPlus&quot; |
| UGA | &quot;UGA&quot; |
| UHD16K | &quot;UHD16K&quot; |
| UHD4K | &quot;UHD4K&quot; |
| UHD8K | &quot;UHD8K&quot; |
| UHDPLUS | &quot;UHDPlus&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UWQHD | &quot;UWQHD&quot; |
| UXGA | &quot;UXGA&quot; |
| VGA | &quot;VGA&quot; |
| WHSXGA | &quot;WHSXGA&quot; |
| WHUXGA | &quot;WHUXGA&quot; |
| WHXGA | &quot;WHXGA&quot; |
| WQSXGA | &quot;WQSXGA&quot; |
| WQUXGA | &quot;WQUXGA&quot; |
| WQVGA | &quot;WQVGA&quot; |
| WQVGA2 | &quot;WQVGA2&quot; |
| WQVGA3 | &quot;WQVGA3&quot; |
| WQXGA | &quot;WQXGA&quot; |
| WQXGA2 | &quot;WQXGA2&quot; |
| WSVGA | &quot;WSVGA&quot; |
| WSVGA2 | &quot;WSVGA2&quot; |
| WSXGA | &quot;WSXGA&quot; |
| WSXGAPLUS | &quot;WSXGAPlus&quot; |
| WUXGA | &quot;WUXGA&quot; |
| WVGA | &quot;WVGA&quot; |
| WVGA2 | &quot;WVGA2&quot; |
| WXGA | &quot;WXGA&quot; |
| WXGA2 | &quot;WXGA2&quot; |
| WXGA3 | &quot;WXGA3&quot; |
| WXGAPLUS | &quot;WXGAPlus&quot; |
| XGA | &quot;XGA&quot; |
| XGAPLUS | &quot;XGAPLUS&quot; |
| _1280X854 | &quot;_1280x854&quot; |
| NHD | &quot;nHD&quot; |



## Enum: EndReasonEnum

| Name | Value |
|---- | -----|
| DURATION_LIMIT | &quot;DURATION_LIMIT&quot; |
| END_EVENT | &quot;END_EVENT&quot; |
| EXTENDED_TIMEOUT | &quot;EXTENDED_TIMEOUT&quot; |
| TEST_FAILED | &quot;TEST_FAILED&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| USER_ACTION_LIMIT | &quot;USER_ACTION_LIMIT&quot; |



## Enum: UserExperienceScoreEnum

| Name | Value |
|---- | -----|
| FRUSTRATED | &quot;FRUSTRATED&quot; |
| SATISFIED | &quot;SATISFIED&quot; |
| TOLERATED | &quot;TOLERATED&quot; |
| UNDEFINED | &quot;UNDEFINED&quot; |



## Enum: ConnectionTypeEnum

| Name | Value |
|---- | -----|
| LAN | &quot;LAN&quot; |
| MOBILE | &quot;MOBILE&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| WIFI | &quot;WIFI&quot; |



