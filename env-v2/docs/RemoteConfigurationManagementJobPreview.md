

# RemoteConfigurationManagementJobPreview

A preview of remote configuration management job.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alreadyConfiguredEntitiesCount** | **Integer** | The number of entities that are currently configured as defined by remote configuration management operation. |  [optional] |
|**targetEntitiesCount** | **Integer** | The number of entities that will be configured as defined by remote configuration management after it is completed. |  [optional] |
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



