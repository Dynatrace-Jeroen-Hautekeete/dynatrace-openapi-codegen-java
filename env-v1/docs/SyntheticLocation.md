

# SyntheticLocation

Configuration of a synthetic location.    **countryCode**, **regionCode**, **city** parameters are optional as they can be retrieved based on **latitude** and **longitude** of location.   The actual set of fields depends on the type of the location. Find the list of actual objects in the description of the **type** field or see [Synthetic locations API v2 - JSON models](https://dt-url.net/3n43szj).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **String** | The Dynatrace entity ID of the location. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;PUBLIC&#x60; -&gt; PublicSyntheticLocation  * &#x60;PRIVATE&#x60; -&gt; PrivateSyntheticLocation  * &#x60;CLUSTER&#x60; -&gt; PrivateSyntheticLocation   |  |
|**name** | **String** | The name of the location. |  |
|**countryCode** | **String** | The country code of the location.    Use the alpha-2 code of the [ISO 3166-2 standard](https://dt-url.net/iso3166-2), (for example, &#x60;AT&#x60; for Austria or &#x60;PL&#x60; for Poland). |  [optional] |
|**regionCode** | **String** | The region code of the location.    For the [USA](https://dt-url.net/iso3166us) or [Canada](https://dt-url.net/iso3166ca) use ISO 3166-2 state codes (without &#x60;US-&#x60; or &#x60;CA-&#x60; prefix), for example, &#x60;VA&#x60; for Virginia or &#x60;OR&#x60; for Oregon.    For the rest of the world use [FIPS 10-4 codes](https://dt-url.net/fipscodes). |  [optional] |
|**city** | **String** | The city of the location. |  [optional] |
|**latitude** | **Double** | The latitude of the location in &#x60;DDD.dddd&#x60; format. |  |
|**longitude** | **Double** | The longitude of the location in &#x60;DDD.dddd&#x60; format. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the location:   * &#x60;ENABLED&#x60;: The location is displayed as active in the UI. You can assign monitors to the location.  * &#x60;DISABLED&#x60;: The location is displayed as inactive in the UI. You can&#39;t assign monitors to the location. Monitors already assigned to the location will stay there and will be executed from the location.  * &#x60;HIDDEN&#x60;: The location is not displayed in the UI. You can&#39;t assign monitors to the location. You can only set location as &#x60;HIDDEN&#x60; when no monitor is assigned to it. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CLUSTER | &quot;CLUSTER&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;DISABLED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| HIDDEN | &quot;HIDDEN&quot; |



