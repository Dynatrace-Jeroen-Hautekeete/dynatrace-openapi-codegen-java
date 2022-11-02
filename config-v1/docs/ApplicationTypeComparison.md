

# ApplicationTypeComparison

Comparison for `APPLICATION_TYPE` attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| AGENTLESS_MONITORING | &quot;AGENTLESS_MONITORING&quot; |
| AMP | &quot;AMP&quot; |
| AUTO_INJECTED | &quot;AUTO_INJECTED&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| SAAS_VENDOR | &quot;SAAS_VENDOR&quot; |



