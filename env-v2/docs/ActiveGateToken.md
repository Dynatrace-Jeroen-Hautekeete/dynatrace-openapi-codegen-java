

# ActiveGateToken

Metadata of an ActiveGate token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ActiveGate token identifier, consisting of [prefix and public part](https://dt-url.net/2903ss4) of the token. |  |
|**name** | **String** | The name of the token. |  |
|**owner** | **String** | The owner of the token. |  |
|**creationDate** | **String** | The token creation date in ISO 8601 format (&#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60;). |  |
|**expirationDate** | **String** | The token expiration date in ISO 8601 format (&#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60;).    If not set, the token never expires. |  [optional] |
|**lastUsedDate** | **String** | The token last used date in ISO 8601 format (&#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;&#x60;). |  [optional] |
|**seedToken** | **Boolean** | The token is a seed token (&#x60;true&#x60;) or an individual token (&#x60;false&#x60;). |  [optional] |
|**activeGateType** | [**ActiveGateTypeEnum**](#ActiveGateTypeEnum) | The type of the ActiveGate for which the token is valid. |  |



## Enum: ActiveGateTypeEnum

| Name | Value |
|---- | -----|
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| CLUSTER | &quot;CLUSTER&quot; |



