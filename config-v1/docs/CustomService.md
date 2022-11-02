

# CustomService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **UUID** | The ID of the custom service. |  [optional] |
|**name** | **String** | The name of the custom service, displayed in the UI. |  |
|**order** | **String** | The order string. Sorting custom services alphabetically by their order string determines their relative ordering.  Typically this is managed by Dynatrace internally and will not be present in GET responses. |  [optional] |
|**enabled** | **Boolean** | Custom service enabled/disabled. |  |
|**rules** | [**List&lt;DetectionRule&gt;**](DetectionRule.md) | The list of rules defining the custom service. |  |
|**queueEntryPoint** | **Boolean** | The queue entry point flag.   Set to &#x60;true&#x60; for custom messaging services. |  |
|**queueEntryPointType** | [**QueueEntryPointTypeEnum**](#QueueEntryPointTypeEnum) | The queue entry point type.. |  [optional] |
|**processGroups** | **List&lt;String&gt;** | The list of process groups the custom service should belong to. |  [optional] |



## Enum: QueueEntryPointTypeEnum

| Name | Value |
|---- | -----|
| IBM_MQ | &quot;IBM_MQ&quot; |
| JMS | &quot;JMS&quot; |
| KAFKA | &quot;KAFKA&quot; |
| MSMQ | &quot;MSMQ&quot; |
| RABBIT_MQ | &quot;RABBIT_MQ&quot; |



