

# ConnectionInfo

OneAgent connectivity information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantUUID** | **String** | The ID of your Dynatrace environment. |  [optional] |
|**tenantToken** | **String** | The internal token that is used for authentication when OneAgent connects to the Dynatrace cluster to send data. |  [optional] |
|**communicationEndpoints** | **List&lt;String&gt;** | The list of endpoints to connect to the Dynatrace environment. The list is sorted by endpoint priority, descending. |  [optional] |
|**formattedCommunicationEndpoints** | **List&lt;String&gt;** | The formatted list of endpoints to connect to the Dynatrace environment. |  [optional] |



