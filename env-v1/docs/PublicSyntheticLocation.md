

# PublicSyntheticLocation

Configuration of a public synthetic location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cloudPlatform** | [**CloudPlatformEnum**](#CloudPlatformEnum) | The cloud provider where the location is hosted. |  |
|**ips** | **Set&lt;String&gt;** | The list of IP addresses assigned to the location. |  |
|**stage** | [**StageEnum**](#StageEnum) | The stage of the location. |  |
|**browserType** | **String** | The type of the browser the location is using to execute browser monitors. |  |
|**browserVersion** | **String** | The version of the browser the location is using to execute browser monitors. |  |
|**capabilities** | **List&lt;String&gt;** | A list of location capabilities. |  [optional] |



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



