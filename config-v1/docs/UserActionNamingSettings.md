

# UserActionNamingSettings

The settings of user action naming.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**placeholders** | [**List&lt;UserActionNamingPlaceholder&gt;**](UserActionNamingPlaceholder.md) | User action placeholders. |  [optional] |
|**loadActionNamingRules** | [**List&lt;UserActionNamingRule&gt;**](UserActionNamingRule.md) | User action naming rules for loading actions. |  [optional] |
|**xhrActionNamingRules** | [**List&lt;UserActionNamingRule&gt;**](UserActionNamingRule.md) | User action naming rules for xhr actions. |  [optional] |
|**customActionNamingRules** | [**List&lt;UserActionNamingRule&gt;**](UserActionNamingRule.md) | User action naming rules for custom actions. |  [optional] |
|**ignoreCase** | **Boolean** | Case insensitive naming. |  [optional] |
|**useFirstDetectedLoadAction** | **Boolean** | First load action found under an XHR action should be used when true. Else the deepest one under the xhr action is used |  [optional] |
|**splitUserActionsByDomain** | **Boolean** | Deactivate this setting if different domains should not result in separate user actions. |  [optional] |
|**queryParameterCleanups** | **List&lt;String&gt;** | List of parameters that should be removed from the query before using the query in the user action name. |  [optional] |



