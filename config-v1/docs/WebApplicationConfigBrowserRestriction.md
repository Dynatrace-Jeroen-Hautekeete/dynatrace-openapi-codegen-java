

# WebApplicationConfigBrowserRestriction

Browser exclusion rules for the browsers that are to be excluded.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**browserVersion** | **String** | The version of the browser that is used. |  [optional] |
|**browserType** | [**BrowserTypeEnum**](#BrowserTypeEnum) | The type of the browser that is used. |  |
|**platform** | [**PlatformEnum**](#PlatformEnum) | The platform on which the browser is being used. |  [optional] |
|**comparator** | [**ComparatorEnum**](#ComparatorEnum) | Compares different browsers together. |  [optional] |



## Enum: BrowserTypeEnum

| Name | Value |
|---- | -----|
| ANDROID_WEBKIT | &quot;ANDROID_WEBKIT&quot; |
| BOTS_SPIDERS | &quot;BOTS_SPIDERS&quot; |
| CHROME | &quot;CHROME&quot; |
| EDGE | &quot;EDGE&quot; |
| FIREFOX | &quot;FIREFOX&quot; |
| INTERNET_EXPLORER | &quot;INTERNET_EXPLORER&quot; |
| OPERA | &quot;OPERA&quot; |
| SAFARI | &quot;SAFARI&quot; |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| DESKTOP | &quot;DESKTOP&quot; |
| MOBILE | &quot;MOBILE&quot; |



## Enum: ComparatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| GREATER_THAN_OR_EQUAL | &quot;GREATER_THAN_OR_EQUAL&quot; |
| LOWER_THAN_OR_EQUAL | &quot;LOWER_THAN_OR_EQUAL&quot; |



