

# DexpFilterRelationship


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetEntity** | **String** | The target entity of the relationship. e.g HOST, VCENTER, SERVICE etc |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the relationship |  [optional] |
|**id** | **String** | The id of the relationship. e.g runsOn, isStepOf, etc |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FROMRELATIONSHIP | &quot;fromRelationship&quot; |
| TORELATIONSHIP | &quot;toRelationship&quot; |



