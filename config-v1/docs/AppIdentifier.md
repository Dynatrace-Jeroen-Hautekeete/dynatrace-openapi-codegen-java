

# AppIdentifier

The appId, the app version and the bundle id which uniquely identify the app

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The id where the file belongs to |  [optional] |
|**versionCode** | **String** | The version code (Android) / bundle version (iOS) the file belongs to |  |
|**versionName** | **String** | The version name (Android) / bundle versions string (iOS) the file belongs to |  |
|**packageName** | **String** | The bundleId (iOS) or package name (Android) the file belongs to |  [optional] |
|**os** | [**OsEnum**](#OsEnum) | The operating system where the file belongs to |  [optional] |



## Enum: OsEnum

| Name | Value |
|---- | -----|
| ANDROID | &quot;ANDROID&quot; |
| IOS | &quot;IOS&quot; |
| TVOS | &quot;TVOS&quot; |



