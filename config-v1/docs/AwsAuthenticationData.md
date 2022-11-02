

# AwsAuthenticationData

A credentials for the AWS authentication.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the authentication: role-based or key-based. |  |
|**keyBasedAuthentication** | [**KeyBasedAuthentication**](KeyBasedAuthentication.md) |  |  [optional] |
|**roleBasedAuthentication** | [**RoleBasedAuthentication**](RoleBasedAuthentication.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| KEYS | &quot;KEYS&quot; |
| ROLE | &quot;ROLE&quot; |



