

# UrlPath

The contribution from the URL, where the web request has been detected, into service ID calculation.    You have two mutually exclusive options:  * Override the detected value with a specified static value. Specify the new value in the **valueOverride** field.  * Dynamically transform the detected value. Specify the transformation parameters in the **transformations** field.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transformations** | [**List&lt;TransformationBase&gt;**](TransformationBase.md) | Transformations to be applied to the detected value. |  [optional] |
|**valueOverride** | **String** | The value to be used instead of the detected value. |  [optional] |



