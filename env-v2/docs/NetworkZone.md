

# NetworkZone

Configuration of a network zone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alternativeZones** | **Set&lt;String&gt;** | A list of alternative network zones. |  [optional] |
|**numOfOneAgentsUsing** | **Integer** | The number of OneAgents that are using ActiveGates in the network zone. |  [optional] [readonly] |
|**numOfConfiguredOneAgents** | **Integer** | The number of OneAgents that are configured to use the network zone as primary. |  [optional] [readonly] |
|**numOfOneAgentsFromOtherZones** | **Integer** | The number of OneAgents from other network zones that are using ActiveGates in the network zone.    This is a fraction of **numOfOneAgentsUsing**.   One possible reason for switching to another zone is that a firewall is preventing a OneAgent from connecting to any ActiveGate in the preferred network zone.   |  [optional] [readonly] |
|**numOfConfiguredActiveGates** | **Integer** | The number of ActiveGates in the network zone. |  [optional] [readonly] |
|**id** | **String** | The ID of the network zone |  [optional] [readonly] |
|**description** | **String** | A short description of the network zone |  [optional] |



