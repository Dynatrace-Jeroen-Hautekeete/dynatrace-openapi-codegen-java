

# AwsCredentialsConfig

Configuration of an AWS credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**id** | **String** | The unique ID of the credentials. |  [optional] [readonly] |
|**connectionStatus** | [**ConnectionStatusEnum**](#ConnectionStatusEnum) | The status of the connection to the AWS environment.    * &#x60;CONNECTED&#x60;: There was a connection within last 10 minutes.  * &#x60;DISCONNECTED&#x60;: A problem occurred with establishing connection using these credentials. Check whether the data is correct.  * &#x60;UNINITIALIZED&#x60;: The successful connection has never been established for these credentials. |  [optional] [readonly] |
|**label** | **String** | The name of the credentials. |  |
|**partitionType** | [**PartitionTypeEnum**](#PartitionTypeEnum) | The type of the AWS partition. |  |
|**authenticationData** | [**AwsAuthenticationData**](AwsAuthenticationData.md) |  |  |
|**taggedOnly** | **Boolean** | Monitor only resources which have specified AWS tags (&#x60;true&#x60;) or all resources (&#x60;false&#x60;). |  |
|**tagsToMonitor** | [**List&lt;AwsConfigTag&gt;**](AwsConfigTag.md) | A list of AWS tags to be monitored.   You can specify up to 10 tags.   Only applicable when the **taggedOnly** parameter is set to &#x60;true&#x60;. |  |
|**supportingServicesToMonitor** | [**List&lt;AwsSupportingServiceConfig&gt;**](AwsSupportingServiceConfig.md) | **Deprecated**. To manage services use [/aws/credentials/{id}/services](https://dt-url.net/l022s6v) operation. Built-in services are not supported here.  A list of AWS services to be monitored. Available services are listed by [/aws/supportedServices](https://dt-url.net/me02sh2) operation.  For each service, a list of metrics and dimensions can be specified. A list of supported metrics and dimensions for a given service can be checked in [documentation](https://dt-url.net/r12v0pkl).  List of metrics can be skipped (set to null), resulting in recommended (default) set of metrics and dimensions being chosen for monitoring.  |  [optional] |



## Enum: ConnectionStatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| UNINITIALIZED | &quot;UNINITIALIZED&quot; |



## Enum: PartitionTypeEnum

| Name | Value |
|---- | -----|
| CN | &quot;AWS_CN&quot; |
| DEFAULT | &quot;AWS_DEFAULT&quot; |
| US_GOV | &quot;AWS_US_GOV&quot; |



