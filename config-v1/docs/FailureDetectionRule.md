

# FailureDetectionRule

Configuration of the failure detection rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the rule. |  [optional] |
|**name** | **String** | The display name of the rule.   The length of the name is limited to 150 characters. |  [optional] |
|**description** | **String** | A short description of the rule. |  [optional] |
|**enabled** | **Boolean** | The rule is enabled (&#x60;true&#x60;) or disabled (&#x60;false&#x60;). |  |
|**fdpId** | **String** | The failure detection parameter (FDP) set of the rule.   Specify the ID of the set here. The FDP set must exist at the time of rule creation. |  |
|**conditions** | [**List&lt;FailureDetectionCondition&gt;**](FailureDetectionCondition.md) | A list of conditions of the rule.   The rule applies when **all** conditions are fulfilled. |  |



