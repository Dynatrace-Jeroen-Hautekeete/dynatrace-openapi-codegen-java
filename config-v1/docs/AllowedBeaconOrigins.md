

# AllowedBeaconOrigins

Configuration of the allowed beacon origins for CORS requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**allowedBeaconOrigins** | [**List&lt;BeaconDomainPattern&gt;**](BeaconDomainPattern.md) | A list of allowed beacon origins for CORS requests. |  [optional] |
|**rejectBeaconsWithoutOriginHeader** | **Boolean** | Discard (&#x60;true&#x60;) or keep (&#x60;false&#x60;) beacons without the **Origin** HTTP header on the BeaconForwarder.   If not set, &#x60;false&#x60; is used. |  [optional] |



