

# MonitoredEntityFilter

A matching rule for Dynatrace entities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the Dynatrace entities (for example, hosts or services) you want to pick up by matching. |  [optional] |
|**mzId** | **String** | The ID of a management zone to which the matched entities must belong. |  [optional] |
|**tags** | [**List&lt;TagInfo&gt;**](TagInfo.md) | The tag you want to use for matching.   You can use custom tags from the UI, AWS tags, Cloud Foundry tags, OpenShift/Kubernetes, and tags based on environment variables. |  |
|**tagCombination** | [**TagCombinationEnum**](#TagCombinationEnum) | The logic that applies when several tags are specified: AND/OR.   If not set, the OR logic is used. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APM_SECURITY_GATEWAY | &quot;APM_SECURITY_GATEWAY&quot; |
| APPLICATION | &quot;APPLICATION&quot; |
| APPLICATION_METHOD | &quot;APPLICATION_METHOD&quot; |
| APPLICATION_METHOD_GROUP | &quot;APPLICATION_METHOD_GROUP&quot; |
| APPMON_SERVER | &quot;APPMON_SERVER&quot; |
| APPMON_SYSTEM_PROFILE | &quot;APPMON_SYSTEM_PROFILE&quot; |
| AUTO_SCALING_GROUP | &quot;AUTO_SCALING_GROUP&quot; |
| AUXILIARY_SYNTHETIC_TEST | &quot;AUXILIARY_SYNTHETIC_TEST&quot; |
| AWS_APPLICATION_LOAD_BALANCER | &quot;AWS_APPLICATION_LOAD_BALANCER&quot; |
| AWS_AVAILABILITY_ZONE | &quot;AWS_AVAILABILITY_ZONE&quot; |
| AWS_CREDENTIALS | &quot;AWS_CREDENTIALS&quot; |
| AWS_LAMBDA_FUNCTION | &quot;AWS_LAMBDA_FUNCTION&quot; |
| AWS_NETWORK_LOAD_BALANCER | &quot;AWS_NETWORK_LOAD_BALANCER&quot; |
| AZURE_API_MANAGEMENT_SERVICE | &quot;AZURE_API_MANAGEMENT_SERVICE&quot; |
| AZURE_APPLICATION_GATEWAY | &quot;AZURE_APPLICATION_GATEWAY&quot; |
| AZURE_COSMOS_DB | &quot;AZURE_COSMOS_DB&quot; |
| AZURE_CREDENTIALS | &quot;AZURE_CREDENTIALS&quot; |
| AZURE_EVENT_HUB | &quot;AZURE_EVENT_HUB&quot; |
| AZURE_EVENT_HUB_NAMESPACE | &quot;AZURE_EVENT_HUB_NAMESPACE&quot; |
| AZURE_FUNCTION_APP | &quot;AZURE_FUNCTION_APP&quot; |
| AZURE_IOT_HUB | &quot;AZURE_IOT_HUB&quot; |
| AZURE_LOAD_BALANCER | &quot;AZURE_LOAD_BALANCER&quot; |
| AZURE_MGMT_GROUP | &quot;AZURE_MGMT_GROUP&quot; |
| AZURE_REDIS_CACHE | &quot;AZURE_REDIS_CACHE&quot; |
| AZURE_REGION | &quot;AZURE_REGION&quot; |
| AZURE_SERVICE_BUS_NAMESPACE | &quot;AZURE_SERVICE_BUS_NAMESPACE&quot; |
| AZURE_SERVICE_BUS_QUEUE | &quot;AZURE_SERVICE_BUS_QUEUE&quot; |
| AZURE_SERVICE_BUS_TOPIC | &quot;AZURE_SERVICE_BUS_TOPIC&quot; |
| AZURE_SQL_DATABASE | &quot;AZURE_SQL_DATABASE&quot; |
| AZURE_SQL_ELASTIC_POOL | &quot;AZURE_SQL_ELASTIC_POOL&quot; |
| AZURE_SQL_SERVER | &quot;AZURE_SQL_SERVER&quot; |
| AZURE_STORAGE_ACCOUNT | &quot;AZURE_STORAGE_ACCOUNT&quot; |
| AZURE_SUBSCRIPTION | &quot;AZURE_SUBSCRIPTION&quot; |
| AZURE_TENANT | &quot;AZURE_TENANT&quot; |
| AZURE_VM | &quot;AZURE_VM&quot; |
| AZURE_VM_SCALE_SET | &quot;AZURE_VM_SCALE_SET&quot; |
| AZURE_WEB_APP | &quot;AZURE_WEB_APP&quot; |
| CF_APPLICATION | &quot;CF_APPLICATION&quot; |
| CF_FOUNDATION | &quot;CF_FOUNDATION&quot; |
| CINDER_VOLUME | &quot;CINDER_VOLUME&quot; |
| CLOUD_APPLICATION | &quot;CLOUD_APPLICATION&quot; |
| CLOUD_APPLICATION_INSTANCE | &quot;CLOUD_APPLICATION_INSTANCE&quot; |
| CLOUD_APPLICATION_NAMESPACE | &quot;CLOUD_APPLICATION_NAMESPACE&quot; |
| CLOUD_NETWORK_INGRESS | &quot;CLOUD_NETWORK_INGRESS&quot; |
| CLOUD_NETWORK_POLICY | &quot;CLOUD_NETWORK_POLICY&quot; |
| CONTAINER_GROUP | &quot;CONTAINER_GROUP&quot; |
| CONTAINER_GROUP_INSTANCE | &quot;CONTAINER_GROUP_INSTANCE&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| CUSTOM_DEVICE | &quot;CUSTOM_DEVICE&quot; |
| CUSTOM_DEVICE_GROUP | &quot;CUSTOM_DEVICE_GROUP&quot; |
| DCRUM_APPLICATION | &quot;DCRUM_APPLICATION&quot; |
| DCRUM_SERVICE | &quot;DCRUM_SERVICE&quot; |
| DCRUM_SERVICE_INSTANCE | &quot;DCRUM_SERVICE_INSTANCE&quot; |
| DEVICE_APPLICATION_METHOD | &quot;DEVICE_APPLICATION_METHOD&quot; |
| DISK | &quot;DISK&quot; |
| DOCKER_CONTAINER_GROUP | &quot;DOCKER_CONTAINER_GROUP&quot; |
| DOCKER_CONTAINER_GROUP_INSTANCE | &quot;DOCKER_CONTAINER_GROUP_INSTANCE&quot; |
| DYNAMO_DB_TABLE | &quot;DYNAMO_DB_TABLE&quot; |
| EBS_VOLUME | &quot;EBS_VOLUME&quot; |
| EC2_INSTANCE | &quot;EC2_INSTANCE&quot; |
| ELASTIC_LOAD_BALANCER | &quot;ELASTIC_LOAD_BALANCER&quot; |
| ENVIRONMENT | &quot;ENVIRONMENT&quot; |
| EXTERNAL_SYNTHETIC_TEST_STEP | &quot;EXTERNAL_SYNTHETIC_TEST_STEP&quot; |
| GCP_ZONE | &quot;GCP_ZONE&quot; |
| GEOLOCATION | &quot;GEOLOCATION&quot; |
| GEOLOC_SITE | &quot;GEOLOC_SITE&quot; |
| GOOGLE_COMPUTE_ENGINE | &quot;GOOGLE_COMPUTE_ENGINE&quot; |
| HOST | &quot;HOST&quot; |
| HOST_GROUP | &quot;HOST_GROUP&quot; |
| HTTP_CHECK | &quot;HTTP_CHECK&quot; |
| HTTP_CHECK_STEP | &quot;HTTP_CHECK_STEP&quot; |
| HYPERVISOR | &quot;HYPERVISOR&quot; |
| KUBERNETES_CLUSTER | &quot;KUBERNETES_CLUSTER&quot; |
| KUBERNETES_NODE | &quot;KUBERNETES_NODE&quot; |
| KUBERNETES_SERVICE | &quot;KUBERNETES_SERVICE&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |
| NETWORK_INTERFACE | &quot;NETWORK_INTERFACE&quot; |
| NEUTRON_SUBNET | &quot;NEUTRON_SUBNET&quot; |
| OPENSTACK_PROJECT | &quot;OPENSTACK_PROJECT&quot; |
| OPENSTACK_REGION | &quot;OPENSTACK_REGION&quot; |
| OPENSTACK_VM | &quot;OPENSTACK_VM&quot; |
| OS | &quot;OS&quot; |
| PROCESS_GROUP | &quot;PROCESS_GROUP&quot; |
| PROCESS_GROUP_INSTANCE | &quot;PROCESS_GROUP_INSTANCE&quot; |
| QUEUE | &quot;QUEUE&quot; |
| RELATIONAL_DATABASE_SERVICE | &quot;RELATIONAL_DATABASE_SERVICE&quot; |
| SERVICE | &quot;SERVICE&quot; |
| SERVICE_INSTANCE | &quot;SERVICE_INSTANCE&quot; |
| SERVICE_METHOD | &quot;SERVICE_METHOD&quot; |
| SERVICE_METHOD_GROUP | &quot;SERVICE_METHOD_GROUP&quot; |
| SWIFT_CONTAINER | &quot;SWIFT_CONTAINER&quot; |
| SYNTHETIC_LOCATION | &quot;SYNTHETIC_LOCATION&quot; |
| SYNTHETIC_TEST | &quot;SYNTHETIC_TEST&quot; |
| SYNTHETIC_TEST_STEP | &quot;SYNTHETIC_TEST_STEP&quot; |
| VIRTUALMACHINE | &quot;VIRTUALMACHINE&quot; |
| VMWARE_DATACENTER | &quot;VMWARE_DATACENTER&quot; |



## Enum: TagCombinationEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |


