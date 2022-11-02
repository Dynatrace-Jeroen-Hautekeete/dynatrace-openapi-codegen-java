

# ActiveGateTokenInfoDto

Information about ActiveGate token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**environmentId** | **String** | The environment ID to which the token belongs.   Only available if more than one environment is supported. |  [optional] [readonly] |
|**id** | **String** | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | State of the ActiveGate token. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ABSENT | &quot;ABSENT&quot; |
| EXPIRING | &quot;EXPIRING&quot; |
| INVALID | &quot;INVALID&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UNSUPPORTED | &quot;UNSUPPORTED&quot; |
| VALID | &quot;VALID&quot; |



