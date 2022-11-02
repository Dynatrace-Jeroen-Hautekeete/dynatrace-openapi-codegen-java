# MetricsApi

All URIs are relative to *https://fbj16975.sprint.dynatracelabs.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allMetrics**](MetricsApi.md#allMetrics) | **GET** /metrics | Lists all available metrics |
| [**allMetricsWithHttpInfo**](MetricsApi.md#allMetricsWithHttpInfo) | **GET** /metrics | Lists all available metrics |
| [**delete**](MetricsApi.md#delete) | **DELETE** /metrics/{metricKey} | Deletes the specified metric |
| [**deleteWithHttpInfo**](MetricsApi.md#deleteWithHttpInfo) | **DELETE** /metrics/{metricKey} | Deletes the specified metric |
| [**ingest**](MetricsApi.md#ingest) | **POST** /metrics/ingest | Pushes metric data points to Dynatrace |
| [**ingestWithHttpInfo**](MetricsApi.md#ingestWithHttpInfo) | **POST** /metrics/ingest | Pushes metric data points to Dynatrace |
| [**metric**](MetricsApi.md#metric) | **GET** /metrics/{metricKey} | Gets the descriptor of the specified metric |
| [**metricWithHttpInfo**](MetricsApi.md#metricWithHttpInfo) | **GET** /metrics/{metricKey} | Gets the descriptor of the specified metric |
| [**query**](MetricsApi.md#query) | **GET** /metrics/query | Gets data points of the specified metrics |
| [**queryWithHttpInfo**](MetricsApi.md#queryWithHttpInfo) | **GET** /metrics/query | Gets data points of the specified metrics |



## allMetrics

> MetricDescriptorCollection allMetrics(nextPageKey, pageSize, metricSelector, text, fields, writtenSince, metadataSelector)

Lists all available metrics

You can narrow down the output by selecting metrics in the **metricSelector** field.   You can additionally limit the output by using pagination:   1. Specify the number of results per page in the **pageSize** query parameter.   2. Then use the cursor from the **nextPageKey** field of the response in the **nextPageKey** query parameter to obtain subsequent pages. All other query parameters must be omitted.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of metric schemata in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.   If a value higher than 500 is used, only 500 results per page are returned.
        String metricSelector = "metricSelector_example"; // String | Selects metrics for the query by their keys.   You can specify multiple metric keys separated by commas (for example, `metrickey1,metrickey2`). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the `builtin:host.cpu.idle` and `builtin:host.cpu.user` metric, write: `builtin:host.cpu.(idle,user)`.   You can select a full set of related metrics by using a trailing asterisk (`*`) wildcard. For example, `builtin:host.*` selects all host-based metrics and `builtin:*` selects all Dynatrace-provided metrics.   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.   Only `aggregation`, `merge`, `parents`, and `splitBy` transformations are supported by this endpoint.   If the metric key contains any symbols you must quote (`\"`) the key. The following characters inside of a quoted metric key must be escaped with a tilde (`~`):  * Quotes (`\"`) * Tildes (`~`)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \"APACHE\"** you must specify this selector:    `\"ext:selfmonitoring.jmx.Agents: Type ~\"APACHE~\"\"`      To find metrics based on a search term, rather than metricId, use the **text** query parameter instead of this one.
        String text = "text_example"; // String | Metric registry search term. Only show metrics that contain the term in their key, display name, or description. Use the `metricSelector` parameter instead of this one to select a complete metric hierarchy instead of doing a text-based search.
        String fields = "fields_example"; // String | Defines the list of metric properties included in the response.   `metricId` is **always** included in the result. The following additional properties are available:   * `displayName`: The name of the metric in the user interface. Enabled by default.  * `description`: A short description of the metric. Enabled by default.  * `unit`: The unit of the metric. Enabled by default.  * `tags`: The tags of the metric.  + `dduBillable`:  An indicator whether the usage of metric consumes [Davis data units](https://dt-url.net/ddu).  * `created`:  The timestamp (UTC milliseconds) when the metrics has been created.  * `lastWritten`:  The timestamp (UTC milliseconds) when metric data points have been written for the last time.  * `aggregationTypes`: The list of allowed aggregations for the metric. Note that it may be different after a [transformation](https://dt-url.net/metricSelector) is applied.  * `defaultAggregation`: The default aggregation of the metric. It is used when no aggregation is specified or the `:auto` transformation is set.  * `dimensionDefinitions`: The fine metric division (for example, process group and process ID for some process-related metric).  * `transformations`: A list of [transformations](https://dt-url.net/metricSelector) that can be applied to the metric. * `entityType`: A list of entity types supported by the metric. * `minimumValue`: The minimum allowed value of the metric. * `maximumValue`: The maximum allowed value of the metric. * `rootCauseRelevant`: Whether (true or false) the metric is related to a root cause of a problem. A root-cause relevant metric represents a strong indicator for a faulty component. * `impactRelevant`: Whether (true or false) the metric is relevant to a problem's impact. An impact-relevant metric is highly dependent on other metrics and changes because an underlying root-cause metric has changed. * `metricValueType`: The type of the metric's value. You have these options:   * `score`: A score metric is a metric where high values indicate a good situation, while low values indicate trouble. An example of such a metric is a success rate.   * `error`: An error metric is a metric where high values indicate trouble, while low values indicate a good situation. An example of such a metric is an error count. * `latency`: The latency of the metric, in minutes. The latency is the expected reporting delay (for example, caused by constraints of cloud vendors or other third-party data sources) between the observation of a metric data point and its availability in Dynatrace. The allowed value range is from `1` to `60` minutes. * `metricSelector`: The underlying metric selector used by a func: metric. * `scalar`: Indicates whether the metric expression resolves to a scalar (`true`) or to a series (`false`).  A scalar result always contains one data point. The amount of data points in a series result depends on the resolution you're using.  * `resolutionInfSupported`: If `true`, resolution=Inf can be applied to the metric query.   To add properties, list them with leading plus `+`. To exclude default properties, list them with leading minus `-`.  To specify several properties, join them with a comma (for example `fields=+aggregationTypes,-description`).  If you specify just one property, the response contains the metric key and the specified property. To return metric keys only, specify `metricId` here.
        String writtenSince = "writtenSince_example"; // String | Filters the resulted set of metrics to those that have data points within the specified timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String metadataSelector = "metadataSelector_example"; // String | The metadata scope of the query. Only metrics with specified properties are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the `EQUALS` operator is used. If several values are specified, the **OR** logic applies.   * `unit(\"unit-1\",\"unit-2\")`  * `tags(\"tag-1\",\"tag-2\")`  * `dimensionKey(\"dimkey-1\",\"dimkey-2\")`. The filtering applies only to dimensions that were written within the last 14 days.  To set several criteria, separate them with a comma (`,`). For example, `tags(\"feature\",\"cloud\"),unit(\"Percent\"),dimensionKey(\"location\")`. Only results matching **all** criteria are included in response.   For example, to list metrics that have the tags **feature** AND **cloud** with a unit of **Percent** OR **MegaByte** AND a dimension with a dimension key **location**, use this **metadataSelector**: `tags(\"feature\"),unit(\"Percent\",\"MegaByte\"),tags(\"cloud\"),dimensionKey(\"location\")`.
        try {
            MetricDescriptorCollection result = apiInstance.allMetrics(nextPageKey, pageSize, metricSelector, text, fields, writtenSince, metadataSelector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#allMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of metric schemata in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.   If a value higher than 500 is used, only 500 results per page are returned. | [optional] |
| **metricSelector** | **String**| Selects metrics for the query by their keys.   You can specify multiple metric keys separated by commas (for example, &#x60;metrickey1,metrickey2&#x60;). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the &#x60;builtin:host.cpu.idle&#x60; and &#x60;builtin:host.cpu.user&#x60; metric, write: &#x60;builtin:host.cpu.(idle,user)&#x60;.   You can select a full set of related metrics by using a trailing asterisk (&#x60;*&#x60;) wildcard. For example, &#x60;builtin:host.*&#x60; selects all host-based metrics and &#x60;builtin:*&#x60; selects all Dynatrace-provided metrics.   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.   Only &#x60;aggregation&#x60;, &#x60;merge&#x60;, &#x60;parents&#x60;, and &#x60;splitBy&#x60; transformations are supported by this endpoint.   If the metric key contains any symbols you must quote (&#x60;\&quot;&#x60;) the key. The following characters inside of a quoted metric key must be escaped with a tilde (&#x60;~&#x60;):  * Quotes (&#x60;\&quot;&#x60;) * Tildes (&#x60;~&#x60;)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \&quot;APACHE\&quot;** you must specify this selector:    &#x60;\&quot;ext:selfmonitoring.jmx.Agents: Type ~\&quot;APACHE~\&quot;\&quot;&#x60;      To find metrics based on a search term, rather than metricId, use the **text** query parameter instead of this one. | [optional] |
| **text** | **String**| Metric registry search term. Only show metrics that contain the term in their key, display name, or description. Use the &#x60;metricSelector&#x60; parameter instead of this one to select a complete metric hierarchy instead of doing a text-based search. | [optional] |
| **fields** | **String**| Defines the list of metric properties included in the response.   &#x60;metricId&#x60; is **always** included in the result. The following additional properties are available:   * &#x60;displayName&#x60;: The name of the metric in the user interface. Enabled by default.  * &#x60;description&#x60;: A short description of the metric. Enabled by default.  * &#x60;unit&#x60;: The unit of the metric. Enabled by default.  * &#x60;tags&#x60;: The tags of the metric.  + &#x60;dduBillable&#x60;:  An indicator whether the usage of metric consumes [Davis data units](https://dt-url.net/ddu).  * &#x60;created&#x60;:  The timestamp (UTC milliseconds) when the metrics has been created.  * &#x60;lastWritten&#x60;:  The timestamp (UTC milliseconds) when metric data points have been written for the last time.  * &#x60;aggregationTypes&#x60;: The list of allowed aggregations for the metric. Note that it may be different after a [transformation](https://dt-url.net/metricSelector) is applied.  * &#x60;defaultAggregation&#x60;: The default aggregation of the metric. It is used when no aggregation is specified or the &#x60;:auto&#x60; transformation is set.  * &#x60;dimensionDefinitions&#x60;: The fine metric division (for example, process group and process ID for some process-related metric).  * &#x60;transformations&#x60;: A list of [transformations](https://dt-url.net/metricSelector) that can be applied to the metric. * &#x60;entityType&#x60;: A list of entity types supported by the metric. * &#x60;minimumValue&#x60;: The minimum allowed value of the metric. * &#x60;maximumValue&#x60;: The maximum allowed value of the metric. * &#x60;rootCauseRelevant&#x60;: Whether (true or false) the metric is related to a root cause of a problem. A root-cause relevant metric represents a strong indicator for a faulty component. * &#x60;impactRelevant&#x60;: Whether (true or false) the metric is relevant to a problem&#39;s impact. An impact-relevant metric is highly dependent on other metrics and changes because an underlying root-cause metric has changed. * &#x60;metricValueType&#x60;: The type of the metric&#39;s value. You have these options:   * &#x60;score&#x60;: A score metric is a metric where high values indicate a good situation, while low values indicate trouble. An example of such a metric is a success rate.   * &#x60;error&#x60;: An error metric is a metric where high values indicate trouble, while low values indicate a good situation. An example of such a metric is an error count. * &#x60;latency&#x60;: The latency of the metric, in minutes. The latency is the expected reporting delay (for example, caused by constraints of cloud vendors or other third-party data sources) between the observation of a metric data point and its availability in Dynatrace. The allowed value range is from &#x60;1&#x60; to &#x60;60&#x60; minutes. * &#x60;metricSelector&#x60;: The underlying metric selector used by a func: metric. * &#x60;scalar&#x60;: Indicates whether the metric expression resolves to a scalar (&#x60;true&#x60;) or to a series (&#x60;false&#x60;).  A scalar result always contains one data point. The amount of data points in a series result depends on the resolution you&#39;re using.  * &#x60;resolutionInfSupported&#x60;: If &#x60;true&#x60;, resolution&#x3D;Inf can be applied to the metric query.   To add properties, list them with leading plus &#x60;+&#x60;. To exclude default properties, list them with leading minus &#x60;-&#x60;.  To specify several properties, join them with a comma (for example &#x60;fields&#x3D;+aggregationTypes,-description&#x60;).  If you specify just one property, the response contains the metric key and the specified property. To return metric keys only, specify &#x60;metricId&#x60; here. | [optional] |
| **writtenSince** | **String**| Filters the resulted set of metrics to those that have data points within the specified timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **metadataSelector** | **String**| The metadata scope of the query. Only metrics with specified properties are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used. If several values are specified, the **OR** logic applies.   * &#x60;unit(\&quot;unit-1\&quot;,\&quot;unit-2\&quot;)&#x60;  * &#x60;tags(\&quot;tag-1\&quot;,\&quot;tag-2\&quot;)&#x60;  * &#x60;dimensionKey(\&quot;dimkey-1\&quot;,\&quot;dimkey-2\&quot;)&#x60;. The filtering applies only to dimensions that were written within the last 14 days.  To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;tags(\&quot;feature\&quot;,\&quot;cloud\&quot;),unit(\&quot;Percent\&quot;),dimensionKey(\&quot;location\&quot;)&#x60;. Only results matching **all** criteria are included in response.   For example, to list metrics that have the tags **feature** AND **cloud** with a unit of **Percent** OR **MegaByte** AND a dimension with a dimension key **location**, use this **metadataSelector**: &#x60;tags(\&quot;feature\&quot;),unit(\&quot;Percent\&quot;,\&quot;MegaByte\&quot;),tags(\&quot;cloud\&quot;),dimensionKey(\&quot;location\&quot;)&#x60;. | [optional] |

### Return type

[**MetricDescriptorCollection**](MetricDescriptorCollection.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax or validation error. **metricSelector** or **fields** have syntactic or semantic errors. |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |

## allMetricsWithHttpInfo

> ApiResponse<MetricDescriptorCollection> allMetrics allMetricsWithHttpInfo(nextPageKey, pageSize, metricSelector, text, fields, writtenSince, metadataSelector)

Lists all available metrics

You can narrow down the output by selecting metrics in the **metricSelector** field.   You can additionally limit the output by using pagination:   1. Specify the number of results per page in the **pageSize** query parameter.   2. Then use the cursor from the **nextPageKey** field of the response in the **nextPageKey** query parameter to obtain subsequent pages. All other query parameters must be omitted.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String nextPageKey = "nextPageKey_example"; // String | The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don't specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters. 
        Long pageSize = 56L; // Long | The amount of metric schemata in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.   If a value higher than 500 is used, only 500 results per page are returned.
        String metricSelector = "metricSelector_example"; // String | Selects metrics for the query by their keys.   You can specify multiple metric keys separated by commas (for example, `metrickey1,metrickey2`). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the `builtin:host.cpu.idle` and `builtin:host.cpu.user` metric, write: `builtin:host.cpu.(idle,user)`.   You can select a full set of related metrics by using a trailing asterisk (`*`) wildcard. For example, `builtin:host.*` selects all host-based metrics and `builtin:*` selects all Dynatrace-provided metrics.   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.   Only `aggregation`, `merge`, `parents`, and `splitBy` transformations are supported by this endpoint.   If the metric key contains any symbols you must quote (`\"`) the key. The following characters inside of a quoted metric key must be escaped with a tilde (`~`):  * Quotes (`\"`) * Tildes (`~`)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \"APACHE\"** you must specify this selector:    `\"ext:selfmonitoring.jmx.Agents: Type ~\"APACHE~\"\"`      To find metrics based on a search term, rather than metricId, use the **text** query parameter instead of this one.
        String text = "text_example"; // String | Metric registry search term. Only show metrics that contain the term in their key, display name, or description. Use the `metricSelector` parameter instead of this one to select a complete metric hierarchy instead of doing a text-based search.
        String fields = "fields_example"; // String | Defines the list of metric properties included in the response.   `metricId` is **always** included in the result. The following additional properties are available:   * `displayName`: The name of the metric in the user interface. Enabled by default.  * `description`: A short description of the metric. Enabled by default.  * `unit`: The unit of the metric. Enabled by default.  * `tags`: The tags of the metric.  + `dduBillable`:  An indicator whether the usage of metric consumes [Davis data units](https://dt-url.net/ddu).  * `created`:  The timestamp (UTC milliseconds) when the metrics has been created.  * `lastWritten`:  The timestamp (UTC milliseconds) when metric data points have been written for the last time.  * `aggregationTypes`: The list of allowed aggregations for the metric. Note that it may be different after a [transformation](https://dt-url.net/metricSelector) is applied.  * `defaultAggregation`: The default aggregation of the metric. It is used when no aggregation is specified or the `:auto` transformation is set.  * `dimensionDefinitions`: The fine metric division (for example, process group and process ID for some process-related metric).  * `transformations`: A list of [transformations](https://dt-url.net/metricSelector) that can be applied to the metric. * `entityType`: A list of entity types supported by the metric. * `minimumValue`: The minimum allowed value of the metric. * `maximumValue`: The maximum allowed value of the metric. * `rootCauseRelevant`: Whether (true or false) the metric is related to a root cause of a problem. A root-cause relevant metric represents a strong indicator for a faulty component. * `impactRelevant`: Whether (true or false) the metric is relevant to a problem's impact. An impact-relevant metric is highly dependent on other metrics and changes because an underlying root-cause metric has changed. * `metricValueType`: The type of the metric's value. You have these options:   * `score`: A score metric is a metric where high values indicate a good situation, while low values indicate trouble. An example of such a metric is a success rate.   * `error`: An error metric is a metric where high values indicate trouble, while low values indicate a good situation. An example of such a metric is an error count. * `latency`: The latency of the metric, in minutes. The latency is the expected reporting delay (for example, caused by constraints of cloud vendors or other third-party data sources) between the observation of a metric data point and its availability in Dynatrace. The allowed value range is from `1` to `60` minutes. * `metricSelector`: The underlying metric selector used by a func: metric. * `scalar`: Indicates whether the metric expression resolves to a scalar (`true`) or to a series (`false`).  A scalar result always contains one data point. The amount of data points in a series result depends on the resolution you're using.  * `resolutionInfSupported`: If `true`, resolution=Inf can be applied to the metric query.   To add properties, list them with leading plus `+`. To exclude default properties, list them with leading minus `-`.  To specify several properties, join them with a comma (for example `fields=+aggregationTypes,-description`).  If you specify just one property, the response contains the metric key and the specified property. To return metric keys only, specify `metricId` here.
        String writtenSince = "writtenSince_example"; // String | Filters the resulted set of metrics to those that have data points within the specified timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   
        String metadataSelector = "metadataSelector_example"; // String | The metadata scope of the query. Only metrics with specified properties are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the `EQUALS` operator is used. If several values are specified, the **OR** logic applies.   * `unit(\"unit-1\",\"unit-2\")`  * `tags(\"tag-1\",\"tag-2\")`  * `dimensionKey(\"dimkey-1\",\"dimkey-2\")`. The filtering applies only to dimensions that were written within the last 14 days.  To set several criteria, separate them with a comma (`,`). For example, `tags(\"feature\",\"cloud\"),unit(\"Percent\"),dimensionKey(\"location\")`. Only results matching **all** criteria are included in response.   For example, to list metrics that have the tags **feature** AND **cloud** with a unit of **Percent** OR **MegaByte** AND a dimension with a dimension key **location**, use this **metadataSelector**: `tags(\"feature\"),unit(\"Percent\",\"MegaByte\"),tags(\"cloud\"),dimensionKey(\"location\")`.
        try {
            ApiResponse<MetricDescriptorCollection> response = apiInstance.allMetricsWithHttpInfo(nextPageKey, pageSize, metricSelector, text, fields, writtenSince, metadataSelector);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#allMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nextPageKey** | **String**| The cursor for the next page of results. You can find it in the **nextPageKey** field of the previous response.   The first page is always returned if you don&#39;t specify the **nextPageKey** query parameter.   When the **nextPageKey** is set to obtain subsequent pages, you must omit all other query parameters.  | [optional] |
| **pageSize** | **Long**| The amount of metric schemata in a single response payload.   The maximal allowed page size is 500.   If not set, 100 is used.   If a value higher than 500 is used, only 500 results per page are returned. | [optional] |
| **metricSelector** | **String**| Selects metrics for the query by their keys.   You can specify multiple metric keys separated by commas (for example, &#x60;metrickey1,metrickey2&#x60;). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the &#x60;builtin:host.cpu.idle&#x60; and &#x60;builtin:host.cpu.user&#x60; metric, write: &#x60;builtin:host.cpu.(idle,user)&#x60;.   You can select a full set of related metrics by using a trailing asterisk (&#x60;*&#x60;) wildcard. For example, &#x60;builtin:host.*&#x60; selects all host-based metrics and &#x60;builtin:*&#x60; selects all Dynatrace-provided metrics.   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.   Only &#x60;aggregation&#x60;, &#x60;merge&#x60;, &#x60;parents&#x60;, and &#x60;splitBy&#x60; transformations are supported by this endpoint.   If the metric key contains any symbols you must quote (&#x60;\&quot;&#x60;) the key. The following characters inside of a quoted metric key must be escaped with a tilde (&#x60;~&#x60;):  * Quotes (&#x60;\&quot;&#x60;) * Tildes (&#x60;~&#x60;)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \&quot;APACHE\&quot;** you must specify this selector:    &#x60;\&quot;ext:selfmonitoring.jmx.Agents: Type ~\&quot;APACHE~\&quot;\&quot;&#x60;      To find metrics based on a search term, rather than metricId, use the **text** query parameter instead of this one. | [optional] |
| **text** | **String**| Metric registry search term. Only show metrics that contain the term in their key, display name, or description. Use the &#x60;metricSelector&#x60; parameter instead of this one to select a complete metric hierarchy instead of doing a text-based search. | [optional] |
| **fields** | **String**| Defines the list of metric properties included in the response.   &#x60;metricId&#x60; is **always** included in the result. The following additional properties are available:   * &#x60;displayName&#x60;: The name of the metric in the user interface. Enabled by default.  * &#x60;description&#x60;: A short description of the metric. Enabled by default.  * &#x60;unit&#x60;: The unit of the metric. Enabled by default.  * &#x60;tags&#x60;: The tags of the metric.  + &#x60;dduBillable&#x60;:  An indicator whether the usage of metric consumes [Davis data units](https://dt-url.net/ddu).  * &#x60;created&#x60;:  The timestamp (UTC milliseconds) when the metrics has been created.  * &#x60;lastWritten&#x60;:  The timestamp (UTC milliseconds) when metric data points have been written for the last time.  * &#x60;aggregationTypes&#x60;: The list of allowed aggregations for the metric. Note that it may be different after a [transformation](https://dt-url.net/metricSelector) is applied.  * &#x60;defaultAggregation&#x60;: The default aggregation of the metric. It is used when no aggregation is specified or the &#x60;:auto&#x60; transformation is set.  * &#x60;dimensionDefinitions&#x60;: The fine metric division (for example, process group and process ID for some process-related metric).  * &#x60;transformations&#x60;: A list of [transformations](https://dt-url.net/metricSelector) that can be applied to the metric. * &#x60;entityType&#x60;: A list of entity types supported by the metric. * &#x60;minimumValue&#x60;: The minimum allowed value of the metric. * &#x60;maximumValue&#x60;: The maximum allowed value of the metric. * &#x60;rootCauseRelevant&#x60;: Whether (true or false) the metric is related to a root cause of a problem. A root-cause relevant metric represents a strong indicator for a faulty component. * &#x60;impactRelevant&#x60;: Whether (true or false) the metric is relevant to a problem&#39;s impact. An impact-relevant metric is highly dependent on other metrics and changes because an underlying root-cause metric has changed. * &#x60;metricValueType&#x60;: The type of the metric&#39;s value. You have these options:   * &#x60;score&#x60;: A score metric is a metric where high values indicate a good situation, while low values indicate trouble. An example of such a metric is a success rate.   * &#x60;error&#x60;: An error metric is a metric where high values indicate trouble, while low values indicate a good situation. An example of such a metric is an error count. * &#x60;latency&#x60;: The latency of the metric, in minutes. The latency is the expected reporting delay (for example, caused by constraints of cloud vendors or other third-party data sources) between the observation of a metric data point and its availability in Dynatrace. The allowed value range is from &#x60;1&#x60; to &#x60;60&#x60; minutes. * &#x60;metricSelector&#x60;: The underlying metric selector used by a func: metric. * &#x60;scalar&#x60;: Indicates whether the metric expression resolves to a scalar (&#x60;true&#x60;) or to a series (&#x60;false&#x60;).  A scalar result always contains one data point. The amount of data points in a series result depends on the resolution you&#39;re using.  * &#x60;resolutionInfSupported&#x60;: If &#x60;true&#x60;, resolution&#x3D;Inf can be applied to the metric query.   To add properties, list them with leading plus &#x60;+&#x60;. To exclude default properties, list them with leading minus &#x60;-&#x60;.  To specify several properties, join them with a comma (for example &#x60;fields&#x3D;+aggregationTypes,-description&#x60;).  If you specify just one property, the response contains the metric key and the specified property. To return metric keys only, specify &#x60;metricId&#x60; here. | [optional] |
| **writtenSince** | **String**| Filters the resulted set of metrics to those that have data points within the specified timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years    | [optional] |
| **metadataSelector** | **String**| The metadata scope of the query. Only metrics with specified properties are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used. If several values are specified, the **OR** logic applies.   * &#x60;unit(\&quot;unit-1\&quot;,\&quot;unit-2\&quot;)&#x60;  * &#x60;tags(\&quot;tag-1\&quot;,\&quot;tag-2\&quot;)&#x60;  * &#x60;dimensionKey(\&quot;dimkey-1\&quot;,\&quot;dimkey-2\&quot;)&#x60;. The filtering applies only to dimensions that were written within the last 14 days.  To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;tags(\&quot;feature\&quot;,\&quot;cloud\&quot;),unit(\&quot;Percent\&quot;),dimensionKey(\&quot;location\&quot;)&#x60;. Only results matching **all** criteria are included in response.   For example, to list metrics that have the tags **feature** AND **cloud** with a unit of **Percent** OR **MegaByte** AND a dimension with a dimension key **location**, use this **metadataSelector**: &#x60;tags(\&quot;feature\&quot;),unit(\&quot;Percent\&quot;,\&quot;MegaByte\&quot;),tags(\&quot;cloud\&quot;),dimensionKey(\&quot;location\&quot;)&#x60;. | [optional] |

### Return type

ApiResponse<[**MetricDescriptorCollection**](MetricDescriptorCollection.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax or validation error. **metricSelector** or **fields** have syntactic or semantic errors. |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |


## delete

> void delete(metricKey)

Deletes the specified metric

Deletion cannot be undone! You can&#39;t delete a metric if it has data points ingested within the last two hours.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.   
        try {
            apiInstance.delete(metricKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#delete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricKey** | **String**| The key of the required metric.    | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success. The deletion of the metric has been triggered. |  -  |
| **400** | Failed. The metric has been written within the last two hours. |  -  |
| **404** | Failed. The metric cannot be found or the key cannot be parsed. |  -  |
| **500** | Failed. The deletion of metric dimensions failed. |  -  |

## deleteWithHttpInfo

> ApiResponse<Void> delete deleteWithHttpInfo(metricKey)

Deletes the specified metric

Deletion cannot be undone! You can&#39;t delete a metric if it has data points ingested within the last two hours.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.   
        try {
            ApiResponse<Void> response = apiInstance.deleteWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#delete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricKey** | **String**| The key of the required metric.    | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success. The deletion of the metric has been triggered. |  -  |
| **400** | Failed. The metric has been written within the last two hours. |  -  |
| **404** | Failed. The metric cannot be found or the key cannot be parsed. |  -  |
| **500** | Failed. The deletion of metric dimensions failed. |  -  |


## ingest

> void ingest(body)

Pushes metric data points to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String body = server.cpu.temperature,cpu.id=0 42; // String | Data points, provided in the [line protocol](https://dt-url.net/5d63ic1). Each line represents a single data point.
        try {
            apiInstance.ingest(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#ingest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**| Data points, provided in the [line protocol](https://dt-url.net/5d63ic1). Each line represents a single data point. | |

### Return type


null (empty response body)

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: text/plain; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The provided metric data points are accepted and will be processed in the background. |  -  |
| **400** | Some data points are invalid. Valid data points are accepted and will be processed in the background. |  -  |

## ingestWithHttpInfo

> ApiResponse<Void> ingest ingestWithHttpInfo(body)

Pushes metric data points to Dynatrace

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String body = server.cpu.temperature,cpu.id=0 42; // String | Data points, provided in the [line protocol](https://dt-url.net/5d63ic1). Each line represents a single data point.
        try {
            ApiResponse<Void> response = apiInstance.ingestWithHttpInfo(body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#ingest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**| Data points, provided in the [line protocol](https://dt-url.net/5d63ic1). Each line represents a single data point. | |

### Return type


ApiResponse<Void>

### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: text/plain; charset=utf-8
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The provided metric data points are accepted and will be processed in the background. |  -  |
| **400** | Some data points are invalid. Valid data points are accepted and will be processed in the background. |  -  |


## metric

> MetricDescriptor metric(metricKey)

Gets the descriptor of the specified metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.
        try {
            MetricDescriptor result = apiInstance.metric(metricKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#metric");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricKey** | **String**| The key of the required metric.   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax. | |

### Return type

[**MetricDescriptor**](MetricDescriptor.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |

## metricWithHttpInfo

> ApiResponse<MetricDescriptor> metric metricWithHttpInfo(metricKey)

Gets the descriptor of the specified metric

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricKey = "metricKey_example"; // String | The key of the required metric.   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.
        try {
            ApiResponse<MetricDescriptor> response = apiInstance.metricWithHttpInfo(metricKey);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#metric");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricKey** | **String**| The key of the required metric.   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax. | |

### Return type

ApiResponse<[**MetricDescriptor**](MetricDescriptor.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |


## query

> MetricData query(metricSelector, resolution, from, to, entitySelector, mzSelector)

Gets data points of the specified metrics

The following limits apply:  * The amount of aggregated data points in the response is limited to 1,000  * The amount of series in the response is limited to 1,000     * The amount of data points per series is limited to 10,080 (minutes of one week)     * The overall amount of data points is limited to 100,000   The **dataPointCountRatio** specifies the ratio of queried data points divided by the maximum number of data points per metric that are allowed in a single query. The **dimensionCountRatio** specifies the ratio of queried dimension tuples divided by the maximum number of dimension tuples allowed in a single query.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricSelector = "metricSelector_example"; // String | Selects metrics for the query by their keys. You can select up to 10 metrics for one query.   You can specify multiple metric keys separated by commas (for example, `metrickey1,metrickey2`). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the `builtin:host.cpu.idle` and `builtin:host.cpu.user` metric, write: `builtin:host.cpu.(idle,user)`.      If the metric key contains any symbols you must quote (`\"`) the key. The following characters inside of a quoted metric key must be escaped with a tilde (`~`):  * Quotes (`\"`) * Tildes (`~`)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \"APACHE\"** you must specify this selector:    `\"ext:selfmonitoring.jmx.Agents: Type ~\"APACHE~\"\"`   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.
        String resolution = "resolution_example"; // String | The desired resolution of data points.   You can use one of the following options:  * The desired amount of data points. This is the default option. This is a reference number of points, which is not necessarily equal to the number of the returned data points.  * The desired timespan between data points. This is a reference timespan, which is not necessarily equal to the returned timespan. To use this option, specify the unit of the timespan.   Valid units for the timespan are:  * `m`: minutes  * `h`: hours  * `d`: days  * `w`: weeks  * `M`: months  * `y`: years   If not set, the default is **120 data points**.  For example:   * Get data points which are 10 minutes apart: `resolution=10m`  * Get data points which are 3 weeks apart: `resolution=3w`
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String entitySelector = "entitySelector_example"; // String | Specifies the entity scope of the query. Only data points delivered by matched entities are included in response.   You must set one of these criteria:   * Entity type: `type(\"TYPE\")`  * Dynatrace entity ID: `entityId(\"id\")`. You can specify several IDs, separated by a comma (`entityId(\"id-1\",\"id-2\")`). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the `EQUALS` operator is used unless otherwise specified.   * Tag: `tag(\"value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. Any colons (`:`) that are part of the key or value must be escaped with a backslash(`\\`), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: `mzId(123)`  * Management zone name: `mzName(\"value\")` * Entity name:   * `entityName.equals`: performs a non-casesensitive `EQUALS` query.   * `entityName.startsWith`: changes the operator to `BEGINS WITH`.   * `entityName.in`: enables you to provide multiple values. The `EQUALS` operator applies.   * `caseSensitive(entityName.equals(\"value\"))`: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): `healthState(\"HEALTHY\")` * First seen timestamp: `firstSeenTms.<operator>(now-3h)`. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * `lte`: earlier than or at the specified time  * `lt`: earlier than the specified time  * `gte`: later than or at the specified time  * `gt`: later than the specified time * Entity attribute: `<attribute>(\"value1\",\"value2\")` and `<attribute>.exists()`. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: `fromRelationships.<relationshipName>()` and `toRelationships.<relationshipName>()`. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: `not(<criterion>)`. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (`,`). For example, `type(\"HOST\"),healthState(\"HEALTHY\")`. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   Use the [`GET /metrics/{metricId}`](https://dt-url.net/6z23ifk) call to fetch the list of possible entity types for your metric.   To set a universal scope matching all entities, omit this parameter.
        String mzSelector = "mzSelector_example"; // String | The management zone scope of the query. Only metrics data relating to the specified management zones are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the `EQUALS` operator is used. If several values are specified, the **OR** logic applies.   * `mzId(123,456)`  * `mzName(\"name-1\",\"name-2\")`  To set several criteria, separate them with a comma (`,`). For example, `mzName(\"name-1\",\"name-2\"),mzId(1234)`. Only results matching **all** of the criteria are included in the response.For example, to list metrics that have the id **123** OR **234** AND the name **name-1** OR **name-2**, use this **mzSelector**: `mzId(123,234),mzName(\"name-1\",\"name-2\").
        try {
            MetricData result = apiInstance.query(metricSelector, resolution, from, to, entitySelector, mzSelector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#query");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricSelector** | **String**| Selects metrics for the query by their keys. You can select up to 10 metrics for one query.   You can specify multiple metric keys separated by commas (for example, &#x60;metrickey1,metrickey2&#x60;). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the &#x60;builtin:host.cpu.idle&#x60; and &#x60;builtin:host.cpu.user&#x60; metric, write: &#x60;builtin:host.cpu.(idle,user)&#x60;.      If the metric key contains any symbols you must quote (&#x60;\&quot;&#x60;) the key. The following characters inside of a quoted metric key must be escaped with a tilde (&#x60;~&#x60;):  * Quotes (&#x60;\&quot;&#x60;) * Tildes (&#x60;~&#x60;)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \&quot;APACHE\&quot;** you must specify this selector:    &#x60;\&quot;ext:selfmonitoring.jmx.Agents: Type ~\&quot;APACHE~\&quot;\&quot;&#x60;   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax. | [optional] |
| **resolution** | **String**| The desired resolution of data points.   You can use one of the following options:  * The desired amount of data points. This is the default option. This is a reference number of points, which is not necessarily equal to the number of the returned data points.  * The desired timespan between data points. This is a reference timespan, which is not necessarily equal to the returned timespan. To use this option, specify the unit of the timespan.   Valid units for the timespan are:  * &#x60;m&#x60;: minutes  * &#x60;h&#x60;: hours  * &#x60;d&#x60;: days  * &#x60;w&#x60;: weeks  * &#x60;M&#x60;: months  * &#x60;y&#x60;: years   If not set, the default is **120 data points**.  For example:   * Get data points which are 10 minutes apart: &#x60;resolution&#x3D;10m&#x60;  * Get data points which are 3 weeks apart: &#x60;resolution&#x3D;3w&#x60; | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **entitySelector** | **String**| Specifies the entity scope of the query. Only data points delivered by matched entities are included in response.   You must set one of these criteria:   * Entity type: &#x60;type(\&quot;TYPE\&quot;)&#x60;  * Dynatrace entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. You can specify several IDs, separated by a comma (&#x60;entityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.   * Tag: &#x60;tag(\&quot;value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. Any colons (&#x60;:&#x60;) that are part of the key or value must be escaped with a backslash(&#x60;\\&#x60;), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: &#x60;mzId(123)&#x60;  * Management zone name: &#x60;mzName(\&quot;value\&quot;)&#x60; * Entity name:   * &#x60;entityName.equals&#x60;: performs a non-casesensitive &#x60;EQUALS&#x60; query.   * &#x60;entityName.startsWith&#x60;: changes the operator to &#x60;BEGINS WITH&#x60;.   * &#x60;entityName.in&#x60;: enables you to provide multiple values. The &#x60;EQUALS&#x60; operator applies.   * &#x60;caseSensitive(entityName.equals(\&quot;value\&quot;))&#x60;: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): &#x60;healthState(\&quot;HEALTHY\&quot;)&#x60; * First seen timestamp: &#x60;firstSeenTms.&lt;operator&gt;(now-3h)&#x60;. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * &#x60;lte&#x60;: earlier than or at the specified time  * &#x60;lt&#x60;: earlier than the specified time  * &#x60;gte&#x60;: later than or at the specified time  * &#x60;gt&#x60;: later than the specified time * Entity attribute: &#x60;&lt;attribute&gt;(\&quot;value1\&quot;,\&quot;value2\&quot;)&#x60; and &#x60;&lt;attribute&gt;.exists()&#x60;. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: &#x60;fromRelationships.&lt;relationshipName&gt;()&#x60; and &#x60;toRelationships.&lt;relationshipName&gt;()&#x60;. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: &#x60;not(&lt;criterion&gt;)&#x60;. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;type(\&quot;HOST\&quot;),healthState(\&quot;HEALTHY\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   Use the [&#x60;GET /metrics/{metricId}&#x60;](https://dt-url.net/6z23ifk) call to fetch the list of possible entity types for your metric.   To set a universal scope matching all entities, omit this parameter. | [optional] |
| **mzSelector** | **String**| The management zone scope of the query. Only metrics data relating to the specified management zones are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used. If several values are specified, the **OR** logic applies.   * &#x60;mzId(123,456)&#x60;  * &#x60;mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;  To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;),mzId(1234)&#x60;. Only results matching **all** of the criteria are included in the response.For example, to list metrics that have the id **123** OR **234** AND the name **name-1** OR **name-2**, use this **mzSelector**: &#x60;mzId(123,234),mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;). | [optional] |

### Return type

[**MetricData**](MetricData.md)


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax or validation error. From and to parameters, entitySelector or resolution are incorrect individually or in their combined meaning. |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |

## queryWithHttpInfo

> ApiResponse<MetricData> query queryWithHttpInfo(metricSelector, resolution, from, to, entitySelector, mzSelector)

Gets data points of the specified metrics

The following limits apply:  * The amount of aggregated data points in the response is limited to 1,000  * The amount of series in the response is limited to 1,000     * The amount of data points per series is limited to 10,080 (minutes of one week)     * The overall amount of data points is limited to 100,000   The **dataPointCountRatio** specifies the ratio of queried data points divided by the maximum number of data points per metric that are allowed in a single query. The **dimensionCountRatio** specifies the ratio of queried dimension tuples divided by the maximum number of dimension tuples allowed in a single query.

### Example

```java
// Import classes:
import com.dynatrace.apis.envv2.ApiClient;
import com.dynatrace.apis.envv2.ApiException;
import com.dynatrace.apis.envv2.ApiResponse;
import com.dynatrace.apis.envv2.Configuration;
import com.dynatrace.apis.envv2.auth.*;
import com.dynatrace.apis.envv2.models.*;
import com.dynatrace.apis.envv2.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://fbj16975.sprint.dynatracelabs.com/api/v2");
        
        // Configure API key authorization: Api-Token
        ApiKeyAuth Api-Token = (ApiKeyAuth) defaultClient.getAuthentication("Api-Token");
        Api-Token.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Token.setApiKeyPrefix("Token");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricSelector = "metricSelector_example"; // String | Selects metrics for the query by their keys. You can select up to 10 metrics for one query.   You can specify multiple metric keys separated by commas (for example, `metrickey1,metrickey2`). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the `builtin:host.cpu.idle` and `builtin:host.cpu.user` metric, write: `builtin:host.cpu.(idle,user)`.      If the metric key contains any symbols you must quote (`\"`) the key. The following characters inside of a quoted metric key must be escaped with a tilde (`~`):  * Quotes (`\"`) * Tildes (`~`)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \"APACHE\"** you must specify this selector:    `\"ext:selfmonitoring.jmx.Agents: Type ~\"APACHE~\"\"`   You can set additional transformation operators, separated by a colon (`:`). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax.
        String resolution = "resolution_example"; // String | The desired resolution of data points.   You can use one of the following options:  * The desired amount of data points. This is the default option. This is a reference number of points, which is not necessarily equal to the number of the returned data points.  * The desired timespan between data points. This is a reference timespan, which is not necessarily equal to the returned timespan. To use this option, specify the unit of the timespan.   Valid units for the timespan are:  * `m`: minutes  * `h`: hours  * `d`: days  * `w`: weeks  * `M`: months  * `y`: years   If not set, the default is **120 data points**.  For example:   * Get data points which are 10 minutes apart: `resolution=10m`  * Get data points which are 3 weeks apart: `resolution=3w`
        String from = "from_example"; // String | The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the relative timeframe of two hours is used (`now-2h`).
        String to = "to_example"; // String | The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of `2021-01-25T05:57:01.123+01:00`. If no time zone is specified, UTC is used. You can use a space character instead of the `T`. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is `now-NU/A`, where `N` is the amount of time, `U` is the unit of time, and `A` is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, `now-1y/w` is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: `now-NU`.  Supported time units for the relative timeframe are:     * `m`: minutes     * `h`: hours     * `d`: days     * `w`: weeks     * `M`: months     * `y`: years   If not set, the current timestamp is used.
        String entitySelector = "entitySelector_example"; // String | Specifies the entity scope of the query. Only data points delivered by matched entities are included in response.   You must set one of these criteria:   * Entity type: `type(\"TYPE\")`  * Dynatrace entity ID: `entityId(\"id\")`. You can specify several IDs, separated by a comma (`entityId(\"id-1\",\"id-2\")`). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the `EQUALS` operator is used unless otherwise specified.   * Tag: `tag(\"value\")`. Tags in `[context]key:value`, `key:value`, and `value` formats are detected and parsed automatically. Any colons (`:`) that are part of the key or value must be escaped with a backslash(`\\`), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: `mzId(123)`  * Management zone name: `mzName(\"value\")` * Entity name:   * `entityName.equals`: performs a non-casesensitive `EQUALS` query.   * `entityName.startsWith`: changes the operator to `BEGINS WITH`.   * `entityName.in`: enables you to provide multiple values. The `EQUALS` operator applies.   * `caseSensitive(entityName.equals(\"value\"))`: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): `healthState(\"HEALTHY\")` * First seen timestamp: `firstSeenTms.<operator>(now-3h)`. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * `lte`: earlier than or at the specified time  * `lt`: earlier than the specified time  * `gte`: later than or at the specified time  * `gt`: later than the specified time * Entity attribute: `<attribute>(\"value1\",\"value2\")` and `<attribute>.exists()`. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: `fromRelationships.<relationshipName>()` and `toRelationships.<relationshipName>()`. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: `not(<criterion>)`. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (`,`). For example, `type(\"HOST\"),healthState(\"HEALTHY\")`. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   Use the [`GET /metrics/{metricId}`](https://dt-url.net/6z23ifk) call to fetch the list of possible entity types for your metric.   To set a universal scope matching all entities, omit this parameter.
        String mzSelector = "mzSelector_example"; // String | The management zone scope of the query. Only metrics data relating to the specified management zones are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the `EQUALS` operator is used. If several values are specified, the **OR** logic applies.   * `mzId(123,456)`  * `mzName(\"name-1\",\"name-2\")`  To set several criteria, separate them with a comma (`,`). For example, `mzName(\"name-1\",\"name-2\"),mzId(1234)`. Only results matching **all** of the criteria are included in the response.For example, to list metrics that have the id **123** OR **234** AND the name **name-1** OR **name-2**, use this **mzSelector**: `mzId(123,234),mzName(\"name-1\",\"name-2\").
        try {
            ApiResponse<MetricData> response = apiInstance.queryWithHttpInfo(metricSelector, resolution, from, to, entitySelector, mzSelector);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#query");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **metricSelector** | **String**| Selects metrics for the query by their keys. You can select up to 10 metrics for one query.   You can specify multiple metric keys separated by commas (for example, &#x60;metrickey1,metrickey2&#x60;). To select multiple metrics belonging to the same parent, list the last part of the required metric keys in parentheses, separated by commas, while keeping the common part untouched. For example, to list the &#x60;builtin:host.cpu.idle&#x60; and &#x60;builtin:host.cpu.user&#x60; metric, write: &#x60;builtin:host.cpu.(idle,user)&#x60;.      If the metric key contains any symbols you must quote (&#x60;\&quot;&#x60;) the key. The following characters inside of a quoted metric key must be escaped with a tilde (&#x60;~&#x60;):  * Quotes (&#x60;\&quot;&#x60;) * Tildes (&#x60;~&#x60;)   For example, to query the metric with the key of **ext:selfmonitoring.jmx.Agents: Type \&quot;APACHE\&quot;** you must specify this selector:    &#x60;\&quot;ext:selfmonitoring.jmx.Agents: Type ~\&quot;APACHE~\&quot;\&quot;&#x60;   You can set additional transformation operators, separated by a colon (&#x60;:&#x60;). See [Metrics selector transformations](https://dt-url.net/metricSelector) in Dynatrace Documentation for additional information on available result transformations and syntax. | [optional] |
| **resolution** | **String**| The desired resolution of data points.   You can use one of the following options:  * The desired amount of data points. This is the default option. This is a reference number of points, which is not necessarily equal to the number of the returned data points.  * The desired timespan between data points. This is a reference timespan, which is not necessarily equal to the returned timespan. To use this option, specify the unit of the timespan.   Valid units for the timespan are:  * &#x60;m&#x60;: minutes  * &#x60;h&#x60;: hours  * &#x60;d&#x60;: days  * &#x60;w&#x60;: weeks  * &#x60;M&#x60;: months  * &#x60;y&#x60;: years   If not set, the default is **120 data points**.  For example:   * Get data points which are 10 minutes apart: &#x60;resolution&#x3D;10m&#x60;  * Get data points which are 3 weeks apart: &#x60;resolution&#x3D;3w&#x60; | [optional] |
| **from** | **String**| The start of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the relative timeframe of two hours is used (&#x60;now-2h&#x60;). | [optional] |
| **to** | **String**| The end of the requested timeframe.   You can use one of the following formats:  * Timestamp in UTC milliseconds.  * Human-readable format of &#x60;2021-01-25T05:57:01.123+01:00&#x60;. If no time zone is specified, UTC is used. You can use a space character instead of the &#x60;T&#x60;. Seconds and fractions of a second are optional.  * Relative timeframe, back from now. The format is &#x60;now-NU/A&#x60;, where &#x60;N&#x60; is the amount of time, &#x60;U&#x60; is the unit of time, and &#x60;A&#x60; is an alignment. The alignment rounds all the smaller values to the nearest zero in the past. For example, &#x60;now-1y/w&#x60; is one year back, aligned by a week.  You can also specify relative timeframe without an alignment: &#x60;now-NU&#x60;.  Supported time units for the relative timeframe are:     * &#x60;m&#x60;: minutes     * &#x60;h&#x60;: hours     * &#x60;d&#x60;: days     * &#x60;w&#x60;: weeks     * &#x60;M&#x60;: months     * &#x60;y&#x60;: years   If not set, the current timestamp is used. | [optional] |
| **entitySelector** | **String**| Specifies the entity scope of the query. Only data points delivered by matched entities are included in response.   You must set one of these criteria:   * Entity type: &#x60;type(\&quot;TYPE\&quot;)&#x60;  * Dynatrace entity ID: &#x60;entityId(\&quot;id\&quot;)&#x60;. You can specify several IDs, separated by a comma (&#x60;entityId(\&quot;id-1\&quot;,\&quot;id-2\&quot;)&#x60;). All requested entities must be of the same type.   You can add one or several of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used unless otherwise specified.   * Tag: &#x60;tag(\&quot;value\&quot;)&#x60;. Tags in &#x60;[context]key:value&#x60;, &#x60;key:value&#x60;, and &#x60;value&#x60; formats are detected and parsed automatically. Any colons (&#x60;:&#x60;) that are part of the key or value must be escaped with a backslash(&#x60;\\&#x60;), otherwise, it will be interpreted as the separator between the key and the value. All tag values are case-sensitive.  * Management zone ID: &#x60;mzId(123)&#x60;  * Management zone name: &#x60;mzName(\&quot;value\&quot;)&#x60; * Entity name:   * &#x60;entityName.equals&#x60;: performs a non-casesensitive &#x60;EQUALS&#x60; query.   * &#x60;entityName.startsWith&#x60;: changes the operator to &#x60;BEGINS WITH&#x60;.   * &#x60;entityName.in&#x60;: enables you to provide multiple values. The &#x60;EQUALS&#x60; operator applies.   * &#x60;caseSensitive(entityName.equals(\&quot;value\&quot;))&#x60;: takes any entity name criterion as an arguments and makes the value case-sensitive. * Health state (HEALTHY,UNHEALTHY): &#x60;healthState(\&quot;HEALTHY\&quot;)&#x60; * First seen timestamp: &#x60;firstSeenTms.&lt;operator&gt;(now-3h)&#x60;. Use any timestamp format from the **from**_/_**to** parameters.   The following operators are available:  * &#x60;lte&#x60;: earlier than or at the specified time  * &#x60;lt&#x60;: earlier than the specified time  * &#x60;gte&#x60;: later than or at the specified time  * &#x60;gt&#x60;: later than the specified time * Entity attribute: &#x60;&lt;attribute&gt;(\&quot;value1\&quot;,\&quot;value2\&quot;)&#x60; and &#x60;&lt;attribute&gt;.exists()&#x60;. To fetch the list of available attributes, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **properties** field of the response.  * Relationships: &#x60;fromRelationships.&lt;relationshipName&gt;()&#x60; and &#x60;toRelationships.&lt;relationshipName&gt;()&#x60;. The criterion takes an entity selector as an attribute. To fetch the list of available relationships, execute the [GET entity type](https://dt-url.net/2ka3ivt) request and check the **fromRelationships** and **toRelationships** fields. * Negation: &#x60;not(&lt;criterion&gt;)&#x60;. Inverts any criterion except for **type**.   For more information, see [Entity selector](https://dt-url.net/apientityselector) in Dynatrace Documentation.   To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;type(\&quot;HOST\&quot;),healthState(\&quot;HEALTHY\&quot;)&#x60;. Only results matching **all** criteria are included in response.   Supported string length is 2,000 characters.   Use the [&#x60;GET /metrics/{metricId}&#x60;](https://dt-url.net/6z23ifk) call to fetch the list of possible entity types for your metric.   To set a universal scope matching all entities, omit this parameter. | [optional] |
| **mzSelector** | **String**| The management zone scope of the query. Only metrics data relating to the specified management zones are included to the response.   You can set one or more of the following criteria. Values are case-sensitive and the &#x60;EQUALS&#x60; operator is used. If several values are specified, the **OR** logic applies.   * &#x60;mzId(123,456)&#x60;  * &#x60;mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;)&#x60;  To set several criteria, separate them with a comma (&#x60;,&#x60;). For example, &#x60;mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;),mzId(1234)&#x60;. Only results matching **all** of the criteria are included in the response.For example, to list metrics that have the id **123** OR **234** AND the name **name-1** OR **name-2**, use this **mzSelector**: &#x60;mzId(123,234),mzName(\&quot;name-1\&quot;,\&quot;name-2\&quot;). | [optional] |

### Return type

ApiResponse<[**MetricData**](MetricData.md)>


### Authorization

[Api-Token](../README.md#Api-Token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, text/csv; header=present; charset=utf-8, text/csv; header=absent; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax or validation error. From and to parameters, entitySelector or resolution are incorrect individually or in their combined meaning. |  -  |
| **404** | A metric has not been found. |  -  |
| **406** | Not acceptable. The requested media type is not supported. Check the **Accept** header of your request. |  -  |

