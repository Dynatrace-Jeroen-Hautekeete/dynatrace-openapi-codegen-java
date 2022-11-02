

# Placeholder

The custom placeholder to be used as a naming value pattern.    It enables you to extract a request attribute value or other request attribute and use it in the naming pattern.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the placeholder. Use it in the naming pattern as &#x60;{name}&#x60;. |  |
|**attribute** | [**AttributeEnum**](#AttributeEnum) | The attribute to extract from. You can only use attributes of the **string** type. |  |
|**kind** | [**KindEnum**](#KindEnum) | The type of extraction.    Defines either usage of regular expression (&#x60;regex&#x60;) or the position of request attribute value to be extracted.   When the **attribute** is &#x60;SERVICE_REQUEST_ATTRIBUTE&#x60; attribute and **aggregation** is &#x60;COUNT&#x60;, needs to be set to &#x60;ORIGINAL_TEXT&#x60; |  |
|**delimiterOrRegex** | **String** | Depending on the **type** value:    * &#x60;REGEX_EXTRACTION&#x60;: The regular expression.   * &#x60;BETWEEN_DELIMITER&#x60;: The opening delimiter string to look for.   * All other values: The delimiter string to look for. |  [optional] |
|**endDelimiter** | **String** | The closing delimiter string to look for.    Required if the **kind** value is &#x60;BETWEEN_DELIMITER&#x60;. Not applicable otherwise. |  [optional] |
|**requestAttribute** | **String** | The request attribute to extract from.    Required if the **kind** value is &#x60;SERVICE_REQUEST_ATTRIBUTE&#x60;. Not applicable otherwise. |  [optional] |
|**normalization** | [**NormalizationEnum**](#NormalizationEnum) | The format of the extracted string. |  [optional] |
|**useFromChildCalls** | **Boolean** | If &#x60;true&#x60; request attribute will be taken from a child service call.    Only applicable for the &#x60;SERVICE_REQUEST_ATTRIBUTE&#x60; attribute. Defaults to &#x60;false&#x60;. |  [optional] |
|**aggregation** | [**AggregationEnum**](#AggregationEnum) | Which value of the request attribute must be used when it occurs across multiple child requests.   Only applicable for the &#x60;SERVICE_REQUEST_ATTRIBUTE&#x60; attribute, when **useFromChildCalls** is &#x60;true&#x60;.   For the &#x60;COUNT&#x60; aggregation, the **kind** field is not applicable. |  [optional] |
|**source** | [**PropagationSource**](PropagationSource.md) |  |  [optional] |



## Enum: AttributeEnum

| Name | Value |
|---- | -----|
| ACTOR_SYSTEM | &quot;ACTOR_SYSTEM&quot; |
| AKKA_ACTOR_CLASS_NAME | &quot;AKKA_ACTOR_CLASS_NAME&quot; |
| AKKA_ACTOR_MESSAGE_TYPE | &quot;AKKA_ACTOR_MESSAGE_TYPE&quot; |
| AKKA_ACTOR_PATH | &quot;AKKA_ACTOR_PATH&quot; |
| APPLICATION_BUILD_VERSION | &quot;APPLICATION_BUILD_VERSION&quot; |
| APPLICATION_ENVIRONMENT | &quot;APPLICATION_ENVIRONMENT&quot; |
| APPLICATION_NAME | &quot;APPLICATION_NAME&quot; |
| APPLICATION_RELEASE_VERSION | &quot;APPLICATION_RELEASE_VERSION&quot; |
| AZURE_FUNCTIONS_FUNCTION_NAME | &quot;AZURE_FUNCTIONS_FUNCTION_NAME&quot; |
| AZURE_FUNCTIONS_SITE_NAME | &quot;AZURE_FUNCTIONS_SITE_NAME&quot; |
| CICS_PROGRAM_NAME | &quot;CICS_PROGRAM_NAME&quot; |
| CICS_SYSTEM_ID | &quot;CICS_SYSTEM_ID&quot; |
| CICS_TASK_ID | &quot;CICS_TASK_ID&quot; |
| CICS_TRANSACTION_ID | &quot;CICS_TRANSACTION_ID&quot; |
| CICS_USER_ID | &quot;CICS_USER_ID&quot; |
| CPU_TIME | &quot;CPU_TIME&quot; |
| CTG_GATEWAY_URL | &quot;CTG_GATEWAY_URL&quot; |
| CTG_PROGRAM | &quot;CTG_PROGRAM&quot; |
| CTG_SERVER_NAME | &quot;CTG_SERVER_NAME&quot; |
| CTG_TRANSACTION_ID | &quot;CTG_TRANSACTION_ID&quot; |
| CUSTOMSERVICE_CLASS | &quot;CUSTOMSERVICE_CLASS&quot; |
| CUSTOMSERVICE_METHOD | &quot;CUSTOMSERVICE_METHOD&quot; |
| DATABASE_CHILD_CALL_COUNT | &quot;DATABASE_CHILD_CALL_COUNT&quot; |
| DATABASE_CHILD_CALL_TIME | &quot;DATABASE_CHILD_CALL_TIME&quot; |
| DATABASE_HOST | &quot;DATABASE_HOST&quot; |
| DATABASE_NAME | &quot;DATABASE_NAME&quot; |
| DATABASE_STATEMENT | &quot;DATABASE_STATEMENT&quot; |
| DATABASE_TYPE | &quot;DATABASE_TYPE&quot; |
| DATABASE_URL | &quot;DATABASE_URL&quot; |
| DISK_IO_TIME | &quot;DISK_IO_TIME&quot; |
| ERROR_COUNT | &quot;ERROR_COUNT&quot; |
| ESB_APPLICATION_NAME | &quot;ESB_APPLICATION_NAME&quot; |
| ESB_INPUT_TYPE | &quot;ESB_INPUT_TYPE&quot; |
| ESB_LIBRARY_NAME | &quot;ESB_LIBRARY_NAME&quot; |
| ESB_MESSAGE_FLOW_NAME | &quot;ESB_MESSAGE_FLOW_NAME&quot; |
| EXCEPTION_CLASS | &quot;EXCEPTION_CLASS&quot; |
| EXCEPTION_MESSAGE | &quot;EXCEPTION_MESSAGE&quot; |
| FAILED_STATE | &quot;FAILED_STATE&quot; |
| FAILURE_REASON | &quot;FAILURE_REASON&quot; |
| FLAW_STATE | &quot;FLAW_STATE&quot; |
| HTTP_REQUEST_METHOD | &quot;HTTP_REQUEST_METHOD&quot; |
| HTTP_STATUS | &quot;HTTP_STATUS&quot; |
| HTTP_STATUS_CLASS | &quot;HTTP_STATUS_CLASS&quot; |
| IMS_PROGRAM_NAME | &quot;IMS_PROGRAM_NAME&quot; |
| IMS_TRANSACTION_ID | &quot;IMS_TRANSACTION_ID&quot; |
| IMS_USER_ID | &quot;IMS_USER_ID&quot; |
| IO_TIME | &quot;IO_TIME&quot; |
| IS_KEY_REQUEST | &quot;IS_KEY_REQUEST&quot; |
| LAMBDA_COLDSTART | &quot;LAMBDA_COLDSTART&quot; |
| LOCK_TIME | &quot;LOCK_TIME&quot; |
| MESSAGING_DESTINATION_TYPE | &quot;MESSAGING_DESTINATION_TYPE&quot; |
| MESSAGING_IS_TEMPORARY_QUEUE | &quot;MESSAGING_IS_TEMPORARY_QUEUE&quot; |
| MESSAGING_QUEUE_NAME | &quot;MESSAGING_QUEUE_NAME&quot; |
| MESSAGING_QUEUE_VENDOR | &quot;MESSAGING_QUEUE_VENDOR&quot; |
| NETWORK_IO_TIME | &quot;NETWORK_IO_TIME&quot; |
| NON_DATABASE_CHILD_CALL_COUNT | &quot;NON_DATABASE_CHILD_CALL_COUNT&quot; |
| NON_DATABASE_CHILD_CALL_TIME | &quot;NON_DATABASE_CHILD_CALL_TIME&quot; |
| PROCESS_GROUP_NAME | &quot;PROCESS_GROUP_NAME&quot; |
| PROCESS_GROUP_TAG | &quot;PROCESS_GROUP_TAG&quot; |
| REMOTE_ENDPOINT | &quot;REMOTE_ENDPOINT&quot; |
| REMOTE_METHOD | &quot;REMOTE_METHOD&quot; |
| REMOTE_SERVICE_NAME | &quot;REMOTE_SERVICE_NAME&quot; |
| REQUEST_NAME | &quot;REQUEST_NAME&quot; |
| REQUEST_TYPE | &quot;REQUEST_TYPE&quot; |
| RESPONSE_TIME | &quot;RESPONSE_TIME&quot; |
| RESPONSE_TIME_CLIENT | &quot;RESPONSE_TIME_CLIENT&quot; |
| RMI_CLASS | &quot;RMI_CLASS&quot; |
| RMI_METHOD | &quot;RMI_METHOD&quot; |
| SERVICE_DISPLAY_NAME | &quot;SERVICE_DISPLAY_NAME&quot; |
| SERVICE_NAME | &quot;SERVICE_NAME&quot; |
| SERVICE_PORT | &quot;SERVICE_PORT&quot; |
| SERVICE_PUBLIC_DOMAIN_NAME | &quot;SERVICE_PUBLIC_DOMAIN_NAME&quot; |
| SERVICE_REQUEST_ATTRIBUTE | &quot;SERVICE_REQUEST_ATTRIBUTE&quot; |
| SERVICE_TAG | &quot;SERVICE_TAG&quot; |
| SERVICE_TYPE | &quot;SERVICE_TYPE&quot; |
| SERVICE_WEB_APPLICATION_ID | &quot;SERVICE_WEB_APPLICATION_ID&quot; |
| SERVICE_WEB_CONTEXT_ROOT | &quot;SERVICE_WEB_CONTEXT_ROOT&quot; |
| SERVICE_WEB_SERVER_NAME | &quot;SERVICE_WEB_SERVER_NAME&quot; |
| SERVICE_WEB_SERVICE_NAME | &quot;SERVICE_WEB_SERVICE_NAME&quot; |
| SERVICE_WEB_SERVICE_NAMESPACE | &quot;SERVICE_WEB_SERVICE_NAMESPACE&quot; |
| SUSPENSION_TIME | &quot;SUSPENSION_TIME&quot; |
| TOTAL_PROCESSING_TIME | &quot;TOTAL_PROCESSING_TIME&quot; |
| WAIT_TIME | &quot;WAIT_TIME&quot; |
| WEBREQUEST_QUERY | &quot;WEBREQUEST_QUERY&quot; |
| WEBREQUEST_RELATIVE_URL | &quot;WEBREQUEST_RELATIVE_URL&quot; |
| WEBREQUEST_URL | &quot;WEBREQUEST_URL&quot; |
| WEBREQUEST_URL_HOST | &quot;WEBREQUEST_URL_HOST&quot; |
| WEBREQUEST_URL_PATH | &quot;WEBREQUEST_URL_PATH&quot; |
| WEBREQUEST_URL_PORT | &quot;WEBREQUEST_URL_PORT&quot; |
| WEBSERVICE_ENDPOINT | &quot;WEBSERVICE_ENDPOINT&quot; |
| WEBSERVICE_METHOD | &quot;WEBSERVICE_METHOD&quot; |
| ZOS_CALL_TYPE | &quot;ZOS_CALL_TYPE&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| AFTER_DELIMITER | &quot;AFTER_DELIMITER&quot; |
| BEFORE_DELIMITER | &quot;BEFORE_DELIMITER&quot; |
| BETWEEN_DELIMITER | &quot;BETWEEN_DELIMITER&quot; |
| ORIGINAL_TEXT | &quot;ORIGINAL_TEXT&quot; |
| REGEX_EXTRACTION | &quot;REGEX_EXTRACTION&quot; |



## Enum: NormalizationEnum

| Name | Value |
|---- | -----|
| ORIGINAL | &quot;ORIGINAL&quot; |
| TO_LOWER_CASE | &quot;TO_LOWER_CASE&quot; |
| TO_UPPER_CASE | &quot;TO_UPPER_CASE&quot; |



## Enum: AggregationEnum

| Name | Value |
|---- | -----|
| COUNT | &quot;COUNT&quot; |
| FIRST | &quot;FIRST&quot; |
| LAST | &quot;LAST&quot; |



