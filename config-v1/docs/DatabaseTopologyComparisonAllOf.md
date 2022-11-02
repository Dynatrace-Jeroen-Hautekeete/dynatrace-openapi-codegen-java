

# DatabaseTopologyComparisonAllOf


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
| CLUSTER | &quot;CLUSTER&quot; |
| EMBEDDED | &quot;EMBEDDED&quot; |
| FAILOVER | &quot;FAILOVER&quot; |
| IPC | &quot;IPC&quot; |
| LOAD_BALANCING | &quot;LOAD_BALANCING&quot; |
| SINGLE_SERVER | &quot;SINGLE_SERVER&quot; |
| UNSPECIFIED | &quot;UNSPECIFIED&quot; |



