

# AuditLogEntry

An entry of the audit log.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logId** | **String** | The ID of the log entry. |  [readonly] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the recorded operation. |  [readonly] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The category of the recorded operation. |  [readonly] |
|**entityId** | **String** | The ID of an entity from the **category**.   For example, it can be config ID for the &#x60;CONFIG&#x60; category or token ID for the &#x60;TOKEN&#x60; category. |  [optional] [readonly] |
|**environmentId** | **String** | The ID of the Dynatrace environment where the recorded operation occurred. |  [readonly] |
|**user** | **String** | The ID of the user who performed the recorded operation. |  [readonly] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | The type of the authentication of the **user**. |  [readonly] |
|**userOrigin** | **String** | The origin and the IP address of the **user**. |  [optional] [readonly] |
|**timestamp** | **Long** | The timestamp of the record creation, in UTC milliseconds. |  [readonly] |
|**success** | **Boolean** | The recorded operation is successful (&#x60;true&#x60;) or failed (&#x60;false&#x60;). |  [readonly] |
|**message** | **String** | The logged message. |  [optional] [readonly] |
|**patch** | **Object** | The patch of the recorded operation as the JSON representation.   The format is an enhanced RFC 6902. The patch also carries the previous value in the **oldValue** field. |  [optional] [readonly] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| DELETE | &quot;DELETE&quot; |
| GENERAL | &quot;GENERAL&quot; |
| GET | &quot;GET&quot; |
| LOGIN | &quot;LOGIN&quot; |
| LOGOUT | &quot;LOGOUT&quot; |
| PATCH | &quot;PATCH&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| READ | &quot;READ&quot; |
| REVOKE | &quot;REVOKE&quot; |
| TAG_ADD | &quot;TAG_ADD&quot; |
| TAG_REMOVE | &quot;TAG_REMOVE&quot; |
| TAG_UPDATE | &quot;TAG_UPDATE&quot; |
| UPDATE | &quot;UPDATE&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CONFIG | &quot;CONFIG&quot; |
| DEBUG_UI | &quot;DEBUG_UI&quot; |
| MANUAL_TAGGING_SERVICE | &quot;MANUAL_TAGGING_SERVICE&quot; |
| TOKEN | &quot;TOKEN&quot; |
| WEB_UI | &quot;WEB_UI&quot; |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| PUBLIC_TOKEN_IDENTIFIER | &quot;PUBLIC_TOKEN_IDENTIFIER&quot; |
| REQUEST_ID | &quot;REQUEST_ID&quot; |
| SERVICE_NAME | &quot;SERVICE_NAME&quot; |
| TOKEN_HASH | &quot;TOKEN_HASH&quot; |
| USER_NAME | &quot;USER_NAME&quot; |



