

# MzRule

The rule of the management zone usage. It defines how the management zone applies.   Each rule is evaluated independently of all other rules.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of Dynatrace entities the management zone can be applied to. |  |
|**enabled** | **Boolean** | The rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**propagationTypes** | [**List&lt;PropagationTypesEnum&gt;**](#List&lt;PropagationTypesEnum&gt;) | How to apply the management zone to underlying entities:   * &#x60;SERVICE_TO_HOST_LIKE&#x60;: Apply to underlying hosts of matching services.  * &#x60;SERVICE_TO_PROCESS_GROUP_LIKE&#x60;: Apply to underlying process groups of matching services.  * &#x60;PROCESS_GROUP_TO_HOST&#x60;: Apply to underlying hosts of matching process groups.  * &#x60;PROCESS_GROUP_TO_SERVICE&#x60;: Apply to all services provided by matching process groups.  * &#x60;HOST_TO_PROCESS_GROUP_INSTANCE&#x60;: Apply to processes running on matching hosts.  * &#x60;CUSTOM_DEVICE_GROUP_TO_CUSTOM_DEVICE&#x60;: Apply to custom devices in matching custom device groups.  * &#x60;AZURE_TO_PG&#x60;: Apply to process groups connected to matching Azure entities.  * &#x60;AZURE_TO_SERVICE&#x60;: Apply to services provided by matching Azure entities. |  [optional] |
|**conditions** | [**List&lt;EntityRuleEngineCondition&gt;**](EntityRuleEngineCondition.md) | A list of matching rules for the management zone.   The management zone applies only if **all** conditions are fulfilled. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APPMON_SERVER | &quot;APPMON_SERVER&quot; |
| APPMON_SYSTEM_PROFILE | &quot;APPMON_SYSTEM_PROFILE&quot; |
| AWS_ACCOUNT | &quot;AWS_ACCOUNT&quot; |
| AWS_APPLICATION_LOAD_BALANCER | &quot;AWS_APPLICATION_LOAD_BALANCER&quot; |
| AWS_AUTO_SCALING_GROUP | &quot;AWS_AUTO_SCALING_GROUP&quot; |
| AWS_CLASSIC_LOAD_BALANCER | &quot;AWS_CLASSIC_LOAD_BALANCER&quot; |
| AWS_NETWORK_LOAD_BALANCER | &quot;AWS_NETWORK_LOAD_BALANCER&quot; |
| AWS_RELATIONAL_DATABASE_SERVICE | &quot;AWS_RELATIONAL_DATABASE_SERVICE&quot; |
| AZURE | &quot;AZURE&quot; |
| BROWSER_MONITOR | &quot;BROWSER_MONITOR&quot; |
| CLOUD_APPLICATION | &quot;CLOUD_APPLICATION&quot; |
| CLOUD_APPLICATION_NAMESPACE | &quot;CLOUD_APPLICATION_NAMESPACE&quot; |
| CLOUD_FOUNDRY_FOUNDATION | &quot;CLOUD_FOUNDRY_FOUNDATION&quot; |
| CUSTOM_APPLICATION | &quot;CUSTOM_APPLICATION&quot; |
| CUSTOM_DEVICE | &quot;CUSTOM_DEVICE&quot; |
| CUSTOM_DEVICE_GROUP | &quot;CUSTOM_DEVICE_GROUP&quot; |
| DATA_CENTER_SERVICE | &quot;DATA_CENTER_SERVICE&quot; |
| ENTERPRISE_APPLICATION | &quot;ENTERPRISE_APPLICATION&quot; |
| ESXI_HOST | &quot;ESXI_HOST&quot; |
| EXTERNAL_MONITOR | &quot;EXTERNAL_MONITOR&quot; |
| HOST | &quot;HOST&quot; |
| HOST_GROUP | &quot;HOST_GROUP&quot; |
| HTTP_MONITOR | &quot;HTTP_MONITOR&quot; |
| KUBERNETES_CLUSTER | &quot;KUBERNETES_CLUSTER&quot; |
| KUBERNETES_SERVICE | &quot;KUBERNETES_SERVICE&quot; |
| MOBILE_APPLICATION | &quot;MOBILE_APPLICATION&quot; |
| OPENSTACK_ACCOUNT | &quot;OPENSTACK_ACCOUNT&quot; |
| PROCESS_GROUP | &quot;PROCESS_GROUP&quot; |
| QUEUE | &quot;QUEUE&quot; |
| SERVICE | &quot;SERVICE&quot; |
| WEB_APPLICATION | &quot;WEB_APPLICATION&quot; |



## Enum: List&lt;PropagationTypesEnum&gt;

| Name | Value |
|---- | -----|
| AZURE_TO_PG | &quot;AZURE_TO_PG&quot; |
| AZURE_TO_SERVICE | &quot;AZURE_TO_SERVICE&quot; |
| CUSTOM_DEVICE_GROUP_TO_CUSTOM_DEVICE | &quot;CUSTOM_DEVICE_GROUP_TO_CUSTOM_DEVICE&quot; |
| HOST_TO_PROCESS_GROUP_INSTANCE | &quot;HOST_TO_PROCESS_GROUP_INSTANCE&quot; |
| PROCESS_GROUP_TO_HOST | &quot;PROCESS_GROUP_TO_HOST&quot; |
| PROCESS_GROUP_TO_SERVICE | &quot;PROCESS_GROUP_TO_SERVICE&quot; |
| SERVICE_TO_HOST_LIKE | &quot;SERVICE_TO_HOST_LIKE&quot; |
| SERVICE_TO_PROCESS_GROUP_LIKE | &quot;SERVICE_TO_PROCESS_GROUP_LIKE&quot; |



