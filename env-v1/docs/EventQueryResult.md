

# EventQueryResult

Events of the environment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nextCursor** | **String** | The cursor for the next 150 events, fitting the specified criteria.    Set this value for the **cursor** query parameter. Without it you&#39;ll get the first 150 events again.   You don&#39;t have to specify any additional parameters, because the cursor already contains all of them. |  [optional] |
|**from** | **Long** | Start of the query timeframe. |  [optional] |
|**to** | **Long** | End of the query timeframe. |  [optional] |
|**totalEventCount** | **Long** | The total amount of events, fitting the specified criteria. |  [optional] |
|**events** | [**List&lt;EventRestEntry&gt;**](EventRestEntry.md) | The list of events. |  [optional] |



