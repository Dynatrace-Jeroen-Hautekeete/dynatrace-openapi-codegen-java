

# DtaqlResultAsTree

The user session query result as a tree.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extrapolationLevel** | **Integer** | The extrapolation level of the result.   To improve performance, some results may be calculated from a subset of actual data. The extrapolation level indicates the share of actual data in the result.   The number is the denominator of a fraction and indicates the amount of actual data. The value &#x60;1&#x60; means that the result contains only the actual data. The value &#x60;4&#x60; means that result is calculated using 1/4 of the actual data.   If you need the analysis to be based on the actual data, reduce the timeframe of your query. For example, in case of extrapolation level of &#x60;4&#x60;, try to use 1/4 of the original timeframe. |  [optional] |
|**additionalColumnNames** | **List&lt;String&gt;** | A list of columns in the additionalValues table.    Only present if the endpoint was called with &#x60;deepLinkFields&#x3D;true&#x60; parameter. |  [optional] |
|**additionalValues** | **List&lt;List&lt;Object&gt;&gt;** | A list of data rows.    Each array element represents a row in the table of additionally linked fields.   The size of each data row and the order of the elements correspond to the **additionalColumnNames** content.   Only present if the endpoint was called with &#x60;deepLinkFields&#x3D;true&#x60; parameter. |  [optional] |
|**explanations** | **List&lt;String&gt;** | Additional information about the query and the result, that helps to understand the query and how the result was calculated.   Only appears when the **explain** parameter is set to &#x60;true&#x60;.   Example: The number of results was limited to the default of 50. Use the &#x60;LIMIT&#x60; clause to increase or decrease this limit. |  [optional] |
|**branchNames** | **List&lt;String&gt;** | A list of branches of the tree.    Typically, these are fields from the &#x60;SELECT&#x60; clause, that have been used in the &#x60;GROUP BY&#x60; clause. |  [optional] |
|**leafNames** | **List&lt;String&gt;** | A list of leaves on each tree branch.    Typically, these are fields from the &#x60;SELECT&#x60; clause, that have not been used in the &#x60;GROUP BY&#x60; clause. |  [optional] |
|**values** | **Object** | The user session query result as a tree. |  [optional] |



