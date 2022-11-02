

# HttpHeader

The HTTP header.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the HTTP header. |  |
|**value** | **String** | The value of the HTTP header. May contain an empty value.    Required when creating a new notification.   For the **Authorization** header, GET requests return the &#x60;null&#x60; value.   If you want update a notification configuration with an **Authorization** header which you want to remain intact, set the **Authorization** header with the &#x60;null&#x60; value. |  [optional] |



