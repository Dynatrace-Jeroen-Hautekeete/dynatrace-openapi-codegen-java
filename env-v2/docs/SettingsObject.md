

# SettingsObject

A settings object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** | The version of the schema on which the object is based. |  [optional] |
|**updateToken** | **String** | The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn&#39;t any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks. |  [optional] |
|**modified** | **Long** | The timestamp of the last modification. |  [optional] |
|**externalId** | **String** | The external identifier of the settings object. |  [optional] |
|**author** | **String** | The user (identified by a user ID or a public token ID) who performed that most recent modification. |  [optional] |
|**schemaId** | **String** | The schema on which the object is based. |  [optional] |
|**scope** | **String** | The scope that the object targets. |  [optional] |
|**value** | **Object** | The value of the setting.    It defines the actual values of settings&#39; parameters.   The actual content depends on the object&#39;s schema. |  [optional] |
|**created** | **Long** | The timestamp of the creation. |  [optional] |
|**summary** | **String** | A short summary of settings. |  [optional] |
|**objectId** | **String** | The ID of the settings object. |  [optional] |



