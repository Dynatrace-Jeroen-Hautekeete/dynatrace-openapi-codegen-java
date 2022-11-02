

# SyntheticOnDemandExecutionRequestGroup

Contains parameters for the on-demand execution of monitors identified by tags, applications, or services.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Set&lt;String&gt;** | List of tags. Only monitors with all tags assigned will be executed. |  [optional] |
|**applications** | **Set&lt;String&gt;** | List of application identifiers. Only monitors with all applications assigned will be executed. |  [optional] |
|**services** | **Set&lt;String&gt;** | List of service identifiers. Only monitors with all services assigned will be executed. |  [optional] |
|**locations** | **List&lt;String&gt;** | The locations from where monitors are to be executed. |  [optional] |



