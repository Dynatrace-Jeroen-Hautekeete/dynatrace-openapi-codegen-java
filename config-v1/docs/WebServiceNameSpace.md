

# WebServiceNameSpace

The contribution to the service ID calculation from the detected web service name space.    You have two mutually exclusive options:  * Override the detected value with a specified static value. Specify the new value in the **valueOverride** field.  * Dynamically transform the detected value. Specify the transformation parameters in the **transformations** field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transformations** | [**List&lt;TransformationBase&gt;**](TransformationBase.md) | Transformations to be applied to the detected value. |  [optional] |
|**valueOverride** | **String** | The value to be used instead of the detected value. |  [optional] |



