

# RemoteConfigurationManagementOperation

Definition of a single remote configuration management operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value which should be assigned to given attribute. |  [optional] |
|**attribute** | [**AttributeEnum**](#AttributeEnum) | The attribute which is affected by the operation. |  |
|**operation** | [**OperationEnum**](#OperationEnum) | The operation performed on given attribute. |  |



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



