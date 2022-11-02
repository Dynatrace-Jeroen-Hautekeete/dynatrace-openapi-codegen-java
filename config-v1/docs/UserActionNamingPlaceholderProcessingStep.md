

# UserActionNamingPlaceholderProcessingStep

The processing step settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | An action to be taken by the processing:   * &#x60;SUBSTRING&#x60;: Extracts the string between **patternBefore** and **patternAfter**.  * &#x60;REPLACEMENT&#x60;: Replaces the string between **patternBefore** and **patternAfter** with the specified **replacement**. * &#x60;REPLACE_WITH_PATTERN&#x60;: Replaces the **patternToReplace** with the specified **replacement**.  * &#x60;EXTRACT_BY_REGULAR_EXPRESSION&#x60;: Extracts the part of the string that matches the **regularExpression**.  * &#x60;REPLACE_WITH_REGULAR_EXPRESSION&#x60;: Replaces all occurrences that match **regularExpression** with the specified **replacement**.  * &#x60;REPLACE_IDS&#x60;: Replaces all IDs and UUIDs with the specified **replacement**. |  |
|**patternBefore** | **String** | The pattern before the required value. It will be removed. |  [optional] |
|**patternBeforeSearchType** | [**PatternBeforeSearchTypeEnum**](#PatternBeforeSearchTypeEnum) | The required occurrence of **patternBefore**. |  [optional] |
|**patternAfter** | **String** | The pattern after the required value. It will be removed. |  [optional] |
|**patternAfterSearchType** | [**PatternAfterSearchTypeEnum**](#PatternAfterSearchTypeEnum) | The required occurrence of **patternAfter**. |  [optional] |
|**replacement** | **String** | Replacement for the original value. |  [optional] |
|**patternToReplace** | **String** | The pattern to be replaced.    Only applicable if the **type** is &#x60;REPLACE_WITH_PATTERN&#x60;. |  [optional] |
|**regularExpression** | **String** | A regular expression for the string to be extracted or replaced.    Only applicable if the **type** is &#x60;EXTRACT_BY_REGULAR_EXPRESSION&#x60; or &#x60;REPLACE_WITH_REGULAR_EXPRESSION&#x60;. |  [optional] |
|**fallbackToInput** | **Boolean** | If set to true: Returns the input if **patternBefore** or **patternAfter** cannot be found and the **type** is &#x60;SUBSTRING&#x60;.    Returns the input if **regularExpression** doesn&#39;t match and **type** is &#x60;EXTRACT_BY_REGULAR_EXPRESSION&#x60;.    Otherwise null is returned. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTRACT_BY_REGULAR_EXPRESSION | &quot;EXTRACT_BY_REGULAR_EXPRESSION&quot; |
| REPLACEMENT | &quot;REPLACEMENT&quot; |
| REPLACE_IDS | &quot;REPLACE_IDS&quot; |
| REPLACE_WITH_PATTERN | &quot;REPLACE_WITH_PATTERN&quot; |
| REPLACE_WITH_REGULAR_EXPRESSION | &quot;REPLACE_WITH_REGULAR_EXPRESSION&quot; |
| SUBSTRING | &quot;SUBSTRING&quot; |



## Enum: PatternBeforeSearchTypeEnum

| Name | Value |
|---- | -----|
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |



## Enum: PatternAfterSearchTypeEnum

| Name | Value |
|---- | -----|
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |



