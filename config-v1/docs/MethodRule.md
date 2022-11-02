

# MethodRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the method rule. |  [optional] |
|**methodName** | **String** | The method to instrument. |  |
|**argumentTypes** | **List&lt;String&gt;** | Fully qualified types of argument the method expects. |  [optional] |
|**returnType** | **String** | Fully qualified type the method returns. |  |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | The visibility of the method rule. |  [optional] |
|**modifiers** | [**Set&lt;ModifiersEnum&gt;**](#Set&lt;ModifiersEnum&gt;) | The modifiers of the method rule. |  [optional] |



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



