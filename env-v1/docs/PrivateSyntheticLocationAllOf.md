

# PrivateSyntheticLocationAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodes** | **List&lt;String&gt;** | A list of synthetic nodes belonging to the location.    You can retrieve the list of available nodes with the [GET all nodes](https://dt-url.net/miy3rpl) call. |  [optional] |
|**availabilityLocationOutage** | **Boolean** | The alerting of location outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**availabilityNodeOutage** | **Boolean** | The alerting of node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).    If enabled, the outage of *any* node in the location triggers an alert. |  [optional] |
|**locationNodeOutageDelayInMinutes** | **Integer** | Alert if the location or node outage lasts longer than *X* minutes.    Only applicable when **availabilityLocationOutage** or **availabilityNodeOutage** is set to &#x60;true&#x60;. |  [optional] |
|**availabilityNotificationsEnabled** | **Boolean** | The notifications of location and node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | The deployment type of the location:   * &#x60;STANDARD&#x60;: The location is deployed on Windows or Linux. * &#x60;KUBERNETES&#x60;: The location is deployed on Kubernetes. |  [optional] |
|**autoUpdateChromium** | **Boolean** | Auto upgrade of Chromium is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |



## Enum: DeploymentTypeEnum

| Name | Value |
|---- | -----|
| KUBERNETES | &quot;KUBERNETES&quot; |
| STANDARD | &quot;STANDARD&quot; |



