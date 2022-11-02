

# HashicorpApprole

Synchronization credentials with HashiCorp Vault using appRole authentication method

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pathToCredentials** | **String** | Path to folder where credentials in HashiCorp Vault are stored. |  |
|**roleId** | **String** | Role ID is similar to username when you want to authenticate in HashiCorp Vault using AppRole. |  |
|**secretId** | **String** | Secret ID is similar to password when you want to authenticate in HashiCorp Vault using AppRole. ID of token representing secret ID saved in Dynatrace CV. |  |
|**vaultNamespace** | **String** | Vault namespace in HashiCorp Vault. It is an information you set as environmental variable VAULT_NAMESPACE if you are accessing HashiCorp Vault from command line. |  |



