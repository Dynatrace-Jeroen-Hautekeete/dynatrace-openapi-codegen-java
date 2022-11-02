

# NetworkZoneConnectionStatistics

Runtime information about host connections.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hostsConnectedAsAlternative** | **List&lt;String&gt;** | Hosts that use the network zone as an alternative. |  [optional] [readonly] |
|**hostsConnectedAsFailoverWithoutActiveGates** | **List&lt;String&gt;** | Hosts from other zones that use the zone (not configured as an alternative) and **no** ActiveGates of higher priority are available. |  [optional] [readonly] |
|**hostsConnectedAsFailover** | **List&lt;String&gt;** | Hosts from other zones that use the zone (not configured as an alternative) even though ActiveGates of higher priority are available. |  [optional] [readonly] |
|**hostsConfiguredButNotConnected** | **List&lt;String&gt;** | Hosts from the network zone that use other zones. |  [optional] [readonly] |



