

# ConversionGoal

A conversion goal of the application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the conversion goal. |  |
|**id** | **String** | The ID of conversion goal.    Omit it while creating a new conversion goal. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the conversion goal. |  [optional] |
|**destinationDetails** | [**DestinationDetails**](DestinationDetails.md) |  |  [optional] |
|**userActionDetails** | [**UserActionDetails**](UserActionDetails.md) |  |  [optional] |
|**visitDurationDetails** | [**VisitDurationDetails**](VisitDurationDetails.md) |  |  [optional] |
|**visitNumActionDetails** | [**VisitNumActionDetails**](VisitNumActionDetails.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DESTINATION | &quot;Destination&quot; |
| USERACTION | &quot;UserAction&quot; |
| VISITDURATION | &quot;VisitDuration&quot; |
| VISITNUMACTIONS | &quot;VisitNumActions&quot; |



