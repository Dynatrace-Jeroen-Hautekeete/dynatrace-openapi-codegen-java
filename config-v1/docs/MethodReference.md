

# MethodReference

Configuration of a method to be captured.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The visibility of the method to capture. |  |
|**modifiers** | [**Set&lt;ModifiersEnum&gt;**](#Set&lt;ModifiersEnum&gt;) | The modifiers of the method to capture. |  |
|**className** | **String** | The class name where the method to capture resides.    Either this or the **fileName** must be set. |  [optional] |
|**fileName** | **String** | The file name where the method to capture resides.    Either this or **className** must be set. |  [optional] |
|**fileNameMatcher** | [**FileNameMatcherEnum**](#FileNameMatcherEnum) | The operator of the comparison.    If not set, &#x60;EQUALS&#x60; is used. |  [optional] |
|**methodName** | **String** | The name of the method to capture. |  |
|**argumentTypes** | **List&lt;String&gt;** | The list of argument types. |  |
|**returnType** | **String** | The return type. |  |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;INTERNAL&quot; |
| PACKAGE_PROTECTED | &quot;PACKAGE_PROTECTED&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| PROTECTED | &quot;PROTECTED&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



## Enum: Set&lt;ModifiersEnum&gt;

| Name | Value |
|---- | -----|
| ABSTRACT | &quot;ABSTRACT&quot; |
| EXTERN | &quot;EXTERN&quot; |
| FINAL | &quot;FINAL&quot; |
| NATIVE | &quot;NATIVE&quot; |
| STATIC | &quot;STATIC&quot; |



## Enum: FileNameMatcherEnum

| Name | Value |
|---- | -----|
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



