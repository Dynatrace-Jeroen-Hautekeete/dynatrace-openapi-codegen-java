

# CustomDeviceCreation

Configuration of a custom device.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customDeviceId** | **String** | The internal ID of the custom device.    If you use the ID of an existing device, the respective parameters will be updated. |  |
|**displayName** | **String** | The name of the custom device to be displayed in the user interface. |  |
|**group** | **String** | User defined group ID of entity.   The group ID helps to keep a consistent picture of device-group relations. One of many cases where a proper group is important is service detection: you can define which custom devices should lead to the same service by defining the same group ID for them.   If you set a group ID, it will be hashed into the Dynatrace entity ID of the custom device. In that case the custom device can only be part of one custom device group.   If you don&#39;t set the group ID, Dynatrace will create it based on the ID or type of the custom device. Also, the group will not be hashed into the device ID which means the device may switch groups. |  [optional] |
|**ipAddresses** | **Set&lt;String&gt;** | The list of IP addresses that belong to the custom device.   These addresses are used to automatically discover the horizontal communication relationship between this component and all other observed components within Smartscape. Once a connection is discovered, it is automatically mapped and shown within Smartscape.   If you send a value (including an empty value), the existing values will be overwritten.   If you send &#x60;null&#x60; or omit this field, the existing values will be kept. |  [optional] |
|**listenPorts** | **Set&lt;Integer&gt;** | The list of ports the custom devices listens to.   These ports are used to discover the horizontal communication relationship between this component and all other observed components within Smartscape.   Once a connection is discovered, it is automatically mapped and shown within Smartscape.   If ports are specified, you should also add at least one IP address or a DNS name for the custom device.   If you send a value, the existing values will be overwritten.   If you send &#x60;null&#x60;, or an empty value, or omit this field, the existing values will be kept. |  [optional] |
|**type** | **String** | The technology type definition of the custom device.   It must be the same technology type of the metric you&#39;re reporting.   If you send a value, the existing value will be overwritten.   If you send &#x60;null&#x60;, empty or omit this field, the existing value will be kept. |  [optional] |
|**faviconUrl** | **String** | The icon to be displayed for your custom component within Smartscape. Provide the full URL of the icon file. |  [optional] |
|**configUrl** | **String** | The URL of a configuration web page for the custom device, such as a login page for a firewall or router. |  [optional] |
|**properties** | **Map&lt;String, String&gt;** | The list of key-value pair properties that will be shown beneath the infographics of your custom device. |  [optional] |
|**dnsNames** | **Set&lt;String&gt;** | The list of DNS names related to the custom device.   These names are used to automatically discover the horizontal communication relationship between this component and all other observed components within Smartscape. Once a connection is discovered, it is automatically mapped and shown within Smartscape.   If you send a value, the existing values will be overwritten.   If you send &#x60;null&#x60; or an empty value; or omit this field, the existing values will be kept. |  [optional] |



