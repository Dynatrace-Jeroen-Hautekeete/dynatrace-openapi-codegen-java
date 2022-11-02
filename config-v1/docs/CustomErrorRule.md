

# CustomErrorRule

Configuration of the custom error in the web application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyPattern** | **String** | The key of the error to look for. |  [optional] |
|**keyMatcher** | [**KeyMatcherEnum**](#KeyMatcherEnum) | The matching operation for the **keyPattern**. |  [optional] |
|**valuePattern** | **String** | The value of the error to look for. |  [optional] |
|**valueMatcher** | [**ValueMatcherEnum**](#ValueMatcherEnum) | The matching operation for the **valuePattern**. |  [optional] |
|**capture** | **Boolean** | Capture (&#x60;true&#x60;) or ignore (&#x60;false&#x60;) the error. |  |
|**impactApdex** | **Boolean** | Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Apdex calculation. |  |
|**customAlerting** | **Boolean** | Include (&#x60;true&#x60;) or exclude (&#x60;false&#x60;) the error in Davis AI [problem detection and analysis](https://dt-url.net/a963kd2). |  |



## Enum: KeyMatcherEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |



## Enum: ValueMatcherEnum

| Name | Value |
|---- | -----|
| BEGINS_WITH | &quot;BEGINS_WITH&quot; |
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |



