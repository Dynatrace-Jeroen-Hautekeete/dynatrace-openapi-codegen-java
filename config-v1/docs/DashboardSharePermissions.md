

# DashboardSharePermissions

Access permissions of the dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the user or group to whom the permission is granted.  Not applicable if the **type** is set to &#x60;ALL&#x60;. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the permission:   * &#x60;USER&#x60;: The dashboard is shared with the specified user.  * &#x60;GROUP&#x60;: The dashboard is shared with all users of the specified group.  * &#x60;ALL&#x60;: The dashboard is shared via link. Any authenticated user with the link can view the dashboard. |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | The level of the permission:    * &#x60;VIEW&#x60;: The dashboard is shared with read permission.  * &#x60;EDIT&#x60;: The dashboard is shared with edit permission.   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| GROUP | &quot;GROUP&quot; |
| USER | &quot;USER&quot; |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| EDIT | &quot;EDIT&quot; |
| VIEW | &quot;VIEW&quot; |



