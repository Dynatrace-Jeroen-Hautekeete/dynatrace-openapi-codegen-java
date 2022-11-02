

# LocationCollectionElement

A synthetic location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the location. |  |
|**entityId** | **String** | The Dynatrace entity ID of the location. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the location. |  |
|**cloudPlatform** | [**CloudPlatformEnum**](#CloudPlatformEnum) | The cloud provider where the location is hosted.    Only applicable to &#x60;PUBLIC&#x60; locations. |  [optional] |
|**ips** | **List&lt;String&gt;** | The list of IP addresses assigned to the location.    Only applicable to &#x60;PUBLIC&#x60; locations. |  [optional] |
|**stage** | [**StageEnum**](#StageEnum) | The release stage of the location. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the location. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



## Enum: CloudPlatformEnum

| Name | Value |
|---- | -----|
| ALIBABA | &quot;ALIBABA&quot; |
| AMAZON_EC2 | &quot;AMAZON_EC2&quot; |
| AZURE | &quot;AZURE&quot; |
| DYNATRACE_CLOUD | &quot;DYNATRACE_CLOUD&quot; |
| GOOGLE_CLOUD | &quot;GOOGLE_CLOUD&quot; |
| INTEROUTE | &quot;INTEROUTE&quot; |
| OTHER | &quot;OTHER&quot; |
| UNDEFINED | &quot;UNDEFINED&quot; |



## Enum: StageEnum

| Name | Value |
|---- | -----|
| BETA | &quot;BETA&quot; |
| COMING_SOON | &quot;COMING_SOON&quot; |
| DELETED | &quot;DELETED&quot; |
| GA | &quot;GA&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| HIDDEN | &quot;HIDDEN&quot; |



