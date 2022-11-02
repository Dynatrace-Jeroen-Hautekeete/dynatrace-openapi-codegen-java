

# ExternalVault

Information for synchronization credentials with external vault

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceAuthMethod** | [**SourceAuthMethodEnum**](#SourceAuthMethodEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;HASHICORP_VAULT_APPROLE&#x60; -&gt; HashicorpApprole  * &#x60;HASHICORP_VAULT_CERTIFICATE&#x60; -&gt; HashicorpCertificate  * &#x60;AZURE_KEY_VAULT_CLIENT_SECRET&#x60; -&gt; AzureClientSecret   |  [optional] |
|**vaultUrl** | **String** | External vault URL. |  [optional] |
|**usernameSecretName** | **String** | The name of the secret saved in external vault where username is stored. |  [optional] |
|**passwordSecretName** | **String** | The name of the secret saved in external vault where password is stored. |  [optional] |
|**tokenSecretName** | **String** | The name of the secret saved in external vault where token is stored. |  [optional] |



## Enum: SourceAuthMethodEnum

| Name | Value |
|---- | -----|
| AZURE_KEY_VAULT_CLIENT_SECRET | &quot;AZURE_KEY_VAULT_CLIENT_SECRET&quot; |
| HASHICORP_VAULT_APPROLE | &quot;HASHICORP_VAULT_APPROLE&quot; |
| HASHICORP_VAULT_CERTIFICATE | &quot;HASHICORP_VAULT_CERTIFICATE&quot; |



