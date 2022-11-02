

# ApplicationErrorRules

Configuration of error rules in the web application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ignoreJavaScriptErrorsInApdexCalculation** | **Boolean** | Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) JavaScript errors in Apdex calculation. |  |
|**ignoreHttpErrorsInApdexCalculation** | **Boolean** | Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) HTTP errors listed in **httpErrorRules** in Apdex calculation. |  |
|**ignoreCustomErrorsInApdexCalculation** | **Boolean** | Exclude (&#x60;true&#x60;) or include (&#x60;false&#x60;) custom errors listed in **customErrorRules** in Apdex calculation. |  |
|**httpErrorRules** | [**List&lt;HttpErrorRule&gt;**](HttpErrorRule.md) | An ordered list of HTTP errors.   Rules are evaluated from top to bottom; the first matching rule applies. |  |
|**customErrorRules** | [**List&lt;CustomErrorRule&gt;**](CustomErrorRule.md) | An ordered list of custom errors.   Rules are evaluated from top to bottom; the first matching rule applies. |  |



