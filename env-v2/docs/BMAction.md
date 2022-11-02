

# BMAction

Contains detailed information about Browser monitor action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the action. |  [optional] |
|**domain** | **String** | The DNS domain where the action has been recorded |  [optional] |
|**targetUrl** | **String** | The URL of the action. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the action. |  [optional] |
|**startTime** | **Long** | The start time of the action on the server, in in UTC milliseconds. |  [optional] |
|**endTime** | **Long** | The stop time of the action on the server, in UTC milliseconds |  [optional] |
|**duration** | **Long** | The duration of the action, in milliseconds |  [optional] |
|**apdexType** | [**ApdexTypeEnum**](#ApdexTypeEnum) | The user experience index of the action. |  [optional] |
|**speedIndex** | **Integer** | A score indicating how quickly the page content is visually populated. A low speed index means that most parts of a page are rendering quickly. |  [optional] |
|**referrer** | **String** | The referrer. |  [optional] |
|**networkTime** | **Integer** | The amount of time spent on the data transfer for the action, in milliseconds. |  [optional] |
|**serverTime** | **Integer** | The amount of time spent on the server-side processing for the action, in milliseconds. |  [optional] |
|**frontendTime** | **Integer** | The amount of time spent on the frontend rendering for the action, in milliseconds. |  [optional] |
|**documentInteractiveTime** | **Integer** | The amount of time spent until the document for the action became interactive, in milliseconds. |  [optional] |
|**thirdPartyResources** | **Integer** | The number of third party resources loaded for the action. |  [optional] |
|**thirdPartyBusyTime** | **Integer** | The time spent waiting for third party resources for the action, in milliseconds. |  [optional] |
|**cdnResources** | **Integer** | The number of resources fetched from a CDN for the action. |  [optional] |
|**cdnBusyTime** | **Integer** | The time spent waiting for CDN resources for the action, in milliseconds. |  [optional] |
|**firstPartyResources** | **Integer** | The number of resources fetched from the originating server for the action. |  [optional] |
|**firstPartyBusyTime** | **Integer** | The time spent waiting for resources from the originating server for the action, in milliseconds. |  [optional] |
|**domCompleteTime** | **Integer** | The amount of time until the DOM tree is completed, in milliseconds. |  [optional] |
|**domContentLoadedTime** | **Integer** | The amount of time until the DOM tree is loaded, in milliseconds. |  [optional] |
|**loadEventStart** | **Integer** | The amount of time until the load event started, in milliseconds. |  [optional] |
|**loadEventEnd** | **Integer** | The amount of time until the load event ended, in milliseconds. |  [optional] |
|**navigationStartTime** | **Long** | The timestamp of the navigation start, in UTC milliseconds. |  [optional] |
|**requestStart** | **Integer** | The amount of time until the request started, in milliseconds. |  [optional] |
|**responseStart** | **Integer** | The amount of time until the response started, in milliseconds. |  [optional] |
|**responseEnd** | **Integer** | The amount of time until the response ended, in milliseconds. |  [optional] |
|**visuallyCompleteTime** | **Integer** | The amount of time until the page is visually complete, in milliseconds. |  [optional] |
|**startSequenceNumber** | **Integer** | The sequence number of the action (to get a kind of order). |  [optional] |
|**clientTime** | **Long** | The event startTime in client time, in milliseconds. |  [optional] |
|**userActionPropertyCount** | **Integer** | The total number of properties in the action. |  [optional] |
|**customErrorCount** | **Integer** | The total number of custom errors during the action. |  [optional] |
|**javascriptErrorCount** | **Integer** | The total number of Javascript errors during the action. |  [optional] |
|**requestErrorCount** | **Integer** | The total number of request errors during the action. |  [optional] |
|**largestContentfulPaint** | **Integer** | The largest contentful paint (LCP) is the time (in milliseconds) that the largest element on the page took to render. |  [optional] |
|**firstInputDelay** | **Integer** | The first input delay (FID) is the time (in milliseconds) that the browser took to respond to the first user input. |  [optional] |
|**cumulativeLayoutShift** | **Double** | Cumulative layout shift: Available for Chromium-based browsers. Measured using Google-provided APIs. |  [optional] |
|**totalBlockingTime** | **Integer** | The time between the moment when the browser receives a request to download a resource and the time that it actually starts downloading the resource in ms. |  [optional] |
|**exitAction** | **Boolean** |  |  [optional] |
|**entryAction** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;Custom&quot; |
| ENDVISIT | &quot;EndVisit&quot; |
| ERROR | &quot;Error&quot; |
| LOAD | &quot;Load&quot; |
| RAGECLICK | &quot;RageClick&quot; |
| STANDALONEAGENTEVENT | &quot;StandaloneAgentEvent&quot; |
| STANDALONEHTTPERROR | &quot;StandaloneHttpError&quot; |
| SYNTHETICHIDDENACTION | &quot;SyntheticHiddenAction&quot; |
| USERSESSIONPROPERTIES | &quot;UserSessionProperties&quot; |
| VIEWCHANGEEVENT | &quot;ViewChangeEvent&quot; |
| VISITTAG | &quot;VisitTag&quot; |
| XHR | &quot;Xhr&quot; |



## Enum: ApdexTypeEnum

| Name | Value |
|---- | -----|
| FRUSTRATED | &quot;FRUSTRATED&quot; |
| SATISFIED | &quot;SATISFIED&quot; |
| TOLERATING | &quot;TOLERATING&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



