

# PrivateSyntheticLocationUpdate

The update of a private Synthetic location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodes** | **List&lt;String&gt;** | A list of synthetic nodes belonging to the location.    You can retrieve the list of available nodes with the [GET all nodes](https://dt-url.net/miy3rpl) call. |  |
|**name** | **String** | The name of the location. |  |
|**countryCode** | **String** | The country code of the location.    Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for example, &#x60;AT&#x60; for Austria or &#x60;PL&#x60; for Poland). |  [optional] |
|**regionCode** | **String** | The region code of the location.    For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca) use ISO 3166-2 state codes (without &#x60;US-&#x60; or &#x60;CA-&#x60; prefix), for example, &#x60;VA&#x60; for Virginia or &#x60;OR&#x60; for Oregon.    For the rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes). |  [optional] |
|**city** | **String** | The city of the location. |  [optional] |
|**latitude** | **Double** | The latitude of the location in &#x60;DDD.dddd&#x60; format. |  |
|**longitude** | **Double** | The longitude of the location in &#x60;DDD.dddd&#x60; format. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the location:   * &#x60;ENABLED&#x60;: The location is displayed as active in the UI. You can assign monitors to the location.  * &#x60;DISABLED&#x60;: The location is displayed as inactive in the UI. You can&#39;t assign monitors to the location. Monitors already assigned to the location will stay there and will be executed from the location.  * &#x60;HIDDEN&#x60;: The location is not displayed in the UI. You can&#39;t assign monitors to the location. You can only set location as &#x60;HIDDEN&#x60; when no monitor is assigned to it. |  [optional] |
|**availabilityLocationOutage** | **Boolean** | The alerting of location outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**availabilityNodeOutage** | **Boolean** | The alerting of node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;).    If enabled, the outage of *any* node in the location triggers an alert. |  [optional] |
|**locationNodeOutageDelayInMinutes** | **Integer** | Alert if the location or node outage lasts longer than *X* minutes.    Only applicable when **availabilityLocationOutage** or **availabilityNodeOutage** is set to &#x60;true&#x60;. |  [optional] |
|**availabilityNotificationsEnabled** | **Boolean** | The notifications of location and node outage is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**autoUpdateChromium** | **Boolean** | Auto upgrade of Chromium is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  [optional] |
|**deploymentType** | [**DeploymentTypeEnum**](#DeploymentTypeEnum) | The deployment type of the location:   * &#x60;STANDARD&#x60;: The location is deployed on Windows or Linux. * &#x60;KUBERNETES&#x60;: The location is deployed on Kubernetes. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| HIDDEN | &quot;HIDDEN&quot; |



## Enum: DeploymentTypeEnum

| Name | Value |
|---- | -----|
| KUBERNETES | &quot;KUBERNETES&quot; |
| STANDARD | &quot;STANDARD&quot; |



