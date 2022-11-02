

# ActiveGateTokenCreate

Parameters of a new ActiveGate token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the token. |  |
|**expirationDate** | **String** | The expiration date of the token.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the token never expires. |  [optional] |
|**seedToken** | **Boolean** | The token is a seed token (&#x60;true&#x60;) or an individual token (&#x60;false&#x60;).    We recommend the individual token option (false). |  [optional] |
|**activeGateType** | [**ActiveGateTypeEnum**](#ActiveGateTypeEnum) | The type of the ActiveGate for which the token is valid. |  |



## Enum: ActiveGateTypeEnum

| Name | Value |
|---- | -----|
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| CLUSTER | &quot;CLUSTER&quot; |



