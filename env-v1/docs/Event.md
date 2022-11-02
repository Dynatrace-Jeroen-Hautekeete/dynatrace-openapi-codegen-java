

# Event

The properties of an event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **Long** | The timestamp of the event detection, in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The timestamp of the event closure, in UTC milliseconds.   Has the &#x60;-1&#x60; value if the event is still open. |  [optional] |
|**entityId** | **String** | The ID of the affected Dynatrace entity. |  [optional] |
|**entityName** | **String** | The name of the affected Dynatrace entity. |  [optional] |
|**severityLevel** | [**SeverityLevelEnum**](#SeverityLevelEnum) | The severity of the event. |  [optional] |
|**impactLevel** | [**ImpactLevelEnum**](#ImpactLevelEnum) | The impact level of the event. It shows what is affected by the problem: infrastructure, service, or application. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event. |  [optional] |
|**resourceId** | **String** | The id of the resource the event occurred on. |  [optional] |
|**resourceName** | **String** | The name of the resource the event occurred on. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the event. |  [optional] |
|**severities** | [**List&lt;EventSeverity&gt;**](EventSeverity.md) | Additional data on the event severity. |  [optional] |
|**isRootCause** | **Boolean** | Indicates if the event is the root cause of a problem. |  [optional] |
|**deploymentProject** | **String** |  |  [optional] |
|**cpuLimitInMHz** | **Integer** |  |  [optional] |
|**deploymentParamAdded** | **String** |  |  [optional] |
|**affectedPrivateSyntheticLocations** | **List&lt;String&gt;** |  |  [optional] |
|**isClusterWide** | **Boolean** | For events with event type &#x60;MONITORING_UNAVAILABLE&#x60;, it may be that the event is occurring on the entire Dynatrace cluster. If this is true, it could be that there are problems on the Dynatrace side. |  [optional] |
|**source** | **String** |  |  [optional] |
|**effectiveEntity** | **String** |  |  [optional] |
|**operatingSystem** | **String** |  |  [optional] |
|**artifact** | **String** |  |  [optional] |
|**cpuLoad** | **Float** |  |  [optional] |
|**affectedRequestsPerMinute** | **Float** |  |  [optional] |
|**annotationDescription** | **String** |  |  [optional] |
|**browser** | [**BrowserEnum**](#BrowserEnum) |  |  [optional] |
|**affectedSyntheticLocations** | **List&lt;String&gt;** |  |  [optional] |
|**deploymentName** | **String** |  |  [optional] |
|**deploymentParamRemoved** | **String** |  |  [optional] |
|**correlationId** | **String** |  |  [optional] |
|**userDefined50thPercentileThreshold** | **Float** |  |  [optional] |
|**syntheticErrorType** | **List&lt;String&gt;** | If the event type is one of the synthetic event types then we may have information about the error type. The names of those are returned in this field. |  [optional] |
|**serviceMethodGroup** | **String** |  |  [optional] |
|**referenceResponseTime90thPercentile** | **Float** |  |  [optional] |
|**userAction** | **String** |  |  [optional] |
|**minimumProcessGroupInstanceCountThreshold** | **Integer** |  |  [optional] |
|**referenceResponseTime50thPercentile** | **Float** |  |  [optional] |
|**original** | **String** |  |  [optional] |
|**userDefined90thPercentileThreshold** | **Float** |  |  [optional] |
|**deploymentVersion** | **String** |  |  [optional] |
|**annotationType** | **String** |  |  [optional] |
|**affectedSyntheticActions** | **List&lt;String&gt;** | If the event type is one of the synthetic event types then we may have information on which synthetic actions are affected by the event. The names of those are returned in this field. |  [optional] |
|**affectedUserActionsPerMinute** | **Float** |  |  [optional] |
|**activeMaintenanceWindows** | [**List&lt;EntityShortRepresentation&gt;**](EntityShortRepresentation.md) |  |  [optional] |
|**mobileAppVersion** | **String** |  |  [optional] |
|**userDefinedFailureRateThreshold** | **Float** |  |  [optional] |
|**percentile** | [**PercentileEnum**](#PercentileEnum) |  |  [optional] |
|**customProperties** | **Map&lt;String, String&gt;** |  |  [optional] |
|**remediationAction** | **String** |  |  [optional] |
|**service** | **String** |  |  [optional] |
|**ciBackLink** | **String** |  |  [optional] |
|**geolocation** | **String** |  |  [optional] |
|**serviceMethod** | **String** |  |  [optional] |
|**changed** | **String** |  |  [optional] |



## Enum: SeverityLevelEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;AVAILABILITY&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| ERROR | &quot;ERROR&quot; |
| MONITORING_UNAVAILABLE | &quot;MONITORING_UNAVAILABLE&quot; |
| PERFORMANCE | &quot;PERFORMANCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |



## Enum: ImpactLevelEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| INFRASTRUCTURE | &quot;INFRASTRUCTURE&quot; |
| SERVICE | &quot;SERVICE&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| APPLICATION_JS_FRAMEWORK_DETECTED | &quot;APPLICATION_JS_FRAMEWORK_DETECTED&quot; |
| APPLICATION_OVERLOAD_PREVENTION | &quot;APPLICATION_OVERLOAD_PREVENTION&quot; |
| AVAILABILITY_EVENT | &quot;AVAILABILITY_EVENT&quot; |
| CONNECTION_LOST | &quot;CONNECTION_LOST&quot; |
| CPU_SATURATED | &quot;CPU_SATURATED&quot; |
| CUSTOM_ALERT | &quot;CUSTOM_ALERT&quot; |
| CUSTOM_ANNOTATION | &quot;CUSTOM_ANNOTATION&quot; |
| CUSTOM_APPLICATION_OVERLOAD_PREVENTION | &quot;CUSTOM_APPLICATION_OVERLOAD_PREVENTION&quot; |
| CUSTOM_APP_CRASH_RATE_INCREASED | &quot;CUSTOM_APP_CRASH_RATE_INCREASED&quot; |
| CUSTOM_CONFIGURATION | &quot;CUSTOM_CONFIGURATION&quot; |
| CUSTOM_DEPLOYMENT | &quot;CUSTOM_DEPLOYMENT&quot; |
| CUSTOM_INFO | &quot;CUSTOM_INFO&quot; |
| DATABASE_CONNECTION_FAILURE | &quot;DATABASE_CONNECTION_FAILURE&quot; |
| DEPLOYMENT_CHANGED_CHANGE | &quot;DEPLOYMENT_CHANGED_CHANGE&quot; |
| DEPLOYMENT_CHANGED_NEW | &quot;DEPLOYMENT_CHANGED_NEW&quot; |
| DEPLOYMENT_CHANGED_REMOVED | &quot;DEPLOYMENT_CHANGED_REMOVED&quot; |
| DYNATRACE_INTERNAL | &quot;DYNATRACE_INTERNAL&quot; |
| EBS_VOLUME_HIGH_LATENCY | &quot;EBS_VOLUME_HIGH_LATENCY&quot; |
| ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE | &quot;ELASTIC_LOAD_BALANCER_HIGH_BACKEND_FAILURE_RATE&quot; |
| ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE | &quot;ELASTIC_LOAD_BALANCER_HIGH_FAILURE_RATE&quot; |
| ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE | &quot;ELASTIC_LOAD_BALANCER_HIGH_UNHEALTHY_HOST_RATE&quot; |
| ERROR_EVENT | &quot;ERROR_EVENT&quot; |
| ESXI_HOST_VM_MOTION_ARRIVED | &quot;ESXI_HOST_VM_MOTION_ARRIVED&quot; |
| ESXI_HOST_VM_MOTION_LEFT | &quot;ESXI_HOST_VM_MOTION_LEFT&quot; |
| ESXI_HOST_VM_STARTED | &quot;ESXI_HOST_VM_STARTED&quot; |
| ESXI_START | &quot;ESXI_START&quot; |
| ESXI_VM_DISCONNECTED | &quot;ESXI_VM_DISCONNECTED&quot; |
| ESXI_VM_MOTION | &quot;ESXI_VM_MOTION&quot; |
| ESXI_VM_POWER_OFF | &quot;ESXI_VM_POWER_OFF&quot; |
| ESXI_VM_START | &quot;ESXI_VM_START&quot; |
| FAILURE_RATE_INCREASED | &quot;FAILURE_RATE_INCREASED&quot; |
| HIGH_CONNECTIVITY_FAILURES | &quot;HIGH_CONNECTIVITY_FAILURES&quot; |
| HIGH_DROPPED_PACKETS_RATE | &quot;HIGH_DROPPED_PACKETS_RATE&quot; |
| HIGH_GC_ACTIVITY | &quot;HIGH_GC_ACTIVITY&quot; |
| HIGH_LATENCY | &quot;HIGH_LATENCY&quot; |
| HIGH_NETWORK_ERROR_RATE | &quot;HIGH_NETWORK_ERROR_RATE&quot; |
| HIGH_NETWORK_LOSS_RATE | &quot;HIGH_NETWORK_LOSS_RATE&quot; |
| HIGH_NETWORK_UTILIZATION | &quot;HIGH_NETWORK_UTILIZATION&quot; |
| HOST_CONNECTION_FAILED | &quot;HOST_CONNECTION_FAILED&quot; |
| HOST_CONNECTION_LOST | &quot;HOST_CONNECTION_LOST&quot; |
| HOST_DATASTORE_LOW_DISK_SPACE | &quot;HOST_DATASTORE_LOW_DISK_SPACE&quot; |
| HOST_DISK_LOW_INODES | &quot;HOST_DISK_LOW_INODES&quot; |
| HOST_GRACEFULLY_SHUTDOWN | &quot;HOST_GRACEFULLY_SHUTDOWN&quot; |
| HOST_LOG_AVAILABILITY | &quot;HOST_LOG_AVAILABILITY&quot; |
| HOST_LOG_ERROR | &quot;HOST_LOG_ERROR&quot; |
| HOST_LOG_MATCHED | &quot;HOST_LOG_MATCHED&quot; |
| HOST_LOG_PERFORMANCE | &quot;HOST_LOG_PERFORMANCE&quot; |
| HOST_MAINTENANCE | &quot;HOST_MAINTENANCE&quot; |
| HOST_NO_CONNECTION | &quot;HOST_NO_CONNECTION&quot; |
| HOST_OF_SERVICE_UNAVAILABLE | &quot;HOST_OF_SERVICE_UNAVAILABLE&quot; |
| HOST_SHUTDOWN | &quot;HOST_SHUTDOWN&quot; |
| HOST_TIMEOUT | &quot;HOST_TIMEOUT&quot; |
| HTTP_CHECK_GLOBAL_OUTAGE | &quot;HTTP_CHECK_GLOBAL_OUTAGE&quot; |
| HTTP_CHECK_LOCAL_OUTAGE | &quot;HTTP_CHECK_LOCAL_OUTAGE&quot; |
| HTTP_CHECK_TEST_LOCATION_SLOWDOWN | &quot;HTTP_CHECK_TEST_LOCATION_SLOWDOWN&quot; |
| INSUFFICIENT_DISK_QUEUE_DEPTH | &quot;INSUFFICIENT_DISK_QUEUE_DEPTH&quot; |
| JAVASCRIPT_ERROR_RATE_INCREASED | &quot;JAVASCRIPT_ERROR_RATE_INCREASED&quot; |
| LAMBDA_FUNCTION_HIGH_ERROR_RATE | &quot;LAMBDA_FUNCTION_HIGH_ERROR_RATE&quot; |
| LOG_AVAILABILITY | &quot;LOG_AVAILABILITY&quot; |
| LOG_ERROR | &quot;LOG_ERROR&quot; |
| LOG_MATCHED | &quot;LOG_MATCHED&quot; |
| LOG_PERFORMANCE | &quot;LOG_PERFORMANCE&quot; |
| LOW_DISK_SPACE | &quot;LOW_DISK_SPACE&quot; |
| LOW_STORAGE_SPACE | &quot;LOW_STORAGE_SPACE&quot; |
| MARKED_FOR_TERMINATION | &quot;MARKED_FOR_TERMINATION&quot; |
| MEMORY_RESOURCES_EXHAUSTED | &quot;MEMORY_RESOURCES_EXHAUSTED&quot; |
| MEMORY_SATURATED | &quot;MEMORY_SATURATED&quot; |
| MOBILE_APPLICATION_OVERLOAD_PREVENTION | &quot;MOBILE_APPLICATION_OVERLOAD_PREVENTION&quot; |
| MOBILE_APP_CRASH_RATE_INCREASED | &quot;MOBILE_APP_CRASH_RATE_INCREASED&quot; |
| MONITORING_UNAVAILABLE | &quot;MONITORING_UNAVAILABLE&quot; |
| OPENSTACK_HOST_VM_SHUTDOWN | &quot;OPENSTACK_HOST_VM_SHUTDOWN&quot; |
| OPENSTACK_HOST_VM_STARTED | &quot;OPENSTACK_HOST_VM_STARTED&quot; |
| OPENSTACK_KEYSTONE_SLOW | &quot;OPENSTACK_KEYSTONE_SLOW&quot; |
| OPENSTACK_KEYSTONE_UNHEALTHY | &quot;OPENSTACK_KEYSTONE_UNHEALTHY&quot; |
| OPENSTACK_VM_LAUNCH_FAILED | &quot;OPENSTACK_VM_LAUNCH_FAILED&quot; |
| OPENSTACK_VM_MOTION | &quot;OPENSTACK_VM_MOTION&quot; |
| OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE | &quot;OSI_DOCKER_DEVICEMAPPER_LOW_DATA_SPACE&quot; |
| OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE | &quot;OSI_DOCKER_DEVICEMAPPER_LOW_METADATA_SPACE&quot; |
| OVERLOADED_STORAGE | &quot;OVERLOADED_STORAGE&quot; |
| PERFORMANCE_EVENT | &quot;PERFORMANCE_EVENT&quot; |
| PGI_CRASHED_INFO | &quot;PGI_CRASHED_INFO&quot; |
| PGI_HAPROXY_QUEUED_REQUESTS_HIGH | &quot;PGI_HAPROXY_QUEUED_REQUESTS_HIGH&quot; |
| PGI_HAPROXY_SESSION_USAGE_HIGH | &quot;PGI_HAPROXY_SESSION_USAGE_HIGH&quot; |
| PGI_LOG_MATCHED | &quot;PGI_LOG_MATCHED&quot; |
| PGI_MEMDUMP | &quot;PGI_MEMDUMP&quot; |
| PGI_MYSQL_SLOW_QUERIES_RATE_HIGH | &quot;PGI_MYSQL_SLOW_QUERIES_RATE_HIGH&quot; |
| PGI_OF_SERVICE_UNAVAILABLE | &quot;PGI_OF_SERVICE_UNAVAILABLE&quot; |
| PGI_RMQ_HIGH_FILE_DESC_USAGE | &quot;PGI_RMQ_HIGH_FILE_DESC_USAGE&quot; |
| PGI_RMQ_HIGH_MEM_USAGE | &quot;PGI_RMQ_HIGH_MEM_USAGE&quot; |
| PGI_RMQ_HIGH_PROCESS_USAGE | &quot;PGI_RMQ_HIGH_PROCESS_USAGE&quot; |
| PGI_RMQ_HIGH_SOCKETS_USAGE | &quot;PGI_RMQ_HIGH_SOCKETS_USAGE&quot; |
| PGI_RMQ_LOW_DISK_SPACE | &quot;PGI_RMQ_LOW_DISK_SPACE&quot; |
| PROCESS_CRASHED | &quot;PROCESS_CRASHED&quot; |
| PROCESS_CUSTOM_AVAILABILITY | &quot;PROCESS_CUSTOM_AVAILABILITY&quot; |
| PROCESS_CUSTOM_ERROR | &quot;PROCESS_CUSTOM_ERROR&quot; |
| PROCESS_CUSTOM_PERFORMANCE | &quot;PROCESS_CUSTOM_PERFORMANCE&quot; |
| PROCESS_GROUP_LOW_INSTANCE_COUNT | &quot;PROCESS_GROUP_LOW_INSTANCE_COUNT&quot; |
| PROCESS_LOG_AVAILABILITY | &quot;PROCESS_LOG_AVAILABILITY&quot; |
| PROCESS_LOG_ERROR | &quot;PROCESS_LOG_ERROR&quot; |
| PROCESS_LOG_PERFORMANCE | &quot;PROCESS_LOG_PERFORMANCE&quot; |
| PROCESS_RESTART | &quot;PROCESS_RESTART&quot; |
| PROCESS_UNAVAILABLE | &quot;PROCESS_UNAVAILABLE&quot; |
| RDS_AZ_FAILOVER_COMPLETED | &quot;RDS_AZ_FAILOVER_COMPLETED&quot; |
| RDS_AZ_FAILOVER_STARTED | &quot;RDS_AZ_FAILOVER_STARTED&quot; |
| RDS_BACKUP_COMPLETED | &quot;RDS_BACKUP_COMPLETED&quot; |
| RDS_BACKUP_STARTED | &quot;RDS_BACKUP_STARTED&quot; |
| RDS_OF_SERVICE_UNAVAILABLE | &quot;RDS_OF_SERVICE_UNAVAILABLE&quot; |
| RDS_RESTART | &quot;RDS_RESTART&quot; |
| RDS_RESTART_SEQUENCE | &quot;RDS_RESTART_SEQUENCE&quot; |
| RESOURCE_CONTENTION | &quot;RESOURCE_CONTENTION&quot; |
| SERVICE_RESPONSE_TIME_DEGRADED | &quot;SERVICE_RESPONSE_TIME_DEGRADED&quot; |
| SLOW_DISK | &quot;SLOW_DISK&quot; |
| SYNTHETIC_AVAILABILITY | &quot;SYNTHETIC_AVAILABILITY&quot; |
| SYNTHETIC_NODE_OUTAGE | &quot;SYNTHETIC_NODE_OUTAGE&quot; |
| SYNTHETIC_PRIVATE_LOCATION_OUTAGE | &quot;SYNTHETIC_PRIVATE_LOCATION_OUTAGE&quot; |
| SYNTHETIC_SLOWDOWN | &quot;SYNTHETIC_SLOWDOWN&quot; |
| THREADS_RESOURCES_EXHAUSTED | &quot;THREADS_RESOURCES_EXHAUSTED&quot; |
| UNEXPECTED_HIGH_LOAD | &quot;UNEXPECTED_HIGH_LOAD&quot; |
| UNEXPECTED_LOW_LOAD | &quot;UNEXPECTED_LOW_LOAD&quot; |
| USER_ACTION_DURATION_DEGRADATION | &quot;USER_ACTION_DURATION_DEGRADATION&quot; |
| VIRTUAL_MACHINE_SHUTDOWN | &quot;VIRTUAL_MACHINE_SHUTDOWN&quot; |
| WEB_CHECK_GLOBAL_OUTAGE | &quot;WEB_CHECK_GLOBAL_OUTAGE&quot; |
| WEB_CHECK_LOCAL_OUTAGE | &quot;WEB_CHECK_LOCAL_OUTAGE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| OPEN | &quot;OPEN&quot; |



## Enum: BrowserEnum

| Name | Value |
|---- | -----|
| APPLICATION | &quot;APPLICATION&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| INFRASTRUCTURE | &quot;INFRASTRUCTURE&quot; |
| SERVICES | &quot;SERVICES&quot; |



## Enum: PercentileEnum

| Name | Value |
|---- | -----|
| _50TH | &quot;50th&quot; |
| _90TH | &quot;90th&quot; |



