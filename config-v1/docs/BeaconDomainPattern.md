

# BeaconDomainPattern

Allowed beacon origin for CORS requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainNameMatcher** | [**DomainNameMatcherEnum**](#DomainNameMatcherEnum) | The matching operation for the **domainNamePattern**. |  |
|**domainNamePattern** | **String** | The pattern of the allowed domain name. |  |



## Enum: DomainNameMatcherEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;CONTAINS&quot; |
| ENDS_WITH | &quot;ENDS_WITH&quot; |
| EQUALS | &quot;EQUALS&quot; |
| STARTS_WITH | &quot;STARTS_WITH&quot; |



