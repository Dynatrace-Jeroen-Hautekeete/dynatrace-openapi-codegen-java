

# SyntheticLocationUpdate

The update of a synthetic location. The actual object depends on the **type** of the location.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;PUBLIC&#x60; -&gt; SyntheticPublicLocationUpdate  * &#x60;PRIVATE&#x60; -&gt; PrivateSyntheticLocationUpdate   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



