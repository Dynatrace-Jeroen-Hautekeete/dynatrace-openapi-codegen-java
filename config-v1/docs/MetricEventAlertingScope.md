

# MetricEventAlertingScope

A single filter for the alerting scope.  The actual set of fields depends on type of the filter. Find the list of actual objects in the description of the **filterType** field or see [Metric events anomaly detection API - JSON models](https://dt-url.net/ql63sap).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;ENTITY_ID&#x60; -&gt; EntityIdAlertingScope  * &#x60;MANAGEMENT_ZONE&#x60; -&gt; ManagementZoneAlertingScope  * &#x60;TAG&#x60; -&gt; TagFilterAlertingScope  * &#x60;NAME&#x60; -&gt; NameAlertingScope  * &#x60;CUSTOM_DEVICE_GROUP_NAME&#x60; -&gt; CustomDeviceGroupNameAlertingScope  * &#x60;HOST_GROUP_NAME&#x60; -&gt; HostGroupNameAlertingScope  * &#x60;HOST_NAME&#x60; -&gt; HostNameAlertingScope  * &#x60;PROCESS_GROUP_ID&#x60; -&gt; ProcessGroupIdAlertingScope  * &#x60;PROCESS_GROUP_NAME&#x60; -&gt; ProcessGroupNameAlertingScope   |  |



## Enum: FilterTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_DEVICE_GROUP_NAME | &quot;CUSTOM_DEVICE_GROUP_NAME&quot; |
| ENTITY_ID | &quot;ENTITY_ID&quot; |
| HOST_GROUP_NAME | &quot;HOST_GROUP_NAME&quot; |
| HOST_NAME | &quot;HOST_NAME&quot; |
| MANAGEMENT_ZONE | &quot;MANAGEMENT_ZONE&quot; |
| NAME | &quot;NAME&quot; |
| PROCESS_GROUP_ID | &quot;PROCESS_GROUP_ID&quot; |
| PROCESS_GROUP_NAME | &quot;PROCESS_GROUP_NAME&quot; |
| TAG | &quot;TAG&quot; |



