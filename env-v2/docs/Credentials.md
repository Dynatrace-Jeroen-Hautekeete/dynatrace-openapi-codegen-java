

# Credentials

A set of credentials for synthetic monitors.   The actual set of fields depends on the type of credentials. Find the list of actual objects in the description of the **type** field or see [Credential vault API - JSON models](https://dt-url.net/2sa3sen).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the credentials set. |  |
|**id** | **String** | The ID of the credentials set. |  [optional] |
|**description** | **String** | A short description of the credentials set. |  [optional] |
|**ownerAccessOnly** | **Boolean** | The credentials set is available to every user (&#x60;false&#x60;) or to owner only (&#x60;true&#x60;). |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | The scope of the credentials set. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;CERTIFICATE&#x60; -&gt; CertificateCredentials  * &#x60;PUBLIC_CERTIFICATE&#x60; -&gt; PublicCertificateCredentials  * &#x60;USERNAME_PASSWORD&#x60; -&gt; UserPasswordCredentials  * &#x60;TOKEN&#x60; -&gt; TokenCredentials   |  [optional] |



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
| USERNAME_PASSWORD | &quot;USERNAME_PASSWORD&quot; |



