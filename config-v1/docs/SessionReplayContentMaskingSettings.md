

# SessionReplayContentMaskingSettings

Content masking settings for Session Replay.   For more details, see [Configure Session Replay](https://dt-url.net/0m03slq) in Dynatrace Documentation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordingMaskingSettingsVersion** | **Integer** | The version of the content masking.   You can use this API only with the version 2.   If you&#39;re using version 1, set this field to &#x60;2&#x60; in the PUT request to switch to version 2. |  |
|**recordingMaskingSettings** | [**SessionReplayMaskingSetting**](SessionReplayMaskingSetting.md) |  |  [optional] |
|**playbackMaskingSettings** | [**SessionReplayMaskingSetting**](SessionReplayMaskingSetting.md) |  |  [optional] |



