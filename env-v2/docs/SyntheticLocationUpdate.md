

# SyntheticLocationUpdate

The synthetic location update. This is a base object, the exact type depends on the value of the `type` field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Defines the actual set of fields depending on the value. See one of the following objects:   * &#x60;PUBLIC&#x60; -&gt; SyntheticPublicLocationUpdate  * &#x60;PRIVATE&#x60; -&gt; SyntheticPrivateLocationUpdate   |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |



