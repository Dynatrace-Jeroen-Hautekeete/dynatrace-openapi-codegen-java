

# KeyUserAction

Configuration of the key user action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the action. |  |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | The type of the action. |  |
|**domain** | **String** | The domain where the action is performed. |  [optional] |
|**meIdentifier** | **String** | The Dynatrace entity ID of the action. |  [optional] [readonly] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;Custom&quot; |
| LOAD | &quot;Load&quot; |
| XHR | &quot;Xhr&quot; |



