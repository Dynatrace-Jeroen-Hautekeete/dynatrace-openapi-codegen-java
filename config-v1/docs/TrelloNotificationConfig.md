

# TrelloNotificationConfig

Configuration of the Trello notification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationKey** | **String** | The application key for the Trello account. |  |
|**authorizationToken** | **String** | The application token for the Trello account. |  [optional] |
|**boardId** | **String** | The Trello board to which the card should be assigned. |  |
|**listId** | **String** | The Trello list to which the card should be assigned. |  |
|**resolvedListId** | **String** | The Trello list to which the card of the resolved problem should be assigned. |  |
|**text** | **String** | The text of the generated Trello card.   You can use the following placeholders:  * &#x60;{ImpactedEntity}&#x60;: The entity impacted by the problem or *X* impacted entities.  * &#x60;{PID}&#x60;: The ID of the reported problem.  * &#x60;{ProblemDetailsMarkdown}&#x60;: All problem event details, including root cause, as a [Markdown-formatted](https://dt-url.net/1yk3kkq) string.  * &#x60;{ProblemID}&#x60;: The display number of the reported problem.  * &#x60;{ProblemImpact}&#x60;: The [impact level](https://dt-url.net/klg3k4q) of the problem. Possible values are &#x60;APPLICATION&#x60;, &#x60;SERVICE&#x60;, and &#x60;INFRASTRUCTURE&#x60;.  * &#x60;{ProblemSeverity}&#x60;: The [severity level](https://dt-url.net/f1i3k5b) of the problem. Possible values are &#x60;AVAILABILITY&#x60;, &#x60;ERROR&#x60;, &#x60;PERFORMANCE&#x60;, &#x60;RESOURCE_CONTENTION&#x60;, and &#x60;CUSTOM_ALERT&#x60;.  * &#x60;{ProblemTitle}&#x60;: A short description of the problem.  * &#x60;{ProblemURL}&#x60;: The URL of the problem within Dynatrace.  * &#x60;{State}&#x60;: The state of the problem. Possible values are &#x60;OPEN&#x60; and &#x60;RESOLVED&#x60;.  * &#x60;{Tags}&#x60;: The list of tags that are defined for all impacted entities, separated by commas.   |  |
|**description** | **String** | The description of the Trello card.    You can use same placeholders as in card text. |  |


