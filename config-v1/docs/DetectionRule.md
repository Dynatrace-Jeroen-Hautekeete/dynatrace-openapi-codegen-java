

# DetectionRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the detection rule. |  [optional] |
|**enabled** | **Boolean** | Rule enabled/disabled. |  |
|**fileName** | **String** | The PHP file containing the class or methods to instrument.   Required for PHP custom service.    Not applicable to Java and .NET. |  [optional] |
|**fileNameMatcher** | [**FileNameMatcherEnum**](#FileNameMatcherEnum) | Matcher applying to the file name. Default value is &#x60;ENDS_WITH&#x60; (if applicable). |  [optional] |
|**className** | **String** | The fully qualified class or interface to instrument.   Required for Java and .NET custom services.    Not applicable to PHP. |  [optional] |
|**matcher** | [**MatcherEnum**](#MatcherEnum) | Matcher applying to the class name. &#x60;STARTS_WITH&#x60; can only be used if there is at least one annotation defined. Default value is &#x60;EQUALS&#x60;. |  [optional] |
|**methodRules** | [**List&lt;MethodRule&gt;**](MethodRule.md) | List of methods to instrument. |  |
|**annotations** | **List&lt;String&gt;** | Additional annotations filter of the rule.   Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented.   Not applicable to PHP. |  [optional] |



## Enum: FileNameMatcherEnum

| Name | Value |
|---- | -----|
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



## Enum: MatcherEnum

| Name | Value |
|---- | -----|
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



