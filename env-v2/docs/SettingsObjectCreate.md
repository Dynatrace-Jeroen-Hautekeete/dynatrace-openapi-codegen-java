

# SettingsObjectCreate

Configuration of a new settings object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemaVersion** | **String** | The version of the schema on which the object is based. |  [optional] |
|**insertAfter** | **String** | The position of the new object. The new object will be added after the specified one.   If &#x60;null&#x60;, the new object will be placed in the last position.   If set to empty string, the new object will be placed in the first position.   Only applicable for objects based on schemas with ordered objects (schema&#39;s **ordered** parameter is set to &#x60;true&#x60;). |  [optional] |
|**externalId** | **String** | External identifier for the object being created |  [optional] |
|**schemaId** | **String** | The schema on which the object is based. |  |
|**scope** | **String** | The scope that the object targets.  If omitted on creation of a new object and if the schema supports scope generation, the operation will generate a scope from the provided value. |  [optional] |
|**value** | **Object** | The value of the setting.    It defines the actual values of settings&#39; parameters.   The actual content depends on the object&#39;s schema. |  |



