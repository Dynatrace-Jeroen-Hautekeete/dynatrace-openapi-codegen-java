

# CredentialsResponseElement

Metadata of the credentials set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the credentials set. |  |
|**id** | **String** | The ID of the credentials set. |  [optional] |
|**description** | **String** | A short description of the credentials set. |  |
|**owner** | **String** | The owner of the credential (user for which used API token was created). |  |
|**ownerAccessOnly** | **Boolean** | Flag indicating that this credential is visible only to the owner. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the credentials set. |  [optional] |
|**externalVault** | [**ExternalVaultConfig**](ExternalVaultConfig.md) |  |  [optional] |
|**credentialUsageSummary** | [**List&lt;CredentialUsageHandler&gt;**](CredentialUsageHandler.md) | The list contains summary data related to the use of credentials. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the credentials set. |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| EXTENSION | &quot;EXTENSION&quot; |
| SYNTHETIC | &quot;SYNTHETIC&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CERTIFICATE | &quot;CERTIFICATE&quot; |
| PUBLIC_CERTIFICATE | &quot;PUBLIC_CERTIFICATE&quot; |
| TOKEN | &quot;TOKEN&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| USERNAME_PASSWORD | &quot;USERNAME_PASSWORD&quot; |



