

# WebApplicationConfigIpAddressRestrictionSettings

Settings for restricting certain ip addresses and for introducing subnet mask. It also restricts the mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | The mode of the list of ip address restrictions. |  |
|**ipAddressRestrictions** | [**List&lt;IpAddressRange&gt;**](IpAddressRange.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| EXCLUDE | &quot;EXCLUDE&quot; |
| INCLUDE | &quot;INCLUDE&quot; |



