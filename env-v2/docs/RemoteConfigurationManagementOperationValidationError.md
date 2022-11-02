

# RemoteConfigurationManagementOperationValidationError

Validation error of remote configuration management operation definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** | The reason of validation failure. |  [optional] |
|**value** | **String** | The value which should be assigned to given attribute. |  [optional] |
|**attribute** | [**AttributeEnum**](#AttributeEnum) | The attribute which is affected by the operation. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | The operation performed on given attribute. |  [optional] |



## Enum: AttributeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |
| HOSTGROUP | &quot;hostGroup&quot; |
| NETWORKZONE | &quot;networkZone&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CLEAR | &quot;clear&quot; |
| SET | &quot;set&quot; |



