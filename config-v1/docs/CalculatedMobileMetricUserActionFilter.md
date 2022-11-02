

# CalculatedMobileMetricUserActionFilter

User actions filter of the calculated metric for mobile or custom app.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hasReportedError** | **Boolean** | The error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions with reported errors are included.    * &#x60;false&#x60;: All actions are included. |  [optional] |
|**hasHttpError** | **Boolean** | The HTTP error status of the actions to be included in the metric calculation:   * &#x60;true&#x60;: Only actions with HTTP errors are included.    * &#x60;false&#x60;: All actions are included. |  [optional] |
|**userActionName** | **String** | Only actions with this name are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**appVersion** | **String** | Only actions coming from this app version are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**device** | **String** | Only actions coming from this app version are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**manufacturer** | **String** | Only actions coming from devices of this manufacturer are included in the metric calculation.    The EQUALS operator applies. |  [optional] |
|**apdex** | [**ApdexEnum**](#ApdexEnum) | Only actions with the specified Apdex score are included in the metric calculation. |  [optional] |
|**osFamily** | **String** | Only actions coming from this OS family are included in the metric calculation.    Specify the OS ID here. |  [optional] |
|**osVersion** | **String** | Only actions coming from this OS version are included in the metric calculation.    Specify the OS ID here. |  [optional] |
|**city** | **String** | Only actions of users from this city are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**continent** | **String** | Only actions of users from this continent are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**country** | **String** | Only actions of users from this country are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**region** | **String** | Only actions of users from this region are included in the metric calculation.    Specify geolocation ID here. |  [optional] |
|**actionDurationFromMilliseconds** | **Integer** | Only actions with a duration more than or equal to this value (in milliseconds) are included in the metric calculation. |  [optional] |
|**actionDurationToMilliseconds** | **Integer** | Only actions with a duration less than or equal to this value (in milliseconds) are included in the metric calculation. |  [optional] |
|**carrier** | **String** | Only actions coming from this carrier type are included in the metric calculation. |  [optional] |
|**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | Only actions coming from this connection type are included in the metric calculation. |  [optional] |
|**networkTechnology** | **String** | Filter by network technology |  [optional] |
|**isp** | **String** | Only actions coming from this internet service provider are included in the metric calculation.     The EQUALS operator applies. |  [optional] |
|**orientation** | [**OrientationEnum**](#OrientationEnum) | Only actions coming from devices with this display orientation are included in the metric calculation. |  [optional] |
|**resolution** | [**ResolutionEnum**](#ResolutionEnum) | Only actions coming from devices with this display resolution are included in the metric calculation. |  [optional] |



## Enum: ApdexEnum

| Name | Value |
|---- | -----|
| FRUSTRATED | &quot;Frustrated&quot; |
| SATISFIED | &quot;Satisfied&quot; |
| TOLERATING | &quot;Tolerating&quot; |
| UNKNOWN | &quot;Unknown&quot; |



## Enum: ConnectionTypeEnum

| Name | Value |
|---- | -----|
| LAN | &quot;LAN&quot; |
| MOBILE | &quot;MOBILE&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| WIFI | &quot;WIFI&quot; |



## Enum: OrientationEnum

| Name | Value |
|---- | -----|
| LANDSCAPE | &quot;LANDSCAPE&quot; |
| PORTRAIT | &quot;PORTRAIT&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: ResolutionEnum

| Name | Value |
|---- | -----|
| CGA | &quot;CGA&quot; |
| DCI2K | &quot;DCI2K&quot; |
| DCI4K | &quot;DCI4K&quot; |
| DVGA | &quot;DVGA&quot; |
| FHD | &quot;FHD&quot; |
| FWVGA | &quot;FWVGA&quot; |
| FWXGA | &quot;FWXGA&quot; |
| GHDPLUS | &quot;GHDPlus&quot; |
| HD | &quot;HD&quot; |
| HQVGA | &quot;HQVGA&quot; |
| HQVGA2 | &quot;HQVGA2&quot; |
| HSXGA | &quot;HSXGA&quot; |
| HUXGA | &quot;HUXGA&quot; |
| HVGA | &quot;HVGA&quot; |
| HXGA | &quot;HXGA&quot; |
| NTSC | &quot;NTSC&quot; |
| PAL | &quot;PAL&quot; |
| QHD | &quot;QHD&quot; |
| QQVGA | &quot;QQVGA&quot; |
| QSXGA | &quot;QSXGA&quot; |
| QUXGA | &quot;QUXGA&quot; |
| QVGA | &quot;QVGA&quot; |
| QWXGA | &quot;QWXGA&quot; |
| QXGA | &quot;QXGA&quot; |
| SVGA | &quot;SVGA&quot; |
| SXGA | &quot;SXGA&quot; |
| SXGAMINUS | &quot;SXGAMinus&quot; |
| SXGAPLUS | &quot;SXGAPlus&quot; |
| UGA | &quot;UGA&quot; |
| UHD16K | &quot;UHD16K&quot; |
| UHD4K | &quot;UHD4K&quot; |
| UHD8K | &quot;UHD8K&quot; |
| UHDPLUS | &quot;UHDPlus&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| UWQHD | &quot;UWQHD&quot; |
| UXGA | &quot;UXGA&quot; |
| VGA | &quot;VGA&quot; |
| WHSXGA | &quot;WHSXGA&quot; |
| WHUXGA | &quot;WHUXGA&quot; |
| WHXGA | &quot;WHXGA&quot; |
| WQSXGA | &quot;WQSXGA&quot; |
| WQUXGA | &quot;WQUXGA&quot; |
| WQVGA | &quot;WQVGA&quot; |
| WQVGA2 | &quot;WQVGA2&quot; |
| WQVGA3 | &quot;WQVGA3&quot; |
| WQXGA | &quot;WQXGA&quot; |
| WQXGA2 | &quot;WQXGA2&quot; |
| WSVGA | &quot;WSVGA&quot; |
| WSVGA2 | &quot;WSVGA2&quot; |
| WSXGA | &quot;WSXGA&quot; |
| WSXGAPLUS | &quot;WSXGAPlus&quot; |
| WUXGA | &quot;WUXGA&quot; |
| WVGA | &quot;WVGA&quot; |
| WVGA2 | &quot;WVGA2&quot; |
| WXGA | &quot;WXGA&quot; |
| WXGA2 | &quot;WXGA2&quot; |
| WXGA3 | &quot;WXGA3&quot; |
| WXGAPLUS | &quot;WXGAPlus&quot; |
| XGA | &quot;XGA&quot; |
| XGAPLUS | &quot;XGAPLUS&quot; |
| _1280X854 | &quot;_1280x854&quot; |
| NHD | &quot;nHD&quot; |



