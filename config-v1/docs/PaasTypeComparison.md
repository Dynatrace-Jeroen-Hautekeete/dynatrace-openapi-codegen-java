

# PaasTypeComparison

Comparison for `PAAS_TYPE` attributes.

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
| AWS_ECS_EC2 | &quot;AWS_ECS_EC2&quot; |
| AWS_ECS_FARGATE | &quot;AWS_ECS_FARGATE&quot; |
| AWS_LAMBDA | &quot;AWS_LAMBDA&quot; |
| AZURE_FUNCTIONS | &quot;AZURE_FUNCTIONS&quot; |
| AZURE_WEBSITES | &quot;AZURE_WEBSITES&quot; |
| CLOUD_FOUNDRY | &quot;CLOUD_FOUNDRY&quot; |
| GOOGLE_APP_ENGINE | &quot;GOOGLE_APP_ENGINE&quot; |
| HEROKU | &quot;HEROKU&quot; |
| KUBERNETES | &quot;KUBERNETES&quot; |
| OPENSHIFT | &quot;OPENSHIFT&quot; |



