

# ExternalVaultConfig

Configuration for external vault synchronization for username and password credentials.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceAuthMethod** | [**SourceAuthMethodEnum**](#SourceAuthMethodEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;HASHICORP_VAULT_APPROLE&#x60; -&gt; HashicorpApproleConfig  * &#x60;HASHICORP_VAULT_CERTIFICATE&#x60; -&gt; HashicorpCertificateConfig  * &#x60;AZURE_KEY_VAULT_CLIENT_SECRET&#x60; -&gt; AzureClientSecretConfig   |  [optional] |
|**vaultUrl** | **String** |  |  [optional] |
|**usernameSecretName** | **String** |  |  [optional] |
|**passwordSecretName** | **String** |  |  [optional] |
|**tokenSecretName** | **String** |  |  [optional] |
|**credentialsUsedForExternalSynchronization** | **Set&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: SourceAuthMethodEnum

| Name | Value |
|---- | -----|
| AZURE_KEY_VAULT_CLIENT_SECRET | &quot;AZURE_KEY_VAULT_CLIENT_SECRET&quot; |
| HASHICORP_VAULT_APPROLE | &quot;HASHICORP_VAULT_APPROLE&quot; |
| HASHICORP_VAULT_CERTIFICATE | &quot;HASHICORP_VAULT_CERTIFICATE&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AZURE_CERTIFICATE_MODEL | &quot;AZURE_CERTIFICATE_MODEL&quot; |
| AZURE_CLIENT_SECRET_MODEL | &quot;AZURE_CLIENT_SECRET_MODEL&quot; |
| HASHICORP_APPROLE_MODEL | &quot;HASHICORP_APPROLE_MODEL&quot; |
| HASHICORP_CERTIFICATE_MODEL | &quot;HASHICORP_CERTIFICATE_MODEL&quot; |



