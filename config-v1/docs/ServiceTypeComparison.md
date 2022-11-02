

# ServiceTypeComparison

Comparison for `SERVICE_TYPE` attributes.

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
| BACKGROUND_ACTIVITY | &quot;BACKGROUND_ACTIVITY&quot; |
| CICS_SERVICE | &quot;CICS_SERVICE&quot; |
| CUSTOM_SERVICE | &quot;CUSTOM_SERVICE&quot; |
| DATABASE_SERVICE | &quot;DATABASE_SERVICE&quot; |
| ENTERPRISE_SERVICE_BUS_SERVICE | &quot;ENTERPRISE_SERVICE_BUS_SERVICE&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| IBM_INTEGRATION_BUS_SERVICE | &quot;IBM_INTEGRATION_BUS_SERVICE&quot; |
| IMS_SERVICE | &quot;IMS_SERVICE&quot; |
| MESSAGING_SERVICE | &quot;MESSAGING_SERVICE&quot; |
| QUEUE_LISTENER_SERVICE | &quot;QUEUE_LISTENER_SERVICE&quot; |
| RMI_SERVICE | &quot;RMI_SERVICE&quot; |
| RPC_SERVICE | &quot;RPC_SERVICE&quot; |
| WEB_REQUEST_SERVICE | &quot;WEB_REQUEST_SERVICE&quot; |
| WEB_SERVICE | &quot;WEB_SERVICE&quot; |
| ZOS_CONNECT | &quot;ZOS_CONNECT&quot; |



