

# UserSessionUserAction

A user action.    A user action is a single action performed by the user as part of a user session, for example a mouse click.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the user action.    Typically, this is the name of the page that is loaded as part of a user action or a textual description of the action, such as a mouse click. |  [optional] |
|**domain** | **String** | The DNS domain where the user action has been recorded. |  [optional] |
|**targetUrl** | **String** | The target URL of the user action. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the user action. |  [optional] |
|**startTime** | **Long** | The start timestamp of the user action, in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The end timestamp of the user action, in UTC milliseconds. |  [optional] |
|**duration** | **Long** | The duration of the user action, in milliseconds.    This is calculated as the of time between the start and the end timestamps of the user action. |  [optional] |
|**application** | **String** | The name of the application where the user action has been recorded. |  [optional] |
|**internalApplicationId** | **String** | The Dynatrace entity ID of the application where the user action has been recorded.    This information is useful when calling various REST APIs, for example as a key for time series queries. |  [optional] |
|**internalKeyUserActionId** | **String** | The Dynatrace entity ID of the key user action. |  [optional] |
|**speedIndex** | **Integer** | The [speed index](https://dt-url.net/qk1a3r19) of the user action, in milliseconds.    This is calculated as average time it takes for all visible parts of a page to display. |  [optional] |
|**apdexCategory** | [**ApdexCategoryEnum**](#ApdexCategoryEnum) | The [user experience index](https://dt-url.net/apdexdoc) of the user action. |  [optional] |
|**matchingConversionGoals** | **List&lt;String&gt;** | A list of conversion goals achieved by the user action.    Additionally, you can define conversion goals for a user session as a whole. |  [optional] |
|**networkTime** | **Integer** | The amount of time spent on the data transfer for the user action, in milliseconds. |  [optional] |
|**serverTime** | **Integer** | The amount of time spent on the server-side processing for the user action, in milliseconds. |  [optional] |
|**frontendTime** | **Integer** | The amount of time spent on the frontend rendering for the user action, in milliseconds. |  [optional] |
|**documentInteractiveTime** | **Integer** | The amount of time spent until the document for the user action became interactive, in milliseconds. |  [optional] |
|**thirdPartyResources** | **Integer** | The number of third party resources loaded for the user action. |  [optional] |
|**thirdPartyBusyTime** | **Integer** | The time spent waiting for third party resources for the user action, in milliseconds. |  [optional] |
|**cdnResources** | **Integer** | The number of resources fetched from a CDN for the user action. |  [optional] |
|**cdnBusyTime** | **Integer** | The time spent waiting for CDN resources for the user action, in milliseconds. |  [optional] |
|**firstPartyResources** | **Integer** | The number of resources fetched from the originating server for the user action. |  [optional] |
|**firstPartyBusyTime** | **Integer** | The time spent waiting for resources from the originating server for the user action, in milliseconds. |  [optional] |
|**hasCrash** | **Boolean** | The user action has (&#x60;true&#x60;) or doesn&#39;t have (&#x60;false&#x60;) a crash. |  [optional] |
|**domCompleteTime** | **Integer** | The amount of time until the DOM tree is completed, in milliseconds. |  [optional] |
|**domContentLoadedTime** | **Integer** | The amount of time until the DOM tree is loaded, in milliseconds. |  [optional] |
|**loadEventStart** | **Integer** | The amount of time until the load event started, in milliseconds. |  [optional] |
|**loadEventEnd** | **Integer** | The amount of time until the load event ended, in milliseconds. |  [optional] |
|**navigationStart** | **Long** | The timestamp of the navigation start, in UTC milliseconds. |  [optional] |
|**requestStart** | **Integer** | The amount of time until the request started, in milliseconds. |  [optional] |
|**responseStart** | **Integer** | The amount of time until the response started, in milliseconds. |  [optional] |
|**responseEnd** | **Integer** | The amount of time until the response ended, in milliseconds. |  [optional] |
|**visuallyCompleteTime** | **Integer** | The amount of time until the page is [visually complete](https://dt-url.net/qk1a3r19), in milliseconds. |  [optional] |
|**syntheticEvent** | **String** | The name of the [Synthetic event](https://dt-url.net/dq1e3rmm) that triggered the user action. |  [optional] |
|**syntheticEventId** | **String** | The ID of the [Synthetic event](https://dt-url.net/dq1e3rmm) that triggered the user action. |  [optional] |
|**keyUserAction** | **Boolean** | The action is (&#x60;true&#x60;) or is not (&#x60;false&#x60;) a key action. |  [optional] |
|**stringProperties** | [**List&lt;StringProperty&gt;**](StringProperty.md) | A list of custom properties of the user session with string values. |  [optional] |
|**longProperties** | [**List&lt;LongProperty&gt;**](LongProperty.md) | A list of custom properties of the user session with integer (short or long) values. |  [optional] |
|**doubleProperties** | [**List&lt;DoubleProperty&gt;**](DoubleProperty.md) | A list of custom properties of the user session with floating-point numerical values. |  [optional] |
|**dateProperties** | [**List&lt;DateProperty&gt;**](DateProperty.md) | A list of custom properties of the user session with date values. |  [optional] |
|**userActionPropertyCount** | **Integer** | The total number of properties in the user action. |  [optional] |
|**customErrorCount** | **Integer** | The total number of custom errors during the user action. |  [optional] |
|**javascriptErrorCount** | **Integer** | The total number of Javascript errors during the user action. |  [optional] |
|**requestErrorCount** | **Integer** | The total number of request errors during the user action. |  [optional] |
|**largestContentfulPaint** | **Integer** | The largest contentful paint (LCP) is the time (in milliseconds) that the largest element on the page took to render.   The LCP is an important user-centric metric for measuring load speed. It marks the point when the page&#39;s main content is likely loaded. A low LCP indicates that the page loads quickly. |  [optional] |
|**firstInputDelay** | **Integer** | The first input delay (FID) is the time (in milliseconds) that the browser took to respond to the first user input.   The FID is an important user-centric metric for measuring load responsiveness. It quantifies the user experience when trying to interact with unresponsive pages. A low FID indicates that the page is usable. |  [optional] |
|**totalBlockingTime** | **Integer** | The total blocking time is the total time (in milliseconds) between the first contentful paint and the time to interactive, during which the browser has been blocked long enough to prevent input responsiveness. |  [optional] |
|**cumulativeLayoutShift** | **Double** | The cumulative layout shift (CLS) is the total amount of all individual scores for every unexpected layout shift that occurs during the entire lifespan of the page.   The CLS is an important user-centric metric for measuring visual stability. It quantifies how often users experience unexpected layout shifts. A low CLS indicates that the page is delightful. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;Custom&quot; |
| ENDVISIT | &quot;EndVisit&quot; |
| ERROR | &quot;Error&quot; |
| LOAD | &quot;Load&quot; |
| RAGECLICK | &quot;RageClick&quot; |
| SYNTHETICHIDDENACTION | &quot;SyntheticHiddenAction&quot; |
| USERSESSIONPROPERTIES | &quot;UserSessionProperties&quot; |
| VISITTAG | &quot;VisitTag&quot; |
| XHR | &quot;Xhr&quot; |



## Enum: ApdexCategoryEnum

| Name | Value |
|---- | -----|
| FRUSTRATED | &quot;FRUSTRATED&quot; |
| SATISFIED | &quot;SATISFIED&quot; |
| TOLERATING | &quot;TOLERATING&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



