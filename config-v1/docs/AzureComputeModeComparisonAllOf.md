

# AzureComputeModeComparisonAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  [optional] |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| DEDICATED | &quot;DEDICATED&quot; |
| SHARED | &quot;SHARED&quot; |


