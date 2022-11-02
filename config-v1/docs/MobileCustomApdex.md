

# MobileCustomApdex

Apdex configuration of a mobile or custom application.   A duration less than the **tolerable** threshold is considered satisfied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**toleratedThreshold** | **Integer** | Apdex **tolerable** threshold, in milliseconds: a duration greater than or equal to this value is considered tolerable. |  |
|**frustratingThreshold** | **Integer** | Apdex **frustrated** threshold, in milliseconds: a duration greater than or equal to this value is considered frustrated. |  |
|**frustratedOnError** | **Boolean** | Apdex error condition: if &#x60;true&#x60; the user session is considered frustrated when an error is reported. |  |



