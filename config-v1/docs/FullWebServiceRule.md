

# FullWebServiceRule

The service detection rule of the `FULL_WEB_SERVICE` type.   If you have a condition with the **attributeType** set to `FRAMEWORK`, the **values** field from **compareOperations** is limited to the following possible values:    * `AXIS`   * `CXF`   * `HESSIAN`   * `JAX_WS_RI`   * `JBOSS`   * `JERSEY`   * `PROGRESS`   * `RESTEASY`   * `RESTLET`   * `SPRING`   * `TIBCO`   * `WEBLOGIC`   * `WEBMETHODS`   * `WEBSPHERE`   * `WINK`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of the service detection rule. |  |
|**metadata** | [**ConfigurationMetadata**](ConfigurationMetadata.md) |  |  [optional] |
|**managementZones** | **List&lt;String&gt;** | The management zone (specified by the ID) of the process group for which this service detection rule should be created.    You can specify only 1 management zone here. |  [optional] |
|**id** | **UUID** | The ID of the service detection rule. |  [optional] |
|**order** | **String** | The order of the rule in the rules list.    The rules are evaluated from top to bottom. The first matching rule applies. |  [optional] |
|**name** | **String** | The name of the rule. |  |
|**description** | **String** | A short description of the rule. |  [optional] |
|**enabled** | **Boolean** | The rule is enabled(&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**conditions** | [**List&lt;ConditionsFullWebServiceAttributeTypeDto&gt;**](ConditionsFullWebServiceAttributeTypeDto.md) | A list of conditions of the rule.   If several conditions are specified, the AND logic applies. |  [optional] |
|**detectAsWebRequestService** | **Boolean** | Detect the matching requests as full web services (&#x60;false&#x60;) or web request services (&#x60;true&#x60;).   Setting this field to &#x60;true&#x60; prevents detecting of matching requests as full web services. A web request service is created instead. If you need to further modify the resulting web request service, you need to create a separate rule of the &#x60;FULL_WEB_REQUEST&#x60; type.   Default is &#x60;false&#x60;, detecting matching requests as full web services. |  [optional] |
|**webServiceName** | [**WebServiceName**](WebServiceName.md) |  |  [optional] |
|**webServiceNameSpace** | [**WebServiceNameSpace**](WebServiceNameSpace.md) |  |  [optional] |
|**applicationId** | [**ApplicationId**](ApplicationId.md) |  |  [optional] |
|**contextRoot** | [**ContextRoot**](ContextRoot.md) |  |  [optional] |
|**serverName** | [**ServerName**](ServerName.md) |  |  [optional] |



