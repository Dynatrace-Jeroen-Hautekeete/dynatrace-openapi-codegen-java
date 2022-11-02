

# DynamicFilters

Dashboard filter configuration of a dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | **Set&lt;String&gt;** | A set of all possible global dashboard filters that can be applied to a dashboard   Currently supported values are:    OS_TYPE,  SERVICE_TYPE,  DEPLOYMENT_TYPE,  APPLICATION_INJECTION_TYPE,  PAAS_VENDOR_TYPE,  DATABASE_VENDOR,  HOST_VIRTUALIZATION_TYPE,  HOST_MONITORING_MODE,  KUBERNETES_CLUSTER,  RELATED_CLOUD_APPLICATION,  RELATED_NAMESPACE,  SERVICE_TAG_KEY:&lt;tagname&gt;,  HOST_TAG_KEY:&lt;tagname&gt;,  APPLICATION_TAG_KEY:&lt;tagname&gt;,  CUSTOM_DIMENSION:&lt;key&gt;,  PROCESS_GROUP_TAG_KEY:&lt;tagname&gt;,  PROCESS_GROUP_INSTANCE_TAG_KEY:&lt;tagname&gt; |  |
|**tagSuggestionTypes** | **Set&lt;String&gt;** | A set of entities applied for tag filter suggestions. You can fetch the list of possible values with the [GET all entity types](https://dt-url.net/dw03s7h)request.   Only applicable if the **filters** set includes &#x60;TAG_KEY:&lt;tagname&gt;&#x60;. |  [optional] |



