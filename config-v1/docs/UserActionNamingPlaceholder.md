

# UserActionNamingPlaceholder

The placeholder settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Placeholder name. |  |
|**input** | [**InputEnum**](#InputEnum) | Input. |  |
|**processingPart** | [**ProcessingPartEnum**](#ProcessingPartEnum) | Part. |  |
|**processingSteps** | [**List&lt;UserActionNamingPlaceholderProcessingStep&gt;**](UserActionNamingPlaceholderProcessingStep.md) | Processing actions. |  [optional] |
|**metadataId** | **Integer** | Id of the metadata. |  [optional] |
|**useGuessedElementIdentifier** | **Boolean** | Use the element identifier that was selected by Dynatrace. |  |



## Enum: InputEnum

| Name | Value |
|---- | -----|
| ELEMENT_IDENTIFIER | &quot;ELEMENT_IDENTIFIER&quot; |
| INPUT_TYPE | &quot;INPUT_TYPE&quot; |
| METADATA | &quot;METADATA&quot; |
| PAGE_TITLE | &quot;PAGE_TITLE&quot; |
| PAGE_URL | &quot;PAGE_URL&quot; |
| SOURCE_URL | &quot;SOURCE_URL&quot; |
| TOP_XHR_URL | &quot;TOP_XHR_URL&quot; |
| XHR_URL | &quot;XHR_URL&quot; |



## Enum: ProcessingPartEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| ANCHOR | &quot;ANCHOR&quot; |
| PATH | &quot;PATH&quot; |



