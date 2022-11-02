

# CapturedMethod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodReference**](MethodReference.md) |  |  |
|**capture** | [**CaptureEnum**](#CaptureEnum) | What to capture from the method. |  |
|**argumentIndex** | **Integer** | The index of the argument to capture. Set &#x60;0&#x60; to capture the return value, &#x60;1&#x60; or higher to capture a mehtod argument.    Required if the **capture** is set to &#x60;ARGUMENT&#x60;.   Not applicable in other cases. |  [optional] |
|**deepObjectAccess** | **String** | The getter chain to apply to the captured object. It is required in one of the following cases:   The **capture** is set to &#x60;THIS&#x60;.    The **capture** is set to &#x60;ARGUMENT&#x60;, and the argument is not a primitive, a primitive wrapper class, a string, or an array.    Not applicable in other cases. |  [optional] |



## Enum: CaptureEnum

| Name | Value |
|---- | -----|
| ARGUMENT | &quot;ARGUMENT&quot; |
| CLASS_NAME | &quot;CLASS_NAME&quot; |
| METHOD_NAME | &quot;METHOD_NAME&quot; |
| OCCURRENCES | &quot;OCCURRENCES&quot; |
| SIMPLE_CLASS_NAME | &quot;SIMPLE_CLASS_NAME&quot; |
| THIS | &quot;THIS&quot; |



