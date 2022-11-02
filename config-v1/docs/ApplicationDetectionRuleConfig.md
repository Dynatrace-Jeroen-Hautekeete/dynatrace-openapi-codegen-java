

# ApplicationDetectionRuleConfig

Application detection rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**ConfigurationMetadataDtoImpl**](ConfigurationMetadataDtoImpl.md) |  |  [optional] |
|**id** | **UUID** | The ID of the rule. |  [optional] |
|**order** | **String** | The order of the rule in the rules list.   The rules are evaluated from top to bottom. The first matching rule applies. |  [optional] |
|**applicationIdentifier** | **String** | The Dynatrace entity ID of the application, for example &#x60;APPLICATION-4A3B43&#x60;.    You must use an existing ID. If you need to create a rule for an application that doesn&#39;t exist yet, [create an application first](https://dt-url.net/vt03khh) and then configure detection rules for it. |  |
|**filterConfig** | [**ApplicationFilter**](ApplicationFilter.md) |  |  |
|**name** | **String** | The unique name of the Application detection rule. |  [optional] |



