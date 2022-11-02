

# TimeoutSettings

Settings for timed action capture.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timedActionSupport** | **Boolean** | Timed action support enabled/disabled.   Enable to detect actions that trigger sending of XHRs via *setTimout* methods. |  |
|**temporaryActionLimit** | **Integer** | Defines how deep temporary actions may cascade. 0 disables temporary actions completely. Recommended value if enabled is 3. |  |
|**temporaryActionTotalTimeout** | **Integer** | The total timeout of all cascaded timeouts that should still be able to create a temporary action |  |



