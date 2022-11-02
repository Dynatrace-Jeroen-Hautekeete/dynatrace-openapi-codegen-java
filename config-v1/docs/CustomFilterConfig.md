

# CustomFilterConfig

Configuration of the custom filter of a tile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the filter.    It shows to which entity the filter belongs.    Custom charts have the &#x60;MIXED&#x60; type. |  |
|**customName** | **String** | The name of the tile, set by user |  |
|**defaultName** | **String** | The default name of the tile |  |
|**chartConfig** | [**CustomFilterChartConfig**](CustomFilterChartConfig.md) |  |  |
|**filtersPerEntityType** | **Map&lt;String, Map&lt;String, Set&lt;String&gt;&gt;&gt;** | A list of filters, applied to specific entity types. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALB | &quot;ALB&quot; |
| APPLICATION | &quot;APPLICATION&quot; |
| APPLICATION_METHOD | &quot;APPLICATION_METHOD&quot; |
| APPMON | &quot;APPMON&quot; |
| ASG | &quot;ASG&quot; |
| AWS_CREDENTIALS | &quot;AWS_CREDENTIALS&quot; |
| AWS_CUSTOM_SERVICE | &quot;AWS_CUSTOM_SERVICE&quot; |
| AWS_LAMBDA_FUNCTION | &quot;AWS_LAMBDA_FUNCTION&quot; |
| CLOUD_APPLICATION | &quot;CLOUD_APPLICATION&quot; |
| CLOUD_APPLICATION_INSTANCE | &quot;CLOUD_APPLICATION_INSTANCE&quot; |
| CLOUD_APPLICATION_NAMESPACE | &quot;CLOUD_APPLICATION_NAMESPACE&quot; |
| CONTAINER_GROUP_INSTANCE | &quot;CONTAINER_GROUP_INSTANCE&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| CUSTOM_DEVICES | &quot;CUSTOM_DEVICES&quot; |
| CUSTOM_SERVICES | &quot;CUSTOM_SERVICES&quot; |
| DATABASE | &quot;DATABASE&quot; |
| DATABASE_KEY_REQUEST | &quot;DATABASE_KEY_REQUEST&quot; |
| DCRUM_APPLICATION | &quot;DCRUM_APPLICATION&quot; |
| DCRUM_ENTITY | &quot;DCRUM_ENTITY&quot; |
| DYNAMO_DB | &quot;DYNAMO_DB&quot; |
| EBS | &quot;EBS&quot; |
| EC2 | &quot;EC2&quot; |
| ELB | &quot;ELB&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| ESXI | &quot;ESXI&quot; |
| EXTERNAL_SYNTHETIC_TEST | &quot;EXTERNAL_SYNTHETIC_TEST&quot; |
| GLOBAL_BACKGROUND_ACTIVITY | &quot;GLOBAL_BACKGROUND_ACTIVITY&quot; |
| HOST | &quot;HOST&quot; |
| IOT | &quot;IOT&quot; |
| KUBERNETES_CLUSTER | &quot;KUBERNETES_CLUSTER&quot; |
| KUBERNETES_NODE | &quot;KUBERNETES_NODE&quot; |
| MDA_SERVICE | &quot;MDA_SERVICE&quot; |
| MIXED | &quot;MIXED&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |
| MONITORED_ENTITY | &quot;MONITORED_ENTITY&quot; |
| NLB | &quot;NLB&quot; |
| PG_BACKGROUND_ACTIVITY | &quot;PG_BACKGROUND_ACTIVITY&quot; |
| PROBLEM | &quot;PROBLEM&quot; |
| PROCESS_GROUP_INSTANCE | &quot;PROCESS_GROUP_INSTANCE&quot; |
| RDS | &quot;RDS&quot; |
| REMOTE_PLUGIN | &quot;REMOTE_PLUGIN&quot; |
| SERVICE | &quot;SERVICE&quot; |
| SERVICE_KEY_REQUEST | &quot;SERVICE_KEY_REQUEST&quot; |
| SYNTHETIC_BROWSER_MONITOR | &quot;SYNTHETIC_BROWSER_MONITOR&quot; |
| SYNTHETIC_HTTPCHECK | &quot;SYNTHETIC_HTTPCHECK&quot; |
| SYNTHETIC_HTTPCHECK_STEP | &quot;SYNTHETIC_HTTPCHECK_STEP&quot; |
| SYNTHETIC_LOCATION | &quot;SYNTHETIC_LOCATION&quot; |
| SYNTHETIC_TEST | &quot;SYNTHETIC_TEST&quot; |
| SYNTHETIC_TEST_STEP | &quot;SYNTHETIC_TEST_STEP&quot; |
| UI_ENTITY | &quot;UI_ENTITY&quot; |
| VIRTUAL_MACHINE | &quot;VIRTUAL_MACHINE&quot; |
| WEB_CHECK | &quot;WEB_CHECK&quot; |



