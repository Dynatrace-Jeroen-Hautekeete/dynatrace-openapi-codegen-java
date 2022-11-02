

# SettingsObjectResponse

The response to a creation- or update-request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invalidValue** | **Object** | The value of the setting.    It defines the actual values of settings&#39; parameters.   The actual content depends on the object&#39;s schema. |  [optional] |
|**code** | **Integer** | The HTTP status code for the object. |  |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**objectId** | **String** | For a successful request, the ID of the created or modified settings object. |  [optional] |



