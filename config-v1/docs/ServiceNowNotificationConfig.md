

# ServiceNowNotificationConfig

Configuration of the ServiceNow notification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instanceName** | **String** | The ServiceNow instance identifier. It refers to the first part of your own ServiceNow URL.    This field is mutually exclusive with the **url** field. You can only use one of them. |  [optional] |
|**url** | **String** | The URL of the on-premise ServiceNow installation.    This field is mutually exclusive with the **instanceName** field. You can only use one of them. |  [optional] |
|**username** | **String** | The username of the ServiceNow account.    Make sure that your user account has the &#x60;rest_service&#x60;, &#x60;web_request_admin&#x60;, and &#x60;x_dynat_ruxit.Integration&#x60; roles. |  |
|**password** | **String** | The username to the ServiceNow account |  [optional] |
|**message** | **String** | The content of the ServiceNow description.     You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsHTML}&#x60;: All problem event details, including root cause, as an HTML-formatted string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.   |  |
|**sendIncidents** | **Boolean** | Send incidents into ServiceNow ITSM (&#x60;true&#x60;). |  |
|**sendEvents** | **Boolean** | Send events into ServiceNow ITOM (&#x60;true&#x60;). |  |


