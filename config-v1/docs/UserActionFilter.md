

# UserActionFilter

User actions filter of the calculated web application metric.   Only user actions matching the provided criteria are used for metric calculation.   A user action must match **all** the criteria.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionDurationFromMilliseconds** | **Integer** | Only actions with a duration more than or equal to this value (in milliseconds) are included in the metric calculation. |  [optional] |
|**actionDurationToMilliseconds** | **Integer** | Only actions with a duration less than or equal to this value (in milliseconds) are included in the metric calculation. |  [optional] |
|**loadAction** | **Boolean** | The status of load actions in the metric calculation:   * &#x60;true&#x60;: Load actions are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**xhrAction** | **Boolean** | The status of XHR actions in the metric calculation:   * &#x60;true&#x60;: XHR actions are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**xhrRouteChangeAction** | **Boolean** | The status of route change actions in the metric calculation:   * &#x60;true&#x60;: Route change actions are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**customAction** | **Boolean** | The status of custom actions in the metric calculation:   * &#x60;true&#x60;: Custom actions are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**apdex** | [**ApdexEnum**](#ApdexEnum) | Only actions with the specified Apdex score are included in the metric calculation. |  [optional] |
|**domain** | **String** | Only user actions coming from the specified domain are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**userActionName** | **String** | Only actions with this name are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**realUser** | **Boolean** | The status of actions coming from real users in the metric calculation:   * &#x60;true&#x60;: Only actions from real users are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**robot** | **Boolean** | The status of actions coming from robots in the metric calculation:   * &#x60;true&#x60;: Only actions from robots are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**synthetic** | **Boolean** | The status of actions coming from synthetic monitors in the metric calculation:   * &#x60;true&#x60;: Only actions from synthetic monitors are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**browserFamily** | **String** | Only user actions coming from the specified browser family are included in the metric calculation.     The EQUALS operator applies. |  [optional] |
|**browserType** | **String** | Only user actions coming from the specified browser type are included in the metric calculation.     The EQUALS operator applies. |  [optional] |
|**browserVersion** | **String** | Only user actions coming from the specified browser version are included in the metric calculation.     The EQUALS operator applies. |  [optional] |
|**hasCustomErrors** | **Boolean** | The custom error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions with custom errors are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**hasAnyError** | **Boolean** | The error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions that have any errors are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**hasHttpErrors** | **Boolean** | The request error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions with request errors (HTTP errors, failed images, CSP rule violations) are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**hasJavascriptErrors** | **Boolean** | The JavaScript error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions with JavaScript errors are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**city** | **String** | Only actions of users from this city are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**continent** | **String** | Only actions of users from this continent are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**country** | **String** | Only actions of users from this country are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**region** | **String** | Only actions of users from this region are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**ip** | **String** | Only actions coming from this IP address are included in the metric calculation.     The EQUALS operator applies. |  [optional] |
|**ipV6Traffic** | **Boolean** | The IPv6 status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions coming from IPv6 are included.  * &#x60;false&#x60;: All actions are included. |  [optional] |
|**osFamily** | **String** | Only actions coming from this OS family are included in the metric calculation.    Specify the OS ID here. |  [optional] |
|**osVersion** | **String** | Only actions coming from this OS version are included in the metric calculation.    Specify the OS ID here. |  [optional] |
|**httpErrorCode** | **Integer** | The HTTP error status code of the actions to be included in the metric calculation. |  [optional] |
|**httpErrorCodeTo** | **Integer** | Can be used in combination with &#x60;httpErrorCode&#x60; to define a range of error codes that will be included in the metric calculation. |  [optional] |
|**httpPath** | **String** | The request path that has been determined to be the origin of an HTTP error of the actions to be included in the metric calculation. |  [optional] |
|**customErrorType** | **String** | The custom error type of the actions to be included in the metric calculation. |  [optional] |
|**customErrorName** | **String** | The custom error name of the actions to be included in the metric calculation. |  [optional] |
|**userActionProperties** | [**List&lt;UserActionPropertyFilter&gt;**](UserActionPropertyFilter.md) | Only actions with the specified properties are included in the metric calculation. |  [optional] |
|**targetViewName** | **String** | Only actions on the specified view are included in the metric calculation. |  [optional] |
|**targetViewNameMatchType** | [**TargetViewNameMatchTypeEnum**](#TargetViewNameMatchTypeEnum) | Specifies the match type of the view name filter, e.g. using &#x60;Contains&#x60; or &#x60;Equals&#x60;. Defaults to &#x60;Equals&#x60;. |  [optional] |
|**targetViewGroup** | **String** | Only actions on the specified group of views are included in the metric calculation. |  [optional] |
|**targetViewGroupNameMatchType** | [**TargetViewGroupNameMatchTypeEnum**](#TargetViewGroupNameMatchTypeEnum) | Specifies the match type of the view group filter, e.g. using &#x60;Contains&#x60; or &#x60;Equals&#x60;. Defaults to &#x60;Equals&#x60;. |  [optional] |



## Enum: ApdexEnum

| Name | Value |
|---- | -----|
| FRUSTRATED | &quot;Frustrated&quot; |
| SATISFIED | &quot;Satisfied&quot; |
| TOLERATING | &quot;Tolerating&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: TargetViewNameMatchTypeEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;Contains&quot; |
| EQUALS | &quot;Equals&quot; |



## Enum: TargetViewGroupNameMatchTypeEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;Contains&quot; |
| EQUALS | &quot;Equals&quot; |



