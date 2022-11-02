

# ExtensionEventDto

A list of extension events.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **String** | Timestamp of the event |  [optional] |
|**severity** | **String** | Severity of the event |  [optional] |
|**content** | **String** | Content of the event |  [optional] |
|**dtEntityHost** | **String** | Host that uses this monitoring configuration.  Example: &#x60;HOST-ABCDEF0123456789&#x60; |  [optional] |
|**dtActiveGateId** | **String** | Hexadecimal ID of Active Gate that uses this monitoring configuration.  Example: &#x60;0x1a2b3c4d&#x60; |  [optional] |
|**dtExtensionDs** | **String** | Data source that uses this monitoring configuration.  Example: &#x60;snmp&#x60; |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the event |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| INFO | &quot;INFO&quot; |
| NONE | &quot;NONE&quot; |
| WARN | &quot;WARN&quot; |



