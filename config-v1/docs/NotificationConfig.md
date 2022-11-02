

# NotificationConfig

Configuration of a notification. The actual set of fields depends on the `type` of the notification. See [Notifications API - JSON models](https://dt-url.net/9qm3k5u) in Dynatrace Documentation for example models of every notification type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the notification configuration. |  [optional] |
|**name** | **String** | The name of the notification configuration. |  |
|**alertingProfile** | **UUID** | The ID of the associated alerting profile. |  |
|**active** | **Boolean** | The configuration is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;EMAIL&#x60; -&gt; EmailNotificationConfig  * &#x60;PAGER_DUTY&#x60; -&gt; PagerDutyNotificationConfig  * &#x60;WEBHOOK&#x60; -&gt; WebHookNotificationConfig  * &#x60;SLACK&#x60; -&gt; SlackNotificationConfig  * &#x60;VICTOROPS&#x60; -&gt; VictorOpsNotificationConfig  * &#x60;SERVICE_NOW&#x60; -&gt; ServiceNowNotificationConfig  * &#x60;XMATTERS&#x60; -&gt; XMattersNotificationConfig  * &#x60;ANSIBLETOWER&#x60; -&gt; AnsibleTowerNotificationConfig  * &#x60;OPS_GENIE&#x60; -&gt; OpsGenieNotificationConfig  * &#x60;JIRA&#x60; -&gt; JiraNotificationConfig  * &#x60;TRELLO&#x60; -&gt; TrelloNotificationConfig   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ANSIBLETOWER | &quot;ANSIBLETOWER&quot; |
| EMAIL | &quot;EMAIL&quot; |
| JIRA | &quot;JIRA&quot; |
| OPS_GENIE | &quot;OPS_GENIE&quot; |
| PAGER_DUTY | &quot;PAGER_DUTY&quot; |
| SERVICE_NOW | &quot;SERVICE_NOW&quot; |
| SLACK | &quot;SLACK&quot; |
| TRELLO | &quot;TRELLO&quot; |
| VICTOROPS | &quot;VICTOROPS&quot; |
| WEBHOOK | &quot;WEBHOOK&quot; |
| XMATTERS | &quot;XMATTERS&quot; |



