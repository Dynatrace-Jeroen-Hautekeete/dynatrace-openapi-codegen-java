

# SessionReplayMaskingSetting

Configuration of the Session Replay masking.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maskingPreset** | [**MaskingPresetEnum**](#MaskingPresetEnum) | The type of the masking:   * &#x60;MASK_ALL&#x60;: Mask all texts, user input, and images.  * &#x60;MASK_USER_INPUT&#x60;: Mask all data that is provided through user input  * &#x60;ALLOW_LIST&#x60;: Only elements, specified in **maskingRules** are shown, everything else is masked.  * &#x60;BLOCK_LIST&#x60;: Elements, specified in **maskingRules** are masked, everything else is shown. |  |
|**maskingRules** | [**List&lt;MaskingRule&gt;**](MaskingRule.md) | A list of masking rules. |  [optional] |



## Enum: MaskingPresetEnum

| Name | Value |
|---- | -----|
| ALLOW_LIST | &quot;ALLOW_LIST&quot; |
| BLOCK_LIST | &quot;BLOCK_LIST&quot; |
| MASK_ALL | &quot;MASK_ALL&quot; |
| MASK_USER_INPUT | &quot;MASK_USER_INPUT&quot; |



