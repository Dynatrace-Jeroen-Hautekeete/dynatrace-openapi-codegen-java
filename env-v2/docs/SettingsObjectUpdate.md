

# SettingsObjectUpdate

An update of a settings object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**insertBefore** | **String** | The position of the updated object. The new object will be moved in front of the specified one.   **insertAfter** and **insertBefore** are evaluated together and only one of both can be set.   If &#x60;null&#x60; and **insertAfter** &#39;null&#39;, the existing object keeps the current position.   If set to empty string, the updated object will be placed in the last position.   Only applicable for objects based on schemas with ordered objects (schema&#39;s **ordered** parameter is set to &#x60;true&#x60;). |  [optional] |
|**schemaVersion** | **String** | The version of the schema on which the object is based. |  [optional] |
|**updateToken** | **String** | The update token of the object. You can use it to detect simultaneous modifications by different users.   It is generated upon retrieval (GET requests). If set on update (PUT request) or deletion, the update/deletion will be allowed only if there wasn&#39;t any change between the retrieval and the update.   If omitted on update/deletion, the operation overrides the current value or deletes it without any checks. |  [optional] |
|**insertAfter** | **String** | The position of the updated object. The new object will be moved behind the specified one.   **insertAfter** and **insertBefore** are evaluated together and only one of both can be set.   If &#x60;null&#x60; and **insertBefore** &#39;null&#39;, the existing object keeps the current position.   If set to empty string, the updated object will be placed in the first position.   Only applicable for objects based on schemas with ordered objects (schema&#39;s **ordered** parameter is set to &#x60;true&#x60;). |  [optional] |
|**value** | **Object** | The value of the setting.    It defines the actual values of settings&#39; parameters.   The actual content depends on the object&#39;s schema. |  |



