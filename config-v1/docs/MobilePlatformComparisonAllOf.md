

# MobilePlatformComparisonAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Operator of the comparison. You can reverse it by setting **negate** to &#x60;true&#x60;.   Possible values depend on the **type** of the comparison. Find the list of actual models in the description of the **type** field and check the description of the model you need. |  [optional] |
|**value** | [**ValueEnum**](#ValueEnum) | The value to compare to. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;EQUALS&quot; |
| EXISTS | &quot;EXISTS&quot; |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| ANDROID | &quot;ANDROID&quot; |
| IOS | &quot;IOS&quot; |
| LINUX | &quot;LINUX&quot; |
| MAC_OS | &quot;MAC_OS&quot; |
| OTHER | &quot;OTHER&quot; |
| TVOS | &quot;TVOS&quot; |
| WINDOWS | &quot;WINDOWS&quot; |



