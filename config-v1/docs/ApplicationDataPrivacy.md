

# ApplicationDataPrivacy

Data privacy settings of the application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**identifier** | **String** | Dynatrace entity ID of the web application. |  [optional] [readonly] |
|**dataCaptureOptInEnabled** | **Boolean** | Set to &#x60;true&#x60; to disable data capture and cookies until JavaScriptAPI &#x60;dtrum.enable()&#x60; is called. |  |
|**persistentCookieForUserTracking** | **Boolean** | Set to &#x60;true&#x60; to set persistent cookie in order to recognize returning devices. |  |
|**doNotTrackBehaviour** | [**DoNotTrackBehaviourEnum**](#DoNotTrackBehaviourEnum) | How to handle the \&quot;Do Not Track\&quot; header:   * &#x60;IGNORE_DO_NOT_TRACK&#x60;: ignore the header and capture the data.  * &#x60;CAPTURE_ANONYMIZED&#x60;: capture the data but do not tie it to the user.  * &#x60;DO_NOT_CAPTURE&#x60;: respect the header and do not capture. |  |
|**sessionReplayDataPrivacy** | [**SessionReplayDataPrivacySettings**](SessionReplayDataPrivacySettings.md) |  |  [optional] |



## Enum: DoNotTrackBehaviourEnum

| Name | Value |
|---- | -----|
| CAPTURE_ANONYMIZED | &quot;CAPTURE_ANONYMIZED&quot; |
| DO_NOT_CAPTURE | &quot;DO_NOT_CAPTURE&quot; |
| IGNORE_DO_NOT_TRACK | &quot;IGNORE_DO_NOT_TRACK&quot; |



