

# DataSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | The data source is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**source** | [**SourceEnum**](#SourceEnum) | The source of the attribute to capture. Works in conjunction with **parameterName** or **methods** and **technology**. |  |
|**valueProcessing** | [**ValueProcessing**](ValueProcessing.md) |  |  [optional] |
|**technology** | [**TechnologyEnum**](#TechnologyEnum) | The technology of the method to capture if the **source** value is &#x60;METHOD_PARAM&#x60;. \\n\\n Not applicable in other cases. |  [optional] |
|**sessionAttributeTechnology** | [**SessionAttributeTechnologyEnum**](#SessionAttributeTechnologyEnum) | The technology of the session attribute to capture if the **source** value is &#x60;SESSION_ATTRIBUTE&#x60;. \\n\\n Not applicable in other cases. |  [optional] |
|**serverVariableTechnology** | [**ServerVariableTechnologyEnum**](#ServerVariableTechnologyEnum) | The technology of the server variable to capture if the **source** value is &#x60;SERVER_VARIABLE&#x60;. \\n\\n Not applicable in other cases. |  [optional] |
|**methods** | [**List&lt;CapturedMethod&gt;**](CapturedMethod.md) | The method specification if the **source** value is &#x60;METHOD_PARAM&#x60;.    Not applicable in other cases. |  [optional] |
|**parameterName** | **String** | The name of the web request parameter to capture.   Required if the **source** is one of the following: &#x60;POST_PARAMETER&#x60;, &#x60;GET_PARAMETER&#x60;, &#x60;REQUEST_HEADER&#x60;, &#x60;RESPONSE_HEADER&#x60;, &#x60;CUSTOM_ATTRIBUTE&#x60;.   Not applicable in other cases. |  [optional] |
|**scope** | [**ScopeConditions**](ScopeConditions.md) |  |  [optional] |
|**capturingAndStorageLocation** | [**CapturingAndStorageLocationEnum**](#CapturingAndStorageLocationEnum) | Specifies the location where the values are captured and stored.   Required if the **source** is one of the following: &#x60;GET_PARAMETER&#x60;, &#x60;URI&#x60;, &#x60;REQUEST_HEADER&#x60;, &#x60;RESPONSE_HEADER&#x60;.    Not applicable in other cases.    If the **source** value is &#x60;REQUEST_HEADER&#x60; or &#x60;RESPONSE_HEADER&#x60;, the &#x60;CAPTURE_AND_STORE_ON_BOTH&#x60; location is not allowed. |  [optional] |
|**iibNodeType** | [**IibNodeTypeEnum**](#IibNodeTypeEnum) | The IBM integration bus node type for which the value is captured.   This or &#x60;iibMethodNodeCondition&#x60; is required if the **source** is: &#x60;IIB_NODE&#x60;.   Not applicable in other cases. |  [optional] |
|**iibMethodNodeCondition** | [**ValueCondition**](ValueCondition.md) |  |  [optional] |
|**cicsSDKMethodNodeCondition** | [**ValueCondition**](ValueCondition.md) |  |  [optional] |
|**iibLabelMethodNodeCondition** | [**ValueCondition**](ValueCondition.md) |  |  [optional] |
|**spanAttributeKey** | **String** | The key of the span attribute to capture.   Required if the **source** is: &#x60;SPAN_ATTRIBUTE&#x60;.   Not applicable in other cases. |  [optional] |
|**cicsTransactionCallType** | [**CicsTransactionCallTypeEnum**](#CicsTransactionCallTypeEnum) | CICS transaction call type condition for which the value is captured.   Required if the **source** is: &#x60;CICS_TRANSACTION_CALL_TYPE&#x60;.   Not applicable in other cases. |  [optional] |
|**imsTransactionCallType** | [**ImsTransactionCallTypeEnum**](#ImsTransactionCallTypeEnum) | IMS transaction call type condition for which the value is captured.   Required if the **source** is: &#x60;IMS_TRANSACTION_CALL_TYPE&#x60;.   Not applicable in other cases. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| CICS_SDK | &quot;CICS_SDK&quot; |
| CICS_SYSTEM_ID | &quot;CICS_SYSTEM_ID&quot; |
| CICS_TASK_ID | &quot;CICS_TASK_ID&quot; |
| CICS_TRANSACTION_CALL_TYPE | &quot;CICS_TRANSACTION_CALL_TYPE&quot; |
| CLIENT_IP | &quot;CLIENT_IP&quot; |
| CUSTOM_ATTRIBUTE | &quot;CUSTOM_ATTRIBUTE&quot; |
| DLI_DB_OR_LTERM_NAME | &quot;DLI_DB_OR_LTERM_NAME&quot; |
| DLI_SEGMENT_NAME | &quot;DLI_SEGMENT_NAME&quot; |
| IIB_LABEL | &quot;IIB_LABEL&quot; |
| IIB_NODE | &quot;IIB_NODE&quot; |
| IMS_TRANSACTION_CALL_TYPE | &quot;IMS_TRANSACTION_CALL_TYPE&quot; |
| METHOD_PARAM | &quot;METHOD_PARAM&quot; |
| MQ_CORRELATION_ID | &quot;MQ_CORRELATION_ID&quot; |
| MQ_MESSAGE_ID | &quot;MQ_MESSAGE_ID&quot; |
| MQ_MESSAGE_SIZE | &quot;MQ_MESSAGE_SIZE&quot; |
| POST_PARAMETER | &quot;POST_PARAMETER&quot; |
| QUERY_PARAMETER | &quot;QUERY_PARAMETER&quot; |
| REQUEST_HEADER | &quot;REQUEST_HEADER&quot; |
| RESPONSE_HEADER | &quot;RESPONSE_HEADER&quot; |
| SERVER_VARIABLE | &quot;SERVER_VARIABLE&quot; |
| SESSION_ATTRIBUTE | &quot;SESSION_ATTRIBUTE&quot; |
| SPAN_ATTRIBUTE | &quot;SPAN_ATTRIBUTE&quot; |
| URI | &quot;URI&quot; |
| URI_PATH | &quot;URI_PATH&quot; |
| WEBSERVICE_METHOD | &quot;WEBSERVICE_METHOD&quot; |
| WEBSERVICE_NAME | &quot;WEBSERVICE_NAME&quot; |



## Enum: TechnologyEnum

| Name | Value |
|---- | -----|
| DOTNET | &quot;DOTNET&quot; |
| JAVA | &quot;JAVA&quot; |
| PHP | &quot;PHP&quot; |



## Enum: SessionAttributeTechnologyEnum

| Name | Value |
|---- | -----|
| ASP_NET | &quot;ASP_NET&quot; |
| ASP_NET_CORE | &quot;ASP_NET_CORE&quot; |
| JAVA | &quot;JAVA&quot; |
| PHP | &quot;PHP&quot; |



## Enum: ServerVariableTechnologyEnum

| Name | Value |
|---- | -----|
| ASP_NET | &quot;ASP_NET&quot; |



## Enum: CapturingAndStorageLocationEnum

| Name | Value |
|---- | -----|
| AND_STORE_ON_BOTH | &quot;CAPTURE_AND_STORE_ON_BOTH&quot; |
| AND_STORE_ON_CLIENT | &quot;CAPTURE_AND_STORE_ON_CLIENT&quot; |
| AND_STORE_ON_SERVER | &quot;CAPTURE_AND_STORE_ON_SERVER&quot; |
| ON_CLIENT_STORE_ON_SERVER | &quot;CAPTURE_ON_CLIENT_STORE_ON_SERVER&quot; |



## Enum: IibNodeTypeEnum

| Name | Value |
|---- | -----|
| AGGREGATE_CONTROL_NODE | &quot;AGGREGATE_CONTROL_NODE&quot; |
| AGGREGATE_REPLY_NODE | &quot;AGGREGATE_REPLY_NODE&quot; |
| AGGREGATE_REQUEST_NODE | &quot;AGGREGATE_REQUEST_NODE&quot; |
| CALLABLE_FLOW_REPLY_NODE | &quot;CALLABLE_FLOW_REPLY_NODE&quot; |
| COLLECTOR_NODE | &quot;COLLECTOR_NODE&quot; |
| COMPUTE_NODE | &quot;COMPUTE_NODE&quot; |
| DATABASE_NODE | &quot;DATABASE_NODE&quot; |
| DATABASE_RETRIEVE_NODE | &quot;DATABASE_RETRIEVE_NODE&quot; |
| DATABASE_ROUTE_NODE | &quot;DATABASE_ROUTE_NODE&quot; |
| DECISION_SERVICE_NODE | &quot;DECISION_SERVICE_NODE&quot; |
| DOT_NET_COMPUTE_NODE | &quot;DOT_NET_COMPUTE_NODE&quot; |
| FILE_READ_NODE | &quot;FILE_READ_NODE&quot; |
| FILTER_NODE | &quot;FILTER_NODE&quot; |
| FLOW_ORDER_NODE | &quot;FLOW_ORDER_NODE&quot; |
| GROUP_COMPLETE_NODE | &quot;GROUP_COMPLETE_NODE&quot; |
| GROUP_GATHER_NODE | &quot;GROUP_GATHER_NODE&quot; |
| GROUP_SCATTER_NODE | &quot;GROUP_SCATTER_NODE&quot; |
| HTTP_ASYNC_REQUEST | &quot;HTTP_ASYNC_REQUEST&quot; |
| HTTP_ASYNC_RESPONSE | &quot;HTTP_ASYNC_RESPONSE&quot; |
| HTTP_HEADER | &quot;HTTP_HEADER&quot; |
| HTTP_INPUT | &quot;HTTP_INPUT&quot; |
| HTTP_REPLY | &quot;HTTP_REPLY&quot; |
| HTTP_REQUEST | &quot;HTTP_REQUEST&quot; |
| JAVA_COMPUTE_NODE | &quot;JAVA_COMPUTE_NODE&quot; |
| JMS_CLIENT_RECEIVE | &quot;JMS_CLIENT_RECEIVE&quot; |
| JMS_CLIENT_REPLY_NODE | &quot;JMS_CLIENT_REPLY_NODE&quot; |
| JMS_HEADER | &quot;JMS_HEADER&quot; |
| JMS_INPUT_NODE | &quot;JMS_INPUT_NODE&quot; |
| JMS_OUTPUT_NODE | &quot;JMS_OUTPUT_NODE&quot; |
| JMS_REPLY_NODE | &quot;JMS_REPLY_NODE&quot; |
| MQ_GET_NODE | &quot;MQ_GET_NODE&quot; |
| MQ_INPUT_NODE | &quot;MQ_INPUT_NODE&quot; |
| MQ_OUTPUT_NODE | &quot;MQ_OUTPUT_NODE&quot; |
| MQ_REPLY_NODE | &quot;MQ_REPLY_NODE&quot; |
| PASSTHRU_NODE | &quot;PASSTHRU_NODE&quot; |
| PUBLICATION_NODE | &quot;PUBLICATION_NODE&quot; |
| RESET_CONTENT_DESCRIPTOR_NODE | &quot;RESET_CONTENT_DESCRIPTOR_NODE&quot; |
| REST_ASYNC_REQUEST_NODE | &quot;REST_ASYNC_REQUEST_NODE&quot; |
| REST_ASYNC_RESPONSE_NODE | &quot;REST_ASYNC_RESPONSE_NODE&quot; |
| REST_REQUEST_NODE | &quot;REST_REQUEST_NODE&quot; |
| RE_SEQUENCE_NODE | &quot;RE_SEQUENCE_NODE&quot; |
| ROUTE_NODE | &quot;ROUTE_NODE&quot; |
| SAP_REPLY_NODE | &quot;SAP_REPLY_NODE&quot; |
| SCA_REPLY_NODE | &quot;SCA_REPLY_NODE&quot; |
| SECURITY_PEP | &quot;SECURITY_PEP&quot; |
| SEQUENCE_NODE | &quot;SEQUENCE_NODE&quot; |
| SOAP_ASYNC_REQUEST_NODE | &quot;SOAP_ASYNC_REQUEST_NODE&quot; |
| SOAP_ASYNC_RESPONSE_NODE | &quot;SOAP_ASYNC_RESPONSE_NODE&quot; |
| SOAP_EXTRACT_NODE | &quot;SOAP_EXTRACT_NODE&quot; |
| SOAP_INPUT_NODE | &quot;SOAP_INPUT_NODE&quot; |
| SOAP_REPLY_NODE | &quot;SOAP_REPLY_NODE&quot; |
| SOAP_REQUEST_NODE | &quot;SOAP_REQUEST_NODE&quot; |
| SOAP_WRAPPER_NODE | &quot;SOAP_WRAPPER_NODE&quot; |
| SR_RETRIEVE_ENTITY_NODE | &quot;SR_RETRIEVE_ENTITY_NODE&quot; |
| SR_RETRIEVE_IT_SERVICE_NODE | &quot;SR_RETRIEVE_IT_SERVICE_NODE&quot; |
| THROW_NODE | &quot;THROW_NODE&quot; |
| TRACE_NODE | &quot;TRACE_NODE&quot; |
| TRY_CATCH_NODE | &quot;TRY_CATCH_NODE&quot; |
| VALIDATE_NODE | &quot;VALIDATE_NODE&quot; |
| WS_REPLY_NODE | &quot;WS_REPLY_NODE&quot; |
| XSL_MQSI_NODE | &quot;XSL_MQSI_NODE&quot; |



## Enum: CicsTransactionCallTypeEnum

| Name | Value |
|---- | -----|
| CTG | &quot;CTG&quot; |
| DPL | &quot;DPL&quot; |
| EXPLICIT_ADK | &quot;EXPLICIT_ADK&quot; |
| HTTP | &quot;HTTP&quot; |
| IMS_CONNECT | &quot;IMS_CONNECT&quot; |
| IMS_CONNECT_API | &quot;IMS_CONNECT_API&quot; |
| IMS_ITRA | &quot;IMS_ITRA&quot; |
| IMS_MSC | &quot;IMS_MSC&quot; |
| IMS_PGM_SWITCH | &quot;IMS_PGM_SWITCH&quot; |
| IMS_SHARED_QUEUES | &quot;IMS_SHARED_QUEUES&quot; |
| IMS_TRANS_EXEC | &quot;IMS_TRANS_EXEC&quot; |
| MQ | &quot;MQ&quot; |
| SOAP | &quot;SOAP&quot; |
| START | &quot;START&quot; |
| TTX | &quot;TTX&quot; |
| TX | &quot;TX&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| ZOS_CONNECT | &quot;ZOS_CONNECT&quot; |



## Enum: ImsTransactionCallTypeEnum

| Name | Value |
|---- | -----|
| CTG | &quot;CTG&quot; |
| DPL | &quot;DPL&quot; |
| EXPLICIT_ADK | &quot;EXPLICIT_ADK&quot; |
| HTTP | &quot;HTTP&quot; |
| IMS_CONNECT | &quot;IMS_CONNECT&quot; |
| IMS_CONNECT_API | &quot;IMS_CONNECT_API&quot; |
| IMS_ITRA | &quot;IMS_ITRA&quot; |
| IMS_MSC | &quot;IMS_MSC&quot; |
| IMS_PGM_SWITCH | &quot;IMS_PGM_SWITCH&quot; |
| IMS_SHARED_QUEUES | &quot;IMS_SHARED_QUEUES&quot; |
| IMS_TRANS_EXEC | &quot;IMS_TRANS_EXEC&quot; |
| MQ | &quot;MQ&quot; |
| SOAP | &quot;SOAP&quot; |
| START | &quot;START&quot; |
| TTX | &quot;TTX&quot; |
| TX | &quot;TX&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| ZOS_CONNECT | &quot;ZOS_CONNECT&quot; |



